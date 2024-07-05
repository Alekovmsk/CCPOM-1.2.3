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

import { FormInstance } from 'antd';
import { CreateKnowledgeCenterDocument } from '../../../generated/api/data/createKnowledgeCenterDocument';
import {
  KnowledgeCenterDocument,
  TagLabel,
  DocumentReference,
} from '../../../generated/entity/data/knowledgeCenterDocument';
import { EntityReference } from '../../../generated/type/entityLineage';

export interface AddKnowledgeCenterDocumentFormProps {
  editMode: boolean;
  isLoading: boolean;
  onSave: (value: KnowledgeCenterDocumentForm) => void;
  onCancel: () => void;
  knowledgeCenterDocument?: KnowledgeCenterDocument;
  knowledgeCenterName: string;
  knowledgeCenterReviewers?: EntityReference[];
  isFormInModal?: boolean;
  formRef: FormInstance<CreateKnowledgeCenterDocument>;
}

export interface KnowledgeCenterDocumentForm {
  name: string;
  displayName: string;
  description: string;
  reviewers: EntityReference[];
  relatedDocuments: string[] | undefined;
  references: DocumentReference[] | undefined;
  synonyms: string[];
  mutuallyExclusive: boolean;
  tags: TagLabel[];
  owner: EntityReference;
  style: KnowledgeCenterDocument['style'];
}
