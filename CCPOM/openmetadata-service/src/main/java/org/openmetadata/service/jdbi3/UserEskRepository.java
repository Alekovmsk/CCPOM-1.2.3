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
import static org.openmetadata.service.Entity.USERESK;
import static org.openmetadata.service.util.EntityUtil.entityReferenceMatch;
import static org.openmetadata.service.util.EntityUtil.getId;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.openmetadata.schema.entity.userEskClassification.UserEsk;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.Relationship;
import org.openmetadata.schema.type.TagLabel.TagSource;
import org.openmetadata.service.Entity;
import org.openmetadata.service.exception.CatalogExceptionMessage;
import org.openmetadata.service.jdbi3.CollectionDAO.EntityRelationshipRecord;
import org.openmetadata.service.resources.userEsks.UserEskResource;
import org.openmetadata.service.util.EntityUtil.Fields;
import org.openmetadata.service.util.FullyQualifiedName;

@Slf4j
public class UserEskRepository extends EntityRepository<UserEsk> {
  private static final String UPDATE_FIELDS =
      "lastName,firstName,middleName,email,userName,fullName,phoneNumber,jobTitle,department,isActive,createTimestamp,modifyTimestamp";
  private static final String PATCH_FIELDS =
      "lastName,firstName,middleName,email,userName,fullName,phoneNumber,jobTitle,department,isActive,createTimestamp,modifyTimestamp";

  public UserEskRepository() {
    super(
        UserEskResource.TAG_COLLECTION_PATH,
        Entity.USERESK,
        UserEsk.class,
        Entity.getCollectionDAO().userEskDAO(),
        PATCH_FIELDS,
        UPDATE_FIELDS);
    supportsSearch = true;
  }

  @Override
  public void prepare(UserEsk entity, boolean update) {
    // Validate parent term
    EntityReference parentTerm = Entity.getEntityReference(entity.getParent(), NON_DELETED);
    entity.setParent(parentTerm);

    // Validate Classification
    EntityReference userEskClassification = Entity.getEntityReference(entity.getUserEskClassification(), NON_DELETED);
    entity.setUserEskClassification(userEskClassification);
  }

  @Override
  public void storeEntity(UserEsk userEsk, boolean update) {
    EntityReference userEskClassification = userEsk.getUserEskClassification();
    EntityReference parent = userEsk.getParent();

    // Parent and Classification are not stored as part of JSON. Build it on the fly based on relationships
    userEsk.withUserEskClassification(null).withParent(null);
    store(userEsk, update);
    userEsk.withUserEskClassification(userEskClassification).withParent(parent);
  }

  @Override
  public void restorePatchAttributes(UserEsk original, UserEsk updated) {
    updated.setChildren(original.getChildren());
  }

  @Override
  public void storeRelationships(UserEsk entity) {
    addUserEskClassificationRelationship(entity);
    addParentRelationship(entity);
  }

  @Override
  public void setFullyQualifiedName(UserEsk userEsk) {
    if (userEsk.getParent() == null) {
      userEsk.setFullyQualifiedName(
          FullyQualifiedName.build(userEsk.getUserEskClassification().getFullyQualifiedName(), userEsk.getName()));
    } else {
      userEsk.setFullyQualifiedName(
          FullyQualifiedName.add(userEsk.getParent().getFullyQualifiedName(), userEsk.getName()));
    }
  }

  @Override
  public EntityRepository<UserEsk>.EntityUpdater getUpdater(UserEsk original, UserEsk updated, Operation operation) {
    return new UserEskUpdater(original, updated, operation);
  }

  @Override
  protected void postDelete(UserEsk entity) {
    // Cleanup all the tag labels using this tag
    daoCollection
        .tagUsageDAO()
        .deleteTagLabels(TagSource.USERESKCLASSIFICATION.ordinal(), entity.getFullyQualifiedName());
  }

  private List<EntityReference> getRelatedEntities(UserEsk userEsk, String entityType) {
    return userEsk == null
        ? Collections.emptyList()
        : findTo(userEsk.getId(), Entity.USERESK, Relationship.COMES_FROM, entityType);
  }

