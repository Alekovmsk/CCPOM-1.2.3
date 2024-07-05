/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements. See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License. You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.openmetadata.service.jdbi3;

import static org.openmetadata.common.utils.CommonUtil.listOrEmpty;
import static org.openmetadata.common.utils.CommonUtil.nullOrEmpty;
import static org.openmetadata.schema.type.Include.ALL;
import static org.openmetadata.service.Entity.FIELD_REVIEWERS;
import static org.openmetadata.service.Entity.KNOWLEDGE_CENTER;
import static org.openmetadata.service.Entity.KNOWLEDGE_CENTER_DOCUMENT;
import static org.openmetadata.service.exception.CatalogExceptionMessage.invalidKnowledgeCenterDocumentMove;
import static org.openmetadata.service.exception.CatalogExceptionMessage.notReviewer;
import static org.openmetadata.service.resources.tags.TagLabelUtil.checkMutuallyExclusive;
import static org.openmetadata.service.resources.tags.TagLabelUtil.checkMutuallyExclusiveForParentAndSubField;
import static org.openmetadata.service.resources.tags.TagLabelUtil.getUniqueTags;
import static org.openmetadata.service.util.EntityUtil.compareEntityReferenceById;
import static org.openmetadata.service.util.EntityUtil.compareTagLabel;
import static org.openmetadata.service.util.EntityUtil.documentReferenceMatch;
import static org.openmetadata.service.util.EntityUtil.entityReferenceMatch;
import static org.openmetadata.service.util.EntityUtil.getId;
import static org.openmetadata.service.util.EntityUtil.stringMatch;
import static org.openmetadata.service.util.EntityUtil.tagLabelMatch;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.json.JsonPatch;
import javax.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.openmetadata.common.utils.CommonUtil;
import org.openmetadata.schema.EntityInterface;
import org.openmetadata.schema.api.AddKnowledgeCenterToAssetsRequest;
import org.openmetadata.schema.api.data.DocumentReference;
import org.openmetadata.schema.api.feed.CloseTask;
import org.openmetadata.schema.api.feed.ResolveTask;
import org.openmetadata.schema.entity.data.KnowledgeCenter;
import org.openmetadata.schema.entity.data.KnowledgeCenterDocument;
import org.openmetadata.schema.entity.data.KnowledgeCenterDocument.Status;
import org.openmetadata.schema.entity.feed.Thread;
import org.openmetadata.schema.type.ApiStatus;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.Relationship;
import org.openmetadata.schema.type.TagLabel;
import org.openmetadata.schema.type.TagLabel.TagSource;
import org.openmetadata.schema.type.TaskDetails;
import org.openmetadata.schema.type.TaskStatus;
import org.openmetadata.schema.type.TaskType;
import org.openmetadata.schema.type.ThreadType;
import org.openmetadata.schema.type.api.BulkOperationResult;
import org.openmetadata.schema.type.api.BulkResponse;
import org.openmetadata.service.Entity;
import org.openmetadata.service.exception.CatalogExceptionMessage;
import org.openmetadata.service.jdbi3.CollectionDAO.EntityRelationshipRecord;
import org.openmetadata.service.jdbi3.FeedRepository.TaskWorkflow;
import org.openmetadata.service.jdbi3.FeedRepository.ThreadContext;
import org.openmetadata.service.resources.feeds.FeedResource;
import org.openmetadata.service.resources.feeds.MessageParser.EntityLink;
import org.openmetadata.service.resources.knowledgecenter.KnowledgeCenterDocumentResource;
import org.openmetadata.service.search.SearchRequest;
import org.openmetadata.service.security.AuthorizationException;
import org.openmetadata.service.util.EntityUtil;
import org.openmetadata.service.util.EntityUtil.Fields;
import org.openmetadata.service.util.FullyQualifiedName;
import org.openmetadata.service.util.JsonUtils;

@Slf4j
public class KnowledgeCenterDocumentRepository extends EntityRepository<KnowledgeCenterDocument> {
  private static final String ES_MISSING_DATA =
      "Entity Details is unavailable in Elastic Search. Please reindex to get more Information.";
  private static final String UPDATE_FIELDS =
      "references,relatedDocuments,synonyms,agreementType,agreementOperator,agreementContact,agreementValidity";
  private static final String PATCH_FIELDS =
      "references,relatedDocuments,synonyms,agreementType,agreementOperator,agreementContact,agreementValidity";

  public KnowledgeCenterDocumentRepository() {
    super(
        KnowledgeCenterDocumentResource.COLLECTION_PATH,
        KNOWLEDGE_CENTER_DOCUMENT,
        KnowledgeCenterDocument.class,
        Entity.getCollectionDAO().knowledgeCenterDocumentDAO(),
        PATCH_FIELDS,
        UPDATE_FIELDS);
    supportsSearch = true;
  }

  @Override
  public KnowledgeCenterDocument setFields(KnowledgeCenterDocument entity, Fields fields) {
    entity.withParent(getParent(entity)).withKnowledgeCenter(getKnowledgeCenter(entity));
    entity.setRelatedDocuments(
        fields.contains("relatedDocuments") ? getRelatedDocuments(entity) : entity.getRelatedDocuments());
    return entity.withUsageCount(fields.contains("usageCount") ? getUsageCount(entity) : entity.getUsageCount());
  }

