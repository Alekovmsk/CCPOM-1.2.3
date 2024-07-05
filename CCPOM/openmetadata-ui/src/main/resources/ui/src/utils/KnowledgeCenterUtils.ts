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
import { ModifiedKnowledgeCenterDocument } from '../components/KnowledgeCenter/KnowledgeCenterDocumentTab/KnowledgeCenterDocumentTab.interface';
import {
  FQN_SEPARATOR_CHAR,
  WILD_CARD_CHAR,
} from '../constants/char.constants';
import { SearchIndex } from '../enums/search.enum';
import { KnowledgeCenter } from '../generated/entity/data/knowledgeCenter';
import { KnowledgeCenterDocument, Status } from '../generated/entity/data/knowledgeCenterDocument';
import { EntityReference } from '../generated/type/entityReference';
import { SearchResponse } from '../interface/search.interface';
import { ListKnowledgeCenterDocumentsParams } from '../rest/knowledgeCenterAPI';
import { searchData } from '../rest/miscAPI';
import { formatSearchKnowledgeCenterDocumentResponse } from './APIUtils';
import Fqn from './Fqn';
import { getKnowledgeCenterPath } from './RouterUtils';

export interface KnowledgeCenterDocumentTreeNode {
  children?: KnowledgeCenterDocumentTreeNode[];
  fullyQualifiedName: string;
  name: string;
}

/**
 * To get all knowledgeCenter documents
 * @returns promise of list of formatted knowledgeCenter documents
 */
export const fetchKnowledgeCenterDocuments = (): Promise<KnowledgeCenterDocument[]> => {
  return new Promise<KnowledgeCenterDocument[]>((resolve, reject) => {
    searchData(WILD_CARD_CHAR, 1, 1000, '', '', '', SearchIndex.KNOWLEDGE_CENTER)
      .then((res) => {
        const data = formatSearchKnowledgeCenterDocumentResponse(
          (res?.data as SearchResponse<SearchIndex.KNOWLEDGE_CENTER>)?.hits?.hits || []
        );
        resolve(data);
      })
      .catch((error: AxiosError) => reject(error.response));
  });
};

/**
 * To get list of fqns from list of knowledgeCenter documents
 * @param documents formatted knowledgeCenter documents
 * @returns list of document fqns
 */
export const getKnowledgeCenterDocumentlist = (
  documents: Array<KnowledgeCenterDocument> = []
): Array<string> => {
  return documents.map((document: KnowledgeCenterDocument) => document.fullyQualifiedName || '');
};

export const getEntityReferenceFromKnowledgeCenter = (
  knowledgeCenter: KnowledgeCenter
): EntityReference => {
  return {
    deleted: knowledgeCenter.deleted,
    href: knowledgeCenter.href,
    fullyQualifiedName: knowledgeCenter.fullyQualifiedName ?? '',
    id: knowledgeCenter.id,
    type: 'knowledgeCenterDocument',
    description: knowledgeCenter.description,
    displayName: knowledgeCenter.displayName,
    name: knowledgeCenter.name,
  };
};

export const getEntityReferenceFromKnowledgeCenterDocument = (
  knowledgeCenterDocument: KnowledgeCenterDocument
): EntityReference => {
  return {
    deleted: knowledgeCenterDocument.deleted,
    href: knowledgeCenterDocument.href,
    fullyQualifiedName: knowledgeCenterDocument.fullyQualifiedName ?? '',
    id: knowledgeCenterDocument.id,
    type: 'knowledgeCenterDocument',
    description: knowledgeCenterDocument.description,
    displayName: knowledgeCenterDocument.displayName,
    name: knowledgeCenterDocument.name,
  };
};

