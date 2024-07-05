package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateMlModelService;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.MlModelService;
import org.openmetadata.client.model.MlModelServiceList;
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
 * API tests for MlModelServicesApi
 */
class MlModelServicesApiTest {

    private MlModelServicesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(MlModelServicesApi.class);
    }

    
    /**
     * Add test connection result
     *
     * Add test connection result to the service.
     */
    @Test
    void addTestConnectionResult4Test() {
        UUID id = null;
        TestConnectionResult testConnectionResult = null;
        // DatabaseService response = api.addTestConnectionResult4(id, testConnectionResult);

        // TODO: test validations
    }

    
    /**
     * Create an ML model service
     *
     * Create a new mlModel service.
     */
    @Test
    void createMlModelServiceTest() {
        CreateMlModelService createMlModelService = null;
        // MlModelService response = api.createMlModelService(createMlModelService);

        // TODO: test validations
    }

    
    /**
     * Update ML model service
     *
     * Create a new mlModel service or update an existing mlModel service identified by &#x60;Id&#x60;.
     */
    @Test
    void createOrUpdateMlModelServiceTest() {
        CreateMlModelService createMlModelService = null;
        // MlModelService response = api.createOrUpdateMlModelService(createMlModelService);

        // TODO: test validations
    }

    
    /**
     * Delete an ML model service by Id
     *
     * Delete a mlModel services. If mlModels (and tasks) belong to the service, it can&#39;t be deleted.
     */
    @Test
    void deleteMlModelServiceTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteMlModelService(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete an ML model service by Id
     *
     * Delete a mlModel services. If mlModels (and tasks) belong to the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteMlModelServiceTestQueryMap() {
        UUID id = null;
        MlModelServicesApi.DeleteMlModelServiceQueryParams queryParams = new MlModelServicesApi.DeleteMlModelServiceQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteMlModelService(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete an ML model service by name
     *
     * Delete a mlModel services by &#x60;name&#x60;. If mlModels (and tasks) belong to the service, it can&#39;t be deleted.
     */
    @Test
    void deleteMlModelServiceByNameTest() {
        String name = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteMlModelServiceByName(name, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete an ML model service by name
     *
     * Delete a mlModel services by &#x60;name&#x60;. If mlModels (and tasks) belong to the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteMlModelServiceByNameTestQueryMap() {
        String name = null;
        MlModelServicesApi.DeleteMlModelServiceByNameQueryParams queryParams = new MlModelServicesApi.DeleteMlModelServiceByNameQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteMlModelServiceByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get an ML model service by name
     *
     * Get a mlModel service by the service &#x60;name&#x60;.
     */
    @Test
    void getMlModelServiceByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // MlModelService response = api.getMlModelServiceByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get an ML model service by name
     *
     * Get a mlModel service by the service &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getMlModelServiceByFQNTestQueryMap() {
        String name = null;
        MlModelServicesApi.GetMlModelServiceByFQNQueryParams queryParams = new MlModelServicesApi.GetMlModelServiceByFQNQueryParams()
            .fields(null)
            .include(null);
        // MlModelService response = api.getMlModelServiceByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get an ML model service by Id
     *
     * Get a mlModel service by &#x60;Id&#x60;.
     */
    @Test
    void getMlModelServiceByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // MlModelService response = api.getMlModelServiceByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get an ML model service by Id
     *
     * Get a mlModel service by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getMlModelServiceByIDTestQueryMap() {
        UUID id = null;
        MlModelServicesApi.GetMlModelServiceByIDQueryParams queryParams = new MlModelServicesApi.GetMlModelServiceByIDQueryParams()
            .fields(null)
            .include(null);
        // MlModelService response = api.getMlModelServiceByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the ML model service
     *
     * Get a version of the mlModel service by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificMlModelServiceTest() {
        UUID id = null;
        String version = null;
        // MlModelService response = api.getSpecificMlModelService(id, version);

        // TODO: test validations
    }

    
    /**
     * List ML model service versions
     *
     * Get a list of all the versions of a mlModel service identified by &#x60;Id&#x60;
     */
    @Test
    void listAllMlModelServiceVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllMlModelServiceVersion(id);

        // TODO: test validations
    }

    
    /**
     * List ML model services
     *
     * Get a list of mlModel services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listMlModelServiceTest() {
        String fields = null;
        String domain = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // MlModelServiceList response = api.listMlModelService(fields, domain, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List ML model services
     *
     * Get a list of mlModel services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listMlModelServiceTestQueryMap() {
        MlModelServicesApi.ListMlModelServiceQueryParams queryParams = new MlModelServicesApi.ListMlModelServiceQueryParams()
            .fields(null)
            .domain(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // MlModelServiceList response = api.listMlModelService(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update an ML model service
     *
     * Update an existing MlModelService service using JsonPatch.
     */
    @Test
    void patchMlModelServiceTest() {
        UUID id = null;
        Object body = null;
        // api.patchMlModelService(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted ML model service
     *
     * Restore a soft deleted Ml model service.
     */
    @Test
    void restore28Test() {
        RestoreEntity restoreEntity = null;
        // MlModelService response = api.restore28(restoreEntity);

        // TODO: test validations
    }

    
}
