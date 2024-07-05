package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateStorageService;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.StorageService;
import org.openmetadata.client.model.StorageServiceList;
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
 * API tests for ObjectStoreServicesApi
 */
class ObjectStoreServicesApiTest {

    private ObjectStoreServicesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(ObjectStoreServicesApi.class);
    }

    
    /**
     * Add test connection result
     *
     * Add test connection result to the service.
     */
    @Test
    void addTestConnectionResult7Test() {
        UUID id = null;
        TestConnectionResult testConnectionResult = null;
        // DatabaseService response = api.addTestConnectionResult7(id, testConnectionResult);

        // TODO: test validations
    }

    
    /**
     * Update storage service
     *
     * Update an existing or create a new storage service.
     */
    @Test
    void createOrUpdateStorageServiceTest() {
        CreateStorageService createStorageService = null;
        // StorageService response = api.createOrUpdateStorageService(createStorageService);

        // TODO: test validations
    }

    
    /**
     * Create storage service
     *
     * Create a new storage service.
     */
    @Test
    void createStorageServiceTest() {
        CreateStorageService createStorageService = null;
        // StorageService response = api.createStorageService(createStorageService);

        // TODO: test validations
    }

    
    /**
     * Delete an storage service
     *
     * Delete an storage services. If containers belong the service, it can&#39;t be deleted.
     */
    @Test
    void deleteStorageServiceTest() {
        String id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteStorageService(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete an storage service
     *
     * Delete an storage services. If containers belong the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteStorageServiceTestQueryMap() {
        String id = null;
        ObjectStoreServicesApi.DeleteStorageServiceQueryParams queryParams = new ObjectStoreServicesApi.DeleteStorageServiceQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteStorageService(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete an StorageService by fully qualified name
     *
     * Delete an StorageService by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteStorageServiceByFQNTest() {
        String fqn = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteStorageServiceByFQN(fqn, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete an StorageService by fully qualified name
     *
     * Delete an StorageService by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteStorageServiceByFQNTestQueryMap() {
        String fqn = null;
        ObjectStoreServicesApi.DeleteStorageServiceByFQNQueryParams queryParams = new ObjectStoreServicesApi.DeleteStorageServiceByFQNQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteStorageServiceByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the storage service
     *
     * Get a version of the storage service by given &#x60;id&#x60;
     */
    @Test
    void getSpecificStorageServiceVersionTest() {
        String id = null;
        String version = null;
        // StorageService response = api.getSpecificStorageServiceVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get storage service by name
     *
     * Get a storage service by the service &#x60;name&#x60;.
     */
    @Test
    void getStorageServiceByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // StorageService response = api.getStorageServiceByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get storage service by name
     *
     * Get a storage service by the service &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getStorageServiceByFQNTestQueryMap() {
        String name = null;
        ObjectStoreServicesApi.GetStorageServiceByFQNQueryParams queryParams = new ObjectStoreServicesApi.GetStorageServiceByFQNQueryParams()
            .fields(null)
            .include(null);
        // StorageService response = api.getStorageServiceByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get an storage service
     *
     * Get an storage service by &#x60;id&#x60;.
     */
    @Test
    void getStorageServiceByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // StorageService response = api.getStorageServiceByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get an storage service
     *
     * Get an storage service by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getStorageServiceByIDTestQueryMap() {
        UUID id = null;
        ObjectStoreServicesApi.GetStorageServiceByIDQueryParams queryParams = new ObjectStoreServicesApi.GetStorageServiceByIDQueryParams()
            .fields(null)
            .include(null);
        // StorageService response = api.getStorageServiceByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * List storage service versions
     *
     * Get a list of all the versions of an storage service identified by &#x60;id&#x60;
     */
    @Test
    void listAllStorageServiceVersionTest() {
        String id = null;
        // EntityHistory response = api.listAllStorageServiceVersion(id);

        // TODO: test validations
    }

    
    /**
     * List storage services
     *
     * Get a list of storage services.
     */
    @Test
    void listStorageServicesTest() {
        String fields = null;
        String domain = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // StorageServiceList response = api.listStorageServices(fields, domain, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List storage services
     *
     * Get a list of storage services.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listStorageServicesTestQueryMap() {
        ObjectStoreServicesApi.ListStorageServicesQueryParams queryParams = new ObjectStoreServicesApi.ListStorageServicesQueryParams()
            .fields(null)
            .domain(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // StorageServiceList response = api.listStorageServices(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update an storage service
     *
     * Update an existing storage service using JsonPatch.
     */
    @Test
    void patchStorageServiceTest() {
        UUID id = null;
        Object body = null;
        // api.patchStorageService(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted StorageService.
     *
     * Restore a soft deleted StorageService.
     */
    @Test
    void restore31Test() {
        RestoreEntity restoreEntity = null;
        // StorageService response = api.restore31(restoreEntity);

        // TODO: test validations
    }

    
}
