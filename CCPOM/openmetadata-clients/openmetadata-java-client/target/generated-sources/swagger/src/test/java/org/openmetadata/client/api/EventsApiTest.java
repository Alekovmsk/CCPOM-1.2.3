package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateEventSubscription;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.EventList;
import org.openmetadata.client.model.EventSubscription;
import org.openmetadata.client.model.EventSubscriptionList;
import org.openmetadata.client.model.Function;
import org.openmetadata.client.model.ResultListSubscriptionResourceDescriptor;
import org.openmetadata.client.model.SubscriptionStatus;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
class EventsApiTest {

    private EventsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(EventsApi.class);
    }

    
    /**
     * Create a new Event Subscription
     *
     * Create a new Event Subscription
     */
    @Test
    void createEventSubscriptionTest() {
        CreateEventSubscription createEventSubscription = null;
        // CreateEventSubscription response = api.createEventSubscription(createEventSubscription);

        // TODO: test validations
    }

    
    /**
     * Updated an existing or create a new Event Subscription
     *
     * Updated an existing or create a new Event Subscription
     */
    @Test
    void createOrUpdateEventSubscriptionTest() {
        CreateEventSubscription createEventSubscription = null;
        // CreateEventSubscription response = api.createOrUpdateEventSubscription(createEventSubscription);

        // TODO: test validations
    }

    
    /**
     * Delete an Event Subscription by Id
     *
     * Delete an Event Subscription
     */
    @Test
    void deleteEventSubscriptionTest() {
        UUID id = null;
        // EventSubscription response = api.deleteEventSubscription(id);

        // TODO: test validations
    }

    
    /**
     * Delete an Event Subscription by name
     *
     * Delete an Event Subscription by given &#x60;name&#x60;.
     */
    @Test
    void deleteEventSubscriptionByNameTest() {
        String name = null;
        // api.deleteEventSubscriptionByName(name);

        // TODO: test validations
    }

    
    /**
     * Get a event Subscription by ID
     *
     * Get a event Subscription by given Id
     */
    @Test
    void getEventSubscriptionByIDTest() {
        UUID id = null;
        String fields = null;
        // EventSubscription response = api.getEventSubscriptionByID(id, fields);

        // TODO: test validations
    }

    /**
     * Get a event Subscription by ID
     *
     * Get a event Subscription by given Id
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getEventSubscriptionByIDTestQueryMap() {
        UUID id = null;
        EventsApi.GetEventSubscriptionByIDQueryParams queryParams = new EventsApi.GetEventSubscriptionByIDQueryParams()
            .fields(null);
        // EventSubscription response = api.getEventSubscriptionByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get an Event Subscription by name
     *
     * Get an Event Subscription by name.
     */
    @Test
    void getEventSubscriptionByNameTest() {
        String eventSubscriptionName = null;
        String fields = null;
        // EventSubscription response = api.getEventSubscriptionByName(eventSubscriptionName, fields);

        // TODO: test validations
    }

    /**
     * Get an Event Subscription by name
     *
     * Get an Event Subscription by name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getEventSubscriptionByNameTestQueryMap() {
        String eventSubscriptionName = null;
        EventsApi.GetEventSubscriptionByNameQueryParams queryParams = new EventsApi.GetEventSubscriptionByNameQueryParams()
            .fields(null);
        // EventSubscription response = api.getEventSubscriptionByName(eventSubscriptionName, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get Event Subscription status
     *
     * Get a event Subscription status by given Name
     */
    @Test
    void getEventSubscriptionStatusTest() {
        String eventSubscriptionName = null;
        // SubscriptionStatus response = api.getEventSubscriptionStatus(eventSubscriptionName);

        // TODO: test validations
    }

    
    /**
     * Get Event Subscription status by Id
     *
     * Get a event Subscription status by given Name
     */
    @Test
    void getEventSubscriptionStatusByIdTest() {
        UUID eventSubscriptionId = null;
        // SubscriptionStatus response = api.getEventSubscriptionStatusById(eventSubscriptionId);

        // TODO: test validations
    }

    
    /**
     * Get a version of the Event Subscription
     *
     * Get a version of the Event Subscription by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificEventSubscriptionVersionTest() {
        UUID id = null;
        String version = null;
        // EventSubscription response = api.getSpecificEventSubscriptionVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List Event Subscription versions
     *
     * Get a list of all the versions of an Event Subscription identified by &#x60;Id&#x60;
     */
    @Test
    void listAllEventSubscriptionVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllEventSubscriptionVersion(id);

        // TODO: test validations
    }

    
    /**
     * Get change events
     *
     * Get a list of change events matching event types, entity type, from a given date
     */
    @Test
    void listChangeEventsTest() {
        Long timestamp = null;
        String entityCreated = null;
        String entityUpdated = null;
        String entityRestored = null;
        String entityDeleted = null;
        // EventList response = api.listChangeEvents(timestamp, entityCreated, entityUpdated, entityRestored, entityDeleted);

        // TODO: test validations
    }

    /**
     * Get change events
     *
     * Get a list of change events matching event types, entity type, from a given date
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listChangeEventsTestQueryMap() {
        EventsApi.ListChangeEventsQueryParams queryParams = new EventsApi.ListChangeEventsQueryParams()
            .entityCreated(null)
            .entityUpdated(null)
            .entityRestored(null)
            .entityDeleted(null)
            .timestamp(null);
        // EventList response = api.listChangeEvents(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get list of Event Subscription functions used in filtering EventSubscription
     *
     * Get list of Event Subscription functions used in filtering conditions in Event Subscriptions
     */
    @Test
    void listEventSubscriptionFunctionsTest() {
        // List<Function> response = api.listEventSubscriptionFunctions();

        // TODO: test validations
    }

    
    /**
     * Get list of Event Subscriptions Resources used in filtering Event Subscription
     *
     * Get list of EventSubscription functions used in filtering conditions in Event Subscription
     */
    @Test
    void listEventSubscriptionResourcesTest() {
        // ResultListSubscriptionResourceDescriptor response = api.listEventSubscriptionResources();

        // TODO: test validations
    }

    
    /**
     * List all available Event Subscriptions
     *
     * Get a list of All available Event Subscriptions
     */
    @Test
    void listEventSubscriptionsTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        // EventSubscriptionList response = api.listEventSubscriptions(fields, limit, before, after);

        // TODO: test validations
    }

    /**
     * List all available Event Subscriptions
     *
     * Get a list of All available Event Subscriptions
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listEventSubscriptionsTestQueryMap() {
        EventsApi.ListEventSubscriptionsQueryParams queryParams = new EventsApi.ListEventSubscriptionsQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null);
        // EventSubscriptionList response = api.listEventSubscriptions(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update an Event Subscriptions
     *
     * Update an existing Event Subscriptions using JsonPatch.
     */
    @Test
    void patchEventSubscriptionTest() {
        UUID id = null;
        Object body = null;
        // api.patchEventSubscription(id, body);

        // TODO: test validations
    }

    
    /**
     * Trigger a existing Data Insight Report Job to run
     *
     * Trigger a existing Data Insight Report Job to run
     */
    @Test
    void triggerDataInsightJobTest() {
        UUID id = null;
        // api.triggerDataInsightJob(id);

        // TODO: test validations
    }

    
    /**
     * Validate a given condition
     *
     * Validate a given condition expression used in filtering rules.
     */
    @Test
    void validateConditionTest() {
        String expression = null;
        // api.validateCondition(expression);

        // TODO: test validations
    }

    
}
