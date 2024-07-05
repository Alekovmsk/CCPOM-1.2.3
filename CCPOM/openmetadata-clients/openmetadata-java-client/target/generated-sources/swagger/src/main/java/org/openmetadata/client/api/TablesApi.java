package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import java.math.BigDecimal;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.ColumnProfileList;
import org.openmetadata.client.model.CreateCustomMetric;
import org.openmetadata.client.model.CreateTable;
import org.openmetadata.client.model.CreateTableProfile;
import org.openmetadata.client.model.DataModel;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.SystemProfileList;
import org.openmetadata.client.model.Table;
import org.openmetadata.client.model.TableData;
import org.openmetadata.client.model.TableJoins;
import org.openmetadata.client.model.TableList;
import org.openmetadata.client.model.TableProfile;
import org.openmetadata.client.model.TableProfileList;
import org.openmetadata.client.model.TableProfilerConfig;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface TablesApi extends ApiClient.Api {


  /**
   * Add column custom metrics
   * Add column custom metrics.
   * @param id Id of the table (required)
   * @param createCustomMetric  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/tables/{id}/customMetric")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table addCustomMetric(@Param("id") UUID id, CreateCustomMetric createCustomMetric);

  /**
   * Add column custom metrics
   * Similar to <code>addCustomMetric</code> but it also returns the http response headers .
   * Add column custom metrics.
   * @param id Id of the table (required)
   * @param createCustomMetric  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/tables/{id}/customMetric")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> addCustomMetricWithHttpInfo(@Param("id") UUID id, CreateCustomMetric createCustomMetric);



  /**
   * Add data modeling information to a table
   * Add data modeling (such as DBT model) information on how the table was created to the table.
   * @param id Id of the table (required)
   * @param dataModel  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/tables/{id}/dataModel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table addDataModel(@Param("id") String id, DataModel dataModel);

  /**
   * Add data modeling information to a table
   * Similar to <code>addDataModel</code> but it also returns the http response headers .
   * Add data modeling (such as DBT model) information on how the table was created to the table.
   * @param id Id of the table (required)
   * @param dataModel  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/tables/{id}/dataModel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> addDataModelWithHttpInfo(@Param("id") String id, DataModel dataModel);



  /**
   * Add table profile data
   * Add table profile data to the table.
   * @param id Id of the table (required)
   * @param createTableProfile  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/tables/{id}/tableProfile")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table addDataProfiler(@Param("id") UUID id, CreateTableProfile createTableProfile);

  /**
   * Add table profile data
   * Similar to <code>addDataProfiler</code> but it also returns the http response headers .
   * Add table profile data to the table.
   * @param id Id of the table (required)
   * @param createTableProfile  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/tables/{id}/tableProfile")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> addDataProfilerWithHttpInfo(@Param("id") UUID id, CreateTableProfile createTableProfile);



  /**
   * Add table profile config
   * Add table profile config to the table.
   * @param id Id of the table (required)
   * @param tableProfilerConfig  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/tables/{id}/tableProfilerConfig")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table addDataProfilerConfig2(@Param("id") UUID id, TableProfilerConfig tableProfilerConfig);

  /**
   * Add table profile config
   * Similar to <code>addDataProfilerConfig2</code> but it also returns the http response headers .
   * Add table profile config to the table.
   * @param id Id of the table (required)
   * @param tableProfilerConfig  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/tables/{id}/tableProfilerConfig")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> addDataProfilerConfig2WithHttpInfo(@Param("id") UUID id, TableProfilerConfig tableProfilerConfig);



  /**
   * Add a follower
   * Add a user identified by &#x60;userId&#x60; as followed of this table
   * @param id Id of the table (required)
   * @param body Id of the user to be added as follower (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/tables/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent addFollowerToTable(@Param("id") UUID id, String body);

  /**
   * Add a follower
   * Similar to <code>addFollowerToTable</code> but it also returns the http response headers .
   * Add a user identified by &#x60;userId&#x60; as followed of this table
   * @param id Id of the table (required)
   * @param body Id of the user to be added as follower (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/tables/{id}/followers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> addFollowerToTableWithHttpInfo(@Param("id") UUID id, String body);



  /**
   * Add sample data
   * Add sample data to the table.
   * @param id Id of the table (required)
   * @param tableData  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/tables/{id}/sampleData")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table addSampleData(@Param("id") UUID id, TableData tableData);

  /**
   * Add sample data
   * Similar to <code>addSampleData</code> but it also returns the http response headers .
   * Add sample data to the table.
   * @param id Id of the table (required)
   * @param tableData  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/tables/{id}/sampleData")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> addSampleDataWithHttpInfo(@Param("id") UUID id, TableData tableData);



  /**
   * Add table join information
   * Add information about other tables that this table is joined with. Join information can only be added for the last 30 days starting today.
   * @param id Id of the table (required)
   * @param tableJoins  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/tables/{id}/joins")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table addTableJoinInfo(@Param("id") UUID id, TableJoins tableJoins);

  /**
   * Add table join information
   * Similar to <code>addTableJoinInfo</code> but it also returns the http response headers .
   * Add information about other tables that this table is joined with. Join information can only be added for the last 30 days starting today.
   * @param id Id of the table (required)
   * @param tableJoins  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/tables/{id}/joins")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> addTableJoinInfoWithHttpInfo(@Param("id") UUID id, TableJoins tableJoins);



  /**
   * Create or update a table
   * Create a table, if it does not exist. If a table already exists, update the table.
   * @param createTable  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/tables")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table createOrUpdateTable(CreateTable createTable);

  /**
   * Create or update a table
   * Similar to <code>createOrUpdateTable</code> but it also returns the http response headers .
   * Create a table, if it does not exist. If a table already exists, update the table.
   * @param createTable  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/tables")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> createOrUpdateTableWithHttpInfo(CreateTable createTable);



  /**
   * Create a table
   * Create a new table under an existing &#x60;database&#x60;.
   * @param createTable  (optional)
   * @return Table
   */
  @RequestLine("POST /v1/tables")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table createTable(CreateTable createTable);

  /**
   * Create a table
   * Similar to <code>createTable</code> but it also returns the http response headers .
   * Create a new table under an existing &#x60;database&#x60;.
   * @param createTable  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/tables")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> createTableWithHttpInfo(CreateTable createTable);



  /**
   * Delete custom metric from a column
   * Delete a custom metric from a column.
   * @param id Id of the table (required)
   * @param columnName column of the table (required)
   * @param customMetricName column Test Type (required)
   * @return Table
   */
  @RequestLine("DELETE /v1/tables/{id}/customMetric/{columnName}/{customMetricName}")
  @Headers({
    "Accept: application/json",
  })
  Table deleteCustomMetric(@Param("id") UUID id, @Param("columnName") String columnName, @Param("customMetricName") String customMetricName);

  /**
   * Delete custom metric from a column
   * Similar to <code>deleteCustomMetric</code> but it also returns the http response headers .
   * Delete a custom metric from a column.
   * @param id Id of the table (required)
   * @param columnName column of the table (required)
   * @param customMetricName column Test Type (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/tables/{id}/customMetric/{columnName}/{customMetricName}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Table> deleteCustomMetricWithHttpInfo(@Param("id") UUID id, @Param("columnName") String columnName, @Param("customMetricName") String customMetricName);



  /**
   * Delete table profile data
   * Delete table profile data to the table.
   * @param fqn FQN of the table or column (required)
   * @param entityType type of the entity table or column (required)
   * @param timestamp Timestamp of the table profile (required)
   * @return TableProfile
   */
  @RequestLine("DELETE /v1/tables/{fqn}/{entityType}/{timestamp}/profile")
  @Headers({
    "Accept: application/json",
  })
  TableProfile deleteDataProfiler(@Param("fqn") String fqn, @Param("entityType") String entityType, @Param("timestamp") Long timestamp);

  /**
   * Delete table profile data
   * Similar to <code>deleteDataProfiler</code> but it also returns the http response headers .
   * Delete table profile data to the table.
   * @param fqn FQN of the table or column (required)
   * @param entityType type of the entity table or column (required)
   * @param timestamp Timestamp of the table profile (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/tables/{fqn}/{entityType}/{timestamp}/profile")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TableProfile> deleteDataProfilerWithHttpInfo(@Param("fqn") String fqn, @Param("entityType") String entityType, @Param("timestamp") Long timestamp);



  /**
   * Delete table profiler config
   * delete table profile config to the table.
   * @param id Id of the table (required)
   * @return Table
   */
  @RequestLine("DELETE /v1/tables/{id}/tableProfilerConfig")
  @Headers({
    "Accept: application/json",
  })
  Table deleteDataProfilerConfig2(@Param("id") UUID id);

  /**
   * Delete table profiler config
   * Similar to <code>deleteDataProfilerConfig2</code> but it also returns the http response headers .
   * delete table profile config to the table.
   * @param id Id of the table (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/tables/{id}/tableProfilerConfig")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Table> deleteDataProfilerConfig2WithHttpInfo(@Param("id") UUID id);



  /**
   * Remove a follower
   * Remove the user identified &#x60;userId&#x60; as a follower of the table.
   * @param id Id of the table (required)
   * @param userId Id of the user being removed as follower (required)
   * @return ChangeEvent
   */
  @RequestLine("DELETE /v1/tables/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ChangeEvent deleteFollower1(@Param("id") UUID id, @Param("userId") String userId);

  /**
   * Remove a follower
   * Similar to <code>deleteFollower1</code> but it also returns the http response headers .
   * Remove the user identified &#x60;userId&#x60; as a follower of the table.
   * @param id Id of the table (required)
   * @param userId Id of the user being removed as follower (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/tables/{id}/followers/{userId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> deleteFollower1WithHttpInfo(@Param("id") UUID id, @Param("userId") String userId);



  /**
   * Delete sample data
   * Delete sample data from the table.
   * @param id Id of the table (required)
   * @return Table
   */
  @RequestLine("DELETE /v1/tables/{id}/sampleData")
  @Headers({
    "Accept: application/json",
  })
  Table deleteSampleData(@Param("id") UUID id);

  /**
   * Delete sample data
   * Similar to <code>deleteSampleData</code> but it also returns the http response headers .
   * Delete sample data from the table.
   * @param id Id of the table (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v1/tables/{id}/sampleData")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Table> deleteSampleDataWithHttpInfo(@Param("id") UUID id);



  /**
   * Delete a table by Id
   * Delete a table by &#x60;Id&#x60;.
   * @param id Id of the table (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/tables/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTable(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a table by Id
   * Similar to <code>deleteTable</code> but it also returns the http response headers .
   * Delete a table by &#x60;Id&#x60;.
   * @param id Id of the table (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/tables/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTableWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a table by Id
   * Delete a table by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deleteTable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the table (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/tables/{id}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTable(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a table by Id
  * Delete a table by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deleteTable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the table (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/tables/{id}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTableWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTable</code> method in a fluent style.
   */
  public static class DeleteTableQueryParams extends HashMap<String, Object> {
    public DeleteTableQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteTableQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a table by fully qualified name
   * Delete a table by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Name of the table (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/tables/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTable1(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a table by fully qualified name
   * Similar to <code>deleteTable1</code> but it also returns the http response headers .
   * Delete a table by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Name of the table (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/tables/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTable1WithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a table by fully qualified name
   * Delete a table by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteTable1</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTable1QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Name of the table (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/tables/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTable1(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a table by fully qualified name
  * Delete a table by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteTable1</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Name of the table (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/tables/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTable1WithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTable1</code> method in a fluent style.
   */
  public static class DeleteTable1QueryParams extends HashMap<String, Object> {
    public DeleteTable1QueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteTable1QueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get table profile config
   * Get table profile config to the table.
   * @param id Id of the table (required)
   * @return Table
   */
  @RequestLine("GET /v1/tables/{id}/tableProfilerConfig")
  @Headers({
    "Accept: application/json",
  })
  Table getDataProfilerConfig2(@Param("id") UUID id);

  /**
   * Get table profile config
   * Similar to <code>getDataProfilerConfig2</code> but it also returns the http response headers .
   * Get table profile config to the table.
   * @param id Id of the table (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tables/{id}/tableProfilerConfig")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Table> getDataProfilerConfig2WithHttpInfo(@Param("id") UUID id);



  /**
   * Get sample data
   * Get sample data from the table.
   * @param id Id of the table (required)
   * @return Table
   */
  @RequestLine("GET /v1/tables/{id}/sampleData")
  @Headers({
    "Accept: application/json",
  })
  Table getSampleData(@Param("id") UUID id);

  /**
   * Get sample data
   * Similar to <code>getSampleData</code> but it also returns the http response headers .
   * Get sample data from the table.
   * @param id Id of the table (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tables/{id}/sampleData")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Table> getSampleDataWithHttpInfo(@Param("id") UUID id);



  /**
   * Get a version of the table
   * Get a version of the table by given &#x60;Id&#x60;
   * @param id Table Id (required)
   * @param version Table version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Table
   */
  @RequestLine("GET /v1/tables/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Table getSpecificDatabaseVersion1(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the table
   * Similar to <code>getSpecificDatabaseVersion1</code> but it also returns the http response headers .
   * Get a version of the table by given &#x60;Id&#x60;
   * @param id Table Id (required)
   * @param version Table version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tables/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Table> getSpecificDatabaseVersion1WithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a table by fully qualified name
   * Get a table by fully qualified table name.
   * @param fqn Fully qualified name of the table (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Table
   */
  @RequestLine("GET /v1/tables/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Table getTableByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a table by fully qualified name
   * Similar to <code>getTableByFQN</code> but it also returns the http response headers .
   * Get a table by fully qualified table name.
   * @param fqn Fully qualified name of the table (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tables/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Table> getTableByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a table by fully qualified name
   * Get a table by fully qualified table name.
   * Note, this is equivalent to the other <code>getTableByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTableByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the table (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Table
   */
  @RequestLine("GET /v1/tables/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Table getTableByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a table by fully qualified name
  * Get a table by fully qualified table name.
  * Note, this is equivalent to the other <code>getTableByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the table (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Table
      */
      @RequestLine("GET /v1/tables/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Table> getTableByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTableByFQN</code> method in a fluent style.
   */
  public static class GetTableByFQNQueryParams extends HashMap<String, Object> {
    public GetTableByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetTableByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a table by Id
   * Get a table by &#x60;Id&#x60;
   * @param id table Id (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Table
   */
  @RequestLine("GET /v1/tables/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Table getTableByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a table by Id
   * Similar to <code>getTableByID</code> but it also returns the http response headers .
   * Get a table by &#x60;Id&#x60;
   * @param id table Id (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tables/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Table> getTableByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a table by Id
   * Get a table by &#x60;Id&#x60;
   * Note, this is equivalent to the other <code>getTableByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTableByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id table Id (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Table
   */
  @RequestLine("GET /v1/tables/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Table getTableByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a table by Id
  * Get a table by &#x60;Id&#x60;
  * Note, this is equivalent to the other <code>getTableByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id table Id (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Table
      */
      @RequestLine("GET /v1/tables/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Table> getTableByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTableByID</code> method in a fluent style.
   */
  public static class GetTableByIDQueryParams extends HashMap<String, Object> {
    public GetTableByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetTableByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get the latest table profile
   * Get the latest table and column profile 
   * @param fqn FQN of the table or column (required)
   * @return Table
   */
  @RequestLine("GET /v1/tables/{fqn}/tableProfile/latest")
  @Headers({
    "Accept: application/json",
  })
  Table getTheLatestTableAndColumnProfile(@Param("fqn") String fqn);

  /**
   * Get the latest table profile
   * Similar to <code>getTheLatestTableAndColumnProfile</code> but it also returns the http response headers .
   * Get the latest table and column profile 
   * @param fqn FQN of the table or column (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tables/{fqn}/tableProfile/latest")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Table> getTheLatestTableAndColumnProfileWithHttpInfo(@Param("fqn") String fqn);



  /**
   * List table versions
   * Get a list of all the versions of a table identified by &#x60;Id&#x60;
   * @param id Table Id (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/tables/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllTableVersion(@Param("id") String id);

  /**
   * List table versions
   * Similar to <code>listAllTableVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a table identified by &#x60;Id&#x60;
   * @param id Table Id (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tables/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllTableVersionWithHttpInfo(@Param("id") String id);



  /**
   * List of column profiles
   * Get a list of all the column profiles for the given table fqn, optionally filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fqn FQN of the column (required)
   * @param startTs Filter table/column profiles after the given start timestamp (required)
   * @param endTs Filter table/column profiles before the given end timestamp (required)
   * @return ColumnProfileList
   */
  @RequestLine("GET /v1/tables/{fqn}/columnProfile?startTs={startTs}&endTs={endTs}")
  @Headers({
    "Accept: application/json",
  })
  ColumnProfileList listColumnProfiles(@Param("fqn") String fqn, @Param("startTs") BigDecimal startTs, @Param("endTs") BigDecimal endTs);

  /**
   * List of column profiles
   * Similar to <code>listColumnProfiles</code> but it also returns the http response headers .
   * Get a list of all the column profiles for the given table fqn, optionally filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fqn FQN of the column (required)
   * @param startTs Filter table/column profiles after the given start timestamp (required)
   * @param endTs Filter table/column profiles before the given end timestamp (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tables/{fqn}/columnProfile?startTs={startTs}&endTs={endTs}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ColumnProfileList> listColumnProfilesWithHttpInfo(@Param("fqn") String fqn, @Param("startTs") BigDecimal startTs, @Param("endTs") BigDecimal endTs);


  /**
   * List of column profiles
   * Get a list of all the column profiles for the given table fqn, optionally filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listColumnProfiles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListColumnProfilesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn FQN of the column (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTs - Filter table/column profiles after the given start timestamp (required)</li>
   *   <li>endTs - Filter table/column profiles before the given end timestamp (required)</li>
   *   </ul>
   * @return ColumnProfileList
   */
  @RequestLine("GET /v1/tables/{fqn}/columnProfile?startTs={startTs}&endTs={endTs}")
  @Headers({
  "Accept: application/json",
  })
  ColumnProfileList listColumnProfiles(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List of column profiles
  * Get a list of all the column profiles for the given table fqn, optionally filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listColumnProfiles</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn FQN of the column (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>startTs - Filter table/column profiles after the given start timestamp (required)</li>
          *   <li>endTs - Filter table/column profiles before the given end timestamp (required)</li>
      *   </ul>
          * @return ColumnProfileList
      */
      @RequestLine("GET /v1/tables/{fqn}/columnProfile?startTs={startTs}&endTs={endTs}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ColumnProfileList> listColumnProfilesWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listColumnProfiles</code> method in a fluent style.
   */
  public static class ListColumnProfilesQueryParams extends HashMap<String, Object> {
    public ListColumnProfilesQueryParams startTs(final BigDecimal value) {
      put("startTs", EncodingUtils.encode(value));
      return this;
    }
    public ListColumnProfilesQueryParams endTs(final BigDecimal value) {
      put("endTs", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List of table profiles
   * Get a list of all the table profiles for the given table fqn, optionally filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fqn FQN of the table or column (required)
   * @param startTs Filter table/column profiles after the given start timestamp (optional)
   * @param endTs Filter table/column profiles before the given end timestamp (optional)
   * @return TableProfileList
   */
  @RequestLine("GET /v1/tables/{fqn}/tableProfile?startTs={startTs}&endTs={endTs}")
  @Headers({
    "Accept: application/json",
  })
  TableProfileList listProfiles(@Param("fqn") String fqn, @Param("startTs") BigDecimal startTs, @Param("endTs") BigDecimal endTs);

  /**
   * List of table profiles
   * Similar to <code>listProfiles</code> but it also returns the http response headers .
   * Get a list of all the table profiles for the given table fqn, optionally filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fqn FQN of the table or column (required)
   * @param startTs Filter table/column profiles after the given start timestamp (optional)
   * @param endTs Filter table/column profiles before the given end timestamp (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tables/{fqn}/tableProfile?startTs={startTs}&endTs={endTs}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TableProfileList> listProfilesWithHttpInfo(@Param("fqn") String fqn, @Param("startTs") BigDecimal startTs, @Param("endTs") BigDecimal endTs);


  /**
   * List of table profiles
   * Get a list of all the table profiles for the given table fqn, optionally filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listProfiles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListProfilesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn FQN of the table or column (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTs - Filter table/column profiles after the given start timestamp (optional)</li>
   *   <li>endTs - Filter table/column profiles before the given end timestamp (optional)</li>
   *   </ul>
   * @return TableProfileList
   */
  @RequestLine("GET /v1/tables/{fqn}/tableProfile?startTs={startTs}&endTs={endTs}")
  @Headers({
  "Accept: application/json",
  })
  TableProfileList listProfiles(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List of table profiles
  * Get a list of all the table profiles for the given table fqn, optionally filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listProfiles</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn FQN of the table or column (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>startTs - Filter table/column profiles after the given start timestamp (optional)</li>
          *   <li>endTs - Filter table/column profiles before the given end timestamp (optional)</li>
      *   </ul>
          * @return TableProfileList
      */
      @RequestLine("GET /v1/tables/{fqn}/tableProfile?startTs={startTs}&endTs={endTs}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TableProfileList> listProfilesWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listProfiles</code> method in a fluent style.
   */
  public static class ListProfilesQueryParams extends HashMap<String, Object> {
    public ListProfilesQueryParams startTs(final BigDecimal value) {
      put("startTs", EncodingUtils.encode(value));
      return this;
    }
    public ListProfilesQueryParams endTs(final BigDecimal value) {
      put("endTs", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List of system profiles
   * Get a list of all the system profiles for the given table fqn, filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fqn FQN of the table (required)
   * @param startTs Filter system profiles after the given start timestamp (required)
   * @param endTs Filter system profiles before the given end timestamp (required)
   * @return SystemProfileList
   */
  @RequestLine("GET /v1/tables/{fqn}/systemProfile?startTs={startTs}&endTs={endTs}")
  @Headers({
    "Accept: application/json",
  })
  SystemProfileList listSystemProfiles(@Param("fqn") String fqn, @Param("startTs") BigDecimal startTs, @Param("endTs") BigDecimal endTs);

  /**
   * List of system profiles
   * Similar to <code>listSystemProfiles</code> but it also returns the http response headers .
   * Get a list of all the system profiles for the given table fqn, filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fqn FQN of the table (required)
   * @param startTs Filter system profiles after the given start timestamp (required)
   * @param endTs Filter system profiles before the given end timestamp (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tables/{fqn}/systemProfile?startTs={startTs}&endTs={endTs}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SystemProfileList> listSystemProfilesWithHttpInfo(@Param("fqn") String fqn, @Param("startTs") BigDecimal startTs, @Param("endTs") BigDecimal endTs);


  /**
   * List of system profiles
   * Get a list of all the system profiles for the given table fqn, filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listSystemProfiles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListSystemProfilesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn FQN of the table (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTs - Filter system profiles after the given start timestamp (required)</li>
   *   <li>endTs - Filter system profiles before the given end timestamp (required)</li>
   *   </ul>
   * @return SystemProfileList
   */
  @RequestLine("GET /v1/tables/{fqn}/systemProfile?startTs={startTs}&endTs={endTs}")
  @Headers({
  "Accept: application/json",
  })
  SystemProfileList listSystemProfiles(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List of system profiles
  * Get a list of all the system profiles for the given table fqn, filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listSystemProfiles</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn FQN of the table (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>startTs - Filter system profiles after the given start timestamp (required)</li>
          *   <li>endTs - Filter system profiles before the given end timestamp (required)</li>
      *   </ul>
          * @return SystemProfileList
      */
      @RequestLine("GET /v1/tables/{fqn}/systemProfile?startTs={startTs}&endTs={endTs}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SystemProfileList> listSystemProfilesWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listSystemProfiles</code> method in a fluent style.
   */
  public static class ListSystemProfilesQueryParams extends HashMap<String, Object> {
    public ListSystemProfilesQueryParams startTs(final BigDecimal value) {
      put("startTs", EncodingUtils.encode(value));
      return this;
    }
    public ListSystemProfilesQueryParams endTs(final BigDecimal value) {
      put("endTs", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List tables
   * Get a list of tables, optionally filtered by &#x60;database&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param database Filter tables by database fully qualified name (optional)
   * @param databaseSchema Filter tables by databaseSchema fully qualified name (optional)
   * @param includeEmptyTestSuite Include tables with an empty test suite (i.e. no test cases have been created for this table). Default to true (optional, default to true)
   * @param limit Limit the number tables returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of tables before this cursor (optional)
   * @param after Returns list of tables after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return TableList
   */
  @RequestLine("GET /v1/tables?fields={fields}&database={database}&databaseSchema={databaseSchema}&includeEmptyTestSuite={includeEmptyTestSuite}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  TableList listTables(@Param("fields") String fields, @Param("database") String database, @Param("databaseSchema") String databaseSchema, @Param("includeEmptyTestSuite") Boolean includeEmptyTestSuite, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List tables
   * Similar to <code>listTables</code> but it also returns the http response headers .
   * Get a list of tables, optionally filtered by &#x60;database&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param database Filter tables by database fully qualified name (optional)
   * @param databaseSchema Filter tables by databaseSchema fully qualified name (optional)
   * @param includeEmptyTestSuite Include tables with an empty test suite (i.e. no test cases have been created for this table). Default to true (optional, default to true)
   * @param limit Limit the number tables returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of tables before this cursor (optional)
   * @param after Returns list of tables after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tables?fields={fields}&database={database}&databaseSchema={databaseSchema}&includeEmptyTestSuite={includeEmptyTestSuite}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TableList> listTablesWithHttpInfo(@Param("fields") String fields, @Param("database") String database, @Param("databaseSchema") String databaseSchema, @Param("includeEmptyTestSuite") Boolean includeEmptyTestSuite, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List tables
   * Get a list of tables, optionally filtered by &#x60;database&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listTables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>database - Filter tables by database fully qualified name (optional)</li>
   *   <li>databaseSchema - Filter tables by databaseSchema fully qualified name (optional)</li>
   *   <li>includeEmptyTestSuite - Include tables with an empty test suite (i.e. no test cases have been created for this table). Default to true (optional, default to true)</li>
   *   <li>limit - Limit the number tables returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)</li>
   *   <li>before - Returns list of tables before this cursor (optional)</li>
   *   <li>after - Returns list of tables after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return TableList
   */
  @RequestLine("GET /v1/tables?fields={fields}&database={database}&databaseSchema={databaseSchema}&includeEmptyTestSuite={includeEmptyTestSuite}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  TableList listTables(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List tables
  * Get a list of tables, optionally filtered by &#x60;database&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listTables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>database - Filter tables by database fully qualified name (optional)</li>
          *   <li>databaseSchema - Filter tables by databaseSchema fully qualified name (optional)</li>
          *   <li>includeEmptyTestSuite - Include tables with an empty test suite (i.e. no test cases have been created for this table). Default to true (optional, default to true)</li>
          *   <li>limit - Limit the number tables returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)</li>
          *   <li>before - Returns list of tables before this cursor (optional)</li>
          *   <li>after - Returns list of tables after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return TableList
      */
      @RequestLine("GET /v1/tables?fields={fields}&database={database}&databaseSchema={databaseSchema}&includeEmptyTestSuite={includeEmptyTestSuite}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TableList> listTablesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listTables</code> method in a fluent style.
   */
  public static class ListTablesQueryParams extends HashMap<String, Object> {
    public ListTablesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListTablesQueryParams database(final String value) {
      put("database", EncodingUtils.encode(value));
      return this;
    }
    public ListTablesQueryParams databaseSchema(final String value) {
      put("databaseSchema", EncodingUtils.encode(value));
      return this;
    }
    public ListTablesQueryParams includeEmptyTestSuite(final Boolean value) {
      put("includeEmptyTestSuite", EncodingUtils.encode(value));
      return this;
    }
    public ListTablesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListTablesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListTablesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListTablesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a table
   * Update an existing table using JsonPatch.
   * @param id Id of the table (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a table Documentation</a>
   */
  @RequestLine("PATCH /v1/tables/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchTable(@Param("id") UUID id, Object body);

  /**
   * Update a table
   * Similar to <code>patchTable</code> but it also returns the http response headers .
   * Update an existing table using JsonPatch.
   * @param id Id of the table (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a table Documentation</a>
   */
  @RequestLine("PATCH /v1/tables/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchTableWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted table
   * Restore a soft deleted table.
   * @param restoreEntity  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/tables/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table restore10(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted table
   * Similar to <code>restore10</code> but it also returns the http response headers .
   * Restore a soft deleted table.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/tables/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> restore10WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/tables/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity7(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity7</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/tables/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity7WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);


}
