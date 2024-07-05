package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateDatabaseSchema;
import org.openmetadata.client.model.DatabaseSchema;
import org.openmetadata.client.model.DatabaseSchemaList;
import org.openmetadata.client.model.DatabaseSchemaProfilerConfig;
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
 * API tests for DatabaseSchemasApi
 */
class DatabaseSchemasApiTest {

    private DatabaseSchemasApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(DatabaseSchemasApi.class);
    }

    
    /**
     * Add databaseSchema profile config
     *
     * Add databaseSchema profile config to the table.
     */
    @Test
    void addDataProfilerConfig1Test() {
        UUID id = null;
        DatabaseSchemaProfilerConfig databaseSchemaProfilerConfig = null;
        // DatabaseSchema response = api.addDataProfilerConfig1(id, databaseSchemaProfilerConfig);

        // TODO: test validations
    }

    
    /**
     * Create a schema
     *
     * Create a schema under an existing &#x60;service&#x60;.
     */
    @Test
    void createDBSchemaTest() {
        CreateDatabaseSchema createDatabaseSchema = null;
        // DatabaseSchema response = api.createDBSchema(createDatabaseSchema);

        // TODO: test validations
    }

    
    /**
     * Create or update schema
     *
     * Create a database schema, if it does not exist or update an existing database schema.
     */
    @Test
    void createOrUpdateDBSchemaTest() {
        CreateDatabaseSchema createDatabaseSchema = null;
        // DatabaseSchema response = api.createOrUpdateDBSchema(createDatabaseSchema);

        // TODO: test validations
    }

    
    /**
     * Delete a schema by Id
     *
     * Delete a schema by &#x60;Id&#x60;. Schema can only be deleted if it has no tables.
     */
    @Test
    void deleteDBSchemaTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteDBSchema(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a schema by Id
     *
     * Delete a schema by &#x60;Id&#x60;. Schema can only be deleted if it has no tables.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDBSchemaTestQueryMap() {
        UUID id = null;
        DatabaseSchemasApi.DeleteDBSchemaQueryParams queryParams = new DatabaseSchemasApi.DeleteDBSchemaQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteDBSchema(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a schema by fully qualified name
     *
     * Delete a schema by &#x60;fullyQualifiedName&#x60;. Schema can only be deleted if it has no tables.
     */
    @Test
    void deleteDBSchemaByFQNTest() {
        String fqn = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteDBSchemaByFQN(fqn, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a schema by fully qualified name
     *
     * Delete a schema by &#x60;fullyQualifiedName&#x60;. Schema can only be deleted if it has no tables.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDBSchemaByFQNTestQueryMap() {
        String fqn = null;
        DatabaseSchemasApi.DeleteDBSchemaByFQNQueryParams queryParams = new DatabaseSchemasApi.DeleteDBSchemaByFQNQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteDBSchemaByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete database profiler config
     *
     * delete database profile config to the database.
     */
    @Test
    void deleteDataProfilerConfig1Test() {
        UUID id = null;
        // DatabaseSchema response = api.deleteDataProfilerConfig1(id);

        // TODO: test validations
    }

    
    /**
     * Get a schema by fully qualified name
     *
     * Get a database schema by fully qualified name.
     */
    @Test
    void getDBSchemaByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // DatabaseSchema response = api.getDBSchemaByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a schema by fully qualified name
     *
     * Get a database schema by fully qualified name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDBSchemaByFQNTestQueryMap() {
        String fqn = null;
        DatabaseSchemasApi.GetDBSchemaByFQNQueryParams queryParams = new DatabaseSchemasApi.GetDBSchemaByFQNQueryParams()
            .fields(null)
            .include(null);
        // DatabaseSchema response = api.getDBSchemaByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a schema by Id
     *
     * Get a database schema by &#x60;Id&#x60;.
     */
    @Test
    void getDBSchemaByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // DatabaseSchema response = api.getDBSchemaByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a schema by Id
     *
     * Get a database schema by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDBSchemaByIDTestQueryMap() {
        UUID id = null;
        DatabaseSchemasApi.GetDBSchemaByIDQueryParams queryParams = new DatabaseSchemasApi.GetDBSchemaByIDQueryParams()
            .fields(null)
            .include(null);
        // DatabaseSchema response = api.getDBSchemaByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get databaseSchema profile config
     *
     * Get databaseSchema profile config to the table.
     */
    @Test
    void getDataProfilerConfig1Test() {
        UUID id = null;
        // DatabaseSchema response = api.getDataProfilerConfig1(id);

        // TODO: test validations
    }

    
    /**
     * Get a version of the schema
     *
     * Get a version of the database schema by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificDBSchemaVersionTest() {
        UUID id = null;
        String version = null;
        // DatabaseSchema response = api.getSpecificDBSchemaVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List schema versions
     *
     * Get a list of all the versions of a schema identified by &#x60;Id&#x60;
     */
    @Test
    void listAllDBSchemaVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllDBSchemaVersion(id);

        // TODO: test validations
    }

    
    /**
     * List database schemas
     *
     * Get a list of database schemas, optionally filtered by &#x60;database&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listDBSchemasTest() {
        String fields = null;
        String database = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // DatabaseSchemaList response = api.listDBSchemas(fields, database, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List database schemas
     *
     * Get a list of database schemas, optionally filtered by &#x60;database&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listDBSchemasTestQueryMap() {
        DatabaseSchemasApi.ListDBSchemasQueryParams queryParams = new DatabaseSchemasApi.ListDBSchemasQueryParams()
            .fields(null)
            .database(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // DatabaseSchemaList response = api.listDBSchemas(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a database schema
     *
     * Update an existing database schema using JsonPatch.
     */
    @Test
    void patchDBSchemaTest() {
        UUID id = null;
        Object body = null;
        // api.patchDBSchema(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted database schema.
     *
     * Restore a soft deleted database schema.
     */
    @Test
    void restore8Test() {
        RestoreEntity restoreEntity = null;
        // DatabaseSchema response = api.restore8(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity5Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity5(id, voteRequest);

        // TODO: test validations
    }

    
}
