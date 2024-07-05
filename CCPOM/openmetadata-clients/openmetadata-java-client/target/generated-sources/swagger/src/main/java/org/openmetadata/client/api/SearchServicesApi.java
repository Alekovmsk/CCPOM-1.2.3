package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateSearchService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.SearchService;
import org.openmetadata.client.model.SearchServiceList;
import org.openmetadata.client.model.TestConnectionResult;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface SearchServicesApi extends ApiClient.Api {


  /**
   * Add test connection result
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return SearchService
   */
  @RequestLine("PUT /v1/services/searchServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SearchService addTestConnectionResult6(@Param("id") UUID id, TestConnectionResult testConnectionResult);

  /**
   * Add test connection result
   * Similar to <code>addTestConnectionResult6</code> but it also returns the http response headers .
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/searchServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SearchService> addTestConnectionResult6WithHttpInfo(@Param("id") UUID id, TestConnectionResult testConnectionResult);



  /**
   * Update search service
   * Update an existing or create a new search service.
   * @param createSearchService  (optional)
   * @return SearchService
   */
  @RequestLine("PUT /v1/services/searchServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SearchService createOrUpdateSearchService(CreateSearchService createSearchService);

  /**
   * Update search service
   * Similar to <code>createOrUpdateSearchService</code> but it also returns the http response headers .
   * Update an existing or create a new search service.
   * @param createSearchService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/searchServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SearchService> createOrUpdateSearchServiceWithHttpInfo(CreateSearchService createSearchService);



  /**
   * Create search service
   * Create a new search service.
   * @param createSearchService  (optional)
   * @return SearchService
   */
  @RequestLine("POST /v1/services/searchServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SearchService createSearchService(CreateSearchService createSearchService);

  /**
   * Create search service
   * Similar to <code>createSearchService</code> but it also returns the http response headers .
   * Create a new search service.
   * @param createSearchService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/services/searchServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SearchService> createSearchServiceWithHttpInfo(CreateSearchService createSearchService);



  /**
   * Delete an search service
   * Delete an search services. If containers belong the service, it can&#39;t be deleted.
   * @param id Id of the search service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/searchServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteSearchService(@Param("id") String id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete an search service
   * Similar to <code>deleteSearchService</code> but it also returns the http response headers .
   * Delete an search services. If containers belong the service, it can&#39;t be deleted.
   * @param id Id of the search service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/searchServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteSearchServiceWithHttpInfo(@Param("id") String id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete an search service
   * Delete an search services. If containers belong the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deleteSearchService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSearchServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the search service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/searchServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteSearchService(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete an search service
  * Delete an search services. If containers belong the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deleteSearchService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the search service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/searchServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteSearchServiceWithHttpInfo(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSearchService</code> method in a fluent style.
   */
  public static class DeleteSearchServiceQueryParams extends HashMap<String, Object> {
    public DeleteSearchServiceQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteSearchServiceQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete an SearchService by fully qualified name
   * Delete an SearchService by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Name of the SearchService (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/searchServices/name/{fqn}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteSearchServiceByFQN(@Param("fqn") String fqn, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete an SearchService by fully qualified name
   * Similar to <code>deleteSearchServiceByFQN</code> but it also returns the http response headers .
   * Delete an SearchService by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Name of the SearchService (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/searchServices/name/{fqn}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteSearchServiceByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete an SearchService by fully qualified name
   * Delete an SearchService by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteSearchServiceByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSearchServiceByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Name of the SearchService (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/searchServices/name/{fqn}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteSearchServiceByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete an SearchService by fully qualified name
  * Delete an SearchService by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteSearchServiceByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Name of the SearchService (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/searchServices/name/{fqn}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteSearchServiceByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSearchServiceByFQN</code> method in a fluent style.
   */
  public static class DeleteSearchServiceByFQNQueryParams extends HashMap<String, Object> {
    public DeleteSearchServiceByFQNQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteSearchServiceByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get search service by name
   * Get a search service by the service &#x60;name&#x60;.
   * @param name  (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return SearchService
   */
  @RequestLine("GET /v1/services/searchServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  SearchService getSearchServiceByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get search service by name
   * Similar to <code>getSearchServiceByFQN</code> but it also returns the http response headers .
   * Get a search service by the service &#x60;name&#x60;.
   * @param name  (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/searchServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchService> getSearchServiceByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get search service by name
   * Get a search service by the service &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getSearchServiceByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSearchServiceByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return SearchService
   */
  @RequestLine("GET /v1/services/searchServices/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  SearchService getSearchServiceByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get search service by name
  * Get a search service by the service &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getSearchServiceByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return SearchService
      */
      @RequestLine("GET /v1/services/searchServices/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchService> getSearchServiceByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getSearchServiceByFQN</code> method in a fluent style.
   */
  public static class GetSearchServiceByFQNQueryParams extends HashMap<String, Object> {
    public GetSearchServiceByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetSearchServiceByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get an search service
   * Get an search service by &#x60;id&#x60;.
   * @param id  (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return SearchService
   */
  @RequestLine("GET /v1/services/searchServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  SearchService getSearchServiceByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get an search service
   * Similar to <code>getSearchServiceByID</code> but it also returns the http response headers .
   * Get an search service by &#x60;id&#x60;.
   * @param id  (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/searchServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchService> getSearchServiceByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get an search service
   * Get an search service by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getSearchServiceByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSearchServiceByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return SearchService
   */
  @RequestLine("GET /v1/services/searchServices/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  SearchService getSearchServiceByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get an search service
  * Get an search service by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getSearchServiceByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return SearchService
      */
      @RequestLine("GET /v1/services/searchServices/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchService> getSearchServiceByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getSearchServiceByID</code> method in a fluent style.
   */
  public static class GetSearchServiceByIDQueryParams extends HashMap<String, Object> {
    public GetSearchServiceByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetSearchServiceByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the search service
   * Get a version of the search service by given &#x60;id&#x60;
   * @param id search service Id (required)
   * @param version search service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return SearchService
   */
  @RequestLine("GET /v1/services/searchServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  SearchService getSpecificSearchServiceVersion(@Param("id") String id, @Param("version") String version);

  /**
   * Get a version of the search service
   * Similar to <code>getSpecificSearchServiceVersion</code> but it also returns the http response headers .
   * Get a version of the search service by given &#x60;id&#x60;
   * @param id search service Id (required)
   * @param version search service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/searchServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchService> getSpecificSearchServiceVersionWithHttpInfo(@Param("id") String id, @Param("version") String version);



  /**
   * List search service versions
   * Get a list of all the versions of an search service identified by &#x60;id&#x60;
   * @param id search service Id (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/services/searchServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllSearchServiceVersion(@Param("id") String id);

  /**
   * List search service versions
   * Similar to <code>listAllSearchServiceVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of an search service identified by &#x60;id&#x60;
   * @param id search service Id (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/searchServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllSearchServiceVersionWithHttpInfo(@Param("id") String id);



  /**
   * List search services
   * Get a list of search services.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of search services before this cursor (optional)
   * @param after Returns list of search services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return SearchServiceList
   */
  @RequestLine("GET /v1/services/searchServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  SearchServiceList listSearchServices(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List search services
   * Similar to <code>listSearchServices</code> but it also returns the http response headers .
   * Get a list of search services.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of search services before this cursor (optional)
   * @param after Returns list of search services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/searchServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SearchServiceList> listSearchServicesWithHttpInfo(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List search services
   * Get a list of search services.
   * Note, this is equivalent to the other <code>listSearchServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListSearchServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>domain - Filter services by domain (optional)</li>
   *   <li>limit -  (optional, default to 10)</li>
   *   <li>before - Returns list of search services before this cursor (optional)</li>
   *   <li>after - Returns list of search services after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return SearchServiceList
   */
  @RequestLine("GET /v1/services/searchServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  SearchServiceList listSearchServices(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List search services
  * Get a list of search services.
  * Note, this is equivalent to the other <code>listSearchServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>domain - Filter services by domain (optional)</li>
          *   <li>limit -  (optional, default to 10)</li>
          *   <li>before - Returns list of search services before this cursor (optional)</li>
          *   <li>after - Returns list of search services after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return SearchServiceList
      */
      @RequestLine("GET /v1/services/searchServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SearchServiceList> listSearchServicesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listSearchServices</code> method in a fluent style.
   */
  public static class ListSearchServicesQueryParams extends HashMap<String, Object> {
    public ListSearchServicesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListSearchServicesQueryParams domain(final String value) {
      put("domain", EncodingUtils.encode(value));
      return this;
    }
    public ListSearchServicesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListSearchServicesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListSearchServicesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListSearchServicesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update an search service
   * Update an existing search service using JsonPatch.
   * @param id  (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update an search service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/searchServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchSearchService(@Param("id") UUID id, Object body);

  /**
   * Update an search service
   * Similar to <code>patchSearchService</code> but it also returns the http response headers .
   * Update an existing search service using JsonPatch.
   * @param id  (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update an search service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/searchServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchSearchServiceWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted SearchService.
   * Restore a soft deleted SearchService.
   * @param restoreEntity  (optional)
   * @return SearchService
   */
  @RequestLine("PUT /v1/services/searchServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SearchService restore30(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted SearchService.
   * Similar to <code>restore30</code> but it also returns the http response headers .
   * Restore a soft deleted SearchService.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/searchServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SearchService> restore30WithHttpInfo(RestoreEntity restoreEntity);


}
