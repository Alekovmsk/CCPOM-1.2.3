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

import React, { FunctionComponent, useMemo } from 'react';
import { Redirect, Route, Switch } from 'react-router-dom';
import DataProductsPage from '../../components/DataProducts/DataProductsPage/DataProductsPage.component';
import PerimetersPage from '../../components/Perimeters/PerimetersPage/PerimetersPage.component';
import AddDomain from '../../components/Domain/AddDomain/AddDomain.component';
import DomainPage from '../../components/Domain/DomainPage.component';
import { ROUTES, getExplorePath } from '../../constants/constants';
import { Operation } from '../../generated/entity/policies/policy';
import { CustomizablePage } from '../../pages/CustomizablePage/CustomizablePage';
import DataQualityPage from '../../pages/DataQuality/DataQualityPage';
import { checkPermission, userPermissions } from '../../utils/PermissionsUtils';
import { useApplicationConfigContext } from '../ApplicationConfigProvider/ApplicationConfigProvider';
import { usePermissionProvider } from '../PermissionProvider/PermissionProvider';
import { ResourceEntity } from '../PermissionProvider/PermissionProvider.interface';
import AdminProtectedRoute from './AdminProtectedRoute';
import withSuspenseFallback from './withSuspenseFallback';

const GlobalSettingPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/GlobalSettingPage/GlobalSettingPage'))
);

const MyDataPageV1 = withSuspenseFallback(
  React.lazy(() => import('../../pages/MyDataPage/MyDataPageV1.component'))
);

const TestSuiteIngestionPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/TestSuiteIngestionPage/TestSuiteIngestionPage')
  )
);

const TestSuiteDetailsPage = withSuspenseFallback(
  React.lazy(
    () =>
      import('../../pages/TestSuiteDetailsPage/TestSuiteDetailsPage.component')
  )
);

const AddDataQualityTestPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/AddDataQualityTestPage/AddDataQualityTestPage')
  )
);

const AddCustomProperty = withSuspenseFallback(
  React.lazy(
    () => import('../CustomEntityDetail/AddCustomProperty/AddCustomProperty')
  )
);

const MarketPlacePage = withSuspenseFallback(
  React.lazy(() => import('../../pages/MarketPlacePage/MarketPlacePage'))
);

const PipelineDetailsPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/PipelineDetails/PipelineDetailsPage.component')
  )
);
const BotDetailsPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/BotDetailsPage/BotDetailsPage'))
);
const ServicePage = withSuspenseFallback(
  React.lazy(() => import('../../pages/ServiceDetailsPage/ServiceDetailsPage'))
);

const SwaggerPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/SwaggerPage'))
);
const TagsPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/TagsPage/TagsPage'))
);
const DlasPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/DlasPage/DlasPage'))
);
const SpdsPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/SpdsPage/SpdsPage'))
);
const AutoSystemsPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/AutoSystemsPage/AutoSystemsPage'))
);
const UserEsksPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/UserEsksPage/UserEsksPage'))
);
const ClassificationVersionPage = withSuspenseFallback(
  React.lazy(
    () =>
      import('../../pages/ClassificationVersionPage/ClassificationVersionPage')
  )
);
const DlaClassificationVersionPage = withSuspenseFallback(
  React.lazy(
    () =>
      import('../../pages/DlaClassificationVersionPage/DlaClassificationVersionPage')
  )
);
const SpdClassificationVersionPage = withSuspenseFallback(
  React.lazy(
    () =>
      import('../../pages/SpdClassificationVersionPage/SpdClassificationVersionPage')
  )
);
const TopicDetailsPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/TopicDetails/TopicDetailsPage.component')
  )
);
const TourPageComponent = withSuspenseFallback(
  React.lazy(() => import('../../pages/TourPage/TourPage.component'))
);
const UserPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/UserPage/UserPage.component'))
);

const DomainVersionPage = withSuspenseFallback(
  React.lazy(
    () =>
      import('../../components/Domain/DomainVersion/DomainVersion.component')
  )
);

const GlossaryVersionPage = withSuspenseFallback(
  React.lazy(
    () =>
      import(
        '../../components/Glossary/GlossaryVersion/GlossaryVersion.component'
      )
  )
);

const KnowledgeCenterVersionPage = withSuspenseFallback(
  React.lazy(
    () =>
      import(
        '../../components/KnowledgeCenter/KnowledgeCenterVersion/KnowledgeCenterVersion.component'
      )
  )
);

