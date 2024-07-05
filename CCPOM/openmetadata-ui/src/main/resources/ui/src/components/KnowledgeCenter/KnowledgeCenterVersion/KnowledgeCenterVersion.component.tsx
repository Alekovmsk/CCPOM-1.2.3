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
import { AxiosError } from 'axios';
import { noop, toString } from 'lodash';
import React, { useEffect, useState } from 'react';
import { useHistory, useParams } from 'react-router-dom';
import { LOADING_STATE } from '../../../enums/common.enum';
import { KnowledgeCenter } from '../../../generated/entity/data/knowledgeCenter';
import { KnowledgeCenterDocument } from '../../../generated/entity/data/knowledgeCenterDocument';
import { EntityHistory } from '../../../generated/type/entityHistory';
import {
  getKnowledgeCenterDocumentsVersion,
  getKnowledgeCenterDocumentsVersionsList,
  getKnowledgeCenterVersion,
  getKnowledgeCenterVersionsList,
} from '../../../rest/knowledgeCenterAPI';
import {
  getKnowledgeCenterPath,
  getKnowledgeCenterDocumentsVersionsPath,
  getKnowledgeCenterVersionsPath,
} from '../../../utils/RouterUtils';
import { showErrorToast } from '../../../utils/ToastUtils';
import EntityVersionTimeLine from '../../Entity/EntityVersionTimeLine/EntityVersionTimeLine';
import Loader from '../../Loader/Loader';
import PageLayoutV1 from '../../PageLayoutV1/PageLayoutV1';
import KnowledgeCenterV1Component from '../KnowledgeCenterV1.component';

interface KnowledgeCenterVersionProps {
  isKnowledgeCenter?: boolean;
}

const KnowledgeCenterVersion = ({ isKnowledgeCenter = false }: KnowledgeCenterVersionProps) => {
  const history = useHistory();
  const {
    fqn: knowledgeCenterName,
    version,
    tab = 'overview',
  } = useParams<{ fqn: string; version: string; tab: string }>();
  const [versionList, setVersionList] = useState<EntityHistory>(
    {} as EntityHistory
  );
  const [selectedData, setSelectedData] = useState<KnowledgeCenter | KnowledgeCenterDocument>();
  const [isVersionLoading, setIsVersionLoading] = useState<boolean>(true);

  const fetchVersionsInfo = async () => {
    try {
      const res = isKnowledgeCenter
        ? await getKnowledgeCenterVersionsList(knowledgeCenterName)
        : await getKnowledgeCenterDocumentsVersionsList(knowledgeCenterName);

      setVersionList(res);
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const fetchActiveVersion = async () => {
    setIsVersionLoading(true);
    try {
      const res = isKnowledgeCenter
        ? await getKnowledgeCenterVersion(knowledgeCenterName, version)
        : await getKnowledgeCenterDocumentsVersion(knowledgeCenterName, version);

      setSelectedData(res);
    } catch (error) {
      showErrorToast(error as AxiosError);
    } finally {
      setIsVersionLoading(false);
    }
  };

  const onVersionChange = (selectedVersion: string) => {
    const path = isKnowledgeCenter
      ? getKnowledgeCenterVersionsPath(knowledgeCenterName, selectedVersion)
      : getKnowledgeCenterDocumentsVersionsPath(knowledgeCenterName, selectedVersion, tab);
    history.push(path);
  };

  const onBackHandler = () => {
    const path = getKnowledgeCenterPath(selectedData?.fullyQualifiedName);
    history.push(path);
  };

  useEffect(() => {
    fetchVersionsInfo();
  }, [knowledgeCenterName]);

  useEffect(() => {
    fetchActiveVersion();
  }, [knowledgeCenterName, version]);

  return (
    <PageLayoutV1 pageTitle="KnowledgeCenter version">
      <div className="version-data">
        {/* TODO: Need to implement version component for KnowledgeCenter */}
        {isVersionLoading ? (
          <Loader />
        ) : (
          <KnowledgeCenterV1Component
            isVersionsView
            deleteStatus={LOADING_STATE.INITIAL}
            isKnowledgeCenterActive={isKnowledgeCenter}
            isSummaryPanelOpen={false}
            selectedData={selectedData as KnowledgeCenter}
            updateKnowledgeCenter={() => Promise.resolve()}
            onKnowledgeCenterDelete={noop}
            onKnowledgeCenterDocumentDelete={noop}
            onKnowledgeCenterDocumentUpdate={() => Promise.resolve()}
          />
        )}
      </div>
      <EntityVersionTimeLine
        currentVersion={toString(version)}
        versionHandler={onVersionChange}
        versionList={versionList}
        onBack={onBackHandler}
      />
    </PageLayoutV1>
  );
};

export default KnowledgeCenterVersion;
