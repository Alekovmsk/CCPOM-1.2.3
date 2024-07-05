package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateDashboardService;
import org.openmetadata.client.model.DashboardService;
import org.openmetadata.client.model.DashboardServiceList;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.TestConnectionResult;
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
 * API tests for DashboardServicesApi
 */
class DashboardServicesApiTest {

    private DashboardServicesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(DashboardServicesApi.class);
    }

    
    /**
     * Add test connection result
     *
     * Add test connection result to the service.
     */
    @Test
    void addTestConnectionResultTest() {
        UUID id = null;
        TestConnectionResult testConnectionResult = null;
        // DatabaseService response = api.addTestConnectionResult(id, testConnectionResult);

        // TODO: test validations
    }

    
    /**
     * Create a dashboard service
     *
     * Create a new dashboard service.
     */
    @Test
    void createDashboardServiceTest() {
        CreateDashboardService createDashboardService = null;
        // DashboardService response = api.createDashboardService(createDashboardService);

        // TODO: test validations
    }

    
    /**
     * Update a dashboard service
     *
     * Update an existing dashboard service identified by &#x60;Id&#x60;.
     */
    @Test
    void createOrUpdateDashboardServiceTest() {
        CreateDashboardService createDashboardService = null;
        // DashboardService response = api.createOrUpdateDashboardService(createDashboardService);

        // TODO: test validations
    }

    
    /**
     * Delete a dashboard service by Id
     *
     * Delete a Dashboard services. If dashboard (and charts) belong to the service, it can&#39;t be deleted.
     */
    @Test
    void deleteDashboardServiceTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteDashboardService(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a dashboard service by Id
     *
     * Delete a Dashboard services. If dashboard (and charts) belong to the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDashboardServiceTestQueryMap() {
        UUID id = null;
        DashboardServicesApi.DeleteDashboardServiceQueryParams queryParams = new DashboardServicesApi.DeleteDashboardServiceQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteDashboardService(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a dashboard service by name
     *
     * Delete a Dashboard services by &#x60;name&#x60;. If dashboard (and charts) belong to the service, it can&#39;t be deleted.
     */
    @Test
    void deleteDashboardServiceByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteDashboardServiceByName(name, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a dashboard service by name
     *
     * Delete a Dashboard services by &#x60;name&#x60;. If dashboard (and charts) belong to the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDashboardServiceByNameTestQueryMap() {
        String name = null;
        DashboardServicesApi.DeleteDashboardServiceByNameQueryParams queryParams = new DashboardServicesApi.DeleteDashboardServiceByNameQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteDashboardServiceByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get dashboard service by name
     *
     * Get a dashboard service by the service &#x60;name&#x60;.
     */
    @Test
    void getDashboardServiceByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // DashboardService response = api.getDashboardServiceByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get dashboard service by name
     *
     * Get a dashboard service by the service &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDashboardServiceByFQNTestQueryMap() {
        String name = null;
        DashboardServicesApi.GetDashboardServiceByFQNQueryParams queryParams = new DashboardServicesApi.GetDashboardServiceByFQNQueryParams()
            .fields(null)
            .include(null);
        // DashboardService response = api.getDashboardServiceByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a dashboard service by Id
     *
     * Get a dashboard service by &#x60;Id&#x60;.
     */
    @Test
    void getDashboardServiceByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // DashboardService response = api.getDashboardServiceByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a dashboard service by Id
     *
     * Get a dashboard service by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDashboardServiceByIDTestQueryMap() {
        UUID id = null;
        DashboardServicesApi.GetDashboardServiceByIDQueryParams queryParams = new DashboardServicesApi.GetDashboardServiceByIDQueryParams()
            .fields(null)
            .include(null);
        // DashboardService response = api.getDashboardServiceByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the dashboard service
     *
     * Get a version of the dashboard service by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificDashboardServiceVersionTest() {
        UUID id = null;
        String version = null;
        // DashboardService response = api.getSpecificDashboardServiceVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List dashboard service versions
     *
     * Get a list of all the versions of a dashboard service identified by &#x60;Id&#x60;
     */
    @Test
    void listAllDashboardServiceVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllDashboardServiceVersion(id);

        // TODO: test validations
    }

    
    /**
     * List dashboard services
     *
     * Get a list of dashboard services.
     */
    @Test
    void listDashboardsServiceTest() {
        String name = null;
        String fields = null;
        String domain = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // DashboardServiceList response = api.listDashboardsService(name, fields, domain, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List dashboard services
     *
     * Get a list of dashboard services.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listDashboardsServiceTestQueryMap() {
        DashboardServicesApi.ListDashboardsServiceQueryParams queryParams = new DashboardServicesApi.ListDashboardsServiceQueryParams()
            .name(null)
            .fields(null)
            .domain(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // DashboardServiceList response = api.listDashboardsService(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a dashboard service
     *
     * Update an existing dashboard service using JsonPatch.
     */
    @Test
    void patchDashboardServiceTest() {
        UUID id = null;
        Object body = null;
        // api.patchDashboardService(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted dashboard service
     *
     * Restore a soft deleted dashboard service.
     */
    @Test
    void restore24Test() {
        RestoreEntity restoreEntity = null;
        // DashboardService response = api.restore24(restoreEntity);

        // TODO: test validations
    }

    
}