const ClientCenterVersionPage = withSuspenseFallback(
  React.lazy(
    () =>
      import(
        '../../components/ClientCenter/ClientCenterVersion/ClientCenterVersion.component'
      )
  )
);


const AddGlossaryPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/AddGlossary/AddGlossaryPage.component'))
);


const AddKnowledgeCenterPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/AddKnowledgeCenter/AddKnowledgeCenterPage.component'))
);


const AddClientCenterPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/AddClientCenter/AddClientCenterPage.component'))
);


const AddIngestionPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/AddIngestionPage/AddIngestionPage.component')
  )
);
const AddServicePage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/AddServicePage/AddServicePage.component')
  )
);

const MarketPlaceAppDetails = withSuspenseFallback(
  React.lazy(
    () =>
      import(
        '../../components/Applications/MarketPlaceAppDetails/MarketPlaceAppDetails.component'
      )
  )
);

const AppInstallPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/AppInstall/AppInstall.component'))
);

const EditConnectionFormPage = withSuspenseFallback(
  React.lazy(
    () =>
      import(
        '../../pages/EditConnectionFormPage/EditConnectionFormPage.component'
      )
  )
);

const CreateUserPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/CreateUserPage/CreateUserPage.component')
  )
);
const DashboardDetailsPage = withSuspenseFallback(
  React.lazy(
    () =>
      import('../../pages/DashboardDetailsPage/DashboardDetailsPage.component')
  )
);
const DatabaseDetails = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/DatabaseDetailsPage/DatabaseDetailsPage')
  )
);
const DatabaseSchemaPageComponent = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/DatabaseSchemaPage/DatabaseSchemaPage.component')
  )
);

const DataModelDetailsPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/DataModelPage/DataModelPage.component'))
);

const StoredProcedureDetailsPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/StoredProcedure/StoredProcedurePage'))
);

const TableDetailsPageV1 = withSuspenseFallback(
  React.lazy(() => import('../../pages/TableDetailsPageV1/TableDetailsPageV1'))
);
const EditIngestionPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/EditIngestionPage/EditIngestionPage.component')
  )
);
const EntityVersionPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/EntityVersionPage/EntityVersionPage.component')
  )
);
const ServiceVersionPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/ServiceVersionPage/ServiceVersionPage'))
);
const DatabaseVersionPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/DatabaseVersionPage/DatabaseVersionPage')
  )
);
const DatabaseSchemaVersionPage = withSuspenseFallback(
  React.lazy(
    () =>
      import('../../pages/DatabaseSchemaVersionPage/DatabaseSchemaVersionPage')
  )
);
const ExplorePageV1 = withSuspenseFallback(
  React.lazy(() => import('../../pages/ExplorePage/ExplorePageV1.component'))
);

const GlossaryPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/Glossary/GlossaryPage/GlossaryPage.component')
  )
);

const KnowledgeCenterPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/KnowledgeCenter/KnowledgeCenterPage/KnowledgeCenterPage.component')
  )
);

const ClientCenterPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/ClientCenter/ClientCenterPage/ClientCenterPage.component')
  )
);

const MlModelPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/MlModelPage/MlModelPage.component'))
);

const RequestDescriptionPage = withSuspenseFallback(
  React.lazy(
    () =>
      import(
        '../../pages/TasksPage/RequestDescriptionPage/RequestDescriptionPage'
      )
  )
);

const RequestTagsPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/TasksPage/RequestTagPage/RequestTagPage')
  )
);

const RequestDlasPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/TasksPage/RequestDlaPage/RequestDlaPage')
  )
);

const RequestSpdsPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/TasksPage/RequestSpdPage/RequestSpdPage')
  )
);

const RequestAutoSystemsPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/TasksPage/RequestAutoSystemPage/RequestAutoSystemPage')
  )
);

const UpdateDescriptionPage = withSuspenseFallback(
  React.lazy(
    () =>
      import(
        '../../pages/TasksPage/UpdateDescriptionPage/UpdateDescriptionPage'
      )
  )
);

const UpdateTagsPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/TasksPage/UpdateTagPage/UpdateTagPage'))
);

const UpdateDlasPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/TasksPage/UpdateDlaPage/UpdateDlaPage'))
);

const UpdateSpdsPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/TasksPage/UpdateSpdPage/UpdateSpdPage'))
);

const UpdateAutoSystemsPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/TasksPage/UpdateAutoSystemPage/UpdateAutoSystemPage'))
);

const AddRolePage = withSuspenseFallback(
  React.lazy(() => import('../../pages/RolesPage/AddRolePage/AddRolePage'))
);
const AddPolicyPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/PoliciesPage/AddPolicyPage/AddPolicyPage')
  )
);

const EditEmailConfigPage = withSuspenseFallback(
  React.lazy(
    () =>
      import('../../pages/EditEmailConfigPage/EditEmailConfigPage.component')
  )
);
const EditCustomLogoConfigPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/EditCustomLogoConfig/EditCustomLogoConfig')
  )
);

const AddRulePage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/PoliciesPage/PoliciesDetailPage/AddRulePage')
  )
);
const EditRulePage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/PoliciesPage/PoliciesDetailPage/EditRulePage')
  )
);

const TestCaseDetailsPage = withSuspenseFallback(
  React.lazy(
    () =>
      import('../../pages/TestCaseDetailsPage/TestCaseDetailsPage.component')
  )
);

const LogsViewer = withSuspenseFallback(
  React.lazy(() => import('../../pages/LogsViewer/LogsViewer.component'))
);

const DataInsightPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/DataInsightPage/DataInsightPage.component')
  )
);

const AddKPIPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/KPIPage/AddKPIPage'))
);

const EditKPIPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/KPIPage/EditKPIPage'))
);

const AddTestSuitePage = withSuspenseFallback(
  React.lazy(
    () => import('../../components/TestSuite/TestSuiteStepper/TestSuiteStepper')
  )
);

const ContainerPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/ContainerPage/ContainerPage'))
);

const SearchIndexDetailsPage = withSuspenseFallback(
  React.lazy(
    () => import('../../pages/SearchIndexDetailsPage/SearchIndexDetailsPage')
  )
);

const QueryPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/QueryPage/QueryPage.component'))
);
const AddQueryPage = withSuspenseFallback(
  React.lazy(() => import('../../pages/AddQueryPage/AddQueryPage.component'))
);

const PageNotFound = withSuspenseFallback(
  React.lazy(() => import('../../pages/PageNotFound/PageNotFound'))
);

const EditLoginConfiguration = withSuspenseFallback(
  React.lazy(
    () =>
      import(
        '../../pages/Configuration/EditLoginConfiguration/EditLoginConfigurationPage'
      )
  )
);

