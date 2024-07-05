package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.DailyCount;
import org.openmetadata.client.model.EntityUsage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsageApi
 */
class UsageApiTest {

    private UsageApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(UsageApi.class);
    }

    
    /**
     * Get usage by fully qualified name
     *
     * Get usage details for an entity identified by fully qualified name.
     */
    @Test
    void getEntityUsageByFQNTest() {
        String entity = null;
        String fqn = null;
        Integer days = null;
        String date = null;
        // EntityUsage response = api.getEntityUsageByFQN(entity, fqn, days, date);

        // TODO: test validations
    }

    /**
     * Get usage by fully qualified name
     *
     * Get usage details for an entity identified by fully qualified name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getEntityUsageByFQNTestQueryMap() {
        String entity = null;
        String fqn = null;
        UsageApi.GetEntityUsageByFQNQueryParams queryParams = new UsageApi.GetEntityUsageByFQNQueryParams()
            .days(null)
            .date(null);
        // EntityUsage response = api.getEntityUsageByFQN(entity, fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get usage by id
     *
     * Get usage details for an entity identified by &#x60;id&#x60;.
     */
    @Test
    void getEntityUsageByIDTest() {
        String entity = null;
        String id = null;
        Integer days = null;
        String date = null;
        // EntityUsage response = api.getEntityUsageByID(entity, id, days, date);

        // TODO: test validations
    }

    /**
     * Get usage by id
     *
     * Get usage details for an entity identified by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getEntityUsageByIDTestQueryMap() {
        String entity = null;
        String id = null;
        UsageApi.GetEntityUsageByIDQueryParams queryParams = new UsageApi.GetEntityUsageByIDQueryParams()
            .days(null)
            .date(null);
        // EntityUsage response = api.getEntityUsageByID(entity, id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Report usage by fully qualified name
     *
     * Report usage information for an entity by name on a given date. System stores last 30 days of usage information. Usage information older than 30 days is deleted.
     */
    @Test
    void reportEntityUsageWithFQNTest() {
        String entity = null;
        String fqn = null;
        DailyCount dailyCount = null;
        // EntityUsage response = api.reportEntityUsageWithFQN(entity, fqn, dailyCount);

        // TODO: test validations
    }

    
    /**
     * Report usage by fully qualified name
     *
     * Report usage information for an entity by name on a given date. System stores last 30 days of usage information. Usage information older than 30 days is deleted.
     */
    @Test
    void reportEntityUsageWithFQN1Test() {
        String entity = null;
        String fqn = null;
        DailyCount dailyCount = null;
        // EntityUsage response = api.reportEntityUsageWithFQN1(entity, fqn, dailyCount);

        // TODO: test validations
    }

    
    /**
     * Report usage
     *
     * Report usage information for an entity on a given date. System stores last 30 days of usage information. Usage information older than 30 days is deleted.
     */
    @Test
    void reportEntityUsageWithIDTest() {
        String entity = null;
        String id = null;
        DailyCount dailyCount = null;
        // EntityUsage response = api.reportEntityUsageWithID(entity, id, dailyCount);

        // TODO: test validations
    }

    
    /**
     * Report usage
     *
     * Report usage information for an entity on a given date. System stores last 30 days of usage information. Usage information older than 30 days is deleted.
     */
    @Test
    void reportEntityUsageWithID1Test() {
        String entity = null;
        String id = null;
        DailyCount dailyCount = null;
        // EntityUsage response = api.reportEntityUsageWithID1(entity, id, dailyCount);

        // TODO: test validations
    }

    
}
