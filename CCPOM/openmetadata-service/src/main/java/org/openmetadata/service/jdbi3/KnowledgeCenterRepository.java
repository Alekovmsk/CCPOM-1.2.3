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
import static org.openmetadata.csv.CsvUtil.FIELD_SEPARATOR;
import static org.openmetadata.csv.CsvUtil.addEntityReference;
import static org.openmetadata.csv.CsvUtil.addEntityReferences;
import static org.openmetadata.csv.CsvUtil.addField;
import static org.openmetadata.csv.CsvUtil.addOwner;
import static org.openmetadata.csv.CsvUtil.addTagLabels;
import static org.openmetadata.service.Entity.KNOWLEDGE_CENTER;
import static org.openmetadata.service.Entity.KNOWLEDGE_CENTER_DOCUMENT;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.openmetadata.csv.CsvUtil;
import org.openmetadata.csv.EntityCsv;
import org.openmetadata.schema.EntityInterface;
import org.openmetadata.schema.api.data.DocumentReference;
import org.openmetadata.schema.entity.data.KnowledgeCenter;
import org.openmetadata.schema.entity.data.KnowledgeCenterDocument;
import org.openmetadata.schema.entity.data.KnowledgeCenterDocument.Status;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.Relationship;
import org.openmetadata.schema.type.TagLabel.TagSource;
import org.openmetadata.schema.type.csv.CsvDocumentation;
import org.openmetadata.schema.type.csv.CsvHeader;
import org.openmetadata.schema.type.csv.CsvImportResult;
import org.openmetadata.service.Entity;
import org.openmetadata.service.exception.CatalogExceptionMessage;
import org.openmetadata.service.jdbi3.CollectionDAO.EntityRelationshipRecord;
import org.openmetadata.service.resources.knowledgecenter.KnowledgeCenterResource;
import org.openmetadata.service.util.EntityUtil.Fields;
import org.openmetadata.service.util.FullyQualifiedName;

@Slf4j
public class KnowledgeCenterRepository extends EntityRepository<KnowledgeCenter> {
  private static final String UPDATE_FIELDS = "";
  private static final String PATCH_FIELDS = "";

  public KnowledgeCenterRepository() {
    super(
        KnowledgeCenterResource.COLLECTION_PATH,
        Entity.KNOWLEDGE_CENTER,
        KnowledgeCenter.class,
        Entity.getCollectionDAO().knowledgeCenterDAO(),
        PATCH_FIELDS,
        UPDATE_FIELDS);
    quoteFqn = true;
  }

  @Override
  public KnowledgeCenter setFields(KnowledgeCenter knowledgeCenter, Fields fields) {
    knowledgeCenter.setDocumentCount(
        fields.contains("documentCount") ? getDocumentCount(knowledgeCenter) : knowledgeCenter.getDocumentCount());
    return knowledgeCenter.withUsageCount(
        fields.contains("usageCount") ? getUsageCount(knowledgeCenter) : knowledgeCenter.getUsageCount());
  }

  @Override
  public KnowledgeCenter clearFields(KnowledgeCenter knowledgeCenter, Fields fields) {
    knowledgeCenter.setDocumentCount(fields.contains("documentCount") ? knowledgeCenter.getDocumentCount() : null);
    return knowledgeCenter.withUsageCount(fields.contains("usageCount") ? knowledgeCenter.getUsageCount() : null);
  }

  @Override
  public void prepare(KnowledgeCenter knowledgeCenter, boolean update) {
    validateUsers(knowledgeCenter.getReviewers());
  }

  @Override
  public void storeEntity(KnowledgeCenter knowledgeCenter, boolean update) {
    // Relationships and fields such as reviewers are derived and not stored as part of json
    List<EntityReference> reviewers = knowledgeCenter.getReviewers();
    knowledgeCenter.withReviewers(null);
    store(knowledgeCenter, update);
    knowledgeCenter.withReviewers(reviewers);
  }

  @Override
  public void storeRelationships(KnowledgeCenter knowledgeCenter) {
    for (EntityReference reviewer : listOrEmpty(knowledgeCenter.getReviewers())) {
      addRelationship(
          reviewer.getId(), knowledgeCenter.getId(), Entity.USER, Entity.KNOWLEDGE_CENTER, Relationship.REVIEWS);
    }
  }

  private Integer getUsageCount(KnowledgeCenter knowledgeCenter) {
    return daoCollection.tagUsageDAO().getTagCount(TagSource.KNOWLEDGE_CENTER.ordinal(), knowledgeCenter.getName());
  }

  private Integer getDocumentCount(KnowledgeCenter knowledgeCenter) {
    ListFilter filter =
        new ListFilter(Include.NON_DELETED)
            .addQueryParam("parent", FullyQualifiedName.build(knowledgeCenter.getName()));
    return daoCollection.knowledgeCenterDocumentDAO().listCount(filter);
  }

  @Override
  public EntityUpdater getUpdater(KnowledgeCenter original, KnowledgeCenter updated, Operation operation) {
    return new KnowledgeCenterUpdater(original, updated, operation);
  }

