package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.DailyCount;
import org.openmetadata.client.model.EntityUsage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface UsageApi extends ApiClient.Api {


  /**
   * Get usage by fully qualified name
   * Get usage details for an entity identified by fully qualified name.
   * @param entity Entity type for which usage is requested (required)
   * @param fqn Fully qualified name of the entity that uniquely identifies an entity (required)
   * @param days Usage for number of days going back from the given date (default&#x3D;1, min&#x3D;1, max&#x3D;30) (optional)
   * @param date Usage for number of days going back from this date in ISO 8601 format (default &#x3D; currentDate) (optional)
   * @return EntityUsage
   */
  @RequestLine("GET /v1/usage/{entity}/name/{fqn}?days={days}&date={date}")
  @Headers({
    "Accept: application/json",
  })
  EntityUsage getEntityUsageByFQN(@Param("entity") String entity, @Param("fqn") String fqn, @Param("days") Integer days, @Param("date") String date);

  /**
   * Get usage by fully qualified name
   * Similar to <code>getEntityUsageByFQN</code> but it also returns the http response headers .
   * Get usage details for an entity identified by fully qualified name.
   * @param entity Entity type for which usage is requested (required)
   * @param fqn Fully qualified name of the entity that uniquely identifies an entity (required)
   * @param days Usage for number of days going back from the given date (default&#x3D;1, min&#x3D;1, max&#x3D;30) (optional)
   * @param date Usage for number of days going back from this date in ISO 8601 format (default &#x3D; currentDate) (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/usage/{entity}/name/{fqn}?days={days}&date={date}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityUsage> getEntityUsageByFQNWithHttpInfo(@Param("entity") String entity, @Param("fqn") String fqn, @Param("days") Integer days, @Param("date") String date);


  /**
   * Get usage by fully qualified name
   * Get usage details for an entity identified by fully qualified name.
   * Note, this is equivalent to the other <code>getEntityUsageByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEntityUsageByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param entity Entity type for which usage is requested (required)
   * @param fqn Fully qualified name of the entity that uniquely identifies an entity (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>days - Usage for number of days going back from the given date (default&#x3D;1, min&#x3D;1, max&#x3D;30) (optional)</li>
   *   <li>date - Usage for number of days going back from this date in ISO 8601 format (default &#x3D; currentDate) (optional)</li>
   *   </ul>
   * @return EntityUsage
   */
  @RequestLine("GET /v1/usage/{entity}/name/{fqn}?days={days}&date={date}")
  @Headers({
  "Accept: application/json",
  })
  EntityUsage getEntityUsageByFQN(@Param("entity") String entity, @Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get usage by fully qualified name
  * Get usage details for an entity identified by fully qualified name.
  * Note, this is equivalent to the other <code>getEntityUsageByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param entity Entity type for which usage is requested (required)
              * @param fqn Fully qualified name of the entity that uniquely identifies an entity (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>days - Usage for number of days going back from the given date (default&#x3D;1, min&#x3D;1, max&#x3D;30) (optional)</li>
          *   <li>date - Usage for number of days going back from this date in ISO 8601 format (default &#x3D; currentDate) (optional)</li>
      *   </ul>
          * @return EntityUsage
      */
      @RequestLine("GET /v1/usage/{entity}/name/{fqn}?days={days}&date={date}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<EntityUsage> getEntityUsageByFQNWithHttpInfo(@Param("entity") String entity, @Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getEntityUsageByFQN</code> method in a fluent style.
   */
  public static class GetEntityUsageByFQNQueryParams extends HashMap<String, Object> {
    public GetEntityUsageByFQNQueryParams days(final Integer value) {
      put("days", EncodingUtils.encode(value));
      return this;
    }
    public GetEntityUsageByFQNQueryParams date(final String value) {
      put("date", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get usage by id
   * Get usage details for an entity identified by &#x60;id&#x60;.
   * @param entity Entity type for which usage is requested (required)
   * @param id Entity id (required)
   * @param days Usage for number of days going back from the given date (default&#x3D;1, min&#x3D;1, max&#x3D;30) (optional)
   * @param date Usage for number of days going back from this date in ISO 8601 format. (default &#x3D; currentDate) (optional)
   * @return EntityUsage
   */
  @RequestLine("GET /v1/usage/{entity}/{id}?days={days}&date={date}")
  @Headers({
    "Accept: application/json",
  })
  EntityUsage getEntityUsageByID(@Param("entity") String entity, @Param("id") String id, @Param("days") Integer days, @Param("date") String date);

  /**
   * Get usage by id
   * Similar to <code>getEntityUsageByID</code> but it also returns the http response headers .
   * Get usage details for an entity identified by &#x60;id&#x60;.
   * @param entity Entity type for which usage is requested (required)
   * @param id Entity id (required)
   * @param days Usage for number of days going back from the given date (default&#x3D;1, min&#x3D;1, max&#x3D;30) (optional)
   * @param date Usage for number of days going back from this date in ISO 8601 format. (default &#x3D; currentDate) (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/usage/{entity}/{id}?days={days}&date={date}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityUsage> getEntityUsageByIDWithHttpInfo(@Param("entity") String entity, @Param("id") String id, @Param("days") Integer days, @Param("date") String date);


  /**
   * Get usage by id
   * Get usage details for an entity identified by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getEntityUsageByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEntityUsageByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param entity Entity type for which usage is requested (required)
   * @param id Entity id (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>days - Usage for number of days going back from the given date (default&#x3D;1, min&#x3D;1, max&#x3D;30) (optional)</li>
   *   <li>date - Usage for number of days going back from this date in ISO 8601 format. (default &#x3D; currentDate) (optional)</li>
   *   </ul>
   * @return EntityUsage
   */
  @RequestLine("GET /v1/usage/{entity}/{id}?days={days}&date={date}")
  @Headers({
  "Accept: application/json",
  })
  EntityUsage getEntityUsageByID(@Param("entity") String entity, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get usage by id
  * Get usage details for an entity identified by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getEntityUsageByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param entity Entity type for which usage is requested (required)
              * @param id Entity id (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>days - Usage for number of days going back from the given date (default&#x3D;1, min&#x3D;1, max&#x3D;30) (optional)</li>
          *   <li>date - Usage for number of days going back from this date in ISO 8601 format. (default &#x3D; currentDate) (optional)</li>
      *   </ul>
          * @return EntityUsage
      */
      @RequestLine("GET /v1/usage/{entity}/{id}?days={days}&date={date}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<EntityUsage> getEntityUsageByIDWithHttpInfo(@Param("entity") String entity, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getEntityUsageByID</code> method in a fluent style.
   */
  public static class GetEntityUsageByIDQueryParams extends HashMap<String, Object> {
    public GetEntityUsageByIDQueryParams days(final Integer value) {
      put("days", EncodingUtils.encode(value));
      return this;
    }
    public GetEntityUsageByIDQueryParams date(final String value) {
      put("date", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Report usage by fully qualified name
   * Report usage information for an entity by name on a given date. System stores last 30 days of usage information. Usage information older than 30 days is deleted.
   * @param entity Entity type for which usage is reported (required)
   * @param fqn Fully qualified name of the entity that uniquely identifies an entity (required)
   * @param dailyCount Usage information a given date (optional)
   * @return EntityUsage
   */
  @RequestLine("POST /v1/usage/{entity}/name/{fqn}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EntityUsage reportEntityUsageWithFQN(@Param("entity") String entity, @Param("fqn") String fqn, DailyCount dailyCount);

  /**
   * Report usage by fully qualified name
   * Similar to <code>reportEntityUsageWithFQN</code> but it also returns the http response headers .
   * Report usage information for an entity by name on a given date. System stores last 30 days of usage information. Usage information older than 30 days is deleted.
   * @param entity Entity type for which usage is reported (required)
   * @param fqn Fully qualified name of the entity that uniquely identifies an entity (required)
   * @param dailyCount Usage information a given date (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/usage/{entity}/name/{fqn}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<EntityUsage> reportEntityUsageWithFQNWithHttpInfo(@Param("entity") String entity, @Param("fqn") String fqn, DailyCount dailyCount);



  /**
   * Report usage by fully qualified name
   * Report usage information for an entity by name on a given date. System stores last 30 days of usage information. Usage information older than 30 days is deleted.
   * @param entity Entity type for which usage is reported (required)
   * @param fqn Fully qualified name of the entity that uniquely identifies an entity (required)
   * @param dailyCount Usage information a given date (optional)
   * @return EntityUsage
   */
  @RequestLine("PUT /v1/usage/{entity}/name/{fqn}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EntityUsage reportEntityUsageWithFQN1(@Param("entity") String entity, @Param("fqn") String fqn, DailyCount dailyCount);

  /**
   * Report usage by fully qualified name
   * Similar to <code>reportEntityUsageWithFQN1</code> but it also returns the http response headers .
   * Report usage information for an entity by name on a given date. System stores last 30 days of usage information. Usage information older than 30 days is deleted.
   * @param entity Entity type for which usage is reported (required)
   * @param fqn Fully qualified name of the entity that uniquely identifies an entity (required)
   * @param dailyCount Usage information a given date (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/usage/{entity}/name/{fqn}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<EntityUsage> reportEntityUsageWithFQN1WithHttpInfo(@Param("entity") String entity, @Param("fqn") String fqn, DailyCount dailyCount);



  /**
   * Report usage
   * Report usage information for an entity on a given date. System stores last 30 days of usage information. Usage information older than 30 days is deleted.
   * @param entity Entity type for which usage is reported (required)
   * @param id Entity id (required)
   * @param dailyCount Usage information a given date (optional)
   * @return EntityUsage
   */
  @RequestLine("POST /v1/usage/{entity}/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EntityUsage reportEntityUsageWithID(@Param("entity") String entity, @Param("id") String id, DailyCount dailyCount);

  /**
   * Report usage
   * Similar to <code>reportEntityUsageWithID</code> but it also returns the http response headers .
   * Report usage information for an entity on a given date. System stores last 30 days of usage information. Usage information older than 30 days is deleted.
   * @param entity Entity type for which usage is reported (required)
   * @param id Entity id (required)
   * @param dailyCount Usage information a given date (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/usage/{entity}/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<EntityUsage> reportEntityUsageWithIDWithHttpInfo(@Param("entity") String entity, @Param("id") String id, DailyCount dailyCount);



  /**
   * Report usage
   * Report usage information for an entity on a given date. System stores last 30 days of usage information. Usage information older than 30 days is deleted.
   * @param entity Entity type for which usage is reported (required)
   * @param id Entity id (required)
   * @param dailyCount Usage information a given date (optional)
   * @return EntityUsage
   */
  @RequestLine("PUT /v1/usage/{entity}/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EntityUsage reportEntityUsageWithID1(@Param("entity") String entity, @Param("id") String id, DailyCount dailyCount);

  /**
   * Report usage
   * Similar to <code>reportEntityUsageWithID1</code> but it also returns the http response headers .
   * Report usage information for an entity on a given date. System stores last 30 days of usage information. Usage information older than 30 days is deleted.
   * @param entity Entity type for which usage is reported (required)
   * @param id Entity id (required)
   * @param dailyCount Usage information a given date (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/usage/{entity}/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<EntityUsage> reportEntityUsageWithID1WithHttpInfo(@Param("entity") String entity, @Param("id") String id, DailyCount dailyCount);


}
