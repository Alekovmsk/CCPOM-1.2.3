package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import java.math.BigDecimal;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreatePipeline;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.Pipeline;
import org.openmetadata.client.model.PipelineList;
import org.openmetadata.client.model.PipelineStatus;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.TestCaseList;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface PipelinesApi extends ApiClient.Api {


  /**
   * Add a follower
   * Add a user identified by &#x60;userId&#x60; as follower of this pipeline
   * @param id Id of the pipeline (required)
   * @param body Id of the user to be added as follower (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/pipelines/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent addFollower2(@Param("id") UUID id, String body);

  /**
   * Add a follower
   * Similar to <code>addFollower2</code> but it also returns the http response headers .
   * Add a user identified by &#x60;userId&#x60; as follower of this pipeline
   * @param id Id of the pipeline (required)
   * @param body Id of the user to be added as follower (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/pipelines/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> addFollower2WithHttpInfo(@Param("id") UUID id, String body);



  /**
   * Add status data
   * Add status data to the pipeline.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param pipelineStatus  (optional)
   * @return Pipeline
   */
  @RequestLine("PUT /v1/pipelines/{fqn}/status")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Pipeline addStatusData(@Param("fqn") String fqn, PipelineStatus pipelineStatus);

  /**
   * Add status data
   * Similar to <code>addStatusData</code> but it also returns the http response headers .
   * Add status data to the pipeline.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param pipelineStatus  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/pipelines/{fqn}/status")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Pipeline> addStatusDataWithHttpInfo(@Param("fqn") String fqn, PipelineStatus pipelineStatus);



  /**
   * Create or update a pipeline
   * Create a new pipeline, if it does not exist or update an existing pipeline.
   * @param createPipeline  (optional)
   * @return Pipeline
   */
  @RequestLine("PUT /v1/pipelines")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Pipeline createOrUpdatePipeline(CreatePipeline createPipeline);

  /**
   * Create or update a pipeline
   * Similar to <code>createOrUpdatePipeline</code> but it also returns the http response headers .
   * Create a new pipeline, if it does not exist or update an existing pipeline.
   * @param createPipeline  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/pipelines")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Pipeline> createOrUpdatePipelineWithHttpInfo(CreatePipeline createPipeline);



  /**
   * Create a pipeline
   * Create a new pipeline.
   * @param createPipeline  (optional)
   * @return Pipeline
   */
  @RequestLine("POST /v1/pipelines")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Pipeline createPipeline(CreatePipeline createPipeline);

  /**
   * Create a pipeline
   * Similar to <code>createPipeline</code> but it also returns the http response headers .
   * Create a new pipeline.
   * @param createPipeline  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/pipelines")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Pipeline> createPipelineWithHttpInfo(CreatePipeline createPipeline);



  /**
   * Remove a follower
   * Remove the user identified &#x60;userId&#x60; as a follower of the pipeline.
   * @param id Id of the pipeline (required)
   * @param userId Id of the user being removed as follower (required)
   * @return ChangeEvent
   */
  @RequestLine("DELETE /v1/pipelines/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ChangeEvent deleteFollower3(@Param("id") UUID id, @Param("userId") UUID userId);

  /**
   * Remove a follower
   * Similar to <code>deleteFollower3</code> but it also returns the http response headers .
   * Remove the user identified &#x60;userId&#x60; as a follower of the pipeline.
   * @param id Id of the pipeline (required)
   * @param userId Id of the user being removed as follower (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/pipelines/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> deleteFollower3WithHttpInfo(@Param("id") UUID id, @Param("userId") UUID userId);



  /**
   * Delete a pipeline by Id
   * Delete a pipeline by &#x60;Id&#x60;.
   * @param id Id of the pipeline (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/pipelines/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deletePipeline(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a pipeline by Id
   * Similar to <code>deletePipeline</code> but it also returns the http response headers .
   * Delete a pipeline by &#x60;Id&#x60;.
   * @param id Id of the pipeline (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/pipelines/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePipelineWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a pipeline by Id
   * Delete a pipeline by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deletePipeline</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePipelineQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the pipeline (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/pipelines/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deletePipeline(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a pipeline by Id
  * Delete a pipeline by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deletePipeline</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the pipeline (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/pipelines/{id}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deletePipelineWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePipeline</code> method in a fluent style.
   */
  public static class DeletePipelineQueryParams extends HashMap<String, Object> {
    public DeletePipelineQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeletePipelineQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a pipeline by fully qualified name
   * Delete a pipeline by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/pipelines/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deletePipelineByFQN(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a pipeline by fully qualified name
   * Similar to <code>deletePipelineByFQN</code> but it also returns the http response headers .
   * Delete a pipeline by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/pipelines/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePipelineByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a pipeline by fully qualified name
   * Delete a pipeline by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deletePipelineByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePipelineByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/pipelines/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deletePipelineByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a pipeline by fully qualified name
  * Delete a pipeline by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deletePipelineByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the pipeline (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/pipelines/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deletePipelineByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePipelineByFQN</code> method in a fluent style.
   */
  public static class DeletePipelineByFQNQueryParams extends HashMap<String, Object> {
    public DeletePipelineByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeletePipelineByFQNQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete pipeline status
   * Delete pipeline status for a pipeline.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param timestamp Timestamp of the pipeline status (required)
   * @return Pipeline
   */
  @RequestLine("DELETE /v1/pipelines/{fqn}/status/{timestamp}")
  @Headers({
    "Accept: application/json",
  })
  Pipeline deletePipelineStatus(@Param("fqn") String fqn, @Param("timestamp") Long timestamp);

  /**
   * Delete pipeline status
   * Similar to <code>deletePipelineStatus</code> but it also returns the http response headers .
   * Delete pipeline status for a pipeline.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param timestamp Timestamp of the pipeline status (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/pipelines/{fqn}/status/{timestamp}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Pipeline> deletePipelineStatusWithHttpInfo(@Param("fqn") String fqn, @Param("timestamp") Long timestamp);



  /**
   * Get a pipeline by fully qualified name
   * Get a pipeline by fully qualified name.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Pipeline
   */
  @RequestLine("GET /v1/pipelines/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Pipeline getPipelineByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a pipeline by fully qualified name
   * Similar to <code>getPipelineByFQN</code> but it also returns the http response headers .
   * Get a pipeline by fully qualified name.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/pipelines/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Pipeline> getPipelineByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a pipeline by fully qualified name
   * Get a pipeline by fully qualified name.
   * Note, this is equivalent to the other <code>getPipelineByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPipelineByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Pipeline
   */
  @RequestLine("GET /v1/pipelines/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Pipeline getPipelineByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a pipeline by fully qualified name
  * Get a pipeline by fully qualified name.
  * Note, this is equivalent to the other <code>getPipelineByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the pipeline (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Pipeline
      */
      @RequestLine("GET /v1/pipelines/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Pipeline> getPipelineByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPipelineByFQN</code> method in a fluent style.
   */
  public static class GetPipelineByFQNQueryParams extends HashMap<String, Object> {
    public GetPipelineByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a pipeline by Id
   * Get a pipeline by &#x60;Id&#x60;.
   * @param id Id of the pipeline (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Pipeline
   */
  @RequestLine("GET /v1/pipelines/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Pipeline getPipelineWithID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a pipeline by Id
   * Similar to <code>getPipelineWithID</code> but it also returns the http response headers .
   * Get a pipeline by &#x60;Id&#x60;.
   * @param id Id of the pipeline (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/pipelines/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Pipeline> getPipelineWithIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a pipeline by Id
   * Get a pipeline by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getPipelineWithID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPipelineWithIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the pipeline (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Pipeline
   */
  @RequestLine("GET /v1/pipelines/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Pipeline getPipelineWithID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a pipeline by Id
  * Get a pipeline by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getPipelineWithID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the pipeline (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Pipeline
      */
      @RequestLine("GET /v1/pipelines/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Pipeline> getPipelineWithIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPipelineWithID</code> method in a fluent style.
   */
  public static class GetPipelineWithIDQueryParams extends HashMap<String, Object> {
    public GetPipelineWithIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetPipelineWithIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the pipeline
   * Get a version of the pipeline by given &#x60;Id&#x60;
   * @param id Id of the pipeline (required)
   * @param version Pipeline version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Pipeline
   */
  @RequestLine("GET /v1/pipelines/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Pipeline getSpecificPipelineVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the pipeline
   * Similar to <code>getSpecificPipelineVersion</code> but it also returns the http response headers .
   * Get a version of the pipeline by given &#x60;Id&#x60;
   * @param id Id of the pipeline (required)
   * @param version Pipeline version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/pipelines/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Pipeline> getSpecificPipelineVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List pipeline versions
   * Get a list of all the versions of a pipeline identified by &#x60;Id&#x60;
   * @param id Id of the pipeline (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/pipelines/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllPipelineVersion(@Param("id") UUID id);

  /**
   * List pipeline versions
   * Similar to <code>listAllPipelineVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a pipeline identified by &#x60;Id&#x60;
   * @param id Id of the pipeline (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/pipelines/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllPipelineVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List pipeline status
   * Get a list of pipeline status.parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param startTs Filter pipeline statues after the given start timestamp (required)
   * @param endTs Filter pipeline statues before the given end timestamp (required)
   * @return TestCaseList
   */
  @RequestLine("GET /v1/pipelines/{fqn}/status?startTs={startTs}&endTs={endTs}")
  @Headers({
    "Accept: application/json",
  })
  TestCaseList listPipelineStatuses(@Param("fqn") String fqn, @Param("startTs") BigDecimal startTs, @Param("endTs") BigDecimal endTs);

  /**
   * List pipeline status
   * Similar to <code>listPipelineStatuses</code> but it also returns the http response headers .
   * Get a list of pipeline status.parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param startTs Filter pipeline statues after the given start timestamp (required)
   * @param endTs Filter pipeline statues before the given end timestamp (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/pipelines/{fqn}/status?startTs={startTs}&endTs={endTs}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TestCaseList> listPipelineStatusesWithHttpInfo(@Param("fqn") String fqn, @Param("startTs") BigDecimal startTs, @Param("endTs") BigDecimal endTs);


  /**
   * List pipeline status
   * Get a list of pipeline status.parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listPipelineStatuses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPipelineStatusesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the pipeline (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTs - Filter pipeline statues after the given start timestamp (required)</li>
   *   <li>endTs - Filter pipeline statues before the given end timestamp (required)</li>
   *   </ul>
   * @return TestCaseList
   */
  @RequestLine("GET /v1/pipelines/{fqn}/status?startTs={startTs}&endTs={endTs}")
  @Headers({
  "Accept: application/json",
  })
  TestCaseList listPipelineStatuses(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List pipeline status
  * Get a list of pipeline status.parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listPipelineStatuses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the pipeline (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>startTs - Filter pipeline statues after the given start timestamp (required)</li>
          *   <li>endTs - Filter pipeline statues before the given end timestamp (required)</li>
      *   </ul>
          * @return TestCaseList
      */
      @RequestLine("GET /v1/pipelines/{fqn}/status?startTs={startTs}&endTs={endTs}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TestCaseList> listPipelineStatusesWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listPipelineStatuses</code> method in a fluent style.
   */
  public static class ListPipelineStatusesQueryParams extends HashMap<String, Object> {
    public ListPipelineStatusesQueryParams startTs(final BigDecimal value) {
      put("startTs", EncodingUtils.encode(value));
      return this;
    }
    public ListPipelineStatusesQueryParams endTs(final BigDecimal value) {
      put("endTs", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List pipelines
   * Get a list of pipelines, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter pipelines by service name (optional)
   * @param limit Limit the number pipelines returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of pipelines before this cursor (optional)
   * @param after Returns list of pipelines after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return PipelineList
   */
  @RequestLine("GET /v1/pipelines?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  PipelineList listPipelines(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List pipelines
   * Similar to <code>listPipelines</code> but it also returns the http response headers .
   * Get a list of pipelines, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter pipelines by service name (optional)
   * @param limit Limit the number pipelines returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of pipelines before this cursor (optional)
   * @param after Returns list of pipelines after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/pipelines?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PipelineList> listPipelinesWithHttpInfo(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List pipelines
   * Get a list of pipelines, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listPipelines</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPipelinesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>service - Filter pipelines by service name (optional)</li>
   *   <li>limit - Limit the number pipelines returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of pipelines before this cursor (optional)</li>
   *   <li>after - Returns list of pipelines after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return PipelineList
   */
  @RequestLine("GET /v1/pipelines?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  PipelineList listPipelines(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List pipelines
  * Get a list of pipelines, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listPipelines</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>service - Filter pipelines by service name (optional)</li>
          *   <li>limit - Limit the number pipelines returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of pipelines before this cursor (optional)</li>
          *   <li>after - Returns list of pipelines after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return PipelineList
      */
      @RequestLine("GET /v1/pipelines?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PipelineList> listPipelinesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listPipelines</code> method in a fluent style.
   */
  public static class ListPipelinesQueryParams extends HashMap<String, Object> {
    public ListPipelinesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListPipelinesQueryParams service(final String value) {
      put("service", EncodingUtils.encode(value));
      return this;
    }
    public ListPipelinesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListPipelinesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListPipelinesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListPipelinesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a pipeline
   * Update an existing pipeline using JsonPatch.
   * @param id Id of the pipeline (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a pipeline Documentation</a>
   */
  @RequestLine("PATCH /v1/pipelines/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchPipeline(@Param("id") UUID id, Object body);

  /**
   * Update a pipeline
   * Similar to <code>patchPipeline</code> but it also returns the http response headers .
   * Update an existing pipeline using JsonPatch.
   * @param id Id of the pipeline (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a pipeline Documentation</a>
   */
  @RequestLine("PATCH /v1/pipelines/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchPipelineWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted pipeline
   * Restore a soft deleted pipeline.
   * @param restoreEntity  (optional)
   * @return Pipeline
   */
  @RequestLine("PUT /v1/pipelines/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Pipeline restore20(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted pipeline
   * Similar to <code>restore20</code> but it also returns the http response headers .
   * Restore a soft deleted pipeline.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/pipelines/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Pipeline> restore20WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/pipelines/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity15(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity15</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/pipelines/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity15WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
