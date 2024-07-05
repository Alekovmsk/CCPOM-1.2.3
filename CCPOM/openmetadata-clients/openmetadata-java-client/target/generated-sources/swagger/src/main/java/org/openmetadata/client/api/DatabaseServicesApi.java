package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateDatabaseService;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.DatabaseServiceList;
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
public interface DatabaseServicesApi extends ApiClient.Api {


  /**
   * Add test connection result
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return DatabaseService
   */
  @RequestLine("PUT /v1/services/databaseServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseService addTestConnectionResult1(@Param("id") UUID id, TestConnectionResult testConnectionResult);

  /**
   * Add test connection result
   * Similar to <code>addTestConnectionResult1</code> but it also returns the http response headers .
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/databaseServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> addTestConnectionResult1WithHttpInfo(@Param("id") UUID id, TestConnectionResult testConnectionResult);



  /**
   * Create database service
   * Create a new database service.
   * @param createDatabaseService  (optional)
   * @return DatabaseService
   */
  @RequestLine("POST /v1/services/databaseServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseService createDatabaseService(CreateDatabaseService createDatabaseService);

  /**
   * Create database service
   * Similar to <code>createDatabaseService</code> but it also returns the http response headers .
   * Create a new database service.
   * @param createDatabaseService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/services/databaseServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> createDatabaseServiceWithHttpInfo(CreateDatabaseService createDatabaseService);



  /**
   * Update database service
   * Update an existing or create a new database service.
   * @param createDatabaseService  (optional)
   * @return DatabaseService
   */
  @RequestLine("PUT /v1/services/databaseServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseService createOrUpdateDatabaseService(CreateDatabaseService createDatabaseService);

  /**
   * Update database service
   * Similar to <code>createOrUpdateDatabaseService</code> but it also returns the http response headers .
   * Update an existing or create a new database service.
   * @param createDatabaseService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/databaseServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> createOrUpdateDatabaseServiceWithHttpInfo(CreateDatabaseService createDatabaseService);



  /**
   * Delete a database service by Id
   * Delete a database services. If databases (and tables) belong the service, it can&#39;t be deleted.
   * @param id Id of the database service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/databaseServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDatabaseService(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a database service by Id
   * Similar to <code>deleteDatabaseService</code> but it also returns the http response headers .
   * Delete a database services. If databases (and tables) belong the service, it can&#39;t be deleted.
   * @param id Id of the database service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/databaseServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDatabaseServiceWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a database service by Id
   * Delete a database services. If databases (and tables) belong the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deleteDatabaseService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDatabaseServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the database service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/databaseServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDatabaseService(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a database service by Id
  * Delete a database services. If databases (and tables) belong the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deleteDatabaseService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the database service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/databaseServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDatabaseServiceWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDatabaseService</code> method in a fluent style.
   */
  public static class DeleteDatabaseServiceQueryParams extends HashMap<String, Object> {
    public DeleteDatabaseServiceQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDatabaseServiceQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a database service by name
   * Delete a database services by &#x60;name&#x60;. If databases (and tables) belong the service, it can&#39;t be deleted.
   * @param name Name of the database service (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/databaseServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDatabaseServiceByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a database service by name
   * Similar to <code>deleteDatabaseServiceByName</code> but it also returns the http response headers .
   * Delete a database services by &#x60;name&#x60;. If databases (and tables) belong the service, it can&#39;t be deleted.
   * @param name Name of the database service (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/databaseServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDatabaseServiceByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a database service by name
   * Delete a database services by &#x60;name&#x60;. If databases (and tables) belong the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deleteDatabaseServiceByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDatabaseServiceByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the database service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/databaseServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDatabaseServiceByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a database service by name
  * Delete a database services by &#x60;name&#x60;. If databases (and tables) belong the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deleteDatabaseServiceByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the database service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/databaseServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDatabaseServiceByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDatabaseServiceByName</code> method in a fluent style.
   */
  public static class DeleteDatabaseServiceByNameQueryParams extends HashMap<String, Object> {
    public DeleteDatabaseServiceByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDatabaseServiceByNameQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get database service by name
   * Get a database service by the service &#x60;name&#x60;.
   * @param name Name of the database service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DatabaseService
   */
  @RequestLine("GET /v1/services/databaseServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DatabaseService getDatabaseServiceByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get database service by name
   * Similar to <code>getDatabaseServiceByFQN</code> but it also returns the http response headers .
   * Get a database service by the service &#x60;name&#x60;.
   * @param name Name of the database service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/databaseServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> getDatabaseServiceByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get database service by name
   * Get a database service by the service &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getDatabaseServiceByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDatabaseServiceByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the database service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DatabaseService
   */
  @RequestLine("GET /v1/services/databaseServices/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DatabaseService getDatabaseServiceByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get database service by name
  * Get a database service by the service &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getDatabaseServiceByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the database service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DatabaseService
      */
      @RequestLine("GET /v1/services/databaseServices/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DatabaseService> getDatabaseServiceByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDatabaseServiceByFQN</code> method in a fluent style.
   */
  public static class GetDatabaseServiceByFQNQueryParams extends HashMap<String, Object> {
    public GetDatabaseServiceByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDatabaseServiceByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a database service
   * Get a database service by &#x60;Id&#x60;.
   * @param id Id of the database service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DatabaseService
   */
  @RequestLine("GET /v1/services/databaseServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DatabaseService getDatabaseServiceByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a database service
   * Similar to <code>getDatabaseServiceByID</code> but it also returns the http response headers .
   * Get a database service by &#x60;Id&#x60;.
   * @param id Id of the database service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/databaseServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> getDatabaseServiceByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a database service
   * Get a database service by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getDatabaseServiceByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDatabaseServiceByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the database service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DatabaseService
   */
  @RequestLine("GET /v1/services/databaseServices/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DatabaseService getDatabaseServiceByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a database service
  * Get a database service by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getDatabaseServiceByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the database service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DatabaseService
      */
      @RequestLine("GET /v1/services/databaseServices/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DatabaseService> getDatabaseServiceByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDatabaseServiceByID</code> method in a fluent style.
   */
  public static class GetDatabaseServiceByIDQueryParams extends HashMap<String, Object> {
    public GetDatabaseServiceByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDatabaseServiceByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the database service
   * Get a version of the database service by given &#x60;Id&#x60;
   * @param id Id of the database service (required)
   * @param version database service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return DatabaseService
   */
  @RequestLine("GET /v1/services/databaseServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  DatabaseService getSpecificDatabaseServiceVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the database service
   * Similar to <code>getSpecificDatabaseServiceVersion</code> but it also returns the http response headers .
   * Get a version of the database service by given &#x60;Id&#x60;
   * @param id Id of the database service (required)
   * @param version database service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/databaseServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> getSpecificDatabaseServiceVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List database service versions
   * Get a list of all the versions of a database service identified by &#x60;Id&#x60;
   * @param id Id of the database service (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/services/databaseServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllDatabaseServiceVersion(@Param("id") UUID id);

  /**
   * List database service versions
   * Similar to <code>listAllDatabaseServiceVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a database service identified by &#x60;Id&#x60;
   * @param id Id of the database service (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/databaseServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllDatabaseServiceVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List database services
   * Get a list of database services.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of database services before this cursor (optional)
   * @param after Returns list of database services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DatabaseServiceList
   */
  @RequestLine("GET /v1/services/databaseServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DatabaseServiceList listDatabaseServices(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List database services
   * Similar to <code>listDatabaseServices</code> but it also returns the http response headers .
   * Get a list of database services.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of database services before this cursor (optional)
   * @param after Returns list of database services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/databaseServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DatabaseServiceList> listDatabaseServicesWithHttpInfo(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List database services
   * Get a list of database services.
   * Note, this is equivalent to the other <code>listDatabaseServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDatabaseServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>domain - Filter services by domain (optional)</li>
   *   <li>limit -  (optional, default to 10)</li>
   *   <li>before - Returns list of database services before this cursor (optional)</li>
   *   <li>after - Returns list of database services after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DatabaseServiceList
   */
  @RequestLine("GET /v1/services/databaseServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DatabaseServiceList listDatabaseServices(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List database services
  * Get a list of database services.
  * Note, this is equivalent to the other <code>listDatabaseServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>domain - Filter services by domain (optional)</li>
          *   <li>limit -  (optional, default to 10)</li>
          *   <li>before - Returns list of database services before this cursor (optional)</li>
          *   <li>after - Returns list of database services after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DatabaseServiceList
      */
      @RequestLine("GET /v1/services/databaseServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DatabaseServiceList> listDatabaseServicesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listDatabaseServices</code> method in a fluent style.
   */
  public static class ListDatabaseServicesQueryParams extends HashMap<String, Object> {
    public ListDatabaseServicesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListDatabaseServicesQueryParams domain(final String value) {
      put("domain", EncodingUtils.encode(value));
      return this;
    }
    public ListDatabaseServicesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListDatabaseServicesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListDatabaseServicesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListDatabaseServicesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a database service
   * Update an existing database service using JsonPatch.
   * @param id Id of the database service (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a database service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/databaseServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchDatabaseService(@Param("id") UUID id, Object body);

  /**
   * Update a database service
   * Similar to <code>patchDatabaseService</code> but it also returns the http response headers .
   * Update an existing database service using JsonPatch.
   * @param id Id of the database service (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a database service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/databaseServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchDatabaseServiceWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted database service
   * Restore a soft deleted database service.
   * @param restoreEntity  (optional)
   * @return DatabaseService
   */
  @RequestLine("PUT /v1/services/databaseServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseService restore25(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted database service
   * Similar to <code>restore25</code> but it also returns the http response headers .
   * Restore a soft deleted database service.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/databaseServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> restore25WithHttpInfo(RestoreEntity restoreEntity);


}
