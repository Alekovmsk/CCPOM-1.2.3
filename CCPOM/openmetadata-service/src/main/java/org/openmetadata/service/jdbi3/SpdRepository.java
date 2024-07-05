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
import static org.openmetadata.service.Entity.SPD;
import static org.openmetadata.service.util.EntityUtil.entityReferenceMatch;
import static org.openmetadata.service.util.EntityUtil.getId;
import static org.openmetadata.service.util.EntityUtil.spdIndicatorMatch;
import static org.openmetadata.service.util.EntityUtil.spdMemberMatch;
import static org.openmetadata.service.util.EntityUtil.spdRequirementMatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.openmetadata.schema.api.spdClassification.SpdIndicator;
import org.openmetadata.schema.api.spdClassification.SpdMember;
import org.openmetadata.schema.api.spdClassification.SpdRequirement;
import org.openmetadata.schema.entity.spdClassification.Spd;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.Relationship;
import org.openmetadata.schema.type.TagLabel.TagSource;
import org.openmetadata.service.Entity;
import org.openmetadata.service.exception.CatalogExceptionMessage;
import org.openmetadata.service.jdbi3.CollectionDAO.EntityRelationshipRecord;
import org.openmetadata.service.resources.spds.SpdResource;
import org.openmetadata.service.util.EntityUtil.Fields;
import org.openmetadata.service.util.FullyQualifiedName;

@Slf4j
public class SpdRepository extends EntityRepository<Spd> {
  private static final String UPDATE_FIELDS =
      "docNumber,docType,conclusionDate,expirationDate,validity,prolongation,domainData,consumer,docStatus,members,connectionParameters,connectionModes,otherParameters,requirements,indicators,reportingType,reportingPeriodicity,reportingFormationMode,reportingHref";
  private static final String PATCH_FIELDS =
      "docNumber,docType,conclusionDate,expirationDate,validity,prolongation,domainData,consumer,docStatus,members,connectionParameters,connectionModes,otherParameters,requirements,indicators,reportingType,reportingPeriodicity,reportingFormationMode,reportingHref";

  public SpdRepository() {
    super(
        SpdResource.TAG_COLLECTION_PATH,
        Entity.SPD,
        Spd.class,
        Entity.getCollectionDAO().spdDAO(),
        PATCH_FIELDS,
        UPDATE_FIELDS);
    supportsSearch = true;
  }

  @Override
  public void prepare(Spd entity, boolean update) {
    // Validate parent term
    EntityReference parentTerm = Entity.getEntityReference(entity.getParent(), NON_DELETED);
    entity.setParent(parentTerm);

    // Validate Classification
    EntityReference spdClassification = Entity.getEntityReference(entity.getSpdClassification(), NON_DELETED);
    entity.setSpdClassification(spdClassification);
  }

  @Override
  public void storeEntity(Spd spd, boolean update) {
    EntityReference spdClassification = spd.getSpdClassification();
    EntityReference parent = spd.getParent();

    // Parent and Classification are not stored as part of JSON. Build it on the fly based on relationships
    spd.withSpdClassification(null).withParent(null);
    store(spd, update);
    spd.withSpdClassification(spdClassification).withParent(parent);
  }

  @Override
  public void restorePatchAttributes(Spd original, Spd updated) {
    updated.setChildren(original.getChildren());
  }

  @Override
  public void storeRelationships(Spd entity) {
    addSpdClassificationRelationship(entity);
    addParentRelationship(entity);
  }

  @Override
  public void setFullyQualifiedName(Spd spd) {
    if (spd.getParent() == null) {
      spd.setFullyQualifiedName(
          FullyQualifiedName.build(spd.getSpdClassification().getFullyQualifiedName(), spd.getName()));
    } else {
      spd.setFullyQualifiedName(FullyQualifiedName.add(spd.getParent().getFullyQualifiedName(), spd.getName()));
    }
  }