  @Override
  public KnowledgeCenterDocument clearFields(KnowledgeCenterDocument entity, Fields fields) {
    entity.setRelatedDocuments(fields.contains("relatedDocuments") ? entity.getRelatedDocuments() : null);
    return entity.withUsageCount(fields.contains("usageCount") ? entity.getUsageCount() : null);
  }

  @Override
  public KnowledgeCenterDocument setInheritedFields(KnowledgeCenterDocument knowledgeCenterDocument, Fields fields) {
    EntityInterface parent;
    if (knowledgeCenterDocument.getParent() != null) {
      parent = get(null, knowledgeCenterDocument.getParent().getId(), getFields("owner,reviewers,domain"));
    } else {
      parent = Entity.getEntity(knowledgeCenterDocument.getKnowledgeCenter(), "owner,reviewers,domain", ALL);
    }
    inheritOwner(knowledgeCenterDocument, fields, parent);
    inheritDomain(knowledgeCenterDocument, fields, parent);
    inheritReviewers(knowledgeCenterDocument, fields, parent);
    return knowledgeCenterDocument;
  }

  private Integer getUsageCount(KnowledgeCenterDocument document) {
    return daoCollection
        .tagUsageDAO()
        .getTagCount(TagSource.KNOWLEDGE_CENTER.ordinal(), document.getFullyQualifiedName());
  }

  private List<EntityReference> getRelatedDocuments(KnowledgeCenterDocument entity) {
    return findBoth(entity.getId(), KNOWLEDGE_CENTER_DOCUMENT, Relationship.RELATED_TO, KNOWLEDGE_CENTER_DOCUMENT);
  }

  @Override
  public void prepare(KnowledgeCenterDocument entity, boolean update) {
    List<EntityReference> parentReviewers = null;
    // Validate parent document
    KnowledgeCenterDocument parentDocument =
        entity.getParent() != null
            ? Entity.getEntity(
                entity.getParent().withType(KNOWLEDGE_CENTER_DOCUMENT), "owner,reviewers", Include.NON_DELETED)
            : null;
    if (parentDocument != null) {
      parentReviewers = parentDocument.getReviewers();
      entity.setParent(parentDocument.getEntityReference());
    }

    // Validate knowledgeCenter
    KnowledgeCenter knowledgeCenter = Entity.getEntity(entity.getKnowledgeCenter(), "reviewers", Include.NON_DELETED);
    entity.setKnowledgeCenter(knowledgeCenter.getEntityReference());
    parentReviewers = parentReviewers != null ? parentReviewers : knowledgeCenter.getReviewers();

    validateHierarchy(entity);

    // Validate related documents
    EntityUtil.populateEntityReferences(entity.getRelatedDocuments());

    // Validate reviewers
    EntityUtil.populateEntityReferences(entity.getReviewers());

    if (!update || entity.getStatus() == null) {
      // If parentDocument or knowledgeCenter has reviewers set, the knowledgeCenter document can only be created in
      // `Draft` mode
      entity.setStatus(!nullOrEmpty(parentReviewers) ? Status.DRAFT : Status.APPROVED);
    }
  }

  @Override
  public void storeEntity(KnowledgeCenterDocument entity, boolean update) {
    // Relationships and fields such as parentDocument are derived and not stored as part of json
    EntityReference knowledgeCenter = entity.getKnowledgeCenter();
    EntityReference parentDocument = entity.getParent();
    List<EntityReference> relatedDocuments = entity.getRelatedDocuments();
    List<EntityReference> reviewers = entity.getReviewers();

    entity.withKnowledgeCenter(null).withParent(null).withRelatedDocuments(relatedDocuments).withReviewers(null);
    store(entity, update);

    // Restore the relationships
    entity
        .withKnowledgeCenter(knowledgeCenter)
        .withParent(parentDocument)
        .withRelatedDocuments(relatedDocuments)
        .withReviewers(reviewers);
  }

  @Override
  public void storeRelationships(KnowledgeCenterDocument entity) {
    addKnowledgeCenterRelationship(entity);
    addParentRelationship(entity);
    for (EntityReference relDocument : listOrEmpty(entity.getRelatedDocuments())) {
      // Make this bidirectional relationship
      addRelationship(
          entity.getId(),
          relDocument.getId(),
          KNOWLEDGE_CENTER_DOCUMENT,
          KNOWLEDGE_CENTER_DOCUMENT,
          Relationship.RELATED_TO,
          true);
    }
    for (EntityReference reviewer : listOrEmpty(entity.getReviewers())) {
      addRelationship(reviewer.getId(), entity.getId(), Entity.USER, KNOWLEDGE_CENTER_DOCUMENT, Relationship.REVIEWS);
    }
  }

  @Override
  public void restorePatchAttributes(KnowledgeCenterDocument original, KnowledgeCenterDocument updated) {
    // Patch can't update Children
    updated.withChildren(original.getChildren());
  }

