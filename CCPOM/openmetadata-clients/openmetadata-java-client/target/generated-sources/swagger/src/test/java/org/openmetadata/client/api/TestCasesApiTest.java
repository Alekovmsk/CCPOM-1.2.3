package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import java.math.BigDecimal;
import org.openmetadata.client.model.CreateLogicalTestCases;
import org.openmetadata.client.model.CreateTestCase;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.TestCase;
import org.openmetadata.client.model.TestCaseList;
import org.openmetadata.client.model.TestCaseResult;
import org.openmetadata.client.model.TestCaseResultList;
import org.openmetadata.client.model.TestSuite;
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
 * API tests for TestCasesApi
 */
class TestCasesApiTest {

    private TestCasesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(TestCasesApi.class);
    }

    
    /**
     * Add test case result data
     *
     * Add test case result data to the testCase.
     */
    @Test
    void addTestCaseResultTest() {
        String fqn = null;
        TestCaseResult testCaseResult = null;
        // TestCase response = api.addTestCaseResult(fqn, testCaseResult);

        // TODO: test validations
    }

    
    /**
     * Add test cases to a logical test suite
     *
     * Add test cases to a logical test suite.
     */
    @Test
    void addTestCasesToLogicalTestSuiteTest() {
        CreateLogicalTestCases createLogicalTestCases = null;
        // TestSuite response = api.addTestCasesToLogicalTestSuite(createLogicalTestCases);

        // TODO: test validations
    }

    
    /**
     * Update test case
     *
     * Create a TestCase, it it does not exist or update an existing TestCase.
     */
    @Test
    void createOrUpdateTestTest() {
        CreateTestCase createTestCase = null;
        // TestCase response = api.createOrUpdateTest(createTestCase);

        // TODO: test validations
    }

    
    /**
     * Create a test case
     *
     * Create a test case
     */
    @Test
    void createTestCaseTest() {
        CreateTestCase createTestCase = null;
        // TestCase response = api.createTestCase(createTestCase);

        // TODO: test validations
    }

    
    /**
     * Delete a logical test case by Id from a test suite
     *
     * Delete a logical test case by &#x60;Id&#x60; a test suite.
     */
    @Test
    void deleteLogicalTestCaseTest() {
        UUID testSuiteId = null;
        UUID id = null;
        // api.deleteLogicalTestCase(testSuiteId, id);

        // TODO: test validations
    }

    
    /**
     * Delete a test case by Id
     *
     * Delete a test case by &#x60;Id&#x60;.
     */
    @Test
    void deleteTestCaseTest() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.deleteTestCase(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a test case by Id
     *
     * Delete a test case by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTestCaseTestQueryMap() {
        UUID id = null;
        TestCasesApi.DeleteTestCaseQueryParams queryParams = new TestCasesApi.DeleteTestCaseQueryParams()
            .hardDelete(null);
        // api.deleteTestCase(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a test case by fully qualified name
     *
     * Delete a testCase by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteTestCaseByNameTest() {
        String fqn = null;
        Boolean hardDelete = null;
        // api.deleteTestCaseByName(fqn, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a test case by fully qualified name
     *
     * Delete a testCase by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTestCaseByNameTestQueryMap() {
        String fqn = null;
        TestCasesApi.DeleteTestCaseByNameQueryParams queryParams = new TestCasesApi.DeleteTestCaseByNameQueryParams()
            .hardDelete(null);
        // api.deleteTestCaseByName(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete test case result
     *
     * Delete testCase result for a testCase.
     */
    @Test
    void deleteTestCaseResultTest() {
        String fqn = null;
        Long timestamp = null;
        // TestCase response = api.deleteTestCaseResult(fqn, timestamp);

        // TODO: test validations
    }

    
    /**
     * Get a test case by Id
     *
     * Get a TestCase by &#x60;Id&#x60;.
     */
    @Test
    void get3Test() {
        UUID id = null;
        String fields = null;
        String include = null;
        // TestCase response = api.get3(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a test case by Id
     *
     * Get a TestCase by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void get3TestQueryMap() {
        UUID id = null;
        TestCasesApi.Get3QueryParams queryParams = new TestCasesApi.Get3QueryParams()
            .fields(null)
            .include(null);
        // TestCase response = api.get3(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the test case
     *
     * Get a version of the test case by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificTestCaseVersionTest() {
        UUID id = null;
        String version = null;
        // TestCase response = api.getSpecificTestCaseVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a test case by fully qualified name
     *
     * Get a test case by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getTestCaseByNameTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // TestCase response = api.getTestCaseByName(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a test case by fully qualified name
     *
     * Get a test case by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTestCaseByNameTestQueryMap() {
        String fqn = null;
        TestCasesApi.GetTestCaseByNameQueryParams queryParams = new TestCasesApi.GetTestCaseByNameQueryParams()
            .fields(null)
            .include(null);
        // TestCase response = api.getTestCaseByName(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * List test case versions
     *
     * Get a list of all the versions of a testCases identified by &#x60;Id&#x60;
     */
    @Test
    void listAllTestCaseVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllTestCaseVersion(id);

        // TODO: test validations
    }

    
    /**
     * List of test case results
     *
     * Get a list of all the test case results for the given testCase id, optionally filtered by  &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listTestCaseResultsTest() {
        String fqn = null;
        BigDecimal startTs = null;
        BigDecimal endTs = null;
        // TestCaseResultList response = api.listTestCaseResults(fqn, startTs, endTs);

        // TODO: test validations
    }

    /**
     * List of test case results
     *
     * Get a list of all the test case results for the given testCase id, optionally filtered by  &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listTestCaseResultsTestQueryMap() {
        String fqn = null;
        TestCasesApi.ListTestCaseResultsQueryParams queryParams = new TestCasesApi.ListTestCaseResultsQueryParams()
            .startTs(null)
            .endTs(null);
        // TestCaseResultList response = api.listTestCaseResults(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * List test cases
     *
     * Get a list of test. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.Use the &#x60;testSuite&#x60; field to get the executable Test Suite linked to this test case or use the &#x60;testSuites&#x60; field to list test suites (executable and logical) linked.
     */
    @Test
    void listTestCasesTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String entityLink = null;
        String testSuiteId = null;
        Boolean orderByLastExecutionDate = null;
        Boolean includeAllTests = null;
        String include = null;
        // TestCaseList response = api.listTestCases(fields, limit, before, after, entityLink, testSuiteId, orderByLastExecutionDate, includeAllTests, include);

        // TODO: test validations
    }

    /**
     * List test cases
     *
     * Get a list of test. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.Use the &#x60;testSuite&#x60; field to get the executable Test Suite linked to this test case or use the &#x60;testSuites&#x60; field to list test suites (executable and logical) linked.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listTestCasesTestQueryMap() {
        TestCasesApi.ListTestCasesQueryParams queryParams = new TestCasesApi.ListTestCasesQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .entityLink(null)
            .testSuiteId(null)
            .orderByLastExecutionDate(null)
            .includeAllTests(null)
            .include(null);
        // TestCaseList response = api.listTestCases(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a test case
     *
     * Update an existing test using JsonPatch.
     */
    @Test
    void patchTestTest() {
        UUID id = null;
        Object body = null;
        // api.patchTest(id, body);

        // TODO: test validations
    }

    
    /**
     * Update a test case result
     *
     * Update an existing test case using JsonPatch.
     */
    @Test
    void patchTestCaseResultTest() {
        String fqn = null;
        Long timestamp = null;
        Object body = null;
        // api.patchTestCaseResult(fqn, timestamp, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted test case
     *
     * Restore a soft deleted test case.
     */
    @Test
    void restore12Test() {
        RestoreEntity restoreEntity = null;
        // TestCase response = api.restore12(restoreEntity);

        // TODO: test validations
    }

    
}
