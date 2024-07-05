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
import { getKnowledgeCenterDocumentDetailsPath } from '../../../constants/constants';
import { EntityField } from '../../../constants/Feeds.constants';
import { EntityTabs, EntityType } from '../../../enums/entity.enum';
import { SearchIndex } from '../../../enums/search.enum';
import {
  KnowledgeCenterDocument,
  Status,
} from '../../../generated/entity/data/knowledgeCenterDocument';
import { ChangeDescription } from '../../../generated/entity/type';
import { MOCK_KNOWLEDGE_CENTER_NO_PERMISSIONS } from '../../../mocks/KnowledgeCenter.mock';
import { searchData } from '../../../rest/miscAPI';
import { getCountBadge, getFeedCounts } from '../../../utils/CommonUtils';
import { getEntityVersionByField, getEntityVersionTags } from '../../../utils/EntityVersionUtils';
import { getQueryFilterToExcludeDocument } from '../../../utils/KnowledgeCenterUtils';
import { getKnowledgeCenterDocumentsVersionsPath } from '../../../utils/RouterUtils';
import {
  escapeESReservedCharacters,
  getEncodedFqn,
} from '../../../utils/StringsUtils';
import { ActivityFeedTab } from '../../ActivityFeed/ActivityFeedTab/ActivityFeedTab.component';
import { AssetSelectionModal } from '../../Assets/AssetsSelectionModal/AssetSelectionModal';
import { CustomPropertyTable } from '../../common/CustomPropertyTable/CustomPropertyTable';
import TabsLabel from '../../TabsLabel/TabsLabel.component';
import { KnowledgeCenterTabs } from '../KnowledgeCenterDetails/KnowledgeCenterDetails.interface';
import KnowledgeCenterHeader from '../KnowledgeCenterHeader/KnowledgeCenterHeader.component';
import KnowledgeCenterDocumentTab from '../KnowledgeCenterDocumentTab/KnowledgeCenterDocumentTab.component';
import { KnowledgeCenterDocumentsV1Props } from './KnowledgeCenterDocumentsV1.interface';
import AssetsTabs, { AssetsTabRef } from './tabs/AssetsTabs.component';
import { AssetsOfEntity } from './tabs/AssetsTabs.interface';
import KnowledgeCenterOverviewTab from './tabs/KnowledgeCenterOverviewTab.component';
import TagsContainerV2 from '../../Tag/TagsContainerV2/TagsContainerV2';
import { DisplayType } from '../../Tag/TagsViewer/TagsViewer.interface';
import { TagLabel, TagSource } from '../../../generated/type/tagLabel';
import { KnowledgeCenterUpdateConfirmationModal } from '../KnowledgeCenterUpdateConfirmationModal/KnowledgeCenterUpdateConfirmationModal';
import KnowledgeCenterClientCenterClientTab from './tabs/KnowledgeCenterClientCenterClientTab.component copy';


