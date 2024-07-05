package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.Metrics;
import org.openmetadata.client.model.MetricsList;
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
 * API tests for MetricsBetaApi
 */
class MetricsBetaApiTest {

    private MetricsBetaApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(MetricsBetaApi.class);
    }

    
    /**
     * Create a metric
     *
     * Create a new metric.
     */
    @Test
    void createMetricTest() {
        Metrics metrics = null;
        // Metrics response = api.createMetric(metrics);

        // TODO: test validations
    }

    
    /**
     * Create or update a metric
     *
     * Create a new metric, if it does not exist or update an existing metric.
     */
    @Test
    void createOrUpdateMetricTest() {
        Metrics metrics = null;
        // Metrics response = api.createOrUpdateMetric(metrics);

        // TODO: test validations
    }

    
    /**
     * Get a metric by Id
     *
     * Get a metric by &#x60;Id&#x60;.
     */
    @Test
    void getMetricByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Metrics response = api.getMetricByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a metric by Id
     *
     * Get a metric by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getMetricByIDTestQueryMap() {
        UUID id = null;
        MetricsBetaApi.GetMetricByIDQueryParams queryParams = new MetricsBetaApi.GetMetricByIDQueryParams()
            .fields(null)
            .include(null);
        // Metrics response = api.getMetricByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * List metrics
     *
     * Get a list of metrics. Use &#x60;fields&#x60; parameter to get only necessary fields.
     */
    @Test
    void listMetricsTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        // MetricsList response = api.listMetrics(fields, limit, before, after);

        // TODO: test validations
    }

    /**
     * List metrics
     *
     * Get a list of metrics. Use &#x60;fields&#x60; parameter to get only necessary fields.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listMetricsTestQueryMap() {
        MetricsBetaApi.ListMetricsQueryParams queryParams = new MetricsBetaApi.ListMetricsQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null);
        // MetricsList response = api.listMetrics(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity13Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity13(id, voteRequest);

        // TODO: test validations
    }

    
}
