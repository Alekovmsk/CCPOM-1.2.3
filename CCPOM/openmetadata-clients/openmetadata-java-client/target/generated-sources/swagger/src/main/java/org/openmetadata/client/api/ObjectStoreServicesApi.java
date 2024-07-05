package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateStorageService;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.StorageService;
import org.openmetadata.client.model.StorageServiceList;
import org.openmetadata.client.model.TestConnectionResult;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface ObjectStoreServicesApi extends ApiClient.Api {


  /**
   * Add test connection result
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return DatabaseService
   */
  @RequestLine("PUT /v1/services/storageServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseService addTestConnectionResult7(@Param("id") UUID id, TestConnectionResult testConnectionResult);

  /**
   * Add test connection result
   * Similar to <code>addTestConnectionResult7</code> but it also returns the http response headers .
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/storageServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> addTestConnectionResult7WithHttpInfo(@Param("id") UUID id, TestConnectionResult testConnectionResult);



  /**
   * Update storage service
   * Update an existing or create a new storage service.
   * @param createStorageService  (optional)
   * @return StorageService
   */
  @RequestLine("PUT /v1/services/storageServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageService createOrUpdateStorageService(CreateStorageService createStorageService);

  /**
   * Update storage service
   * Similar to <code>createOrUpdateStorageService</code> but it also returns the http response headers .
   * Update an existing or create a new storage service.
   * @param createStorageService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/storageServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageService> createOrUpdateStorageServiceWithHttpInfo(CreateStorageService createStorageService);



  /**
   * Create storage service
   * Create a new storage service.
   * @param createStorageService  (optional)
   * @return StorageService
   */
  @RequestLine("POST /v1/services/storageServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageService createStorageService(CreateStorageService createStorageService);

  /**
   * Create storage service
   * Similar to <code>createStorageService</code> but it also returns the http response headers .
   * Create a new storage service.
   * @param createStorageService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/services/storageServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageService> createStorageServiceWithHttpInfo(CreateStorageService createStorageService);



  /**
   * Delete an storage service
   * Delete an storage services. If containers belong the service, it can&#39;t be deleted.
   * @param id Id of the storage service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/storageServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteStorageService(@Param("id") String id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete an storage service
   * Similar to <code>deleteStorageService</code> but it also returns the http response headers .
   * Delete an storage services. If containers belong the service, it can&#39;t be deleted.
   * @param id Id of the storage service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/storageServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteStorageServiceWithHttpInfo(@Param("id") String id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete an storage service
   * Delete an storage services. If containers belong the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deleteStorageService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteStorageServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the storage service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/storageServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteStorageService(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete an storage service
  * Delete an storage services. If containers belong the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deleteStorageService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the storage service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/storageServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteStorageServiceWithHttpInfo(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteStorageService</code> method in a fluent style.
   */
  public static class DeleteStorageServiceQueryParams extends HashMap<String, Object> {
    public DeleteStorageServiceQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteStorageServiceQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete an StorageService by fully qualified name
   * Delete an StorageService by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Name of the StorageService (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/storageServices/name/{fqn}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteStorageServiceByFQN(@Param("fqn") String fqn, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete an StorageService by fully qualified name
   * Similar to <code>deleteStorageServiceByFQN</code> but it also returns the http response headers .
   * Delete an StorageService by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Name of the StorageService (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/storageServices/name/{fqn}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteStorageServiceByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete an StorageService by fully qualified name
   * Delete an StorageService by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteStorageServiceByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteStorageServiceByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Name of the StorageService (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/storageServices/name/{fqn}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteStorageServiceByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete an StorageService by fully qualified name
  * Delete an StorageService by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteStorageServiceByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Name of the StorageService (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/storageServices/name/{fqn}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteStorageServiceByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteStorageServiceByFQN</code> method in a fluent style.
   */
  public static class DeleteStorageServiceByFQNQueryParams extends HashMap<String, Object> {
    public DeleteStorageServiceByFQNQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteStorageServiceByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the storage service
   * Get a version of the storage service by given &#x60;id&#x60;
   * @param id storage service Id (required)
   * @param version storage service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return StorageService
   */
  @RequestLine("GET /v1/services/storageServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  StorageService getSpecificStorageServiceVersion(@Param("id") String id, @Param("version") String version);

  /**
   * Get a version of the storage service
   * Similar to <code>getSpecificStorageServiceVersion</code> but it also returns the http response headers .
   * Get a version of the storage service by given &#x60;id&#x60;
   * @param id storage service Id (required)
   * @param version storage service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/storageServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<StorageService> getSpecificStorageServiceVersionWithHttpInfo(@Param("id") String id, @Param("version") String version);



  /**
   * Get storage service by name
   * Get a storage service by the service &#x60;name&#x60;.
   * @param name  (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return StorageService
   */
  @RequestLine("GET /v1/services/storageServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  StorageService getStorageServiceByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get storage service by name
   * Similar to <code>getStorageServiceByFQN</code> but it also returns the http response headers .
   * Get a storage service by the service &#x60;name&#x60;.
   * @param name  (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/storageServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<StorageService> getStorageServiceByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get storage service by name
   * Get a storage service by the service &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getStorageServiceByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetStorageServiceByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return StorageService
   */
  @RequestLine("GET /v1/services/storageServices/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  StorageService getStorageServiceByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get storage service by name
  * Get a storage service by the service &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getStorageServiceByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return StorageService
      */
      @RequestLine("GET /v1/services/storageServices/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<StorageService> getStorageServiceByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getStorageServiceByFQN</code> method in a fluent style.
   */
  public static class GetStorageServiceByFQNQueryParams extends HashMap<String, Object> {
    public GetStorageServiceByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetStorageServiceByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get an storage service
   * Get an storage service by &#x60;id&#x60;.
   * @param id  (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return StorageService
   */
  @RequestLine("GET /v1/services/storageServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  StorageService getStorageServiceByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get an storage service
   * Similar to <code>getStorageServiceByID</code> but it also returns the http response headers .
   * Get an storage service by &#x60;id&#x60;.
   * @param id  (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/storageServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<StorageService> getStorageServiceByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get an storage service
   * Get an storage service by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getStorageServiceByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetStorageServiceByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return StorageService
   */
  @RequestLine("GET /v1/services/storageServices/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  StorageService getStorageServiceByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get an storage service
  * Get an storage service by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getStorageServiceByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return StorageService
      */
      @RequestLine("GET /v1/services/storageServices/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<StorageService> getStorageServiceByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getStorageServiceByID</code> method in a fluent style.
   */
  public static class GetStorageServiceByIDQueryParams extends HashMap<String, Object> {
    public GetStorageServiceByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetStorageServiceByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List storage service versions
   * Get a list of all the versions of an storage service identified by &#x60;id&#x60;
   * @param id storage service Id (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/services/storageServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllStorageServiceVersion(@Param("id") String id);

  /**
   * List storage service versions
   * Similar to <code>listAllStorageServiceVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of an storage service identified by &#x60;id&#x60;
   * @param id storage service Id (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/storageServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllStorageServiceVersionWithHttpInfo(@Param("id") String id);



  /**
   * List storage services
   * Get a list of storage services.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of storage services before this cursor (optional)
   * @param after Returns list of storage services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return StorageServiceList
   */
  @RequestLine("GET /v1/services/storageServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  StorageServiceList listStorageServices(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List storage services
   * Similar to <code>listStorageServices</code> but it also returns the http response headers .
   * Get a list of storage services.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter services by domain (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of storage services before this cursor (optional)
   * @param after Returns list of storage services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/storageServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<StorageServiceList> listStorageServicesWithHttpInfo(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List storage services
   * Get a list of storage services.
   * Note, this is equivalent to the other <code>listStorageServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListStorageServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>domain - Filter services by domain (optional)</li>
   *   <li>limit -  (optional, default to 10)</li>
   *   <li>before - Returns list of storage services before this cursor (optional)</li>
   *   <li>after - Returns list of storage services after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return StorageServiceList
   */
  @RequestLine("GET /v1/services/storageServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  StorageServiceList listStorageServices(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List storage services
  * Get a list of storage services.
  * Note, this is equivalent to the other <code>listStorageServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>domain - Filter services by domain (optional)</li>
          *   <li>limit -  (optional, default to 10)</li>
          *   <li>before - Returns list of storage services before this cursor (optional)</li>
          *   <li>after - Returns list of storage services after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return StorageServiceList
      */
      @RequestLine("GET /v1/services/storageServices?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<StorageServiceList> listStorageServicesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listStorageServices</code> method in a fluent style.
   */
  public static class ListStorageServicesQueryParams extends HashMap<String, Object> {
    public ListStorageServicesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListStorageServicesQueryParams domain(final String value) {
      put("domain", EncodingUtils.encode(value));
      return this;
    }
    public ListStorageServicesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListStorageServicesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListStorageServicesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListStorageServicesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update an storage service
   * Update an existing storage service using JsonPatch.
   * @param id  (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update an storage service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/storageServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchStorageService(@Param("id") UUID id, Object body);

  /**
   * Update an storage service
   * Similar to <code>patchStorageService</code> but it also returns the http response headers .
   * Update an existing storage service using JsonPatch.
   * @param id  (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update an storage service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/storageServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchStorageServiceWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted StorageService.
   * Restore a soft deleted StorageService.
   * @param restoreEntity  (optional)
   * @return StorageService
   */
  @RequestLine("PUT /v1/services/storageServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageService restore31(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted StorageService.
   * Similar to <code>restore31</code> but it also returns the http response headers .
   * Restore a soft deleted StorageService.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/storageServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageService> restore31WithHttpInfo(RestoreEntity restoreEntity);


}
