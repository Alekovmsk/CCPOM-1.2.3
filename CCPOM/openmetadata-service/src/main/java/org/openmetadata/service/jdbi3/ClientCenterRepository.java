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
import static org.openmetadata.service.Entity.CLIENT_CENTER;
import static org.openmetadata.service.Entity.CLIENT_CENTER_CLIENT;

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
import org.openmetadata.schema.api.data.ClientReference;
import org.openmetadata.schema.entity.data.ClientCenter;
import org.openmetadata.schema.entity.data.ClientCenterClient;
import org.openmetadata.schema.entity.data.ClientCenterClient.Status;
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
import org.openmetadata.service.resources.clientcenter.ClientCenterResource;
import org.openmetadata.service.util.EntityUtil.Fields;
import org.openmetadata.service.util.FullyQualifiedName;

@Slf4j
public class ClientCenterRepository extends EntityRepository<ClientCenter> {
  private static final String UPDATE_FIELDS = "";
  private static final String PATCH_FIELDS = "";

  public ClientCenterRepository() {
    super(
        ClientCenterResource.COLLECTION_PATH,
        Entity.CLIENT_CENTER,
        ClientCenter.class,
        Entity.getCollectionDAO().clientCenterDAO(),
        PATCH_FIELDS,
        UPDATE_FIELDS);
    quoteFqn = true;
  }

  @Override
  public ClientCenter setFields(ClientCenter clientCenter, Fields fields) {
    clientCenter.setClientCount(
        fields.contains("clientCount") ? getClientCount(clientCenter) : clientCenter.getClientCount());
    return clientCenter.withUsageCount(
        fields.contains("usageCount") ? getUsageCount(clientCenter) : clientCenter.getUsageCount());
  }

  @Override
  public ClientCenter clearFields(ClientCenter clientCenter, Fields fields) {
    clientCenter.setClientCount(fields.contains("clientCount") ? clientCenter.getClientCount() : null);
    return clientCenter.withUsageCount(fields.contains("usageCount") ? clientCenter.getUsageCount() : null);
  }

  @Override
  public void prepare(ClientCenter clientCenter, boolean update) {
    validateUsers(clientCenter.getReviewers());
  }

  @Override
  public void storeEntity(ClientCenter clientCenter, boolean update) {
    // Relationships and fields such as reviewers are derived and not stored as part of json
    List<EntityReference> reviewers = clientCenter.getReviewers();
    clientCenter.withReviewers(null);
    store(clientCenter, update);
    clientCenter.withReviewers(reviewers);
  }

  @Override
  public void storeRelationships(ClientCenter clientCenter) {
    for (EntityReference reviewer : listOrEmpty(clientCenter.getReviewers())) {
      addRelationship(reviewer.getId(), clientCenter.getId(), Entity.USER, Entity.CLIENT_CENTER, Relationship.REVIEWS);
    }
  }

  private Integer getUsageCount(ClientCenter clientCenter) {
    return daoCollection.tagUsageDAO().getTagCount(TagSource.CLIENT_CENTER.ordinal(), clientCenter.getName());
  }

  private Integer getClientCount(ClientCenter clientCenter) {
    ListFilter filter =
        new ListFilter(Include.NON_DELETED).addQueryParam("parent", FullyQualifiedName.build(clientCenter.getName()));
    return daoCollection.clientCenterClientDAO().listCount(filter);
  }

  @Override
  public EntityUpdater getUpdater(ClientCenter original, ClientCenter updated, Operation operation) {
    return new ClientCenterUpdater(original, updated, operation);
  }

  /** Export clientCenter as CSV */
  @Override
  public String exportToCsv(String name, String user) throws IOException {
    ClientCenter clientCenter = getByName(null, name, Fields.EMPTY_FIELDS); // Validate clientCenter name
    ClientCenterClientRepository repository =
        (ClientCenterClientRepository) Entity.getEntityRepository(CLIENT_CENTER_CLIENT);
    ListFilter filter = new ListFilter(Include.NON_DELETED).addQueryParam("parent", name);
    List<ClientCenterClient> clients =
        repository.listAll(repository.getFields("owner,reviewers,tags,relatedClients"), filter);
    clients.sort(Comparator.comparing(EntityInterface::getFullyQualifiedName));
    return new ClientCenterCsv(clientCenter, user).exportCsv(clients);
  }

