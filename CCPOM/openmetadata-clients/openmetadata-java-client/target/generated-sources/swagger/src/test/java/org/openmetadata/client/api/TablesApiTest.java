package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TablesApi
 */
class TablesApiTest {

    private TablesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(TablesApi.class);
    }

    
    /**
     * Add column custom metrics
     *
     * Add column custom metrics.
     */
    @Test
    void addCustomMetricTest() {
        UUID id = null;
        CreateCustomMetric createCustomMetric = null;
        // Table response = api.addCustomMetric(id, createCustomMetric);

        // TODO: test validations
    }

    
    /**
     * Add data modeling information to a table
     *
     * Add data modeling (such as DBT model) information on how the table was created to the table.
     */
    @Test
    void addDataModelTest() {
        String id = null;
        DataModel dataModel = null;
        // Table response = api.addDataModel(id, dataModel);

        // TODO: test validations
    }

    
    /**
     * Add table profile data
     *
     * Add table profile data to the table.
     */
    @Test
    void addDataProfilerTest() {
        UUID id = null;
        CreateTableProfile createTableProfile = null;
        // Table response = api.addDataProfiler(id, createTableProfile);

        // TODO: test validations
    }

    
    /**
     * Add table profile config
     *
     * Add table profile config to the table.
     */
    @Test
    void addDataProfilerConfig2Test() {
        UUID id = null;
        TableProfilerConfig tableProfilerConfig = null;
        // Table response = api.addDataProfilerConfig2(id, tableProfilerConfig);

        // TODO: test validations
    }

    
    /**
     * Add a follower
     *
     * Add a user identified by &#x60;userId&#x60; as followed of this table
     */
    @Test
    void addFollowerToTableTest() {
        UUID id = null;
        String body = null;
        // ChangeEvent response = api.addFollowerToTable(id, body);

        // TODO: test validations
    }

    
    /**
     * Add sample data
     *
     * Add sample data to the table.
     */
    @Test
    void addSampleDataTest() {
        UUID id = null;
        TableData tableData = null;
        // Table response = api.addSampleData(id, tableData);

        // TODO: test validations
    }

    
    /**
     * Add table join information
     *
     * Add information about other tables that this table is joined with. Join information can only be added for the last 30 days starting today.
     */
    @Test
    void addTableJoinInfoTest() {
        UUID id = null;
        TableJoins tableJoins = null;
        // Table response = api.addTableJoinInfo(id, tableJoins);

        // TODO: test validations
    }

    
    /**
     * Create or update a table
     *
     * Create a table, if it does not exist. If a table already exists, update the table.
     */
    @Test
    void createOrUpdateTableTest() {
        CreateTable createTable = null;
        // Table response = api.createOrUpdateTable(createTable);

        // TODO: test validations
    }

    
    /**
     * Create a table
     *
     * Create a new table under an existing &#x60;database&#x60;.
     */
    @Test
    void createTableTest() {
        CreateTable createTable = null;
        // Table response = api.createTable(createTable);

        // TODO: test validations
    }

    
    /**
     * Delete custom metric from a column
     *
     * Delete a custom metric from a column.
     */
    @Test
    void deleteCustomMetricTest() {
        UUID id = null;
        String columnName = null;
        String customMetricName = null;
        // Table response = api.deleteCustomMetric(id, columnName, customMetricName);

        // TODO: test validations
    }

    
    /**
     * Delete table profile data
     *
     * Delete table profile data to the table.
     */
    @Test
    void deleteDataProfilerTest() {
        String fqn = null;
        String entityType = null;
        Long timestamp = null;
        // TableProfile response = api.deleteDataProfiler(fqn, entityType, timestamp);

        // TODO: test validations
    }

    
    /**
     * Delete table profiler config
     *
     * delete table profile config to the table.
     */
    @Test
    void deleteDataProfilerConfig2Test() {
        UUID id = null;
        // Table response = api.deleteDataProfilerConfig2(id);

        // TODO: test validations
    }

    
    /**
     * Remove a follower
     *
     * Remove the user identified &#x60;userId&#x60; as a follower of the table.
     */
    @Test
    void deleteFollower1Test() {
        UUID id = null;
        String userId = null;
        // ChangeEvent response = api.deleteFollower1(id, userId);

        // TODO: test validations
    }

    
    /**
     * Delete sample data
     *
     * Delete sample data from the table.
     */
    @Test
    void deleteSampleDataTest() {
        UUID id = null;
        // Table response = api.deleteSampleData(id);

        // TODO: test validations
    }

    
    /**
     * Delete a table by Id
     *
     * Delete a table by &#x60;Id&#x60;.
     */
    @Test
    void deleteTableTest() {
        UUID id = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteTable(id, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a table by Id
     *
     * Delete a table by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTableTestQueryMap() {
        UUID id = null;
        TablesApi.DeleteTableQueryParams queryParams = new TablesApi.DeleteTableQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteTable(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a table by fully qualified name
     *
     * Delete a table by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteTable1Test() {
        String fqn = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteTable1(fqn, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a table by fully qualified name
     *
     * Delete a table by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTable1TestQueryMap() {
        String fqn = null;
        TablesApi.DeleteTable1QueryParams queryParams = new TablesApi.DeleteTable1QueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteTable1(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get table profile config
     *
     * Get table profile config to the table.
     */
    @Test
    void getDataProfilerConfig2Test() {
        UUID id = null;
        // Table response = api.getDataProfilerConfig2(id);

        // TODO: test validations
    }

    
    /**
     * Get sample data
     *
     * Get sample data from the table.
     */
    @Test
    void getSampleDataTest() {
        UUID id = null;
        // Table response = api.getSampleData(id);

        // TODO: test validations
    }

    
    /**
     * Get a version of the table
     *
     * Get a version of the table by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificDatabaseVersion1Test() {
        UUID id = null;
        String version = null;
        // Table response = api.getSpecificDatabaseVersion1(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a table by fully qualified name
     *
     * Get a table by fully qualified table name.
     */
    @Test
    void getTableByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // Table response = api.getTableByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a table by fully qualified name
     *
     * Get a table by fully qualified table name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTableByFQNTestQueryMap() {
        String fqn = null;
        TablesApi.GetTableByFQNQueryParams queryParams = new TablesApi.GetTableByFQNQueryParams()
            .fields(null)
            .include(null);
        // Table response = api.getTableByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a table by Id
     *
     * Get a table by &#x60;Id&#x60;
     */
    @Test
    void getTableByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Table response = api.getTableByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a table by Id
     *
     * Get a table by &#x60;Id&#x60;
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTableByIDTestQueryMap() {
        UUID id = null;
        TablesApi.GetTableByIDQueryParams queryParams = new TablesApi.GetTableByIDQueryParams()
            .fields(null)
            .include(null);
        // Table response = api.getTableByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get the latest table profile
     *
     * Get the latest table and column profile 
     */
    @Test
    void getTheLatestTableAndColumnProfileTest() {
        String fqn = null;
        // Table response = api.getTheLatestTableAndColumnProfile(fqn);

        // TODO: test validations
    }

    
    /**
     * List table versions
     *
     * Get a list of all the versions of a table identified by &#x60;Id&#x60;
     */
    @Test
    void listAllTableVersionTest() {
        String id = null;
        // EntityHistory response = api.listAllTableVersion(id);

        // TODO: test validations
    }

    
    /**
     * List of column profiles
     *
     * Get a list of all the column profiles for the given table fqn, optionally filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listColumnProfilesTest() {
        String fqn = null;
        BigDecimal startTs = null;
        BigDecimal endTs = null;
        // ColumnProfileList response = api.listColumnProfiles(fqn, startTs, endTs);

        // TODO: test validations
    }

    /**
     * List of column profiles
     *
     * Get a list of all the column profiles for the given table fqn, optionally filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listColumnProfilesTestQueryMap() {
        String fqn = null;
        TablesApi.ListColumnProfilesQueryParams queryParams = new TablesApi.ListColumnProfilesQueryParams()
            .startTs(null)
            .endTs(null);
        // ColumnProfileList response = api.listColumnProfiles(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * List of table profiles
     *
     * Get a list of all the table profiles for the given table fqn, optionally filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listProfilesTest() {
        String fqn = null;
        BigDecimal startTs = null;
        BigDecimal endTs = null;
        // TableProfileList response = api.listProfiles(fqn, startTs, endTs);

        // TODO: test validations
    }

    /**
     * List of table profiles
     *
     * Get a list of all the table profiles for the given table fqn, optionally filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listProfilesTestQueryMap() {
        String fqn = null;
        TablesApi.ListProfilesQueryParams queryParams = new TablesApi.ListProfilesQueryParams()
            .startTs(null)
            .endTs(null);
        // TableProfileList response = api.listProfiles(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * List of system profiles
     *
     * Get a list of all the system profiles for the given table fqn, filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listSystemProfilesTest() {
        String fqn = null;
        BigDecimal startTs = null;
        BigDecimal endTs = null;
        // SystemProfileList response = api.listSystemProfiles(fqn, startTs, endTs);

        // TODO: test validations
    }

    /**
     * List of system profiles
     *
     * Get a list of all the system profiles for the given table fqn, filtered by &#x60;extension&#x60;, &#x60;startTs&#x60; and &#x60;endTs&#x60; of the profile. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listSystemProfilesTestQueryMap() {
        String fqn = null;
        TablesApi.ListSystemProfilesQueryParams queryParams = new TablesApi.ListSystemProfilesQueryParams()
            .startTs(null)
            .endTs(null);
        // SystemProfileList response = api.listSystemProfiles(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * List tables
     *
     * Get a list of tables, optionally filtered by &#x60;database&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listTablesTest() {
        String fields = null;
        String database = null;
        String databaseSchema = null;
        Boolean includeEmptyTestSuite = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // TableList response = api.listTables(fields, database, databaseSchema, includeEmptyTestSuite, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List tables
     *
     * Get a list of tables, optionally filtered by &#x60;database&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listTablesTestQueryMap() {
        TablesApi.ListTablesQueryParams queryParams = new TablesApi.ListTablesQueryParams()
            .fields(null)
            .database(null)
            .databaseSchema(null)
            .includeEmptyTestSuite(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // TableList response = api.listTables(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a table
     *
     * Update an existing table using JsonPatch.
     */
    @Test
    void patchTableTest() {
        UUID id = null;
        Object body = null;
        // api.patchTable(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted table
     *
     * Restore a soft deleted table.
     */
    @Test
    void restore10Test() {
        RestoreEntity restoreEntity = null;
        // Table response = api.restore10(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity7Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity7(id, voteRequest);

        // TODO: test validations
    }

    
}