  @Override
  public UserEsk setFields(UserEsk userEsk, Fields fields) {
    userEsk.withUserEskClassification(getUserEskClassification(userEsk)).withParent(getParent(userEsk));
    if (fields.contains("usageCount")) {
      userEsk.withUsageCount(getUsageCount(userEsk));
    }
    return userEsk;
  }

  @Override
  public UserEsk clearFields(UserEsk userEsk, Fields fields) {
    return userEsk.withUsageCount(fields.contains("usageCount") ? userEsk.getUsageCount() : null);
  }

  private Integer getUsageCount(UserEsk userEsk) {
    return userEsk.getUsageCount() != null
        ? userEsk.getUsageCount()
        : daoCollection
            .tagUsageDAO()
            .getTagCount(TagSource.USERESKCLASSIFICATION.ordinal(), userEsk.getFullyQualifiedName());
  }

  private EntityReference getUserEskClassification(UserEsk userEsk) {
    return getFromEntityRef(userEsk.getId(), Relationship.CONTAINS, Entity.USERESKCLASSIFICATION, true);
  }

  private void addUserEskClassificationRelationship(UserEsk term) {
    addRelationship(
        term.getUserEskClassification().getId(),
        term.getId(),
        Entity.USERESKCLASSIFICATION,
        USERESK,
        Relationship.CONTAINS);
  }

  private void addParentRelationship(UserEsk term) {
    if (term.getParent() != null) {
      addRelationship(term.getParent().getId(), term.getId(), USERESK, USERESK, Relationship.CONTAINS);
    }
  }

  public class UserEskUpdater extends EntityUpdater {
    public UserEskUpdater(UserEsk original, UserEsk updated, Operation operation) {
      super(original, updated, operation);
    }

    @Transaction
    @Override
    public void entitySpecificUpdate() {
      recordChange("mutuallyExclusive", original.getMutuallyExclusive(), updated.getMutuallyExclusive());
      recordChange("disabled,", original.getDisabled(), updated.getDisabled());
      updateName(original, updated);
      updateParent(original, updated);
      updateLastName(original, updated);
      updateFirstName(original, updated);
      updateMiddleName(original, updated);
      updateEmail(original, updated);
      updateUserName(original, updated);
      updateFullName(original, updated);
      updatePhoneNumber(original, updated);
      updateJobTitle(original, updated);
      updateDepartment(original, updated);
      updateIsActive(original, updated);
      updateCreateTimestamp(original, updated);
      updateModifyTimestamp(original, updated);
    }

    public void updateName(UserEsk original, UserEsk updated) {
      if (!original.getName().equals(updated.getName())) {
        if (ProviderType.SYSTEM.equals(original.getProvider())) {
          throw new IllegalArgumentException(
              CatalogExceptionMessage.systemEntityRenameNotAllowed(original.getName(), entityType));
        }
        // Category name changed - update tag names starting from classification and all the children tags
        LOG.info("UserEsk name changed from {} to {}", original.getName(), updated.getName());
        daoCollection.userEskDAO().updateFqn(original.getFullyQualifiedName(), updated.getFullyQualifiedName());
        daoCollection
            .tagUsageDAO()
            .rename(
                TagSource.USERESKCLASSIFICATION.ordinal(),
                original.getFullyQualifiedName(),
                updated.getFullyQualifiedName());
        recordChange("name", original.getName(), updated.getName());
      }

      // Populate response fields
      invalidateUserEsks(original.getId());
      getChildren(updated);
    }

    public void updateLastName(UserEsk original, UserEsk updated) {
      recordChange("lastName", original.getLastName(), updated.getLastName());
    }

    public void updateFirstName(UserEsk original, UserEsk updated) {
      recordChange("firstName", original.getFirstName(), updated.getFirstName());
    }

    public void updateMiddleName(UserEsk original, UserEsk updated) {
      recordChange("middleName", original.getMiddleName(), updated.getMiddleName());
    }

