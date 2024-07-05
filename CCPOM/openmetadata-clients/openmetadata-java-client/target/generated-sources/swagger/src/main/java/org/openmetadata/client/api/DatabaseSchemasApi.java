package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateDatabaseSchema;
import org.openmetadata.client.model.DatabaseSchema;
import org.openmetadata.client.model.DatabaseSchemaList;
import org.openmetadata.client.model.DatabaseSchemaProfilerConfig;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface DatabaseSchemasApi extends ApiClient.Api {


  /**
   * Add databaseSchema profile config
   * Add databaseSchema profile config to the table.
   * @param id Id of the databaseSchema (required)
   * @param databaseSchemaProfilerConfig  (optional)
   * @return DatabaseSchema
   */
  @RequestLine("PUT /v1/databaseSchemas/{id}/databaseSchemaProfilerConfig")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseSchema addDataProfilerConfig1(@Param("id") UUID id, DatabaseSchemaProfilerConfig databaseSchemaProfilerConfig);

  /**
   * Add databaseSchema profile config
   * Similar to <code>addDataProfilerConfig1</code> but it also returns the http response headers .
   * Add databaseSchema profile config to the table.
   * @param id Id of the databaseSchema (required)
   * @param databaseSchemaProfilerConfig  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/databaseSchemas/{id}/databaseSchemaProfilerConfig")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseSchema> addDataProfilerConfig1WithHttpInfo(@Param("id") UUID id, DatabaseSchemaProfilerConfig databaseSchemaProfilerConfig);



  /**
   * Create a schema
   * Create a schema under an existing &#x60;service&#x60;.
   * @param createDatabaseSchema  (optional)
   * @return DatabaseSchema
   */
  @RequestLine("POST /v1/databaseSchemas")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseSchema createDBSchema(CreateDatabaseSchema createDatabaseSchema);

  /**
   * Create a schema
   * Similar to <code>createDBSchema</code> but it also returns the http response headers .
   * Create a schema under an existing &#x60;service&#x60;.
   * @param createDatabaseSchema  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/databaseSchemas")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseSchema> createDBSchemaWithHttpInfo(CreateDatabaseSchema createDatabaseSchema);



  /**
   * Create or update schema
   * Create a database schema, if it does not exist or update an existing database schema.
   * @param createDatabaseSchema  (optional)
   * @return DatabaseSchema
   */
  @RequestLine("PUT /v1/databaseSchemas")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseSchema createOrUpdateDBSchema(CreateDatabaseSchema createDatabaseSchema);

  /**
   * Create or update schema
   * Similar to <code>createOrUpdateDBSchema</code> but it also returns the http response headers .
   * Create a database schema, if it does not exist or update an existing database schema.
   * @param createDatabaseSchema  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/databaseSchemas")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseSchema> createOrUpdateDBSchemaWithHttpInfo(CreateDatabaseSchema createDatabaseSchema);



  /**
   * Delete a schema by Id
   * Delete a schema by &#x60;Id&#x60;. Schema can only be deleted if it has no tables.
   * @param id Database schema Id (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/databaseSchemas/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDBSchema(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a schema by Id
   * Similar to <code>deleteDBSchema</code> but it also returns the http response headers .
   * Delete a schema by &#x60;Id&#x60;. Schema can only be deleted if it has no tables.
   * @param id Database schema Id (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/databaseSchemas/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDBSchemaWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a schema by Id
   * Delete a schema by &#x60;Id&#x60;. Schema can only be deleted if it has no tables.
   * Note, this is equivalent to the other <code>deleteDBSchema</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDBSchemaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Database schema Id (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/databaseSchemas/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDBSchema(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a schema by Id
  * Delete a schema by &#x60;Id&#x60;. Schema can only be deleted if it has no tables.
  * Note, this is equivalent to the other <code>deleteDBSchema</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Database schema Id (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/databaseSchemas/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDBSchemaWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDBSchema</code> method in a fluent style.
   */
  public static class DeleteDBSchemaQueryParams extends HashMap<String, Object> {
    public DeleteDBSchemaQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDBSchemaQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a schema by fully qualified name
   * Delete a schema by &#x60;fullyQualifiedName&#x60;. Schema can only be deleted if it has no tables.
   * @param fqn Name of the DBSchema (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/databaseSchemas/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDBSchemaByFQN(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a schema by fully qualified name
   * Similar to <code>deleteDBSchemaByFQN</code> but it also returns the http response headers .
   * Delete a schema by &#x60;fullyQualifiedName&#x60;. Schema can only be deleted if it has no tables.
   * @param fqn Name of the DBSchema (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/databaseSchemas/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDBSchemaByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a schema by fully qualified name
   * Delete a schema by &#x60;fullyQualifiedName&#x60;. Schema can only be deleted if it has no tables.
   * Note, this is equivalent to the other <code>deleteDBSchemaByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDBSchemaByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Name of the DBSchema (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/databaseSchemas/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDBSchemaByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a schema by fully qualified name
  * Delete a schema by &#x60;fullyQualifiedName&#x60;. Schema can only be deleted if it has no tables.
  * Note, this is equivalent to the other <code>deleteDBSchemaByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Name of the DBSchema (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/databaseSchemas/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDBSchemaByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDBSchemaByFQN</code> method in a fluent style.
   */
  public static class DeleteDBSchemaByFQNQueryParams extends HashMap<String, Object> {
    public DeleteDBSchemaByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDBSchemaByFQNQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete database profiler config
   * delete database profile config to the database.
   * @param id Id of the table (required)
   * @return DatabaseSchema
   */
  @RequestLine("DELETE /v1/databaseSchemas/{id}/databaseSchemaProfilerConfig")
  @Headers({
    "Accept: application/json",
  })
  DatabaseSchema deleteDataProfilerConfig1(@Param("id") UUID id);

  /**
   * Delete database profiler config
   * Similar to <code>deleteDataProfilerConfig1</code> but it also returns the http response headers .
   * delete database profile config to the database.
   * @param id Id of the table (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/databaseSchemas/{id}/databaseSchemaProfilerConfig")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DatabaseSchema> deleteDataProfilerConfig1WithHttpInfo(@Param("id") UUID id);



  /**
   * Get a schema by fully qualified name
   * Get a database schema by fully qualified name.
   * @param fqn Fully qualified name of the database schema (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DatabaseSchema
   */
  @RequestLine("GET /v1/databaseSchemas/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DatabaseSchema getDBSchemaByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a schema by fully qualified name
   * Similar to <code>getDBSchemaByFQN</code> but it also returns the http response headers .
   * Get a database schema by fully qualified name.
   * @param fqn Fully qualified name of the database schema (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/databaseSchemas/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DatabaseSchema> getDBSchemaByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a schema by fully qualified name
   * Get a database schema by fully qualified name.
   * Note, this is equivalent to the other <code>getDBSchemaByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDBSchemaByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the database schema (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DatabaseSchema
   */
  @RequestLine("GET /v1/databaseSchemas/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DatabaseSchema getDBSchemaByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a schema by fully qualified name
  * Get a database schema by fully qualified name.
  * Note, this is equivalent to the other <code>getDBSchemaByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the database schema (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DatabaseSchema
      */
      @RequestLine("GET /v1/databaseSchemas/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DatabaseSchema> getDBSchemaByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDBSchemaByFQN</code> method in a fluent style.
   */
  public static class GetDBSchemaByFQNQueryParams extends HashMap<String, Object> {
    public GetDBSchemaByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDBSchemaByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a schema by Id
   * Get a database schema by &#x60;Id&#x60;.
   * @param id Database schema Id (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DatabaseSchema
   */
  @RequestLine("GET /v1/databaseSchemas/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DatabaseSchema getDBSchemaByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a schema by Id
   * Similar to <code>getDBSchemaByID</code> but it also returns the http response headers .
   * Get a database schema by &#x60;Id&#x60;.
   * @param id Database schema Id (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/databaseSchemas/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DatabaseSchema> getDBSchemaByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a schema by Id
   * Get a database schema by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getDBSchemaByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDBSchemaByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Database schema Id (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DatabaseSchema
   */
  @RequestLine("GET /v1/databaseSchemas/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DatabaseSchema getDBSchemaByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a schema by Id
  * Get a database schema by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getDBSchemaByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Database schema Id (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DatabaseSchema
      */
      @RequestLine("GET /v1/databaseSchemas/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DatabaseSchema> getDBSchemaByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDBSchemaByID</code> method in a fluent style.
   */
  public static class GetDBSchemaByIDQueryParams extends HashMap<String, Object> {
    public GetDBSchemaByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDBSchemaByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get databaseSchema profile config
   * Get databaseSchema profile config to the table.
   * @param id Id of the databaseSchema (required)
   * @return DatabaseSchema
   */
  @RequestLine("GET /v1/databaseSchemas/{id}/databaseSchemaProfilerConfig")
  @Headers({
    "Accept: application/json",
  })
  DatabaseSchema getDataProfilerConfig1(@Param("id") UUID id);

  /**
   * Get databaseSchema profile config
   * Similar to <code>getDataProfilerConfig1</code> but it also returns the http response headers .
   * Get databaseSchema profile config to the table.
   * @param id Id of the databaseSchema (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/databaseSchemas/{id}/databaseSchemaProfilerConfig")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DatabaseSchema> getDataProfilerConfig1WithHttpInfo(@Param("id") UUID id);



  /**
   * Get a version of the schema
   * Get a version of the database schema by given &#x60;Id&#x60;
   * @param id Database schema Id (required)
   * @param version Database schema version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return DatabaseSchema
   */
  @RequestLine("GET /v1/databaseSchemas/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  DatabaseSchema getSpecificDBSchemaVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the schema
   * Similar to <code>getSpecificDBSchemaVersion</code> but it also returns the http response headers .
   * Get a version of the database schema by given &#x60;Id&#x60;
   * @param id Database schema Id (required)
   * @param version Database schema version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/databaseSchemas/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DatabaseSchema> getSpecificDBSchemaVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List schema versions
   * Get a list of all the versions of a schema identified by &#x60;Id&#x60;
   * @param id Database schema Id (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/databaseSchemas/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllDBSchemaVersion(@Param("id") UUID id);

  /**
   * List schema versions
   * Similar to <code>listAllDBSchemaVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a schema identified by &#x60;Id&#x60;
   * @param id Database schema Id (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/databaseSchemas/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllDBSchemaVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List database schemas
   * Get a list of database schemas, optionally filtered by &#x60;database&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param database Filter schemas by database name (optional)
   * @param limit Limit the number schemas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of schemas before this cursor (optional)
   * @param after Returns list of schemas after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DatabaseSchemaList
   */
  @RequestLine("GET /v1/databaseSchemas?fields={fields}&database={database}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DatabaseSchemaList listDBSchemas(@Param("fields") String fields, @Param("database") String database, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List database schemas
   * Similar to <code>listDBSchemas</code> but it also returns the http response headers .
   * Get a list of database schemas, optionally filtered by &#x60;database&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param database Filter schemas by database name (optional)
   * @param limit Limit the number schemas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of schemas before this cursor (optional)
   * @param after Returns list of schemas after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/databaseSchemas?fields={fields}&database={database}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DatabaseSchemaList> listDBSchemasWithHttpInfo(@Param("fields") String fields, @Param("database") String database, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List database schemas
   * Get a list of database schemas, optionally filtered by &#x60;database&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listDBSchemas</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDBSchemasQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>database - Filter schemas by database name (optional)</li>
   *   <li>limit - Limit the number schemas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of schemas before this cursor (optional)</li>
   *   <li>after - Returns list of schemas after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DatabaseSchemaList
   */
  @RequestLine("GET /v1/databaseSchemas?fields={fields}&database={database}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DatabaseSchemaList listDBSchemas(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List database schemas
  * Get a list of database schemas, optionally filtered by &#x60;database&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listDBSchemas</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>database - Filter schemas by database name (optional)</li>
          *   <li>limit - Limit the number schemas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of schemas before this cursor (optional)</li>
          *   <li>after - Returns list of schemas after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DatabaseSchemaList
      */
      @RequestLine("GET /v1/databaseSchemas?fields={fields}&database={database}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DatabaseSchemaList> listDBSchemasWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listDBSchemas</code> method in a fluent style.
   */
  public static class ListDBSchemasQueryParams extends HashMap<String, Object> {
    public ListDBSchemasQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListDBSchemasQueryParams database(final String value) {
      put("database", EncodingUtils.encode(value));
      return this;
    }
    public ListDBSchemasQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListDBSchemasQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListDBSchemasQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListDBSchemasQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a database schema
   * Update an existing database schema using JsonPatch.
   * @param id Database schema Id (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a database schema Documentation</a>
   */
  @RequestLine("PATCH /v1/databaseSchemas/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchDBSchema(@Param("id") UUID id, Object body);

  /**
   * Update a database schema
   * Similar to <code>patchDBSchema</code> but it also returns the http response headers .
   * Update an existing database schema using JsonPatch.
   * @param id Database schema Id (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a database schema Documentation</a>
   */
  @RequestLine("PATCH /v1/databaseSchemas/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchDBSchemaWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted database schema.
   * Restore a soft deleted database schema.
   * @param restoreEntity  (optional)
   * @return DatabaseSchema
   */
  @RequestLine("PUT /v1/databaseSchemas/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseSchema restore8(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted database schema.
   * Similar to <code>restore8</code> but it also returns the http response headers .
   * Restore a soft deleted database schema.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/databaseSchemas/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseSchema> restore8WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/databaseSchemas/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity5(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity5</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/databaseSchemas/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity5WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
