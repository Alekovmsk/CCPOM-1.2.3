package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateDashboard;
import org.openmetadata.client.model.Dashboard;
import org.openmetadata.client.model.DashboardList;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DashboardsApi
 */
class DashboardsApiTest {

    private DashboardsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(DashboardsApi.class);
    }

    
    /**
     * Add a follower
     *
     * Add a user identified by &#x60;userId&#x60; as follower of this dashboard
     */
    @Test
    void addFollowerToDashboardTest() {
        UUID id = null;
        UUID body = null;
        // api.addFollowerToDashboard(id, body);

        // TODO: test validations
    }

    
    /**
     * Create a dashboard
     *
     * Create a new dashboard.
     */
    @Test
    void createDashboardTest() {
        CreateDashboard createDashboard = null;
        // Dashboard response = api.createDashboard(createDashboard);

        // TODO: test validations
    }

    
    /**
     * Create or update a dashboard
     *
     * Create a new dashboard, if it does not exist or update an existing dashboard.
     */
    @Test
    void createOrUpdateDashboardTest() {
        CreateDashboard createDashboard = null;
        // Dashboard response = api.createOrUpdateDashboard(createDashboard);

        // TODO: test validations
    }

    
    /**
     * Delete a dashboard by Id
     *
     * Delete a dashboard by &#x60;Id&#x60;.
     */
    @Test
    void deleteDashboardTest() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.deleteDashboard(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a dashboard by Id
     *
     * Delete a dashboard by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDashboardTestQueryMap() {
        UUID id = null;
        DashboardsApi.DeleteDashboardQueryParams queryParams = new DashboardsApi.DeleteDashboardQueryParams()
            .hardDelete(null);
        // api.deleteDashboard(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a dashboard by fully qualified name
     *
     * Delete a dashboard by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteDashboardByFQNTest() {
        String fqn = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteDashboardByFQN(fqn, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a dashboard by fully qualified name
     *
     * Delete a dashboard by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDashboardByFQNTestQueryMap() {
        String fqn = null;
        DashboardsApi.DeleteDashboardByFQNQueryParams queryParams = new DashboardsApi.DeleteDashboardByFQNQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteDashboardByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a dashboard by fully qualified name
     *
     * Get a dashboard by fully qualified name.
     */
    @Test
    void getDashboardByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // Dashboard response = api.getDashboardByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a dashboard by fully qualified name
     *
     * Get a dashboard by fully qualified name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDashboardByFQNTestQueryMap() {
        String fqn = null;
        DashboardsApi.GetDashboardByFQNQueryParams queryParams = new DashboardsApi.GetDashboardByFQNQueryParams()
            .fields(null)
            .include(null);
        // Dashboard response = api.getDashboardByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a dashboard by Id
     *
     * Get a dashboard by &#x60;Id&#x60;.
     */
    @Test
    void getDashboardByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Dashboard response = api.getDashboardByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a dashboard by Id
     *
     * Get a dashboard by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDashboardByIDTestQueryMap() {
        UUID id = null;
        DashboardsApi.GetDashboardByIDQueryParams queryParams = new DashboardsApi.GetDashboardByIDQueryParams()
            .fields(null)
            .include(null);
        // Dashboard response = api.getDashboardByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the dashboard
     *
     * Get a version of the dashboard by given &#x60;id&#x60;
     */
    @Test
    void getSpecificDashboardVersionTest() {
        UUID id = null;
        String version = null;
        // Dashboard response = api.getSpecificDashboardVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List dashboard versions
     *
     * Get a list of all the versions of a dashboard identified by &#x60;Id&#x60;
     */
    @Test
    void listAllDashboardVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllDashboardVersion(id);

        // TODO: test validations
    }

    
    /**
     * List dashboards
     *
     * Get a list of dashboards, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listDashboardsTest() {
        String fields = null;
        String service = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // DashboardList response = api.listDashboards(fields, service, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List dashboards
     *
     * Get a list of dashboards, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listDashboardsTestQueryMap() {
        DashboardsApi.ListDashboardsQueryParams queryParams = new DashboardsApi.ListDashboardsQueryParams()
            .fields(null)
            .service(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // DashboardList response = api.listDashboards(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a dashboard
     *
     * Update an existing dashboard using JsonPatch.
     */
    @Test
    void patchDashboardTest() {
        UUID id = null;
        Object body = null;
        // api.patchDashboard(id, body);

        // TODO: test validations
    }

    
    /**
     * Remove a follower
     *
     * Remove the user identified &#x60;userId&#x60; as a follower of the dashboard.
     */
    @Test
    void removeFollowerFromDashboardTest() {
        UUID id = null;
        UUID userId = null;
        // api.removeFollowerFromDashboard(id, userId);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted dashboard
     *
     * Restore a soft deleted dashboard.
     */
    @Test
    void restore6Test() {
        RestoreEntity restoreEntity = null;
        // Dashboard response = api.restore6(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity3Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity3(id, voteRequest);

        // TODO: test validations
    }

    
}
