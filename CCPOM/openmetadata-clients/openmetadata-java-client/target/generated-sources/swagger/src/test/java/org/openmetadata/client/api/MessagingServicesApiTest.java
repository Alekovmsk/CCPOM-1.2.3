package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateMessagingService;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.MessagingService;
import org.openmetadata.client.model.MessagingServiceList;
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
 * API tests for MessagingServicesApi
 */
class MessagingServicesApiTest {

    private MessagingServicesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(MessagingServicesApi.class);
    }

    
    /**
     * Add test connection result
     *
     * Add test connection result to the service.
     */
    @Test
    void addTestConnectionResult2Test() {
        UUID id = null;
        TestConnectionResult testConnectionResult = null;
        // DatabaseService response = api.addTestConnectionResult2(id, testConnectionResult);

        // TODO: test validations
    }

    
    /**
     * Create a messaging service
     *
     * Create a new messaging service.
     */
    @Test
    void createMessagingServiceTest() {
        CreateMessagingService createMessagingService = null;
        // MessagingService response = api.createMessagingService(createMessagingService);

        // TODO: test validations
    }

    
    /**
     * Update messaging service
     *
     * Create a new messaging service or Update an existing messaging service identified by &#x60;id&#x60;.
     */
    @Test
    void createOrUpdateMessagingServiceTest() {
        CreateMessagingService createMessagingService = null;
        // MessagingService response = api.createOrUpdateMessagingService(createMessagingService);

        // TODO: test validations
    }

    
    /**
     * Delete a messaging service by Id
     *
     * Delete a messaging service. If topics belong the service, it can&#39;t be deleted.
     */
    @Test
    void deleteMessagingServiceTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteMessagingService(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a messaging service by Id
     *
     * Delete a messaging service. If topics belong the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteMessagingServiceTestQueryMap() {
        UUID id = null;
        MessagingServicesApi.DeleteMessagingServiceQueryParams queryParams = new MessagingServicesApi.DeleteMessagingServiceQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteMessagingService(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a messaging service by name
     *
     * Delete a messaging service by &#x60;name&#x60;. If topics belong the service, it can&#39;t be deleted.
     */
    @Test
    void deleteMessagingServiceByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteMessagingServiceByName(name, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a messaging service by name
     *
     * Delete a messaging service by &#x60;name&#x60;. If topics belong the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteMessagingServiceByNameTestQueryMap() {
        String name = null;
        MessagingServicesApi.DeleteMessagingServiceByNameQueryParams queryParams = new MessagingServicesApi.DeleteMessagingServiceByNameQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteMessagingServiceByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get messaging service by name
     *
     * Get a messaging service by the service &#x60;name&#x60;.
     */
    @Test
    void getMessagingServiceByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // MessagingService response = api.getMessagingServiceByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get messaging service by name
     *
     * Get a messaging service by the service &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getMessagingServiceByFQNTestQueryMap() {
        String name = null;
        MessagingServicesApi.GetMessagingServiceByFQNQueryParams queryParams = new MessagingServicesApi.GetMessagingServiceByFQNQueryParams()
            .fields(null)
            .include(null);
        // MessagingService response = api.getMessagingServiceByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a messaging service by Id
     *
     * Get a messaging service by &#x60;Id&#x60;.
     */
    @Test
    void getMessagingServiceByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // MessagingService response = api.getMessagingServiceByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a messaging service by Id
     *
     * Get a messaging service by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getMessagingServiceByIDTestQueryMap() {
        UUID id = null;
        MessagingServicesApi.GetMessagingServiceByIDQueryParams queryParams = new MessagingServicesApi.GetMessagingServiceByIDQueryParams()
            .fields(null)
            .include(null);
        // MessagingService response = api.getMessagingServiceByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the messaging service
     *
     * Get a version of the messaging service by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificMessagingServiceVersionTest() {
        UUID id = null;
        String version = null;
        // MessagingService response = api.getSpecificMessagingServiceVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List messaging service versions
     *
     * Get a list of all the versions of a messaging service identified by &#x60;id&#x60;
     */
    @Test
    void listAllMessagingServiceVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllMessagingServiceVersion(id);

        // TODO: test validations
    }

    
    /**
     * List messaging services
     *
     * Get a list of messaging services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listMessagingServiceTest() {
        String fields = null;
        String domain = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // MessagingServiceList response = api.listMessagingService(fields, domain, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List messaging services
     *
     * Get a list of messaging services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listMessagingServiceTestQueryMap() {
        MessagingServicesApi.ListMessagingServiceQueryParams queryParams = new MessagingServicesApi.ListMessagingServiceQueryParams()
            .fields(null)
            .domain(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // MessagingServiceList response = api.listMessagingService(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a messaging service
     *
     * Update an existing messaging service using JsonPatch.
     */
    @Test
    void patchMessagingServiceTest() {
        UUID id = null;
        Object body = null;
        // api.patchMessagingService(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted messaging service
     *
     * Restore a soft deleted messaging service.
     */
    @Test
    void restore26Test() {
        RestoreEntity restoreEntity = null;
        // MessagingService response = api.restore26(restoreEntity);

        // TODO: test validations
    }

    
}
