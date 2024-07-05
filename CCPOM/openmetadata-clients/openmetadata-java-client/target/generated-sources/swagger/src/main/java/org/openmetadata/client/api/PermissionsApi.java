package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ResourcePermissionList;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface PermissionsApi extends ApiClient.Api {


  /**
   * Get permissions for a set of policies
   * 
   * @param ids List of policy of ids (optional)
   * @return ResourcePermissionList
   */
  @RequestLine("GET /v1/permissions/policies?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ResourcePermissionList getPermissionsForPolicies(@Param("ids") List<UUID> ids);

  /**
   * Get permissions for a set of policies
   * Similar to <code>getPermissionsForPolicies</code> but it also returns the http response headers .
   * 
   * @param ids List of policy of ids (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/permissions/policies?ids={ids}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ResourcePermissionList> getPermissionsForPoliciesWithHttpInfo(@Param("ids") List<UUID> ids);


  /**
   * Get permissions for a set of policies
   * 
   * Note, this is equivalent to the other <code>getPermissionsForPolicies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPermissionsForPoliciesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - List of policy of ids (optional)</li>
   *   </ul>
   * @return ResourcePermissionList
   */
  @RequestLine("GET /v1/permissions/policies?ids={ids}")
  @Headers({
  "Accept: application/json",
  })
  ResourcePermissionList getPermissionsForPolicies(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get permissions for a set of policies
  * 
  * Note, this is equivalent to the other <code>getPermissionsForPolicies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>ids - List of policy of ids (optional)</li>
      *   </ul>
          * @return ResourcePermissionList
      */
      @RequestLine("GET /v1/permissions/policies?ids={ids}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ResourcePermissionList> getPermissionsForPoliciesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPermissionsForPolicies</code> method in a fluent style.
   */
  public static class GetPermissionsForPoliciesQueryParams extends HashMap<String, Object> {
    public GetPermissionsForPoliciesQueryParams ids(final List<UUID> value) {
      put("ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * Get permissions for a given entity for a logged in user
   * 
   * @param resource Type of the resource (required)
   * @param id Id of the entity (required)
   * @param user Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)
   * @return ResourcePermissionList
   */
  @RequestLine("GET /v1/permissions/{resource}/{id}?user={user}")
  @Headers({
    "Accept: application/json",
  })
  ResourcePermissionList getResourcePermission(@Param("resource") String resource, @Param("id") UUID id, @Param("user") String user);

  /**
   * Get permissions for a given entity for a logged in user
   * Similar to <code>getResourcePermission</code> but it also returns the http response headers .
   * 
   * @param resource Type of the resource (required)
   * @param id Id of the entity (required)
   * @param user Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/permissions/{resource}/{id}?user={user}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ResourcePermissionList> getResourcePermissionWithHttpInfo(@Param("resource") String resource, @Param("id") UUID id, @Param("user") String user);


  /**
   * Get permissions for a given entity for a logged in user
   * 
   * Note, this is equivalent to the other <code>getResourcePermission</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetResourcePermissionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param resource Type of the resource (required)
   * @param id Id of the entity (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>user - Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)</li>
   *   </ul>
   * @return ResourcePermissionList
   */
  @RequestLine("GET /v1/permissions/{resource}/{id}?user={user}")
  @Headers({
  "Accept: application/json",
  })
  ResourcePermissionList getResourcePermission(@Param("resource") String resource, @Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get permissions for a given entity for a logged in user
  * 
  * Note, this is equivalent to the other <code>getResourcePermission</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param resource Type of the resource (required)
              * @param id Id of the entity (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>user - Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)</li>
      *   </ul>
          * @return ResourcePermissionList
      */
      @RequestLine("GET /v1/permissions/{resource}/{id}?user={user}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ResourcePermissionList> getResourcePermissionWithHttpInfo(@Param("resource") String resource, @Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getResourcePermission</code> method in a fluent style.
   */
  public static class GetResourcePermissionQueryParams extends HashMap<String, Object> {
    public GetResourcePermissionQueryParams user(final String value) {
      put("user", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get permissions for a given entity name for a logged in user
   * 
   * @param resource Type of the resource (required)
   * @param name Name of the entity (required)
   * @param user Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)
   * @return ResourcePermissionList
   */
  @RequestLine("GET /v1/permissions/{resource}/name/{name}?user={user}")
  @Headers({
    "Accept: application/json",
  })
  ResourcePermissionList getResourcePermissionByName(@Param("resource") String resource, @Param("name") String name, @Param("user") String user);

  /**
   * Get permissions for a given entity name for a logged in user
   * Similar to <code>getResourcePermissionByName</code> but it also returns the http response headers .
   * 
   * @param resource Type of the resource (required)
   * @param name Name of the entity (required)
   * @param user Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/permissions/{resource}/name/{name}?user={user}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ResourcePermissionList> getResourcePermissionByNameWithHttpInfo(@Param("resource") String resource, @Param("name") String name, @Param("user") String user);


  /**
   * Get permissions for a given entity name for a logged in user
   * 
   * Note, this is equivalent to the other <code>getResourcePermissionByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetResourcePermissionByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param resource Type of the resource (required)
   * @param name Name of the entity (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>user - Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)</li>
   *   </ul>
   * @return ResourcePermissionList
   */
  @RequestLine("GET /v1/permissions/{resource}/name/{name}?user={user}")
  @Headers({
  "Accept: application/json",
  })
  ResourcePermissionList getResourcePermissionByName(@Param("resource") String resource, @Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get permissions for a given entity name for a logged in user
  * 
  * Note, this is equivalent to the other <code>getResourcePermissionByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param resource Type of the resource (required)
              * @param name Name of the entity (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>user - Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)</li>
      *   </ul>
          * @return ResourcePermissionList
      */
      @RequestLine("GET /v1/permissions/{resource}/name/{name}?user={user}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ResourcePermissionList> getResourcePermissionByNameWithHttpInfo(@Param("resource") String resource, @Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getResourcePermissionByName</code> method in a fluent style.
   */
  public static class GetResourcePermissionByNameQueryParams extends HashMap<String, Object> {
    public GetResourcePermissionByNameQueryParams user(final String value) {
      put("user", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get permissions for logged in user
   * 
   * @param user Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)
   * @return ResourcePermissionList
   */
  @RequestLine("GET /v1/permissions?user={user}")
  @Headers({
    "Accept: application/json",
  })
  ResourcePermissionList getResourcePermissions(@Param("user") String user);

  /**
   * Get permissions for logged in user
   * Similar to <code>getResourcePermissions</code> but it also returns the http response headers .
   * 
   * @param user Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/permissions?user={user}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ResourcePermissionList> getResourcePermissionsWithHttpInfo(@Param("user") String user);


  /**
   * Get permissions for logged in user
   * 
   * Note, this is equivalent to the other <code>getResourcePermissions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetResourcePermissionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>user - Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)</li>
   *   </ul>
   * @return ResourcePermissionList
   */
  @RequestLine("GET /v1/permissions?user={user}")
  @Headers({
  "Accept: application/json",
  })
  ResourcePermissionList getResourcePermissions(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get permissions for logged in user
  * 
  * Note, this is equivalent to the other <code>getResourcePermissions</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>user - Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)</li>
      *   </ul>
          * @return ResourcePermissionList
      */
      @RequestLine("GET /v1/permissions?user={user}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ResourcePermissionList> getResourcePermissionsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getResourcePermissions</code> method in a fluent style.
   */
  public static class GetResourcePermissionsQueryParams extends HashMap<String, Object> {
    public GetResourcePermissionsQueryParams user(final String value) {
      put("user", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get permissions a given resource/entity type for logged in user
   * 
   * @param resource Type of the resource (required)
   * @param user Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)
   * @return ResourcePermissionList
   */
  @RequestLine("GET /v1/permissions/{resource}?user={user}")
  @Headers({
    "Accept: application/json",
  })
  ResourcePermissionList getResourceTypePermission(@Param("resource") String resource, @Param("user") String user);

  /**
   * Get permissions a given resource/entity type for logged in user
   * Similar to <code>getResourceTypePermission</code> but it also returns the http response headers .
   * 
   * @param resource Type of the resource (required)
   * @param user Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/permissions/{resource}?user={user}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ResourcePermissionList> getResourceTypePermissionWithHttpInfo(@Param("resource") String resource, @Param("user") String user);


  /**
   * Get permissions a given resource/entity type for logged in user
   * 
   * Note, this is equivalent to the other <code>getResourceTypePermission</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetResourceTypePermissionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param resource Type of the resource (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>user - Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)</li>
   *   </ul>
   * @return ResourcePermissionList
   */
  @RequestLine("GET /v1/permissions/{resource}?user={user}")
  @Headers({
  "Accept: application/json",
  })
  ResourcePermissionList getResourceTypePermission(@Param("resource") String resource, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get permissions a given resource/entity type for logged in user
  * 
  * Note, this is equivalent to the other <code>getResourceTypePermission</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param resource Type of the resource (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>user - Permission for user specified in this query param. If not specified, the user is defaulted to the logged in user (optional)</li>
      *   </ul>
          * @return ResourcePermissionList
      */
      @RequestLine("GET /v1/permissions/{resource}?user={user}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ResourcePermissionList> getResourceTypePermissionWithHttpInfo(@Param("resource") String resource, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getResourceTypePermission</code> method in a fluent style.
   */
  public static class GetResourceTypePermissionQueryParams extends HashMap<String, Object> {
    public GetResourceTypePermissionQueryParams user(final String value) {
      put("user", EncodingUtils.encode(value));
      return this;
    }
  }
}