  @Override
  public void setFullyQualifiedName(KnowledgeCenterDocument entity) {
    // Validate parent
    if (entity.getParent() == null) { // KnowledgeCenter document at the root of the knowledgeCenter
      entity.setFullyQualifiedName(
          FullyQualifiedName.build(entity.getKnowledgeCenter().getFullyQualifiedName(), entity.getName()));
    } else { // KnowledgeCenter document that is a child of another knowledgeCenter document
      EntityReference parent = entity.getParent();
      entity.setFullyQualifiedName(FullyQualifiedName.add(parent.getFullyQualifiedName(), entity.getName()));
    }
  }

  public BulkOperationResult bulkAddAndValidateKnowledgeCenterToAssets(
      UUID knowledgeCenterDocumentId, AddKnowledgeCenterToAssetsRequest request) {
    boolean dryRun = Boolean.TRUE.equals(request.getDryRun());

    KnowledgeCenterDocument document = this.get(null, knowledgeCenterDocumentId, getFields("id,tags"));

    // Check if the tags are mutually exclusive for the knowledgeCenter
    checkMutuallyExclusive(request.getKnowledgeCenterTags());

    BulkOperationResult result = new BulkOperationResult().withDryRun(dryRun);
    List<BulkResponse> failures = new ArrayList<>();
    List<BulkResponse> success = new ArrayList<>();

    if (dryRun
        && (CommonUtil.nullOrEmpty(request.getKnowledgeCenterTags()) || CommonUtil.nullOrEmpty(request.getAssets()))) {
      // Nothing to Validate
      return result
          .withStatus(ApiStatus.SUCCESS)
          .withSuccessRequest(List.of(new BulkResponse().withMessage("Nothing to Validate.")));
    }

    // Validation for entityReferences
    EntityUtil.populateEntityReferences(request.getAssets());

    TagLabel tagLabel =
        new TagLabel()
            .withTagFQN(document.getFullyQualifiedName())
            .withSource(TagSource.KNOWLEDGE_CENTER)
            .withLabelType(TagLabel.LabelType.MANUAL);

    for (EntityReference ref : request.getAssets()) {
      // Update Result Processed
      result.setNumberOfRowsProcessed(result.getNumberOfRowsProcessed() + 1);

      EntityRepository<?> entityRepository = Entity.getEntityRepository(ref.getType());
      EntityInterface asset = entityRepository.get(null, ref.getId(), entityRepository.getFields("tags"));

      try {
        Map<String, List<TagLabel>> allAssetTags =
            daoCollection.tagUsageDAO().getTagsByPrefix(asset.getFullyQualifiedName(), "%", true);
        checkMutuallyExclusiveForParentAndSubField(
            asset.getFullyQualifiedName(),
            FullyQualifiedName.buildHash(asset.getFullyQualifiedName()),
            allAssetTags,
            request.getKnowledgeCenterTags(),
            false);
        success.add(new BulkResponse().withRequest(ref));
        result.setNumberOfRowsPassed(result.getNumberOfRowsPassed() + 1);
      } catch (Exception ex) {
        failures.add(new BulkResponse().withRequest(ref).withMessage(ex.getMessage()));
        result.withFailedRequest(failures);
        result.setNumberOfRowsFailed(result.getNumberOfRowsFailed() + 1);
      }
      // Validate and Store Tags
      if (!dryRun && CommonUtil.nullOrEmpty(result.getFailedRequest())) {
        List<TagLabel> tempList = new ArrayList<>(asset.getTags());
        tempList.add(tagLabel);
        // Apply Tags to Entities
        entityRepository.applyTags(getUniqueTags(tempList), asset.getFullyQualifiedName());

        searchRepository.updateEntity(ref);
      }
    }

    // Apply the tags of knowledgeCenter to the knowledgeCenter document
    if (!dryRun
        && CommonUtil.nullOrEmpty(result.getFailedRequest())
        && (!(document.getTags().isEmpty() && request.getKnowledgeCenterTags().isEmpty()))) {
      // Remove current entity tags in the database. It will be added back later from the merged tag list.
      daoCollection.tagUsageDAO().deleteTagsByTarget(document.getFullyQualifiedName());
      applyTags(getUniqueTags(request.getKnowledgeCenterTags()), document.getFullyQualifiedName());

      searchRepository.updateEntity(document.getEntityReference());
    }

    // Add Failed And Suceess Request
    result.withFailedRequest(failures).withSuccessRequest(success);

    // Set Final Status
    if (result.getNumberOfRowsPassed().equals(result.getNumberOfRowsProcessed())) {
      result.withStatus(ApiStatus.SUCCESS);
    } else if (result.getNumberOfRowsPassed() > 1) {
      result.withStatus(ApiStatus.PARTIAL_SUCCESS);
    } else {
      result.withStatus(ApiStatus.FAILURE);
    }

    return result;
  }

