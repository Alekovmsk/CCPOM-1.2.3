package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateTopic;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Topic;
import org.openmetadata.client.model.TopicList;
import org.openmetadata.client.model.TopicSampleData;
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
 * API tests for TopicsApi
 */
class TopicsApiTest {

    private TopicsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(TopicsApi.class);
    }

    
    /**
     * Add a follower
     *
     * Add a user identified by &#x60;userId&#x60; as followed of this topic
     */
    @Test
    void addFollower6Test() {
        UUID id = null;
        UUID body = null;
        // ChangeEvent response = api.addFollower6(id, body);

        // TODO: test validations
    }

    
    /**
     * Add sample data
     *
     * Add sample data to the topic.
     */
    @Test
    void addSampleData2Test() {
        UUID id = null;
        TopicSampleData topicSampleData = null;
        // Topic response = api.addSampleData2(id, topicSampleData);

        // TODO: test validations
    }

    
    /**
     * Update topic
     *
     * Create a topic, it it does not exist or update an existing topic.
     */
    @Test
    void createOrUpdateTopicTest() {
        CreateTopic createTopic = null;
        // Topic response = api.createOrUpdateTopic(createTopic);

        // TODO: test validations
    }

    
    /**
     * Create a topic
     *
     * Create a topic under an existing &#x60;service&#x60;.
     */
    @Test
    void createTopicTest() {
        CreateTopic createTopic = null;
        // Topic response = api.createTopic(createTopic);

        // TODO: test validations
    }

    
    /**
     * Remove a follower
     *
     * Remove the user identified &#x60;userId&#x60; as a follower of the topic.
     */
    @Test
    void deleteFollower7Test() {
        UUID id = null;
        String userId = null;
        // ChangeEvent response = api.deleteFollower7(id, userId);

        // TODO: test validations
    }

    
    /**
     * Delete a topic by id
     *
     * Delete a topic by &#x60;id&#x60;.
     */
    @Test
    void deleteTopicTest() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.deleteTopic(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a topic by id
     *
     * Delete a topic by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTopicTestQueryMap() {
        UUID id = null;
        TopicsApi.DeleteTopicQueryParams queryParams = new TopicsApi.DeleteTopicQueryParams()
            .hardDelete(null);
        // api.deleteTopic(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a topic by fully qualified name
     *
     * Delete a topic by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteTopicByFQNTest() {
        String fqn = null;
        Boolean hardDelete = null;
        // api.deleteTopicByFQN(fqn, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a topic by fully qualified name
     *
     * Delete a topic by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTopicByFQNTestQueryMap() {
        String fqn = null;
        TopicsApi.DeleteTopicByFQNQueryParams queryParams = new TopicsApi.DeleteTopicByFQNQueryParams()
            .hardDelete(null);
        // api.deleteTopicByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a topic by id
     *
     * Get a topic by &#x60;id&#x60;.
     */
    @Test
    void get7Test() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Topic response = api.get7(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a topic by id
     *
     * Get a topic by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void get7TestQueryMap() {
        UUID id = null;
        TopicsApi.Get7QueryParams queryParams = new TopicsApi.Get7QueryParams()
            .fields(null)
            .include(null);
        // Topic response = api.get7(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get sample data
     *
     * Get sample data from the topic.
     */
    @Test
    void getSampleData2Test() {
        UUID id = null;
        // Topic response = api.getSampleData2(id);

        // TODO: test validations
    }

    
    /**
     * Get a version of the topic
     *
     * Get a version of the topic by given &#x60;id&#x60;
     */
    @Test
    void getSpecificTopicVersionTest() {
        UUID id = null;
        String version = null;
        // Topic response = api.getSpecificTopicVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a topic by fully qualified name
     *
     * Get a topic by fully qualified name.
     */
    @Test
    void getTopicByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // Topic response = api.getTopicByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a topic by fully qualified name
     *
     * Get a topic by fully qualified name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTopicByFQNTestQueryMap() {
        String fqn = null;
        TopicsApi.GetTopicByFQNQueryParams queryParams = new TopicsApi.GetTopicByFQNQueryParams()
            .fields(null)
            .include(null);
        // Topic response = api.getTopicByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * List topic versions
     *
     * Get a list of all the versions of a topic identified by &#x60;id&#x60;
     */
    @Test
    void listAllTopicVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllTopicVersion(id);

        // TODO: test validations
    }

    
    /**
     * List topics
     *
     * Get a list of topics, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listTopicsTest() {
        String fields = null;
        String service = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // TopicList response = api.listTopics(fields, service, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List topics
     *
     * Get a list of topics, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listTopicsTestQueryMap() {
        TopicsApi.ListTopicsQueryParams queryParams = new TopicsApi.ListTopicsQueryParams()
            .fields(null)
            .service(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // TopicList response = api.listTopics(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a topic
     *
     * Update an existing topic using JsonPatch.
     */
    @Test
    void patchTopicTest() {
        UUID id = null;
        Object body = null;
        // api.patchTopic(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted topic
     *
     * Restore a soft deleted topic.
     */
    @Test
    void restore36Test() {
        RestoreEntity restoreEntity = null;
        // Topic response = api.restore36(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity20Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity20(id, voteRequest);

        // TODO: test validations
    }

    
}