    public void updateEmail(UserEsk original, UserEsk updated) {
      recordChange("email", original.getEmail(), updated.getEmail());
    }

    public void updateUserName(UserEsk original, UserEsk updated) {
      recordChange("userName", original.getUserName(), updated.getUserName());
    }

    public void updateFullName(UserEsk original, UserEsk updated) {
      recordChange("fullName", original.getFullName(), updated.getFullName());
    }

    public void updatePhoneNumber(UserEsk original, UserEsk updated) {
      recordChange("phoneNumber", original.getPhoneNumber(), updated.getPhoneNumber());
    }

    public void updateJobTitle(UserEsk original, UserEsk updated) {
      recordChange("jobTitle", original.getJobTitle(), updated.getJobTitle());
    }

    public void updateDepartment(UserEsk original, UserEsk updated) {
      recordChange("department", original.getDepartment(), updated.getDepartment());
    }

    public void updateIsActive(UserEsk original, UserEsk updated) {
      recordChange("isActive", original.getIsActive(), updated.getIsActive());
    }

    public void updateCreateTimestamp(UserEsk original, UserEsk updated) {
      recordChange("createTimestamp", original.getCreateTimestamp(), updated.getCreateTimestamp());
    }

    public void updateModifyTimestamp(UserEsk original, UserEsk updated) {
      recordChange("modifyTimestamp", original.getModifyTimestamp(), updated.getModifyTimestamp());
    }

    private void updateParent(UserEsk original, UserEsk updated) {
      // Can't change parent and Classification both at the same time
      UUID oldParentId = getId(original.getParent());
      UUID newParentId = getId(updated.getParent());
      boolean parentChanged = !Objects.equals(oldParentId, newParentId);

      UUID oldCategoryId = getId(original.getUserEskClassification());
      UUID newCategoryId = getId(updated.getUserEskClassification());
      boolean userEskClassificationChanged = !Objects.equals(oldCategoryId, newCategoryId);

      daoCollection.userEskDAO().updateFqn(original.getFullyQualifiedName(), updated.getFullyQualifiedName());
      daoCollection
          .tagUsageDAO()
          .rename(
              TagSource.USERESKCLASSIFICATION.ordinal(),
              original.getFullyQualifiedName(),
              updated.getFullyQualifiedName());
      if (userEskClassificationChanged) {
        updateUserEskClassificationRelationship(original, updated);
        recordChange(
            "Classification",
            original.getUserEskClassification(),
            updated.getUserEskClassification(),
            true,
            entityReferenceMatch);
        invalidateUserEsks(original.getId());
      }
      if (parentChanged) {
        updateParentRelationship(original, updated);
        recordChange("parent", original.getParent(), updated.getParent(), true, entityReferenceMatch);
        invalidateUserEsks(original.getId());
      }
    }

    private void updateUserEskClassificationRelationship(UserEsk orig, UserEsk updated) {
      deleteUserEskClassificationRelationship(orig);
      addUserEskClassificationRelationship(updated);
    }

    private void deleteUserEskClassificationRelationship(UserEsk term) {
      deleteRelationship(
          term.getUserEskClassification().getId(),
          Entity.USERESKCLASSIFICATION,
          term.getId(),
          USERESK,
          Relationship.CONTAINS);
    }

    private void updateParentRelationship(UserEsk orig, UserEsk updated) {
      deleteParentRelationship(orig);
      addParentRelationship(updated);
    }

    private void deleteParentRelationship(UserEsk term) {
      if (term.getParent() != null) {
        deleteRelationship(term.getParent().getId(), USERESK, term.getId(), USERESK, Relationship.CONTAINS);
      }
    }

    private void invalidateUserEsks(UUID userEskId) {
      // The name of the tag changed. Invalidate that tag and all the children from the cache
      List<EntityRelationshipRecord> userEskRecords = findToRecords(userEskId, USERESK, Relationship.CONTAINS, USERESK);
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(USERESK, userEskId));
      for (EntityRelationshipRecord userEskRecord : userEskRecords) {
        invalidateUserEsks(userEskRecord.getId());
      }
    }
  }
}
