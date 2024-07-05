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
import { PlusOutlined } from '@ant-design/icons';
import { Button, Col, Form, FormProps, Input, Row, Space } from 'antd';
import { DefaultOptionType } from 'antd/lib/select';
import { t } from 'i18next';
import { isEmpty, isString } from 'lodash';
import React, { useEffect } from 'react';
import { ReactComponent as DeleteIcon } from '../../../assets/svg/ic-delete.svg';
import {
  ENTITY_NAME_REGEX,
  HEX_COLOR_CODE_REGEX,
} from '../../../constants/regex.constants';
import { EntityReference } from '../../../generated/entity/type';
import {
  FieldProp,
  FieldTypes,
  FormItemLayout,
} from '../../../interface/FormUtils.interface';
import { getEntityName } from '../../../utils/EntityUtils';
import { generateFormFields, getField } from '../../../utils/formUtils';
import { fetchClientCenterList } from '../../../utils/TagsUtils';
import { useAuthContext } from '../../Auth/AuthProviders/AuthProvider';
import { UserTag } from '../../common/UserTag/UserTag.component';
import { UserTagSize } from '../../common/UserTag/UserTag.interface';
import { AddClientCenterClientFormProps } from './AddClientCenterClientForm.interface';

const AddClientCenterClientForm = ({
  editMode,
  onSave,
  onCancel,
  isLoading,
  clientCenterReviewers = [],
  clientCenterClient,
  isFormInModal = false,
  formRef: form,
}: AddClientCenterClientFormProps) => {
  const { currentUser } = useAuthContext();
  const owner = Form.useWatch<EntityReference | undefined>('owner', form);
  const reviewersList =
    Form.useWatch<EntityReference[]>('reviewers', form) ?? [];

  const getRelatedClientFqnList = (relatedClients: DefaultOptionType[]): string[] =>
    relatedClients.map((tag: DefaultOptionType) => tag.value as string);

  const handleSave: FormProps['onFinish'] = (formObj) => {
    const {
      name,
      displayName = '',
      description = '',
      fullName,
      dateOfBirth,
      inn,
      snils,
      synonyms = [],
      tags = [],
      mutuallyExclusive = false,
      references = [],
      relatedClients = [],
      color,
      iconURL,
    } = formObj;

    const selectedOwner = owner || {
      id: currentUser?.id ?? '',
      type: 'user',
    };

    const style = {
      color,
      iconURL,
    };

    const data = {
      name: name.trim(),
      displayName: displayName?.trim(),
      fullName: fullName,
      dateOfBirth: dateOfBirth,
      inn: inn,
      snils: snils,
      description: description,
      reviewers: reviewersList,
      relatedClients: editMode
        ? relatedClients.map((client: DefaultOptionType) => {
            if (isString(client)) {
              return clientCenterClient?.relatedClients?.find(
                (r) => r.fullyQualifiedName === client
              )?.id;
            }
            if (client.data) {
              return client.data.id;
            }

            return clientCenterClient?.relatedClients?.find(
              (r) => r.fullyQualifiedName === client.value
            )?.id;
          })
        : getRelatedClientFqnList(relatedClients),
      references: references.length > 0 ? references : undefined,
      synonyms: synonyms,
      mutuallyExclusive,
      tags: tags,
      owner: selectedOwner,
      style: isEmpty(style) ? undefined : style,
    };

    onSave(data);
  };

  useEffect(() => {
    if (clientCenterReviewers.length > 0) {
      form.setFieldValue('reviewers', clientCenterReviewers);
    }
    if (editMode && clientCenterClient) {
      const {
        name,
        displayName,
        description,
        fullName,
        dateOfBirth,
        inn,
        snils,
        synonyms,
        tags,
        references,
        mutuallyExclusive,
        reviewers,
        owner,
        relatedClients,
        style,
      } = clientCenterClient;

      form.setFieldsValue({
        name,
        displayName,
        description,
        fullName,
        dateOfBirth,
        inn,
        snils,
        synonyms,
        tags,
        references,
        mutuallyExclusive,
        relatedClients: relatedClients?.map((r) => r.fullyQualifiedName ?? ''),
      });

      if (reviewers) {
        form.setFieldValue('reviewers', reviewers);
      }
      if (style?.color) {
        form.setFieldValue('color', style.color);
      }
      if (style?.iconURL) {
        form.setFieldValue('iconURL', style.iconURL);
      }

      if (owner) {
        form.setFieldValue('owner', owner);
      }
    }
  }, [editMode, clientCenterClient, clientCenterReviewers, form]);

  const formFields: FieldProp[] = [
    {
      name: 'name',
      id: 'root/name',
      label: t('label.name'),
      required: true,
      placeholder: t('label.name'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'name',
      },
      rules: [
        {
          pattern: ENTITY_NAME_REGEX,
          message: t('message.entity-name-validation'),
        },
        {
          min: 1,
          max: 128,
          message: `${t('message.entity-maximum-size', {
            entity: `${t('label.name')}`,
            max: '128',
          })}`,
        },
      ],
    },
    {
      name: 'displayName',
      id: 'root/displayName',
      label: t('label.display-name'),
      required: false,
      placeholder: t('label.display-name'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'display-name',
      },
    },
    {
      name: 'fullName',
      id: 'root/fullName',
      label: t('label.fio'),
      required: false,
      placeholder: t('label.fio'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'full-name',
      },
    },
    {
      name: 'dateOfBirth',
      id: 'root/dateOfBirth',
      label: t('label.date-of-birth'),
      required: false,
      placeholder: t('label.date-of-birth'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'date-of-birth',
      },
    },
    {
      name: 'inn',
      id: 'root/inn',
      label: t('label.inn'),
      required: false,
      placeholder: t('label.inn'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'inn',
      },
    },
    {
      name: 'snils',
      id: 'root/snils',
      label: t('label.snils'),
      required: false,
      placeholder: t('label.snils'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'snils',
      },
    },
    // {
    //   name: 'description',
    //   required: true,
    //   label: t('label.description'),
    //   id: 'root/description',
    //   type: FieldTypes.DESCRIPTION,
    //   props: {
    //     'data-testid': 'description',
    //     initialValue: '',
    //     height: 'auto',
    //   },
    // },
    // {
    //   name: 'tags',
    //   required: false,
    //   label: t('label.tag-plural'),
    //   id: 'root/tags',
    //   type: FieldTypes.TAG_SUGGESTION,
    //   props: {
    //     'data-testid': 'tags-container',
    //     initialOptions: clientCenterClient?.tags?.map((data) => ({
    //       label: data.tagFQN,
    //       value: data.tagFQN,
    //       data, 
    //     })),
    //   },
    // },
    // {
    //   name: 'synonyms',
    //   required: false,
    //   label: t('label.synonym-plural'),
    //   id: 'root/synonyms',
    //   type: FieldTypes.SELECT,
    //   props: {
    //     className: 'client-center-select',
    //     'data-testid': 'synonyms',
    //     mode: 'tags',
    //     placeholder: t('message.synonym-placeholder'),
    //     open: false,
    //   },
    // },
    // {
    //   name: 'color',
    //   id: 'root/color',
    //   label: t('label.color'),
    //   required: false,
    //   type: FieldTypes.COLOR_PICKER,
    //   rules: [
    //     {
    //       pattern: HEX_COLOR_CODE_REGEX,
    //       message: t('message.hex-color-validation'),
    //     },
    //   ],
    // },
    {
      name: 'mutuallyExclusive',
      label: t('label.mutually-exclusive'),
      type: FieldTypes.SWITCH,
      required: false,
      props: {
        'data-testid': 'mutually-exclusive-button',
      },
      id: 'root/mutuallyExclusive',
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
  ];

  const ownerField: FieldProp = {
    name: 'owner',
    id: 'root/owner',
    required: false,
    label: t('label.owner'),
    type: FieldTypes.USER_TEAM_SELECT,
    props: {
      hasPermission: true,
      children: (
        <Button
          data-testid="add-owner"
          icon={<PlusOutlined style={{ color: 'white', fontSize: '12px' }} />}
          size="small"
          type="primary"
        />
      ),
    },
    formItemLayout: FormItemLayout.HORIZONATAL,
    formItemProps: {
      valuePropName: 'owner',
      trigger: 'onUpdate',
    },
  };

  const reviewersField: FieldProp = {
    name: 'reviewers',
    id: 'root/reviewers',
    required: false,
    label: t('label.reviewer-plural'),
    type: FieldTypes.USER_MULTI_SELECT,
    props: {
      hasPermission: true,
      popoverProps: { placement: 'topLeft' },
      children: (
        <Button
          data-testid="add-reviewers"
          icon={<PlusOutlined style={{ color: 'white', fontSize: '12px' }} />}
          size="small"
          type="primary"
        />
      ),
    },
    formItemLayout: FormItemLayout.HORIZONATAL,
    formItemProps: {
      valuePropName: 'selectedUsers',
      trigger: 'onUpdate',
    },
  };

  return (
    <>
      <Form
        form={form}
        initialValues={{
          description: editMode && clientCenterClient ? clientCenterClient.description : '',
        }}
        layout="vertical"
        onFinish={handleSave}>
        {generateFormFields(formFields)}

        {/* <Form.List name="references">
          {(fields, { add, remove }) => (
            <>
              <Form.Item
                className="form-item-horizontal"
                colon={false}
                label={t('label.reference-plural')}>
                <Button
                  data-testid="add-reference"
                  icon={
                    <PlusOutlined
                      style={{ color: 'white', fontSize: '12px' }}
                    />
                  }
                  size="small"
                  type="primary"
                  onClick={() => {
                    add();
                  }}
                />
              </Form.Item>

              {fields.map((field, index) => (
                <Row gutter={[8, 0]} key={field.key}>
                  <Col span={11}>
                    <Form.Item
                      name={[field.name, 'name']}
                      rules={[
                        {
                          required: true,
                          message: `${t('message.field-text-is-required', {
                            fieldText: t('label.name'),
                          })}`,
                        },
                      ]}>
                      <Input
                        id={`name-${index}`}
                        placeholder={t('label.name')}
                      />
                    </Form.Item>
                  </Col>
                  <Col span={11}>
                    <Form.Item
                      name={[field.name, 'endpoint']}
                      rules={[
                        {
                          required: true,
                          message: t('message.valid-url-endpoint'),
                          type: 'url',
                        },
                      ]}>
                      <Input
                        id={`url-${index}`}
                        placeholder={t('label.endpoint')}
                      />
                    </Form.Item>
                  </Col>
                  <Col span={2}>
                    <Button
                      icon={<DeleteIcon width={16} />}
                      size="small"
                      type="text"
                      onClick={() => {
                        remove(field.name);
                      }}
                    />
                  </Col>
                </Row>
              ))}
            </>
          )}
        </Form.List> */}

        {/* <div className="m-t-xss">
          {getField(ownerField)}
          {owner && (
            <div className="m-y-sm" data-testid="owner-container">
              <UserTag
                id={owner.id}
                name={getEntityName(owner)}
                size={UserTagSize.small}
              />
            </div>
          )}
        </div>
        <div className="m-t-xss">
          {getField(reviewersField)}
          {Boolean(reviewersList.length) && (
            <Space wrap data-testid="reviewers-container" size={[8, 8]}>
              {reviewersList.map((d) => (
                <UserTag
                  id={d.id}
                  key={d.id}
                  name={getEntityName(d)}
                  size={UserTagSize.small}
                />
              ))}
            </Space>
          )}
        </div> */}

        {!isFormInModal && (
          <Form.Item>
            <Space
              className="w-full justify-end"
              data-testid="cta-buttons"
              size={16}>
              <Button
                data-testid="cancel-client-center-client"
                type="link"
                onClick={onCancel}>
                {t('label.cancel')}
              </Button>
              <Button
                data-testid="save-client-center-client"
                htmlType="submit"
                loading={isLoading}
                type="primary">
                {t('label.save')}
              </Button>
            </Space>
          </Form.Item>
        )}
      </Form>
    </>
  );
};

export default AddClientCenterClientForm;
