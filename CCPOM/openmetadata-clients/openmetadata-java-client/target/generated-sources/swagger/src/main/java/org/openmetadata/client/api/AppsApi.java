package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.App;
import org.openmetadata.client.model.AppList;
import org.openmetadata.client.model.AppMarketPlaceDefinition;
import org.openmetadata.client.model.AppMarketPlaceDefinitionList;
import org.openmetadata.client.model.AppRunList;
import org.openmetadata.client.model.AppRunRecord;
import java.math.BigDecimal;
import org.openmetadata.client.model.CreateApp;
import org.openmetadata.client.model.CreateAppMarketPlaceDefinitionReq;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.ScheduleApplication200Response;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface AppsApi extends ApiClient.Api {


  /**
   * Create a Application
   * Create a application
   * @param createAppMarketPlaceDefinitionReq  (optional)
   * @return AppMarketPlaceDefinition
   */
  @RequestLine("POST /v1/apps/marketplace")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AppMarketPlaceDefinition createApplication(CreateAppMarketPlaceDefinitionReq createAppMarketPlaceDefinitionReq);

  /**
   * Create a Application
   * Similar to <code>createApplication</code> but it also returns the http response headers .
   * Create a application
   * @param createAppMarketPlaceDefinitionReq  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/apps/marketplace")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AppMarketPlaceDefinition> createApplicationWithHttpInfo(CreateAppMarketPlaceDefinitionReq createAppMarketPlaceDefinitionReq);



  /**
   * Create a Application
   * Create a application
   * @param createApp  (optional)
   * @return App
   */
  @RequestLine("POST /v1/apps")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  App createApplication1(CreateApp createApp);

  /**
   * Create a Application
   * Similar to <code>createApplication1</code> but it also returns the http response headers .
   * Create a application
   * @param createApp  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/apps")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<App> createApplication1WithHttpInfo(CreateApp createApp);



  /**
   * Create Or Update App
   * Create or Update App, it it does not exist or update an existing KPI.
   * @param createAppMarketPlaceDefinitionReq  (optional)
   * @return App
   */
  @RequestLine("PUT /v1/apps/marketplace")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  App createOrUpdateApp(CreateAppMarketPlaceDefinitionReq createAppMarketPlaceDefinitionReq);

  /**
   * Create Or Update App
   * Similar to <code>createOrUpdateApp</code> but it also returns the http response headers .
   * Create or Update App, it it does not exist or update an existing KPI.
   * @param createAppMarketPlaceDefinitionReq  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/apps/marketplace")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<App> createOrUpdateAppWithHttpInfo(CreateAppMarketPlaceDefinitionReq createAppMarketPlaceDefinitionReq);



  /**
   * Create Or Update App
   * Create or Update App, it it does not exist or update an existing KPI.
   * @param createApp  (optional)
   * @return App
   */
  @RequestLine("PUT /v1/apps")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  App createOrUpdateApp1(CreateApp createApp);

  /**
   * Create Or Update App
   * Similar to <code>createOrUpdateApp1</code> but it also returns the http response headers .
   * Create or Update App, it it does not exist or update an existing KPI.
   * @param createApp  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/apps")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<App> createOrUpdateApp1WithHttpInfo(CreateApp createApp);



  /**
   * Delete a App by Id
   * Delete a App by &#x60;Id&#x60;.
   * @param id Id of the App (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/apps/marketplace/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteApp(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a App by Id
   * Similar to <code>deleteApp</code> but it also returns the http response headers .
   * Delete a App by &#x60;Id&#x60;.
   * @param id Id of the App (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/apps/marketplace/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteAppWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a App by Id
   * Delete a App by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deleteApp</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAppQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the App (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/apps/marketplace/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteApp(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a App by Id
  * Delete a App by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deleteApp</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the App (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/apps/marketplace/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteAppWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteApp</code> method in a fluent style.
   */
  public static class DeleteAppQueryParams extends HashMap<String, Object> {
    public DeleteAppQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a App by name
   * Delete a App by &#x60;name&#x60;.
   * @param name Name of the App (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/apps/marketplace/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteAppByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a App by name
   * Similar to <code>deleteAppByName</code> but it also returns the http response headers .
   * Delete a App by &#x60;name&#x60;.
   * @param name Name of the App (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/apps/marketplace/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteAppByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a App by name
   * Delete a App by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>deleteAppByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAppByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the App (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/apps/marketplace/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteAppByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a App by name
  * Delete a App by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>deleteAppByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the App (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/apps/marketplace/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteAppByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteAppByName</code> method in a fluent style.
   */
  public static class DeleteAppByNameQueryParams extends HashMap<String, Object> {
    public DeleteAppByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Deploy App to Quartz or Ingestion
   * Deploy App to Quartz or Ingestion.
   * @param name Name of the App (required)
   */
  @RequestLine("POST /v1/apps/deploy/{name}")
  @Headers({
    "Accept: application/json",
  })
  void deployApplicationToQuartzOrIngestion(@Param("name") String name);

  /**
   * Deploy App to Quartz or Ingestion
   * Similar to <code>deployApplicationToQuartzOrIngestion</code> but it also returns the http response headers .
   * Deploy App to Quartz or Ingestion.
   * @param name Name of the App (required)
   */
  @RequestLine("POST /v1/apps/deploy/{name}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deployApplicationToQuartzOrIngestionWithHttpInfo(@Param("name") String name);



  /**
   * Get a app by Id
   * Get a app by &#x60;Id&#x60;.
   * @param id Id of the App (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return AppMarketPlaceDefinition
   */
  @RequestLine("GET /v1/apps/marketplace/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  AppMarketPlaceDefinition get(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a app by Id
   * Similar to <code>get</code> but it also returns the http response headers .
   * Get a app by &#x60;Id&#x60;.
   * @param id Id of the App (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/apps/marketplace/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AppMarketPlaceDefinition> getWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a app by Id
   * Get a app by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>get</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the App (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return AppMarketPlaceDefinition
   */
  @RequestLine("GET /v1/apps/marketplace/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  AppMarketPlaceDefinition get(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a app by Id
  * Get a app by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>get</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the App (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return AppMarketPlaceDefinition
      */
      @RequestLine("GET /v1/apps/marketplace/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AppMarketPlaceDefinition> getWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>get</code> method in a fluent style.
   */
  public static class GetQueryParams extends HashMap<String, Object> {
    public GetQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a app by Id
   * Get a app by &#x60;Id&#x60;.
   * @param id Id of the App (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return App
   */
  @RequestLine("GET /v1/apps/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  App get1(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a app by Id
   * Similar to <code>get1</code> but it also returns the http response headers .
   * Get a app by &#x60;Id&#x60;.
   * @param id Id of the App (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/apps/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<App> get1WithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a app by Id
   * Get a app by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>get1</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Get1QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the App (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return App
   */
  @RequestLine("GET /v1/apps/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  App get1(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a app by Id
  * Get a app by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>get1</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the App (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return App
      */
      @RequestLine("GET /v1/apps/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<App> get1WithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>get1</code> method in a fluent style.
   */
  public static class Get1QueryParams extends HashMap<String, Object> {
    public Get1QueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public Get1QueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a App by name
   * Get a App by &#x60;name&#x60;.
   * @param name Name of the App (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return AppMarketPlaceDefinition
   */
  @RequestLine("GET /v1/apps/marketplace/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  AppMarketPlaceDefinition getAppByName(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a App by name
   * Similar to <code>getAppByName</code> but it also returns the http response headers .
   * Get a App by &#x60;name&#x60;.
   * @param name Name of the App (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/apps/marketplace/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AppMarketPlaceDefinition> getAppByNameWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a App by name
   * Get a App by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getAppByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAppByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the App (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return AppMarketPlaceDefinition
   */
  @RequestLine("GET /v1/apps/marketplace/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  AppMarketPlaceDefinition getAppByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a App by name
  * Get a App by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getAppByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the App (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return AppMarketPlaceDefinition
      */
      @RequestLine("GET /v1/apps/marketplace/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AppMarketPlaceDefinition> getAppByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAppByName</code> method in a fluent style.
   */
  public static class GetAppByNameQueryParams extends HashMap<String, Object> {
    public GetAppByNameQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetAppByNameQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a App by name
   * Get a App by &#x60;name&#x60;.
   * @param name Name of the App (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return App
   */
  @RequestLine("GET /v1/apps/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  App getAppByName1(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a App by name
   * Similar to <code>getAppByName1</code> but it also returns the http response headers .
   * Get a App by &#x60;name&#x60;.
   * @param name Name of the App (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/apps/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<App> getAppByName1WithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a App by name
   * Get a App by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getAppByName1</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAppByName1QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the App (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return App
   */
  @RequestLine("GET /v1/apps/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  App getAppByName1(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a App by name
  * Get a App by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getAppByName1</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the App (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return App
      */
      @RequestLine("GET /v1/apps/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<App> getAppByName1WithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAppByName1</code> method in a fluent style.
   */
  public static class GetAppByName1QueryParams extends HashMap<String, Object> {
    public GetAppByName1QueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetAppByName1QueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve all logs from last ingestion pipeline run for the application
   * Get all logs from last ingestion pipeline run by &#x60;Id&#x60;.
   * @param name Name of the App (required)
   * @param after Returns log chunk after this cursor (optional, default to )
   */
  @RequestLine("GET /v1/apps/name/{name}/logs?after={after}")
  @Headers({
    "Accept: application/json",
  })
  void getLastLogs(@Param("name") String name, @Param("after") String after);

  /**
   * Retrieve all logs from last ingestion pipeline run for the application
   * Similar to <code>getLastLogs</code> but it also returns the http response headers .
   * Get all logs from last ingestion pipeline run by &#x60;Id&#x60;.
   * @param name Name of the App (required)
   * @param after Returns log chunk after this cursor (optional, default to )
   */
  @RequestLine("GET /v1/apps/name/{name}/logs?after={after}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> getLastLogsWithHttpInfo(@Param("name") String name, @Param("after") String after);


  /**
   * Retrieve all logs from last ingestion pipeline run for the application
   * Get all logs from last ingestion pipeline run by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getLastLogs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetLastLogsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the App (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>after - Returns log chunk after this cursor (optional, default to )</li>
   *   </ul>
   */
  @RequestLine("GET /v1/apps/name/{name}/logs?after={after}")
  @Headers({
  "Accept: application/json",
  })
  void getLastLogs(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Retrieve all logs from last ingestion pipeline run for the application
  * Get all logs from last ingestion pipeline run by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getLastLogs</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the App (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>after - Returns log chunk after this cursor (optional, default to )</li>
      *   </ul>
      */
      @RequestLine("GET /v1/apps/name/{name}/logs?after={after}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> getLastLogsWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getLastLogs</code> method in a fluent style.
   */
  public static class GetLastLogsQueryParams extends HashMap<String, Object> {
    public GetLastLogsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the App
   * Get a version of the App by given &#x60;id&#x60;
   * @param id Id of the App (required)
   * @param version KPI version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return App
   */
  @RequestLine("GET /v1/apps/marketplace/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  App getSpecificAppVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the App
   * Similar to <code>getSpecificAppVersion</code> but it also returns the http response headers .
   * Get a version of the App by given &#x60;id&#x60;
   * @param id Id of the App (required)
   * @param version KPI version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/apps/marketplace/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<App> getSpecificAppVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a version of the App
   * Get a version of the App by given &#x60;id&#x60;
   * @param id Id of the App (required)
   * @param version App version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return App
   */
  @RequestLine("GET /v1/apps/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  App getSpecificAppVersion1(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the App
   * Similar to <code>getSpecificAppVersion1</code> but it also returns the http response headers .
   * Get a version of the App by given &#x60;id&#x60;
   * @param id Id of the App (required)
   * @param version App version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/apps/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<App> getSpecificAppVersion1WithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get Latest App Run Record
   * Get a latest applications Run Record.
   * @param name Name of the App (required)
   * @param after Returns log chunk after this cursor (optional, default to )
   * @return AppRunRecord
   */
  @RequestLine("GET /v1/apps/name/{name}/runs/latest?after={after}")
  @Headers({
    "Accept: application/json",
  })
  AppRunRecord latestAppRunRecord(@Param("name") String name, @Param("after") String after);

  /**
   * Get Latest App Run Record
   * Similar to <code>latestAppRunRecord</code> but it also returns the http response headers .
   * Get a latest applications Run Record.
   * @param name Name of the App (required)
   * @param after Returns log chunk after this cursor (optional, default to )
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/apps/name/{name}/runs/latest?after={after}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AppRunRecord> latestAppRunRecordWithHttpInfo(@Param("name") String name, @Param("after") String after);


  /**
   * Get Latest App Run Record
   * Get a latest applications Run Record.
   * Note, this is equivalent to the other <code>latestAppRunRecord</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LatestAppRunRecordQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the App (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>after - Returns log chunk after this cursor (optional, default to )</li>
   *   </ul>
   * @return AppRunRecord
   */
  @RequestLine("GET /v1/apps/name/{name}/runs/latest?after={after}")
  @Headers({
  "Accept: application/json",
  })
  AppRunRecord latestAppRunRecord(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get Latest App Run Record
  * Get a latest applications Run Record.
  * Note, this is equivalent to the other <code>latestAppRunRecord</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the App (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>after - Returns log chunk after this cursor (optional, default to )</li>
      *   </ul>
          * @return AppRunRecord
      */
      @RequestLine("GET /v1/apps/name/{name}/runs/latest?after={after}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AppRunRecord> latestAppRunRecordWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>latestAppRunRecord</code> method in a fluent style.
   */
  public static class LatestAppRunRecordQueryParams extends HashMap<String, Object> {
    public LatestAppRunRecordQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List Installed Application versions
   * Get a list of all the versions of a application identified by &#x60;id&#x60;
   * @param id Id of the app (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/apps/marketplace/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllInstalledApplications(@Param("id") UUID id);

  /**
   * List Installed Application versions
   * Similar to <code>listAllInstalledApplications</code> but it also returns the http response headers .
   * Get a list of all the versions of a application identified by &#x60;id&#x60;
   * @param id Id of the app (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/apps/marketplace/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllInstalledApplicationsWithHttpInfo(@Param("id") UUID id);



  /**
   * List Installed Application versions
   * Get a list of all the versions of a application identified by &#x60;id&#x60;
   * @param id Id of the app (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/apps/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllInstalledApplications1(@Param("id") UUID id);

  /**
   * List Installed Application versions
   * Similar to <code>listAllInstalledApplications1</code> but it also returns the http response headers .
   * Get a list of all the versions of a application identified by &#x60;id&#x60;
   * @param id Id of the app (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/apps/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllInstalledApplications1WithHttpInfo(@Param("id") UUID id);



  /**
   * List App Run Records
   * Get a list of applications Run Record. Use cursor-based pagination to limit the number entries in the list using &#x60;offset&#x60; query params.
   * @param name Name of the App (required)
   * @param limit Limit records. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param offset Offset records. (0 to 1000000, default &#x3D; 0) (optional, default to 0)
   * @param startTs Filter pipeline status after the given start timestamp (optional)
   * @param endTs Filter pipeline status before the given end timestamp (optional)
   * @return AppRunList
   */
  @RequestLine("GET /v1/apps/name/{name}/status?limit={limit}&offset={offset}&startTs={startTs}&endTs={endTs}")
  @Headers({
    "Accept: application/json",
  })
  AppRunList listAppRunRecords(@Param("name") String name, @Param("limit") Integer limit, @Param("offset") Integer offset, @Param("startTs") BigDecimal startTs, @Param("endTs") BigDecimal endTs);

  /**
   * List App Run Records
   * Similar to <code>listAppRunRecords</code> but it also returns the http response headers .
   * Get a list of applications Run Record. Use cursor-based pagination to limit the number entries in the list using &#x60;offset&#x60; query params.
   * @param name Name of the App (required)
   * @param limit Limit records. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param offset Offset records. (0 to 1000000, default &#x3D; 0) (optional, default to 0)
   * @param startTs Filter pipeline status after the given start timestamp (optional)
   * @param endTs Filter pipeline status before the given end timestamp (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/apps/name/{name}/status?limit={limit}&offset={offset}&startTs={startTs}&endTs={endTs}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AppRunList> listAppRunRecordsWithHttpInfo(@Param("name") String name, @Param("limit") Integer limit, @Param("offset") Integer offset, @Param("startTs") BigDecimal startTs, @Param("endTs") BigDecimal endTs);


  /**
   * List App Run Records
   * Get a list of applications Run Record. Use cursor-based pagination to limit the number entries in the list using &#x60;offset&#x60; query params.
   * Note, this is equivalent to the other <code>listAppRunRecords</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAppRunRecordsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the App (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - Limit records. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>offset - Offset records. (0 to 1000000, default &#x3D; 0) (optional, default to 0)</li>
   *   <li>startTs - Filter pipeline status after the given start timestamp (optional)</li>
   *   <li>endTs - Filter pipeline status before the given end timestamp (optional)</li>
   *   </ul>
   * @return AppRunList
   */
  @RequestLine("GET /v1/apps/name/{name}/status?limit={limit}&offset={offset}&startTs={startTs}&endTs={endTs}")
  @Headers({
  "Accept: application/json",
  })
  AppRunList listAppRunRecords(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List App Run Records
  * Get a list of applications Run Record. Use cursor-based pagination to limit the number entries in the list using &#x60;offset&#x60; query params.
  * Note, this is equivalent to the other <code>listAppRunRecords</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the App (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>limit - Limit records. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>offset - Offset records. (0 to 1000000, default &#x3D; 0) (optional, default to 0)</li>
          *   <li>startTs - Filter pipeline status after the given start timestamp (optional)</li>
          *   <li>endTs - Filter pipeline status before the given end timestamp (optional)</li>
      *   </ul>
          * @return AppRunList
      */
      @RequestLine("GET /v1/apps/name/{name}/status?limit={limit}&offset={offset}&startTs={startTs}&endTs={endTs}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AppRunList> listAppRunRecordsWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listAppRunRecords</code> method in a fluent style.
   */
  public static class ListAppRunRecordsQueryParams extends HashMap<String, Object> {
    public ListAppRunRecordsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListAppRunRecordsQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
    public ListAppRunRecordsQueryParams startTs(final BigDecimal value) {
      put("startTs", EncodingUtils.encode(value));
      return this;
    }
    public ListAppRunRecordsQueryParams endTs(final BigDecimal value) {
      put("endTs", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List application
   * Get a list of applications. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number of installed applications returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of tests before this cursor (optional)
   * @param after Returns list of tests after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return AppMarketPlaceDefinitionList
   */
  @RequestLine("GET /v1/apps/marketplace?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  AppMarketPlaceDefinitionList listApplications(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List application
   * Similar to <code>listApplications</code> but it also returns the http response headers .
   * Get a list of applications. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number of installed applications returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of tests before this cursor (optional)
   * @param after Returns list of tests after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/apps/marketplace?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AppMarketPlaceDefinitionList> listApplicationsWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List application
   * Get a list of applications. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listApplications</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListApplicationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number of installed applications returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of tests before this cursor (optional)</li>
   *   <li>after - Returns list of tests after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return AppMarketPlaceDefinitionList
   */
  @RequestLine("GET /v1/apps/marketplace?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  AppMarketPlaceDefinitionList listApplications(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List application
  * Get a list of applications. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listApplications</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number of installed applications returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of tests before this cursor (optional)</li>
          *   <li>after - Returns list of tests after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return AppMarketPlaceDefinitionList
      */
      @RequestLine("GET /v1/apps/marketplace?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AppMarketPlaceDefinitionList> listApplicationsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listApplications</code> method in a fluent style.
   */
  public static class ListApplicationsQueryParams extends HashMap<String, Object> {
    public ListApplicationsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListApplicationsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListApplicationsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListApplicationsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListApplicationsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List installed application
   * Get a list of applications. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number of installed applications returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of tests before this cursor (optional)
   * @param after Returns list of tests after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return AppList
   */
  @RequestLine("GET /v1/apps?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  AppList listInstalledApplications(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List installed application
   * Similar to <code>listInstalledApplications</code> but it also returns the http response headers .
   * Get a list of applications. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number of installed applications returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of tests before this cursor (optional)
   * @param after Returns list of tests after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/apps?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AppList> listInstalledApplicationsWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List installed application
   * Get a list of applications. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listInstalledApplications</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListInstalledApplicationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number of installed applications returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of tests before this cursor (optional)</li>
   *   <li>after - Returns list of tests after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return AppList
   */
  @RequestLine("GET /v1/apps?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  AppList listInstalledApplications(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List installed application
  * Get a list of applications. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listInstalledApplications</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number of installed applications returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of tests before this cursor (optional)</li>
          *   <li>after - Returns list of tests after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return AppList
      */
      @RequestLine("GET /v1/apps?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AppList> listInstalledApplicationsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listInstalledApplications</code> method in a fluent style.
   */
  public static class ListInstalledApplicationsQueryParams extends HashMap<String, Object> {
    public ListInstalledApplicationsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListInstalledApplicationsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListInstalledApplicationsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListInstalledApplicationsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListInstalledApplicationsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Updates a App
   * Update an existing App using JsonPatch.
   * @param id Id of the App (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Updates a App Documentation</a>
   */
  @RequestLine("PATCH /v1/apps/marketplace/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchApplication(@Param("id") UUID id, Object body);

  /**
   * Updates a App
   * Similar to <code>patchApplication</code> but it also returns the http response headers .
   * Update an existing App using JsonPatch.
   * @param id Id of the App (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Updates a App Documentation</a>
   */
  @RequestLine("PATCH /v1/apps/marketplace/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchApplicationWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Updates a App
   * Update an existing App using JsonPatch.
   * @param id Id of the App (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Updates a App Documentation</a>
   */
  @RequestLine("PATCH /v1/apps/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchApplication1(@Param("id") UUID id, Object body);

  /**
   * Updates a App
   * Similar to <code>patchApplication1</code> but it also returns the http response headers .
   * Update an existing App using JsonPatch.
   * @param id Id of the App (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Updates a App Documentation</a>
   */
  @RequestLine("PATCH /v1/apps/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchApplication1WithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted KPI
   * Restore a soft deleted App.
   * @param restoreEntity  (optional)
   * @return AppMarketPlaceDefinition
   */
  @RequestLine("PUT /v1/apps/marketplace/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AppMarketPlaceDefinition restore(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted KPI
   * Similar to <code>restore</code> but it also returns the http response headers .
   * Restore a soft deleted App.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/apps/marketplace/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AppMarketPlaceDefinition> restoreWithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Restore a soft deleted KPI
   * Restore a soft deleted App.
   * @param restoreEntity  (optional)
   * @return App
   */
  @RequestLine("PUT /v1/apps/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  App restore1(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted KPI
   * Similar to <code>restore1</code> but it also returns the http response headers .
   * Restore a soft deleted App.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/apps/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<App> restore1WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Schedule an Application
   * Schedule a application to be run on demand.
   * @param name Name of the App (required)
   * @return ScheduleApplication200Response
   */
  @RequestLine("POST /v1/apps/schedule/{name}")
  @Headers({
    "Accept: application/json",
  })
  ScheduleApplication200Response scheduleApplication(@Param("name") String name);

  /**
   * Schedule an Application
   * Similar to <code>scheduleApplication</code> but it also returns the http response headers .
   * Schedule a application to be run on demand.
   * @param name Name of the App (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/apps/schedule/{name}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ScheduleApplication200Response> scheduleApplicationWithHttpInfo(@Param("name") String name);



  /**
   * Trigger an Application run
   * Trigger a Application run by id.
   * @param name Name of the App (required)
   */
  @RequestLine("POST /v1/apps/trigger/{name}")
  @Headers({
    "Accept: application/json",
  })
  void triggerApplicationRun(@Param("name") String name);

  /**
   * Trigger an Application run
   * Similar to <code>triggerApplicationRun</code> but it also returns the http response headers .
   * Trigger a Application run by id.
   * @param name Name of the App (required)
   */
  @RequestLine("POST /v1/apps/trigger/{name}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> triggerApplicationRunWithHttpInfo(@Param("name") String name);



  /**
   * Delete a App by name
   * Delete a App by &#x60;name&#x60;.
   * @param name Name of the App (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/apps/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void uninstallAppByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a App by name
   * Similar to <code>uninstallAppByName</code> but it also returns the http response headers .
   * Delete a App by &#x60;name&#x60;.
   * @param name Name of the App (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/apps/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> uninstallAppByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a App by name
   * Delete a App by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>uninstallAppByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UninstallAppByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the App (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/apps/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void uninstallAppByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a App by name
  * Delete a App by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>uninstallAppByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the App (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/apps/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> uninstallAppByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>uninstallAppByName</code> method in a fluent style.
   */
  public static class UninstallAppByNameQueryParams extends HashMap<String, Object> {
    public UninstallAppByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a App by Id
   * Delete a App by &#x60;Id&#x60;.
   * @param id Id of the App (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/apps/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void uninstallAppByName1(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a App by Id
   * Similar to <code>uninstallAppByName1</code> but it also returns the http response headers .
   * Delete a App by &#x60;Id&#x60;.
   * @param id Id of the App (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/apps/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> uninstallAppByName1WithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a App by Id
   * Delete a App by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>uninstallAppByName1</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UninstallAppByName1QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the App (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/apps/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void uninstallAppByName1(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a App by Id
  * Delete a App by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>uninstallAppByName1</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the App (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/apps/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> uninstallAppByName1WithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>uninstallAppByName1</code> method in a fluent style.
   */
  public static class UninstallAppByName1QueryParams extends HashMap<String, Object> {
    public UninstallAppByName1QueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }
}
