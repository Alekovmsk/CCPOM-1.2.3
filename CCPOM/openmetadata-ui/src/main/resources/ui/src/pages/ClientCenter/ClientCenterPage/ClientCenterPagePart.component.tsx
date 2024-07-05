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

import { AxiosError } from 'axios';
import { compare } from 'fast-json-patch';
import React, { useCallback, useEffect, useMemo, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { useHistory, useParams } from 'react-router-dom';
import ErrorPlaceHolder from '../../../components/common/ErrorWithPlaceholder/ErrorPlaceHolder';
import { EntityDetailsObjectInterface } from '../../../components/Explore/ExplorePage.interface';
import ClientCenterV1 from '../../../components/ClientCenter/ClientCenterV1.component';
import Loader from '../../../components/Loader/Loader';
import { usePermissionProvider } from '../../../components/PermissionProvider/PermissionProvider';
import { ResourceEntity } from '../../../components/PermissionProvider/PermissionProvider.interface';
import { VotingDataProps } from '../../../components/Voting/voting.interface';
import { FQN_SEPARATOR_CHAR } from '../../../constants/char.constants';
import { PAGE_SIZE_LARGE, ROUTES } from '../../../constants/constants';
import { CLIENT_CENTER_DOCS } from '../../../constants/docs.constants';
import {
  ERROR_PLACEHOLDER_TYPE,
  LOADING_STATE,
} from '../../../enums/common.enum';
import { ClientCenter } from '../../../generated/entity/data/clientCenter';
import { ClientCenterClient } from '../../../generated/entity/data/clientCenterClient';
import { Operation } from '../../../generated/entity/policies/policy';
import {
  deleteClientCenter,
  deleteClientCenterClient,
  getClientCentersList,
  getClientCenterClientByFQN,
  patchClientCenters,
  patchClientCenterClient,
  updateClientCenterClientVotes,
  updateClientCenterVotes,
} from '../../../rest/clientCenterAPI';
import Fqn from '../../../utils/Fqn';
import { checkPermission } from '../../../utils/PermissionsUtils';
import { getClientCenterPath } from '../../../utils/RouterUtils';
import { showErrorToast, showSuccessToast } from '../../../utils/ToastUtils';

const ClientCenterPagePart = ({isDoc,headerVisible = true}:{isDoc:boolean,headerVisible?:boolean}) => {
  const { t } = useTranslation();
  const { permissions } = usePermissionProvider();
  const { fqn: clientCenterName } = useParams<{ fqn: string }>();
  const clientCenterFqn = (isDoc && decodeURIComponent(clientCenterName)) ? decodeURIComponent(clientCenterName) : Fqn.split(decodeURIComponent(clientCenterName))[0];
  const history = useHistory();
  const [clientCenters, setClientCenters] = useState<ClientCenter[]>([]);
  const [isLoading, setIsLoading] = useState(true);
  const [deleteStatus, setDeleteStatus] = useState<LOADING_STATE>(
    LOADING_STATE.INITIAL
  );
  const [selectedData, setSelectedData] = useState<ClientCenter | ClientCenterClient>();
  const [isRightPanelLoading, setIsRightPanelLoading] = useState(true);
  const [previewAsset, setPreviewAsset] =
    useState<EntityDetailsObjectInterface>();

  const isClientCenterActive = useMemo(() => {
    setIsRightPanelLoading(true);
    setSelectedData(undefined);

    if (clientCenterFqn) {
      return Fqn.split(clientCenterFqn).length === 1;
    }

    return true;
  }, [clientCenterFqn]);

  const createClientCenterPermission = useMemo(
    () =>
      checkPermission(
        Operation.Create,
        isClientCenterActive
          ? ResourceEntity.CLIENT_CENTER
          : ResourceEntity.CLIENT_CENTER_CLIENT,
        permissions
      ),
    [permissions, isClientCenterActive]
  );

  const viewBasicClientCenterPermission = useMemo(
    () =>
      checkPermission(
        Operation.ViewBasic,
        isClientCenterActive
          ? ResourceEntity.CLIENT_CENTER
          : ResourceEntity.CLIENT_CENTER_CLIENT,
        permissions
      ),
    [permissions, isClientCenterActive]
  );

  const viewAllClientCenterPermission = useMemo(
    () =>
      checkPermission(
        Operation.ViewAll,
        isClientCenterActive
          ? ResourceEntity.CLIENT_CENTER
          : ResourceEntity.CLIENT_CENTER_CLIENT,
        permissions
      ),
    [permissions, isClientCenterActive]
  );

  const handleAddClientCenterClick = () => {
    history.push(ROUTES.ADD_CLIENT_CENTER);
  };

  const fetchClientCenterList = async () => {
    setIsRightPanelLoading(true);
    setIsLoading(true);
    try {
      const { data } = await getClientCentersList({
        fields: 'owner,tags,reviewers,votes,domain',
        limit: PAGE_SIZE_LARGE,
      });
      setClientCenters(data);
    } catch (error) {
      showErrorToast(error as AxiosError);
    } finally {
      setIsLoading(false);
      setIsRightPanelLoading(false);
    }
  };
  useEffect(() => {
    fetchClientCenterList();
  }, []);

  const fetchClientCenterClientDetails = async () => {
    setIsRightPanelLoading(true);
    try {
      const response = await getClientCenterClientByFQN(
        clientCenterFqn,
        'relatedClients,reviewers,tags,owner,children,votes,domain'
      );
      setSelectedData(response);
    } catch (error) {
      showErrorToast(error as AxiosError);
    } finally {
      setIsRightPanelLoading(false);
    }
  };
  useEffect(() => {
    setIsRightPanelLoading(true);
    if (clientCenters.length) {
      if (!isClientCenterActive) {
        fetchClientCenterClientDetails();
      } else {
        setSelectedData(
          clientCenters.find(
            (clientCenter) => clientCenter.fullyQualifiedName === clientCenterFqn
          ) || clientCenters[0]
        );
        !clientCenterFqn &&
          clientCenters[0].fullyQualifiedName &&
          history.replace(getClientCenterPath(clientCenters[0].fullyQualifiedName));
        setIsRightPanelLoading(false);
      }
    }
  }, [isClientCenterActive, clientCenterFqn, clientCenters]);

  const updateClientCenter = async (updatedData: ClientCenter) => {
    const jsonPatch = compare(selectedData as ClientCenter, updatedData);

    try {
      const response = await patchClientCenters(
        selectedData?.id as string,
        jsonPatch
      );

      setClientCenters((pre) => {
        return pre.map((item) => {
          if (item.name === response.name) {
            return response;
          } else {
            return item;
          }
        });
      });

      if (selectedData?.name !== updatedData.name) {
        history.push(getClientCenterPath(response.fullyQualifiedName));
        fetchClientCenterList();
      }
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const updateVote = async (data: VotingDataProps) => {
    try {
      const isClientCenterEntity =
        Fqn.split(selectedData?.fullyQualifiedName).length <= 1;

      if (isClientCenterEntity) {
        await updateClientCenterVotes(selectedData?.id ?? '', data);
        fetchClientCenterList();
      } else {
        await updateClientCenterClientVotes(selectedData?.id ?? '', data);
        fetchClientCenterClientDetails();
      }
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const handleClientCenterDelete = (id: string) => {
    setDeleteStatus(LOADING_STATE.WAITING);
    deleteClientCenter(id)
      .then(() => {
        setDeleteStatus(LOADING_STATE.SUCCESS);
        showSuccessToast(
          t('server.entity-deleted-successfully', {
            entity: t('label.client-center'),
          })
        );
        setIsLoading(true);
        // check if the clientCenter available
        const updatedClientCenters = clientCenters.filter((item) => item.id !== id);
        const clientCenterPath =
          updatedClientCenters.length > 0
            ? getClientCenterPath(updatedClientCenters[0].fullyQualifiedName)
            : getClientCenterPath();

        history.push(clientCenterPath);
        fetchClientCenterList();
      })
      .catch((err: AxiosError) => {
        showErrorToast(
          err,
          t('server.delete-entity-error', {
            entity: t('label.client-center'),
          })
        );
      })
      .finally(() => setDeleteStatus(LOADING_STATE.INITIAL));
  };

  const handleClientCenterClientUpdate = async (updatedData: ClientCenterClient) => {
    const jsonPatch = compare(selectedData as ClientCenterClient, updatedData);
    try {
      const response = await patchClientCenterClient(
        selectedData?.id as string,
        jsonPatch
      );
      if (response) {
        setSelectedData(response);
        if (selectedData?.name !== updatedData.name) {
          history.push(getClientCenterPath(response.fullyQualifiedName));
          fetchClientCenterList();
        }
      } else {
        throw t('server.entity-updating-error', {
          entity: t('label.client-center-client'),
        });
      }
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const handleClientCenterClientDelete = (id: string) => {
    setDeleteStatus(LOADING_STATE.WAITING);
    deleteClientCenterClient(id)
      .then(() => {
        setDeleteStatus(LOADING_STATE.SUCCESS);
        showSuccessToast(
          t('server.entity-deleted-successfully', {
            entity: t('label.client-center-client'),
          })
        );
        let fqn;
        if (clientCenterFqn) {
          const fqnArr = Fqn.split(clientCenterFqn);
          fqnArr.pop();
          fqn = fqnArr.join(FQN_SEPARATOR_CHAR);
        }
        setIsLoading(true);
        history.push(getClientCenterPath(fqn));
        fetchClientCenterList();
      })
      .catch((err: AxiosError) => {
        showErrorToast(
          err,
          t('server.delete-entity-error', {
            entity: t('label.client-center-client'),
          })
        );
      })
      .finally(() => setDeleteStatus(LOADING_STATE.INITIAL));
  };

  const handleAssetClick = useCallback(
    (asset?: EntityDetailsObjectInterface) => {
      setPreviewAsset(asset);
    },
    []
  );

  if (isLoading) {
    return <Loader />;
  }

  if (!(viewBasicClientCenterPermission || viewAllClientCenterPermission)) {
    return <ErrorPlaceHolder type={ERROR_PLACEHOLDER_TYPE.PERMISSION} />;
  }

  if (clientCenters.length === 0 && !isLoading) {
    return (
      <ErrorPlaceHolder
        buttonId="add-clientCenter"
        className="mt-0-important"
        doc={CLIENT_CENTER_DOCS}
        heading={t('label.client-center')}
        permission={createClientCenterPermission}
        type={
          createClientCenterPermission
            ? ERROR_PLACEHOLDER_TYPE.CREATE
            : ERROR_PLACEHOLDER_TYPE.NO_DATA
        }
        onClick={handleAddClientCenterClick}
      />
    );
  }

  return (
    <>
      {isRightPanelLoading ? (
        <Loader />
      ) : (
        <ClientCenterV1
          deleteStatus={deleteStatus}
          isClientCenterActive={isClientCenterActive}
          isSummaryPanelOpen={Boolean(previewAsset)}
          isVersionsView={false}
          refreshActiveClientCenterClient={fetchClientCenterClientDetails}
          selectedData={selectedData as ClientCenter}
          updateClientCenter={updateClientCenter}
          updateVote={updateVote}
          onAssetClick={handleAssetClick}
          onClientCenterDelete={handleClientCenterDelete}
          onClientCenterClientDelete={handleClientCenterClientDelete}
          onClientCenterClientUpdate={handleClientCenterClientUpdate}
          headerVisible={headerVisible}
        />
      )}
    </>
    
  );
};

export default ClientCenterPagePart;
