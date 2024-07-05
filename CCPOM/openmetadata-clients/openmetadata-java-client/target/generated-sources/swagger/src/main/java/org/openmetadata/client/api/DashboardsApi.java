package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateDashboard;
import org.openmetadata.client.model.Dashboard;
import org.openmetadata.client.model.DashboardList;
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
public interface DashboardsApi extends ApiClient.Api {


  /**
   * Add a follower
   * Add a user identified by &#x60;userId&#x60; as follower of this dashboard
   * @param id Id of the dashboard (required)
   * @param body Id of the user to be added as follower (optional)
   */
  @RequestLine("PUT /v1/dashboards/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void addFollowerToDashboard(@Param("id") UUID id, UUID body);

  /**
   * Add a follower
   * Similar to <code>addFollowerToDashboard</code> but it also returns the http response headers .
   * Add a user identified by &#x60;userId&#x60; as follower of this dashboard
   * @param id Id of the dashboard (required)
   * @param body Id of the user to be added as follower (optional)
   */
  @RequestLine("PUT /v1/dashboards/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> addFollowerToDashboardWithHttpInfo(@Param("id") UUID id, UUID body);



  /**
   * Create a dashboard
   * Create a new dashboard.
   * @param createDashboard  (optional)
   * @return Dashboard
   */
  @RequestLine("POST /v1/dashboards")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Dashboard createDashboard(CreateDashboard createDashboard);

  /**
   * Create a dashboard
   * Similar to <code>createDashboard</code> but it also returns the http response headers .
   * Create a new dashboard.
   * @param createDashboard  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/dashboards")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Dashboard> createDashboardWithHttpInfo(CreateDashboard createDashboard);



  /**
   * Create or update a dashboard
   * Create a new dashboard, if it does not exist or update an existing dashboard.
   * @param createDashboard  (optional)
   * @return Dashboard
   */
  @RequestLine("PUT /v1/dashboards")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Dashboard createOrUpdateDashboard(CreateDashboard createDashboard);

  /**
   * Create or update a dashboard
   * Similar to <code>createOrUpdateDashboard</code> but it also returns the http response headers .
   * Create a new dashboard, if it does not exist or update an existing dashboard.
   * @param createDashboard  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dashboards")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Dashboard> createOrUpdateDashboardWithHttpInfo(CreateDashboard createDashboard);



  /**
   * Delete a dashboard by Id
   * Delete a dashboard by &#x60;Id&#x60;.
   * @param id Id of the dashboard (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dashboards/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDashboard(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a dashboard by Id
   * Similar to <code>deleteDashboard</code> but it also returns the http response headers .
   * Delete a dashboard by &#x60;Id&#x60;.
   * @param id Id of the dashboard (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dashboards/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDashboardWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a dashboard by Id
   * Delete a dashboard by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deleteDashboard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDashboardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the dashboard (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dashboards/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDashboard(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a dashboard by Id
  * Delete a dashboard by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deleteDashboard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the dashboard (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dashboards/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDashboardWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDashboard</code> method in a fluent style.
   */
  public static class DeleteDashboardQueryParams extends HashMap<String, Object> {
    public DeleteDashboardQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a dashboard by fully qualified name
   * Delete a dashboard by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the dashboard (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dashboards/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDashboardByFQN(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a dashboard by fully qualified name
   * Similar to <code>deleteDashboardByFQN</code> but it also returns the http response headers .
   * Delete a dashboard by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the dashboard (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dashboards/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDashboardByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a dashboard by fully qualified name
   * Delete a dashboard by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteDashboardByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDashboardByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the dashboard (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dashboards/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDashboardByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a dashboard by fully qualified name
  * Delete a dashboard by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteDashboardByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the dashboard (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dashboards/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDashboardByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDashboardByFQN</code> method in a fluent style.
   */
  public static class DeleteDashboardByFQNQueryParams extends HashMap<String, Object> {
    public DeleteDashboardByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDashboardByFQNQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a dashboard by fully qualified name
   * Get a dashboard by fully qualified name.
   * @param fqn Fully qualified name of the dashboard (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Dashboard
   */
  @RequestLine("GET /v1/dashboards/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Dashboard getDashboardByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a dashboard by fully qualified name
   * Similar to <code>getDashboardByFQN</code> but it also returns the http response headers .
   * Get a dashboard by fully qualified name.
   * @param fqn Fully qualified name of the dashboard (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dashboards/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Dashboard> getDashboardByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a dashboard by fully qualified name
   * Get a dashboard by fully qualified name.
   * Note, this is equivalent to the other <code>getDashboardByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDashboardByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the dashboard (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Dashboard
   */
  @RequestLine("GET /v1/dashboards/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Dashboard getDashboardByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a dashboard by fully qualified name
  * Get a dashboard by fully qualified name.
  * Note, this is equivalent to the other <code>getDashboardByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the dashboard (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Dashboard
      */
      @RequestLine("GET /v1/dashboards/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Dashboard> getDashboardByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDashboardByFQN</code> method in a fluent style.
   */
  public static class GetDashboardByFQNQueryParams extends HashMap<String, Object> {
    public GetDashboardByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDashboardByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a dashboard by Id
   * Get a dashboard by &#x60;Id&#x60;.
   * @param id Id of the dashboard (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Dashboard
   */
  @RequestLine("GET /v1/dashboards/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Dashboard getDashboardByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a dashboard by Id
   * Similar to <code>getDashboardByID</code> but it also returns the http response headers .
   * Get a dashboard by &#x60;Id&#x60;.
   * @param id Id of the dashboard (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dashboards/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Dashboard> getDashboardByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a dashboard by Id
   * Get a dashboard by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getDashboardByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDashboardByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the dashboard (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Dashboard
   */
  @RequestLine("GET /v1/dashboards/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Dashboard getDashboardByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a dashboard by Id
  * Get a dashboard by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getDashboardByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the dashboard (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Dashboard
      */
      @RequestLine("GET /v1/dashboards/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Dashboard> getDashboardByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDashboardByID</code> method in a fluent style.
   */
  public static class GetDashboardByIDQueryParams extends HashMap<String, Object> {
    public GetDashboardByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDashboardByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the dashboard
   * Get a version of the dashboard by given &#x60;id&#x60;
   * @param id Id of the dashboard (required)
   * @param version Dashboard version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Dashboard
   */
  @RequestLine("GET /v1/dashboards/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Dashboard getSpecificDashboardVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the dashboard
   * Similar to <code>getSpecificDashboardVersion</code> but it also returns the http response headers .
   * Get a version of the dashboard by given &#x60;id&#x60;
   * @param id Id of the dashboard (required)
   * @param version Dashboard version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dashboards/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Dashboard> getSpecificDashboardVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List dashboard versions
   * Get a list of all the versions of a dashboard identified by &#x60;Id&#x60;
   * @param id Id of the dashboard (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/dashboards/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllDashboardVersion(@Param("id") UUID id);

  /**
   * List dashboard versions
   * Similar to <code>listAllDashboardVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a dashboard identified by &#x60;Id&#x60;
   * @param id Id of the dashboard (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dashboards/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllDashboardVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List dashboards
   * Get a list of dashboards, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter dashboards by service name (optional)
   * @param limit Limit the number dashboards returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of dashboards before this cursor (optional)
   * @param after Returns list of dashboards after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DashboardList
   */
  @RequestLine("GET /v1/dashboards?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DashboardList listDashboards(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List dashboards
   * Similar to <code>listDashboards</code> but it also returns the http response headers .
   * Get a list of dashboards, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter dashboards by service name (optional)
   * @param limit Limit the number dashboards returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of dashboards before this cursor (optional)
   * @param after Returns list of dashboards after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dashboards?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DashboardList> listDashboardsWithHttpInfo(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List dashboards
   * Get a list of dashboards, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listDashboards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDashboardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>service - Filter dashboards by service name (optional)</li>
   *   <li>limit - Limit the number dashboards returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of dashboards before this cursor (optional)</li>
   *   <li>after - Returns list of dashboards after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DashboardList
   */
  @RequestLine("GET /v1/dashboards?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DashboardList listDashboards(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List dashboards
  * Get a list of dashboards, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listDashboards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>service - Filter dashboards by service name (optional)</li>
          *   <li>limit - Limit the number dashboards returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of dashboards before this cursor (optional)</li>
          *   <li>after - Returns list of dashboards after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DashboardList
      */
      @RequestLine("GET /v1/dashboards?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DashboardList> listDashboardsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listDashboards</code> method in a fluent style.
   */
  public static class ListDashboardsQueryParams extends HashMap<String, Object> {
    public ListDashboardsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardsQueryParams service(final String value) {
      put("service", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a dashboard
   * Update an existing dashboard using JsonPatch.
   * @param id Id of the dashboard (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a dashboard Documentation</a>
   */
  @RequestLine("PATCH /v1/dashboards/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchDashboard(@Param("id") UUID id, Object body);

  /**
   * Update a dashboard
   * Similar to <code>patchDashboard</code> but it also returns the http response headers .
   * Update an existing dashboard using JsonPatch.
   * @param id Id of the dashboard (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a dashboard Documentation</a>
   */
  @RequestLine("PATCH /v1/dashboards/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchDashboardWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Remove a follower
   * Remove the user identified &#x60;userId&#x60; as a follower of the dashboard.
   * @param id Id of the dashboard (required)
   * @param userId Id of the user being removed as follower (required)
   */
  @RequestLine("DELETE /v1/dashboards/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  void removeFollowerFromDashboard(@Param("id") UUID id, @Param("userId") UUID userId);

  /**
   * Remove a follower
   * Similar to <code>removeFollowerFromDashboard</code> but it also returns the http response headers .
   * Remove the user identified &#x60;userId&#x60; as a follower of the dashboard.
   * @param id Id of the dashboard (required)
   * @param userId Id of the user being removed as follower (required)
   */
  @RequestLine("DELETE /v1/dashboards/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> removeFollowerFromDashboardWithHttpInfo(@Param("id") UUID id, @Param("userId") UUID userId);



  /**
   * Restore a soft deleted dashboard
   * Restore a soft deleted dashboard.
   * @param restoreEntity  (optional)
   * @return Dashboard
   */
  @RequestLine("PUT /v1/dashboards/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Dashboard restore6(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted dashboard
   * Similar to <code>restore6</code> but it also returns the http response headers .
   * Restore a soft deleted dashboard.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dashboards/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Dashboard> restore6WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/dashboards/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity3(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity3</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dashboards/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity3WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
