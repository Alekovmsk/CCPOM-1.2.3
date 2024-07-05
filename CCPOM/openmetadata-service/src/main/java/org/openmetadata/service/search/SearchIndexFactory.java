package org.openmetadata.service.search;

import lombok.extern.slf4j.Slf4j;
import org.openmetadata.schema.analytics.ReportData;
import org.openmetadata.schema.entity.autoSystemClassification.AutoSystem;
import org.openmetadata.schema.entity.autoSystemClassification.AutoSystemClassification;
import org.openmetadata.schema.entity.classification.Classification;
import org.openmetadata.schema.entity.classification.Tag;
import org.openmetadata.schema.entity.data.Chart;
import org.openmetadata.schema.entity.data.ClientCenterClient;
import org.openmetadata.schema.entity.data.Container;
import org.openmetadata.schema.entity.data.Dashboard;
import org.openmetadata.schema.entity.data.DashboardDataModel;
import org.openmetadata.schema.entity.data.Database;
import org.openmetadata.schema.entity.data.DatabaseSchema;
import org.openmetadata.schema.entity.data.GlossaryTerm;
import org.openmetadata.schema.entity.data.KnowledgeCenterDocument;
import org.openmetadata.schema.entity.data.MlModel;
import org.openmetadata.schema.entity.data.Pipeline;
import org.openmetadata.schema.entity.data.Query;
import org.openmetadata.schema.entity.data.StoredProcedure;
import org.openmetadata.schema.entity.data.Table;
import org.openmetadata.schema.entity.data.Topic;
import org.openmetadata.schema.entity.dlaClassification.Dla;
import org.openmetadata.schema.entity.dlaClassification.DlaClassification;
import org.openmetadata.schema.entity.domains.DataProduct;
import org.openmetadata.schema.entity.domains.Domain;
import org.openmetadata.schema.entity.domains.Perimeter;
import org.openmetadata.schema.entity.services.DashboardService;
import org.openmetadata.schema.entity.services.DatabaseService;
import org.openmetadata.schema.entity.services.MessagingService;
import org.openmetadata.schema.entity.services.MetadataService;
import org.openmetadata.schema.entity.services.MlModelService;
import org.openmetadata.schema.entity.services.PipelineService;
import org.openmetadata.schema.entity.services.SearchService;
import org.openmetadata.schema.entity.services.StorageService;
import org.openmetadata.schema.entity.spdClassification.Spd;
import org.openmetadata.schema.entity.spdClassification.SpdClassification;
import org.openmetadata.schema.entity.teams.Team;
import org.openmetadata.schema.entity.teams.User;
import org.openmetadata.schema.entity.userEskClassification.UserEsk;
import org.openmetadata.schema.entity.userEskClassification.UserEskClassification;
import org.openmetadata.schema.tests.TestCase;
import org.openmetadata.schema.tests.TestSuite;
import org.openmetadata.service.Entity;
import org.openmetadata.service.search.indexes.AggregatedCostAnalysisReportDataIndex;
import org.openmetadata.service.search.indexes.AutoSystemClassificationIndex;
import org.openmetadata.service.search.indexes.AutoSystemIndex;
import org.openmetadata.service.search.indexes.ChartIndex;
import org.openmetadata.service.search.indexes.ClassificationIndex;
import org.openmetadata.service.search.indexes.ClientCenterClientIndex;
import org.openmetadata.service.search.indexes.ContainerIndex;
import org.openmetadata.service.search.indexes.DashboardDataModelIndex;
import org.openmetadata.service.search.indexes.DashboardIndex;
import org.openmetadata.service.search.indexes.DashboardServiceIndex;
import org.openmetadata.service.search.indexes.DataProductIndex;
import org.openmetadata.service.search.indexes.DatabaseIndex;
import org.openmetadata.service.search.indexes.DatabaseSchemaIndex;
import org.openmetadata.service.search.indexes.DatabaseServiceIndex;
import org.openmetadata.service.search.indexes.DlaClassificationIndex;
import org.openmetadata.service.search.indexes.DlaIndex;
import org.openmetadata.service.search.indexes.DomainIndex;
import org.openmetadata.service.search.indexes.EntityReportDataIndex;
import org.openmetadata.service.search.indexes.GlossaryTermIndex;
import org.openmetadata.service.search.indexes.KnowledgeCenterDocumentIndex;
import org.openmetadata.service.search.indexes.MessagingServiceIndex;
import org.openmetadata.service.search.indexes.MetadataServiceIndex;
import org.openmetadata.service.search.indexes.MlModelIndex;
import org.openmetadata.service.search.indexes.MlModelServiceIndex;
import org.openmetadata.service.search.indexes.PerimeterIndex;
import org.openmetadata.service.search.indexes.PipelineIndex;
import org.openmetadata.service.search.indexes.PipelineServiceIndex;
import org.openmetadata.service.search.indexes.QueryIndex;
import org.openmetadata.service.search.indexes.RawCostAnalysisReportDataIndex;
import org.openmetadata.service.search.indexes.SearchEntityIndex;
import org.openmetadata.service.search.indexes.SearchIndex;
import org.openmetadata.service.search.indexes.SearchServiceIndex;
import org.openmetadata.service.search.indexes.SpdClassificationIndex;
import org.openmetadata.service.search.indexes.SpdIndex;
import org.openmetadata.service.search.indexes.StorageServiceIndex;
import org.openmetadata.service.search.indexes.StoredProcedureIndex;
import org.openmetadata.service.search.indexes.TableIndex;
import org.openmetadata.service.search.indexes.TagIndex;
import org.openmetadata.service.search.indexes.TeamIndex;
import org.openmetadata.service.search.indexes.TestCaseIndex;
import org.openmetadata.service.search.indexes.TestSuiteIndex;
import org.openmetadata.service.search.indexes.TopicIndex;
import org.openmetadata.service.search.indexes.UserEskClassificationIndex;
import org.openmetadata.service.search.indexes.UserEskIndex;
import org.openmetadata.service.search.indexes.UserIndex;
import org.openmetadata.service.search.indexes.WebAnalyticEntityViewReportDataIndex;
import org.openmetadata.service.search.indexes.WebAnalyticUserActivityReportDataIndex;

