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
import static org.openmetadata.service.Entity.CLIENT_CENTER;
import static org.openmetadata.service.Entity.CLIENT_CENTER_CLIENT;
import static org.openmetadata.service.Entity.FIELD_REVIEWERS;
import static org.openmetadata.service.exception.CatalogExceptionMessage.invalidClientCenterClientMove;
import static org.openmetadata.service.exception.CatalogExceptionMessage.notReviewer;
import static org.openmetadata.service.resources.tags.TagLabelUtil.checkMutuallyExclusive;
import static org.openmetadata.service.resources.tags.TagLabelUtil.checkMutuallyExclusiveForParentAndSubField;
import static org.openmetadata.service.resources.tags.TagLabelUtil.getUniqueTags;
import static org.openmetadata.service.util.EntityUtil.clientReferenceMatch;
import static org.openmetadata.service.util.EntityUtil.compareEntityReferenceById;
import static org.openmetadata.service.util.EntityUtil.compareTagLabel;
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
import org.openmetadata.schema.api.AddClientCenterToAssetsRequest;
import org.openmetadata.schema.api.data.ClientReference;
import org.openmetadata.schema.api.feed.CloseTask;
import org.openmetadata.schema.api.feed.ResolveTask;
import org.openmetadata.schema.entity.data.ClientCenter;
import org.openmetadata.schema.entity.data.ClientCenterClient;
import org.openmetadata.schema.entity.data.ClientCenterClient.Status;
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
import org.openmetadata.service.resources.clientcenter.ClientCenterClientResource;
import org.openmetadata.service.resources.feeds.FeedResource;
import org.openmetadata.service.resources.feeds.MessageParser.EntityLink;
import org.openmetadata.service.search.SearchRequest;
import org.openmetadata.service.security.AuthorizationException;
import org.openmetadata.service.util.EntityUtil;
import org.openmetadata.service.util.EntityUtil.Fields;
import org.openmetadata.service.util.FullyQualifiedName;
import org.openmetadata.service.util.JsonUtils;

@Slf4j
public class ClientCenterClientRepository extends EntityRepository<ClientCenterClient> {
  private static final String ES_MISSING_DATA =
      "Entity Details is unavailable in Elastic Search. Please reindex to get more Information.";
  private static final String UPDATE_FIELDS = "references,relatedClients,synonyms,fullName,dateOfBirth,inn,snils";
  private static final String PATCH_FIELDS = "references,relatedClients,synonyms,fullName,dateOfBirth,inn,snils";

  public ClientCenterClientRepository() {
    super(
        ClientCenterClientResource.COLLECTION_PATH,
        CLIENT_CENTER_CLIENT,
        ClientCenterClient.class,
        Entity.getCollectionDAO().clientCenterClientDAO(),
        PATCH_FIELDS,
        UPDATE_FIELDS);
    supportsSearch = true;
  }

  @Override
  public ClientCenterClient setFields(ClientCenterClient entity, Fields fields) {
    entity.withParent(getParent(entity)).withClientCenter(getClientCenter(entity));
    entity.setRelatedClients(
        fields.contains("relatedClients") ? getRelatedClients(entity) : entity.getRelatedClients());
    return entity.withUsageCount(fields.contains("usageCount") ? getUsageCount(entity) : entity.getUsageCount());
  }

  @Override
  public ClientCenterClient clearFields(ClientCenterClient entity, Fields fields) {
    entity.setRelatedClients(fields.contains("relatedClients") ? entity.getRelatedClients() : null);
    return entity.withUsageCount(fields.contains("usageCount") ? entity.getUsageCount() : null);
  }

  @Override
  public ClientCenterClient setInheritedFields(ClientCenterClient clientCenterClient, Fields fields) {
    EntityInterface parent;
    if (clientCenterClient.getParent() != null) {
      parent = get(null, clientCenterClient.getParent().getId(), getFields("owner,reviewers,domain"));
    } else {
      parent = Entity.getEntity(clientCenterClient.getClientCenter(), "owner,reviewers,domain", ALL);
    }
    inheritOwner(clientCenterClient, fields, parent);
    inheritDomain(clientCenterClient, fields, parent);
    inheritReviewers(clientCenterClient, fields, parent);
    return clientCenterClient;
  }

  private Integer getUsageCount(ClientCenterClient client) {
    return daoCollection.tagUsageDAO().getTagCount(TagSource.CLIENT_CENTER.ordinal(), client.getFullyQualifiedName());
  }

