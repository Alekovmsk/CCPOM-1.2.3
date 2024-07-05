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
import './auto-system-classification-details.less'
import Icon from '@ant-design/icons/lib/components/Icon';
import { Button, Col, Row, Space, Switch, Tooltip, Typography } from 'antd';
import ButtonGroup from 'antd/lib/button/button-group';
import { ColumnsType } from 'antd/lib/table';
import classNames from 'classnames';
import { capitalize, isUndefined, toString } from 'lodash';
import React, { useCallback, useMemo } from 'react';
import { useTranslation } from 'react-i18next';
import { useHistory, useParams } from 'react-router-dom';
import { ReactComponent as IconTag } from '../../assets/svg/classification.svg';
import { ReactComponent as LockIcon } from '../../assets/svg/closed-lock.svg';
import { ReactComponent as VersionIcon } from '../../assets/svg/ic-version.svg';
import AppBadge from '../common/Badge/Badge.component';
import Description from '../common/EntityDescription/Description';
import ManageButton from '../common/EntityPageInfos/ManageButton/ManageButton';
import ErrorPlaceHolder from '../common/ErrorWithPlaceholder/ErrorPlaceHolder';
import NextPrevious from '../common/NextPrevious/NextPrevious';
import { NextPreviousProps } from '../common/NextPrevious/NextPrevious.interface';
import RichTextEditorPreviewer from '../common/RichTextEditor/RichTextEditorPreviewer';
import Table from '../common/Table/Table';
import EntityHeaderTitle from '../Entity/EntityHeaderTitle/EntityHeaderTitle.component';
import { usePermissionProvider } from '../PermissionProvider/PermissionProvider';
import {
  OperationPermission,
  ResourceEntity,
} from '../PermissionProvider/PermissionProvider.interface';
import { DE_ACTIVE_COLOR, PAGE_SIZE } from '../../constants/constants';
import { EntityField } from '../../constants/Feeds.constants';
import { EntityType } from '../../enums/entity.enum';
import { ProviderType } from '../../generated/api/autoSystemClassification/createAutoSystemClassification';
import {
  ChangeDescription,
  AutoSystemClassification,
} from '../../generated/entity/autoSystemClassification/autoSystemClassification';
import { AutoSystem } from '../../generated/entity/autoSystemClassification/autoSystem';
import { Operation } from '../../generated/entity/policies/policy';
import { Paging } from '../../generated/type/paging';
import { DeleteTagsType } from '../../pages/TagsPage/TagsPage.interface';
import {
  getClassificationExtraDropdownContent,
  getTagsTableColumn,
} from '../../utils/AutoSystemClassificationUtils';
import {
  getEntityVersionByField,
  getMutuallyExclusiveDiff,
} from '../../utils/EntityVersionUtils';
import { checkPermission } from '../../utils/PermissionsUtils';
import {
  getAutoSystemClassificationDetailsPath,
  getAutoSystemClassificationVersionsPath,
} from '../../utils/RouterUtils';

export interface ClassificationDetailsProps {
  paging: Paging;
  isTagsLoading: boolean;
  currentPage: number;
  classificationPermissions: OperationPermission;
  isVersionView?: boolean;
  currentClassification?: AutoSystemClassification;
  deleteTags?: DeleteTagsType;
  tags?: AutoSystem[];
  isEditClassification?: boolean;
  disableEditButton?: boolean;
  handlePageChange: NextPreviousProps['pagingHandler'];
  handleAfterDeleteAction?: () => void;
  handleEditTagClick?: (selectedTag: AutoSystem) => void;
  handleActionDeleteTag?: (record: AutoSystem) => void;
  handleAddNewTagClick?: () => void;
  handleEditDescriptionClick?: () => void;
  handleCancelEditDescription?: () => void;
  handleUpdateClassification?: (
    updatedClassification: AutoSystemClassification
  ) => Promise<void>;
}

