package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateStoredProcedure;
import org.openmetadata.client.model.DatabaseSchema;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.StoredProcedure;
import org.openmetadata.client.model.StoredProcedureList;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface StoredProceduresApi extends ApiClient.Api {


  /**
   * Add a follower
   * Add a user identified by &#x60;userId&#x60; as followed of this Stored Procedure
   * @param id Id of the StoredProcedure (required)
   * @param body Id of the user to be added as follower (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/storedProcedures/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent addFollower(@Param("id") UUID id, UUID body);

  /**
   * Add a follower
   * Similar to <code>addFollower</code> but it also returns the http response headers .
   * Add a user identified by &#x60;userId&#x60; as followed of this Stored Procedure
   * @param id Id of the StoredProcedure (required)
   * @param body Id of the user to be added as follower (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/storedProcedures/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> addFollowerWithHttpInfo(@Param("id") UUID id, UUID body);



  /**
   * Create or update Stored Procedure
   * Create a stored procedure, if it does not exist or update an existing stored procedure.
   * @param createStoredProcedure  (optional)
   * @return StoredProcedure
   */
  @RequestLine("PUT /v1/storedProcedures")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StoredProcedure createOrUpdateStoredProcedure(CreateStoredProcedure createStoredProcedure);

  /**
   * Create or update Stored Procedure
   * Similar to <code>createOrUpdateStoredProcedure</code> but it also returns the http response headers .
   * Create a stored procedure, if it does not exist or update an existing stored procedure.
   * @param createStoredProcedure  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/storedProcedures")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StoredProcedure> createOrUpdateStoredProcedureWithHttpInfo(CreateStoredProcedure createStoredProcedure);



  /**
   * Create a Stored Procedure
   * Create a Stored Procedure under an existing &#x60;service&#x60;.
   * @param createStoredProcedure  (optional)
   * @return StoredProcedure
   */
  @RequestLine("POST /v1/storedProcedures")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StoredProcedure createStoredProcedure(CreateStoredProcedure createStoredProcedure);

  /**
   * Create a Stored Procedure
   * Similar to <code>createStoredProcedure</code> but it also returns the http response headers .
   * Create a Stored Procedure under an existing &#x60;service&#x60;.
   * @param createStoredProcedure  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/storedProcedures")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StoredProcedure> createStoredProcedureWithHttpInfo(CreateStoredProcedure createStoredProcedure);



  /**
   * Delete a schema by fully qualified name
   * Delete a schema by &#x60;fullyQualifiedName&#x60;. Schema can only be deleted if it has no tables.
   * @param fqn Name of the DBSchema (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/storedProcedures/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDBSchemaByFQN1(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a schema by fully qualified name
   * Similar to <code>deleteDBSchemaByFQN1</code> but it also returns the http response headers .
   * Delete a schema by &#x60;fullyQualifiedName&#x60;. Schema can only be deleted if it has no tables.
   * @param fqn Name of the DBSchema (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/storedProcedures/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDBSchemaByFQN1WithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a schema by fully qualified name
   * Delete a schema by &#x60;fullyQualifiedName&#x60;. Schema can only be deleted if it has no tables.
   * Note, this is equivalent to the other <code>deleteDBSchemaByFQN1</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDBSchemaByFQN1QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Name of the DBSchema (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/storedProcedures/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDBSchemaByFQN1(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a schema by fully qualified name
  * Delete a schema by &#x60;fullyQualifiedName&#x60;. Schema can only be deleted if it has no tables.
  * Note, this is equivalent to the other <code>deleteDBSchemaByFQN1</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Name of the DBSchema (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/storedProcedures/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDBSchemaByFQN1WithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDBSchemaByFQN1</code> method in a fluent style.
   */
  public static class DeleteDBSchemaByFQN1QueryParams extends HashMap<String, Object> {
    public DeleteDBSchemaByFQN1QueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDBSchemaByFQN1QueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Remove a follower
   * Remove the user identified &#x60;userId&#x60; as a follower of the Stored Procedure.
   * @param id Id of the Stored Procedure (required)
   * @param userId Id of the user being removed as follower (required)
   * @return ChangeEvent
   */
  @RequestLine("DELETE /v1/storedProcedures/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ChangeEvent deleteFollower(@Param("id") UUID id, @Param("userId") String userId);

  /**
   * Remove a follower
   * Similar to <code>deleteFollower</code> but it also returns the http response headers .
   * Remove the user identified &#x60;userId&#x60; as a follower of the Stored Procedure.
   * @param id Id of the Stored Procedure (required)
   * @param userId Id of the user being removed as follower (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/storedProcedures/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> deleteFollowerWithHttpInfo(@Param("id") UUID id, @Param("userId") String userId);



  /**
   * Delete a StoredProcedure by Id
   * Delete a StoredProcedure by &#x60;Id&#x60;.
   * @param id Database schema Id (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/storedProcedures/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteStoredProcedure(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a StoredProcedure by Id
   * Similar to <code>deleteStoredProcedure</code> but it also returns the http response headers .
   * Delete a StoredProcedure by &#x60;Id&#x60;.
   * @param id Database schema Id (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/storedProcedures/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteStoredProcedureWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a StoredProcedure by Id
   * Delete a StoredProcedure by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deleteStoredProcedure</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteStoredProcedureQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Database schema Id (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/storedProcedures/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteStoredProcedure(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a StoredProcedure by Id
  * Delete a StoredProcedure by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deleteStoredProcedure</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Database schema Id (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/storedProcedures/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteStoredProcedureWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteStoredProcedure</code> method in a fluent style.
   */
  public static class DeleteStoredProcedureQueryParams extends HashMap<String, Object> {
    public DeleteStoredProcedureQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteStoredProcedureQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the Stored Procedure
   * Get a version of the Stored Procedure by given &#x60;Id&#x60;
   * @param id Stored Procedure Id (required)
   * @param version Stored Procedure version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return StoredProcedure
   */
  @RequestLine("GET /v1/storedProcedures/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  StoredProcedure getSpecificStoredProcedureVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the Stored Procedure
   * Similar to <code>getSpecificStoredProcedureVersion</code> but it also returns the http response headers .
   * Get a version of the Stored Procedure by given &#x60;Id&#x60;
   * @param id Stored Procedure Id (required)
   * @param version Stored Procedure version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/storedProcedures/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<StoredProcedure> getSpecificStoredProcedureVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a Stored Procedure by fully qualified name
   * Get a Stored Procedure by fully qualified name.
   * @param fqn Fully qualified name of the Stored Procedure (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return StoredProcedure
   */
  @RequestLine("GET /v1/storedProcedures/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  StoredProcedure getStoredProcedureByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a Stored Procedure by fully qualified name
   * Similar to <code>getStoredProcedureByFQN</code> but it also returns the http response headers .
   * Get a Stored Procedure by fully qualified name.
   * @param fqn Fully qualified name of the Stored Procedure (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/storedProcedures/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<StoredProcedure> getStoredProcedureByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a Stored Procedure by fully qualified name
   * Get a Stored Procedure by fully qualified name.
   * Note, this is equivalent to the other <code>getStoredProcedureByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetStoredProcedureByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the Stored Procedure (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return StoredProcedure
   */
  @RequestLine("GET /v1/storedProcedures/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  StoredProcedure getStoredProcedureByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a Stored Procedure by fully qualified name
  * Get a Stored Procedure by fully qualified name.
  * Note, this is equivalent to the other <code>getStoredProcedureByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the Stored Procedure (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return StoredProcedure
      */
      @RequestLine("GET /v1/storedProcedures/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<StoredProcedure> getStoredProcedureByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getStoredProcedureByFQN</code> method in a fluent style.
   */
  public static class GetStoredProcedureByFQNQueryParams extends HashMap<String, Object> {
    public GetStoredProcedureByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetStoredProcedureByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a stored procedure by Id
   * Get a stored procedure by &#x60;Id&#x60;.
   * @param id Stored Procedure Id (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return StoredProcedure
   */
  @RequestLine("GET /v1/storedProcedures/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  StoredProcedure getStoredProcedureByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a stored procedure by Id
   * Similar to <code>getStoredProcedureByID</code> but it also returns the http response headers .
   * Get a stored procedure by &#x60;Id&#x60;.
   * @param id Stored Procedure Id (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/storedProcedures/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<StoredProcedure> getStoredProcedureByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a stored procedure by Id
   * Get a stored procedure by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getStoredProcedureByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetStoredProcedureByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Stored Procedure Id (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return StoredProcedure
   */
  @RequestLine("GET /v1/storedProcedures/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  StoredProcedure getStoredProcedureByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a stored procedure by Id
  * Get a stored procedure by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getStoredProcedureByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Stored Procedure Id (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return StoredProcedure
      */
      @RequestLine("GET /v1/storedProcedures/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<StoredProcedure> getStoredProcedureByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getStoredProcedureByID</code> method in a fluent style.
   */
  public static class GetStoredProcedureByIDQueryParams extends HashMap<String, Object> {
    public GetStoredProcedureByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetStoredProcedureByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List stored procedure versions
   * Get a list of all the versions of a stored procedure identified by &#x60;Id&#x60;
   * @param id Stored Procedure Id (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/storedProcedures/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllStoredProceduresVersion(@Param("id") UUID id);

  /**
   * List stored procedure versions
   * Similar to <code>listAllStoredProceduresVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a stored procedure identified by &#x60;Id&#x60;
   * @param id Stored Procedure Id (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/storedProcedures/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllStoredProceduresVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List Stored Procedures
   * Get a list of stored procedures, optionally filtered by &#x60;databaseSchema&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param databaseSchema Filter stored procedures by database schema (optional)
   * @param limit Limit the number schemas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of schemas before this cursor (optional)
   * @param after Returns list of schemas after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return StoredProcedureList
   */
  @RequestLine("GET /v1/storedProcedures?fields={fields}&databaseSchema={databaseSchema}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  StoredProcedureList listStoredProcedures(@Param("fields") String fields, @Param("databaseSchema") String databaseSchema, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List Stored Procedures
   * Similar to <code>listStoredProcedures</code> but it also returns the http response headers .
   * Get a list of stored procedures, optionally filtered by &#x60;databaseSchema&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param databaseSchema Filter stored procedures by database schema (optional)
   * @param limit Limit the number schemas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of schemas before this cursor (optional)
   * @param after Returns list of schemas after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/storedProcedures?fields={fields}&databaseSchema={databaseSchema}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<StoredProcedureList> listStoredProceduresWithHttpInfo(@Param("fields") String fields, @Param("databaseSchema") String databaseSchema, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List Stored Procedures
   * Get a list of stored procedures, optionally filtered by &#x60;databaseSchema&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listStoredProcedures</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListStoredProceduresQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>databaseSchema - Filter stored procedures by database schema (optional)</li>
   *   <li>limit - Limit the number schemas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of schemas before this cursor (optional)</li>
   *   <li>after - Returns list of schemas after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return StoredProcedureList
   */
  @RequestLine("GET /v1/storedProcedures?fields={fields}&databaseSchema={databaseSchema}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  StoredProcedureList listStoredProcedures(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List Stored Procedures
  * Get a list of stored procedures, optionally filtered by &#x60;databaseSchema&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listStoredProcedures</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>databaseSchema - Filter stored procedures by database schema (optional)</li>
          *   <li>limit - Limit the number schemas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of schemas before this cursor (optional)</li>
          *   <li>after - Returns list of schemas after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return StoredProcedureList
      */
      @RequestLine("GET /v1/storedProcedures?fields={fields}&databaseSchema={databaseSchema}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<StoredProcedureList> listStoredProceduresWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listStoredProcedures</code> method in a fluent style.
   */
  public static class ListStoredProceduresQueryParams extends HashMap<String, Object> {
    public ListStoredProceduresQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListStoredProceduresQueryParams databaseSchema(final String value) {
      put("databaseSchema", EncodingUtils.encode(value));
      return this;
    }
    public ListStoredProceduresQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListStoredProceduresQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListStoredProceduresQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListStoredProceduresQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a Stored Procedure
   * Update an existing StoredProcedure using JsonPatch.
   * @param id Stored Procedure Id (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a Stored Procedure Documentation</a>
   */
  @RequestLine("PATCH /v1/storedProcedures/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchStoredProcedure(@Param("id") UUID id, Object body);

  /**
   * Update a Stored Procedure
   * Similar to <code>patchStoredProcedure</code> but it also returns the http response headers .
   * Update an existing StoredProcedure using JsonPatch.
   * @param id Stored Procedure Id (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a Stored Procedure Documentation</a>
   */
  @RequestLine("PATCH /v1/storedProcedures/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchStoredProcedureWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted database schema.
   * Restore a soft deleted database schema.
   * @param restoreEntity  (optional)
   * @return DatabaseSchema
   */
  @RequestLine("PUT /v1/storedProcedures/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseSchema restore9(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted database schema.
   * Similar to <code>restore9</code> but it also returns the http response headers .
   * Restore a soft deleted database schema.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/storedProcedures/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseSchema> restore9WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/storedProcedures/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity6(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity6</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/storedProcedures/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity6WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
