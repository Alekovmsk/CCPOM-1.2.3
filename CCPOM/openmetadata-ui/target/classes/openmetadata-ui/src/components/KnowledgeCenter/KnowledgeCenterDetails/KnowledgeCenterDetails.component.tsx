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
import { getKnowledgeCenterDocumentDetailsPath } from '../../../constants/constants';
import { EntityField } from '../../../constants/Feeds.constants';
import { EntityType } from '../../../enums/entity.enum';
import { KnowledgeCenter } from '../../../generated/entity/data/knowledgeCenter';
import { ChangeDescription } from '../../../generated/entity/type';
import { getFeedCounts } from '../../../utils/CommonUtils';
import { getEntityName } from '../../../utils/EntityUtils';
import { getEntityVersionByField } from '../../../utils/EntityVersionUtils';
import { ActivityFeedTab } from '../../ActivityFeed/ActivityFeedTab/ActivityFeedTab.component';
import DescriptionV1 from '../../common/EntityDescription/DescriptionV1';
import TabsLabel from '../../TabsLabel/TabsLabel.component';
import KnowledgeCenterDetailsRightPanel from '../KnowledgeCenterDetailsRightPanel/KnowledgeCenterDetailsRightPanel.component';
import KnowledgeCenterHeader from '../KnowledgeCenterHeader/KnowledgeCenterHeader.component';
import KnowledgeCenterDocumentTab from '../KnowledgeCenterDocumentTab/KnowledgeCenterDocumentTab.component';
import './knowledge-center-details.less';
import {
  KnowledgeCenterDetailsProps,
  KnowledgeCenterTabs,
} from './KnowledgeCenterDetails.interface';
import { useElementInView } from '../../../hooks/useElementInView';
import { observerOptions } from '../../../constants/Mydata.constants';
import DescriptionEditorJsV1 from '../../common/EntityDescriptionEditorJs/DescriptionEditorJsV1';

