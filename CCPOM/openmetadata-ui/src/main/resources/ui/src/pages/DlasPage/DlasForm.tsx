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

import { ReactComponent as DeleteIcon } from '../../assets/svg/ic-delete.svg';
import { PlusOutlined } from '@ant-design/icons';
import { Button, Form, Modal, FormProps, Typography, Card, Row, Col, Input, Switch, DatePicker } from 'antd';
import React, { useEffect, useMemo, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { VALIDATION_MESSAGES } from '../../constants/constants';
import {
  ENTITY_NAME_REGEX,
  HEX_COLOR_CODE_REGEX,
} from '../../constants/regex.constants';
import { DEFAULT_FORM_VALUE } from '../../constants/Tags.constant';
import { FieldProp, FieldTypes, FormItemLayout, } from '../../interface/FormUtils.interface';
import { generateFormFields, getField } from '../../utils/formUtils';
import { RenameFormProps } from './TagsPage.interface';
import { EntityReference } from '../../generated/entity/type';
import { getEntityName } from '../../utils/EntityUtils';
import { UserTagSize } from '../../components/common/UserTag/UserTag.interface';
import { UserTag } from '../../components/common/UserTag/UserTag.component';


import { cond, includes, isEmpty, isString } from 'lodash';
import { DefaultOptionType } from 'antd/lib/select';
import { fetchDatabaseServiceList } from '../../utils/ServiceUtils';
import { fetchDocumentsList } from '../../utils/DocStoreAutoSystemUtils';
import { useAuthContext } from '../../components/Auth/AuthProviders/AuthProvider';
import { Moment } from 'moment';
import moment from 'moment';
import AsyncSelectListNoTag from '../../components/AsyncSelectListNoTag/AsyncSelectListNoTag';
import AsyncSelectListPlus from '../../components/AsyncSelectListPlus/AsyncSelectListPlus';





const TagsForm = ({
  visible,
  onCancel,
  header,
  initialValues,
  onSubmit,
  showMutuallyExclusive = false,
  isLoading,
  isSystemTag,
  permissions,
  isClassification,
  isEditing = false,
  isTier = false,
}: RenameFormProps) => {
  const { t } = useTranslation();
  const [form] = Form.useForm();
  const owner = Form.useWatch<EntityReference | undefined>('owner', form);
  const [countProvInd, setCountProvInd] = useState(0);
  const [countQualInd, setCountQualInd] = useState(0);
  const { currentUser } = useAuthContext();
  const [concDate, setConcDate] = useState('')
  const [isProlongationActive, setIsProlongationActive] = useState(false)

  const getRelatedTermFqnList = (relatedTerms: DefaultOptionType[]): string[] =>
  relatedTerms.map((tag: DefaultOptionType) => tag.value as string);


  const handleSave: FormProps['onFinish'] = (formObj) => {
    const {
      name,
      description,
      displayName,
      docNumber,
      docType,
      conclusionDate,
      expirationDate,
      validity,
      prolongation,
      domainData,
      consumer,
      docStatus,
      dataRegister,
      dataManager,
      dataSteward,
      autoSourceSystem = [],
      autoConsumerSystem = [],
      publicationArea,
      cronUpdateData,
      cronDataAvailability,
      cronDataActualization,
      dataProvisionIndicators = [],
      dataQualityIndicators = [],
      reportingType,
      reportingPeriodicity,
      reportingReceiverRole,
      reportingResponsible,
      reportingHref,
      incidenSigns,
      additionalInformation,
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
      autoSourceSystem: isEditing
        ? autoSourceSystem.map((term: DefaultOptionType) => {
            if (isString(term)) {
              return initialValues?.autoSourceSystem?.find(
                (r) => r.fullyQualifiedName === term
              )?.id;
            }
            if (term.data) {
              return term.data.id;
            }

            return initialValues?.autoSourceSystem?.find(
              (r) => r.fullyQualifiedName === term.value
            )?.id;
          }).map((system) => ({id: system,  type: 'databaseService',}))
        : getRelatedTermFqnList(autoSourceSystem),
      autoConsumerSystem: isEditing
        ? autoConsumerSystem.map((term: DefaultOptionType) => {
            if (isString(term)) {
              return initialValues?.autoConsumerSystem?.find(
                (r) => r.fullyQualifiedName === term
              )?.id;
            }
            if (term.data) {
              return term.data.id;
            }

            return initialValues?.autoConsumerSystem?.find(
              (r) => r.fullyQualifiedName === term.value
            )?.id;
          }).map((system) => ({id: system,  type: 'databaseService',}))
        : getRelatedTermFqnList(autoConsumerSystem),
      dataProvisionIndicators: dataProvisionIndicators.length > 0 ? dataProvisionIndicators : undefined,
      dataQualityIndicators: dataQualityIndicators.length > 0 ? dataQualityIndicators : undefined,
      description: description,
      docNumber: docNumber,
      docType: docType,
      conclusionDate: conclusionDate,
      expirationDate: expirationDate,
      validity: validity,
      prolongation: prolongation,
      domainData: domainData,
      consumer: getRelatedTermFqnList(consumer)[0],
      docStatus: docStatus,
      dataRegister: dataRegister,
      dataManager: dataManager,
      dataSteward: dataSteward,
      publicationArea: publicationArea,
      cronUpdateData: cronUpdateData,
      cronDataAvailability: cronDataAvailability,
      cronDataActualization: cronDataActualization,
      reportingType: reportingType,
      reportingPeriodicity: reportingPeriodicity,
      reportingReceiverRole: reportingReceiverRole,
      reportingResponsible: reportingResponsible,
      reportingHref: reportingHref,
      incidenSigns: incidenSigns,
      additionalInformation: additionalInformation,
      style: isEmpty(style) ? undefined : style,
      owner: selectedOwner,
    };

    onSubmit(data);
  };


  useEffect(() => {
    if (initialValues){
      const {
        name,
        description,
        owner,
        docNumber,
        docType,
        conclusionDate,
        expirationDate,
        validity,
        prolongation,
        domainData,
        consumer,
        docStatus,
        dataRegister,
        dataManager,
        dataSteward,
        autoSourceSystem,
        autoConsumerSystem,
        publicationArea,
        cronUpdateData,
        cronDataAvailability,
        cronDataActualization,
        dataProvisionIndicators,
        dataQualityIndicators,
        reportingType,
        reportingPeriodicity,
        reportingReceiverRole,
        reportingResponsible,
        reportingHref,
        incidenSigns,
        additionalInformation
      } = initialValues;
      setCountProvInd(dataProvisionIndicators ? dataProvisionIndicators.length : 0)
      setCountQualInd(dataQualityIndicators ? dataQualityIndicators.length : 0)
      setConcDate(moment(conclusionDate).format('YYYY-MM-DD'));
      setIsProlongationActive(prolongation?prolongation:false);
      form.setFieldsValue({
        name,
        description,
        docNumber,
        docType,
        conclusionDate,
        expirationDate,
        validity,
        prolongation,
        domainData,
        consumer: consumer ? [consumer] : undefined,
        docStatus,
        dataRegister,
        dataManager,
        dataSteward,
        autoSourceSystem: autoSourceSystem?.map((r) => r.fullyQualifiedName || ''),
        autoConsumerSystem: autoConsumerSystem?.map((r) => r.fullyQualifiedName || ''),
        publicationArea,
        cronUpdateData,
        cronDataAvailability,
        cronDataActualization,
        dataProvisionIndicators,
        dataQualityIndicators,
        reportingType,
        reportingPeriodicity,
        reportingReceiverRole,
        reportingResponsible,
        reportingHref,
        incidenSigns,
        additionalInformation,
        iconURL: initialValues?.style?.iconURL,
        color: initialValues?.style?.color,
      });
      if (owner) {
        form.setFieldValue('owner', owner);
      }
    }
  }, [initialValues]);

  const disableNameField = useMemo(
    () => isEditing && isSystemTag,
    [isEditing, isSystemTag]
  );

  const disableDisplayNameField = useMemo(
    () =>
      isEditing
        ? !(permissions?.editDisplayName || permissions?.editAll)
        : !(permissions?.createTags || isClassification),
    [isEditing, isClassification, permissions]
  );

  const disableDescriptionField = useMemo(
    () =>
      isEditing
        ? !(permissions?.editDescription || permissions?.editAll)
        : !(permissions?.createTags || isClassification),
    [isEditing, isClassification, permissions]
  );

  const disableDisabledField = useMemo(
    () =>
      isEditing
        ? !permissions?.editAll
        : !(permissions?.createTags || isClassification),
    [isEditing, isClassification, permissions]
  );

  const disableMutuallyExclusiveField = useMemo(
    () => (isEditing ? !permissions?.editAll : !isClassification),
    [isEditing, isClassification, permissions]
  );

  const ownerField: FieldProp = {
    name: 'owner',
    id: 'root/owner',
    required: false,
    label: t('label.data-provider'),
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

  const formFields11: FieldProp[] = [
    {
      name: 'name',
      id: 'root/name',
      required: true,
      label: t('label.doc-name'),
      type: FieldTypes.TEXT,
      rules: [
        {
          pattern: ENTITY_NAME_REGEX,
          message: t('message.entity-name-validation'),
        },
        { type: 'string', min: 2, max: 64 },
      ],
      props: {
        'data-testid': 'name',
        disabled: disableNameField,
      },
      placeholder: t('label.doc-name'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'docNumber',
      id: 'root/docNumber',
      required: false,
      label: t('label.doc-number'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'docNumber',
        disabled: false,
      },
      placeholder: t('label.doc-number'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'docType',
      id: 'root/docType',
      required: false,
      label: t('label.doc-type'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'docType',
        disabled: true,
      },
      formItemProps: {
        initialValue: 'СКД'
      },
      placeholder: t('label.doc-type'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    }];

    const formFields12: FieldProp[] = [{
      name: 'validity',
      id: 'root/validity',
      required: false,
      label: t('label.validity'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'validity',
        disabled: true,
      },
      placeholder: t('label.validity'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    }];
    
    const formFields13: FieldProp[] = [
    {
      name: 'domainData',
      id: 'root/domainData',
      required: false,
      label: t('label.domain-data'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'domainData',
        disabled: false,
      },
      placeholder: t('label.domain-data'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    // {
    //   name: 'consumer',
    //   id: 'root/consumer',
    //   required: false,
    //   label: t('label.consumer'),
    //   type: FieldTypes.TEXT,
    //   props: {
    //     'data-testid': 'consumer',
    //     disabled: false,
    //   },
    //   placeholder: t('label.consumer'),
    //   formItemLayout: FormItemLayout.HORIZONATAL,
    // },
    {
      name: 'docStatus',
      id: 'root/docStatus',
      required: false,
      label: t('label.doc-status'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'docStatus',
        disabled: false,
      },
      placeholder: t('label.doc-status'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    }];
    const formFields2: FieldProp[] = [
    {
      name: 'dataRegister',
      id: 'root/dataRegister',
      required: false,
      label: t('label.data-register'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'dataRegister',
        disabled: false,
      },
      placeholder: t('label.data-register'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'description',
      id: 'root/description',
      required: true,
      label: t('label.data-description'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'description',
        disabled: disableNameField,
        initialValue: '',
        dd: 'zzz'
      },
      placeholder: t('label.data-description'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    },];
    const formFields3: FieldProp[] = [
    {
      name: 'dataManager',
      id: 'root/dataManager',
      required: false,
      label: t('label.data-manager'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'dataManager',
        disabled: false,
      },
      placeholder: t('label.data-manager'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'dataSteward',
      id: 'root/dataSteward',
      required: false,
      label: t('label.data-steward'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'dataSteward',
        disabled: false,
      },
      placeholder: t('label.data-steward'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'autoSourceSystem',
      id: 'root/autoSourceSystem',
      required: false,
      label: t('label.auto-source-system'),
      type: FieldTypes.ASYNC_SELECT_LIST_NO_TAG,
      formItemLayout: FormItemLayout.HORIZONATAL,
      props: {
        'data-testid': 'autoSourceSystem',
        mode: 'multiple',
        placeholder: t('label.auto-source-system'),
        isConsumerSystem: false,
        fetchOptions: fetchDatabaseServiceList,
        initialOptions: initialValues?.autoSourceSystem?.map((data) => ({
          label: data.fullyQualifiedName,
          value: data.fullyQualifiedName,
          data,
        })),
        filterOptions: [initialValues?.fullyQualifiedName ?? ''],
      },
    },
    {
      name: 'autoSourceSystem1',
      id: 'root/autoSourceSystem',
      required: false,
      label: t('label.111111111'),
      type: FieldTypes.ASYNC_SELECT_LIST_NO_TAG,
      formItemLayout: FormItemLayout.HORIZONATAL,
      props: {
        'data-testid': 'autoSourceSystem',
        mode: 'multiple',
        placeholder: t('label.auto-source-system'),
        isConsumerSystem: false,
        fetchOptions: fetchDocumentsList,
        initialOptions: initialValues?.autoSourceSystem?.map((data) => ({
          label: data.fullyQualifiedName,
          value: data.fullyQualifiedName,
          data,
        })),
        filterOptions: [initialValues?.fullyQualifiedName ?? ''],
      },
    },
    {
      name: 'autoConsumerSystem',
      id: 'root/autoConsumerSystem',
      required: false,
      label: t('label.auto-consumer-system'),
      type: FieldTypes.ASYNC_SELECT_LIST_NO_TAG,
      formItemLayout: FormItemLayout.HORIZONATAL,
      props: {
        'data-testid': 'autoConsumerSystem',
        mode: 'multiple',
        placeholder: t('label.auto-consumer-system'),
        isConsumerSystem: true,
        fetchOptions: fetchDatabaseServiceList,
        initialOptions: initialValues?.autoConsumerSystem?.map((data) => ({
          label: data.fullyQualifiedName,
          value: data.fullyQualifiedName,
          data,
        })),
        filterOptions: [initialValues?.fullyQualifiedName ?? ''],
      },
    },
    {
      name: 'publicationArea',
      id: 'root/publicationArea',
      required: false,
      label: t('label.publication-area'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'publicationArea',
        disabled: false,
      },
      placeholder: t('label.publication-area'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'cronUpdateData',
      id: 'root/cronUpdateData',
      required: false,
      label: t('label.cron-update-data'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'cronUpdateData',
        disabled: false,
      },
      placeholder: t('label.cron-update-data'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'cronDataAvailability',
      id: 'root/cronDataAvailability',
      required: false,
      label: t('label.cron-data-availability'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'cronDataAvailability',
        disabled: false,
      },
      placeholder: t('label.cron-data-availability'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'cronDataActualization',
      id: 'root/cronDataActualization',
      required: false,
      label: t('label.cron-data-actualization'),
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'cronDataActualization',
        disabled: false,
      },
      placeholder: t('label.cron-data-actualization'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    ...(isSystemTag && !isTier
      ? ([
          {
            name: 'disabled',
            required: false,
            label: t('label.disable-tag'),
            id: 'root/disabled',
            type: FieldTypes.SWITCH,
            formItemLayout: 'horizontal',
            props: {
              'data-testid': 'disabled',
              initialValue: initialValues?.disabled ?? false,
              disabled: disableDisabledField,
            },
          },
        ] as FieldProp[])
      : []),
    ...(showMutuallyExclusive
      ? ([
          {
            name: 'mutuallyExclusive',
            label: t('label.mutually-exclusive'),
            type: FieldTypes.SWITCH,
            required: false,
            props: {
              'data-testid': 'mutually-exclusive-button',
              disabled: disableMutuallyExclusiveField,
            },
            id: 'root/mutuallyExclusive',
            formItemLayout: 'horizontal',
            formItemProps: {
              valuePropName: 'checked',
            },
          },
        ] as FieldProp[])
      : []),
  ];

  const formReportingFields: FieldProp[] = [
    {
      name: 'reportingType',
      id: 'root/reportingType',
      required: false,
      label: "Вид отчета",
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'reportingType',
        disabled: false,
      },
      placeholder: "Вид отчета",
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'reportingPeriodicity',
      id: 'root/reportingPeriodicity',
      required: false,
      label: "Периодичность",
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'reportingPeriodicity',
        disabled: false,
      },
      placeholder: "Периодичность",
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'reportingReceiverRole',
      id: 'root/reportingReceiverRole',
      required: false,
      label: "Роль получателя",
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'reportingReceiverRole',
        disabled: false,
      },
      placeholder: "Роль получателя",
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'reportingResponsible',
      id: 'root/reportingResponsible',
      required: false,
      label: "Ответственный за формирование",
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'reportingResponsible',
        disabled: false,
      },
      placeholder: "Ответственный за формирование",
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'reportingHref',
      id: 'root/reportingHref',
      required: false,
      label: "Ссылка на отчет",
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'reportingHref',
        disabled: false,
      },
      placeholder: "Ссылка на отчет",
      formItemLayout: FormItemLayout.HORIZONATAL,
    }];
  
    const formAdditionalFields: FieldProp[] = [
      {
        name: 'incidenSigns',
        id: 'root/incidenSigns',
        required: false,
        label: "Признаки массового/значительного инцидента (опционально)",
        type: FieldTypes.TEXTAREA,
        props: {
          rows: 4,
          'data-testid': 'incidenSigns',
          disabled: false,
        },
        placeholder: "Признаки массового/значительного инцидента (опционально)",
        formItemLayout: FormItemLayout.HORIZONATAL,
      },
      {
        name: 'additionalInformation',
        id: 'root/additionalInformation',
        required: false,
        label: "Дополнительная информация (опиционально)",
        type: FieldTypes.TEXTAREA,
        props: {
          rows: 4,
          'data-testid': 'additionalInformation',
          disabled: false,
        },
        placeholder: "Признаки массового/значительного инцидента (опционально)",
        formItemLayout: FormItemLayout.HORIZONATAL,
      }];

  return (
    <Modal
      centered
      destroyOnClose
      closable={false}
      data-testid="modal-container"
      okButtonProps={{
        form: 'tags',
        type: 'primary',
        htmlType: 'submit',
        loading: isLoading,
      }}
      okText={t('label.save')}
      cancelText={t('label.cancel')}
      open={visible}
      title={
        <Typography.Text strong data-testid="header">
          {header}
        </Typography.Text>
      }
      width={1500}
      onCancel={() => {
        form.setFieldsValue(DEFAULT_FORM_VALUE);
        onCancel();
      }}>
      
      <Form
        form={form}
        initialValues={initialValues ?? DEFAULT_FORM_VALUE}
        layout="vertical"
        name="tags"
        validateMessages={VALIDATION_MESSAGES}
        onFinish={(data) => {
          handleSave(data);
          form.setFieldsValue(DEFAULT_FORM_VALUE);
        }}>
        <Card 
        className="ant-card-feed"
        headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
        style={{
          marginBottom: '20px'
        }}
          title={
            <Typography.Text strong data-testid="header">
              Данные реестра
            </Typography.Text>
          }>
          {generateFormFields(formFields11)}
          <Form.Item
            label={t('label.conclusion-date')}
            className={'form-item-horizontal'}
            name={'conclusionDate'}
            valuePropName='date'
            getValueFromEvent={(e: Moment) => (e ? e.format('YYYY-MM-DD') : undefined)}
            getValueProps={(e: string) => ({ value: e ? moment(e) : undefined })}
            rules={[
              {
                required: true,
                message: `${t('message.field-text-is-required', {
                  fieldText: t('label.conclusion-date'),
                })}`,
              },
            ]}>
            <DatePicker
              id={'conclusionDate'}
              placeholder={t('label.conclusion-date')}
              onChange={(value: Moment | null, dateString: string) => {
                let expDate;
                let valid;
                if (!isProlongationActive)
                  {expDate = moment(dateString).month() === 1 && moment(dateString).date() == 29 ? moment(dateString).add(1,'y').add(1, 'd').format('YYYY-MM-DD') : moment(dateString).add(1,'y').format('YYYY-MM-DD');
                  valid='1 год';}
                else
                  {expDate = moment(dateString).month() === 1 && moment(dateString).date() == 29 ? moment(dateString).add(2,'y').add(1, 'd').format('YYYY-MM-DD') : moment(dateString).add(2,'y').format('YYYY-MM-DD');
                  valid='2 года';}
                form.setFieldsValue({expirationDate:expDate,validity:valid});
                setConcDate(dateString);
              }}
            />
          </Form.Item>
          <Form.Item
            label={t('label.expiration-date')}
            className={'form-item-horizontal'}
            name={'expirationDate'}
            valuePropName='date'
            getValueFromEvent={(e: Moment) => (concDate ? concDate : undefined)}
            getValueProps={(e: string) => ({ value: e ? moment(e) : undefined })}
            >
            <DatePicker
              id={'conclusionDate'}
              placeholder={t('label.expiration-date')}
              disabled= {true}
            />
          </Form.Item>
          {generateFormFields(formFields12)}
          <Form.Item
            label={t('label.prolongation')}
            className={'form-item-horizontal'}
            name={'prolongation'}
            valuePropName='checked'
            >
            <Switch
              id={'prolongation'}
              onChange={(checked: boolean) => {
                let expDate;
                let valid;
                if (!checked)
                  {expDate = moment(concDate).month() === 1 && moment(concDate).date() == 29 ? moment(concDate).add(1,'y').add(1, 'd').format('YYYY-MM-DD') : moment(concDate).add(1,'y').format('YYYY-MM-DD');
                  valid='1 год';}
                else
                  {expDate = moment(concDate).month() === 1 && moment(concDate).date() == 29 ? moment(concDate).add(2,'y').add(1, 'd').format('YYYY-MM-DD') : moment(concDate).add(2,'y').format('YYYY-MM-DD');
                  valid='2 года';}
                form.setFieldsValue({expirationDate:expDate,validity:valid});
                setIsProlongationActive(checked);
                }}
            />
          </Form.Item>
          {generateFormFields(formFields13)}
        </Card>
        <Card 
          headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
          style={{
            marginBottom: '20px'
          }}
          title={
            <Typography.Text strong data-testid="header">
              Основные взаимодействия
            </Typography.Text>
          }>
          <Form.Item
            label={'e1'}
            className={'form-item-horizontal'}
            name={'consumer'}
            >
            <AsyncSelectListPlus
              fetchOptions= {fetchDocumentsList}
              // initialOptions= {initialValues?.autoSourceSystem?.map((data) => ({
              //   label: data.fullyQualifiedName,
              //   value: data.fullyQualifiedName,
              //   data,
              // }))}
              mode = {'multiple'}
              placeholder={'e1'}
              onChange={(option) => {
                console.log('optionoptionoptionoptionoption');
                // let reportInformation0409070val = option[0].data.reportInformation0409070;
                console.log(option);
                form.setFieldsValue({docStatus:"xs"});
                }}
              // disabled= {true}
            />
          </Form.Item>
          <Form.Item
            label={'e2'}
            className={'form-item-horizontal'}
            name={'e2'}
            >
            <Input
              id={`sms`}
              placeholder={"e2"}
            />
          </Form.Item>
          {generateFormFields(formFields2)}
          <div className="m-t-xss">
            <Row gutter={[8, 0]}>
              <Col span={8}>
                {getField(ownerField)}
              </Col>
              <Col span={10}>
                {owner && (
                  <div className="m-y-sm" data-testid="owner-container">
                    <UserTag
                      id={owner.id}
                      name={getEntityName(owner)}
                      size={UserTagSize.small}
                    />
                  </div>
                )}
              </Col>
            </Row>
          </div>
          {generateFormFields(formFields3)}
        </Card>
        <Card 
          headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
          style={{
            marginBottom: '20px'
          }}
          title={
            <Typography.Text strong data-testid="header">
              Параметры предоставлерния данных
            </Typography.Text>
          }>
          <Form.List name="dataProvisionIndicators">
            {(fields, { add, remove }) => (
              <>
                <Form.Item
                  className="form-item-horizontal"
                  colon={false}
                  label={"Индикаторы предоставления данных"}>
                  <Button
                    data-testid="add-prov-indicator"
                    icon={
                      <PlusOutlined
                        style={{ color: 'white', fontSize: '12px' }}
                      />
                    }
                    size="small"
                    type="primary"
                    onClick={() => {
                      add();
                      setCountProvInd(countProvInd + 1);
                    }}
                  >
                  {t('label.add')}
                  </Button>
                </Form.Item>
                {(countProvInd != 0) ? 
                (<Row gutter={[8, 0]}>
                  <Col span={2}><p style={{textAlign: 'center'}}>№</p></Col>
                  <Col span={4}><p style={{textAlign: 'center'}}>Показатель</p></Col>
                  <Col span={8}><p style={{textAlign: 'center'}}>Описание</p></Col>
                  <Col span={4}><p style={{textAlign: 'center'}}>Целевое значение (%)</p></Col>
                  <Col span={4}><p style={{textAlign: 'center'}}>Вес (%)</p></Col>
                </Row>) : []}

                {fields.map((field, index) => (
                  <Row gutter={[8, 0]} key={field.key}>
                    <Col span={2}>
                      <Form.Item
                        name={[field.name, 'number']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "№",
                            })}`,
                          },
                        ]}>
                        <Input
                          id={`number-${index}`}
                          placeholder={"№"}
                        />
                      </Form.Item>
                    </Col>
                    <Col span={4}>
                      <Form.Item
                        name={[field.name, 'index']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Показатель",
                            })}`,
                          },
                        ]}>
                        <Input
                          id={`index-${index}`}
                          placeholder={"Показатель"}
                        />
                      </Form.Item>
                    </Col>
                    <Col span={8}>
                      <Form.Item
                        name={[field.name, 'description']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Описание",
                            })}`,
                          },
                        ]}>
                        <Input
                          id={`description-${index}`}
                          placeholder={"Описание"}
                        />
                      </Form.Item>
                    </Col>
                    <Col span={4}>
                      <Form.Item
                        name={[field.name, 'targetValue']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Целевое значение",
                            })}`,
                          },
                        ]}>
                        <Input
                          id={`targetValue-${index}`}
                          placeholder={"Целевое значение (%)"}
                        />
                      </Form.Item>
                    </Col>
                    <Col span={4}>
                      <Form.Item
                        name={[field.name, 'weight']}
                        rules={[
                          {
                            required: true,
                            message: t('message.valid-url-endpoint')
                          },
                        ]}>
                        <Input
                          id={`weight-${index}`}
                          placeholder={"Вес (%)"}
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
                          setCountProvInd(countProvInd - 1);
                        }}
                      />
                    </Col>
                  </Row>
                ))}
              </>
            )}
          </Form.List>
          <Form.List name="dataQualityIndicators">
            {(fields, { add, remove }) => (
              <>
                <Form.Item
                  className="form-item-horizontal"
                  colon={false}
                  label={"Индикаторы качества данных"}>
                  <Button
                    data-testid="add-qual-indicator"
                    icon={
                      <PlusOutlined
                        style={{ color: 'white', fontSize: '12px' }}
                      />
                    }
                    size="small"
                    type="primary"
                    onClick={() => {
                      add();
                      setCountQualInd(countQualInd + 1)
                    }}
                  >
                  {t('label.add')}
                  </Button>
                </Form.Item>
                {(countQualInd != 0) ? 
                (<Row gutter={[8, 0]}>
                  <Col span={2}><p style={{textAlign: 'center'}}>№</p></Col>
                  <Col span={4}><p style={{textAlign: 'center'}}>Показатель</p></Col>
                  <Col span={8}><p style={{textAlign: 'center'}}>Описание</p></Col>
                  <Col span={4}><p style={{textAlign: 'center'}}>Целевое значение (%)</p></Col>
                  <Col span={4}><p style={{textAlign: 'center'}}>Вес (%)</p></Col>
                </Row>) : []}

                {fields.map((field, index) => (
                  <Row gutter={[8, 0]} key={field.key}>
                    <Col span={2}>
                      <Form.Item
                        name={[field.name, 'number']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "№",
                            })}`,
                          },
                        ]}>
                        <Input
                          id={`number-${index}`}
                          placeholder={"№"}
                        />
                      </Form.Item>
                    </Col>
                    <Col span={4}>
                      <Form.Item
                        name={[field.name, 'index']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Показатель",
                            })}`,
                          },
                        ]}>
                        <Input
                          id={`index-${index}`}
                          placeholder={"Показатель"}
                        />
                      </Form.Item>
                    </Col>
                    <Col span={8}>
                      <Form.Item
                        name={[field.name, 'description']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Описание",
                            })}`,
                          },
                        ]}>
                        <Input
                          id={`description-${index}`}
                          placeholder={"Описание"}
                        />
                      </Form.Item>
                    </Col>
                    <Col span={4}>
                      <Form.Item
                        name={[field.name, 'targetValue']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Целевое значение",
                            })}`,
                          },
                        ]}>
                        <Input
                          id={`targetValue-${index}`}
                          placeholder={"Целевое значение (%)"}
                        />
                      </Form.Item>
                    </Col>
                    <Col span={4}>
                      <Form.Item
                        name={[field.name, 'weight']}
                        rules={[
                          {
                            required: true,
                            message: t('message.valid-url-endpoint')
                          },
                        ]}>
                        <Input
                          id={`weight-${index}`}
                          placeholder={"Вес (%)"}
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
                          setCountQualInd(countQualInd - 1);
                        }}
                      />
                    </Col>
                  </Row>
                ))}
              </>
            )}
          </Form.List>
          <Card 
            className="ant-card-feed"
            headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
            style={{
              marginBottom: '20px'
            }}
              title={
                <Typography.Text strong data-testid="header">
                  Отчетность
                </Typography.Text>
              }>
                {generateFormFields(formReportingFields)}
          </Card>

        </Card>
        <Card 
            className="ant-card-feed"
            headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
            style={{
              marginBottom: '20px'
            }}
              title={
                <Typography.Text strong data-testid="header">
                  Дополлнительно
                </Typography.Text>
              }>
                {generateFormFields(formAdditionalFields)}
          </Card>
        
      </Form>
    </Modal>
  );
};

export default TagsForm;
