package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateRole;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Role;
import org.openmetadata.client.model.RoleList;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface RolesApi extends ApiClient.Api {


  /**
   * Update role
   * Create or Update a role.
   * @param createRole  (optional)
   * @return Role
   */
  @RequestLine("PUT /v1/roles")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Role createOrUpdateRole(CreateRole createRole);

  /**
   * Update role
   * Similar to <code>createOrUpdateRole</code> but it also returns the http response headers .
   * Create or Update a role.
   * @param createRole  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/roles")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Role> createOrUpdateRoleWithHttpInfo(CreateRole createRole);



  /**
   * Create a role
   * Create a new role.
   * @param createRole  (optional)
   * @return Role
   */
  @RequestLine("POST /v1/roles")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Role createRole(CreateRole createRole);

  /**
   * Create a role
   * Similar to <code>createRole</code> but it also returns the http response headers .
   * Create a new role.
   * @param createRole  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/roles")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Role> createRoleWithHttpInfo(CreateRole createRole);



  /**
   * Delete a role
   * Delete a role by given &#x60;id&#x60;.
   * @param id Id of the role (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/roles/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteRole(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a role
   * Similar to <code>deleteRole</code> but it also returns the http response headers .
   * Delete a role by given &#x60;id&#x60;.
   * @param id Id of the role (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/roles/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteRoleWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a role
   * Delete a role by given &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteRole</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteRoleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the role (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/roles/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteRole(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a role
  * Delete a role by given &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteRole</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the role (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/roles/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteRoleWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteRole</code> method in a fluent style.
   */
  public static class DeleteRoleQueryParams extends HashMap<String, Object> {
    public DeleteRoleQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a role
   * Delete a role by given &#x60;name&#x60;.
   * @param name Name of the role (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/roles/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteRoleByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a role
   * Similar to <code>deleteRoleByName</code> but it also returns the http response headers .
   * Delete a role by given &#x60;name&#x60;.
   * @param name Name of the role (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/roles/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteRoleByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a role
   * Delete a role by given &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>deleteRoleByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteRoleByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the role (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/roles/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteRoleByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a role
  * Delete a role by given &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>deleteRoleByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the role (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/roles/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteRoleByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteRoleByName</code> method in a fluent style.
   */
  public static class DeleteRoleByNameQueryParams extends HashMap<String, Object> {
    public DeleteRoleByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a role by name
   * Get a role by &#x60;name&#x60;.
   * @param name Name of the role (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Role
   */
  @RequestLine("GET /v1/roles/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Role getRoleByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a role by name
   * Similar to <code>getRoleByFQN</code> but it also returns the http response headers .
   * Get a role by &#x60;name&#x60;.
   * @param name Name of the role (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/roles/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Role> getRoleByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a role by name
   * Get a role by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getRoleByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetRoleByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the role (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Role
   */
  @RequestLine("GET /v1/roles/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Role getRoleByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a role by name
  * Get a role by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getRoleByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the role (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Role
      */
      @RequestLine("GET /v1/roles/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Role> getRoleByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getRoleByFQN</code> method in a fluent style.
   */
  public static class GetRoleByFQNQueryParams extends HashMap<String, Object> {
    public GetRoleByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetRoleByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a role by id
   * Get a role by &#x60;id&#x60;.
   * @param id Id of the role (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Role
   */
  @RequestLine("GET /v1/roles/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Role getRoleByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a role by id
   * Similar to <code>getRoleByID</code> but it also returns the http response headers .
   * Get a role by &#x60;id&#x60;.
   * @param id Id of the role (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/roles/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Role> getRoleByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a role by id
   * Get a role by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getRoleByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetRoleByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the role (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Role
   */
  @RequestLine("GET /v1/roles/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Role getRoleByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a role by id
  * Get a role by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getRoleByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the role (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Role
      */
      @RequestLine("GET /v1/roles/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Role> getRoleByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getRoleByID</code> method in a fluent style.
   */
  public static class GetRoleByIDQueryParams extends HashMap<String, Object> {
    public GetRoleByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetRoleByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the role
   * Get a version of the role by given &#x60;id&#x60;
   * @param id Id of the role (required)
   * @param version Role version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Role
   */
  @RequestLine("GET /v1/roles/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Role getSpecificRoleVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the role
   * Similar to <code>getSpecificRoleVersion</code> but it also returns the http response headers .
   * Get a version of the role by given &#x60;id&#x60;
   * @param id Id of the role (required)
   * @param version Role version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/roles/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Role> getSpecificRoleVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List role versions
   * Get a list of all the versions of a role identified by &#x60;id&#x60;
   * @param id Id of the role (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/roles/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllRoleVersion(@Param("id") UUID id);

  /**
   * List role versions
   * Similar to <code>listAllRoleVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a role identified by &#x60;id&#x60;
   * @param id Id of the role (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/roles/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllRoleVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List roles
   * Get a list of roles. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param _default List only default role(s) (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number tables returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of tables before this cursor (optional)
   * @param after Returns list of tables after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return RoleList
   */
  @RequestLine("GET /v1/roles?default={_default}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  RoleList listRoles(@Param("_default") Boolean _default, @Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List roles
   * Similar to <code>listRoles</code> but it also returns the http response headers .
   * Get a list of roles. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param _default List only default role(s) (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number tables returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of tables before this cursor (optional)
   * @param after Returns list of tables after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/roles?default={_default}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<RoleList> listRolesWithHttpInfo(@Param("_default") Boolean _default, @Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List roles
   * Get a list of roles. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listRoles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListRolesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>_default - List only default role(s) (optional)</li>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number tables returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of tables before this cursor (optional)</li>
   *   <li>after - Returns list of tables after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return RoleList
   */
  @RequestLine("GET /v1/roles?default={_default}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  RoleList listRoles(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List roles
  * Get a list of roles. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listRoles</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>_default - List only default role(s) (optional)</li>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number tables returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of tables before this cursor (optional)</li>
          *   <li>after - Returns list of tables after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return RoleList
      */
      @RequestLine("GET /v1/roles?default={_default}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<RoleList> listRolesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listRoles</code> method in a fluent style.
   */
  public static class ListRolesQueryParams extends HashMap<String, Object> {
    public ListRolesQueryParams _default(final Boolean value) {
      put("default", EncodingUtils.encode(value));
      return this;
    }
    public ListRolesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListRolesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListRolesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListRolesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListRolesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a role
   * Update an existing role with JsonPatch.
   * @param id Id of the role (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a role Documentation</a>
   */
  @RequestLine("PATCH /v1/roles/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchRole(@Param("id") UUID id, Object body);

  /**
   * Update a role
   * Similar to <code>patchRole</code> but it also returns the http response headers .
   * Update an existing role with JsonPatch.
   * @param id Id of the role (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a role Documentation</a>
   */
  @RequestLine("PATCH /v1/roles/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchRoleWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted role
   * Restore a soft deleted role.
   * @param restoreEntity  (optional)
   * @return Role
   */
  @RequestLine("PUT /v1/roles/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Role restore33(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted role
   * Similar to <code>restore33</code> but it also returns the http response headers .
   * Restore a soft deleted role.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/roles/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Role> restore33WithHttpInfo(RestoreEntity restoreEntity);


}
