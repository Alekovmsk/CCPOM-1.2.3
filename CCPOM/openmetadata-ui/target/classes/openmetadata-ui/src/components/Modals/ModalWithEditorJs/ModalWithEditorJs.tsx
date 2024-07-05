/*
 *  Copyright 2022 Collate.
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

import { Button, Modal, Typography } from 'antd';
import { AxiosError } from 'axios';
import React, { FunctionComponent, useRef, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { showErrorToast } from '../../../utils/ToastUtils';
import Loader from '../../Loader/Loader';
import './modal-with-editor-js.less';
import {
  EditorContentRef,
  ModalWithEditorJsProps,
} from './ModalWithEditorJs.interface';
import KnowledgeCenterEditor from '../../common/KnowledgeCenterEditor/KnowledgeCenterEditor';

export const ModalWithEditorJs: FunctionComponent<ModalWithEditorJsProps> =
  ({
    header,
    value,
    onSave,
    onCancel,
    visible,
    rerenderMainEditorJs
  }: ModalWithEditorJsProps) => {
    const { t } = useTranslation();
    const [isLoading, setIsLoading] = useState<boolean>(false);
    const editorJsRef = React.useRef({})
    const isJsonString = (str: string) => {
      try {
          JSON.parse(str);
      } catch (e) {
          return false;
      }
      return true;
  };
  const [data, setData] = useState(isJsonString(value) ? JSON.parse(value) : undefined);


    const handleSaveDataEditorJs = async () => {
      setIsLoading(true);
      try {
        console.log(data);
        await onSave?.(JSON.stringify(data));
        await rerenderMainEditorJs(data);
      } catch (error) {
        showErrorToast(error as AxiosError);
      } finally {
        setIsLoading(false);
      }
    };

    return (
      <Modal
        centered
        destroyOnClose
        className="description-markdown-editor"
        closable={false}
        data-testid="markdown-editor"
        footer={[
          <Button
            data-testid="cancel"
            disabled={isLoading}
            key="cancelButton"
            type="link"
            onClick={onCancel}>
            {t('label.cancel')}
          </Button>,
          <Button
            data-testid="save"
            key="saveButton"
            type="primary"
            onClick={handleSaveDataEditorJs}>
            {isLoading ? <Loader size="small" type="white" /> : t('label.save')}
          </Button>,
        ]}
        maskClosable={false}
        open={visible}
        title={<Typography.Text data-testid="header">{header}</Typography.Text>}
        width="90%"
        onCancel={onCancel}>
        <KnowledgeCenterEditor data={data} setData={setData} readOnly={false} editorJsRef={editorJsRef} />
      </Modal>
    );
  };
