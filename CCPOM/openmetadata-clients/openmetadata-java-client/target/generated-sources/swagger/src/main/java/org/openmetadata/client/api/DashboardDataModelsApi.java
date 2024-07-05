package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateDashboardDataModel;
import org.openmetadata.client.model.DashboardDataModel;
import org.openmetadata.client.model.DashboardDataModelList;
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
public interface DashboardDataModelsApi extends ApiClient.Api {


  /**
   * Add a follower
   * Add a user identified by &#x60;userId&#x60; as followed of this data model
   * @param id Id of the data model (required)
   * @param body Id of the user to be added as follower (optional)
   */
  @RequestLine("PUT /v1/dashboard/datamodels/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void addFollowerToDataModel(@Param("id") UUID id, UUID body);

  /**
   * Add a follower
   * Similar to <code>addFollowerToDataModel</code> but it also returns the http response headers .
   * Add a user identified by &#x60;userId&#x60; as followed of this data model
   * @param id Id of the data model (required)
   * @param body Id of the user to be added as follower (optional)
   */
  @RequestLine("PUT /v1/dashboard/datamodels/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> addFollowerToDataModelWithHttpInfo(@Param("id") UUID id, UUID body);



  /**
   * Create a dashboard datamodel
   * Create a dashboard datamodel under an existing &#x60;service&#x60;.
   * @param createDashboardDataModel  (optional)
   * @return DashboardDataModel
   */
  @RequestLine("POST /v1/dashboard/datamodels")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DashboardDataModel createDataModel(CreateDashboardDataModel createDashboardDataModel);

  /**
   * Create a dashboard datamodel
   * Similar to <code>createDataModel</code> but it also returns the http response headers .
   * Create a dashboard datamodel under an existing &#x60;service&#x60;.
   * @param createDashboardDataModel  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/dashboard/datamodels")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DashboardDataModel> createDataModelWithHttpInfo(CreateDashboardDataModel createDashboardDataModel);



  /**
   * Create or update dashboard datamodel
   * Create a dashboard datamodel, it it does not exist or update an existing dashboard datamodel.
   * @param createDashboardDataModel  (optional)
   * @return DashboardDataModel
   */
  @RequestLine("PUT /v1/dashboard/datamodels")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DashboardDataModel createOrUpdateDataModel(CreateDashboardDataModel createDashboardDataModel);

  /**
   * Create or update dashboard datamodel
   * Similar to <code>createOrUpdateDataModel</code> but it also returns the http response headers .
   * Create a dashboard datamodel, it it does not exist or update an existing dashboard datamodel.
   * @param createDashboardDataModel  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dashboard/datamodels")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DashboardDataModel> createOrUpdateDataModelWithHttpInfo(CreateDashboardDataModel createDashboardDataModel);



  /**
   * Delete a data model by &#x60;id&#x60;.
   * Delete a dashboard datamodel by &#x60;id&#x60;.
   * @param id Id of the data model (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dashboard/datamodels/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDataModel(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a data model by &#x60;id&#x60;.
   * Similar to <code>deleteDataModel</code> but it also returns the http response headers .
   * Delete a dashboard datamodel by &#x60;id&#x60;.
   * @param id Id of the data model (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dashboard/datamodels/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDataModelWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a data model by &#x60;id&#x60;.
   * Delete a dashboard datamodel by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteDataModel</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDataModelQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the data model (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dashboard/datamodels/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDataModel(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a data model by &#x60;id&#x60;.
  * Delete a dashboard datamodel by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteDataModel</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the data model (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dashboard/datamodels/{id}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDataModelWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDataModel</code> method in a fluent style.
   */
  public static class DeleteDataModelQueryParams extends HashMap<String, Object> {
    public DeleteDataModelQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDataModelQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a data model by fully qualified name.
   * Delete a data model by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the data model (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dashboard/datamodels/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDataModelByFQN(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a data model by fully qualified name.
   * Similar to <code>deleteDataModelByFQN</code> but it also returns the http response headers .
   * Delete a data model by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the data model (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dashboard/datamodels/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDataModelByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a data model by fully qualified name.
   * Delete a data model by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteDataModelByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDataModelByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the data model (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dashboard/datamodels/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDataModelByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a data model by fully qualified name.
  * Delete a data model by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteDataModelByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the data model (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dashboard/datamodels/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDataModelByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDataModelByFQN</code> method in a fluent style.
   */
  public static class DeleteDataModelByFQNQueryParams extends HashMap<String, Object> {
    public DeleteDataModelByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDataModelByFQNQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Remove a follower
   * Remove the user identified &#x60;userId&#x60; as a follower of the data model.
   * @param id Id of the data model (required)
   * @param userId Id of the user being removed as follower (required)
   */
  @RequestLine("DELETE /v1/dashboard/datamodels/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  void deleteFollowerFromDataModel(@Param("id") UUID id, @Param("userId") UUID userId);

  /**
   * Remove a follower
   * Similar to <code>deleteFollowerFromDataModel</code> but it also returns the http response headers .
   * Remove the user identified &#x60;userId&#x60; as a follower of the data model.
   * @param id Id of the data model (required)
   * @param userId Id of the user being removed as follower (required)
   */
  @RequestLine("DELETE /v1/dashboard/datamodels/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteFollowerFromDataModelWithHttpInfo(@Param("id") UUID id, @Param("userId") UUID userId);



  /**
   * Get a dashboard datamodel by fully qualified name
   * Get a dashboard datamodel by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the dashboard datamodel (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DashboardDataModel
   */
  @RequestLine("GET /v1/dashboard/datamodels/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DashboardDataModel getDataModelByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a dashboard datamodel by fully qualified name
   * Similar to <code>getDataModelByFQN</code> but it also returns the http response headers .
   * Get a dashboard datamodel by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the dashboard datamodel (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dashboard/datamodels/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DashboardDataModel> getDataModelByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a dashboard datamodel by fully qualified name
   * Get a dashboard datamodel by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getDataModelByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDataModelByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the dashboard datamodel (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DashboardDataModel
   */
  @RequestLine("GET /v1/dashboard/datamodels/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DashboardDataModel getDataModelByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a dashboard datamodel by fully qualified name
  * Get a dashboard datamodel by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getDataModelByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the dashboard datamodel (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DashboardDataModel
      */
      @RequestLine("GET /v1/dashboard/datamodels/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DashboardDataModel> getDataModelByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDataModelByFQN</code> method in a fluent style.
   */
  public static class GetDataModelByFQNQueryParams extends HashMap<String, Object> {
    public GetDataModelByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDataModelByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a dashboard datamodel by Id
   * Get a dashboard datamodel by &#x60;id&#x60;.
   * @param id Id of the dashboard datamodel (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DashboardDataModel
   */
  @RequestLine("GET /v1/dashboard/datamodels/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DashboardDataModel getDataModelByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a dashboard datamodel by Id
   * Similar to <code>getDataModelByID</code> but it also returns the http response headers .
   * Get a dashboard datamodel by &#x60;id&#x60;.
   * @param id Id of the dashboard datamodel (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dashboard/datamodels/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DashboardDataModel> getDataModelByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a dashboard datamodel by Id
   * Get a dashboard datamodel by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getDataModelByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDataModelByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the dashboard datamodel (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DashboardDataModel
   */
  @RequestLine("GET /v1/dashboard/datamodels/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DashboardDataModel getDataModelByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a dashboard datamodel by Id
  * Get a dashboard datamodel by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getDataModelByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the dashboard datamodel (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DashboardDataModel
      */
      @RequestLine("GET /v1/dashboard/datamodels/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DashboardDataModel> getDataModelByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDataModelByID</code> method in a fluent style.
   */
  public static class GetDataModelByIDQueryParams extends HashMap<String, Object> {
    public GetDataModelByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDataModelByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the dashboard datamodel
   * Get a version of the dashboard datamodel by given &#x60;id&#x60;
   * @param id Id of the dashboard datamodel (required)
   * @param version DataModel version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return DashboardDataModel
   */
  @RequestLine("GET /v1/dashboard/datamodels/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  DashboardDataModel getSpecificDataModelVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the dashboard datamodel
   * Similar to <code>getSpecificDataModelVersion</code> but it also returns the http response headers .
   * Get a version of the dashboard datamodel by given &#x60;id&#x60;
   * @param id Id of the dashboard datamodel (required)
   * @param version DataModel version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dashboard/datamodels/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DashboardDataModel> getSpecificDataModelVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List dashboard datamodel versions
   * Get a list of all the versions of a dashboard datamodel identified by &#x60;id&#x60;
   * @param id Id of the dashboard datamodel (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/dashboard/datamodels/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllDataModelVersions(@Param("id") UUID id);

  /**
   * List dashboard datamodel versions
   * Similar to <code>listAllDataModelVersions</code> but it also returns the http response headers .
   * Get a list of all the versions of a dashboard datamodel identified by &#x60;id&#x60;
   * @param id Id of the dashboard datamodel (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dashboard/datamodels/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllDataModelVersionsWithHttpInfo(@Param("id") UUID id);



  /**
   * List Dashboard Data Models
   * Get a list of dashboard datamodels, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter dashboardDataModel by service name (optional)
   * @param limit Limit the number dashboardDataModel returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of dashboardDataModel before this cursor (optional)
   * @param after Returns list of dashboardDataModel after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DashboardDataModelList
   */
  @RequestLine("GET /v1/dashboard/datamodels?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DashboardDataModelList listDashboardDataModels(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List Dashboard Data Models
   * Similar to <code>listDashboardDataModels</code> but it also returns the http response headers .
   * Get a list of dashboard datamodels, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter dashboardDataModel by service name (optional)
   * @param limit Limit the number dashboardDataModel returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of dashboardDataModel before this cursor (optional)
   * @param after Returns list of dashboardDataModel after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dashboard/datamodels?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DashboardDataModelList> listDashboardDataModelsWithHttpInfo(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List Dashboard Data Models
   * Get a list of dashboard datamodels, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listDashboardDataModels</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDashboardDataModelsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>service - Filter dashboardDataModel by service name (optional)</li>
   *   <li>limit - Limit the number dashboardDataModel returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of dashboardDataModel before this cursor (optional)</li>
   *   <li>after - Returns list of dashboardDataModel after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DashboardDataModelList
   */
  @RequestLine("GET /v1/dashboard/datamodels?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DashboardDataModelList listDashboardDataModels(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List Dashboard Data Models
  * Get a list of dashboard datamodels, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listDashboardDataModels</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>service - Filter dashboardDataModel by service name (optional)</li>
          *   <li>limit - Limit the number dashboardDataModel returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of dashboardDataModel before this cursor (optional)</li>
          *   <li>after - Returns list of dashboardDataModel after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DashboardDataModelList
      */
      @RequestLine("GET /v1/dashboard/datamodels?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DashboardDataModelList> listDashboardDataModelsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listDashboardDataModels</code> method in a fluent style.
   */
  public static class ListDashboardDataModelsQueryParams extends HashMap<String, Object> {
    public ListDashboardDataModelsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardDataModelsQueryParams service(final String value) {
      put("service", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardDataModelsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardDataModelsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardDataModelsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListDashboardDataModelsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a dashboard datamodel
   * Update an existing dashboard datamodel using JsonPatch.
   * @param id Id of the dashboard datamodel (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a dashboard datamodel Documentation</a>
   */
  @RequestLine("PATCH /v1/dashboard/datamodels/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchDataModel(@Param("id") UUID id, Object body);

  /**
   * Update a dashboard datamodel
   * Similar to <code>patchDataModel</code> but it also returns the http response headers .
   * Update an existing dashboard datamodel using JsonPatch.
   * @param id Id of the dashboard datamodel (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a dashboard datamodel Documentation</a>
   */
  @RequestLine("PATCH /v1/dashboard/datamodels/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchDataModelWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted data model.
   * Restore a soft deleted data model.
   * @param restoreEntity  (optional)
   * @return DashboardDataModel
   */
  @RequestLine("PUT /v1/dashboard/datamodels/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DashboardDataModel restore11(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted data model.
   * Similar to <code>restore11</code> but it also returns the http response headers .
   * Restore a soft deleted data model.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dashboard/datamodels/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DashboardDataModel> restore11WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/dashboard/datamodels/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity8(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity8</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dashboard/datamodels/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity8WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
