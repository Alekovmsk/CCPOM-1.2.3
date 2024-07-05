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
import { CreateDlaClassification } from '../generated/api/dlaClassification/createDlaClassification';
import { CreateDla } from '../generated/api/dlaClassification/createDla';
import { DlaClassification } from '../generated/entity/dlaClassification/dlaClassification';
import { Dla } from '../generated/entity/dlaClassification/dla';
import { EntityHistory } from '../generated/type/entityHistory';
import { getURLWithQueryFields } from '../utils/APIUtils';
import APIClient from './index';

const BASE_URL = '/dlaClassifications';

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
  const url = getURLWithQueryFields('/dlas', arrQueryFields);

  const response = await APIClient.get<PagingResponse<Dla[]>>(url, {
    params: { ...params, limit },
  });

  return response.data;
};

export const getAllClassifications = async (
  arrQueryFields?: string | string[],
  limit = 10
) => {
  const url = getURLWithQueryFields(BASE_URL, arrQueryFields);

  const response = await APIClient.get<PagingResponse<DlaClassification[]>>(url, {
    params: {
      limit,
    },
  });

  return response.data;
};

export const getTagByName = async (
  name: string,
  arrQueryFields?: string | string[]
) => {
  const url = getURLWithQueryFields(`/dlas/name/${name}`, arrQueryFields);

  const response = await APIClient.get<Dla>(url);

  return response.data;
};


export const getClassificationByName = async (
  name: string,
  arrQueryFields?: string | string[]
) => {
  const url = getURLWithQueryFields(`${BASE_URL}/name/${name}`, arrQueryFields);

  const response = await APIClient.get<DlaClassification>(url);

  return response.data;
};

export const deleteClassification = async (classificationId: string) => {
  const response = await APIClient.delete<DlaClassification>(
    `/dlaClassifications/${classificationId}?recursive=true&hardDelete=true`
  );

  return response.data;
};

export const createClassification = async (data: CreateDlaClassification) => {
  const response = await APIClient.post<
    CreateDlaClassification,
    AxiosResponse<DlaClassification>
  >(BASE_URL, data);

  return response.data;
};
export const updateClassification = async (data: DlaClassification) => {
  const response = await APIClient.put<
    DlaClassification,
    AxiosResponse<DlaClassification>
  >(`/dlaClassifications`, data);

  return response.data;
};
export const patchClassification = async (id: string, data: Operation[]) => {
  const configOptions = {
    headers: { 'Content-type': 'application/json-patch+json' },
  };
  const response = await APIClient.patch<
    Operation[],
    AxiosResponse<DlaClassification>
  >(`${BASE_URL}/${id}`, data, configOptions);

  return response.data;
};

export const createTag = async (data: CreateDla) => {
  const response = await APIClient.post<CreateDla, AxiosResponse<Dla>>(
    `/dlas`,
    data
  );

  return response.data;
};

export const updateTag = async (data: DlaClassification) => {
  const response = await APIClient.put(`/dlas`, data);

  return response.data;
};

export const patchTag = async (id: string, data: Operation[]) => {
  const configOptions = {
    headers: { 'Content-type': 'application/json-patch+json' }
  };
  const response = await APIClient.patch<Operation[], AxiosResponse<Dla>>(
    `/dlas/${id}`,
    data,
    configOptions
  );

  return response.data;
};

export const deleteTag = async (tagId: string) => {
  const response = await APIClient.delete(`/dlas/${tagId}`, {
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

  const response = await APIClient.get<DlaClassification>(url);

  return response.data;
};