const AuthenticatedAppRouter: FunctionComponent = () => {
  const { permissions } = usePermissionProvider();
  const { routeElements } = useApplicationConfigContext();

  const glossaryPermission = useMemo(
    () =>
      userPermissions.hasViewPermissions(ResourceEntity.GLOSSARY, permissions),
    [permissions]
  );

  const knowledgeCenterPermission = useMemo(
    () =>
      userPermissions.hasViewPermissions(ResourceEntity.KNOWLEDGE_CENTER, permissions),
    [permissions]
  );

  const clientCenterPermission = useMemo(
    () =>
      userPermissions.hasViewPermissions(ResourceEntity.CLIENT_CENTER, permissions),
    [permissions]
  );

  const domainPermission = useMemo(
    () =>
      userPermissions.hasViewPermissions(ResourceEntity.DOMAIN, permissions),
    [permissions]
  );

  const dataProductPermission = useMemo(
    () =>
      userPermissions.hasViewPermissions(
        ResourceEntity.DATA_PRODUCT,
        permissions
      ),
    [permissions]
  );

  const perimeterPermission = useMemo(
    () =>
      userPermissions.hasViewPermissions(
        ResourceEntity.PERIMETER,
        permissions
      ),
    [permissions]
  );

  const tagCategoryPermission = useMemo(
    () =>
      userPermissions.hasViewPermissions(
        ResourceEntity.CLASSIFICATION,
        permissions
      ),

    [permissions]
  );

  const createBotPermission = useMemo(
    () =>
      checkPermission(Operation.Create, ResourceEntity.USER, permissions) &&
      checkPermission(Operation.Create, ResourceEntity.BOT, permissions),
    [permissions]
  );

  return (
    <Switch>
      <Route exact component={MyDataPageV1} path={ROUTES.MY_DATA} />
      <Route exact component={TourPageComponent} path={ROUTES.TOUR} />
      <Route exact component={ExplorePageV1} path={ROUTES.EXPLORE} />
      <Route component={ExplorePageV1} path={ROUTES.EXPLORE_WITH_TAB} />
      <Route
        exact
        component={EditConnectionFormPage}
        path={ROUTES.EDIT_SERVICE_CONNECTION}
      />
      <Route exact component={ServicePage} path={ROUTES.SERVICE} />
      <Route exact component={ServicePage} path={ROUTES.SERVICE_WITH_TAB} />
      <Route exact component={AddServicePage} path={ROUTES.ADD_SERVICE} />
      <Route exact component={QueryPage} path={ROUTES.QUERY_FULL_SCREEN_VIEW} />
      <Route exact component={AddQueryPage} path={ROUTES.ADD_QUERY} />
      <AdminProtectedRoute
        exact
        component={AddIngestionPage}
        hasPermission={checkPermission(
          Operation.Create,
          ResourceEntity.INGESTION_PIPELINE,
          permissions
        )}
        path={ROUTES.ADD_INGESTION}
      />
      <AdminProtectedRoute
        exact
        component={EditIngestionPage}
        hasPermission={checkPermission(
          Operation.EditAll,
          ResourceEntity.INGESTION_PIPELINE,
          permissions
        )}
        path={ROUTES.EDIT_INGESTION}
      />

      <AdminProtectedRoute
        exact
        component={MarketPlacePage}
        path={ROUTES.MARKETPLACE}
      />

      <AdminProtectedRoute
        exact
        component={MarketPlaceAppDetails}
        path={ROUTES.MARKETPLACE_APP_DETAILS}
      />

      <AdminProtectedRoute
        exact
        component={AppInstallPage}
        path={ROUTES.MARKETPLACE_APP_INSTALL}
      />

      <Route exact component={SwaggerPage} path={ROUTES.SWAGGER} />
      <AdminProtectedRoute
        exact
        component={TagsPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.TAGS}
      />
      <AdminProtectedRoute
        exact
        component={TagsPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.TAG_DETAILS}
      />
      <AdminProtectedRoute
        exact
        component={ClassificationVersionPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.TAG_VERSION}
      />

      <AdminProtectedRoute
        exact
        component={DlasPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.DLAS}
      />
      <AdminProtectedRoute
        exact
        component={DlasPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.DLA_DETAILS}
      />
      <AdminProtectedRoute
        exact
        component={DlaClassificationVersionPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.DLA_VERSION}
      />

      <AdminProtectedRoute
        exact
        component={SpdsPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.SPDS}
      />
      <AdminProtectedRoute
        exact
        component={SpdsPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.SPD_DETAILS}
      />
      <AdminProtectedRoute
        exact
        component={SpdClassificationVersionPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.SPD_VERSION}
      />

      <AdminProtectedRoute
        exact
        component={AutoSystemsPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.AUTOSYSTEMS}
      />
      <AdminProtectedRoute
        exact
        component={AutoSystemsPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.AUTOSYSTEM_DETAILS}
      />

      <AdminProtectedRoute
        exact
        component={UserEsksPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.USERESKS}
      />
      <AdminProtectedRoute
        exact
        component={UserEsksPage}
        hasPermission={tagCategoryPermission}
        path={ROUTES.USERESK_DETAILS}
      />

      <Route
        exact
        component={DataProductsPage}
        path={ROUTES.DATA_PRODUCT_VERSION}
      />
      <Route
        exact
        component={PerimetersPage}
        path={ROUTES.PERIMETER_VERSION}
      />
      <Route exact component={DomainVersionPage} path={ROUTES.DOMAIN_VERSION} />
      <Route
        exact
        component={() => <GlossaryVersionPage isGlossary />}
        path={ROUTES.GLOSSARY_VERSION}
      />
      <Route
        exact
        component={GlossaryVersionPage}
        path={ROUTES.GLOSSARY_TERMS_VERSION}
      />
      <Route
        exact
        component={GlossaryVersionPage}
        path={ROUTES.GLOSSARY_TERMS_VERSION_TAB}
      />
      <Route
        exact
        component={() => <KnowledgeCenterVersionPage isKnowledgeCenter />}
        path={ROUTES.KNOWLEDGE_CENTER_VERSION}
      />
      <Route
        exact
        component={KnowledgeCenterVersionPage}
        path={ROUTES.KNOWLEDGE_CENTER_DOCUMENTS_VERSION}
      />
      <Route
        exact
        component={KnowledgeCenterVersionPage}
        path={ROUTES.KNOWLEDGE_CENTER_DOCUMENTS_VERSION_TAB}
      />
      <Route
        exact
        component={() => <ClientCenterVersionPage isClientCenter />}
        path={ROUTES.CLIENT_CENTER_VERSION}
      />
      <Route
        exact
        component={ClientCenterVersionPage}
        path={ROUTES.CLIENT_CENTER_CLIENTS_VERSION}
      />
      <Route
        exact
        component={ClientCenterVersionPage}
        path={ROUTES.CLIENT_CENTER_CLIENTS_VERSION_TAB}
      />
      <Route
        exact
        component={DatabaseVersionPage}
        path={ROUTES.DATABASE_VERSION}
      />
      <Route
        exact
        component={DatabaseSchemaVersionPage}
        path={ROUTES.SCHEMA_VERSION}
      />
      <Route exact component={EntityVersionPage} path={ROUTES.ENTITY_VERSION} />
      <Route
        exact
        component={ServiceVersionPage}
        path={ROUTES.SERVICE_VERSION}
      />
      <Route
        exact
        component={EntityVersionPage}
        path={ROUTES.ENTITY_VERSION_WITH_TAB}
      />
      <Route exact component={DatabaseDetails} path={ROUTES.DATABASE_DETAILS} />
      <Route
        exact
        component={DatabaseDetails}
        path={ROUTES.DATABASE_DETAILS_WITH_TAB}
      />
      <Route
        exact
        component={DatabaseDetails}
        path={ROUTES.DATABASE_DETAILS_WITH_SUB_TAB}
      />
      <Route
        exact
        component={DatabaseSchemaPageComponent}
        path={ROUTES.SCHEMA_DETAILS}
      />
      <Route
        exact
        component={DatabaseSchemaPageComponent}
        path={ROUTES.SCHEMA_DETAILS_WITH_TAB}
      />
      <Route
        exact
        component={DatabaseSchemaPageComponent}
        path={ROUTES.SCHEMA_DETAILS_WITH_SUB_TAB}
      />
      <Route exact component={TableDetailsPageV1} path={ROUTES.TABLE_DETAILS} />
      <Route
        exact
        component={TableDetailsPageV1}
        path={ROUTES.TABLE_DETAILS_WITH_TAB}
      />
      <Route
        exact
        component={TableDetailsPageV1}
        path={ROUTES.TABLE_DETAILS_WITH_SUB_TAB}
      />
      <Route exact component={TopicDetailsPage} path={ROUTES.TOPIC_DETAILS} />
      <Route
        exact
        component={TopicDetailsPage}
        path={ROUTES.TOPIC_DETAILS_WITH_TAB}
      />
      <Route
        exact
        component={TopicDetailsPage}
        path={ROUTES.TOPIC_DETAILS_WITH_SUB_TAB}
      />
      <Route
        exact
        component={DashboardDetailsPage}
        path={ROUTES.DASHBOARD_DETAILS}
      />
      <Route
        exact
        component={DashboardDetailsPage}
        path={ROUTES.DASHBOARD_DETAILS_WITH_TAB}
      />
      <Route
        exact
        component={DashboardDetailsPage}
        path={ROUTES.DASHBOARD_DETAILS_WITH_SUB_TAB}
      />
      <Route
        exact
        component={DataModelDetailsPage}
        path={ROUTES.DATA_MODEL_DETAILS}
      />
      <Route
        exact
        component={DataModelDetailsPage}
        path={ROUTES.DATA_MODEL_DETAILS_WITH_TAB}
      />
      <Route
        exact
        component={DataModelDetailsPage}
        path={ROUTES.DATA_MODEL_DETAILS_WITH_SUB_TAB}
      />

      <Route
        exact
        component={StoredProcedureDetailsPage}
        path={ROUTES.STORED_PROCEDURE_DETAILS}
      />
      <Route
        exact
        component={StoredProcedureDetailsPage}
        path={ROUTES.STORED_PROCEDURE_DETAILS_WITH_TAB}
      />
      <Route
        exact
        component={StoredProcedureDetailsPage}
        path={ROUTES.STORED_PROCEDURE_DETAILS_WITH_SUB_TAB}
      />

      <Route
        exact
        component={PipelineDetailsPage}
        path={ROUTES.PIPELINE_DETAILS}
      />
      <Route
        exact
        component={PipelineDetailsPage}
        path={ROUTES.PIPELINE_DETAILS_WITH_TAB}
      />
      <Route
        exact
        component={PipelineDetailsPage}
        path={ROUTES.PIPELINE_DETAILS_WITH_SUB_TAB}
      />

      <Route exact component={ContainerPage} path={ROUTES.CONTAINER_DETAILS} />
      <Route
        exact
        component={ContainerPage}
        path={ROUTES.CONTAINER_DETAILS_WITH_TAB}
      />
      <Route
        exact
        component={ContainerPage}
        path={ROUTES.CONTAINER_DETAILS_WITH_SUB_TAB}
      />
      <Route
        exact
        component={SearchIndexDetailsPage}
        path={ROUTES.SEARCH_INDEX_DETAILS}
      />
      <Route
        exact
        component={SearchIndexDetailsPage}
        path={ROUTES.SEARCH_INDEX_DETAILS_WITH_TAB}
      />
      <Route
        exact
        component={SearchIndexDetailsPage}
        path={ROUTES.SEARCH_INDEX_DETAILS_WITH_SUB_TAB}
      />
      <AdminProtectedRoute
        exact
        component={GlossaryPage}
        hasPermission={glossaryPermission}
        path={ROUTES.GLOSSARY}
      />
      <AdminProtectedRoute
        exact
        component={GlossaryPage}
        hasPermission={glossaryPermission}
        path={ROUTES.GLOSSARY_DETAILS}
      />
      <AdminProtectedRoute
        exact
        component={GlossaryPage}
        hasPermission={glossaryPermission}
        path={ROUTES.GLOSSARY_DETAILS_WITH_ACTION}
      />
      <AdminProtectedRoute
        exact
        component={KnowledgeCenterPage}
        hasPermission={knowledgeCenterPermission}
        path={ROUTES.KNOWLEDGE_CENTER}
      />
      <AdminProtectedRoute
        exact
        component={KnowledgeCenterPage}
        hasPermission={knowledgeCenterPermission}
        path={ROUTES.KNOWLEDGE_CENTER_DETAILS}
      />
      <AdminProtectedRoute
        exact
        component={KnowledgeCenterPage}
        hasPermission={knowledgeCenterPermission}
        path={ROUTES.KNOWLEDGE_CENTER_DETAILS_WITH_ACTION}
      />
      <AdminProtectedRoute
        exact
        component={ClientCenterPage}
        hasPermission={clientCenterPermission}
        path={ROUTES.CLIENT_CENTER}
      />
      <AdminProtectedRoute
        exact
        component={ClientCenterPage}
        hasPermission={clientCenterPermission}
        path={ROUTES.CLIENT_CENTER_DETAILS}
      />
      <AdminProtectedRoute
        exact
        component={ClientCenterPage}
        hasPermission={clientCenterPermission}
        path={ROUTES.CLIENT_CENTER_DETAILS_WITH_ACTION}
      />
      <Route exact component={UserPage} path={ROUTES.USER_PROFILE} />
      <Route exact component={UserPage} path={ROUTES.USER_PROFILE_WITH_TAB} />
      <Route
        exact
        component={UserPage}
        path={ROUTES.USER_PROFILE_WITH_SUB_TAB}
      />

      <Route exact component={MlModelPage} path={ROUTES.MLMODEL_DETAILS} />
      <Route
        exact
        component={MlModelPage}
        path={ROUTES.MLMODEL_DETAILS_WITH_SUB_TAB}
      />

      <Route
        exact
        component={MlModelPage}
        path={ROUTES.MLMODEL_DETAILS_WITH_TAB}
      />

      <Route
        exact
        component={UserPage}
        path={ROUTES.USER_PROFILE_WITH_SUB_TAB}
      />

      <Route exact component={MlModelPage} path={ROUTES.MLMODEL_DETAILS} />
      <Route
        exact
        component={MlModelPage}
        path={ROUTES.MLMODEL_DETAILS_WITH_SUB_TAB}
      />

      <Route
        exact
        component={AddDataQualityTestPage}
        path={ROUTES.ADD_DATA_QUALITY_TEST_CASE}
      />

      <AdminProtectedRoute
        exact
        component={DataProductsPage}
        hasPermission={dataProductPermission}
        path={ROUTES.DATA_PRODUCT_DETAILS}
      />
      <AdminProtectedRoute
        exact
        component={DataProductsPage}
        hasPermission={dataProductPermission}
        path={ROUTES.DATA_PRODUCT_DETAILS_WITH_TAB}
      />

      <AdminProtectedRoute
        exact
        component={PerimetersPage}
        hasPermission={perimeterPermission}
        path={ROUTES.PERIMETER_DETAILS}
      />
      <AdminProtectedRoute
        exact
        component={PerimetersPage}
        hasPermission={perimeterPermission}
        path={ROUTES.PERIMETER_DETAILS_WITH_TAB}
      />

      <Route exact component={AddDomain} path={ROUTES.ADD_DOMAIN} />
      <AdminProtectedRoute
        exact
        component={DomainPage}
        hasPermission={domainPermission}
        path={ROUTES.DOMAIN}
      />
      <AdminProtectedRoute
        exact
        component={DomainPage}
        hasPermission={domainPermission}
        path={ROUTES.DOMAIN_DETAILS}
      />
      <AdminProtectedRoute
        exact
        component={DomainPage}
        hasPermission={domainPermission}
        path={ROUTES.DOMAIN_DETAILS_WITH_TAB}
      />

      <Route exact component={AddGlossaryPage} path={ROUTES.ADD_GLOSSARY} />
      <AdminProtectedRoute
        exact
        component={GlossaryPage}
        hasPermission={glossaryPermission}
        path={ROUTES.GLOSSARY_DETAILS_WITH_TAB}
      />
      <AdminProtectedRoute
        exact
        component={GlossaryPage}
        hasPermission={glossaryPermission}
        path={ROUTES.GLOSSARY_DETAILS_WITH_SUBTAB}
      />
      <Route exact component={AddKnowledgeCenterPage} path={ROUTES.ADD_KNOWLEDGE_CENTER} />
      <AdminProtectedRoute
        exact
        component={KnowledgeCenterPage}
        hasPermission={knowledgeCenterPermission}
        path={ROUTES.KNOWLEDGE_CENTER_DETAILS_WITH_TAB}
      />
      <AdminProtectedRoute
        exact
        component={KnowledgeCenterPage}
        hasPermission={knowledgeCenterPermission}
        path={ROUTES.KNOWLEDGE_CENTER_DETAILS_WITH_SUBTAB}
      />
      <Route exact component={AddClientCenterPage} path={ROUTES.ADD_CLIENT_CENTER} />
      <AdminProtectedRoute
        exact
        component={ClientCenterPage}
        hasPermission={clientCenterPermission}
        path={ROUTES.CLIENT_CENTER_DETAILS_WITH_TAB}
      />
      <AdminProtectedRoute
        exact
        component={ClientCenterPage}
        hasPermission={clientCenterPermission}
        path={ROUTES.CLIENT_CENTER_DETAILS_WITH_SUBTAB}
      />
      <AdminProtectedRoute
        exact
        component={CreateUserPage}
        hasPermission={checkPermission(
          Operation.Create,
          ResourceEntity.USER,
          permissions
        )}
        path={ROUTES.CREATE_USER}
      />
      <AdminProtectedRoute
        exact
        component={CreateUserPage}
        hasPermission={createBotPermission}
        path={ROUTES.CREATE_USER_WITH_BOT}
      />
      <Route exact component={BotDetailsPage} path={ROUTES.BOTS_PROFILE} />
      <Route
        exact
        component={AddCustomProperty}
        path={ROUTES.ADD_CUSTOM_PROPERTY}
      />
      <Route
        exact
        component={RequestDescriptionPage}
        path={ROUTES.REQUEST_DESCRIPTION}
      />
      <Route
        exact
        component={UpdateDescriptionPage}
        path={ROUTES.UPDATE_DESCRIPTION}
      />

      <Route exact component={RequestTagsPage} path={ROUTES.REQUEST_TAGS} />
      <Route exact component={UpdateTagsPage} path={ROUTES.UPDATE_TAGS} />

      <Route exact component={RequestDlasPage} path={ROUTES.REQUEST_DLAS} />
      <Route exact component={UpdateDlasPage} path={ROUTES.UPDATE_DLAS} />

      <Route exact component={RequestSpdsPage} path={ROUTES.REQUEST_SPDS} />
      <Route exact component={UpdateSpdsPage} path={ROUTES.UPDATE_SPDS} />

      <Route exact component={RequestAutoSystemsPage} path={ROUTES.REQUEST_AUTOSYSTEMS} />
      <Route exact component={UpdateAutoSystemsPage} path={ROUTES.UPDATE_AUTOSYSTEMS} />

      {/* keep these route above the setting route always */}
      <AdminProtectedRoute
        exact
        component={AddRolePage}
        hasPermission={checkPermission(
          Operation.Create,
          ResourceEntity.ROLE,
          permissions
        )}
        path={ROUTES.ADD_ROLE}
      />
      <AdminProtectedRoute
        exact
        component={AddPolicyPage}
        hasPermission={checkPermission(
          Operation.Create,
          ResourceEntity.POLICY,
          permissions
        )}
        path={ROUTES.ADD_POLICY}
      />
      <Route exact component={AddRulePage} path={ROUTES.ADD_POLICY_RULE} />
      <AdminProtectedRoute
        exact
        component={EditEmailConfigPage}
        hasPermission={false}
        path={ROUTES.SETTINGS_EDIT_EMAIL_CONFIG}
      />
      <AdminProtectedRoute
        exact
        component={EditCustomLogoConfigPage}
        hasPermission={false}
        path={ROUTES.SETTINGS_EDIT_CUSTOM_LOGO_CONFIG}
      />
      <AdminProtectedRoute
        exact
        component={EditLoginConfiguration}
        hasPermission={false}
        path={ROUTES.SETTINGS_EDIT_CUSTOM_LOGIN_CONFIG}
      />
      <Route exact component={EditRulePage} path={ROUTES.EDIT_POLICY_RULE} />

      <Route exact component={GlobalSettingPage} path={ROUTES.SETTINGS} />
      <Route
        exact
        component={GlobalSettingPage}
        path={ROUTES.SETTINGS_WITH_TAB}
      />
      <Route
        exact
        component={GlobalSettingPage}
        path={ROUTES.SETTINGS_WITH_TAB_FQN}
      />
      <Route
        exact
        component={GlobalSettingPage}
        path={ROUTES.SETTINGS_WITH_TAB_FQN_ACTION}
      />
      <Route
        exact
        component={TestSuiteDetailsPage}
        path={ROUTES.TEST_SUITES_WITH_FQN}
      />
      <Route exact component={LogsViewer} path={ROUTES.LOGS} />
      <Route
        exact
        component={TestSuiteIngestionPage}
        path={ROUTES.TEST_SUITES_ADD_INGESTION}
      />
      <Route
        exact
        component={TestSuiteIngestionPage}
        path={ROUTES.TEST_SUITES_EDIT_INGESTION}
      />
      <AdminProtectedRoute
        exact
        component={DataQualityPage}
        hasPermission={userPermissions.hasViewPermissions(
          ResourceEntity.TEST_SUITE,
          permissions
        )}
        path={ROUTES.DATA_QUALITY_WITH_TAB}
      />
      <AdminProtectedRoute
        exact
        component={DataQualityPage}
        hasPermission={userPermissions.hasViewPermissions(
          ResourceEntity.TEST_SUITE,
          permissions
        )}
        path={ROUTES.DATA_QUALITY}
      />

      <AdminProtectedRoute
        exact
        component={TestCaseDetailsPage}
        hasPermission={userPermissions.hasViewPermissions(
          ResourceEntity.TEST_CASE,
          permissions
        )}
        path={ROUTES.TEST_CASE_DETAILS}
      />
      <Route exact component={DataInsightPage} path={ROUTES.DATA_INSIGHT} />
      <Route
        exact
        component={DataInsightPage}
        path={ROUTES.DATA_INSIGHT_WITH_TAB}
      />
      <Route exact component={AddKPIPage} path={ROUTES.ADD_KPI} />
      <Route exact component={EditKPIPage} path={ROUTES.EDIT_KPI} />
      <Route exact component={AddTestSuitePage} path={ROUTES.ADD_TEST_SUITES} />
      <Route exact path={ROUTES.HOME}>
        <Redirect to={'explore/clientCenters'} />
      </Route>

      <AdminProtectedRoute
        exact
        component={CustomizablePage}
        path={ROUTES.CUSTOMIZE_PAGE}
      />
      {routeElements}
      <Route exact component={PageNotFound} path={ROUTES.NOT_FOUND} />
      <Redirect to={ROUTES.NOT_FOUND} />
    </Switch>
  );
};

export default AuthenticatedAppRouter;
