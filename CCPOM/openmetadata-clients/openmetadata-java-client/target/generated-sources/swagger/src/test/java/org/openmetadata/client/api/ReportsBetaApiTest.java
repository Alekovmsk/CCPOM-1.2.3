package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.Report;
import org.openmetadata.client.model.ReportList;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportsBetaApi
 */
class ReportsBetaApiTest {

    private ReportsBetaApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(ReportsBetaApi.class);
    }

    
    /**
     * Create or update a report
     *
     * Create a new report, it it does not exist or update an existing report.
     */
    @Test
    void createOrUpdateReportTest() {
        Report report = null;
        // Report response = api.createOrUpdateReport(report);

        // TODO: test validations
    }

    
    /**
     * Create a report
     *
     * Create a new report.
     */
    @Test
    void getReportByFQNTest() {
        Report report = null;
        // Report response = api.getReportByFQN(report);

        // TODO: test validations
    }

    
    /**
     * Get a report by Id
     *
     * Get a report by &#x60;Id&#x60;.
     */
    @Test
    void getReportByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Report response = api.getReportByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a report by Id
     *
     * Get a report by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getReportByIDTestQueryMap() {
        UUID id = null;
        ReportsBetaApi.GetReportByIDQueryParams queryParams = new ReportsBetaApi.GetReportByIDQueryParams()
            .fields(null)
            .include(null);
        // Report response = api.getReportByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * List reports
     *
     * Get a list of reports. Use &#x60;fields&#x60; parameter to get only necessary fields.
     */
    @Test
    void listReportsTest() {
        String fields = null;
        // ReportList response = api.listReports(fields);

        // TODO: test validations
    }

    /**
     * List reports
     *
     * Get a list of reports. Use &#x60;fields&#x60; parameter to get only necessary fields.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listReportsTestQueryMap() {
        ReportsBetaApi.ListReportsQueryParams queryParams = new ReportsBetaApi.ListReportsQueryParams()
            .fields(null);
        // ReportList response = api.listReports(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity17Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity17(id, voteRequest);

        // TODO: test validations
    }

    
}
