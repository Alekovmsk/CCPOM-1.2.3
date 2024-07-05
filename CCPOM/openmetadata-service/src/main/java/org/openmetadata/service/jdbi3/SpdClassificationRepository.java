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

import static org.openmetadata.service.Entity.SPD;
import static org.openmetadata.service.Entity.SPDCLASSIFICATION;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.openmetadata.schema.entity.spdClassification.SpdClassification;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.Relationship;
import org.openmetadata.schema.type.TagLabel;
import org.openmetadata.schema.type.TagLabel.TagSource;
import org.openmetadata.service.Entity;
import org.openmetadata.service.exception.CatalogExceptionMessage;
import org.openmetadata.service.jdbi3.CollectionDAO.EntityRelationshipRecord;
import org.openmetadata.service.resources.spds.SpdClassificationResource;
import org.openmetadata.service.util.EntityUtil.Fields;

@Slf4j
public class SpdClassificationRepository extends EntityRepository<SpdClassification> {
  public SpdClassificationRepository() {
    super(
        SpdClassificationResource.TAG_COLLECTION_PATH,
        Entity.SPDCLASSIFICATION,
        SpdClassification.class,
        Entity.getCollectionDAO().spdClassificationDAO(),
        "",
        "");
    quoteFqn = true;
    supportsSearch = true;
  }

  @Override
  public EntityUpdater getUpdater(SpdClassification original, SpdClassification updated, Operation operation) {
    return new SpdClassificationUpdater(original, updated, operation);
  }

  @Override
  public SpdClassification setFields(SpdClassification spdClassification, Fields fields) {
    spdClassification.withTermCount(fields.contains("termCount") ? getTermCount(spdClassification) : null);
    return spdClassification.withUsageCount(fields.contains("usageCount") ? getUsageCount(spdClassification) : null);
  }

  @Override
  public SpdClassification clearFields(SpdClassification spdClassification, Fields fields) {
    spdClassification.withTermCount(fields.contains("termCount") ? spdClassification.getTermCount() : null);
    return spdClassification.withUsageCount(fields.contains("usageCount") ? spdClassification.getUsageCount() : null);
  }

  @Override
  public void prepare(SpdClassification entity, boolean update) {
    /* Nothing to do */
  }

  @Override
  public void storeEntity(SpdClassification spdClassification, boolean update) {
    store(spdClassification, update);
  }

  @Override
  public void storeRelationships(SpdClassification entity) {
    // No relationships to store beyond what is stored in the super class
  }

  private int getTermCount(SpdClassification spdClassification) {
    ListFilter filter =
        new ListFilter(Include.NON_DELETED).addQueryParam("parent", spdClassification.getFullyQualifiedName());
    return daoCollection.spdDAO().listCount(filter);
  }

  private Integer getUsageCount(SpdClassification spdClassification) {
    return daoCollection
        .tagUsageDAO()
        .getTagCount(TagSource.SPDCLASSIFICATION.ordinal(), spdClassification.getFullyQualifiedName());
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

  public class SpdClassificationUpdater extends EntityUpdater {
    public SpdClassificationUpdater(SpdClassification original, SpdClassification updated, Operation operation) {
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

    public void updateName(SpdClassification original, SpdClassification updated) {
      if (!original.getName().equals(updated.getName())) {
        if (ProviderType.SYSTEM.equals(original.getProvider())) {
          throw new IllegalArgumentException(
              CatalogExceptionMessage.systemEntityRenameNotAllowed(original.getName(), entityType));
        }
        // Classification name changed - update tag names starting from classification and all the children tags
        LOG.info("Spd classification name changed from {} to {}", original.getName(), updated.getName());
        daoCollection.tagDAO().updateFqn(original.getName(), updated.getName());
        daoCollection
            .tagUsageDAO()
            .updateTagPrefix(TagSource.SPDCLASSIFICATION.ordinal(), original.getName(), updated.getName());
        recordChange("name", original.getName(), updated.getName());
        invalidateSpdClassification(original.getId());
      }
    }

    private void invalidateSpdClassification(UUID spdClassificationId) {
      // Name of the classification changed. Invalidate the classification and all the children tags
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(SPDCLASSIFICATION, spdClassificationId));
      List<EntityRelationshipRecord> spdRecords =
          findToRecords(spdClassificationId, SPDCLASSIFICATION, Relationship.CONTAINS, SPD);
      for (EntityRelationshipRecord spdRecord : spdRecords) {
        invalidateSpds(spdRecord.getId());
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
