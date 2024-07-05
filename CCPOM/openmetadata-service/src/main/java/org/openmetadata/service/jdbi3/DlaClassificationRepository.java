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

import static org.openmetadata.service.Entity.DLA;
import static org.openmetadata.service.Entity.DLACLASSIFICATION;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.openmetadata.schema.entity.dlaClassification.DlaClassification;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.Relationship;
import org.openmetadata.schema.type.TagLabel;
import org.openmetadata.schema.type.TagLabel.TagSource;
import org.openmetadata.service.Entity;
import org.openmetadata.service.exception.CatalogExceptionMessage;
import org.openmetadata.service.jdbi3.CollectionDAO.EntityRelationshipRecord;
import org.openmetadata.service.resources.dlas.DlaClassificationResource;
import org.openmetadata.service.util.EntityUtil.Fields;

@Slf4j
public class DlaClassificationRepository extends EntityRepository<DlaClassification> {
  public DlaClassificationRepository() {
    super(
        DlaClassificationResource.TAG_COLLECTION_PATH,
        Entity.DLACLASSIFICATION,
        DlaClassification.class,
        Entity.getCollectionDAO().dlaClassificationDAO(),
        "",
        "");
    quoteFqn = true;
    supportsSearch = true;
  }

  @Override
  public EntityUpdater getUpdater(DlaClassification original, DlaClassification updated, Operation operation) {
    return new DlaClassificationUpdater(original, updated, operation);
  }

  @Override
  public DlaClassification setFields(DlaClassification dlaClassification, Fields fields) {
    dlaClassification.withTermCount(fields.contains("termCount") ? getTermCount(dlaClassification) : null);
    return dlaClassification.withUsageCount(fields.contains("usageCount") ? getUsageCount(dlaClassification) : null);
  }

  @Override
  public DlaClassification clearFields(DlaClassification dlaClassification, Fields fields) {
    dlaClassification.withTermCount(fields.contains("termCount") ? dlaClassification.getTermCount() : null);
    return dlaClassification.withUsageCount(fields.contains("usageCount") ? dlaClassification.getUsageCount() : null);
  }

  @Override
  public void prepare(DlaClassification entity, boolean update) {
    /* Nothing to do */
  }

  @Override
  public void storeEntity(DlaClassification dlaClassification, boolean update) {
    store(dlaClassification, update);
  }

  @Override
  public void storeRelationships(DlaClassification entity) {
    // No relationships to store beyond what is stored in the super class
  }

  private int getTermCount(DlaClassification dlaClassification) {
    ListFilter filter =
        new ListFilter(Include.NON_DELETED).addQueryParam("parent", dlaClassification.getFullyQualifiedName());
    return daoCollection.dlaDAO().listCount(filter);
  }

  private Integer getUsageCount(DlaClassification dlaClassification) {
    return daoCollection
        .tagUsageDAO()
        .getTagCount(TagSource.DLACLASSIFICATION.ordinal(), dlaClassification.getFullyQualifiedName());
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

  public class DlaClassificationUpdater extends EntityUpdater {
    public DlaClassificationUpdater(DlaClassification original, DlaClassification updated, Operation operation) {
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

    public void updateName(DlaClassification original, DlaClassification updated) {
      if (!original.getName().equals(updated.getName())) {
        if (ProviderType.SYSTEM.equals(original.getProvider())) {
          throw new IllegalArgumentException(
              CatalogExceptionMessage.systemEntityRenameNotAllowed(original.getName(), entityType));
        }
        // Classification name changed - update tag names starting from classification and all the children tags
        LOG.info("Dla classification name changed from {} to {}", original.getName(), updated.getName());
        daoCollection.tagDAO().updateFqn(original.getName(), updated.getName());
        daoCollection
            .tagUsageDAO()
            .updateTagPrefix(TagSource.DLACLASSIFICATION.ordinal(), original.getName(), updated.getName());
        recordChange("name", original.getName(), updated.getName());
        invalidateDlaClassification(original.getId());
      }
    }

    private void invalidateDlaClassification(UUID dlaClassificationId) {
      // Name of the classification changed. Invalidate the classification and all the children tags
      CACHE_WITH_ID.invalidate(new ImmutablePair<>(DLACLASSIFICATION, dlaClassificationId));
      List<EntityRelationshipRecord> dlaRecords =
          findToRecords(dlaClassificationId, DLACLASSIFICATION, Relationship.CONTAINS, DLA);
      for (EntityRelationshipRecord dlaRecord : dlaRecords) {
        invalidateDlas(dlaRecord.getId());
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