  public BulkOperationResult validateKnowledgeCenterTagsAddition(
      UUID knowledgeCenterDocumentId, AddKnowledgeCenterToAssetsRequest request) {
    KnowledgeCenterDocument document = this.get(null, knowledgeCenterDocumentId, getFields("id,tags"));

    List<TagLabel> knowledgeCenterTagsToValidate = request.getKnowledgeCenterTags();

    // Check if the tags are mutually exclusive for the knowledgeCenter
    checkMutuallyExclusive(request.getKnowledgeCenterTags());

    BulkOperationResult result = new BulkOperationResult().withDryRun(true);
    List<BulkResponse> failures = new ArrayList<>();
    List<BulkResponse> success = new ArrayList<>();

    if (CommonUtil.nullOrEmpty(knowledgeCenterTagsToValidate)) {
      // Nothing to Validate
      return result
          .withStatus(ApiStatus.SUCCESS)
          .withSuccessRequest(List.of(new BulkResponse().withMessage("Nothing to Validate.")));
    }

    Set<String> targetFQNHashesFromDb =
        new HashSet<>(daoCollection.tagUsageDAO().getTargetFQNHashForTag(document.getFullyQualifiedName()));
    Map<String, EntityReference> targetFQNFromES =
        getKnowledgeCenterUsageFromES(document.getFullyQualifiedName(), targetFQNHashesFromDb.size());

    for (String fqnHash : targetFQNHashesFromDb) {
      // Update Result Processed
      result.setNumberOfRowsProcessed(result.getNumberOfRowsProcessed() + 1);

      Map<String, List<TagLabel>> allAssetTags = daoCollection.tagUsageDAO().getTagsByPrefix(fqnHash, "%", false);

      EntityReference refDetails = targetFQNFromES.get(fqnHash);

      try {
        // Assets FQN is not available / we can use fqnHash for now
        checkMutuallyExclusiveForParentAndSubField(
            document.getFullyQualifiedName(), fqnHash, allAssetTags, knowledgeCenterTagsToValidate, true);
        if (refDetails != null) {
          success.add(new BulkResponse().withRequest(refDetails));
        } else {
          success.add(
              new BulkResponse()
                  .withRequest(new EntityReference().withFullyQualifiedName(fqnHash).withType("unknown"))
                  .withMessage(ES_MISSING_DATA));
        }
        result.setNumberOfRowsPassed(result.getNumberOfRowsPassed() + 1);
      } catch (IllegalArgumentException ex) {
        if (refDetails != null) {
          failures.add(new BulkResponse().withRequest(refDetails).withMessage(ex.getMessage()));
        } else {
          failures.add(
              new BulkResponse()
                  .withRequest(new EntityReference().withFullyQualifiedName(fqnHash).withType("unknown"))
                  .withMessage(String.format("%s %s", ex.getMessage(), ES_MISSING_DATA)));
        }
        result.setNumberOfRowsFailed(result.getNumberOfRowsFailed() + 1);
      }
    }

    // Add Failed And Suceess Request
    result.withFailedRequest(failures).withSuccessRequest(success);

    // Set Final Status
    if (result.getNumberOfRowsPassed().equals(result.getNumberOfRowsProcessed())) {
      result.withStatus(ApiStatus.SUCCESS);
    } else if (result.getNumberOfRowsPassed() > 1) {
      result.withStatus(ApiStatus.PARTIAL_SUCCESS);
    } else {
      result.withStatus(ApiStatus.FAILURE);
    }

    return result;
  }

  private Map<String, EntityReference> getKnowledgeCenterUsageFromES(String knowledgeCenterFqn, int size) {
    try {
      String key = "_source";
      SearchRequest searchRequest =
          new SearchRequest.ElasticSearchRequestBuilder(
                  String.format("** AND (tags.tagFQN:\"%s\")", knowledgeCenterFqn), size, "all")
              .from(0)
              .fetchSource(true)
              .trackTotalHits(false)
              .sortFieldParam("_score")
              .deleted(false)
              .sortOrder("desc")
              .includeSourceFields(new ArrayList<>())
              .build();
      Response response = searchRepository.search(searchRequest);
      String json = (String) response.getEntity();
      Set<EntityReference> fqns = new TreeSet<>(compareEntityReferenceById);
      for (Iterator<JsonNode> it = ((ArrayNode) JsonUtils.extractValue(json, "hits", "hits")).elements();
          it.hasNext(); ) {
        JsonNode jsonNode = it.next();
        String id = JsonUtils.extractValue(jsonNode, key, "id");
        String fqn = JsonUtils.extractValue(jsonNode, key, "fullyQualifiedName");
        String type = JsonUtils.extractValue(jsonNode, key, "entityType");
        if (!CommonUtil.nullOrEmpty(fqn) && !CommonUtil.nullOrEmpty(type)) {
          fqns.add(new EntityReference().withId(UUID.fromString(id)).withFullyQualifiedName(fqn).withType(type));
        }
      }

      return fqns.stream()
          .collect(
              Collectors.toMap(
                  entityReference -> FullyQualifiedName.buildHash(entityReference.getFullyQualifiedName()),
                  entityReference -> entityReference));
    } catch (Exception ex) {
      LOG.error("Error while getting knowledgeCenter usage from ES for validation", ex);
    }
    return new HashMap<>();
  }

