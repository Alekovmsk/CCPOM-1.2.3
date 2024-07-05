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

import { Space } from 'antd';
import { isEmpty, isUndefined } from 'lodash';
import React, { useCallback } from 'react';
import { Link } from 'react-router-dom';
import { getUserPath, NO_DATA_PLACEHOLDER } from '../../../constants/constants';
import { EntityField } from '../../../constants/Feeds.constants';
import { EntityChangeOperations } from '../../../enums/VersionPage.enum';
import { KnowledgeCenter } from '../../../generated/entity/data/knowledgeCenter';
import { KnowledgeCenterDocument } from '../../../generated/entity/data/knowledgeCenterDocument';
import {
  ChangeDescription,
  EntityReference,
} from '../../../generated/entity/type';
import { getEntityName } from '../../../utils/EntityUtils';
import {
  getAddedDiffElement,
  getChangedEntityNewValue,
  getChangedEntityOldValue,
  getDiffByFieldName,
  getRemovedDiffElement,
} from '../../../utils/EntityVersionUtils';
import ProfilePicture from '../../common/ProfilePicture/ProfilePicture';

interface KnowledgeCenterReviewersProps {
  knowledgeCenterData: KnowledgeCenter | KnowledgeCenterDocument;
  isVersionView?: boolean;
  editPermission?: boolean;
}

function KnowledgeCenterReviewers({
  isVersionView,
  knowledgeCenterData,
  editPermission,
}: KnowledgeCenterReviewersProps) {
  const getReviewerName = useCallback(
    (reviewer: EntityReference, operation: EntityChangeOperations) => {
      switch (operation) {
        case EntityChangeOperations.ADDED: {
          return getAddedDiffElement(getEntityName(reviewer));
        }
        case EntityChangeOperations.DELETED: {
          return getRemovedDiffElement(getEntityName(reviewer));
        }
        case EntityChangeOperations.UPDATED:
        case EntityChangeOperations.NORMAL:
        default: {
          return getEntityName(reviewer);
        }
      }
    },
    []
  );

  const getReviewer = useCallback(
    (reviewer: EntityReference, operation: EntityChangeOperations) => {
      return (
        <Space className="m-r-xss" key={reviewer.id} size={4}>
          <ProfilePicture
            displayName={getEntityName(reviewer)}
            id={reviewer.id}
            name={reviewer.name ?? ''}
            textClass="text-xs"
            type="circle"
            width="20"
          />
          <Link to={getUserPath(reviewer.name ?? '')}>
            {getReviewerName(reviewer, operation)}
          </Link>
        </Space>
      );
    },
    []
  );

  if (isVersionView) {
    const changeDescription = knowledgeCenterData.changeDescription;
    const reviewersDiff = getDiffByFieldName(
      EntityField.REVIEWERS,
      changeDescription as ChangeDescription
    );

    const addedReviewers: EntityReference[] = JSON.parse(
      getChangedEntityNewValue(reviewersDiff) ?? '[]'
    );
    const deletedReviewers: EntityReference[] = JSON.parse(
      getChangedEntityOldValue(reviewersDiff) ?? '[]'
    );

    const unchangedReviewers = knowledgeCenterData.reviewers
      ? knowledgeCenterData.reviewers.filter(
          (reviewer) =>
            !addedReviewers.find(
              (addedReviewer: EntityReference) =>
                addedReviewer.id === reviewer.id
            )
        )
      : [];

    if (
      !isEmpty(unchangedReviewers) ||
      !isEmpty(addedReviewers) ||
      !isEmpty(deletedReviewers)
    ) {
      return (
        <>
          {unchangedReviewers.map((reviewer) =>
            getReviewer(reviewer, EntityChangeOperations.NORMAL)
          )}
          {addedReviewers.map((reviewer) =>
            getReviewer(reviewer, EntityChangeOperations.ADDED)
          )}
          {deletedReviewers.map((reviewer) =>
            getReviewer(reviewer, EntityChangeOperations.DELETED)
          )}
        </>
      );
    }
  }

  if (
    !isEmpty(knowledgeCenterData.reviewers) &&
    !isUndefined(knowledgeCenterData.reviewers)
  ) {
    return (
      <Space wrap data-testid="knowledge-center-reviewer-name" size={6}>
        {knowledgeCenterData.reviewers.map((reviewer) =>
          getReviewer(reviewer, EntityChangeOperations.NORMAL)
        )}
      </Space>
    );
  }

  return editPermission ? null : <div>{NO_DATA_PLACEHOLDER}</div>;
}

export default KnowledgeCenterReviewers;
