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
import { Col, Row, Space } from 'antd';
import React, { useMemo, useState } from 'react';
import { EntityField } from '../../../../constants/Feeds.constants';
import { EntityType } from '../../../../enums/entity.enum';
import { KnowledgeCenter } from '../../../../generated/entity/data/knowledgeCenter';
import { KnowledgeCenterDocument } from '../../../../generated/entity/data/knowledgeCenterDocument';
import { ChangeDescription } from '../../../../generated/entity/type';
import { TagLabel, TagSource } from '../../../../generated/type/tagLabel';
import { getEntityName } from '../../../../utils/EntityUtils';
import {
  getEntityVersionByField,
  getEntityVersionTags,
} from '../../../../utils/EntityVersionUtils';
import DescriptionV1 from '../../../common/EntityDescription/DescriptionV1';
import { OperationPermission } from '../../../PermissionProvider/PermissionProvider.interface';
import TagsContainerV2 from '../../../Tag/TagsContainerV2/TagsContainerV2';
import { DisplayType } from '../../../Tag/TagsViewer/TagsViewer.interface';
import KnowledgeCenterDetailsRightPanel from '../../KnowledgeCenterDetailsRightPanel/KnowledgeCenterDetailsRightPanel.component';
import { KnowledgeCenterUpdateConfirmationModal } from '../../KnowledgeCenterUpdateConfirmationModal/KnowledgeCenterUpdateConfirmationModal';
import KnowledgeCenterDocumentReferences from './KnowledgeCenterDocumentReferences';
import KnowledgeCenterDocumentSynonyms from './KnowledgeCenterDocumentSynonyms';
import RelatedDocuments from './RelatedKnowledgeCenterDocuments';
import DescriptionEditorJsV1 from '../../../common/EntityDescriptionEditorJs/DescriptionEditorJsV1';
import KnowledgeCenterDocumentInfoCard from './KnowledgeCenterOverviewInfo';

type Props = {
  selectedData: KnowledgeCenter | KnowledgeCenterDocument;
  permissions: OperationPermission;
  onUpdate: (data: KnowledgeCenterDocument | KnowledgeCenter) => Promise<void>;
  isKnowledgeCenter: boolean;
  isVersionView?: boolean;
  onThreadLinkSelect: (value: string) => void;
};

