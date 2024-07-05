package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.AddClientCenterToAssetsRequest;
import org.openmetadata.client.model.BulkOperationResult;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.ClientCenter;
import org.openmetadata.client.model.ClientCenterClient;
import org.openmetadata.client.model.ClientCenterClientList;
import org.openmetadata.client.model.ClientCenterList;
import org.openmetadata.client.model.CreateClientCenter;
import org.openmetadata.client.model.CreateClientCenterClient;
import org.openmetadata.client.model.CsvImportResult;
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
public interface ClientCentersApi extends ApiClient.Api {


  /**
   * Bulk Add ClientCenter Client to Assets
   * Bulk Add ClientCenter Client to Assets
   * @param id Id of the Entity (required)
   * @param addClientCenterToAssetsRequest  (optional)
   * @return BulkOperationResult
   */
  @RequestLine("PUT /v1/clientCenterClients/{id}/assets/add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BulkOperationResult bulkAddClientCenterClientToAssets(@Param("id") UUID id, AddClientCenterToAssetsRequest addClientCenterToAssetsRequest);

  /**
   * Bulk Add ClientCenter Client to Assets
   * Similar to <code>bulkAddClientCenterClientToAssets</code> but it also returns the http response headers .
   * Bulk Add ClientCenter Client to Assets
   * @param id Id of the Entity (required)
   * @param addClientCenterToAssetsRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/clientCenterClients/{id}/assets/add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BulkOperationResult> bulkAddClientCenterClientToAssetsWithHttpInfo(@Param("id") UUID id, AddClientCenterToAssetsRequest addClientCenterToAssetsRequest);



  /**
   * Bulk Remove ClientCenter Client from Assets
   * Bulk Remove ClientCenter Client from Assets
   * @param id Id of the Entity (required)
   * @param addClientCenterToAssetsRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/clientCenterClients/{id}/assets/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent bulkRemoveClientCenterClientFromAssets(@Param("id") UUID id, AddClientCenterToAssetsRequest addClientCenterToAssetsRequest);

  /**
   * Bulk Remove ClientCenter Client from Assets
   * Similar to <code>bulkRemoveClientCenterClientFromAssets</code> but it also returns the http response headers .
   * Bulk Remove ClientCenter Client from Assets
   * @param id Id of the Entity (required)
   * @param addClientCenterToAssetsRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/clientCenterClients/{id}/assets/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> bulkRemoveClientCenterClientFromAssetsWithHttpInfo(@Param("id") UUID id, AddClientCenterToAssetsRequest addClientCenterToAssetsRequest);



  /**
   * Create a clientCenter
   * Create a new clientCenter.
   * @param createClientCenter  (optional)
   * @return ClientCenter
   */
  @RequestLine("POST /v1/clientCenters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ClientCenter createClientCenter(CreateClientCenter createClientCenter);

  /**
   * Create a clientCenter
   * Similar to <code>createClientCenter</code> but it also returns the http response headers .
   * Create a new clientCenter.
   * @param createClientCenter  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/clientCenters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ClientCenter> createClientCenterWithHttpInfo(CreateClientCenter createClientCenter);



  /**
   * Create a clientCenter client
   * Create a new clientCenter client.
   * @param createClientCenterClient  (optional)
   * @return ClientCenterClient
   */
  @RequestLine("POST /v1/clientCenterClients")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ClientCenterClient createClientCenterClient(CreateClientCenterClient createClientCenterClient);

  /**
   * Create a clientCenter client
   * Similar to <code>createClientCenterClient</code> but it also returns the http response headers .
   * Create a new clientCenter client.
   * @param createClientCenterClient  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/clientCenterClients")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ClientCenterClient> createClientCenterClientWithHttpInfo(CreateClientCenterClient createClientCenterClient);



  /**
   * Create or update a clientCenter
   * Create a new clientCenter, if it does not exist or update an existing clientCenter.
   * @param createClientCenter  (optional)
   * @return ClientCenter
   */
  @RequestLine("PUT /v1/clientCenters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ClientCenter createOrUpdateClientCenter(CreateClientCenter createClientCenter);

  /**
   * Create or update a clientCenter
   * Similar to <code>createOrUpdateClientCenter</code> but it also returns the http response headers .
   * Create a new clientCenter, if it does not exist or update an existing clientCenter.
   * @param createClientCenter  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/clientCenters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ClientCenter> createOrUpdateClientCenterWithHttpInfo(CreateClientCenter createClientCenter);



  /**
   * Create or update a clientCenter client
   * Create a new clientCenter client, if it does not exist or update an existing clientCenter client.
   * @param createClientCenterClient  (optional)
   * @return ClientCenterClient
   */
  @RequestLine("PUT /v1/clientCenterClients")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ClientCenterClient createOrUpdateClientCenterClient(CreateClientCenterClient createClientCenterClient);

  /**
   * Create or update a clientCenter client
   * Similar to <code>createOrUpdateClientCenterClient</code> but it also returns the http response headers .
   * Create a new clientCenter client, if it does not exist or update an existing clientCenter client.
   * @param createClientCenterClient  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/clientCenterClients")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ClientCenterClient> createOrUpdateClientCenterClientWithHttpInfo(CreateClientCenterClient createClientCenterClient);



  /**
   * Delete a clientCenter client by Id
   * Delete a clientCenter client by &#x60;Id&#x60;.
   * @param id Id of the clientCenter client (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/clientCenterClients/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void delete(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a clientCenter client by Id
   * Similar to <code>delete</code> but it also returns the http response headers .
   * Delete a clientCenter client by &#x60;Id&#x60;.
   * @param id Id of the clientCenter client (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/clientCenterClients/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a clientCenter client by Id
   * Delete a clientCenter client by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>delete</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the clientCenter client (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/clientCenterClients/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void delete(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a clientCenter client by Id
  * Delete a clientCenter client by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>delete</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the clientCenter client (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/clientCenterClients/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>delete</code> method in a fluent style.
   */
  public static class DeleteQueryParams extends HashMap<String, Object> {
    public DeleteQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a clientCenter by Id
   * Delete a clientCenter by &#x60;Id&#x60;.
   * @param id Id of the clientCenter (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/clientCenters/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteClientCenter(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a clientCenter by Id
   * Similar to <code>deleteClientCenter</code> but it also returns the http response headers .
   * Delete a clientCenter by &#x60;Id&#x60;.
   * @param id Id of the clientCenter (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/clientCenters/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteClientCenterWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a clientCenter by Id
   * Delete a clientCenter by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deleteClientCenter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteClientCenterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the clientCenter (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/clientCenters/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteClientCenter(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a clientCenter by Id
  * Delete a clientCenter by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deleteClientCenter</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the clientCenter (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/clientCenters/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteClientCenterWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteClientCenter</code> method in a fluent style.
   */
  public static class DeleteClientCenterQueryParams extends HashMap<String, Object> {
    public DeleteClientCenterQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteClientCenterQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a clientCenter by name
   * Delete a clientCenter by &#x60;name&#x60;.
   * @param name Name of the clientCenter (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/clientCenters/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteClientCenterByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a clientCenter by name
   * Similar to <code>deleteClientCenterByName</code> but it also returns the http response headers .
   * Delete a clientCenter by &#x60;name&#x60;.
   * @param name Name of the clientCenter (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/clientCenters/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteClientCenterByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a clientCenter by name
   * Delete a clientCenter by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>deleteClientCenterByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteClientCenterByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the clientCenter (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/clientCenters/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteClientCenterByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a clientCenter by name
  * Delete a clientCenter by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>deleteClientCenterByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the clientCenter (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/clientCenters/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteClientCenterByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteClientCenterByName</code> method in a fluent style.
   */
  public static class DeleteClientCenterByNameQueryParams extends HashMap<String, Object> {
    public DeleteClientCenterByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a clientCenter client by fully qualified name
   * Delete a clientCenter client by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the clientCenter client (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/clientCenterClients/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteClientCenterClientByName(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a clientCenter client by fully qualified name
   * Similar to <code>deleteClientCenterClientByName</code> but it also returns the http response headers .
   * Delete a clientCenter client by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the clientCenter client (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/clientCenterClients/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteClientCenterClientByNameWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a clientCenter client by fully qualified name
   * Delete a clientCenter client by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteClientCenterClientByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteClientCenterClientByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the clientCenter client (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/clientCenterClients/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteClientCenterClientByName(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a clientCenter client by fully qualified name
  * Delete a clientCenter client by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteClientCenterClientByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the clientCenter client (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/clientCenterClients/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteClientCenterClientByNameWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteClientCenterClientByName</code> method in a fluent style.
   */
  public static class DeleteClientCenterClientByNameQueryParams extends HashMap<String, Object> {
    public DeleteClientCenterClientByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteClientCenterClientByNameQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Export clientCenter in CSV format
   * 
   * @param name Name of the clientCenter (required)
   * @return String
   */
  @RequestLine("GET /v1/clientCenters/name/{name}/export")
  @Headers({
    "Accept: application/json",
  })
  String exportClientCenter(@Param("name") String name);

  /**
   * Export clientCenter in CSV format
   * Similar to <code>exportClientCenter</code> but it also returns the http response headers .
   * 
   * @param name Name of the clientCenter (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/clientCenters/name/{name}/export")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<String> exportClientCenterWithHttpInfo(@Param("name") String name);



  /**
   * Get a clientCenter by name
   * Get a clientCenter by name.
   * @param name Name of the clientCenter (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return ClientCenter
   */
  @RequestLine("GET /v1/clientCenters/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ClientCenter getClientCenterByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a clientCenter by name
   * Similar to <code>getClientCenterByFQN</code> but it also returns the http response headers .
   * Get a clientCenter by name.
   * @param name Name of the clientCenter (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/clientCenters/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ClientCenter> getClientCenterByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a clientCenter by name
   * Get a clientCenter by name.
   * Note, this is equivalent to the other <code>getClientCenterByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetClientCenterByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the clientCenter (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return ClientCenter
   */
  @RequestLine("GET /v1/clientCenters/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  ClientCenter getClientCenterByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a clientCenter by name
  * Get a clientCenter by name.
  * Note, this is equivalent to the other <code>getClientCenterByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the clientCenter (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return ClientCenter
      */
      @RequestLine("GET /v1/clientCenters/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ClientCenter> getClientCenterByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getClientCenterByFQN</code> method in a fluent style.
   */
  public static class GetClientCenterByFQNQueryParams extends HashMap<String, Object> {
    public GetClientCenterByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetClientCenterByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a clientCenter by Id
   * Get a clientCenter by &#x60;Id&#x60;.
   * @param id Id of the clientCenter (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return ClientCenter
   */
  @RequestLine("GET /v1/clientCenters/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ClientCenter getClientCenterByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a clientCenter by Id
   * Similar to <code>getClientCenterByID</code> but it also returns the http response headers .
   * Get a clientCenter by &#x60;Id&#x60;.
   * @param id Id of the clientCenter (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/clientCenters/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ClientCenter> getClientCenterByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a clientCenter by Id
   * Get a clientCenter by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getClientCenterByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetClientCenterByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the clientCenter (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return ClientCenter
   */
  @RequestLine("GET /v1/clientCenters/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  ClientCenter getClientCenterByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a clientCenter by Id
  * Get a clientCenter by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getClientCenterByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the clientCenter (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return ClientCenter
      */
      @RequestLine("GET /v1/clientCenters/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ClientCenter> getClientCenterByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getClientCenterByID</code> method in a fluent style.
   */
  public static class GetClientCenterByIDQueryParams extends HashMap<String, Object> {
    public GetClientCenterByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetClientCenterByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a clientCenter client by fully qualified name
   * Get a clientCenter client by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the clientCenter client (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return ClientCenter
   */
  @RequestLine("GET /v1/clientCenterClients/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ClientCenter getClientCenterClientByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a clientCenter client by fully qualified name
   * Similar to <code>getClientCenterClientByFQN</code> but it also returns the http response headers .
   * Get a clientCenter client by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the clientCenter client (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/clientCenterClients/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ClientCenter> getClientCenterClientByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a clientCenter client by fully qualified name
   * Get a clientCenter client by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getClientCenterClientByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetClientCenterClientByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the clientCenter client (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return ClientCenter
   */
  @RequestLine("GET /v1/clientCenterClients/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  ClientCenter getClientCenterClientByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a clientCenter client by fully qualified name
  * Get a clientCenter client by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getClientCenterClientByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the clientCenter client (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return ClientCenter
      */
      @RequestLine("GET /v1/clientCenterClients/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ClientCenter> getClientCenterClientByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getClientCenterClientByFQN</code> method in a fluent style.
   */
  public static class GetClientCenterClientByFQNQueryParams extends HashMap<String, Object> {
    public GetClientCenterClientByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetClientCenterClientByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a clientCenter client by Id
   * Get a clientCenter client by &#x60;Id&#x60;.
   * @param id Id of the clientCenter client (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return ClientCenter
   */
  @RequestLine("GET /v1/clientCenterClients/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ClientCenter getClientCenterClientByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a clientCenter client by Id
   * Similar to <code>getClientCenterClientByID</code> but it also returns the http response headers .
   * Get a clientCenter client by &#x60;Id&#x60;.
   * @param id Id of the clientCenter client (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/clientCenterClients/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ClientCenter> getClientCenterClientByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a clientCenter client by Id
   * Get a clientCenter client by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getClientCenterClientByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetClientCenterClientByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the clientCenter client (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return ClientCenter
   */
  @RequestLine("GET /v1/clientCenterClients/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  ClientCenter getClientCenterClientByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a clientCenter client by Id
  * Get a clientCenter client by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getClientCenterClientByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the clientCenter client (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return ClientCenter
      */
      @RequestLine("GET /v1/clientCenterClients/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ClientCenter> getClientCenterClientByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getClientCenterClientByID</code> method in a fluent style.
   */
  public static class GetClientCenterClientByIDQueryParams extends HashMap<String, Object> {
    public GetClientCenterClientByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetClientCenterClientByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get CSV documentation
   * 
   * @param name Name of the clientCenter (required)
   * @return String
   */
  @RequestLine("GET /v1/clientCenters/documentation/csv")
  @Headers({
    "Accept: application/json",
  })
  String getCsvDocumentation(@Param("name") String name);

  /**
   * Get CSV documentation
   * Similar to <code>getCsvDocumentation</code> but it also returns the http response headers .
   * 
   * @param name Name of the clientCenter (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/clientCenters/documentation/csv")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<String> getCsvDocumentationWithHttpInfo(@Param("name") String name);



  /**
   * Get a version of the clientCenter client
   * Get a version of the clientCenter client by given &#x60;Id&#x60;
   * @param id Id of the clientCenter client (required)
   * @param version clientCenter client version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return ClientCenter
   */
  @RequestLine("GET /v1/clientCenterClients/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ClientCenter getSpecificClientCenterClientVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the clientCenter client
   * Similar to <code>getSpecificClientCenterClientVersion</code> but it also returns the http response headers .
   * Get a version of the clientCenter client by given &#x60;Id&#x60;
   * @param id Id of the clientCenter client (required)
   * @param version clientCenter client version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/clientCenterClients/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ClientCenter> getSpecificClientCenterClientVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a version of the clientcenters
   * Get a version of the clientCenter by given &#x60;Id&#x60;
   * @param id Id of the clientCenter (required)
   * @param version clientCenter version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return ClientCenter
   */
  @RequestLine("GET /v1/clientCenters/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ClientCenter getSpecificClientCenterVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the clientcenters
   * Similar to <code>getSpecificClientCenterVersion</code> but it also returns the http response headers .
   * Get a version of the clientCenter by given &#x60;Id&#x60;
   * @param id Id of the clientCenter (required)
   * @param version clientCenter version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/clientCenters/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ClientCenter> getSpecificClientCenterVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Import clientCenter clients from CSV to create, and update clientCenter clients
   * 
   * @param name Name of the clientCenter (required)
   * @param dryRun Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)
   * @param body  (optional)
   * @return CsvImportResult
   */
  @RequestLine("PUT /v1/clientCenters/name/{name}/import?dryRun={dryRun}")
  @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
  })
  CsvImportResult importClientCenter(@Param("name") String name, @Param("dryRun") Boolean dryRun, String body);

  /**
   * Import clientCenter clients from CSV to create, and update clientCenter clients
   * Similar to <code>importClientCenter</code> but it also returns the http response headers .
   * 
   * @param name Name of the clientCenter (required)
   * @param dryRun Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/clientCenters/name/{name}/import?dryRun={dryRun}")
  @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
  })
  ApiResponse<CsvImportResult> importClientCenterWithHttpInfo(@Param("name") String name, @Param("dryRun") Boolean dryRun, String body);


  /**
   * Import clientCenter clients from CSV to create, and update clientCenter clients
   * 
   * Note, this is equivalent to the other <code>importClientCenter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ImportClientCenterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the clientCenter (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>dryRun - Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)</li>
   *   </ul>
   * @return CsvImportResult
   */
  @RequestLine("PUT /v1/clientCenters/name/{name}/import?dryRun={dryRun}")
  @Headers({
  "Content-Type: text/plain",
  "Accept: application/json",
  })
  CsvImportResult importClientCenter(@Param("name") String name, String body, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Import clientCenter clients from CSV to create, and update clientCenter clients
  * 
  * Note, this is equivalent to the other <code>importClientCenter</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the clientCenter (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>dryRun - Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)</li>
      *   </ul>
          * @return CsvImportResult
      */
      @RequestLine("PUT /v1/clientCenters/name/{name}/import?dryRun={dryRun}")
      @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
      })
   ApiResponse<CsvImportResult> importClientCenterWithHttpInfo(@Param("name") String name, String body, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>importClientCenter</code> method in a fluent style.
   */
  public static class ImportClientCenterQueryParams extends HashMap<String, Object> {
    public ImportClientCenterQueryParams dryRun(final Boolean value) {
      put("dryRun", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List clientCenter client versions
   * Get a list of all the versions of a clientCenter clients identified by &#x60;id&#x60;
   * @param id Id of the clientCenter client (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/clientCenterClients/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllClientCenterClientVersion(@Param("id") UUID id);

  /**
   * List clientCenter client versions
   * Similar to <code>listAllClientCenterClientVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a clientCenter clients identified by &#x60;id&#x60;
   * @param id Id of the clientCenter client (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/clientCenterClients/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllClientCenterClientVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List clientCenter versions
   * Get a list of all the versions of a clientCenter identified by &#x60;id&#x60;
   * @param id Id of the clientCenter (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/clientCenters/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllClientCenterVersion(@Param("id") UUID id);

  /**
   * List clientCenter versions
   * Similar to <code>listAllClientCenterVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a clientCenter identified by &#x60;id&#x60;
   * @param id Id of the clientCenter (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/clientCenters/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllClientCenterVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List clientCenter clients
   * Get a list of clientCenter clients. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param clientCenter List clientCenter clients filtered by clientCenter identified by Id given in &#x60;clientCenter&#x60; parameter. (optional)
   * @param parent List clientCenter clients filtered by children of clientCenter client identified by Id given in &#x60;parent&#x60; parameter. (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number clientCenter clients returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of clientCenter clients before this cursor (optional)
   * @param after Returns list of clientCenter clients after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return ClientCenterClientList
   */
  @RequestLine("GET /v1/clientCenterClients?clientCenter={clientCenter}&parent={parent}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ClientCenterClientList listClientCenterClient(@Param("clientCenter") String clientCenter, @Param("parent") String parent, @Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List clientCenter clients
   * Similar to <code>listClientCenterClient</code> but it also returns the http response headers .
   * Get a list of clientCenter clients. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param clientCenter List clientCenter clients filtered by clientCenter identified by Id given in &#x60;clientCenter&#x60; parameter. (optional)
   * @param parent List clientCenter clients filtered by children of clientCenter client identified by Id given in &#x60;parent&#x60; parameter. (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number clientCenter clients returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of clientCenter clients before this cursor (optional)
   * @param after Returns list of clientCenter clients after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/clientCenterClients?clientCenter={clientCenter}&parent={parent}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ClientCenterClientList> listClientCenterClientWithHttpInfo(@Param("clientCenter") String clientCenter, @Param("parent") String parent, @Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List clientCenter clients
   * Get a list of clientCenter clients. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listClientCenterClient</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListClientCenterClientQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>clientCenter - List clientCenter clients filtered by clientCenter identified by Id given in &#x60;clientCenter&#x60; parameter. (optional)</li>
   *   <li>parent - List clientCenter clients filtered by children of clientCenter client identified by Id given in &#x60;parent&#x60; parameter. (optional)</li>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number clientCenter clients returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of clientCenter clients before this cursor (optional)</li>
   *   <li>after - Returns list of clientCenter clients after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return ClientCenterClientList
   */
  @RequestLine("GET /v1/clientCenterClients?clientCenter={clientCenter}&parent={parent}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  ClientCenterClientList listClientCenterClient(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List clientCenter clients
  * Get a list of clientCenter clients. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listClientCenterClient</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>clientCenter - List clientCenter clients filtered by clientCenter identified by Id given in &#x60;clientCenter&#x60; parameter. (optional)</li>
          *   <li>parent - List clientCenter clients filtered by children of clientCenter client identified by Id given in &#x60;parent&#x60; parameter. (optional)</li>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number clientCenter clients returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of clientCenter clients before this cursor (optional)</li>
          *   <li>after - Returns list of clientCenter clients after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return ClientCenterClientList
      */
      @RequestLine("GET /v1/clientCenterClients?clientCenter={clientCenter}&parent={parent}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ClientCenterClientList> listClientCenterClientWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listClientCenterClient</code> method in a fluent style.
   */
  public static class ListClientCenterClientQueryParams extends HashMap<String, Object> {
    public ListClientCenterClientQueryParams clientCenter(final String value) {
      put("clientCenter", EncodingUtils.encode(value));
      return this;
    }
    public ListClientCenterClientQueryParams parent(final String value) {
      put("parent", EncodingUtils.encode(value));
      return this;
    }
    public ListClientCenterClientQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListClientCenterClientQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListClientCenterClientQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListClientCenterClientQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListClientCenterClientQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List clientcenters
   * Get a list of clientcenters. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number clientcenters returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of clientcenters before this cursor (optional)
   * @param after Returns list of clientcenters after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return ClientCenterList
   */
  @RequestLine("GET /v1/clientCenters?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ClientCenterList listClientCenters(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List clientcenters
   * Similar to <code>listClientCenters</code> but it also returns the http response headers .
   * Get a list of clientcenters. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number clientcenters returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of clientcenters before this cursor (optional)
   * @param after Returns list of clientcenters after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/clientCenters?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ClientCenterList> listClientCentersWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List clientcenters
   * Get a list of clientcenters. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listClientCenters</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListClientCentersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number clientcenters returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of clientcenters before this cursor (optional)</li>
   *   <li>after - Returns list of clientcenters after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return ClientCenterList
   */
  @RequestLine("GET /v1/clientCenters?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  ClientCenterList listClientCenters(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List clientcenters
  * Get a list of clientcenters. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listClientCenters</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number clientcenters returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of clientcenters before this cursor (optional)</li>
          *   <li>after - Returns list of clientcenters after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return ClientCenterList
      */
      @RequestLine("GET /v1/clientCenters?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ClientCenterList> listClientCentersWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listClientCenters</code> method in a fluent style.
   */
  public static class ListClientCentersQueryParams extends HashMap<String, Object> {
    public ListClientCentersQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListClientCentersQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListClientCentersQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListClientCentersQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListClientCentersQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a clientCenter
   * Update an existing clientCenter using JsonPatch.
   * @param id Id of the clientCenter (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a clientCenter Documentation</a>
   */
  @RequestLine("PATCH /v1/clientCenters/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchClientCenter(@Param("id") UUID id, Object body);

  /**
   * Update a clientCenter
   * Similar to <code>patchClientCenter</code> but it also returns the http response headers .
   * Update an existing clientCenter using JsonPatch.
   * @param id Id of the clientCenter (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a clientCenter Documentation</a>
   */
  @RequestLine("PATCH /v1/clientCenters/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchClientCenterWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Update a clientCenter client
   * Update an existing clientCenter client using JsonPatch.
   * @param id Id of the clientCenter client (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a clientCenter client Documentation</a>
   */
  @RequestLine("PATCH /v1/clientCenterClients/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchClientCenterClient(@Param("id") UUID id, Object body);

  /**
   * Update a clientCenter client
   * Similar to <code>patchClientCenterClient</code> but it also returns the http response headers .
   * Update an existing clientCenter client using JsonPatch.
   * @param id Id of the clientCenter client (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a clientCenter client Documentation</a>
   */
  @RequestLine("PATCH /v1/clientCenterClients/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchClientCenterClientWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted clientCenter client
   * Restore a soft deleted clientCenter client.
   * @param restoreEntity  (optional)
   * @return ClientCenterClient
   */
  @RequestLine("PUT /v1/clientCenterClients/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ClientCenterClient restore4(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted clientCenter client
   * Similar to <code>restore4</code> but it also returns the http response headers .
   * Restore a soft deleted clientCenter client.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/clientCenterClients/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ClientCenterClient> restore4WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Restore a soft deleted clientCenter
   * Restore a soft deleted ClientCenter.
   * @param restoreEntity  (optional)
   * @return ClientCenter
   */
  @RequestLine("PUT /v1/clientCenters/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ClientCenter restore5(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted clientCenter
   * Similar to <code>restore5</code> but it also returns the http response headers .
   * Restore a soft deleted ClientCenter.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/clientCenters/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ClientCenter> restore5WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/clientCenterClients/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity1(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity1</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/clientCenterClients/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity1WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/clientCenters/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity2(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity2</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/clientCenters/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity2WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);



  /**
   * Validate Tags Addition to ClientCenter Client
   * Validate Tags Addition to ClientCenter Client
   * @param id Id of the Entity (required)
   * @param addClientCenterToAssetsRequest  (optional)
   * @return BulkOperationResult
   */
  @RequestLine("PUT /v1/clientCenterClients/{id}/tags/validate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BulkOperationResult validateClientCenterClientTagsAddition(@Param("id") UUID id, AddClientCenterToAssetsRequest addClientCenterToAssetsRequest);

  /**
   * Validate Tags Addition to ClientCenter Client
   * Similar to <code>validateClientCenterClientTagsAddition</code> but it also returns the http response headers .
   * Validate Tags Addition to ClientCenter Client
   * @param id Id of the Entity (required)
   * @param addClientCenterToAssetsRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/clientCenterClients/{id}/tags/validate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BulkOperationResult> validateClientCenterClientTagsAdditionWithHttpInfo(@Param("id") UUID id, AddClientCenterToAssetsRequest addClientCenterToAssetsRequest);


}
