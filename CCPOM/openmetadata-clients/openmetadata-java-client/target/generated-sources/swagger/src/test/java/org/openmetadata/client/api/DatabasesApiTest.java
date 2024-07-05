package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateDatabase;
import org.openmetadata.client.model.Database;
import org.openmetadata.client.model.DatabaseList;
import org.openmetadata.client.model.DatabaseProfilerConfig;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Table;
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
 * API tests for DatabasesApi
 */
class DatabasesApiTest {

    private DatabasesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(DatabasesApi.class);
    }

    
    /**
     * Add database profile config
     *
     * Add database profile config to the table.
     */
    @Test
    void addDataProfilerConfigTest() {
        UUID id = null;
        DatabaseProfilerConfig databaseProfilerConfig = null;
        // Table response = api.addDataProfilerConfig(id, databaseProfilerConfig);

        // TODO: test validations
    }

    
    /**
     * Create a database
     *
     * Create a database under an existing &#x60;service&#x60;.
     */
    @Test
    void createDatabaseTest() {
        CreateDatabase createDatabase = null;
        // Database response = api.createDatabase(createDatabase);

        // TODO: test validations
    }

    
    /**
     * Create or update database
     *
     * Create a database, if it does not exist or update an existing database.
     */
    @Test
    void createOrUpdateDatabaseTest() {
        CreateDatabase createDatabase = null;
        // Database response = api.createOrUpdateDatabase(createDatabase);

        // TODO: test validations
    }

    
    /**
     * Delete database profiler config
     *
     * delete database profile config to the database.
     */
    @Test
    void deleteDataProfilerConfigTest() {
        UUID id = null;
        // Table response = api.deleteDataProfilerConfig(id);

        // TODO: test validations
    }

    
    /**
     * Delete a database by Id
     *
     * Delete a database by &#x60;Id&#x60;. Database can only be deleted if it has no tables.
     */
    @Test
    void deleteDatabaseTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteDatabase(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a database by Id
     *
     * Delete a database by &#x60;Id&#x60;. Database can only be deleted if it has no tables.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDatabaseTestQueryMap() {
        UUID id = null;
        DatabasesApi.DeleteDatabaseQueryParams queryParams = new DatabasesApi.DeleteDatabaseQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteDatabase(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a database by fully qualified name
     *
     * Delete a database by &#x60;fullyQualifiedName&#x60;. Databases can only be deleted if it has no tables.
     */
    @Test
    void deleteDatabaseByFQNTest() {
        String fqn = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteDatabaseByFQN(fqn, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a database by fully qualified name
     *
     * Delete a database by &#x60;fullyQualifiedName&#x60;. Databases can only be deleted if it has no tables.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDatabaseByFQNTestQueryMap() {
        String fqn = null;
        DatabasesApi.DeleteDatabaseByFQNQueryParams queryParams = new DatabasesApi.DeleteDatabaseByFQNQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteDatabaseByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get database profile config
     *
     * Get database profile config to the table.
     */
    @Test
    void getDataProfilerConfigTest() {
        UUID id = null;
        // Table response = api.getDataProfilerConfig(id);

        // TODO: test validations
    }

    
    /**
     * Get a database by fully qualified name
     *
     * Get a database by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getDatabaseByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // Database response = api.getDatabaseByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a database by fully qualified name
     *
     * Get a database by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDatabaseByFQNTestQueryMap() {
        String fqn = null;
        DatabasesApi.GetDatabaseByFQNQueryParams queryParams = new DatabasesApi.GetDatabaseByFQNQueryParams()
            .fields(null)
            .include(null);
        // Database response = api.getDatabaseByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a database by Id
     *
     * Get a database by &#x60;Id&#x60;.
     */
    @Test
    void getDatabaseByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Database response = api.getDatabaseByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a database by Id
     *
     * Get a database by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDatabaseByIDTestQueryMap() {
        UUID id = null;
        DatabasesApi.GetDatabaseByIDQueryParams queryParams = new DatabasesApi.GetDatabaseByIDQueryParams()
            .fields(null)
            .include(null);
        // Database response = api.getDatabaseByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the database
     *
     * Get a version of the database by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificDatabaseVersionTest() {
        UUID id = null;
        String version = null;
        // Database response = api.getSpecificDatabaseVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List database versions
     *
     * Get a list of all the versions of a database identified by &#x60;Id&#x60;
     */
    @Test
    void listAllDatabaseVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllDatabaseVersion(id);

        // TODO: test validations
    }

    
    /**
     * List databases
     *
     * Get a list of databases, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listDatabasesTest() {
        String fields = null;
        String service = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // DatabaseList response = api.listDatabases(fields, service, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List databases
     *
     * Get a list of databases, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listDatabasesTestQueryMap() {
        DatabasesApi.ListDatabasesQueryParams queryParams = new DatabasesApi.ListDatabasesQueryParams()
            .fields(null)
            .service(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // DatabaseList response = api.listDatabases(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a database
     *
     * Update an existing database using JsonPatch.
     */
    @Test
    void patchDatabaseTest() {
        UUID id = null;
        Object body = null;
        // api.patchDatabase(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted Database.
     *
     * Restore a soft deleted Database.
     */
    @Test
    void restore7Test() {
        RestoreEntity restoreEntity = null;
        // Database response = api.restore7(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity4Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity4(id, voteRequest);

        // TODO: test validations
    }

    
}