// calculate root level knowledgeCenter document
export const getRootLevelKnowledgeCenterDocument = (
  data: KnowledgeCenterDocument[],
  params?: ListKnowledgeCenterDocumentsParams
) => {
  return data.reduce((knowledgeCenterDocuments, curr) => {
    const currentDocument =
      curr.children?.length === 0 ? omit(curr, 'children') : curr;
    if (params?.knowledgeCenter) {
      return isUndefined(curr.parent)
        ? [...knowledgeCenterDocuments, currentDocument]
        : knowledgeCenterDocuments;
    }

    return curr?.parent?.id === params?.parent
      ? [...knowledgeCenterDocuments, currentDocument]
      : knowledgeCenterDocuments;
  }, [] as KnowledgeCenterDocument[]);
};

export const buildTree = (data: KnowledgeCenterDocument[]): KnowledgeCenterDocument[] => {
  const nodes: Record<string, KnowledgeCenterDocument> = {};

  // Create nodes first
  data.forEach((obj) => {
    nodes[obj.fullyQualifiedName ?? ''] = {
      ...obj,
      children: obj.children?.length ? [] : undefined,
    };
  });

  // Build the tree structure
  const tree: KnowledgeCenterDocument[] = [];
  data.forEach((obj) => {
    const current = nodes[obj.fullyQualifiedName ?? ''];
    const parent = nodes[obj.parent?.fullyQualifiedName || ''];

    if (parent && parent.children) {
      // converting knowledgeCenterDocument to EntityReference
      parent.children.push({ ...current, type: 'knowledgeCenterDocument' });
    } else {
      tree.push(current);
    }
  });

  return tree;
};

// update knowledgeCenterDocument tree with newly fetch child document
export const createKnowledgeCenterDocumentTree = (
  knowledgeCenterDocuments: ModifiedKnowledgeCenterDocument[],
  updatedData: KnowledgeCenterDocument[],
  knowledgeCenterDocumentId?: string
) => {
  return knowledgeCenterDocuments.map((document) => {
    if (document.id === knowledgeCenterDocumentId) {
      document.children = updatedData;
    } else if (document?.children?.length) {
      createKnowledgeCenterDocumentTree(
        document.children as ModifiedKnowledgeCenterDocument[],
        updatedData,
        knowledgeCenterDocumentId
      );
    }

    return document;
  });
};

// Calculate searched data based on search value
export const getSearchedDataFromKnowledgeCenterTree = (
  knowledgeCenterDocuments: ModifiedKnowledgeCenterDocument[],
  value: string
): ModifiedKnowledgeCenterDocument[] => {
  return knowledgeCenterDocuments.reduce((acc, document) => {
    const isMatching =
      document.name.toLowerCase().includes(value.toLowerCase()) ||
      document?.displayName?.toLowerCase().includes(value.toLowerCase());

    if (isMatching) {
      return [...acc, document];
    } else if (document.children?.length) {
      const children = getSearchedDataFromKnowledgeCenterTree(
        document.children as ModifiedKnowledgeCenterDocument[],
        value
      );
      if (children.length) {
        return [...acc, { ...document, children: children as KnowledgeCenterDocument[] }];
      }
    }

    return acc;
  }, [] as ModifiedKnowledgeCenterDocument[]);
};

export const getQueryFilterToExcludeDocument = (fqn: string) => ({
  query: {
    bool: {
      must: [
        {
          bool: {
            must_not: [
              {
                document: {
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

export const formatRelatedDocumentOptions = (
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

export const getKnowledgeCenterBreadcrumbs = (fqn: string) => {
  const arr = Fqn.split(fqn);
  const dataFQN: Array<string> = [];
  const breadcrumbList = [
    {
      name: 'KnowledgeCenters',
      url: getKnowledgeCenterPath(''),
      activeTitle: false,
    },
    ...arr.map((d) => {
      dataFQN.push(d);

      return {
        name: d,
        url: getKnowledgeCenterPath(dataFQN.join(FQN_SEPARATOR_CHAR)),
        activeTitle: false,
      };
    }),
  ];

  return breadcrumbList;
};
