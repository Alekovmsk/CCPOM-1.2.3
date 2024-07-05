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
  DomainTeamMember
} from '../../../../generated/entity/domains/domain';
import { ChangeDescription } from '../../../../generated/entity/type';
import {
  getChangedEntityNewValue,
  getChangedEntityOldValue,
  getDiffByFieldName,
} from '../../../../utils/EntityVersionUtils';
import { VersionStatus } from '../../../../utils/EntityVersionUtils.interface';
import DomainTeamModal from './DomainTeamModal.component';

interface DomainTeamProps {
  isVersionView?: boolean;
  domain: Domain;
  hasPermission: boolean;
  onDomainUpdate: (domain: Domain) => void;
}

const DomainTeam = ({
  domain,
  hasPermission,
  onDomainUpdate,
  isVersionView,
}: DomainTeamProps) => {
  const [domainTeam, setDomainTeam] = useState<DomainTeamMember[]>([]);
  const [isViewMode, setIsViewMode] = useState<boolean>(true);

  const handleDomainTeamSave = async (
    newDomainTeam: DomainTeamMember[],
    updateState?: boolean
  ) => {
    try {
      const updatedRef = newDomainTeam.filter(
        (ref) => ref
      );
      if (!isEqual(updatedRef, domain.domainTeam)) {
        let updatedDomain = cloneDeep(domain);
        updatedDomain = {
          ...updatedDomain,
          domainTeam: updatedRef,
        };

        onDomainUpdate(updatedDomain);
        if (updateState) {
          setDomainTeam(updatedRef);
        }
      }
      setIsViewMode(true);
    } catch (error) {
      // Added catch block to prevent uncaught promise
    }
  };

  const onDomainTeamMemberModalSave = (values: DomainTeamMember[]) => {
    handleDomainTeamSave(values);
  };

  useEffect(() => {
    setDomainTeam(domain.domainTeam ? domain.domainTeam : []);
  }, [domain.domainTeam]);

  const getDomainTeamMemberElementsTable = useCallback(
    (ref: DomainTeamMember, versionStatus?: VersionStatus) => {
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
        fullName: ref.fullName,
        ssp: ref.ssp,
        role: ref.role,
        responseArea: ref.responseArea,
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
      title: t('label.domain-team-member-full-name'),
      dataIndex: 'fullName',
      key: 'fullName',
    },
    {
      title: t('label.domain-team-member-ssp'),
      dataIndex: 'ssp',
      key: 'ssp',
    },
    {
      title: t('label.domain-team-member-role'),
      dataIndex: 'role',
      key: 'role',
    },
    {
      title: t('label.domain-team-member-response-area'),
      dataIndex: 'responseArea',
      key: 'responseArea',
    },
  ]

  const getVersionDomainTeamMemberElements = useCallback(() => {
    const changeDescription = domain.changeDescription;
    const domainTeamDiff = getDiffByFieldName(
      EntityField.ENTITY_LIST,
      changeDescription as ChangeDescription
    );

    const addedDomainTeam: DomainTeamMember[] = JSON.parse(
      getChangedEntityNewValue(domainTeamDiff) ?? '[]'
    );
    const deletedDomainTeam: DomainTeamMember[] = JSON.parse(
      getChangedEntityOldValue(domainTeamDiff) ?? '[]'
    );

    const unchangedDomainTeam = domain.domainTeam
      ? domain.domainTeam.filter(
        (domainTeamMember) =>
          !addedDomainTeam.find(
            (addedDomainTeamMember: DomainTeamMember) =>
              addedDomainTeamMember === domainTeamMember
          )
      )
      : [];

    const noSynonyms =
      isEmpty(unchangedDomainTeam) &&
      isEmpty(addedDomainTeam) &&
      isEmpty(deletedDomainTeam);

    if (noSynonyms) {
      return <div>{NO_DATA_PLACEHOLDER}</div>;
    }

    return (
      <div>
        {unchangedDomainTeam.map((domainTeamMember) => getDomainTeamMemberElementsTable(domainTeamMember))}
        {addedDomainTeam.map((domainTeamMember) =>
          getDomainTeamMemberElementsTable(domainTeamMember, { added: true })
        )}
        {deletedDomainTeam.map((domainTeamMember) =>
          getDomainTeamMemberElementsTable(domainTeamMember, { removed: true })
        )}
      </div>
    );
  }, [domain]);

  return (
    <div data-testid="domainTeam-container">
      <div className="w-full">
        <Space
          className="w-full"
          data-testid={`section-${t('label.domain-team')}`}>
          <div className="flex-center">
            <Typography.Text className="right-panel-label">
              {t('label.domain-team')}
            </Typography.Text>
            {domainTeam.length > 0 && hasPermission && (
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
            getVersionDomainTeamMemberElements()
          ) : (
            <div>
              {hasPermission && domainTeam.length === 0 && (
                <TagButton
                  className="text-primary cursor-pointer"
                  dataTestId="term-domainTeam-add-button"
                  icon={<PlusIcon height={16} name="plus" width={16} />}
                  label={t('label.add')}
                  tooltip=""
                  onClick={() => {
                    setIsViewMode(false);
                  }}
                />
              )}
              <Table
                dataSource={domainTeam.map((ref) => getDomainTeamMemberElementsTable(ref))}
                columns={columns}
                locale={{ emptyText: '' }}
              />
              {/* {domainTeam.map((ref) => getDomainTeamMemberElementsTable(ref))} */}
              {!hasPermission && domainTeam.length === 0 && (
                <div>{NO_DATA_PLACEHOLDER}</div>
              )}
            </div>
          )}
        </>
      </div>

      <DomainTeamModal
        isVisible={!isViewMode}
        domainTeam={domainTeam || []}
        onClose={() => {
          setIsViewMode(true);
        }}
        onSave={(values: DomainTeamMember[]) => {
          onDomainTeamMemberModalSave(values);
        }}
      />
    </div>
  );
};

export default DomainTeam;
