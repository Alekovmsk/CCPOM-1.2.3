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
import { ReactComponent as ClientCenterIcon } from '../../../assets/svg/clientCenter.svg';
import { ReactComponent as PlusIcon } from '../../../assets/svg/plus-primary.svg';
import LeftPanelCard from '../../../components/common/LeftPanelCard/LeftPanelCard';
import { usePermissionProvider } from '../../../components/PermissionProvider/PermissionProvider';
import { ResourceEntity } from '../../../components/PermissionProvider/PermissionProvider.interface';
import ClientCenterV1Skeleton from '../../../components/Skeleton/ClientCenterV1/ClientCenterV1LeftPanelSkeleton.component';
import { ROUTES } from '../../../constants/constants';
import { Operation } from '../../../generated/entity/policies/policy';
import { getEntityName } from '../../../utils/EntityUtils';
import Fqn from '../../../utils/Fqn';
import { checkPermission } from '../../../utils/PermissionsUtils';
import { getClientCenterPath } from '../../../utils/RouterUtils';
import { ClientCenterLeftPanelProps } from './ClientCenterLeftPanel.interface';
import { DefaultOptionType } from 'antd/lib/select';

const ClientCenterLeftPanel = ({ clientCenters }: ClientCenterLeftPanelProps) => {
  const { t } = useTranslation();
  const { permissions } = usePermissionProvider();
  const { fqn: clientCenterName } = useParams<{ fqn: string }>();
  const clientCenterFqn = clientCenterName ? decodeURIComponent(clientCenterName) : null;
  const history = useHistory();

  const createClientCenterPermission = useMemo(
    () =>
      checkPermission(Operation.Create, ResourceEntity.CLIENT_CENTER, permissions),
    [permissions]
  );
  const selectedKey = useMemo(() => {
    if (clientCenterFqn) {
      return Fqn.split(clientCenterFqn)[0];
    }

    return clientCenters[0].fullyQualifiedName;
  }, [clientCenterFqn]);

  const menuItems: ItemType[] = useMemo(() => {
    return clientCenters.reduce((acc, clientCenter) => {
      return [
        ...acc,
        {
          key: clientCenter.fullyQualifiedName ?? '',
          label: getEntityName(clientCenter),
          icon: <ClientCenterIcon height={16} width={16} />,
        },
      ];
    }, [] as ItemType[]);
  }, [clientCenters]);

  const clientCenterOptions: DefaultOptionType[] = useMemo(() => {
    return clientCenters.reduce((acc, clientCenter) => {
      return [
        ...acc,
        {
          value: clientCenter.fullyQualifiedName ?? '',
          label: getEntityName(clientCenter)
        },
      ];
    }, [] as DefaultOptionType[]);
  }, [clientCenters]);

  const handleAddClientCenterClick = () => {
    history.push(ROUTES.ADD_CLIENT_CENTER);
  };
  const handleMenuClick: MenuProps['onClick'] = (event) => {
    history.push(getClientCenterPath(event.key));
  };

  const handleChangeSelect = (value: string) => {
    console.log(value); // { value: "lucy", key: "lucy", label: "Lucy (101)" }
    history.push(getClientCenterPath(value));
  };

  return (
    <LeftPanelCard id="clientCenter">
      <ClientCenterV1Skeleton loading={clientCenters.length === 0}>
        <Row className="p-y-xs" gutter={[0, 16]}>
          <Col className="p-x-sm" span={24}>
            <Typography.Text strong className="m-b-0">
              {t('label.client-center')}
            </Typography.Text>
          </Col>

          {createClientCenterPermission && (
            <Col className="p-x-sm" span={24}>
              <Button
                block
                className="text-primary"
                data-testid="add-clientCenter"
                onClick={handleAddClientCenterClick}>
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
                data-testid="clientCenter-left-panel"
                items={menuItems}
                mode="inline"
                selectedKeys={[selectedKey]}
                onClick={handleMenuClick}
              /> */}
              <Select 
                showSearch
                options={clientCenterOptions} 
                style={{ width: '100%', padding: 5 }} 
                onChange={handleChangeSelect} 
                defaultValue={selectedKey}
              />
              </>
            ) : (
              <p className="text-grey-muted text-center">
                <span>{t('label.no-client-center-found')}</span>
              </p>
            )}
          </Col>
        </Row>
      </ClientCenterV1Skeleton>
    </LeftPanelCard>
  );
};

export default ClientCenterLeftPanel;