  @Override
  public EntityRepository<Spd>.EntityUpdater getUpdater(Spd original, Spd updated, Operation operation) {
    return new SpdUpdater(original, updated, operation);
  }

  @Override
  protected void postDelete(Spd entity) {
    // Cleanup all the tag labels using this tag
    daoCollection.tagUsageDAO().deleteTagLabels(TagSource.SPDCLASSIFICATION.ordinal(), entity.getFullyQualifiedName());
  }

  private List<EntityReference> getRelatedEntities(Spd spd, String entityType) {
    return spd == null ? Collections.emptyList() : findTo(spd.getId(), Entity.SPD, Relationship.COMES_FROM, entityType);
  }

  @Override
  public Spd setFields(Spd spd, Fields fields) {
    spd.withSpdClassification(getSpdClassification(spd)).withParent(getParent(spd));
    if (fields.contains("usageCount")) {
      spd.withUsageCount(getUsageCount(spd));
    }
    return spd;
  }

  @Override
  public Spd clearFields(Spd spd, Fields fields) {
    return spd.withUsageCount(fields.contains("usageCount") ? spd.getUsageCount() : null);
  }

  private Integer getUsageCount(Spd spd) {
    return spd.getUsageCount() != null
        ? spd.getUsageCount()
        : daoCollection.tagUsageDAO().getTagCount(TagSource.SPDCLASSIFICATION.ordinal(), spd.getFullyQualifiedName());
  }

  private EntityReference getSpdClassification(Spd spd) {
    return getFromEntityRef(spd.getId(), Relationship.CONTAINS, Entity.SPDCLASSIFICATION, true);
  }

  private void addSpdClassificationRelationship(Spd term) {
    addRelationship(
        term.getSpdClassification().getId(), term.getId(), Entity.SPDCLASSIFICATION, SPD, Relationship.CONTAINS);
  }

  private void addParentRelationship(Spd term) {
    if (term.getParent() != null) {
      addRelationship(term.getParent().getId(), term.getId(), SPD, SPD, Relationship.CONTAINS);
    }
  }

  public class SpdUpdater extends EntityUpdater {
    public SpdUpdater(Spd original, Spd updated, Operation operation) {
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

      updateMembers(original, updated);
      updateAutoSystemProvider(original, updated);
      updateAutoSystemOwnerFullName(original, updated);
      updateAutoSystemOwnerPhone(original, updated);
      updateAutoSystemOwnerEmail(original, updated);
      updateProductManagerFullName(original, updated);
      updateProductManagerPhone(original, updated);
      updateProductManagerEmail(original, updated);
      updateConnectionParameters(original, updated);
      updateConnectionModes(original, updated);
      updateOtherParameters(original, updated);
      updateRequirements(original, updated);
      updateIndicators(original, updated);
      updateReportingType(original, updated);
      updateReportingPeriodicity(original, updated);
      updateReportingFormationMode(original, updated);
      updateReportingHref(original, updated);
    }

    public void updateName(Spd original, Spd updated) {
      if (!original.getName().equals(updated.getName())) {
        if (ProviderType.SYSTEM.equals(original.getProvider())) {
          throw new IllegalArgumentException(
              CatalogExceptionMessage.systemEntityRenameNotAllowed(original.getName(), entityType));
        }
        // Category name changed - update tag names starting from classification and all the children tags
        LOG.info("Spd name changed from {} to {}", original.getName(), updated.getName());
        daoCollection.spdDAO().updateFqn(original.getFullyQualifiedName(), updated.getFullyQualifiedName());
        daoCollection
            .tagUsageDAO()
            .rename(
                TagSource.SPDCLASSIFICATION.ordinal(),
                original.getFullyQualifiedName(),
                updated.getFullyQualifiedName());
        recordChange("name", original.getName(), updated.getName());
      }

      // Populate response fields
      invalidateSpds(original.getId());
      getChildren(updated);
    }

