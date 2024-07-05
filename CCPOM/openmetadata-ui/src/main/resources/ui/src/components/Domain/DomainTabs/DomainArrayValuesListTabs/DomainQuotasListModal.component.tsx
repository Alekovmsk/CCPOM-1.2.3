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
import { Button, Col, Form, Input, Modal, Row } from 'antd';
import React, { useEffect } from 'react';
import { useTranslation } from 'react-i18next';
import { ReactComponent as PlusIcon } from '../../../../assets/svg/plus-primary.svg';
import SVGIcons, { Icons } from '../../../../utils/SvgUtils';
import { DomainQuota } from '../../../../generated/entity/domains/domain';
import AsyncSelectListPlus from '../../../AsyncSelectListPlus/AsyncSelectListPlus';
import { fetchAutoSystemsForConsumer } from '../../../../utils/AutoSystemClassBase';

interface DomainQuotasListModalProps {
  domainQuotasList: DomainQuota[];
  isVisible: boolean;
  onClose: () => void;
  onSave: (values: DomainQuota[]) => void;
}

const DomainQuotasListModal = ({
  domainQuotasList,
  isVisible,
  onClose,
  onSave,
}: DomainQuotasListModalProps) => {
  const { t } = useTranslation();
  const [form] = Form.useForm<{ domainQuotasList: DomainQuota[] }>();

  const handleSubmit = async (obj: { domainQuotasList: DomainQuota[] }) => {
    try {
      await form.validateFields();
      onSave(obj.domainQuotasList);
    } catch (_) {
      // Nothing here
    }
  };

  useEffect(() => {
    if (isVisible) {
      const newRefs =
        domainQuotasList.length > 0
          ? domainQuotasList
          : [{
            elNumber: '1',
            subsystem: undefined,
            resourceType: '',
            quotaSize: '',
            comment: '',
          }];
      form.setFieldValue('domainQuotasList', newRefs);
    }
  }, [isVisible]);

  return (
    <Modal
      destroyOnClose
      width={1250}
      // data-testid="glossary-term-domainQuotasList-modal"
      footer={[
        <Button key="cancel-btn" type="link" onClick={onClose}>
          {t('label.cancel')}
        </Button>,
        <Button
          data-testid="save-btn"
          key="save-btn"
          type="primary"
          onClick={() => form.submit()}>
          {t('label.save')}
        </Button>,
      ]}
      open={isVisible}
      title={t('label.domain-quotas-list')}
      onCancel={onClose}>
      <Form className="reference-edit-form" form={form} onFinish={handleSubmit}>
        <Form.List name="domainQuotasList">
          {(fields, { add, remove }) => (
            <>
              {fields.map(({ key, name, ...restField }) => (
                <Row gutter={8} key={key}>
                  <Col span={2}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'elNumber']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.number'),
                          }),
                        },
                      ]}
                      initialValue={key+1}
                      >
                      <Input placeholder={t('label.number')} />
                    </Form.Item>
                  </Col>
                  <Col span={6}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'subsystem']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.subsystem'),
                          }),
                        },
                      ]}
                      >
                      <AsyncSelectListPlus
                        fetchOptions={fetchAutoSystemsForConsumer}
                        mode={'multiple'}
                        placeholder={t('label.subsystem')}
                        onChange={async (option) => {
                          if (option[0])
                            {const fields = form.getFieldsValue();
                            const { domainQuotasList } = fields
                            Object.assign( domainQuotasList[name], { subsystem: option[0].value ?? undefined })
                            form.setFieldsValue({domainQuotasList})}
                        }}
                      />
                    </Form.Item>
                  </Col>
                  <Col span={5}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'resourceType']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.resource-type'),
                          }),
                        },
                      ]}
                      >
                      <Input placeholder={t('label.resource-type')} />
                    </Form.Item>
                  </Col>
                  <Col span={5}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'quotaSize']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.quota-size'),
                          }),
                        },
                      ]}
                      >
                      <Input placeholder={t('label.quota-size')} />
                    </Form.Item>
                  </Col>
                  <Col span={5}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'comment']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.comment'),
                          }),
                        },
                      ]}
                      >
                      <Input placeholder={t('label.comment')} />
                    </Form.Item>
                  </Col>


                  <Col span={1}>
                    <Button
                      icon={
                        <SVGIcons
                          alt="delete"
                          icon={Icons.DELETE}
                          width="16px"
                        />
                      }
                      size="small"
                      type="text"
                      onClick={() => remove(name)}
                    />
                  </Col>
                </Row>
              ))}
              <Form.Item>
                <Button
                  className="text-primary d-flex items-center"
                  data-testid="add-domainQuotasList-button"
                  icon={<PlusIcon className="anticon" />}
                  size="small"
                  onClick={() => add()}>
                  {t('label.add')}
                </Button>
              </Form.Item>
            </>
          )}
        </Form.List>
      </Form>
    </Modal>
  );
};

export default DomainQuotasListModal;
