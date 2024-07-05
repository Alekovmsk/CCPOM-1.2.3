package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreatePipelineService;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.PipelineService;
import org.openmetadata.client.model.PipelineServiceList;
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
 * API tests for PipelineServicesApi
 */
class PipelineServicesApiTest {

    private PipelineServicesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PipelineServicesApi.class);
    }

    
    /**
     * Add test connection result
     *
     * Add test connection result to the service.
     */
    @Test
    void addTestConnectionResult5Test() {
        UUID id = null;
        TestConnectionResult testConnectionResult = null;
        // DatabaseService response = api.addTestConnectionResult5(id, testConnectionResult);

        // TODO: test validations
    }

    
    /**
     * Update pipeline service
     *
     * Create a new pipeline service or update an existing pipeline service identified by &#x60;id&#x60;.
     */
    @Test
    void createOrUpdatePipelineServiceTest() {
        CreatePipelineService createPipelineService = null;
        // PipelineService response = api.createOrUpdatePipelineService(createPipelineService);

        // TODO: test validations
    }

    
    /**
     * Create a pipeline service
     *
     * Create a new pipeline service.
     */
    @Test
    void createPipelineServiceTest() {
        CreatePipelineService createPipelineService = null;
        // PipelineService response = api.createPipelineService(createPipelineService);

        // TODO: test validations
    }

    
    /**
     * Delete a pipeline service by Id
     *
     * Delete a pipeline services. If pipelines (and tasks) belong to the service, it can&#39;t be deleted.
     */
    @Test
    void deletePipelineServiceTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deletePipelineService(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a pipeline service by Id
     *
     * Delete a pipeline services. If pipelines (and tasks) belong to the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deletePipelineServiceTestQueryMap() {
        UUID id = null;
        PipelineServicesApi.DeletePipelineServiceQueryParams queryParams = new PipelineServicesApi.DeletePipelineServiceQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deletePipelineService(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a pipeline service by fully qualified name
     *
     * Delete a pipeline services by &#x60;fullyQualifiedName&#x60;. If pipelines (and tasks) belong to the service, it can&#39;t be deleted.
     */
    @Test
    void deletePipelineServiceByNameTest() {
        String fqn = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deletePipelineServiceByName(fqn, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a pipeline service by fully qualified name
     *
     * Delete a pipeline services by &#x60;fullyQualifiedName&#x60;. If pipelines (and tasks) belong to the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deletePipelineServiceByNameTestQueryMap() {
        String fqn = null;
        PipelineServicesApi.DeletePipelineServiceByNameQueryParams queryParams = new PipelineServicesApi.DeletePipelineServiceByNameQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deletePipelineServiceByName(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get pipeline service by fully qualified name
     *
     * Get a pipeline service by the service &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getPipelineServiceByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // PipelineService response = api.getPipelineServiceByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get pipeline service by fully qualified name
     *
     * Get a pipeline service by the service &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getPipelineServiceByFQNTestQueryMap() {
        String fqn = null;
        PipelineServicesApi.GetPipelineServiceByFQNQueryParams queryParams = new PipelineServicesApi.GetPipelineServiceByFQNQueryParams()
            .fields(null)
            .include(null);
        // PipelineService response = api.getPipelineServiceByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a pipeline service by Id
     *
     * Get a pipeline service by &#x60;Id&#x60;.
     */
    @Test
    void getPipelineServiceByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // PipelineService response = api.getPipelineServiceByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a pipeline service by Id
     *
     * Get a pipeline service by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getPipelineServiceByIDTestQueryMap() {
        UUID id = null;
        PipelineServicesApi.GetPipelineServiceByIDQueryParams queryParams = new PipelineServicesApi.GetPipelineServiceByIDQueryParams()
            .fields(null)
            .include(null);
        // PipelineService response = api.getPipelineServiceByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the pipeline service
     *
     * Get a version of the pipeline service by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificPipelineServiceTest() {
        UUID id = null;
        String version = null;
        // PipelineService response = api.getSpecificPipelineService(id, version);

        // TODO: test validations
    }

    
    /**
     * List pipeline service versions
     *
     * Get a list of all the versions of a pipeline service identified by &#x60;Id&#x60;
     */
    @Test
    void listAllPipelineServiceVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllPipelineServiceVersion(id);

        // TODO: test validations
    }

    
    /**
     * List pipeline services
     *
     * Get a list of pipeline services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listPipelineServiceTest() {
        String fields = null;
        String domain = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // PipelineServiceList response = api.listPipelineService(fields, domain, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List pipeline services
     *
     * Get a list of pipeline services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listPipelineServiceTestQueryMap() {
        PipelineServicesApi.ListPipelineServiceQueryParams queryParams = new PipelineServicesApi.ListPipelineServiceQueryParams()
            .fields(null)
            .domain(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // PipelineServiceList response = api.listPipelineService(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a pipeline service
     *
     * Update an existing pipeline service using JsonPatch.
     */
    @Test
    void patchPipelineServiceTest() {
        UUID id = null;
        Object body = null;
        // api.patchPipelineService(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted pipeline service.
     *
     * Restore a soft deleted pipeline service.
     */
    @Test
    void restore29Test() {
        RestoreEntity restoreEntity = null;
        // PipelineService response = api.restore29(restoreEntity);

        // TODO: test validations
    }

    
}
