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

import { Button, Space, Table, Tooltip, Typography } from 'antd';
import { t } from 'i18next';
import { cloneDeep, isEmpty, isEqual } from 'lodash';
import React, { useCallback, useEffect, useState } from 'react';
import { ReactComponent as EditIcon } from '../../../../assets/svg/edit-new.svg';
import { ReactComponent as PlusIcon } from '../../../../assets/svg/plus-primary.svg';
import TagButton from '../../../TagButton/TagButton.component';
import {
  DE_ACTIVE_COLOR,
  LITE_GRAY_COLOR,
  LITE_SUCCESS_COLOR,
  NO_DATA_PLACEHOLDER,
} from '../../../../constants/constants';
import { EntityField } from '../../../../constants/Feeds.constants';
import { NO_PERMISSION_FOR_ACTION } from '../../../../constants/HelperTextUtil';
import {
  Domain,
  DataSourceEl
} from '../../../../generated/entity/domains/domain';
import { ChangeDescription } from '../../../../generated/entity/type';
import {
  getChangedEntityNewValue,
  getChangedEntityOldValue,
  getDiffByFieldName,
} from '../../../../utils/EntityVersionUtils';
import { VersionStatus } from '../../../../utils/EntityVersionUtils.interface';
import DataSourcesListModal from './DataSourcesListModal.component';

interface DataSourcesListProps {
  isVersionView?: boolean;
  domain: Domain;
  hasPermission: boolean;
  onDomainUpdate: (domain: Domain) => void;
}

