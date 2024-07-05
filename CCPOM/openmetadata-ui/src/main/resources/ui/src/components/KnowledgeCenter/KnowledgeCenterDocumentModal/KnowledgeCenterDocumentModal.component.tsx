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
import { Button, Modal } from 'antd';
import { useForm } from 'antd/lib/form/Form';
import React, { FC, useEffect, useMemo } from 'react'; 
import { useTranslation } from 'react-i18next';
import { KnowledgeCenterDocument } from '../../../generated/entity/data/knowledgeCenterDocument';
import { EntityReference } from '../../../generated/entity/type';
import AddKnowledgeCenterDocumentForm from '../AddKnowledgeCenterDocumentForm/AddKnowledgeCenterDocumentForm.component';
import { KnowledgeCenterDocumentForm } from '../AddKnowledgeCenterDocumentForm/AddKnowledgeCenterDocumentForm.interface';

interface Props {
  knowledgeCenterName: string;
  knowledgeCenterDocument: KnowledgeCenterDocument | undefined;
  knowledgeCenterReviewers?: EntityReference[];
  onSave: (value: KnowledgeCenterDocumentForm) => void;
  onCancel: () => void;
  visible: boolean;
  editMode: boolean;
}

const KnowledgeCenterDocumentModal: FC<Props> = ({
  editMode,
  knowledgeCenterName,
  visible,
  knowledgeCenterDocument,
  knowledgeCenterReviewers = [],
  onSave,
  onCancel,
}) => {
  const { t } = useTranslation();
  const [form] = useForm();

  const dialogTitle = useMemo(() => {
    return editMode
      ? t('label.edit-entity', { entity: t('label.knowledge-center-document') })
      : t('label.add-entity', { entity: t('label.knowledge-center-document') });
  }, [editMode]);

  useEffect(() => {
    !visible && form.resetFields();
  }, [visible]);

  return (
    <Modal
      centered
      destroyOnClose
      cancelText={t('label.cancel')}
      className="edit-knowledge-center-modal"
      closable={false}
      data-testid="edit-knowledge-center-modal"
      footer={[
        <Button key="cancel-btn" type="link" onClick={onCancel}>
          {t('label.cancel')}
        </Button>,
        <Button
          data-testid="save-knowledge-center-document"
          key="save-btn"
          type="primary"
          onClick={() => form.submit()}>
          {t('label.save')}
        </Button>,
      ]}
      maskClosable={false}
      okText={t('label.save')}
      open={visible}
      title={dialogTitle}
      width={800}
      onCancel={onCancel}>
      <AddKnowledgeCenterDocumentForm
        isFormInModal
        isLoading
        editMode={editMode}
        formRef={form}
        knowledgeCenterName={knowledgeCenterName}
        knowledgeCenterReviewers={knowledgeCenterReviewers}
        knowledgeCenterDocument={knowledgeCenterDocument}
        onCancel={onCancel}
        onSave={onSave}
      />
    </Modal>
  );
};

export default KnowledgeCenterDocumentModal;
