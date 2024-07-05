package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateDatabaseService;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.DatabaseServiceList;
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
 * API tests for DatabaseServicesApi
 */
class DatabaseServicesApiTest {

    private DatabaseServicesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(DatabaseServicesApi.class);
    }

    
    /**
     * Add test connection result
     *
     * Add test connection result to the service.
     */
    @Test
    void addTestConnectionResult1Test() {
        UUID id = null;
        TestConnectionResult testConnectionResult = null;
        // DatabaseService response = api.addTestConnectionResult1(id, testConnectionResult);

        // TODO: test validations
    }

    
    /**
     * Create database service
     *
     * Create a new database service.
     */
    @Test
    void createDatabaseServiceTest() {
        CreateDatabaseService createDatabaseService = null;
        // DatabaseService response = api.createDatabaseService(createDatabaseService);

        // TODO: test validations
    }

    
    /**
     * Update database service
     *
     * Update an existing or create a new database service.
     */
    @Test
    void createOrUpdateDatabaseServiceTest() {
        CreateDatabaseService createDatabaseService = null;
        // DatabaseService response = api.createOrUpdateDatabaseService(createDatabaseService);

        // TODO: test validations
    }

    
    /**
     * Delete a database service by Id
     *
     * Delete a database services. If databases (and tables) belong the service, it can&#39;t be deleted.
     */
    @Test
    void deleteDatabaseServiceTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteDatabaseService(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a database service by Id
     *
     * Delete a database services. If databases (and tables) belong the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDatabaseServiceTestQueryMap() {
        UUID id = null;
        DatabaseServicesApi.DeleteDatabaseServiceQueryParams queryParams = new DatabaseServicesApi.DeleteDatabaseServiceQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteDatabaseService(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a database service by name
     *
     * Delete a database services by &#x60;name&#x60;. If databases (and tables) belong the service, it can&#39;t be deleted.
     */
    @Test
    void deleteDatabaseServiceByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteDatabaseServiceByName(name, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a database service by name
     *
     * Delete a database services by &#x60;name&#x60;. If databases (and tables) belong the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDatabaseServiceByNameTestQueryMap() {
        String name = null;
        DatabaseServicesApi.DeleteDatabaseServiceByNameQueryParams queryParams = new DatabaseServicesApi.DeleteDatabaseServiceByNameQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteDatabaseServiceByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get database service by name
     *
     * Get a database service by the service &#x60;name&#x60;.
     */
    @Test
    void getDatabaseServiceByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // DatabaseService response = api.getDatabaseServiceByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get database service by name
     *
     * Get a database service by the service &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDatabaseServiceByFQNTestQueryMap() {
        String name = null;
        DatabaseServicesApi.GetDatabaseServiceByFQNQueryParams queryParams = new DatabaseServicesApi.GetDatabaseServiceByFQNQueryParams()
            .fields(null)
            .include(null);
        // DatabaseService response = api.getDatabaseServiceByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a database service
     *
     * Get a database service by &#x60;Id&#x60;.
     */
    @Test
    void getDatabaseServiceByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // DatabaseService response = api.getDatabaseServiceByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a database service
     *
     * Get a database service by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDatabaseServiceByIDTestQueryMap() {
        UUID id = null;
        DatabaseServicesApi.GetDatabaseServiceByIDQueryParams queryParams = new DatabaseServicesApi.GetDatabaseServiceByIDQueryParams()
            .fields(null)
            .include(null);
        // DatabaseService response = api.getDatabaseServiceByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the database service
     *
     * Get a version of the database service by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificDatabaseServiceVersionTest() {
        UUID id = null;
        String version = null;
        // DatabaseService response = api.getSpecificDatabaseServiceVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List database service versions
     *
     * Get a list of all the versions of a database service identified by &#x60;Id&#x60;
     */
    @Test
    void listAllDatabaseServiceVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllDatabaseServiceVersion(id);

        // TODO: test validations
    }

    
    /**
     * List database services
     *
     * Get a list of database services.
     */
    @Test
    void listDatabaseServicesTest() {
        String fields = null;
        String domain = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // DatabaseServiceList response = api.listDatabaseServices(fields, domain, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List database services
     *
     * Get a list of database services.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listDatabaseServicesTestQueryMap() {
        DatabaseServicesApi.ListDatabaseServicesQueryParams queryParams = new DatabaseServicesApi.ListDatabaseServicesQueryParams()
            .fields(null)
            .domain(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // DatabaseServiceList response = api.listDatabaseServices(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a database service
     *
     * Update an existing database service using JsonPatch.
     */
    @Test
    void patchDatabaseServiceTest() {
        UUID id = null;
        Object body = null;
        // api.patchDatabaseService(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted database service
     *
     * Restore a soft deleted database service.
     */
    @Test
    void restore25Test() {
        RestoreEntity restoreEntity = null;
        // DatabaseService response = api.restore25(restoreEntity);

        // TODO: test validations
    }

    
}
