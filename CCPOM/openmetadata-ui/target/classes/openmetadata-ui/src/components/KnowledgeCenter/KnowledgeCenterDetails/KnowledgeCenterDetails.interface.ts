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

import { KnowledgeCenter } from '../../../generated/entity/data/knowledgeCenter';
import { KnowledgeCenterDocument } from '../../../generated/entity/data/knowledgeCenterDocument';
import { OperationPermission } from '../../PermissionProvider/PermissionProvider.interface';
import { VotingDataProps } from '../../Voting/voting.interface';

export enum KnowledgeCenterTabs {
  DOCUMENTS = 'documents',
  ACTIVITY_FEED = 'activity_feed',
}

export type KnowledgeCenterDetailsProps = {
  isVersionView?: boolean;
  permissions: OperationPermission;
  knowledgeCenter: KnowledgeCenter;
  knowledgeCenterDocuments: KnowledgeCenterDocument[];
  documentsLoading: boolean;
  updateKnowledgeCenter: (value: KnowledgeCenter) => Promise<void>;
  updateVote?: (data: VotingDataProps) => Promise<void>;
  handleKnowledgeCenterDelete: (id: string) => void;
  refreshKnowledgeCenterDocuments: () => void;
  moreload: () => void;
  onAddKnowledgeCenterDocument: (knowledgeCenterDocument: KnowledgeCenterDocument | undefined) => void;
  onEditKnowledgeCenterDocument: (knowledgeCenterDocument: KnowledgeCenterDocument) => void;
  onThreadLinkSelect: (value: string) => void;
  headerVisible: boolean;
};
