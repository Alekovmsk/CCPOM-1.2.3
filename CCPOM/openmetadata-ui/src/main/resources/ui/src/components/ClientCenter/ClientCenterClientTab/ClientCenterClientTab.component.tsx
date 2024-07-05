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

import {
  Button,
  Col,
  Modal,
  Row,
  Space,
  Table,
  TableProps,
  Tooltip,
} from 'antd';
import { ColumnsType, ExpandableConfig } from 'antd/lib/table/interface';
import { AxiosError } from 'axios';
import classNames from 'classnames';
import { compare } from 'fast-json-patch';
import { isEmpty, isUndefined } from 'lodash';
import React, { useCallback, useEffect, useMemo, useState } from 'react';
import { DndProvider } from 'react-dnd';
import { HTML5Backend } from 'react-dnd-html5-backend';
import { useTranslation } from 'react-i18next';
import { Link } from 'react-router-dom';
import { ReactComponent as EditIcon } from '../../../assets/svg/edit-new.svg';
import { ReactComponent as DownUpArrowIcon } from '../../../assets/svg/ic-down-up-arrow.svg';
import { ReactComponent as UpDownArrowIcon } from '../../../assets/svg/ic-up-down-arrow.svg';
import { ReactComponent as PlusOutlinedIcon } from '../../../assets/svg/plus-outlined.svg';
import ErrorPlaceHolder from '../../common/ErrorWithPlaceholder/ErrorPlaceHolder';
import Loader from '../../Loader/Loader';
import { DE_ACTIVE_COLOR } from '../../../constants/constants';
import { CLIENT_CENTER_DOCS } from '../../../constants/docs.constants';
import { TABLE_CONSTANTS } from '../../../constants/Teams.constants';
import { ERROR_PLACEHOLDER_TYPE } from '../../../enums/common.enum';
import {
  EntityReference,
  ClientCenterClient,
  Status,
} from '../../../generated/entity/data/clientCenterClient';
import { patchClientCenterClient } from '../../../rest/clientCenterAPI';
import { Transi18next } from '../../../utils/CommonUtils';
import { getEntityName } from '../../../utils/EntityUtils';
import Fqn from '../../../utils/Fqn';
import {
  buildTree,
  StatusClass,
  StatusFilters,
} from '../../../utils/ClientCenterUtils';
import { getClientCenterPath } from '../../../utils/RouterUtils';
import {
  FilterIcon,
  getTableExpandableConfig,
} from '../../../utils/TableUtils';
import { showErrorToast } from '../../../utils/ToastUtils';
import { DraggableBodyRowProps } from '../../Draggable/DraggableBodyRowProps.interface';
import {
  ClientCenterClientTabProps,
  ModifiedClientCenterClient,
  MoveClientCenterClientType,
} from './ClientCenterClientTab.interface';

