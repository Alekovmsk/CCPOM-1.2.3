package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateMetadataService;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.MetadataService;
import org.openmetadata.client.model.MetadataServiceList;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Table;
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
 * API tests for MetadataServicesApi
 */
class MetadataServicesApiTest {

    private MetadataServicesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(MetadataServicesApi.class);
    }

    
    /**
     * Add test connection result
     *
     * Add test connection result to the service.
     */
    @Test
    void addTestConnectionResult3Test() {
        UUID id = null;
        TestConnectionResult testConnectionResult = null;
        // DatabaseService response = api.addTestConnectionResult3(id, testConnectionResult);

        // TODO: test validations
    }

    
    /**
     * Create metadata service
     *
     * Create a new Metadata Service.
     */
    @Test
    void createMetadataServiceTest() {
        CreateMetadataService createMetadataService = null;
        // MetadataService response = api.createMetadataService(createMetadataService);

        // TODO: test validations
    }

    
    /**
     * Update metadata service
     *
     * Update an existing or create a new Metadata Service.
     */
    @Test
    void createOrUpdateMetadataServiceTest() {
        CreateMetadataService createMetadataService = null;
        // MetadataService response = api.createOrUpdateMetadataService(createMetadataService);

        // TODO: test validations
    }

    
    /**
     * Delete a metadata service by Id
     *
     * Delete a metadata services. If some service belong the service, it can&#39;t be deleted.
     */
    @Test
    void deleteMetadataServiceTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteMetadataService(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a metadata service by Id
     *
     * Delete a metadata services. If some service belong the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteMetadataServiceTestQueryMap() {
        UUID id = null;
        MetadataServicesApi.DeleteMetadataServiceQueryParams queryParams = new MetadataServicesApi.DeleteMetadataServiceQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteMetadataService(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a metadata service by name
     *
     * Delete a metadata services by &#x60;name&#x60;. If some service belong the service, it can&#39;t be deleted.
     */
    @Test
    void deleteMetadataServiceByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteMetadataServiceByName(name, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a metadata service by name
     *
     * Delete a metadata services by &#x60;name&#x60;. If some service belong the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteMetadataServiceByNameTestQueryMap() {
        String name = null;
        MetadataServicesApi.DeleteMetadataServiceByNameQueryParams queryParams = new MetadataServicesApi.DeleteMetadataServiceByNameQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteMetadataServiceByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a metadata service by name
     *
     * Get a Metadata Service by the service &#x60;name&#x60;.
     */
    @Test
    void getMetadataServiceByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // MetadataService response = api.getMetadataServiceByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a metadata service by name
     *
     * Get a Metadata Service by the service &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getMetadataServiceByFQNTestQueryMap() {
        String name = null;
        MetadataServicesApi.GetMetadataServiceByFQNQueryParams queryParams = new MetadataServicesApi.GetMetadataServiceByFQNQueryParams()
            .fields(null)
            .include(null);
        // MetadataService response = api.getMetadataServiceByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a metadata service by Id
     *
     * Get a Metadata Service by &#x60;Id&#x60;.
     */
    @Test
    void getMetadataServiceByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // MetadataService response = api.getMetadataServiceByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a metadata service by Id
     *
     * Get a Metadata Service by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getMetadataServiceByIDTestQueryMap() {
        UUID id = null;
        MetadataServicesApi.GetMetadataServiceByIDQueryParams queryParams = new MetadataServicesApi.GetMetadataServiceByIDQueryParams()
            .fields(null)
            .include(null);
        // MetadataService response = api.getMetadataServiceByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the metadata service
     *
     * Get a version of the Metadata Service by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificMetadataServiceVersionTest() {
        UUID id = null;
        String version = null;
        // MetadataService response = api.getSpecificMetadataServiceVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List metadata service versions
     *
     * Get a list of all the versions of a Metadata Service identified by &#x60;Id&#x60;
     */
    @Test
    void listAllMetadataServiceVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllMetadataServiceVersion(id);

        // TODO: test validations
    }

    
    /**
     * List metadata services
     *
     * Get a list of metadata services.
     */
    @Test
    void listMetadataServicesTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // MetadataServiceList response = api.listMetadataServices(fields, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List metadata services
     *
     * Get a list of metadata services.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listMetadataServicesTestQueryMap() {
        MetadataServicesApi.ListMetadataServicesQueryParams queryParams = new MetadataServicesApi.ListMetadataServicesQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // MetadataServiceList response = api.listMetadataServices(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a metadata service
     *
     * Update an existing Metadata service using JsonPatch.
     */
    @Test
    void patchMetadataServiceTest() {
        UUID id = null;
        Object body = null;
        // api.patchMetadataService(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted metadata service.
     *
     * Restore a soft deleted metadata service.
     */
    @Test
    void restore27Test() {
        RestoreEntity restoreEntity = null;
        // Table response = api.restore27(restoreEntity);

        // TODO: test validations
    }

    
}
