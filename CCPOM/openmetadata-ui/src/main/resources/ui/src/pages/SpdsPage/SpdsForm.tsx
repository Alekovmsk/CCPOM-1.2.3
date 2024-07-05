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

import { includes, isEmpty } from 'lodash';
import { useAuthContext } from '../../components/Auth/AuthProviders/AuthProvider';
import { Moment } from 'moment';
import moment from 'moment';
import dayjs from 'dayjs';
import AsyncSelectListPlus from '../../components/AsyncSelectListPlus/AsyncSelectListPlus';
import { fetchAutoSystemsForConsumer, fetchAutoSystemsForMemberName } from '../../utils/AutoSystemClassBase';
import { DefaultOptionType } from 'antd/lib/select';
import { SpdMember } from '../../generated/entity/spdClassification/spd';
import { fetchUserEsks, fetchUserEsksByFullName } from '../../utils/UserEskClassBase';
import { UserEsk } from '../../generated/entity/userEskClassification/userEsk';





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
  const [countInd, setCountInd] = useState(0);
  const [countReq, setCountReq] = useState(0);
  const { currentUser } = useAuthContext();
  const [componentsDisabled, setComponentsDisabled] = useState<Array<boolean>>([])
  const [concDate, setConcDate] = useState('')
  const [isProlongationActive, setIsProlongationActive] = useState(false)
  const [membersList, setMembersList] = useState<Array<SpdMember>| undefined>([])
  const [ownerData, setOwnerData] = useState<Array<any>| undefined>([])
  const [prManagerData, setPrManagerData] = useState<Array<UserEsk>| undefined>([])

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
      autoSystemProvider,
      autoSystemOwnerFullName,
      autoSystemOwnerPhone,
      autoSystemOwnerEmail,
      productManagerFullName,
      productManagerPhone,
      productManagerEmail,
      members = [],
      connectionParameters,
      connectionModes,
      otherParameters,
      requirements = [],
      indicators = [],
      reportingType,
      reportingPeriodicity,
      reportingFormationMode,
      reportingHref,
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

    const membs = members.map((member: any) => 
    {
      const memb = member.memberDomainAttribute ?
      {
        memberType: member.memberType,
        memberNumber: member.memberNumber,
        memberName: member.memberName[0],
        memberShortName: member.memberShortName,
        memberShortDescription: member.memberShortDescription,
        memberOwner: member.memberOwner,
        memberManager: member.memberManager,
        memberDomainAttribute: member.memberDomainAttribute,
        memberDomainName: member.memberDomainName,
        memberDomainShortName: member.memberDomainShortName,
        memberDomainShortDescription: member.memberDomainShortDescription,
        memberDomainOwner: member.memberDomainOwner,
        memberDomainTechLeader: member.memberDomainTechLeader,
      }
      :
      {
        memberType: member.memberType,
        memberNumber: member.memberNumber,
        memberName: member.memberName[0],
        memberShortName: member.memberShortName,
        memberShortDescription: member.memberShortDescription,
        memberOwner: member.memberOwner,
        memberManager: member.memberManager,
        memberDomainAttribute: member.memberDomainAttribute
      };
      return memb
    })

    const data = {
      name: name.trim(),
      displayName: displayName?.trim(),
      requirements: requirements.length > 0 ? requirements : undefined,
      indicators: indicators.length > 0 ? indicators : undefined,
      members: membs.length > 0 ? membs : undefined,
      description: description,
      docNumber: docNumber,
      docType: docType,
      conclusionDate: conclusionDate,
      expirationDate: expirationDate,
      validity: validity,
      prolongation: prolongation,
      domainData: domainData,
      consumer: consumer[0],
      docStatus: docStatus,
      autoSystemProvider: autoSystemProvider,
      autoSystemOwnerFullName: autoSystemOwnerFullName,
      autoSystemOwnerPhone: autoSystemOwnerPhone,
      autoSystemOwnerEmail: autoSystemOwnerEmail,
      productManagerFullName: productManagerFullName,
      productManagerPhone: productManagerPhone,
      productManagerEmail: productManagerEmail,
      connectionParameters: connectionParameters,
      connectionModes: connectionModes,
      otherParameters: otherParameters,
      reportingType: reportingType,
      reportingPeriodicity: reportingPeriodicity,
      reportingFormationMode: reportingFormationMode,
      reportingHref: reportingHref,
      owner: selectedOwner,
      style: isEmpty(style) ? undefined : style,
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
        members,
        autoSystemProvider,
        autoSystemOwnerFullName,
        autoSystemOwnerPhone,
        autoSystemOwnerEmail,
        productManagerFullName,
        productManagerPhone,
        productManagerEmail,
        connectionParameters,
        connectionModes,
        otherParameters,
        requirements,
        indicators,
        reportingType,
        reportingPeriodicity,
        reportingFormationMode,
        reportingHref
      } = initialValues;
      setCountReq(requirements ? requirements.length : 0);
      setCountInd(indicators ? indicators.length : 0);
      setMembersList(members)
      const membersDomains = members? members.map((member) => {return member.memberDomainAttribute ? member.memberDomainAttribute : false}) : [];
      setComponentsDisabled(membersDomains);
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
        members: members ? members.map((member: any) => 
        {
          const memb = member.memberDomainAttribute ?
          {
            memberType: member.memberType,
            memberNumber: member.memberNumber,
            memberName: member.memberName ? [member.memberName] : undefined,
            memberShortName: member.memberShortName,
            memberShortDescription: member.memberShortDescription,
            memberOwner: member.memberOwner,
            memberManager: member.memberManager,
            memberDomainAttribute: member.memberDomainAttribute,
            memberDomainName: member.memberDomainName,
            memberDomainShortName: member.memberDomainShortName,
            memberDomainShortDescription: member.memberDomainShortDescription,
            memberDomainOwner: member.memberDomainOwner,
            memberDomainTechLeader: member.memberDomainTechLeader,
          }
          :
          {
            memberType: member.memberType,
            memberNumber: member.memberNumber,
            memberName: member.memberName ? [member.memberName] : undefined,
            memberShortName: member.memberShortName,
            memberShortDescription: member.memberShortDescription,
            memberOwner: member.memberOwner,
            memberManager: member.memberManager,
            memberDomainAttribute: member.memberDomainAttribute
          };
          return memb
        }) : undefined,
        autoSystemProvider,
        autoSystemOwnerFullName,
        autoSystemOwnerPhone,
        autoSystemOwnerEmail,
        productManagerFullName,
        productManagerPhone,
        productManagerEmail,
        connectionParameters,
        connectionModes,
        otherParameters,
        requirements,
        indicators,
        reportingType,
        reportingPeriodicity,
        reportingFormationMode,
        reportingHref,
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
        disabled: true
      },
      formItemProps: {
        initialValue: 'СПД'
      },
      placeholder: t('label.doc-type'),
      formItemLayout: FormItemLayout.HORIZONATAL,
    }];

    const formFields12: FieldProp[] = [
    {
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

    const formFields13: FieldProp[] = [{
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
    }];
    const formFields14: FieldProp[] = [{
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
    },
    {
      name: 'autoSystemProvider',
      id: 'root/autoSystemProvider',
      required: false,
      label: 'Поставщик',
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'autoSystemProvider',
        disabled: true,
      },
      placeholder: 'Поставщик',
      formItemLayout: FormItemLayout.HORIZONATAL,
    }];
    
    const formFields2: FieldProp[] = [
    {
      name: 'description',
      id: 'root/description',
      required: true,
      label: 'Описание технологии подключения и ключевые условия',
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'description',
        disabled: disableNameField,
        initialValue: '',
        dd: 'zzz'
      },
      placeholder: 'Описание технологии подключения и ключевые условия',
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'connectionParameters',
      id: 'root/connectionParameters',
      required: false,
      label: 'Параметры подключения',
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'dataRegister',
        disabled: false,
      },
      placeholder: 'Параметры подключения',
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'connectionModes',
      id: 'root/connectionModes',
      required: false,
      label: 'Режимы подключения, временные параметры предоставления данных',
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'connectionModes',
        disabled: false,
      },
      placeholder: 'Режимы подключения, временные параметры предоставления данных',
      formItemLayout: FormItemLayout.HORIZONATAL,
    },
    {
      name: 'otherParameters',
      id: 'root/otherParameters',
      required: false,
      label: 'Иные параметры, требующие явного указания',
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'otherParameters',
        disabled: false,
      },
      placeholder: 'Иные параметры, требующие явного указания',
      formItemLayout: FormItemLayout.HORIZONATAL,
    },];

    const formFieldsAutoSystemOwner: FieldProp[] = [
      {
        name: 'autoSystemOwnerFullName',
        id: 'root/autoSystemOwnerFullName',
        required: false,
        label: "ФИО",
        type: FieldTypes.TEXT,
        props: {
          'data-testid': 'autoSystemOwnerFullName',
          disabled: true,
        },
        placeholder: "ФИО",
        formItemLayout: FormItemLayout.HORIZONATAL,
      },
      {
        name: 'autoSystemOwnerPhone',
        id: 'root/autoSystemOwnerPhone',
        required: false,
        label: "Телефон",
        type: FieldTypes.TEXT,
        props: {
          'data-testid': 'autoSystemOwnerPhone',
          disabled: true,
        },
        placeholder: "Телефон",
        formItemLayout: FormItemLayout.HORIZONATAL,
      },
      {
        name: 'autoSystemOwnerEmail',
        id: 'root/autoSystemOwnerEmail',
        required: false,
        label: "Email",
        type: FieldTypes.TEXT,
        props: {
          'data-testid': 'autoSystemOwnerEmail',
          disabled: true,
        },
        placeholder: "Email",
        formItemLayout: FormItemLayout.HORIZONATAL,
      }];

    const formFieldsProductManager: FieldProp[] = [
      {
        name: 'productManagerFullName',
        id: 'root/productManagerFullName',
        required: false,
        label: "ФИО",
        type: FieldTypes.TEXT,
        props: {
          'data-testid': 'productManagerFullName',
          disabled: true,
        },
        placeholder: "ФИО",
        formItemLayout: FormItemLayout.HORIZONATAL,
      },
      {
        name: 'productManagerPhone',
        id: 'root/productManagerPhone',
        required: false,
        label: "Телефон",
        type: FieldTypes.TEXT,
        props: {
          'data-testid': 'productManagerPhone',
          disabled: true,
        },
        placeholder: "Телефон",
        formItemLayout: FormItemLayout.HORIZONATAL,
      },
      {
        name: 'productManagerEmail',
        id: 'root/productManagerEmail',
        required: false,
        label: "Email",
        type: FieldTypes.TEXT,
        props: {
          'data-testid': 'productManagerEmail',
          disabled: true,
        },
        placeholder: "Email",
        formItemLayout: FormItemLayout.HORIZONATAL,
      }];


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
      name: 'reportingFormationMode',
      id: 'root/reportingFormationMode',
      required: false,
      label: "Режим формирования",
      type: FieldTypes.TEXT,
      props: {
        'data-testid': 'reportingFormationMode',
        disabled: false,
      },
      placeholder: "Режим формирования",
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
        onFieldsChange={(changedFields, allFields) =>{
          const membersField = allFields.filter((field: any) => {
            return (field.name.length == 1 && field.name[0] == 'members');
          });
          const members = membersField ? membersField[0].value : undefined;
          if (members)
          {setMembersList([...members]);}
        }}
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
          <Form.Item
            label={t('label.consumer')}
            className={'form-item-horizontal'}
            name={'consumer'}
            rules={[
              {
                required: true,
                message: `${t('message.field-text-is-required', {
                  fieldText: t('label.consumer'),
                })}`,
              },
            ]}
            >
            <AsyncSelectListPlus
              fetchOptions= {fetchAutoSystemsForConsumer}
              mode = {'multiple'}
              placeholder={t('label.consumer')}
              onChange={async (option) => {
                if (option.length != 0){
                  if (option[0].data)
                    {
                      const supplier = option[0].data.supplier;
                      const fullNameOwner = option[0].data.fullNameOwner;
                      const productManager = option[0].data.productManager;
                      const consum = [option[0].value];
                      const ownerData = await fetchUserEsksByFullName(fullNameOwner);
                      const productManagerData = await fetchUserEsksByFullName(productManager);
                      form.setFieldsValue({autoSystemProvider:supplier, 
                        autoSystemOwnerFullName:fullNameOwner,
                        productManagerFullName:productManager,
                        consumer:consum,
                        autoSystemOwnerPhone:ownerData?._source.phoneNumber,
                        autoSystemOwnerEmail:ownerData?._source.email,
                        productManagerPhone:productManagerData?._source.phoneNumber,
                        productManagerEmail:productManagerData?._source.email
                      });
                    }
                }
                else
                {form.setFieldsValue({autoSystemProvider:undefined,
                  autoSystemOwnerFullName:undefined,
                  productManagerFullName:undefined,
                  consumer:undefined,
                  autoSystemOwnerPhone:undefined,
                  autoSystemOwnerEmail:undefined,
                  productManagerPhone:undefined,
                  productManagerEmail:undefined})}
                }
              }
            />
          </Form.Item>
          
          {/* <Form.Item
            label={t('пользователь')}
            className={'form-item-horizontal'}
            name={'consumer'}
            >
            <AsyncSelectListPlus
              fetchOptions= {fetchUserEsks}
              mode = {'multiple'}
              placeholder='пользователь'
            />
          </Form.Item> */}
          {generateFormFields(formFields14)}
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
        </Card>
        <Card 
          headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
          style={{
            marginBottom: '20px'
          }}
          title={
            <Typography.Text strong data-testid="header">
              Технологические параметры предоставлерния данных
            </Typography.Text>
          }>
          {generateFormFields(formFields2)}
        </Card>
        <Card 
          headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
          style={{
            marginBottom: '20px'
          }}
          title={
            <Typography.Text strong data-testid="header">
              Участники
            </Typography.Text>
          }>
          <Form.List name="members">
            {(fields, { add, remove }) => (
              <>
                <Form.Item
                  className="form-item-horizontal"
                  colon={false}
                  label={"Участники"}>
                  <Button
                    data-testid="add-member"
                    icon={
                      <PlusOutlined
                        style={{ color: 'white', fontSize: '12px' }}
                      />
                    }
                    size="small"
                    type="primary"
                    onClick={() => {
                      add();
                      setComponentsDisabled((prevComponentsDisabled) => [...prevComponentsDisabled, false]);
                  }
                  }
                  >
                  {t('label.add')}
                  </Button>
                </Form.Item>

                {fields.map((field, index) => (
                  <Card 
                  headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
                  style={{
                    marginBottom: '20px',
                    border: '1px solid gray'
                  }}
                  title={
                    <Typography.Text strong data-testid="header">
                      Участник {index+1}
                    </Typography.Text>
                  }>
                      <Form.Item
                        className={'form-item-horizontal'}
                        name={[field.name, 'memberType']}
                        label={'Тип'}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Тип",
                            })}`,
                          },
                        ]}>
                        <Input
                          id={`memberType-${index}`}
                          placeholder={"Тип"}
                        />
                      </Form.Item>
                      <Form.Item
                        label={'Номер в реестре АС'}
                        className={'form-item-horizontal'}
                        name={[field.name, 'memberNumber']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Номер в реестре АС",
                            })}`,
                          },
                        ]}>
                        <Input
                          disabled={true}
                          id={`memberNumber-${index}`}
                          placeholder={"Номер в реестре АС"}
                        />
                      </Form.Item>
                      <Form.Item
                        label={'Наименование'}
                        className={'form-item-horizontal'}
                        name={[field.name, 'memberName']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Наименование",
                            })}`,
                          },
                        ]}
                        >
                        <AsyncSelectListPlus
                          fetchOptions= {fetchAutoSystemsForMemberName}
                          id={`memberName-${index}`}
                          mode = {'multiple'}
                          placeholder={"Наименование"}
                          onChange={(option) => {
                            if (option.length != 0){
                              if (option[0].data){
                                if(membersList)
                                  {let membs = membersList;
                                  if (!membs[index]){
                                    membs[index] = {memberType: undefined,
                                          memberNumber: undefined,
                                          memberName: undefined,
                                          memberShortName: undefined,
                                          memberShortDescription: undefined,
                                          memberOwner: undefined,
                                          memberManager: undefined,
                                          memberDomainAttribute: false}
                                  };
                                  membs[index].memberNumber = option[0].data.numberInList;
                                  membs[index].memberShortName = option[0].data.shortName;
                                  membs[index].memberShortDescription = option[0].data.description;
                                  membs[index].memberOwner = option[0].data.fullNameOwner;
                                  membs[index].memberManager = option[0].data.productManager;
                                  membs[index].memberName = [option[0].value];
                                  form.setFieldsValue({members:membs})
                                  setMembersList([...membs])};
                                }
                            }
                            }
                          }
                        />
                      </Form.Item>
                      <Form.Item
                        label={'Краткое наименование'}
                        className={'form-item-horizontal'}
                        name={[field.name, 'memberShortName']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Краткое наименование",
                            })}`,
                          },
                        ]}>
                        <Input
                          disabled={true}
                          id={`memberShortName-${index}`}
                          placeholder={"Краткое наименование"}
                        />
                      </Form.Item>
                      <Form.Item
                        label={'Краткое описание'}
                        className={'form-item-horizontal'}
                        name={[field.name, 'memberShortDescription']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Краткое описание",
                            })}`,
                          },
                        ]}>
                        <Input
                          disabled={true}
                          id={`memberShortDescription-${index}`}
                          placeholder={"Краткое описание"}
                        />
                      </Form.Item>
                      <Form.Item
                        label={'Владелец АС'}
                        className={'form-item-horizontal'}
                        name={[field.name, 'memberOwner']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Владелец АС",
                            })}`,
                          },
                        ]}>
                        <Input
                          disabled={true}
                          id={`memberOwner-${index}`}
                          placeholder={"Владелец АС"}
                        />
                      </Form.Item>
                      <Form.Item
                        label={'Менеджер АС'}
                        className={'form-item-horizontal'}
                        name={[field.name, 'memberManager']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Менеджер АС",
                            })}`,
                          },
                        ]}>
                        <Input
                          disabled={true}
                          id={`memberManager-${index}`}
                          placeholder={"Менеджер АС"}
                        />
                      </Form.Item>
                      <Form.Item
                      
                        label={'Признак домена'}
                        valuePropName='checked'
                        className={'form-item-horizontal'}
                        name={[field.name, 'memberDomainAttribute']}>
                        <Switch id={`memberDomainAttribute-${index}`} 
                          onChange={(checked: boolean) => {
                          let arr: boolean[] = componentsDisabled;
                          arr[index] = checked;
                          setComponentsDisabled([...arr]);}}
                          />
                      </Form.Item>
                      <Card 
                        headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
                        style={componentsDisabled[index] ? {
                          marginBottom: '20px',
                        }:{
                          display: 'None',
                        } }
                        title={
                          <Typography.Text strong data-testid="header">
                            Домен
                          </Typography.Text>
                        }>
                        <Form.Item
                          label={'Наименование'}
                          className={'form-item-horizontal'}
                          name={[field.name, 'memberDomainName']}
                          >
                          <Input
                            id={`memberDomainName-${index}`}
                            placeholder={"Наименование"}
                          />
                        </Form.Item>
                        <Form.Item
                          label={'Краткое наименование'}
                          className={'form-item-horizontal'}
                          name={[field.name, 'memberDomainShortName']}
                          >
                          <Input
                            id={`memberDomainShortName-${index}`}
                            placeholder={"Краткое наименование"}
                          />
                        </Form.Item>
                        <Form.Item
                          label={'Краткое описание'}
                          className={'form-item-horizontal'}
                          name={[field.name, 'memberDomainShortDescription']}
                          >
                          <Input
                            id={`memberDomainShortDescription-${index}`}
                            placeholder={"Краткое описание"}
                          />
                        </Form.Item>
                        <Form.Item
                          label={'Технический лидер'}
                          className={'form-item-horizontal'}
                          name={[field.name, 'memberDomainOwner']}
                          >
                          <Input
                            id={`memberDomainOwner-${index}`}
                            placeholder={"Технический лидер"}
                          />
                        </Form.Item>
                        <Form.Item
                          label={'Владелец'}
                          className={'form-item-horizontal'}
                          name={[field.name, 'memberDomainTechLeader']}
                          >
                          <Input
                            id={`memberDomainTechLeader-${index}`}
                            placeholder={"Владелец"}
                          />
                        </Form.Item>
                      </Card>
                      <Button
                        icon={<DeleteIcon width={16} />}
                        size="small"
                        type="text"
                        onClick={() => {
                          remove(field.name);
                        }}
                      />
                  </Card>
                ))}
              </>
            )}
          </Form.List>
        </Card>
        <Card 
          headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
          style={{
            marginBottom: '20px'
          }}
          title={
            <Typography.Text strong data-testid="header">
              Ответственные лица / матрица эскалации
            </Typography.Text>
          }>
          <Card 
          headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
          style={{
            marginBottom: '20px'
          }}
          title={
            <Typography.Text strong data-testid="header">
              Владелец АС
            </Typography.Text>
          }>
            {generateFormFields(formFieldsAutoSystemOwner)}
          </Card>
          <Card 
          headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
          style={{
            marginBottom: '20px'
          }}
          title={
            <Typography.Text strong data-testid="header">
              Менеджер продукта (менеджер АС)
            </Typography.Text>
          }>
            {generateFormFields(formFieldsProductManager)}
          </Card>
        </Card>

        <Card 
          headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
          style={{
            marginBottom: '20px'
          }}
          title={
            <Typography.Text strong data-testid="header">
              Требования к интеграционному взаимодействию
            </Typography.Text>
          }>
          <Form.List name="requirements">
            {(fields, { add, remove }) => (
              <>
                <Form.Item
                  className="form-item-horizontal"
                  colon={false}
                  label={"Требования"}>
                  <Button
                    data-testid="add-requirement"
                    icon={
                      <PlusOutlined
                        style={{ color: 'white', fontSize: '12px' }}
                      />
                    }
                    size="small"
                    type="primary"
                    onClick={() => {
                      add();
                      setCountReq(countReq + 1);
                    }}
                  >
                  {t('label.add')}
                  </Button>
                </Form.Item>
                {(countReq != 0) ? 
                (<Row gutter={[8, 0]}>
                  <Col span={2}><p style={{textAlign: 'center'}}>№</p></Col>
                  <Col span={4}><p style={{textAlign: 'center'}}>Описание требования</p></Col>
                </Row>) : []}

                {fields.map((field, index) => (
                  <Row gutter={[8, 0]} key={field.key}>
                    <Col span={2}>
                      <Form.Item
                        name={[field.name, 'reqNumber']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "№",
                            })}`,
                          },
                        ]}>
                        <Input
                          id={`reqNumber-${index}`}
                          placeholder={"№"}
                        />
                      </Form.Item>
                    </Col>
                    <Col span={20}>
                      <Form.Item
                        name={[field.name, 'reqDescription']}
                        rules={[
                          {
                            required: true,
                            message: `${t('message.field-text-is-required', {
                              fieldText: "Описание требования",
                            })}`,
                          },
                        ]}>
                        <Input
                          id={`index-${index}`}
                          placeholder={"Описание требования"}
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
                          setCountReq(countReq - 1);
                        }}
                      />
                    </Col>
                  </Row>
                ))}
              </>
            )}
          </Form.List>
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
          <Form.List name="indicators">
            {(fields, { add, remove }) => (
              <>
                <Form.Item
                  className="form-item-horizontal"
                  colon={false}
                  label={"Индикаторы предоставления данных"}>
                  <Button
                    data-testid="add-indicator"
                    icon={
                      <PlusOutlined
                        style={{ color: 'white', fontSize: '12px' }}
                      />
                    }
                    size="small"
                    type="primary"
                    onClick={() => {
                      add();
                      setCountInd(countInd + 1);
                    }}
                  >
                  {t('label.add')}
                  </Button>
                </Form.Item>
                {(countInd != 0) ? 
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
                            message: t('Вес')
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
                          setCountInd(countInd - 1);
                        }}
                      />
                    </Col>
                  </Row>
                ))}
              </>
            )}
          </Form.List>
        </Card>
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
      </Form>
    </Modal>
  );
};

export default TagsForm;
function updateState(arg0: {}): any {
  throw new Error('Function not implemented.');
}