const KnowledgeCenterDocumentsV1 = ({
  knowledgeCenterDocument,
  childKnowledgeCenterDocuments,
  handleKnowledgeCenterDocumentUpdate,
  handleKnowledgeCenterDocumentDelete,
  permissions,
  refreshKnowledgeCenterDocuments,
  onAssetClick,
  isSummaryPanelOpen,
  documentsLoading,
  onAddKnowledgeCenterDocument,
  onEditKnowledgeCenterDocument,
  updateVote,
  refreshActiveKnowledgeCenterDocument,
  isVersionView,
  onThreadLinkSelect,
}: KnowledgeCenterDocumentsV1Props) => {
  const {
    fqn: knowledgeCenterFqn,
    tab,
    version,
  } = useParams<{ fqn: string; tab: string; version: string }>();
  const history = useHistory();
  const assetTabRef = useRef<AssetsTabRef>(null);
  const [assetModalVisible, setAssetModelVisible] = useState(false);
  const [feedCount, setFeedCount] = useState<number>(0);
  const [assetCount, setAssetCount] = useState<number>(0);

  // tags
  const [tagsUpdatating, setTagsUpdating] = useState<TagLabel[]>();
  const hasEditTagsPermissions = useMemo(() => {
    return permissions.EditAll || permissions.EditTags;
  }, [permissions]);
  const tags = useMemo(
    () =>
      isVersionView
        ? getEntityVersionTags(
          knowledgeCenterDocument,
          knowledgeCenterDocument.changeDescription as ChangeDescription
        )
        : knowledgeCenterDocument.tags,
    [isVersionView, knowledgeCenterDocument]
  );
  const handleTagsUpdate = async (updatedTags: TagLabel[]) => {
    setTagsUpdating(updatedTags);
  };
  const handleKnowledgeCenterTagUpdateValidationConfirm = async () => {
    if (selectedData) {
      await onUpdate({
        ...selectedData,
        tags: tagsUpdatating,
      });
    }
  };



  const assetPermissions = useMemo(() => {
    const knowledgeCenterDocumentStatus = knowledgeCenterDocument.status ?? Status.Approved;

    return knowledgeCenterDocumentStatus === Status.Approved
      ? permissions
      : MOCK_KNOWLEDGE_CENTER_NO_PERMISSIONS;
  }, [knowledgeCenterDocument, permissions]);

  const activeTab = useMemo(() => {
    return tab ?? 'overview';
  }, [tab]);

  const activeTabHandler = (tab: string) => {
    history.push({
      pathname: version
        ? getKnowledgeCenterDocumentsVersionsPath(knowledgeCenterFqn, version, tab)
        : getKnowledgeCenterDocumentDetailsPath(decodeURIComponent(knowledgeCenterFqn), tab),
    });
  };

  const getEntityFeedCount = () => {
    getFeedCounts(
      EntityType.KNOWLEDGE_CENTER_DOCUMENT,
      knowledgeCenterDocument.fullyQualifiedName ?? '',
      setFeedCount
    );
  };

  const handleAssetSave = useCallback(() => {
    fetchKnowledgeCenterDocumentAssets();
    assetTabRef.current?.refreshAssets();
    tab !== 'assets' && activeTabHandler('assets');
  }, [assetTabRef, tab]);

  const onExtensionUpdate = useCallback(
    async (updatedTable: KnowledgeCenterDocument) => {
      await handleKnowledgeCenterDocumentUpdate({
        ...knowledgeCenterDocument,
        extension: updatedTable.extension,
      });
    },
    [knowledgeCenterDocument, handleKnowledgeCenterDocumentUpdate]
  );

  const onDocumentUpdate = async (data: KnowledgeCenterDocument) => {
    await handleKnowledgeCenterDocumentUpdate(data);
    getEntityFeedCount();
  };

  const tabItems = useMemo(() => {
    const items = [
      {
        label: <div data-testid="overview">{t('label.overview-knowledge-center-document')}</div>,
        key: 'overview',
        children: (
          <KnowledgeCenterOverviewTab
            isKnowledgeCenter={false}
            isVersionView={isVersionView}
            permissions={permissions}
            selectedData={knowledgeCenterDocument}
            onThreadLinkSelect={onThreadLinkSelect}
            onUpdate={(data) => onDocumentUpdate(data as KnowledgeCenterDocument)}
          />
        ),
      },
      {
        label: (
          <div data-testid="assets">
            {t('label.asset-knowledge-center-document')}
          </div>
        ),
        key: 'assets',
        children: (
          <KnowledgeCenterClientCenterClientTab
            isKnowledgeCenter={false} 
            isVersionView={isVersionView}
            permissions={permissions}
            selectedData={knowledgeCenterDocument}
            onThreadLinkSelect={onThreadLinkSelect}
            onUpdate={(data) => onDocumentUpdate(data as KnowledgeCenterDocument)}
          />

        ),
      },
      ...(!isVersionView
        ? [
          {
            label: (
              <TabsLabel
                count={feedCount}
                id={KnowledgeCenterTabs.ACTIVITY_FEED}
                isActive={activeTab === KnowledgeCenterTabs.ACTIVITY_FEED}
                name={t('label.history-knowledge-center-document')}
              />
            ),
            key: KnowledgeCenterTabs.ACTIVITY_FEED,
            children: (
              <ActivityFeedTab
                entityType={EntityType.KNOWLEDGE_CENTER_DOCUMENT}
                fqn={knowledgeCenterDocument.fullyQualifiedName ?? ''}
                onFeedUpdate={getEntityFeedCount}
                onUpdateEntityDetails={refreshActiveKnowledgeCenterDocument}
              />
            ),
          },
        ]
        : []),
    ];

    return items;
  }, [
    knowledgeCenterDocument,
    permissions,
    documentsLoading,
    activeTab,
    assetCount,
    feedCount,
    isSummaryPanelOpen,
    isVersionView,
    assetPermissions,
    handleAssetSave,
    onExtensionUpdate,
  ]);

  const fetchKnowledgeCenterDocumentAssets = async () => {
    if (knowledgeCenterDocument) {
      try {
        const encodedFqn = getEncodedFqn(
          escapeESReservedCharacters(knowledgeCenterDocument.fullyQualifiedName)
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

        setAssetCount(res.data.hits.total.value ?? 0);
      } catch (error) {
        setAssetCount(0);
      }
    }
  };

  useEffect(() => {
    fetchKnowledgeCenterDocumentAssets();
    getEntityFeedCount();
  }, [knowledgeCenterFqn]);

  const name = useMemo(
    () =>
      isVersionView
        ? getEntityVersionByField(
          knowledgeCenterDocument.changeDescription as ChangeDescription,
          EntityField.NAME,
          knowledgeCenterDocument.name
        )
        : knowledgeCenterDocument.name,

    [knowledgeCenterDocument, isVersionView]
  );

  const displayName = useMemo(
    () =>
      isVersionView
        ? getEntityVersionByField(
          knowledgeCenterDocument.changeDescription as ChangeDescription,
          EntityField.DISPLAYNAME,
          knowledgeCenterDocument.displayName
        )
        : knowledgeCenterDocument.displayName,

    [knowledgeCenterDocument, isVersionView]
  );

  return (
    <>
      <Row data-testid="knowledge-center-document" gutter={[0, 8]}>
        <Col className="p-x-md" span={24}>
          <KnowledgeCenterHeader
            isKnowledgeCenter={false}
            isVersionView={isVersionView}
            permissions={permissions}
            selectedData={{ ...knowledgeCenterDocument, displayName, name }}
            updateVote={updateVote}
            onAddKnowledgeCenterDocument={onAddKnowledgeCenterDocument}
            onAssetAdd={() => setAssetModelVisible(true)}
            onDelete={handleKnowledgeCenterDocumentDelete}
            onUpdate={(data) => onDocumentUpdate(data as KnowledgeCenterDocument)}
          />
        </Col>

        <Col span={24}>
          {/* <KnowledgeCenterOverviewTab
            isKnowledgeCenter={false}
            isVersionView={isVersionView}
            permissions={permissions}
            selectedData={knowledgeCenterDocument}
            onThreadLinkSelect={onThreadLinkSelect}
            onUpdate={(data) => onDocumentUpdate(data as KnowledgeCenterDocument)}
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

export default KnowledgeCenterDocumentsV1;
