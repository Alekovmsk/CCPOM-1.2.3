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

import { Col, Row, Tabs } from 'antd';
import { t } from 'i18next';
import React, {
  useCallback,
  useEffect,
  useMemo,
  useRef,
  useState,
} from 'react';
import { useHistory, useParams } from 'react-router-dom';
import { getClientCenterClientDetailsPath } from '../../../constants/constants';
import { EntityField } from '../../../constants/Feeds.constants';
import { EntityTabs, EntityType } from '../../../enums/entity.enum';
import { SearchIndex } from '../../../enums/search.enum';
import {
  ClientCenterClient,
  Status,
} from '../../../generated/entity/data/clientCenterClient';
import { ChangeDescription } from '../../../generated/entity/type';
import { MOCK_CLIENT_CENTER_NO_PERMISSIONS } from '../../../mocks/ClientCenter.mock';
import { searchData } from '../../../rest/miscAPI';
import { getCountBadge, getFeedCounts } from '../../../utils/CommonUtils';
import { getEntityVersionByField } from '../../../utils/EntityVersionUtils';
import { getQueryFilterToExcludeClient } from '../../../utils/ClientCenterUtils';
import { getClientCenterClientsVersionsPath } from '../../../utils/RouterUtils';
import {
  escapeESReservedCharacters,
  getEncodedFqn,
} from '../../../utils/StringsUtils';
import { ActivityFeedTab } from '../../ActivityFeed/ActivityFeedTab/ActivityFeedTab.component';
import { AssetSelectionModal } from '../../Assets/AssetsSelectionModal/AssetSelectionModal';
import { CustomPropertyTable } from '../../common/CustomPropertyTable/CustomPropertyTable';
import TabsLabel from '../../TabsLabel/TabsLabel.component';
import { ClientCenterTabs } from '../ClientCenterDetails/ClientCenterDetails.interface';
import ClientCenterHeader from '../ClientCenterHeader/ClientCenterHeader.component';
import ClientCenterClientTab from '../ClientCenterClientTab/ClientCenterClientTab.component';
import { ClientCenterClientsV1Props } from './ClientCenterClientsV1.interface';
import AssetsTabs, { AssetsTabRef } from './tabs/AssetsTabs.component';
import { AssetsOfEntity } from './tabs/AssetsTabs.interface';
import ClientCenterOverviewTab from './tabs/ClientCenterOverviewTab.component';
import { searchQuery } from '../../../rest/searchAPI';

