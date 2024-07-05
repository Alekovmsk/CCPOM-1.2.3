package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.Chart;
import org.openmetadata.client.model.ChartList;
import org.openmetadata.client.model.CreateChart;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
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
 * API tests for ChartsApi
 */
class ChartsApiTest {

    private ChartsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(ChartsApi.class);
    }

    
    /**
     * Add a follower
     *
     * Add a user identified by &#x60;userId&#x60; as followed of this chart
     */
    @Test
    void addFollowerToChartTest() {
        UUID id = null;
        UUID body = null;
        // api.addFollowerToChart(id, body);

        // TODO: test validations
    }

    
    /**
     * Create a chart
     *
     * Create a chart under an existing &#x60;service&#x60;.
     */
    @Test
    void createChartTest() {
        CreateChart createChart = null;
        // Chart response = api.createChart(createChart);

        // TODO: test validations
    }

    
    /**
     * Create or update chart
     *
     * Create a chart, it it does not exist or update an existing chart.
     */
    @Test
    void createOrUpdateChartTest() {
        CreateChart createChart = null;
        // Chart response = api.createOrUpdateChart(createChart);

        // TODO: test validations
    }

    
    /**
     * Delete a chart by Id
     *
     * Delete a chart by &#x60;Id&#x60;.
     */
    @Test
    void deleteChartTest() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.deleteChart(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a chart by Id
     *
     * Delete a chart by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteChartTestQueryMap() {
        UUID id = null;
        ChartsApi.DeleteChartQueryParams queryParams = new ChartsApi.DeleteChartQueryParams()
            .hardDelete(null);
        // api.deleteChart(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a chart by fully qualified name
     *
     * Delete a chart by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteChartByFQNTest() {
        String fqn = null;
        Boolean hardDelete = null;
        // api.deleteChartByFQN(fqn, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a chart by fully qualified name
     *
     * Delete a chart by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteChartByFQNTestQueryMap() {
        String fqn = null;
        ChartsApi.DeleteChartByFQNQueryParams queryParams = new ChartsApi.DeleteChartByFQNQueryParams()
            .hardDelete(null);
        // api.deleteChartByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Remove a follower
     *
     * Remove the user identified &#x60;userId&#x60; as a follower of the chart.
     */
    @Test
    void deleteFollowerFromChartTest() {
        UUID id = null;
        UUID userId = null;
        // api.deleteFollowerFromChart(id, userId);

        // TODO: test validations
    }

    
    /**
     * Get a chart by fully qualified name
     *
     * Get a chart by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getChartByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // Chart response = api.getChartByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a chart by fully qualified name
     *
     * Get a chart by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getChartByFQNTestQueryMap() {
        String fqn = null;
        ChartsApi.GetChartByFQNQueryParams queryParams = new ChartsApi.GetChartByFQNQueryParams()
            .fields(null)
            .include(null);
        // Chart response = api.getChartByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a chart by Id
     *
     * Get a chart by &#x60;Id&#x60;.
     */
    @Test
    void getChartByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Chart response = api.getChartByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a chart by Id
     *
     * Get a chart by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getChartByIDTestQueryMap() {
        UUID id = null;
        ChartsApi.GetChartByIDQueryParams queryParams = new ChartsApi.GetChartByIDQueryParams()
            .fields(null)
            .include(null);
        // Chart response = api.getChartByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the chart
     *
     * Get a version of the chart by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificChartVersionTest() {
        UUID id = null;
        String version = null;
        // Chart response = api.getSpecificChartVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List chart versions
     *
     * Get a list of all the versions of a chart identified by &#x60;id&#x60;
     */
    @Test
    void listAllChartVersionsTest() {
        UUID id = null;
        // EntityHistory response = api.listAllChartVersions(id);

        // TODO: test validations
    }

    
    /**
     * List charts
     *
     * Get a list of charts, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listChartsTest() {
        String fields = null;
        String service = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // ChartList response = api.listCharts(fields, service, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List charts
     *
     * Get a list of charts, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listChartsTestQueryMap() {
        ChartsApi.ListChartsQueryParams queryParams = new ChartsApi.ListChartsQueryParams()
            .fields(null)
            .service(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // ChartList response = api.listCharts(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a chart
     *
     * Update an existing chart using JsonPatch.
     */
    @Test
    void patchChartTest() {
        UUID id = null;
        Object body = null;
        // api.patchChart(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted chart
     *
     * Restore a soft deleted chart.
     */
    @Test
    void restore3Test() {
        RestoreEntity restoreEntity = null;
        // Chart response = api.restore3(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntityTest() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity(id, voteRequest);

        // TODO: test validations
    }

    
}
