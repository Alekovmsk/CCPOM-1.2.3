package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateMlModelService;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.MlModelService;
import org.openmetadata.client.model.MlModelServiceList;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.TestConnectionResult;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface MlModelServicesApi extends ApiClient.Api {


  /**
   * Add test connection result
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return DatabaseService
   */
  @RequestLine("PUT /v1/services/mlmodelServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseService addTestConnectionResult4(@Param("id") UUID id, TestConnectionResult testConnectionResult);

  /**
   * Add test connection result
   * Similar to <code>addTestConnectionResult4</code> but it also returns the http response headers .
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/mlmodelServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> addTestConnectionResult4WithHttpInfo(@Param("id") UUID id, TestConnectionResult testConnectionResult);



  /**
   * Create an ML model service
   * Create a new mlModel service.
   * @param createMlModelService  (optional)
   * @return MlModelService
   */
  @RequestLine("POST /v1/services/mlmodelServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MlModelService createMlModelService(CreateMlModelService createMlModelService);

  /**
   * Create an ML model service
   * Similar to <code>createMlModelService</code> but it also returns the http response headers .
   * Create a new mlModel service.
   * @param createMlModelService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/services/mlmodelServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MlModelService> createMlModelServiceWithHttpInfo(CreateMlModelService createMlModelService);



  /**
   * Update ML model service
   * Create a new mlModel service or update an existing mlModel service identified by &#x60;Id&#x60;.
   * @param createMlModelService  (optional)
   * @return MlModelService
   */
  @RequestLine("PUT /v1/services/mlmodelServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MlModelService createOrUpdateMlModelService(CreateMlModelService createMlModelService);

  /**
   * Update ML model service
   * Similar to <code>createOrUpdateMlModelService</code> but it also returns the http response headers .
   * Create a new mlModel service or update an existing mlModel service identified by &#x60;Id&#x60;.
   * @param createMlModelService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/mlmodelServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MlModelService> createOrUpdateMlModelServiceWithHttpInfo(CreateMlModelService createMlModelService);



  /**
   * Delete an ML model service by Id
   * Delete a mlModel services. If mlModels (and tasks) belong to the service, it can&#39;t be deleted.
   * @param id Id of the ML Model service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/mlmodelServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteMlModelService(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete an ML model service by Id
   * Similar to <code>deleteMlModelService</code> but it also returns the http response headers .
   * Delete a mlModel services. If mlModels (and tasks) belong to the service, it can&#39;t be deleted.
   * @param id Id of the ML Model service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/mlmodelServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteMlModelServiceWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete an ML model service by Id
   * Delete a mlModel services. If mlModels (and tasks) belong to the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deleteMlModelService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMlModelServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the ML Model service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/mlmodelServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteMlModelService(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete an ML model service by Id
  * Delete a mlModel services. If mlModels (and tasks) belong to the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deleteMlModelService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the ML Model service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/mlmodelServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteMlModelServiceWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMlModelService</code> method in a fluent style.
   */
  public static class DeleteMlModelServiceQueryParams extends HashMap<String, Object> {
    public DeleteMlModelServiceQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteMlModelServiceQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete an ML model service by name
   * Delete a mlModel services by &#x60;name&#x60;. If mlModels (and tasks) belong to the service, it can&#39;t be deleted.
   * @param name Name of the ML Model service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/mlmodelServices/name/{name}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteMlModelServiceByName(@Param("name") String name, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete an ML model service by name
   * Similar to <code>deleteMlModelServiceByName</code> but it also returns the http response headers .
   * Delete a mlModel services by &#x60;name&#x60;. If mlModels (and tasks) belong to the service, it can&#39;t be deleted.
   * @param name Name of the ML Model service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/mlmodelServices/name/{name}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteMlModelServiceByNameWithHttpInfo(@Param("name") String name, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete an ML model service by name
   * Delete a mlModel services by &#x60;name&#x60;. If mlModels (and tasks) belong to the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deleteMlModelServiceByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMlModelServiceByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the ML Model service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/mlmodelServices/name/{name}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteMlModelServiceByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete an ML model service by name
  * Delete a mlModel services by &#x60;name&#x60;. If mlModels (and tasks) belong to the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deleteMlModelServiceByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the ML Model service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/mlmodelServices/name/{name}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteMlModelServiceByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMlModelServiceByName</code> method in a fluent style.
   */
  public static class DeleteMlModelServiceByNameQueryParams extends HashMap<String, Object> {
    public DeleteMlModelServiceByNameQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteMlModelServiceByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get an ML model service by name
   * Get a mlModel service by the service &#x60;name&#x60;.
   * @param name Name of the ML Model service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return MlModelService
   */
  @RequestLine("GET /v1/services/mlmodelServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  MlModelService getMlModelServiceByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get an ML model service by name
   * Similar to <code>getMlModelServiceByFQN</code> but it also returns the http response headers .
   * Get a mlModel service by the service &#x60;name&#x60;.
   * @param name Name of the ML Model service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/mlmodelServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MlModelService> getMlModelServiceByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get an ML model service by name
   * Get a mlModel service by the service &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getMlModelServiceByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMlModelServiceByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the ML Model service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return MlModelService
   */
  @RequestLine("GET /v1/services/mlmodelServices/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  MlModelService getMlModelServiceByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get an ML model service by name
  * Get a mlModel service by the service &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getMlModelServiceByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the ML Model service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return MlModelService
      */
      @RequestLine("GET /v1/services/mlmodelServices/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MlModelService> getMlModelServiceByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getMlModelServiceByFQN</code> method in a fluent style.
   */
  public static class GetMlModelServiceByFQNQueryParams extends HashMap<String, Object> {
    public GetMlModelServiceByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetMlModelServiceByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get an ML model service by Id
   * Get a mlModel service by &#x60;Id&#x60;.
   * @param id Id of the ML Model service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return MlModelService
   */
  @RequestLine("GET /v1/services/mlmodelServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  MlModelService getMlModelServiceByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get an ML model service by Id
   * Similar to <code>getMlModelServiceByID</code> but it also returns the http response headers .
   * Get a mlModel service by &#x60;Id&#x60;.
   * @param id Id of the ML Model service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/mlmodelServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MlModelService> getMlModelServiceByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get an ML model service by Id
   * Get a mlModel service by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getMlModelServiceByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMlModelServiceByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the ML Model service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return MlModelService
   */
  @RequestLine("GET /v1/services/mlmodelServices/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  MlModelService getMlModelServiceByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get an ML model service by Id
  * Get a mlModel service by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getMlModelServiceByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the ML Model service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return MlModelService
      */
      @RequestLine("GET /v1/services/mlmodelServices/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MlModelService> getMlModelServiceByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getMlModelServiceByID</code> method in a fluent style.
   */
  public static class GetMlModelServiceByIDQueryParams extends HashMap<String, Object> {
    public GetMlModelServiceByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetMlModelServiceByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the ML model service
   * Get a version of the mlModel service by given &#x60;Id&#x60;
   * @param id Id of the ML Model service (required)
   * @param version mlModel service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return MlModelService
   */
  @RequestLine("GET /v1/services/mlmodelServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  MlModelService getSpecificMlModelService(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the ML model service
   * Similar to <code>getSpecificMlModelService</code> but it also returns the http response headers .
   * Get a version of the mlModel service by given &#x60;Id&#x60;
   * @param id Id of the ML Model service (required)
   * @param version mlModel service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/mlmodelServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MlModelService> getSpecificMlModelServiceWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List ML model service versions
   * Get a list of all the versions of a mlModel service identified by &#x60;Id&#x60;
   * @param id Id of the ML Model service (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/services/mlmodelServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllMlModelServiceVersion(@Param("id") UUID id);

  /**
   * List ML model service versions
   * Similar to <code>listAllMlModelServiceVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a mlModel service identified by &#x60;Id&#x60;
   * @param id Id of the ML Model service (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/mlmodelServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllMlModelServiceVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List ML model services
   * Get a list of mlModel services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit Limit number services returned. (1 to 1000000, default 10) (optional, default to 10)
   * @param before Returns list of services before this cursor (optional)
   * @param after Returns list of services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return MlModelServiceList
   */
  @RequestLine("GET /v1/services/mlmodelServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  MlModelServiceList listMlModelService(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List ML model services
   * Similar to <code>listMlModelService</code> but it also returns the http response headers .
   * Get a list of mlModel services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit Limit number services returned. (1 to 1000000, default 10) (optional, default to 10)
   * @param before Returns list of services before this cursor (optional)
   * @param after Returns list of services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/mlmodelServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MlModelServiceList> listMlModelServiceWithHttpInfo(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List ML model services
   * Get a list of mlModel services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listMlModelService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListMlModelServiceQueryParams} class that allows for
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
   * @return MlModelServiceList
   */
  @RequestLine("GET /v1/services/mlmodelServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  MlModelServiceList listMlModelService(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List ML model services
  * Get a list of mlModel services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listMlModelService</code> that receives the query parameters as a map,
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
          * @return MlModelServiceList
      */
      @RequestLine("GET /v1/services/mlmodelServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MlModelServiceList> listMlModelServiceWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listMlModelService</code> method in a fluent style.
   */
  public static class ListMlModelServiceQueryParams extends HashMap<String, Object> {
    public ListMlModelServiceQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListMlModelServiceQueryParams domain(final String value) {
      put("domain", EncodingUtils.encode(value));
      return this;
    }
    public ListMlModelServiceQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListMlModelServiceQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListMlModelServiceQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListMlModelServiceQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update an ML model service
   * Update an existing MlModelService service using JsonPatch.
   * @param id Id of the ML Model service (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update an ML model service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/mlmodelServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchMlModelService(@Param("id") UUID id, Object body);

  /**
   * Update an ML model service
   * Similar to <code>patchMlModelService</code> but it also returns the http response headers .
   * Update an existing MlModelService service using JsonPatch.
   * @param id Id of the ML Model service (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update an ML model service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/mlmodelServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchMlModelServiceWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted ML model service
   * Restore a soft deleted Ml model service.
   * @param restoreEntity  (optional)
   * @return MlModelService
   */
  @RequestLine("PUT /v1/services/mlmodelServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MlModelService restore28(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted ML model service
   * Similar to <code>restore28</code> but it also returns the http response headers .
   * Restore a soft deleted Ml model service.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/mlmodelServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MlModelService> restore28WithHttpInfo(RestoreEntity restoreEntity);


}