const ClientCenterClientsV1 = ({
  clientCenterClient,
  childClientCenterClients,
  handleClientCenterClientUpdate,
  handleClientCenterClientDelete,
  permissions,
  refreshClientCenterClients,
  onAssetClick,
  isSummaryPanelOpen,
  clientsLoading,
  onAddClientCenterClient,
  onEditClientCenterClient,
  updateVote,
  refreshActiveClientCenterClient,
  isVersionView,
  onThreadLinkSelect,
}: ClientCenterClientsV1Props) => {
  const {
    fqn: clientCenterFqn,
    tab,
    version,
  } = useParams<{ fqn: string; tab: string; version: string }>();
  const history = useHistory();
  const assetTabRef = useRef<AssetsTabRef>(null);
  const [assetModalVisible, setAssetModelVisible] = useState(false);
  const [feedCount, setFeedCount] = useState<number>(0);
  const [assetCountPdProcessing, setAssetCountPdProcessing] = useState<number>(0);
  const [assetCountTransferPd, setAssetCountTransferPd] = useState<number>(0);
  const [assetCountBKI, setAssetCountBKI] = useState<number>(0);
  const [assetCountAds, setAssetCountAds] = useState<number>(0);
  const [assetCount, setAssetCount] = useState<number>(0);

  const quickFilterQueryAgreementPdProcessing = {
    "query": {"bool": {"must": [{"bool": {"should": [{"term": {"knowledgeCenter.name.keyword": "Согласия на обработку ПД"}}]}}]}}
  };

  const quickFilterQueryAgreementTransferPd = {
    "query": {"bool": {"must": [{"bool": {"should": [{"term": {"knowledgeCenter.name.keyword": "Согласия на передачу ПД третьим лицам"}}]}}]}}
  };

  const quickFilterQueryAgreementBKI = {
    "query": {"bool": {"must": [{"bool": {"should": [{"term": {"knowledgeCenter.name.keyword": "Согласия на БКИ"}}]}}]}}
  };

  const quickFilterQueryAgreementAds = {
    "query": {"bool": {"must": [{"bool": {"should": [{"term": {"knowledgeCenter.name.keyword": "Согласия на рекламу"}}]}}]}}
  };

  const assetPermissions = useMemo(() => {
    const clientCenterClientStatus = clientCenterClient.status ?? Status.Approved;

    return clientCenterClientStatus === Status.Approved
      ? permissions
      : MOCK_CLIENT_CENTER_NO_PERMISSIONS;
  }, [clientCenterClient, permissions]);

  const activeTab = useMemo(() => {
    return tab ?? 'overview';
  }, [tab]);

  const activeTabHandler = (tab: string) => {
    history.push({
      pathname: version
        ? getClientCenterClientsVersionsPath(clientCenterFqn, version, tab)
        : getClientCenterClientDetailsPath(decodeURIComponent(clientCenterFqn), tab),
    });
  };

  const getEntityFeedCount = () => {
    getFeedCounts(
      EntityType.CLIENT_CENTER_CLIENT,
      clientCenterClient.fullyQualifiedName ?? '',
      setFeedCount
    );
  };

  const handleAssetSave = useCallback(() => {
    fetchClientCenterClientAssets();
    assetTabRef.current?.refreshAssets();
    tab !== 'assets' && activeTabHandler('assets');
  }, [assetTabRef, tab]);

  const onExtensionUpdate = useCallback(
    async (updatedTable: ClientCenterClient) => {
      await handleClientCenterClientUpdate({
        ...clientCenterClient,
        extension: updatedTable.extension,
      });
    },
    [clientCenterClient, handleClientCenterClientUpdate]
  );

  const onClientUpdate = async (data: ClientCenterClient) => {
    await handleClientCenterClientUpdate(data);
    getEntityFeedCount();
  };

  const tabItems = useMemo(() => {
    const items = [
      {
        label: <div data-testid="overview">{t('label.overview-client-center-client')}</div>,
        key: 'overview',
        children: (
          <ClientCenterOverviewTab
            isClientCenter={false}
            isVersionView={isVersionView}
            permissions={permissions}
            selectedData={clientCenterClient}
            onThreadLinkSelect={onThreadLinkSelect}
            onUpdate={(data) => onClientUpdate(data as ClientCenterClient)}
          />
        ),
      },
      ...(!isVersionView
        ? [
          {
            label: (
              <div data-testid="assets">
                {t('label.asset-client-center-client')}
                <span className="p-l-xs ">
                  {getCountBadge(assetCount ?? 0, '', activeTab === 'assets')}
                </span>
              </div>
            ),
            key: 'assets',
            children: (
              <AssetsTabs
                assetCount={assetCount}
                entityFqn={clientCenterClient.fullyQualifiedName ?? ''}
                isSummaryPanelOpen={isSummaryPanelOpen}
                permissions={assetPermissions}
                ref={assetTabRef}
                onAddAsset={() => setAssetModelVisible(true)}
                onAssetClick={onAssetClick}
                onRemoveAsset={handleAssetSave}
                quickFilterQuery={{}}
              />
            ),
          },
          {
            label: (
              <div data-testid="assets">
                {t('label.asset-client-center-client-processing-pd')}
                <span className="p-l-xs ">
                  {getCountBadge(assetCountPdProcessing ?? 0, '', activeTab === 'assets-processing-pd')}
                </span>
              </div>
            ),
            key: 'assets-processing-pd',
            children: (
              <AssetsTabs
                assetCount={assetCountPdProcessing}
                entityFqn={clientCenterClient.fullyQualifiedName ?? ''}
                isSummaryPanelOpen={isSummaryPanelOpen}
                permissions={assetPermissions}
                ref={assetTabRef}
                onAddAsset={() => setAssetModelVisible(true)}
                onAssetClick={onAssetClick}
                onRemoveAsset={handleAssetSave}
                quickFilterQuery={quickFilterQueryAgreementPdProcessing}
              />
            ),
          },
          {
            label: (
              <div data-testid="assets">
                {t('label.asset-client-center-client-transfer-pd')}
                <span className="p-l-xs ">
                  {getCountBadge(assetCountTransferPd ?? 0, '', activeTab === 'assets-transfer-pd')}
                </span>
              </div>
            ),
            key: 'assets-transfer-pd',
            children: (
              <AssetsTabs
                assetCount={assetCountTransferPd}
                entityFqn={clientCenterClient.fullyQualifiedName ?? ''}
                isSummaryPanelOpen={isSummaryPanelOpen}
                permissions={assetPermissions}
                ref={assetTabRef}
                onAddAsset={() => setAssetModelVisible(true)}
                onAssetClick={onAssetClick}
                onRemoveAsset={handleAssetSave}
                quickFilterQuery={quickFilterQueryAgreementTransferPd}
              />
            ),
          },
          {
            label: (
              <div data-testid="assets">
                {t('label.asset-client-center-client-bki')}
                <span className="p-l-xs ">
                  {getCountBadge(assetCountBKI ?? 0, '', activeTab === 'assets-bki')}
                </span>
              </div>
            ),
            key: 'assets-bki',
            children: (
              <AssetsTabs
                assetCount={assetCountBKI}
                entityFqn={clientCenterClient.fullyQualifiedName ?? ''}
                isSummaryPanelOpen={isSummaryPanelOpen}
                permissions={assetPermissions}
                ref={assetTabRef}
                onAddAsset={() => setAssetModelVisible(true)}
                onAssetClick={onAssetClick}
                onRemoveAsset={handleAssetSave}
                quickFilterQuery={quickFilterQueryAgreementBKI}
              />
            ),
          },
          {
            label: (
              <div data-testid="assets">
                {t('label.asset-client-center-client-ads')}
                <span className="p-l-xs ">
                  {getCountBadge(assetCountAds ?? 0, '', activeTab === 'assets-ads')}
                </span>
              </div>
            ),
            key: 'assets-ads',
            children: (
              <AssetsTabs
                assetCount={assetCountAds}
                entityFqn={clientCenterClient.fullyQualifiedName ?? ''}
                isSummaryPanelOpen={isSummaryPanelOpen}
                permissions={assetPermissions}
                ref={assetTabRef}
                onAddAsset={() => setAssetModelVisible(true)}
                onAssetClick={onAssetClick}
                onRemoveAsset={handleAssetSave}
                quickFilterQuery={quickFilterQueryAgreementAds}
              />
            ),
          },
          {
            label: (
              <TabsLabel
                count={feedCount}
                id={ClientCenterTabs.ACTIVITY_FEED}
                isActive={activeTab === ClientCenterTabs.ACTIVITY_FEED}
                name={t('label.history-client-center-client')}
              />
            ),
            key: ClientCenterTabs.ACTIVITY_FEED,
            children: (
              <ActivityFeedTab
                entityType={EntityType.CLIENT_CENTER_CLIENT}
                fqn={clientCenterClient.fullyQualifiedName ?? ''}
                onFeedUpdate={getEntityFeedCount}
                onUpdateEntityDetails={refreshActiveClientCenterClient}
              />
            ),
          },
        ]
        : []),
    ];

    return items;
  }, [
    clientCenterClient,
    permissions,
    clientsLoading,
    activeTab,
    assetCount,
    assetCountPdProcessing,
    assetCountTransferPd,
    assetCountBKI,
    assetCountAds,
    feedCount,
    isSummaryPanelOpen,
    isVersionView,
    assetPermissions,
    handleAssetSave,
    onExtensionUpdate,
  ]);

  const fetchClientCenterClientAssets = async () => {
    if (clientCenterClient) {
      try {
        const encodedFqn = getEncodedFqn(
          escapeESReservedCharacters(clientCenterClient.fullyQualifiedName)
        );
        const res = await searchData(
          '',
          1,
          0,
          `(tags.tagFQN:"${encodedFqn}")`,
          '',
          '',
          SearchIndex.ALL
        );

        const resPdProcessing = await searchQuery({
          query: `**`,
          pageNumber: 0,
          pageSize: 0,
          queryFilter: quickFilterQueryAgreementPdProcessing,
          searchIndex: SearchIndex.ALL,
          filters: `(tags.tagFQN:"${encodedFqn}")`,
        });

        const resTransferPd = await searchQuery({
          query: `**`,
          pageNumber: 0,
          pageSize: 0,
          queryFilter: quickFilterQueryAgreementTransferPd,
          searchIndex: SearchIndex.ALL,
          filters: `(tags.tagFQN:"${encodedFqn}")`,
        });

        const resBKI = await searchQuery({
          query: `**`,
          pageNumber: 0,
          pageSize: 0,
          queryFilter: quickFilterQueryAgreementBKI,
          searchIndex: SearchIndex.ALL,
          filters: `(tags.tagFQN:"${encodedFqn}")`,
        });

        const resAds = await searchQuery({
          query: `**`,
          pageNumber: 0,
          pageSize: 0,
          queryFilter: quickFilterQueryAgreementAds,
          searchIndex: SearchIndex.ALL,
          filters: `(tags.tagFQN:"${encodedFqn}")`,
        });

        setAssetCount(res.data.hits.total.value ?? 0);
        setAssetCountPdProcessing(resPdProcessing.hits.total.value ?? 0);
        setAssetCountTransferPd(resTransferPd.hits.total.value ?? 0);
        setAssetCountBKI(resBKI.hits.total.value ?? 0);
        setAssetCountAds(resAds.hits.total.value ?? 0);
      } catch (error) {
        setAssetCount(0);
        setAssetCountPdProcessing(0);
        setAssetCountTransferPd(0);
        setAssetCountBKI(0);
        setAssetCountAds(0);
      }
    }
  };

  useEffect(() => {
    fetchClientCenterClientAssets();
    getEntityFeedCount();
  }, [clientCenterFqn]);

  const name = useMemo(
    () =>
      isVersionView
        ? getEntityVersionByField(
          clientCenterClient.changeDescription as ChangeDescription,
          EntityField.NAME,
          clientCenterClient.name
        )
        : clientCenterClient.name,

    [clientCenterClient, isVersionView]
  );

  const displayName = useMemo(
    () =>
      isVersionView
        ? getEntityVersionByField(
          clientCenterClient.changeDescription as ChangeDescription,
          EntityField.DISPLAYNAME,
          clientCenterClient.displayName
        )
        : clientCenterClient.displayName,

    [clientCenterClient, isVersionView]
  );

  return (
    <>
      <Row data-testid="client-center-client" gutter={[0, 8]}>
        <Col className="p-x-md" span={24}>
          <ClientCenterHeader
            isClientCenter={false}
            isVersionView={isVersionView}
            permissions={permissions}
            selectedData={{ ...clientCenterClient, displayName, name }}
            updateVote={updateVote}
            onAddClientCenterClient={onAddClientCenterClient}
            onAssetAdd={() => setAssetModelVisible(true)}
            onDelete={handleClientCenterClientDelete}
            onUpdate={(data) => onClientUpdate(data as ClientCenterClient)}
          />
        </Col>

        <Col span={24}>
          {/* <ClientCenterOverviewTab
            isClientCenter={false}
            isVersionView={isVersionView}
            permissions={permissions}
            selectedData={clientCenterClient}
            onThreadLinkSelect={onThreadLinkSelect}
            onUpdate={(data) => onClientUpdate(data as ClientCenterClient)}
          /> */}
          <Tabs
            destroyInactiveTabPane
            activeKey={activeTab}
            className="glossary-tabs custom-tab-spacing"
            items={tabItems}
            onChange={activeTabHandler}
          />
        </Col>
      </Row>
    </>
  );
};

export default ClientCenterClientsV1;
