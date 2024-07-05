package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.Chart;
import org.openmetadata.client.model.ChartList;
import org.openmetadata.client.model.CreateChart;
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
public interface ChartsApi extends ApiClient.Api {


  /**
   * Add a follower
   * Add a user identified by &#x60;userId&#x60; as followed of this chart
   * @param id Id of the chart (required)
   * @param body Id of the user to be added as follower (optional)
   */
  @RequestLine("PUT /v1/charts/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void addFollowerToChart(@Param("id") UUID id, UUID body);

  /**
   * Add a follower
   * Similar to <code>addFollowerToChart</code> but it also returns the http response headers .
   * Add a user identified by &#x60;userId&#x60; as followed of this chart
   * @param id Id of the chart (required)
   * @param body Id of the user to be added as follower (optional)
   */
  @RequestLine("PUT /v1/charts/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> addFollowerToChartWithHttpInfo(@Param("id") UUID id, UUID body);



  /**
   * Create a chart
   * Create a chart under an existing &#x60;service&#x60;.
   * @param createChart  (optional)
   * @return Chart
   */
  @RequestLine("POST /v1/charts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Chart createChart(CreateChart createChart);

  /**
   * Create a chart
   * Similar to <code>createChart</code> but it also returns the http response headers .
   * Create a chart under an existing &#x60;service&#x60;.
   * @param createChart  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/charts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Chart> createChartWithHttpInfo(CreateChart createChart);



  /**
   * Create or update chart
   * Create a chart, it it does not exist or update an existing chart.
   * @param createChart  (optional)
   * @return Chart
   */
  @RequestLine("PUT /v1/charts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Chart createOrUpdateChart(CreateChart createChart);

  /**
   * Create or update chart
   * Similar to <code>createOrUpdateChart</code> but it also returns the http response headers .
   * Create a chart, it it does not exist or update an existing chart.
   * @param createChart  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/charts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Chart> createOrUpdateChartWithHttpInfo(CreateChart createChart);



  /**
   * Delete a chart by Id
   * Delete a chart by &#x60;Id&#x60;.
   * @param id Id of the chart (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/charts/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteChart(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a chart by Id
   * Similar to <code>deleteChart</code> but it also returns the http response headers .
   * Delete a chart by &#x60;Id&#x60;.
   * @param id Id of the chart (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/charts/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteChartWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a chart by Id
   * Delete a chart by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deleteChart</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteChartQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the chart (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/charts/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteChart(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a chart by Id
  * Delete a chart by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deleteChart</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the chart (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/charts/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteChartWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteChart</code> method in a fluent style.
   */
  public static class DeleteChartQueryParams extends HashMap<String, Object> {
    public DeleteChartQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a chart by fully qualified name
   * Delete a chart by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the chart (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/charts/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteChartByFQN(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a chart by fully qualified name
   * Similar to <code>deleteChartByFQN</code> but it also returns the http response headers .
   * Delete a chart by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the chart (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/charts/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteChartByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a chart by fully qualified name
   * Delete a chart by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteChartByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteChartByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the chart (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/charts/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteChartByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a chart by fully qualified name
  * Delete a chart by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteChartByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the chart (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/charts/name/{fqn}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteChartByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteChartByFQN</code> method in a fluent style.
   */
  public static class DeleteChartByFQNQueryParams extends HashMap<String, Object> {
    public DeleteChartByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Remove a follower
   * Remove the user identified &#x60;userId&#x60; as a follower of the chart.
   * @param id Id of the chart (required)
   * @param userId Id of the user being removed as follower (required)
   */
  @RequestLine("DELETE /v1/charts/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  void deleteFollowerFromChart(@Param("id") UUID id, @Param("userId") UUID userId);

  /**
   * Remove a follower
   * Similar to <code>deleteFollowerFromChart</code> but it also returns the http response headers .
   * Remove the user identified &#x60;userId&#x60; as a follower of the chart.
   * @param id Id of the chart (required)
   * @param userId Id of the user being removed as follower (required)
   */
  @RequestLine("DELETE /v1/charts/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteFollowerFromChartWithHttpInfo(@Param("id") UUID id, @Param("userId") UUID userId);



  /**
   * Get a chart by fully qualified name
   * Get a chart by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the chart (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Chart
   */
  @RequestLine("GET /v1/charts/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Chart getChartByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a chart by fully qualified name
   * Similar to <code>getChartByFQN</code> but it also returns the http response headers .
   * Get a chart by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the chart (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/charts/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Chart> getChartByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a chart by fully qualified name
   * Get a chart by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getChartByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetChartByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the chart (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Chart
   */
  @RequestLine("GET /v1/charts/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Chart getChartByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a chart by fully qualified name
  * Get a chart by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getChartByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the chart (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Chart
      */
      @RequestLine("GET /v1/charts/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Chart> getChartByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getChartByFQN</code> method in a fluent style.
   */
  public static class GetChartByFQNQueryParams extends HashMap<String, Object> {
    public GetChartByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetChartByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a chart by Id
   * Get a chart by &#x60;Id&#x60;.
   * @param id Id of the chart (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Chart
   */
  @RequestLine("GET /v1/charts/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Chart getChartByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a chart by Id
   * Similar to <code>getChartByID</code> but it also returns the http response headers .
   * Get a chart by &#x60;Id&#x60;.
   * @param id Id of the chart (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/charts/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Chart> getChartByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a chart by Id
   * Get a chart by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getChartByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetChartByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the chart (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Chart
   */
  @RequestLine("GET /v1/charts/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Chart getChartByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a chart by Id
  * Get a chart by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getChartByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the chart (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Chart
      */
      @RequestLine("GET /v1/charts/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Chart> getChartByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getChartByID</code> method in a fluent style.
   */
  public static class GetChartByIDQueryParams extends HashMap<String, Object> {
    public GetChartByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetChartByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the chart
   * Get a version of the chart by given &#x60;Id&#x60;
   * @param id Id of the chart (required)
   * @param version Chart version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Chart
   */
  @RequestLine("GET /v1/charts/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Chart getSpecificChartVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the chart
   * Similar to <code>getSpecificChartVersion</code> but it also returns the http response headers .
   * Get a version of the chart by given &#x60;Id&#x60;
   * @param id Id of the chart (required)
   * @param version Chart version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/charts/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Chart> getSpecificChartVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List chart versions
   * Get a list of all the versions of a chart identified by &#x60;id&#x60;
   * @param id Id of the chart (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/charts/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllChartVersions(@Param("id") UUID id);

  /**
   * List chart versions
   * Similar to <code>listAllChartVersions</code> but it also returns the http response headers .
   * Get a list of all the versions of a chart identified by &#x60;id&#x60;
   * @param id Id of the chart (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/charts/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllChartVersionsWithHttpInfo(@Param("id") UUID id);



  /**
   * List charts
   * Get a list of charts, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter charts by service name (optional)
   * @param limit Limit the number charts returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of charts before this cursor (optional)
   * @param after Returns list of charts after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return ChartList
   */
  @RequestLine("GET /v1/charts?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ChartList listCharts(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List charts
   * Similar to <code>listCharts</code> but it also returns the http response headers .
   * Get a list of charts, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter charts by service name (optional)
   * @param limit Limit the number charts returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of charts before this cursor (optional)
   * @param after Returns list of charts after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/charts?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ChartList> listChartsWithHttpInfo(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List charts
   * Get a list of charts, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listCharts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListChartsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>service - Filter charts by service name (optional)</li>
   *   <li>limit - Limit the number charts returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of charts before this cursor (optional)</li>
   *   <li>after - Returns list of charts after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return ChartList
   */
  @RequestLine("GET /v1/charts?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  ChartList listCharts(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List charts
  * Get a list of charts, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listCharts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>service - Filter charts by service name (optional)</li>
          *   <li>limit - Limit the number charts returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of charts before this cursor (optional)</li>
          *   <li>after - Returns list of charts after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return ChartList
      */
      @RequestLine("GET /v1/charts?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ChartList> listChartsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listCharts</code> method in a fluent style.
   */
  public static class ListChartsQueryParams extends HashMap<String, Object> {
    public ListChartsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListChartsQueryParams service(final String value) {
      put("service", EncodingUtils.encode(value));
      return this;
    }
    public ListChartsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListChartsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListChartsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListChartsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a chart
   * Update an existing chart using JsonPatch.
   * @param id Id of the chart (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a chart Documentation</a>
   */
  @RequestLine("PATCH /v1/charts/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchChart(@Param("id") UUID id, Object body);

  /**
   * Update a chart
   * Similar to <code>patchChart</code> but it also returns the http response headers .
   * Update an existing chart using JsonPatch.
   * @param id Id of the chart (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a chart Documentation</a>
   */
  @RequestLine("PATCH /v1/charts/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchChartWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted chart
   * Restore a soft deleted chart.
   * @param restoreEntity  (optional)
   * @return Chart
   */
  @RequestLine("PUT /v1/charts/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Chart restore3(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted chart
   * Similar to <code>restore3</code> but it also returns the http response headers .
   * Restore a soft deleted chart.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/charts/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Chart> restore3WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/charts/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/charts/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntityWithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