  public BulkOperationResult bulkRemoveKnowledgeCenterToAssets(
      UUID knowledgeCenterDocumentId, AddKnowledgeCenterToAssetsRequest request) {
    KnowledgeCenterDocument document = this.get(null, knowledgeCenterDocumentId, getFields("id,tags"));

    BulkOperationResult result = new BulkOperationResult().withStatus(ApiStatus.SUCCESS).withDryRun(false);
    List<BulkResponse> success = new ArrayList<>();

    // Validation for entityReferences
    EntityUtil.populateEntityReferences(request.getAssets());

    for (EntityReference ref : request.getAssets()) {
      // Update Result Processed
      result.setNumberOfRowsProcessed(result.getNumberOfRowsProcessed() + 1);

      EntityRepository<?> entityRepository = Entity.getEntityRepository(ref.getType());
      EntityInterface asset = entityRepository.get(null, ref.getId(), entityRepository.getFields("id"));

      daoCollection
          .tagUsageDAO()
          .deleteTagsByTagAndTargetEntity(document.getFullyQualifiedName(), asset.getFullyQualifiedName());
      success.add(new BulkResponse().withRequest(ref));
      result.setNumberOfRowsPassed(result.getNumberOfRowsPassed() + 1);

      // Update ES
      searchRepository.updateEntity(ref);
    }

    return result.withSuccessRequest(success);
  }

  protected EntityReference getKnowledgeCenter(KnowledgeCenterDocument document) {
    Relationship relationship = document.getParent() != null ? Relationship.HAS : Relationship.CONTAINS;
    return document.getKnowledgeCenter() != null
        ? document.getKnowledgeCenter()
        : getFromEntityRef(document.getId(), relationship, KNOWLEDGE_CENTER, true);
  }

  public EntityReference getKnowledgeCenter(String id) {
    return Entity.getEntityReferenceById(KNOWLEDGE_CENTER, UUID.fromString(id), ALL);
  }

  @Override
  public KnowledgeCenterDocumentUpdater getUpdater(
      KnowledgeCenterDocument original, KnowledgeCenterDocument updated, Operation operation) {
    return new KnowledgeCenterDocumentUpdater(original, updated, operation);
  }

  @Override
  protected void postCreate(KnowledgeCenterDocument entity) {
    super.postCreate(entity);
    if (entity.getStatus() == Status.DRAFT) {
      // Create an approval task for knowledgeCenter document in draft mode
      createApprovalTask(entity, entity.getReviewers());
    }
  }

  @Override
  public void postUpdate(KnowledgeCenterDocument original, KnowledgeCenterDocument updated) {
    super.postUpdate(original, updated);
    if (original.getStatus() == Status.DRAFT) {
      if (updated.getStatus() == Status.APPROVED) {
        closeApprovalTask(updated, "Approved the knowledgeCenter document");
      } else if (updated.getStatus() == Status.REJECTED) {
        closeApprovalTask(updated, "Rejected the knowledgeCenter document");
      }
    }
  }

  @Override
  protected void preDelete(KnowledgeCenterDocument entity, String deletedBy) {
    // A knowledgeCenter document in `Draft` state can only be deleted by the reviewers
    if (Status.DRAFT.equals(entity.getStatus())) {
      checkUpdatedByReviewer(entity, deletedBy);
    }
  }

  @Override
  protected void postDelete(KnowledgeCenterDocument entity) {
    // Cleanup all the tag labels using this knowledgeCenter document
    daoCollection.tagUsageDAO().deleteTagLabels(TagSource.KNOWLEDGE_CENTER.ordinal(), entity.getFullyQualifiedName());
  }

  public TaskWorkflow getTaskWorkflow(ThreadContext threadContext) {
    validateTaskThread(threadContext);
    TaskType taskType = threadContext.getThread().getTask().getType();
    if (EntityUtil.isApprovalTask(taskType)) {
      return new ApprovalTaskWorkflow(threadContext);
    }
    return super.getTaskWorkflow(threadContext);
  }

  public static class ApprovalTaskWorkflow extends TaskWorkflow {
    ApprovalTaskWorkflow(ThreadContext threadContext) {
      super(threadContext);
    }

    @Override
    public EntityInterface performTask(String user, ResolveTask resolveTask) {
      KnowledgeCenterDocument knowledgeCenterDocument = (KnowledgeCenterDocument) threadContext.getAboutEntity();
      knowledgeCenterDocument.setStatus(Status.APPROVED);
      return knowledgeCenterDocument;
    }

    @Override
    protected void closeTask(String user, CloseTask closeTask) {
      // Closing task results in knowledgeCenter document going from `Draft` to `Rejected`
      KnowledgeCenterDocument document = (KnowledgeCenterDocument) threadContext.getAboutEntity();
      if (document.getStatus() == Status.DRAFT) {
        String origJson = JsonUtils.pojoToJson(document);
        document.setStatus(Status.REJECTED);
        String updatedJson = JsonUtils.pojoToJson(document);
        JsonPatch patch = JsonUtils.getJsonPatch(origJson, updatedJson);
        EntityRepository<?> repository = threadContext.getEntityRepository();
        repository.patch(null, document.getId(), user, patch);
      }
    }
  }