  /** Export knowledgeCenter as CSV */
  @Override
  public String exportToCsv(String name, String user) throws IOException {
    KnowledgeCenter knowledgeCenter = getByName(null, name, Fields.EMPTY_FIELDS); // Validate knowledgeCenter name
    KnowledgeCenterDocumentRepository repository =
        (KnowledgeCenterDocumentRepository) Entity.getEntityRepository(KNOWLEDGE_CENTER_DOCUMENT);
    ListFilter filter = new ListFilter(Include.NON_DELETED).addQueryParam("parent", name);
    List<KnowledgeCenterDocument> documents =
        repository.listAll(repository.getFields("owner,reviewers,tags,relatedDocuments"), filter);
    documents.sort(Comparator.comparing(EntityInterface::getFullyQualifiedName));
    return new KnowledgeCenterCsv(knowledgeCenter, user).exportCsv(documents);
  }

  /** Load CSV provided for bulk upload */
  @Override
  public CsvImportResult importFromCsv(String name, String csv, boolean dryRun, String user) throws IOException {
    KnowledgeCenter knowledgeCenter = getByName(null, name, Fields.EMPTY_FIELDS); // Validate knowledgeCenter name
    KnowledgeCenterCsv knowledgeCenterCsv = new KnowledgeCenterCsv(knowledgeCenter, user);
    return knowledgeCenterCsv.importCsv(csv, dryRun);
  }

  public static class KnowledgeCenterCsv extends EntityCsv<KnowledgeCenterDocument> {
    public static final CsvDocumentation DOCUMENTATION = getCsvDocumentation(Entity.KNOWLEDGE_CENTER);
    public static final List<CsvHeader> HEADERS = DOCUMENTATION.getHeaders();
    private final KnowledgeCenter knowledgeCenter;

    KnowledgeCenterCsv(KnowledgeCenter knowledgeCenter, String user) {
      super(KNOWLEDGE_CENTER_DOCUMENT, DOCUMENTATION.getHeaders(), user);
      this.knowledgeCenter = knowledgeCenter;
    }

    @Override
    protected KnowledgeCenterDocument toEntity(CSVPrinter printer, CSVRecord csvRecord) throws IOException {
      KnowledgeCenterDocument knowledgeCenterDocument =
          new KnowledgeCenterDocument().withKnowledgeCenter(knowledgeCenter.getEntityReference());

      // Field 1 - parent document
      knowledgeCenterDocument.withParent(getEntityReference(printer, csvRecord, 0, KNOWLEDGE_CENTER_DOCUMENT));
      if (!processRecord) {
        return null;
      }

      // Field 2,3,4 - KnowledgeCenter name, displayName, description
      knowledgeCenterDocument
          .withName(csvRecord.get(1))
          .withDisplayName(csvRecord.get(2))
          .withDescription(csvRecord.get(3));

      // Field 5 - Synonym list
      knowledgeCenterDocument.withSynonyms(CsvUtil.fieldToStrings(csvRecord.get(4)));

      // Field 6 - Related documents
      knowledgeCenterDocument.withRelatedDocuments(
          getEntityReferences(printer, csvRecord, 5, KNOWLEDGE_CENTER_DOCUMENT));
      if (!processRecord) {
        return null;
      }

      // Field 7 - DocumentReferences
      knowledgeCenterDocument.withReferences(getDocumentReferences(printer, csvRecord));
      if (!processRecord) {
        return null;
      }

      // Field 8 - tags
      knowledgeCenterDocument.withTags(getTagLabels(printer, csvRecord, 7));
      if (!processRecord) {
        return null;
      }

      // Field 9 - reviewers
      knowledgeCenterDocument.withReviewers(getUserOrTeamEntityReferences(printer, csvRecord, 8, Entity.USER));
      if (!processRecord) {
        return null;
      }
      // Field 10 - owner
      knowledgeCenterDocument.withOwner(getOwner(printer, csvRecord, 9));

      // Field 11 - status
      knowledgeCenterDocument.withStatus(getDocumentStatus(printer, csvRecord));
      return knowledgeCenterDocument;
    }

    private List<DocumentReference> getDocumentReferences(CSVPrinter printer, CSVRecord csvRecord) throws IOException {
      String documentRefs = csvRecord.get(6);
      if (nullOrEmpty(documentRefs)) {
        return null;
      }
      List<String> documentRefList = CsvUtil.fieldToStrings(documentRefs);
      if (documentRefList.size() % 2 != 0) {
        // List should have even numbered documents - documentName and endPoint
        importFailure(printer, invalidField(6, "Document references should documentName;endpoint"), csvRecord);
        processRecord = false;
        return null;
      }
      List<DocumentReference> list = new ArrayList<>();
      for (int i = 0; i < documentRefList.size(); ) {
        list.add(
            new DocumentReference()
                .withName(documentRefList.get(i++))
                .withEndpoint(URI.create(documentRefList.get(i++))));
      }
      return list;
    }

