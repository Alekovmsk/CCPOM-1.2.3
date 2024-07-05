package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateTopic;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Topic;
import org.openmetadata.client.model.TopicList;
import org.openmetadata.client.model.TopicSampleData;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface TopicsApi extends ApiClient.Api {


  /**
   * Add a follower
   * Add a user identified by &#x60;userId&#x60; as followed of this topic
   * @param id Id of the topic (required)
   * @param body Id of the user to be added as follower (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/topics/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent addFollower6(@Param("id") UUID id, UUID body);

  /**
   * Add a follower
   * Similar to <code>addFollower6</code> but it also returns the http response headers .
   * Add a user identified by &#x60;userId&#x60; as followed of this topic
   * @param id Id of the topic (required)
   * @param body Id of the user to be added as follower (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/topics/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> addFollower6WithHttpInfo(@Param("id") UUID id, UUID body);



  /**
   * Add sample data
   * Add sample data to the topic.
   * @param id Id of the topic (required)
   * @param topicSampleData  (optional)
   * @return Topic
   */
  @RequestLine("PUT /v1/topics/{id}/sampleData")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Topic addSampleData2(@Param("id") UUID id, TopicSampleData topicSampleData);

  /**
   * Add sample data
   * Similar to <code>addSampleData2</code> but it also returns the http response headers .
   * Add sample data to the topic.
   * @param id Id of the topic (required)
   * @param topicSampleData  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/topics/{id}/sampleData")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Topic> addSampleData2WithHttpInfo(@Param("id") UUID id, TopicSampleData topicSampleData);



  /**
   * Update topic
   * Create a topic, it it does not exist or update an existing topic.
   * @param createTopic  (optional)
   * @return Topic
   */
  @RequestLine("PUT /v1/topics")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Topic createOrUpdateTopic(CreateTopic createTopic);

  /**
   * Update topic
   * Similar to <code>createOrUpdateTopic</code> but it also returns the http response headers .
   * Create a topic, it it does not exist or update an existing topic.
   * @param createTopic  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/topics")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Topic> createOrUpdateTopicWithHttpInfo(CreateTopic createTopic);



  /**
   * Create a topic
   * Create a topic under an existing &#x60;service&#x60;.
   * @param createTopic  (optional)
   * @return Topic
   */
  @RequestLine("POST /v1/topics")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Topic createTopic(CreateTopic createTopic);

  /**
   * Create a topic
   * Similar to <code>createTopic</code> but it also returns the http response headers .
   * Create a topic under an existing &#x60;service&#x60;.
   * @param createTopic  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/topics")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Topic> createTopicWithHttpInfo(CreateTopic createTopic);



  /**
   * Remove a follower
   * Remove the user identified &#x60;userId&#x60; as a follower of the topic.
   * @param id Id of the topic (required)
   * @param userId Id of the user being removed as follower (required)
   * @return ChangeEvent
   */
  @RequestLine("DELETE /v1/topics/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ChangeEvent deleteFollower7(@Param("id") UUID id, @Param("userId") String userId);

  /**
   * Remove a follower
   * Similar to <code>deleteFollower7</code> but it also returns the http response headers .
   * Remove the user identified &#x60;userId&#x60; as a follower of the topic.
   * @param id Id of the topic (required)
   * @param userId Id of the user being removed as follower (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/topics/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> deleteFollower7WithHttpInfo(@Param("id") UUID id, @Param("userId") String userId);



  /**
   * Delete a topic by id
   * Delete a topic by &#x60;id&#x60;.
   * @param id Id of the topic (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/topics/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTopic(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a topic by id
   * Similar to <code>deleteTopic</code> but it also returns the http response headers .
   * Delete a topic by &#x60;id&#x60;.
   * @param id Id of the topic (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/topics/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTopicWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a topic by id
   * Delete a topic by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteTopic</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTopicQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the topic (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/topics/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTopic(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a topic by id
  * Delete a topic by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteTopic</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the topic (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/topics/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTopicWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTopic</code> method in a fluent style.
   */
  public static class DeleteTopicQueryParams extends HashMap<String, Object> {
    public DeleteTopicQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a topic by fully qualified name
   * Delete a topic by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the topic (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/topics/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTopicByFQN(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a topic by fully qualified name
   * Similar to <code>deleteTopicByFQN</code> but it also returns the http response headers .
   * Delete a topic by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the topic (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/topics/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTopicByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a topic by fully qualified name
   * Delete a topic by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteTopicByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTopicByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the topic (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/topics/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTopicByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a topic by fully qualified name
  * Delete a topic by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteTopicByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the topic (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/topics/name/{fqn}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTopicByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTopicByFQN</code> method in a fluent style.
   */
  public static class DeleteTopicByFQNQueryParams extends HashMap<String, Object> {
    public DeleteTopicByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a topic by id
   * Get a topic by &#x60;id&#x60;.
   * @param id Id of the topic (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Topic
   */
  @RequestLine("GET /v1/topics/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Topic get7(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a topic by id
   * Similar to <code>get7</code> but it also returns the http response headers .
   * Get a topic by &#x60;id&#x60;.
   * @param id Id of the topic (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/topics/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Topic> get7WithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a topic by id
   * Get a topic by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>get7</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Get7QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the topic (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Topic
   */
  @RequestLine("GET /v1/topics/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Topic get7(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a topic by id
  * Get a topic by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>get7</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the topic (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Topic
      */
      @RequestLine("GET /v1/topics/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Topic> get7WithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>get7</code> method in a fluent style.
   */
  public static class Get7QueryParams extends HashMap<String, Object> {
    public Get7QueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public Get7QueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get sample data
   * Get sample data from the topic.
   * @param id Id of the topic (required)
   * @return Topic
   */
  @RequestLine("GET /v1/topics/{id}/sampleData")
  @Headers({
    "Accept: application/json",
  })
  Topic getSampleData2(@Param("id") UUID id);

  /**
   * Get sample data
   * Similar to <code>getSampleData2</code> but it also returns the http response headers .
   * Get sample data from the topic.
   * @param id Id of the topic (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/topics/{id}/sampleData")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Topic> getSampleData2WithHttpInfo(@Param("id") UUID id);



  /**
   * Get a version of the topic
   * Get a version of the topic by given &#x60;id&#x60;
   * @param id Id of the topic (required)
   * @param version Topic version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Topic
   */
  @RequestLine("GET /v1/topics/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Topic getSpecificTopicVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the topic
   * Similar to <code>getSpecificTopicVersion</code> but it also returns the http response headers .
   * Get a version of the topic by given &#x60;id&#x60;
   * @param id Id of the topic (required)
   * @param version Topic version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/topics/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Topic> getSpecificTopicVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a topic by fully qualified name
   * Get a topic by fully qualified name.
   * @param fqn Fully qualified name of the topic (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Topic
   */
  @RequestLine("GET /v1/topics/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Topic getTopicByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a topic by fully qualified name
   * Similar to <code>getTopicByFQN</code> but it also returns the http response headers .
   * Get a topic by fully qualified name.
   * @param fqn Fully qualified name of the topic (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/topics/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Topic> getTopicByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a topic by fully qualified name
   * Get a topic by fully qualified name.
   * Note, this is equivalent to the other <code>getTopicByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTopicByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the topic (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Topic
   */
  @RequestLine("GET /v1/topics/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Topic getTopicByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a topic by fully qualified name
  * Get a topic by fully qualified name.
  * Note, this is equivalent to the other <code>getTopicByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the topic (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Topic
      */
      @RequestLine("GET /v1/topics/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Topic> getTopicByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTopicByFQN</code> method in a fluent style.
   */
  public static class GetTopicByFQNQueryParams extends HashMap<String, Object> {
    public GetTopicByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetTopicByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List topic versions
   * Get a list of all the versions of a topic identified by &#x60;id&#x60;
   * @param id Id of the topic (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/topics/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllTopicVersion(@Param("id") UUID id);

  /**
   * List topic versions
   * Similar to <code>listAllTopicVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a topic identified by &#x60;id&#x60;
   * @param id Id of the topic (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/topics/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllTopicVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List topics
   * Get a list of topics, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter topics by service name (optional)
   * @param limit Limit the number topics returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of topics before this cursor (optional)
   * @param after Returns list of topics after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return TopicList
   */
  @RequestLine("GET /v1/topics?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  TopicList listTopics(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List topics
   * Similar to <code>listTopics</code> but it also returns the http response headers .
   * Get a list of topics, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param service Filter topics by service name (optional)
   * @param limit Limit the number topics returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of topics before this cursor (optional)
   * @param after Returns list of topics after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/topics?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TopicList> listTopicsWithHttpInfo(@Param("fields") String fields, @Param("service") String service, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List topics
   * Get a list of topics, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listTopics</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTopicsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>service - Filter topics by service name (optional)</li>
   *   <li>limit - Limit the number topics returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of topics before this cursor (optional)</li>
   *   <li>after - Returns list of topics after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return TopicList
   */
  @RequestLine("GET /v1/topics?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  TopicList listTopics(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List topics
  * Get a list of topics, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listTopics</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>service - Filter topics by service name (optional)</li>
          *   <li>limit - Limit the number topics returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of topics before this cursor (optional)</li>
          *   <li>after - Returns list of topics after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return TopicList
      */
      @RequestLine("GET /v1/topics?fields={fields}&service={service}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TopicList> listTopicsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listTopics</code> method in a fluent style.
   */
  public static class ListTopicsQueryParams extends HashMap<String, Object> {
    public ListTopicsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListTopicsQueryParams service(final String value) {
      put("service", EncodingUtils.encode(value));
      return this;
    }
    public ListTopicsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListTopicsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListTopicsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListTopicsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a topic
   * Update an existing topic using JsonPatch.
   * @param id Id of the topic (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a topic Documentation</a>
   */
  @RequestLine("PATCH /v1/topics/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchTopic(@Param("id") UUID id, Object body);

  /**
   * Update a topic
   * Similar to <code>patchTopic</code> but it also returns the http response headers .
   * Update an existing topic using JsonPatch.
   * @param id Id of the topic (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a topic Documentation</a>
   */
  @RequestLine("PATCH /v1/topics/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchTopicWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted topic
   * Restore a soft deleted topic.
   * @param restoreEntity  (optional)
   * @return Topic
   */
  @RequestLine("PUT /v1/topics/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Topic restore36(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted topic
   * Similar to <code>restore36</code> but it also returns the http response headers .
   * Restore a soft deleted topic.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/topics/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Topic> restore36WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/topics/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity20(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity20</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/topics/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity20WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
