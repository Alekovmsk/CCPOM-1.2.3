package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.AddKnowledgeCenterToAssetsRequest;
import org.openmetadata.client.model.BulkOperationResult;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateKnowledgeCenter;
import org.openmetadata.client.model.CreateKnowledgeCenterDocument;
import org.openmetadata.client.model.CsvImportResult;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.KnowledgeCenter;
import org.openmetadata.client.model.KnowledgeCenterDocument;
import org.openmetadata.client.model.KnowledgeCenterDocumentList;
import org.openmetadata.client.model.KnowledgeCenterList;
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
 * API tests for KnowledgeCentersApi
 */
class KnowledgeCentersApiTest {

    private KnowledgeCentersApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(KnowledgeCentersApi.class);
    }

    
    /**
     * Bulk Add KnowledgeCenter Document to Assets
     *
     * Bulk Add KnowledgeCenter Document to Assets
     */
    @Test
    void bulkAddKnowledgeCenterDocumentToAssetsTest() {
        UUID id = null;
        AddKnowledgeCenterToAssetsRequest addKnowledgeCenterToAssetsRequest = null;
        // BulkOperationResult response = api.bulkAddKnowledgeCenterDocumentToAssets(id, addKnowledgeCenterToAssetsRequest);

        // TODO: test validations
    }

    
    /**
     * Bulk Remove KnowledgeCenter Document from Assets
     *
     * Bulk Remove KnowledgeCenter Document from Assets
     */
    @Test
    void bulkRemoveKnowledgeCenterDocumentFromAssetsTest() {
        UUID id = null;
        AddKnowledgeCenterToAssetsRequest addKnowledgeCenterToAssetsRequest = null;
        // ChangeEvent response = api.bulkRemoveKnowledgeCenterDocumentFromAssets(id, addKnowledgeCenterToAssetsRequest);

        // TODO: test validations
    }

    
    /**
     * Create a knowledgeCenter
     *
     * Create a new knowledgeCenter.
     */
    @Test
    void createKnowledgeCenterTest() {
        CreateKnowledgeCenter createKnowledgeCenter = null;
        // KnowledgeCenter response = api.createKnowledgeCenter(createKnowledgeCenter);

        // TODO: test validations
    }

    
    /**
     * Create a knowledgeCenter document
     *
     * Create a new knowledgeCenter document.
     */
    @Test
    void createKnowledgeCenterDocumentTest() {
        CreateKnowledgeCenterDocument createKnowledgeCenterDocument = null;
        // KnowledgeCenterDocument response = api.createKnowledgeCenterDocument(createKnowledgeCenterDocument);

        // TODO: test validations
    }

    
    /**
     * Create or update a knowledgeCenter
     *
     * Create a new knowledgeCenter, if it does not exist or update an existing knowledgeCenter.
     */
    @Test
    void createOrUpdateKnowledgeCenterTest() {
        CreateKnowledgeCenter createKnowledgeCenter = null;
        // KnowledgeCenter response = api.createOrUpdateKnowledgeCenter(createKnowledgeCenter);

        // TODO: test validations
    }

    
    /**
     * Create or update a knowledgeCenter document
     *
     * Create a new knowledgeCenter document, if it does not exist or update an existing knowledgeCenter document.
     */
    @Test
    void createOrUpdateKnowledgeCenterDocumentTest() {
        CreateKnowledgeCenterDocument createKnowledgeCenterDocument = null;
        // KnowledgeCenterDocument response = api.createOrUpdateKnowledgeCenterDocument(createKnowledgeCenterDocument);

        // TODO: test validations
    }

    
    /**
     * Delete a knowledgeCenter document by Id
     *
     * Delete a knowledgeCenter document by &#x60;Id&#x60;.
     */
    @Test
    void delete2Test() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.delete2(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a knowledgeCenter document by Id
     *
     * Delete a knowledgeCenter document by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void delete2TestQueryMap() {
        UUID id = null;
        KnowledgeCentersApi.Delete2QueryParams queryParams = new KnowledgeCentersApi.Delete2QueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.delete2(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a knowledgeCenter by Id
     *
     * Delete a knowledgeCenter by &#x60;Id&#x60;.
     */
    @Test
    void deleteKnowledgeCenterTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteKnowledgeCenter(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a knowledgeCenter by Id
     *
     * Delete a knowledgeCenter by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteKnowledgeCenterTestQueryMap() {
        UUID id = null;
        KnowledgeCentersApi.DeleteKnowledgeCenterQueryParams queryParams = new KnowledgeCentersApi.DeleteKnowledgeCenterQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteKnowledgeCenter(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a knowledgeCenter by name
     *
     * Delete a knowledgeCenter by &#x60;name&#x60;.
     */
    @Test
    void deleteKnowledgeCenterByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteKnowledgeCenterByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a knowledgeCenter by name
     *
     * Delete a knowledgeCenter by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteKnowledgeCenterByNameTestQueryMap() {
        String name = null;
        KnowledgeCentersApi.DeleteKnowledgeCenterByNameQueryParams queryParams = new KnowledgeCentersApi.DeleteKnowledgeCenterByNameQueryParams()
            .hardDelete(null);
        // api.deleteKnowledgeCenterByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a knowledgeCenter document by fully qualified name
     *
     * Delete a knowledgeCenter document by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteKnowledgeCenterDocumentByNameTest() {
        String fqn = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteKnowledgeCenterDocumentByName(fqn, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a knowledgeCenter document by fully qualified name
     *
     * Delete a knowledgeCenter document by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteKnowledgeCenterDocumentByNameTestQueryMap() {
        String fqn = null;
        KnowledgeCentersApi.DeleteKnowledgeCenterDocumentByNameQueryParams queryParams = new KnowledgeCentersApi.DeleteKnowledgeCenterDocumentByNameQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteKnowledgeCenterDocumentByName(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Export knowledgeCenter in CSV format
     *
     * 
     */
    @Test
    void exportKnowledgeCenterTest() {
        String name = null;
        // String response = api.exportKnowledgeCenter(name);

        // TODO: test validations
    }

    
    /**
     * Get CSV documentation
     *
     * 
     */
    @Test
    void getCsvDocumentation2Test() {
        String name = null;
        // String response = api.getCsvDocumentation2(name);

        // TODO: test validations
    }

    
    /**
     * Get a knowledgeCenter by name
     *
     * Get a knowledgeCenter by name.
     */
    @Test
    void getKnowledgeCenterByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // KnowledgeCenter response = api.getKnowledgeCenterByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a knowledgeCenter by name
     *
     * Get a knowledgeCenter by name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getKnowledgeCenterByFQNTestQueryMap() {
        String name = null;
        KnowledgeCentersApi.GetKnowledgeCenterByFQNQueryParams queryParams = new KnowledgeCentersApi.GetKnowledgeCenterByFQNQueryParams()
            .fields(null)
            .include(null);
        // KnowledgeCenter response = api.getKnowledgeCenterByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a knowledgeCenter by Id
     *
     * Get a knowledgeCenter by &#x60;Id&#x60;.
     */
    @Test
    void getKnowledgeCenterByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // KnowledgeCenter response = api.getKnowledgeCenterByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a knowledgeCenter by Id
     *
     * Get a knowledgeCenter by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getKnowledgeCenterByIDTestQueryMap() {
        UUID id = null;
        KnowledgeCentersApi.GetKnowledgeCenterByIDQueryParams queryParams = new KnowledgeCentersApi.GetKnowledgeCenterByIDQueryParams()
            .fields(null)
            .include(null);
        // KnowledgeCenter response = api.getKnowledgeCenterByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a knowledgeCenter document by fully qualified name
     *
     * Get a knowledgeCenter document by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getKnowledgeCenterDocumentByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // KnowledgeCenter response = api.getKnowledgeCenterDocumentByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a knowledgeCenter document by fully qualified name
     *
     * Get a knowledgeCenter document by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getKnowledgeCenterDocumentByFQNTestQueryMap() {
        String fqn = null;
        KnowledgeCentersApi.GetKnowledgeCenterDocumentByFQNQueryParams queryParams = new KnowledgeCentersApi.GetKnowledgeCenterDocumentByFQNQueryParams()
            .fields(null)
            .include(null);
        // KnowledgeCenter response = api.getKnowledgeCenterDocumentByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a knowledgeCenter document by Id
     *
     * Get a knowledgeCenter document by &#x60;Id&#x60;.
     */
    @Test
    void getKnowledgeCenterDocumentByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // KnowledgeCenter response = api.getKnowledgeCenterDocumentByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a knowledgeCenter document by Id
     *
     * Get a knowledgeCenter document by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getKnowledgeCenterDocumentByIDTestQueryMap() {
        UUID id = null;
        KnowledgeCentersApi.GetKnowledgeCenterDocumentByIDQueryParams queryParams = new KnowledgeCentersApi.GetKnowledgeCenterDocumentByIDQueryParams()
            .fields(null)
            .include(null);
        // KnowledgeCenter response = api.getKnowledgeCenterDocumentByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the knowledgeCenter document
     *
     * Get a version of the knowledgeCenter document by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificKnowledgeCenterDocumentVersionTest() {
        UUID id = null;
        String version = null;
        // KnowledgeCenter response = api.getSpecificKnowledgeCenterDocumentVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a version of the knowledgecenters
     *
     * Get a version of the knowledgeCenter by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificKnowledgeCenterVersionTest() {
        UUID id = null;
        String version = null;
        // KnowledgeCenter response = api.getSpecificKnowledgeCenterVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Import knowledgeCenter documents from CSV to create, and update knowledgeCenter documents
     *
     * 
     */
    @Test
    void importKnowledgeCenterTest() {
        String name = null;
        Boolean dryRun = null;
        String body = null;
        // CsvImportResult response = api.importKnowledgeCenter(name, dryRun, body);

        // TODO: test validations
    }

    /**
     * Import knowledgeCenter documents from CSV to create, and update knowledgeCenter documents
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void importKnowledgeCenterTestQueryMap() {
        String name = null;
        String body = null;
        KnowledgeCentersApi.ImportKnowledgeCenterQueryParams queryParams = new KnowledgeCentersApi.ImportKnowledgeCenterQueryParams()
            .dryRun(null);
        // CsvImportResult response = api.importKnowledgeCenter(name, body, queryParams);

    // TODO: test validations
    }
    
    /**
     * List knowledgeCenter document versions
     *
     * Get a list of all the versions of a knowledgeCenter documents identified by &#x60;id&#x60;
     */
    @Test
    void listAllKnowledgeCenterDocumentVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllKnowledgeCenterDocumentVersion(id);

        // TODO: test validations
    }

    
    /**
     * List knowledgeCenter versions
     *
     * Get a list of all the versions of a knowledgeCenter identified by &#x60;id&#x60;
     */
    @Test
    void listAllKnowledgeCenterVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllKnowledgeCenterVersion(id);

        // TODO: test validations
    }

    
    /**
     * List knowledgeCenter documents
     *
     * Get a list of knowledgeCenter documents. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listKnowledgeCenterDocumentTest() {
        String knowledgeCenter = null;
        String parent = null;
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // KnowledgeCenterDocumentList response = api.listKnowledgeCenterDocument(knowledgeCenter, parent, fields, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List knowledgeCenter documents
     *
     * Get a list of knowledgeCenter documents. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listKnowledgeCenterDocumentTestQueryMap() {
        KnowledgeCentersApi.ListKnowledgeCenterDocumentQueryParams queryParams = new KnowledgeCentersApi.ListKnowledgeCenterDocumentQueryParams()
            .knowledgeCenter(null)
            .parent(null)
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // KnowledgeCenterDocumentList response = api.listKnowledgeCenterDocument(queryParams);

    // TODO: test validations
    }
    
    /**
     * List knowledgecenters
     *
     * Get a list of knowledgecenters. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listKnowledgeCentersTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // KnowledgeCenterList response = api.listKnowledgeCenters(fields, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List knowledgecenters
     *
     * Get a list of knowledgecenters. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listKnowledgeCentersTestQueryMap() {
        KnowledgeCentersApi.ListKnowledgeCentersQueryParams queryParams = new KnowledgeCentersApi.ListKnowledgeCentersQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // KnowledgeCenterList response = api.listKnowledgeCenters(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a knowledgeCenter
     *
     * Update an existing knowledgeCenter using JsonPatch.
     */
    @Test
    void patchKnowledgeCenterTest() {
        UUID id = null;
        Object body = null;
        // api.patchKnowledgeCenter(id, body);

        // TODO: test validations
    }

    
    /**
     * Update a knowledgeCenter document
     *
     * Update an existing knowledgeCenter document using JsonPatch.
     */
    @Test
    void patchKnowledgeCenterDocumentTest() {
        UUID id = null;
        Object body = null;
        // api.patchKnowledgeCenterDocument(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted knowledgeCenter document
     *
     * Restore a soft deleted knowledgeCenter document.
     */
    @Test
    void restore17Test() {
        RestoreEntity restoreEntity = null;
        // KnowledgeCenterDocument response = api.restore17(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted knowledgeCenter
     *
     * Restore a soft deleted KnowledgeCenter.
     */
    @Test
    void restore18Test() {
        RestoreEntity restoreEntity = null;
        // KnowledgeCenter response = api.restore18(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity11Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity11(id, voteRequest);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity12Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity12(id, voteRequest);

        // TODO: test validations
    }

    
    /**
     * Validate Tags Addition to KnowledgeCenter Document
     *
     * Validate Tags Addition to KnowledgeCenter Document
     */
    @Test
    void validateKnowledgeCenterDocumentTagsAdditionTest() {
        UUID id = null;
        AddKnowledgeCenterToAssetsRequest addKnowledgeCenterToAssetsRequest = null;
        // BulkOperationResult response = api.validateKnowledgeCenterDocumentTagsAddition(id, addKnowledgeCenterToAssetsRequest);

        // TODO: test validations
    }

    
}