const KnowledgeCenterClientCenterClientTab = ({
  selectedData,
  permissions,
  onUpdate,
  isKnowledgeCenter,
  isVersionView,
  onThreadLinkSelect,
}: Props) => {
  const [isDescriptionEditable, setIsDescriptionEditable] =
    useState<boolean>(false);
  const [tagsUpdatating, setTagsUpdating] = useState<TagLabel[]>();

  const onDescriptionUpdate = async (updatedHTML: string) => {
    if (selectedData.description !== updatedHTML) {
      const updatedTableDetails = {
        ...selectedData,
        description: updatedHTML,
      };
      onUpdate(updatedTableDetails);
      setIsDescriptionEditable(false);
    } else {
      setIsDescriptionEditable(false);
    }
  };

  const hasEditTagsPermissions = useMemo(() => {
    return permissions.EditAll || permissions.EditTags;
  }, [permissions]);

  const knowledgeCenterDescription = useMemo(() => {
    return selectedData.description;
  }, [selectedData, isVersionView]);

  const tags = useMemo(
    () =>
      isVersionView
        ? getEntityVersionTags(
          selectedData,
          selectedData.changeDescription as ChangeDescription
        )
        : selectedData.tags,
    [isVersionView, selectedData]
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

  return (
    <Row className="knowledge-center-overview-tab h-full" gutter={[32, 16]}>
      <Col
        className="border-right"
        data-testid="updated-by-container"
        span={24}>
        <Row className="p-md p-r-0" gutter={[0, 32]}>
          <Col span={24}>
            {/* <DescriptionEditorJsV1
              description={knowledgeCenterDescription}
              entityFqn={selectedData.fullyQualifiedName}
              entityName={getEntityName(selectedData)}
              entityType={EntityType.KNOWLEDGE_CENTER_DOCUMENT}
              hasEditAccess={permissions.EditDescription || permissions.EditAll}
              isEdit={isDescriptionEditable}
              owner={selectedData?.owner}
              showActions={!selectedData.deleted}
              onCancel={() => setIsDescriptionEditable(false)}
              onDescriptionEdit={() => setIsDescriptionEditable(true)}
              onDescriptionUpdate={onDescriptionUpdate}
              onThreadLinkSelect={onThreadLinkSelect}
            /> */}
            <TagsContainerV2
              displayType={DisplayType.POPOVER}
              entityFqn={selectedData.fullyQualifiedName}
              entityType={EntityType.KNOWLEDGE_CENTER}
              permission={hasEditTagsPermissions}
              selectedTags={tags ?? []}
              tagType={TagSource.ClientCenter}
              onSelectionChange={handleTagsUpdate}
              onThreadLinkSelect={onThreadLinkSelect}
            />
          </Col>
          {/* <Col span={24}>
            <Row gutter={[0, 40]}>
              {!isKnowledgeCenter && (
                <>
                  <Col span={12}>
                    <KnowledgeCenterDocumentSynonyms
                      knowledgeCenterDocument={selectedData as KnowledgeCenterDocument}
                      isVersionView={isVersionView}
                      permissions={permissions}
                      onKnowledgeCenterDocumentUpdate={onUpdate}
                    />
                  </Col>
                  <Col span={12}>
                    <RelatedDocuments
                      knowledgeCenterDocument={selectedData as KnowledgeCenterDocument}
                      isVersionView={isVersionView}
                      permissions={permissions}
                      onKnowledgeCenterDocumentUpdate={onUpdate}
                    />
                  </Col>
                  <Col span={12}>
                    <KnowledgeCenterDocumentReferences
                      knowledgeCenterDocument={selectedData as KnowledgeCenterDocument}
                      isVersionView={isVersionView}
                      permissions={permissions}
                      onKnowledgeCenterDocumentUpdate={onUpdate}
                    />
                  </Col>
                </>
              )}

              <Col span={12}>
                <Space className="w-full" direction="vertical">
                  <TagsContainerV2
                    displayType={DisplayType.READ_MORE}
                    entityFqn={selectedData.fullyQualifiedName}
                    entityType={EntityType.KNOWLEDGE_CENTER_DOCUMENT}
                    permission={hasEditTagsPermissions}
                    selectedTags={tags ?? []}
                    tagType={TagSource.Classification}
                    onSelectionChange={handleTagsUpdate}
                    onThreadLinkSelect={onThreadLinkSelect}
                  />
                </Space>
              </Col>
            </Row>
          </Col> */}
        </Row>
      </Col>
      {/* <Col className="p-t-md" span={6}>
        <KnowledgeCenterDetailsRightPanel
          isKnowledgeCenter={false}
          isVersionView={isVersionView}
          permissions={permissions}
          selectedData={selectedData}
          onThreadLinkSelect={onThreadLinkSelect}
          onUpdate={onUpdate}
        />
        <Row gutter={[0, 40]}>
          <Col span={24}>
            <TagsContainerV2
              displayType={DisplayType.READ_MORE}
              entityFqn={selectedData.fullyQualifiedName}
              entityType={EntityType.KNOWLEDGE_CENTER_DOCUMENT}
              permission={hasEditTagsPermissions}
              selectedTags={tags ?? []}
              tagType={TagSource.Classification}
              onSelectionChange={handleTagsUpdate}
              onThreadLinkSelect={onThreadLinkSelect}
            />
            <TagsContainerV2
              displayType={DisplayType.READ_MORE}
              entityFqn={selectedData.fullyQualifiedName}
              entityType={EntityType.KNOWLEDGE_CENTER_DOCUMENT}
              permission={hasEditTagsPermissions}
              selectedTags={tags ?? []}
              tagType={TagSource.ClientCenter}
              onSelectionChange={handleTagsUpdate}
              onThreadLinkSelect={onThreadLinkSelect}
            />
            <>!!!</>
            <TagsContainerV2
              displayType={DisplayType.READ_MORE}
              entityFqn={selectedData.fullyQualifiedName}
              entityType={EntityType.KNOWLEDGE_CENTER_DOCUMENT}
              permission={hasEditTagsPermissions}
              selectedTags={tags ?? []}
              tagType={TagSource.KnowledgeCenter}
              onSelectionChange={handleTagsUpdate}
              onThreadLinkSelect={onThreadLinkSelect}
            />
          </Col>
          <Col span={24}>
            <KnowledgeCenterDocumentSynonyms
              knowledgeCenterDocument={selectedData as KnowledgeCenterDocument}
              isVersionView={isVersionView}
              permissions={permissions}
              onKnowledgeCenterDocumentUpdate={onUpdate}
            />
          </Col>
          <Col span={24}>
            <KnowledgeCenterDocumentReferences
              knowledgeCenterDocument={selectedData as KnowledgeCenterDocument}
              isVersionView={isVersionView}
              permissions={permissions}
              onKnowledgeCenterDocumentUpdate={onUpdate}
            />
          </Col>
        </Row>
      </Col> */}
      {tagsUpdatating && (
        <KnowledgeCenterUpdateConfirmationModal
          knowledgeCenterDocument={selectedData as KnowledgeCenterDocument}
          updatedTags={tagsUpdatating}
          onCancel={() => setTagsUpdating(undefined)}
          onValidationSuccess={handleKnowledgeCenterTagUpdateValidationConfirm}
        />
      )}
    </Row>
  );
};

export default KnowledgeCenterClientCenterClientTab;
