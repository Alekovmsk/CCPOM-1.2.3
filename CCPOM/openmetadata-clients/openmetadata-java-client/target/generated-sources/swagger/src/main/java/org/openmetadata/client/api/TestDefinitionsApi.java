package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateTestDefinition;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.TestDefinition;
import org.openmetadata.client.model.TestDefinitionList;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface TestDefinitionsApi extends ApiClient.Api {


  /**
   * Update test definition
   * Create a test definition, if it does not exist, or update an existing test definition.
   * @param createTestDefinition  (optional)
   * @return TestDefinition
   */
  @RequestLine("PUT /v1/dataQuality/testDefinitions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestDefinition createOrUpdateTestDefinition(CreateTestDefinition createTestDefinition);

  /**
   * Update test definition
   * Similar to <code>createOrUpdateTestDefinition</code> but it also returns the http response headers .
   * Create a test definition, if it does not exist, or update an existing test definition.
   * @param createTestDefinition  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dataQuality/testDefinitions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestDefinition> createOrUpdateTestDefinitionWithHttpInfo(CreateTestDefinition createTestDefinition);



  /**
   * Create a test definition
   * Create a Test definition.
   * @param createTestDefinition  (optional)
   * @return TestDefinition
   */
  @RequestLine("POST /v1/dataQuality/testDefinitions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestDefinition createTestDefinition(CreateTestDefinition createTestDefinition);

  /**
   * Create a test definition
   * Similar to <code>createTestDefinition</code> but it also returns the http response headers .
   * Create a Test definition.
   * @param createTestDefinition  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/dataQuality/testDefinitions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestDefinition> createTestDefinitionWithHttpInfo(CreateTestDefinition createTestDefinition);



  /**
   * Delete a test definition
   * Delete a test definition by &#x60;id&#x60;.
   * @param id Id of the test definition (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testDefinitions/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTestDefinition(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a test definition
   * Similar to <code>deleteTestDefinition</code> but it also returns the http response headers .
   * Delete a test definition by &#x60;id&#x60;.
   * @param id Id of the test definition (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testDefinitions/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTestDefinitionWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a test definition
   * Delete a test definition by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteTestDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTestDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the test definition (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dataQuality/testDefinitions/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTestDefinition(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a test definition
  * Delete a test definition by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteTestDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the test definition (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dataQuality/testDefinitions/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTestDefinitionWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTestDefinition</code> method in a fluent style.
   */
  public static class DeleteTestDefinitionQueryParams extends HashMap<String, Object> {
    public DeleteTestDefinitionQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a test definition
   * Delete a test definition by &#x60;name&#x60;.
   * @param name Name of the test definition (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testDefinitions/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTestDefinitionByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a test definition
   * Similar to <code>deleteTestDefinitionByName</code> but it also returns the http response headers .
   * Delete a test definition by &#x60;name&#x60;.
   * @param name Name of the test definition (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dataQuality/testDefinitions/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTestDefinitionByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a test definition
   * Delete a test definition by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>deleteTestDefinitionByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTestDefinitionByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the test definition (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dataQuality/testDefinitions/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTestDefinitionByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a test definition
  * Delete a test definition by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>deleteTestDefinitionByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the test definition (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dataQuality/testDefinitions/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTestDefinitionByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTestDefinitionByName</code> method in a fluent style.
   */
  public static class DeleteTestDefinitionByNameQueryParams extends HashMap<String, Object> {
    public DeleteTestDefinitionByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a test definition by Id
   * Get a Test Definition by &#x60;Id&#x60;.
   * @param id Id of the test definition (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return TestDefinition
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  TestDefinition get4(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a test definition by Id
   * Similar to <code>get4</code> but it also returns the http response headers .
   * Get a Test Definition by &#x60;Id&#x60;.
   * @param id Id of the test definition (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestDefinition> get4WithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a test definition by Id
   * Get a Test Definition by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>get4</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Get4QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the test definition (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return TestDefinition
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  TestDefinition get4(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a test definition by Id
  * Get a Test Definition by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>get4</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the test definition (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return TestDefinition
      */
      @RequestLine("GET /v1/dataQuality/testDefinitions/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TestDefinition> get4WithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>get4</code> method in a fluent style.
   */
  public static class Get4QueryParams extends HashMap<String, Object> {
    public Get4QueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public Get4QueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the test definition
   * Get a version of the test definition by given &#x60;Id&#x60;
   * @param id Id of the test definition (required)
   * @param version Test Definition version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return TestDefinition
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  TestDefinition getSpecificTestDefinitionVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the test definition
   * Similar to <code>getSpecificTestDefinitionVersion</code> but it also returns the http response headers .
   * Get a version of the test definition by given &#x60;Id&#x60;
   * @param id Id of the test definition (required)
   * @param version Test Definition version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestDefinition> getSpecificTestDefinitionVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a test definition by name
   * Get a test definition by &#x60;name&#x60;.
   * @param name Name of the test definition (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return TestDefinition
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  TestDefinition getTestDefinitionByName(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a test definition by name
   * Similar to <code>getTestDefinitionByName</code> but it also returns the http response headers .
   * Get a test definition by &#x60;name&#x60;.
   * @param name Name of the test definition (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestDefinition> getTestDefinitionByNameWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a test definition by name
   * Get a test definition by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getTestDefinitionByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTestDefinitionByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the test definition (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return TestDefinition
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  TestDefinition getTestDefinitionByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a test definition by name
  * Get a test definition by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getTestDefinitionByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the test definition (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return TestDefinition
      */
      @RequestLine("GET /v1/dataQuality/testDefinitions/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TestDefinition> getTestDefinitionByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTestDefinitionByName</code> method in a fluent style.
   */
  public static class GetTestDefinitionByNameQueryParams extends HashMap<String, Object> {
    public GetTestDefinitionByNameQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetTestDefinitionByNameQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List test definition versions
   * Get a list of all the versions of a test definition identified by &#x60;Id&#x60;
   * @param id Id of the test definition (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllTestDefinitionVersion(@Param("id") UUID id);

  /**
   * List test definition versions
   * Similar to <code>listAllTestDefinitionVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a test definition identified by &#x60;Id&#x60;
   * @param id Id of the test definition (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllTestDefinitionVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List test definitions
   * Get a list of test definitions, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number test definitions returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of test definitions before this cursor (optional)
   * @param after Returns list of test definitions after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @param entityType Filter by entityType. (optional)
   * @param testPlatform Filter by a test platform (optional)
   * @param supportedDataType Filter tests definition by supported data type (optional)
   * @return TestDefinitionList
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions?fields={fields}&limit={limit}&before={before}&after={after}&include={include}&entityType={entityType}&testPlatform={testPlatform}&supportedDataType={supportedDataType}")
  @Headers({
    "Accept: application/json",
  })
  TestDefinitionList listTestDefinitions(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include, @Param("entityType") String entityType, @Param("testPlatform") String testPlatform, @Param("supportedDataType") String supportedDataType);

  /**
   * List test definitions
   * Similar to <code>listTestDefinitions</code> but it also returns the http response headers .
   * Get a list of test definitions, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number test definitions returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of test definitions before this cursor (optional)
   * @param after Returns list of test definitions after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @param entityType Filter by entityType. (optional)
   * @param testPlatform Filter by a test platform (optional)
   * @param supportedDataType Filter tests definition by supported data type (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions?fields={fields}&limit={limit}&before={before}&after={after}&include={include}&entityType={entityType}&testPlatform={testPlatform}&supportedDataType={supportedDataType}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestDefinitionList> listTestDefinitionsWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include, @Param("entityType") String entityType, @Param("testPlatform") String testPlatform, @Param("supportedDataType") String supportedDataType);


  /**
   * List test definitions
   * Get a list of test definitions, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listTestDefinitions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTestDefinitionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number test definitions returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of test definitions before this cursor (optional)</li>
   *   <li>after - Returns list of test definitions after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   <li>entityType - Filter by entityType. (optional)</li>
   *   <li>testPlatform - Filter by a test platform (optional)</li>
   *   <li>supportedDataType - Filter tests definition by supported data type (optional)</li>
   *   </ul>
   * @return TestDefinitionList
   */
  @RequestLine("GET /v1/dataQuality/testDefinitions?fields={fields}&limit={limit}&before={before}&after={after}&include={include}&entityType={entityType}&testPlatform={testPlatform}&supportedDataType={supportedDataType}")
  @Headers({
  "Accept: application/json",
  })
  TestDefinitionList listTestDefinitions(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List test definitions
  * Get a list of test definitions, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listTestDefinitions</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number test definitions returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of test definitions before this cursor (optional)</li>
          *   <li>after - Returns list of test definitions after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
          *   <li>entityType - Filter by entityType. (optional)</li>
          *   <li>testPlatform - Filter by a test platform (optional)</li>
          *   <li>supportedDataType - Filter tests definition by supported data type (optional)</li>
      *   </ul>
          * @return TestDefinitionList
      */
      @RequestLine("GET /v1/dataQuality/testDefinitions?fields={fields}&limit={limit}&before={before}&after={after}&include={include}&entityType={entityType}&testPlatform={testPlatform}&supportedDataType={supportedDataType}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TestDefinitionList> listTestDefinitionsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listTestDefinitions</code> method in a fluent style.
   */
  public static class ListTestDefinitionsQueryParams extends HashMap<String, Object> {
    public ListTestDefinitionsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListTestDefinitionsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListTestDefinitionsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListTestDefinitionsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListTestDefinitionsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
    public ListTestDefinitionsQueryParams entityType(final String value) {
      put("entityType", EncodingUtils.encode(value));
      return this;
    }
    public ListTestDefinitionsQueryParams testPlatform(final String value) {
      put("testPlatform", EncodingUtils.encode(value));
      return this;
    }
    public ListTestDefinitionsQueryParams supportedDataType(final String value) {
      put("supportedDataType", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a test definition
   * Update an existing Test Definition using JsonPatch.
   * @param id Id of the test definition (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a test definition Documentation</a>
   */
  @RequestLine("PATCH /v1/dataQuality/testDefinitions/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchTestDefinition(@Param("id") UUID id, Object body);

  /**
   * Update a test definition
   * Similar to <code>patchTestDefinition</code> but it also returns the http response headers .
   * Update an existing Test Definition using JsonPatch.
   * @param id Id of the test definition (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a test definition Documentation</a>
   */
  @RequestLine("PATCH /v1/dataQuality/testDefinitions/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchTestDefinitionWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted test definition
   * Restore a soft deleted TestDefinition.
   * @param restoreEntity  (optional)
   * @return TestDefinition
   */
  @RequestLine("PUT /v1/dataQuality/testDefinitions/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TestDefinition restore13(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted test definition
   * Similar to <code>restore13</code> but it also returns the http response headers .
   * Restore a soft deleted TestDefinition.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dataQuality/testDefinitions/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TestDefinition> restore13WithHttpInfo(RestoreEntity restoreEntity);


}