  /** Load CSV provided for bulk upload */
  @Override
  public CsvImportResult importFromCsv(String name, String csv, boolean dryRun, String user) throws IOException {
    ClientCenter clientCenter = getByName(null, name, Fields.EMPTY_FIELDS); // Validate clientCenter name
    ClientCenterCsv clientCenterCsv = new ClientCenterCsv(clientCenter, user);
    return clientCenterCsv.importCsv(csv, dryRun);
  }

  public static class ClientCenterCsv extends EntityCsv<ClientCenterClient> {
    public static final CsvDocumentation DOCUMENTATION = getCsvDocumentation(Entity.CLIENT_CENTER);
    public static final List<CsvHeader> HEADERS = DOCUMENTATION.getHeaders();
    private final ClientCenter clientCenter;

    ClientCenterCsv(ClientCenter clientCenter, String user) {
      super(CLIENT_CENTER_CLIENT, DOCUMENTATION.getHeaders(), user);
      this.clientCenter = clientCenter;
    }

    @Override
    protected ClientCenterClient toEntity(CSVPrinter printer, CSVRecord csvRecord) throws IOException {
      ClientCenterClient clientCenterClient =
          new ClientCenterClient().withClientCenter(clientCenter.getEntityReference());

      // Field 1 - parent client
      clientCenterClient.withParent(getEntityReference(printer, csvRecord, 0, CLIENT_CENTER_CLIENT));
      if (!processRecord) {
        return null;
      }

      // Field 2,3,4 - ClientCenter name, displayName, description
      clientCenterClient.withName(csvRecord.get(1)).withDisplayName(csvRecord.get(2)).withDescription(csvRecord.get(3));

      // Field 5 - Synonym list
      clientCenterClient.withSynonyms(CsvUtil.fieldToStrings(csvRecord.get(4)));

      // Field 6 - Related clients
      clientCenterClient.withRelatedClients(getEntityReferences(printer, csvRecord, 5, CLIENT_CENTER_CLIENT));
      if (!processRecord) {
        return null;
      }

      // Field 7 - ClientReferences
      clientCenterClient.withReferences(getClientReferences(printer, csvRecord));
      if (!processRecord) {
        return null;
      }

      // Field 8 - tags
      clientCenterClient.withTags(getTagLabels(printer, csvRecord, 7));
      if (!processRecord) {
        return null;
      }

      // Field 9 - reviewers
      clientCenterClient.withReviewers(getUserOrTeamEntityReferences(printer, csvRecord, 8, Entity.USER));
      if (!processRecord) {
        return null;
      }
      // Field 10 - owner
      clientCenterClient.withOwner(getOwner(printer, csvRecord, 9));

      // Field 11 - status
      clientCenterClient.withStatus(getClientStatus(printer, csvRecord));
      return clientCenterClient;
    }

    private List<ClientReference> getClientReferences(CSVPrinter printer, CSVRecord csvRecord) throws IOException {
      String clientRefs = csvRecord.get(6);
      if (nullOrEmpty(clientRefs)) {
        return null;
      }
      List<String> clientRefList = CsvUtil.fieldToStrings(clientRefs);
      if (clientRefList.size() % 2 != 0) {
        // List should have even numbered clients - clientName and endPoint
        importFailure(printer, invalidField(6, "Client references should clientName;endpoint"), csvRecord);
        processRecord = false;
        return null;
      }
      List<ClientReference> list = new ArrayList<>();
      for (int i = 0; i < clientRefList.size(); ) {
        list.add(
            new ClientReference().withName(clientRefList.get(i++)).withEndpoint(URI.create(clientRefList.get(i++))));
      }
      return list;
    }

    private Status getClientStatus(CSVPrinter printer, CSVRecord csvRecord) throws IOException {
      String clientStatus = csvRecord.get(10);
      try {
        return nullOrEmpty(clientStatus) ? Status.DRAFT : Status.fromValue(clientStatus);
      } catch (Exception ex) {
        // List should have even numbered clients - clientName and endPoint
        importFailure(
            printer,
            invalidField(10, String.format("ClientCenter client status %s is invalid", clientStatus)),
            csvRecord);
        processRecord = false;
        return null;
      }
    }

