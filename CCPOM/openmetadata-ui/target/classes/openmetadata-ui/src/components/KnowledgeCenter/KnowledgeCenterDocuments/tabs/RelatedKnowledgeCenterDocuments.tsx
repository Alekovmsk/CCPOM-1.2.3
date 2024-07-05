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

import { Button, Tooltip, Typography } from 'antd';
import { DefaultOptionType } from 'antd/lib/select';
import { t } from 'i18next';
import { cloneDeep, includes, isArray, isEmpty, uniqWith } from 'lodash';
import React, { useCallback, useEffect, useMemo, useState } from 'react';
import { useHistory } from 'react-router-dom';
import { ReactComponent as IconTerm } from '../../../../assets/svg/book.svg';
import { ReactComponent as EditIcon } from '../../../../assets/svg/edit-new.svg';
import { ReactComponent as PlusIcon } from '../../../../assets/svg/plus-primary.svg';
import { OperationPermission } from '../../../PermissionProvider/PermissionProvider.interface';
import TagSelectForm from '../../../Tag/TagsSelectForm/TagsSelectForm.component';
import TagButton from '../../../TagButton/TagButton.component';
import {
  DE_ACTIVE_COLOR,
  NO_DATA_PLACEHOLDER,
  PAGE_SIZE,
} from '../../../../constants/constants';
import { EntityField } from '../../../../constants/Feeds.constants';
import { NO_PERMISSION_FOR_ACTION } from '../../../../constants/HelperTextUtil';
import { SearchIndex } from '../../../../enums/search.enum';
import { KnowledgeCenterDocument } from '../../../../generated/entity/data/knowledgeCenterDocument';
import {
  ChangeDescription,
  EntityReference,
} from '../../../../generated/entity/type';
import { Paging } from '../../../../generated/type/paging';
import { searchData } from '../../../../rest/miscAPI';
import { formatSearchKnowledgeCenterDocumentResponse } from '../../../../utils/APIUtils';
import { getEntityName } from '../../../../utils/EntityUtils';
import {
  getChangedEntityNewValue,
  getChangedEntityOldValue,
  getDiffByFieldName,
} from '../../../../utils/EntityVersionUtils';
import { VersionStatus } from '../../../../utils/EntityVersionUtils.interface';
import { getEntityReferenceFromKnowledgeCenter } from '../../../../utils/KnowledgeCenterUtils';
import { getKnowledgeCenterPath } from '../../../../utils/RouterUtils';

interface RelatedDocumentsProps {
  isVersionView?: boolean;
  permissions: OperationPermission;
  knowledgeCenterDocument: KnowledgeCenterDocument;
  onKnowledgeCenterDocumentUpdate: (data: KnowledgeCenterDocument) => Promise<void>;
}

