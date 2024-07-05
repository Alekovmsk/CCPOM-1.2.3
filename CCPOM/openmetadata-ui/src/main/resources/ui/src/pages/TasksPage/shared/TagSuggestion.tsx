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

import { DefaultOptionType } from 'antd/lib/select';
import { t } from 'i18next';
import { isArray, isEmpty } from 'lodash';
import { EntityTags } from 'Models';
import React, { useMemo } from 'react';
import AsyncSelectList from '../../../components/AsyncSelectList/AsyncSelectList';
import { SelectOption } from '../../../components/AsyncSelectList/AsyncSelectList.interface';
import { TagSource } from '../../../generated/entity/data/container';
import { TagLabel } from '../../../generated/type/tagLabel';
import tagClassBase from '../../../utils/TagClassBase';
import { fetchGlossaryList } from '../../../utils/TagsUtils';
import spdClassBase from '../../../utils/SpdClassBase';
import dlaClassBase from '../../../utils/DlaClassBase';
import autoSystemClassBase from '../../../utils/AutoSystemClassBase';
import { fetchKnowledgeCenterDocuments } from '../../../utils/KnowledgeCenterUtils';
import { fetchClientCenterClients } from '../../../utils/ClientCenterUtils';

export interface TagSuggestionProps {
  placeholder?: string;
  tagType?: TagSource;
  value?: TagLabel[];
  initialOptions?: SelectOption[];
  onChange?: (newTags: TagLabel[]) => void;
}

const TagSuggestion: React.FC<TagSuggestionProps> = ({
  onChange,
  value,
  placeholder,
  initialOptions,
  tagType = TagSource.Classification,
}) => {
  const isGlossaryType = useMemo(
    () => tagType === TagSource.Glossary,
    [tagType]
  );
  const isDlaType = useMemo(
    () => tagType === TagSource.Dlaclassification,
    [tagType]
  );
  const isSpdType = useMemo(
    () => tagType === TagSource.Spdclassification,
    [tagType]
  );
  const isAutoSystemType = useMemo(
    () => tagType === TagSource.Autosystemclassification,
    [tagType]
  );
  const isKnowledgeCenterType = useMemo(
    () => tagType === TagSource.KnowledgeCenter,
    [tagType]
  );
  const isClientCenterType = useMemo(
    () => tagType === TagSource.ClientCenter,
    [tagType]
  );


  const handleTagSelection = (
    newValue: DefaultOptionType | DefaultOptionType[]
  ) => {
    if (isArray(newValue)) {
      let newTags: EntityTags[] = [];
      if (!isEmpty(newValue)) {
        newTags = newValue.reduce((acc, tag) => {
          const oldTag = value?.find((oldTag) => oldTag.tagFQN === tag.value);
          if (oldTag) {
            return [...acc, oldTag];
          }
          let tagData: EntityTags = {
            tagFQN: tag.value,
            source: isGlossaryType
              ? TagSource.Glossary
              : (isDlaType
                ? TagSource.Dlaclassification
                : (isSpdType
                  ? TagSource.Spdclassification
                  : (isAutoSystemType
                    ? TagSource.Autosystemclassification
                    : (isKnowledgeCenterType
                      ? TagSource.KnowledgeCenter
                      : (isClientCenterType
                        ? TagSource.ClientCenter
                        : TagSource.Classification))))),
          };

          if (tag.data) {
            tagData = {
              ...tagData,
              name: tag.data?.name,
              displayName: tag.data?.displayName,
              description: tag.data?.description,
              style: tag.data?.style,
            };
          }

          return [...acc, tagData];
        }, [] as EntityTags[]);
      }

      onChange?.(newTags);
    }
  };

  return (
    <AsyncSelectList
      fetchOptions={
        isGlossaryType
          ? fetchGlossaryList
          : (isDlaType
            ? spdClassBase.getSpds
            : (isSpdType
              ? dlaClassBase.getDlas
              : (isAutoSystemType
                ? autoSystemClassBase.getAutoSystems
                : (isKnowledgeCenterType
                  ? fetchKnowledgeCenterDocuments
                  : (isClientCenterType
                    ? fetchClientCenterClients
                    : tagClassBase.getTags)))))}
      initialOptions={initialOptions}
      mode="multiple"
      placeholder={
        placeholder ??
        t('label.select-field', {
          field: t('label.tag-plural'),
        })
      }
      value={value?.map((item) => item.tagFQN) ?? []}
      onChange={(value) => handleTagSelection(value)}
    />
  );
};

export default TagSuggestion;