    public void updateDocNumber(Spd original, Spd updated) {
      recordChange("docNumber", original.getDocNumber(), updated.getDocNumber());
    }

    public void updateDocType(Spd original, Spd updated) {
      recordChange("docType", original.getDocType(), updated.getDocType());
    }

    public void updateConclusionDate(Spd original, Spd updated) {
      recordChange("conclusionDate", original.getConclusionDate(), updated.getConclusionDate());
    }

    public void updateExpirationDate(Spd original, Spd updated) {
      recordChange("expirationDate", original.getExpirationDate(), updated.getExpirationDate());
    }

    public void updateValidity(Spd original, Spd updated) {
      recordChange("validity", original.getValidity(), updated.getValidity());
    }

    public void updateProlongation(Spd original, Spd updated) {
      recordChange("prolongation", original.getProlongation(), updated.getProlongation());
    }

    public void updateDomainData(Spd original, Spd updated) {
      recordChange("domainData", original.getDomainData(), updated.getDomainData());
    }

    public void updateConsumer(Spd original, Spd updated) {
      recordChange("consumer", original.getConsumer(), updated.getConsumer());
    }

    public void updateDocStatus(Spd original, Spd updated) {
      recordChange("docStatus", original.getDocStatus(), updated.getDocStatus());
    }

    private void updateMembers(Spd original, Spd updated) {
      List<SpdMember> origIndicators = listOrEmpty(original.getMembers());
      List<SpdMember> updatedIndicators = listOrEmpty(updated.getMembers());

      List<SpdMember> added = new ArrayList<>();
      List<SpdMember> deleted = new ArrayList<>();
      recordListChange("members", origIndicators, updatedIndicators, added, deleted, spdMemberMatch);
    }

    public void updateAutoSystemProvider(Spd original, Spd updated) {
      recordChange("autoSystemProvider", original.getAutoSystemProvider(), updated.getAutoSystemProvider());
    }

    public void updateAutoSystemOwnerFullName(Spd original, Spd updated) {
      recordChange(
          "autoSystemOwnerFullName", original.getAutoSystemOwnerFullName(), updated.getAutoSystemOwnerFullName());
    }

    public void updateAutoSystemOwnerPhone(Spd original, Spd updated) {
      recordChange("autoSystemOwnerPhone", original.getAutoSystemOwnerPhone(), updated.getAutoSystemOwnerPhone());
    }

    public void updateAutoSystemOwnerEmail(Spd original, Spd updated) {
      recordChange("autoSystemOwnerEmail", original.getAutoSystemOwnerEmail(), updated.getAutoSystemOwnerEmail());
    }

    public void updateProductManagerFullName(Spd original, Spd updated) {
      recordChange("productManagerFullName", original.getProductManagerFullName(), updated.getProductManagerFullName());
    }

    public void updateProductManagerPhone(Spd original, Spd updated) {
      recordChange("productManagerPhone", original.getProductManagerPhone(), updated.getProductManagerPhone());
    }

    public void updateProductManagerEmail(Spd original, Spd updated) {
      recordChange("productManagerEmail", original.getProductManagerEmail(), updated.getProductManagerEmail());
    }

    public void updateConnectionParameters(Spd original, Spd updated) {
      recordChange("connectionParameters", original.getConnectionParameters(), updated.getConnectionParameters());
    }

    public void updateConnectionModes(Spd original, Spd updated) {
      recordChange("connectionModes", original.getConnectionModes(), updated.getConnectionModes());
    }

    public void updateOtherParameters(Spd original, Spd updated) {
      recordChange("otherParameters", original.getOtherParameters(), updated.getOtherParameters());
    }

    private void updateRequirements(Spd original, Spd updated) {
      List<SpdRequirement> origIndicators = listOrEmpty(original.getRequirements());
      List<SpdRequirement> updatedIndicators = listOrEmpty(updated.getRequirements());

      List<SpdRequirement> added = new ArrayList<>();
      List<SpdRequirement> deleted = new ArrayList<>();
      recordListChange("requirements", origIndicators, updatedIndicators, added, deleted, spdRequirementMatch);
    }