  private List<EntityReference> getRelatedClients(ClientCenterClient entity) {
    return findBoth(entity.getId(), CLIENT_CENTER_CLIENT, Relationship.RELATED_TO, CLIENT_CENTER_CLIENT);
  }

  @Override
  public void prepare(ClientCenterClient entity, boolean update) {
    List<EntityReference> parentReviewers = null;
    // Validate parent client
    ClientCenterClient parentClient =
        entity.getParent() != null
            ? Entity.getEntity(
                entity.getParent().withType(CLIENT_CENTER_CLIENT), "owner,reviewers", Include.NON_DELETED)
            : null;
    if (parentClient != null) {
      parentReviewers = parentClient.getReviewers();
      entity.setParent(parentClient.getEntityReference());
    }

    // Validate clientCenter
    ClientCenter clientCenter = Entity.getEntity(entity.getClientCenter(), "reviewers", Include.NON_DELETED);
    entity.setClientCenter(clientCenter.getEntityReference());
    parentReviewers = parentReviewers != null ? parentReviewers : clientCenter.getReviewers();

    validateHierarchy(entity);

    // Validate related clients
    EntityUtil.populateEntityReferences(entity.getRelatedClients());

    // Validate reviewers
    EntityUtil.populateEntityReferences(entity.getReviewers());

    if (!update || entity.getStatus() == null) {
      // If parentClient or clientCenter has reviewers set, the clientCenter client can only be created in
      // `Draft` mode
      entity.setStatus(!nullOrEmpty(parentReviewers) ? Status.DRAFT : Status.APPROVED);
    }
  }

  @Override
  public void storeEntity(ClientCenterClient entity, boolean update) {
    // Relationships and fields such as parentClient are derived and not stored as part of json
    EntityReference clientCenter = entity.getClientCenter();
    EntityReference parentClient = entity.getParent();
    List<EntityReference> relatedClients = entity.getRelatedClients();
    List<EntityReference> reviewers = entity.getReviewers();

    entity.withClientCenter(null).withParent(null).withRelatedClients(relatedClients).withReviewers(null);
    store(entity, update);

    // Restore the relationships
    entity
        .withClientCenter(clientCenter)
        .withParent(parentClient)
        .withRelatedClients(relatedClients)
        .withReviewers(reviewers);
  }

  @Override
  public void storeRelationships(ClientCenterClient entity) {
    addClientCenterRelationship(entity);
    addParentRelationship(entity);
    for (EntityReference relClient : listOrEmpty(entity.getRelatedClients())) {
      // Make this bidirectional relationship
      addRelationship(
          entity.getId(), relClient.getId(), CLIENT_CENTER_CLIENT, CLIENT_CENTER_CLIENT, Relationship.RELATED_TO, true);
    }
    for (EntityReference reviewer : listOrEmpty(entity.getReviewers())) {
      addRelationship(reviewer.getId(), entity.getId(), Entity.USER, CLIENT_CENTER_CLIENT, Relationship.REVIEWS);
    }
  }

  @Override
  public void restorePatchAttributes(ClientCenterClient original, ClientCenterClient updated) {
    // Patch can't update Children
    updated.withChildren(original.getChildren());
  }

  @Override
  public void setFullyQualifiedName(ClientCenterClient entity) {
    // Validate parent
    if (entity.getParent() == null) { // ClientCenter client at the root of the clientCenter
      entity.setFullyQualifiedName(
          FullyQualifiedName.build(entity.getClientCenter().getFullyQualifiedName(), entity.getName()));
    } else { // ClientCenter client that is a child of another clientCenter client
      EntityReference parent = entity.getParent();
      entity.setFullyQualifiedName(FullyQualifiedName.add(parent.getFullyQualifiedName(), entity.getName()));
    }
  }

