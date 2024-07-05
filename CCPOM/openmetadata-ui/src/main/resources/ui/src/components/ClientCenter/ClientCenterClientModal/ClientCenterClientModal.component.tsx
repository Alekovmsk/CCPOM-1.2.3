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
import { ClientCenterClient } from '../../../generated/entity/data/clientCenterClient';
import { EntityReference } from '../../../generated/entity/type';
import AddClientCenterClientForm from '../AddClientCenterClientForm/AddClientCenterClientForm.component';
import { ClientCenterClientForm } from '../AddClientCenterClientForm/AddClientCenterClientForm.interface';

interface Props {
  clientCenterName: string;
  clientCenterClient: ClientCenterClient | undefined;
  clientCenterReviewers?: EntityReference[];
  onSave: (value: ClientCenterClientForm) => void;
  onCancel: () => void;
  visible: boolean;
  editMode: boolean;
}

const ClientCenterClientModal: FC<Props> = ({
  editMode,
  clientCenterName,
  visible,
  clientCenterClient,
  clientCenterReviewers = [],
  onSave,
  onCancel,
}) => {
  const { t } = useTranslation();
  const [form] = useForm();

  const dialogTitle = useMemo(() => {
    return editMode
      ? t('label.edit-entity', { entity: t('label.client-center-client-v') })
      : t('label.add-entity', { entity: t('label.client-center-client-v') });
  }, [editMode]);

  useEffect(() => {
    !visible && form.resetFields();
  }, [visible]);

  return (
    <Modal
      centered
      destroyOnClose
      cancelText={t('label.cancel')}
      className="edit-client-center-modal"
      closable={false}
      data-testid="edit-client-center-modal"
      footer={[
        <Button key="cancel-btn" type="link" onClick={onCancel}>
          {t('label.cancel')}
        </Button>,
        <Button
          data-testid="save-client-center-client"
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
      <AddClientCenterClientForm
        isFormInModal
        isLoading
        editMode={editMode}
        formRef={form}
        clientCenterName={clientCenterName}
        clientCenterReviewers={clientCenterReviewers}
        clientCenterClient={clientCenterClient}
        onCancel={onCancel}
        onSave={onSave}
      />
    </Modal>
  );
};

export default ClientCenterClientModal;