  @Override
  public EntityInterface getParentEntity(KnowledgeCenterDocument entity, String fields) {
    return entity.getParent() != null
        ? Entity.getEntity(entity.getParent(), fields, Include.ALL)
        : Entity.getEntity(entity.getKnowledgeCenter(), fields, Include.ALL);
  }

  private void addKnowledgeCenterRelationship(KnowledgeCenterDocument document) {
    Relationship relationship = document.getParent() != null ? Relationship.HAS : Relationship.CONTAINS;
    addRelationship(
        document.getKnowledgeCenter().getId(),
        document.getId(),
        KNOWLEDGE_CENTER,
        KNOWLEDGE_CENTER_DOCUMENT,
        relationship);
  }

  private void addParentRelationship(KnowledgeCenterDocument document) {
    if (document.getParent() != null) {
      addRelationship(
          document.getParent().getId(),
          document.getId(),
          KNOWLEDGE_CENTER_DOCUMENT,
          KNOWLEDGE_CENTER_DOCUMENT,
          Relationship.CONTAINS);
    }
  }

  private void validateHierarchy(KnowledgeCenterDocument document) {
    // The knowledgeCenter and the parent document must belong to the same hierarchy
    if (document.getParent() == null) {
      return; // Parent is the root of the knowledgeCenter
    }
    String knowledgeCenterFqn = FullyQualifiedName.build(document.getKnowledgeCenter().getName());
    if (!document.getParent().getFullyQualifiedName().startsWith(knowledgeCenterFqn)) {
      throw new IllegalArgumentException(
          String.format(
              "Invalid hierarchy - parent [%s] does not belong to knowledgeCenter[%s]",
              document.getParent().getFullyQualifiedName(), document.getKnowledgeCenter().getFullyQualifiedName()));
    }
  }

  private void checkUpdatedByReviewer(KnowledgeCenterDocument document, String updatedBy) {
    // Only list of allowed reviewers can change the status from DRAFT to APPROVED
    List<EntityReference> reviewers = document.getReviewers();
    if (!nullOrEmpty(reviewers)) {
      // Updating user must be one of the reviewers
      boolean isReviewer =
          reviewers.stream()
              .anyMatch(e -> e.getName().equals(updatedBy) || e.getFullyQualifiedName().equals(updatedBy));
      if (!isReviewer) {
        throw new AuthorizationException(notReviewer(updatedBy));
      }
    }
  }

  private void createApprovalTask(KnowledgeCenterDocument entity, List<EntityReference> parentReviewers) {
    TaskDetails taskDetails =
        new TaskDetails()
            .withAssignees(FeedResource.formatAssignees(parentReviewers))
            .withType(TaskType.RequestApproval)
            .withStatus(TaskStatus.Open);

    EntityLink about = new EntityLink(entityType, entity.getFullyQualifiedName());
    Thread thread =
        new Thread()
            .withId(UUID.randomUUID())
            .withThreadTs(System.currentTimeMillis())
            .withMessage("Approval required for ") // TODO fix this
            .withCreatedBy(entity.getUpdatedBy())
            .withAbout(about.getLinkString())
            .withType(ThreadType.Task)
            .withTask(taskDetails)
            .withUpdatedBy(entity.getUpdatedBy())
            .withUpdatedAt(System.currentTimeMillis());
    FeedRepository feedRepository = Entity.getFeedRepository();
    feedRepository.create(thread);
  }

  private void closeApprovalTask(KnowledgeCenterDocument entity, String comment) {
    EntityLink about = new EntityLink(KNOWLEDGE_CENTER_DOCUMENT, entity.getFullyQualifiedName());
    FeedRepository feedRepository = Entity.getFeedRepository();
    Thread taskThread = feedRepository.getTask(about, TaskType.RequestApproval);
    if (TaskStatus.Open.equals(taskThread.getTask().getStatus())) {
      feedRepository.closeTask(taskThread, entity.getUpdatedBy(), new CloseTask().withComment(comment));
    }
  }

  /** Handles entity updated from PUT and POST operation. */
  public class KnowledgeCenterDocumentUpdater extends EntityUpdater {
    public KnowledgeCenterDocumentUpdater(
        KnowledgeCenterDocument original, KnowledgeCenterDocument updated, Operation operation) {
      super(original, updated, operation);
    }

    @Transaction
    @Override
    public void entitySpecificUpdate() {
      validateParent();
      updateStatus(original, updated);
      updateSynonyms(original, updated);
      updateReferences(original, updated);
      updateRelatedDocuments(original, updated);
      updateReviewers(original, updated);
      updateName(original, updated);
      updateParent(original, updated);
      updateAgreementType(original, updated);
      updateAgreementOperator(original, updated);
      updateAgreementContact(original, updated);
      updateAgreementValidity(original, updated);
    }

