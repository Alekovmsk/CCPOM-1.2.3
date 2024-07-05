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
import { AddKnowledgeCenterToAssetsRequest } from '../generated/api/addKnowledgeCenterToAssetsRequest';
import { CreateKnowledgeCenter } from '../generated/api/data/createKnowledgeCenter';
import { CreateKnowledgeCenterDocument } from '../generated/api/data/createKnowledgeCenterDocument';
import { EntityReference, KnowledgeCenter } from '../generated/entity/data/knowledgeCenter';
import { KnowledgeCenterDocument } from '../generated/entity/data/knowledgeCenterDocument';
import { BulkOperationResult } from '../generated/type/bulkOperationResult';
import { CSVImportResult } from '../generated/type/csvImportResult';
import { EntityHistory } from '../generated/type/entityHistory';
import { ListParams } from '../interface/API.interface';
import { getURLWithQueryFields } from '../utils/APIUtils';
import APIClient from './index';

export type ListKnowledgeCenterDocumentsParams = ListParams & {
  knowledgeCenter?: string;
  parent?: string;
};

const BASE_URL = '/agreementCenters';

export const getKnowledgeCentersList = async (params?: ListParams) => {
  const response = await APIClient.get<PagingResponse<KnowledgeCenter[]>>(BASE_URL, {
    params,
  });

  return response.data;
};

export const addKnowledgeCenters = async (data: CreateKnowledgeCenter) => {
  const url = '/agreementCenters';

  const response = await APIClient.post<
    CreateKnowledgeCenter,
    AxiosResponse<KnowledgeCenter>
  >(url, data);

  return response.data;
};

export const updateKnowledgeCenters = (
  data: CreateKnowledgeCenter
): Promise<AxiosResponse> => {
  const url = '/agreementCenters';

  return APIClient.put(url, data);
};

export const patchKnowledgeCenters = async (id: string, patch: Operation[]) => {
  const configOptions = {
    headers: { 'Content-type': 'application/json-patch+json' },
  };

  const response = await APIClient.patch<Operation[], AxiosResponse<KnowledgeCenter>>(
    `/agreementCenters/${id}`,
    patch,
    configOptions
  );

  return response.data;
};

export const getKnowledgeCentersByName = async (
  knowledgeCenterName: string,
  arrQueryFields: string | string[]
) => {
  const url = getURLWithQueryFields(
    `/agreementCenters/name/${knowledgeCenterName}`,
    arrQueryFields
  );

  const response = await APIClient.get<KnowledgeCenter>(url);

  return response.data;
};

export const getKnowledgeCentersById = async (
  id: string,
  arrQueryFields?: string | string[]
) => {
  const url = getURLWithQueryFields(`/agreementCenters/${id}`, arrQueryFields);

  const response = await APIClient.get<KnowledgeCenter>(url);

  return response.data;
};

export const getKnowledgeCenterDocuments = async (params: ListKnowledgeCenterDocumentsParams) => {
  const response = await APIClient.get<PagingResponse<KnowledgeCenterDocument[]>>(
    '/agreementCenterDocuments',
    {
      params,
    }
  );

  return response.data;
};

export const getKnowledgeCenterDocumentsById = async (
  knowledgeCenterDocumentId = '',
  arrQueryFields = ''
) => {
  const url = getURLWithQueryFields(
    `/agreementCenterDocuments/${knowledgeCenterDocumentId}`,
    arrQueryFields
  );

  const response = await APIClient.get<KnowledgeCenterDocument>(url);

  return response.data;
};

export const getKnowledgeCenterDocumentByFQN = async (
  knowledgeCenterDocumentFQN = '',
  arrQueryFields: string | string[] = ''
) => {
  const url = getURLWithQueryFields(
    `/agreementCenterDocuments/name/${encodeURIComponent(knowledgeCenterDocumentFQN)}`,
    arrQueryFields
  );

  const response = await APIClient.get<KnowledgeCenterDocument>(url);

  return response.data;
};

export const addKnowledgeCenterDocument = (
  data: CreateKnowledgeCenterDocument
): Promise<AxiosResponse> => {
  const url = '/agreementCenterDocuments';

  return APIClient.post(url, data);
};

export const patchKnowledgeCenterDocument = async (id: string, patch: Operation[]) => {
  const configOptions = {
    headers: { 'Content-type': 'application/json-patch+json' },
  };

  const response = await APIClient.patch<
    Operation[],
    AxiosResponse<KnowledgeCenterDocument>
  >(`/agreementCenterDocuments/${id}`, patch, configOptions);

  return response.data;
};

