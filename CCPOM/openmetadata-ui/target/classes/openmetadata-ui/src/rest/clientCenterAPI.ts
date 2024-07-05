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

import { AxiosResponse } from 'axios';
import { Operation } from 'fast-json-patch';
import { PagingResponse } from 'Models';
import { VotingDataProps } from '../components/Voting/voting.interface';
import { AddClientCenterToAssetsRequest } from '../generated/api/addClientCenterToAssetsRequest';
import { CreateClientCenter } from '../generated/api/data/createClientCenter';
import { CreateClientCenterClient } from '../generated/api/data/createClientCenterClient';
import { EntityReference, ClientCenter } from '../generated/entity/data/clientCenter';
import { ClientCenterClient } from '../generated/entity/data/clientCenterClient';
import { BulkOperationResult } from '../generated/type/bulkOperationResult';
import { CSVImportResult } from '../generated/type/csvImportResult';
import { EntityHistory } from '../generated/type/entityHistory';
import { ListParams } from '../interface/API.interface';
import { getURLWithQueryFields } from '../utils/APIUtils';
import APIClient from './index';

export type ListClientCenterClientsParams = ListParams & {
  clientCenter?: string;
  parent?: string;
};

const BASE_URL = '/clientCenters';

export const getClientCentersList = async (params?: ListParams) => {
  const response = await APIClient.get<PagingResponse<ClientCenter[]>>(BASE_URL, {
    params,
  });

  return response.data;
};

export const addClientCenters = async (data: CreateClientCenter) => {
  const url = '/clientCenters';

  const response = await APIClient.post<
    CreateClientCenter,
    AxiosResponse<ClientCenter>
  >(url, data);

  return response.data;
};

export const updateClientCenters = (
  data: CreateClientCenter
): Promise<AxiosResponse> => {
  const url = '/clientCenters';

  return APIClient.put(url, data);
};

export const patchClientCenters = async (id: string, patch: Operation[]) => {
  const configOptions = {
    headers: { 'Content-type': 'application/json-patch+json' },
  };

  const response = await APIClient.patch<Operation[], AxiosResponse<ClientCenter>>(
    `/clientCenters/${id}`,
    patch,
    configOptions
  );

  return response.data;
};

export const getClientCentersByName = async (
  clientCenterName: string,
  arrQueryFields: string | string[]
) => {
  const url = getURLWithQueryFields(
    `/clientCenters/name/${clientCenterName}`,
    arrQueryFields
  );

  const response = await APIClient.get<ClientCenter>(url);

  return response.data;
};

export const getClientCentersById = async (
  id: string,
  arrQueryFields?: string | string[]
) => {
  const url = getURLWithQueryFields(`/clientCenters/${id}`, arrQueryFields);

  const response = await APIClient.get<ClientCenter>(url);

  return response.data;
};

export const getClientCenterClients = async (params: ListClientCenterClientsParams) => {
  const response = await APIClient.get<PagingResponse<ClientCenterClient[]>>(
    '/clientCenterClients',
    {
      params,
    }
  );

  return response.data;
};

export const getClientCenterClientsById = async (
  clientCenterClientId = '',
  arrQueryFields = ''
) => {
  const url = getURLWithQueryFields(
    `/clientCenterClients/${clientCenterClientId}`,
    arrQueryFields
  );

  const response = await APIClient.get<ClientCenterClient>(url);

  return response.data;
};

export const getClientCenterClientByFQN = async (
  clientCenterClientFQN = '',
  arrQueryFields: string | string[] = ''
) => {
  const url = getURLWithQueryFields(
    `/clientCenterClients/name/${encodeURIComponent(clientCenterClientFQN)}`,
    arrQueryFields
  );

  const response = await APIClient.get<ClientCenterClient>(url);

  return response.data;
};

export const addClientCenterClient = (
  data: CreateClientCenterClient
): Promise<AxiosResponse> => {
  const url = '/clientCenterClients';

  return APIClient.post(url, data);
};

