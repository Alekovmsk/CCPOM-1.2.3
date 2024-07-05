package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.AddClientCenterToAssetsRequest;
import org.openmetadata.client.model.BulkOperationResult;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.ClientCenter;
import org.openmetadata.client.model.ClientCenterClient;
import org.openmetadata.client.model.ClientCenterClientList;
import org.openmetadata.client.model.ClientCenterList;
import org.openmetadata.client.model.CreateClientCenter;
import org.openmetadata.client.model.CreateClientCenterClient;
import org.openmetadata.client.model.CsvImportResult;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
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
 * API tests for ClientCentersApi
 */
class ClientCentersApiTest {

    private ClientCentersApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(ClientCentersApi.class);
    }

    
    /**
     * Bulk Add ClientCenter Client to Assets
     *
     * Bulk Add ClientCenter Client to Assets
     */
    @Test
    void bulkAddClientCenterClientToAssetsTest() {
        UUID id = null;
        AddClientCenterToAssetsRequest addClientCenterToAssetsRequest = null;
        // BulkOperationResult response = api.bulkAddClientCenterClientToAssets(id, addClientCenterToAssetsRequest);

        // TODO: test validations
    }

    
    /**
     * Bulk Remove ClientCenter Client from Assets
     *
     * Bulk Remove ClientCenter Client from Assets
     */
    @Test
    void bulkRemoveClientCenterClientFromAssetsTest() {
        UUID id = null;
        AddClientCenterToAssetsRequest addClientCenterToAssetsRequest = null;
        // ChangeEvent response = api.bulkRemoveClientCenterClientFromAssets(id, addClientCenterToAssetsRequest);

        // TODO: test validations
    }

    
    /**
     * Create a clientCenter
     *
     * Create a new clientCenter.
     */
    @Test
    void createClientCenterTest() {
        CreateClientCenter createClientCenter = null;
        // ClientCenter response = api.createClientCenter(createClientCenter);

        // TODO: test validations
    }

    
    /**
     * Create a clientCenter client
     *
     * Create a new clientCenter client.
     */
    @Test
    void createClientCenterClientTest() {
        CreateClientCenterClient createClientCenterClient = null;
        // ClientCenterClient response = api.createClientCenterClient(createClientCenterClient);

        // TODO: test validations
    }

    
    /**
     * Create or update a clientCenter
     *
     * Create a new clientCenter, if it does not exist or update an existing clientCenter.
     */
    @Test
    void createOrUpdateClientCenterTest() {
        CreateClientCenter createClientCenter = null;
        // ClientCenter response = api.createOrUpdateClientCenter(createClientCenter);

        // TODO: test validations
    }

    
    /**
     * Create or update a clientCenter client
     *
     * Create a new clientCenter client, if it does not exist or update an existing clientCenter client.
     */
    @Test
    void createOrUpdateClientCenterClientTest() {
        CreateClientCenterClient createClientCenterClient = null;
        // ClientCenterClient response = api.createOrUpdateClientCenterClient(createClientCenterClient);

        // TODO: test validations
    }

    
    /**
     * Delete a clientCenter client by Id
     *
     * Delete a clientCenter client by &#x60;Id&#x60;.
     */
    @Test
    void deleteTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.delete(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a clientCenter client by Id
     *
     * Delete a clientCenter client by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTestQueryMap() {
        UUID id = null;
        ClientCentersApi.DeleteQueryParams queryParams = new ClientCentersApi.DeleteQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.delete(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a clientCenter by Id
     *
     * Delete a clientCenter by &#x60;Id&#x60;.
     */
    @Test
    void deleteClientCenterTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteClientCenter(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a clientCenter by Id
     *
     * Delete a clientCenter by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteClientCenterTestQueryMap() {
        UUID id = null;
        ClientCentersApi.DeleteClientCenterQueryParams queryParams = new ClientCentersApi.DeleteClientCenterQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteClientCenter(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a clientCenter by name
     *
     * Delete a clientCenter by &#x60;name&#x60;.
     */
    @Test
    void deleteClientCenterByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteClientCenterByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a clientCenter by name
     *
     * Delete a clientCenter by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteClientCenterByNameTestQueryMap() {
        String name = null;
        ClientCentersApi.DeleteClientCenterByNameQueryParams queryParams = new ClientCentersApi.DeleteClientCenterByNameQueryParams()
            .hardDelete(null);
        // api.deleteClientCenterByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a clientCenter client by fully qualified name
     *
     * Delete a clientCenter client by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteClientCenterClientByNameTest() {
        String fqn = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteClientCenterClientByName(fqn, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a clientCenter client by fully qualified name
     *
     * Delete a clientCenter client by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteClientCenterClientByNameTestQueryMap() {
        String fqn = null;
        ClientCentersApi.DeleteClientCenterClientByNameQueryParams queryParams = new ClientCentersApi.DeleteClientCenterClientByNameQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteClientCenterClientByName(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Export clientCenter in CSV format
     *
     * 
     */
    @Test
    void exportClientCenterTest() {
        String name = null;
        // String response = api.exportClientCenter(name);

        // TODO: test validations
    }

    
    /**
     * Get a clientCenter by name
     *
     * Get a clientCenter by name.
     */
    @Test
    void getClientCenterByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // ClientCenter response = api.getClientCenterByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a clientCenter by name
     *
     * Get a clientCenter by name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getClientCenterByFQNTestQueryMap() {
        String name = null;
        ClientCentersApi.GetClientCenterByFQNQueryParams queryParams = new ClientCentersApi.GetClientCenterByFQNQueryParams()
            .fields(null)
            .include(null);
        // ClientCenter response = api.getClientCenterByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a clientCenter by Id
     *
     * Get a clientCenter by &#x60;Id&#x60;.
     */
    @Test
    void getClientCenterByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // ClientCenter response = api.getClientCenterByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a clientCenter by Id
     *
     * Get a clientCenter by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getClientCenterByIDTestQueryMap() {
        UUID id = null;
        ClientCentersApi.GetClientCenterByIDQueryParams queryParams = new ClientCentersApi.GetClientCenterByIDQueryParams()
            .fields(null)
            .include(null);
        // ClientCenter response = api.getClientCenterByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a clientCenter client by fully qualified name
     *
     * Get a clientCenter client by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getClientCenterClientByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // ClientCenter response = api.getClientCenterClientByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a clientCenter client by fully qualified name
     *
     * Get a clientCenter client by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getClientCenterClientByFQNTestQueryMap() {
        String fqn = null;
        ClientCentersApi.GetClientCenterClientByFQNQueryParams queryParams = new ClientCentersApi.GetClientCenterClientByFQNQueryParams()
            .fields(null)
            .include(null);
        // ClientCenter response = api.getClientCenterClientByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a clientCenter client by Id
     *
     * Get a clientCenter client by &#x60;Id&#x60;.
     */
    @Test
    void getClientCenterClientByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // ClientCenter response = api.getClientCenterClientByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a clientCenter client by Id
     *
     * Get a clientCenter client by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getClientCenterClientByIDTestQueryMap() {
        UUID id = null;
        ClientCentersApi.GetClientCenterClientByIDQueryParams queryParams = new ClientCentersApi.GetClientCenterClientByIDQueryParams()
            .fields(null)
            .include(null);
        // ClientCenter response = api.getClientCenterClientByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get CSV documentation
     *
     * 
     */
    @Test
    void getCsvDocumentationTest() {
        String name = null;
        // String response = api.getCsvDocumentation(name);

        // TODO: test validations
    }

    
    /**
     * Get a version of the clientCenter client
     *
     * Get a version of the clientCenter client by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificClientCenterClientVersionTest() {
        UUID id = null;
        String version = null;
        // ClientCenter response = api.getSpecificClientCenterClientVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a version of the clientcenters
     *
     * Get a version of the clientCenter by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificClientCenterVersionTest() {
        UUID id = null;
        String version = null;
        // ClientCenter response = api.getSpecificClientCenterVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Import clientCenter clients from CSV to create, and update clientCenter clients
     *
     * 
     */
    @Test
    void importClientCenterTest() {
        String name = null;
        Boolean dryRun = null;
        String body = null;
        // CsvImportResult response = api.importClientCenter(name, dryRun, body);

        // TODO: test validations
    }

    /**
     * Import clientCenter clients from CSV to create, and update clientCenter clients
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void importClientCenterTestQueryMap() {
        String name = null;
        String body = null;
        ClientCentersApi.ImportClientCenterQueryParams queryParams = new ClientCentersApi.ImportClientCenterQueryParams()
            .dryRun(null);
        // CsvImportResult response = api.importClientCenter(name, body, queryParams);

    // TODO: test validations
    }
    
    /**
     * List clientCenter client versions
     *
     * Get a list of all the versions of a clientCenter clients identified by &#x60;id&#x60;
     */
    @Test
    void listAllClientCenterClientVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllClientCenterClientVersion(id);

        // TODO: test validations
    }

    
    /**
     * List clientCenter versions
     *
     * Get a list of all the versions of a clientCenter identified by &#x60;id&#x60;
     */
    @Test
    void listAllClientCenterVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllClientCenterVersion(id);

        // TODO: test validations
    }

    
    /**
     * List clientCenter clients
     *
     * Get a list of clientCenter clients. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listClientCenterClientTest() {
        String clientCenter = null;
        String parent = null;
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // ClientCenterClientList response = api.listClientCenterClient(clientCenter, parent, fields, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List clientCenter clients
     *
     * Get a list of clientCenter clients. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listClientCenterClientTestQueryMap() {
        ClientCentersApi.ListClientCenterClientQueryParams queryParams = new ClientCentersApi.ListClientCenterClientQueryParams()
            .clientCenter(null)
            .parent(null)
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // ClientCenterClientList response = api.listClientCenterClient(queryParams);

    // TODO: test validations
    }
    
    /**
     * List clientcenters
     *
     * Get a list of clientcenters. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listClientCentersTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // ClientCenterList response = api.listClientCenters(fields, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List clientcenters
     *
     * Get a list of clientcenters. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listClientCentersTestQueryMap() {
        ClientCentersApi.ListClientCentersQueryParams queryParams = new ClientCentersApi.ListClientCentersQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // ClientCenterList response = api.listClientCenters(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a clientCenter
     *
     * Update an existing clientCenter using JsonPatch.
     */
    @Test
    void patchClientCenterTest() {
        UUID id = null;
        Object body = null;
        // api.patchClientCenter(id, body);

        // TODO: test validations
    }

    
    /**
     * Update a clientCenter client
     *
     * Update an existing clientCenter client using JsonPatch.
     */
    @Test
    void patchClientCenterClientTest() {
        UUID id = null;
        Object body = null;
        // api.patchClientCenterClient(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted clientCenter client
     *
     * Restore a soft deleted clientCenter client.
     */
    @Test
    void restore4Test() {
        RestoreEntity restoreEntity = null;
        // ClientCenterClient response = api.restore4(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted clientCenter
     *
     * Restore a soft deleted ClientCenter.
     */
    @Test
    void restore5Test() {
        RestoreEntity restoreEntity = null;
        // ClientCenter response = api.restore5(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity1Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity1(id, voteRequest);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity2Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity2(id, voteRequest);

        // TODO: test validations
    }

    
    /**
     * Validate Tags Addition to ClientCenter Client
     *
     * Validate Tags Addition to ClientCenter Client
     */
    @Test
    void validateClientCenterClientTagsAdditionTest() {
        UUID id = null;
        AddClientCenterToAssetsRequest addClientCenterToAssetsRequest = null;
        // BulkOperationResult response = api.validateClientCenterClientTagsAddition(id, addClientCenterToAssetsRequest);

        // TODO: test validations
    }

    
}
