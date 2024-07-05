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

import static org.openmetadata.service.Entity.AUTOSYSTEM;
import static org.openmetadata.service.Entity.AUTOSYSTEMCLASSIFICATION;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.openmetadata.schema.entity.autoSystemClassification.AutoSystemClassification;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.Relationship;
import org.openmetadata.schema.type.TagLabel;
import org.openmetadata.schema.type.TagLabel.TagSource;
import org.openmetadata.service.Entity;
import org.openmetadata.service.exception.CatalogExceptionMessage;
import org.openmetadata.service.jdbi3.CollectionDAO.EntityRelationshipRecord;
import org.openmetadata.service.resources.autoSystems.AutoSystemClassificationResource;
import org.openmetadata.service.util.EntityUtil.Fields;

@Slf4j
public class AutoSystemClassificationRepository extends EntityRepository<AutoSystemClassification> {
  public AutoSystemClassificationRepository() {
    super(
        AutoSystemClassificationResource.TAG_COLLECTION_PATH,
        Entity.AUTOSYSTEMCLASSIFICATION,
        AutoSystemClassification.class,
        Entity.getCollectionDAO().autoSystemClassificationDAO(),
        "",
        "");
    quoteFqn = true;
    supportsSearch = true;
  }

  @Override
  public EntityUpdater getUpdater(
      AutoSystemClassification original, AutoSystemClassification updated, Operation operation) {
    return new AutoSystemClassificationUpdater(original, updated, operation);
  }

  @Override
  public AutoSystemClassification setFields(AutoSystemClassification autoSystemClassification, Fields fields) {
    autoSystemClassification.withTermCount(
        fields.contains("termCount") ? getTermCount(autoSystemClassification) : null);
    return autoSystemClassification.withUsageCount(
        fields.contains("usageCount") ? getUsageCount(autoSystemClassification) : null);
  }

  @Override
  public AutoSystemClassification clearFields(AutoSystemClassification autoSystemClassification, Fields fields) {
    autoSystemClassification.withTermCount(
        fields.contains("termCount") ? autoSystemClassification.getTermCount() : null);
    return autoSystemClassification.withUsageCount(
        fields.contains("usageCount") ? autoSystemClassification.getUsageCount() : null);
  }

  @Override
  public void prepare(AutoSystemClassification entity, boolean update) {
    /* Nothing to do */
  }

  @Override
  public void storeEntity(AutoSystemClassification autoSystemClassification, boolean update) {
    store(autoSystemClassification, update);
  }

  @Override
  public void storeRelationships(AutoSystemClassification entity) {
    // No relationships to store beyond what is stored in the super class
  }

  private int getTermCount(AutoSystemClassification autoSystemClassification) {
    ListFilter filter =
        new ListFilter(Include.NON_DELETED).addQueryParam("parent", autoSystemClassification.getFullyQualifiedName());
    return daoCollection.autoSystemDAO().listCount(filter);
  }

  private Integer getUsageCount(AutoSystemClassification autoSystemClassification) {
    return daoCollection
        .tagUsageDAO()
        .getTagCount(TagSource.AUTOSYSTEMCLASSIFICATION.ordinal(), autoSystemClassification.getFullyQualifiedName());
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

  public class AutoSystemClassificationUpdater extends EntityUpdater {
    public AutoSystemClassificationUpdater(
        AutoSystemClassification original, AutoSystemClassification updated, Operation operation) {
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

    public void updateName(AutoSystemClassification original, AutoSystemClassification updated) {
      if (!original.getName().equals(updated.getName())) {
        if (ProviderType.SYSTEM.equals(original.getProvider())) {
          throw new IllegalArgumentException(
              CatalogExceptionMessage.systemEntityRenameNotAllowed(original.getName(), entityType));
        }
        // Classification name changed - update tag names starting from classification and all the children tags
        LOG.info("AutoSystem classification name changed from {} to {}", original.getName(), updated.getName());
        daoCollection.tagDAO().updateFqn(original.getName(), updated.getName());
        daoCollection
            .tagUsageDAO()
            .updateTagPrefix(TagSource.AUTOSYSTEMCLASSIFICATION.ordinal(), original.getName(), updated.getName());
        recordChange("name", original.getName(), updated.getName());
        invalidateAutoSystemClassification(original.getId());
      }
    }

    private void invalidateAutoSystemClassification(UUID autoSystemClassificationId) {
      // Name of the classification changed. Invalidate the classification and all the children tags
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(AUTOSYSTEMCLASSIFICATION, autoSystemClassificationId));
      List<EntityRelationshipRecord> autoSystemRecords =
          findToRecords(autoSystemClassificationId, AUTOSYSTEMCLASSIFICATION, Relationship.CONTAINS, AUTOSYSTEM);
      for (EntityRelationshipRecord autoSystemRecord : autoSystemRecords) {
        invalidateAutoSystems(autoSystemRecord.getId());
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
