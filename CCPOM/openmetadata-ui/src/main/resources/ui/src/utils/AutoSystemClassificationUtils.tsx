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

import { Badge, Button, Space, Tooltip, Typography } from 'antd';
import { ColumnsType } from 'antd/lib/table';
import { t } from 'i18next';
import React from 'react';
import { Link } from 'react-router-dom';
import { ReactComponent as IconDisableTag } from '../assets/svg/disable-tag.svg';
import { ReactComponent as EditIcon } from '../assets/svg/edit-new.svg';
import { ManageButtonItemLabel } from '../components/common/ManageButtonContentItem/ManageButtonContentItem.component';
import { OperationPermission } from '../components/PermissionProvider/PermissionProvider.interface';
import { DE_ACTIVE_COLOR, NO_DATA_PLACEHOLDER } from '../constants/constants';
import { ProviderType } from '../generated/entity/bot';
import { AutoSystem,EntityReference } from '../generated/entity/autoSystemClassification/autoSystem';
import { DeleteTagsType } from '../pages/TagsPage/TagsPage.interface';
import { getDeleteIcon, getUsageCountLink } from './TagsUtils';
import { OwnerLabel } from '../components/common/OwnerLabel/OwnerLabel.component';


export const getDeleteButtonData = (
  record: AutoSystem,
  isClassificationDisabled: boolean,
  classificationPermissions: OperationPermission
) => {
  let disabledDeleteMessage: string = t('message.no-permission-for-action');
  const disableDeleteButton =
    record.provider === ProviderType.System ||
    !classificationPermissions.EditAll ||
    isClassificationDisabled;

  if (isClassificationDisabled) {
    disabledDeleteMessage = t(
      'message.disabled-classification-actions-message'
    );
  } else if (record.provider === ProviderType.System) {
    disabledDeleteMessage = t('message.system-tag-delete-disable-message');
  }

  return { disableDeleteButton, disabledDeleteMessage };
};

export const getCommonColumns = (): ColumnsType<AutoSystem> => [
  {
    title: "Уник. номер",
    dataIndex: 'numberInList',
    key: 'numberInList',
    width: 200,
    render: (text) => (
      <Typography.Text>{text || NO_DATA_PLACEHOLDER}</Typography.Text>
    ),
  },
  {
    title: "Наименование",
    dataIndex: 'name',
    key: 'name',
    width: 200,
    render: (_, record) => (
      <>
      <Space align="center">
        {record.style?.iconURL && (
          <img data-testid="tag-icon" src={record.style.iconURL} width={16} />
        )}
        <Typography.Text
          className="m-b-0"
          style={{ color: record.style?.color }}>
          {record.name}
        </Typography.Text>
        {record.disabled ? (
          <Badge
            className="m-l-xs badge-grey"
            count={t('label.disabled')}
            data-testid="disabled"
          />
        ) : null}
      </Space>
    </>
    ),
  },
  {
    title: t('label.usage'),
    dataIndex: 'usage',
    key: 'usage',
    width: 200,
    render: (_, record) => (
      <>
        <Space align="center" data-testid="usage" size={4}>
          {record.usageCount ? (
            <Link
              className="link-text align-middle"
              data-testid="usage-count"
              to={getUsageCountLink(record.fullyQualifiedName ?? '')}>
              {record.usageCount}
            </Link>
          ) : (
            <span className="text-grey-muted">{NO_DATA_PLACEHOLDER}</span>
          )}
        </Space>
      </>
    ),
  },
  {
    title: 'Основные функции и назначение',
    dataIndex: 'description',
    key: 'description',
    width: 200,
    render: (text) => (
      <Typography.Text>{text || NO_DATA_PLACEHOLDER}</Typography.Text>
    ),
  },
  {
    title: 'фИО Владельца АС',
    dataIndex: 'fullNameOwner',
    key: 'fullNameOwner',
    width: 200,
    render: (text) => (
      <Typography.Text>{text || NO_DATA_PLACEHOLDER}</Typography.Text>
    ),
  },
  {
    title: 'Сокращенное наименование АС',
    dataIndex: 'shortName',
    key: 'shortName',
    width: 200,
    render: (text) => (
      <Typography.Text>{text || NO_DATA_PLACEHOLDER}</Typography.Text>
    ),
  },
  {
    title: 'Поставщик, подрядчик',
    dataIndex: 'supplier',
    key: 'supplier',
    width: 200,
    render: (text) => (
      <Typography.Text>{text || NO_DATA_PLACEHOLDER}</Typography.Text>
    ),
  },
  {
    title: 'Менджер продукта (менджер АС)',
    dataIndex: 'productManager',
    key: 'productManager',
    width: 200,
    render: (text) => (
      <Typography.Text>{text || NO_DATA_PLACEHOLDER}</Typography.Text>
    ),
  },
];

export const getTagsTableColumn = (): ColumnsType<AutoSystem> => {
  const columns: ColumnsType<AutoSystem> = getCommonColumns();
  return columns;
};

export const getClassificationExtraDropdownContent = (
  showDisableOption: boolean,
  isClassificationDisabled: boolean,
  handleEnableDisableClassificationClick: () => void
) => [
  ...(showDisableOption
    ? [
        {
          label: (
            <ManageButtonItemLabel
              description={
                isClassificationDisabled
                  ? t('message.enable-classification-description')
                  : t('message.disable-classification-description')
              }
              icon={<IconDisableTag color={DE_ACTIVE_COLOR} width="18px" />}
              id="enable-disable"
              name={
                isClassificationDisabled
                  ? t('label.enable')
                  : t('label.disable')
              }
            />
          ),
          key: 'disable-button',
          onClick: handleEnableDisableClassificationClick,
        },
      ]
    : []),
];
