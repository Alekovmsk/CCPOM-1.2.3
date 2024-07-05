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

import { Typography, Card, Table, TableProps } from 'antd';
import React, { useEffect, useMemo, useState } from 'react';
import { RenameFormProps, ColType } from './TagsPage.interface';
import { NO_DATA_PLACEHOLDER } from '../../constants/constants';





const TagsForm = ({
  initialValues
}: RenameFormProps) => {
    const columns: TableProps<ColType>['columns'] = [
      {
        title: 'Название',
        dataIndex: 'name',
        key: 'name',
        width: '25%',
      },
      {
        title: 'Значение',
        dataIndex: 'value',
        key: 'value',
        render: (text) => (
          <Typography.Text>{text || NO_DATA_PLACEHOLDER}</Typography.Text>
        ),
      }
    ]
  
    const data: ColType[] = [
      {
        name: 'ФИО',
        value: initialValues?.fullName
      },
      {
        name: 'Фамилия',
        value: initialValues?.lastName
      },
      {
        name: 'Имя',
        value: initialValues?.firstName
      },
      {
        name: 'Отчечтво',
        value: initialValues?.middleName
      },
      {
        name: 'email',
        value: initialValues?.email
      },
      {
        name: 'Имя пользователя',
        value: initialValues?.userName
      },
      {
        name: 'Номер телефона',
        value: initialValues?.phoneNumber
      },
      {
        name: 'Должность',
        value: initialValues?.jobTitle
      },
      {
        name: 'Департамент',
        value: initialValues?.department
      },
      {
        name: 'Активен',
        value: initialValues?.isActive ? '+' : '-'
      },
    ]

  return (
    <div className="p-x-md" data-testid="tags-container">
      
      <Card 
        className="ant-card-feed"
        headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
        style={{
          marginBottom: '20px'
        }}
          title={
            <Typography.Text strong data-testid="header">
              Данные пользователя
            </Typography.Text>
          }>
          <Table columns={columns} dataSource={data} pagination={false} />
      </Card>
    </div>
  );
};

export default TagsForm;
