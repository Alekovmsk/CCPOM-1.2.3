package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateMetadataService;
import org.openmetadata.client.model.DatabaseService;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.MetadataService;
import org.openmetadata.client.model.MetadataServiceList;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Table;
import org.openmetadata.client.model.TestConnectionResult;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface MetadataServicesApi extends ApiClient.Api {


  /**
   * Add test connection result
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return DatabaseService
   */
  @RequestLine("PUT /v1/services/metadataServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatabaseService addTestConnectionResult3(@Param("id") UUID id, TestConnectionResult testConnectionResult);

  /**
   * Add test connection result
   * Similar to <code>addTestConnectionResult3</code> but it also returns the http response headers .
   * Add test connection result to the service.
   * @param id Id of the service (required)
   * @param testConnectionResult  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/metadataServices/{id}/testConnectionResult")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatabaseService> addTestConnectionResult3WithHttpInfo(@Param("id") UUID id, TestConnectionResult testConnectionResult);



  /**
   * Create metadata service
   * Create a new Metadata Service.
   * @param createMetadataService  (optional)
   * @return MetadataService
   */
  @RequestLine("POST /v1/services/metadataServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MetadataService createMetadataService(CreateMetadataService createMetadataService);

  /**
   * Create metadata service
   * Similar to <code>createMetadataService</code> but it also returns the http response headers .
   * Create a new Metadata Service.
   * @param createMetadataService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/services/metadataServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MetadataService> createMetadataServiceWithHttpInfo(CreateMetadataService createMetadataService);



  /**
   * Update metadata service
   * Update an existing or create a new Metadata Service.
   * @param createMetadataService  (optional)
   * @return MetadataService
   */
  @RequestLine("PUT /v1/services/metadataServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MetadataService createOrUpdateMetadataService(CreateMetadataService createMetadataService);

  /**
   * Update metadata service
   * Similar to <code>createOrUpdateMetadataService</code> but it also returns the http response headers .
   * Update an existing or create a new Metadata Service.
   * @param createMetadataService  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/metadataServices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MetadataService> createOrUpdateMetadataServiceWithHttpInfo(CreateMetadataService createMetadataService);



  /**
   * Delete a metadata service by Id
   * Delete a metadata services. If some service belong the service, it can&#39;t be deleted.
   * @param id Id of the metadata service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/metadataServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteMetadataService(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a metadata service by Id
   * Similar to <code>deleteMetadataService</code> but it also returns the http response headers .
   * Delete a metadata services. If some service belong the service, it can&#39;t be deleted.
   * @param id Id of the metadata service (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/metadataServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteMetadataServiceWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a metadata service by Id
   * Delete a metadata services. If some service belong the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deleteMetadataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMetadataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the metadata service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/metadataServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteMetadataService(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a metadata service by Id
  * Delete a metadata services. If some service belong the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deleteMetadataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the metadata service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/metadataServices/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteMetadataServiceWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMetadataService</code> method in a fluent style.
   */
  public static class DeleteMetadataServiceQueryParams extends HashMap<String, Object> {
    public DeleteMetadataServiceQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteMetadataServiceQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a metadata service by name
   * Delete a metadata services by &#x60;name&#x60;. If some service belong the service, it can&#39;t be deleted.
   * @param name Name of the metadata service (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/metadataServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteMetadataServiceByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a metadata service by name
   * Similar to <code>deleteMetadataServiceByName</code> but it also returns the http response headers .
   * Delete a metadata services by &#x60;name&#x60;. If some service belong the service, it can&#39;t be deleted.
   * @param name Name of the metadata service (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/services/metadataServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteMetadataServiceByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a metadata service by name
   * Delete a metadata services by &#x60;name&#x60;. If some service belong the service, it can&#39;t be deleted.
   * Note, this is equivalent to the other <code>deleteMetadataServiceByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMetadataServiceByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the metadata service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/services/metadataServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteMetadataServiceByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a metadata service by name
  * Delete a metadata services by &#x60;name&#x60;. If some service belong the service, it can&#39;t be deleted.
  * Note, this is equivalent to the other <code>deleteMetadataServiceByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the metadata service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/services/metadataServices/name/{name}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteMetadataServiceByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMetadataServiceByName</code> method in a fluent style.
   */
  public static class DeleteMetadataServiceByNameQueryParams extends HashMap<String, Object> {
    public DeleteMetadataServiceByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteMetadataServiceByNameQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a metadata service by name
   * Get a Metadata Service by the service &#x60;name&#x60;.
   * @param name Name of the metadata service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return MetadataService
   */
  @RequestLine("GET /v1/services/metadataServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  MetadataService getMetadataServiceByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a metadata service by name
   * Similar to <code>getMetadataServiceByFQN</code> but it also returns the http response headers .
   * Get a Metadata Service by the service &#x60;name&#x60;.
   * @param name Name of the metadata service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/metadataServices/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MetadataService> getMetadataServiceByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a metadata service by name
   * Get a Metadata Service by the service &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getMetadataServiceByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMetadataServiceByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the metadata service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return MetadataService
   */
  @RequestLine("GET /v1/services/metadataServices/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  MetadataService getMetadataServiceByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a metadata service by name
  * Get a Metadata Service by the service &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getMetadataServiceByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the metadata service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return MetadataService
      */
      @RequestLine("GET /v1/services/metadataServices/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MetadataService> getMetadataServiceByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getMetadataServiceByFQN</code> method in a fluent style.
   */
  public static class GetMetadataServiceByFQNQueryParams extends HashMap<String, Object> {
    public GetMetadataServiceByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetMetadataServiceByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a metadata service by Id
   * Get a Metadata Service by &#x60;Id&#x60;.
   * @param id Id of the metadata service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return MetadataService
   */
  @RequestLine("GET /v1/services/metadataServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  MetadataService getMetadataServiceByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a metadata service by Id
   * Similar to <code>getMetadataServiceByID</code> but it also returns the http response headers .
   * Get a Metadata Service by &#x60;Id&#x60;.
   * @param id Id of the metadata service (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/metadataServices/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MetadataService> getMetadataServiceByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a metadata service by Id
   * Get a Metadata Service by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getMetadataServiceByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMetadataServiceByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the metadata service (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return MetadataService
   */
  @RequestLine("GET /v1/services/metadataServices/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  MetadataService getMetadataServiceByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a metadata service by Id
  * Get a Metadata Service by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getMetadataServiceByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the metadata service (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return MetadataService
      */
      @RequestLine("GET /v1/services/metadataServices/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MetadataService> getMetadataServiceByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getMetadataServiceByID</code> method in a fluent style.
   */
  public static class GetMetadataServiceByIDQueryParams extends HashMap<String, Object> {
    public GetMetadataServiceByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetMetadataServiceByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the metadata service
   * Get a version of the Metadata Service by given &#x60;Id&#x60;
   * @param id Id of the metadata service (required)
   * @param version Metadata Service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return MetadataService
   */
  @RequestLine("GET /v1/services/metadataServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  MetadataService getSpecificMetadataServiceVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the metadata service
   * Similar to <code>getSpecificMetadataServiceVersion</code> but it also returns the http response headers .
   * Get a version of the Metadata Service by given &#x60;Id&#x60;
   * @param id Id of the metadata service (required)
   * @param version Metadata Service version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/metadataServices/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MetadataService> getSpecificMetadataServiceVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List metadata service versions
   * Get a list of all the versions of a Metadata Service identified by &#x60;Id&#x60;
   * @param id Id of the metadata service (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/services/metadataServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllMetadataServiceVersion(@Param("id") UUID id);

  /**
   * List metadata service versions
   * Similar to <code>listAllMetadataServiceVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a Metadata Service identified by &#x60;Id&#x60;
   * @param id Id of the metadata service (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/metadataServices/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllMetadataServiceVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List metadata services
   * Get a list of metadata services.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of metadata services before this cursor (optional)
   * @param after Returns list of metadata services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return MetadataServiceList
   */
  @RequestLine("GET /v1/services/metadataServices?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  MetadataServiceList listMetadataServices(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List metadata services
   * Similar to <code>listMetadataServices</code> but it also returns the http response headers .
   * Get a list of metadata services.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of metadata services before this cursor (optional)
   * @param after Returns list of metadata services after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/services/metadataServices?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MetadataServiceList> listMetadataServicesWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List metadata services
   * Get a list of metadata services.
   * Note, this is equivalent to the other <code>listMetadataServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListMetadataServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit -  (optional, default to 10)</li>
   *   <li>before - Returns list of metadata services before this cursor (optional)</li>
   *   <li>after - Returns list of metadata services after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return MetadataServiceList
   */
  @RequestLine("GET /v1/services/metadataServices?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  MetadataServiceList listMetadataServices(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List metadata services
  * Get a list of metadata services.
  * Note, this is equivalent to the other <code>listMetadataServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit -  (optional, default to 10)</li>
          *   <li>before - Returns list of metadata services before this cursor (optional)</li>
          *   <li>after - Returns list of metadata services after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return MetadataServiceList
      */
      @RequestLine("GET /v1/services/metadataServices?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MetadataServiceList> listMetadataServicesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listMetadataServices</code> method in a fluent style.
   */
  public static class ListMetadataServicesQueryParams extends HashMap<String, Object> {
    public ListMetadataServicesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListMetadataServicesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListMetadataServicesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListMetadataServicesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListMetadataServicesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a metadata service
   * Update an existing Metadata service using JsonPatch.
   * @param id Id of the metadata service (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a metadata service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/metadataServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchMetadataService(@Param("id") UUID id, Object body);

  /**
   * Update a metadata service
   * Similar to <code>patchMetadataService</code> but it also returns the http response headers .
   * Update an existing Metadata service using JsonPatch.
   * @param id Id of the metadata service (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a metadata service Documentation</a>
   */
  @RequestLine("PATCH /v1/services/metadataServices/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchMetadataServiceWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted metadata service.
   * Restore a soft deleted metadata service.
   * @param restoreEntity  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/services/metadataServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table restore27(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted metadata service.
   * Similar to <code>restore27</code> but it also returns the http response headers .
   * Restore a soft deleted metadata service.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/services/metadataServices/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> restore27WithHttpInfo(RestoreEntity restoreEntity);


}