  public BulkOperationResult bulkAddAndValidateClientCenterToAssets(
      UUID clientCenterClientId, AddClientCenterToAssetsRequest request) {
    boolean dryRun = Boolean.TRUE.equals(request.getDryRun());

    ClientCenterClient client = this.get(null, clientCenterClientId, getFields("id,tags"));

    // Check if the tags are mutually exclusive for the clientCenter
    checkMutuallyExclusive(request.getClientCenterTags());

    BulkOperationResult result = new BulkOperationResult().withDryRun(dryRun);
    List<BulkResponse> failures = new ArrayList<>();
    List<BulkResponse> success = new ArrayList<>();

    if (dryRun
        && (CommonUtil.nullOrEmpty(request.getClientCenterTags()) || CommonUtil.nullOrEmpty(request.getAssets()))) {
      // Nothing to Validate
      return result
          .withStatus(ApiStatus.SUCCESS)
          .withSuccessRequest(List.of(new BulkResponse().withMessage("Nothing to Validate.")));
    }

    // Validation for entityReferences
    EntityUtil.populateEntityReferences(request.getAssets());

    TagLabel tagLabel =
        new TagLabel()
            .withTagFQN(client.getFullyQualifiedName())
            .withSource(TagSource.CLIENT_CENTER)
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
            request.getClientCenterTags(),
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

    // Apply the tags of clientCenter to the clientCenter client
    if (!dryRun
        && CommonUtil.nullOrEmpty(result.getFailedRequest())
        && (!(client.getTags().isEmpty() && request.getClientCenterTags().isEmpty()))) {
      // Remove current entity tags in the database. It will be added back later from the merged tag list.
      daoCollection.tagUsageDAO().deleteTagsByTarget(client.getFullyQualifiedName());
      applyTags(getUniqueTags(request.getClientCenterTags()), client.getFullyQualifiedName());

      searchRepository.updateEntity(client.getEntityReference());
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

  public BulkOperationResult validateClientCenterTagsAddition(
      UUID clientCenterClientId, AddClientCenterToAssetsRequest request) {
    ClientCenterClient client = this.get(null, clientCenterClientId, getFields("id,tags"));

    List<TagLabel> clientCenterTagsToValidate = request.getClientCenterTags();

    // Check if the tags are mutually exclusive for the clientCenter
    checkMutuallyExclusive(request.getClientCenterTags());

    BulkOperationResult result = new BulkOperationResult().withDryRun(true);
    List<BulkResponse> failures = new ArrayList<>();
    List<BulkResponse> success = new ArrayList<>();

    if (CommonUtil.nullOrEmpty(clientCenterTagsToValidate)) {
      // Nothing to Validate
      return result
          .withStatus(ApiStatus.SUCCESS)
          .withSuccessRequest(List.of(new BulkResponse().withMessage("Nothing to Validate.")));
    }

    Set<String> targetFQNHashesFromDb =
        new HashSet<>(daoCollection.tagUsageDAO().getTargetFQNHashForTag(client.getFullyQualifiedName()));
    Map<String, EntityReference> targetFQNFromES =
        getClientCenterUsageFromES(client.getFullyQualifiedName(), targetFQNHashesFromDb.size());

    for (String fqnHash : targetFQNHashesFromDb) {
      // Update Result Processed
      result.setNumberOfRowsProcessed(result.getNumberOfRowsProcessed() + 1);

      Map<String, List<TagLabel>> allAssetTags = daoCollection.tagUsageDAO().getTagsByPrefix(fqnHash, "%", false);

      EntityReference refDetails = targetFQNFromES.get(fqnHash);

      try {
        // Assets FQN is not available / we can use fqnHash for now
        checkMutuallyExclusiveForParentAndSubField(
            client.getFullyQualifiedName(), fqnHash, allAssetTags, clientCenterTagsToValidate, true);
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

  private Map<String, EntityReference> getClientCenterUsageFromES(String clientCenterFqn, int size) {
    try {
      String key = "_source";
      SearchRequest searchRequest =
          new SearchRequest.ElasticSearchRequestBuilder(
                  String.format("** AND (tags.tagFQN:\"%s\")", clientCenterFqn), size, "all")
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
      LOG.error("Error while getting clientCenter usage from ES for validation", ex);
    }
    return new HashMap<>();
  }

  public BulkOperationResult bulkRemoveClientCenterToAssets(
      UUID clientCenterClientId, AddClientCenterToAssetsRequest request) {
    ClientCenterClient client = this.get(null, clientCenterClientId, getFields("id,tags"));

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
          .deleteTagsByTagAndTargetEntity(client.getFullyQualifiedName(), asset.getFullyQualifiedName());
      success.add(new BulkResponse().withRequest(ref));
      result.setNumberOfRowsPassed(result.getNumberOfRowsPassed() + 1);

      // Update ES
      searchRepository.updateEntity(ref);
    }

    return result.withSuccessRequest(success);
  }

  protected EntityReference getClientCenter(ClientCenterClient client) {
    Relationship relationship = client.getParent() != null ? Relationship.HAS : Relationship.CONTAINS;
    return client.getClientCenter() != null
        ? client.getClientCenter()
        : getFromEntityRef(client.getId(), relationship, CLIENT_CENTER, true);
  }

  public EntityReference getClientCenter(String id) {
    return Entity.getEntityReferenceById(CLIENT_CENTER, UUID.fromString(id), ALL);
  }

  @Override
  public ClientCenterClientUpdater getUpdater(
      ClientCenterClient original, ClientCenterClient updated, Operation operation) {
    return new ClientCenterClientUpdater(original, updated, operation);
  }

  @Override
  protected void postCreate(ClientCenterClient entity) {
    super.postCreate(entity);
    if (entity.getStatus() == Status.DRAFT) {
      // Create an approval task for clientCenter client in draft mode
      createApprovalTask(entity, entity.getReviewers());
    }
  }

  @Override
  public void postUpdate(ClientCenterClient original, ClientCenterClient updated) {
    super.postUpdate(original, updated);
    if (original.getStatus() == Status.DRAFT) {
      if (updated.getStatus() == Status.APPROVED) {
        closeApprovalTask(updated, "Approved the clientCenter client");
      } else if (updated.getStatus() == Status.REJECTED) {
        closeApprovalTask(updated, "Rejected the clientCenter client");
      }
    }
  }

  @Override
  protected void preDelete(ClientCenterClient entity, String deletedBy) {
    // A clientCenter client in `Draft` state can only be deleted by the reviewers
    if (Status.DRAFT.equals(entity.getStatus())) {
      checkUpdatedByReviewer(entity, deletedBy);
    }
  }

  @Override
  protected void postDelete(ClientCenterClient entity) {
    // Cleanup all the tag labels using this clientCenter client
    daoCollection.tagUsageDAO().deleteTagLabels(TagSource.CLIENT_CENTER.ordinal(), entity.getFullyQualifiedName());
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
      ClientCenterClient clientCenterClient = (ClientCenterClient) threadContext.getAboutEntity();
      clientCenterClient.setStatus(Status.APPROVED);
      return clientCenterClient;
    }

    @Override
    protected void closeTask(String user, CloseTask closeTask) {
      // Closing task results in clientCenter client going from `Draft` to `Rejected`
      ClientCenterClient client = (ClientCenterClient) threadContext.getAboutEntity();
      if (client.getStatus() == Status.DRAFT) {
        String origJson = JsonUtils.pojoToJson(client);
        client.setStatus(Status.REJECTED);
        String updatedJson = JsonUtils.pojoToJson(client);
        JsonPatch patch = JsonUtils.getJsonPatch(origJson, updatedJson);
        EntityRepository<?> repository = threadContext.getEntityRepository();
        repository.patch(null, client.getId(), user, patch);
      }
    }
  }

  @Override
  public EntityInterface getParentEntity(ClientCenterClient entity, String fields) {
    return entity.getParent() != null
        ? Entity.getEntity(entity.getParent(), fields, Include.ALL)
        : Entity.getEntity(entity.getClientCenter(), fields, Include.ALL);
  }

  private void addClientCenterRelationship(ClientCenterClient client) {
    Relationship relationship = client.getParent() != null ? Relationship.HAS : Relationship.CONTAINS;
    addRelationship(
        client.getClientCenter().getId(), client.getId(), CLIENT_CENTER, CLIENT_CENTER_CLIENT, relationship);
  }

  private void addParentRelationship(ClientCenterClient client) {
    if (client.getParent() != null) {
      addRelationship(
          client.getParent().getId(),
          client.getId(),
          CLIENT_CENTER_CLIENT,
          CLIENT_CENTER_CLIENT,
          Relationship.CONTAINS);
    }
  }

  private void validateHierarchy(ClientCenterClient client) {
    // The clientCenter and the parent client must belong to the same hierarchy
    if (client.getParent() == null) {
      return; // Parent is the root of the clientCenter
    }
    String clientCenterFqn = FullyQualifiedName.build(client.getClientCenter().getName());
    if (!client.getParent().getFullyQualifiedName().startsWith(clientCenterFqn)) {
      throw new IllegalArgumentException(
          String.format(
              "Invalid hierarchy - parent [%s] does not belong to clientCenter[%s]",
              client.getParent().getFullyQualifiedName(), client.getClientCenter().getFullyQualifiedName()));
    }
  }

  private void checkUpdatedByReviewer(ClientCenterClient client, String updatedBy) {
    // Only list of allowed reviewers can change the status from DRAFT to APPROVED
    List<EntityReference> reviewers = client.getReviewers();
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

  private void createApprovalTask(ClientCenterClient entity, List<EntityReference> parentReviewers) {
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

  private void closeApprovalTask(ClientCenterClient entity, String comment) {
    EntityLink about = new EntityLink(CLIENT_CENTER_CLIENT, entity.getFullyQualifiedName());
    FeedRepository feedRepository = Entity.getFeedRepository();
    Thread taskThread = feedRepository.getTask(about, TaskType.RequestApproval);
    if (TaskStatus.Open.equals(taskThread.getTask().getStatus())) {
      feedRepository.closeTask(taskThread, entity.getUpdatedBy(), new CloseTask().withComment(comment));
    }
  }

  /** Handles entity updated from PUT and POST operation. */
  public class ClientCenterClientUpdater extends EntityUpdater {
    public ClientCenterClientUpdater(ClientCenterClient original, ClientCenterClient updated, Operation operation) {
      super(original, updated, operation);
    }

    @Transaction
    @Override
    public void entitySpecificUpdate() {
      validateParent();
      updateStatus(original, updated);
      updateSynonyms(original, updated);
      updateReferences(original, updated);
      updateRelatedClients(original, updated);
      updateReviewers(original, updated);
      updateName(original, updated);
      updateParent(original, updated);
      updateFullName(original, updated);
      updateDateOfBirth(original, updated);
      updateInn(original, updated);
      updateSnils(original, updated);
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

    private void updateStatus(ClientCenterClient origClient, ClientCenterClient updatedClient) {
      if (origClient.getStatus() == updatedClient.getStatus()) {
        return;
      }
      // Only reviewers can change from DRAFT status to APPROVED/REJECTED status
      if (origClient.getStatus() == Status.DRAFT
          && (updatedClient.getStatus() == Status.APPROVED || updatedClient.getStatus() == Status.REJECTED)) {
        checkUpdatedByReviewer(origClient, updatedClient.getUpdatedBy());
      }
      recordChange("status", origClient.getStatus(), updatedClient.getStatus());
    }

    private void updateSynonyms(ClientCenterClient origClient, ClientCenterClient updatedClient) {
      List<String> origSynonyms = listOrEmpty(origClient.getSynonyms());
      List<String> updatedSynonyms = listOrEmpty(updatedClient.getSynonyms());

      List<String> added = new ArrayList<>();
      List<String> deleted = new ArrayList<>();
      recordListChange("synonyms", origSynonyms, updatedSynonyms, added, deleted, stringMatch);
    }

    private void updateReferences(ClientCenterClient origClient, ClientCenterClient updatedClient) {
      List<ClientReference> origReferences = listOrEmpty(origClient.getReferences());
      List<ClientReference> updatedReferences = listOrEmpty(updatedClient.getReferences());

      List<ClientReference> added = new ArrayList<>();
      List<ClientReference> deleted = new ArrayList<>();
      recordListChange("references", origReferences, updatedReferences, added, deleted, clientReferenceMatch);
    }

    private void updateRelatedClients(ClientCenterClient origClient, ClientCenterClient updatedClient) {
      List<EntityReference> origRelated = listOrEmpty(origClient.getRelatedClients());
      List<EntityReference> updatedRelated = listOrEmpty(updatedClient.getRelatedClients());
      updateToRelationships(
          "relatedClients",
          CLIENT_CENTER_CLIENT,
          origClient.getId(),
          Relationship.RELATED_TO,
          CLIENT_CENTER_CLIENT,
          origRelated,
          updatedRelated,
          true);
    }

    private void updateReviewers(ClientCenterClient origClient, ClientCenterClient updatedClient) {
      List<EntityReference> origReviewers = listOrEmpty(origClient.getReviewers());
      List<EntityReference> updatedReviewers = listOrEmpty(updatedClient.getReviewers());
      updateFromRelationships(
          FIELD_REVIEWERS,
          Entity.USER,
          origReviewers,
          updatedReviewers,
          Relationship.REVIEWS,
          CLIENT_CENTER_CLIENT,
          origClient.getId());
    }

    public void updateName(ClientCenterClient original, ClientCenterClient updated) {
      if (!original.getName().equals(updated.getName())) {
        if (ProviderType.SYSTEM.equals(original.getProvider())) {
          throw new IllegalArgumentException(
              CatalogExceptionMessage.systemEntityRenameNotAllowed(original.getName(), entityType));
        }
        // ClientCenter client name changed - update the FQNs of the children clients to reflect this
        LOG.info("ClientCenter client name changed from {} to {}", original.getName(), updated.getName());
        daoCollection
            .clientCenterClientDAO()
            .updateFqn(original.getFullyQualifiedName(), updated.getFullyQualifiedName());
        daoCollection
            .tagUsageDAO()
            .rename(
                TagSource.CLIENT_CENTER.ordinal(), original.getFullyQualifiedName(), updated.getFullyQualifiedName());
        recordChange("name", original.getName(), updated.getName());
        invalidateClient(original.getId());
      }
    }

    private void updateParent(ClientCenterClient original, ClientCenterClient updated) {
      // Can't change parent and clientCenter both at the same time
      UUID oldParentId = getId(original.getParent());
      UUID newParentId = getId(updated.getParent());
      boolean parentChanged = !Objects.equals(oldParentId, newParentId);

      UUID oldClientCenterId = getId(original.getClientCenter());
      UUID newClientCenterId = getId(updated.getClientCenter());
      boolean clientCenterChanged = !Objects.equals(oldClientCenterId, newClientCenterId);

      daoCollection
          .clientCenterClientDAO()
          .updateFqn(original.getFullyQualifiedName(), updated.getFullyQualifiedName());
      daoCollection
          .tagUsageDAO()
          .rename(TagSource.CLIENT_CENTER.ordinal(), original.getFullyQualifiedName(), updated.getFullyQualifiedName());
      if (clientCenterChanged) {
        updateClientCenterRelationship(original, updated);
        recordChange("clientCenter", original.getClientCenter(), updated.getClientCenter(), true, entityReferenceMatch);
        invalidateClient(original.getId());
      }
      if (parentChanged) {
        updateClientCenterRelationship(original, updated);
        updateParentRelationship(original, updated);
        recordChange("parent", original.getParent(), updated.getParent(), true, entityReferenceMatch);
        invalidateClient(original.getId());
      }
    }

    public void updateFullName(ClientCenterClient original, ClientCenterClient updated) {
      recordChange("fullName", original.getFullName(), updated.getFullName());
    }

    public void updateDateOfBirth(ClientCenterClient original, ClientCenterClient updated) {
      recordChange("dateOfBirth", original.getDateOfBirth(), updated.getDateOfBirth());
    }

    public void updateInn(ClientCenterClient original, ClientCenterClient updated) {
      recordChange("inn", original.getInn(), updated.getInn());
    }

    public void updateSnils(ClientCenterClient original, ClientCenterClient updated) {
      recordChange("snils", original.getSnils(), updated.getSnils());
    }

    private void validateParent() {
      String fqn = original.getFullyQualifiedName();
      String newParentFqn = updated.getParent() == null ? null : updated.getParent().getFullyQualifiedName();
      // A clientCenter client can't be moved under its child
      if (newParentFqn != null && FullyQualifiedName.isParent(newParentFqn, fqn)) {
        throw new IllegalArgumentException(invalidClientCenterClientMove(fqn, newParentFqn));
      }
    }

    private void updateClientCenterRelationship(ClientCenterClient orig, ClientCenterClient updated) {
      deleteClientCenterRelationship(orig);
      addClientCenterRelationship(updated);
    }

    private void deleteClientCenterRelationship(ClientCenterClient client) {
      Relationship relationship = client.getParent() == null ? Relationship.CONTAINS : Relationship.HAS;
      deleteRelationship(
          client.getClientCenter().getId(), CLIENT_CENTER, client.getId(), CLIENT_CENTER_CLIENT, relationship);
    }

    private void updateParentRelationship(ClientCenterClient orig, ClientCenterClient updated) {
      deleteParentRelationship(orig);
      addParentRelationship(updated);
    }

    private void deleteParentRelationship(ClientCenterClient client) {
      if (client.getParent() != null) {
        deleteRelationship(
            client.getParent().getId(),
            CLIENT_CENTER_CLIENT,
            client.getId(),
            CLIENT_CENTER_CLIENT,
            Relationship.CONTAINS);
      }
    }

    private void invalidateClient(UUID clientId) {
      // The name of the clientCenter client changed or parent change. Invalidate that tag and all the children
      // from the cache
      List<EntityRelationshipRecord> tagRecords =
          findToRecords(clientId, CLIENT_CENTER_CLIENT, Relationship.CONTAINS, CLIENT_CENTER_CLIENT);
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(CLIENT_CENTER_CLIENT, clientId));
      for (EntityRelationshipRecord tagRecord : tagRecords) {
        invalidateClient(tagRecord.getId());
      }
    }
  }
}
