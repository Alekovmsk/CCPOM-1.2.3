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

import { Button, Col, Menu, MenuProps, Row, Select, Typography } from 'antd';
import { ItemType } from 'antd/lib/menu/hooks/useItems';
import React, { useMemo } from 'react';
import { useTranslation } from 'react-i18next';
import { useHistory, useParams } from 'react-router-dom';
import { ReactComponent as KnowledgeCenterIcon } from '../../../assets/svg/knowledgeCenter.svg';
import { ReactComponent as PlusIcon } from '../../../assets/svg/plus-primary.svg';
import LeftPanelCard from '../../../components/common/LeftPanelCard/LeftPanelCard';
import { usePermissionProvider } from '../../../components/PermissionProvider/PermissionProvider';
import { ResourceEntity } from '../../../components/PermissionProvider/PermissionProvider.interface';
import KnowledgeCenterV1Skeleton from '../../../components/Skeleton/KnowledgeCenterV1/KnowledgeCenterV1LeftPanelSkeleton.component';
import { ROUTES } from '../../../constants/constants';
import { Operation } from '../../../generated/entity/policies/policy';
import { getEntityName } from '../../../utils/EntityUtils';
import Fqn from '../../../utils/Fqn';
import { checkPermission } from '../../../utils/PermissionsUtils';
import { getKnowledgeCenterPath } from '../../../utils/RouterUtils';
import { KnowledgeCenterLeftPanelProps } from './KnowledgeCenterLeftPanel.interface';
import { DefaultOptionType } from 'antd/lib/select';

const KnowledgeCenterLeftPanel = ({ knowledgeCenters }: KnowledgeCenterLeftPanelProps) => {
  const { t } = useTranslation();
  const { permissions } = usePermissionProvider();
  const { fqn: knowledgeCenterName } = useParams<{ fqn: string }>();
  const knowledgeCenterFqn = knowledgeCenterName ? decodeURIComponent(knowledgeCenterName) : null;
  const history = useHistory();

  const createKnowledgeCenterPermission = useMemo(
    () =>
      checkPermission(Operation.Create, ResourceEntity.KNOWLEDGE_CENTER, permissions),
    [permissions]
  );
  const selectedKey = useMemo(() => {
    if (knowledgeCenterFqn) {
      return Fqn.split(knowledgeCenterFqn)[0];
    }

    return knowledgeCenters[0].fullyQualifiedName;
  }, [knowledgeCenterFqn]);

  const menuItems: ItemType[] = useMemo(() => {
    return knowledgeCenters.reduce((acc, knowledgeCenter) => {
      return [
        ...acc,
        {
          key: knowledgeCenter.fullyQualifiedName ?? '',
          label: getEntityName(knowledgeCenter),
          icon: <KnowledgeCenterIcon height={16} width={16} />,
        },
      ];
    }, [] as ItemType[]);
  }, [knowledgeCenters]);

  const knowledgeCenterOptions: DefaultOptionType[] = useMemo(() => {
    return knowledgeCenters.reduce((acc, knowledgeCenter) => {
      return [
        ...acc,
        {
          value: knowledgeCenter.fullyQualifiedName ?? '',
          label: getEntityName(knowledgeCenter)
        },
      ];
    }, [] as DefaultOptionType[]);
  }, [knowledgeCenters]);

  const handleAddKnowledgeCenterClick = () => {
    history.push(ROUTES.ADD_KNOWLEDGE_CENTER);
  };
  const handleMenuClick: MenuProps['onClick'] = (event) => {
    history.push(getKnowledgeCenterPath(event.key));
  };

  const handleChangeSelect = (value: string) => {
    console.log(value); // { value: "lucy", key: "lucy", label: "Lucy (101)" }
    history.push(getKnowledgeCenterPath(value));
  };

  return (
    <LeftPanelCard id="knowledgeCenter">
      <KnowledgeCenterV1Skeleton loading={knowledgeCenters.length === 0}>
        <Row className="p-y-xs" gutter={[0, 16]}>
          <Col className="p-x-sm" span={24}>
            <Typography.Text strong className="m-b-0">
              {t('label.knowledge-center')}
            </Typography.Text>
          </Col>

          {createKnowledgeCenterPermission && (
            <Col className="p-x-sm" span={24}>
              <Button
                block
                className="text-primary"
                data-testid="add-knowledgeCenter"
                onClick={handleAddKnowledgeCenterClick}>
                <div className="flex-center">
                  <PlusIcon className="anticon m-r-xss" />
                  {t('label.add')}
                </div>
              </Button>
            </Col>
          )}

          <Col span={24}>
            {menuItems.length ? (
              <>
              {/* <Menu
                className="custom-menu"
                data-testid="knowledgeCenter-left-panel"
                items={menuItems}
                mode="inline"
                selectedKeys={[selectedKey]}
                onClick={handleMenuClick}
              /> */}
              <Select 
                showSearch
                options={knowledgeCenterOptions} 
                style={{ width: '100%', padding: 5 }} 
                onChange={handleChangeSelect} 
                defaultValue={selectedKey}
              />
              </>
            ) : (
              <p className="text-grey-muted text-center">
                <span>{t('label.no-knowledge-center-found')}</span>
              </p>
            )}
          </Col>
        </Row>
      </KnowledgeCenterV1Skeleton>
    </LeftPanelCard>
  );
};

export default KnowledgeCenterLeftPanel;