    @Override
    protected List<String> toRecord(ClientCenterClient entity) {
      List<String> recordList = new ArrayList<>();
      addEntityReference(recordList, entity.getParent());
      addField(recordList, entity.getName());
      addField(recordList, entity.getDisplayName());
      addField(recordList, entity.getDescription());
      CsvUtil.addFieldList(recordList, entity.getSynonyms());
      addEntityReferences(recordList, entity.getRelatedClients());
      addField(recordList, clientReferencesToRecord(entity.getReferences()));
      addTagLabels(recordList, entity.getTags());
      addField(recordList, reviewerReferencesToRecord(entity.getReviewers()));
      addOwner(recordList, entity.getOwner());
      addField(recordList, entity.getStatus().value());
      return recordList;
    }

    private String clientReferencesToRecord(List<ClientReference> list) {
      return nullOrEmpty(list)
          ? null
          : list.stream()
              .map(
                  clientReference ->
                      clientReference.getName() + CsvUtil.FIELD_SEPARATOR + clientReference.getEndpoint())
              .collect(Collectors.joining(FIELD_SEPARATOR));
    }

    private String reviewerReferencesToRecord(List<EntityReference> reviewers) {
      return nullOrEmpty(reviewers)
          ? null
          : reviewers.stream().map(EntityReference::getName).collect(Collectors.joining(FIELD_SEPARATOR));
    }
  }

  /** Handles entity updated from PUT and POST operation. */
  public class ClientCenterUpdater extends EntityUpdater {
    public ClientCenterUpdater(ClientCenter original, ClientCenter updated, Operation operation) {
      super(original, updated, operation);
    }

    @Transaction
    @Override
    public void entitySpecificUpdate() {
      updateReviewers(original, updated);
      updateName(original, updated);
    }

    private void updateReviewers(ClientCenter origClientCenter, ClientCenter updatedClientCenter) {
      List<EntityReference> origUsers = listOrEmpty(origClientCenter.getReviewers());
      List<EntityReference> updatedUsers = listOrEmpty(updatedClientCenter.getReviewers());
      updateFromRelationships(
          "reviewers",
          Entity.USER,
          origUsers,
          updatedUsers,
          Relationship.REVIEWS,
          Entity.CLIENT_CENTER,
          origClientCenter.getId());
    }

    public void updateName(ClientCenter original, ClientCenter updated) {
      if (!original.getName().equals(updated.getName())) {
        if (ProviderType.SYSTEM.equals(original.getProvider())) {
          throw new IllegalArgumentException(
              CatalogExceptionMessage.systemEntityRenameNotAllowed(original.getName(), entityType));
        }
        // ClientCenter name changed - update tag names starting from clientCenter and all the children tags
        LOG.info("ClientCenter name changed from {} to {}", original.getName(), updated.getName());
        daoCollection.clientCenterClientDAO().updateFqn(original.getName(), updated.getName());
        daoCollection
            .tagUsageDAO()
            .updateTagPrefix(TagSource.CLIENT_CENTER.ordinal(), original.getName(), updated.getName());
        recordChange("name", original.getName(), updated.getName());
        invalidateClientCenter(original.getId());
      }
    }

    public void invalidateClientCenter(UUID classificationId) {
      // ClientCenter name changed. Invalidate the clientCenter and its children clients
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(CLIENT_CENTER, classificationId));
      List<EntityRelationshipRecord> tags =
          findToRecords(classificationId, CLIENT_CENTER, Relationship.CONTAINS, CLIENT_CENTER_CLIENT);
      for (EntityRelationshipRecord tagRecord : tags) {
        invalidateClients(tagRecord.getId());
      }
    }

    private void invalidateClients(UUID clientId) {
      // The name of the clientCenter changed or parent changed. Invalidate that tag and all the children from the
      // cache
      List<EntityRelationshipRecord> tagRecords =
          findToRecords(clientId, CLIENT_CENTER_CLIENT, Relationship.CONTAINS, CLIENT_CENTER_CLIENT);
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(CLIENT_CENTER_CLIENT, clientId));
      for (EntityRelationshipRecord tagRecord : tagRecords) {
        invalidateClients(tagRecord.getId());
      }
    }
  }
}
