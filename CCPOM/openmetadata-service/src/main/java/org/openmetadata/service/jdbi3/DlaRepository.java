/*
 *  Copyright 2021 Collate
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.openmetadata.service.jdbi3;

import static org.openmetadata.common.utils.CommonUtil.listOrEmpty;
import static org.openmetadata.schema.type.Include.NON_DELETED;
import static org.openmetadata.service.Entity.DLA;
import static org.openmetadata.service.util.EntityUtil.entityReferenceMatch;
import static org.openmetadata.service.util.EntityUtil.getId;
import static org.openmetadata.service.util.EntityUtil.indicatorMatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.openmetadata.schema.api.dlaClassification.Indicator;
import org.openmetadata.schema.entity.dlaClassification.Dla;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.Relationship;
import org.openmetadata.schema.type.TagLabel.TagSource;
import org.openmetadata.service.Entity;
import org.openmetadata.service.exception.CatalogExceptionMessage;
import org.openmetadata.service.jdbi3.CollectionDAO.EntityRelationshipRecord;
import org.openmetadata.service.resources.dlas.DlaResource;
import org.openmetadata.service.util.EntityUtil;
import org.openmetadata.service.util.EntityUtil.Fields;
import org.openmetadata.service.util.FullyQualifiedName;

@Slf4j
public class DlaRepository extends EntityRepository<Dla> {
  private static final String UPDATE_FIELDS =
      "docNumber,docType,conclusionDate,expirationDate,validity,prolongation,domainData,consumer,docStatus,dataRegister,dataManager,dataSteward,autoSourceSystem,autoConsumerSystem,publicationArea,cronUpdateData,cronDataAvailability,cronDataActualization,dataProvisionIndicators,dataQualityIndicators,reportingType,reportingPeriodicity,reportingReceiverRole,reportingResponsible,reportingHref,incidenSigns,additionalInformation";
  private static final String PATCH_FIELDS =
      "docNumber,docType,conclusionDate,expirationDate,validity,prolongation,domainData,consumer,docStatus,dataRegister,dataManager,dataSteward,autoSourceSystem,autoConsumerSystem,publicationArea,cronUpdateData,cronDataAvailability,cronDataActualization,dataProvisionIndicators,dataQualityIndicators,reportingType,reportingPeriodicity,reportingReceiverRole,reportingResponsible,reportingHref,incidenSigns,additionalInformation";

  public DlaRepository() {
    super(
        DlaResource.TAG_COLLECTION_PATH,
        Entity.DLA,
        Dla.class,
        Entity.getCollectionDAO().dlaDAO(),
        PATCH_FIELDS,
        UPDATE_FIELDS);
    supportsSearch = true;
  }

  @Override
  public void prepare(Dla entity, boolean update) {
    // Validate parent term
    EntityReference parentTerm = Entity.getEntityReference(entity.getParent(), NON_DELETED);
    entity.setParent(parentTerm);

    // Validate Classification
    EntityReference dlaClassification = Entity.getEntityReference(entity.getDlaClassification(), NON_DELETED);
    entity.setDlaClassification(dlaClassification);

    // Validate Auto Source System
    entity.setAutoSourceSystem(EntityUtil.getEntityReferences(entity.getAutoSourceSystem(), NON_DELETED));

    // Validate Auto Source System
    entity.setAutoConsumerSystem(EntityUtil.getEntityReferences(entity.getAutoConsumerSystem(), NON_DELETED));
  }

  @Override
  public void storeEntity(Dla dla, boolean update) {
    EntityReference dlaClassification = dla.getDlaClassification();
    EntityReference parent = dla.getParent();
    List<EntityReference> autoSourceSystem = dla.getAutoSourceSystem();
    List<EntityReference> autoConsumerSystem = dla.getAutoConsumerSystem();

    // Parent and Classification are not stored as part of JSON. Build it on the fly based on relationships
    dla.withDlaClassification(null).withParent(null).withAutoSourceSystem(null).withAutoConsumerSystem(null);
    store(dla, update);
    dla.withDlaClassification(dlaClassification)
        .withParent(parent)
        .withAutoSourceSystem(autoSourceSystem)
        .withAutoConsumerSystem(autoConsumerSystem);
  }

  @Override
  public void restorePatchAttributes(Dla original, Dla updated) {
    updated.setChildren(original.getChildren());
  }

  @Override
  public void storeRelationships(Dla entity) {
    addDlaClassificationRelationship(entity);
    addParentRelationship(entity);
    if (entity.getAutoSourceSystem() != null) {
      for (EntityReference autoSS : entity.getAutoSourceSystem()) {
        // Make this bidirectional relationship
        addRelationship(entity.getId(), autoSS.getId(), DLA, Entity.DATABASE_SERVICE, Relationship.COMES_FROM);
      }
    }
    if (entity.getAutoConsumerSystem() != null) {
      for (EntityReference autoSS : entity.getAutoConsumerSystem()) {
        // Make this bidirectional relationship
        addRelationship(entity.getId(), autoSS.getId(), DLA, Entity.DATABASE_SERVICE, Relationship.USES);
      }
    }
  }

  @Override
  public void setFullyQualifiedName(Dla dla) {
    if (dla.getParent() == null) {
      dla.setFullyQualifiedName(
          FullyQualifiedName.build(dla.getDlaClassification().getFullyQualifiedName(), dla.getName()));
    } else {
      dla.setFullyQualifiedName(FullyQualifiedName.add(dla.getParent().getFullyQualifiedName(), dla.getName()));
    }
  }

  @Override
  public EntityRepository<Dla>.EntityUpdater getUpdater(Dla original, Dla updated, Operation operation) {
    return new DlaUpdater(original, updated, operation);
  }

  @Override
  protected void postDelete(Dla entity) {
    // Cleanup all the tag labels using this tag
    daoCollection.tagUsageDAO().deleteTagLabels(TagSource.DLACLASSIFICATION.ordinal(), entity.getFullyQualifiedName());
  }

  private List<EntityReference> getRelatedEntities(Dla dla, String entityType) {
    return dla == null ? Collections.emptyList() : findTo(dla.getId(), Entity.DLA, Relationship.COMES_FROM, entityType);
  }

  private List<EntityReference> getRelatedEntitiesConsumer(Dla dla, String entityType) {
    return dla == null ? Collections.emptyList() : findTo(dla.getId(), Entity.DLA, Relationship.USES, entityType);
  }

  @Override
  public Dla setFields(Dla dla, Fields fields) {
    dla.withDlaClassification(getDlaClassification(dla)).withParent(getParent(dla));
    if (fields.contains("usageCount")) {
      dla.withUsageCount(getUsageCount(dla));
    }
    dla.setAutoSourceSystem(
        fields.contains("autoSourceSystem") ? getRelatedEntities(dla, Entity.DATABASE_SERVICE) : null);
    dla.setAutoConsumerSystem(
        fields.contains("autoConsumerSystem") ? getRelatedEntitiesConsumer(dla, Entity.DATABASE_SERVICE) : null);
    return dla;
  }

  @Override
  public Dla clearFields(Dla dla, Fields fields) {
    dla.setAutoSourceSystem(fields.contains("autoSourceSystem") ? dla.getAutoSourceSystem() : null);
    dla.setAutoConsumerSystem(fields.contains("autoConsumerSystem") ? dla.getAutoConsumerSystem() : null);
    return dla.withUsageCount(fields.contains("usageCount") ? dla.getUsageCount() : null);
  }

  private Integer getUsageCount(Dla dla) {
    return dla.getUsageCount() != null
        ? dla.getUsageCount()
        : daoCollection.tagUsageDAO().getTagCount(TagSource.DLACLASSIFICATION.ordinal(), dla.getFullyQualifiedName());
  }

  private EntityReference getDlaClassification(Dla dla) {
    return getFromEntityRef(dla.getId(), Relationship.CONTAINS, Entity.DLACLASSIFICATION, true);
  }

  private void addDlaClassificationRelationship(Dla term) {
    addRelationship(
        term.getDlaClassification().getId(), term.getId(), Entity.DLACLASSIFICATION, DLA, Relationship.CONTAINS);
  }

  private void addParentRelationship(Dla term) {
    if (term.getParent() != null) {
      addRelationship(term.getParent().getId(), term.getId(), DLA, DLA, Relationship.CONTAINS);
    }
  }

  public class DlaUpdater extends EntityUpdater {
    public DlaUpdater(Dla original, Dla updated, Operation operation) {
      super(original, updated, operation);
    }

    @Transaction
    @Override
    public void entitySpecificUpdate() {
      recordChange("mutuallyExclusive", original.getMutuallyExclusive(), updated.getMutuallyExclusive());
      recordChange("disabled,", original.getDisabled(), updated.getDisabled());
      updateName(original, updated);
      updateParent(original, updated);
      updateDocNumber(original, updated);
      updateDocType(original, updated);
      updateConclusionDate(original, updated);
      updateExpirationDate(original, updated);
      updateValidity(original, updated);
      updateProlongation(original, updated);
      updateDomainData(original, updated);
      updateConsumer(original, updated);
      updateDocStatus(original, updated);
      updateDataRegister(original, updated);
      updateDataManager(original, updated);
      updateDataSteward(original, updated);
      updateAutoSourceSystem(original, updated);
      updateAutoConsumerSystem(original, updated);
      updatePublicationArea(original, updated);
      updateCronUpdateData(original, updated);
      updateCronDataAvailability(original, updated);
      updateCronDataActualization(original, updated);
      updateDataProvisionIndicators(original, updated);
      updateDataQualityIndicators(original, updated);
      updateReportingType(original, updated);
      updateReportingPeriodicity(original, updated);
      updateReportingReceiverRole(original, updated);
      updateReportingResponsible(original, updated);
      updateReportingHref(original, updated);
      updateIncidenSigns(original, updated);
      updateAdditionalInformation(original, updated);
    }

    public void updateName(Dla original, Dla updated) {
      if (!original.getName().equals(updated.getName())) {
        if (ProviderType.SYSTEM.equals(original.getProvider())) {
          throw new IllegalArgumentException(
              CatalogExceptionMessage.systemEntityRenameNotAllowed(original.getName(), entityType));
        }
        // Category name changed - update tag names starting from classification and all the children tags
        LOG.info("Dla name changed from {} to {}", original.getName(), updated.getName());
        daoCollection.dlaDAO().updateFqn(original.getFullyQualifiedName(), updated.getFullyQualifiedName());
        daoCollection
            .tagUsageDAO()
            .rename(
                TagSource.DLACLASSIFICATION.ordinal(),
                original.getFullyQualifiedName(),
                updated.getFullyQualifiedName());
        recordChange("name", original.getName(), updated.getName());
      }

      // Populate response fields
      invalidateDlas(original.getId());
      getChildren(updated);
    }

    public void updateDocNumber(Dla original, Dla updated) {
      recordChange("docNumber", original.getDocNumber(), updated.getDocNumber());
    }

    public void updateDocType(Dla original, Dla updated) {
      recordChange("docType", original.getDocType(), updated.getDocType());
    }

    public void updateConclusionDate(Dla original, Dla updated) {
      recordChange("conclusionDate", original.getConclusionDate(), updated.getConclusionDate());
    }

    public void updateExpirationDate(Dla original, Dla updated) {
      recordChange("expirationDate", original.getExpirationDate(), updated.getExpirationDate());
    }

    public void updateValidity(Dla original, Dla updated) {
      recordChange("validity", original.getValidity(), updated.getValidity());
    }

    public void updateProlongation(Dla original, Dla updated) {
      recordChange("prolongation", original.getProlongation(), updated.getProlongation());
    }

    public void updateDomainData(Dla original, Dla updated) {
      recordChange("domainData", original.getDomainData(), updated.getDomainData());
    }

    public void updateConsumer(Dla original, Dla updated) {
      recordChange("consumer", original.getConsumer(), updated.getConsumer());
    }

    public void updateDocStatus(Dla original, Dla updated) {
      recordChange("docStatus", original.getDocStatus(), updated.getDocStatus());
    }

    public void updateDataRegister(Dla original, Dla updated) {
      recordChange("dataRegister", original.getDataRegister(), updated.getDataRegister());
    }

    public void updateDataManager(Dla original, Dla updated) {
      recordChange("dataManager", original.getDataManager(), updated.getDataManager());
    }

    public void updateDataSteward(Dla original, Dla updated) {
      recordChange("dataSteward", original.getDataSteward(), updated.getDataSteward());
    }

    public void updateAutoSourceSystem(Dla original, Dla updated) {
      updateASS(
          Entity.DATABASE_SERVICE,
          "autoSourceSystem",
          listOrEmpty(updated.getAutoSourceSystem()),
          listOrEmpty(original.getAutoSourceSystem()));
    }

    public void updateAutoConsumerSystem(Dla original, Dla updated) {
      updateACS(
          Entity.DATABASE_SERVICE,
          "autoConsumerSystem",
          listOrEmpty(updated.getAutoConsumerSystem()),
          listOrEmpty(original.getAutoConsumerSystem()));
    }

    private void updateASS(
        String entityType, String field, List<EntityReference> updEntities, List<EntityReference> oriEntities) {
      // Remove all entity type associated with this dashboard
      deleteFrom(updated.getId(), Entity.DLA, Relationship.COMES_FROM, entityType);

      // Add relationship from dashboard to entity type
      for (EntityReference entity : updEntities) {
        addRelationship(updated.getId(), entity.getId(), Entity.DLA, entityType, Relationship.COMES_FROM);
      }

      List<EntityReference> added = new ArrayList<>();
      List<EntityReference> deleted = new ArrayList<>();
      recordListChange(field, oriEntities, updEntities, added, deleted, EntityUtil.entityReferenceMatch);
    }

    private void updateACS(
        String entityType, String field, List<EntityReference> updEntities, List<EntityReference> oriEntities) {
      // Remove all entity type associated with this dashboard
      deleteFrom(updated.getId(), Entity.DLA, Relationship.USES, entityType);

      // Add relationship from dashboard to entity type
      for (EntityReference entity : updEntities) {
        addRelationship(updated.getId(), entity.getId(), Entity.DLA, entityType, Relationship.USES);
      }

      List<EntityReference> added = new ArrayList<>();
      List<EntityReference> deleted = new ArrayList<>();
      recordListChange(field, oriEntities, updEntities, added, deleted, EntityUtil.entityReferenceMatch);
    }

    public void updatePublicationArea(Dla original, Dla updated) {
      recordChange("publicationArea", original.getPublicationArea(), updated.getPublicationArea());
    }

    public void updateCronUpdateData(Dla original, Dla updated) {
      recordChange("cronUpdateData", original.getValidity(), updated.getCronUpdateData());
    }

    public void updateCronDataAvailability(Dla original, Dla updated) {
      recordChange("cronDataAvailability", original.getCronDataAvailability(), updated.getCronDataAvailability());
    }

    public void updateCronDataActualization(Dla original, Dla updated) {
      recordChange("cronDataActualization", original.getCronDataActualization(), updated.getCronDataActualization());
    }

    private void updateDataProvisionIndicators(Dla original, Dla updated) {
      List<Indicator> origIndicators = listOrEmpty(original.getDataProvisionIndicators());
      List<Indicator> updatedIndicators = listOrEmpty(updated.getDataProvisionIndicators());

      List<Indicator> added = new ArrayList<>();
      List<Indicator> deleted = new ArrayList<>();
      recordListChange("dataProvisionIndicators", origIndicators, updatedIndicators, added, deleted, indicatorMatch);
    }

    private void updateDataQualityIndicators(Dla original, Dla updated) {
      List<Indicator> origIndicators = listOrEmpty(original.getDataQualityIndicators());
      List<Indicator> updatedIndicators = listOrEmpty(updated.getDataQualityIndicators());

      List<Indicator> added = new ArrayList<>();
      List<Indicator> deleted = new ArrayList<>();
      recordListChange("dataQualityIndicators", origIndicators, updatedIndicators, added, deleted, indicatorMatch);
    }

    public void updateReportingType(Dla original, Dla updated) {
      recordChange("reportingType", original.getReportingType(), updated.getReportingType());
    }

    public void updateReportingPeriodicity(Dla original, Dla updated) {
      recordChange("reportingPeriodicity", original.getReportingPeriodicity(), updated.getReportingPeriodicity());
    }

    public void updateReportingReceiverRole(Dla original, Dla updated) {
      recordChange("reportingReceiverRole", original.getReportingReceiverRole(), updated.getReportingReceiverRole());
    }

    public void updateReportingResponsible(Dla original, Dla updated) {
      recordChange("reportingResponsible", original.getReportingResponsible(), updated.getReportingResponsible());
    }

    public void updateReportingHref(Dla original, Dla updated) {
      recordChange("reportingHref", original.getReportingHref(), updated.getReportingHref());
    }

    public void updateIncidenSigns(Dla original, Dla updated) {
      recordChange("incidenSigns", original.getIncidenSigns(), updated.getIncidenSigns());
    }

    public void updateAdditionalInformation(Dla original, Dla updated) {
      recordChange("additionalInformation", original.getAdditionalInformation(), updated.getAdditionalInformation());
    }

    private void updateParent(Dla original, Dla updated) {
      // Can't change parent and Classification both at the same time
      UUID oldParentId = getId(original.getParent());
      UUID newParentId = getId(updated.getParent());
      boolean parentChanged = !Objects.equals(oldParentId, newParentId);

      UUID oldCategoryId = getId(original.getDlaClassification());
      UUID newCategoryId = getId(updated.getDlaClassification());
      boolean dlaClassificationChanged = !Objects.equals(oldCategoryId, newCategoryId);

      daoCollection.dlaDAO().updateFqn(original.getFullyQualifiedName(), updated.getFullyQualifiedName());
      daoCollection
          .tagUsageDAO()
          .rename(
              TagSource.DLACLASSIFICATION.ordinal(), original.getFullyQualifiedName(), updated.getFullyQualifiedName());
      if (dlaClassificationChanged) {
        updateDlaClassificationRelationship(original, updated);
        recordChange(
            "Classification",
            original.getDlaClassification(),
            updated.getDlaClassification(),
            true,
            entityReferenceMatch);
        invalidateDlas(original.getId());
      }
      if (parentChanged) {
        updateParentRelationship(original, updated);
        recordChange("parent", original.getParent(), updated.getParent(), true, entityReferenceMatch);
        invalidateDlas(original.getId());
      }
    }

    private void updateDlaClassificationRelationship(Dla orig, Dla updated) {
      deleteDlaClassificationRelationship(orig);
      addDlaClassificationRelationship(updated);
    }

    private void deleteDlaClassificationRelationship(Dla term) {
      deleteRelationship(
          term.getDlaClassification().getId(), Entity.DLACLASSIFICATION, term.getId(), DLA, Relationship.CONTAINS);
    }

    private void updateParentRelationship(Dla orig, Dla updated) {
      deleteParentRelationship(orig);
      addParentRelationship(updated);
    }

    private void deleteParentRelationship(Dla term) {
      if (term.getParent() != null) {
        deleteRelationship(term.getParent().getId(), DLA, term.getId(), DLA, Relationship.CONTAINS);
      }
    }

    private void invalidateDlas(UUID dlaId) {
      // The name of the tag changed. Invalidate that tag and all the children from the cache
      List<EntityRelationshipRecord> dlaRecords = findToRecords(dlaId, DLA, Relationship.CONTAINS, DLA);
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(DLA, dlaId));
      for (EntityRelationshipRecord dlaRecord : dlaRecords) {
        invalidateDlas(dlaRecord.getId());
      }
    }
  }
}
