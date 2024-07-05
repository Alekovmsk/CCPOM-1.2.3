package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface TestCasesApi extends ApiClient.Api {


  /**
   * Add test case result data
   * Add test case result data to the testCase.
   * @param fqn Fully qualified name of the test case (required)
   * @param testCaseResult  (optional)
   * @return TestCase
   */
  @RequestLine("PUT /v1/dataQuality/testCases/{fqn}/testCaseResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestCase addTestCaseResult(@Param("fqn") String fqn, TestCaseResult testCaseResult);

  /**
   * Add test case result data
   * Similar to <code>addTestCaseResult</code> but it also returns the http response headers .
   * Add test case result data to the testCase.
   * @param fqn Fully qualified name of the test case (required)
   * @param testCaseResult  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dataQuality/testCases/{fqn}/testCaseResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestCase> addTestCaseResultWithHttpInfo(@Param("fqn") String fqn, TestCaseResult testCaseResult);



  /**
   * Add test cases to a logical test suite
   * Add test cases to a logical test suite.
   * @param createLogicalTestCases  (optional)
   * @return TestSuite
   */
  @RequestLine("PUT /v1/dataQuality/testCases/logicalTestCases")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestSuite addTestCasesToLogicalTestSuite(CreateLogicalTestCases createLogicalTestCases);

  /**
   * Add test cases to a logical test suite
   * Similar to <code>addTestCasesToLogicalTestSuite</code> but it also returns the http response headers .
   * Add test cases to a logical test suite.
   * @param createLogicalTestCases  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dataQuality/testCases/logicalTestCases")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestSuite> addTestCasesToLogicalTestSuiteWithHttpInfo(CreateLogicalTestCases createLogicalTestCases);



  /**
   * Update test case
   * Create a TestCase, it it does not exist or update an existing TestCase.
   * @param createTestCase  (optional)
   * @return TestCase
   */
  @RequestLine("PUT /v1/dataQuality/testCases")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestCase createOrUpdateTest(CreateTestCase createTestCase);

  /**
   * Update test case
   * Similar to <code>createOrUpdateTest</code> but it also returns the http response headers .
   * Create a TestCase, it it does not exist or update an existing TestCase.
   * @param createTestCase  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dataQuality/testCases")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestCase> createOrUpdateTestWithHttpInfo(CreateTestCase createTestCase);



  /**
   * Create a test case
   * Create a test case
   * @param createTestCase  (optional)
   * @return TestCase
   */
  @RequestLine("POST /v1/dataQuality/testCases")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestCase createTestCase(CreateTestCase createTestCase);

  /**
   * Create a test case
   * Similar to <code>createTestCase</code> but it also returns the http response headers .
   * Create a test case
   * @param createTestCase  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/dataQuality/testCases")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestCase> createTestCaseWithHttpInfo(CreateTestCase createTestCase);



  /**
   * Delete a logical test case by Id from a test suite
   * Delete a logical test case by &#x60;Id&#x60; a test suite.
   * @param testSuiteId  (required)
   * @param id  (required)
   */
  @RequestLine("DELETE /v1/dataQuality/testCases/logicalTestCases/{testSuiteId}/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteLogicalTestCase(@Param("testSuiteId") UUID testSuiteId, @Param("id") UUID id);

  /**
   * Delete a logical test case by Id from a test suite
   * Similar to <code>deleteLogicalTestCase</code> but it also returns the http response headers .
   * Delete a logical test case by &#x60;Id&#x60; a test suite.
   * @param testSuiteId  (required)
   * @param id  (required)
   */
  @RequestLine("DELETE /v1/dataQuality/testCases/logicalTestCases/{testSuiteId}/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteLogicalTestCaseWithHttpInfo(@Param("testSuiteId") UUID testSuiteId, @Param("id") UUID id);



  /**
   * Delete a test case by Id
   * Delete a test case by &#x60;Id&#x60;.
   * @param id Id of the test case (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testCases/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTestCase(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a test case by Id
   * Similar to <code>deleteTestCase</code> but it also returns the http response headers .
   * Delete a test case by &#x60;Id&#x60;.
   * @param id Id of the test case (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testCases/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTestCaseWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a test case by Id
   * Delete a test case by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deleteTestCase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTestCaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the test case (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dataQuality/testCases/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTestCase(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a test case by Id
  * Delete a test case by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deleteTestCase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the test case (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dataQuality/testCases/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTestCaseWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTestCase</code> method in a fluent style.
   */
  public static class DeleteTestCaseQueryParams extends HashMap<String, Object> {
    public DeleteTestCaseQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a test case by fully qualified name
   * Delete a testCase by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the test case (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testCases/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTestCaseByName(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a test case by fully qualified name
   * Similar to <code>deleteTestCaseByName</code> but it also returns the http response headers .
   * Delete a testCase by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the test case (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testCases/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTestCaseByNameWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a test case by fully qualified name
   * Delete a testCase by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteTestCaseByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTestCaseByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the test case (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dataQuality/testCases/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTestCaseByName(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a test case by fully qualified name
  * Delete a testCase by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteTestCaseByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the test case (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dataQuality/testCases/name/{fqn}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTestCaseByNameWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTestCaseByName</code> method in a fluent style.
   */
  public static class DeleteTestCaseByNameQueryParams extends HashMap<String, Object> {
    public DeleteTestCaseByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete test case result
   * Delete testCase result for a testCase.
   * @param fqn Fully qualified name of the test case (required)
   * @param timestamp Timestamp of the testCase result (required)
   * @return TestCase
   */
  @RequestLine("DELETE /v1/dataQuality/testCases/{fqn}/testCaseResult/{timestamp}")
  @Headers({
    "Accept: application/json",
  })
  TestCase deleteTestCaseResult(@Param("fqn") String fqn, @Param("timestamp") Long timestamp);

  /**
   * Delete test case result
   * Similar to <code>deleteTestCaseResult</code> but it also returns the http response headers .
   * Delete testCase result for a testCase.
   * @param fqn Fully qualified name of the test case (required)
   * @param timestamp Timestamp of the testCase result (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/dataQuality/testCases/{fqn}/testCaseResult/{timestamp}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestCase> deleteTestCaseResultWithHttpInfo(@Param("fqn") String fqn, @Param("timestamp") Long timestamp);



  /**
   * Get a test case by Id
   * Get a TestCase by &#x60;Id&#x60;.
   * @param id Id of the test case (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return TestCase
   */
  @RequestLine("GET /v1/dataQuality/testCases/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  TestCase get3(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a test case by Id
   * Similar to <code>get3</code> but it also returns the http response headers .
   * Get a TestCase by &#x60;Id&#x60;.
   * @param id Id of the test case (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testCases/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestCase> get3WithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a test case by Id
   * Get a TestCase by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>get3</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Get3QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the test case (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return TestCase
   */
  @RequestLine("GET /v1/dataQuality/testCases/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  TestCase get3(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a test case by Id
  * Get a TestCase by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>get3</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the test case (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return TestCase
      */
      @RequestLine("GET /v1/dataQuality/testCases/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TestCase> get3WithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>get3</code> method in a fluent style.
   */
  public static class Get3QueryParams extends HashMap<String, Object> {
    public Get3QueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public Get3QueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the test case
   * Get a version of the test case by given &#x60;Id&#x60;
   * @param id Id of the test case (required)
   * @param version Test version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return TestCase
   */
  @RequestLine("GET /v1/dataQuality/testCases/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  TestCase getSpecificTestCaseVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the test case
   * Similar to <code>getSpecificTestCaseVersion</code> but it also returns the http response headers .
   * Get a version of the test case by given &#x60;Id&#x60;
   * @param id Id of the test case (required)
   * @param version Test version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testCases/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestCase> getSpecificTestCaseVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a test case by fully qualified name
   * Get a test case by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the test case (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return TestCase
   */
  @RequestLine("GET /v1/dataQuality/testCases/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  TestCase getTestCaseByName(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a test case by fully qualified name
   * Similar to <code>getTestCaseByName</code> but it also returns the http response headers .
   * Get a test case by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the test case (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testCases/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestCase> getTestCaseByNameWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a test case by fully qualified name
   * Get a test case by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getTestCaseByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTestCaseByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the test case (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return TestCase
   */
  @RequestLine("GET /v1/dataQuality/testCases/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  TestCase getTestCaseByName(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a test case by fully qualified name
  * Get a test case by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getTestCaseByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the test case (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return TestCase
      */
      @RequestLine("GET /v1/dataQuality/testCases/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TestCase> getTestCaseByNameWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTestCaseByName</code> method in a fluent style.
   */
  public static class GetTestCaseByNameQueryParams extends HashMap<String, Object> {
    public GetTestCaseByNameQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetTestCaseByNameQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List test case versions
   * Get a list of all the versions of a testCases identified by &#x60;Id&#x60;
   * @param id Id of the test case (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/dataQuality/testCases/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllTestCaseVersion(@Param("id") UUID id);

  /**
   * List test case versions
   * Similar to <code>listAllTestCaseVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a testCases identified by &#x60;Id&#x60;
   * @param id Id of the test case (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testCases/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllTestCaseVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List of test case results
   * Get a list of all the test case results for the given testCase id, optionally filtered by  &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fqn Fully qualified name of the test case (required)
   * @param startTs Filter testCase results after the given start timestamp (optional)
   * @param endTs Filter testCase results before the given end timestamp (optional)
   * @return TestCaseResultList
   */
  @RequestLine("GET /v1/dataQuality/testCases/{fqn}/testCaseResult?startTs={startTs}&endTs={endTs}")
  @Headers({
    "Accept: application/json",
  })
  TestCaseResultList listTestCaseResults(@Param("fqn") String fqn, @Param("startTs") BigDecimal startTs, @Param("endTs") BigDecimal endTs);

  /**
   * List of test case results
   * Similar to <code>listTestCaseResults</code> but it also returns the http response headers .
   * Get a list of all the test case results for the given testCase id, optionally filtered by  &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fqn Fully qualified name of the test case (required)
   * @param startTs Filter testCase results after the given start timestamp (optional)
   * @param endTs Filter testCase results before the given end timestamp (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testCases/{fqn}/testCaseResult?startTs={startTs}&endTs={endTs}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestCaseResultList> listTestCaseResultsWithHttpInfo(@Param("fqn") String fqn, @Param("startTs") BigDecimal startTs, @Param("endTs") BigDecimal endTs);


  /**
   * List of test case results
   * Get a list of all the test case results for the given testCase id, optionally filtered by  &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listTestCaseResults</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTestCaseResultsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the test case (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTs - Filter testCase results after the given start timestamp (optional)</li>
   *   <li>endTs - Filter testCase results before the given end timestamp (optional)</li>
   *   </ul>
   * @return TestCaseResultList
   */
  @RequestLine("GET /v1/dataQuality/testCases/{fqn}/testCaseResult?startTs={startTs}&endTs={endTs}")
  @Headers({
  "Accept: application/json",
  })
  TestCaseResultList listTestCaseResults(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List of test case results
  * Get a list of all the test case results for the given testCase id, optionally filtered by  &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listTestCaseResults</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the test case (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>startTs - Filter testCase results after the given start timestamp (optional)</li>
          *   <li>endTs - Filter testCase results before the given end timestamp (optional)</li>
      *   </ul>
          * @return TestCaseResultList
      */
      @RequestLine("GET /v1/dataQuality/testCases/{fqn}/testCaseResult?startTs={startTs}&endTs={endTs}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TestCaseResultList> listTestCaseResultsWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listTestCaseResults</code> method in a fluent style.
   */
  public static class ListTestCaseResultsQueryParams extends HashMap<String, Object> {
    public ListTestCaseResultsQueryParams startTs(final BigDecimal value) {
      put("startTs", EncodingUtils.encode(value));
      return this;
    }
    public ListTestCaseResultsQueryParams endTs(final BigDecimal value) {
      put("endTs", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List test cases
   * Get a list of test. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.Use the &#x60;testSuite&#x60; field to get the executable Test Suite linked to this test case or use the &#x60;testSuites&#x60; field to list test suites (executable and logical) linked.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number tests returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of tests before this cursor (optional)
   * @param after Returns list of tests after this cursor (optional)
   * @param entityLink Return list of tests by entity link (optional)
   * @param testSuiteId Returns list of tests filtered by the testSuite id (optional)
   * @param orderByLastExecutionDate Returns the list of tests ordered by the most recent execution date (optional, default to false)
   * @param includeAllTests Include all the tests at the entity level (optional, default to false)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return TestCaseList
   */
  @RequestLine("GET /v1/dataQuality/testCases?fields={fields}&limit={limit}&before={before}&after={after}&entityLink={entityLink}&testSuiteId={testSuiteId}&orderByLastExecutionDate={orderByLastExecutionDate}&includeAllTests={includeAllTests}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  TestCaseList listTestCases(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("entityLink") String entityLink, @Param("testSuiteId") String testSuiteId, @Param("orderByLastExecutionDate") Boolean orderByLastExecutionDate, @Param("includeAllTests") Boolean includeAllTests, @Param("include") String include);

  /**
   * List test cases
   * Similar to <code>listTestCases</code> but it also returns the http response headers .
   * Get a list of test. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.Use the &#x60;testSuite&#x60; field to get the executable Test Suite linked to this test case or use the &#x60;testSuites&#x60; field to list test suites (executable and logical) linked.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number tests returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of tests before this cursor (optional)
   * @param after Returns list of tests after this cursor (optional)
   * @param entityLink Return list of tests by entity link (optional)
   * @param testSuiteId Returns list of tests filtered by the testSuite id (optional)
   * @param orderByLastExecutionDate Returns the list of tests ordered by the most recent execution date (optional, default to false)
   * @param includeAllTests Include all the tests at the entity level (optional, default to false)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testCases?fields={fields}&limit={limit}&before={before}&after={after}&entityLink={entityLink}&testSuiteId={testSuiteId}&orderByLastExecutionDate={orderByLastExecutionDate}&includeAllTests={includeAllTests}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestCaseList> listTestCasesWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("entityLink") String entityLink, @Param("testSuiteId") String testSuiteId, @Param("orderByLastExecutionDate") Boolean orderByLastExecutionDate, @Param("includeAllTests") Boolean includeAllTests, @Param("include") String include);


  /**
   * List test cases
   * Get a list of test. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.Use the &#x60;testSuite&#x60; field to get the executable Test Suite linked to this test case or use the &#x60;testSuites&#x60; field to list test suites (executable and logical) linked.
   * Note, this is equivalent to the other <code>listTestCases</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTestCasesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number tests returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of tests before this cursor (optional)</li>
   *   <li>after - Returns list of tests after this cursor (optional)</li>
   *   <li>entityLink - Return list of tests by entity link (optional)</li>
   *   <li>testSuiteId - Returns list of tests filtered by the testSuite id (optional)</li>
   *   <li>orderByLastExecutionDate - Returns the list of tests ordered by the most recent execution date (optional, default to false)</li>
   *   <li>includeAllTests - Include all the tests at the entity level (optional, default to false)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return TestCaseList
   */
  @RequestLine("GET /v1/dataQuality/testCases?fields={fields}&limit={limit}&before={before}&after={after}&entityLink={entityLink}&testSuiteId={testSuiteId}&orderByLastExecutionDate={orderByLastExecutionDate}&includeAllTests={includeAllTests}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  TestCaseList listTestCases(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List test cases
  * Get a list of test. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.Use the &#x60;testSuite&#x60; field to get the executable Test Suite linked to this test case or use the &#x60;testSuites&#x60; field to list test suites (executable and logical) linked.
  * Note, this is equivalent to the other <code>listTestCases</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number tests returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of tests before this cursor (optional)</li>
          *   <li>after - Returns list of tests after this cursor (optional)</li>
          *   <li>entityLink - Return list of tests by entity link (optional)</li>
          *   <li>testSuiteId - Returns list of tests filtered by the testSuite id (optional)</li>
          *   <li>orderByLastExecutionDate - Returns the list of tests ordered by the most recent execution date (optional, default to false)</li>
          *   <li>includeAllTests - Include all the tests at the entity level (optional, default to false)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return TestCaseList
      */
      @RequestLine("GET /v1/dataQuality/testCases?fields={fields}&limit={limit}&before={before}&after={after}&entityLink={entityLink}&testSuiteId={testSuiteId}&orderByLastExecutionDate={orderByLastExecutionDate}&includeAllTests={includeAllTests}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TestCaseList> listTestCasesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listTestCases</code> method in a fluent style.
   */
  public static class ListTestCasesQueryParams extends HashMap<String, Object> {
    public ListTestCasesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListTestCasesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListTestCasesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListTestCasesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListTestCasesQueryParams entityLink(final String value) {
      put("entityLink", EncodingUtils.encode(value));
      return this;
    }
    public ListTestCasesQueryParams testSuiteId(final String value) {
      put("testSuiteId", EncodingUtils.encode(value));
      return this;
    }
    public ListTestCasesQueryParams orderByLastExecutionDate(final Boolean value) {
      put("orderByLastExecutionDate", EncodingUtils.encode(value));
      return this;
    }
    public ListTestCasesQueryParams includeAllTests(final Boolean value) {
      put("includeAllTests", EncodingUtils.encode(value));
      return this;
    }
    public ListTestCasesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a test case
   * Update an existing test using JsonPatch.
   * @param id Id of the test case (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a test case Documentation</a>
   */
  @RequestLine("PATCH /v1/dataQuality/testCases/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchTest(@Param("id") UUID id, Object body);

  /**
   * Update a test case
   * Similar to <code>patchTest</code> but it also returns the http response headers .
   * Update an existing test using JsonPatch.
   * @param id Id of the test case (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a test case Documentation</a>
   */
  @RequestLine("PATCH /v1/dataQuality/testCases/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchTestWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Update a test case result
   * Update an existing test case using JsonPatch.
   * @param fqn fqn of the test case (required)
   * @param timestamp Timestamp of the testCase result (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a test case result Documentation</a>
   */
  @RequestLine("PATCH /v1/dataQuality/testCases/{fqn}/testCaseResult/{timestamp}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchTestCaseResult(@Param("fqn") String fqn, @Param("timestamp") Long timestamp, Object body);

  /**
   * Update a test case result
   * Similar to <code>patchTestCaseResult</code> but it also returns the http response headers .
   * Update an existing test case using JsonPatch.
   * @param fqn fqn of the test case (required)
   * @param timestamp Timestamp of the testCase result (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a test case result Documentation</a>
   */
  @RequestLine("PATCH /v1/dataQuality/testCases/{fqn}/testCaseResult/{timestamp}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchTestCaseResultWithHttpInfo(@Param("fqn") String fqn, @Param("timestamp") Long timestamp, Object body);



  /**
   * Restore a soft deleted test case
   * Restore a soft deleted test case.
   * @param restoreEntity  (optional)
   * @return TestCase
   */
  @RequestLine("PUT /v1/dataQuality/testCases/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestCase restore12(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted test case
   * Similar to <code>restore12</code> but it also returns the http response headers .
   * Restore a soft deleted test case.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dataQuality/testCases/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestCase> restore12WithHttpInfo(RestoreEntity restoreEntity);


}
