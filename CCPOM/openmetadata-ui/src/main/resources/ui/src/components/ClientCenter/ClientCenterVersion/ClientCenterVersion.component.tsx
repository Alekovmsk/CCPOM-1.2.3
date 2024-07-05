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
import { noop, toString } from 'lodash';
import React, { useEffect, useState } from 'react';
import { useHistory, useParams } from 'react-router-dom';
import { LOADING_STATE } from '../../../enums/common.enum';
import { ClientCenter } from '../../../generated/entity/data/clientCenter';
import { ClientCenterClient } from '../../../generated/entity/data/clientCenterClient';
import { EntityHistory } from '../../../generated/type/entityHistory';
import {
  getClientCenterClientsVersion,
  getClientCenterClientsVersionsList,
  getClientCenterVersion,
  getClientCenterVersionsList,
} from '../../../rest/clientCenterAPI';
import {
  getClientCenterPath,
  getClientCenterClientsVersionsPath,
  getClientCenterVersionsPath,
} from '../../../utils/RouterUtils';
import { showErrorToast } from '../../../utils/ToastUtils';
import EntityVersionTimeLine from '../../Entity/EntityVersionTimeLine/EntityVersionTimeLine';
import Loader from '../../Loader/Loader';
import PageLayoutV1 from '../../PageLayoutV1/PageLayoutV1';
import ClientCenterV1Component from '../ClientCenterV1.component';

interface ClientCenterVersionProps {
  isClientCenter?: boolean;
}

const ClientCenterVersion = ({ isClientCenter = false }: ClientCenterVersionProps) => {
  const history = useHistory();
  const {
    fqn: clientCenterName,
    version,
    tab = 'overview',
  } = useParams<{ fqn: string; version: string; tab: string }>();
  const [versionList, setVersionList] = useState<EntityHistory>(
    {} as EntityHistory
  );
  const [selectedData, setSelectedData] = useState<ClientCenter | ClientCenterClient>();
  const [isVersionLoading, setIsVersionLoading] = useState<boolean>(true);

  const fetchVersionsInfo = async () => {
    try {
      const res = isClientCenter
        ? await getClientCenterVersionsList(clientCenterName)
        : await getClientCenterClientsVersionsList(clientCenterName);

      setVersionList(res);
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const fetchActiveVersion = async () => {
    setIsVersionLoading(true);
    try {
      const res = isClientCenter
        ? await getClientCenterVersion(clientCenterName, version)
        : await getClientCenterClientsVersion(clientCenterName, version);

      setSelectedData(res);
    } catch (error) {
      showErrorToast(error as AxiosError);
    } finally {
      setIsVersionLoading(false);
    }
  };

  const onVersionChange = (selectedVersion: string) => {
    const path = isClientCenter
      ? getClientCenterVersionsPath(clientCenterName, selectedVersion)
      : getClientCenterClientsVersionsPath(clientCenterName, selectedVersion, tab);
    history.push(path);
  };

  const onBackHandler = () => {
    const path = getClientCenterPath(selectedData?.fullyQualifiedName);
    history.push(path);
  };

  useEffect(() => {
    fetchVersionsInfo();
  }, [clientCenterName]);

  useEffect(() => {
    fetchActiveVersion();
  }, [clientCenterName, version]);

  return (
    <PageLayoutV1 pageTitle="ClientCenter version">
      <div className="version-data">
        {/* TODO: Need to implement version component for ClientCenter */}
        {isVersionLoading ? (
          <Loader />
        ) : (
          <ClientCenterV1Component
            isVersionsView
            deleteStatus={LOADING_STATE.INITIAL}
            isClientCenterActive={isClientCenter}
            isSummaryPanelOpen={false}
            selectedData={selectedData as ClientCenter}
            updateClientCenter={() => Promise.resolve()}
            onClientCenterDelete={noop}
            onClientCenterClientDelete={noop}
            onClientCenterClientUpdate={() => Promise.resolve()}
          />
        )}
      </div>
      <EntityVersionTimeLine
        currentVersion={toString(version)}
        versionHandler={onVersionChange}
        versionList={versionList}
        onBack={onBackHandler}
      />
    </PageLayoutV1>
  );
};

export default ClientCenterVersion;
