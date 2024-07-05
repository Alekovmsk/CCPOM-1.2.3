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

import static org.openmetadata.schema.type.Include.NON_DELETED;
import static org.openmetadata.service.Entity.AUTOSYSTEM;
import static org.openmetadata.service.util.EntityUtil.entityReferenceMatch;
import static org.openmetadata.service.util.EntityUtil.getId;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.openmetadata.schema.entity.autoSystemClassification.AutoSystem;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.Relationship;
import org.openmetadata.schema.type.TagLabel.TagSource;
import org.openmetadata.service.Entity;
import org.openmetadata.service.exception.CatalogExceptionMessage;
import org.openmetadata.service.jdbi3.CollectionDAO.EntityRelationshipRecord;
import org.openmetadata.service.resources.autoSystems.AutoSystemResource;
import org.openmetadata.service.util.EntityUtil.Fields;
import org.openmetadata.service.util.FullyQualifiedName;

@Slf4j
public class AutoSystemRepository extends EntityRepository<AutoSystem> {
  private static final String UPDATE_FIELDS = "mainFunctionsAndPurpose";
  private static final String PATCH_FIELDS = "mainFunctionsAndPurpose";

  public AutoSystemRepository() {
    super(
        AutoSystemResource.TAG_COLLECTION_PATH,
        Entity.AUTOSYSTEM,
        AutoSystem.class,
        Entity.getCollectionDAO().autoSystemDAO(),
        PATCH_FIELDS,
        UPDATE_FIELDS);
    supportsSearch = true;
  }

  @Override
  public void prepare(AutoSystem entity, boolean update) {
    // Validate parent term
    EntityReference parentTerm = Entity.getEntityReference(entity.getParent(), NON_DELETED);
    entity.setParent(parentTerm);

    // Validate Classification
    EntityReference autoSystemClassification =
        Entity.getEntityReference(entity.getAutoSystemClassification(), NON_DELETED);
    entity.setAutoSystemClassification(autoSystemClassification);
  }

  @Override
  public void storeEntity(AutoSystem autoSystem, boolean update) {
    EntityReference autoSystemClassification = autoSystem.getAutoSystemClassification();
    EntityReference parent = autoSystem.getParent();

    // Parent and Classification are not stored as part of JSON. Build it on the fly based on relationships
    autoSystem.withAutoSystemClassification(null).withParent(null);
    store(autoSystem, update);
    autoSystem.withAutoSystemClassification(autoSystemClassification).withParent(parent);
  }

  @Override
  public void restorePatchAttributes(AutoSystem original, AutoSystem updated) {
    updated.setChildren(original.getChildren());
  }

  @Override
  public void storeRelationships(AutoSystem entity) {
    addAutoSystemClassificationRelationship(entity);
    addParentRelationship(entity);
  }

  @Override
  public void setFullyQualifiedName(AutoSystem autoSystem) {
    if (autoSystem.getParent() == null) {
      autoSystem.setFullyQualifiedName(
          FullyQualifiedName.build(
              autoSystem.getAutoSystemClassification().getFullyQualifiedName(), autoSystem.getName()));
    } else {
      autoSystem.setFullyQualifiedName(
          FullyQualifiedName.add(autoSystem.getParent().getFullyQualifiedName(), autoSystem.getName()));
    }
  }

  @Override
  public EntityRepository<AutoSystem>.EntityUpdater getUpdater(
      AutoSystem original, AutoSystem updated, Operation operation) {
    return new AutoSystemUpdater(original, updated, operation);
  }

  @Override
  protected void postDelete(AutoSystem entity) {
    // Cleanup all the tag labels using this tag
    daoCollection
        .tagUsageDAO()
        .deleteTagLabels(TagSource.AUTOSYSTEMCLASSIFICATION.ordinal(), entity.getFullyQualifiedName());
  }

  private List<EntityReference> getRelatedEntities(AutoSystem autoSystem, String entityType) {
    return autoSystem == null
        ? Collections.emptyList()
        : findTo(autoSystem.getId(), Entity.AUTOSYSTEM, Relationship.COMES_FROM, entityType);
  }

  @Override
  public AutoSystem setFields(AutoSystem autoSystem, Fields fields) {
    autoSystem.withAutoSystemClassification(getAutoSystemClassification(autoSystem)).withParent(getParent(autoSystem));
    if (fields.contains("usageCount")) {
      autoSystem.withUsageCount(getUsageCount(autoSystem));
    }
    return autoSystem;
  }

  @Override
  public AutoSystem clearFields(AutoSystem autoSystem, Fields fields) {
    return autoSystem.withUsageCount(fields.contains("usageCount") ? autoSystem.getUsageCount() : null);
  }

  private Integer getUsageCount(AutoSystem autoSystem) {
    return autoSystem.getUsageCount() != null
        ? autoSystem.getUsageCount()
        : daoCollection
            .tagUsageDAO()
            .getTagCount(TagSource.AUTOSYSTEMCLASSIFICATION.ordinal(), autoSystem.getFullyQualifiedName());
  }

  private EntityReference getAutoSystemClassification(AutoSystem autoSystem) {
    return getFromEntityRef(autoSystem.getId(), Relationship.CONTAINS, Entity.AUTOSYSTEMCLASSIFICATION, true);
  }

