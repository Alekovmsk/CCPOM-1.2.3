package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateMessagingService;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.MessagingService;
import org.openmetadata.client.model.MessagingServiceList;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.TestConnectionResult;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface MessagingServicesApi extends ApiClient.Api {


  /**
   * Add test connection result
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return DatabaseService
   */
  @RequestLine("PUT /v1/services/messagingServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseService addTestConnectionResult2(@Param("id") UUID id, TestConnectionResult testConnectionResult);

  /**
   * Add test connection result
   * Similar to <code>addTestConnectionResult2</code> but it also returns the http response headers .
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/messagingServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> addTestConnectionResult2WithHttpInfo(@Param("id") UUID id, TestConnectionResult testConnectionResult);



  /**
   * Create a messaging service
   * Create a new messaging service.
   * @param createMessagingService  (optional)
   * @return MessagingService
   */
  @RequestLine("POST /v1/services/messagingServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MessagingService createMessagingService(CreateMessagingService createMessagingService);

  /**
   * Create a messaging service
   * Similar to <code>createMessagingService</code> but it also returns the http response headers .
   * Create a new messaging service.
   * @param createMessagingService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/services/messagingServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MessagingService> createMessagingServiceWithHttpInfo(CreateMessagingService createMessagingService);



  /**
   * Update messaging service
   * Create a new messaging service or Update an existing messaging service identified by &#x60;id&#x60;.
   * @param createMessagingService  (optional)
   * @return MessagingService
   */
  @RequestLine("PUT /v1/services/messagingServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MessagingService createOrUpdateMessagingService(CreateMessagingService createMessagingService);

  /**
   * Update messaging service
   * Similar to <code>createOrUpdateMessagingService</code> but it also returns the http response headers .
   * Create a new messaging service or Update an existing messaging service identified by &#x60;id&#x60;.
   * @param createMessagingService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/messagingServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MessagingService> createOrUpdateMessagingServiceWithHttpInfo(CreateMessagingService createMessagingService);



  /**
   * Delete a messaging service by Id
   * Delete a messaging service. If topics belong the service, it can&#39;t be deleted.
   * @param id Id of the messaging service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/messagingServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteMessagingService(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a messaging service by Id
   * Similar to <code>deleteMessagingService</code> but it also returns the http response headers .
   * Delete a messaging service. If topics belong the service, it can&#39;t be deleted.
   * @param id Id of the messaging service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/messagingServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteMessagingServiceWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a messaging service by Id
   * Delete a messaging service. If topics belong the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deleteMessagingService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMessagingServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the messaging service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/messagingServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteMessagingService(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a messaging service by Id
  * Delete a messaging service. If topics belong the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deleteMessagingService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the messaging service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/messagingServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteMessagingServiceWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMessagingService</code> method in a fluent style.
   */
  public static class DeleteMessagingServiceQueryParams extends HashMap<String, Object> {
    public DeleteMessagingServiceQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteMessagingServiceQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a messaging service by name
   * Delete a messaging service by &#x60;name&#x60;. If topics belong the service, it can&#39;t be deleted.
   * @param name Name of the messaging service (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/messagingServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteMessagingServiceByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a messaging service by name
   * Similar to <code>deleteMessagingServiceByName</code> but it also returns the http response headers .
   * Delete a messaging service by &#x60;name&#x60;. If topics belong the service, it can&#39;t be deleted.
   * @param name Name of the messaging service (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/messagingServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteMessagingServiceByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a messaging service by name
   * Delete a messaging service by &#x60;name&#x60;. If topics belong the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deleteMessagingServiceByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMessagingServiceByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the messaging service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/messagingServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteMessagingServiceByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a messaging service by name
  * Delete a messaging service by &#x60;name&#x60;. If topics belong the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deleteMessagingServiceByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the messaging service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/messagingServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteMessagingServiceByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMessagingServiceByName</code> method in a fluent style.
   */
  public static class DeleteMessagingServiceByNameQueryParams extends HashMap<String, Object> {
    public DeleteMessagingServiceByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteMessagingServiceByNameQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get messaging service by name
   * Get a messaging service by the service &#x60;name&#x60;.
   * @param name Name of the messaging service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return MessagingService
   */
  @RequestLine("GET /v1/services/messagingServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  MessagingService getMessagingServiceByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get messaging service by name
   * Similar to <code>getMessagingServiceByFQN</code> but it also returns the http response headers .
   * Get a messaging service by the service &#x60;name&#x60;.
   * @param name Name of the messaging service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/messagingServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MessagingService> getMessagingServiceByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get messaging service by name
   * Get a messaging service by the service &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getMessagingServiceByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMessagingServiceByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the messaging service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return MessagingService
   */
  @RequestLine("GET /v1/services/messagingServices/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  MessagingService getMessagingServiceByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get messaging service by name
  * Get a messaging service by the service &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getMessagingServiceByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the messaging service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return MessagingService
      */
      @RequestLine("GET /v1/services/messagingServices/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MessagingService> getMessagingServiceByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getMessagingServiceByFQN</code> method in a fluent style.
   */
  public static class GetMessagingServiceByFQNQueryParams extends HashMap<String, Object> {
    public GetMessagingServiceByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetMessagingServiceByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a messaging service by Id
   * Get a messaging service by &#x60;Id&#x60;.
   * @param id Id of the messaging service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return MessagingService
   */
  @RequestLine("GET /v1/services/messagingServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  MessagingService getMessagingServiceByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a messaging service by Id
   * Similar to <code>getMessagingServiceByID</code> but it also returns the http response headers .
   * Get a messaging service by &#x60;Id&#x60;.
   * @param id Id of the messaging service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/messagingServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MessagingService> getMessagingServiceByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a messaging service by Id
   * Get a messaging service by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getMessagingServiceByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMessagingServiceByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the messaging service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return MessagingService
   */
  @RequestLine("GET /v1/services/messagingServices/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  MessagingService getMessagingServiceByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a messaging service by Id
  * Get a messaging service by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getMessagingServiceByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the messaging service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return MessagingService
      */
      @RequestLine("GET /v1/services/messagingServices/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MessagingService> getMessagingServiceByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getMessagingServiceByID</code> method in a fluent style.
   */
  public static class GetMessagingServiceByIDQueryParams extends HashMap<String, Object> {
    public GetMessagingServiceByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetMessagingServiceByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the messaging service
   * Get a version of the messaging service by given &#x60;Id&#x60;
   * @param id Id of the messaging service (required)
   * @param version messaging service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return MessagingService
   */
  @RequestLine("GET /v1/services/messagingServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  MessagingService getSpecificMessagingServiceVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the messaging service
   * Similar to <code>getSpecificMessagingServiceVersion</code> but it also returns the http response headers .
   * Get a version of the messaging service by given &#x60;Id&#x60;
   * @param id Id of the messaging service (required)
   * @param version messaging service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/messagingServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MessagingService> getSpecificMessagingServiceVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List messaging service versions
   * Get a list of all the versions of a messaging service identified by &#x60;id&#x60;
   * @param id Id of the messaging service (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/services/messagingServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllMessagingServiceVersion(@Param("id") UUID id);

  /**
   * List messaging service versions
   * Similar to <code>listAllMessagingServiceVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a messaging service identified by &#x60;id&#x60;
   * @param id Id of the messaging service (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/messagingServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllMessagingServiceVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List messaging services
   * Get a list of messaging services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit Limit number services returned. (1 to 1000000, default 10) (optional, default to 10)
   * @param before Returns list of services before this cursor (optional)
   * @param after Returns list of services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return MessagingServiceList
   */
  @RequestLine("GET /v1/services/messagingServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  MessagingServiceList listMessagingService(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List messaging services
   * Similar to <code>listMessagingService</code> but it also returns the http response headers .
   * Get a list of messaging services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit Limit number services returned. (1 to 1000000, default 10) (optional, default to 10)
   * @param before Returns list of services before this cursor (optional)
   * @param after Returns list of services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/messagingServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MessagingServiceList> listMessagingServiceWithHttpInfo(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List messaging services
   * Get a list of messaging services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listMessagingService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListMessagingServiceQueryParams} class that allows for
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
   * @return MessagingServiceList
   */
  @RequestLine("GET /v1/services/messagingServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  MessagingServiceList listMessagingService(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List messaging services
  * Get a list of messaging services. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listMessagingService</code> that receives the query parameters as a map,
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
          * @return MessagingServiceList
      */
      @RequestLine("GET /v1/services/messagingServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MessagingServiceList> listMessagingServiceWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listMessagingService</code> method in a fluent style.
   */
  public static class ListMessagingServiceQueryParams extends HashMap<String, Object> {
    public ListMessagingServiceQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListMessagingServiceQueryParams domain(final String value) {
      put("domain", EncodingUtils.encode(value));
      return this;
    }
    public ListMessagingServiceQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListMessagingServiceQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListMessagingServiceQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListMessagingServiceQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a messaging service
   * Update an existing messaging service using JsonPatch.
   * @param id Id of the messaging service (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a messaging service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/messagingServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchMessagingService(@Param("id") UUID id, Object body);

  /**
   * Update a messaging service
   * Similar to <code>patchMessagingService</code> but it also returns the http response headers .
   * Update an existing messaging service using JsonPatch.
   * @param id Id of the messaging service (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a messaging service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/messagingServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchMessagingServiceWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted messaging service
   * Restore a soft deleted messaging service.
   * @param restoreEntity  (optional)
   * @return MessagingService
   */
  @RequestLine("PUT /v1/services/messagingServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MessagingService restore26(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted messaging service
   * Similar to <code>restore26</code> but it also returns the http response headers .
   * Restore a soft deleted messaging service.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/messagingServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MessagingService> restore26WithHttpInfo(RestoreEntity restoreEntity);


}
