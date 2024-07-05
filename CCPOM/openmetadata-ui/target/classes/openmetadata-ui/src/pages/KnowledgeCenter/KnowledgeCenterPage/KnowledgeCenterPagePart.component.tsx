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
import { compare } from 'fast-json-patch';
import React, { useCallback, useEffect, useMemo, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { useHistory, useParams } from 'react-router-dom';
import ErrorPlaceHolder from '../../../components/common/ErrorWithPlaceholder/ErrorPlaceHolder';
import { EntityDetailsObjectInterface } from '../../../components/Explore/ExplorePage.interface';
import KnowledgeCenterV1 from '../../../components/KnowledgeCenter/KnowledgeCenterV1.component';
import Loader from '../../../components/Loader/Loader';
import { usePermissionProvider } from '../../../components/PermissionProvider/PermissionProvider';
import { ResourceEntity } from '../../../components/PermissionProvider/PermissionProvider.interface';
import { VotingDataProps } from '../../../components/Voting/voting.interface';
import { FQN_SEPARATOR_CHAR } from '../../../constants/char.constants';
import { PAGE_SIZE_LARGE, ROUTES } from '../../../constants/constants';
import { KNOWLEDGE_CENTER_DOCS } from '../../../constants/docs.constants';
import {
  ERROR_PLACEHOLDER_TYPE,
  LOADING_STATE,
} from '../../../enums/common.enum';
import { KnowledgeCenter } from '../../../generated/entity/data/knowledgeCenter';
import { KnowledgeCenterDocument } from '../../../generated/entity/data/knowledgeCenterDocument';
import { Operation } from '../../../generated/entity/policies/policy';
import {
  deleteKnowledgeCenter,
  deleteKnowledgeCenterDocument,
  getKnowledgeCentersList,
  getKnowledgeCenterDocumentByFQN,
  patchKnowledgeCenters,
  patchKnowledgeCenterDocument,
  updateKnowledgeCenterDocumentVotes,
  updateKnowledgeCenterVotes,
} from '../../../rest/knowledgeCenterAPI';
import Fqn from '../../../utils/Fqn';
import { checkPermission } from '../../../utils/PermissionsUtils';
import { getKnowledgeCenterPath } from '../../../utils/RouterUtils';
import { showErrorToast, showSuccessToast } from '../../../utils/ToastUtils';

const KnowledgeCenterPagePart = ({isDoc,headerVisible = true}:{isDoc:boolean,headerVisible?:boolean}) => {
  const { t } = useTranslation();
  const { permissions } = usePermissionProvider();
  const { fqn: knowledgeCenterName } = useParams<{ fqn: string }>();
  const knowledgeCenterFqn = (isDoc && decodeURIComponent(knowledgeCenterName)) ? decodeURIComponent(knowledgeCenterName) : Fqn.split(decodeURIComponent(knowledgeCenterName))[0];
  const history = useHistory();
  const [knowledgeCenters, setKnowledgeCenters] = useState<KnowledgeCenter[]>([]);
  const [isLoading, setIsLoading] = useState(true);
  const [deleteStatus, setDeleteStatus] = useState<LOADING_STATE>(
    LOADING_STATE.INITIAL
  );
  const [selectedData, setSelectedData] = useState<KnowledgeCenter | KnowledgeCenterDocument>();
  const [isRightPanelLoading, setIsRightPanelLoading] = useState(true);
  const [previewAsset, setPreviewAsset] =
    useState<EntityDetailsObjectInterface>();

  const isKnowledgeCenterActive = useMemo(() => {
    setIsRightPanelLoading(true);
    setSelectedData(undefined);

    if (knowledgeCenterFqn) {
      return Fqn.split(knowledgeCenterFqn).length === 1;
    }

    return true;
  }, [knowledgeCenterFqn]);

  const createKnowledgeCenterPermission = useMemo(
    () =>
      checkPermission(
        Operation.Create,
        isKnowledgeCenterActive
          ? ResourceEntity.KNOWLEDGE_CENTER
          : ResourceEntity.KNOWLEDGE_CENTER_DOCUMENT,
        permissions
      ),
    [permissions, isKnowledgeCenterActive]
  );

  const viewBasicKnowledgeCenterPermission = useMemo(
    () =>
      checkPermission(
        Operation.ViewBasic,
        isKnowledgeCenterActive
          ? ResourceEntity.KNOWLEDGE_CENTER
          : ResourceEntity.KNOWLEDGE_CENTER_DOCUMENT,
        permissions
      ),
    [permissions, isKnowledgeCenterActive]
  );

  const viewAllKnowledgeCenterPermission = useMemo(
    () =>
      checkPermission(
        Operation.ViewAll,
        isKnowledgeCenterActive
          ? ResourceEntity.KNOWLEDGE_CENTER
          : ResourceEntity.KNOWLEDGE_CENTER_DOCUMENT,
        permissions
      ),
    [permissions, isKnowledgeCenterActive]
  );

  const handleAddKnowledgeCenterClick = () => {
    history.push(ROUTES.ADD_KNOWLEDGE_CENTER);
  };

  const fetchKnowledgeCenterList = async () => {
    setIsRightPanelLoading(true);
    setIsLoading(true);
    try {
      const { data } = await getKnowledgeCentersList({
        fields: 'owner,tags,reviewers,votes,domain',
        limit: PAGE_SIZE_LARGE,
      });
      setKnowledgeCenters(data);
    } catch (error) {
      showErrorToast(error as AxiosError);
    } finally {
      setIsLoading(false);
      setIsRightPanelLoading(false);
    }
  };
  useEffect(() => {
    fetchKnowledgeCenterList();
  }, []);

  const fetchKnowledgeCenterDocumentDetails = async () => {
    setIsRightPanelLoading(true);
    try {
      const response = await getKnowledgeCenterDocumentByFQN(
        knowledgeCenterFqn,
        'relatedDocuments,reviewers,tags,owner,children,votes,domain'
      );
      setSelectedData(response);
    } catch (error) {
      showErrorToast(error as AxiosError);
    } finally {
      setIsRightPanelLoading(false);
    }
  };
  useEffect(() => {
    setIsRightPanelLoading(true);
    if (knowledgeCenters.length) {
      if (!isKnowledgeCenterActive) {
        fetchKnowledgeCenterDocumentDetails();
      } else {
        setSelectedData(
          knowledgeCenters.find(
            (knowledgeCenter) => knowledgeCenter.fullyQualifiedName === knowledgeCenterFqn
          ) || knowledgeCenters[0]
        );
        !knowledgeCenterFqn &&
          knowledgeCenters[0].fullyQualifiedName &&
          history.replace(getKnowledgeCenterPath(knowledgeCenters[0].fullyQualifiedName));
        setIsRightPanelLoading(false);
      }
    }
  }, [isKnowledgeCenterActive, knowledgeCenterFqn, knowledgeCenters]);

  const updateKnowledgeCenter = async (updatedData: KnowledgeCenter) => {
    const jsonPatch = compare(selectedData as KnowledgeCenter, updatedData);

    try {
      const response = await patchKnowledgeCenters(
        selectedData?.id as string,
        jsonPatch
      );

      setKnowledgeCenters((pre) => {
        return pre.map((item) => {
          if (item.name === response.name) {
            return response;
          } else {
            return item;
          }
        });
      });

      if (selectedData?.name !== updatedData.name) {
        history.push(getKnowledgeCenterPath(response.fullyQualifiedName));
        fetchKnowledgeCenterList();
      }
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const updateVote = async (data: VotingDataProps) => {
    try {
      const isKnowledgeCenterEntity =
        Fqn.split(selectedData?.fullyQualifiedName).length <= 1;

      if (isKnowledgeCenterEntity) {
        await updateKnowledgeCenterVotes(selectedData?.id ?? '', data);
        fetchKnowledgeCenterList();
      } else {
        await updateKnowledgeCenterDocumentVotes(selectedData?.id ?? '', data);
        fetchKnowledgeCenterDocumentDetails();
      }
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const handleKnowledgeCenterDelete = (id: string) => {
    setDeleteStatus(LOADING_STATE.WAITING);
    deleteKnowledgeCenter(id)
      .then(() => {
        setDeleteStatus(LOADING_STATE.SUCCESS);
        showSuccessToast(
          t('server.entity-deleted-successfully', {
            entity: t('label.knowledge-center'),
          })
        );
        setIsLoading(true);
        // check if the knowledgeCenter available
        const updatedKnowledgeCenters = knowledgeCenters.filter((item) => item.id !== id);
        const knowledgeCenterPath =
          updatedKnowledgeCenters.length > 0
            ? getKnowledgeCenterPath(updatedKnowledgeCenters[0].fullyQualifiedName)
            : getKnowledgeCenterPath();

        history.push(knowledgeCenterPath);
        fetchKnowledgeCenterList();
      })
      .catch((err: AxiosError) => {
        showErrorToast(
          err,
          t('server.delete-entity-error', {
            entity: t('label.knowledge-center'),
          })
        );
      })
      .finally(() => setDeleteStatus(LOADING_STATE.INITIAL));
  };

  const handleKnowledgeCenterDocumentUpdate = async (updatedData: KnowledgeCenterDocument) => {
    const jsonPatch = compare(selectedData as KnowledgeCenterDocument, updatedData);
    try {
      const response = await patchKnowledgeCenterDocument(
        selectedData?.id as string,
        jsonPatch
      );
      if (response) {
        setSelectedData(response);
        if (selectedData?.name !== updatedData.name) {
          history.push(getKnowledgeCenterPath(response.fullyQualifiedName));
          fetchKnowledgeCenterList();
        }
      } else {
        throw t('server.entity-updating-error', {
          entity: t('label.knowledge-center-document'),
        });
      }
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const handleKnowledgeCenterDocumentDelete = (id: string) => {
    setDeleteStatus(LOADING_STATE.WAITING);
    deleteKnowledgeCenterDocument(id)
      .then(() => {
        setDeleteStatus(LOADING_STATE.SUCCESS);
        showSuccessToast(
          t('server.entity-deleted-successfully', {
            entity: t('label.knowledge-center-document'),
          })
        );
        let fqn;
        if (knowledgeCenterFqn) {
          const fqnArr = Fqn.split(knowledgeCenterFqn);
          fqnArr.pop();
          fqn = fqnArr.join(FQN_SEPARATOR_CHAR);
        }
        setIsLoading(true);
        history.push(getKnowledgeCenterPath(fqn));
        fetchKnowledgeCenterList();
      })
      .catch((err: AxiosError) => {
        showErrorToast(
          err,
          t('server.delete-entity-error', {
            entity: t('label.knowledge-center-document'),
          })
        );
      })
      .finally(() => setDeleteStatus(LOADING_STATE.INITIAL));
  };

  const handleAssetClick = useCallback(
    (asset?: EntityDetailsObjectInterface) => {
      setPreviewAsset(asset);
    },
    []
  );

  if (isLoading) {
    return <Loader />;
  }

  if (!(viewBasicKnowledgeCenterPermission || viewAllKnowledgeCenterPermission)) {
    return <ErrorPlaceHolder type={ERROR_PLACEHOLDER_TYPE.PERMISSION} />;
  }

  if (knowledgeCenters.length === 0 && !isLoading) {
    return (
      <ErrorPlaceHolder
        buttonId="add-knowledgeCenter"
        className="mt-0-important"
        doc={KNOWLEDGE_CENTER_DOCS}
        heading={t('label.knowledge-center')}
        permission={createKnowledgeCenterPermission}
        type={
          createKnowledgeCenterPermission
            ? ERROR_PLACEHOLDER_TYPE.CREATE
            : ERROR_PLACEHOLDER_TYPE.NO_DATA
        }
        onClick={handleAddKnowledgeCenterClick}
      />
    );
  }

  return (
    <>
      {isRightPanelLoading ? (
        <Loader />
      ) : (
        <KnowledgeCenterV1
          deleteStatus={deleteStatus}
          isKnowledgeCenterActive={isKnowledgeCenterActive}
          isSummaryPanelOpen={Boolean(previewAsset)}
          isVersionsView={false}
          refreshActiveKnowledgeCenterDocument={fetchKnowledgeCenterDocumentDetails}
          selectedData={selectedData as KnowledgeCenter}
          updateKnowledgeCenter={updateKnowledgeCenter}
          updateVote={updateVote}
          onAssetClick={handleAssetClick}
          onKnowledgeCenterDelete={handleKnowledgeCenterDelete}
          onKnowledgeCenterDocumentDelete={handleKnowledgeCenterDocumentDelete}
          onKnowledgeCenterDocumentUpdate={handleKnowledgeCenterDocumentUpdate}
          headerVisible={headerVisible}
        />
      )}
    </>
    
  );
};

export default KnowledgeCenterPagePart;
