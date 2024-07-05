package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CloseTask;
import org.openmetadata.client.model.CreatePost;
import org.openmetadata.client.model.CreateThread;
import org.openmetadata.client.model.PostList;
import org.openmetadata.client.model.ResolveTask;
import org.openmetadata.client.model.Thread;
import org.openmetadata.client.model.ThreadCount;
import org.openmetadata.client.model.ThreadList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface FeedsApi extends ApiClient.Api {


  /**
   * Add post to a thread
   * Add a post to an existing thread.
   * @param id Id of the thread (required)
   * @param createPost  (optional)
   * @return Thread
   */
  @RequestLine("POST /v1/feed/{id}/posts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Thread addPostToThread(@Param("id") String id, CreatePost createPost);

  /**
   * Add post to a thread
   * Similar to <code>addPostToThread</code> but it also returns the http response headers .
   * Add a post to an existing thread.
   * @param id Id of the thread (required)
   * @param createPost  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/feed/{id}/posts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Thread> addPostToThreadWithHttpInfo(@Param("id") String id, CreatePost createPost);



  /**
   * Close a task
   * Close a task without making any changes to the entity.
   * @param id Id of the task thread (required)
   * @param closeTask  (optional)
   * @return Thread
   */
  @RequestLine("PUT /v1/feed/tasks/{id}/close")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Thread closeTask(@Param("id") String id, CloseTask closeTask);

  /**
   * Close a task
   * Similar to <code>closeTask</code> but it also returns the http response headers .
   * Close a task without making any changes to the entity.
   * @param id Id of the task thread (required)
   * @param closeTask  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/feed/tasks/{id}/close")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Thread> closeTaskWithHttpInfo(@Param("id") String id, CloseTask closeTask);



  /**
   * Count of threads
   * Get a count of threads, optionally filtered by &#x60;entityLink&#x60; for each of the entities.
   * @param entityLink Filter threads by entity link (optional)
   * @param type The type of thread to filter the results. It can take one of &#39;Conversation&#39;, &#39;Task&#39;, &#39;Announcement&#39; (optional)
   * @param taskStatus The status of tasks to filter the results. It can take one of &#39;Open&#39;, &#39;Closed&#39;. This filter will take effect only when type is set to Task (optional)
   * @param isResolved Filter threads by whether it is active or resolved (optional, default to false)
   * @return ThreadCount
   */
  @RequestLine("GET /v1/feed/count?entityLink={entityLink}&type={type}&taskStatus={taskStatus}&isResolved={isResolved}")
  @Headers({
    "Accept: application/json",
  })
  ThreadCount countThreads(@Param("entityLink") String entityLink, @Param("type") String type, @Param("taskStatus") String taskStatus, @Param("isResolved") Boolean isResolved);

  /**
   * Count of threads
   * Similar to <code>countThreads</code> but it also returns the http response headers .
   * Get a count of threads, optionally filtered by &#x60;entityLink&#x60; for each of the entities.
   * @param entityLink Filter threads by entity link (optional)
   * @param type The type of thread to filter the results. It can take one of &#39;Conversation&#39;, &#39;Task&#39;, &#39;Announcement&#39; (optional)
   * @param taskStatus The status of tasks to filter the results. It can take one of &#39;Open&#39;, &#39;Closed&#39;. This filter will take effect only when type is set to Task (optional)
   * @param isResolved Filter threads by whether it is active or resolved (optional, default to false)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/feed/count?entityLink={entityLink}&type={type}&taskStatus={taskStatus}&isResolved={isResolved}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ThreadCount> countThreadsWithHttpInfo(@Param("entityLink") String entityLink, @Param("type") String type, @Param("taskStatus") String taskStatus, @Param("isResolved") Boolean isResolved);


  /**
   * Count of threads
   * Get a count of threads, optionally filtered by &#x60;entityLink&#x60; for each of the entities.
   * Note, this is equivalent to the other <code>countThreads</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountThreadsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>entityLink - Filter threads by entity link (optional)</li>
   *   <li>type - The type of thread to filter the results. It can take one of &#39;Conversation&#39;, &#39;Task&#39;, &#39;Announcement&#39; (optional)</li>
   *   <li>taskStatus - The status of tasks to filter the results. It can take one of &#39;Open&#39;, &#39;Closed&#39;. This filter will take effect only when type is set to Task (optional)</li>
   *   <li>isResolved - Filter threads by whether it is active or resolved (optional, default to false)</li>
   *   </ul>
   * @return ThreadCount
   */
  @RequestLine("GET /v1/feed/count?entityLink={entityLink}&type={type}&taskStatus={taskStatus}&isResolved={isResolved}")
  @Headers({
  "Accept: application/json",
  })
  ThreadCount countThreads(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Count of threads
  * Get a count of threads, optionally filtered by &#x60;entityLink&#x60; for each of the entities.
  * Note, this is equivalent to the other <code>countThreads</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>entityLink - Filter threads by entity link (optional)</li>
          *   <li>type - The type of thread to filter the results. It can take one of &#39;Conversation&#39;, &#39;Task&#39;, &#39;Announcement&#39; (optional)</li>
          *   <li>taskStatus - The status of tasks to filter the results. It can take one of &#39;Open&#39;, &#39;Closed&#39;. This filter will take effect only when type is set to Task (optional)</li>
          *   <li>isResolved - Filter threads by whether it is active or resolved (optional, default to false)</li>
      *   </ul>
          * @return ThreadCount
      */
      @RequestLine("GET /v1/feed/count?entityLink={entityLink}&type={type}&taskStatus={taskStatus}&isResolved={isResolved}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ThreadCount> countThreadsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countThreads</code> method in a fluent style.
   */
  public static class CountThreadsQueryParams extends HashMap<String, Object> {
    public CountThreadsQueryParams entityLink(final String value) {
      put("entityLink", EncodingUtils.encode(value));
      return this;
    }
    public CountThreadsQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }
    public CountThreadsQueryParams taskStatus(final String value) {
      put("taskStatus", EncodingUtils.encode(value));
      return this;
    }
    public CountThreadsQueryParams isResolved(final Boolean value) {
      put("isResolved", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create a thread
   * Create a new thread. A thread is created about a data asset when a user posts the first post.
   * @param createThread  (optional)
   * @return Thread
   */
  @RequestLine("POST /v1/feed")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Thread createThread(CreateThread createThread);

  /**
   * Create a thread
   * Similar to <code>createThread</code> but it also returns the http response headers .
   * Create a new thread. A thread is created about a data asset when a user posts the first post.
   * @param createThread  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/feed")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Thread> createThreadWithHttpInfo(CreateThread createThread);



  /**
   * Delete a post from its thread
   * Delete a post from an existing thread.
   * @param threadId ThreadId of the post to be deleted (required)
   * @param postId PostId of the post to be deleted (required)
   */
  @RequestLine("DELETE /v1/feed/{threadId}/posts/{postId}")
  @Headers({
    "Accept: application/json",
  })
  void deletePostFromThread(@Param("threadId") String threadId, @Param("postId") String postId);

  /**
   * Delete a post from its thread
   * Similar to <code>deletePostFromThread</code> but it also returns the http response headers .
   * Delete a post from an existing thread.
   * @param threadId ThreadId of the post to be deleted (required)
   * @param postId PostId of the post to be deleted (required)
   */
  @RequestLine("DELETE /v1/feed/{threadId}/posts/{postId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePostFromThreadWithHttpInfo(@Param("threadId") String threadId, @Param("postId") String postId);



  /**
   * Delete a thread by Id
   * Delete an existing thread and all its relationships.
   * @param threadId ThreadId of the thread to be deleted (required)
   */
  @RequestLine("DELETE /v1/feed/{threadId}")
  @Headers({
    "Accept: application/json",
  })
  void deleteThread(@Param("threadId") String threadId);

  /**
   * Delete a thread by Id
   * Similar to <code>deleteThread</code> but it also returns the http response headers .
   * Delete an existing thread and all its relationships.
   * @param threadId ThreadId of the thread to be deleted (required)
   */
  @RequestLine("DELETE /v1/feed/{threadId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteThreadWithHttpInfo(@Param("threadId") String threadId);



  /**
   * Get all the posts of a thread
   * Get all the posts of an existing thread.
   * @param id Id of the thread (required)
   * @return PostList
   */
  @RequestLine("GET /v1/feed/{id}/posts")
  @Headers({
    "Accept: application/json",
  })
  PostList getAllPostOfThread(@Param("id") String id);

  /**
   * Get all the posts of a thread
   * Similar to <code>getAllPostOfThread</code> but it also returns the http response headers .
   * Get all the posts of an existing thread.
   * @param id Id of the thread (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/feed/{id}/posts")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PostList> getAllPostOfThreadWithHttpInfo(@Param("id") String id);



  /**
   * Get a task thread by task Id
   * Get a task thread by &#x60;task Id&#x60;.
   * @param id Id of the task thread (required)
   * @return Thread
   */
  @RequestLine("GET /v1/feed/tasks/{id}")
  @Headers({
    "Accept: application/json",
  })
  Thread getTaskByID(@Param("id") String id);

  /**
   * Get a task thread by task Id
   * Similar to <code>getTaskByID</code> but it also returns the http response headers .
   * Get a task thread by &#x60;task Id&#x60;.
   * @param id Id of the task thread (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/feed/tasks/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Thread> getTaskByIDWithHttpInfo(@Param("id") String id);



  /**
   * Get a thread by Id
   * Get a thread by &#x60;Id&#x60;.
   * @param id Id of the Thread (required)
   * @param entityType Type of the Entity (required)
   * @return Thread
   */
  @RequestLine("GET /v1/feed/{id}")
  @Headers({
    "Accept: application/json",
  })
  Thread getThreadByID(@Param("id") String id, @Param("entityType") String entityType);

  /**
   * Get a thread by Id
   * Similar to <code>getThreadByID</code> but it also returns the http response headers .
   * Get a thread by &#x60;Id&#x60;.
   * @param id Id of the Thread (required)
   * @param entityType Type of the Entity (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/feed/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Thread> getThreadByIDWithHttpInfo(@Param("id") String id, @Param("entityType") String entityType);



  /**
   * List threads
   * Get a list of threads, optionally filtered by &#x60;entityLink&#x60;.
   * @param limitPosts Limit the number of posts sorted by chronological order (1 to 1000000, default &#x3D; 3) (optional, default to 3)
   * @param limit Limit the number of threads returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of threads before this cursor (optional)
   * @param after Returns list of threads after this cursor (optional)
   * @param entityLink Filter threads by entity link of entity about which this thread is created (optional)
   * @param userId Filter threads by user id. This filter requires a &#39;filterType&#39; query param. The default filter type is &#39;OWNER&#39;. This filter cannot be combined with the entityLink filter. (optional)
   * @param filterType Filter type definition for the user filter. It can take one of &#39;OWNER&#39;, &#39;FOLLOWS&#39;, &#39;MENTIONS&#39;. This must be used with the &#39;user&#39; query param (optional)
   * @param resolved Filter threads by whether they are resolved or not. By default resolved is false (optional, default to false)
   * @param type The type of thread to filter the results. It can take one of &#39;Conversation&#39;, &#39;Task&#39;, &#39;Announcement&#39; (optional)
   * @param taskStatus The status of tasks to filter the results. It can take one of &#39;Open&#39;, &#39;Closed&#39;. This filter will take effect only when type is set to Task (optional)
   * @param activeAnnouncement Whether to filter results by announcements that are currently active. This filter will take effect only when type is set to Announcement (optional)
   * @return ThreadList
   */
  @RequestLine("GET /v1/feed?limitPosts={limitPosts}&limit={limit}&before={before}&after={after}&entityLink={entityLink}&userId={userId}&filterType={filterType}&resolved={resolved}&type={type}&taskStatus={taskStatus}&activeAnnouncement={activeAnnouncement}")
  @Headers({
    "Accept: application/json",
  })
  ThreadList listThreads(@Param("limitPosts") Long limitPosts, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("entityLink") String entityLink, @Param("userId") String userId, @Param("filterType") String filterType, @Param("resolved") Boolean resolved, @Param("type") String type, @Param("taskStatus") String taskStatus, @Param("activeAnnouncement") Boolean activeAnnouncement);

  /**
   * List threads
   * Similar to <code>listThreads</code> but it also returns the http response headers .
   * Get a list of threads, optionally filtered by &#x60;entityLink&#x60;.
   * @param limitPosts Limit the number of posts sorted by chronological order (1 to 1000000, default &#x3D; 3) (optional, default to 3)
   * @param limit Limit the number of threads returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of threads before this cursor (optional)
   * @param after Returns list of threads after this cursor (optional)
   * @param entityLink Filter threads by entity link of entity about which this thread is created (optional)
   * @param userId Filter threads by user id. This filter requires a &#39;filterType&#39; query param. The default filter type is &#39;OWNER&#39;. This filter cannot be combined with the entityLink filter. (optional)
   * @param filterType Filter type definition for the user filter. It can take one of &#39;OWNER&#39;, &#39;FOLLOWS&#39;, &#39;MENTIONS&#39;. This must be used with the &#39;user&#39; query param (optional)
   * @param resolved Filter threads by whether they are resolved or not. By default resolved is false (optional, default to false)
   * @param type The type of thread to filter the results. It can take one of &#39;Conversation&#39;, &#39;Task&#39;, &#39;Announcement&#39; (optional)
   * @param taskStatus The status of tasks to filter the results. It can take one of &#39;Open&#39;, &#39;Closed&#39;. This filter will take effect only when type is set to Task (optional)
   * @param activeAnnouncement Whether to filter results by announcements that are currently active. This filter will take effect only when type is set to Announcement (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/feed?limitPosts={limitPosts}&limit={limit}&before={before}&after={after}&entityLink={entityLink}&userId={userId}&filterType={filterType}&resolved={resolved}&type={type}&taskStatus={taskStatus}&activeAnnouncement={activeAnnouncement}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ThreadList> listThreadsWithHttpInfo(@Param("limitPosts") Long limitPosts, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("entityLink") String entityLink, @Param("userId") String userId, @Param("filterType") String filterType, @Param("resolved") Boolean resolved, @Param("type") String type, @Param("taskStatus") String taskStatus, @Param("activeAnnouncement") Boolean activeAnnouncement);


  /**
   * List threads
   * Get a list of threads, optionally filtered by &#x60;entityLink&#x60;.
   * Note, this is equivalent to the other <code>listThreads</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListThreadsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limitPosts - Limit the number of posts sorted by chronological order (1 to 1000000, default &#x3D; 3) (optional, default to 3)</li>
   *   <li>limit - Limit the number of threads returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of threads before this cursor (optional)</li>
   *   <li>after - Returns list of threads after this cursor (optional)</li>
   *   <li>entityLink - Filter threads by entity link of entity about which this thread is created (optional)</li>
   *   <li>userId - Filter threads by user id. This filter requires a &#39;filterType&#39; query param. The default filter type is &#39;OWNER&#39;. This filter cannot be combined with the entityLink filter. (optional)</li>
   *   <li>filterType - Filter type definition for the user filter. It can take one of &#39;OWNER&#39;, &#39;FOLLOWS&#39;, &#39;MENTIONS&#39;. This must be used with the &#39;user&#39; query param (optional)</li>
   *   <li>resolved - Filter threads by whether they are resolved or not. By default resolved is false (optional, default to false)</li>
   *   <li>type - The type of thread to filter the results. It can take one of &#39;Conversation&#39;, &#39;Task&#39;, &#39;Announcement&#39; (optional)</li>
   *   <li>taskStatus - The status of tasks to filter the results. It can take one of &#39;Open&#39;, &#39;Closed&#39;. This filter will take effect only when type is set to Task (optional)</li>
   *   <li>activeAnnouncement - Whether to filter results by announcements that are currently active. This filter will take effect only when type is set to Announcement (optional)</li>
   *   </ul>
   * @return ThreadList
   */
  @RequestLine("GET /v1/feed?limitPosts={limitPosts}&limit={limit}&before={before}&after={after}&entityLink={entityLink}&userId={userId}&filterType={filterType}&resolved={resolved}&type={type}&taskStatus={taskStatus}&activeAnnouncement={activeAnnouncement}")
  @Headers({
  "Accept: application/json",
  })
  ThreadList listThreads(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List threads
  * Get a list of threads, optionally filtered by &#x60;entityLink&#x60;.
  * Note, this is equivalent to the other <code>listThreads</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>limitPosts - Limit the number of posts sorted by chronological order (1 to 1000000, default &#x3D; 3) (optional, default to 3)</li>
          *   <li>limit - Limit the number of threads returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of threads before this cursor (optional)</li>
          *   <li>after - Returns list of threads after this cursor (optional)</li>
          *   <li>entityLink - Filter threads by entity link of entity about which this thread is created (optional)</li>
          *   <li>userId - Filter threads by user id. This filter requires a &#39;filterType&#39; query param. The default filter type is &#39;OWNER&#39;. This filter cannot be combined with the entityLink filter. (optional)</li>
          *   <li>filterType - Filter type definition for the user filter. It can take one of &#39;OWNER&#39;, &#39;FOLLOWS&#39;, &#39;MENTIONS&#39;. This must be used with the &#39;user&#39; query param (optional)</li>
          *   <li>resolved - Filter threads by whether they are resolved or not. By default resolved is false (optional, default to false)</li>
          *   <li>type - The type of thread to filter the results. It can take one of &#39;Conversation&#39;, &#39;Task&#39;, &#39;Announcement&#39; (optional)</li>
          *   <li>taskStatus - The status of tasks to filter the results. It can take one of &#39;Open&#39;, &#39;Closed&#39;. This filter will take effect only when type is set to Task (optional)</li>
          *   <li>activeAnnouncement - Whether to filter results by announcements that are currently active. This filter will take effect only when type is set to Announcement (optional)</li>
      *   </ul>
          * @return ThreadList
      */
      @RequestLine("GET /v1/feed?limitPosts={limitPosts}&limit={limit}&before={before}&after={after}&entityLink={entityLink}&userId={userId}&filterType={filterType}&resolved={resolved}&type={type}&taskStatus={taskStatus}&activeAnnouncement={activeAnnouncement}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ThreadList> listThreadsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listThreads</code> method in a fluent style.
   */
  public static class ListThreadsQueryParams extends HashMap<String, Object> {
    public ListThreadsQueryParams limitPosts(final Long value) {
      put("limitPosts", EncodingUtils.encode(value));
      return this;
    }
    public ListThreadsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListThreadsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListThreadsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListThreadsQueryParams entityLink(final String value) {
      put("entityLink", EncodingUtils.encode(value));
      return this;
    }
    public ListThreadsQueryParams userId(final String value) {
      put("userId", EncodingUtils.encode(value));
      return this;
    }
    public ListThreadsQueryParams filterType(final String value) {
      put("filterType", EncodingUtils.encode(value));
      return this;
    }
    public ListThreadsQueryParams resolved(final Boolean value) {
      put("resolved", EncodingUtils.encode(value));
      return this;
    }
    public ListThreadsQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }
    public ListThreadsQueryParams taskStatus(final String value) {
      put("taskStatus", EncodingUtils.encode(value));
      return this;
    }
    public ListThreadsQueryParams activeAnnouncement(final Boolean value) {
      put("activeAnnouncement", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update post of a thread by &#x60;Id&#x60;.
   * Update a post of an existing thread using JsonPatch.
   * @param threadId Id of the thread (required)
   * @param postId Id of the post (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update post of a thread by &#x60;Id&#x60;. Documentation</a>
   */
  @RequestLine("PATCH /v1/feed/{threadId}/posts/{postId}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchPostOfThread(@Param("threadId") String threadId, @Param("postId") String postId, Object body);

  /**
   * Update post of a thread by &#x60;Id&#x60;.
   * Similar to <code>patchPostOfThread</code> but it also returns the http response headers .
   * Update a post of an existing thread using JsonPatch.
   * @param threadId Id of the thread (required)
   * @param postId Id of the post (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update post of a thread by &#x60;Id&#x60;. Documentation</a>
   */
  @RequestLine("PATCH /v1/feed/{threadId}/posts/{postId}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchPostOfThreadWithHttpInfo(@Param("threadId") String threadId, @Param("postId") String postId, Object body);



  /**
   * Update a thread by &#x60;Id&#x60;.
   * Update an existing thread using JsonPatch.
   * @param id Id of the thread (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a thread by &#x60;Id&#x60;. Documentation</a>
   */
  @RequestLine("PATCH /v1/feed/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchThread(@Param("id") String id, Object body);

  /**
   * Update a thread by &#x60;Id&#x60;.
   * Similar to <code>patchThread</code> but it also returns the http response headers .
   * Update an existing thread using JsonPatch.
   * @param id Id of the thread (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a thread by &#x60;Id&#x60;. Documentation</a>
   */
  @RequestLine("PATCH /v1/feed/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchThreadWithHttpInfo(@Param("id") String id, Object body);



  /**
   * Resolve a task
   * Resolve a task.
   * @param id Id of the task thread (required)
   * @param resolveTask  (optional)
   * @return Thread
   */
  @RequestLine("PUT /v1/feed/tasks/{id}/resolve")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Thread resolveTask(@Param("id") String id, ResolveTask resolveTask);

  /**
   * Resolve a task
   * Similar to <code>resolveTask</code> but it also returns the http response headers .
   * Resolve a task.
   * @param id Id of the task thread (required)
   * @param resolveTask  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/feed/tasks/{id}/resolve")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Thread> resolveTaskWithHttpInfo(@Param("id") String id, ResolveTask resolveTask);


}
