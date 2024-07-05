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
import { isUndefined, omit } from 'lodash';
import { StatusType } from '../components/common/StatusBadge/StatusBadge.interface';
import { ModifiedClientCenterClient } from '../components/ClientCenter/ClientCenterClientTab/ClientCenterClientTab.interface';
import {
  FQN_SEPARATOR_CHAR,
  WILD_CARD_CHAR,
} from '../constants/char.constants';
import { SearchIndex } from '../enums/search.enum';
import { ClientCenter } from '../generated/entity/data/clientCenter';
import { ClientCenterClient, Status } from '../generated/entity/data/clientCenterClient';
import { EntityReference } from '../generated/type/entityReference';
import { SearchResponse } from '../interface/search.interface';
import { ListClientCenterClientsParams } from '../rest/clientCenterAPI';
import { searchData } from '../rest/miscAPI';
import { formatSearchClientCenterClientResponse } from './APIUtils';
import Fqn from './Fqn';
import { getClientCenterPath } from './RouterUtils';

export interface ClientCenterClientTreeNode {
  children?: ClientCenterClientTreeNode[];
  fullyQualifiedName: string;
  name: string;
}

/**
 * To get all clientCenter clients
 * @returns promise of list of formatted clientCenter clients
 */
export const fetchClientCenterClients = (): Promise<ClientCenterClient[]> => {
  return new Promise<ClientCenterClient[]>((resolve, reject) => {
    searchData(WILD_CARD_CHAR, 1, 1000, '', '', '', SearchIndex.CLIENT_CENTER)
      .then((res) => {
        const data = formatSearchClientCenterClientResponse(
          (res?.data as SearchResponse<SearchIndex.CLIENT_CENTER>)?.hits?.hits || []
        );
        resolve(data);
      })
      .catch((error: AxiosError) => reject(error.response));
  });
};

/**
 * To get list of fqns from list of clientCenter clients
 * @param clients formatted clientCenter clients
 * @returns list of client fqns
 */
export const getClientCenterClientlist = (
  clients: Array<ClientCenterClient> = []
): Array<string> => {
  return clients.map((client: ClientCenterClient) => client.fullyQualifiedName || '');
};

export const getEntityReferenceFromClientCenter = (
  clientCenter: ClientCenter
): EntityReference => {
  return {
    deleted: clientCenter.deleted,
    href: clientCenter.href,
    fullyQualifiedName: clientCenter.fullyQualifiedName ?? '',
    id: clientCenter.id,
    type: 'clientCenterClient',
    description: clientCenter.description,
    displayName: clientCenter.displayName,
    name: clientCenter.name,
  };
};

export const getEntityReferenceFromClientCenterClient = (
  clientCenterClient: ClientCenterClient
): EntityReference => {
  return {
    deleted: clientCenterClient.deleted,
    href: clientCenterClient.href,
    fullyQualifiedName: clientCenterClient.fullyQualifiedName ?? '',
    id: clientCenterClient.id,
    type: 'clientCenterClient',
    description: clientCenterClient.description,
    displayName: clientCenterClient.displayName,
    name: clientCenterClient.name,
  };
};

// calculate root level clientCenter client
export const getRootLevelClientCenterClient = (
  data: ClientCenterClient[],
  params?: ListClientCenterClientsParams
) => {
  return data.reduce((clientCenterClients, curr) => {
    const currentClient =
      curr.children?.length === 0 ? omit(curr, 'children') : curr;
    if (params?.clientCenter) {
      return isUndefined(curr.parent)
        ? [...clientCenterClients, currentClient]
        : clientCenterClients;
    }

    return curr?.parent?.id === params?.parent
      ? [...clientCenterClients, currentClient]
      : clientCenterClients;
  }, [] as ClientCenterClient[]);
};

export const buildTree = (data: ClientCenterClient[]): ClientCenterClient[] => {
  const nodes: Record<string, ClientCenterClient> = {};

  // Create nodes first
  data.forEach((obj) => {
    nodes[obj.fullyQualifiedName ?? ''] = {
      ...obj,
      children: obj.children?.length ? [] : undefined,
    };
  });

  // Build the tree structure
  const tree: ClientCenterClient[] = [];
  data.forEach((obj) => {
    const current = nodes[obj.fullyQualifiedName ?? ''];
    const parent = nodes[obj.parent?.fullyQualifiedName || ''];

    if (parent && parent.children) {
      // converting clientCenterClient to EntityReference
      parent.children.push({ ...current, type: 'clientCenterClient' });
    } else {
      tree.push(current);
    }
  });

  return tree;
};

// update clientCenterClient tree with newly fetch child client
export const createClientCenterClientTree = (
  clientCenterClients: ModifiedClientCenterClient[],
  updatedData: ClientCenterClient[],
  clientCenterClientId?: string
) => {
  return clientCenterClients.map((client) => {
    if (client.id === clientCenterClientId) {
      client.children = updatedData;
    } else if (client?.children?.length) {
      createClientCenterClientTree(
        client.children as ModifiedClientCenterClient[],
        updatedData,
        clientCenterClientId
      );
    }

    return client;
  });
};

// Calculate searched data based on search value
export const getSearchedDataFromClientCenterTree = (
  clientCenterClients: ModifiedClientCenterClient[],
  value: string
): ModifiedClientCenterClient[] => {
  return clientCenterClients.reduce((acc, client) => {
    const isMatching =
      client.name.toLowerCase().includes(value.toLowerCase()) ||
      client?.displayName?.toLowerCase().includes(value.toLowerCase());

    if (isMatching) {
      return [...acc, client];
    } else if (client.children?.length) {
      const children = getSearchedDataFromClientCenterTree(
        client.children as ModifiedClientCenterClient[],
        value
      );
      if (children.length) {
        return [...acc, { ...client, children: children as ClientCenterClient[] }];
      }
    }

    return acc;
  }, [] as ModifiedClientCenterClient[]);
};

export const getQueryFilterToExcludeClient = (fqn: string) => ({
  query: {
    bool: {
      must: [
        {
          bool: {
            must_not: [
              {
                client: {
                  'tags.tagFQN': fqn,
                },
              },
            ],
          },
        },
      ],
    },
  },
});

export const formatRelatedClientOptions = (
  data: EntityReference[] | undefined
) => {
  return data
    ? data.map((value) => ({
        ...value,
        value: value.id,
        label: value.displayName || value.name,
        key: value.id,
      }))
    : [];
};

export const StatusClass = {
  [Status.Approved]: StatusType.Success,
  [Status.Draft]: StatusType.Warning,
  [Status.Rejected]: StatusType.Failure,
  [Status.Deprecated]: StatusType.Warning,
};

export const StatusFilters = Object.values(Status)
  .filter((status) => status !== Status.Deprecated) // Deprecated not in use for this release
  .map((status) => ({
    text: status,
    value: status,
  }));

export const getClientCenterBreadcrumbs = (fqn: string) => {
  const arr = Fqn.split(fqn);
  const dataFQN: Array<string> = [];
  const breadcrumbList = [
    {
      name: 'ClientCenters',
      url: getClientCenterPath(''),
      activeTitle: false,
    },
    ...arr.map((d) => {
      dataFQN.push(d);

      return {
        name: d,
        url: getClientCenterPath(dataFQN.join(FQN_SEPARATOR_CHAR)),
        activeTitle: false,
      };
    }),
  ];

  return breadcrumbList;
};
