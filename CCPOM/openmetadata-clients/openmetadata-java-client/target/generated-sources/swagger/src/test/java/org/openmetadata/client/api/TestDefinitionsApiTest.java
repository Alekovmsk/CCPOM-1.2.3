package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateTestDefinition;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.TestDefinition;
import org.openmetadata.client.model.TestDefinitionList;
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
 * API tests for TestDefinitionsApi
 */
class TestDefinitionsApiTest {

    private TestDefinitionsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(TestDefinitionsApi.class);
    }

    
    /**
     * Update test definition
     *
     * Create a test definition, if it does not exist, or update an existing test definition.
     */
    @Test
    void createOrUpdateTestDefinitionTest() {
        CreateTestDefinition createTestDefinition = null;
        // TestDefinition response = api.createOrUpdateTestDefinition(createTestDefinition);

        // TODO: test validations
    }

    
    /**
     * Create a test definition
     *
     * Create a Test definition.
     */
    @Test
    void createTestDefinitionTest() {
        CreateTestDefinition createTestDefinition = null;
        // TestDefinition response = api.createTestDefinition(createTestDefinition);

        // TODO: test validations
    }

    
    /**
     * Delete a test definition
     *
     * Delete a test definition by &#x60;id&#x60;.
     */
    @Test
    void deleteTestDefinitionTest() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.deleteTestDefinition(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a test definition
     *
     * Delete a test definition by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTestDefinitionTestQueryMap() {
        UUID id = null;
        TestDefinitionsApi.DeleteTestDefinitionQueryParams queryParams = new TestDefinitionsApi.DeleteTestDefinitionQueryParams()
            .hardDelete(null);
        // api.deleteTestDefinition(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a test definition
     *
     * Delete a test definition by &#x60;name&#x60;.
     */
    @Test
    void deleteTestDefinitionByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteTestDefinitionByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a test definition
     *
     * Delete a test definition by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTestDefinitionByNameTestQueryMap() {
        String name = null;
        TestDefinitionsApi.DeleteTestDefinitionByNameQueryParams queryParams = new TestDefinitionsApi.DeleteTestDefinitionByNameQueryParams()
            .hardDelete(null);
        // api.deleteTestDefinitionByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a test definition by Id
     *
     * Get a Test Definition by &#x60;Id&#x60;.
     */
    @Test
    void get4Test() {
        UUID id = null;
        String fields = null;
        String include = null;
        // TestDefinition response = api.get4(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a test definition by Id
     *
     * Get a Test Definition by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void get4TestQueryMap() {
        UUID id = null;
        TestDefinitionsApi.Get4QueryParams queryParams = new TestDefinitionsApi.Get4QueryParams()
            .fields(null)
            .include(null);
        // TestDefinition response = api.get4(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the test definition
     *
     * Get a version of the test definition by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificTestDefinitionVersionTest() {
        UUID id = null;
        String version = null;
        // TestDefinition response = api.getSpecificTestDefinitionVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a test definition by name
     *
     * Get a test definition by &#x60;name&#x60;.
     */
    @Test
    void getTestDefinitionByNameTest() {
        String name = null;
        String fields = null;
        String include = null;
        // TestDefinition response = api.getTestDefinitionByName(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a test definition by name
     *
     * Get a test definition by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTestDefinitionByNameTestQueryMap() {
        String name = null;
        TestDefinitionsApi.GetTestDefinitionByNameQueryParams queryParams = new TestDefinitionsApi.GetTestDefinitionByNameQueryParams()
            .fields(null)
            .include(null);
        // TestDefinition response = api.getTestDefinitionByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * List test definition versions
     *
     * Get a list of all the versions of a test definition identified by &#x60;Id&#x60;
     */
    @Test
    void listAllTestDefinitionVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllTestDefinitionVersion(id);

        // TODO: test validations
    }

    
    /**
     * List test definitions
     *
     * Get a list of test definitions, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listTestDefinitionsTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        String entityType = null;
        String testPlatform = null;
        String supportedDataType = null;
        // TestDefinitionList response = api.listTestDefinitions(fields, limit, before, after, include, entityType, testPlatform, supportedDataType);

        // TODO: test validations
    }

    /**
     * List test definitions
     *
     * Get a list of test definitions, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listTestDefinitionsTestQueryMap() {
        TestDefinitionsApi.ListTestDefinitionsQueryParams queryParams = new TestDefinitionsApi.ListTestDefinitionsQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null)
            .entityType(null)
            .testPlatform(null)
            .supportedDataType(null);
        // TestDefinitionList response = api.listTestDefinitions(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a test definition
     *
     * Update an existing Test Definition using JsonPatch.
     */
    @Test
    void patchTestDefinitionTest() {
        UUID id = null;
        Object body = null;
        // api.patchTestDefinition(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted test definition
     *
     * Restore a soft deleted TestDefinition.
     */
    @Test
    void restore13Test() {
        RestoreEntity restoreEntity = null;
        // TestDefinition response = api.restore13(restoreEntity);

        // TODO: test validations
    }

    
}
