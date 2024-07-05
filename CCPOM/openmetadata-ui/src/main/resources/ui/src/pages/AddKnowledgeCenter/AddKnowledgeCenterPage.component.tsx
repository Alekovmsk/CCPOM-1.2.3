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

import { AxiosError } from 'axios';
import React, {
  FunctionComponent,
  useCallback,
  useEffect,
  useMemo,
  useState,
} from 'react';
import { useTranslation } from 'react-i18next';
import { useHistory } from 'react-router-dom';
import { TitleBreadcrumbProps } from '../../components/common/TitleBreadcrumb/TitleBreadcrumb.interface';
import AddKnowledgeCenter from '../../components/KnowledgeCenter/AddKnowledgeCenter/AddKnowledgeCenter.component';
import { usePermissionProvider } from '../../components/PermissionProvider/PermissionProvider';
import { ResourceEntity } from '../../components/PermissionProvider/PermissionProvider.interface';
import { ERROR_MESSAGE } from '../../constants/constants';
import { CreateKnowledgeCenter } from '../../generated/api/data/createKnowledgeCenter';
import { Operation } from '../../generated/entity/policies/policy';
import { addKnowledgeCenters } from '../../rest/knowledgeCenterAPI';
import { getIsErrorMatch } from '../../utils/CommonUtils';
import { checkPermission } from '../../utils/PermissionsUtils';
import { getKnowledgeCenterPath } from '../../utils/RouterUtils';
import { getClassifications, getTaglist } from '../../utils/TagsUtils';
import { showErrorToast } from '../../utils/ToastUtils';

const AddKnowledgeCenterPage: FunctionComponent = () => {
  const history = useHistory();
  const { permissions } = usePermissionProvider();
  const [tagList, setTagList] = useState<Array<string>>([]);
  const [isTagLoading, setIsTagLoading] = useState<boolean>(false);
  const [isLoading, setIsLoading] = useState<boolean>(false);
  const [slashedBreadcrumb, setSlashedBreadcrumb] = useState<
    TitleBreadcrumbProps['titleLinks']
  >([]);

  const { t } = useTranslation();
  const createPermission = useMemo(
    () =>
      checkPermission(Operation.Create, ResourceEntity.KNOWLEDGE_CENTER, permissions),
    [permissions]
  );

  const goToKnowledgeCenter = (name = '') => {
    history.push(getKnowledgeCenterPath(name));
  };

  const handleCancel = useCallback(() => {
    goToKnowledgeCenter();
  }, []);

  const handleSaveFailure = (
    error: AxiosError | string,
    fallbackText?: string
  ) => {
    showErrorToast(error, fallbackText);
  };

  const onSave = useCallback(async (data: CreateKnowledgeCenter) => {
    setIsLoading(true);
    try {
      const res = await addKnowledgeCenters(data);
      goToKnowledgeCenter(res.fullyQualifiedName ?? '');
    } catch (error) {
      handleSaveFailure(
        getIsErrorMatch(error as AxiosError, ERROR_MESSAGE.alreadyExist)
          ? t('server.entity-already-exist', {
              entity: t('label.knowledge-center'),
              entityPlural: t('label.knowledge-center-lowercase-plural'),
              name: data.name,
            })
          : (error as AxiosError),
        t('server.add-entity-error', {
          entity: t('label.knowledge-center-lowercase'),
        })
      );
    } finally {
      setIsLoading(false);
    }
  }, []);

  const fetchTags = () => {
    setIsTagLoading(true);
    getClassifications()
      .then(async (res) => {
        if (res.data) {
          const tagList = await getTaglist(res.data);
          setTagList(tagList);
        } else {
          showErrorToast(
            t('server.entity-fetch-error', {
              entity: t('label.tag-plural'),
            })
          );
        }
      })
      .catch((err: AxiosError) => {
        showErrorToast(
          err,
          t('server.entity-fetch-error', {
            entity: t('label.tag-plural'),
          })
        );
      })
      .finally(() => {
        setIsTagLoading(false);
      });
  };

  useEffect(() => {
    setSlashedBreadcrumb([
      {
        name: t('label.knowledge-center'),
        url: getKnowledgeCenterPath(),
      },
      {
        name: t('label.add-entity', {
          entity: t('label.knowledge-center'),
        }),
        url: '',
        activeTitle: true,
      },
    ]);
  }, []);

  return (
    <div className="self-center">
      <AddKnowledgeCenter
        allowAccess={createPermission}
        fetchTags={fetchTags}
        header={t('label.add-entity', {
          entity: t('label.knowledge-center'),
        })}
        isLoading={isLoading}
        isTagLoading={isTagLoading}
        slashedBreadcrumb={slashedBreadcrumb}
        tagList={tagList}
        onCancel={handleCancel}
        onSave={onSave}
      />
    </div>
  );
};

export default AddKnowledgeCenterPage;
