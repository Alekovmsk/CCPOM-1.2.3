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
import { Space, Typography } from 'antd';
import { ColumnsType } from 'antd/lib/table';
import { isEmpty } from 'lodash';
import React, { FC, useEffect, useMemo, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { usePapaParse } from 'react-papaparse';
import { ReactComponent as FailBadgeIcon } from '../../../assets/svg/fail-badge.svg';
import { ReactComponent as SuccessBadgeIcon } from '../../../assets/svg/success-badge.svg';
import Table from '../../common/Table/Table';
import { KNOWLEDGE_CENTER_IMPORT_STATUS } from '../../../constants/KnowledgeCenter.constant';
import {
  CSVImportResult,
  Status,
} from '../../../generated/type/csvImportResult';
import { parseCSV } from '../../../utils/EntityImport/EntityImportUtils';
import { KnowledgeCenterCSVRecord } from '../ImportKnowledgeCenter/ImportKnowledgeCenter.interface';

interface Props {
  csvImportResult: CSVImportResult;
}

export const KnowledgeCenterImportResult: FC<Props> = ({ csvImportResult }) => {
  const { readString } = usePapaParse();
  const { t } = useTranslation();
  const [parsedRecords, setParsedRecords] = useState<KnowledgeCenterCSVRecord[]>([]);
  const [loading, setIsLoading] = useState(false);

  const columns: ColumnsType<KnowledgeCenterCSVRecord> = useMemo(
    () => [
      {
        title: t('label.status'),
        dataIndex: 'status',
        key: 'status',
        fixed: true,
        render: (
          status: KnowledgeCenterCSVRecord['status'],
          record: KnowledgeCenterCSVRecord
        ) => {
          return (
            <Space
              align="start"
              data-testid="status-container"
              // Added max width because in case of full success we don't want to occupied full width
              style={{ maxWidth: 200 }}>
              {status === Status.Failure ? (
                <>
                  <FailBadgeIcon
                    className="m-t-xss"
                    data-testid="failure-badge"
                    height={16}
                    width={16}
                  />
                  {record.details}
                </>
              ) : (
                <SuccessBadgeIcon
                  className="m-t-xss"
                  data-testid="success-badge"
                  height={16}
                  width={16}
                />
              )}
            </Space>
          );
        },
      },
      {
        title: t('label.parent'),
        dataIndex: 'parent',
        key: 'parent',
        fixed: true,
        render: (parent: KnowledgeCenterCSVRecord['parent']) => {
          return (
            <Typography.Paragraph style={{ width: 200 }}>
              {isEmpty(parent) ? '--' : parent}
            </Typography.Paragraph>
          );
        },
      },
      {
        title: t('label.name'),
        dataIndex: 'name*',
        key: 'name',
        fixed: true,
        render: (name: KnowledgeCenterCSVRecord['name*']) => {
          return (
            <Typography.Paragraph style={{ width: 200 }}>
              {name}
            </Typography.Paragraph>
          );
        },
      },
      {
        title: t('label.display-name'),
        dataIndex: 'displayName',
        key: 'displayName',
        render: (displayName: KnowledgeCenterCSVRecord['displayName']) => {
          return (
            <Typography.Paragraph style={{ width: 200 }}>
              {isEmpty(displayName) ? '--' : displayName}
            </Typography.Paragraph>
          );
        },
      },
      {
        title: t('label.description'),
        dataIndex: 'description',
        key: 'description',
        width: 300,
        render: (description: KnowledgeCenterCSVRecord['description']) => {
          return (
            <Typography.Paragraph
              ellipsis={{
                rows: 2,
              }}
              style={{ width: 300 }}
              title={description}>
              {isEmpty(description) ? '--' : description}
            </Typography.Paragraph>
          );
        },
      },
      {
        title: t('label.synonym-lowercase-plural'),
        dataIndex: 'synonyms',
        key: 'synonyms',
        render: (synonyms: KnowledgeCenterCSVRecord['synonyms']) => {
          const value = synonyms?.split(';').join(', ');

          return (
            <Typography.Paragraph style={{ width: 200 }}>
              {isEmpty(synonyms) ? '--' : value}
            </Typography.Paragraph>
          );
        },
      },
      {
        title: t('label.related-document-plural'),
        dataIndex: 'relatedDocuments',
        key: 'relatedDocuments',
        render: (relatedDocuments: KnowledgeCenterCSVRecord['relatedDocuments']) => {
          const value = relatedDocuments?.split(';').join(', ');

          return (
            <Typography.Paragraph style={{ width: 200 }}>
              {isEmpty(relatedDocuments) ? '--' : value}
            </Typography.Paragraph>
          );
        },
      },
      {
        title: t('label.reference-plural'),
        dataIndex: 'references',
        key: 'relatedDocuments',
        render: (references: KnowledgeCenterCSVRecord['references']) => {
          return (
            <Typography.Paragraph style={{ width: 200, maxWidth: 300 }}>
              {isEmpty(references) ? '--' : references}
            </Typography.Paragraph>
          );
        },
      },
      {
        title: t('label.tag-plural'),
        dataIndex: 'tags',
        key: 'tags',
        render: (tags: KnowledgeCenterCSVRecord['tags']) => {
          const value = tags?.split(';').join(', ');

          return (
            <Typography.Paragraph style={{ width: 200 }}>
              {isEmpty(tags) ? '--' : value}
            </Typography.Paragraph>
          );
        },
      },
    ],
    []
  );

  const parseCsvFile = () => {
    if (csvImportResult.importResultsCsv) {
      readString(csvImportResult.importResultsCsv, {
        worker: true,
        complete: (results) => {
          // results.data is returning data with unknown type
          setParsedRecords(
            parseCSV<KnowledgeCenterCSVRecord>(results.data as string[][]).map(
              (value) => ({
                ...value,
                key: value['name*'],
                status: KNOWLEDGE_CENTER_IMPORT_STATUS.includes(value['details'] ?? '')
                  ? Status.Success
                  : Status.Failure,
              })
            )
          );
          setIsLoading(false);
        },
      });
    }
  };

  useEffect(() => {
    setIsLoading(true);
    parseCsvFile();
  }, [csvImportResult.importResultsCsv]);

  return (
    <Table
      bordered
      columns={columns}
      data-testid="import-result-table"
      dataSource={parsedRecords}
      loading={loading}
      pagination={false}
      rowKey="name"
      scroll={{ x: true }}
      size="small"
    />
  );
};
