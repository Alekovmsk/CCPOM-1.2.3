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
import { cloneDeep, includes, isEqual } from 'lodash';
import React, { useMemo, useState } from 'react';
import { t } from 'i18next';
import { useTranslation } from 'react-i18next';
import { ReactComponent as EditIcon } from '../../../../assets/svg/edit-new.svg';
import { ReactComponent as PlusIcon } from '../../../../assets/svg/plus-primary.svg';
import DescriptionV1 from '../../../../components/common/EntityDescription/DescriptionV1';
import { UserSelectableList } from '../../../../components/common/UserSelectableList/UserSelectableList.component';
import { UserTeamSelectableList } from '../../../../components/common/UserTeamSelectableList/UserTeamSelectableList.component';
import DomainExperts from '../../../../components/Domain/DomainExperts/DomainExperts.component';
import DomainTypeSelectForm from '../../../../components/Domain/DomainTypeSelectForm/DomainTypeSelectForm.component';
import { usePermissionProvider } from '../../../../components/PermissionProvider/PermissionProvider';
import { ResourceEntity } from '../../../../components/PermissionProvider/PermissionProvider.interface';
import TagButton from '../../../../components/TagButton/TagButton.component';
import { DE_ACTIVE_COLOR, NO_DATA_PLACEHOLDER } from '../../../../constants/constants';
import { EntityField } from '../../../../constants/Feeds.constants';
import { EntityType } from '../../../../enums/entity.enum';
import { DataProduct } from '../../../../generated/entity/domains/dataProduct';
import { Perimeter } from '../../../../generated/entity/domains/perimeter';
import {
  Domain,
  DomainType,
} from '../../../../generated/entity/domains/domain';
import { Operation } from '../../../../generated/entity/policies/policy';
import {
  ChangeDescription,
  EntityReference,
} from '../../../../generated/entity/type';
import {
  domainTypeTooltipDataRender,
  getUserNames,
} from '../../../../utils/DomainUtils';
import { getEntityName } from '../../../../utils/EntityUtils';
import { getEntityVersionByField } from '../../../../utils/EntityVersionUtils';
import { checkPermission } from '../../../../utils/PermissionsUtils';
import FormItemLabel from '../../../Form/FormItemLabel';
import '../../domain.less';
import {
  DocumentationEntity,
  DocumentationTabProps,
} from './DocumentationTab.interface';
import DescriptionLikeV1 from '../../../common/EntityDescriptionLike/DescriptionLikeV1';
import EntityList from './EntityList';
import UserEskSelectForm from '../../UserEskSelectForm/UserEskSelectForm.component';
import TagsContainerV2 from '../../../Tag/TagsContainerV2/TagsContainerV2';
import { DisplayType } from '../../../Tag/TagsViewer/TagsViewer.interface';
import { getTagsWithoutTier } from '../../../../utils/TableUtils';
import { EntityTags } from 'Models';
import { TagLabel, TagSource } from '../../../../generated/type/tagLabel';
import { createTagObject } from '../../../../utils/TagsUtils';
import { ThreadType } from '../../../../generated/entity/feed/thread';

