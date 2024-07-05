/*
 *  Copyright 2023 Collate.
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
import { Button, Col, Row, Space, Typography } from 'antd';
import React, { useMemo, useState } from 'react';
import { usePermissionProvider } from '../../../PermissionProvider/PermissionProvider';
import { ResourceEntity } from '../../../PermissionProvider/PermissionProvider.interface';
import {
  Domain,
  DomainType,
} from '../../../../generated/entity/domains/domain';
import { Operation } from '../../../../generated/entity/policies/policy';
import { checkPermission } from '../../../../utils/PermissionsUtils';
import '../../domain.less';
import {
  DomainArrayValuesListTabProps,
} from './DomainArrayValuesListTab.interface';
import DomainQuotasList from './DomainQuotasList';
import DataSourcesList from './DataSourcesList';
import DomainTeam from './DomainTeam';

const DomainArrayValuesListTab = ({
  domain,
  onUpdate,
  isVersionsView = false,
  type = 'data_sources_list',
}: DomainArrayValuesListTabProps) => {
  const { permissions } = usePermissionProvider();
  const resourceType = ResourceEntity.DOMAIN;
  
  const { editDescriptionPermission, editOwnerPermission, editAllPermission } =
    useMemo(() => {
      if (isVersionsView) {
        return {
          editDescriptionPermission: false,
          editOwnerPermission: false,
          editAllPermission: false,
        };
      }

      const editDescription = checkPermission(
        Operation.EditDescription,
        resourceType,
        permissions
      );

      const editOwner = checkPermission(
        Operation.EditOwner,
        resourceType,
        permissions
      );

      const editAll = checkPermission(
        Operation.EditAll,
        resourceType,
        permissions
      );

      return {
        editDescriptionPermission: editDescription || editAll,
        editOwnerPermission: editOwner || editAll,
        editAllPermission: editAll,
      };
    }, [permissions, isVersionsView, resourceType]);

  return (
    <Row>
      <Col className="border-right p-md domain-content-container" span={24}>
      {(type === 'data_sources_list') &&
        (<DataSourcesList 
        domain={domain as Domain}
        isVersionView={isVersionsView}
        hasPermission={editDescriptionPermission || editAllPermission}
        onDomainUpdate={onUpdate}
        />)}
      {(type === 'domain_quotas_list') &&
        (<DomainQuotasList 
        domain={domain as Domain}
        isVersionView={isVersionsView}
        hasPermission={editDescriptionPermission || editAllPermission}
        onDomainUpdate={onUpdate}
        />)}
      {(type === 'domain_team') &&
        (<DomainTeam 
        domain={domain as Domain}
        isVersionView={isVersionsView}
        hasPermission={editDescriptionPermission || editAllPermission}
        onDomainUpdate={onUpdate}
        />)}
      </Col>
    </Row>
  );
};

export default DomainArrayValuesListTab;
