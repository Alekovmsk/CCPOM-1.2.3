package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateSearchService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.SearchService;
import org.openmetadata.client.model.SearchServiceList;
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
 * API tests for SearchServicesApi
 */
class SearchServicesApiTest {

    private SearchServicesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(SearchServicesApi.class);
    }

    
    /**
     * Add test connection result
     *
     * Add test connection result to the service.
     */
    @Test
    void addTestConnectionResult6Test() {
        UUID id = null;
        TestConnectionResult testConnectionResult = null;
        // SearchService response = api.addTestConnectionResult6(id, testConnectionResult);

        // TODO: test validations
    }

    
    /**
     * Update search service
     *
     * Update an existing or create a new search service.
     */
    @Test
    void createOrUpdateSearchServiceTest() {
        CreateSearchService createSearchService = null;
        // SearchService response = api.createOrUpdateSearchService(createSearchService);

        // TODO: test validations
    }

    
    /**
     * Create search service
     *
     * Create a new search service.
     */
    @Test
    void createSearchServiceTest() {
        CreateSearchService createSearchService = null;
        // SearchService response = api.createSearchService(createSearchService);

        // TODO: test validations
    }

    
    /**
     * Delete an search service
     *
     * Delete an search services. If containers belong the service, it can&#39;t be deleted.
     */
    @Test
    void deleteSearchServiceTest() {
        String id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteSearchService(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete an search service
     *
     * Delete an search services. If containers belong the service, it can&#39;t be deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteSearchServiceTestQueryMap() {
        String id = null;
        SearchServicesApi.DeleteSearchServiceQueryParams queryParams = new SearchServicesApi.DeleteSearchServiceQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteSearchService(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete an SearchService by fully qualified name
     *
     * Delete an SearchService by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteSearchServiceByFQNTest() {
        String fqn = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteSearchServiceByFQN(fqn, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete an SearchService by fully qualified name
     *
     * Delete an SearchService by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteSearchServiceByFQNTestQueryMap() {
        String fqn = null;
        SearchServicesApi.DeleteSearchServiceByFQNQueryParams queryParams = new SearchServicesApi.DeleteSearchServiceByFQNQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteSearchServiceByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get search service by name
     *
     * Get a search service by the service &#x60;name&#x60;.
     */
    @Test
    void getSearchServiceByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // SearchService response = api.getSearchServiceByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get search service by name
     *
     * Get a search service by the service &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getSearchServiceByFQNTestQueryMap() {
        String name = null;
        SearchServicesApi.GetSearchServiceByFQNQueryParams queryParams = new SearchServicesApi.GetSearchServiceByFQNQueryParams()
            .fields(null)
            .include(null);
        // SearchService response = api.getSearchServiceByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get an search service
     *
     * Get an search service by &#x60;id&#x60;.
     */
    @Test
    void getSearchServiceByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // SearchService response = api.getSearchServiceByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get an search service
     *
     * Get an search service by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getSearchServiceByIDTestQueryMap() {
        UUID id = null;
        SearchServicesApi.GetSearchServiceByIDQueryParams queryParams = new SearchServicesApi.GetSearchServiceByIDQueryParams()
            .fields(null)
            .include(null);
        // SearchService response = api.getSearchServiceByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the search service
     *
     * Get a version of the search service by given &#x60;id&#x60;
     */
    @Test
    void getSpecificSearchServiceVersionTest() {
        String id = null;
        String version = null;
        // SearchService response = api.getSpecificSearchServiceVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List search service versions
     *
     * Get a list of all the versions of an search service identified by &#x60;id&#x60;
     */
    @Test
    void listAllSearchServiceVersionTest() {
        String id = null;
        // EntityHistory response = api.listAllSearchServiceVersion(id);

        // TODO: test validations
    }

    
    /**
     * List search services
     *
     * Get a list of search services.
     */
    @Test
    void listSearchServicesTest() {
        String fields = null;
        String domain = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // SearchServiceList response = api.listSearchServices(fields, domain, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List search services
     *
     * Get a list of search services.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listSearchServicesTestQueryMap() {
        SearchServicesApi.ListSearchServicesQueryParams queryParams = new SearchServicesApi.ListSearchServicesQueryParams()
            .fields(null)
            .domain(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // SearchServiceList response = api.listSearchServices(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update an search service
     *
     * Update an existing search service using JsonPatch.
     */
    @Test
    void patchSearchServiceTest() {
        UUID id = null;
        Object body = null;
        // api.patchSearchService(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted SearchService.
     *
     * Restore a soft deleted SearchService.
     */
    @Test
    void restore30Test() {
        RestoreEntity restoreEntity = null;
        // SearchService response = api.restore30(restoreEntity);

        // TODO: test validations
    }

    
}
