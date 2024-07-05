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
import { ClientCenterClient } from '../../../../generated/entity/data/clientCenterClient';
import {
  ChangeDescription,
  EntityReference,
} from '../../../../generated/entity/type';
import { Paging } from '../../../../generated/type/paging';
import { searchData } from '../../../../rest/miscAPI';
import { formatSearchClientCenterClientResponse } from '../../../../utils/APIUtils';
import { getEntityName } from '../../../../utils/EntityUtils';
import {
  getChangedEntityNewValue,
  getChangedEntityOldValue,
  getDiffByFieldName,
} from '../../../../utils/EntityVersionUtils';
import { VersionStatus } from '../../../../utils/EntityVersionUtils.interface';
import { getEntityReferenceFromClientCenter } from '../../../../utils/ClientCenterUtils';
import { getClientCenterPath } from '../../../../utils/RouterUtils';

interface RelatedClientsProps {
  isVersionView?: boolean;
  permissions: OperationPermission;
  clientCenterClient: ClientCenterClient;
  onClientCenterClientUpdate: (data: ClientCenterClient) => Promise<void>;
}

const RelatedClients = ({
  isVersionView,
  clientCenterClient,
  permissions,
  onClientCenterClientUpdate,
}: RelatedClientsProps) => {
  const history = useHistory();
  const [isIconVisible, setIsIconVisible] = useState<boolean>(true);
  const [options, setOptions] = useState<EntityReference[]>([]);
  const [selectedOption, setSelectedOption] = useState<EntityReference[]>([]);

  const handleRelatedClientClick = (fqn: string) => {
    history.push(getClientCenterPath(fqn));
  };

  const handleRelatedClientsSave = async (
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

    let updatedClientCenterClient = cloneDeep(clientCenterClient);
    const oldClients = newOptions.filter((d) =>
      includes(clientCenterClient.relatedClients, d)
    );
    const newClients = newOptions
      .filter((d) => !includes(clientCenterClient.relatedClients, d))
      .map((d) => ({
        id: d.id,
        type: d.type,
        displayName: d.displayName,
        name: d.name,
      }));
    updatedClientCenterClient = {
      ...updatedClientCenterClient,
      relatedClients: [...oldClients, ...newClients],
    };

    await onClientCenterClientUpdate(updatedClientCenterClient);
    setIsIconVisible(true);
  };

  const fetchClientCenterClients = async (
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
      SearchIndex.CLIENT_CENTER
    );

    const clientResult = formatSearchClientCenterClientResponse(
      res.data.hits.hits
    ).filter(
      (item) => item.fullyQualifiedName !== clientCenterClient.fullyQualifiedName
    );

    const results = clientResult.map(getEntityReferenceFromClientCenter);
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
    if (clientCenterClient) {
      setOptions(clientCenterClient.relatedClients ?? []);
      setSelectedOption(formatOptions(clientCenterClient.relatedClients ?? []));
    }
  }, [clientCenterClient]);

  const getRelatedClientElement = useCallback(
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
          handleRelatedClientClick(entity.fullyQualifiedName || '');
        }}
      />
    ),
    []
  );

  const getVersionRelatedClients = useCallback(() => {
    const changeDescription = clientCenterClient.changeDescription;
    const relatedClientsDiff = getDiffByFieldName(
      EntityField.RELATEDClIENTS,
      changeDescription as ChangeDescription
    );

    const addedRelatedClients: EntityReference[] = JSON.parse(
      getChangedEntityNewValue(relatedClientsDiff) ?? '[]'
    );
    const deletedRelatedClients: EntityReference[] = JSON.parse(
      getChangedEntityOldValue(relatedClientsDiff) ?? '[]'
    );

    const unchangedRelatedClients = clientCenterClient.relatedClients
      ? clientCenterClient.relatedClients.filter(
          (relatedClient) =>
            !addedRelatedClients.find(
              (addedRelatedClient: EntityReference) =>
                addedRelatedClient.id === relatedClient.id
            )
        )
      : [];

    const noSynonyms =
      isEmpty(unchangedRelatedClients) &&
      isEmpty(addedRelatedClients) &&
      isEmpty(deletedRelatedClients);

    if (noSynonyms) {
      return <div>{NO_DATA_PLACEHOLDER}</div>;
    }

    return (
      <div className="d-flex flex-wrap">
        {unchangedRelatedClients.map((relatedClient) =>
          getRelatedClientElement(relatedClient)
        )}
        {addedRelatedClients.map((relatedClient) =>
          getRelatedClientElement(relatedClient, { added: true })
        )}
        {deletedRelatedClients.map((relatedClient) =>
          getRelatedClientElement(relatedClient, { removed: true })
        )}
      </div>
    );
  }, [clientCenterClient]);

  const relatedClientsContainer = useMemo(
    () =>
      isVersionView ? (
        getVersionRelatedClients()
      ) : (
        <div className="d-flex flex-wrap">
          {permissions.EditAll && selectedOption.length === 0 && (
            <TagButton
              className="text-primary cursor-pointer"
              dataTestId="related-client-add-button"
              icon={<PlusIcon height={16} name="plus" width={16} />}
              label={t('label.add')}
              tooltip=""
              onClick={() => {
                setIsIconVisible(false);
              }}
            />
          )}

          {selectedOption.map((entity: EntityReference) =>
            getRelatedClientElement(entity)
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
      getVersionRelatedClients,
      getRelatedClientElement,
    ]
  );

  return (
    <div className="flex flex-col" data-testid="related-client-container">
      <div className="d-flex items-center">
        <Typography.Text className="right-panel-label">
          {t('label.related-client-plural')}
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
        relatedClientsContainer
      ) : (
        <TagSelectForm
          defaultValue={selectedOption.map(
            (item) => item.fullyQualifiedName ?? ''
          )}
          fetchApi={fetchClientCenterClients}
          placeholder={t('label.add-entity', {
            entity: t('label.related-client-plural'),
          })}
          onCancel={handleCancel}
          onSubmit={handleRelatedClientsSave}
        />
      )}
    </div>
  );
};

export default RelatedClients;
