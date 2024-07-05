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
import { LoadingState } from 'Models';
import { VotingDataProps } from '../Voting/voting.interface';
import { KnowledgeCenter } from '../../generated/entity/data/knowledgeCenter';
import { KnowledgeCenterDocument } from '../../generated/entity/data/knowledgeCenterDocument';
import { EntityDetailsObjectInterface } from '../Explore/ExplorePage.interface';

export type KnowledgeCenterV1Props = {
  deleteStatus: LoadingState;
  handleSelectedKey?: (key: string) => void;
  selectedData: KnowledgeCenter | KnowledgeCenterDocument;
  isKnowledgeCenterActive: boolean;
  updateKnowledgeCenter: (value: KnowledgeCenter) => Promise<void>;
  onKnowledgeCenterDocumentUpdate: (value: KnowledgeCenterDocument) => Promise<void>;
  onKnowledgeCenterDelete: (id: string) => void;
  onKnowledgeCenterDocumentDelete: (id: string) => void;
  isVersionsView: boolean;
  onAssetClick?: (asset?: EntityDetailsObjectInterface) => void;
  isSummaryPanelOpen: boolean;
  updateVote?: (data: VotingDataProps) => Promise<void>;
  refreshActiveKnowledgeCenterDocument?: () => void;
  headerVisible?: boolean;
};
