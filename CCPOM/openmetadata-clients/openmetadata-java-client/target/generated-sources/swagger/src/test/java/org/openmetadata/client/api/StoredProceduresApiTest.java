package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateStoredProcedure;
import org.openmetadata.client.model.DatabaseSchema;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.StoredProcedure;
import org.openmetadata.client.model.StoredProcedureList;
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
 * API tests for StoredProceduresApi
 */
class StoredProceduresApiTest {

    private StoredProceduresApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(StoredProceduresApi.class);
    }

    
    /**
     * Add a follower
     *
     * Add a user identified by &#x60;userId&#x60; as followed of this Stored Procedure
     */
    @Test
    void addFollowerTest() {
        UUID id = null;
        UUID body = null;
        // ChangeEvent response = api.addFollower(id, body);

        // TODO: test validations
    }

    
    /**
     * Create or update Stored Procedure
     *
     * Create a stored procedure, if it does not exist or update an existing stored procedure.
     */
    @Test
    void createOrUpdateStoredProcedureTest() {
        CreateStoredProcedure createStoredProcedure = null;
        // StoredProcedure response = api.createOrUpdateStoredProcedure(createStoredProcedure);

        // TODO: test validations
    }

    
    /**
     * Create a Stored Procedure
     *
     * Create a Stored Procedure under an existing &#x60;service&#x60;.
     */
    @Test
    void createStoredProcedureTest() {
        CreateStoredProcedure createStoredProcedure = null;
        // StoredProcedure response = api.createStoredProcedure(createStoredProcedure);

        // TODO: test validations
    }

    
    /**
     * Delete a schema by fully qualified name
     *
     * Delete a schema by &#x60;fullyQualifiedName&#x60;. Schema can only be deleted if it has no tables.
     */
    @Test
    void deleteDBSchemaByFQN1Test() {
        String fqn = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteDBSchemaByFQN1(fqn, hardDelete, recursive);

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
    void deleteDBSchemaByFQN1TestQueryMap() {
        String fqn = null;
        StoredProceduresApi.DeleteDBSchemaByFQN1QueryParams queryParams = new StoredProceduresApi.DeleteDBSchemaByFQN1QueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteDBSchemaByFQN1(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Remove a follower
     *
     * Remove the user identified &#x60;userId&#x60; as a follower of the Stored Procedure.
     */
    @Test
    void deleteFollowerTest() {
        UUID id = null;
        String userId = null;
        // ChangeEvent response = api.deleteFollower(id, userId);

        // TODO: test validations
    }

    
    /**
     * Delete a StoredProcedure by Id
     *
     * Delete a StoredProcedure by &#x60;Id&#x60;.
     */
    @Test
    void deleteStoredProcedureTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteStoredProcedure(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a StoredProcedure by Id
     *
     * Delete a StoredProcedure by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteStoredProcedureTestQueryMap() {
        UUID id = null;
        StoredProceduresApi.DeleteStoredProcedureQueryParams queryParams = new StoredProceduresApi.DeleteStoredProcedureQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteStoredProcedure(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the Stored Procedure
     *
     * Get a version of the Stored Procedure by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificStoredProcedureVersionTest() {
        UUID id = null;
        String version = null;
        // StoredProcedure response = api.getSpecificStoredProcedureVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a Stored Procedure by fully qualified name
     *
     * Get a Stored Procedure by fully qualified name.
     */
    @Test
    void getStoredProcedureByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // StoredProcedure response = api.getStoredProcedureByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a Stored Procedure by fully qualified name
     *
     * Get a Stored Procedure by fully qualified name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getStoredProcedureByFQNTestQueryMap() {
        String fqn = null;
        StoredProceduresApi.GetStoredProcedureByFQNQueryParams queryParams = new StoredProceduresApi.GetStoredProcedureByFQNQueryParams()
            .fields(null)
            .include(null);
        // StoredProcedure response = api.getStoredProcedureByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a stored procedure by Id
     *
     * Get a stored procedure by &#x60;Id&#x60;.
     */
    @Test
    void getStoredProcedureByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // StoredProcedure response = api.getStoredProcedureByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a stored procedure by Id
     *
     * Get a stored procedure by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getStoredProcedureByIDTestQueryMap() {
        UUID id = null;
        StoredProceduresApi.GetStoredProcedureByIDQueryParams queryParams = new StoredProceduresApi.GetStoredProcedureByIDQueryParams()
            .fields(null)
            .include(null);
        // StoredProcedure response = api.getStoredProcedureByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * List stored procedure versions
     *
     * Get a list of all the versions of a stored procedure identified by &#x60;Id&#x60;
     */
    @Test
    void listAllStoredProceduresVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllStoredProceduresVersion(id);

        // TODO: test validations
    }

    
    /**
     * List Stored Procedures
     *
     * Get a list of stored procedures, optionally filtered by &#x60;databaseSchema&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listStoredProceduresTest() {
        String fields = null;
        String databaseSchema = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // StoredProcedureList response = api.listStoredProcedures(fields, databaseSchema, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List Stored Procedures
     *
     * Get a list of stored procedures, optionally filtered by &#x60;databaseSchema&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listStoredProceduresTestQueryMap() {
        StoredProceduresApi.ListStoredProceduresQueryParams queryParams = new StoredProceduresApi.ListStoredProceduresQueryParams()
            .fields(null)
            .databaseSchema(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // StoredProcedureList response = api.listStoredProcedures(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a Stored Procedure
     *
     * Update an existing StoredProcedure using JsonPatch.
     */
    @Test
    void patchStoredProcedureTest() {
        UUID id = null;
        Object body = null;
        // api.patchStoredProcedure(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted database schema.
     *
     * Restore a soft deleted database schema.
     */
    @Test
    void restore9Test() {
        RestoreEntity restoreEntity = null;
        // DatabaseSchema response = api.restore9(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity6Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity6(id, voteRequest);

        // TODO: test validations
    }

    
}
