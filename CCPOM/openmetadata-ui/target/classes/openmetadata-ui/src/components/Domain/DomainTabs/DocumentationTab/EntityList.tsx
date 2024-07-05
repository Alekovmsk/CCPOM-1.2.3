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

import { Button, Card, Col, Input, Space, Table, Tag, Tooltip, Typography } from 'antd';
import classNames from 'classnames';
import { t } from 'i18next';
import { cloneDeep, isEmpty, isEqual } from 'lodash';
import React, { useCallback, useEffect, useState } from 'react';
import { ReactComponent as EditIcon } from '../../../../assets/svg/edit-new.svg';
import { ReactComponent as ExternalLinkIcon } from '../../../../assets/svg/external-links.svg';
import { ReactComponent as PlusIcon } from '../../../../assets/svg/plus-primary.svg';
import { OperationPermission } from '../../../PermissionProvider/PermissionProvider.interface';
import TagButton from '../../../TagButton/TagButton.component';
import {
  DE_ACTIVE_COLOR,
  LITE_GRAY_COLOR,
  LITE_SUCCESS_COLOR,
  LITE_TEXT_BODY_COLOR,
  NO_DATA_PLACEHOLDER,
  SUCCESS_COLOR,
  TEXT_BODY_COLOR,
  TEXT_GREY_MUTED,
  TEXT_GREY_MUTED_LIGHT,
} from '../../../../constants/constants';
import { EntityField } from '../../../../constants/Feeds.constants';
import { NO_PERMISSION_FOR_ACTION } from '../../../../constants/HelperTextUtil';
import {
  EntityEl,
  Perimeter
} from '../../../../generated/entity/domains/perimeter';
import { ChangeDescription } from '../../../../generated/entity/type';
import {
  getChangedEntityNewValue,
  getChangedEntityOldValue,
  getDiffByFieldName,
} from '../../../../utils/EntityVersionUtils';
import { VersionStatus } from '../../../../utils/EntityVersionUtils.interface';
import EntityListModal from './EntityListModal.component';

interface EntityListProps {
  isVersionView?: boolean;
  perimeter: Perimeter;
  hasPermission: boolean;
  onPerimeterUpdate: (perimeter: Perimeter) => void;
}

const EntityList = ({
  perimeter,
  hasPermission,
  onPerimeterUpdate,
  isVersionView,
}: EntityListProps) => {
  const [entityList, setEntityList] = useState<EntityEl[]>([]);
  const [isViewMode, setIsViewMode] = useState<boolean>(true);

  const handleEntityListSave = async (
    newEntityList: EntityEl[],
    updateState?: boolean
  ) => {
    try {
      const updatedRef = newEntityList.filter(
        (ref) => ref
      );
      if (!isEqual(updatedRef, perimeter.entityList)) {
        let updatedPerimeter = cloneDeep(perimeter);
        updatedPerimeter = {
          ...updatedPerimeter,
          entityList: updatedRef,
        };

        onPerimeterUpdate(updatedPerimeter);
        if (updateState) {
          setEntityList(updatedRef);
        }
      }
      setIsViewMode(true);
    } catch (error) {
      // Added catch block to prevent uncaught promise
    }
  };

  const onDomainEntityModalSave = (values: EntityEl[]) => {
    handleEntityListSave(values);
  };

  useEffect(() => {
    setEntityList(perimeter.entityList ? perimeter.entityList : []);
  }, [perimeter.entityList]);

  const getDomainEntityElementsTable = useCallback(
    (ref: EntityEl, versionStatus?: VersionStatus) => {
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

      return <Card style={{ margin: '8px 0px' }} 
            bodyStyle={{backgroundColor: iconColor}}
            >
        <span className={textClassName}>{ref.db + '.' + ref.schema + '.' + ref.name}</span></Card>;
    },
    []
  );

  const getVersionDomainEntityElements = useCallback(() => {
    const changeDescription = perimeter.changeDescription;
    const entityListDiff = getDiffByFieldName(
      EntityField.ENTITY_LIST,
      changeDescription as ChangeDescription
    );

    const addedEntityList: EntityEl[] = JSON.parse(
      getChangedEntityNewValue(entityListDiff) ?? '[]'
    );
    const deletedEntityList: EntityEl[] = JSON.parse(
      getChangedEntityOldValue(entityListDiff) ?? '[]'
    );

    const unchangedEntityList = perimeter.entityList
      ? perimeter.entityList.filter(
        (domainEntity) =>
          !addedEntityList.find(
            (addedDomainEntity: EntityEl) =>
              addedDomainEntity === domainEntity
          )
      )
      : [];

    const noSynonyms =
      isEmpty(unchangedEntityList) &&
      isEmpty(addedEntityList) &&
      isEmpty(deletedEntityList);

    if (noSynonyms) {
      return <div>{NO_DATA_PLACEHOLDER}</div>;
    }

    return (
      <div>
        {unchangedEntityList.map((domainEntity) => getDomainEntityElementsTable(domainEntity))}
        {addedEntityList.map((domainEntity) =>
          getDomainEntityElementsTable(domainEntity, { added: true })
        )}
        {deletedEntityList.map((domainEntity) =>
          getDomainEntityElementsTable(domainEntity, { removed: true })
        )}
      </div>
    );
  }, [perimeter]);

  return (
    <div data-testid="entityList-container">
      <div className="w-full">
        <Space
          className="w-full"
          data-testid={`section-${t('label.domain-entity-plural')}`}>
          <div className="flex-center">
            <Typography.Text className="right-panel-label">
              {t('label.domain-entity-plural')}
            </Typography.Text>
            {entityList.length > 0 && hasPermission && (
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
            getVersionDomainEntityElements()
          ) : (
            <div>
              {/* <Table showHeader={false}
                dataSource={entityList.map((ref) => { return { entity: ref } })}
                columns={[{ title: 'Сущность', dataIndex: 'entity', key: 'entity' }]}
                locale={{ emptyText: '' }}
              /> */}
              {/* {entityList.map((ref) => getDomainEntityElement(ref))} */}
              {entityList.map((ref) => getDomainEntityElementsTable(ref))}
              {hasPermission && entityList.length === 0 && (
                <TagButton
                  className="text-primary cursor-pointer"
                  dataTestId="term-entityList-add-button"
                  icon={<PlusIcon height={16} name="plus" width={16} />}
                  label={t('label.add')}
                  tooltip=""
                  onClick={() => {
                    setIsViewMode(false);
                  }}
                />
              )}
              {!hasPermission && entityList.length === 0 && (
                <div>{NO_DATA_PLACEHOLDER}</div>
              )}
            </div>
          )}
        </>
      </div>

      <EntityListModal
        isVisible={!isViewMode}
        entityList={entityList || []}
        onClose={() => {
          setIsViewMode(true);
        }}
        onSave={(values: EntityEl[]) => {
          onDomainEntityModalSave(values);
        }}
      />
    </div>
  );
};

export default EntityList;
