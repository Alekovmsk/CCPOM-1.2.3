package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateEventSubscription;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.EventList;
import org.openmetadata.client.model.EventSubscription;
import org.openmetadata.client.model.EventSubscriptionList;
import org.openmetadata.client.model.Function;
import org.openmetadata.client.model.ResultListSubscriptionResourceDescriptor;
import org.openmetadata.client.model.SubscriptionStatus;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface EventsApi extends ApiClient.Api {


  /**
   * Create a new Event Subscription
   * Create a new Event Subscription
   * @param createEventSubscription  (optional)
   * @return CreateEventSubscription
   */
  @RequestLine("POST /v1/events/subscriptions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateEventSubscription createEventSubscription(CreateEventSubscription createEventSubscription);

  /**
   * Create a new Event Subscription
   * Similar to <code>createEventSubscription</code> but it also returns the http response headers .
   * Create a new Event Subscription
   * @param createEventSubscription  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/events/subscriptions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateEventSubscription> createEventSubscriptionWithHttpInfo(CreateEventSubscription createEventSubscription);



  /**
   * Updated an existing or create a new Event Subscription
   * Updated an existing or create a new Event Subscription
   * @param createEventSubscription  (optional)
   * @return CreateEventSubscription
   */
  @RequestLine("PUT /v1/events/subscriptions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateEventSubscription createOrUpdateEventSubscription(CreateEventSubscription createEventSubscription);

  /**
   * Updated an existing or create a new Event Subscription
   * Similar to <code>createOrUpdateEventSubscription</code> but it also returns the http response headers .
   * Updated an existing or create a new Event Subscription
   * @param createEventSubscription  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/events/subscriptions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateEventSubscription> createOrUpdateEventSubscriptionWithHttpInfo(CreateEventSubscription createEventSubscription);



  /**
   * Delete an Event Subscription by Id
   * Delete an Event Subscription
   * @param id Id of the Event Subscription (required)
   * @return EventSubscription
   */
  @RequestLine("DELETE /v1/events/subscriptions/{id}")
  @Headers({
    "Accept: application/json",
  })
  EventSubscription deleteEventSubscription(@Param("id") UUID id);

  /**
   * Delete an Event Subscription by Id
   * Similar to <code>deleteEventSubscription</code> but it also returns the http response headers .
   * Delete an Event Subscription
   * @param id Id of the Event Subscription (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/events/subscriptions/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EventSubscription> deleteEventSubscriptionWithHttpInfo(@Param("id") UUID id);



  /**
   * Delete an Event Subscription by name
   * Delete an Event Subscription by given &#x60;name&#x60;.
   * @param name Name of the Event Subscription (required)
   */
  @RequestLine("DELETE /v1/events/subscriptions/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  void deleteEventSubscriptionByName(@Param("name") String name);

  /**
   * Delete an Event Subscription by name
   * Similar to <code>deleteEventSubscriptionByName</code> but it also returns the http response headers .
   * Delete an Event Subscription by given &#x60;name&#x60;.
   * @param name Name of the Event Subscription (required)
   */
  @RequestLine("DELETE /v1/events/subscriptions/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteEventSubscriptionByNameWithHttpInfo(@Param("name") String name);



  /**
   * Get a event Subscription by ID
   * Get a event Subscription by given Id
   * @param id Id of the Event Subscription (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return EventSubscription
   */
  @RequestLine("GET /v1/events/subscriptions/{id}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  EventSubscription getEventSubscriptionByID(@Param("id") UUID id, @Param("fields") String fields);

  /**
   * Get a event Subscription by ID
   * Similar to <code>getEventSubscriptionByID</code> but it also returns the http response headers .
   * Get a event Subscription by given Id
   * @param id Id of the Event Subscription (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/events/subscriptions/{id}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EventSubscription> getEventSubscriptionByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields);


  /**
   * Get a event Subscription by ID
   * Get a event Subscription by given Id
   * Note, this is equivalent to the other <code>getEventSubscriptionByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEventSubscriptionByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the Event Subscription (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   </ul>
   * @return EventSubscription
   */
  @RequestLine("GET /v1/events/subscriptions/{id}?fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  EventSubscription getEventSubscriptionByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a event Subscription by ID
  * Get a event Subscription by given Id
  * Note, this is equivalent to the other <code>getEventSubscriptionByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the Event Subscription (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
      *   </ul>
          * @return EventSubscription
      */
      @RequestLine("GET /v1/events/subscriptions/{id}?fields={fields}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<EventSubscription> getEventSubscriptionByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getEventSubscriptionByID</code> method in a fluent style.
   */
  public static class GetEventSubscriptionByIDQueryParams extends HashMap<String, Object> {
    public GetEventSubscriptionByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get an Event Subscription by name
   * Get an Event Subscription by name.
   * @param eventSubscriptionName Name of the Event Subscription (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return EventSubscription
   */
  @RequestLine("GET /v1/events/subscriptions/name/{eventSubscriptionName}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  EventSubscription getEventSubscriptionByName(@Param("eventSubscriptionName") String eventSubscriptionName, @Param("fields") String fields);

  /**
   * Get an Event Subscription by name
   * Similar to <code>getEventSubscriptionByName</code> but it also returns the http response headers .
   * Get an Event Subscription by name.
   * @param eventSubscriptionName Name of the Event Subscription (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/events/subscriptions/name/{eventSubscriptionName}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EventSubscription> getEventSubscriptionByNameWithHttpInfo(@Param("eventSubscriptionName") String eventSubscriptionName, @Param("fields") String fields);


  /**
   * Get an Event Subscription by name
   * Get an Event Subscription by name.
   * Note, this is equivalent to the other <code>getEventSubscriptionByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEventSubscriptionByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param eventSubscriptionName Name of the Event Subscription (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   </ul>
   * @return EventSubscription
   */
  @RequestLine("GET /v1/events/subscriptions/name/{eventSubscriptionName}?fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  EventSubscription getEventSubscriptionByName(@Param("eventSubscriptionName") String eventSubscriptionName, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get an Event Subscription by name
  * Get an Event Subscription by name.
  * Note, this is equivalent to the other <code>getEventSubscriptionByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param eventSubscriptionName Name of the Event Subscription (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
      *   </ul>
          * @return EventSubscription
      */
      @RequestLine("GET /v1/events/subscriptions/name/{eventSubscriptionName}?fields={fields}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<EventSubscription> getEventSubscriptionByNameWithHttpInfo(@Param("eventSubscriptionName") String eventSubscriptionName, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getEventSubscriptionByName</code> method in a fluent style.
   */
  public static class GetEventSubscriptionByNameQueryParams extends HashMap<String, Object> {
    public GetEventSubscriptionByNameQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get Event Subscription status
   * Get a event Subscription status by given Name
   * @param eventSubscriptionName Name of the Event Subscription (required)
   * @return SubscriptionStatus
   */
  @RequestLine("GET /v1/events/subscriptions/name/{eventSubscriptionName}/status")
  @Headers({
    "Accept: application/json",
  })
  SubscriptionStatus getEventSubscriptionStatus(@Param("eventSubscriptionName") String eventSubscriptionName);

  /**
   * Get Event Subscription status
   * Similar to <code>getEventSubscriptionStatus</code> but it also returns the http response headers .
   * Get a event Subscription status by given Name
   * @param eventSubscriptionName Name of the Event Subscription (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/events/subscriptions/name/{eventSubscriptionName}/status")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SubscriptionStatus> getEventSubscriptionStatusWithHttpInfo(@Param("eventSubscriptionName") String eventSubscriptionName);



  /**
   * Get Event Subscription status by Id
   * Get a event Subscription status by given Name
   * @param eventSubscriptionId Name of the Event Subscription (required)
   * @return SubscriptionStatus
   */
  @RequestLine("GET /v1/events/subscriptions/{eventSubscriptionId}/status")
  @Headers({
    "Accept: application/json",
  })
  SubscriptionStatus getEventSubscriptionStatusById(@Param("eventSubscriptionId") UUID eventSubscriptionId);

  /**
   * Get Event Subscription status by Id
   * Similar to <code>getEventSubscriptionStatusById</code> but it also returns the http response headers .
   * Get a event Subscription status by given Name
   * @param eventSubscriptionId Name of the Event Subscription (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/events/subscriptions/{eventSubscriptionId}/status")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SubscriptionStatus> getEventSubscriptionStatusByIdWithHttpInfo(@Param("eventSubscriptionId") UUID eventSubscriptionId);



  /**
   * Get a version of the Event Subscription
   * Get a version of the Event Subscription by given &#x60;Id&#x60;
   * @param id Id of the Event Subscription (required)
   * @param version Event Subscription version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return EventSubscription
   */
  @RequestLine("GET /v1/events/subscriptions/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  EventSubscription getSpecificEventSubscriptionVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the Event Subscription
   * Similar to <code>getSpecificEventSubscriptionVersion</code> but it also returns the http response headers .
   * Get a version of the Event Subscription by given &#x60;Id&#x60;
   * @param id Id of the Event Subscription (required)
   * @param version Event Subscription version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/events/subscriptions/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EventSubscription> getSpecificEventSubscriptionVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List Event Subscription versions
   * Get a list of all the versions of an Event Subscription identified by &#x60;Id&#x60;
   * @param id Id of the Event Subscription (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/events/subscriptions/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllEventSubscriptionVersion(@Param("id") UUID id);

  /**
   * List Event Subscription versions
   * Similar to <code>listAllEventSubscriptionVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of an Event Subscription identified by &#x60;Id&#x60;
   * @param id Id of the Event Subscription (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/events/subscriptions/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllEventSubscriptionVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * Get change events
   * Get a list of change events matching event types, entity type, from a given date
   * @param timestamp Events starting from this unix timestamp in milliseconds (required)
   * @param entityCreated List of comma separated entities requested for &#x60;entityCreated&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)
   * @param entityUpdated List of comma separated entities requested for &#x60;entityUpdated&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)
   * @param entityRestored List of comma separated entities requested for &#x60;entityRestored&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)
   * @param entityDeleted List of comma separated entities requested for &#x60;entityCreated&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)
   * @return EventList
   */
  @RequestLine("GET /v1/events?entityCreated={entityCreated}&entityUpdated={entityUpdated}&entityRestored={entityRestored}&entityDeleted={entityDeleted}&timestamp={timestamp}")
  @Headers({
    "Accept: application/json",
  })
  EventList listChangeEvents(@Param("timestamp") Long timestamp, @Param("entityCreated") String entityCreated, @Param("entityUpdated") String entityUpdated, @Param("entityRestored") String entityRestored, @Param("entityDeleted") String entityDeleted);

  /**
   * Get change events
   * Similar to <code>listChangeEvents</code> but it also returns the http response headers .
   * Get a list of change events matching event types, entity type, from a given date
   * @param timestamp Events starting from this unix timestamp in milliseconds (required)
   * @param entityCreated List of comma separated entities requested for &#x60;entityCreated&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)
   * @param entityUpdated List of comma separated entities requested for &#x60;entityUpdated&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)
   * @param entityRestored List of comma separated entities requested for &#x60;entityRestored&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)
   * @param entityDeleted List of comma separated entities requested for &#x60;entityCreated&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/events?entityCreated={entityCreated}&entityUpdated={entityUpdated}&entityRestored={entityRestored}&entityDeleted={entityDeleted}&timestamp={timestamp}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EventList> listChangeEventsWithHttpInfo(@Param("timestamp") Long timestamp, @Param("entityCreated") String entityCreated, @Param("entityUpdated") String entityUpdated, @Param("entityRestored") String entityRestored, @Param("entityDeleted") String entityDeleted);


  /**
   * Get change events
   * Get a list of change events matching event types, entity type, from a given date
   * Note, this is equivalent to the other <code>listChangeEvents</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListChangeEventsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>entityCreated - List of comma separated entities requested for &#x60;entityCreated&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)</li>
   *   <li>entityUpdated - List of comma separated entities requested for &#x60;entityUpdated&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)</li>
   *   <li>entityRestored - List of comma separated entities requested for &#x60;entityRestored&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)</li>
   *   <li>entityDeleted - List of comma separated entities requested for &#x60;entityCreated&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)</li>
   *   <li>timestamp - Events starting from this unix timestamp in milliseconds (required)</li>
   *   </ul>
   * @return EventList
   */
  @RequestLine("GET /v1/events?entityCreated={entityCreated}&entityUpdated={entityUpdated}&entityRestored={entityRestored}&entityDeleted={entityDeleted}&timestamp={timestamp}")
  @Headers({
  "Accept: application/json",
  })
  EventList listChangeEvents(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get change events
  * Get a list of change events matching event types, entity type, from a given date
  * Note, this is equivalent to the other <code>listChangeEvents</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>entityCreated - List of comma separated entities requested for &#x60;entityCreated&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)</li>
          *   <li>entityUpdated - List of comma separated entities requested for &#x60;entityUpdated&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)</li>
          *   <li>entityRestored - List of comma separated entities requested for &#x60;entityRestored&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)</li>
          *   <li>entityDeleted - List of comma separated entities requested for &#x60;entityCreated&#x60; event. When set to &#x60;*&#x60; all entities will be returned (optional)</li>
          *   <li>timestamp - Events starting from this unix timestamp in milliseconds (required)</li>
      *   </ul>
          * @return EventList
      */
      @RequestLine("GET /v1/events?entityCreated={entityCreated}&entityUpdated={entityUpdated}&entityRestored={entityRestored}&entityDeleted={entityDeleted}&timestamp={timestamp}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<EventList> listChangeEventsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listChangeEvents</code> method in a fluent style.
   */
  public static class ListChangeEventsQueryParams extends HashMap<String, Object> {
    public ListChangeEventsQueryParams entityCreated(final String value) {
      put("entityCreated", EncodingUtils.encode(value));
      return this;
    }
    public ListChangeEventsQueryParams entityUpdated(final String value) {
      put("entityUpdated", EncodingUtils.encode(value));
      return this;
    }
    public ListChangeEventsQueryParams entityRestored(final String value) {
      put("entityRestored", EncodingUtils.encode(value));
      return this;
    }
    public ListChangeEventsQueryParams entityDeleted(final String value) {
      put("entityDeleted", EncodingUtils.encode(value));
      return this;
    }
    public ListChangeEventsQueryParams timestamp(final Long value) {
      put("timestamp", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get list of Event Subscription functions used in filtering EventSubscription
   * Get list of Event Subscription functions used in filtering conditions in Event Subscriptions
   * @return List&lt;Function&gt;
   */
  @RequestLine("GET /v1/events/subscriptions/functions")
  @Headers({
    "Accept: application/json",
  })
  List<Function> listEventSubscriptionFunctions();

  /**
   * Get list of Event Subscription functions used in filtering EventSubscription
   * Similar to <code>listEventSubscriptionFunctions</code> but it also returns the http response headers .
   * Get list of Event Subscription functions used in filtering conditions in Event Subscriptions
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/events/subscriptions/functions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<Function>> listEventSubscriptionFunctionsWithHttpInfo();



  /**
   * Get list of Event Subscriptions Resources used in filtering Event Subscription
   * Get list of EventSubscription functions used in filtering conditions in Event Subscription
   * @return ResultListSubscriptionResourceDescriptor
   */
  @RequestLine("GET /v1/events/subscriptions/resources")
  @Headers({
    "Accept: application/json",
  })
  ResultListSubscriptionResourceDescriptor listEventSubscriptionResources();

  /**
   * Get list of Event Subscriptions Resources used in filtering Event Subscription
   * Similar to <code>listEventSubscriptionResources</code> but it also returns the http response headers .
   * Get list of EventSubscription functions used in filtering conditions in Event Subscription
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/events/subscriptions/resources")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ResultListSubscriptionResourceDescriptor> listEventSubscriptionResourcesWithHttpInfo();



  /**
   * List all available Event Subscriptions
   * Get a list of All available Event Subscriptions
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number event subscriptions returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of event subscriptions before this cursor (optional)
   * @param after Returns list of event subscriptions after this cursor (optional)
   * @return EventSubscriptionList
   */
  @RequestLine("GET /v1/events/subscriptions?fields={fields}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  EventSubscriptionList listEventSubscriptions(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);

  /**
   * List all available Event Subscriptions
   * Similar to <code>listEventSubscriptions</code> but it also returns the http response headers .
   * Get a list of All available Event Subscriptions
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number event subscriptions returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of event subscriptions before this cursor (optional)
   * @param after Returns list of event subscriptions after this cursor (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/events/subscriptions?fields={fields}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EventSubscriptionList> listEventSubscriptionsWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);


  /**
   * List all available Event Subscriptions
   * Get a list of All available Event Subscriptions
   * Note, this is equivalent to the other <code>listEventSubscriptions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListEventSubscriptionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number event subscriptions returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)</li>
   *   <li>before - Returns list of event subscriptions before this cursor (optional)</li>
   *   <li>after - Returns list of event subscriptions after this cursor (optional)</li>
   *   </ul>
   * @return EventSubscriptionList
   */
  @RequestLine("GET /v1/events/subscriptions?fields={fields}&limit={limit}&before={before}&after={after}")
  @Headers({
  "Accept: application/json",
  })
  EventSubscriptionList listEventSubscriptions(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List all available Event Subscriptions
  * Get a list of All available Event Subscriptions
  * Note, this is equivalent to the other <code>listEventSubscriptions</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number event subscriptions returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)</li>
          *   <li>before - Returns list of event subscriptions before this cursor (optional)</li>
          *   <li>after - Returns list of event subscriptions after this cursor (optional)</li>
      *   </ul>
          * @return EventSubscriptionList
      */
      @RequestLine("GET /v1/events/subscriptions?fields={fields}&limit={limit}&before={before}&after={after}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<EventSubscriptionList> listEventSubscriptionsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listEventSubscriptions</code> method in a fluent style.
   */
  public static class ListEventSubscriptionsQueryParams extends HashMap<String, Object> {
    public ListEventSubscriptionsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListEventSubscriptionsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListEventSubscriptionsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListEventSubscriptionsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update an Event Subscriptions
   * Update an existing Event Subscriptions using JsonPatch.
   * @param id Id of the event Subscription (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update an Event Subscriptions Documentation</a>
   */
  @RequestLine("PATCH /v1/events/subscriptions/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchEventSubscription(@Param("id") UUID id, Object body);

  /**
   * Update an Event Subscriptions
   * Similar to <code>patchEventSubscription</code> but it also returns the http response headers .
   * Update an existing Event Subscriptions using JsonPatch.
   * @param id Id of the event Subscription (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update an Event Subscriptions Documentation</a>
   */
  @RequestLine("PATCH /v1/events/subscriptions/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchEventSubscriptionWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Trigger a existing Data Insight Report Job to run
   * Trigger a existing Data Insight Report Job to run
   * @param id Id of the event Subscription (required)
   */
  @RequestLine("PUT /v1/events/subscriptions/trigger/{id}")
  @Headers({
    "Accept: application/json",
  })
  void triggerDataInsightJob(@Param("id") UUID id);

  /**
   * Trigger a existing Data Insight Report Job to run
   * Similar to <code>triggerDataInsightJob</code> but it also returns the http response headers .
   * Trigger a existing Data Insight Report Job to run
   * @param id Id of the event Subscription (required)
   */
  @RequestLine("PUT /v1/events/subscriptions/trigger/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> triggerDataInsightJobWithHttpInfo(@Param("id") UUID id);



  /**
   * Validate a given condition
   * Validate a given condition expression used in filtering rules.
   * @param expression Expression to validate (required)
   */
  @RequestLine("GET /v1/events/subscriptions/validation/condition/{expression}")
  @Headers({
    "Accept: application/json",
  })
  void validateCondition(@Param("expression") String expression);

  /**
   * Validate a given condition
   * Similar to <code>validateCondition</code> but it also returns the http response headers .
   * Validate a given condition expression used in filtering rules.
   * @param expression Expression to validate (required)
   */
  @RequestLine("GET /v1/events/subscriptions/validation/condition/{expression}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> validateConditionWithHttpInfo(@Param("expression") String expression);


}
