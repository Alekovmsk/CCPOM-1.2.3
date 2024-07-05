package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateSearchIndex;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.SearchIndex;
import org.openmetadata.client.model.SearchIndexList;
import org.openmetadata.client.model.SearchIndexSampleData;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface SearchIndexApi extends ApiClient.Api {


  /**
   * Add a follower
   * Add a user identified by &#x60;userId&#x60; as followed of this SearchIndex
   * @param id Id of the SearchIndex (required)
   * @param body Id of the user to be added as follower (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/searchIndexes/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent addFollower4(@Param("id") UUID id, UUID body);

  /**
   * Add a follower
   * Similar to <code>addFollower4</code> but it also returns the http response headers .
   * Add a user identified by &#x60;userId&#x60; as followed of this SearchIndex
   * @param id Id of the SearchIndex (required)
   * @param body Id of the user to be added as follower (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/searchIndexes/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> addFollower4WithHttpInfo(@Param("id") UUID id, UUID body);



  /**
   * Add sample data
   * Add sample data to the searchIndex.
   * @param id Id of the SearchIndex (required)
   * @param searchIndexSampleData  (optional)
   * @return SearchIndex
   */
  @RequestLine("PUT /v1/searchIndexes/{id}/sampleData")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SearchIndex addSampleData1(@Param("id") UUID id, SearchIndexSampleData searchIndexSampleData);

  /**
   * Add sample data
   * Similar to <code>addSampleData1</code> but it also returns the http response headers .
   * Add sample data to the searchIndex.
   * @param id Id of the SearchIndex (required)
   * @param searchIndexSampleData  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/searchIndexes/{id}/sampleData")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SearchIndex> addSampleData1WithHttpInfo(@Param("id") UUID id, SearchIndexSampleData searchIndexSampleData);



  /**
   * Update SearchIndex
   * Create a SearchIndex, it it does not exist or update an existing SearchIndex.
   * @param createSearchIndex  (optional)
   * @return SearchIndex
   */
  @RequestLine("PUT /v1/searchIndexes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SearchIndex createOrUpdateSearchIndex(CreateSearchIndex createSearchIndex);

  /**
   * Update SearchIndex
   * Similar to <code>createOrUpdateSearchIndex</code> but it also returns the http response headers .
   * Create a SearchIndex, it it does not exist or update an existing SearchIndex.
   * @param createSearchIndex  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/searchIndexes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SearchIndex> createOrUpdateSearchIndexWithHttpInfo(CreateSearchIndex createSearchIndex);



  /**
   * Create a SearchIndex
   * Create a SearchIndex under an existing &#x60;service&#x60;.
   * @param createSearchIndex  (optional)
   * @return SearchIndex
   */
  @RequestLine("POST /v1/searchIndexes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SearchIndex createSearchIndex(CreateSearchIndex createSearchIndex);

  /**
   * Create a SearchIndex
   * Similar to <code>createSearchIndex</code> but it also returns the http response headers .
   * Create a SearchIndex under an existing &#x60;service&#x60;.
   * @param createSearchIndex  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/searchIndexes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SearchIndex> createSearchIndexWithHttpInfo(CreateSearchIndex createSearchIndex);



  /**
   * Remove a follower
   * Remove the user identified &#x60;userId&#x60; as a follower of the SearchIndex.
   * @param id Id of the SearchIndex (required)
   * @param userId Id of the user being removed as follower (required)
   * @return ChangeEvent
   */
  @RequestLine("DELETE /v1/searchIndexes/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ChangeEvent deleteFollower5(@Param("id") UUID id, @Param("userId") String userId);

  /**
   * Remove a follower
   * Similar to <code>deleteFollower5</code> but it also returns the http response headers .
   * Remove the user identified &#x60;userId&#x60; as a follower of the SearchIndex.
   * @param id Id of the SearchIndex (required)
   * @param userId Id of the user being removed as follower (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/searchIndexes/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> deleteFollower5WithHttpInfo(@Param("id") UUID id, @Param("userId") String userId);



  /**
   * Delete a SearchIndex by id
   * Delete a SearchIndex by &#x60;id&#x60;.
   * @param id Id of the SearchIndex (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/searchIndexes/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteSearchIndex(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a SearchIndex by id
   * Similar to <code>deleteSearchIndex</code> but it also returns the http response headers .
   * Delete a SearchIndex by &#x60;id&#x60;.
   * @param id Id of the SearchIndex (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/searchIndexes/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteSearchIndexWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a SearchIndex by id
   * Delete a SearchIndex by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteSearchIndex</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSearchIndexQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the SearchIndex (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/searchIndexes/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteSearchIndex(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a SearchIndex by id
  * Delete a SearchIndex by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteSearchIndex</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the SearchIndex (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/searchIndexes/{id}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteSearchIndexWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSearchIndex</code> method in a fluent style.
   */
  public static class DeleteSearchIndexQueryParams extends HashMap<String, Object> {
    public DeleteSearchIndexQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteSearchIndexQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a SearchIndex by fully qualified name
   * Delete a SearchIndex by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the SearchIndex (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/searchIndexes/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteSearchIndexByFQN(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a SearchIndex by fully qualified name
   * Similar to <code>deleteSearchIndexByFQN</code> but it also returns the http response headers .
   * Delete a SearchIndex by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the SearchIndex (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/searchIndexes/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteSearchIndexByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a SearchIndex by fully qualified name
   * Delete a SearchIndex by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteSearchIndexByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSearchIndexByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the SearchIndex (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/searchIndexes/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteSearchIndexByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a SearchIndex by fully qualified name
  * Delete a SearchIndex by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteSearchIndexByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the SearchIndex (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/searchIndexes/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteSearchIndexByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSearchIndexByFQN</code> method in a fluent style.
   */
  public static class DeleteSearchIndexByFQNQueryParams extends HashMap<String, Object> {
    public DeleteSearchIndexByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteSearchIndexByFQNQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a SearchIndex by id
   * Get a SearchIndex by &#x60;id&#x60;.
   * @param id Id of the SearchIndex (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return SearchIndex
   */
  @RequestLine("GET /v1/searchIndexes/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  SearchIndex get6(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a SearchIndex by id
   * Similar to <code>get6</code> but it also returns the http response headers .
   * Get a SearchIndex by &#x60;id&#x60;.
   * @param id Id of the SearchIndex (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/searchIndexes/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchIndex> get6WithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a SearchIndex by id
   * Get a SearchIndex by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>get6</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Get6QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the SearchIndex (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return SearchIndex
   */
  @RequestLine("GET /v1/searchIndexes/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  SearchIndex get6(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a SearchIndex by id
  * Get a SearchIndex by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>get6</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the SearchIndex (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return SearchIndex
      */
      @RequestLine("GET /v1/searchIndexes/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchIndex> get6WithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>get6</code> method in a fluent style.
   */
  public static class Get6QueryParams extends HashMap<String, Object> {
    public Get6QueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public Get6QueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get sample data
   * Get sample data from the SearchIndex.
   * @param id Id of the SearchIndex (required)
   * @return SearchIndex
   */
  @RequestLine("GET /v1/searchIndexes/{id}/sampleData")
  @Headers({
    "Accept: application/json",
  })
  SearchIndex getSampleData1(@Param("id") UUID id);

  /**
   * Get sample data
   * Similar to <code>getSampleData1</code> but it also returns the http response headers .
   * Get sample data from the SearchIndex.
   * @param id Id of the SearchIndex (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/searchIndexes/{id}/sampleData")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchIndex> getSampleData1WithHttpInfo(@Param("id") UUID id);



  /**
   * Get a SearchIndex by fully qualified name
   * Get a SearchIndex by fully qualified name.
   * @param fqn Fully qualified name of the SearchIndex (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return SearchIndex
   */
  @RequestLine("GET /v1/searchIndexes/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  SearchIndex getSearchIndexByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a SearchIndex by fully qualified name
   * Similar to <code>getSearchIndexByFQN</code> but it also returns the http response headers .
   * Get a SearchIndex by fully qualified name.
   * @param fqn Fully qualified name of the SearchIndex (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/searchIndexes/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchIndex> getSearchIndexByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a SearchIndex by fully qualified name
   * Get a SearchIndex by fully qualified name.
   * Note, this is equivalent to the other <code>getSearchIndexByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSearchIndexByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the SearchIndex (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return SearchIndex
   */
  @RequestLine("GET /v1/searchIndexes/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  SearchIndex getSearchIndexByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a SearchIndex by fully qualified name
  * Get a SearchIndex by fully qualified name.
  * Note, this is equivalent to the other <code>getSearchIndexByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the SearchIndex (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return SearchIndex
      */
      @RequestLine("GET /v1/searchIndexes/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchIndex> getSearchIndexByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getSearchIndexByFQN</code> method in a fluent style.
   */
  public static class GetSearchIndexByFQNQueryParams extends HashMap<String, Object> {
    public GetSearchIndexByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetSearchIndexByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the SearchIndex
   * Get a version of the SearchIndex by given &#x60;id&#x60;
   * @param id Id of the SearchIndex (required)
   * @param version SearchIndex version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return SearchIndex
   */
  @RequestLine("GET /v1/searchIndexes/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  SearchIndex getSpecificSearchIndexVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the SearchIndex
   * Similar to <code>getSpecificSearchIndexVersion</code> but it also returns the http response headers .
   * Get a version of the SearchIndex by given &#x60;id&#x60;
   * @param id Id of the SearchIndex (required)
   * @param version SearchIndex version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/searchIndexes/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchIndex> getSpecificSearchIndexVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List SearchIndex versions
   * Get a list of all the versions of a SearchIndex identified by &#x60;id&#x60;
   * @param id Id of the SearchIndex (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/searchIndexes/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllSearchIndexVersion(@Param("id") UUID id);

  /**
   * List SearchIndex versions
   * Similar to <code>listAllSearchIndexVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a SearchIndex identified by &#x60;id&#x60;
   * @param id Id of the SearchIndex (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/searchIndexes/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllSearchIndexVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List searchIndexes
   * Get a list of SearchIndexes, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter SearchIndexes by service name (optional)
   * @param limit Limit the number SearchIndexes returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of SearchIndexes before this cursor (optional)
   * @param after Returns list of SearchIndexes after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return SearchIndexList
   */
  @RequestLine("GET /v1/searchIndexes?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  SearchIndexList listSearchIndexes(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List searchIndexes
   * Similar to <code>listSearchIndexes</code> but it also returns the http response headers .
   * Get a list of SearchIndexes, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter SearchIndexes by service name (optional)
   * @param limit Limit the number SearchIndexes returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of SearchIndexes before this cursor (optional)
   * @param after Returns list of SearchIndexes after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/searchIndexes?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchIndexList> listSearchIndexesWithHttpInfo(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List searchIndexes
   * Get a list of SearchIndexes, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listSearchIndexes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListSearchIndexesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>service - Filter SearchIndexes by service name (optional)</li>
   *   <li>limit - Limit the number SearchIndexes returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of SearchIndexes before this cursor (optional)</li>
   *   <li>after - Returns list of SearchIndexes after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return SearchIndexList
   */
  @RequestLine("GET /v1/searchIndexes?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  SearchIndexList listSearchIndexes(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List searchIndexes
  * Get a list of SearchIndexes, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listSearchIndexes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>service - Filter SearchIndexes by service name (optional)</li>
          *   <li>limit - Limit the number SearchIndexes returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of SearchIndexes before this cursor (optional)</li>
          *   <li>after - Returns list of SearchIndexes after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return SearchIndexList
      */
      @RequestLine("GET /v1/searchIndexes?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchIndexList> listSearchIndexesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listSearchIndexes</code> method in a fluent style.
   */
  public static class ListSearchIndexesQueryParams extends HashMap<String, Object> {
    public ListSearchIndexesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListSearchIndexesQueryParams service(final String value) {
      put("service", EncodingUtils.encode(value));
      return this;
    }
    public ListSearchIndexesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListSearchIndexesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListSearchIndexesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListSearchIndexesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a SearchIndex
   * Update an existing SearchIndex using JsonPatch.
   * @param id Id of the SearchIndex (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a SearchIndex Documentation</a>
   */
  @RequestLine("PATCH /v1/searchIndexes/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchSearchIndex(@Param("id") UUID id, Object body);

  /**
   * Update a SearchIndex
   * Similar to <code>patchSearchIndex</code> but it also returns the http response headers .
   * Update an existing SearchIndex using JsonPatch.
   * @param id Id of the SearchIndex (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a SearchIndex Documentation</a>
   */
  @RequestLine("PATCH /v1/searchIndexes/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchSearchIndexWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted SearchIndex
   * Restore a soft deleted SearchIndex.
   * @param restoreEntity  (optional)
   * @return SearchIndex
   */
  @RequestLine("PUT /v1/searchIndexes/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SearchIndex restore23(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted SearchIndex
   * Similar to <code>restore23</code> but it also returns the http response headers .
   * Restore a soft deleted SearchIndex.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/searchIndexes/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SearchIndex> restore23WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/searchIndexes/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity18(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity18</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/searchIndexes/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity18WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
