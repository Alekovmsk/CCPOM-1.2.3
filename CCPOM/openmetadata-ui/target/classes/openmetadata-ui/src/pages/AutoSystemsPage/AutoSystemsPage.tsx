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
import { Typography } from 'antd';
import { AxiosError } from 'axios';
import React, { useEffect, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { useParams } from 'react-router-dom';
import ErrorPlaceHolder from '../../components/common/ErrorWithPlaceholder/ErrorPlaceHolder';
import PageLayoutV1 from '../../components/PageLayoutV1/PageLayoutV1';
import Loader from '../../components/Loader/Loader';
import { AutoSystem } from '../../generated/entity/autoSystemClassification/autoSystem';
import {
  getTagByName,
} from '../../rest/autoSystemAPI';
import { getDecodedFqn, getErrorText } from '../../utils/StringsUtils';
import { showErrorToast } from '../../utils/ToastUtils';
import TagsForm from './AutoSystemsForm';

const TagsPage = () => {
  const { fqn: tagCategoryName } = useParams<{ fqn: string }>();
  const [editTag, setEditTag] = useState<AutoSystem>();
  const [error, setError] = useState<string>('');
  const [isLoading, setIsLoading] = useState<boolean>(false);


  const { t } = useTranslation();

  const fetchCurrentClassification = async (fqn: string, update?: boolean) => {
      setIsLoading(true);
      try {
        const currentAutoSystem = await getTagByName(fqn);        
        setEditTag(currentAutoSystem);
        if (currentAutoSystem) {
          setIsLoading(false);
        } else {
          showErrorToast(t('server.unexpected-response'));
        }
      } catch (err) {
        const errMsg = getErrorText(
          err as AxiosError,
          t('server.entity-fetch-error', {
            entity: t('label.tag-category-lowercase'),
          })
        );
        showErrorToast(errMsg);
        setError(errMsg);
        setIsLoading(false);
      }
  };

  useEffect(() => {
    /**
     * If ClassificationName is present then fetch that category
     */
    if (tagCategoryName) {
      fetchCurrentClassification(getDecodedFqn(tagCategoryName));
    }
  }, [tagCategoryName]);

  if (isLoading) {
    return <Loader />;
  }

  if (error) {
    return (
      <ErrorPlaceHolder>
        <Typography.Paragraph className="text-center m-auto">
          {error}
        </Typography.Paragraph>
      </ErrorPlaceHolder>
    );
  }

  return (
    <PageLayoutV1 pageTitle={t('label.auto-system')}>
        <TagsForm
          initialValues={editTag}
        />
    </PageLayoutV1>
  );
};

export default TagsPage;
