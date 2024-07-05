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
import { ClientCenter } from '../../../../generated/entity/data/clientCenter';
import { ClientCenterClient } from '../../../../generated/entity/data/clientCenterClient';
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
import ClientCenterDetailsRightPanel from '../../ClientCenterDetailsRightPanel/ClientCenterDetailsRightPanel.component';
import { ClientCenterUpdateConfirmationModal } from '../../ClientCenterUpdateConfirmationModal/ClientCenterUpdateConfirmationModal';
import ClientCenterClientReferences from './ClientCenterClientReferences';
import ClientCenterClientSynonyms from './ClientCenterClientSynonyms';
import RelatedClients from './RelatedClientCenterClients';
import DescriptionEditorJsV1 from '../../../common/EntityDescriptionEditorJs/DescriptionEditorJsV1';
import ClientInfoCard from './ClientCenterOverviewInfo';

type Props = {
  selectedData: ClientCenter | ClientCenterClient;
  permissions: OperationPermission;
  onUpdate: (data: ClientCenterClient | ClientCenter) => Promise<void>;
  isClientCenter: boolean;
  isVersionView?: boolean;
  onThreadLinkSelect: (value: string) => void;
};

const ClientCenterOverviewTab = ({
  selectedData,
  permissions,
  onUpdate,
  isClientCenter,
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

  const clientCenterDescription = useMemo(() => {
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

  const handleClientCenterTagUpdateValidationConfirm = async () => {
    if (selectedData) {
      await onUpdate({
        ...selectedData,
        tags: tagsUpdatating,
      });
    }
  };

  return (
    <Row className="client-center-overview-tab h-full" gutter={[32, 16]}>
      <Col
        className="border-right"
        data-testid="updated-by-container"
        span={24}>
        <Row className="p-md p-r-0" gutter={[0, 32]}>
          <Col span={24}>
            {/* <DescriptionEditorJsV1
              description={clientCenterDescription}
              entityFqn={selectedData.fullyQualifiedName}
              entityName={getEntityName(selectedData)}
              entityType={EntityType.CLIENT_CENTER_CLIENT}
              hasEditAccess={permissions.EditDescription || permissions.EditAll}
              isEdit={isDescriptionEditable}
              owner={selectedData?.owner}
              showActions={!selectedData.deleted}
              onCancel={() => setIsDescriptionEditable(false)}
              onDescriptionEdit={() => setIsDescriptionEditable(true)}
              onDescriptionUpdate={onDescriptionUpdate}
              onThreadLinkSelect={onThreadLinkSelect}
            /> */}
            {!isClientCenter &&
            <ClientInfoCard initialValues={selectedData as ClientCenterClient} />}
          </Col>
          {/* <Col span={24}>
            <Row gutter={[0, 40]}>
              {!isClientCenter && (
                <>
                  <Col span={12}>
                    <ClientCenterClientSynonyms
                      clientCenterClient={selectedData as ClientCenterClient}
                      isVersionView={isVersionView}
                      permissions={permissions}
                      onClientCenterClientUpdate={onUpdate}
                    />
                  </Col>
                  <Col span={12}>
                    <RelatedClients
                      clientCenterClient={selectedData as ClientCenterClient}
                      isVersionView={isVersionView}
                      permissions={permissions}
                      onClientCenterClientUpdate={onUpdate}
                    />
                  </Col>
                  <Col span={12}>
                    <ClientCenterClientReferences
                      clientCenterClient={selectedData as ClientCenterClient}
                      isVersionView={isVersionView}
                      permissions={permissions}
                      onClientCenterClientUpdate={onUpdate}
                    />
                  </Col>
                </>
              )}

              <Col span={12}>
                <Space className="w-full" direction="vertical">
                  <TagsContainerV2
                    displayType={DisplayType.READ_MORE}
                    entityFqn={selectedData.fullyQualifiedName}
                    entityType={EntityType.CLIENT_CENTER_CLIENT}
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
        <ClientCenterDetailsRightPanel
          isClientCenter={false}
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
        entityType={EntityType.CLIENT_CENTER_CLIENT}
        permission={hasEditTagsPermissions}
        selectedTags={tags ?? []}
        tagType={TagSource.KnowledgeCenter}
        onSelectionChange={handleTagsUpdate}
        onThreadLinkSelect={onThreadLinkSelect}
      />
        </Col>
        <Col span={24}>
        <ClientCenterClientSynonyms
          clientCenterClient={selectedData as ClientCenterClient}
          isVersionView={isVersionView}
          permissions={permissions}
          onClientCenterClientUpdate={onUpdate}
        />
        </Col>
        <Col span={24}>
        <ClientCenterClientReferences
          clientCenterClient={selectedData as ClientCenterClient}
          isVersionView={isVersionView}
          permissions={permissions}
          onClientCenterClientUpdate={onUpdate}
        />
        </Col>
        </Row>
      </Col> */}
      {tagsUpdatating && (
        <ClientCenterUpdateConfirmationModal
          clientCenterClient={selectedData as ClientCenterClient}
          updatedTags={tagsUpdatating}
          onCancel={() => setTagsUpdating(undefined)}
          onValidationSuccess={handleClientCenterTagUpdateValidationConfirm}
        />
      )}
    </Row>
  );
};

export default ClientCenterOverviewTab;
