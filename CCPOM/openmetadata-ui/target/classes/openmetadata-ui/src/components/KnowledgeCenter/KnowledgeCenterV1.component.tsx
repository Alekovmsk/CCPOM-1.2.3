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
import { compare } from 'fast-json-patch';
import { cloneDeep, isEmpty } from 'lodash';
import React, { RefObject, useCallback, useEffect, useMemo, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { useHistory, useParams } from 'react-router-dom';
import { withActivityFeed } from '../AppRouter/withActivityFeed';
import Loader from '../Loader/Loader';
import { HTTP_STATUS_CODE } from '../../constants/auth.constants';
import {
  API_RES_MAX_SIZE,
  getKnowledgeCenterDocumentDetailsPath,
  PAGE_SIZE_DOCUMENTS,
} from '../../constants/constants';
import { EntityAction } from '../../enums/entity.enum';
import {
  CreateThread,
  ThreadType,
} from '../../generated/api/feed/createThread';
import { KnowledgeCenter } from '../../generated/entity/data/knowledgeCenter';
import { KnowledgeCenterDocument } from '../../generated/entity/data/knowledgeCenterDocument';
import { VERSION_VIEW_KNOWLEDGE_CENTER_PERMISSION } from '../../mocks/KnowledgeCenter.mock';
import { postThread } from '../../rest/feedsAPI';
import {
  addKnowledgeCenterDocument,
  getKnowledgeCenterDocuments,
  ListKnowledgeCenterDocumentsParams,
  patchKnowledgeCenterDocument,
} from '../../rest/knowledgeCenterAPI';
import { getEntityDeleteMessage } from '../../utils/CommonUtils';
import { DEFAULT_ENTITY_PERMISSION } from '../../utils/PermissionsUtils';
import { showErrorToast } from '../../utils/ToastUtils';
import { useActivityFeedProvider } from '../ActivityFeed/ActivityFeedProvider/ActivityFeedProvider';
import ActivityThreadPanel from '../ActivityFeed/ActivityThreadPanel/ActivityThreadPanel';
import EntityDeleteModal from '../Modals/EntityDeleteModal/EntityDeleteModal';
import { usePermissionProvider } from '../PermissionProvider/PermissionProvider';
import {
  OperationPermission,
  ResourceEntity,
} from '../PermissionProvider/PermissionProvider.interface';
import { KnowledgeCenterDocumentForm } from './AddKnowledgeCenterDocumentForm/AddKnowledgeCenterDocumentForm.interface';
import KnowledgeCenterDetails from './KnowledgeCenterDetails/KnowledgeCenterDetails.component';
import KnowledgeCenterDocumentModal from './KnowledgeCenterDocumentModal/KnowledgeCenterDocumentModal.component';
import KnowledgeCenterDocumentsV1 from './KnowledgeCenterDocuments/KnowledgeCenterDocumentsV1.component';
import { KnowledgeCenterV1Props } from './KnowledgeCenterV1.interfaces';
import './knowledgeCenterV1.less';
import { Paging } from '../../generated/type/paging';
import { CursorType } from '../../enums/pagination.enum';
import { Col, Row } from 'antd';

const KnowledgeCenterV1 = ({
  isKnowledgeCenterActive,
  deleteStatus = 'initial',
  selectedData,
  onKnowledgeCenterDocumentUpdate,
  updateKnowledgeCenter,
  updateVote,
  onKnowledgeCenterDelete,
  onKnowledgeCenterDocumentDelete,
  isVersionsView,
  onAssetClick,
  isSummaryPanelOpen,
  refreshActiveKnowledgeCenterDocument,
  headerVisible = true
}: KnowledgeCenterV1Props) => {
  const { t } = useTranslation();
  const { action, tab } =
    useParams<{ action: EntityAction; knowledgeCenterName: string; tab: string }>();
  const history = useHistory();
  const [threadLink, setThreadLink] = useState<string>('');
  const [threadType, setThreadType] = useState<ThreadType>(
    ThreadType.Conversation
  );
  const { postFeed, deleteFeed, updateFeed } = useActivityFeedProvider();

  const { getEntityPermission } = usePermissionProvider();
  const [isLoading, setIsLoading] = useState(true);
  const [isDocumentsLoading, setIsDocumentsLoading] = useState(false);

  const [isDelete, setIsDelete] = useState<boolean>(false);

  const [knowledgeCenterPermission, setKnowledgeCenterPermission] =
    useState<OperationPermission>(DEFAULT_ENTITY_PERMISSION);

  const [knowledgeCenterDocumentPermission, setKnowledgeCenterDocumentPermission] =
    useState<OperationPermission>(DEFAULT_ENTITY_PERMISSION);

  const [isEditModalOpen, setIsEditModalOpen] = useState(false);
  const [activeKnowledgeCenterDocument, setActiveKnowledgeCenterDocument] = useState<
    KnowledgeCenterDocument | undefined
  >();
  const [editMode, setEditMode] = useState(false);

  const [knowledgeCenterDocuments, setKnowledgeCenterDocuments] = useState<KnowledgeCenterDocument[]>([]);
  const { id } = selectedData ?? {};
  const [paging, setPaging] = useState<Paging>({} as Paging);

  const onThreadPanelClose = () => {
    setThreadLink('');
  };

  const onThreadLinkSelect = (link: string, threadType?: ThreadType) => {
    setThreadLink(link);
    if (threadType) {
      setThreadType(threadType);
    }
  };

  const fetchKnowledgeCenterDocument = async (
    params?: ListKnowledgeCenterDocumentsParams,
    refresh?: boolean,
    paging?: Paging
  ) => {
    // refresh ? setIsDocumentsLoading(true) : setIsLoading(true);
    try {
      const documentsResponse = await getKnowledgeCenterDocuments({
        ...params,
        // limit: API_RES_MAX_SIZE,
        fields: 'tags,children,reviewers,relatedDocuments,owner,parent',
        after: paging && paging.after,
        before: paging && paging.before,
        limit: PAGE_SIZE_DOCUMENTS,
      });
      const AllDocumentsData = knowledgeCenterDocuments.concat(documentsResponse.data);
      setKnowledgeCenterDocuments(AllDocumentsData);
      setPaging(documentsResponse.paging);
    } catch (error) {
      showErrorToast(error as AxiosError);
    } finally {
      refresh ? setIsDocumentsLoading(false) : setIsLoading(false);
    }
  };


  const fetchMoreDocuments = useCallback(
    (isElementInView: boolean, cursor: string | number) => {
      const pagination = {
        [cursor]: paging[cursor as keyof Paging] as string,
        total: paging.total,
      } as Paging;
      if (
        isElementInView &&
        pagination?.after // &&
        // !setIsLoading
      ) {
        fetchKnowledgeCenterDocument(
          isKnowledgeCenterActive ? { knowledgeCenter: id } : { parent: id },
          false,
          pagination
        );
      }
    },
    [setIsLoading, fetchKnowledgeCenterDocument]
  );

  // useEffect(() => {
  //   fetchMoreDocuments(isInView, CursorType.AFTER);
  // }, [isInView]);

  const fetchKnowledgeCenterPermission = async () => {
    try {
      const response = await getEntityPermission(
        ResourceEntity.KNOWLEDGE_CENTER,
        selectedData?.id as string
      );
      setKnowledgeCenterPermission(response);
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const fetchKnowledgeCenterDocumentPermission = async () => {
    try {
      const response = await getEntityPermission(
        ResourceEntity.KNOWLEDGE_CENTER_DOCUMENT,
        selectedData?.id as string
      );
      setKnowledgeCenterDocumentPermission(response);
    } catch (error) {
      showErrorToast(error as AxiosError);
    }
  };

  const createThread = async (data: CreateThread) => {
    try {
      await postThread(data);
    } catch (error) {
      showErrorToast(
        error as AxiosError,
        t('server.create-entity-error', {
          entity: t('label.conversation'),
        })
      );
    }
  };

  const handleDelete = () => {
    const { id } = selectedData;
    if (isKnowledgeCenterActive) {
      onKnowledgeCenterDelete(id);
    } else {
      onKnowledgeCenterDocumentDelete(id);
    }
    setIsDelete(false);
  };

  const loadKnowledgeCenterDocuments = useCallback(
    (refresh = false) => {
      fetchKnowledgeCenterDocument(
        isKnowledgeCenterActive ? { knowledgeCenter: id } : { parent: id },
        refresh
      );
    },
    [id, isKnowledgeCenterActive]
  );

  const handleKnowledgeCenterDocumentModalAction = (
    editMode: boolean,
    knowledgeCenterDocument: KnowledgeCenterDocument | undefined
  ) => {
    setEditMode(editMode);
    setActiveKnowledgeCenterDocument(knowledgeCenterDocument);
    setIsEditModalOpen(true);
  };

  const updateKnowledgeCenterDocument = async (
    currentData: KnowledgeCenterDocument,
    updatedData: KnowledgeCenterDocument
  ) => {
    try {
      const jsonPatch = compare(currentData, updatedData);
      const response = await patchKnowledgeCenterDocument(currentData?.id, jsonPatch);
      if (!response) {
        throw t('server.entity-updating-error', {
          entity: t('label.knowledge-center-document'),
        });
      }
      onDocumentModalSuccess();
    } catch (error) {
      if (
        (error as AxiosError).response?.status === HTTP_STATUS_CODE.CONFLICT
      ) {
        showErrorToast(
          t('server.entity-already-exist', {
            entity: t('label.knowledge-center-document'),
            entityPlural: t('label.knowledge-center-document-lowercase-plural'),
            name: updatedData.name,
          })
        );
      } else {
        showErrorToast(
          error as AxiosError,
          t('server.entity-updating-error', {
            entity: t('label.knowledge-center-document-lowercase'),
          })
        );
      }
    }
  };

  const onDocumentModalSuccess = useCallback(() => {
    loadKnowledgeCenterDocuments(true);
    if (!isKnowledgeCenterActive && tab !== 'documents') {
      history.push(
        getKnowledgeCenterDocumentDetailsPath(
          selectedData.fullyQualifiedName || '',
          'documents'
        )
      );
    }
    setIsEditModalOpen(false);
  }, [isKnowledgeCenterActive, tab, selectedData]);

  const handleKnowledgeCenterDocumentAdd = async (formData: KnowledgeCenterDocumentForm) => {
    try {
      await addKnowledgeCenterDocument({
        ...formData,
        reviewers: formData.reviewers.map(
          (item) => item.fullyQualifiedName || ''
        ),
        knowledgeCenter:
          activeKnowledgeCenterDocument?.knowledgeCenter?.name ||
          (selectedData.fullyQualifiedName ?? ''),
        parent: activeKnowledgeCenterDocument?.fullyQualifiedName,
      });
      onDocumentModalSuccess();
    } catch (error) {
      if (
        (error as AxiosError).response?.status === HTTP_STATUS_CODE.CONFLICT
      ) {
        showErrorToast(
          t('server.entity-already-exist', {
            entity: t('label.knowledge-center-document'),
            entityPlural: t('label.knowledge-center-document-lowercase-plural'),
            name: formData.name,
          })
        );
      } else {
        showErrorToast(
          error as AxiosError,
          t('server.create-entity-error', {
            entity: t('label.knowledge-center-document-lowercase'),
          })
        );
      }
    }
  };

  const handleKnowledgeCenterDocumentSave = async (formData: KnowledgeCenterDocumentForm) => {
    const newDocumentData = cloneDeep(activeKnowledgeCenterDocument);
    if (editMode) {
      if (newDocumentData && activeKnowledgeCenterDocument) {
        const {
          name,
          displayName,
          description,
          synonyms,
          tags,
          references,
          mutuallyExclusive,
          reviewers,
          owner,
          relatedDocuments,
          style,
        } = formData || {};

        newDocumentData.name = name;
        newDocumentData.style = style;
        newDocumentData.displayName = displayName;
        newDocumentData.description = description;
        newDocumentData.synonyms = synonyms;
        newDocumentData.tags = tags;
        newDocumentData.mutuallyExclusive = mutuallyExclusive;
        newDocumentData.reviewers = reviewers;
        newDocumentData.owner = owner;
        newDocumentData.references = references;
        newDocumentData.relatedDocuments = relatedDocuments?.map((document: any) => ({
          id: document,
          type: 'knowledgeCenterDocument',
        }));
        await updateKnowledgeCenterDocument(activeKnowledgeCenterDocument, newDocumentData);
      }
    } else {
      handleKnowledgeCenterDocumentAdd(formData);
    }
  };

  useEffect(() => {
    if (id && !action) {
      loadKnowledgeCenterDocuments();
      if (isKnowledgeCenterActive) {
        isVersionsView
          ? setKnowledgeCenterPermission(VERSION_VIEW_KNOWLEDGE_CENTER_PERMISSION)
          : fetchKnowledgeCenterPermission();
      } else {
        isVersionsView
          ? setKnowledgeCenterDocumentPermission(VERSION_VIEW_KNOWLEDGE_CENTER_PERMISSION)
          : fetchKnowledgeCenterDocumentPermission();
      }
    }
  }, [id, isKnowledgeCenterActive, isVersionsView, action]);

  return (
    <Row data-testid="knowledge-center-document" gutter={[0, 8]}>
      <Col span={24}>
      {isLoading && <Loader />}
      {!isLoading &&
        !isEmpty(selectedData) &&
        (
          isKnowledgeCenterActive ? (
            
          <KnowledgeCenterDetails
            knowledgeCenter={selectedData as KnowledgeCenter}
            knowledgeCenterDocuments={knowledgeCenterDocuments}
            handleKnowledgeCenterDelete={onKnowledgeCenterDelete}
            isVersionView={isVersionsView}
            permissions={knowledgeCenterPermission}
            refreshKnowledgeCenterDocuments={() => loadKnowledgeCenterDocuments(true)}
            documentsLoading={isDocumentsLoading}
            updateKnowledgeCenter={updateKnowledgeCenter}
            updateVote={updateVote}
            onAddKnowledgeCenterDocument={(document) =>
              handleKnowledgeCenterDocumentModalAction(false, document)
            }
            onEditKnowledgeCenterDocument={(document) =>
              handleKnowledgeCenterDocumentModalAction(true, document)
            }
            onThreadLinkSelect={onThreadLinkSelect}
            moreload={() => fetchMoreDocuments(true, CursorType.AFTER)}
            headerVisible={headerVisible}
          />
          )
        :
(
          <KnowledgeCenterDocumentsV1
            childKnowledgeCenterDocuments={knowledgeCenterDocuments}
            knowledgeCenterDocument={selectedData as KnowledgeCenterDocument}
            handleKnowledgeCenterDocumentDelete={onKnowledgeCenterDocumentDelete}
            handleKnowledgeCenterDocumentUpdate={onKnowledgeCenterDocumentUpdate}
            isSummaryPanelOpen={isSummaryPanelOpen}
            isVersionView={isVersionsView}
            permissions={knowledgeCenterDocumentPermission}
            refreshActiveKnowledgeCenterDocument={refreshActiveKnowledgeCenterDocument}
            refreshKnowledgeCenterDocuments={() => loadKnowledgeCenterDocuments(true)}
            documentsLoading={isDocumentsLoading}
            updateVote={updateVote}
            onAddKnowledgeCenterDocument={(document) =>
              handleKnowledgeCenterDocumentModalAction(false, document)
            }
            onAssetClick={onAssetClick}
            onEditKnowledgeCenterDocument={(document) =>
              handleKnowledgeCenterDocumentModalAction(true, document)
            }
            onThreadLinkSelect={onThreadLinkSelect}
          />)

        )}

      {selectedData && (
        <EntityDeleteModal
          bodyText={getEntityDeleteMessage(selectedData.name, '')}
          entityName={selectedData.name}
          entityType="KnowledgeCenter"
          loadingState={deleteStatus}
          visible={isDelete}
          onCancel={() => setIsDelete(false)}
          onConfirm={handleDelete}
        />
      )}
    </Col>
    {/* <Col span={12}>
      <Editor data={data} setData={setData} onSave={onDescriptionUpdate} readOnly={false} editorJsRef={editorJsRef} />

      <button onClick={() => {
        editorJsRef.current.rerender();
        console.log('activeKnowledgeCenterDocument!');
        console.log(activeKnowledgeCenterDocument);
        onDescriptionUpdate()
      }
      }
      >
        dataxZ
      </button>
      <button onClick={() => {
        onDescriptionUpdate(data)
      }
      }
      >
        save
      </button>
    </Col>
    <Col span={4}>
      brrr
    </Col> */}
      {isEditModalOpen && (
        
        <KnowledgeCenterDocumentModal
          editMode={editMode}
          knowledgeCenterName={selectedData.name}
          knowledgeCenterReviewers={isKnowledgeCenterActive ? selectedData.reviewers : []}
          knowledgeCenterDocument={activeKnowledgeCenterDocument}
          visible={isEditModalOpen}
          onCancel={() => setIsEditModalOpen(false)}
          onSave={handleKnowledgeCenterDocumentSave}
        />
       
      
      )
      
      }


      {threadLink ? (
        <ActivityThreadPanel
          createThread={createThread}
          deletePostHandler={deleteFeed}
          open={Boolean(threadLink)}
          postFeedHandler={postFeed}
          threadLink={threadLink}
          threadType={threadType}
          updateThreadHandler={updateFeed}
          onCancel={onThreadPanelClose}
        />
      ) : null}
    </Row>
  );
};

export default withActivityFeed(KnowledgeCenterV1);
