package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreatePipelineService;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.PipelineService;
import org.openmetadata.client.model.PipelineServiceList;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.TestConnectionResult;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface PipelineServicesApi extends ApiClient.Api {


  /**
   * Add test connection result
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return DatabaseService
   */
  @RequestLine("PUT /v1/services/pipelineServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseService addTestConnectionResult5(@Param("id") UUID id, TestConnectionResult testConnectionResult);

  /**
   * Add test connection result
   * Similar to <code>addTestConnectionResult5</code> but it also returns the http response headers .
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/pipelineServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> addTestConnectionResult5WithHttpInfo(@Param("id") UUID id, TestConnectionResult testConnectionResult);



  /**
   * Update pipeline service
   * Create a new pipeline service or update an existing pipeline service identified by &#x60;id&#x60;.
   * @param createPipelineService  (optional)
   * @return PipelineService
   */
  @RequestLine("PUT /v1/services/pipelineServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PipelineService createOrUpdatePipelineService(CreatePipelineService createPipelineService);

  /**
   * Update pipeline service
   * Similar to <code>createOrUpdatePipelineService</code> but it also returns the http response headers .
   * Create a new pipeline service or update an existing pipeline service identified by &#x60;id&#x60;.
   * @param createPipelineService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/pipelineServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PipelineService> createOrUpdatePipelineServiceWithHttpInfo(CreatePipelineService createPipelineService);



  /**
   * Create a pipeline service
   * Create a new pipeline service.
   * @param createPipelineService  (optional)
   * @return PipelineService
   */
  @RequestLine("POST /v1/services/pipelineServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PipelineService createPipelineService(CreatePipelineService createPipelineService);

  /**
   * Create a pipeline service
   * Similar to <code>createPipelineService</code> but it also returns the http response headers .
   * Create a new pipeline service.
   * @param createPipelineService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/services/pipelineServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PipelineService> createPipelineServiceWithHttpInfo(CreatePipelineService createPipelineService);



  /**
   * Delete a pipeline service by Id
   * Delete a pipeline services. If pipelines (and tasks) belong to the service, it can&#39;t be deleted.
   * @param id Id of the pipeline service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/pipelineServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deletePipelineService(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a pipeline service by Id
   * Similar to <code>deletePipelineService</code> but it also returns the http response headers .
   * Delete a pipeline services. If pipelines (and tasks) belong to the service, it can&#39;t be deleted.
   * @param id Id of the pipeline service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/pipelineServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePipelineServiceWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a pipeline service by Id
   * Delete a pipeline services. If pipelines (and tasks) belong to the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deletePipelineService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePipelineServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the pipeline service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/pipelineServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deletePipelineService(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a pipeline service by Id
  * Delete a pipeline services. If pipelines (and tasks) belong to the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deletePipelineService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the pipeline service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/pipelineServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deletePipelineServiceWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePipelineService</code> method in a fluent style.
   */
  public static class DeletePipelineServiceQueryParams extends HashMap<String, Object> {
    public DeletePipelineServiceQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeletePipelineServiceQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a pipeline service by fully qualified name
   * Delete a pipeline services by &#x60;fullyQualifiedName&#x60;. If pipelines (and tasks) belong to the service, it can&#39;t be deleted.
   * @param fqn Fully qualified name of the pipeline service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/pipelineServices/name/{fqn}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deletePipelineServiceByName(@Param("fqn") String fqn, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a pipeline service by fully qualified name
   * Similar to <code>deletePipelineServiceByName</code> but it also returns the http response headers .
   * Delete a pipeline services by &#x60;fullyQualifiedName&#x60;. If pipelines (and tasks) belong to the service, it can&#39;t be deleted.
   * @param fqn Fully qualified name of the pipeline service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/pipelineServices/name/{fqn}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePipelineServiceByNameWithHttpInfo(@Param("fqn") String fqn, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a pipeline service by fully qualified name
   * Delete a pipeline services by &#x60;fullyQualifiedName&#x60;. If pipelines (and tasks) belong to the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deletePipelineServiceByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePipelineServiceByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the pipeline service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/pipelineServices/name/{fqn}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deletePipelineServiceByName(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a pipeline service by fully qualified name
  * Delete a pipeline services by &#x60;fullyQualifiedName&#x60;. If pipelines (and tasks) belong to the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deletePipelineServiceByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the pipeline service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/pipelineServices/name/{fqn}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deletePipelineServiceByNameWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePipelineServiceByName</code> method in a fluent style.
   */
  public static class DeletePipelineServiceByNameQueryParams extends HashMap<String, Object> {
    public DeletePipelineServiceByNameQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeletePipelineServiceByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get pipeline service by fully qualified name
   * Get a pipeline service by the service &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the pipeline service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return PipelineService
   */
  @RequestLine("GET /v1/services/pipelineServices/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  PipelineService getPipelineServiceByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get pipeline service by fully qualified name
   * Similar to <code>getPipelineServiceByFQN</code> but it also returns the http response headers .
   * Get a pipeline service by the service &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the pipeline service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/pipelineServices/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PipelineService> getPipelineServiceByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get pipeline service by fully qualified name
   * Get a pipeline service by the service &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getPipelineServiceByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPipelineServiceByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the pipeline service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return PipelineService
   */
  @RequestLine("GET /v1/services/pipelineServices/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  PipelineService getPipelineServiceByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get pipeline service by fully qualified name
  * Get a pipeline service by the service &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getPipelineServiceByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the pipeline service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return PipelineService
      */
      @RequestLine("GET /v1/services/pipelineServices/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PipelineService> getPipelineServiceByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPipelineServiceByFQN</code> method in a fluent style.
   */
  public static class GetPipelineServiceByFQNQueryParams extends HashMap<String, Object> {
    public GetPipelineServiceByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineServiceByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a pipeline service by Id
   * Get a pipeline service by &#x60;Id&#x60;.
   * @param id Id of the pipeline service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return PipelineService
   */
  @RequestLine("GET /v1/services/pipelineServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  PipelineService getPipelineServiceByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a pipeline service by Id
   * Similar to <code>getPipelineServiceByID</code> but it also returns the http response headers .
   * Get a pipeline service by &#x60;Id&#x60;.
   * @param id Id of the pipeline service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/pipelineServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PipelineService> getPipelineServiceByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a pipeline service by Id
   * Get a pipeline service by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getPipelineServiceByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPipelineServiceByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the pipeline service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return PipelineService
   */
  @RequestLine("GET /v1/services/pipelineServices/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  PipelineService getPipelineServiceByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a pipeline service by Id
  * Get a pipeline service by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getPipelineServiceByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the pipeline service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return PipelineService
      */
      @RequestLine("GET /v1/services/pipelineServices/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PipelineService> getPipelineServiceByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPipelineServiceByID</code> method in a fluent style.
   */
  public static class GetPipelineServiceByIDQueryParams extends HashMap<String, Object> {
    public GetPipelineServiceByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineServiceByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the pipeline service
   * Get a version of the pipeline service by given &#x60;Id&#x60;
   * @param id Id of the pipeline service (required)
   * @param version pipeline service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return PipelineService
   */
  @RequestLine("GET /v1/services/pipelineServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  PipelineService getSpecificPipelineService(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the pipeline service
   * Similar to <code>getSpecificPipelineService</code> but it also returns the http response headers .
   * Get a version of the pipeline service by given &#x60;Id&#x60;
   * @param id Id of the pipeline service (required)
   * @param version pipeline service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/pipelineServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PipelineService> getSpecificPipelineServiceWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List pipeline service versions
   * Get a list of all the versions of a pipeline service identified by &#x60;Id&#x60;
   * @param id Id of the pipeline service (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/services/pipelineServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllPipelineServiceVersion(@Param("id") UUID id);

  /**
   * List pipeline service versions
   * Similar to <code>listAllPipelineServiceVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a pipeline service identified by &#x60;Id&#x60;
   * @param id Id of the pipeline service (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/pipelineServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllPipelineServiceVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List pipeline services
   * Get a list of pipeline services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit Limit number services returned. (1 to 1000000, default 10) (optional, default to 10)
   * @param before Returns list of services before this cursor (optional)
   * @param after Returns list of services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return PipelineServiceList
   */
  @RequestLine("GET /v1/services/pipelineServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  PipelineServiceList listPipelineService(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List pipeline services
   * Similar to <code>listPipelineService</code> but it also returns the http response headers .
   * Get a list of pipeline services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit Limit number services returned. (1 to 1000000, default 10) (optional, default to 10)
   * @param before Returns list of services before this cursor (optional)
   * @param after Returns list of services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/pipelineServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PipelineServiceList> listPipelineServiceWithHttpInfo(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List pipeline services
   * Get a list of pipeline services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listPipelineService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPipelineServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>domain - Filter services by domain (optional)</li>
   *   <li>limit - Limit number services returned. (1 to 1000000, default 10) (optional, default to 10)</li>
   *   <li>before - Returns list of services before this cursor (optional)</li>
   *   <li>after - Returns list of services after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return PipelineServiceList
   */
  @RequestLine("GET /v1/services/pipelineServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  PipelineServiceList listPipelineService(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List pipeline services
  * Get a list of pipeline services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listPipelineService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>domain - Filter services by domain (optional)</li>
          *   <li>limit - Limit number services returned. (1 to 1000000, default 10) (optional, default to 10)</li>
          *   <li>before - Returns list of services before this cursor (optional)</li>
          *   <li>after - Returns list of services after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return PipelineServiceList
      */
      @RequestLine("GET /v1/services/pipelineServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PipelineServiceList> listPipelineServiceWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listPipelineService</code> method in a fluent style.
   */
  public static class ListPipelineServiceQueryParams extends HashMap<String, Object> {
    public ListPipelineServiceQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListPipelineServiceQueryParams domain(final String value) {
      put("domain", EncodingUtils.encode(value));
      return this;
    }
    public ListPipelineServiceQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListPipelineServiceQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListPipelineServiceQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListPipelineServiceQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a pipeline service
   * Update an existing pipeline service using JsonPatch.
   * @param id Id of the pipeline service (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a pipeline service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/pipelineServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchPipelineService(@Param("id") UUID id, Object body);

  /**
   * Update a pipeline service
   * Similar to <code>patchPipelineService</code> but it also returns the http response headers .
   * Update an existing pipeline service using JsonPatch.
   * @param id Id of the pipeline service (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a pipeline service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/pipelineServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchPipelineServiceWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted pipeline service.
   * Restore a soft deleted pipeline service.
   * @param restoreEntity  (optional)
   * @return PipelineService
   */
  @RequestLine("PUT /v1/services/pipelineServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PipelineService restore29(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted pipeline service.
   * Similar to <code>restore29</code> but it also returns the http response headers .
   * Restore a soft deleted pipeline service.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/pipelineServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PipelineService> restore29WithHttpInfo(RestoreEntity restoreEntity);


}
