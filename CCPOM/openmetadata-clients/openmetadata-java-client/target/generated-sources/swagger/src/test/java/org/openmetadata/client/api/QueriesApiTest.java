package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateQuery;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.EntityReference;
import org.openmetadata.client.model.Query;
import org.openmetadata.client.model.QueryList;
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
 * API tests for QueriesApi
 */
class QueriesApiTest {

    private QueriesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(QueriesApi.class);
    }

    
    /**
     * Add a follower
     *
     * Add a user identified by &#x60;userId&#x60; as follower of this model
     */
    @Test
    void addFollower3Test() {
        UUID id = null;
        UUID body = null;
        // ChangeEvent response = api.addFollower3(id, body);

        // TODO: test validations
    }

    
    /**
     * Add query usage
     *
     * Add query usage
     */
    @Test
    void addQueryUsageTest() {
        UUID id = null;
        List<EntityReference> entityReference = null;
        // Query response = api.addQueryUsage(id, entityReference);

        // TODO: test validations
    }

    
    /**
     * Populate Used By Field
     *
     * Add query users
     */
    @Test
    void addQueryUsedByTest() {
        UUID id = null;
        List<String> requestBody = null;
        // Query response = api.addQueryUsedBy(id, requestBody);

        // TODO: test validations
    }

    
    /**
     * Add query users
     *
     * Add query users
     */
    @Test
    void addQueryUsersTest() {
        UUID id = null;
        List<String> requestBody = null;
        // Query response = api.addQueryUsers(id, requestBody);

        // TODO: test validations
    }

    
    /**
     * Create or update a query
     *
     * Create a query, if it does not exist. If a query already exists, update the query.
     */
    @Test
    void createOrUpdateQueryTest() {
        CreateQuery createQuery = null;
        // Query response = api.createOrUpdateQuery(createQuery);

        // TODO: test validations
    }

    
    /**
     * Create a query
     *
     * Create a query under an existing entity.
     */
    @Test
    void createQueryTest() {
        CreateQuery createQuery = null;
        // QueryList response = api.createQuery(createQuery);

        // TODO: test validations
    }

    
    /**
     * Remove a follower
     *
     * Remove the user identified &#x60;userId&#x60; as a follower of the model.
     */
    @Test
    void deleteFollower4Test() {
        UUID id = null;
        UUID userId = null;
        // ChangeEvent response = api.deleteFollower4(id, userId);

        // TODO: test validations
    }

    
    /**
     * Delete a query
     *
     * Delete a query by &#x60;id&#x60;.
     */
    @Test
    void deleteQueryTest() {
        UUID id = null;
        // api.deleteQuery(id);

        // TODO: test validations
    }

    
    /**
     * Delete a query
     *
     * Delete a query by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteQueryByFQNTest() {
        String fqn = null;
        // api.deleteQueryByFQN(fqn);

        // TODO: test validations
    }

    
    /**
     * Get a query
     *
     * Get a Query by &#x60;id&#x60;
     */
    @Test
    void getQueryByIdTest() {
        UUID id = null;
        String fields = null;
        // Query response = api.getQueryById(id, fields);

        // TODO: test validations
    }

    /**
     * Get a query
     *
     * Get a Query by &#x60;id&#x60;
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getQueryByIdTestQueryMap() {
        UUID id = null;
        QueriesApi.GetQueryByIdQueryParams queryParams = new QueriesApi.GetQueryByIdQueryParams()
            .fields(null);
        // Query response = api.getQueryById(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a query by name
     *
     * Get a query by fully qualified table name.
     */
    @Test
    void getQueryFqnTest() {
        String fqn = null;
        String fields = null;
        // Query response = api.getQueryFqn(fqn, fields);

        // TODO: test validations
    }

    /**
     * Get a query by name
     *
     * Get a query by fully qualified table name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getQueryFqnTestQueryMap() {
        String fqn = null;
        QueriesApi.GetQueryFqnQueryParams queryParams = new QueriesApi.GetQueryFqnQueryParams()
            .fields(null);
        // Query response = api.getQueryFqn(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a specific version of the query
     *
     * Get a version of the query by given &#x60;id&#x60;
     */
    @Test
    void getSpecificQueryVersionTest() {
        UUID id = null;
        String version = null;
        // Query response = api.getSpecificQueryVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get List of all query versions
     *
     * Get a list of all the versions of a query identified by &#x60;id&#x60;
     */
    @Test
    void listAllQueryVersionTest() {
        String id = null;
        // EntityHistory response = api.listAllQueryVersion(id);

        // TODO: test validations
    }

    
    /**
     * Get a list of Queries
     *
     * Get a list of queries. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listQueriesTest() {
        String fields = null;
        UUID entityId = null;
        String service = null;
        Integer limit = null;
        String before = null;
        String after = null;
        // QueryList response = api.listQueries(fields, entityId, service, limit, before, after);

        // TODO: test validations
    }

    /**
     * Get a list of Queries
     *
     * Get a list of queries. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listQueriesTestQueryMap() {
        QueriesApi.ListQueriesQueryParams queryParams = new QueriesApi.ListQueriesQueryParams()
            .fields(null)
            .entityId(null)
            .service(null)
            .limit(null)
            .before(null)
            .after(null);
        // QueryList response = api.listQueries(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a query
     *
     * Update an existing query using JsonPatch.
     */
    @Test
    void patchQueryTest() {
        UUID id = null;
        Object body = null;
        // api.patchQuery(id, body);

        // TODO: test validations
    }

    
    /**
     * remove query used in
     *
     * remove Query Used in
     */
    @Test
    void removeQueryUsedInTest() {
        UUID id = null;
        List<EntityReference> entityReference = null;
        // Query response = api.removeQueryUsedIn(id, entityReference);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted Query
     *
     * Restore a soft deleted Query.
     */
    @Test
    void restore22Test() {
        RestoreEntity restoreEntity = null;
        // Query response = api.restore22(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity16Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity16(id, voteRequest);

        // TODO: test validations
    }

    
}