export const patchClientCenterClient = async (id: string, patch: Operation[]) => {
  const configOptions = {
    headers: { 'Content-type': 'application/json-patch+json' },
  };

  const response = await APIClient.patch<
    Operation[],
    AxiosResponse<ClientCenterClient>
  >(`/clientCenterClients/${id}`, patch, configOptions);

  return response.data;
};

export const deleteClientCenter = (id: string) => {
  return APIClient.delete(`/clientCenters/${id}?recursive=true&hardDelete=true`);
};

export const deleteClientCenterClient = (id: string) => {
  return APIClient.delete(
    `/clientCenterClients/${id}?recursive=true&hardDelete=true`
  );
};

export const exportClientCenterInCSVFormat = async (clientCenterName: string) => {
  const response = await APIClient.get<string>(
    `/clientCenters/name/${clientCenterName}/export`
  );

  return response.data;
};

export const importClientCenterInCSVFormat = async (
  clientCenterName: string,
  data: string,
  dryRun = true
) => {
  const configOptions = {
    headers: { 'Content-type': 'text/plain' },
  };
  const response = await APIClient.put<string, AxiosResponse<CSVImportResult>>(
    `/clientCenters/name/${encodeURIComponent(
      clientCenterName
    )}/import?dryRun=${dryRun}`,
    data,
    configOptions
  );

  return response.data;
};

export const getClientCenterVersionsList = async (id: string) => {
  const url = `/clientCenters/${id}/versions`;

  const response = await APIClient.get<EntityHistory>(url);

  return response.data;
};

export const getClientCenterVersion = async (id: string, version: string) => {
  const url = `/clientCenters/${id}/versions/${version}`;
  const response = await APIClient.get<ClientCenter>(url);

  return response.data;
};

export const getClientCenterClientsVersionsList = async (id: string) => {
  const url = `/clientCenterClients/${id}/versions`;

  const response = await APIClient.get<EntityHistory>(url);

  return response.data;
};

export const getClientCenterClientsVersion = async (id: string, version: string) => {
  const url = `/clientCenterClients/${id}/versions/${version}`;

  const response = await APIClient.get<ClientCenterClient>(url);

  return response.data;
};

export const updateClientCenterVotes = async (
  id: string,
  data: VotingDataProps
) => {
  const response = await APIClient.put<
    VotingDataProps,
    AxiosResponse<ClientCenter>
  >(`/clientCenters/${id}/vote`, data);

  return response.data;
};

export const updateClientCenterClientVotes = async (
  id: string,
  data: VotingDataProps
) => {
  const response = await APIClient.put<
    VotingDataProps,
    AxiosResponse<ClientCenterClient>
  >(`/clientCenterClients/${id}/vote`, data);

  return response.data;
};

export const validateTagAddtionToClientCenter = async (
  clientCenterClient: ClientCenterClient,
  dryRun = false
) => {
  const data = {
    dryRun: dryRun,
    clientCenterTags: clientCenterClient.tags ?? [],
  };

  const response = await APIClient.put<
    AddClientCenterToAssetsRequest,
    AxiosResponse<BulkOperationResult>
  >(`/clientCenterClients/${clientCenterClient.id}/tags/validate`, data);

  return response.data;
};

export const addAssetsToClientCenterClient = async (
  clientCenterClient: ClientCenterClient,
  assets: EntityReference[],
  dryRun = false
) => {
  const data = {
    assets: assets,
    dryRun: dryRun,
    clientCenterTags: clientCenterClient.tags ?? [],
  };

  const response = await APIClient.put<
    AddClientCenterToAssetsRequest,
    AxiosResponse<ClientCenterClient>
  >(`/clientCenterClients/${clientCenterClient.id}/assets/add`, data);

  return response.data;
};

export const removeAssetsFromClientCenterClient = async (
  clientCenterClient: ClientCenterClient,
  assets: EntityReference[]
) => {
  const data = {
    assets: assets,
    dryRun: false,
    clientCenterTags: clientCenterClient.tags ?? [],
  };

  const response = await APIClient.put<
    AddClientCenterToAssetsRequest,
    AxiosResponse<ClientCenterClient>
  >(`/clientCenterClients/${clientCenterClient.id}/assets/remove`, data);

  return response.data;
};
