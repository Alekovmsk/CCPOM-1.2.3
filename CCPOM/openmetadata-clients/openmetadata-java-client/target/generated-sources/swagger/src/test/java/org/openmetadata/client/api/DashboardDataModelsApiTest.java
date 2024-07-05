package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateDashboardDataModel;
import org.openmetadata.client.model.DashboardDataModel;
import org.openmetadata.client.model.DashboardDataModelList;
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
 * API tests for DashboardDataModelsApi
 */
class DashboardDataModelsApiTest {

    private DashboardDataModelsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(DashboardDataModelsApi.class);
    }

    
    /**
     * Add a follower
     *
     * Add a user identified by &#x60;userId&#x60; as followed of this data model
     */
    @Test
    void addFollowerToDataModelTest() {
        UUID id = null;
        UUID body = null;
        // api.addFollowerToDataModel(id, body);

        // TODO: test validations
    }

    
    /**
     * Create a dashboard datamodel
     *
     * Create a dashboard datamodel under an existing &#x60;service&#x60;.
     */
    @Test
    void createDataModelTest() {
        CreateDashboardDataModel createDashboardDataModel = null;
        // DashboardDataModel response = api.createDataModel(createDashboardDataModel);

        // TODO: test validations
    }

    
    /**
     * Create or update dashboard datamodel
     *
     * Create a dashboard datamodel, it it does not exist or update an existing dashboard datamodel.
     */
    @Test
    void createOrUpdateDataModelTest() {
        CreateDashboardDataModel createDashboardDataModel = null;
        // DashboardDataModel response = api.createOrUpdateDataModel(createDashboardDataModel);

        // TODO: test validations
    }

    
    /**
     * Delete a data model by &#x60;id&#x60;.
     *
     * Delete a dashboard datamodel by &#x60;id&#x60;.
     */
    @Test
    void deleteDataModelTest() {
        UUID id = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteDataModel(id, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a data model by &#x60;id&#x60;.
     *
     * Delete a dashboard datamodel by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDataModelTestQueryMap() {
        UUID id = null;
        DashboardDataModelsApi.DeleteDataModelQueryParams queryParams = new DashboardDataModelsApi.DeleteDataModelQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteDataModel(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a data model by fully qualified name.
     *
     * Delete a data model by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteDataModelByFQNTest() {
        String fqn = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteDataModelByFQN(fqn, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a data model by fully qualified name.
     *
     * Delete a data model by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDataModelByFQNTestQueryMap() {
        String fqn = null;
        DashboardDataModelsApi.DeleteDataModelByFQNQueryParams queryParams = new DashboardDataModelsApi.DeleteDataModelByFQNQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteDataModelByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Remove a follower
     *
     * Remove the user identified &#x60;userId&#x60; as a follower of the data model.
     */
    @Test
    void deleteFollowerFromDataModelTest() {
        UUID id = null;
        UUID userId = null;
        // api.deleteFollowerFromDataModel(id, userId);

        // TODO: test validations
    }

    
    /**
     * Get a dashboard datamodel by fully qualified name
     *
     * Get a dashboard datamodel by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getDataModelByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // DashboardDataModel response = api.getDataModelByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a dashboard datamodel by fully qualified name
     *
     * Get a dashboard datamodel by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDataModelByFQNTestQueryMap() {
        String fqn = null;
        DashboardDataModelsApi.GetDataModelByFQNQueryParams queryParams = new DashboardDataModelsApi.GetDataModelByFQNQueryParams()
            .fields(null)
            .include(null);
        // DashboardDataModel response = api.getDataModelByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a dashboard datamodel by Id
     *
     * Get a dashboard datamodel by &#x60;id&#x60;.
     */
    @Test
    void getDataModelByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // DashboardDataModel response = api.getDataModelByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a dashboard datamodel by Id
     *
     * Get a dashboard datamodel by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDataModelByIDTestQueryMap() {
        UUID id = null;
        DashboardDataModelsApi.GetDataModelByIDQueryParams queryParams = new DashboardDataModelsApi.GetDataModelByIDQueryParams()
            .fields(null)
            .include(null);
        // DashboardDataModel response = api.getDataModelByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the dashboard datamodel
     *
     * Get a version of the dashboard datamodel by given &#x60;id&#x60;
     */
    @Test
    void getSpecificDataModelVersionTest() {
        UUID id = null;
        String version = null;
        // DashboardDataModel response = api.getSpecificDataModelVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List dashboard datamodel versions
     *
     * Get a list of all the versions of a dashboard datamodel identified by &#x60;id&#x60;
     */
    @Test
    void listAllDataModelVersionsTest() {
        UUID id = null;
        // EntityHistory response = api.listAllDataModelVersions(id);

        // TODO: test validations
    }

    
    /**
     * List Dashboard Data Models
     *
     * Get a list of dashboard datamodels, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listDashboardDataModelsTest() {
        String fields = null;
        String service = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // DashboardDataModelList response = api.listDashboardDataModels(fields, service, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List Dashboard Data Models
     *
     * Get a list of dashboard datamodels, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listDashboardDataModelsTestQueryMap() {
        DashboardDataModelsApi.ListDashboardDataModelsQueryParams queryParams = new DashboardDataModelsApi.ListDashboardDataModelsQueryParams()
            .fields(null)
            .service(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // DashboardDataModelList response = api.listDashboardDataModels(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a dashboard datamodel
     *
     * Update an existing dashboard datamodel using JsonPatch.
     */
    @Test
    void patchDataModelTest() {
        UUID id = null;
        Object body = null;
        // api.patchDataModel(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted data model.
     *
     * Restore a soft deleted data model.
     */
    @Test
    void restore11Test() {
        RestoreEntity restoreEntity = null;
        // DashboardDataModel response = api.restore11(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity8Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity8(id, voteRequest);

        // TODO: test validations
    }

    
}