@Slf4j
public class SearchIndexFactory {
  private SearchIndexFactory() {}

  public static SearchIndex buildIndex(String entityType, Object entity) {
    switch (entityType) {
      case Entity.TABLE:
        return new TableIndex((Table) entity);
      case Entity.DASHBOARD:
        return new DashboardIndex((Dashboard) entity);
      case Entity.TOPIC:
        return new TopicIndex((Topic) entity);
      case Entity.PIPELINE:
        return new PipelineIndex((Pipeline) entity);
      case Entity.USER:
        return new UserIndex((User) entity);
      case Entity.TEAM:
        return new TeamIndex((Team) entity);
      case Entity.GLOSSARY_TERM:
        return new GlossaryTermIndex((GlossaryTerm) entity);
      case Entity.KNOWLEDGE_CENTER_DOCUMENT:
        return new KnowledgeCenterDocumentIndex((KnowledgeCenterDocument) entity);
      case Entity.CLIENT_CENTER_CLIENT:
        return new ClientCenterClientIndex((ClientCenterClient) entity);
      case Entity.MLMODEL:
        return new MlModelIndex((MlModel) entity);
      case Entity.TAG:
        return new TagIndex((Tag) entity);
      case Entity.CLASSIFICATION:
        return new ClassificationIndex((Classification) entity);
      case Entity.QUERY:
        return new QueryIndex((Query) entity);
      case Entity.CONTAINER:
        return new ContainerIndex((Container) entity);
      case Entity.DATABASE:
        return new DatabaseIndex((Database) entity);
      case Entity.DATABASE_SCHEMA:
        return new DatabaseSchemaIndex((DatabaseSchema) entity);
      case Entity.TEST_CASE:
        return new TestCaseIndex((TestCase) entity);
      case Entity.TEST_SUITE:
        return new TestSuiteIndex((TestSuite) entity);
      case Entity.CHART:
        return new ChartIndex((Chart) entity);
      case Entity.DASHBOARD_DATA_MODEL:
        return new DashboardDataModelIndex((DashboardDataModel) entity);
      case Entity.DASHBOARD_SERVICE:
        return new DashboardServiceIndex((DashboardService) entity);
      case Entity.DATABASE_SERVICE:
        return new DatabaseServiceIndex((DatabaseService) entity);
      case Entity.MESSAGING_SERVICE:
        return new MessagingServiceIndex((MessagingService) entity);
      case Entity.MLMODEL_SERVICE:
        return new MlModelServiceIndex((MlModelService) entity);
      case Entity.SEARCH_SERVICE:
        return new SearchServiceIndex((SearchService) entity);
      case Entity.SEARCH_INDEX:
        return new SearchEntityIndex((org.openmetadata.schema.entity.data.SearchIndex) entity);
      case Entity.PIPELINE_SERVICE:
        return new PipelineServiceIndex((PipelineService) entity);
      case Entity.STORAGE_SERVICE:
        return new StorageServiceIndex((StorageService) entity);
      case Entity.DOMAIN:
        return new DomainIndex((Domain) entity);
      case Entity.STORED_PROCEDURE:
        return new StoredProcedureIndex((StoredProcedure) entity);
      case Entity.DATA_PRODUCT:
        return new DataProductIndex((DataProduct) entity);
      case Entity.PERIMETER:
        return new PerimeterIndex((Perimeter) entity);
      case Entity.METADATA_SERVICE:
        return new MetadataServiceIndex((MetadataService) entity);
      case Entity.ENTITY_REPORT_DATA:
        return new EntityReportDataIndex((ReportData) entity);
      case Entity.WEB_ANALYTIC_ENTITY_VIEW_REPORT_DATA:
        return new WebAnalyticEntityViewReportDataIndex((ReportData) entity);
      case Entity.WEB_ANALYTIC_USER_ACTIVITY_REPORT_DATA:
        return new WebAnalyticUserActivityReportDataIndex((ReportData) entity);
      case Entity.RAW_COST_ANALYSIS_REPORT_DATA:
        return new RawCostAnalysisReportDataIndex((ReportData) entity);
      case Entity.AGGREGATED_COST_ANALYSIS_REPORT_DATA:
        return new AggregatedCostAnalysisReportDataIndex((ReportData) entity);
      case Entity.DLACLASSIFICATION:
        return new DlaClassificationIndex((DlaClassification) entity);
      case Entity.DLA:
        return new DlaIndex((Dla) entity);
      case Entity.SPDCLASSIFICATION:
        return new SpdClassificationIndex((SpdClassification) entity);
      case Entity.SPD:
        return new SpdIndex((Spd) entity);
      case Entity.AUTOSYSTEMCLASSIFICATION:
        return new AutoSystemClassificationIndex((AutoSystemClassification) entity);
      case Entity.AUTOSYSTEM:
        return new AutoSystemIndex((AutoSystem) entity);
      case Entity.USERESKCLASSIFICATION:
        return new UserEskClassificationIndex((UserEskClassification) entity);
      case Entity.USERESK:
        return new UserEskIndex((UserEsk) entity);
      default:
        LOG.warn("Ignoring Entity Type {}", entityType);
    }
    throw new IllegalArgumentException(String.format("Entity Type [%s] is not valid for Index Factory", entityType));
  }
}
