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
import static org.openmetadata.service.util.EntityUtil.entityListMatch;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.openmetadata.schema.api.domains.EntityEl;
import org.openmetadata.schema.entity.domains.Perimeter;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.Relationship;
import org.openmetadata.service.Entity;
import org.openmetadata.service.resources.domains.PerimeterResource;
import org.openmetadata.service.util.EntityUtil.Fields;

@Slf4j
public class PerimeterRepository extends EntityRepository<Perimeter> {
  private static final String UPDATE_FIELDS = "experts,entityList"; // Domain field can't be updated

  public PerimeterRepository() {
    super(
        PerimeterResource.COLLECTION_PATH,
        Entity.PERIMETER,
        Perimeter.class,
        Entity.getCollectionDAO().perimeterDAO(),
        UPDATE_FIELDS,
        UPDATE_FIELDS);
    supportsSearch = true;
  }

  @Override
  public Perimeter setFields(Perimeter entity, Fields fields) {
    return entity;
  }

  @Override
  public Perimeter clearFields(Perimeter entity, Fields fields) {
    return entity;
  }

  @Override
  public void prepare(Perimeter entity, boolean update) {
    // Parent, Experts, Owner, Assets are already validated
  }

  @Override
  public void storeEntity(Perimeter entity, boolean update) {
    store(entity, update);
  }

  @Override
  public void storeRelationships(Perimeter entity) {
    addRelationship(entity.getDomain().getId(), entity.getId(), Entity.DOMAIN, Entity.PERIMETER, Relationship.CONTAINS);
    for (EntityReference expert : listOrEmpty(entity.getExperts())) {
      addRelationship(entity.getId(), expert.getId(), Entity.PERIMETER, Entity.USER, Relationship.EXPERT);
    }
  }

  @Override
  public EntityUpdater getUpdater(Perimeter original, Perimeter updated, Operation operation) {
    return new PerimeterUpdater(original, updated, operation);
  }

  @Override
  public void restorePatchAttributes(Perimeter original, Perimeter updated) {
    updated.withDomain(original.getDomain()); // Domain can't be changed
  }

  @Override
  protected void postUpdate(Perimeter original, Perimeter updated) {
    super.postUpdate(original, updated);
  }

  public class PerimeterUpdater extends EntityUpdater {
    public PerimeterUpdater(Perimeter original, Perimeter updated, Operation operation) {
      super(original, updated, operation);
    }

    @Transaction
    @Override
    public void entitySpecificUpdate() {
      updateEntityList(original, updated);
    }

    private void updateEntityList(Perimeter origPer, Perimeter updatedPer) {
      List<EntityEl> origEntityList = listOrEmpty(origPer.getEntityList());
      List<EntityEl> updatedEntityList = listOrEmpty(updatedPer.getEntityList());

      List<EntityEl> added = new ArrayList<>();
      List<EntityEl> deleted = new ArrayList<>();
      recordListChange("entityList", origEntityList, updatedEntityList, added, deleted, entityListMatch);
    }
  }
}
