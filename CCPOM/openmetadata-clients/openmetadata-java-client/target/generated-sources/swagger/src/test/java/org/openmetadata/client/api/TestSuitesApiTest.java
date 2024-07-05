package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateTestSuite;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.TestSuite;
import org.openmetadata.client.model.TestSuiteList;
import org.openmetadata.client.model.TestSummary;
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
 * API tests for TestSuitesApi
 */
class TestSuitesApiTest {

    private TestSuitesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(TestSuitesApi.class);
    }

    
    /**
     * Create an executable test suite
     *
     * Create an executable test suite.
     */
    @Test
    void createExecutableTestSuiteTest() {
        CreateTestSuite createTestSuite = null;
        // TestSuite response = api.createExecutableTestSuite(createTestSuite);

        // TODO: test validations
    }

    
    /**
     * Create a logical test suite
     *
     * Create a logical test suite.
     */
    @Test
    void createLogicalTestSuiteTest() {
        CreateTestSuite createTestSuite = null;
        // TestSuite response = api.createLogicalTestSuite(createTestSuite);

        // TODO: test validations
    }

    
    /**
     * Create or Update Executable test suite
     *
     * Create an Executable TestSuite if it does not exist or update an existing one.
     */
    @Test
    void createOrUpdateExecutableTestSuiteTest() {
        CreateTestSuite createTestSuite = null;
        // TestSuite response = api.createOrUpdateExecutableTestSuite(createTestSuite);

        // TODO: test validations
    }

    
    /**
     * Update logical test suite
     *
     * Create a logical TestSuite, if it does not exist or update an existing test suite.
     */
    @Test
    void createOrUpdateLogicalTestSuiteTest() {
        CreateTestSuite createTestSuite = null;
        // TestSuite response = api.createOrUpdateLogicalTestSuite(createTestSuite);

        // TODO: test validations
    }

    
    /**
     * Delete a logical test suite
     *
     * Delete a logical test suite by &#x60;name&#x60;.
     */
    @Test
    void deleteLogicalTestSuiteTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteLogicalTestSuite(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a logical test suite
     *
     * Delete a logical test suite by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteLogicalTestSuiteTestQueryMap() {
        String name = null;
        TestSuitesApi.DeleteLogicalTestSuiteQueryParams queryParams = new TestSuitesApi.DeleteLogicalTestSuiteQueryParams()
            .hardDelete(null);
        // api.deleteLogicalTestSuite(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a logical test suite
     *
     * Delete a logical test suite by &#x60;id&#x60;.
     */
    @Test
    void deleteLogicalTestSuite1Test() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.deleteLogicalTestSuite1(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a logical test suite
     *
     * Delete a logical test suite by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteLogicalTestSuite1TestQueryMap() {
        UUID id = null;
        TestSuitesApi.DeleteLogicalTestSuite1QueryParams queryParams = new TestSuitesApi.DeleteLogicalTestSuite1QueryParams()
            .hardDelete(null);
        // api.deleteLogicalTestSuite1(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a test suite
     *
     * Delete a test suite by &#x60;Id&#x60;.
     */
    @Test
    void deleteTestSuiteTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteTestSuite(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a test suite
     *
     * Delete a test suite by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTestSuiteTestQueryMap() {
        UUID id = null;
        TestSuitesApi.DeleteTestSuiteQueryParams queryParams = new TestSuitesApi.DeleteTestSuiteQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteTestSuite(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a test suite
     *
     * Delete a test suite by &#x60;name&#x60;.
     */
    @Test
    void deleteTestSuiteByNameTest() {
        String name = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteTestSuiteByName(name, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a test suite
     *
     * Delete a test suite by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTestSuiteByNameTestQueryMap() {
        String name = null;
        TestSuitesApi.DeleteTestSuiteByNameQueryParams queryParams = new TestSuitesApi.DeleteTestSuiteByNameQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteTestSuiteByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a test suite by Id
     *
     * Get a Test Suite by &#x60;Id&#x60;.
     */
    @Test
    void get5Test() {
        UUID id = null;
        String fields = null;
        String include = null;
        // TestSuite response = api.get5(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a test suite by Id
     *
     * Get a Test Suite by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void get5TestQueryMap() {
        UUID id = null;
        TestSuitesApi.Get5QueryParams queryParams = new TestSuitesApi.Get5QueryParams()
            .fields(null)
            .include(null);
        // TestSuite response = api.get5(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get the execution summary of test suites
     *
     * Get the execution summary of test suites.
     */
    @Test
    void getExecutionSummaryOfTestSuitesTest() {
        UUID testSuiteId = null;
        // TestSummary response = api.getExecutionSummaryOfTestSuites(testSuiteId);

        // TODO: test validations
    }

    /**
     * Get the execution summary of test suites
     *
     * Get the execution summary of test suites.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getExecutionSummaryOfTestSuitesTestQueryMap() {
        TestSuitesApi.GetExecutionSummaryOfTestSuitesQueryParams queryParams = new TestSuitesApi.GetExecutionSummaryOfTestSuitesQueryParams()
            .testSuiteId(null);
        // TestSummary response = api.getExecutionSummaryOfTestSuites(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the test suite
     *
     * Get a version of the test suite by given &#x60;id&#x60;
     */
    @Test
    void getSpecificTestSuiteVersionTest() {
        UUID id = null;
        String version = null;
        // TestSuite response = api.getSpecificTestSuiteVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a test suite by name
     *
     * Get a test suite by  name.
     */
    @Test
    void getTestSuiteByNameTest() {
        String name = null;
        String fields = null;
        String include = null;
        // TestSuite response = api.getTestSuiteByName(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a test suite by name
     *
     * Get a test suite by  name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTestSuiteByNameTestQueryMap() {
        String name = null;
        TestSuitesApi.GetTestSuiteByNameQueryParams queryParams = new TestSuitesApi.GetTestSuiteByNameQueryParams()
            .fields(null)
            .include(null);
        // TestSuite response = api.getTestSuiteByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * List test suite versions
     *
     * Get a list of all the versions of a test suite identified by &#x60;id&#x60;
     */
    @Test
    void listAllTestSuiteVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllTestSuiteVersion(id);

        // TODO: test validations
    }

    
    /**
     * List test suites
     *
     * Get a list of test suites. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listTestSuitesTest() {
        String fields = null;
        Integer limit = null;
        String testSuiteType = null;
        String before = null;
        String after = null;
        String include = null;
        // TestSuiteList response = api.listTestSuites(fields, limit, testSuiteType, before, after, include);

        // TODO: test validations
    }

    /**
     * List test suites
     *
     * Get a list of test suites. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listTestSuitesTestQueryMap() {
        TestSuitesApi.ListTestSuitesQueryParams queryParams = new TestSuitesApi.ListTestSuitesQueryParams()
            .fields(null)
            .limit(null)
            .testSuiteType(null)
            .before(null)
            .after(null)
            .include(null);
        // TestSuiteList response = api.listTestSuites(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a test suite
     *
     * Update an existing testSuite using JsonPatch.
     */
    @Test
    void patchTestSuiteTest() {
        UUID id = null;
        Object body = null;
        // api.patchTestSuite(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted test suite
     *
     * Restore a soft deleted test suite.
     */
    @Test
    void restore14Test() {
        RestoreEntity restoreEntity = null;
        // TestSuite response = api.restore14(restoreEntity);

        // TODO: test validations
    }

    
}