export const deleteKnowledgeCenter = (id: string) => {
  return APIClient.delete(`/agreementCenters/${id}?recursive=true&hardDelete=true`);
};

export const deleteKnowledgeCenterDocument = (id: string) => {
  return APIClient.delete(
    `/agreementCenterDocuments/${id}?recursive=true&hardDelete=true`
  );
};

export const exportKnowledgeCenterInCSVFormat = async (knowledgeCenterName: string) => {
  const response = await APIClient.get<string>(
    `/agreementCenters/name/${knowledgeCenterName}/export`
  );

  return response.data;
};

export const importKnowledgeCenterInCSVFormat = async (
  knowledgeCenterName: string,
  data: string,
  dryRun = true
) => {
  const configOptions = {
    headers: { 'Content-type': 'text/plain' },
  };
  const response = await APIClient.put<string, AxiosResponse<CSVImportResult>>(
    `/agreementCenters/name/${encodeURIComponent(
      knowledgeCenterName
    )}/import?dryRun=${dryRun}`,
    data,
    configOptions
  );

  return response.data;
};

export const getKnowledgeCenterVersionsList = async (id: string) => {
  const url = `/agreementCenters/${id}/versions`;

  const response = await APIClient.get<EntityHistory>(url);

  return response.data;
};

export const getKnowledgeCenterVersion = async (id: string, version: string) => {
  const url = `/agreementCenters/${id}/versions/${version}`;
  const response = await APIClient.get<KnowledgeCenter>(url);

  return response.data;
};

export const getKnowledgeCenterDocumentsVersionsList = async (id: string) => {
  const url = `/agreementCenterDocuments/${id}/versions`;

  const response = await APIClient.get<EntityHistory>(url);

  return response.data;
};

export const getKnowledgeCenterDocumentsVersion = async (id: string, version: string) => {
  const url = `/agreementCenterDocuments/${id}/versions/${version}`;

  const response = await APIClient.get<KnowledgeCenterDocument>(url);

  return response.data;
};

export const updateKnowledgeCenterVotes = async (
  id: string,
  data: VotingDataProps
) => {
  const response = await APIClient.put<
    VotingDataProps,
    AxiosResponse<KnowledgeCenter>
  >(`/agreementCenters/${id}/vote`, data);

  return response.data;
};

export const updateKnowledgeCenterDocumentVotes = async (
  id: string,
  data: VotingDataProps
) => {
  const response = await APIClient.put<
    VotingDataProps,
    AxiosResponse<KnowledgeCenterDocument>
  >(`/agreementCenterDocuments/${id}/vote`, data);

  return response.data;
};

export const validateTagAddtionToKnowledgeCenter = async (
  knowledgeCenterDocument: KnowledgeCenterDocument,
  dryRun = false
) => {
  const data = {
    dryRun: dryRun,
    knowledgeCenterTags: knowledgeCenterDocument.tags ?? [],
  };

  const response = await APIClient.put<
    AddKnowledgeCenterToAssetsRequest,
    AxiosResponse<BulkOperationResult>
  >(`/agreementCenterDocuments/${knowledgeCenterDocument.id}/tags/validate`, data);

  return response.data;
};

export const addAssetsToKnowledgeCenterDocument = async (
  knowledgeCenterDocument: KnowledgeCenterDocument,
  assets: EntityReference[],
  dryRun = false
) => {
  const data = {
    assets: assets,
    dryRun: dryRun,
    knowledgeCenterTags: knowledgeCenterDocument.tags ?? [],
  };

  const response = await APIClient.put<
    AddKnowledgeCenterToAssetsRequest,
    AxiosResponse<KnowledgeCenterDocument>
  >(`/agreementCenterDocuments/${knowledgeCenterDocument.id}/assets/add`, data);

  return response.data;
};

export const removeAssetsFromKnowledgeCenterDocument = async (
  knowledgeCenterDocument: KnowledgeCenterDocument,
  assets: EntityReference[]
) => {
  const data = {
    assets: assets,
    dryRun: false,
    knowledgeCenterTags: knowledgeCenterDocument.tags ?? [],
  };

  const response = await APIClient.put<
    AddKnowledgeCenterToAssetsRequest,
    AxiosResponse<KnowledgeCenterDocument>
  >(`/agreementCenterDocuments/${knowledgeCenterDocument.id}/assets/remove`, data);

  return response.data;
};
