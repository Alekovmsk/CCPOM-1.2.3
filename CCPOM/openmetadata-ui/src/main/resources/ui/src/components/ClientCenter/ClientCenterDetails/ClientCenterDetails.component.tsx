/*
 *  Copyright 2022 Collate.
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

import { Col, Row, Space, Tabs } from 'antd';
import { noop } from 'lodash';
import React, { RefObject, useEffect, useMemo, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { useHistory, useParams } from 'react-router-dom';
import { getClientCenterClientDetailsPath } from '../../../constants/constants';
import { EntityField } from '../../../constants/Feeds.constants';
import { EntityType } from '../../../enums/entity.enum';
import { ClientCenter } from '../../../generated/entity/data/clientCenter';
import { ChangeDescription } from '../../../generated/entity/type';
import { getFeedCounts } from '../../../utils/CommonUtils';
import { getEntityName } from '../../../utils/EntityUtils';
import { getEntityVersionByField } from '../../../utils/EntityVersionUtils';
import { ActivityFeedTab } from '../../ActivityFeed/ActivityFeedTab/ActivityFeedTab.component';
import DescriptionV1 from '../../common/EntityDescription/DescriptionV1';
import TabsLabel from '../../TabsLabel/TabsLabel.component';
import ClientCenterDetailsRightPanel from '../ClientCenterDetailsRightPanel/ClientCenterDetailsRightPanel.component';
import ClientCenterHeader from '../ClientCenterHeader/ClientCenterHeader.component';
import ClientCenterClientTab from '../ClientCenterClientTab/ClientCenterClientTab.component';
import './client-center-details.less';
import {
  ClientCenterDetailsProps,
  ClientCenterTabs,
} from './ClientCenterDetails.interface';
import { useElementInView } from '../../../hooks/useElementInView';
import { observerOptions } from '../../../constants/Mydata.constants';
import DescriptionEditorJsV1 from '../../common/EntityDescriptionEditorJs/DescriptionEditorJsV1';

const ClientCenterDetails = ({
  permissions,
  clientCenter,
  updateClientCenter,
  updateVote,
  handleClientCenterDelete,
  clientCenterClients,
  clientsLoading,
  refreshClientCenterClients,
  onAddClientCenterClient,
  onEditClientCenterClient,
  isVersionView,
  onThreadLinkSelect,
  moreload,
  headerVisible
}: ClientCenterDetailsProps) => {
  const { t } = useTranslation();
  const history = useHistory();
  const { tab: activeTab } = useParams<{ tab: string }>();
  const [feedCount, setFeedCount] = useState<number>(0);
  const [isDescriptionEditable, setIsDescriptionEditable] =
    useState<boolean>(false);
  const [elementRef, isInView] = useElementInView(observerOptions);

  useEffect(() => {
    moreload();
  }, [isInView]);


  const handleClientCenterUpdate = async (updatedClientCenter: ClientCenter) => {
    await updateClientCenter(updatedClientCenter);
    getEntityFeedCount();
  };

  const onDescriptionUpdate = async (updatedHTML: string) => {
    if (clientCenter.description !== updatedHTML) {
      const updatedClientCenterDetails = {
        ...clientCenter,
        description: updatedHTML,
      };
      handleClientCenterUpdate(updatedClientCenterDetails);
      setIsDescriptionEditable(false);
    } else {
      setIsDescriptionEditable(false);
    }
  };

  const description = useMemo(
    () =>clientCenter.description,

    [clientCenter, isVersionView]
  );

  const name = useMemo(
    () =>
      isVersionView
        ? getEntityVersionByField(
          clientCenter.changeDescription as ChangeDescription,
          EntityField.NAME,
          clientCenter.name
        )
        : clientCenter.name,

    [clientCenter, isVersionView]
  );

  const displayName = useMemo(
    () =>
      isVersionView
        ? getEntityVersionByField(
          clientCenter.changeDescription as ChangeDescription,
          EntityField.DISPLAYNAME,
          clientCenter.displayName
        )
        : clientCenter.displayName,

    [clientCenter, isVersionView]
  );

  const getEntityFeedCount = () => {
    getFeedCounts(
      EntityType.CLIENT_CENTER,
      clientCenter.fullyQualifiedName ?? '',
      setFeedCount
    );
  };

  const handleTabChange = (activeKey: string) => {
    if (activeKey !== activeTab) {
      history.push(
        getClientCenterClientDetailsPath(clientCenter.fullyQualifiedName ?? '', activeKey)
      );
    }
  };

  const detailsContent = useMemo(() => {
    return (
      <Row className="h-full p-x-md" gutter={[32, 16]}>
        <Col
          className="border-right p-y-md client-center-content-container"
          span={24}>
          <Space className="w-full" direction="vertical" size={24}>
            {/* <DescriptionV1
              description={description}
              entityFqn={clientCenter.fullyQualifiedName}
              entityName={getEntityName(clientCenter)}
              entityType={EntityType.CLIENT_CENTER}
              hasEditAccess={permissions.EditDescription || permissions.EditAll}
              isEdit={isDescriptionEditable}
              owner={clientCenter?.owner}
              showActions={!clientCenter.deleted}
              onCancel={() => setIsDescriptionEditable(false)}
              onDescriptionEdit={() => setIsDescriptionEditable(true)}
              onDescriptionUpdate={onDescriptionUpdate}
              onThreadLinkSelect={onThreadLinkSelect}
            /> */}

            <ClientCenterClientTab
              isClientCenter
              childClientCenterClients={clientCenterClients}
              permissions={permissions}
              refreshClientCenterClients={refreshClientCenterClients}
              selectedData={clientCenter}
              clientsLoading={clientsLoading}
              onAddClientCenterClient={onAddClientCenterClient}
              onEditClientCenterClient={onEditClientCenterClient}
            />
            <div
              data-testid="observer-element"
              id="observer-element"
              ref={elementRef as RefObject<HTMLDivElement>}
            />
            {/* Add spacer to work infinite scroll smoothly */}
            <div className="tw-p-4" />
          </Space>
        </Col>
        {/* <Col
          className="border-right p-y-md client-center-content-container"
          span={8}>описание</Col> */}
        {/* <Col className="p-y-md" span={6}>
          <ClientCenterDetailsRightPanel
            isClientCenter
            isVersionView={isVersionView}
            permissions={permissions}
            selectedData={clientCenter}
            onThreadLinkSelect={onThreadLinkSelect}
            onUpdate={(data) => handleClientCenterUpdate(data as ClientCenter)}
          />
        </Col> */}
      </Row>
    );
  }, [
    isVersionView,
    permissions,
    clientCenter,
    clientCenterClients,
    clientsLoading,
    description,
    isDescriptionEditable,
  ]);

  const tabs = useMemo(() => {
    return [
      {
        label: (
          <TabsLabel
            id={ClientCenterTabs.CLIENTS}
            isActive={activeTab === ClientCenterTabs.CLIENTS}
            name={t('label.client-plural')}
          />
        ),
        key: ClientCenterTabs.CLIENTS,
        children: detailsContent,
      },
      ...(!isVersionView
        ? [
          {
            label: (
              <TabsLabel
                count={feedCount}
                id={ClientCenterTabs.ACTIVITY_FEED}
                isActive={activeTab === ClientCenterTabs.ACTIVITY_FEED}
                name={t('label.activity-feed-and-task-plural')}
              />
            ),
            key: ClientCenterTabs.ACTIVITY_FEED,
            children: (
              <ActivityFeedTab
                entityType={EntityType.CLIENT_CENTER}
                fqn={clientCenter.fullyQualifiedName ?? ''}
                onFeedUpdate={getEntityFeedCount}
                onUpdateEntityDetails={noop}
              />
            ),
          },
        ]
        : []),
    ];
  }, [
    detailsContent,
    clientCenter.fullyQualifiedName,
    feedCount,
    activeTab,
    isVersionView,
  ]);

  useEffect(() => {
    getEntityFeedCount();
  }, [clientCenter.fullyQualifiedName]);

  return (
    <>
      <Row
        className="client-center-details"
        data-testid="client-center-details"
        gutter={[0, 16]}>
        {headerVisible ?
          (<>
            <Col className="p-x-md" span={24}>
              <ClientCenterHeader
                isClientCenter
                isVersionView={isVersionView}
                permissions={permissions}
                selectedData={{ ...clientCenter, displayName, name }}
                updateVote={updateVote}
                onAddClientCenterClient={onAddClientCenterClient}
                onDelete={handleClientCenterDelete}
                onUpdate={(data) => handleClientCenterUpdate(data as ClientCenter)}
              />
            </Col>
            <Col className="p-x-md" span={24}>
              <DescriptionV1
                description={description}
                entityFqn={clientCenter.fullyQualifiedName}
                entityName={getEntityName(clientCenter)}
                entityType={EntityType.CLIENT_CENTER}
                hasEditAccess={permissions.EditDescription || permissions.EditAll}
                isEdit={isDescriptionEditable}
                owner={clientCenter?.owner}
                showActions={!clientCenter.deleted}
                onCancel={() => setIsDescriptionEditable(false)}
                onDescriptionEdit={() => setIsDescriptionEditable(true)}
                onDescriptionUpdate={onDescriptionUpdate}
                onThreadLinkSelect={onThreadLinkSelect}
              />
            </Col>
          </>)
        :
        (<Col span={24}>
          {/* <Tabs
            destroyInactiveTabPane
            activeKey={activeTab ?? ClientCenterTabs.CLIENTS}
            className="client-center-details-page-tabs"
            data-testid="tabs"
            items={tabs}
            onChange={handleTabChange}
          /> */}
          {/* <Row className="h-full p-x-md" gutter={[32, 16]}> */}
          {/* <Col
          className="border-right p-y-md client-center-content-container"
          span={24}> */}
          <Space className="w-full" direction="vertical" size={24}>
            <ClientCenterClientTab
              isClientCenter
              childClientCenterClients={clientCenterClients}
              permissions={permissions}
              refreshClientCenterClients={refreshClientCenterClients}
              selectedData={clientCenter}
              clientsLoading={clientsLoading}
              onAddClientCenterClient={onAddClientCenterClient}
              onEditClientCenterClient={onEditClientCenterClient}
            />
            <div
              data-testid="observer-element"
              id="observer-element"
              ref={elementRef as RefObject<HTMLDivElement>}
            />
            <div className="tw-p-4" />
          </Space>
          {/* </Col> */}
          {/* <Col
          className="border-right p-y-md client-center-content-container"
          span={8}>описание</Col> */}
          {/* <Col className="p-y-md" span={6}>
          <ClientCenterDetailsRightPanel
            isClientCenter
            isVersionView={isVersionView}
            permissions={permissions}
            selectedData={clientCenter}
            onThreadLinkSelect={onThreadLinkSelect}
            onUpdate={(data) => handleClientCenterUpdate(data as ClientCenter)}
          />
        </Col> */}
          {/* </Row> */}
        </Col>)}
      </Row>
    </>
  );
};

export default ClientCenterDetails;
