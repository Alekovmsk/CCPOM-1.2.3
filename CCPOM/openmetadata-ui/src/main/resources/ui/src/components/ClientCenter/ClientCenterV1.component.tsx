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

import { AxiosError } from 'axios';
import { compare } from 'fast-json-patch';
import { cloneDeep, isEmpty } from 'lodash';
import React, { RefObject, useCallback, useEffect, useMemo, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { useHistory, useParams } from 'react-router-dom';
import { withActivityFeed } from '../AppRouter/withActivityFeed';
import Loader from '../Loader/Loader';
import { HTTP_STATUS_CODE } from '../../constants/auth.constants';
import {
  API_RES_MAX_SIZE,
  getClientCenterClientDetailsPath,
  PAGE_SIZE_CLIENTS,
} from '../../constants/constants';
import { EntityAction } from '../../enums/entity.enum';
import {
  CreateThread,
  ThreadType,
} from '../../generated/api/feed/createThread';
import { ClientCenter } from '../../generated/entity/data/clientCenter';
import { ClientCenterClient } from '../../generated/entity/data/clientCenterClient';
import { VERSION_VIEW_CLIENT_CENTER_PERMISSION } from '../../mocks/ClientCenter.mock';
import { postThread } from '../../rest/feedsAPI';
import {
  addClientCenterClient,
  getClientCenterClients,
  ListClientCenterClientsParams,
  patchClientCenterClient,
} from '../../rest/clientCenterAPI';
import { getEntityDeleteMessage } from '../../utils/CommonUtils';
import { DEFAULT_ENTITY_PERMISSION } from '../../utils/PermissionsUtils';
import { showErrorToast } from '../../utils/ToastUtils';
import { useActivityFeedProvider } from '../ActivityFeed/ActivityFeedProvider/ActivityFeedProvider';
import ActivityThreadPanel from '../ActivityFeed/ActivityThreadPanel/ActivityThreadPanel';
import EntityDeleteModal from '../Modals/EntityDeleteModal/EntityDeleteModal';
import { usePermissionProvider } from '../PermissionProvider/PermissionProvider';
import {
  OperationPermission,
  ResourceEntity,
} from '../PermissionProvider/PermissionProvider.interface';
import { ClientCenterClientForm } from './AddClientCenterClientForm/AddClientCenterClientForm.interface';
import ClientCenterDetails from './ClientCenterDetails/ClientCenterDetails.component';
import ClientCenterClientModal from './ClientCenterClientModal/ClientCenterClientModal.component';
import ClientCenterClientsV1 from './ClientCenterClients/ClientCenterClientsV1.component';
import { ClientCenterV1Props } from './ClientCenterV1.interfaces';
import './clientCenterV1.less';
import { Paging } from '../../generated/type/paging';
import { CursorType } from '../../enums/pagination.enum';
import { Col, Row } from 'antd';

const ClientCenterV1 = ({
  isClientCenterActive,
  deleteStatus = 'initial',
  selectedData,
  onClientCenterClientUpdate,
  updateClientCenter,
  updateVote,
  onClientCenterDelete,
  onClientCenterClientDelete,
  isVersionsView,
  onAssetClick,
  isSummaryPanelOpen,
  refreshActiveClientCenterClient,
  headerVisible = true
}: ClientCenterV1Props) => {
  const { t } = useTranslation();
  const { action, tab } =
    useParams<{ action: EntityAction; clientCenterName: string; tab: string }>();
  const history = useHistory();
  const [threadLink, setThreadLink] = useState<string>('');
  const [threadType, setThreadType] = useState<ThreadType>(
    ThreadType.Conversation
  );
  const { postFeed, deleteFeed, updateFeed } = useActivityFeedProvider();

  const { getEntityPermission } = usePermissionProvider();
  const [isLoading, setIsLoading] = useState(true);
  const [isClientsLoading, setIsClientsLoading] = useState(false);

  const [isDelete, setIsDelete] = useState<boolean>(false);

  const [clientCenterPermission, setClientCenterPermission] =
    useState<OperationPermission>(DEFAULT_ENTITY_PERMISSION);

  const [clientCenterClientPermission, setClientCenterClientPermission] =
    useState<OperationPermission>(DEFAULT_ENTITY_PERMISSION);

  const [isEditModalOpen, setIsEditModalOpen] = useState(false);
  const [activeClientCenterClient, setActiveClientCenterClient] = useState<
    ClientCenterClient | undefined
  >();
  const [editMode, setEditMode] = useState(false);

  const [clientCenterClients, setClientCenterClients] = useState<ClientCenterClient[]>([]);
  const { id } = selectedData ?? {};
  const [paging, setPaging] = useState<Paging>({} as Paging);

  const onThreadPanelClose = () => {
    setThreadLink('');
  };

  const onThreadLinkSelect = (link: string, threadType?: ThreadType) => {
    setThreadLink(link);
    if (threadType) {
      setThreadType(threadType);
    }
  };

  const fetchClientCenterClient = async (
    params?: ListClientCenterClientsParams,
    refresh?: boolean,
    paging?: Paging
  ) => {
    // refresh ? setIsClientsLoading(true) : setIsLoading(true);
    try {
      const clientsResponse = await getClientCenterClients({
        ...params,
        // limit: API_RES_MAX_SIZE,
        fields: 'tags,children,reviewers,relatedClients,owner,parent',
        after: paging && paging.after,
        before: paging && paging.before,
        limit: PAGE_SIZE_CLIENTS,
      });
      const AllClientsData = clientCenterClients.concat(clientsResponse.data);
      setClientCenterClients(AllClientsData);
      setPaging(clientsResponse.paging);
    } catch (error) {
      showErrorToast(error as AxiosError);
    } finally {
      refresh ? setIsClientsLoading(false) : setIsLoading(false);
    }
  };


  const fetchMoreClients = useCallback(
    (isElementInView: boolean, cursor: string | number) => {
      const pagination = {
        [cursor]: paging[cursor as keyof Paging] as string,
        total: paging.total,
      } as Paging;
      if (
        isElementInView &&
        pagination?.after // &&
        // !setIsLoading
      ) {
        fetchClientCenterClient(
          isClientCenterActive ? { clientCenter: id } : { parent: id },
          false,
          pagination
        );
      }
    },
    [setIsLoading, fetchClientCenterClient]
  );

  // useEffect(() => {
  //   fetchMoreClients(isInView, CursorType.AFTER);
  // }, [isInView]);

  const fetchClientCenterPermission = async () => {
    try {
      const response = await getEntityPermission(
        ResourceEntity.CLIENT_CENTER,
        selectedData?.id as string
      );
      setClientCenterPermission(response);
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const fetchClientCenterClientPermission = async () => {
    try {
      const response = await getEntityPermission(
        ResourceEntity.CLIENT_CENTER_CLIENT,
        selectedData?.id as string
      );
      setClientCenterClientPermission(response);
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const createThread = async (data: CreateThread) => {
    try {
      await postThread(data);
    } catch (error) {
      showErrorToast(
        error as AxiosError,
        t('server.create-entity-error', {
          entity: t('label.conversation'),
        })
      );
    }
  };

  const handleDelete = () => {
    const { id } = selectedData;
    if (isClientCenterActive) {
      onClientCenterDelete(id);
    } else {
      onClientCenterClientDelete(id);
    }
    setIsDelete(false);
  };

  const loadClientCenterClients = useCallback(
    (refresh = false) => {
      fetchClientCenterClient(
        isClientCenterActive ? { clientCenter: id } : { parent: id },
        refresh
      );
    },
    [id, isClientCenterActive]
  );

  const handleClientCenterClientModalAction = (
    editMode: boolean,
    clientCenterClient: ClientCenterClient | undefined
  ) => {
    setEditMode(editMode);
    setActiveClientCenterClient(clientCenterClient);
    setIsEditModalOpen(true);
  };

  const updateClientCenterClient = async (
    currentData: ClientCenterClient,
    updatedData: ClientCenterClient
  ) => {
    try {
      const jsonPatch = compare(currentData, updatedData);
      const response = await patchClientCenterClient(currentData?.id, jsonPatch);
      if (!response) {
        throw t('server.entity-updating-error', {
          entity: t('label.client-center-client'),
        });
      }
      onClientModalSuccess();
    } catch (error) {
      if (
        (error as AxiosError).response?.status === HTTP_STATUS_CODE.CONFLICT
      ) {
        showErrorToast(
          t('server.entity-already-exist', {
            entity: t('label.client-center-client'),
            entityPlural: t('label.client-center-client-lowercase-plural'),
            name: updatedData.name,
          })
        );
      } else {
        showErrorToast(
          error as AxiosError,
          t('server.entity-updating-error', {
            entity: t('label.client-center-client-lowercase'),
          })
        );
      }
    }
  };

  const onClientModalSuccess = useCallback(() => {
    loadClientCenterClients(true);
    if (!isClientCenterActive && tab !== 'clients') {
      history.push(
        getClientCenterClientDetailsPath(
          selectedData.fullyQualifiedName || '',
          'clients'
        )
      );
    }
    setIsEditModalOpen(false);
  }, [isClientCenterActive, tab, selectedData]);

  const handleClientCenterClientAdd = async (formData: ClientCenterClientForm) => {
    try {
      await addClientCenterClient({
        ...formData,
        reviewers: formData.reviewers.map(
          (item) => item.fullyQualifiedName || ''
        ),
        clientCenter:
          activeClientCenterClient?.clientCenter?.name ||
          (selectedData.fullyQualifiedName ?? ''),
        parent: activeClientCenterClient?.fullyQualifiedName,
      });
      onClientModalSuccess();
    } catch (error) {
      if (
        (error as AxiosError).response?.status === HTTP_STATUS_CODE.CONFLICT
      ) {
        showErrorToast(
          t('server.entity-already-exist', {
            entity: t('label.client-center-client'),
            entityPlural: t('label.client-center-client-lowercase-plural'),
            name: formData.name,
          })
        );
      } else {
        showErrorToast(
          error as AxiosError,
          t('server.create-entity-error', {
            entity: t('label.client-center-client-lowercase'),
          })
        );
      }
    }
  };

  const handleClientCenterClientSave = async (formData: ClientCenterClientForm) => {
    const newClientData = cloneDeep(activeClientCenterClient);
    if (editMode) {
      if (newClientData && activeClientCenterClient) {
        const {
          name,
          displayName,
          description,
          synonyms,
          tags,
          references,
          mutuallyExclusive,
          reviewers,
          owner,
          relatedClients,
          style,
        } = formData || {};

        newClientData.name = name;
        newClientData.style = style;
        newClientData.displayName = displayName;
        newClientData.description = description;
        newClientData.synonyms = synonyms;
        newClientData.tags = tags;
        newClientData.mutuallyExclusive = mutuallyExclusive;
        newClientData.reviewers = reviewers;
        newClientData.owner = owner;
        newClientData.references = references;
        newClientData.relatedClients = relatedClients?.map((client: any) => ({
          id: client,
          type: 'clientCenterClient',
        }));
        await updateClientCenterClient(activeClientCenterClient, newClientData);
      }
    } else {
      handleClientCenterClientAdd(formData);
    }
  };

  useEffect(() => {
    if (id && !action) {
      loadClientCenterClients();
      if (isClientCenterActive) {
        isVersionsView
          ? setClientCenterPermission(VERSION_VIEW_CLIENT_CENTER_PERMISSION)
          : fetchClientCenterPermission();
      } else {
        isVersionsView
          ? setClientCenterClientPermission(VERSION_VIEW_CLIENT_CENTER_PERMISSION)
          : fetchClientCenterClientPermission();
      }
    }
  }, [id, isClientCenterActive, isVersionsView, action]);

  return (
    <Row data-testid="client-center-client" gutter={[0, 8]}>
      <Col span={24}>
      {isLoading && <Loader />}
      {!isLoading &&
        !isEmpty(selectedData) &&
        (
          isClientCenterActive ? (
            
          <ClientCenterDetails
            clientCenter={selectedData as ClientCenter}
            clientCenterClients={clientCenterClients}
            handleClientCenterDelete={onClientCenterDelete}
            isVersionView={isVersionsView}
            permissions={clientCenterPermission}
            refreshClientCenterClients={() => loadClientCenterClients(true)}
            clientsLoading={isClientsLoading}
            updateClientCenter={updateClientCenter}
            updateVote={updateVote}
            onAddClientCenterClient={(client) =>
              handleClientCenterClientModalAction(false, client)
            }
            onEditClientCenterClient={(client) =>
              handleClientCenterClientModalAction(true, client)
            }
            onThreadLinkSelect={onThreadLinkSelect}
            moreload={() => fetchMoreClients(true, CursorType.AFTER)}
            headerVisible={headerVisible}
          />
          )
        :
(
          <ClientCenterClientsV1
            childClientCenterClients={clientCenterClients}
            clientCenterClient={selectedData as ClientCenterClient}
            handleClientCenterClientDelete={onClientCenterClientDelete}
            handleClientCenterClientUpdate={onClientCenterClientUpdate}
            isSummaryPanelOpen={isSummaryPanelOpen}
            isVersionView={isVersionsView}
            permissions={clientCenterClientPermission}
            refreshActiveClientCenterClient={refreshActiveClientCenterClient}
            refreshClientCenterClients={() => loadClientCenterClients(true)}
            clientsLoading={isClientsLoading}
            updateVote={updateVote}
            onAddClientCenterClient={(client) =>
              handleClientCenterClientModalAction(false, client)
            }
            onAssetClick={onAssetClick}
            onEditClientCenterClient={(client) =>
              handleClientCenterClientModalAction(true, client)
            }
            onThreadLinkSelect={onThreadLinkSelect}
          />)

        )}

      {selectedData && (
        <EntityDeleteModal
          bodyText={getEntityDeleteMessage(selectedData.name, '')}
          entityName={selectedData.name}
          entityType="ClientCenter"
          loadingState={deleteStatus}
          visible={isDelete}
          onCancel={() => setIsDelete(false)}
          onConfirm={handleDelete}
        />
      )}
    </Col>
      {isEditModalOpen && (
        
        <ClientCenterClientModal
          editMode={editMode}
          clientCenterName={selectedData.name}
          clientCenterReviewers={isClientCenterActive ? selectedData.reviewers : []}
          clientCenterClient={activeClientCenterClient}
          visible={isEditModalOpen}
          onCancel={() => setIsEditModalOpen(false)}
          onSave={handleClientCenterClientSave}
        />
       
      
      )
      
      }


      {threadLink ? (
        <ActivityThreadPanel
          createThread={createThread}
          deletePostHandler={deleteFeed}
          open={Boolean(threadLink)}
          postFeedHandler={postFeed}
          threadLink={threadLink}
          threadType={threadType}
          updateThreadHandler={updateFeed}
          onCancel={onThreadPanelClose}
        />
      ) : null}
    </Row>
  );
};

export default withActivityFeed(ClientCenterV1);
