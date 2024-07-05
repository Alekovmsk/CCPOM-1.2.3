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
import { ClientCenter } from '../../generated/entity/data/clientCenter';
import { ClientCenterClient } from '../../generated/entity/data/clientCenterClient';
import { EntityDetailsObjectInterface } from '../Explore/ExplorePage.interface';

export type ClientCenterV1Props = {
  deleteStatus: LoadingState;
  handleSelectedKey?: (key: string) => void;
  selectedData: ClientCenter | ClientCenterClient;
  isClientCenterActive: boolean;
  updateClientCenter: (value: ClientCenter) => Promise<void>;
  onClientCenterClientUpdate: (value: ClientCenterClient) => Promise<void>;
  onClientCenterDelete: (id: string) => void;
  onClientCenterClientDelete: (id: string) => void;
  isVersionsView: boolean;
  onAssetClick?: (asset?: EntityDetailsObjectInterface) => void;
  isSummaryPanelOpen: boolean;
  updateVote?: (data: VotingDataProps) => Promise<void>;
  refreshActiveClientCenterClient?: () => void;
  headerVisible?: boolean;
};