    @Override
    protected void updateTags(String fqn, String fieldName, List<TagLabel> origTags, List<TagLabel> updatedTags) {
      // Remove current entity tags in the database. It will be added back later from the merged tag list.
      origTags = listOrEmpty(origTags);
      // updatedTags cannot be immutable list, as we are adding the origTags to updatedTags even if its empty.
      updatedTags = Optional.ofNullable(updatedTags).orElse(new ArrayList<>());
      if (origTags.isEmpty() && updatedTags.isEmpty()) {
        return; // Nothing to update
      }

      List<String> targetFQNHashes = daoCollection.tagUsageDAO().getTargetFQNHashForTag(fqn);
      for (String fqnHash : targetFQNHashes) {
        Map<String, List<TagLabel>> allAssetTags = daoCollection.tagUsageDAO().getTagsByPrefix(fqnHash, "%", false);

        // Assets FQN is not available / we can use fqnHash for now
        checkMutuallyExclusiveForParentAndSubField("", fqnHash, allAssetTags, updatedTags, true);
      }

      // Remove current entity tags in the database. It will be added back later from the merged tag list.
      daoCollection.tagUsageDAO().deleteTagsByTarget(fqn);

      if (operation.isPut()) {
        // PUT operation merges tags in the request with what already exists
        EntityUtil.mergeTags(updatedTags, origTags);
        checkMutuallyExclusive(updatedTags);
      }

      List<TagLabel> addedTags = new ArrayList<>();
      List<TagLabel> deletedTags = new ArrayList<>();
      recordListChange(fieldName, origTags, updatedTags, addedTags, deletedTags, tagLabelMatch);
      updatedTags.sort(compareTagLabel);
      applyTags(updatedTags, fqn);
    }

    private void updateStatus(KnowledgeCenterDocument origDocument, KnowledgeCenterDocument updatedDocument) {
      if (origDocument.getStatus() == updatedDocument.getStatus()) {
        return;
      }
      // Only reviewers can change from DRAFT status to APPROVED/REJECTED status
      if (origDocument.getStatus() == Status.DRAFT
          && (updatedDocument.getStatus() == Status.APPROVED || updatedDocument.getStatus() == Status.REJECTED)) {
        checkUpdatedByReviewer(origDocument, updatedDocument.getUpdatedBy());
      }
      recordChange("status", origDocument.getStatus(), updatedDocument.getStatus());
    }

    private void updateSynonyms(KnowledgeCenterDocument origDocument, KnowledgeCenterDocument updatedDocument) {
      List<String> origSynonyms = listOrEmpty(origDocument.getSynonyms());
      List<String> updatedSynonyms = listOrEmpty(updatedDocument.getSynonyms());

      List<String> added = new ArrayList<>();
      List<String> deleted = new ArrayList<>();
      recordListChange("synonyms", origSynonyms, updatedSynonyms, added, deleted, stringMatch);
    }

    private void updateReferences(KnowledgeCenterDocument origDocument, KnowledgeCenterDocument updatedDocument) {
      List<DocumentReference> origReferences = listOrEmpty(origDocument.getReferences());
      List<DocumentReference> updatedReferences = listOrEmpty(updatedDocument.getReferences());

      List<DocumentReference> added = new ArrayList<>();
      List<DocumentReference> deleted = new ArrayList<>();
      recordListChange("references", origReferences, updatedReferences, added, deleted, documentReferenceMatch);
    }

    private void updateRelatedDocuments(KnowledgeCenterDocument origDocument, KnowledgeCenterDocument updatedDocument) {
      List<EntityReference> origRelated = listOrEmpty(origDocument.getRelatedDocuments());
      List<EntityReference> updatedRelated = listOrEmpty(updatedDocument.getRelatedDocuments());
      updateToRelationships(
          "relatedDocuments",
          KNOWLEDGE_CENTER_DOCUMENT,
          origDocument.getId(),
          Relationship.RELATED_TO,
          KNOWLEDGE_CENTER_DOCUMENT,
          origRelated,
          updatedRelated,
          true);
    }

    private void updateReviewers(KnowledgeCenterDocument origDocument, KnowledgeCenterDocument updatedDocument) {
      List<EntityReference> origReviewers = listOrEmpty(origDocument.getReviewers());
      List<EntityReference> updatedReviewers = listOrEmpty(updatedDocument.getReviewers());
      updateFromRelationships(
          FIELD_REVIEWERS,
          Entity.USER,
          origReviewers,
          updatedReviewers,
          Relationship.REVIEWS,
          KNOWLEDGE_CENTER_DOCUMENT,
          origDocument.getId());
    }

    public void updateName(KnowledgeCenterDocument original, KnowledgeCenterDocument updated) {
      if (!original.getName().equals(updated.getName())) {
        if (ProviderType.SYSTEM.equals(original.getProvider())) {
          throw new IllegalArgumentException(
              CatalogExceptionMessage.systemEntityRenameNotAllowed(original.getName(), entityType));
        }
        // KnowledgeCenter document name changed - update the FQNs of the children documents to reflect this
        LOG.info("KnowledgeCenter document name changed from {} to {}", original.getName(), updated.getName());
        daoCollection
            .knowledgeCenterDocumentDAO()
            .updateFqn(original.getFullyQualifiedName(), updated.getFullyQualifiedName());
        daoCollection
            .tagUsageDAO()
            .rename(
                TagSource.KNOWLEDGE_CENTER.ordinal(),
                original.getFullyQualifiedName(),
                updated.getFullyQualifiedName());
        recordChange("name", original.getName(), updated.getName());
        invalidateDocument(original.getId());
      }
    }

