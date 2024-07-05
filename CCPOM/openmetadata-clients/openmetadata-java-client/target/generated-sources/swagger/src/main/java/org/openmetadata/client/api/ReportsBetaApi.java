package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.Report;
import org.openmetadata.client.model.ReportList;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface ReportsBetaApi extends ApiClient.Api {


  /**
   * Create or update a report
   * Create a new report, it it does not exist or update an existing report.
   * @param report  (optional)
   * @return Report
   */
  @RequestLine("PUT /v1/reports")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Report createOrUpdateReport(Report report);

  /**
   * Create or update a report
   * Similar to <code>createOrUpdateReport</code> but it also returns the http response headers .
   * Create a new report, it it does not exist or update an existing report.
   * @param report  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/reports")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Report> createOrUpdateReportWithHttpInfo(Report report);



  /**
   * Create a report
   * Create a new report.
   * @param report  (optional)
   * @return Report
   */
  @RequestLine("POST /v1/reports")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Report getReportByFQN(Report report);

  /**
   * Create a report
   * Similar to <code>getReportByFQN</code> but it also returns the http response headers .
   * Create a new report.
   * @param report  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/reports")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Report> getReportByFQNWithHttpInfo(Report report);



  /**
   * Get a report by Id
   * Get a report by &#x60;Id&#x60;.
   * @param id Id of the report (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Report
   */
  @RequestLine("GET /v1/reports/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Report getReportByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a report by Id
   * Similar to <code>getReportByID</code> but it also returns the http response headers .
   * Get a report by &#x60;Id&#x60;.
   * @param id Id of the report (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/reports/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Report> getReportByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a report by Id
   * Get a report by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getReportByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetReportByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the report (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Report
   */
  @RequestLine("GET /v1/reports/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Report getReportByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a report by Id
  * Get a report by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getReportByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the report (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Report
      */
      @RequestLine("GET /v1/reports/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Report> getReportByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getReportByID</code> method in a fluent style.
   */
  public static class GetReportByIDQueryParams extends HashMap<String, Object> {
    public GetReportByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetReportByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List reports
   * Get a list of reports. Use &#x60;fields&#x60; parameter to get only necessary fields.
   * @param fields Fields requested in the returned resource (optional)
   * @return ReportList
   */
  @RequestLine("GET /v1/reports?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ReportList listReports(@Param("fields") String fields);

  /**
   * List reports
   * Similar to <code>listReports</code> but it also returns the http response headers .
   * Get a list of reports. Use &#x60;fields&#x60; parameter to get only necessary fields.
   * @param fields Fields requested in the returned resource (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/reports?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ReportList> listReportsWithHttpInfo(@Param("fields") String fields);


  /**
   * List reports
   * Get a list of reports. Use &#x60;fields&#x60; parameter to get only necessary fields.
   * Note, this is equivalent to the other <code>listReports</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListReportsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   </ul>
   * @return ReportList
   */
  @RequestLine("GET /v1/reports?fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  ReportList listReports(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List reports
  * Get a list of reports. Use &#x60;fields&#x60; parameter to get only necessary fields.
  * Note, this is equivalent to the other <code>listReports</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
      *   </ul>
          * @return ReportList
      */
      @RequestLine("GET /v1/reports?fields={fields}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ReportList> listReportsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listReports</code> method in a fluent style.
   */
  public static class ListReportsQueryParams extends HashMap<String, Object> {
    public ListReportsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
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
  @RequestLine("PUT /v1/reports/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity17(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity17</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/reports/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity17WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