const DataSourcesList = ({
  domain,
  hasPermission,
  onDomainUpdate,
  isVersionView,
}: DataSourcesListProps) => {
  const [dataSourcesList, setDataSourcesList] = useState<DataSourceEl[]>([]);
  const [isViewMode, setIsViewMode] = useState<boolean>(true);

  const handleDataSourcesListSave = async (
    newDataSourcesList: DataSourceEl[],
    updateState?: boolean
  ) => {
    try {
      const updatedRef = newDataSourcesList.filter(
        (ref) => ref
      );
      if (!isEqual(updatedRef, domain.dataSourcesList)) {
        let updatedDomain = cloneDeep(domain);
        updatedDomain = {
          ...updatedDomain,
          dataSourcesList: updatedRef,
        };

        onDomainUpdate(updatedDomain);
        if (updateState) {
          setDataSourcesList(updatedRef);
        }
      }
      setIsViewMode(true);
    } catch (error) {
      // Added catch block to prevent uncaught promise
    }
  };

  const onDataSourceElModalSave = (values: DataSourceEl[]) => {
    handleDataSourcesListSave(values);
  };

  useEffect(() => {
    setDataSourcesList(domain.dataSourcesList ? domain.dataSourcesList : []);
  }, [domain.dataSourcesList]);

  const getDataSourceElElementsTable = useCallback(
    (ref: DataSourceEl, versionStatus?: VersionStatus) => {
      let iconColor: string;
      let textClassName: string;
      if (versionStatus?.added) {
        iconColor = LITE_SUCCESS_COLOR;
        textClassName = 'text-success';
      } else if (versionStatus?.removed) {
        iconColor = LITE_GRAY_COLOR;
        textClassName = 'text-grey-muted';
      } else {
        iconColor = '#FFFFFF';
        textClassName = 'text-body';
      };

      return {
        elNumber: ref.elNumber,
        name: ref.name,
        type: ref.type,
        loadMode: ref.loadMode,
        loadObjectsList: ref.loadObjectsList,
      };
    },
    []
  );

  const columns = [
    {
      title: t('label.number'),
      dataIndex: 'elNumber',
      key: 'elNumber',
    },
    {
      title: t('label.data-source-name'),
      dataIndex: 'name',
      key: 'name',
    },
    {
      title: t('label.data-source-type'),
      dataIndex: 'type',
      key: 'type',
    },
    {
      title: t('label.data-source-load-mode'),
      dataIndex: 'loadMode',
      key: 'loadMode',
    },
    {
      title: t('label.data-source-load-objects-list'),
      dataIndex: 'loadObjectsList',
      key: 'loadObjectsList',
    },
  ]

  const getVersionDataSourceElElements = useCallback(() => {
    const changeDescription = domain.changeDescription;
    const dataSourcesListDiff = getDiffByFieldName(
      EntityField.ENTITY_LIST,
      changeDescription as ChangeDescription
    );

    const addedDataSourcesList: DataSourceEl[] = JSON.parse(
      getChangedEntityNewValue(dataSourcesListDiff) ?? '[]'
    );
    const deletedDataSourcesList: DataSourceEl[] = JSON.parse(
      getChangedEntityOldValue(dataSourcesListDiff) ?? '[]'
    );

    const unchangedDataSourcesList = domain.dataSourcesList
      ? domain.dataSourcesList.filter(
        (dataSourceEl) =>
          !addedDataSourcesList.find(
            (addedDataSourceEl: DataSourceEl) =>
              addedDataSourceEl === dataSourceEl
          )
      )
      : [];

    const noSynonyms =
      isEmpty(unchangedDataSourcesList) &&
      isEmpty(addedDataSourcesList) &&
      isEmpty(deletedDataSourcesList);

    if (noSynonyms) {
      return <div>{NO_DATA_PLACEHOLDER}</div>;
    }

    return (
      <div>
        {unchangedDataSourcesList.map((dataSourceEl) => getDataSourceElElementsTable(dataSourceEl))}
        {addedDataSourcesList.map((dataSourceEl) =>
          getDataSourceElElementsTable(dataSourceEl, { added: true })
        )}
        {deletedDataSourcesList.map((dataSourceEl) =>
          getDataSourceElElementsTable(dataSourceEl, { removed: true })
        )}
      </div>
    );
  }, [domain]);

  return (
    <div data-testid="dataSourcesList-container">
      <div className="w-full">
        <Space
          className="w-full"
          data-testid={`section-${t('label.data-sources-list')}`}>
          <div className="flex-center">
            <Typography.Text className="right-panel-label">
              {t('label.data-sources-list')}
            </Typography.Text>
            {dataSourcesList.length > 0 && hasPermission && (
              <Tooltip
                title={
                  hasPermission
                    ? t('label.edit')
                    : NO_PERMISSION_FOR_ACTION
                }>
                <Button
                  className="cursor-pointer flex-center m-l-xss"
                  data-testid="edit-button"
                  disabled={!hasPermission}
                  icon={<EditIcon color={DE_ACTIVE_COLOR} width="14px" />}
                  size="small"
                  type="text"
                  onClick={() => setIsViewMode(false)}
                />
              </Tooltip>
            )}
          </div>
        </Space>
        <>
          {isVersionView ? (
            getVersionDataSourceElElements()
          ) : (
            <div>
              {hasPermission && dataSourcesList.length === 0 && (
                <TagButton
                  className="text-primary cursor-pointer"
                  dataTestId="term-dataSourcesList-add-button"
                  icon={<PlusIcon height={16} name="plus" width={16} />}
                  label={t('label.add')}
                  tooltip=""
                  onClick={() => {
                    setIsViewMode(false);
                  }}
                />
              )}
              <Table
                dataSource={dataSourcesList.map((ref) => getDataSourceElElementsTable(ref))}
                columns={columns}
                locale={{ emptyText: '' }}
              />
              {/* {dataSourcesList.map((ref) => getDataSourceElElementsTable(ref))} */}
              {!hasPermission && dataSourcesList.length === 0 && (
                <div>{NO_DATA_PLACEHOLDER}</div>
              )}
            </div>
          )}
        </>
      </div>

      <DataSourcesListModal
        isVisible={!isViewMode}
        dataSourcesList={dataSourcesList || []}
        onClose={() => {
          setIsViewMode(true);
        }}
        onSave={(values: DataSourceEl[]) => {
          onDataSourceElModalSave(values);
        }}
      />
    </div>
  );
};

export default DataSourcesList;
