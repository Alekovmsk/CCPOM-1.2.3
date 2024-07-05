package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.SearchResponse;
import org.openmetadata.client.model.Suggest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
class SearchApiTest {

    private SearchApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(SearchApi.class);
    }

    
    /**
     * Get aggregated fields
     *
     * Get aggregated fields from entities.
     */
    @Test
    void getAggregateFieldsTest() {
        String q = null;
        String index = null;
        String field = null;
        String value = null;
        Integer size = null;
        String deleted = null;
        // Suggest response = api.getAggregateFields(q, index, field, value, size, deleted);

        // TODO: test validations
    }

    /**
     * Get aggregated fields
     *
     * Get aggregated fields from entities.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getAggregateFieldsTestQueryMap() {
        SearchApi.GetAggregateFieldsQueryParams queryParams = new SearchApi.GetAggregateFieldsQueryParams()
            .index(null)
            .field(null)
            .value(null)
            .q(null)
            .size(null)
            .deleted(null);
        // Suggest response = api.getAggregateFields(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get Stream Job Latest Status
     *
     * Stream Job Status
     */
    @Test
    void getStreamJobStatusTest() {
        // api.getStreamJobStatus();

        // TODO: test validations
    }

    
    /**
     * Suggest entities
     *
     * Get suggested entities used for auto-completion.
     */
    @Test
    void getSuggestedEntitiesTest() {
        String q = null;
        String index = null;
        String field = null;
        Integer size = null;
        Boolean fetchSource = null;
        List<String> includeSourceFields = null;
        Boolean deleted = null;
        // Suggest response = api.getSuggestedEntities(q, index, field, size, fetchSource, includeSourceFields, deleted);

        // TODO: test validations
    }

    /**
     * Suggest entities
     *
     * Get suggested entities used for auto-completion.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getSuggestedEntitiesTestQueryMap() {
        SearchApi.GetSuggestedEntitiesQueryParams queryParams = new SearchApi.GetSuggestedEntitiesQueryParams()
            .q(null)
            .index(null)
            .field(null)
            .size(null)
            .fetchSource(null)
            .includeSourceFields(null)
            .deleted(null);
        // Suggest response = api.getSuggestedEntities(queryParams);

    // TODO: test validations
    }
    
    /**
     * Search entities
     *
     * Search entities using query test. Use query params &#x60;from&#x60; and &#x60;size&#x60; for pagination. Use &#x60;sort_field&#x60; to sort the results in &#x60;sort_order&#x60;.
     */
    @Test
    void searchEntitiesWithQueryTest() {
        String q = null;
        String index = null;
        Boolean deleted = null;
        Integer from = null;
        Integer size = null;
        String sortField = null;
        String sortOrder = null;
        Boolean trackTotalHits = null;
        String queryFilter = null;
        String postFilter = null;
        Boolean fetchSource = null;
        List<String> includeSourceFields = null;
        // SearchResponse response = api.searchEntitiesWithQuery(q, index, deleted, from, size, sortField, sortOrder, trackTotalHits, queryFilter, postFilter, fetchSource, includeSourceFields);

        // TODO: test validations
    }

    /**
     * Search entities
     *
     * Search entities using query test. Use query params &#x60;from&#x60; and &#x60;size&#x60; for pagination. Use &#x60;sort_field&#x60; to sort the results in &#x60;sort_order&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void searchEntitiesWithQueryTestQueryMap() {
        SearchApi.SearchEntitiesWithQueryQueryParams queryParams = new SearchApi.SearchEntitiesWithQueryQueryParams()
            .q(null)
            .index(null)
            .deleted(null)
            .from(null)
            .size(null)
            .sortField(null)
            .sortOrder(null)
            .trackTotalHits(null)
            .queryFilter(null)
            .postFilter(null)
            .fetchSource(null)
            .includeSourceFields(null);
        // SearchResponse response = api.searchEntitiesWithQuery(queryParams);

    // TODO: test validations
    }
    
    /**
     * Search entities
     *
     * 
     */
    @Test
    void searchEntitiesWithSourceUrlTest() {
        String sourceUrl = null;
        // SearchResponse response = api.searchEntitiesWithSourceUrl(sourceUrl);

        // TODO: test validations
    }

    /**
     * Search entities
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void searchEntitiesWithSourceUrlTestQueryMap() {
        SearchApi.SearchEntitiesWithSourceUrlQueryParams queryParams = new SearchApi.SearchEntitiesWithSourceUrlQueryParams()
            .sourceUrl(null);
        // SearchResponse response = api.searchEntitiesWithSourceUrl(queryParams);

    // TODO: test validations
    }
    
    /**
     * Search entities
     *
     * 
     */
    @Test
    void searchEntitiesWithSpecificFieldAndValueTest() {
        String fieldName = null;
        String fieldValue = null;
        String index = null;
        // SearchResponse response = api.searchEntitiesWithSpecificFieldAndValue(fieldName, fieldValue, index);

        // TODO: test validations
    }

    /**
     * Search entities
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void searchEntitiesWithSpecificFieldAndValueTestQueryMap() {
        SearchApi.SearchEntitiesWithSpecificFieldAndValueQueryParams queryParams = new SearchApi.SearchEntitiesWithSpecificFieldAndValueQueryParams()
            .fieldName(null)
            .fieldValue(null)
            .index(null);
        // SearchResponse response = api.searchEntitiesWithSpecificFieldAndValue(queryParams);

    // TODO: test validations
    }
    
}