    private void updateParent(KnowledgeCenterDocument original, KnowledgeCenterDocument updated) {
      // Can't change parent and knowledgeCenter both at the same time
      UUID oldParentId = getId(original.getParent());
      UUID newParentId = getId(updated.getParent());
      boolean parentChanged = !Objects.equals(oldParentId, newParentId);

      UUID oldKnowledgeCenterId = getId(original.getKnowledgeCenter());
      UUID newKnowledgeCenterId = getId(updated.getKnowledgeCenter());
      boolean knowledgeCenterChanged = !Objects.equals(oldKnowledgeCenterId, newKnowledgeCenterId);

      daoCollection
          .knowledgeCenterDocumentDAO()
          .updateFqn(original.getFullyQualifiedName(), updated.getFullyQualifiedName());
      daoCollection
          .tagUsageDAO()
          .rename(
              TagSource.KNOWLEDGE_CENTER.ordinal(), original.getFullyQualifiedName(), updated.getFullyQualifiedName());
      if (knowledgeCenterChanged) {
        updateKnowledgeCenterRelationship(original, updated);
        recordChange(
            "knowledgeCenter", original.getKnowledgeCenter(), updated.getKnowledgeCenter(), true, entityReferenceMatch);
        invalidateDocument(original.getId());
      }
      if (parentChanged) {
        updateKnowledgeCenterRelationship(original, updated);
        updateParentRelationship(original, updated);
        recordChange("parent", original.getParent(), updated.getParent(), true, entityReferenceMatch);
        invalidateDocument(original.getId());
      }
    }

    public void updateAgreementType(KnowledgeCenterDocument original, KnowledgeCenterDocument updated) {
      recordChange("agreementType", original.getAgreementType(), updated.getAgreementType());
    }

    public void updateAgreementOperator(KnowledgeCenterDocument original, KnowledgeCenterDocument updated) {
      recordChange("agreementOperator", original.getAgreementOperator(), updated.getAgreementOperator());
    }

    public void updateAgreementContact(KnowledgeCenterDocument original, KnowledgeCenterDocument updated) {
      recordChange("agreementContact", original.getAgreementContact(), updated.getAgreementContact());
    }

    public void updateAgreementValidity(KnowledgeCenterDocument original, KnowledgeCenterDocument updated) {
      recordChange("agreementValidity", original.getAgreementValidity(), updated.getAgreementValidity());
    }

    private void validateParent() {
      String fqn = original.getFullyQualifiedName();
      String newParentFqn = updated.getParent() == null ? null : updated.getParent().getFullyQualifiedName();
      // A knowledgeCenter document can't be moved under its child
      if (newParentFqn != null && FullyQualifiedName.isParent(newParentFqn, fqn)) {
        throw new IllegalArgumentException(invalidKnowledgeCenterDocumentMove(fqn, newParentFqn));
      }
    }

    private void updateKnowledgeCenterRelationship(KnowledgeCenterDocument orig, KnowledgeCenterDocument updated) {
      deleteKnowledgeCenterRelationship(orig);
      addKnowledgeCenterRelationship(updated);
    }

    private void deleteKnowledgeCenterRelationship(KnowledgeCenterDocument document) {
      Relationship relationship = document.getParent() == null ? Relationship.CONTAINS : Relationship.HAS;
      deleteRelationship(
          document.getKnowledgeCenter().getId(),
          KNOWLEDGE_CENTER,
          document.getId(),
          KNOWLEDGE_CENTER_DOCUMENT,
          relationship);
    }

    private void updateParentRelationship(KnowledgeCenterDocument orig, KnowledgeCenterDocument updated) {
      deleteParentRelationship(orig);
      addParentRelationship(updated);
    }

    private void deleteParentRelationship(KnowledgeCenterDocument document) {
      if (document.getParent() != null) {
        deleteRelationship(
            document.getParent().getId(),
            KNOWLEDGE_CENTER_DOCUMENT,
            document.getId(),
            KNOWLEDGE_CENTER_DOCUMENT,
            Relationship.CONTAINS);
      }
    }

    private void invalidateDocument(UUID documentId) {
      // The name of the knowledgeCenter document changed or parent change. Invalidate that tag and all the children
      // from the cache
      List<EntityRelationshipRecord> tagRecords =
          findToRecords(documentId, KNOWLEDGE_CENTER_DOCUMENT, Relationship.CONTAINS, KNOWLEDGE_CENTER_DOCUMENT);
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(KNOWLEDGE_CENTER_DOCUMENT, documentId));
      for (EntityRelationshipRecord tagRecord : tagRecords) {
        invalidateDocument(tagRecord.getId());
      }
    }
  }
}
