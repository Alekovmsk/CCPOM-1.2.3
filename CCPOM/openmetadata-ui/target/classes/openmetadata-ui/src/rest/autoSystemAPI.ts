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
import { CreateAutoSystemClassification } from '../generated/api/autoSystemClassification/createAutoSystemClassification';
import { CreateAutoSystem } from '../generated/api/autoSystemClassification/createAutoSystem';
import { AutoSystemClassification } from '../generated/entity/autoSystemClassification/autoSystemClassification';
import { AutoSystem } from '../generated/entity/autoSystemClassification/autoSystem';
import { EntityHistory } from '../generated/type/entityHistory';
import { getURLWithQueryFields } from '../utils/APIUtils';
import APIClient from './index';

const BASE_URL = '/autoSystemClassifications';

interface TagsRequestParams {
  arrQueryFields?: string | string[];
  parent?: string;
  after?: string;
  before?: string;
  limit?: number;
}

export const getTags = async ({
  arrQueryFields,
  limit = 10,
  ...params
}: TagsRequestParams) => {
  const url = getURLWithQueryFields('/autoSystems', arrQueryFields);

  const response = await APIClient.get<PagingResponse<AutoSystem[]>>(url, {
    params: { ...params, limit },
  });

  return response.data;
};

export const getTagByName = async (
  name: string,
  arrQueryFields?: string | string[]
) => {
  const url = getURLWithQueryFields(`/autoSystems/name/${name}`, arrQueryFields);

  const response = await APIClient.get<AutoSystem>(url);

  return response.data;
};


export const getAllClassifications = async (
  arrQueryFields?: string | string[],
  limit = 10
) => {
  const url = getURLWithQueryFields(BASE_URL, arrQueryFields);

  const response = await APIClient.get<PagingResponse<AutoSystemClassification[]>>(url, {
    params: {
      limit,
    },
  });

  return response.data;
};

export const getClassificationByName = async (
  name: string,
  arrQueryFields?: string | string[]
) => {
  const url = getURLWithQueryFields(`${BASE_URL}/name/${name}`, arrQueryFields);

  const response = await APIClient.get<AutoSystemClassification>(url);

  return response.data;
};

export const deleteClassification = async (classificationId: string) => {
  const response = await APIClient.delete<AutoSystemClassification>(
    `/autoSystemClassifications/${classificationId}?recursive=true&hardDelete=true`
  );

  return response.data;
};

export const createClassification = async (data: CreateAutoSystemClassification) => {
  const response = await APIClient.post<
    CreateAutoSystemClassification,
    AxiosResponse<AutoSystemClassification>
  >(BASE_URL, data);

  return response.data;
};
export const updateClassification = async (data: AutoSystemClassification) => {
  const response = await APIClient.put<
    AutoSystemClassification,
    AxiosResponse<AutoSystemClassification>
  >(`/autoSystemClassifications`, data);

  return response.data;
};
export const patchClassification = async (id: string, data: Operation[]) => {
  const configOptions = {
    headers: { 'Content-type': 'application/json-patch+json' },
  };
  const response = await APIClient.patch<
    Operation[],
    AxiosResponse<AutoSystemClassification>
  >(`${BASE_URL}/${id}`, data, configOptions);

  return response.data;
};

export const createTag = async (data: CreateAutoSystem) => {
  const response = await APIClient.post<CreateAutoSystem, AxiosResponse<AutoSystem>>(
    `/autoSystems`,
    data
  );

  return response.data;
};

export const updateTag = async (data: AutoSystemClassification) => {
  const response = await APIClient.put(`/autoSystems`, data);

  return response.data;
};

export const patchTag = async (id: string, data: Operation[]) => {
  const configOptions = {
    headers: { 'Content-type': 'application/json-patch+json' }
  };
  const response = await APIClient.patch<Operation[], AxiosResponse<AutoSystem>>(
    `/autoSystems/${id}`,
    data,
    configOptions
  );

  return response.data;
};

export const deleteTag = async (tagId: string) => {
  const response = await APIClient.delete(`/autoSystems/${tagId}`, {
    // Todo: need to update below params in new implementation, for now providing hardDelete true,
    // to avoid soft delete issue from UI
    params: {
      recursive: true,
      hardDelete: true,
    },
  });

  return response.data;
};

export const getClassificationVersionsList = async (id: string) => {
  const url = `${BASE_URL}/${id}/versions`;

  const response = await APIClient.get<EntityHistory>(url);

  return response.data;
};

export const getClassificationVersionData = async (
  id: string,
  version: string
) => {
  const url = `${BASE_URL}/${id}/versions/${version}`;

  const response = await APIClient.get<AutoSystemClassification>(url);

  return response.data;
};
