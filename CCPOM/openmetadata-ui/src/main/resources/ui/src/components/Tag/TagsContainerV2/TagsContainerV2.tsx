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

import { Col, Form, Row, Space, Tooltip, Typography } from 'antd';
import { DefaultOptionType } from 'antd/lib/select';
import { isEmpty, isEqual } from 'lodash';
import { EntityTags } from 'Models';
import React, { useCallback, useEffect, useMemo, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { useHistory } from 'react-router-dom';
import { ReactComponent as IconComments } from '../../../assets/svg/comment.svg';
import { ReactComponent as EditIcon } from '../../../assets/svg/edit-new.svg';
import { ReactComponent as IconRequest } from '../../../assets/svg/request-icon.svg';
import { TableTagsProps } from '../../../components/TableTags/TableTags.interface';
import { DE_ACTIVE_COLOR } from '../../../constants/constants';
import { TAG_CONSTANT, TAG_START_WITH } from '../../../constants/Tag.constants';
import { LabelType } from '../../../generated/entity/data/table';
import { TagSource } from '../../../generated/type/tagLabel';
import { getEntityFeedLink } from '../../../utils/EntityUtils';
import { getFilterTags } from '../../../utils/TableTags/TableTags.utils';
import tagClassBase from '../../../utils/TagClassBase';
import dlaClassBase from '../../../utils/DlaClassBase';
import spdClassBase from '../../../utils/SpdClassBase';
import autoSystemClassBase from '../../../utils/AutoSystemClassBase';
import { fetchGlossaryList, fetchKnowledgeCenterList, fetchClientCenterList, getTagPlaceholder } from '../../../utils/TagsUtils';
import {
  getRequestTagsPath,
  getUpdateTagsPath,
} from '../../../utils/TasksUtils';
import { SelectOption } from '../../AsyncSelectList/AsyncSelectList.interface';
import TagSelectForm from '../TagsSelectForm/TagsSelectForm.component';
import TagsV1 from '../TagsV1/TagsV1.component';
import TagsViewer from '../TagsViewer/TagsViewer';
import { LayoutType } from '../TagsViewer/TagsViewer.interface';
import './tags-container.style.less';
import { TagsContainerV2Props } from './TagsContainerV2.interface';
import userEskClassBase from '../../../utils/UserEskClassBase';
import TagsViewerClientCenter from '../TagsViewer/TagsViewerClientCenter';

const TagsContainerV2 = ({
  permission,
  showTaskHandler = true,
  selectedTags,
  entityType,
  entityFqn,
  tagType,
  displayType,
  layoutType,
  showHeader = true,
  showBottomEditButton,
  showInlineEditButton,
  onSelectionChange,
  onThreadLinkSelect,
  children,
}: TagsContainerV2Props) => {
  const history = useHistory();
  const [form] = Form.useForm();
  const { t } = useTranslation();

  const [isEditTags, setIsEditTags] = useState(false);
  const [tags, setTags] = useState<TableTagsProps>();

  const {
    isGlossaryType,
    showAddTagButton,
    selectedTagsInternal,
    isHoriZontalLayout,
    initialOptions,
    isDlaType,
    isSpdType,
    isAutoSystemType,
    isUserEskType,
    isTagType,
    isKnowledgeCenterType,
    isClientCenterType
  } = useMemo(
    () => ({
      isGlossaryType: tagType === TagSource.Glossary,
      showAddTagButton: permission && isEmpty(tags?.[tagType]),

      selectedTagsInternal: tags?.[tagType].map(({ tagFQN }) => tagFQN),
      initialOptions: tags?.[tagType].map((data) => ({
        label: data.tagFQN,
        value: data.tagFQN,
        data,
      })) as SelectOption[],
      isHoriZontalLayout: layoutType === LayoutType.HORIZONTAL,
      isDlaType: tagType === TagSource.Dlaclassification,
      isSpdType: tagType === TagSource.Spdclassification,
      isAutoSystemType: tagType === TagSource.Autosystemclassification,
      isUserEskType: tagType === TagSource.Usereskclassification,
      isTagType: tagType === TagSource.Classification,
      isKnowledgeCenterType: tagType === TagSource.KnowledgeCenter,
      isClientCenterType: tagType === TagSource.ClientCenter,
    }),
    [tagType, permission, tags?.[tagType], tags, layoutType]
  );

  const fetchAPI = useCallback(
    (searchValue: string, page: number) => {
      if (tagType === TagSource.Classification) {
        return tagClassBase.getTags(searchValue, page);
      } else if (tagType === TagSource.Glossary) {
        return fetchGlossaryList(searchValue, page);
      } else if (tagType === TagSource.Spdclassification) {
        return spdClassBase.getSpds(searchValue, page);
      } else if (tagType === TagSource.Autosystemclassification) {
        return autoSystemClassBase.getAutoSystems(searchValue, page);
      } else if (tagType === TagSource.Usereskclassification) {
        return userEskClassBase.getUserEsks(searchValue, page);
      } else if (tagType === TagSource.KnowledgeCenter) {
        return fetchKnowledgeCenterList(searchValue, page);
      } else if (tagType === TagSource.ClientCenter) {
        return fetchClientCenterList(searchValue, page);
      } else { return dlaClassBase.getDlas(searchValue, page) }
    },
    [tagType]
  );

  const showNoDataPlaceholder = useMemo(
    () => !showAddTagButton && isEmpty(tags?.[tagType]),
    [showAddTagButton, tags?.[tagType]]
  );

  const handleSave = async (data: DefaultOptionType | DefaultOptionType[]) => {
    const updatedTags = (data as DefaultOptionType[]).map((tag) => {
      let tagData: EntityTags = {
        tagFQN: typeof tag === 'string' ? tag : tag.value,
        source: tagType,
        labelType: LabelType.Manual,
      };

      if (tag.data) {
        if ((tag.data?.labelType ?? LabelType.Manual) === LabelType.Derived)
       { tagData = {
          ...tagData,
          name: tag.data?.name,
          displayName: tag.data?.displayName,
          description: tag.data?.description,
          style: tag.data?.style ?? {},
          labelType: tag.data?.labelType ?? LabelType.Manual,
        }};
      }

      return tagData;
    });

    const newTags = updatedTags.map((t) => t.tagFQN);

    if (onSelectionChange && !isEqual(selectedTagsInternal, newTags)) {
      await onSelectionChange([
        ...updatedTags,
        ...((isGlossaryType
          ? [...tags?.[TagSource.Classification], ...tags?.[TagSource.Dlaclassification], ...tags?.[TagSource.Spdclassification], ...tags?.[TagSource.Usereskclassification], ...tags?.[TagSource.Autosystemclassification], ...tags?.[TagSource.KnowledgeCenter], ...tags?.[TagSource.ClientCenter]]
          : []) ?? []),
        ...((isDlaType
          ? [...tags?.[TagSource.Classification], ...tags?.[TagSource.Glossary], ...tags?.[TagSource.Spdclassification], ...tags?.[TagSource.Usereskclassification], ...tags?.[TagSource.Autosystemclassification], ...tags?.[TagSource.KnowledgeCenter], ...tags?.[TagSource.ClientCenter]]
          : []) ?? []),
        ...((isSpdType
          ? [...tags?.[TagSource.Classification], ...tags?.[TagSource.Dlaclassification], ...tags?.[TagSource.Glossary], ...tags?.[TagSource.Usereskclassification], ...tags?.[TagSource.Autosystemclassification], ...tags?.[TagSource.KnowledgeCenter], ...tags?.[TagSource.ClientCenter]]
          : []) ?? []),
        ...((isAutoSystemType
          ? [...tags?.[TagSource.Classification], ...tags?.[TagSource.Dlaclassification], ...tags?.[TagSource.Spdclassification], ...tags?.[TagSource.Usereskclassification], ...tags?.[TagSource.Glossary], ...tags?.[TagSource.KnowledgeCenter], ...tags?.[TagSource.ClientCenter]]
          : []) ?? []),
        ...((isUserEskType
          ? [...tags?.[TagSource.Classification], ...tags?.[TagSource.Dlaclassification], ...tags?.[TagSource.Spdclassification], ...tags?.[TagSource.Glossary], ...tags?.[TagSource.Autosystemclassification], ...tags?.[TagSource.KnowledgeCenter], ...tags?.[TagSource.ClientCenter]]
          : []) ?? []),
        ...((isTagType
          ? [...tags?.[TagSource.Glossary], ...tags?.[TagSource.Dlaclassification], ...tags?.[TagSource.Spdclassification], ...tags?.[TagSource.Usereskclassification], ...tags?.[TagSource.Autosystemclassification], ...tags?.[TagSource.KnowledgeCenter], ...tags?.[TagSource.ClientCenter]]
          : []) ?? []),
        ...((isKnowledgeCenterType
          ? [...tags?.[TagSource.Glossary], ...tags?.[TagSource.Dlaclassification], ...tags?.[TagSource.Spdclassification], ...tags?.[TagSource.Usereskclassification], ...tags?.[TagSource.Autosystemclassification], ...tags?.[TagSource.Classification], ...tags?.[TagSource.ClientCenter]]
          : []) ?? []),
        ...((isClientCenterType
          ? [...tags?.[TagSource.Glossary], ...tags?.[TagSource.Dlaclassification], ...tags?.[TagSource.Spdclassification], ...tags?.[TagSource.Usereskclassification], ...tags?.[TagSource.Autosystemclassification], ...tags?.[TagSource.Classification], ...tags?.[TagSource.KnowledgeCenter]]
          : []) ?? []),
      ]);
    }
    const tsags=tags;

    form.resetFields();
    setIsEditTags(false);
  };

  const handleCancel = useCallback(() => {
    setIsEditTags(false);
    form.resetFields();
  }, [form]);

  const handleAddClick = useCallback(() => {
    const tsags=tags?.[tagType];
    setIsEditTags(true);
  }, [isGlossaryType]);

  const addTagButton = useMemo(
    () =>
      showAddTagButton ? (
        <Col className="m-t-xss" onClick={handleAddClick}>
          <TagsV1 startWith={TAG_START_WITH.PLUS} tag={TAG_CONSTANT} />
        </Col>
      ) : null,
    [showAddTagButton]
  );

  const renderTags = useMemo(
    () => (
      tagType === TagSource.ClientCenter ? 
      <Col span={24}>
        <TagsViewerClientCenter
          displayType={displayType}
          showNoDataPlaceholder={showNoDataPlaceholder}
          tags={tags?.[tagType] ?? []}
        />
      </Col>
      :
      <Col span={24}>
        <TagsViewer
          displayType={displayType}
          showNoDataPlaceholder={showNoDataPlaceholder}
          tags={tags?.[tagType] ?? []}
        />
      </Col>
    ),
    [displayType, showNoDataPlaceholder, tags?.[tagType], layoutType]
  );

  const tagsSelectContainer = useMemo(() => {
    return (
      <TagSelectForm
        defaultValue={selectedTagsInternal ?? []}
        fetchApi={fetchAPI}
        placeholder={getTagPlaceholder(isGlossaryType)}
        tagData={initialOptions}
        onCancel={handleCancel}
        onSubmit={handleSave}
      />
    );
  }, [
    isGlossaryType,
    selectedTagsInternal,
    getTagPlaceholder,
    fetchAPI,
    handleCancel,
    handleSave,
    initialOptions,
  ]);

  const handleTagsTask = (hasTags: boolean) => {
    history.push(
      (hasTags ? getUpdateTagsPath : getRequestTagsPath)(
        entityType as string,
        entityFqn as string
      )
    );
  };

  const requestTagElement = useMemo(() => {
    const hasTags = !isEmpty(tags?.[tagType]);

    return (
      <Col>
        <Tooltip
          title={
            hasTags
              ? t('label.update-request-tag-plural')
              : t('label.request-tag-plural')
          }>
          <IconRequest
            className="cursor-pointer align-middle"
            data-testid="request-entity-tags"
            height={14}
            name="request-tags"
            style={{ color: DE_ACTIVE_COLOR }}
            width={14}
            onClick={() => handleTagsTask(hasTags)}
          />
        </Tooltip>
      </Col>
    );
  }, [tags?.[tagType], handleTagsTask]);

  const conversationThreadElement = useMemo(
    () => (
      <Col>
        <Tooltip
          title={t('label.list-entity', {
            entity: t('label.conversation'),
          })}>
          <IconComments
            className="cursor-pointer align-middle"
            data-testid="tag-thread"
            height={14}
            name="comments"
            style={{ color: DE_ACTIVE_COLOR }}
            width={14}
            onClick={() =>
              onThreadLinkSelect?.(
                getEntityFeedLink(entityType, entityFqn, 'tags')
              )
            }
          />
        </Tooltip>
      </Col>
    ),
    [entityType, entityFqn, onThreadLinkSelect]
  );

  const header = useMemo(() => {
    return (
      showHeader && (
        <Space align="center" className="m-b-xss w-full" size="middle">
          <Typography.Text className="right-panel-label">
            {isGlossaryType
              ? t('label.glossary-term')
              : (isDlaType
                ? t('label.dla')
                : (isSpdType
                  ? t('label.spd')
                  : (isAutoSystemType
                    ? t('label.auto-system')
                    : (isAutoSystemType
                      ? t('label.auto-system')
                      : (isKnowledgeCenterType
                        ? t('label.knowledge-center')
                        : (isClientCenterType
                          ? t('label.client-center')
                          : t('label.tag-plural')))))))}
          </Typography.Text>
          {permission && (
            <Row gutter={12}>
              {!isEmpty(tags?.[tagType]) && !isEditTags && (
                <Col>
                  <EditIcon
                    className="cursor-pointer align-middle"
                    color={DE_ACTIVE_COLOR}
                    data-testid="edit-button"
                    width="14px"
                    onClick={handleAddClick}
                  />
                </Col>
              )}
              {showTaskHandler && (
                <>
                  {tagType === TagSource.Classification && requestTagElement}
                  {onThreadLinkSelect && conversationThreadElement}
                </>
              )}
            </Row>
          )}
        </Space>
      )
    );
  }, [
    tags,
    tagType,
    showHeader,
    isEditTags,
    permission,
    showTaskHandler,
    isGlossaryType,
    requestTagElement,
    conversationThreadElement,
  ]);

  const editTagButton = useMemo(
    () =>
      permission && !isEmpty(tags?.[tagType]) ? (
        <EditIcon
          className="hover-cell-icon cursor-pointer align-middle"
          data-testid="edit-button"
          height={14}
          name={t('label.edit')}
          style={{ color: DE_ACTIVE_COLOR }}
          width={14}
          onClick={handleAddClick}
        />
      ) : null,
    [permission, tags, tagType, handleAddClick]
  );

  const horizontalLayout = useMemo(() => {
    return (
      <Space>
        {showAddTagButton ? (
          <div onClick={handleAddClick}>
            <TagsV1 startWith={TAG_START_WITH.PLUS} tag={TAG_CONSTANT} />
          </div>
        ) : null}
        <TagsViewer
          displayType={displayType}
          showNoDataPlaceholder={showNoDataPlaceholder}
          tags={tags?.[tagType] ?? []}
        />
        {showInlineEditButton ? editTagButton : null}
      </Space>
    );
  }, [
    showAddTagButton,
    displayType,
    layoutType,
    showNoDataPlaceholder,
    tags?.[tagType],
    showInlineEditButton,
    handleAddClick,
  ]);

  const tagBody = useMemo(() => {
    if (isEditTags) {
      return tagsSelectContainer;
    } else {
      return isHoriZontalLayout ? (
        horizontalLayout
      ) : (
        <Row data-testid="entity-tags">
          {addTagButton}
          {renderTags}
          {showInlineEditButton && <Col>{editTagButton}</Col>}
        </Row>
      );
    }
  }, [
    isEditTags,
    tagsSelectContainer,
    addTagButton,
    isHoriZontalLayout,
    horizontalLayout,
    renderTags,
    editTagButton,
  ]);

  useEffect(() => {
    setTags(getFilterTags(selectedTags));
  }, [selectedTags]);

  return (
    <div
      className="w-full tags-container"
      data-testid={isGlossaryType ? 'glossary-container' : 'tags-container'}>
      {header}
      {tagBody}

      {(children || showBottomEditButton) && (
        <Space align="baseline" className="m-t-xs w-full" size="middle">
          {showBottomEditButton && !showInlineEditButton && editTagButton}
          {children}
        </Space>
      )}
    </div>
  );
};

export default TagsContainerV2;
