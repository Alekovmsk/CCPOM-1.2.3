package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.Metrics;
import org.openmetadata.client.model.MetricsList;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface MetricsBetaApi extends ApiClient.Api {


  /**
   * Create a metric
   * Create a new metric.
   * @param metrics  (optional)
   * @return Metrics
   */
  @RequestLine("POST /v1/metrics")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Metrics createMetric(Metrics metrics);

  /**
   * Create a metric
   * Similar to <code>createMetric</code> but it also returns the http response headers .
   * Create a new metric.
   * @param metrics  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/metrics")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Metrics> createMetricWithHttpInfo(Metrics metrics);



  /**
   * Create or update a metric
   * Create a new metric, if it does not exist or update an existing metric.
   * @param metrics  (optional)
   * @return Metrics
   */
  @RequestLine("PUT /v1/metrics")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Metrics createOrUpdateMetric(Metrics metrics);

  /**
   * Create or update a metric
   * Similar to <code>createOrUpdateMetric</code> but it also returns the http response headers .
   * Create a new metric, if it does not exist or update an existing metric.
   * @param metrics  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/metrics")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Metrics> createOrUpdateMetricWithHttpInfo(Metrics metrics);



  /**
   * Get a metric by Id
   * Get a metric by &#x60;Id&#x60;.
   * @param id Id of the metric (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Metrics
   */
  @RequestLine("GET /v1/metrics/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Metrics getMetricByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a metric by Id
   * Similar to <code>getMetricByID</code> but it also returns the http response headers .
   * Get a metric by &#x60;Id&#x60;.
   * @param id Id of the metric (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/metrics/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Metrics> getMetricByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a metric by Id
   * Get a metric by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getMetricByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMetricByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the metric (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Metrics
   */
  @RequestLine("GET /v1/metrics/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Metrics getMetricByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a metric by Id
  * Get a metric by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getMetricByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the metric (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Metrics
      */
      @RequestLine("GET /v1/metrics/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Metrics> getMetricByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getMetricByID</code> method in a fluent style.
   */
  public static class GetMetricByIDQueryParams extends HashMap<String, Object> {
    public GetMetricByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetMetricByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List metrics
   * Get a list of metrics. Use &#x60;fields&#x60; parameter to get only necessary fields.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of metrics before this cursor (optional)
   * @param after Returns list of metrics after this cursor (optional)
   * @return MetricsList
   */
  @RequestLine("GET /v1/metrics?fields={fields}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  MetricsList listMetrics(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);

  /**
   * List metrics
   * Similar to <code>listMetrics</code> but it also returns the http response headers .
   * Get a list of metrics. Use &#x60;fields&#x60; parameter to get only necessary fields.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of metrics before this cursor (optional)
   * @param after Returns list of metrics after this cursor (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/metrics?fields={fields}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MetricsList> listMetricsWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);


  /**
   * List metrics
   * Get a list of metrics. Use &#x60;fields&#x60; parameter to get only necessary fields.
   * Note, this is equivalent to the other <code>listMetrics</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListMetricsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit -  (optional, default to 10)</li>
   *   <li>before - Returns list of metrics before this cursor (optional)</li>
   *   <li>after - Returns list of metrics after this cursor (optional)</li>
   *   </ul>
   * @return MetricsList
   */
  @RequestLine("GET /v1/metrics?fields={fields}&limit={limit}&before={before}&after={after}")
  @Headers({
  "Accept: application/json",
  })
  MetricsList listMetrics(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List metrics
  * Get a list of metrics. Use &#x60;fields&#x60; parameter to get only necessary fields.
  * Note, this is equivalent to the other <code>listMetrics</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit -  (optional, default to 10)</li>
          *   <li>before - Returns list of metrics before this cursor (optional)</li>
          *   <li>after - Returns list of metrics after this cursor (optional)</li>
      *   </ul>
          * @return MetricsList
      */
      @RequestLine("GET /v1/metrics?fields={fields}&limit={limit}&before={before}&after={after}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<MetricsList> listMetricsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listMetrics</code> method in a fluent style.
   */
  public static class ListMetricsQueryParams extends HashMap<String, Object> {
    public ListMetricsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListMetricsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListMetricsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListMetricsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/metrics/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity13(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity13</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/metrics/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity13WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