    private Status getDocumentStatus(CSVPrinter printer, CSVRecord csvRecord) throws IOException {
      String documentStatus = csvRecord.get(10);
      try {
        return nullOrEmpty(documentStatus) ? Status.DRAFT : Status.fromValue(documentStatus);
      } catch (Exception ex) {
        // List should have even numbered documents - documentName and endPoint
        importFailure(
            printer,
            invalidField(10, String.format("KnowledgeCenter document status %s is invalid", documentStatus)),
            csvRecord);
        processRecord = false;
        return null;
      }
    }

    @Override
    protected List<String> toRecord(KnowledgeCenterDocument entity) {
      List<String> recordList = new ArrayList<>();
      addEntityReference(recordList, entity.getParent());
      addField(recordList, entity.getName());
      addField(recordList, entity.getDisplayName());
      addField(recordList, entity.getDescription());
      CsvUtil.addFieldList(recordList, entity.getSynonyms());
      addEntityReferences(recordList, entity.getRelatedDocuments());
      addField(recordList, documentReferencesToRecord(entity.getReferences()));
      addTagLabels(recordList, entity.getTags());
      addField(recordList, reviewerReferencesToRecord(entity.getReviewers()));
      addOwner(recordList, entity.getOwner());
      addField(recordList, entity.getStatus().value());
      return recordList;
    }

    private String documentReferencesToRecord(List<DocumentReference> list) {
      return nullOrEmpty(list)
          ? null
          : list.stream()
              .map(
                  documentReference ->
                      documentReference.getName() + CsvUtil.FIELD_SEPARATOR + documentReference.getEndpoint())
              .collect(Collectors.joining(FIELD_SEPARATOR));
    }

    private String reviewerReferencesToRecord(List<EntityReference> reviewers) {
      return nullOrEmpty(reviewers)
          ? null
          : reviewers.stream().map(EntityReference::getName).collect(Collectors.joining(FIELD_SEPARATOR));
    }
  }

  /** Handles entity updated from PUT and POST operation. */
  public class KnowledgeCenterUpdater extends EntityUpdater {
    public KnowledgeCenterUpdater(KnowledgeCenter original, KnowledgeCenter updated, Operation operation) {
      super(original, updated, operation);
    }

    @Transaction
    @Override
    public void entitySpecificUpdate() {
      updateReviewers(original, updated);
      updateName(original, updated);
    }

    private void updateReviewers(KnowledgeCenter origKnowledgeCenter, KnowledgeCenter updatedKnowledgeCenter) {
      List<EntityReference> origUsers = listOrEmpty(origKnowledgeCenter.getReviewers());
      List<EntityReference> updatedUsers = listOrEmpty(updatedKnowledgeCenter.getReviewers());
      updateFromRelationships(
          "reviewers",
          Entity.USER,
          origUsers,
          updatedUsers,
          Relationship.REVIEWS,
          Entity.KNOWLEDGE_CENTER,
          origKnowledgeCenter.getId());
    }

    public void updateName(KnowledgeCenter original, KnowledgeCenter updated) {
      if (!original.getName().equals(updated.getName())) {
        if (ProviderType.SYSTEM.equals(original.getProvider())) {
          throw new IllegalArgumentException(
              CatalogExceptionMessage.systemEntityRenameNotAllowed(original.getName(), entityType));
        }
        // KnowledgeCenter name changed - update tag names starting from knowledgeCenter and all the children tags
        LOG.info("KnowledgeCenter name changed from {} to {}", original.getName(), updated.getName());
        daoCollection.knowledgeCenterDocumentDAO().updateFqn(original.getName(), updated.getName());
        daoCollection
            .tagUsageDAO()
            .updateTagPrefix(TagSource.KNOWLEDGE_CENTER.ordinal(), original.getName(), updated.getName());
        recordChange("name", original.getName(), updated.getName());
        invalidateKnowledgeCenter(original.getId());
      }
    }

    public void invalidateKnowledgeCenter(UUID classificationId) {
      // KnowledgeCenter name changed. Invalidate the knowledgeCenter and its children documents
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(KNOWLEDGE_CENTER, classificationId));
      List<EntityRelationshipRecord> tags =
          findToRecords(classificationId, KNOWLEDGE_CENTER, Relationship.CONTAINS, KNOWLEDGE_CENTER_DOCUMENT);
      for (EntityRelationshipRecord tagRecord : tags) {
        invalidateDocuments(tagRecord.getId());
      }
    }

    private void invalidateDocuments(UUID documentId) {
      // The name of the knowledgeCenter changed or parent changed. Invalidate that tag and all the children from the
      // cache
      List<EntityRelationshipRecord> tagRecords =
          findToRecords(documentId, KNOWLEDGE_CENTER_DOCUMENT, Relationship.CONTAINS, KNOWLEDGE_CENTER_DOCUMENT);
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(KNOWLEDGE_CENTER_DOCUMENT, documentId));
      for (EntityRelationshipRecord tagRecord : tagRecords) {
        invalidateDocuments(tagRecord.getId());
      }
    }
  }
}