const DocumentationTab = ({
  domain,
  onUpdate,
  isVersionsView = false,
  type = DocumentationEntity.DOMAIN,
}: DocumentationTabProps) => {
  const { t } = useTranslation();
  const { permissions } = usePermissionProvider();
  const [isDescriptionEditable, setIsDescriptionEditable] =
    useState<boolean>(false);
  const [editDomainType, setEditDomainType] = useState(false);
  const [editDomainOwner, setEditDomainOwner] = useState(false);
  const [editDomainTechLeader, setEditDomainTechLeader] = useState(false);
  const resourceType =
    type === DocumentationEntity.DOMAIN
      ? ResourceEntity.DOMAIN
      : (type === DocumentationEntity.DATA_PRODUCT ? ResourceEntity.DATA_PRODUCT : ResourceEntity.PERIMETER);



  const [threadLink, setThreadLink] = useState<string>('');
  const [threadType, setThreadType] = useState<ThreadType>(
    ThreadType.Conversation
  );

  const onThreadLinkSelect = (link: string, threadType?: ThreadType) => {
    setThreadLink(link);
    if (threadType) {
      setThreadType(threadType);
    }
  };


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

  const description = useMemo(
    () =>
      isVersionsView
        ? getEntityVersionByField(
          domain.changeDescription as ChangeDescription,
          EntityField.DESCRIPTION,
          domain.description
        )
        : domain.description,

    [domain, isVersionsView]
  );

  // let attribute = undefined
  // if ('attribute' in domain)
  // {console.log('atribute in domain!!!');
  // console.log(domain);
  //   attribute = useMemo(
  //   () =>
  //     isVersionsView
  //       ? getEntityVersionByField(
  //           domain.changeDescription as ChangeDescription,
  //           EntityField.DESCRIPTION,
  //           domain.attribute
  //         )
  //       : domain.attribute,

  //   [domain, isVersionsView]
  // );}

  const onDescriptionUpdate = async (updatedHTML: string) => {
    if (domain.description !== updatedHTML) {
      const updatedTableDetails = {
        ...domain,
        description: updatedHTML,
      };
      onUpdate(updatedTableDetails);
      setIsDescriptionEditable(false);
    } else {
      setIsDescriptionEditable(false);
    }
  };

  const onAttributeUpdate = async (updatedHTML: string) => {
    if (domain.description !== updatedHTML) {
      const updatedTableDetails = {
        ...domain,
        attribute: updatedHTML,
      };
      onUpdate(updatedTableDetails);
      setIsDescriptionEditable(false);
    } else {
      setIsDescriptionEditable(false);
    }
  };


  const handleUpdatedOwner = (newOwner: Domain['owner']) => {
    const updatedData = {
      ...domain,
      owner: newOwner,
    };
    onUpdate(updatedData as Domain | DataProduct | Perimeter);
  };

  const handleExpertsUpdate = (data: Array<EntityReference>) => {
    if (!isEqual(data, domain.experts)) {
      let updatedDomain = cloneDeep(domain);
      const oldExperts = data.filter((d) => includes(domain.experts, d));
      const newExperts = data
        .filter((d) => !includes(domain.experts, d))
        .map((d) => ({
          id: d.id,
          type: d.type,
          name: d.name,
          displayName: d.displayName,
        }));
      updatedDomain = {
        ...updatedDomain,
        experts: [...oldExperts, ...newExperts],
      };
      onUpdate(updatedDomain);
    }
  };

  const handleTagsUpdate = async (selectedTags?: Array<TagLabel>) => {
    if (selectedTags && domain) {
      let updatedDomain = cloneDeep(domain);
      const updatedTags = [...selectedTags];
      updatedDomain = {
        ...updatedDomain,
        tags: updatedTags,
      };
      console.log('updatedDomainupdatedDomainupdatedDomainupdatedDomain');
      console.log(updatedDomain);
      await onUpdate(updatedDomain);
    }
  };

  const handleTagSelection = async (selectedTags: EntityTags[]) => {
    const updatedTags: TagLabel[] | undefined = createTagObject(selectedTags);
    await handleTagsUpdate(updatedTags);
  };

  const handleDomainTypeUpdate = async (domainType: string) => {
    let updatedDomain = cloneDeep(domain);
    updatedDomain = {
      ...updatedDomain,
      domainType: domainType as DomainType,
    };
    await onUpdate(updatedDomain);
    setEditDomainType(false);
  };

  const handleDomainOwnerUpdate = async (domainOwner: string | undefined) => {
    let updatedDomain = cloneDeep(domain);
    updatedDomain = {
      ...updatedDomain,
      domainOwner: domainOwner ? domainOwner : undefined,
    };
    await onUpdate(updatedDomain);
    setEditDomainType(false);
  };

  const handleDomainTechLeaderUpdate = async (domainTechLeader: string | undefined) => {
    let updatedDomain = cloneDeep(domain);
    updatedDomain = {
      ...updatedDomain,
      domainTechLeader: domainTechLeader,
    };
    await onUpdate(updatedDomain);
    setEditDomainType(false);
  };

  return (
    <Row>
      {type !== DocumentationEntity.PERIMETER && (
        <Col className="border-right p-md domain-content-container" span={18}>
          <DescriptionV1
            description={description}
            entityName={getEntityName(domain)}
            entityType={EntityType.DOMAIN}
            hasEditAccess={editDescriptionPermission}
            isEdit={isDescriptionEditable}
            showCommentsIcon={false}
            onCancel={() => setIsDescriptionEditable(false)}
            onDescriptionEdit={() => setIsDescriptionEditable(true)}
            onDescriptionUpdate={onDescriptionUpdate}
          />
        </Col>)}

      {type === DocumentationEntity.PERIMETER && (
        <>
          <Col className="border-right p-md domain-content-container" span={9}>
            <EntityList
              perimeter={domain as Perimeter}
              isVersionView={isVersionsView}
              hasPermission={editDescriptionPermission || editAllPermission}
              onPerimeterUpdate={onUpdate}
            />
          </Col>
          <Col className="border-right p-md domain-content-container" span={9}>
            <DescriptionLikeV1
              description={description}
              entityName={getEntityName(domain)}
              entityType={EntityType.DOMAIN}
              hasEditAccess={editDescriptionPermission}
              isEdit={isDescriptionEditable}
              showCommentsIcon={false}
              onCancel={() => setIsDescriptionEditable(false)}
              onDescriptionEdit={() => setIsDescriptionEditable(true)}
              onDescriptionUpdate={onDescriptionUpdate}
              entityLabel={t('label.attribute')}
              noEntityLabel={t('label.no-attribute')}
            />
          </Col>
        </>
      )}
      <Col className="p-md" span={6}>
        <Row gutter={[0, 40]}>
          <Col data-testid="domain-owner-name" span="24">
            <div className="d-flex items-center m-b-xss">
              <Typography.Text className="right-panel-label">
                {t('label.owner')}
              </Typography.Text>
              {editOwnerPermission && domain.owner && (
                <UserTeamSelectableList
                  hasPermission
                  owner={domain.owner}
                  onUpdate={handleUpdatedOwner}>
                  <Button
                    className="cursor-pointer flex-center m-l-xss"
                    data-testid="edit-owner"
                    icon={<EditIcon color={DE_ACTIVE_COLOR} width="14px" />}
                    size="small"
                    type="text"
                  />
                </UserTeamSelectableList>
              )}
            </div>

            <Space className="m-r-xss" size={4}>
              {getUserNames(
                domain,
                editOwnerPermission || editAllPermission,
                isVersionsView
              )}
            </Space>

            {!domain.owner && editOwnerPermission && (
              <UserTeamSelectableList
                hasPermission
                owner={domain.owner}
                onUpdate={handleUpdatedOwner}>
                <TagButton
                  className="tw-text-primary cursor-pointer"
                  icon={<PlusIcon height={16} name="plus" width={16} />}
                  label={t('label.add')}
                  tooltip=""
                />
              </UserTeamSelectableList>
            )}
          </Col>
          <Col data-testid="domain-expert-name" span="24">
            <div
              className={`d-flex items-center ${domain.experts && domain.experts.length > 0 ? 'm-b-xss' : ''
                }`}>
              <Typography.Text
                className="right-panel-label"
                data-testid="domain-expert-heading-name">
                {t('label.expert-plural')}
              </Typography.Text>
              {editOwnerPermission &&
                domain.experts &&
                domain.experts.length > 0 && (
                  <UserSelectableList
                    hasPermission
                    popoverProps={{ placement: 'topLeft' }}
                    selectedUsers={domain.experts ?? []}
                    onUpdate={handleExpertsUpdate}>
                    <Button
                      className="cursor-pointer flex-center m-l-xss"
                      data-testid="edit-expert-button"
                      icon={<EditIcon color={DE_ACTIVE_COLOR} width="14px" />}
                      size="small"
                      type="text"
                    />
                  </UserSelectableList>
                )}
            </div>
            <DomainExperts
              editPermission={editAllPermission}
              entity={domain}
              isVersionsView={isVersionsView}
            />
            <div>
              {editOwnerPermission &&
                domain.experts &&
                domain.experts.length === 0 && (
                  <UserSelectableList
                    hasPermission={editOwnerPermission}
                    popoverProps={{ placement: 'topLeft' }}
                    selectedUsers={domain.experts ?? []}
                    onUpdate={handleExpertsUpdate}>
                    <TagButton
                      className="tw-text-primary cursor-pointer"
                      icon={<PlusIcon height={16} name="plus" width={16} />}
                      label={t('label.add')}
                      tooltip=""
                    />
                  </UserSelectableList>
                )}
            </div>
          </Col>

          {type === DocumentationEntity.DOMAIN && (
            <Col data-testid="domainType" span="24">
              <div className="d-flex items-center m-b-xss">
                <Typography.Text
                  className="right-panel-label"
                  data-testid="domainType-heading-name">
                  <FormItemLabel
                    align={{ targetOffset: [18, 0] }}
                    helperText={domainTypeTooltipDataRender()}
                    label={t('label.domain-type')}
                    overlayClassName="domain-type-tooltip-container"
                    placement="topLeft"
                  />
                </Typography.Text>

                {editAllPermission && (domain as Domain).domainType && (
                  <Button
                    className="cursor-pointer flex-center m-l-xss"
                    data-testid="edit-domainType-button"
                    icon={<EditIcon color={DE_ACTIVE_COLOR} width="14px" />}
                    size="small"
                    type="text"
                    onClick={() => setEditDomainType(true)}
                  />
                )}
              </div>
              {!editDomainType && (
                <Space wrap data-testid="domain-type-label" size={6}>
                  {(domain as Domain).domainType}
                </Space>
              )}

              {editDomainType && (
                <DomainTypeSelectForm
                  defaultValue={(domain as Domain).domainType}
                  onCancel={() => setEditDomainType(false)}
                  onSubmit={handleDomainTypeUpdate}
                />
              )}
            </Col>
          )}
          {type === DocumentationEntity.DOMAIN && (
            <>
              <Col data-testid="domainType" span="24">
                <div className="d-flex items-center m-b-xss">
                  <Typography.Text
                    className="right-panel-label"
                    data-testid="domainType-heading-name">
                    <FormItemLabel
                      align={{ targetOffset: [18, 0] }}
                      label={t('label.domain-owner')}
                      overlayClassName="domain-type-tooltip-container"
                      placement="topLeft"
                    />
                  </Typography.Text>

                  {editAllPermission && (
                    <Button
                      className="cursor-pointer flex-center m-l-xss"
                      data-testid="edit-domainOwner-button"
                      icon={<EditIcon color={DE_ACTIVE_COLOR} width="14px" />}
                      size="small"
                      type="text"
                      onClick={() => setEditDomainOwner(true)}
                    />
                  )}

                </div>
                {!editDomainOwner && (
                  <Space wrap data-testid="label.domain-owner" size={6}>
                    {(domain as Domain).domainOwner ? (<a href={"/userEsk/Пользователи." + (domain as Domain).domainOwner}>
                      {(domain as Domain).domainOwner}
                    </a>)
                      :
                      <>{NO_DATA_PLACEHOLDER}</>}
                  </Space>
                )}

                {editDomainOwner && (
                  <UserEskSelectForm
                    defaultValue={(domain as Domain).domainOwner}
                    onCancel={() => setEditDomainOwner(false)}
                    onSubmit={handleDomainOwnerUpdate}
                  />
                )}
              </Col>
              <Col data-testid="domainType" span="24">
                <div className="d-flex items-center m-b-xss">
                  <Typography.Text
                    className="right-panel-label"
                    data-testid="domainType-heading-name">
                    <FormItemLabel
                      align={{ targetOffset: [18, 0] }}
                      label={t('label.domain-tech-leader')}
                      overlayClassName="domain-type-tooltip-container"
                      placement="topLeft"
                    />
                  </Typography.Text>

                  {editAllPermission && (
                    <Button
                      className="cursor-pointer flex-center m-l-xss"
                      data-testid="edit-domainOwner-button"
                      icon={<EditIcon color={DE_ACTIVE_COLOR} width="14px" />}
                      size="small"
                      type="text"
                      onClick={() => setEditDomainTechLeader(true)}
                    />
                  )}
                </div>
                {!editDomainTechLeader && (
                  <Space wrap data-testid="label.full-owner" size={6}>
                    {(domain as Domain).domainTechLeader ? <a href={"/userEsk/Пользователи." + (domain as Domain).domainTechLeader}>
                      {(domain as Domain).domainTechLeader}
                    </a>
                      :
                      <>{NO_DATA_PLACEHOLDER}</>}
                  </Space>
                )}
                {editDomainTechLeader && (
                  <UserEskSelectForm
                    defaultValue={(domain as Domain).domainTechLeader}
                    onCancel={() => setEditDomainTechLeader(false)}
                    onSubmit={handleDomainTechLeaderUpdate}
                  />
                )}
              </Col>
              <TagsContainerV2
                displayType={DisplayType.READ_MORE}
                entityFqn={(domain as Domain).fullyQualifiedName}
                entityType={EntityType.DOMAIN}
                permission={editAllPermission}
                selectedTags={(domain as Domain).tags as EntityTags}
                // selectedTags={getTagsWithoutTier((domain as Domain).tags ?? [])}
                tagType={TagSource.Dlaclassification}
                onSelectionChange={handleTagSelection}
                // onThreadLinkSelect={onThreadLinkSelect}
              />
              <TagsContainerV2
                displayType={DisplayType.READ_MORE}
                entityFqn={(domain as Domain).fullyQualifiedName}
                entityType={EntityType.DOMAIN}
                permission={editAllPermission}
                selectedTags={(domain as Domain).tags as EntityTags}
                // selectedTags={getTagsWithoutTier((domain as Domain).tags ?? [])}
                tagType={TagSource.Spdclassification}
                onSelectionChange={handleTagSelection}
                // onThreadLinkSelect={onThreadLinkSelect}
              />
            </>
          )}
        </Row>
      </Col >
    </Row >
  );
};

export default DocumentationTab;
