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
import { DomainTeamMember } from '../../../../generated/entity/domains/domain';
import AsyncSelectListPlus from '../../../AsyncSelectListPlus/AsyncSelectListPlus';
import { fetchUserEsks } from '../../../../utils/UserEskClassBase';

interface DomainTeamModalProps {
  domainTeam: DomainTeamMember[];
  isVisible: boolean;
  onClose: () => void;
  onSave: (values: DomainTeamMember[]) => void;
}

const DomainTeamModal = ({
  domainTeam,
  isVisible,
  onClose,
  onSave,
}: DomainTeamModalProps) => {
  const { t } = useTranslation();
  const [form] = Form.useForm<{ domainTeam: DomainTeamMember[] }>();

  const handleSubmit = async (obj: { domainTeam: DomainTeamMember[] }) => {
    try {
      console.log('formformformformformdomainteam');
      console.log(form);
      console.log(obj);
      await form.validateFields();
      onSave(obj.domainTeam);
    } catch (_) {
      // Nothing here
    }
  };

  useEffect(() => {
    if (isVisible) {
      const newRefs =
        domainTeam.length > 0
          ? domainTeam
          : [{
            elNumber: '1',
            fullName: undefined,
            ssp: '',
            role: '',
            responseArea: '',
          }];
      form.setFieldValue('domainTeam', newRefs);
    }
  }, [isVisible]);

  return (
    <Modal
      destroyOnClose
      width={1500}
      // data-testid="glossary-term-domainTeam-modal"
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
      title={t('label.domain-team')}
      onCancel={onClose}>
      <Form className="reference-edit-form" form={form} onFinish={handleSubmit}>
        <Form.List name="domainTeam">
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
                      name={[name, 'fullName']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.domain-team-member-full-name'),
                          }),
                        },
                      ]}
                      >
                      {/* <Input placeholder={t('label.domain-team-member-full-name')} /> */}
                      <AsyncSelectListPlus
                        fetchOptions={fetchUserEsks}
                        mode={'multiple'}
                        placeholder={t('label.domain-team-member-full-name')}
                        onChange={async (option) => {
                          if (option[0])
                            {const fields = form.getFieldsValue();
                            const { domainTeam } = fields
                            Object.assign( domainTeam[name], { fullName: option[0].value ?? undefined })
                            form.setFieldsValue({domainTeam})}
                        }}
                      />
                    </Form.Item>
                  </Col>
                  <Col span={5}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'ssp']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.domain-team-member-ssp'),
                          }),
                        },
                      ]}
                      >
                      <Input placeholder={t('label.domain-team-member-ssp')} />
                    </Form.Item>
                  </Col>
                  <Col span={5}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'role']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.domain-team-member-role'),
                          }),
                        },
                      ]}
                      >
                      <Input placeholder={t('label.domain-team-member-role')} />
                    </Form.Item>
                  </Col>
                  <Col span={5}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'responseArea']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.domain-team-member-response-area'),
                          }),
                        },
                      ]}
                      >
                      <Input placeholder={t('label.domain-team-member-response-area')} />
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
                  data-testid="add-domainTeam-button"
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

export default DomainTeamModal;
