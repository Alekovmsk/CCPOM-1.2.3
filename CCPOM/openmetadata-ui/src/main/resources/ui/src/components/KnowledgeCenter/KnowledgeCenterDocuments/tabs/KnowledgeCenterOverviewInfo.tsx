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
import { NO_DATA_PLACEHOLDER } from '../../../../constants/constants';
import { KnowledgeCenterDocument } from '../../../../generated/entity/data/knowledgeCenterDocument';

interface RenameFormProps {
  initialValues?: KnowledgeCenterDocument;
}

export interface ColType {
  name: string|undefined;
  value: string|undefined;
}

const KnowledgeCenterDocumentInfoCard = ({
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
        name: 'Тип согласия',
        value: initialValues?.agreementType
      },
      {
        name: 'Оператор',
        value: initialValues?.agreementOperator
      },
      {
        name: 'Контакт',
        value: initialValues?.agreementContact
      },
      {
        name: 'Период действия',
        value: initialValues?.agreementValidity
      }
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
              Данные согласия
            </Typography.Text>
          }>
          <Table
          className='antd-table-knowledge-center-document-info'
          columns={columns}
          dataSource={data}
          pagination={false}
          showHeader={false} />
      </Card>
    </div>
  );
};

export default KnowledgeCenterDocumentInfoCard;
