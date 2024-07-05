package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.BulkAssets;
import org.openmetadata.client.model.BulkOperationResult;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateTeam;
import org.openmetadata.client.model.CsvImportResult;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Team;
import org.openmetadata.client.model.TeamList;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface TeamsApi extends ApiClient.Api {


  /**
   * Bulk Add Assets
   * Bulk Add Assets
   * @param name Name of the Team (required)
   * @param bulkAssets  (optional)
   * @return BulkOperationResult
   */
  @RequestLine("PUT /v1/teams/{name}/assets/add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BulkOperationResult bulkAddAssets2(@Param("name") String name, BulkAssets bulkAssets);

  /**
   * Bulk Add Assets
   * Similar to <code>bulkAddAssets2</code> but it also returns the http response headers .
   * Bulk Add Assets
   * @param name Name of the Team (required)
   * @param bulkAssets  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/teams/{name}/assets/add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BulkOperationResult> bulkAddAssets2WithHttpInfo(@Param("name") String name, BulkAssets bulkAssets);



  /**
   * Bulk Remove Assets
   * Bulk Remove Assets
   * @param name Name of the Team (required)
   * @param bulkAssets  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/teams/{name}/assets/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent bulkRemoveAssets2(@Param("name") String name, BulkAssets bulkAssets);

  /**
   * Bulk Remove Assets
   * Similar to <code>bulkRemoveAssets2</code> but it also returns the http response headers .
   * Bulk Remove Assets
   * @param name Name of the Team (required)
   * @param bulkAssets  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/teams/{name}/assets/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> bulkRemoveAssets2WithHttpInfo(@Param("name") String name, BulkAssets bulkAssets);



  /**
   * Update team
   * Create or Update a team.
   * @param createTeam  (optional)
   * @return Team
   */
  @RequestLine("PUT /v1/teams")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Team createOrUpdateTeam(CreateTeam createTeam);

  /**
   * Update team
   * Similar to <code>createOrUpdateTeam</code> but it also returns the http response headers .
   * Create or Update a team.
   * @param createTeam  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/teams")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Team> createOrUpdateTeamWithHttpInfo(CreateTeam createTeam);



  /**
   * Create a team
   * Create a new team.
   * @param createTeam  (optional)
   * @return Team
   */
  @RequestLine("POST /v1/teams")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Team createTeam(CreateTeam createTeam);

  /**
   * Create a team
   * Similar to <code>createTeam</code> but it also returns the http response headers .
   * Create a new team.
   * @param createTeam  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/teams")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Team> createTeamWithHttpInfo(CreateTeam createTeam);



  /**
   * Delete a team by id
   * Delete a team by given &#x60;id&#x60;.
   * @param id Id of the team (required)
   * @param recursive Recursively delete this team and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/teams/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTeam(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a team by id
   * Similar to <code>deleteTeam</code> but it also returns the http response headers .
   * Delete a team by given &#x60;id&#x60;.
   * @param id Id of the team (required)
   * @param recursive Recursively delete this team and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/teams/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTeamWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a team by id
   * Delete a team by given &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteTeam</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTeamQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the team (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this team and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/teams/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTeam(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a team by id
  * Delete a team by given &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteTeam</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the team (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this team and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/teams/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTeamWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTeam</code> method in a fluent style.
   */
  public static class DeleteTeamQueryParams extends HashMap<String, Object> {
    public DeleteTeamQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteTeamQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a team by name
   * Delete a team by given &#x60;name&#x60;.
   * @param name Name of the team (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/teams/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTeamByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a team by name
   * Similar to <code>deleteTeamByName</code> but it also returns the http response headers .
   * Delete a team by given &#x60;name&#x60;.
   * @param name Name of the team (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/teams/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTeamByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a team by name
   * Delete a team by given &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>deleteTeamByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTeamByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the team (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/teams/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTeamByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a team by name
  * Delete a team by given &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>deleteTeamByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the team (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/teams/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTeamByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTeamByName</code> method in a fluent style.
   */
  public static class DeleteTeamByNameQueryParams extends HashMap<String, Object> {
    public DeleteTeamByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Export teams in CSV format
   * 
   * @param name  (required)
   * @return String
   */
  @RequestLine("GET /v1/teams/name/{name}/export")
  @Headers({
    "Accept: application/json",
  })
  String exportTeams(@Param("name") String name);

  /**
   * Export teams in CSV format
   * Similar to <code>exportTeams</code> but it also returns the http response headers .
   * 
   * @param name  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/teams/name/{name}/export")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<String> exportTeamsWithHttpInfo(@Param("name") String name);



  /**
   * Get CSV documentation for team import/export
   * 
   * @param name  (required)
   * @return String
   */
  @RequestLine("GET /v1/teams/documentation/csv")
  @Headers({
    "Accept: application/json",
  })
  String getCsvDocumentation3(@Param("name") String name);

  /**
   * Get CSV documentation for team import/export
   * Similar to <code>getCsvDocumentation3</code> but it also returns the http response headers .
   * 
   * @param name  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/teams/documentation/csv")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<String> getCsvDocumentation3WithHttpInfo(@Param("name") String name);



  /**
   * Get a version of the team
   * Get a version of the team by given &#x60;id&#x60;
   * @param id Id of the team (required)
   * @param version Team version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Team
   */
  @RequestLine("GET /v1/teams/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Team getSpecificTeamVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the team
   * Similar to <code>getSpecificTeamVersion</code> but it also returns the http response headers .
   * Get a version of the team by given &#x60;id&#x60;
   * @param id Id of the team (required)
   * @param version Team version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/teams/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Team> getSpecificTeamVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a team by name
   * Get a team by &#x60;name&#x60;.
   * @param name Name of the team (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Team
   */
  @RequestLine("GET /v1/teams/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Team getTeamByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a team by name
   * Similar to <code>getTeamByFQN</code> but it also returns the http response headers .
   * Get a team by &#x60;name&#x60;.
   * @param name Name of the team (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/teams/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Team> getTeamByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a team by name
   * Get a team by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getTeamByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTeamByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the team (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Team
   */
  @RequestLine("GET /v1/teams/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Team getTeamByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a team by name
  * Get a team by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getTeamByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the team (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Team
      */
      @RequestLine("GET /v1/teams/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Team> getTeamByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTeamByFQN</code> method in a fluent style.
   */
  public static class GetTeamByFQNQueryParams extends HashMap<String, Object> {
    public GetTeamByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetTeamByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a team by id
   * Get a team by &#x60;id&#x60;.
   * @param id Id of the team (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Team
   */
  @RequestLine("GET /v1/teams/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Team getTeamByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a team by id
   * Similar to <code>getTeamByID</code> but it also returns the http response headers .
   * Get a team by &#x60;id&#x60;.
   * @param id Id of the team (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/teams/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Team> getTeamByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a team by id
   * Get a team by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getTeamByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTeamByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the team (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Team
   */
  @RequestLine("GET /v1/teams/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Team getTeamByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a team by id
  * Get a team by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getTeamByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the team (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Team
      */
      @RequestLine("GET /v1/teams/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Team> getTeamByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTeamByID</code> method in a fluent style.
   */
  public static class GetTeamByIDQueryParams extends HashMap<String, Object> {
    public GetTeamByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetTeamByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Import from CSV to create, and update teams.
   * 
   * @param name  (required)
   * @param dryRun Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)
   * @param body  (optional)
   * @return CsvImportResult
   */
  @RequestLine("PUT /v1/teams/name/{name}/import?dryRun={dryRun}")
  @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
  })
  CsvImportResult importTeams(@Param("name") String name, @Param("dryRun") Boolean dryRun, String body);

  /**
   * Import from CSV to create, and update teams.
   * Similar to <code>importTeams</code> but it also returns the http response headers .
   * 
   * @param name  (required)
   * @param dryRun Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/teams/name/{name}/import?dryRun={dryRun}")
  @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
  })
  ApiResponse<CsvImportResult> importTeamsWithHttpInfo(@Param("name") String name, @Param("dryRun") Boolean dryRun, String body);


  /**
   * Import from CSV to create, and update teams.
   * 
   * Note, this is equivalent to the other <code>importTeams</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ImportTeamsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name  (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>dryRun - Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)</li>
   *   </ul>
   * @return CsvImportResult
   */
  @RequestLine("PUT /v1/teams/name/{name}/import?dryRun={dryRun}")
  @Headers({
  "Content-Type: text/plain",
  "Accept: application/json",
  })
  CsvImportResult importTeams(@Param("name") String name, String body, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Import from CSV to create, and update teams.
  * 
  * Note, this is equivalent to the other <code>importTeams</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name  (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>dryRun - Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)</li>
      *   </ul>
          * @return CsvImportResult
      */
      @RequestLine("PUT /v1/teams/name/{name}/import?dryRun={dryRun}")
      @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
      })
   ApiResponse<CsvImportResult> importTeamsWithHttpInfo(@Param("name") String name, String body, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>importTeams</code> method in a fluent style.
   */
  public static class ImportTeamsQueryParams extends HashMap<String, Object> {
    public ImportTeamsQueryParams dryRun(final Boolean value) {
      put("dryRun", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List team versions
   * Get a list of all the versions of a team identified by &#x60;id&#x60;
   * @param id Id of the team (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/teams/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllTeamVersion(@Param("id") UUID id);

  /**
   * List team versions
   * Similar to <code>listAllTeamVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a team identified by &#x60;id&#x60;
   * @param id Id of the team (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/teams/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllTeamVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List teams
   * Get a list of teams. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number of teams returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of teams before this cursor (optional)
   * @param after Returns list of teams after this cursor (optional)
   * @param parentTeam Filter the results by parent team name (optional)
   * @param isJoinable Filter the results by whether the team can be joined by any user or not (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return TeamList
   */
  @RequestLine("GET /v1/teams?fields={fields}&limit={limit}&before={before}&after={after}&parentTeam={parentTeam}&isJoinable={isJoinable}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  TeamList listTeams(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("parentTeam") String parentTeam, @Param("isJoinable") Boolean isJoinable, @Param("include") String include);

  /**
   * List teams
   * Similar to <code>listTeams</code> but it also returns the http response headers .
   * Get a list of teams. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number of teams returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of teams before this cursor (optional)
   * @param after Returns list of teams after this cursor (optional)
   * @param parentTeam Filter the results by parent team name (optional)
   * @param isJoinable Filter the results by whether the team can be joined by any user or not (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/teams?fields={fields}&limit={limit}&before={before}&after={after}&parentTeam={parentTeam}&isJoinable={isJoinable}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TeamList> listTeamsWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("parentTeam") String parentTeam, @Param("isJoinable") Boolean isJoinable, @Param("include") String include);


  /**
   * List teams
   * Get a list of teams. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listTeams</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTeamsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number of teams returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of teams before this cursor (optional)</li>
   *   <li>after - Returns list of teams after this cursor (optional)</li>
   *   <li>parentTeam - Filter the results by parent team name (optional)</li>
   *   <li>isJoinable - Filter the results by whether the team can be joined by any user or not (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return TeamList
   */
  @RequestLine("GET /v1/teams?fields={fields}&limit={limit}&before={before}&after={after}&parentTeam={parentTeam}&isJoinable={isJoinable}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  TeamList listTeams(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List teams
  * Get a list of teams. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listTeams</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number of teams returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of teams before this cursor (optional)</li>
          *   <li>after - Returns list of teams after this cursor (optional)</li>
          *   <li>parentTeam - Filter the results by parent team name (optional)</li>
          *   <li>isJoinable - Filter the results by whether the team can be joined by any user or not (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return TeamList
      */
      @RequestLine("GET /v1/teams?fields={fields}&limit={limit}&before={before}&after={after}&parentTeam={parentTeam}&isJoinable={isJoinable}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TeamList> listTeamsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listTeams</code> method in a fluent style.
   */
  public static class ListTeamsQueryParams extends HashMap<String, Object> {
    public ListTeamsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListTeamsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListTeamsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListTeamsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListTeamsQueryParams parentTeam(final String value) {
      put("parentTeam", EncodingUtils.encode(value));
      return this;
    }
    public ListTeamsQueryParams isJoinable(final Boolean value) {
      put("isJoinable", EncodingUtils.encode(value));
      return this;
    }
    public ListTeamsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List teams with hierarchy
   * Get a list of teams with hierarchy.
   * @param limit Limit the number of teams returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10000)
   * @param isJoinable Filter the results by whether the team can be joined by any user or not (optional)
   * @return TeamList
   */
  @RequestLine("GET /v1/teams/hierarchy?limit={limit}&isJoinable={isJoinable}")
  @Headers({
    "Accept: application/json",
  })
  TeamList listTeamsHierarchy(@Param("limit") Integer limit, @Param("isJoinable") Boolean isJoinable);

  /**
   * List teams with hierarchy
   * Similar to <code>listTeamsHierarchy</code> but it also returns the http response headers .
   * Get a list of teams with hierarchy.
   * @param limit Limit the number of teams returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10000)
   * @param isJoinable Filter the results by whether the team can be joined by any user or not (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/teams/hierarchy?limit={limit}&isJoinable={isJoinable}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TeamList> listTeamsHierarchyWithHttpInfo(@Param("limit") Integer limit, @Param("isJoinable") Boolean isJoinable);


  /**
   * List teams with hierarchy
   * Get a list of teams with hierarchy.
   * Note, this is equivalent to the other <code>listTeamsHierarchy</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTeamsHierarchyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - Limit the number of teams returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10000)</li>
   *   <li>isJoinable - Filter the results by whether the team can be joined by any user or not (optional)</li>
   *   </ul>
   * @return TeamList
   */
  @RequestLine("GET /v1/teams/hierarchy?limit={limit}&isJoinable={isJoinable}")
  @Headers({
  "Accept: application/json",
  })
  TeamList listTeamsHierarchy(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List teams with hierarchy
  * Get a list of teams with hierarchy.
  * Note, this is equivalent to the other <code>listTeamsHierarchy</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>limit - Limit the number of teams returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10000)</li>
          *   <li>isJoinable - Filter the results by whether the team can be joined by any user or not (optional)</li>
      *   </ul>
          * @return TeamList
      */
      @RequestLine("GET /v1/teams/hierarchy?limit={limit}&isJoinable={isJoinable}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TeamList> listTeamsHierarchyWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listTeamsHierarchy</code> method in a fluent style.
   */
  public static class ListTeamsHierarchyQueryParams extends HashMap<String, Object> {
    public ListTeamsHierarchyQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListTeamsHierarchyQueryParams isJoinable(final Boolean value) {
      put("isJoinable", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a team
   * Update an existing team with JsonPatch.
   * @param id Id of the team (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a team Documentation</a>
   */
  @RequestLine("PATCH /v1/teams/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchTeam(@Param("id") UUID id, Object body);

  /**
   * Update a team
   * Similar to <code>patchTeam</code> but it also returns the http response headers .
   * Update an existing team with JsonPatch.
   * @param id Id of the team (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a team Documentation</a>
   */
  @RequestLine("PATCH /v1/teams/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchTeamWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted team
   * Restore a soft deleted team.
   * @param restoreEntity  (optional)
   * @return Team
   */
  @RequestLine("PUT /v1/teams/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Team restore34(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted team
   * Similar to <code>restore34</code> but it also returns the http response headers .
   * Restore a soft deleted team.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/teams/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Team> restore34WithHttpInfo(RestoreEntity restoreEntity);


}
