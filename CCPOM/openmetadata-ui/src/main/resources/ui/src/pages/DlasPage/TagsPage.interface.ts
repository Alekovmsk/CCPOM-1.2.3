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

import { LoadingState } from 'Models';
import { DlaClassification } from '../../generated/entity/dlaClassification/dlaClassification';
import { Dla, Indicator } from '../../generated/entity/dlaClassification/dla';

export type DeleteTagDetailsType = {
  id: string;
  name: string;
  categoryName?: string;
  isCategory: boolean;
  status?: LoadingState;
};

export type DeleteTagsType = {
  data: DeleteTagDetailsType | undefined;
  state: boolean;
};

export interface SubmitProps {
  name: string;
  description: string;
  displayName: string;
  docNumber: string;
  docType: string;
  conclusionDate: string;
  expirationDate: string;
  validity: string;
  prolongation: string;
  domainData: string;
  consumer: string;
  docStatus: string;
  dataRegister: string;
  dataManager: string;
  dataSteward: string;
  autoSourceSystem: string[] | undefined;
  autoConsumerSystem: string[] | undefined;
  publicationArea: string;
  cronUpdateData: string;
  cronDataAvailability: string;
  cronDataActualization: string;
  dataProvisionIndicators: Indicator[] | undefined;
  dataQualityIndicators: Indicator[] | undefined;
  reportingType: string;
  reportingPeriodicity: string;
  reportingReceiverRole: string;
  reportingResponsible: string;
  reportingHref: string;
  incidenSigns: string;
  additionalInformation: string;
  mutuallyExclusive?: boolean;
  iconURL?: string;
  color?: string;
}

export interface RenameFormProps {
  visible: boolean;
  isEditing: boolean;
  isTier: boolean;
  onCancel: () => void;
  header: string;
  initialValues?: Dla;
  onSubmit: (value: SubmitProps) => void;
  showMutuallyExclusive?: boolean;
  isClassification?: boolean;
  data?: DlaClassification[];
  isLoading: boolean;
  isSystemTag?: boolean;
  permissions?: {
    createTags?: boolean;
    editDescription?: boolean;
    editDisplayName?: boolean;
    editAll?: boolean;
  };
}
