package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamsApi
 */
class TeamsApiTest {

    private TeamsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(TeamsApi.class);
    }

    
    /**
     * Bulk Add Assets
     *
     * Bulk Add Assets
     */
    @Test
    void bulkAddAssets2Test() {
        String name = null;
        BulkAssets bulkAssets = null;
        // BulkOperationResult response = api.bulkAddAssets2(name, bulkAssets);

        // TODO: test validations
    }

    
    /**
     * Bulk Remove Assets
     *
     * Bulk Remove Assets
     */
    @Test
    void bulkRemoveAssets2Test() {
        String name = null;
        BulkAssets bulkAssets = null;
        // ChangeEvent response = api.bulkRemoveAssets2(name, bulkAssets);

        // TODO: test validations
    }

    
    /**
     * Update team
     *
     * Create or Update a team.
     */
    @Test
    void createOrUpdateTeamTest() {
        CreateTeam createTeam = null;
        // Team response = api.createOrUpdateTeam(createTeam);

        // TODO: test validations
    }

    
    /**
     * Create a team
     *
     * Create a new team.
     */
    @Test
    void createTeamTest() {
        CreateTeam createTeam = null;
        // Team response = api.createTeam(createTeam);

        // TODO: test validations
    }

    
    /**
     * Delete a team by id
     *
     * Delete a team by given &#x60;id&#x60;.
     */
    @Test
    void deleteTeamTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteTeam(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a team by id
     *
     * Delete a team by given &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTeamTestQueryMap() {
        UUID id = null;
        TeamsApi.DeleteTeamQueryParams queryParams = new TeamsApi.DeleteTeamQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteTeam(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a team by name
     *
     * Delete a team by given &#x60;name&#x60;.
     */
    @Test
    void deleteTeamByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteTeamByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a team by name
     *
     * Delete a team by given &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTeamByNameTestQueryMap() {
        String name = null;
        TeamsApi.DeleteTeamByNameQueryParams queryParams = new TeamsApi.DeleteTeamByNameQueryParams()
            .hardDelete(null);
        // api.deleteTeamByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Export teams in CSV format
     *
     * 
     */
    @Test
    void exportTeamsTest() {
        String name = null;
        // String response = api.exportTeams(name);

        // TODO: test validations
    }

    
    /**
     * Get CSV documentation for team import/export
     *
     * 
     */
    @Test
    void getCsvDocumentation3Test() {
        String name = null;
        // String response = api.getCsvDocumentation3(name);

        // TODO: test validations
    }

    
    /**
     * Get a version of the team
     *
     * Get a version of the team by given &#x60;id&#x60;
     */
    @Test
    void getSpecificTeamVersionTest() {
        UUID id = null;
        String version = null;
        // Team response = api.getSpecificTeamVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a team by name
     *
     * Get a team by &#x60;name&#x60;.
     */
    @Test
    void getTeamByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // Team response = api.getTeamByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a team by name
     *
     * Get a team by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTeamByFQNTestQueryMap() {
        String name = null;
        TeamsApi.GetTeamByFQNQueryParams queryParams = new TeamsApi.GetTeamByFQNQueryParams()
            .fields(null)
            .include(null);
        // Team response = api.getTeamByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a team by id
     *
     * Get a team by &#x60;id&#x60;.
     */
    @Test
    void getTeamByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Team response = api.getTeamByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a team by id
     *
     * Get a team by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTeamByIDTestQueryMap() {
        UUID id = null;
        TeamsApi.GetTeamByIDQueryParams queryParams = new TeamsApi.GetTeamByIDQueryParams()
            .fields(null)
            .include(null);
        // Team response = api.getTeamByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Import from CSV to create, and update teams.
     *
     * 
     */
    @Test
    void importTeamsTest() {
        String name = null;
        Boolean dryRun = null;
        String body = null;
        // CsvImportResult response = api.importTeams(name, dryRun, body);

        // TODO: test validations
    }

    /**
     * Import from CSV to create, and update teams.
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void importTeamsTestQueryMap() {
        String name = null;
        String body = null;
        TeamsApi.ImportTeamsQueryParams queryParams = new TeamsApi.ImportTeamsQueryParams()
            .dryRun(null);
        // CsvImportResult response = api.importTeams(name, body, queryParams);

    // TODO: test validations
    }
    
    /**
     * List team versions
     *
     * Get a list of all the versions of a team identified by &#x60;id&#x60;
     */
    @Test
    void listAllTeamVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllTeamVersion(id);

        // TODO: test validations
    }

    
    /**
     * List teams
     *
     * Get a list of teams. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listTeamsTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String parentTeam = null;
        Boolean isJoinable = null;
        String include = null;
        // TeamList response = api.listTeams(fields, limit, before, after, parentTeam, isJoinable, include);

        // TODO: test validations
    }

    /**
     * List teams
     *
     * Get a list of teams. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listTeamsTestQueryMap() {
        TeamsApi.ListTeamsQueryParams queryParams = new TeamsApi.ListTeamsQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .parentTeam(null)
            .isJoinable(null)
            .include(null);
        // TeamList response = api.listTeams(queryParams);

    // TODO: test validations
    }
    
    /**
     * List teams with hierarchy
     *
     * Get a list of teams with hierarchy.
     */
    @Test
    void listTeamsHierarchyTest() {
        Integer limit = null;
        Boolean isJoinable = null;
        // TeamList response = api.listTeamsHierarchy(limit, isJoinable);

        // TODO: test validations
    }

    /**
     * List teams with hierarchy
     *
     * Get a list of teams with hierarchy.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listTeamsHierarchyTestQueryMap() {
        TeamsApi.ListTeamsHierarchyQueryParams queryParams = new TeamsApi.ListTeamsHierarchyQueryParams()
            .limit(null)
            .isJoinable(null);
        // TeamList response = api.listTeamsHierarchy(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a team
     *
     * Update an existing team with JsonPatch.
     */
    @Test
    void patchTeamTest() {
        UUID id = null;
        Object body = null;
        // api.patchTeam(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted team
     *
     * Restore a soft deleted team.
     */
    @Test
    void restore34Test() {
        RestoreEntity restoreEntity = null;
        // Team response = api.restore34(restoreEntity);

        // TODO: test validations
    }

    
}
