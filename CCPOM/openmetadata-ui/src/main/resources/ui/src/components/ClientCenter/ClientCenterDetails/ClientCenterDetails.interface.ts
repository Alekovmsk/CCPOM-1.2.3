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

import { ClientCenter } from '../../../generated/entity/data/clientCenter';
import { ClientCenterClient } from '../../../generated/entity/data/clientCenterClient';
import { OperationPermission } from '../../PermissionProvider/PermissionProvider.interface';
import { VotingDataProps } from '../../Voting/voting.interface';

export enum ClientCenterTabs {
  CLIENTS = 'clients',
  ACTIVITY_FEED = 'activity_feed',
}

export type ClientCenterDetailsProps = {
  isVersionView?: boolean;
  permissions: OperationPermission;
  clientCenter: ClientCenter;
  clientCenterClients: ClientCenterClient[];
  clientsLoading: boolean;
  updateClientCenter: (value: ClientCenter) => Promise<void>;
  updateVote?: (data: VotingDataProps) => Promise<void>;
  handleClientCenterDelete: (id: string) => void;
  refreshClientCenterClients: () => void;
  moreload: () => void;
  onAddClientCenterClient: (clientCenterClient: ClientCenterClient | undefined) => void;
  onEditClientCenterClient: (clientCenterClient: ClientCenterClient) => void;
  onThreadLinkSelect: (value: string) => void;
  headerVisible: boolean;
};
