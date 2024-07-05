package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.Bot;
import org.openmetadata.client.model.BotList;
import org.openmetadata.client.model.CreateBot;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface BotsApi extends ApiClient.Api {


  /**
   * Create a bot
   * Create a new bot.
   * @param createBot  (optional)
   * @return Bot
   */
  @RequestLine("POST /v1/bots")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Bot createBot(CreateBot createBot);

  /**
   * Create a bot
   * Similar to <code>createBot</code> but it also returns the http response headers .
   * Create a new bot.
   * @param createBot  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/bots")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Bot> createBotWithHttpInfo(CreateBot createBot);



  /**
   * Create or update a bot
   * Create a bot, if it does not exist. If a bot already exists, update the bot.
   * @param createBot  (optional)
   * @return Bot
   */
  @RequestLine("PUT /v1/bots")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Bot createOrUpdateBot(CreateBot createBot);

  /**
   * Create or update a bot
   * Similar to <code>createOrUpdateBot</code> but it also returns the http response headers .
   * Create a bot, if it does not exist. If a bot already exists, update the bot.
   * @param createBot  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/bots")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Bot> createOrUpdateBotWithHttpInfo(CreateBot createBot);



  /**
   * Delete a bot by Id
   * Delete a bot by &#x60;Id&#x60;.
   * @param id Id of the bot (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/bots/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteBot(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a bot by Id
   * Similar to <code>deleteBot</code> but it also returns the http response headers .
   * Delete a bot by &#x60;Id&#x60;.
   * @param id Id of the bot (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/bots/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteBotWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a bot by Id
   * Delete a bot by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deleteBot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteBotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the bot (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/bots/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteBot(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a bot by Id
  * Delete a bot by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deleteBot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the bot (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/bots/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteBotWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteBot</code> method in a fluent style.
   */
  public static class DeleteBotQueryParams extends HashMap<String, Object> {
    public DeleteBotQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a bot by name
   * Delete a bot by &#x60;name&#x60;.
   * @param name Name of the bot (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/bots/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteBotByFQN(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a bot by name
   * Similar to <code>deleteBotByFQN</code> but it also returns the http response headers .
   * Delete a bot by &#x60;name&#x60;.
   * @param name Name of the bot (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/bots/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteBotByFQNWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a bot by name
   * Delete a bot by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>deleteBotByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteBotByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the bot (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/bots/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteBotByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a bot by name
  * Delete a bot by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>deleteBotByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the bot (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/bots/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteBotByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteBotByFQN</code> method in a fluent style.
   */
  public static class DeleteBotByFQNQueryParams extends HashMap<String, Object> {
    public DeleteBotByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a bot by name
   * Get a bot by &#x60;name&#x60;.
   * @param name Name of the bot (required)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Bot
   */
  @RequestLine("GET /v1/bots/name/{name}?include={include}")
  @Headers({
    "Accept: application/json",
  })
  Bot getBotByFQN(@Param("name") String name, @Param("include") String include);

  /**
   * Get a bot by name
   * Similar to <code>getBotByFQN</code> but it also returns the http response headers .
   * Get a bot by &#x60;name&#x60;.
   * @param name Name of the bot (required)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/bots/name/{name}?include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Bot> getBotByFQNWithHttpInfo(@Param("name") String name, @Param("include") String include);


  /**
   * Get a bot by name
   * Get a bot by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getBotByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetBotByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the bot (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Bot
   */
  @RequestLine("GET /v1/bots/name/{name}?include={include}")
  @Headers({
  "Accept: application/json",
  })
  Bot getBotByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a bot by name
  * Get a bot by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getBotByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the bot (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Bot
      */
      @RequestLine("GET /v1/bots/name/{name}?include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Bot> getBotByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getBotByFQN</code> method in a fluent style.
   */
  public static class GetBotByFQNQueryParams extends HashMap<String, Object> {
    public GetBotByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a bot by Id
   * Get a bot by &#x60;Id&#x60;.
   * @param id Id of the bot (required)
   * @param include  (optional, default to non-deleted)
   * @return Bot
   */
  @RequestLine("GET /v1/bots/{id}?include={include}")
  @Headers({
    "Accept: application/json",
  })
  Bot getBotByID(@Param("id") UUID id, @Param("include") String include);

  /**
   * Get a bot by Id
   * Similar to <code>getBotByID</code> but it also returns the http response headers .
   * Get a bot by &#x60;Id&#x60;.
   * @param id Id of the bot (required)
   * @param include  (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/bots/{id}?include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Bot> getBotByIDWithHttpInfo(@Param("id") UUID id, @Param("include") String include);


  /**
   * Get a bot by Id
   * Get a bot by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getBotByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetBotByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the bot (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include -  (optional, default to non-deleted)</li>
   *   </ul>
   * @return Bot
   */
  @RequestLine("GET /v1/bots/{id}?include={include}")
  @Headers({
  "Accept: application/json",
  })
  Bot getBotByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a bot by Id
  * Get a bot by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getBotByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the bot (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>include -  (optional, default to non-deleted)</li>
      *   </ul>
          * @return Bot
      */
      @RequestLine("GET /v1/bots/{id}?include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Bot> getBotByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getBotByID</code> method in a fluent style.
   */
  public static class GetBotByIDQueryParams extends HashMap<String, Object> {
    public GetBotByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List bot versions
   * Get a list of all the versions of a bot identified by &#x60;Id&#x60;
   * @param id Id of the bot (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/bots/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllBotVersion(@Param("id") UUID id);

  /**
   * List bot versions
   * Similar to <code>listAllBotVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a bot identified by &#x60;Id&#x60;
   * @param id Id of the bot (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/bots/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllBotVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List bots
   * Get a list of Bot.
   * @param limit  (optional, default to 10)
   * @param before Returns list of Bot before this cursor (optional)
   * @param after Returns list of Bot after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return BotList
   */
  @RequestLine("GET /v1/bots?limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  BotList listBots(@Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List bots
   * Similar to <code>listBots</code> but it also returns the http response headers .
   * Get a list of Bot.
   * @param limit  (optional, default to 10)
   * @param before Returns list of Bot before this cursor (optional)
   * @param after Returns list of Bot after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/bots?limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<BotList> listBotsWithHttpInfo(@Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List bots
   * Get a list of Bot.
   * Note, this is equivalent to the other <code>listBots</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListBotsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit -  (optional, default to 10)</li>
   *   <li>before - Returns list of Bot before this cursor (optional)</li>
   *   <li>after - Returns list of Bot after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return BotList
   */
  @RequestLine("GET /v1/bots?limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  BotList listBots(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List bots
  * Get a list of Bot.
  * Note, this is equivalent to the other <code>listBots</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>limit -  (optional, default to 10)</li>
          *   <li>before - Returns list of Bot before this cursor (optional)</li>
          *   <li>after - Returns list of Bot after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return BotList
      */
      @RequestLine("GET /v1/bots?limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<BotList> listBotsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listBots</code> method in a fluent style.
   */
  public static class ListBotsQueryParams extends HashMap<String, Object> {
    public ListBotsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListBotsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListBotsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListBotsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the bot
   * Get a version of the bot by given &#x60;Id&#x60;
   * @param id Id of the bot (required)
   * @param version bot version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Bot
   */
  @RequestLine("GET /v1/bots/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Bot listSpecificBotVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the bot
   * Similar to <code>listSpecificBotVersion</code> but it also returns the http response headers .
   * Get a version of the bot by given &#x60;Id&#x60;
   * @param id Id of the bot (required)
   * @param version bot version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/bots/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Bot> listSpecificBotVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Update a bot
   * Update an existing bot using JsonPatch.
   * @param id Id of the bot (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a bot Documentation</a>
   */
  @RequestLine("PATCH /v1/bots/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchBot(@Param("id") UUID id, Object body);

  /**
   * Update a bot
   * Similar to <code>patchBot</code> but it also returns the http response headers .
   * Update an existing bot using JsonPatch.
   * @param id Id of the bot (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a bot Documentation</a>
   */
  @RequestLine("PATCH /v1/bots/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchBotWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted bot
   * Restore a soft deleted bot.
   * @param restoreEntity  (optional)
   * @return Bot
   */
  @RequestLine("PUT /v1/bots/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Bot restore2(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted bot
   * Similar to <code>restore2</code> but it also returns the http response headers .
   * Restore a soft deleted bot.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/bots/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Bot> restore2WithHttpInfo(RestoreEntity restoreEntity);


}
