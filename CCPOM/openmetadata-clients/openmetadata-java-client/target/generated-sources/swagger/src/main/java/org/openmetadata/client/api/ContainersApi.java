package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.Container;
import org.openmetadata.client.model.ContainerList;
import org.openmetadata.client.model.CreateContainer;
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
public interface ContainersApi extends ApiClient.Api {


  /**
   * Add a follower
   * Add a user identified by &#x60;userId&#x60; as follower of this container
   * @param id Id of the container (required)
   * @param body Id of the user to be added as follower (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/containers/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent addFollower5(@Param("id") UUID id, UUID body);

  /**
   * Add a follower
   * Similar to <code>addFollower5</code> but it also returns the http response headers .
   * Add a user identified by &#x60;userId&#x60; as follower of this container
   * @param id Id of the container (required)
   * @param body Id of the user to be added as follower (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/containers/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> addFollower5WithHttpInfo(@Param("id") UUID id, UUID body);



  /**
   * Create a Container
   * Create a new Container.
   * @param createContainer  (optional)
   * @return Container
   */
  @RequestLine("POST /v1/containers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Container createContainer(CreateContainer createContainer);

  /**
   * Create a Container
   * Similar to <code>createContainer</code> but it also returns the http response headers .
   * Create a new Container.
   * @param createContainer  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/containers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Container> createContainerWithHttpInfo(CreateContainer createContainer);



  /**
   * Create or update a Container
   * Create a new Container, if it does not exist or update an existing container.
   * @param createContainer  (optional)
   * @return Container
   */
  @RequestLine("PUT /v1/containers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Container createOrUpdateContainer(CreateContainer createContainer);

  /**
   * Create or update a Container
   * Similar to <code>createOrUpdateContainer</code> but it also returns the http response headers .
   * Create a new Container, if it does not exist or update an existing container.
   * @param createContainer  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/containers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Container> createOrUpdateContainerWithHttpInfo(CreateContainer createContainer);



  /**
   * Delete a Container
   * Delete a Container by &#x60;id&#x60;.
   * @param id Container Id (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/containers/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteContainer(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a Container
   * Similar to <code>deleteContainer</code> but it also returns the http response headers .
   * Delete a Container by &#x60;id&#x60;.
   * @param id Container Id (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/containers/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteContainerWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a Container
   * Delete a Container by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteContainer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteContainerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Container Id (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/containers/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteContainer(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a Container
  * Delete a Container by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteContainer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Container Id (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/containers/{id}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteContainerWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteContainer</code> method in a fluent style.
   */
  public static class DeleteContainerQueryParams extends HashMap<String, Object> {
    public DeleteContainerQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteContainerQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a Container by fully qualified name
   * Delete a Container by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Name of the Container (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/containers/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteContainerByFQN(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a Container by fully qualified name
   * Similar to <code>deleteContainerByFQN</code> but it also returns the http response headers .
   * Delete a Container by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Name of the Container (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/containers/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteContainerByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a Container by fully qualified name
   * Delete a Container by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteContainerByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteContainerByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Name of the Container (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/containers/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteContainerByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a Container by fully qualified name
  * Delete a Container by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteContainerByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Name of the Container (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/containers/name/{fqn}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteContainerByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteContainerByFQN</code> method in a fluent style.
   */
  public static class DeleteContainerByFQNQueryParams extends HashMap<String, Object> {
    public DeleteContainerByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Remove a follower
   * Remove the user identified &#x60;userId&#x60; as a follower of the container.
   * @param id Id of the container (required)
   * @param userId Id of the user being removed as follower (required)
   * @return ChangeEvent
   */
  @RequestLine("DELETE /v1/containers/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ChangeEvent deleteFollower6(@Param("id") String id, @Param("userId") String userId);

  /**
   * Remove a follower
   * Similar to <code>deleteFollower6</code> but it also returns the http response headers .
   * Remove the user identified &#x60;userId&#x60; as a follower of the container.
   * @param id Id of the container (required)
   * @param userId Id of the user being removed as follower (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/containers/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> deleteFollower6WithHttpInfo(@Param("id") String id, @Param("userId") String userId);



  /**
   * Get an Container by name
   * Get an Container by fully qualified name.
   * @param fqn  (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Container
   */
  @RequestLine("GET /v1/containers/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Container getContainerByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get an Container by name
   * Similar to <code>getContainerByFQN</code> but it also returns the http response headers .
   * Get an Container by fully qualified name.
   * @param fqn  (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/containers/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Container> getContainerByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get an Container by name
   * Get an Container by fully qualified name.
   * Note, this is equivalent to the other <code>getContainerByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetContainerByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Container
   */
  @RequestLine("GET /v1/containers/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Container getContainerByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get an Container by name
  * Get an Container by fully qualified name.
  * Note, this is equivalent to the other <code>getContainerByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Container
      */
      @RequestLine("GET /v1/containers/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Container> getContainerByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getContainerByFQN</code> method in a fluent style.
   */
  public static class GetContainerByFQNQueryParams extends HashMap<String, Object> {
    public GetContainerByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetContainerByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get an Object Store Container
   * Get an Object Store container by &#x60;id&#x60;.
   * @param id  (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Container
   */
  @RequestLine("GET /v1/containers/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Container getContainerByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get an Object Store Container
   * Similar to <code>getContainerByID</code> but it also returns the http response headers .
   * Get an Object Store container by &#x60;id&#x60;.
   * @param id  (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/containers/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Container> getContainerByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get an Object Store Container
   * Get an Object Store container by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getContainerByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetContainerByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Container
   */
  @RequestLine("GET /v1/containers/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Container getContainerByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get an Object Store Container
  * Get an Object Store container by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getContainerByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Container
      */
      @RequestLine("GET /v1/containers/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Container> getContainerByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getContainerByID</code> method in a fluent style.
   */
  public static class GetContainerByIDQueryParams extends HashMap<String, Object> {
    public GetContainerByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetContainerByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the Container
   * Get a version of the Container by given &#x60;id&#x60;
   * @param id Container Id (required)
   * @param version Container version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Container
   */
  @RequestLine("GET /v1/containers/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Container getSpecificContainerVersion(@Param("id") String id, @Param("version") String version);

  /**
   * Get a version of the Container
   * Similar to <code>getSpecificContainerVersion</code> but it also returns the http response headers .
   * Get a version of the Container by given &#x60;id&#x60;
   * @param id Container Id (required)
   * @param version Container version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/containers/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Container> getSpecificContainerVersionWithHttpInfo(@Param("id") String id, @Param("version") String version);



  /**
   * List Container versions
   * Get a list of all the versions of a container identified by &#x60;id&#x60;
   * @param id Container Id (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/containers/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllContainerVersion(@Param("id") String id);

  /**
   * List Container versions
   * Similar to <code>listAllContainerVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a container identified by &#x60;id&#x60;
   * @param id Container Id (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/containers/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllContainerVersionWithHttpInfo(@Param("id") String id);



  /**
   * List Containers
   * Get a list of containers, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter Containers by Object Store Service name (optional)
   * @param root Filter by Containers at the root level. E.g., without parent (optional, default to false)
   * @param limit Limit the number containers returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of containers before this cursor (optional)
   * @param after Returns list of containers after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return ContainerList
   */
  @RequestLine("GET /v1/containers?fields={fields}&service={service}&root={root}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ContainerList listContainers(@Param("fields") String fields, @Param("service") String service, @Param("root") Boolean root, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List Containers
   * Similar to <code>listContainers</code> but it also returns the http response headers .
   * Get a list of containers, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter Containers by Object Store Service name (optional)
   * @param root Filter by Containers at the root level. E.g., without parent (optional, default to false)
   * @param limit Limit the number containers returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of containers before this cursor (optional)
   * @param after Returns list of containers after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/containers?fields={fields}&service={service}&root={root}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ContainerList> listContainersWithHttpInfo(@Param("fields") String fields, @Param("service") String service, @Param("root") Boolean root, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List Containers
   * Get a list of containers, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listContainers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListContainersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>service - Filter Containers by Object Store Service name (optional)</li>
   *   <li>root - Filter by Containers at the root level. E.g., without parent (optional, default to false)</li>
   *   <li>limit - Limit the number containers returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of containers before this cursor (optional)</li>
   *   <li>after - Returns list of containers after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return ContainerList
   */
  @RequestLine("GET /v1/containers?fields={fields}&service={service}&root={root}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  ContainerList listContainers(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List Containers
  * Get a list of containers, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listContainers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>service - Filter Containers by Object Store Service name (optional)</li>
          *   <li>root - Filter by Containers at the root level. E.g., without parent (optional, default to false)</li>
          *   <li>limit - Limit the number containers returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of containers before this cursor (optional)</li>
          *   <li>after - Returns list of containers after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return ContainerList
      */
      @RequestLine("GET /v1/containers?fields={fields}&service={service}&root={root}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ContainerList> listContainersWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listContainers</code> method in a fluent style.
   */
  public static class ListContainersQueryParams extends HashMap<String, Object> {
    public ListContainersQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListContainersQueryParams service(final String value) {
      put("service", EncodingUtils.encode(value));
      return this;
    }
    public ListContainersQueryParams root(final Boolean value) {
      put("root", EncodingUtils.encode(value));
      return this;
    }
    public ListContainersQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListContainersQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListContainersQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListContainersQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a Container
   * Update an existing Container using JsonPatch.
   * @param id Id of the Container (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a Container Documentation</a>
   */
  @RequestLine("PATCH /v1/containers/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchContainer(@Param("id") String id, Object body);

  /**
   * Update a Container
   * Similar to <code>patchContainer</code> but it also returns the http response headers .
   * Update an existing Container using JsonPatch.
   * @param id Id of the Container (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a Container Documentation</a>
   */
  @RequestLine("PATCH /v1/containers/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchContainerWithHttpInfo(@Param("id") String id, Object body);



  /**
   * Restore a soft deleted Container.
   * Restore a soft deleted Container.
   * @param restoreEntity  (optional)
   * @return Container
   */
  @RequestLine("PUT /v1/containers/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Container restore32(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted Container.
   * Similar to <code>restore32</code> but it also returns the http response headers .
   * Restore a soft deleted Container.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/containers/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Container> restore32WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/containers/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity19(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity19</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/containers/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity19WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