const KnowledgeCenterDetails = ({
  permissions,
  knowledgeCenter,
  updateKnowledgeCenter,
  updateVote,
  handleKnowledgeCenterDelete,
  knowledgeCenterDocuments,
  documentsLoading,
  refreshKnowledgeCenterDocuments,
  onAddKnowledgeCenterDocument,
  onEditKnowledgeCenterDocument,
  isVersionView,
  onThreadLinkSelect,
  moreload,
  headerVisible
}: KnowledgeCenterDetailsProps) => {
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


  const handleKnowledgeCenterUpdate = async (updatedKnowledgeCenter: KnowledgeCenter) => {
    await updateKnowledgeCenter(updatedKnowledgeCenter);
    getEntityFeedCount();
  };

  const onDescriptionUpdate = async (updatedHTML: string) => {
    if (knowledgeCenter.description !== updatedHTML) {
      const updatedKnowledgeCenterDetails = {
        ...knowledgeCenter,
        description: updatedHTML,
      };
      handleKnowledgeCenterUpdate(updatedKnowledgeCenterDetails);
      setIsDescriptionEditable(false);
    } else {
      setIsDescriptionEditable(false);
    }
  };

  const description = useMemo(
    () =>knowledgeCenter.description,

    [knowledgeCenter, isVersionView]
  );

  const name = useMemo(
    () =>
      isVersionView
        ? getEntityVersionByField(
          knowledgeCenter.changeDescription as ChangeDescription,
          EntityField.NAME,
          knowledgeCenter.name
        )
        : knowledgeCenter.name,

    [knowledgeCenter, isVersionView]
  );

  const displayName = useMemo(
    () =>
      isVersionView
        ? getEntityVersionByField(
          knowledgeCenter.changeDescription as ChangeDescription,
          EntityField.DISPLAYNAME,
          knowledgeCenter.displayName
        )
        : knowledgeCenter.displayName,

    [knowledgeCenter, isVersionView]
  );

  const getEntityFeedCount = () => {
    getFeedCounts(
      EntityType.KNOWLEDGE_CENTER,
      knowledgeCenter.fullyQualifiedName ?? '',
      setFeedCount
    );
  };

  const handleTabChange = (activeKey: string) => {
    if (activeKey !== activeTab) {
      history.push(
        getKnowledgeCenterDocumentDetailsPath(knowledgeCenter.fullyQualifiedName ?? '', activeKey)
      );
    }
  };

  const detailsContent = useMemo(() => {
    return (
      <Row className="h-full p-x-md" gutter={[32, 16]}>
        <Col
          className="border-right p-y-md knowledge-center-content-container"
          span={24}>
          <Space className="w-full" direction="vertical" size={24}>
            {/* <DescriptionV1
              description={description}
              entityFqn={knowledgeCenter.fullyQualifiedName}
              entityName={getEntityName(knowledgeCenter)}
              entityType={EntityType.KNOWLEDGE_CENTER}
              hasEditAccess={permissions.EditDescription || permissions.EditAll}
              isEdit={isDescriptionEditable}
              owner={knowledgeCenter?.owner}
              showActions={!knowledgeCenter.deleted}
              onCancel={() => setIsDescriptionEditable(false)}
              onDescriptionEdit={() => setIsDescriptionEditable(true)}
              onDescriptionUpdate={onDescriptionUpdate}
              onThreadLinkSelect={onThreadLinkSelect}
            /> */}

            <KnowledgeCenterDocumentTab
              isKnowledgeCenter
              childKnowledgeCenterDocuments={knowledgeCenterDocuments}
              permissions={permissions}
              refreshKnowledgeCenterDocuments={refreshKnowledgeCenterDocuments}
              selectedData={knowledgeCenter}
              documentsLoading={documentsLoading}
              onAddKnowledgeCenterDocument={onAddKnowledgeCenterDocument}
              onEditKnowledgeCenterDocument={onEditKnowledgeCenterDocument}
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
          className="border-right p-y-md knowledge-center-content-container"
          span={8}>описание</Col> */}
        {/* <Col className="p-y-md" span={6}>
          <KnowledgeCenterDetailsRightPanel
            isKnowledgeCenter
            isVersionView={isVersionView}
            permissions={permissions}
            selectedData={knowledgeCenter}
            onThreadLinkSelect={onThreadLinkSelect}
            onUpdate={(data) => handleKnowledgeCenterUpdate(data as KnowledgeCenter)}
          />
        </Col> */}
      </Row>
    );
  }, [
    isVersionView,
    permissions,
    knowledgeCenter,
    knowledgeCenterDocuments,
    documentsLoading,
    description,
    isDescriptionEditable,
  ]);

  const tabs = useMemo(() => {
    return [
      {
        label: (
          <TabsLabel
            id={KnowledgeCenterTabs.DOCUMENTS}
            isActive={activeTab === KnowledgeCenterTabs.DOCUMENTS}
            name={t('label.document-plural')}
          />
        ),
        key: KnowledgeCenterTabs.DOCUMENTS,
        children: detailsContent,
      },
      ...(!isVersionView
        ? [
          {
            label: (
              <TabsLabel
                count={feedCount}
                id={KnowledgeCenterTabs.ACTIVITY_FEED}
                isActive={activeTab === KnowledgeCenterTabs.ACTIVITY_FEED}
                name={t('label.activity-feed-and-task-plural')}
              />
            ),
            key: KnowledgeCenterTabs.ACTIVITY_FEED,
            children: (
              <ActivityFeedTab
                entityType={EntityType.KNOWLEDGE_CENTER}
                fqn={knowledgeCenter.fullyQualifiedName ?? ''}
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
    knowledgeCenter.fullyQualifiedName,
    feedCount,
    activeTab,
    isVersionView,
  ]);

  useEffect(() => {
    getEntityFeedCount();
  }, [knowledgeCenter.fullyQualifiedName]);

  return (
    <>
      <Row
        className="knowledge-center-details"
        data-testid="knowledge-center-details"
        gutter={[0, 16]}>
        {headerVisible ?
          (<>
            <Col className="p-x-md" span={24}>
              <KnowledgeCenterHeader
                isKnowledgeCenter
                isVersionView={isVersionView}
                permissions={permissions}
                selectedData={{ ...knowledgeCenter, displayName, name }}
                updateVote={updateVote}
                onAddKnowledgeCenterDocument={onAddKnowledgeCenterDocument}
                onDelete={handleKnowledgeCenterDelete}
                onUpdate={(data) => handleKnowledgeCenterUpdate(data as KnowledgeCenter)}
              />
            </Col>
            <Col className="p-x-md" span={24}>
              <DescriptionV1
                description={description}
                entityFqn={knowledgeCenter.fullyQualifiedName}
                entityName={getEntityName(knowledgeCenter)}
                entityType={EntityType.KNOWLEDGE_CENTER}
                hasEditAccess={permissions.EditDescription || permissions.EditAll}
                isEdit={isDescriptionEditable}
                owner={knowledgeCenter?.owner}
                showActions={!knowledgeCenter.deleted}
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
            activeKey={activeTab ?? KnowledgeCenterTabs.DOCUMENTS}
            className="knowledge-center-details-page-tabs"
            data-testid="tabs"
            items={tabs}
            onChange={handleTabChange}
          /> */}
          {/* <Row className="h-full p-x-md" gutter={[32, 16]}> */}
          {/* <Col
          className="border-right p-y-md knowledge-center-content-container"
          span={24}> */}
          <Space className="w-full" direction="vertical" size={24}>
            <KnowledgeCenterDocumentTab
              isKnowledgeCenter
              childKnowledgeCenterDocuments={knowledgeCenterDocuments}
              permissions={permissions}
              refreshKnowledgeCenterDocuments={refreshKnowledgeCenterDocuments}
              selectedData={knowledgeCenter}
              documentsLoading={documentsLoading}
              onAddKnowledgeCenterDocument={onAddKnowledgeCenterDocument}
              onEditKnowledgeCenterDocument={onEditKnowledgeCenterDocument}
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
          className="border-right p-y-md knowledge-center-content-container"
          span={8}>описание</Col> */}
          {/* <Col className="p-y-md" span={6}>
          <KnowledgeCenterDetailsRightPanel
            isKnowledgeCenter
            isVersionView={isVersionView}
            permissions={permissions}
            selectedData={knowledgeCenter}
            onThreadLinkSelect={onThreadLinkSelect}
            onUpdate={(data) => handleKnowledgeCenterUpdate(data as KnowledgeCenter)}
          />
        </Col> */}
          {/* </Row> */}
        </Col>)}
      </Row>
    </>
  );
};

export default KnowledgeCenterDetails;
