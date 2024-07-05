package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.AddGlossaryToAssetsRequest;
import org.openmetadata.client.model.BulkOperationResult;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateGlossary;
import org.openmetadata.client.model.CreateGlossaryTerm;
import org.openmetadata.client.model.CsvImportResult;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.Glossary;
import org.openmetadata.client.model.GlossaryList;
import org.openmetadata.client.model.GlossaryTerm;
import org.openmetadata.client.model.GlossaryTermList;
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
 * API tests for GlossariesApi
 */
class GlossariesApiTest {

    private GlossariesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(GlossariesApi.class);
    }

    
    /**
     * Bulk Add Glossary Term to Assets
     *
     * Bulk Add Glossary Term to Assets
     */
    @Test
    void bulkAddGlossaryTermToAssetsTest() {
        UUID id = null;
        AddGlossaryToAssetsRequest addGlossaryToAssetsRequest = null;
        // BulkOperationResult response = api.bulkAddGlossaryTermToAssets(id, addGlossaryToAssetsRequest);

        // TODO: test validations
    }

    
    /**
     * Bulk Remove Glossary Term from Assets
     *
     * Bulk Remove Glossary Term from Assets
     */
    @Test
    void bulkRemoveGlossaryTermFromAssetsTest() {
        UUID id = null;
        AddGlossaryToAssetsRequest addGlossaryToAssetsRequest = null;
        // ChangeEvent response = api.bulkRemoveGlossaryTermFromAssets(id, addGlossaryToAssetsRequest);

        // TODO: test validations
    }

    
    /**
     * Create a glossary
     *
     * Create a new glossary.
     */
    @Test
    void createGlossaryTest() {
        CreateGlossary createGlossary = null;
        // Glossary response = api.createGlossary(createGlossary);

        // TODO: test validations
    }

    
    /**
     * Create a glossary term
     *
     * Create a new glossary term.
     */
    @Test
    void createGlossaryTermTest() {
        CreateGlossaryTerm createGlossaryTerm = null;
        // GlossaryTerm response = api.createGlossaryTerm(createGlossaryTerm);

        // TODO: test validations
    }

    
    /**
     * Create or update a glossary
     *
     * Create a new glossary, if it does not exist or update an existing glossary.
     */
    @Test
    void createOrUpdateGlossaryTest() {
        CreateGlossary createGlossary = null;
        // Glossary response = api.createOrUpdateGlossary(createGlossary);

        // TODO: test validations
    }

    
    /**
     * Create or update a glossary term
     *
     * Create a new glossary term, if it does not exist or update an existing glossary term.
     */
    @Test
    void createOrUpdateGlossaryTermTest() {
        CreateGlossaryTerm createGlossaryTerm = null;
        // GlossaryTerm response = api.createOrUpdateGlossaryTerm(createGlossaryTerm);

        // TODO: test validations
    }

    
    /**
     * Delete a glossary term by Id
     *
     * Delete a glossary term by &#x60;Id&#x60;.
     */
    @Test
    void delete1Test() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.delete1(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a glossary term by Id
     *
     * Delete a glossary term by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void delete1TestQueryMap() {
        UUID id = null;
        GlossariesApi.Delete1QueryParams queryParams = new GlossariesApi.Delete1QueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.delete1(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a glossary by Id
     *
     * Delete a glossary by &#x60;Id&#x60;.
     */
    @Test
    void deleteGlossaryTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteGlossary(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a glossary by Id
     *
     * Delete a glossary by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteGlossaryTestQueryMap() {
        UUID id = null;
        GlossariesApi.DeleteGlossaryQueryParams queryParams = new GlossariesApi.DeleteGlossaryQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteGlossary(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a glossary by name
     *
     * Delete a glossary by &#x60;name&#x60;.
     */
    @Test
    void deleteGlossaryByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteGlossaryByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a glossary by name
     *
     * Delete a glossary by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteGlossaryByNameTestQueryMap() {
        String name = null;
        GlossariesApi.DeleteGlossaryByNameQueryParams queryParams = new GlossariesApi.DeleteGlossaryByNameQueryParams()
            .hardDelete(null);
        // api.deleteGlossaryByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a glossary term by fully qualified name
     *
     * Delete a glossary term by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteGlossaryTermByNameTest() {
        String fqn = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteGlossaryTermByName(fqn, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a glossary term by fully qualified name
     *
     * Delete a glossary term by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteGlossaryTermByNameTestQueryMap() {
        String fqn = null;
        GlossariesApi.DeleteGlossaryTermByNameQueryParams queryParams = new GlossariesApi.DeleteGlossaryTermByNameQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteGlossaryTermByName(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Export glossary in CSV format
     *
     * 
     */
    @Test
    void exportGlossaryTest() {
        String name = null;
        // String response = api.exportGlossary(name);

        // TODO: test validations
    }

    
    /**
     * Get CSV documentation
     *
     * 
     */
    @Test
    void getCsvDocumentation1Test() {
        String name = null;
        // String response = api.getCsvDocumentation1(name);

        // TODO: test validations
    }

    
    /**
     * Get a glossary by name
     *
     * Get a glossary by name.
     */
    @Test
    void getGlossaryByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // Glossary response = api.getGlossaryByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a glossary by name
     *
     * Get a glossary by name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getGlossaryByFQNTestQueryMap() {
        String name = null;
        GlossariesApi.GetGlossaryByFQNQueryParams queryParams = new GlossariesApi.GetGlossaryByFQNQueryParams()
            .fields(null)
            .include(null);
        // Glossary response = api.getGlossaryByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a glossary by Id
     *
     * Get a glossary by &#x60;Id&#x60;.
     */
    @Test
    void getGlossaryByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Glossary response = api.getGlossaryByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a glossary by Id
     *
     * Get a glossary by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getGlossaryByIDTestQueryMap() {
        UUID id = null;
        GlossariesApi.GetGlossaryByIDQueryParams queryParams = new GlossariesApi.GetGlossaryByIDQueryParams()
            .fields(null)
            .include(null);
        // Glossary response = api.getGlossaryByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a glossary term by fully qualified name
     *
     * Get a glossary term by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getGlossaryTermByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // Glossary response = api.getGlossaryTermByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a glossary term by fully qualified name
     *
     * Get a glossary term by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getGlossaryTermByFQNTestQueryMap() {
        String fqn = null;
        GlossariesApi.GetGlossaryTermByFQNQueryParams queryParams = new GlossariesApi.GetGlossaryTermByFQNQueryParams()
            .fields(null)
            .include(null);
        // Glossary response = api.getGlossaryTermByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a glossary term by Id
     *
     * Get a glossary term by &#x60;Id&#x60;.
     */
    @Test
    void getGlossaryTermByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Glossary response = api.getGlossaryTermByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a glossary term by Id
     *
     * Get a glossary term by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getGlossaryTermByIDTestQueryMap() {
        UUID id = null;
        GlossariesApi.GetGlossaryTermByIDQueryParams queryParams = new GlossariesApi.GetGlossaryTermByIDQueryParams()
            .fields(null)
            .include(null);
        // Glossary response = api.getGlossaryTermByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the glossary term
     *
     * Get a version of the glossary term by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificGlossaryTermVersionTest() {
        UUID id = null;
        String version = null;
        // Glossary response = api.getSpecificGlossaryTermVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a version of the glossaries
     *
     * Get a version of the glossary by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificGlossaryVersionTest() {
        UUID id = null;
        String version = null;
        // Glossary response = api.getSpecificGlossaryVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Import glossary terms from CSV to create, and update glossary terms
     *
     * 
     */
    @Test
    void importGlossaryTest() {
        String name = null;
        Boolean dryRun = null;
        String body = null;
        // CsvImportResult response = api.importGlossary(name, dryRun, body);

        // TODO: test validations
    }

    /**
     * Import glossary terms from CSV to create, and update glossary terms
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void importGlossaryTestQueryMap() {
        String name = null;
        String body = null;
        GlossariesApi.ImportGlossaryQueryParams queryParams = new GlossariesApi.ImportGlossaryQueryParams()
            .dryRun(null);
        // CsvImportResult response = api.importGlossary(name, body, queryParams);

    // TODO: test validations
    }
    
    /**
     * List glossary term versions
     *
     * Get a list of all the versions of a glossary terms identified by &#x60;id&#x60;
     */
    @Test
    void listAllGlossaryTermVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllGlossaryTermVersion(id);

        // TODO: test validations
    }

    
    /**
     * List glossary versions
     *
     * Get a list of all the versions of a glossary identified by &#x60;id&#x60;
     */
    @Test
    void listAllGlossaryVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllGlossaryVersion(id);

        // TODO: test validations
    }

    
    /**
     * List glossaries
     *
     * Get a list of glossaries. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listGlossariesTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // GlossaryList response = api.listGlossaries(fields, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List glossaries
     *
     * Get a list of glossaries. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listGlossariesTestQueryMap() {
        GlossariesApi.ListGlossariesQueryParams queryParams = new GlossariesApi.ListGlossariesQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // GlossaryList response = api.listGlossaries(queryParams);

    // TODO: test validations
    }
    
    /**
     * List glossary terms
     *
     * Get a list of glossary terms. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listGlossaryTermTest() {
        String glossary = null;
        String parent = null;
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // GlossaryTermList response = api.listGlossaryTerm(glossary, parent, fields, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List glossary terms
     *
     * Get a list of glossary terms. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listGlossaryTermTestQueryMap() {
        GlossariesApi.ListGlossaryTermQueryParams queryParams = new GlossariesApi.ListGlossaryTermQueryParams()
            .glossary(null)
            .parent(null)
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // GlossaryTermList response = api.listGlossaryTerm(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a glossary
     *
     * Update an existing glossary using JsonPatch.
     */
    @Test
    void patchGlossaryTest() {
        UUID id = null;
        Object body = null;
        // api.patchGlossary(id, body);

        // TODO: test validations
    }

    
    /**
     * Update a glossary term
     *
     * Update an existing glossary term using JsonPatch.
     */
    @Test
    void patchGlossaryTermTest() {
        UUID id = null;
        Object body = null;
        // api.patchGlossaryTerm(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted glossary
     *
     * Restore a soft deleted Glossary.
     */
    @Test
    void restore15Test() {
        RestoreEntity restoreEntity = null;
        // Glossary response = api.restore15(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted glossary term
     *
     * Restore a soft deleted glossary term.
     */
    @Test
    void restore16Test() {
        RestoreEntity restoreEntity = null;
        // GlossaryTerm response = api.restore16(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity10Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity10(id, voteRequest);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity9Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity9(id, voteRequest);

        // TODO: test validations
    }

    
    /**
     * Validate Tags Addition to Glossary Term
     *
     * Validate Tags Addition to Glossary Term
     */
    @Test
    void validateGlossaryTermTagsAdditionTest() {
        UUID id = null;
        AddGlossaryToAssetsRequest addGlossaryToAssetsRequest = null;
        // BulkOperationResult response = api.validateGlossaryTermTagsAddition(id, addGlossaryToAssetsRequest);

        // TODO: test validations
    }

    
}
