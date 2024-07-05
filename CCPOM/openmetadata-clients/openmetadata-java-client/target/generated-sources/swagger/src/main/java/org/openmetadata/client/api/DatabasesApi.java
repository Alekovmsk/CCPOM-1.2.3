package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateDatabase;
import org.openmetadata.client.model.Database;
import org.openmetadata.client.model.DatabaseList;
import org.openmetadata.client.model.DatabaseProfilerConfig;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Table;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface DatabasesApi extends ApiClient.Api {


  /**
   * Add database profile config
   * Add database profile config to the table.
   * @param id Id of the database (required)
   * @param databaseProfilerConfig  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/databases/{id}/databaseProfilerConfig")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table addDataProfilerConfig(@Param("id") UUID id, DatabaseProfilerConfig databaseProfilerConfig);

  /**
   * Add database profile config
   * Similar to <code>addDataProfilerConfig</code> but it also returns the http response headers .
   * Add database profile config to the table.
   * @param id Id of the database (required)
   * @param databaseProfilerConfig  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/databases/{id}/databaseProfilerConfig")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> addDataProfilerConfigWithHttpInfo(@Param("id") UUID id, DatabaseProfilerConfig databaseProfilerConfig);



  /**
   * Create a database
   * Create a database under an existing &#x60;service&#x60;.
   * @param createDatabase  (optional)
   * @return Database
   */
  @RequestLine("POST /v1/databases")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Database createDatabase(CreateDatabase createDatabase);

  /**
   * Create a database
   * Similar to <code>createDatabase</code> but it also returns the http response headers .
   * Create a database under an existing &#x60;service&#x60;.
   * @param createDatabase  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/databases")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Database> createDatabaseWithHttpInfo(CreateDatabase createDatabase);



  /**
   * Create or update database
   * Create a database, if it does not exist or update an existing database.
   * @param createDatabase  (optional)
   * @return Database
   */
  @RequestLine("PUT /v1/databases")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Database createOrUpdateDatabase(CreateDatabase createDatabase);

  /**
   * Create or update database
   * Similar to <code>createOrUpdateDatabase</code> but it also returns the http response headers .
   * Create a database, if it does not exist or update an existing database.
   * @param createDatabase  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/databases")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Database> createOrUpdateDatabaseWithHttpInfo(CreateDatabase createDatabase);



  /**
   * Delete database profiler config
   * delete database profile config to the database.
   * @param id Id of the table (required)
   * @return Table
   */
  @RequestLine("DELETE /v1/databases/{id}/databaseProfilerConfig")
  @Headers({
    "Accept: application/json",
  })
  Table deleteDataProfilerConfig(@Param("id") UUID id);

  /**
   * Delete database profiler config
   * Similar to <code>deleteDataProfilerConfig</code> but it also returns the http response headers .
   * delete database profile config to the database.
   * @param id Id of the table (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/databases/{id}/databaseProfilerConfig")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Table> deleteDataProfilerConfigWithHttpInfo(@Param("id") UUID id);



  /**
   * Delete a database by Id
   * Delete a database by &#x60;Id&#x60;. Database can only be deleted if it has no tables.
   * @param id Id of the database (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/databases/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDatabase(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a database by Id
   * Similar to <code>deleteDatabase</code> but it also returns the http response headers .
   * Delete a database by &#x60;Id&#x60;. Database can only be deleted if it has no tables.
   * @param id Id of the database (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/databases/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDatabaseWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a database by Id
   * Delete a database by &#x60;Id&#x60;. Database can only be deleted if it has no tables.
   * Note, this is equivalent to the other <code>deleteDatabase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDatabaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the database (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/databases/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDatabase(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a database by Id
  * Delete a database by &#x60;Id&#x60;. Database can only be deleted if it has no tables.
  * Note, this is equivalent to the other <code>deleteDatabase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the database (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/databases/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDatabaseWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDatabase</code> method in a fluent style.
   */
  public static class DeleteDatabaseQueryParams extends HashMap<String, Object> {
    public DeleteDatabaseQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDatabaseQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a database by fully qualified name
   * Delete a database by &#x60;fullyQualifiedName&#x60;. Databases can only be deleted if it has no tables.
   * @param fqn Fully qualified name of the database (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/databases/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDatabaseByFQN(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a database by fully qualified name
   * Similar to <code>deleteDatabaseByFQN</code> but it also returns the http response headers .
   * Delete a database by &#x60;fullyQualifiedName&#x60;. Databases can only be deleted if it has no tables.
   * @param fqn Fully qualified name of the database (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/databases/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDatabaseByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a database by fully qualified name
   * Delete a database by &#x60;fullyQualifiedName&#x60;. Databases can only be deleted if it has no tables.
   * Note, this is equivalent to the other <code>deleteDatabaseByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDatabaseByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the database (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/databases/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDatabaseByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a database by fully qualified name
  * Delete a database by &#x60;fullyQualifiedName&#x60;. Databases can only be deleted if it has no tables.
  * Note, this is equivalent to the other <code>deleteDatabaseByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the database (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/databases/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDatabaseByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDatabaseByFQN</code> method in a fluent style.
   */
  public static class DeleteDatabaseByFQNQueryParams extends HashMap<String, Object> {
    public DeleteDatabaseByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDatabaseByFQNQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get database profile config
   * Get database profile config to the table.
   * @param id Id of the database (required)
   * @return Table
   */
  @RequestLine("GET /v1/databases/{id}/databaseProfilerConfig")
  @Headers({
    "Accept: application/json",
  })
  Table getDataProfilerConfig(@Param("id") UUID id);

  /**
   * Get database profile config
   * Similar to <code>getDataProfilerConfig</code> but it also returns the http response headers .
   * Get database profile config to the table.
   * @param id Id of the database (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/databases/{id}/databaseProfilerConfig")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Table> getDataProfilerConfigWithHttpInfo(@Param("id") UUID id);



  /**
   * Get a database by fully qualified name
   * Get a database by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the database (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Database
   */
  @RequestLine("GET /v1/databases/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Database getDatabaseByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a database by fully qualified name
   * Similar to <code>getDatabaseByFQN</code> but it also returns the http response headers .
   * Get a database by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the database (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/databases/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Database> getDatabaseByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a database by fully qualified name
   * Get a database by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getDatabaseByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDatabaseByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the database (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Database
   */
  @RequestLine("GET /v1/databases/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Database getDatabaseByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a database by fully qualified name
  * Get a database by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getDatabaseByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the database (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Database
      */
      @RequestLine("GET /v1/databases/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Database> getDatabaseByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDatabaseByFQN</code> method in a fluent style.
   */
  public static class GetDatabaseByFQNQueryParams extends HashMap<String, Object> {
    public GetDatabaseByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDatabaseByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a database by Id
   * Get a database by &#x60;Id&#x60;.
   * @param id Id of the database (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Database
   */
  @RequestLine("GET /v1/databases/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Database getDatabaseByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a database by Id
   * Similar to <code>getDatabaseByID</code> but it also returns the http response headers .
   * Get a database by &#x60;Id&#x60;.
   * @param id Id of the database (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/databases/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Database> getDatabaseByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a database by Id
   * Get a database by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getDatabaseByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDatabaseByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the database (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Database
   */
  @RequestLine("GET /v1/databases/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Database getDatabaseByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a database by Id
  * Get a database by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getDatabaseByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the database (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Database
      */
      @RequestLine("GET /v1/databases/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Database> getDatabaseByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDatabaseByID</code> method in a fluent style.
   */
  public static class GetDatabaseByIDQueryParams extends HashMap<String, Object> {
    public GetDatabaseByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDatabaseByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the database
   * Get a version of the database by given &#x60;Id&#x60;
   * @param id Id of the database (required)
   * @param version Database version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Database
   */
  @RequestLine("GET /v1/databases/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Database getSpecificDatabaseVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the database
   * Similar to <code>getSpecificDatabaseVersion</code> but it also returns the http response headers .
   * Get a version of the database by given &#x60;Id&#x60;
   * @param id Id of the database (required)
   * @param version Database version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/databases/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Database> getSpecificDatabaseVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List database versions
   * Get a list of all the versions of a database identified by &#x60;Id&#x60;
   * @param id Id of the database (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/databases/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllDatabaseVersion(@Param("id") UUID id);

  /**
   * List database versions
   * Similar to <code>listAllDatabaseVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a database identified by &#x60;Id&#x60;
   * @param id Id of the database (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/databases/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllDatabaseVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List databases
   * Get a list of databases, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter databases by service name (optional)
   * @param limit Limit the number tables returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of tables before this cursor (optional)
   * @param after Returns list of tables after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DatabaseList
   */
  @RequestLine("GET /v1/databases?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DatabaseList listDatabases(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List databases
   * Similar to <code>listDatabases</code> but it also returns the http response headers .
   * Get a list of databases, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter databases by service name (optional)
   * @param limit Limit the number tables returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of tables before this cursor (optional)
   * @param after Returns list of tables after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/databases?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DatabaseList> listDatabasesWithHttpInfo(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List databases
   * Get a list of databases, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listDatabases</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDatabasesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>service - Filter databases by service name (optional)</li>
   *   <li>limit - Limit the number tables returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of tables before this cursor (optional)</li>
   *   <li>after - Returns list of tables after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DatabaseList
   */
  @RequestLine("GET /v1/databases?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DatabaseList listDatabases(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List databases
  * Get a list of databases, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listDatabases</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>service - Filter databases by service name (optional)</li>
          *   <li>limit - Limit the number tables returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of tables before this cursor (optional)</li>
          *   <li>after - Returns list of tables after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DatabaseList
      */
      @RequestLine("GET /v1/databases?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DatabaseList> listDatabasesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listDatabases</code> method in a fluent style.
   */
  public static class ListDatabasesQueryParams extends HashMap<String, Object> {
    public ListDatabasesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListDatabasesQueryParams service(final String value) {
      put("service", EncodingUtils.encode(value));
      return this;
    }
    public ListDatabasesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListDatabasesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListDatabasesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListDatabasesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a database
   * Update an existing database using JsonPatch.
   * @param id Id of the database (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a database Documentation</a>
   */
  @RequestLine("PATCH /v1/databases/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchDatabase(@Param("id") UUID id, Object body);

  /**
   * Update a database
   * Similar to <code>patchDatabase</code> but it also returns the http response headers .
   * Update an existing database using JsonPatch.
   * @param id Id of the database (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a database Documentation</a>
   */
  @RequestLine("PATCH /v1/databases/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchDatabaseWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted Database.
   * Restore a soft deleted Database.
   * @param restoreEntity  (optional)
   * @return Database
   */
  @RequestLine("PUT /v1/databases/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Database restore7(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted Database.
   * Similar to <code>restore7</code> but it also returns the http response headers .
   * Restore a soft deleted Database.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/databases/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Database> restore7WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/databases/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity4(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity4</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/databases/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity4WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
