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
  DomainQuota
} from '../../../../generated/entity/domains/domain';
import { ChangeDescription } from '../../../../generated/entity/type';
import {
  getChangedEntityNewValue,
  getChangedEntityOldValue,
  getDiffByFieldName,
} from '../../../../utils/EntityVersionUtils';
import { VersionStatus } from '../../../../utils/EntityVersionUtils.interface';
import DomainQuotasListModal from './DomainQuotasListModal.component';

interface DomainQuotasListProps {
  isVersionView?: boolean;
  domain: Domain;
  hasPermission: boolean;
  onDomainUpdate: (domain: Domain) => void;
}

const DomainQuotasList = ({
  domain,
  hasPermission,
  onDomainUpdate,
  isVersionView,
}: DomainQuotasListProps) => {
  const [domainQuotasList, setDomainQuotasList] = useState<DomainQuota[]>([]);
  const [isViewMode, setIsViewMode] = useState<boolean>(true);

  const handleDomainQuotasListSave = async (
    newDomainQuotasList: DomainQuota[],
    updateState?: boolean
  ) => {
    try {
      const updatedRef = newDomainQuotasList.filter(
        (ref) => ref
      );
      if (!isEqual(updatedRef, domain.domainQuotasList)) {
        let updatedDomain = cloneDeep(domain);
        updatedDomain = {
          ...updatedDomain,
          domainQuotasList: updatedRef,
        };

        onDomainUpdate(updatedDomain);
        if (updateState) {
          setDomainQuotasList(updatedRef);
        }
      }
      setIsViewMode(true);
    } catch (error) {
      // Added catch block to prevent uncaught promise
    }
  };

  const onDomainQuotaModalSave = (values: DomainQuota[]) => {
    handleDomainQuotasListSave(values);
  };

  useEffect(() => {
    setDomainQuotasList(domain.domainQuotasList ? domain.domainQuotasList : []);
  }, [domain.domainQuotasList]);

  const getDomainQuotaElementsTable = useCallback(
    (ref: DomainQuota, versionStatus?: VersionStatus) => {
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
        subsystem: ref.subsystem,
        resourceType: ref.resourceType,
        quotaSize: ref.quotaSize,
        comment: ref.comment,
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
      title: t('label.subsystem'),
      dataIndex: 'subsystem',
      key: 'subsystem',
    },
    {
      title: t('label.resource-type'),
      dataIndex: 'resourceType',
      key: 'resourceType',
    },
    {
      title: t('label.quota-size'),
      dataIndex: 'quotaSize',
      key: 'quotaSize',
    },
    {
      title: t('label.comment'),
      dataIndex: 'comment',
      key: 'comment',
    },
  ]

  const getVersionDomainQuotaElements = useCallback(() => {
    const changeDescription = domain.changeDescription;
    const domainQuotasListDiff = getDiffByFieldName(
      EntityField.ENTITY_LIST,
      changeDescription as ChangeDescription
    );

    const addedDomainQuotasList: DomainQuota[] = JSON.parse(
      getChangedEntityNewValue(domainQuotasListDiff) ?? '[]'
    );
    const deletedDomainQuotasList: DomainQuota[] = JSON.parse(
      getChangedEntityOldValue(domainQuotasListDiff) ?? '[]'
    );

    const unchangedDomainQuotasList = domain.domainQuotasList
      ? domain.domainQuotasList.filter(
        (domainQuota) =>
          !addedDomainQuotasList.find(
            (addedDomainQuota: DomainQuota) =>
              addedDomainQuota === domainQuota
          )
      )
      : [];

    const noSynonyms =
      isEmpty(unchangedDomainQuotasList) &&
      isEmpty(addedDomainQuotasList) &&
      isEmpty(deletedDomainQuotasList);

    if (noSynonyms) {
      return <div>{NO_DATA_PLACEHOLDER}</div>;
    }

    return (
      <div>
        {unchangedDomainQuotasList.map((domainQuota) => getDomainQuotaElementsTable(domainQuota))}
        {addedDomainQuotasList.map((domainQuota) =>
          getDomainQuotaElementsTable(domainQuota, { added: true })
        )}
        {deletedDomainQuotasList.map((domainQuota) =>
          getDomainQuotaElementsTable(domainQuota, { removed: true })
        )}
      </div>
    );
  }, [domain]);

  return (
    <div data-testid="domainQuotasList-container">
      <div className="w-full">
        <Space
          className="w-full"
          data-testid={`section-${t('label.domain-quotas-list')}`}>
          <div className="flex-center">
            <Typography.Text className="right-panel-label">
              {t('label.domain-quotas-list')}
            </Typography.Text>
            {domainQuotasList.length > 0 && hasPermission && (
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
            getVersionDomainQuotaElements()
          ) : (
            <div>
              {hasPermission && domainQuotasList.length === 0 && (
                <TagButton
                  className="text-primary cursor-pointer"
                  dataTestId="term-domainQuotasList-add-button"
                  icon={<PlusIcon height={16} name="plus" width={16} />}
                  label={t('label.add')}
                  tooltip=""
                  onClick={() => {
                    setIsViewMode(false);
                  }}
                />
              )}
              <Table
                dataSource={domainQuotasList.map((ref) => getDomainQuotaElementsTable(ref))}
                columns={columns}
                locale={{ emptyText: '' }}
              />
              {/* {domainQuotasList.map((ref) => getDomainQuotaElementsTable(ref))} */}
              {!hasPermission && domainQuotasList.length === 0 && (
                <div>{NO_DATA_PLACEHOLDER}</div>
              )}
            </div>
          )}
        </>
      </div>

      <DomainQuotasListModal
        isVisible={!isViewMode}
        domainQuotasList={domainQuotasList || []}
        onClose={() => {
          setIsViewMode(true);
        }}
        onSave={(values: DomainQuota[]) => {
          onDomainQuotaModalSave(values);
        }}
      />
    </div>
  );
};

export default DomainQuotasList;
