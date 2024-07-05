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
import { DataSourceEl } from '../../../../generated/entity/domains/domain';
import AsyncSelectListPlus from '../../../AsyncSelectListPlus/AsyncSelectListPlus';
import { fetchAutoSystemsForConsumer } from '../../../../utils/AutoSystemClassBase';

interface DataSourcesListModalProps {
  dataSourcesList: DataSourceEl[];
  isVisible: boolean;
  onClose: () => void;
  onSave: (values: DataSourceEl[]) => void;
}

const DataSourcesListModal = ({
  dataSourcesList,
  isVisible,
  onClose,
  onSave,
}: DataSourcesListModalProps) => {
  const { t } = useTranslation();
  const [form] = Form.useForm<{ dataSourcesList: DataSourceEl[] }>();

  const handleSubmit = async (obj: { dataSourcesList: DataSourceEl[] }) => {
    try {
      await form.validateFields();
      onSave(obj.dataSourcesList);
    } catch (_) {
      // Nothing here
    }
  };

  useEffect(() => {
    if (isVisible) {
      const newRefs =
        dataSourcesList.length > 0
          ? dataSourcesList
          : [{
            elNumber: '1',
            name: undefined,
            type: '',
            loadMode: '',
            loadObjectsList: '',
          }];
      form.setFieldValue('dataSourcesList', newRefs);
    }
  }, [isVisible]);

  return (
    <Modal
      destroyOnClose
      width={1500}
      // data-testid="glossary-term-dataSourcesList-modal"
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
      title={t('label.data-sources-list')}
      onCancel={onClose}>
      <Form className="reference-edit-form" form={form} onFinish={handleSubmit}>
        <Form.List name="dataSourcesList">
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
                      initialValue={key+1}>
                      <Input placeholder={t('label.number')} />
                    </Form.Item>
                  </Col>
                  <Col span={6}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'name']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.data-source-name'),
                          }),
                        },
                      ]}
                      >
                      <AsyncSelectListPlus
                        fetchOptions={fetchAutoSystemsForConsumer}
                        mode={'multiple'}
                        placeholder={t('label.data-source-name')}
                        onChange={async (option) => {
                          if (option[0])
                            {const fields = form.getFieldsValue();
                            const { dataSourcesList } = fields
                            Object.assign( dataSourcesList[name], { name: option[0].value ?? undefined })
                            form.setFieldsValue({dataSourcesList})}
                        }}
                      />
                    </Form.Item>
                  </Col>
                  <Col span={5}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'type']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.data-source-type'),
                          }),
                        },
                      ]}
                      >
                      <Input placeholder={t('label.data-source-type')} />
                    </Form.Item>
                  </Col>
                  <Col span={5}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'loadMode']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.data-source-load-mode'),
                          }),
                        },
                      ]}
                      >
                      <Input placeholder={t('label.data-source-load-mode')} />
                    </Form.Item>
                  </Col>
                  <Col span={5}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'loadObjectsList']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.data-source-load-objects-list'),
                          }),
                        },
                      ]}
                      >
                      <Input placeholder={t('label.data-source-load-objects-list')} />
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
                  data-testid="add-dataSourcesList-button"
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

export default DataSourcesListModal;
