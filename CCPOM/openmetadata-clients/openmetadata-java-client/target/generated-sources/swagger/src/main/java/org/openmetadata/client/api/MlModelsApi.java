package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateMlModel;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.MlModel;
import org.openmetadata.client.model.MlModelList;
import org.openmetadata.client.model.RestoreEntity;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface MlModelsApi extends ApiClient.Api {


  /**
   * Add a follower
   * Add a user identified by &#x60;userId&#x60; as follower of this model
   * @param id Id of the ML Model (required)
   * @param body Id of the user to be added as follower (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/mlmodels/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent addFollower1(@Param("id") UUID id, UUID body);

  /**
   * Add a follower
   * Similar to <code>addFollower1</code> but it also returns the http response headers .
   * Add a user identified by &#x60;userId&#x60; as follower of this model
   * @param id Id of the ML Model (required)
   * @param body Id of the user to be added as follower (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/mlmodels/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> addFollower1WithHttpInfo(@Param("id") UUID id, UUID body);



  /**
   * Create an ML model
   * Create a new ML model.
   * @param createMlModel  (optional)
   * @return MlModel
   */
  @RequestLine("POST /v1/mlmodels")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MlModel createMlModel(CreateMlModel createMlModel);

  /**
   * Create an ML model
   * Similar to <code>createMlModel</code> but it also returns the http response headers .
   * Create a new ML model.
   * @param createMlModel  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/mlmodels")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MlModel> createMlModelWithHttpInfo(CreateMlModel createMlModel);



  /**
   * Create or update an ML model
   * Create a new ML model, if it does not exist or update an existing model.
   * @param createMlModel  (optional)
   * @return MlModel
   */
  @RequestLine("PUT /v1/mlmodels")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MlModel createOrUpdateMlModel(CreateMlModel createMlModel);

  /**
   * Create or update an ML model
   * Similar to <code>createOrUpdateMlModel</code> but it also returns the http response headers .
   * Create a new ML model, if it does not exist or update an existing model.
   * @param createMlModel  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/mlmodels")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MlModel> createOrUpdateMlModelWithHttpInfo(CreateMlModel createMlModel);



  /**
   * Remove a follower
   * Remove the user identified &#x60;userId&#x60; as a follower of the model.
   * @param id Id of the ML Model (required)
   * @param userId Id of the user being removed as follower (required)
   * @return ChangeEvent
   */
  @RequestLine("DELETE /v1/mlmodels/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ChangeEvent deleteFollower2(@Param("id") UUID id, @Param("userId") UUID userId);

  /**
   * Remove a follower
   * Similar to <code>deleteFollower2</code> but it also returns the http response headers .
   * Remove the user identified &#x60;userId&#x60; as a follower of the model.
   * @param id Id of the ML Model (required)
   * @param userId Id of the user being removed as follower (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/mlmodels/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> deleteFollower2WithHttpInfo(@Param("id") UUID id, @Param("userId") UUID userId);



  /**
   * Delete an ML model by Id
   * Delete an ML model by &#x60;Id&#x60;.
   * @param id Id of the ML Model (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/mlmodels/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteMlModel(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete an ML model by Id
   * Similar to <code>deleteMlModel</code> but it also returns the http response headers .
   * Delete an ML model by &#x60;Id&#x60;.
   * @param id Id of the ML Model (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/mlmodels/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteMlModelWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete an ML model by Id
   * Delete an ML model by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deleteMlModel</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMlModelQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the ML Model (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/mlmodels/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteMlModel(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete an ML model by Id
  * Delete an ML model by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deleteMlModel</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the ML Model (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/mlmodels/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteMlModelWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMlModel</code> method in a fluent style.
   */
  public static class DeleteMlModelQueryParams extends HashMap<String, Object> {
    public DeleteMlModelQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a ML model by fully qualified name
   * Delete an ML model by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Name of the ML Model (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/mlmodels/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteMlModelByFQN(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a ML model by fully qualified name
   * Similar to <code>deleteMlModelByFQN</code> but it also returns the http response headers .
   * Delete an ML model by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Name of the ML Model (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/mlmodels/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteMlModelByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a ML model by fully qualified name
   * Delete an ML model by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteMlModelByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMlModelByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Name of the ML Model (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/mlmodels/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteMlModelByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a ML model by fully qualified name
  * Delete an ML model by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteMlModelByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Name of the ML Model (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/mlmodels/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteMlModelByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMlModelByFQN</code> method in a fluent style.
   */
  public static class DeleteMlModelByFQNQueryParams extends HashMap<String, Object> {
    public DeleteMlModelByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteMlModelByFQNQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get an ML model by fully qualified name
   * Get an ML model by fully qualified name.
   * @param fqn Fully qualified name of ML Model (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return MlModel
   */
  @RequestLine("GET /v1/mlmodels/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  MlModel getMlModelByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get an ML model by fully qualified name
   * Similar to <code>getMlModelByFQN</code> but it also returns the http response headers .
   * Get an ML model by fully qualified name.
   * @param fqn Fully qualified name of ML Model (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/mlmodels/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MlModel> getMlModelByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get an ML model by fully qualified name
   * Get an ML model by fully qualified name.
   * Note, this is equivalent to the other <code>getMlModelByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMlModelByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of ML Model (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return MlModel
   */
  @RequestLine("GET /v1/mlmodels/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  MlModel getMlModelByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get an ML model by fully qualified name
  * Get an ML model by fully qualified name.
  * Note, this is equivalent to the other <code>getMlModelByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of ML Model (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return MlModel
      */
      @RequestLine("GET /v1/mlmodels/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MlModel> getMlModelByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getMlModelByFQN</code> method in a fluent style.
   */
  public static class GetMlModelByFQNQueryParams extends HashMap<String, Object> {
    public GetMlModelByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetMlModelByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get an ML model by Id
   * Get an ML model by &#x60;Id&#x60;.
   * @param id Id of the ML Model (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return MlModel
   */
  @RequestLine("GET /v1/mlmodels/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  MlModel getMlModelByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get an ML model by Id
   * Similar to <code>getMlModelByID</code> but it also returns the http response headers .
   * Get an ML model by &#x60;Id&#x60;.
   * @param id Id of the ML Model (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/mlmodels/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MlModel> getMlModelByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get an ML model by Id
   * Get an ML model by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getMlModelByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMlModelByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the ML Model (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return MlModel
   */
  @RequestLine("GET /v1/mlmodels/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  MlModel getMlModelByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get an ML model by Id
  * Get an ML model by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getMlModelByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the ML Model (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return MlModel
      */
      @RequestLine("GET /v1/mlmodels/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MlModel> getMlModelByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getMlModelByID</code> method in a fluent style.
   */
  public static class GetMlModelByIDQueryParams extends HashMap<String, Object> {
    public GetMlModelByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetMlModelByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the ML model
   * Get a version of the ML model by given &#x60;id&#x60;
   * @param id Id of the ML Model (required)
   * @param version ML Model version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return MlModel
   */
  @RequestLine("GET /v1/mlmodels/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  MlModel getSpecificMlModelVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the ML model
   * Similar to <code>getSpecificMlModelVersion</code> but it also returns the http response headers .
   * Get a version of the ML model by given &#x60;id&#x60;
   * @param id Id of the ML Model (required)
   * @param version ML Model version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/mlmodels/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MlModel> getSpecificMlModelVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List ML model versions
   * Get a list of all the versions of an ML Model identified by &#x60;id&#x60;
   * @param id Id of the ML Model (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/mlmodels/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllMlModelVersion(@Param("id") UUID id);

  /**
   * List ML model versions
   * Similar to <code>listAllMlModelVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of an ML Model identified by &#x60;id&#x60;
   * @param id Id of the ML Model (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/mlmodels/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllMlModelVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List ML models
   * Get a list of mlmodels, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter MlModels by service name (optional)
   * @param limit Limit the number models returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of models before this cursor (optional)
   * @param after Returns list of models after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return MlModelList
   */
  @RequestLine("GET /v1/mlmodels?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  MlModelList listMlModels(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List ML models
   * Similar to <code>listMlModels</code> but it also returns the http response headers .
   * Get a list of mlmodels, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter MlModels by service name (optional)
   * @param limit Limit the number models returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of models before this cursor (optional)
   * @param after Returns list of models after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/mlmodels?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MlModelList> listMlModelsWithHttpInfo(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List ML models
   * Get a list of mlmodels, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listMlModels</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListMlModelsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>service - Filter MlModels by service name (optional)</li>
   *   <li>limit - Limit the number models returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of models before this cursor (optional)</li>
   *   <li>after - Returns list of models after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return MlModelList
   */
  @RequestLine("GET /v1/mlmodels?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  MlModelList listMlModels(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List ML models
  * Get a list of mlmodels, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listMlModels</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>service - Filter MlModels by service name (optional)</li>
          *   <li>limit - Limit the number models returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of models before this cursor (optional)</li>
          *   <li>after - Returns list of models after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return MlModelList
      */
      @RequestLine("GET /v1/mlmodels?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MlModelList> listMlModelsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listMlModels</code> method in a fluent style.
   */
  public static class ListMlModelsQueryParams extends HashMap<String, Object> {
    public ListMlModelsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListMlModelsQueryParams service(final String value) {
      put("service", EncodingUtils.encode(value));
      return this;
    }
    public ListMlModelsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListMlModelsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListMlModelsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListMlModelsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update an ML model
   * Update an existing ML model using JsonPatch.
   * @param id Id of the ML Model (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update an ML model Documentation</a>
   */
  @RequestLine("PATCH /v1/mlmodels/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchMlModel(@Param("id") UUID id, Object body);

  /**
   * Update an ML model
   * Similar to <code>patchMlModel</code> but it also returns the http response headers .
   * Update an existing ML model using JsonPatch.
   * @param id Id of the ML Model (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update an ML model Documentation</a>
   */
  @RequestLine("PATCH /v1/mlmodels/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchMlModelWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted ML model
   * Restore a soft deleted ML Model.
   * @param restoreEntity  (optional)
   * @return MlModel
   */
  @RequestLine("PUT /v1/mlmodels/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MlModel restore19(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted ML model
   * Similar to <code>restore19</code> but it also returns the http response headers .
   * Restore a soft deleted ML Model.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/mlmodels/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MlModel> restore19WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/mlmodels/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity14(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity14</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/mlmodels/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity14WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
