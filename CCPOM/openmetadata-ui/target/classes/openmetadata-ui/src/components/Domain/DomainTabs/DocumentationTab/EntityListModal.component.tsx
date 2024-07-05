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
// import { CheckOutlined, CloseOutlined, PlusOutlined } from '@ant-design/icons';
import { Button, Col, Form, Input, Modal, Row } from 'antd';
import React, { useEffect, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { ReactComponent as PlusIcon } from '../../../../assets/svg/plus-primary.svg';
import SVGIcons, { Icons } from '../../../../utils/SvgUtils';
import { EntityEl } from '../../../../generated/entity/domains/perimeter';
import CSVSelector from './CSVSelector';
import csvFile from '../../../../assets/csv/entity_list.csv';

interface EntityListModalProps {
  entityList: EntityEl[];
  isVisible: boolean;
  onClose: () => void;
  onSave: (values: EntityEl[]) => void;
}

const EntityListModal = ({
  entityList,
  isVisible,
  onClose,
  onSave,
}: EntityListModalProps) => {
  const { t } = useTranslation();
  const [form] = Form.useForm<{ entityList: EntityEl[] }>();
  // console.log(csvFile);
  const csv = csvFile;
  // const fileRef = React.useRef(null);
  // const [data, setData] = useState<string[][]>([]);
  // const handleChange = (e) => {
  //   e.preventDefault();

  //   var files = e.target.files, f = files[0];
  //   var reader = new FileReader();
  //   reader.onload = function (e) {
  //       var data = e.target.result;
  //       let readedData = XLSX.read(data, {type: 'binary'});
  //       const wsname = readedData.SheetNames[0];
  //       const ws = readedData.Sheets[wsname];

  //       /* Convert array to json*/
  //       const dataParse = XLSX.utils.sheet_to_json(ws, {header:1});
  //       setFileUploaded(dataParse);
  //   };
  //   reader.readAsBinaryString(f)
  // };
  // const handleClick = () => {
  //   fileRef.current.click();
  // };

  const handleSubmit = async (obj: { entityList: EntityEl[] }) => {
    try {
      await form.validateFields();
      onSave(obj.entityList);
    } catch (_) {
      // Nothing here
    }
  };

  const handleAddCsv = (_data: string[][]) => {
    const form_now = form.getFieldValue('entityList');
    _data.shift();
    try {
      const csvValues = _data.map((item) => {
        return {
          db: item[0] ?? undefined,
          schema: item[1] ?? undefined,
          name: item[2] ? item[2].replace('\r', '') : undefined,
        }
      })
      const newEntities = [...form_now, ...csvValues];
      form.setFieldValue('entityList', newEntities);
    }
    catch (error) {
      console.error(error);
    };
  }

  useEffect(() => {
    if (isVisible) {
      const newRefs =
        entityList.length > 0
          ? entityList
          : [{
            db: '',
            schema: '',
            name: '',
          }];
      form.setFieldValue('entityList', newRefs);
    }
  }, [isVisible]);

  return (
    <Modal
      destroyOnClose
      data-testid="glossary-term-entityList-modal"
      width={1000}
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
      title={t('label.domain-entity-plural')}
      onCancel={onClose}>
      <Form className="reference-edit-form" form={form} onFinish={handleSubmit}>
        <Form.List name="entityList">
          {(fields, { add, remove }) => (
            <>
              <Row gutter={8}>
                <Col span={7}>
                  <label>{t('label.database')}</label>
                </Col>
                <Col span={7}>
                  <label>{t('label.schema')}</label>
                </Col>
                <Col span={8}>
                  <label>{t('label.domain-entity')}</label>
                </Col>
              </Row>
              {fields.map(({ key, name, ...restField }) => (
                <Row gutter={8} key={key}>
                  <Col span={7}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'db']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.database'),
                          }),
                        },
                      ]}>
                      <Input placeholder={t('label.database')} />
                    </Form.Item>
                  </Col>
                  <Col span={7}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'schema']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.schema'),
                          }),
                        },
                      ]}>
                      <Input placeholder={t('label.schema')} />
                    </Form.Item>
                  </Col>
                  <Col span={8}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'name']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.domain-entity'),
                          }),
                        },
                      ]}>
                      <Input placeholder={t('label.domain-entity')} />
                    </Form.Item>
                  </Col>
                  {/* <Col span={11}>
                    <Form.Item
                      className="w-full"
                      {...restField}
                      name={[name, 'endpoint']}
                      rules={[
                        {
                          required: true,
                          message: t('label.field-required', {
                            field: t('label.endpoint'),
                          }),
                        },
                        {
                          type: 'url',
                          message: t('message.endpoint-should-be-valid'),
                        },
                      ]}>
                      <Input placeholder={t('label.endpoint')} />
                    </Form.Item>
                  </Col> */}

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
              <Row gutter={8}>
                <Col span={14}>
                  <Form.Item>
                    <Button
                      className="text-primary d-flex items-center"
                      data-testid="add-entityList-button"
                      icon={<PlusIcon className="anticon" />}
                      size="small"
                      onClick={() => add()}>
                      {t('label.add')}
                    </Button>
                  </Form.Item>
                </Col>
                <Col span={4}>
                  <CSVSelector onChange={(_data) => handleAddCsv(_data)} />
                </Col>
                <Col span={4}>
                  <Button
                    className="text-primary items-center"
                    size="small"
                    href='/entity_list.csv'
                    target='_blank'
                    download>
                    {t('label.csv-pattern')}
                  </Button>
                </Col>
            </Row>
        </>
          )}
      </Form.List>
    </Form>
    </Modal >
  );
};

export default EntityListModal;
