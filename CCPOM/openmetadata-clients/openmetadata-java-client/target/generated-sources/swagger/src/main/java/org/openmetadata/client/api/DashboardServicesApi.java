package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateDashboardService;
import org.openmetadata.client.model.DashboardService;
import org.openmetadata.client.model.DashboardServiceList;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.TestConnectionResult;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface DashboardServicesApi extends ApiClient.Api {


  /**
   * Add test connection result
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return DatabaseService
   */
  @RequestLine("PUT /v1/services/dashboardServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseService addTestConnectionResult(@Param("id") UUID id, TestConnectionResult testConnectionResult);

  /**
   * Add test connection result
   * Similar to <code>addTestConnectionResult</code> but it also returns the http response headers .
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/dashboardServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> addTestConnectionResultWithHttpInfo(@Param("id") UUID id, TestConnectionResult testConnectionResult);



  /**
   * Create a dashboard service
   * Create a new dashboard service.
   * @param createDashboardService  (optional)
   * @return DashboardService
   */
  @RequestLine("POST /v1/services/dashboardServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DashboardService createDashboardService(CreateDashboardService createDashboardService);

  /**
   * Create a dashboard service
   * Similar to <code>createDashboardService</code> but it also returns the http response headers .
   * Create a new dashboard service.
   * @param createDashboardService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/services/dashboardServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DashboardService> createDashboardServiceWithHttpInfo(CreateDashboardService createDashboardService);



  /**
   * Update a dashboard service
   * Update an existing dashboard service identified by &#x60;Id&#x60;.
   * @param createDashboardService  (optional)
   * @return DashboardService
   */
  @RequestLine("PUT /v1/services/dashboardServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DashboardService createOrUpdateDashboardService(CreateDashboardService createDashboardService);

  /**
   * Update a dashboard service
   * Similar to <code>createOrUpdateDashboardService</code> but it also returns the http response headers .
   * Update an existing dashboard service identified by &#x60;Id&#x60;.
   * @param createDashboardService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/dashboardServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DashboardService> createOrUpdateDashboardServiceWithHttpInfo(CreateDashboardService createDashboardService);



  /**
   * Delete a dashboard service by Id
   * Delete a Dashboard services. If dashboard (and charts) belong to the service, it can&#39;t be deleted.
   * @param id Id of the dashboard service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/dashboardServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDashboardService(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a dashboard service by Id
   * Similar to <code>deleteDashboardService</code> but it also returns the http response headers .
   * Delete a Dashboard services. If dashboard (and charts) belong to the service, it can&#39;t be deleted.
   * @param id Id of the dashboard service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/dashboardServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDashboardServiceWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a dashboard service by Id
   * Delete a Dashboard services. If dashboard (and charts) belong to the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deleteDashboardService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDashboardServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the dashboard service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/dashboardServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDashboardService(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a dashboard service by Id
  * Delete a Dashboard services. If dashboard (and charts) belong to the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deleteDashboardService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the dashboard service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/dashboardServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDashboardServiceWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDashboardService</code> method in a fluent style.
   */
  public static class DeleteDashboardServiceQueryParams extends HashMap<String, Object> {
    public DeleteDashboardServiceQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDashboardServiceQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a dashboard service by name
   * Delete a Dashboard services by &#x60;name&#x60;. If dashboard (and charts) belong to the service, it can&#39;t be deleted.
   * @param name Name of the dashboard service (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/dashboardServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDashboardServiceByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a dashboard service by name
   * Similar to <code>deleteDashboardServiceByName</code> but it also returns the http response headers .
   * Delete a Dashboard services by &#x60;name&#x60;. If dashboard (and charts) belong to the service, it can&#39;t be deleted.
   * @param name Name of the dashboard service (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/dashboardServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDashboardServiceByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a dashboard service by name
   * Delete a Dashboard services by &#x60;name&#x60;. If dashboard (and charts) belong to the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deleteDashboardServiceByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDashboardServiceByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the dashboard service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/dashboardServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDashboardServiceByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a dashboard service by name
  * Delete a Dashboard services by &#x60;name&#x60;. If dashboard (and charts) belong to the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deleteDashboardServiceByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the dashboard service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/dashboardServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDashboardServiceByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDashboardServiceByName</code> method in a fluent style.
   */
  public static class DeleteDashboardServiceByNameQueryParams extends HashMap<String, Object> {
    public DeleteDashboardServiceByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDashboardServiceByNameQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get dashboard service by name
   * Get a dashboard service by the service &#x60;name&#x60;.
   * @param name Name of the dashboard service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DashboardService
   */
  @RequestLine("GET /v1/services/dashboardServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DashboardService getDashboardServiceByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get dashboard service by name
   * Similar to <code>getDashboardServiceByFQN</code> but it also returns the http response headers .
   * Get a dashboard service by the service &#x60;name&#x60;.
   * @param name Name of the dashboard service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/dashboardServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DashboardService> getDashboardServiceByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get dashboard service by name
   * Get a dashboard service by the service &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getDashboardServiceByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDashboardServiceByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the dashboard service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DashboardService
   */
  @RequestLine("GET /v1/services/dashboardServices/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DashboardService getDashboardServiceByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get dashboard service by name
  * Get a dashboard service by the service &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getDashboardServiceByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the dashboard service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DashboardService
      */
      @RequestLine("GET /v1/services/dashboardServices/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DashboardService> getDashboardServiceByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDashboardServiceByFQN</code> method in a fluent style.
   */
  public static class GetDashboardServiceByFQNQueryParams extends HashMap<String, Object> {
    public GetDashboardServiceByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDashboardServiceByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a dashboard service by Id
   * Get a dashboard service by &#x60;Id&#x60;.
   * @param id Id of the dashboard service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DashboardService
   */
  @RequestLine("GET /v1/services/dashboardServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DashboardService getDashboardServiceByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a dashboard service by Id
   * Similar to <code>getDashboardServiceByID</code> but it also returns the http response headers .
   * Get a dashboard service by &#x60;Id&#x60;.
   * @param id Id of the dashboard service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/dashboardServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DashboardService> getDashboardServiceByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a dashboard service by Id
   * Get a dashboard service by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getDashboardServiceByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDashboardServiceByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the dashboard service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DashboardService
   */
  @RequestLine("GET /v1/services/dashboardServices/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DashboardService getDashboardServiceByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a dashboard service by Id
  * Get a dashboard service by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getDashboardServiceByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the dashboard service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DashboardService
      */
      @RequestLine("GET /v1/services/dashboardServices/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DashboardService> getDashboardServiceByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDashboardServiceByID</code> method in a fluent style.
   */
  public static class GetDashboardServiceByIDQueryParams extends HashMap<String, Object> {
    public GetDashboardServiceByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDashboardServiceByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the dashboard service
   * Get a version of the dashboard service by given &#x60;Id&#x60;
   * @param id Id of the dashboard service (required)
   * @param version dashboard service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return DashboardService
   */
  @RequestLine("GET /v1/services/dashboardServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  DashboardService getSpecificDashboardServiceVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the dashboard service
   * Similar to <code>getSpecificDashboardServiceVersion</code> but it also returns the http response headers .
   * Get a version of the dashboard service by given &#x60;Id&#x60;
   * @param id Id of the dashboard service (required)
   * @param version dashboard service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/dashboardServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DashboardService> getSpecificDashboardServiceVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List dashboard service versions
   * Get a list of all the versions of a dashboard service identified by &#x60;Id&#x60;
   * @param id Id of the dashboard service (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/services/dashboardServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllDashboardServiceVersion(@Param("id") UUID id);

  /**
   * List dashboard service versions
   * Similar to <code>listAllDashboardServiceVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a dashboard service identified by &#x60;Id&#x60;
   * @param id Id of the dashboard service (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/dashboardServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllDashboardServiceVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List dashboard services
   * Get a list of dashboard services.
   * @param name  (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of dashboard services before this cursor (optional)
   * @param after Returns list of dashboard services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DashboardServiceList
   */
  @RequestLine("GET /v1/services/dashboardServices?name={name}&fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DashboardServiceList listDashboardsService(@Param("name") String name, @Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List dashboard services
   * Similar to <code>listDashboardsService</code> but it also returns the http response headers .
   * Get a list of dashboard services.
   * @param name  (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of dashboard services before this cursor (optional)
   * @param after Returns list of dashboard services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/dashboardServices?name={name}&fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DashboardServiceList> listDashboardsServiceWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List dashboard services
   * Get a list of dashboard services.
   * Note, this is equivalent to the other <code>listDashboardsService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDashboardsServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name -  (optional)</li>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>domain - Filter services by domain (optional)</li>
   *   <li>limit -  (optional, default to 10)</li>
   *   <li>before - Returns list of dashboard services before this cursor (optional)</li>
   *   <li>after - Returns list of dashboard services after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DashboardServiceList
   */
  @RequestLine("GET /v1/services/dashboardServices?name={name}&fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DashboardServiceList listDashboardsService(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List dashboard services
  * Get a list of dashboard services.
  * Note, this is equivalent to the other <code>listDashboardsService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>name -  (optional)</li>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>domain - Filter services by domain (optional)</li>
          *   <li>limit -  (optional, default to 10)</li>
          *   <li>before - Returns list of dashboard services before this cursor (optional)</li>
          *   <li>after - Returns list of dashboard services after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DashboardServiceList
      */
      @RequestLine("GET /v1/services/dashboardServices?name={name}&fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DashboardServiceList> listDashboardsServiceWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listDashboardsService</code> method in a fluent style.
   */
  public static class ListDashboardsServiceQueryParams extends HashMap<String, Object> {
    public ListDashboardsServiceQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardsServiceQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardsServiceQueryParams domain(final String value) {
      put("domain", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardsServiceQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardsServiceQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardsServiceQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardsServiceQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a dashboard service
   * Update an existing dashboard service using JsonPatch.
   * @param id Id of the dashboard service (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a dashboard service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/dashboardServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchDashboardService(@Param("id") UUID id, Object body);

  /**
   * Update a dashboard service
   * Similar to <code>patchDashboardService</code> but it also returns the http response headers .
   * Update an existing dashboard service using JsonPatch.
   * @param id Id of the dashboard service (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a dashboard service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/dashboardServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchDashboardServiceWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted dashboard service
   * Restore a soft deleted dashboard service.
   * @param restoreEntity  (optional)
   * @return DashboardService
   */
  @RequestLine("PUT /v1/services/dashboardServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DashboardService restore24(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted dashboard service
   * Similar to <code>restore24</code> but it also returns the http response headers .
   * Restore a soft deleted dashboard service.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/dashboardServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DashboardService> restore24WithHttpInfo(RestoreEntity restoreEntity);


}
