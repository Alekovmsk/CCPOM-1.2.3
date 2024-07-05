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
import { Button } from 'antd';
import { AxiosError } from 'axios';
import classNames from 'classnames';
import { compare } from 'fast-json-patch';
import { toString } from 'lodash';
import React, { useEffect, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { useHistory, useParams } from 'react-router-dom';
import { ERROR_PLACEHOLDER_TYPE } from '../../../enums/common.enum';
import { Perimeter } from '../../../generated/entity/domains/perimeter';
import { EntityHistory } from '../../../generated/type/entityHistory';
import {
  deletePerimeter,
  getPerimeterByName,
  getPerimeterVersionData,
  getPerimeterVersionsList,
  patchPerimeter,
} from '../../../rest/perimeterAPI';
import {
  getPerimetersDetailsPath,
  getPerimeterVersionsPath,
  getDomainPath,
} from '../../../utils/RouterUtils';
import { showErrorToast, showSuccessToast } from '../../../utils/ToastUtils';
import ErrorPlaceHolder from '../../common/ErrorWithPlaceholder/ErrorPlaceHolder';
import EntityVersionTimeLine from '../../Entity/EntityVersionTimeLine/EntityVersionTimeLine';
import Loader from '../../Loader/Loader';
import PageLayoutV1 from '../../PageLayoutV1/PageLayoutV1';
import PerimetersDetailsPage from '../PerimetersDetailsPage/PerimetersDetailsPage.component';

const PerimetersPage = () => {
  const { t } = useTranslation();
  const history = useHistory();
  const { fqn, version } = useParams<{ fqn: string; version: string }>();
  const [isMainContentLoading, setIsMainContentLoading] = useState(true);
  const [perimeter, setPerimeter] = useState<Perimeter>();
  const [versionList, setVersionList] = useState<EntityHistory>(
    {} as EntityHistory
  );
  const [selectedVersionData, setSelectedVersionData] = useState<Perimeter>();

  const perimeterFqn = fqn ? decodeURIComponent(fqn) : '';

  const handlePerimeterUpdate = async (updatedData: Perimeter) => {
    if (perimeter) {
      const jsonPatch = compare(perimeter, updatedData);
      try {
        const response = await patchPerimeter(perimeter.id, jsonPatch);

        setPerimeter(response);

        if (perimeter?.name !== updatedData.name) {
          history.push(
            getPerimetersDetailsPath(response.fullyQualifiedName ?? '')
          );
        }
      } catch (error) {
        showErrorToast(error as AxiosError);
      }
    }
  };

  const handlePerimeterDelete = async () => {
    if (!perimeter) {
      return;
    }

    try {
      await deletePerimeter(perimeter.id);
      showSuccessToast(
        t('server.entity-deleted-successfully', {
          entity: t('label.perimeter'),
        })
      );
      const domainPath = getDomainPath();
      history.push(domainPath);
    } catch (err) {
      showErrorToast(
        err as AxiosError,
        t('server.delete-entity-error', {
          entity: t('label.perimeter'),
        })
      );
    }
  };

  const fetchPerimeterByFqn = async (fqn: string) => {
    setIsMainContentLoading(true);
    try {
      const data = await getPerimeterByName(
        encodeURIComponent(fqn),
        'domain,owner,experts'
      );
      setPerimeter(data);

      if (version) {
        fetchVersionsInfo(data);
        fetchActiveVersion(data);
      }
    } catch (error) {
      showErrorToast(error as AxiosError);
    } finally {
      setIsMainContentLoading(false);
    }
  };

  const fetchVersionsInfo = async (activePerimeter: Perimeter) => {
    if (!activePerimeter) {
      return;
    }

    try {
      const res = await getPerimeterVersionsList(activePerimeter.id);
      setVersionList(res);
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const fetchActiveVersion = async (activePerimeter: Perimeter) => {
    if (!activePerimeter) {
      return;
    }
    try {
      const res = await getPerimeterVersionData(
        activePerimeter.id,
        version
      );
      setSelectedVersionData(res);
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const onVersionChange = (selectedVersion: string) => {
    const path = getPerimeterVersionsPath(fqn, selectedVersion);
    history.push(path);
  };

  const onBackHandler = () => {
    const path = getPerimetersDetailsPath(fqn);
    history.push(path);
  };

  useEffect(() => {
    if (perimeterFqn) {
      fetchPerimeterByFqn(perimeterFqn);
    }
  }, [perimeterFqn, version]);

  if (isMainContentLoading) {
    return <Loader />;
  }

  if (!perimeter) {
    return (
      <ErrorPlaceHolder type={ERROR_PLACEHOLDER_TYPE.CUSTOM}>
        <div className="text-center">
          <p>
            {t('message.no-entity-found-for-name', {
              entity: t('label.perimeter'),
              name: fqn,
            })}
          </p>
          <Button
            ghost
            className="m-t-sm"
            type="primary"
            onClick={() => history.push(getDomainPath())}>
            {t('label.go-back')}
          </Button>
        </div>
      </ErrorPlaceHolder>
    );
  }

  return (
    <>
      <PageLayoutV1
        className={classNames('perimeter-page-layout', {
          'version-data page-container': version,
        })}
        pageTitle={t('label.perimeter')}>
        <PerimetersDetailsPage
          perimeter={
            version ? selectedVersionData ?? perimeter : perimeter
          }
          isVersionsView={Boolean(version)}
          onDelete={handlePerimeterDelete}
          onUpdate={handlePerimeterUpdate}
        />
      </PageLayoutV1>

      {version && (
        <EntityVersionTimeLine
          currentVersion={toString(version)}
          versionHandler={onVersionChange}
          versionList={versionList}
          onBack={onBackHandler}
        />
      )}
    </>
  );
};

export default PerimetersPage;
