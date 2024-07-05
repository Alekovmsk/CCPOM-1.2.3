package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateQuery;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.EntityReference;
import org.openmetadata.client.model.Query;
import org.openmetadata.client.model.QueryList;
import org.openmetadata.client.model.RestoreEntity;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface QueriesApi extends ApiClient.Api {


  /**
   * Add a follower
   * Add a user identified by &#x60;userId&#x60; as follower of this model
   * @param id Id of the Query (required)
   * @param body Id of the user to be added as follower (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/queries/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent addFollower3(@Param("id") UUID id, UUID body);

  /**
   * Add a follower
   * Similar to <code>addFollower3</code> but it also returns the http response headers .
   * Add a user identified by &#x60;userId&#x60; as follower of this model
   * @param id Id of the Query (required)
   * @param body Id of the user to be added as follower (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/queries/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> addFollower3WithHttpInfo(@Param("id") UUID id, UUID body);



  /**
   * Add query usage
   * Add query usage
   * @param id Id of the query (required)
   * @param entityReference  (optional)
   * @return Query
   */
  @RequestLine("PUT /v1/queries/{id}/usage")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Query addQueryUsage(@Param("id") UUID id, List<EntityReference> entityReference);

  /**
   * Add query usage
   * Similar to <code>addQueryUsage</code> but it also returns the http response headers .
   * Add query usage
   * @param id Id of the query (required)
   * @param entityReference  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/queries/{id}/usage")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Query> addQueryUsageWithHttpInfo(@Param("id") UUID id, List<EntityReference> entityReference);



  /**
   * Populate Used By Field
   * Add query users
   * @param id Id of the query (required)
   * @param requestBody  (optional)
   * @return Query
   */
  @RequestLine("PUT /v1/queries/{id}/usedBy")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Query addQueryUsedBy(@Param("id") UUID id, List<String> requestBody);

  /**
   * Populate Used By Field
   * Similar to <code>addQueryUsedBy</code> but it also returns the http response headers .
   * Add query users
   * @param id Id of the query (required)
   * @param requestBody  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/queries/{id}/usedBy")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Query> addQueryUsedByWithHttpInfo(@Param("id") UUID id, List<String> requestBody);



  /**
   * Add query users
   * Add query users
   * @param id Id of the query (required)
   * @param requestBody  (optional)
   * @return Query
   */
  @RequestLine("PUT /v1/queries/{id}/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Query addQueryUsers(@Param("id") UUID id, List<String> requestBody);

  /**
   * Add query users
   * Similar to <code>addQueryUsers</code> but it also returns the http response headers .
   * Add query users
   * @param id Id of the query (required)
   * @param requestBody  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/queries/{id}/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Query> addQueryUsersWithHttpInfo(@Param("id") UUID id, List<String> requestBody);



  /**
   * Create or update a query
   * Create a query, if it does not exist. If a query already exists, update the query.
   * @param createQuery  (optional)
   * @return Query
   */
  @RequestLine("PUT /v1/queries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Query createOrUpdateQuery(CreateQuery createQuery);

  /**
   * Create or update a query
   * Similar to <code>createOrUpdateQuery</code> but it also returns the http response headers .
   * Create a query, if it does not exist. If a query already exists, update the query.
   * @param createQuery  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/queries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Query> createOrUpdateQueryWithHttpInfo(CreateQuery createQuery);



  /**
   * Create a query
   * Create a query under an existing entity.
   * @param createQuery  (optional)
   * @return QueryList
   */
  @RequestLine("POST /v1/queries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  QueryList createQuery(CreateQuery createQuery);

  /**
   * Create a query
   * Similar to <code>createQuery</code> but it also returns the http response headers .
   * Create a query under an existing entity.
   * @param createQuery  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/queries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<QueryList> createQueryWithHttpInfo(CreateQuery createQuery);



  /**
   * Remove a follower
   * Remove the user identified &#x60;userId&#x60; as a follower of the model.
   * @param id Id of the Query (required)
   * @param userId Id of the user being removed as follower (required)
   * @return ChangeEvent
   */
  @RequestLine("DELETE /v1/queries/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ChangeEvent deleteFollower4(@Param("id") UUID id, @Param("userId") UUID userId);

  /**
   * Remove a follower
   * Similar to <code>deleteFollower4</code> but it also returns the http response headers .
   * Remove the user identified &#x60;userId&#x60; as a follower of the model.
   * @param id Id of the Query (required)
   * @param userId Id of the user being removed as follower (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/queries/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> deleteFollower4WithHttpInfo(@Param("id") UUID id, @Param("userId") UUID userId);



  /**
   * Delete a query
   * Delete a query by &#x60;id&#x60;.
   * @param id Id of the query (required)
   */
  @RequestLine("DELETE /v1/queries/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteQuery(@Param("id") UUID id);

  /**
   * Delete a query
   * Similar to <code>deleteQuery</code> but it also returns the http response headers .
   * Delete a query by &#x60;id&#x60;.
   * @param id Id of the query (required)
   */
  @RequestLine("DELETE /v1/queries/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteQueryWithHttpInfo(@Param("id") UUID id);



  /**
   * Delete a query
   * Delete a query by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the location (required)
   */
  @RequestLine("DELETE /v1/queries/name/{fqn}")
  @Headers({
    "Accept: application/json",
  })
  void deleteQueryByFQN(@Param("fqn") String fqn);

  /**
   * Delete a query
   * Similar to <code>deleteQueryByFQN</code> but it also returns the http response headers .
   * Delete a query by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the location (required)
   */
  @RequestLine("DELETE /v1/queries/name/{fqn}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteQueryByFQNWithHttpInfo(@Param("fqn") String fqn);



  /**
   * Get a query
   * Get a Query by &#x60;id&#x60;
   * @param id query Id (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return Query
   */
  @RequestLine("GET /v1/queries/{id}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  Query getQueryById(@Param("id") UUID id, @Param("fields") String fields);

  /**
   * Get a query
   * Similar to <code>getQueryById</code> but it also returns the http response headers .
   * Get a Query by &#x60;id&#x60;
   * @param id query Id (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/queries/{id}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Query> getQueryByIdWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields);


  /**
   * Get a query
   * Get a Query by &#x60;id&#x60;
   * Note, this is equivalent to the other <code>getQueryById</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetQueryByIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id query Id (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   </ul>
   * @return Query
   */
  @RequestLine("GET /v1/queries/{id}?fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  Query getQueryById(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a query
  * Get a Query by &#x60;id&#x60;
  * Note, this is equivalent to the other <code>getQueryById</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id query Id (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
      *   </ul>
          * @return Query
      */
      @RequestLine("GET /v1/queries/{id}?fields={fields}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Query> getQueryByIdWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getQueryById</code> method in a fluent style.
   */
  public static class GetQueryByIdQueryParams extends HashMap<String, Object> {
    public GetQueryByIdQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a query by name
   * Get a query by fully qualified table name.
   * @param fqn Fully qualified name of the query (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return Query
   */
  @RequestLine("GET /v1/queries/name/{fqn}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  Query getQueryFqn(@Param("fqn") String fqn, @Param("fields") String fields);

  /**
   * Get a query by name
   * Similar to <code>getQueryFqn</code> but it also returns the http response headers .
   * Get a query by fully qualified table name.
   * @param fqn Fully qualified name of the query (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/queries/name/{fqn}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Query> getQueryFqnWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields);


  /**
   * Get a query by name
   * Get a query by fully qualified table name.
   * Note, this is equivalent to the other <code>getQueryFqn</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetQueryFqnQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the query (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   </ul>
   * @return Query
   */
  @RequestLine("GET /v1/queries/name/{fqn}?fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  Query getQueryFqn(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a query by name
  * Get a query by fully qualified table name.
  * Note, this is equivalent to the other <code>getQueryFqn</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the query (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
      *   </ul>
          * @return Query
      */
      @RequestLine("GET /v1/queries/name/{fqn}?fields={fields}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Query> getQueryFqnWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getQueryFqn</code> method in a fluent style.
   */
  public static class GetQueryFqnQueryParams extends HashMap<String, Object> {
    public GetQueryFqnQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a specific version of the query
   * Get a version of the query by given &#x60;id&#x60;
   * @param id Query Id (required)
   * @param version Query version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Query
   */
  @RequestLine("GET /v1/queries/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Query getSpecificQueryVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a specific version of the query
   * Similar to <code>getSpecificQueryVersion</code> but it also returns the http response headers .
   * Get a version of the query by given &#x60;id&#x60;
   * @param id Query Id (required)
   * @param version Query version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/queries/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Query> getSpecificQueryVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get List of all query versions
   * Get a list of all the versions of a query identified by &#x60;id&#x60;
   * @param id Query Id (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/queries/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllQueryVersion(@Param("id") String id);

  /**
   * Get List of all query versions
   * Similar to <code>listAllQueryVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a query identified by &#x60;id&#x60;
   * @param id Query Id (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/queries/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllQueryVersionWithHttpInfo(@Param("id") String id);



  /**
   * Get a list of Queries
   * Get a list of queries. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param entityId UUID of the entity for which to list the Queries (optional)
   * @param service Filter Queries by service Fully Qualified Name (optional)
   * @param limit Limit the number queries returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of queries before this cursor (optional)
   * @param after Returns list of queries after this cursor (optional)
   * @return QueryList
   */
  @RequestLine("GET /v1/queries?fields={fields}&entityId={entityId}&service={service}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  QueryList listQueries(@Param("fields") String fields, @Param("entityId") UUID entityId, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);

  /**
   * Get a list of Queries
   * Similar to <code>listQueries</code> but it also returns the http response headers .
   * Get a list of queries. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param entityId UUID of the entity for which to list the Queries (optional)
   * @param service Filter Queries by service Fully Qualified Name (optional)
   * @param limit Limit the number queries returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of queries before this cursor (optional)
   * @param after Returns list of queries after this cursor (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/queries?fields={fields}&entityId={entityId}&service={service}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<QueryList> listQueriesWithHttpInfo(@Param("fields") String fields, @Param("entityId") UUID entityId, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);


  /**
   * Get a list of Queries
   * Get a list of queries. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listQueries</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListQueriesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>entityId - UUID of the entity for which to list the Queries (optional)</li>
   *   <li>service - Filter Queries by service Fully Qualified Name (optional)</li>
   *   <li>limit - Limit the number queries returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of queries before this cursor (optional)</li>
   *   <li>after - Returns list of queries after this cursor (optional)</li>
   *   </ul>
   * @return QueryList
   */
  @RequestLine("GET /v1/queries?fields={fields}&entityId={entityId}&service={service}&limit={limit}&before={before}&after={after}")
  @Headers({
  "Accept: application/json",
  })
  QueryList listQueries(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a list of Queries
  * Get a list of queries. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listQueries</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>entityId - UUID of the entity for which to list the Queries (optional)</li>
          *   <li>service - Filter Queries by service Fully Qualified Name (optional)</li>
          *   <li>limit - Limit the number queries returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of queries before this cursor (optional)</li>
          *   <li>after - Returns list of queries after this cursor (optional)</li>
      *   </ul>
          * @return QueryList
      */
      @RequestLine("GET /v1/queries?fields={fields}&entityId={entityId}&service={service}&limit={limit}&before={before}&after={after}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<QueryList> listQueriesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listQueries</code> method in a fluent style.
   */
  public static class ListQueriesQueryParams extends HashMap<String, Object> {
    public ListQueriesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListQueriesQueryParams entityId(final UUID value) {
      put("entityId", EncodingUtils.encode(value));
      return this;
    }
    public ListQueriesQueryParams service(final String value) {
      put("service", EncodingUtils.encode(value));
      return this;
    }
    public ListQueriesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListQueriesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListQueriesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a query
   * Update an existing query using JsonPatch.
   * @param id Id of the query (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a query Documentation</a>
   */
  @RequestLine("PATCH /v1/queries/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchQuery(@Param("id") UUID id, Object body);

  /**
   * Update a query
   * Similar to <code>patchQuery</code> but it also returns the http response headers .
   * Update an existing query using JsonPatch.
   * @param id Id of the query (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a query Documentation</a>
   */
  @RequestLine("PATCH /v1/queries/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchQueryWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * remove query used in
   * remove Query Used in
   * @param id Id of the query (required)
   * @param entityReference  (optional)
   * @return Query
   */
  @RequestLine("DELETE /v1/queries/{id}/usage")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Query removeQueryUsedIn(@Param("id") UUID id, List<EntityReference> entityReference);

  /**
   * remove query used in
   * Similar to <code>removeQueryUsedIn</code> but it also returns the http response headers .
   * remove Query Used in
   * @param id Id of the query (required)
   * @param entityReference  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/queries/{id}/usage")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Query> removeQueryUsedInWithHttpInfo(@Param("id") UUID id, List<EntityReference> entityReference);



  /**
   * Restore a soft deleted Query
   * Restore a soft deleted Query.
   * @param restoreEntity  (optional)
   * @return Query
   */
  @RequestLine("PUT /v1/queries/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Query restore22(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted Query
   * Similar to <code>restore22</code> but it also returns the http response headers .
   * Restore a soft deleted Query.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/queries/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Query> restore22WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/queries/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity16(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity16</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/queries/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity16WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