const ClientCenterClientTab = ({
  childClientCenterClients = [],
  refreshClientCenterClients,
  permissions,
  isClientCenter,
  selectedData,
  clientsLoading,
  onAddClientCenterClient,
  onEditClientCenterClient,
  className,
}: ClientCenterClientTabProps) => {
  const { t } = useTranslation();
  const [isLoading, setIsLoading] = useState(true);
  const [clientCenterClients, setClientCenterClients] = useState<ModifiedClientCenterClient[]>(
    []
  );

  const [expandedRowKeys, setExpandedRowKeys] = useState<string[]>([]);
  const [movedClientCenterClient, setMovedClientCenterClient] =
    useState<MoveClientCenterClientType>();
  const [isModalOpen, setIsModalOpen] = useState<boolean>(false);
  const [isTableLoading, setIsTableLoading] = useState(false);
  const [isTableHovered, setIsTableHovered] = useState(false);

  const clientCenterClientStatus: Status | null = useMemo(() => {
    if (!isClientCenter) {
      return (selectedData as ClientCenterClient).status ?? Status.Approved;
    }

    return null;
  }, [isClientCenter, selectedData]);

  const columns = useMemo(() => {
    const data: ColumnsType<ModifiedClientCenterClient> = [
      {
        title: t('label.client-plural'),
        dataIndex: 'name',
        key: 'name',
        className: 'client-center-name-column w-max-400 truncate',
        render: (_, record) => {
          const name = getEntityName(record);

          return (
            <Space align="center">
              {record.style?.iconURL && (
                <img
                  data-testid="tag-icon"
                  src={record.style.iconURL}
                  width={16}
                />
              )}
              <Link
                className="cursor-pointer help-text"
                data-testid={name}
                style={{ color: record.style?.color }}
                to={getClientCenterPath(record.fullyQualifiedName || record.name)}>
                {name}
              </Link>
            </Space>
          );
        },
      },
      // {
      //   title: t('label.description'),
      //   dataIndex: 'description',
      //   key: 'description',
      //   render: (description: string) =>
      //     description.trim() ? (
      //       <RichTextEditorPreviewer
      //         enableSeeMoreVariant
      //         markdown={description}
      //         maxLength={120}
      //       />
      //     ) : (
      //       <span className="text-grey-muted">{t('label.no-description')}</span>
      //     ),
      // },
      // {
      //   title: t('label.owner'),
      //   dataIndex: 'owner',
      //   key: 'owner',
      //   render: (owner: EntityReference) => <OwnerLabel owner={owner} />,
      // },
      // {
      //   title: t('label.status'),
      //   dataIndex: 'status',
      //   key: 'status',
      //   filterIcon: FilterIcon,
      //   filters: StatusFilters,
      //   render: (_, record) => {
      //     const status = record.status ?? Status.Approved;

      //     return (
      //       <StatusBadge
      //         dataTestId={record.fullyQualifiedName + '-status'}
      //         label={status}
      //         status={StatusClass[status]}
      //       />
      //     );
      //   },
      //   onFilter: (value, record) => record.status === value,
      // },
    ];
    if (permissions.Create) {
      data.push({
        title: t('label.action-plural'),
        key: 'new-client',
        width: 80,
        render: (_, record) => {
          const status = record.status ?? Status.Approved;
          const allowAddClient = status === Status.Approved;

          return (
            <div className="d-flex items-center">
              {allowAddClient && (
                <Tooltip
                  title={t('label.add-entity', {
                    entity: t('label.client-center-client-v'),
                  })}>
                  <Button
                    className="add-new-client-btn text-grey-muted flex-center"
                    data-testid="add-classification"
                    icon={
                      <PlusOutlinedIcon color={DE_ACTIVE_COLOR} width="14px" />
                    }
                    size="small"
                    type="text"
                    onClick={() => {
                      onAddClientCenterClient(record as ClientCenterClient);
                    }}
                  />
                </Tooltip>
              )}

              {/* <Tooltip
                title={t('label.edit-entity', {
                  entity: t('label.client-center-client'),
                })}>
                <Button
                  className="cursor-pointer flex-center"
                  data-testid="edit-button"
                  icon={<EditIcon color={DE_ACTIVE_COLOR} width="14px" />}
                  size="small"
                  type="text"
                  onClick={() => onEditClientCenterClient(record as ClientCenterClient)}
                />
              </Tooltip> */}
            </div>
          );
        },
      });
    }

    return data;
  }, [clientCenterClients, permissions]);

  const handleAddClientCenterClientClick = () => {
    onAddClientCenterClient(!isClientCenter ? (selectedData as ClientCenterClient) : undefined);
  };

  const expandableConfig: ExpandableConfig<ModifiedClientCenterClient> = useMemo(
    () => ({
      ...getTableExpandableConfig<ModifiedClientCenterClient>(true),
      expandedRowKeys,
      onExpand: (expanded, record) => {
        setExpandedRowKeys(
          expanded
            ? [...expandedRowKeys, record.fullyQualifiedName || '']
            : expandedRowKeys.filter((key) => key !== record.fullyQualifiedName)
        );
      },
    }),
    [expandedRowKeys]
  );

  const handleMoveRow = useCallback(
    async (dragRecord: ClientCenterClient, dropRecord?: ClientCenterClient) => {
      const dropRecordFqnPart =
        Fqn.split(dragRecord.fullyQualifiedName).length === 2;

      if (isUndefined(dropRecord) && dropRecordFqnPart) {
        return;
      }
      if (dragRecord.id === dropRecord?.id) {
        return;
      }

      setMovedClientCenterClient({
        from: dragRecord,
        to: dropRecord,
      });
      setIsModalOpen(true);
    },
    []
  );

  const handleTableHover = (value: boolean) => setIsTableHovered(value);

  const handleChangeClientCenterClient = async () => {
    if (movedClientCenterClient) {
      setIsTableLoading(true);
      const newClientData = {
        ...movedClientCenterClient.from,
        parent: isUndefined(movedClientCenterClient.to)
          ? null
          : {
              fullyQualifiedName: movedClientCenterClient.to.fullyQualifiedName,
            },
      };
      const jsonPatch = compare(movedClientCenterClient.from, newClientData);

      try {
        await patchClientCenterClient(movedClientCenterClient.from?.id || '', jsonPatch);
        refreshClientCenterClients && refreshClientCenterClients();
      } catch (error) {
        showErrorToast(error as AxiosError);
      } finally {
        setIsTableLoading(false);
        setIsModalOpen(false);
        setIsTableHovered(false);
      }
    }
  };

  const onTableRow: TableProps<ModifiedClientCenterClient>['onRow'] = (
    record,
    index
  ) =>
    ({
      index,
      handleMoveRow,
      handleTableHover,
      record,
    } as DraggableBodyRowProps<ClientCenterClient>);

  const onTableHeader: TableProps<ModifiedClientCenterClient>['onHeaderRow'] = () =>
    ({
      handleMoveRow,
      handleTableHover,
    } as DraggableBodyRowProps<ClientCenterClient>);

  const toggleExpandAll = () => {
    if (expandedRowKeys.length === childClientCenterClients.length) {
      setExpandedRowKeys([]);
    } else {
      setExpandedRowKeys(
        childClientCenterClients.map((item) => item.fullyQualifiedName || '')
      );
    }
  };

  const onDragConfirmationModalClose = useCallback(() => {
    setIsModalOpen(false);
    setIsTableHovered(false);
  }, []);

  useEffect(() => {
    if (childClientCenterClients) {
      const data = buildTree(childClientCenterClients);
      setClientCenterClients(data as ModifiedClientCenterClient[]);
      setExpandedRowKeys(
        childClientCenterClients.map((item) => item.fullyQualifiedName || '')
      );
    }
    setIsLoading(false);
  }, [childClientCenterClients]);

  if (clientsLoading || isLoading) {
    return <Loader />;
  }

  if (isEmpty(clientCenterClients)) {
    return (
      <ErrorPlaceHolder
        className="m-t-xlg"
        doc={CLIENT_CENTER_DOCS}
        heading={t('label.client-center-client')}
        permission={permissions.Create}
        type={
          permissions.Create && clientCenterClientStatus === Status.Approved
            ? ERROR_PLACEHOLDER_TYPE.CREATE
            : ERROR_PLACEHOLDER_TYPE.NO_DATA
        }
        onClick={handleAddClientCenterClientClick}
      />
    );
  }

  return (
    <Row className={className} gutter={[0, 16]}>
      <Col span={24}>
        <div className="d-flex justify-end">
          <Button
            className="text-primary m-b-sm"
            size="small"
            type="text"
            onClick={toggleExpandAll}>
            <Space align="center" size={4}>
              {expandedRowKeys.length === childClientCenterClients.length ? (
                <DownUpArrowIcon color={DE_ACTIVE_COLOR} height="14px" />
              ) : (
                <UpDownArrowIcon color={DE_ACTIVE_COLOR} height="14px" />
              )}

              {expandedRowKeys.length === childClientCenterClients.length
                ? t('label.collapse-all')
                : t('label.expand-all')}
            </Space>
          </Button>
        </div>
        {clientCenterClients.length > 0 ? (
          <DndProvider backend={HTML5Backend}>
            <Table
              bordered
              className={classNames('drop-over-background', {
                'drop-over-table': isTableHovered,
              }) + ' antd-table-client-center'}
              columns={columns}
              components={TABLE_CONSTANTS}
              dataSource={clientCenterClients}
              expandable={expandableConfig}
              loading={isTableLoading}
              pagination={false}
              rowKey="fullyQualifiedName"
              scroll={{ x: true }}
              size="small"
              tableLayout="auto"
              onHeaderRow={onTableHeader}
              onRow={onTableRow}
            />
          </DndProvider>
        ) : (
          <ErrorPlaceHolder />
        )}
        <Modal
          centered
          destroyOnClose
          closable={false}
          confirmLoading={isTableLoading}
          data-testid="confirmation-modal"
          maskClosable={false}
          okText={t('label.confirm')}
          open={isModalOpen}
          title={t('label.move-the-entity', {
            entity: t('label.client-center-client'),
          })}
          onCancel={onDragConfirmationModalClose}
          onOk={handleChangeClientCenterClient}>
          <Transi18next
            i18nKey="message.entity-transfer-message"
            renderElement={<strong />}
            values={{
              from: movedClientCenterClient?.from.name,
              to: movedClientCenterClient?.to?.name ?? getEntityName(selectedData),
              entity: isUndefined(movedClientCenterClient?.to)
                ? ''
                : t('label.client-lowercase'),
            }}
          />
        </Modal>
      </Col>
    </Row>
  );
};

export default ClientCenterClientTab;
