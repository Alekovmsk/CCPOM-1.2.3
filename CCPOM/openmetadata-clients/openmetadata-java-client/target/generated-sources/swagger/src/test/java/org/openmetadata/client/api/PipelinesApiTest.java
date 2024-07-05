package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PipelinesApi
 */
class PipelinesApiTest {

    private PipelinesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PipelinesApi.class);
    }

    
    /**
     * Add a follower
     *
     * Add a user identified by &#x60;userId&#x60; as follower of this pipeline
     */
    @Test
    void addFollower2Test() {
        UUID id = null;
        String body = null;
        // ChangeEvent response = api.addFollower2(id, body);

        // TODO: test validations
    }

    
    /**
     * Add status data
     *
     * Add status data to the pipeline.
     */
    @Test
    void addStatusDataTest() {
        String fqn = null;
        PipelineStatus pipelineStatus = null;
        // Pipeline response = api.addStatusData(fqn, pipelineStatus);

        // TODO: test validations
    }

    
    /**
     * Create or update a pipeline
     *
     * Create a new pipeline, if it does not exist or update an existing pipeline.
     */
    @Test
    void createOrUpdatePipelineTest() {
        CreatePipeline createPipeline = null;
        // Pipeline response = api.createOrUpdatePipeline(createPipeline);

        // TODO: test validations
    }

    
    /**
     * Create a pipeline
     *
     * Create a new pipeline.
     */
    @Test
    void createPipelineTest() {
        CreatePipeline createPipeline = null;
        // Pipeline response = api.createPipeline(createPipeline);

        // TODO: test validations
    }

    
    /**
     * Remove a follower
     *
     * Remove the user identified &#x60;userId&#x60; as a follower of the pipeline.
     */
    @Test
    void deleteFollower3Test() {
        UUID id = null;
        UUID userId = null;
        // ChangeEvent response = api.deleteFollower3(id, userId);

        // TODO: test validations
    }

    
    /**
     * Delete a pipeline by Id
     *
     * Delete a pipeline by &#x60;Id&#x60;.
     */
    @Test
    void deletePipelineTest() {
        UUID id = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deletePipeline(id, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a pipeline by Id
     *
     * Delete a pipeline by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deletePipelineTestQueryMap() {
        UUID id = null;
        PipelinesApi.DeletePipelineQueryParams queryParams = new PipelinesApi.DeletePipelineQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deletePipeline(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a pipeline by fully qualified name
     *
     * Delete a pipeline by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deletePipelineByFQNTest() {
        String fqn = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deletePipelineByFQN(fqn, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a pipeline by fully qualified name
     *
     * Delete a pipeline by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deletePipelineByFQNTestQueryMap() {
        String fqn = null;
        PipelinesApi.DeletePipelineByFQNQueryParams queryParams = new PipelinesApi.DeletePipelineByFQNQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deletePipelineByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete pipeline status
     *
     * Delete pipeline status for a pipeline.
     */
    @Test
    void deletePipelineStatusTest() {
        String fqn = null;
        Long timestamp = null;
        // Pipeline response = api.deletePipelineStatus(fqn, timestamp);

        // TODO: test validations
    }

    
    /**
     * Get a pipeline by fully qualified name
     *
     * Get a pipeline by fully qualified name.
     */
    @Test
    void getPipelineByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // Pipeline response = api.getPipelineByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a pipeline by fully qualified name
     *
     * Get a pipeline by fully qualified name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getPipelineByFQNTestQueryMap() {
        String fqn = null;
        PipelinesApi.GetPipelineByFQNQueryParams queryParams = new PipelinesApi.GetPipelineByFQNQueryParams()
            .fields(null)
            .include(null);
        // Pipeline response = api.getPipelineByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a pipeline by Id
     *
     * Get a pipeline by &#x60;Id&#x60;.
     */
    @Test
    void getPipelineWithIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Pipeline response = api.getPipelineWithID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a pipeline by Id
     *
     * Get a pipeline by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getPipelineWithIDTestQueryMap() {
        UUID id = null;
        PipelinesApi.GetPipelineWithIDQueryParams queryParams = new PipelinesApi.GetPipelineWithIDQueryParams()
            .fields(null)
            .include(null);
        // Pipeline response = api.getPipelineWithID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the pipeline
     *
     * Get a version of the pipeline by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificPipelineVersionTest() {
        UUID id = null;
        String version = null;
        // Pipeline response = api.getSpecificPipelineVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List pipeline versions
     *
     * Get a list of all the versions of a pipeline identified by &#x60;Id&#x60;
     */
    @Test
    void listAllPipelineVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllPipelineVersion(id);

        // TODO: test validations
    }

    
    /**
     * List pipeline status
     *
     * Get a list of pipeline status.parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listPipelineStatusesTest() {
        String fqn = null;
        BigDecimal startTs = null;
        BigDecimal endTs = null;
        // TestCaseList response = api.listPipelineStatuses(fqn, startTs, endTs);

        // TODO: test validations
    }

    /**
     * List pipeline status
     *
     * Get a list of pipeline status.parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listPipelineStatusesTestQueryMap() {
        String fqn = null;
        PipelinesApi.ListPipelineStatusesQueryParams queryParams = new PipelinesApi.ListPipelineStatusesQueryParams()
            .startTs(null)
            .endTs(null);
        // TestCaseList response = api.listPipelineStatuses(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * List pipelines
     *
     * Get a list of pipelines, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listPipelinesTest() {
        String fields = null;
        String service = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // PipelineList response = api.listPipelines(fields, service, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List pipelines
     *
     * Get a list of pipelines, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listPipelinesTestQueryMap() {
        PipelinesApi.ListPipelinesQueryParams queryParams = new PipelinesApi.ListPipelinesQueryParams()
            .fields(null)
            .service(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // PipelineList response = api.listPipelines(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a pipeline
     *
     * Update an existing pipeline using JsonPatch.
     */
    @Test
    void patchPipelineTest() {
        UUID id = null;
        Object body = null;
        // api.patchPipeline(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted pipeline
     *
     * Restore a soft deleted pipeline.
     */
    @Test
    void restore20Test() {
        RestoreEntity restoreEntity = null;
        // Pipeline response = api.restore20(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity15Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity15(id, voteRequest);

        // TODO: test validations
    }

    
}