const RelatedDocuments = ({
  isVersionView,
  knowledgeCenterDocument,
  permissions,
  onKnowledgeCenterDocumentUpdate,
}: RelatedDocumentsProps) => {
  const history = useHistory();
  const [isIconVisible, setIsIconVisible] = useState<boolean>(true);
  const [options, setOptions] = useState<EntityReference[]>([]);
  const [selectedOption, setSelectedOption] = useState<EntityReference[]>([]);

  const handleRelatedDocumentClick = (fqn: string) => {
    history.push(getKnowledgeCenterPath(fqn));
  };

  const handleRelatedDocumentsSave = async (
    selectedData: DefaultOptionType | DefaultOptionType[]
  ): Promise<void> => {
    if (!isArray(selectedData)) {
      return;
    }
    const newOptions = uniqWith(
      options,
      (arrVal, othVal) => arrVal.id === othVal.id
    ).filter((item) =>
      selectedData.find((data) => data.value === item.fullyQualifiedName)
    );

    let updatedKnowledgeCenterDocument = cloneDeep(knowledgeCenterDocument);
    const oldDocuments = newOptions.filter((d) =>
      includes(knowledgeCenterDocument.relatedDocuments, d)
    );
    const newDocuments = newOptions
      .filter((d) => !includes(knowledgeCenterDocument.relatedDocuments, d))
      .map((d) => ({
        id: d.id,
        type: d.type,
        displayName: d.displayName,
        name: d.name,
      }));
    updatedKnowledgeCenterDocument = {
      ...updatedKnowledgeCenterDocument,
      relatedDocuments: [...oldDocuments, ...newDocuments],
    };

    await onKnowledgeCenterDocumentUpdate(updatedKnowledgeCenterDocument);
    setIsIconVisible(true);
  };

  const fetchKnowledgeCenterDocuments = async (
    searchText = '',
    page: number
  ): Promise<{
    data: {
      label: string;
      value: string;
    }[];
    paging: Paging;
  }> => {
    const res = await searchData(
      searchText,
      page,
      PAGE_SIZE,
      '',
      '',
      '',
      SearchIndex.KNOWLEDGE_CENTER
    );

    const documentResult = formatSearchKnowledgeCenterDocumentResponse(
      res.data.hits.hits
    ).filter(
      (item) => item.fullyQualifiedName !== knowledgeCenterDocument.fullyQualifiedName
    );

    const results = documentResult.map(getEntityReferenceFromKnowledgeCenter);
    setOptions((prev) => [...prev, ...results]);

    return {
      data: results.map((item) => ({
        label: item.fullyQualifiedName ?? '',
        value: item.fullyQualifiedName ?? '',
      })),
      paging: {
        total: res.data.hits.total.value,
      },
    };
  };

  const formatOptions = (data: EntityReference[]) => {
    return data.map((value) => ({
      ...value,
      value: value.id,
      label: value.displayName || value.name,
      key: value.id,
    }));
  };

  const handleCancel = () => {
    setIsIconVisible(true);
  };

  useEffect(() => {
    if (knowledgeCenterDocument) {
      setOptions(knowledgeCenterDocument.relatedDocuments ?? []);
      setSelectedOption(formatOptions(knowledgeCenterDocument.relatedDocuments ?? []));
    }
  }, [knowledgeCenterDocument]);

  const getRelatedDocumentElement = useCallback(
    (entity: EntityReference, versionStatus?: VersionStatus) => (
      <TagButton
        className="cursor-pointer"
        icon={<IconTerm height={12} name="folder" />}
        key={entity.fullyQualifiedName}
        label={getEntityName(entity)}
        tooltip={
          <div className="p-xss">
            <strong>{entity.fullyQualifiedName}</strong>
            <div>{entity.description}</div>
          </div>
        }
        versionData={versionStatus}
        onClick={() => {
          handleRelatedDocumentClick(entity.fullyQualifiedName || '');
        }}
      />
    ),
    []
  );

  const getVersionRelatedDocuments = useCallback(() => {
    const changeDescription = knowledgeCenterDocument.changeDescription;
    const relatedDocumentsDiff = getDiffByFieldName(
      EntityField.RELATEDDOCUMENTS,
      changeDescription as ChangeDescription
    );

    const addedRelatedDocuments: EntityReference[] = JSON.parse(
      getChangedEntityNewValue(relatedDocumentsDiff) ?? '[]'
    );
    const deletedRelatedDocuments: EntityReference[] = JSON.parse(
      getChangedEntityOldValue(relatedDocumentsDiff) ?? '[]'
    );

    const unchangedRelatedDocuments = knowledgeCenterDocument.relatedDocuments
      ? knowledgeCenterDocument.relatedDocuments.filter(
          (relatedDocument) =>
            !addedRelatedDocuments.find(
              (addedRelatedDocument: EntityReference) =>
                addedRelatedDocument.id === relatedDocument.id
            )
        )
      : [];

    const noSynonyms =
      isEmpty(unchangedRelatedDocuments) &&
      isEmpty(addedRelatedDocuments) &&
      isEmpty(deletedRelatedDocuments);

    if (noSynonyms) {
      return <div>{NO_DATA_PLACEHOLDER}</div>;
    }

    return (
      <div className="d-flex flex-wrap">
        {unchangedRelatedDocuments.map((relatedDocument) =>
          getRelatedDocumentElement(relatedDocument)
        )}
        {addedRelatedDocuments.map((relatedDocument) =>
          getRelatedDocumentElement(relatedDocument, { added: true })
        )}
        {deletedRelatedDocuments.map((relatedDocument) =>
          getRelatedDocumentElement(relatedDocument, { removed: true })
        )}
      </div>
    );
  }, [knowledgeCenterDocument]);

  const relatedDocumentsContainer = useMemo(
    () =>
      isVersionView ? (
        getVersionRelatedDocuments()
      ) : (
        <div className="d-flex flex-wrap">
          {permissions.EditAll && selectedOption.length === 0 && (
            <TagButton
              className="text-primary cursor-pointer"
              dataTestId="related-document-add-button"
              icon={<PlusIcon height={16} name="plus" width={16} />}
              label={t('label.add')}
              tooltip=""
              onClick={() => {
                setIsIconVisible(false);
              }}
            />
          )}

          {selectedOption.map((entity: EntityReference) =>
            getRelatedDocumentElement(entity)
          )}

          {!permissions.EditAll && selectedOption.length === 0 && (
            <div>{NO_DATA_PLACEHOLDER}</div>
          )}
        </div>
      ),
    [
      permissions,
      selectedOption,
      isVersionView,
      getVersionRelatedDocuments,
      getRelatedDocumentElement,
    ]
  );

  return (
    <div className="flex flex-col" data-testid="related-document-container">
      <div className="d-flex items-center">
        <Typography.Text className="right-panel-label">
          {t('label.related-document-plural')}
        </Typography.Text>
        {permissions.EditAll && selectedOption.length > 0 && (
          <Tooltip
            title={
              permissions.EditAll ? t('label.edit') : NO_PERMISSION_FOR_ACTION
            }>
            <Button
              className="cursor-pointer flex-center m-l-xss"
              data-testid="edit-button"
              disabled={!permissions.EditAll}
              icon={<EditIcon color={DE_ACTIVE_COLOR} width="14px" />}
              size="small"
              type="text"
              onClick={() => setIsIconVisible(false)}
            />
          </Tooltip>
        )}
      </div>

      {isIconVisible ? (
        relatedDocumentsContainer
      ) : (
        <TagSelectForm
          defaultValue={selectedOption.map(
            (item) => item.fullyQualifiedName ?? ''
          )}
          fetchApi={fetchKnowledgeCenterDocuments}
          placeholder={t('label.add-entity', {
            entity: t('label.related-document-plural'),
          })}
          onCancel={handleCancel}
          onSubmit={handleRelatedDocumentsSave}
        />
      )}
    </div>
  );
};

export default RelatedDocuments;
