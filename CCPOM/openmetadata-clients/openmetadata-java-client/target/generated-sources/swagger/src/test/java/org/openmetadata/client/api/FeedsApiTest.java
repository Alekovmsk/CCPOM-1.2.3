package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CloseTask;
import org.openmetadata.client.model.CreatePost;
import org.openmetadata.client.model.CreateThread;
import org.openmetadata.client.model.PostList;
import org.openmetadata.client.model.ResolveTask;
import org.openmetadata.client.model.Thread;
import org.openmetadata.client.model.ThreadCount;
import org.openmetadata.client.model.ThreadList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeedsApi
 */
class FeedsApiTest {

    private FeedsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(FeedsApi.class);
    }

    
    /**
     * Add post to a thread
     *
     * Add a post to an existing thread.
     */
    @Test
    void addPostToThreadTest() {
        String id = null;
        CreatePost createPost = null;
        // Thread response = api.addPostToThread(id, createPost);

        // TODO: test validations
    }

    
    /**
     * Close a task
     *
     * Close a task without making any changes to the entity.
     */
    @Test
    void closeTaskTest() {
        String id = null;
        CloseTask closeTask = null;
        // Thread response = api.closeTask(id, closeTask);

        // TODO: test validations
    }

    
    /**
     * Count of threads
     *
     * Get a count of threads, optionally filtered by &#x60;entityLink&#x60; for each of the entities.
     */
    @Test
    void countThreadsTest() {
        String entityLink = null;
        String type = null;
        String taskStatus = null;
        Boolean isResolved = null;
        // ThreadCount response = api.countThreads(entityLink, type, taskStatus, isResolved);

        // TODO: test validations
    }

    /**
     * Count of threads
     *
     * Get a count of threads, optionally filtered by &#x60;entityLink&#x60; for each of the entities.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void countThreadsTestQueryMap() {
        FeedsApi.CountThreadsQueryParams queryParams = new FeedsApi.CountThreadsQueryParams()
            .entityLink(null)
            .type(null)
            .taskStatus(null)
            .isResolved(null);
        // ThreadCount response = api.countThreads(queryParams);

    // TODO: test validations
    }
    
    /**
     * Create a thread
     *
     * Create a new thread. A thread is created about a data asset when a user posts the first post.
     */
    @Test
    void createThreadTest() {
        CreateThread createThread = null;
        // Thread response = api.createThread(createThread);

        // TODO: test validations
    }

    
    /**
     * Delete a post from its thread
     *
     * Delete a post from an existing thread.
     */
    @Test
    void deletePostFromThreadTest() {
        String threadId = null;
        String postId = null;
        // api.deletePostFromThread(threadId, postId);

        // TODO: test validations
    }

    
    /**
     * Delete a thread by Id
     *
     * Delete an existing thread and all its relationships.
     */
    @Test
    void deleteThreadTest() {
        String threadId = null;
        // api.deleteThread(threadId);

        // TODO: test validations
    }

    
    /**
     * Get all the posts of a thread
     *
     * Get all the posts of an existing thread.
     */
    @Test
    void getAllPostOfThreadTest() {
        String id = null;
        // PostList response = api.getAllPostOfThread(id);

        // TODO: test validations
    }

    
    /**
     * Get a task thread by task Id
     *
     * Get a task thread by &#x60;task Id&#x60;.
     */
    @Test
    void getTaskByIDTest() {
        String id = null;
        // Thread response = api.getTaskByID(id);

        // TODO: test validations
    }

    
    /**
     * Get a thread by Id
     *
     * Get a thread by &#x60;Id&#x60;.
     */
    @Test
    void getThreadByIDTest() {
        String id = null;
        String entityType = null;
        // Thread response = api.getThreadByID(id, entityType);

        // TODO: test validations
    }

    
    /**
     * List threads
     *
     * Get a list of threads, optionally filtered by &#x60;entityLink&#x60;.
     */
    @Test
    void listThreadsTest() {
        Long limitPosts = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String entityLink = null;
        String userId = null;
        String filterType = null;
        Boolean resolved = null;
        String type = null;
        String taskStatus = null;
        Boolean activeAnnouncement = null;
        // ThreadList response = api.listThreads(limitPosts, limit, before, after, entityLink, userId, filterType, resolved, type, taskStatus, activeAnnouncement);

        // TODO: test validations
    }

    /**
     * List threads
     *
     * Get a list of threads, optionally filtered by &#x60;entityLink&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listThreadsTestQueryMap() {
        FeedsApi.ListThreadsQueryParams queryParams = new FeedsApi.ListThreadsQueryParams()
            .limitPosts(null)
            .limit(null)
            .before(null)
            .after(null)
            .entityLink(null)
            .userId(null)
            .filterType(null)
            .resolved(null)
            .type(null)
            .taskStatus(null)
            .activeAnnouncement(null);
        // ThreadList response = api.listThreads(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update post of a thread by &#x60;Id&#x60;.
     *
     * Update a post of an existing thread using JsonPatch.
     */
    @Test
    void patchPostOfThreadTest() {
        String threadId = null;
        String postId = null;
        Object body = null;
        // api.patchPostOfThread(threadId, postId, body);

        // TODO: test validations
    }

    
    /**
     * Update a thread by &#x60;Id&#x60;.
     *
     * Update an existing thread using JsonPatch.
     */
    @Test
    void patchThreadTest() {
        String id = null;
        Object body = null;
        // api.patchThread(id, body);

        // TODO: test validations
    }

    
    /**
     * Resolve a task
     *
     * Resolve a task.
     */
    @Test
    void resolveTaskTest() {
        String id = null;
        ResolveTask resolveTask = null;
        // Thread response = api.resolveTask(id, resolveTask);

        // TODO: test validations
    }

    
}
