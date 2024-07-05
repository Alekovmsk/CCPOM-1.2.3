package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateTestSuite;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.TestSuite;
import org.openmetadata.client.model.TestSuiteList;
import org.openmetadata.client.model.TestSummary;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface TestSuitesApi extends ApiClient.Api {


  /**
   * Create an executable test suite
   * Create an executable test suite.
   * @param createTestSuite  (optional)
   * @return TestSuite
   */
  @RequestLine("POST /v1/dataQuality/testSuites/executable")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestSuite createExecutableTestSuite(CreateTestSuite createTestSuite);

  /**
   * Create an executable test suite
   * Similar to <code>createExecutableTestSuite</code> but it also returns the http response headers .
   * Create an executable test suite.
   * @param createTestSuite  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/dataQuality/testSuites/executable")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestSuite> createExecutableTestSuiteWithHttpInfo(CreateTestSuite createTestSuite);



  /**
   * Create a logical test suite
   * Create a logical test suite.
   * @param createTestSuite  (optional)
   * @return TestSuite
   */
  @RequestLine("POST /v1/dataQuality/testSuites")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestSuite createLogicalTestSuite(CreateTestSuite createTestSuite);

  /**
   * Create a logical test suite
   * Similar to <code>createLogicalTestSuite</code> but it also returns the http response headers .
   * Create a logical test suite.
   * @param createTestSuite  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/dataQuality/testSuites")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestSuite> createLogicalTestSuiteWithHttpInfo(CreateTestSuite createTestSuite);



  /**
   * Create or Update Executable test suite
   * Create an Executable TestSuite if it does not exist or update an existing one.
   * @param createTestSuite  (optional)
   * @return TestSuite
   */
  @RequestLine("PUT /v1/dataQuality/testSuites/executable")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestSuite createOrUpdateExecutableTestSuite(CreateTestSuite createTestSuite);

  /**
   * Create or Update Executable test suite
   * Similar to <code>createOrUpdateExecutableTestSuite</code> but it also returns the http response headers .
   * Create an Executable TestSuite if it does not exist or update an existing one.
   * @param createTestSuite  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dataQuality/testSuites/executable")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestSuite> createOrUpdateExecutableTestSuiteWithHttpInfo(CreateTestSuite createTestSuite);



  /**
   * Update logical test suite
   * Create a logical TestSuite, if it does not exist or update an existing test suite.
   * @param createTestSuite  (optional)
   * @return TestSuite
   */
  @RequestLine("PUT /v1/dataQuality/testSuites")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestSuite createOrUpdateLogicalTestSuite(CreateTestSuite createTestSuite);

  /**
   * Update logical test suite
   * Similar to <code>createOrUpdateLogicalTestSuite</code> but it also returns the http response headers .
   * Create a logical TestSuite, if it does not exist or update an existing test suite.
   * @param createTestSuite  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dataQuality/testSuites")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestSuite> createOrUpdateLogicalTestSuiteWithHttpInfo(CreateTestSuite createTestSuite);



  /**
   * Delete a logical test suite
   * Delete a logical test suite by &#x60;name&#x60;.
   * @param name FQN of the logical test suite (required)
   * @param hardDelete Hard delete the logical entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testSuites/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteLogicalTestSuite(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a logical test suite
   * Similar to <code>deleteLogicalTestSuite</code> but it also returns the http response headers .
   * Delete a logical test suite by &#x60;name&#x60;.
   * @param name FQN of the logical test suite (required)
   * @param hardDelete Hard delete the logical entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testSuites/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteLogicalTestSuiteWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a logical test suite
   * Delete a logical test suite by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>deleteLogicalTestSuite</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteLogicalTestSuiteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name FQN of the logical test suite (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the logical entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dataQuality/testSuites/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteLogicalTestSuite(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a logical test suite
  * Delete a logical test suite by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>deleteLogicalTestSuite</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name FQN of the logical test suite (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the logical entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dataQuality/testSuites/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteLogicalTestSuiteWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteLogicalTestSuite</code> method in a fluent style.
   */
  public static class DeleteLogicalTestSuiteQueryParams extends HashMap<String, Object> {
    public DeleteLogicalTestSuiteQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a logical test suite
   * Delete a logical test suite by &#x60;id&#x60;.
   * @param id Id of the logical test suite (required)
   * @param hardDelete Hard delete the logical entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testSuites/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteLogicalTestSuite1(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a logical test suite
   * Similar to <code>deleteLogicalTestSuite1</code> but it also returns the http response headers .
   * Delete a logical test suite by &#x60;id&#x60;.
   * @param id Id of the logical test suite (required)
   * @param hardDelete Hard delete the logical entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testSuites/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteLogicalTestSuite1WithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a logical test suite
   * Delete a logical test suite by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteLogicalTestSuite1</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteLogicalTestSuite1QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the logical test suite (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the logical entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dataQuality/testSuites/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteLogicalTestSuite1(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a logical test suite
  * Delete a logical test suite by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteLogicalTestSuite1</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the logical test suite (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the logical entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dataQuality/testSuites/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteLogicalTestSuite1WithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteLogicalTestSuite1</code> method in a fluent style.
   */
  public static class DeleteLogicalTestSuite1QueryParams extends HashMap<String, Object> {
    public DeleteLogicalTestSuite1QueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a test suite
   * Delete a test suite by &#x60;Id&#x60;.
   * @param id Id of the test suite (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testSuites/executable/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTestSuite(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a test suite
   * Similar to <code>deleteTestSuite</code> but it also returns the http response headers .
   * Delete a test suite by &#x60;Id&#x60;.
   * @param id Id of the test suite (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testSuites/executable/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTestSuiteWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a test suite
   * Delete a test suite by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deleteTestSuite</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTestSuiteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the test suite (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dataQuality/testSuites/executable/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTestSuite(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a test suite
  * Delete a test suite by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deleteTestSuite</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the test suite (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dataQuality/testSuites/executable/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTestSuiteWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTestSuite</code> method in a fluent style.
   */
  public static class DeleteTestSuiteQueryParams extends HashMap<String, Object> {
    public DeleteTestSuiteQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteTestSuiteQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a test suite
   * Delete a test suite by &#x60;name&#x60;.
   * @param name Name of the test suite (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testSuites/executable/name/{name}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTestSuiteByName(@Param("name") String name, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a test suite
   * Similar to <code>deleteTestSuiteByName</code> but it also returns the http response headers .
   * Delete a test suite by &#x60;name&#x60;.
   * @param name Name of the test suite (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testSuites/executable/name/{name}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTestSuiteByNameWithHttpInfo(@Param("name") String name, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a test suite
   * Delete a test suite by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>deleteTestSuiteByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTestSuiteByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the test suite (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dataQuality/testSuites/executable/name/{name}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTestSuiteByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a test suite
  * Delete a test suite by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>deleteTestSuiteByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the test suite (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dataQuality/testSuites/executable/name/{name}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTestSuiteByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTestSuiteByName</code> method in a fluent style.
   */
  public static class DeleteTestSuiteByNameQueryParams extends HashMap<String, Object> {
    public DeleteTestSuiteByNameQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteTestSuiteByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a test suite by Id
   * Get a Test Suite by &#x60;Id&#x60;.
   * @param id Id of the test suite (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return TestSuite
   */
  @RequestLine("GET /v1/dataQuality/testSuites/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  TestSuite get5(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a test suite by Id
   * Similar to <code>get5</code> but it also returns the http response headers .
   * Get a Test Suite by &#x60;Id&#x60;.
   * @param id Id of the test suite (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testSuites/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestSuite> get5WithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a test suite by Id
   * Get a Test Suite by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>get5</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Get5QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the test suite (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return TestSuite
   */
  @RequestLine("GET /v1/dataQuality/testSuites/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  TestSuite get5(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a test suite by Id
  * Get a Test Suite by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>get5</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the test suite (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return TestSuite
      */
      @RequestLine("GET /v1/dataQuality/testSuites/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TestSuite> get5WithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>get5</code> method in a fluent style.
   */
  public static class Get5QueryParams extends HashMap<String, Object> {
    public Get5QueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public Get5QueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get the execution summary of test suites
   * Get the execution summary of test suites.
   * @param testSuiteId get summary for a specific test suite (optional)
   * @return TestSummary
   */
  @RequestLine("GET /v1/dataQuality/testSuites/executionSummary?testSuiteId={testSuiteId}")
  @Headers({
    "Accept: application/json",
  })
  TestSummary getExecutionSummaryOfTestSuites(@Param("testSuiteId") UUID testSuiteId);

  /**
   * Get the execution summary of test suites
   * Similar to <code>getExecutionSummaryOfTestSuites</code> but it also returns the http response headers .
   * Get the execution summary of test suites.
   * @param testSuiteId get summary for a specific test suite (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testSuites/executionSummary?testSuiteId={testSuiteId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestSummary> getExecutionSummaryOfTestSuitesWithHttpInfo(@Param("testSuiteId") UUID testSuiteId);


  /**
   * Get the execution summary of test suites
   * Get the execution summary of test suites.
   * Note, this is equivalent to the other <code>getExecutionSummaryOfTestSuites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetExecutionSummaryOfTestSuitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>testSuiteId - get summary for a specific test suite (optional)</li>
   *   </ul>
   * @return TestSummary
   */
  @RequestLine("GET /v1/dataQuality/testSuites/executionSummary?testSuiteId={testSuiteId}")
  @Headers({
  "Accept: application/json",
  })
  TestSummary getExecutionSummaryOfTestSuites(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get the execution summary of test suites
  * Get the execution summary of test suites.
  * Note, this is equivalent to the other <code>getExecutionSummaryOfTestSuites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>testSuiteId - get summary for a specific test suite (optional)</li>
      *   </ul>
          * @return TestSummary
      */
      @RequestLine("GET /v1/dataQuality/testSuites/executionSummary?testSuiteId={testSuiteId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TestSummary> getExecutionSummaryOfTestSuitesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getExecutionSummaryOfTestSuites</code> method in a fluent style.
   */
  public static class GetExecutionSummaryOfTestSuitesQueryParams extends HashMap<String, Object> {
    public GetExecutionSummaryOfTestSuitesQueryParams testSuiteId(final UUID value) {
      put("testSuiteId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the test suite
   * Get a version of the test suite by given &#x60;id&#x60;
   * @param id Id of the test suite (required)
   * @param version Test Suite version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return TestSuite
   */
  @RequestLine("GET /v1/dataQuality/testSuites/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  TestSuite getSpecificTestSuiteVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the test suite
   * Similar to <code>getSpecificTestSuiteVersion</code> but it also returns the http response headers .
   * Get a version of the test suite by given &#x60;id&#x60;
   * @param id Id of the test suite (required)
   * @param version Test Suite version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testSuites/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestSuite> getSpecificTestSuiteVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a test suite by name
   * Get a test suite by  name.
   * @param name Name of the test suite (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return TestSuite
   */
  @RequestLine("GET /v1/dataQuality/testSuites/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  TestSuite getTestSuiteByName(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a test suite by name
   * Similar to <code>getTestSuiteByName</code> but it also returns the http response headers .
   * Get a test suite by  name.
   * @param name Name of the test suite (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testSuites/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestSuite> getTestSuiteByNameWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a test suite by name
   * Get a test suite by  name.
   * Note, this is equivalent to the other <code>getTestSuiteByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTestSuiteByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the test suite (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return TestSuite
   */
  @RequestLine("GET /v1/dataQuality/testSuites/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  TestSuite getTestSuiteByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a test suite by name
  * Get a test suite by  name.
  * Note, this is equivalent to the other <code>getTestSuiteByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the test suite (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return TestSuite
      */
      @RequestLine("GET /v1/dataQuality/testSuites/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TestSuite> getTestSuiteByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTestSuiteByName</code> method in a fluent style.
   */
  public static class GetTestSuiteByNameQueryParams extends HashMap<String, Object> {
    public GetTestSuiteByNameQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetTestSuiteByNameQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List test suite versions
   * Get a list of all the versions of a test suite identified by &#x60;id&#x60;
   * @param id Id of the test suite (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/dataQuality/testSuites/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllTestSuiteVersion(@Param("id") UUID id);

  /**
   * List test suite versions
   * Similar to <code>listAllTestSuiteVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a test suite identified by &#x60;id&#x60;
   * @param id Id of the test suite (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testSuites/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllTestSuiteVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List test suites
   * Get a list of test suites. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number test definitions returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param testSuiteType Returns executable or logical test suites. If omitted, returns all test suites. (optional)
   * @param before Returns list of test definitions before this cursor (optional)
   * @param after Returns list of test definitions after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return TestSuiteList
   */
  @RequestLine("GET /v1/dataQuality/testSuites?fields={fields}&limit={limit}&testSuiteType={testSuiteType}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  TestSuiteList listTestSuites(@Param("fields") String fields, @Param("limit") Integer limit, @Param("testSuiteType") String testSuiteType, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List test suites
   * Similar to <code>listTestSuites</code> but it also returns the http response headers .
   * Get a list of test suites. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number test definitions returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param testSuiteType Returns executable or logical test suites. If omitted, returns all test suites. (optional)
   * @param before Returns list of test definitions before this cursor (optional)
   * @param after Returns list of test definitions after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testSuites?fields={fields}&limit={limit}&testSuiteType={testSuiteType}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestSuiteList> listTestSuitesWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("testSuiteType") String testSuiteType, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List test suites
   * Get a list of test suites. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listTestSuites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTestSuitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number test definitions returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>testSuiteType - Returns executable or logical test suites. If omitted, returns all test suites. (optional)</li>
   *   <li>before - Returns list of test definitions before this cursor (optional)</li>
   *   <li>after - Returns list of test definitions after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return TestSuiteList
   */
  @RequestLine("GET /v1/dataQuality/testSuites?fields={fields}&limit={limit}&testSuiteType={testSuiteType}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  TestSuiteList listTestSuites(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List test suites
  * Get a list of test suites. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listTestSuites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number test definitions returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>testSuiteType - Returns executable or logical test suites. If omitted, returns all test suites. (optional)</li>
          *   <li>before - Returns list of test definitions before this cursor (optional)</li>
          *   <li>after - Returns list of test definitions after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return TestSuiteList
      */
      @RequestLine("GET /v1/dataQuality/testSuites?fields={fields}&limit={limit}&testSuiteType={testSuiteType}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TestSuiteList> listTestSuitesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listTestSuites</code> method in a fluent style.
   */
  public static class ListTestSuitesQueryParams extends HashMap<String, Object> {
    public ListTestSuitesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListTestSuitesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListTestSuitesQueryParams testSuiteType(final String value) {
      put("testSuiteType", EncodingUtils.encode(value));
      return this;
    }
    public ListTestSuitesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListTestSuitesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListTestSuitesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a test suite
   * Update an existing testSuite using JsonPatch.
   * @param id Id of the test suite (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a test suite Documentation</a>
   */
  @RequestLine("PATCH /v1/dataQuality/testSuites/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchTestSuite(@Param("id") UUID id, Object body);

  /**
   * Update a test suite
   * Similar to <code>patchTestSuite</code> but it also returns the http response headers .
   * Update an existing testSuite using JsonPatch.
   * @param id Id of the test suite (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a test suite Documentation</a>
   */
  @RequestLine("PATCH /v1/dataQuality/testSuites/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchTestSuiteWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted test suite
   * Restore a soft deleted test suite.
   * @param restoreEntity  (optional)
   * @return TestSuite
   */
  @RequestLine("PUT /v1/dataQuality/testSuites/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestSuite restore14(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted test suite
   * Similar to <code>restore14</code> but it also returns the http response headers .
   * Restore a soft deleted test suite.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dataQuality/testSuites/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestSuite> restore14WithHttpInfo(RestoreEntity restoreEntity);


}
