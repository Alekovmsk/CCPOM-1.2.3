package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.AddLineage;
import org.openmetadata.client.model.EntityLineage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LineageApi
 */
class LineageApiTest {

    private LineageApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(LineageApi.class);
    }

    
    /**
     * Add a lineage edge
     *
     * Add a lineage edge with from entity as upstream node and to entity as downstream node.
     */
    @Test
    void addLineageEdgeTest() {
        AddLineage addLineage = null;
        // api.addLineageEdge(addLineage);

        // TODO: test validations
    }

    
    /**
     * Delete a lineage edge
     *
     * Delete a lineage edge with from entity as upstream node and to entity as downstream node.
     */
    @Test
    void deleteLineageEdgeTest() {
        String fromEntity = null;
        String fromId = null;
        String toEntity = null;
        String toId = null;
        // api.deleteLineageEdge(fromEntity, fromId, toEntity, toId);

        // TODO: test validations
    }

    
    /**
     * Get lineage by Id
     *
     * Get lineage details for an entity identified by &#x60;Id&#x60;.
     */
    @Test
    void getLineageTest() {
        String entity = null;
        String id = null;
        Integer upstreamDepth = null;
        Integer downstreamDepth = null;
        // EntityLineage response = api.getLineage(entity, id, upstreamDepth, downstreamDepth);

        // TODO: test validations
    }

    /**
     * Get lineage by Id
     *
     * Get lineage details for an entity identified by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getLineageTestQueryMap() {
        String entity = null;
        String id = null;
        LineageApi.GetLineageQueryParams queryParams = new LineageApi.GetLineageQueryParams()
            .upstreamDepth(null)
            .downstreamDepth(null);
        // EntityLineage response = api.getLineage(entity, id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get lineage by fully qualified name
     *
     * Get lineage details for an entity identified by fully qualified name.
     */
    @Test
    void getLineageByFQNTest() {
        String entity = null;
        String fqn = null;
        Integer upstreamDepth = null;
        Integer downstreamDepth = null;
        // EntityLineage response = api.getLineageByFQN(entity, fqn, upstreamDepth, downstreamDepth);

        // TODO: test validations
    }

    /**
     * Get lineage by fully qualified name
     *
     * Get lineage details for an entity identified by fully qualified name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getLineageByFQNTestQueryMap() {
        String entity = null;
        String fqn = null;
        LineageApi.GetLineageByFQNQueryParams queryParams = new LineageApi.GetLineageByFQNQueryParams()
            .upstreamDepth(null)
            .downstreamDepth(null);
        // EntityLineage response = api.getLineageByFQN(entity, fqn, queryParams);

    // TODO: test validations
    }
    
}