  private void addAutoSystemClassificationRelationship(AutoSystem term) {
    addRelationship(
        term.getAutoSystemClassification().getId(),
        term.getId(),
        Entity.AUTOSYSTEMCLASSIFICATION,
        AUTOSYSTEM,
        Relationship.CONTAINS);
  }

  private void addParentRelationship(AutoSystem term) {
    if (term.getParent() != null) {
      addRelationship(term.getParent().getId(), term.getId(), AUTOSYSTEM, AUTOSYSTEM, Relationship.CONTAINS);
    }
  }

  public class AutoSystemUpdater extends EntityUpdater {
    public AutoSystemUpdater(AutoSystem original, AutoSystem updated, Operation operation) {
      super(original, updated, operation);
    }

    @Transaction
    @Override
    public void entitySpecificUpdate() {
      recordChange("mutuallyExclusive", original.getMutuallyExclusive(), updated.getMutuallyExclusive());
      recordChange("disabled,", original.getDisabled(), updated.getDisabled());
      updateName(original, updated);
      updateParent(original, updated);
      updateMainFunctionsAndPurpose(original, updated);
    }

    public void updateName(AutoSystem original, AutoSystem updated) {
      if (!original.getName().equals(updated.getName())) {
        if (ProviderType.SYSTEM.equals(original.getProvider())) {
          throw new IllegalArgumentException(
              CatalogExceptionMessage.systemEntityRenameNotAllowed(original.getName(), entityType));
        }
        // Category name changed - update tag names starting from classification and all the children tags
        LOG.info("AutoSystem name changed from {} to {}", original.getName(), updated.getName());
        daoCollection.autoSystemDAO().updateFqn(original.getFullyQualifiedName(), updated.getFullyQualifiedName());
        daoCollection
            .tagUsageDAO()
            .rename(
                TagSource.AUTOSYSTEMCLASSIFICATION.ordinal(),
                original.getFullyQualifiedName(),
                updated.getFullyQualifiedName());
        recordChange("name", original.getName(), updated.getName());
      }

      // Populate response fields
      invalidateAutoSystems(original.getId());
      getChildren(updated);
    }

    public void updateMainFunctionsAndPurpose(AutoSystem original, AutoSystem updated) {
      recordChange(
          "mainFunctionsAndPurpose", original.getMainFunctionsAndPurpose(), updated.getMainFunctionsAndPurpose());
    }

    private void updateParent(AutoSystem original, AutoSystem updated) {
      // Can't change parent and Classification both at the same time
      UUID oldParentId = getId(original.getParent());
      UUID newParentId = getId(updated.getParent());
      boolean parentChanged = !Objects.equals(oldParentId, newParentId);

      UUID oldCategoryId = getId(original.getAutoSystemClassification());
      UUID newCategoryId = getId(updated.getAutoSystemClassification());
      boolean autoSystemClassificationChanged = !Objects.equals(oldCategoryId, newCategoryId);

      daoCollection.autoSystemDAO().updateFqn(original.getFullyQualifiedName(), updated.getFullyQualifiedName());
      daoCollection
          .tagUsageDAO()
          .rename(
              TagSource.AUTOSYSTEMCLASSIFICATION.ordinal(),
              original.getFullyQualifiedName(),
              updated.getFullyQualifiedName());
      if (autoSystemClassificationChanged) {
        updateAutoSystemClassificationRelationship(original, updated);
        recordChange(
            "Classification",
            original.getAutoSystemClassification(),
            updated.getAutoSystemClassification(),
            true,
            entityReferenceMatch);
        invalidateAutoSystems(original.getId());
      }
      if (parentChanged) {
        updateParentRelationship(original, updated);
        recordChange("parent", original.getParent(), updated.getParent(), true, entityReferenceMatch);
        invalidateAutoSystems(original.getId());
      }
    }

    private void updateAutoSystemClassificationRelationship(AutoSystem orig, AutoSystem updated) {
      deleteAutoSystemClassificationRelationship(orig);
      addAutoSystemClassificationRelationship(updated);
    }

    private void deleteAutoSystemClassificationRelationship(AutoSystem term) {
      deleteRelationship(
          term.getAutoSystemClassification().getId(),
          Entity.AUTOSYSTEMCLASSIFICATION,
          term.getId(),
          AUTOSYSTEM,
          Relationship.CONTAINS);
    }

    private void updateParentRelationship(AutoSystem orig, AutoSystem updated) {
      deleteParentRelationship(orig);
      addParentRelationship(updated);
    }

    private void deleteParentRelationship(AutoSystem term) {
      if (term.getParent() != null) {
        deleteRelationship(term.getParent().getId(), AUTOSYSTEM, term.getId(), AUTOSYSTEM, Relationship.CONTAINS);
      }
    }

    private void invalidateAutoSystems(UUID autoSystemId) {
      // The name of the tag changed. Invalidate that tag and all the children from the cache
      List<EntityRelationshipRecord> autoSystemRecords =
          findToRecords(autoSystemId, AUTOSYSTEM, Relationship.CONTAINS, AUTOSYSTEM);
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(AUTOSYSTEM, autoSystemId));
      for (EntityRelationshipRecord autoSystemRecord : autoSystemRecords) {
        invalidateAutoSystems(autoSystemRecord.getId());
      }
    }
  }
}