function ClassificationDetails({
  currentClassification,
  handleAfterDeleteAction,
  isEditClassification,
  isTagsLoading,
  classificationPermissions,
  handleUpdateClassification,
  handleEditTagClick,
  deleteTags,
  tags,
  handleActionDeleteTag,
  handleAddNewTagClick,
  handleEditDescriptionClick,
  handleCancelEditDescription,
  paging,
  currentPage,
  handlePageChange,
  disableEditButton,
  isVersionView = false,
}: ClassificationDetailsProps) {
  const { permissions } = usePermissionProvider();
  const { t } = useTranslation();
  const { fqn: tagCategoryName } = useParams<{ fqn: string }>();
  const history = useHistory();

  const currentVersion = useMemo(
    () => currentClassification?.version ?? '0.1',
    [currentClassification]
  );

  const changeDescription = useMemo(
    () => currentClassification?.changeDescription ?? ({} as ChangeDescription),
    [currentClassification]
  );

  const versionHandler = useCallback(() => {
    isVersionView
      ? history.push(getAutoSystemClassificationDetailsPath(tagCategoryName))
      : history.push(
          getAutoSystemClassificationVersionsPath(
            tagCategoryName,
            toString(currentVersion)
          )
        );
  }, [currentVersion, tagCategoryName]);

  const isTier = useMemo(
    () => currentClassification?.name === 'Tier',
    [currentClassification]
  );

  const createTagPermission = useMemo(
    () =>
      checkPermission(Operation.Create, ResourceEntity.TAG, permissions) ||
      classificationPermissions.EditAll,
    [permissions, classificationPermissions]
  );

  const editClassificationPermission = useMemo(
    () => classificationPermissions.EditAll,
    [classificationPermissions]
  );

  const isClassificationDisabled = useMemo(
    () => currentClassification?.disabled ?? false,
    [currentClassification?.disabled]
  );

  const handleUpdateDisplayName = async (data: {
    name: string;
    displayName: string;
  }) => {
    if (
      !isUndefined(currentClassification) &&
      !isUndefined(handleUpdateClassification)
    ) {
      return handleUpdateClassification({
        ...currentClassification,
        ...data,
      });
    }
  };

  const handleUpdateDescription = async (updatedHTML: string) => {
    if (
      !isUndefined(currentClassification) &&
      !isUndefined(handleUpdateClassification)
    ) {
      handleUpdateClassification({
        ...currentClassification,
        description: updatedHTML,
      });
    }
  };

  const handleEnableDisableClassificationClick = useCallback(() => {
    if (
      !isUndefined(currentClassification) &&
      !isUndefined(handleUpdateClassification)
    ) {
      handleUpdateClassification({
        ...currentClassification,
        disabled: !isClassificationDisabled,
      });
    }
  }, [
    currentClassification,
    handleUpdateClassification,
    isClassificationDisabled,
  ]);

  const handleUpdateMutuallyExclusive = async (value: boolean) => {
    if (
      !isUndefined(currentClassification) &&
      !isUndefined(handleUpdateClassification)
    ) {
      handleUpdateClassification({
        ...currentClassification,
        mutuallyExclusive: value,
      });
    }
  };

  const editDescriptionPermission = useMemo(
    () =>
      !isVersionView &&
      !isClassificationDisabled &&
      (classificationPermissions.EditAll ||
        classificationPermissions.EditDescription),
    [classificationPermissions, isVersionView]
  );

  const isSystemClassification = useMemo(
    () => currentClassification?.provider === ProviderType.System,
    [currentClassification]
  );

  const headerBadge = useMemo(
    () =>
      isSystemClassification ? (
        <AppBadge
          icon={<LockIcon height={12} />}
          label={capitalize(currentClassification?.provider)}
        />
      ) : null,
    [isSystemClassification, currentClassification]
  );

  const createPermission = useMemo(
    () =>
      !isVersionView &&
      (createTagPermission || classificationPermissions.EditAll),
    [classificationPermissions, createTagPermission, isVersionView]
  );

  const deletePermission = useMemo(
    () => classificationPermissions.Delete && !isSystemClassification,
    [classificationPermissions, isSystemClassification]
  );

  const editDisplayNamePermission = useMemo(
    () =>
      classificationPermissions.EditAll ||
      classificationPermissions.EditDisplayName,
    [classificationPermissions]
  );

  const showDisableOption = useMemo(
    () => !isTier && isSystemClassification && editClassificationPermission,
    [isTier, isSystemClassification, editClassificationPermission]
  );

  const showManageButton = useMemo(
    () =>
      !isVersionView &&
      (editDisplayNamePermission || deletePermission || showDisableOption),
    [
      editDisplayNamePermission,
      deletePermission,
      showDisableOption,
      isVersionView,
    ]
  );

  const addTagButtonToolTip = useMemo(() => {
    if (isClassificationDisabled) {
      return t('message.disabled-classification-actions-message');
    }
    if (!createPermission) {
      return t('message.no-permission-for-action');
    }

    return null;
  }, [createPermission, isClassificationDisabled]);

  const tableColumn: ColumnsType<AutoSystem> = useMemo(
    () =>
      getTagsTableColumn({
        isClassificationDisabled,
        classificationPermissions,
        deleteTags,
        disableEditButton,
        handleEditTagClick,
        handleActionDeleteTag,
        isVersionView,
      }),
    [
      isClassificationDisabled,
      classificationPermissions,
      deleteTags,
      disableEditButton,
      handleEditTagClick,
      handleActionDeleteTag,
      isVersionView,
    ]
  );

  const extraDropdownContent = useMemo(
    () =>
      getClassificationExtraDropdownContent(
        showDisableOption,
        isClassificationDisabled,
        handleEnableDisableClassificationClick
      ),
    [
      isClassificationDisabled,
      showDisableOption,
      handleEnableDisableClassificationClick,
    ]
  );

  const name = useMemo(() => {
    return isVersionView
      ? getEntityVersionByField(
          changeDescription,
          EntityField.NAME,
          currentClassification?.name
        )
      : currentClassification?.name;
  }, [currentClassification, changeDescription]);

  const displayName = useMemo(() => {
    return isVersionView
      ? getEntityVersionByField(
          changeDescription,
          EntityField.DISPLAYNAME,
          currentClassification?.displayName
        )
      : currentClassification?.displayName;
  }, [currentClassification, changeDescription]);

  const description = useMemo(() => {
    return isVersionView
      ? getEntityVersionByField(
          changeDescription,
          EntityField.DESCRIPTION,
          currentClassification?.description
        )
      : currentClassification?.description;
  }, [currentClassification, changeDescription]);

  const mutuallyExclusive = useMemo(() => {
    return isVersionView
      ? getMutuallyExclusiveDiff(
          changeDescription,
          EntityField.MUTUALLY_EXCLUSIVE,
          toString(currentClassification?.mutuallyExclusive)
        )
      : '';
  }, [currentClassification, changeDescription]);

  return (
    <div className="p-x-md" data-testid="tags-container" >
      {currentClassification && (
        <Row data-testid="header" wrap={false}>
          <Col flex="auto">
            <EntityHeaderTitle
              badge={headerBadge}
              className={classNames({
                'opacity-60': isClassificationDisabled,
              })}
              displayName={displayName}
              icon={
                <IconTag className="h-9" style={{ color: DE_ACTIVE_COLOR }} />
              }
              isDisabled={isClassificationDisabled}
              name={name ?? currentClassification.name}
              serviceName="classification"
            />
          </Col>
        </Row>
      )}

      <div className="m-b-sm m-t-xs" data-testid="description-container" style={{ marginLeft: '10px' }}>
        <Description
          className={classNames({
            'opacity-60': isClassificationDisabled,
          })}
          description={description}
          entityName={
            currentClassification?.displayName ??
            currentClassification?.fullyQualifiedName
          }
          hasEditAccess={editDescriptionPermission}
          isEdit={isEditClassification}
          onCancel={handleCancelEditDescription}
          onDescriptionEdit={handleEditDescriptionClick}
          onDescriptionUpdate={handleUpdateDescription}
        />
      </div>

      <Space className="w-full m-b-md" direction="vertical" size="large">
        <Table
          bordered
          className={classNames('dlas_table', {
            'opacity-60': isClassificationDisabled,
          })}
          columns={tableColumn}
          data-testid="table"
          dataSource={tags}
          loading={isTagsLoading}
          locale={{
            emptyText: <ErrorPlaceHolder className="m-y-md" />,
          }}
          pagination={false}
          rowClassName={(record) => (record.disabled ? 'opacity-60' : '')}
          rowKey="id"
          size="small"
        />

        {paging.total > PAGE_SIZE && (
          <NextPrevious
            currentPage={currentPage}
            pageSize={PAGE_SIZE}
            paging={paging}
            pagingHandler={handlePageChange}
          />
        )}
      </Space>
    </div>
  );
}

export default ClassificationDetails;
