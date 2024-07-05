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
import Icon, { DownOutlined } from '@ant-design/icons';
import {
  Button,
  Col,
  Divider,
  Dropdown,
  Row,
  Space,
  Tooltip,
  Typography,
} from 'antd';
import ButtonGroup from 'antd/lib/button/button-group';
import { ItemType } from 'antd/lib/menu/hooks/useItems';
import { AxiosError } from 'axios';
import classNames from 'classnames';
import { cloneDeep, toString } from 'lodash';
import React, { useCallback, useEffect, useMemo, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { useHistory, useParams } from 'react-router-dom';
import { ReactComponent as IconTerm } from '../../../assets/svg/book.svg';
import { ReactComponent as EditIcon } from '../../../assets/svg/edit-new.svg';
import { ReactComponent as ClientCenterIcon } from '../../../assets/svg/clientCenter.svg';
import { ReactComponent as ExportIcon } from '../../../assets/svg/ic-export.svg';
import { ReactComponent as ImportIcon } from '../../../assets/svg/ic-import.svg';
import { ReactComponent as VersionIcon } from '../../../assets/svg/ic-version.svg';
import { ReactComponent as IconDropdown } from '../../../assets/svg/menu.svg';
import { ReactComponent as StyleIcon } from '../../../assets/svg/style.svg';
import { useEntityExportModalProvider } from '../../Entity/EntityExportModalProvider/EntityExportModalProvider.component';
import { EntityHeader } from '../../Entity/EntityHeader/EntityHeader.component';
import EntityDeleteModal from '../../Modals/EntityDeleteModal/EntityDeleteModal';
import EntityNameModal from '../../Modals/EntityNameModal/EntityNameModal.component';
import { OperationPermission } from '../../PermissionProvider/PermissionProvider.interface';
import Voting from '../../Voting/Voting.component';
import { VotingDataProps } from '../../Voting/voting.interface';
import { ManageButtonItemLabel } from '../../common/ManageButtonContentItem/ManageButtonContentItem.component';
import StatusBadge from '../../common/StatusBadge/StatusBadge.component';
import { FQN_SEPARATOR_CHAR } from '../../../constants/char.constants';
import { DE_ACTIVE_COLOR } from '../../../constants/constants';
import { EntityAction, EntityType } from '../../../enums/entity.enum';
import { ClientCenter } from '../../../generated/entity/data/clientCenter';
import {
  EntityReference,
  ClientCenterClient,
  Status,
} from '../../../generated/entity/data/clientCenterClient';
import { Style } from '../../../generated/type/tagLabel';
import {
  exportClientCenterInCSVFormat,
  getClientCentersById,
  getClientCenterClientsById,
} from '../../../rest/clientCenterAPI';
import { getEntityDeleteMessage } from '../../../utils/CommonUtils';
import { getEntityVoteStatus } from '../../../utils/EntityUtils';
import Fqn from '../../../utils/Fqn';
import { StatusClass } from '../../../utils/ClientCenterUtils';
import {
  getClientCenterPath,
  getClientCenterPathWithAction,
  getClientCenterClientsVersionsPath,
  getClientCenterVersionsPath,
} from '../../../utils/RouterUtils';
import SVGIcons, { Icons } from '../../../utils/SvgUtils';
import { showErrorToast } from '../../../utils/ToastUtils';
import { useAuthContext } from '../../Auth/AuthProviders/AuthProvider';
import StyleModal from '../../Modals/StyleModal/StyleModal.component';
import { TitleBreadcrumbProps } from '../../common/TitleBreadcrumb/TitleBreadcrumb.interface';

export interface ClientCenterHeaderProps {
  isVersionView?: boolean;
  supportAddOwner?: boolean;
  selectedData: ClientCenter | ClientCenterClient;
  permissions: OperationPermission;
  isClientCenter: boolean;
  onUpdate: (data: ClientCenterClient | ClientCenter) => void;
  onDelete: (id: string) => void;
  onAssetAdd?: () => void;
  updateVote?: (data: VotingDataProps) => Promise<void>;
  onAddClientCenterClient: (clientCenterClient: ClientCenterClient | undefined) => void;
}

const ClientCenterHeader = ({
  selectedData,
  permissions,
  onUpdate,
  onDelete,
  isClientCenter,
  onAssetAdd,
  onAddClientCenterClient,
  updateVote,
  isVersionView,
}: ClientCenterHeaderProps) => {
  const { t } = useTranslation();
  const history = useHistory();
  const { currentUser } = useAuthContext();

  const { fqn, version } = useParams<{
    fqn: string;
    version: string;
  }>();
  const { showModal } = useEntityExportModalProvider();
  const [breadcrumb, setBreadcrumb] = useState<
    TitleBreadcrumbProps['titleLinks']
  >([]);
  const [showActions, setShowActions] = useState(false);
  const [isDelete, setIsDelete] = useState<boolean>(false);
  const [isNameEditing, setIsNameEditing] = useState<boolean>(false);
  const [latestClientCenterData, setLatestClientCenterData] = useState<
    ClientCenter | ClientCenterClient
  >();
  const [isStyleEditing, setIsStyleEditing] = useState(false);

  // To fetch the latest clientCenter data
  // necessary to handle back click functionality to work properly in version page
  const fetchCurrentClientCenterInfo = async () => {
    try {
      const res = isClientCenter
        ? await getClientCentersById(fqn)
        : await getClientCenterClientsById(fqn);

      setLatestClientCenterData(res);
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const clientCenterClientStatus: Status | null = useMemo(() => {
    if (!isClientCenter) {
      return (selectedData as ClientCenterClient).status ?? Status.Approved;
    }

    return null;
  }, [isClientCenter, selectedData]);

  const editDisplayNamePermission = useMemo(() => {
    return permissions.EditAll || permissions.EditDisplayName;
  }, [permissions]);

  const voteStatus = useMemo(
    () => getEntityVoteStatus(currentUser?.id ?? '', selectedData.votes),
    [selectedData.votes, currentUser]
  );

  const icon = useMemo(() => {
    if (isClientCenter) {
      return (
        <ClientCenterIcon
          className="align-middle"
          color={DE_ACTIVE_COLOR}
          height={36}
          name="folder"
          width={32}
        />
      );
    }

    if ((selectedData as ClientCenterClient).style?.iconURL) {
      return (
        <img
          className="align-middle object-contain"
          data-testid="icon"
          height={36}
          src={(selectedData as ClientCenterClient).style?.iconURL}
          width={32}
        />
      );
    }

    return (
      <IconTerm
        className="align-middle"
        color={DE_ACTIVE_COLOR}
        height={36}
        name="doc"
        width={32}
      />
    );
  }, [selectedData, isClientCenter]);

  const handleAddClientCenterClientClick = useCallback(() => {
    onAddClientCenterClient(!isClientCenter ? (selectedData as ClientCenterClient) : undefined);
  }, [fqn]);

  const handleClientCenterImport = () =>
    history.push(
      getClientCenterPathWithAction(
        encodeURIComponent(selectedData.fullyQualifiedName ?? ''),
        EntityAction.IMPORT
      )
    );

  const handleVersionClick = async () => {
    let path: string;
    if (isVersionView) {
      path = getClientCenterPath(latestClientCenterData?.fullyQualifiedName);
    } else {
      path = isClientCenter
        ? getClientCenterVersionsPath(
          selectedData.id,
          toString(selectedData.version)
        )
        : getClientCenterClientsVersionsPath(
          selectedData.id,
          toString(selectedData.version)
        );
    }

    history.push(path);
  };

  const handleDelete = () => {
    const { id } = selectedData;
    onDelete(id);
    setIsDelete(false);
  };

  const onNameSave = (obj: { name: string; displayName: string }) => {
    const { name, displayName } = obj;
    let updatedDetails = cloneDeep(selectedData);

    updatedDetails = {
      ...selectedData,
      name: name?.trim() || selectedData.name,
      displayName: displayName?.trim(),
    };

    onUpdate(updatedDetails);
    setIsNameEditing(false);
  };

  const onStyleSave = (data: Style) => {
    const style: Style = {
      // if color/iconURL is empty or undefined send undefined
      color: data.color ? data.color : undefined,
      iconURL: data.iconURL ? data.iconURL : undefined,
    };
    const updatedDetails = {
      ...selectedData,
      style,
    };

    onUpdate(updatedDetails);
    setIsStyleEditing(false);
  };

  const handleUpdateVote = (data: VotingDataProps) => updateVote?.(data);

  const addButtonContent = [
    {
      label: t('label.client-center-client'),
      key: '1',
      onClick: handleAddClientCenterClientClick,
    },
    {
      label: t('label.asset-plural'),
      key: '2',
      onClick: onAssetAdd,
    },
  ];

  const handleClientCenterExportClick = useCallback(async () => {
    if (selectedData) {
      showModal({
        name: selectedData?.fullyQualifiedName || '',
        onExport: exportClientCenterInCSVFormat,
      });
    }
  }, [selectedData]);

  const manageButtonContent: ItemType[] = [
    ...(editDisplayNamePermission
      ? ([
        {
          label: (
            <ManageButtonItemLabel
              description={t('message.rename-entity', {
                entity: isClientCenter
                  ? t('label.client-center')
                  : t('label.client-center-client'),
              })}
              icon={<EditIcon color={DE_ACTIVE_COLOR} width="18px" />}
              id="rename-button"
              name={t('label.rename')}
            />
          ),
          key: 'rename-button',
          onClick: (e) => {
            e.domEvent.stopPropagation();
            setIsNameEditing(true);
            setShowActions(false);
          },
        },
      ] as ItemType[])
      : []),
    ...(permissions?.EditAll && !isClientCenter
      ? ([
        {
          label: (
            <ManageButtonItemLabel
              description={t('message.edit-entity-style-description', {
                entity: t('label.client-center-client'),
              })}
              icon={<StyleIcon color={DE_ACTIVE_COLOR} width="18px" />}
              id="rename-button"
              name={t('label.style')}
            />
          ),
          key: 'edit-style-button',
          onClick: (e) => {
            e.domEvent.stopPropagation();
            setIsStyleEditing(true);
            setShowActions(false);
          },
        },
      ] as ItemType[])
      : []),
    ...(permissions.Delete
      ? ([
        {
          label: (
            <ManageButtonItemLabel
              description={t(
                'message.delete-entity-type-action-description',
                {
                  entityType: isClientCenter
                    ? t('label.client-center')
                    : t('label.client-center-client'),
                }
              )}
              icon={<SVGIcons alt="Delete" icon={Icons.DELETE} />}
              id="delete-button"
              name={t('label.delete')}
            />
          ),
          key: 'delete-button',
          onClick: (e) => {
            e.domEvent.stopPropagation();
            setIsDelete(true);
            setShowActions(false);
          },
        },
      ] as ItemType[])
      : []),
  ];

  const statusBadge = useMemo(() => {
    if (!isClientCenter) {
      const entityStatus =
        (selectedData as ClientCenterClient).status ?? Status.Approved;

      return (
        <Space>
          <Divider className="m-x-xs h-6" type="vertical" />
          <StatusBadge
            label={entityStatus}
            status={StatusClass[entityStatus]}
          />
        </Space>
      );
    }

    return null;
  }, [isClientCenter, selectedData]);

  const createButtons = useMemo(() => {
    if (permissions.Create) {
      return isClientCenter ? (
        <Button
          className="m-l-xs"
          data-testid="add-new-tag-button-header"
          size="middle"
          type="primary"
          onClick={handleAddClientCenterClientClick}>
          {t('label.add-entity', { entity: t('label.client-lowercase-v') })}
        </Button>
      ) : (
        <>
          {clientCenterClientStatus && clientCenterClientStatus === Status.Approved && (

            <Button
              data-testid="client-center-client-add-button-menu"
              type="primary"
              onClick={handleAddClientCenterClientClick}>
              <Space>
                {t('label.add-entity', {
                  entity: t('label.client-lowercase-v'),
                })}
              </Space>
            </Button>
          )}
        </>
      );
    }

    return null;
  }, [isClientCenter, permissions, addButtonContent, clientCenterClientStatus]);

  /**
   * To create breadcrumb from the fqn
   * @param fqn fqn of clientCenter or clientCenter client
   */
  const handleBreadcrumb = (fqn: string) => {
    if (!fqn) {
      return;
    }

    const arr = !isClientCenter ? Fqn.split(fqn) : Fqn.split(fqn);// was const arr = !isClientCenter ? Fqn.split(fqn) : [];
    const dataFQN: Array<string> = [];
    const newData = [
      {
        name: 'Тип клиентов',
        url: getClientCenterPath(arr[0]),
        activeTitle: false,
      },
      ...arr.slice(0, -1).map((d) => {
        dataFQN.push(d);

        return {
          name: d,
          url: getClientCenterPath(dataFQN.join(FQN_SEPARATOR_CHAR)),
          activeTitle: false,
        };
      }),
    ];

    setBreadcrumb(newData);
  };

  useEffect(() => {
    const { fullyQualifiedName, name } = selectedData;
    handleBreadcrumb(fullyQualifiedName ? fullyQualifiedName : name);
  }, [selectedData]);

  useEffect(() => {
    if (isVersionView) {
      fetchCurrentClientCenterInfo();
    }
  }, []);

  return (
    <>
      <Row gutter={[0, 16]} justify="space-between" wrap={false}>
        <Col className="d-flex" flex="auto">
          <EntityHeader
            // badge={statusBadge}
            breadcrumb={breadcrumb}
            entityData={selectedData}
            entityType={EntityType.CLIENT_CENTER_CLIENT}
            icon={icon}
            serviceName=""
            titleColor={
              isClientCenter
                ? undefined
                : (selectedData as ClientCenterClient).style?.color
            }
          />
        </Col>
        <Col flex="360px">
          <div className="d-flex gap-2 justify-end">
            {createButtons}

            <ButtonGroup className="p-l-xs" size="small">
              {updateVote && (
                <Voting
                  voteStatus={voteStatus}
                  votes={selectedData.votes}
                  onUpdateVote={handleUpdateVote}
                />
              )}

              {selectedData && selectedData.version && (
                <Button
                  className={classNames('', {
                    'text-primary border-primary': version,
                  })}
                  data-testid="version-button"
                  icon={<Icon component={VersionIcon} />}
                  onClick={handleVersionClick}>
                  <Typography.Text
                    className={classNames('', {
                      'text-primary': version,
                    })}>
                    {toString(selectedData.version)}
                  </Typography.Text>
                </Button>
              )}

              {!isVersionView && manageButtonContent.length > 0 && (
                <Dropdown
                  align={{ targetOffset: [-12, 0] }}
                  className="m-l-xs"
                  menu={{
                    items: manageButtonContent,
                  }}
                  open={showActions}
                  overlayClassName="client-center-manage-dropdown-list-container"
                  overlayStyle={{ width: '350px' }}
                  placement="bottomRight"
                  trigger={['click']}
                  onOpenChange={setShowActions}>
                  <Tooltip placement="right">
                    <Button
                      className="client-center-manage-dropdown-button tw-px-1.5"
                      data-testid="manage-button"
                      icon={
                        <IconDropdown className="vertical-align-inherit manage-dropdown-icon" />
                      }
                      onClick={() => setShowActions(true)}
                    />
                  </Tooltip>
                </Dropdown>
              )}
            </ButtonGroup>
          </div>
        </Col>
      </Row>
      {selectedData && (
        <EntityDeleteModal
          bodyText={getEntityDeleteMessage(selectedData.name, '')}
          entityName={selectedData.name}
          entityType="ClientCenter"
          loadingState="success"
          visible={isDelete}
          onCancel={() => setIsDelete(false)}
          onConfirm={handleDelete}
        />
      )}

      <EntityNameModal
        entity={selectedData as EntityReference}
        title={t('label.edit-entity', {
          entity: t('label.name'),
        })}
        visible={isNameEditing}
        onCancel={() => setIsNameEditing(false)}
        onSave={onNameSave}
      />

      <StyleModal
        open={isStyleEditing}
        style={(selectedData as ClientCenterClient).style}
        onCancel={() => setIsStyleEditing(false)}
        onSubmit={onStyleSave}
      />
    </>
  );
};

export default ClientCenterHeader;
