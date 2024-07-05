package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateSearchIndex;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.SearchIndex;
import org.openmetadata.client.model.SearchIndexList;
import org.openmetadata.client.model.SearchIndexSampleData;
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
 * API tests for SearchIndexApi
 */
class SearchIndexApiTest {

    private SearchIndexApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(SearchIndexApi.class);
    }

    
    /**
     * Add a follower
     *
     * Add a user identified by &#x60;userId&#x60; as followed of this SearchIndex
     */
    @Test
    void addFollower4Test() {
        UUID id = null;
        UUID body = null;
        // ChangeEvent response = api.addFollower4(id, body);

        // TODO: test validations
    }

    
    /**
     * Add sample data
     *
     * Add sample data to the searchIndex.
     */
    @Test
    void addSampleData1Test() {
        UUID id = null;
        SearchIndexSampleData searchIndexSampleData = null;
        // SearchIndex response = api.addSampleData1(id, searchIndexSampleData);

        // TODO: test validations
    }

    
    /**
     * Update SearchIndex
     *
     * Create a SearchIndex, it it does not exist or update an existing SearchIndex.
     */
    @Test
    void createOrUpdateSearchIndexTest() {
        CreateSearchIndex createSearchIndex = null;
        // SearchIndex response = api.createOrUpdateSearchIndex(createSearchIndex);

        // TODO: test validations
    }

    
    /**
     * Create a SearchIndex
     *
     * Create a SearchIndex under an existing &#x60;service&#x60;.
     */
    @Test
    void createSearchIndexTest() {
        CreateSearchIndex createSearchIndex = null;
        // SearchIndex response = api.createSearchIndex(createSearchIndex);

        // TODO: test validations
    }

    
    /**
     * Remove a follower
     *
     * Remove the user identified &#x60;userId&#x60; as a follower of the SearchIndex.
     */
    @Test
    void deleteFollower5Test() {
        UUID id = null;
        String userId = null;
        // ChangeEvent response = api.deleteFollower5(id, userId);

        // TODO: test validations
    }

    
    /**
     * Delete a SearchIndex by id
     *
     * Delete a SearchIndex by &#x60;id&#x60;.
     */
    @Test
    void deleteSearchIndexTest() {
        UUID id = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteSearchIndex(id, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a SearchIndex by id
     *
     * Delete a SearchIndex by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteSearchIndexTestQueryMap() {
        UUID id = null;
        SearchIndexApi.DeleteSearchIndexQueryParams queryParams = new SearchIndexApi.DeleteSearchIndexQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteSearchIndex(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a SearchIndex by fully qualified name
     *
     * Delete a SearchIndex by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteSearchIndexByFQNTest() {
        String fqn = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteSearchIndexByFQN(fqn, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a SearchIndex by fully qualified name
     *
     * Delete a SearchIndex by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteSearchIndexByFQNTestQueryMap() {
        String fqn = null;
        SearchIndexApi.DeleteSearchIndexByFQNQueryParams queryParams = new SearchIndexApi.DeleteSearchIndexByFQNQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteSearchIndexByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a SearchIndex by id
     *
     * Get a SearchIndex by &#x60;id&#x60;.
     */
    @Test
    void get6Test() {
        UUID id = null;
        String fields = null;
        String include = null;
        // SearchIndex response = api.get6(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a SearchIndex by id
     *
     * Get a SearchIndex by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void get6TestQueryMap() {
        UUID id = null;
        SearchIndexApi.Get6QueryParams queryParams = new SearchIndexApi.Get6QueryParams()
            .fields(null)
            .include(null);
        // SearchIndex response = api.get6(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get sample data
     *
     * Get sample data from the SearchIndex.
     */
    @Test
    void getSampleData1Test() {
        UUID id = null;
        // SearchIndex response = api.getSampleData1(id);

        // TODO: test validations
    }

    
    /**
     * Get a SearchIndex by fully qualified name
     *
     * Get a SearchIndex by fully qualified name.
     */
    @Test
    void getSearchIndexByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // SearchIndex response = api.getSearchIndexByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a SearchIndex by fully qualified name
     *
     * Get a SearchIndex by fully qualified name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getSearchIndexByFQNTestQueryMap() {
        String fqn = null;
        SearchIndexApi.GetSearchIndexByFQNQueryParams queryParams = new SearchIndexApi.GetSearchIndexByFQNQueryParams()
            .fields(null)
            .include(null);
        // SearchIndex response = api.getSearchIndexByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the SearchIndex
     *
     * Get a version of the SearchIndex by given &#x60;id&#x60;
     */
    @Test
    void getSpecificSearchIndexVersionTest() {
        UUID id = null;
        String version = null;
        // SearchIndex response = api.getSpecificSearchIndexVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List SearchIndex versions
     *
     * Get a list of all the versions of a SearchIndex identified by &#x60;id&#x60;
     */
    @Test
    void listAllSearchIndexVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllSearchIndexVersion(id);

        // TODO: test validations
    }

    
    /**
     * List searchIndexes
     *
     * Get a list of SearchIndexes, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listSearchIndexesTest() {
        String fields = null;
        String service = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // SearchIndexList response = api.listSearchIndexes(fields, service, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List searchIndexes
     *
     * Get a list of SearchIndexes, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listSearchIndexesTestQueryMap() {
        SearchIndexApi.ListSearchIndexesQueryParams queryParams = new SearchIndexApi.ListSearchIndexesQueryParams()
            .fields(null)
            .service(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // SearchIndexList response = api.listSearchIndexes(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a SearchIndex
     *
     * Update an existing SearchIndex using JsonPatch.
     */
    @Test
    void patchSearchIndexTest() {
        UUID id = null;
        Object body = null;
        // api.patchSearchIndex(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted SearchIndex
     *
     * Restore a soft deleted SearchIndex.
     */
    @Test
    void restore23Test() {
        RestoreEntity restoreEntity = null;
        // SearchIndex response = api.restore23(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity18Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity18(id, voteRequest);

        // TODO: test validations
    }

    
}
