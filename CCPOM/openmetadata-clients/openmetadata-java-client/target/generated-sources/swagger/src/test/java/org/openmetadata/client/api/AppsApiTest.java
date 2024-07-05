package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.App;
import org.openmetadata.client.model.AppList;
import org.openmetadata.client.model.AppMarketPlaceDefinition;
import org.openmetadata.client.model.AppMarketPlaceDefinitionList;
import org.openmetadata.client.model.AppRunList;
import org.openmetadata.client.model.AppRunRecord;
import java.math.BigDecimal;
import org.openmetadata.client.model.CreateApp;
import org.openmetadata.client.model.CreateAppMarketPlaceDefinitionReq;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.ScheduleApplication200Response;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppsApi
 */
class AppsApiTest {

    private AppsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(AppsApi.class);
    }

    
    /**
     * Create a Application
     *
     * Create a application
     */
    @Test
    void createApplicationTest() {
        CreateAppMarketPlaceDefinitionReq createAppMarketPlaceDefinitionReq = null;
        // AppMarketPlaceDefinition response = api.createApplication(createAppMarketPlaceDefinitionReq);

        // TODO: test validations
    }

    
    /**
     * Create a Application
     *
     * Create a application
     */
    @Test
    void createApplication1Test() {
        CreateApp createApp = null;
        // App response = api.createApplication1(createApp);

        // TODO: test validations
    }

    
    /**
     * Create Or Update App
     *
     * Create or Update App, it it does not exist or update an existing KPI.
     */
    @Test
    void createOrUpdateAppTest() {
        CreateAppMarketPlaceDefinitionReq createAppMarketPlaceDefinitionReq = null;
        // App response = api.createOrUpdateApp(createAppMarketPlaceDefinitionReq);

        // TODO: test validations
    }

    
    /**
     * Create Or Update App
     *
     * Create or Update App, it it does not exist or update an existing KPI.
     */
    @Test
    void createOrUpdateApp1Test() {
        CreateApp createApp = null;
        // App response = api.createOrUpdateApp1(createApp);

        // TODO: test validations
    }

    
    /**
     * Delete a App by Id
     *
     * Delete a App by &#x60;Id&#x60;.
     */
    @Test
    void deleteAppTest() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.deleteApp(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a App by Id
     *
     * Delete a App by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteAppTestQueryMap() {
        UUID id = null;
        AppsApi.DeleteAppQueryParams queryParams = new AppsApi.DeleteAppQueryParams()
            .hardDelete(null);
        // api.deleteApp(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a App by name
     *
     * Delete a App by &#x60;name&#x60;.
     */
    @Test
    void deleteAppByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteAppByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a App by name
     *
     * Delete a App by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteAppByNameTestQueryMap() {
        String name = null;
        AppsApi.DeleteAppByNameQueryParams queryParams = new AppsApi.DeleteAppByNameQueryParams()
            .hardDelete(null);
        // api.deleteAppByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Deploy App to Quartz or Ingestion
     *
     * Deploy App to Quartz or Ingestion.
     */
    @Test
    void deployApplicationToQuartzOrIngestionTest() {
        String name = null;
        // api.deployApplicationToQuartzOrIngestion(name);

        // TODO: test validations
    }

    
    /**
     * Get a app by Id
     *
     * Get a app by &#x60;Id&#x60;.
     */
    @Test
    void getTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // AppMarketPlaceDefinition response = api.get(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a app by Id
     *
     * Get a app by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTestQueryMap() {
        UUID id = null;
        AppsApi.GetQueryParams queryParams = new AppsApi.GetQueryParams()
            .fields(null)
            .include(null);
        // AppMarketPlaceDefinition response = api.get(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a app by Id
     *
     * Get a app by &#x60;Id&#x60;.
     */
    @Test
    void get1Test() {
        UUID id = null;
        String fields = null;
        String include = null;
        // App response = api.get1(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a app by Id
     *
     * Get a app by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void get1TestQueryMap() {
        UUID id = null;
        AppsApi.Get1QueryParams queryParams = new AppsApi.Get1QueryParams()
            .fields(null)
            .include(null);
        // App response = api.get1(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a App by name
     *
     * Get a App by &#x60;name&#x60;.
     */
    @Test
    void getAppByNameTest() {
        String name = null;
        String fields = null;
        String include = null;
        // AppMarketPlaceDefinition response = api.getAppByName(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a App by name
     *
     * Get a App by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getAppByNameTestQueryMap() {
        String name = null;
        AppsApi.GetAppByNameQueryParams queryParams = new AppsApi.GetAppByNameQueryParams()
            .fields(null)
            .include(null);
        // AppMarketPlaceDefinition response = api.getAppByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a App by name
     *
     * Get a App by &#x60;name&#x60;.
     */
    @Test
    void getAppByName1Test() {
        String name = null;
        String fields = null;
        String include = null;
        // App response = api.getAppByName1(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a App by name
     *
     * Get a App by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getAppByName1TestQueryMap() {
        String name = null;
        AppsApi.GetAppByName1QueryParams queryParams = new AppsApi.GetAppByName1QueryParams()
            .fields(null)
            .include(null);
        // App response = api.getAppByName1(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve all logs from last ingestion pipeline run for the application
     *
     * Get all logs from last ingestion pipeline run by &#x60;Id&#x60;.
     */
    @Test
    void getLastLogsTest() {
        String name = null;
        String after = null;
        // api.getLastLogs(name, after);

        // TODO: test validations
    }

    /**
     * Retrieve all logs from last ingestion pipeline run for the application
     *
     * Get all logs from last ingestion pipeline run by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getLastLogsTestQueryMap() {
        String name = null;
        AppsApi.GetLastLogsQueryParams queryParams = new AppsApi.GetLastLogsQueryParams()
            .after(null);
        // api.getLastLogs(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the App
     *
     * Get a version of the App by given &#x60;id&#x60;
     */
    @Test
    void getSpecificAppVersionTest() {
        UUID id = null;
        String version = null;
        // App response = api.getSpecificAppVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a version of the App
     *
     * Get a version of the App by given &#x60;id&#x60;
     */
    @Test
    void getSpecificAppVersion1Test() {
        UUID id = null;
        String version = null;
        // App response = api.getSpecificAppVersion1(id, version);

        // TODO: test validations
    }

    
    /**
     * Get Latest App Run Record
     *
     * Get a latest applications Run Record.
     */
    @Test
    void latestAppRunRecordTest() {
        String name = null;
        String after = null;
        // AppRunRecord response = api.latestAppRunRecord(name, after);

        // TODO: test validations
    }

    /**
     * Get Latest App Run Record
     *
     * Get a latest applications Run Record.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void latestAppRunRecordTestQueryMap() {
        String name = null;
        AppsApi.LatestAppRunRecordQueryParams queryParams = new AppsApi.LatestAppRunRecordQueryParams()
            .after(null);
        // AppRunRecord response = api.latestAppRunRecord(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * List Installed Application versions
     *
     * Get a list of all the versions of a application identified by &#x60;id&#x60;
     */
    @Test
    void listAllInstalledApplicationsTest() {
        UUID id = null;
        // EntityHistory response = api.listAllInstalledApplications(id);

        // TODO: test validations
    }

    
    /**
     * List Installed Application versions
     *
     * Get a list of all the versions of a application identified by &#x60;id&#x60;
     */
    @Test
    void listAllInstalledApplications1Test() {
        UUID id = null;
        // EntityHistory response = api.listAllInstalledApplications1(id);

        // TODO: test validations
    }

    
    /**
     * List App Run Records
     *
     * Get a list of applications Run Record. Use cursor-based pagination to limit the number entries in the list using &#x60;offset&#x60; query params.
     */
    @Test
    void listAppRunRecordsTest() {
        String name = null;
        Integer limit = null;
        Integer offset = null;
        BigDecimal startTs = null;
        BigDecimal endTs = null;
        // AppRunList response = api.listAppRunRecords(name, limit, offset, startTs, endTs);

        // TODO: test validations
    }

    /**
     * List App Run Records
     *
     * Get a list of applications Run Record. Use cursor-based pagination to limit the number entries in the list using &#x60;offset&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listAppRunRecordsTestQueryMap() {
        String name = null;
        AppsApi.ListAppRunRecordsQueryParams queryParams = new AppsApi.ListAppRunRecordsQueryParams()
            .limit(null)
            .offset(null)
            .startTs(null)
            .endTs(null);
        // AppRunList response = api.listAppRunRecords(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * List application
     *
     * Get a list of applications. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listApplicationsTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // AppMarketPlaceDefinitionList response = api.listApplications(fields, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List application
     *
     * Get a list of applications. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listApplicationsTestQueryMap() {
        AppsApi.ListApplicationsQueryParams queryParams = new AppsApi.ListApplicationsQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // AppMarketPlaceDefinitionList response = api.listApplications(queryParams);

    // TODO: test validations
    }
    
    /**
     * List installed application
     *
     * Get a list of applications. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listInstalledApplicationsTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // AppList response = api.listInstalledApplications(fields, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List installed application
     *
     * Get a list of applications. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listInstalledApplicationsTestQueryMap() {
        AppsApi.ListInstalledApplicationsQueryParams queryParams = new AppsApi.ListInstalledApplicationsQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // AppList response = api.listInstalledApplications(queryParams);

    // TODO: test validations
    }
    
    /**
     * Updates a App
     *
     * Update an existing App using JsonPatch.
     */
    @Test
    void patchApplicationTest() {
        UUID id = null;
        Object body = null;
        // api.patchApplication(id, body);

        // TODO: test validations
    }

    
    /**
     * Updates a App
     *
     * Update an existing App using JsonPatch.
     */
    @Test
    void patchApplication1Test() {
        UUID id = null;
        Object body = null;
        // api.patchApplication1(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted KPI
     *
     * Restore a soft deleted App.
     */
    @Test
    void restoreTest() {
        RestoreEntity restoreEntity = null;
        // AppMarketPlaceDefinition response = api.restore(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted KPI
     *
     * Restore a soft deleted App.
     */
    @Test
    void restore1Test() {
        RestoreEntity restoreEntity = null;
        // App response = api.restore1(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Schedule an Application
     *
     * Schedule a application to be run on demand.
     */
    @Test
    void scheduleApplicationTest() {
        String name = null;
        // ScheduleApplication200Response response = api.scheduleApplication(name);

        // TODO: test validations
    }

    
    /**
     * Trigger an Application run
     *
     * Trigger a Application run by id.
     */
    @Test
    void triggerApplicationRunTest() {
        String name = null;
        // api.triggerApplicationRun(name);

        // TODO: test validations
    }

    
    /**
     * Delete a App by name
     *
     * Delete a App by &#x60;name&#x60;.
     */
    @Test
    void uninstallAppByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.uninstallAppByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a App by name
     *
     * Delete a App by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void uninstallAppByNameTestQueryMap() {
        String name = null;
        AppsApi.UninstallAppByNameQueryParams queryParams = new AppsApi.UninstallAppByNameQueryParams()
            .hardDelete(null);
        // api.uninstallAppByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a App by Id
     *
     * Delete a App by &#x60;Id&#x60;.
     */
    @Test
    void uninstallAppByName1Test() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.uninstallAppByName1(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a App by Id
     *
     * Delete a App by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void uninstallAppByName1TestQueryMap() {
        UUID id = null;
        AppsApi.UninstallAppByName1QueryParams queryParams = new AppsApi.UninstallAppByName1QueryParams()
            .hardDelete(null);
        // api.uninstallAppByName1(id, queryParams);

    // TODO: test validations
    }
    
}