    private void updateIndicators(Spd original, Spd updated) {
      List<SpdIndicator> origIndicators = listOrEmpty(original.getIndicators());
      List<SpdIndicator> updatedIndicators = listOrEmpty(updated.getIndicators());

      List<SpdIndicator> added = new ArrayList<>();
      List<SpdIndicator> deleted = new ArrayList<>();
      recordListChange("indicators", origIndicators, updatedIndicators, added, deleted, spdIndicatorMatch);
    }

    public void updateReportingType(Spd original, Spd updated) {
      recordChange("reportingType", original.getReportingType(), updated.getReportingType());
    }

    public void updateReportingPeriodicity(Spd original, Spd updated) {
      recordChange("reportingPeriodicity", original.getReportingPeriodicity(), updated.getReportingPeriodicity());
    }

    public void updateReportingFormationMode(Spd original, Spd updated) {
      recordChange("reportingFormationMode", original.getReportingFormationMode(), updated.getReportingFormationMode());
    }

    public void updateReportingHref(Spd original, Spd updated) {
      recordChange("reportingHref", original.getReportingHref(), updated.getReportingHref());
    }

    private void updateParent(Spd original, Spd updated) {
      // Can't change parent and Classification both at the same time
      UUID oldParentId = getId(original.getParent());
      UUID newParentId = getId(updated.getParent());
      boolean parentChanged = !Objects.equals(oldParentId, newParentId);

      UUID oldCategoryId = getId(original.getSpdClassification());
      UUID newCategoryId = getId(updated.getSpdClassification());
      boolean spdClassificationChanged = !Objects.equals(oldCategoryId, newCategoryId);

      daoCollection.spdDAO().updateFqn(original.getFullyQualifiedName(), updated.getFullyQualifiedName());
      daoCollection
          .tagUsageDAO()
          .rename(
              TagSource.SPDCLASSIFICATION.ordinal(), original.getFullyQualifiedName(), updated.getFullyQualifiedName());
      if (spdClassificationChanged) {
        updateSpdClassificationRelationship(original, updated);
        recordChange(
            "Classification",
            original.getSpdClassification(),
            updated.getSpdClassification(),
            true,
            entityReferenceMatch);
        invalidateSpds(original.getId());
      }
      if (parentChanged) {
        updateParentRelationship(original, updated);
        recordChange("parent", original.getParent(), updated.getParent(), true, entityReferenceMatch);
        invalidateSpds(original.getId());
      }
    }

    private void updateSpdClassificationRelationship(Spd orig, Spd updated) {
      deleteSpdClassificationRelationship(orig);
      addSpdClassificationRelationship(updated);
    }

    private void deleteSpdClassificationRelationship(Spd term) {
      deleteRelationship(
          term.getSpdClassification().getId(), Entity.SPDCLASSIFICATION, term.getId(), SPD, Relationship.CONTAINS);
    }

    private void updateParentRelationship(Spd orig, Spd updated) {
      deleteParentRelationship(orig);
      addParentRelationship(updated);
    }

    private void deleteParentRelationship(Spd term) {
      if (term.getParent() != null) {
        deleteRelationship(term.getParent().getId(), SPD, term.getId(), SPD, Relationship.CONTAINS);
      }
    }

    private void invalidateSpds(UUID spdId) {
      // The name of the tag changed. Invalidate that tag and all the children from the cache
      List<EntityRelationshipRecord> spdRecords = findToRecords(spdId, SPD, Relationship.CONTAINS, SPD);
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(SPD, spdId));
      for (EntityRelationshipRecord spdRecord : spdRecords) {
        invalidateSpds(spdRecord.getId());
      }
    }
  }
}
