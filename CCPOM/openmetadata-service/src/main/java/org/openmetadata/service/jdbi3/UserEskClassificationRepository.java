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

import static org.openmetadata.service.Entity.USERESK;
import static org.openmetadata.service.Entity.USERESKCLASSIFICATION;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.openmetadata.schema.entity.userEskClassification.UserEskClassification;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.Relationship;
import org.openmetadata.schema.type.TagLabel;
import org.openmetadata.schema.type.TagLabel.TagSource;
import org.openmetadata.service.Entity;
import org.openmetadata.service.exception.CatalogExceptionMessage;
import org.openmetadata.service.jdbi3.CollectionDAO.EntityRelationshipRecord;
import org.openmetadata.service.resources.userEsks.UserEskClassificationResource;
import org.openmetadata.service.util.EntityUtil.Fields;

@Slf4j
public class UserEskClassificationRepository extends EntityRepository<UserEskClassification> {
  public UserEskClassificationRepository() {
    super(
        UserEskClassificationResource.TAG_COLLECTION_PATH,
        Entity.USERESKCLASSIFICATION,
        UserEskClassification.class,
        Entity.getCollectionDAO().userEskClassificationDAO(),
        "",
        "");
    quoteFqn = true;
    supportsSearch = true;
  }

  @Override
  public EntityUpdater getUpdater(UserEskClassification original, UserEskClassification updated, Operation operation) {
    return new UserEskClassificationUpdater(original, updated, operation);
  }

  @Override
  public UserEskClassification setFields(UserEskClassification userEskClassification, Fields fields) {
    userEskClassification.withTermCount(fields.contains("termCount") ? getTermCount(userEskClassification) : null);
    return userEskClassification.withUsageCount(
        fields.contains("usageCount") ? getUsageCount(userEskClassification) : null);
  }

  @Override
  public UserEskClassification clearFields(UserEskClassification userEskClassification, Fields fields) {
    userEskClassification.withTermCount(fields.contains("termCount") ? userEskClassification.getTermCount() : null);
    return userEskClassification.withUsageCount(
        fields.contains("usageCount") ? userEskClassification.getUsageCount() : null);
  }

  @Override
  public void prepare(UserEskClassification entity, boolean update) {
    /* Nothing to do */
  }

  @Override
  public void storeEntity(UserEskClassification userEskClassification, boolean update) {
    store(userEskClassification, update);
  }

  @Override
  public void storeRelationships(UserEskClassification entity) {
    // No relationships to store beyond what is stored in the super class
  }

  private int getTermCount(UserEskClassification userEskClassification) {
    ListFilter filter =
        new ListFilter(Include.NON_DELETED).addQueryParam("parent", userEskClassification.getFullyQualifiedName());
    return daoCollection.userEskDAO().listCount(filter);
  }

  private Integer getUsageCount(UserEskClassification userEskClassification) {
    return daoCollection
        .tagUsageDAO()
        .getTagCount(TagSource.USERESKCLASSIFICATION.ordinal(), userEskClassification.getFullyQualifiedName());
  }

  public static class TagLabelMapper implements RowMapper<TagLabel> {
    @Override
    public TagLabel map(ResultSet r, org.jdbi.v3.core.statement.StatementContext ctx) throws SQLException {
      return new TagLabel()
          .withLabelType(TagLabel.LabelType.values()[r.getInt("labelType")])
          .withState(TagLabel.State.values()[r.getInt("state")])
          .withTagFQN(r.getString("tagFQN"));
    }
  }

  public class UserEskClassificationUpdater extends EntityUpdater {
    public UserEskClassificationUpdater(
        UserEskClassification original, UserEskClassification updated, Operation operation) {
      super(original, updated, operation);
    }

    @Transaction
    @Override
    public void entitySpecificUpdate() {
      // TODO handle name change
      // TODO mutuallyExclusive from false to true?
      recordChange("mutuallyExclusive", original.getMutuallyExclusive(), updated.getMutuallyExclusive());
      recordChange("disabled", original.getDisabled(), updated.getDisabled());
      updateName(original, updated);
    }

    public void updateName(UserEskClassification original, UserEskClassification updated) {
      if (!original.getName().equals(updated.getName())) {
        if (ProviderType.SYSTEM.equals(original.getProvider())) {
          throw new IllegalArgumentException(
              CatalogExceptionMessage.systemEntityRenameNotAllowed(original.getName(), entityType));
        }
        // Classification name changed - update tag names starting from classification and all the children tags
        LOG.info("UserEsk classification name changed from {} to {}", original.getName(), updated.getName());
        daoCollection.tagDAO().updateFqn(original.getName(), updated.getName());
        daoCollection
            .tagUsageDAO()
            .updateTagPrefix(TagSource.USERESKCLASSIFICATION.ordinal(), original.getName(), updated.getName());
        recordChange("name", original.getName(), updated.getName());
        invalidateUserEskClassification(original.getId());
      }
    }

    private void invalidateUserEskClassification(UUID userEskClassificationId) {
      // Name of the classification changed. Invalidate the classification and all the children tags
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(USERESKCLASSIFICATION, userEskClassificationId));
      List<EntityRelationshipRecord> userEskRecords =
          findToRecords(userEskClassificationId, USERESKCLASSIFICATION, Relationship.CONTAINS, USERESK);
      for (EntityRelationshipRecord userEskRecord : userEskRecords) {
        invalidateUserEsks(userEskRecord.getId());
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
