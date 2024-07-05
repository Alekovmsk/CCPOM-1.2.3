package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.Bot;
import org.openmetadata.client.model.BotList;
import org.openmetadata.client.model.CreateBot;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
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
 * API tests for BotsApi
 */
class BotsApiTest {

    private BotsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(BotsApi.class);
    }

    
    /**
     * Create a bot
     *
     * Create a new bot.
     */
    @Test
    void createBotTest() {
        CreateBot createBot = null;
        // Bot response = api.createBot(createBot);

        // TODO: test validations
    }

    
    /**
     * Create or update a bot
     *
     * Create a bot, if it does not exist. If a bot already exists, update the bot.
     */
    @Test
    void createOrUpdateBotTest() {
        CreateBot createBot = null;
        // Bot response = api.createOrUpdateBot(createBot);

        // TODO: test validations
    }

    
    /**
     * Delete a bot by Id
     *
     * Delete a bot by &#x60;Id&#x60;.
     */
    @Test
    void deleteBotTest() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.deleteBot(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a bot by Id
     *
     * Delete a bot by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteBotTestQueryMap() {
        UUID id = null;
        BotsApi.DeleteBotQueryParams queryParams = new BotsApi.DeleteBotQueryParams()
            .hardDelete(null);
        // api.deleteBot(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a bot by name
     *
     * Delete a bot by &#x60;name&#x60;.
     */
    @Test
    void deleteBotByFQNTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteBotByFQN(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a bot by name
     *
     * Delete a bot by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteBotByFQNTestQueryMap() {
        String name = null;
        BotsApi.DeleteBotByFQNQueryParams queryParams = new BotsApi.DeleteBotByFQNQueryParams()
            .hardDelete(null);
        // api.deleteBotByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a bot by name
     *
     * Get a bot by &#x60;name&#x60;.
     */
    @Test
    void getBotByFQNTest() {
        String name = null;
        String include = null;
        // Bot response = api.getBotByFQN(name, include);

        // TODO: test validations
    }

    /**
     * Get a bot by name
     *
     * Get a bot by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getBotByFQNTestQueryMap() {
        String name = null;
        BotsApi.GetBotByFQNQueryParams queryParams = new BotsApi.GetBotByFQNQueryParams()
            .include(null);
        // Bot response = api.getBotByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a bot by Id
     *
     * Get a bot by &#x60;Id&#x60;.
     */
    @Test
    void getBotByIDTest() {
        UUID id = null;
        String include = null;
        // Bot response = api.getBotByID(id, include);

        // TODO: test validations
    }

    /**
     * Get a bot by Id
     *
     * Get a bot by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getBotByIDTestQueryMap() {
        UUID id = null;
        BotsApi.GetBotByIDQueryParams queryParams = new BotsApi.GetBotByIDQueryParams()
            .include(null);
        // Bot response = api.getBotByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * List bot versions
     *
     * Get a list of all the versions of a bot identified by &#x60;Id&#x60;
     */
    @Test
    void listAllBotVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllBotVersion(id);

        // TODO: test validations
    }

    
    /**
     * List bots
     *
     * Get a list of Bot.
     */
    @Test
    void listBotsTest() {
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // BotList response = api.listBots(limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List bots
     *
     * Get a list of Bot.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listBotsTestQueryMap() {
        BotsApi.ListBotsQueryParams queryParams = new BotsApi.ListBotsQueryParams()
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // BotList response = api.listBots(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the bot
     *
     * Get a version of the bot by given &#x60;Id&#x60;
     */
    @Test
    void listSpecificBotVersionTest() {
        UUID id = null;
        String version = null;
        // Bot response = api.listSpecificBotVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Update a bot
     *
     * Update an existing bot using JsonPatch.
     */
    @Test
    void patchBotTest() {
        UUID id = null;
        Object body = null;
        // api.patchBot(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted bot
     *
     * Restore a soft deleted bot.
     */
    @Test
    void restore2Test() {
        RestoreEntity restoreEntity = null;
        // Bot response = api.restore2(restoreEntity);

        // TODO: test validations
    }

    
}
