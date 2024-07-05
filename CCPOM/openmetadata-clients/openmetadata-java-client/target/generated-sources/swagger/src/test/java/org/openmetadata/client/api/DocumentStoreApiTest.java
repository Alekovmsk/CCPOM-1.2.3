package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateDocument;
import org.openmetadata.client.model.Document;
import org.openmetadata.client.model.DocumentList;
import org.openmetadata.client.model.EntityHistory;
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
 * API tests for DocumentStoreApi
 */
class DocumentStoreApiTest {

    private DocumentStoreApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(DocumentStoreApi.class);
    }

    
    /**
     * Create a Document
     *
     * Create a new Document.
     */
    @Test
    void createDocumentTest() {
        CreateDocument createDocument = null;
        // Document response = api.createDocument(createDocument);

        // TODO: test validations
    }

    
    /**
     * Update Document
     *
     * Create or Update a Document.
     */
    @Test
    void createOrUpdateDocumentTest() {
        CreateDocument createDocument = null;
        // Document response = api.createOrUpdateDocument(createDocument);

        // TODO: test validations
    }

    
    /**
     * Delete a Document by id
     *
     * Delete a Document by given &#x60;id&#x60;.
     */
    @Test
    void deleteDocumentTest() {
        UUID id = null;
        // api.deleteDocument(id);

        // TODO: test validations
    }

    
    /**
     * Delete a Document by name
     *
     * Delete a Document by given &#x60;name&#x60;.
     */
    @Test
    void deleteDocumentByNameTest() {
        String name = null;
        // api.deleteDocumentByName(name);

        // TODO: test validations
    }

    
    /**
     * Get a Document by id
     *
     * Get a Document by &#x60;id&#x60;.
     */
    @Test
    void get2Test() {
        UUID id = null;
        String include = null;
        // Document response = api.get2(id, include);

        // TODO: test validations
    }

    /**
     * Get a Document by id
     *
     * Get a Document by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void get2TestQueryMap() {
        UUID id = null;
        DocumentStoreApi.Get2QueryParams queryParams = new DocumentStoreApi.Get2QueryParams()
            .include(null);
        // Document response = api.get2(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a Document by name
     *
     * Get a Document by &#x60;name&#x60;.
     */
    @Test
    void getDocumentByFQNTest() {
        String name = null;
        String include = null;
        // Document response = api.getDocumentByFQN(name, include);

        // TODO: test validations
    }

    /**
     * Get a Document by name
     *
     * Get a Document by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDocumentByFQNTestQueryMap() {
        String name = null;
        DocumentStoreApi.GetDocumentByFQNQueryParams queryParams = new DocumentStoreApi.GetDocumentByFQNQueryParams()
            .include(null);
        // Document response = api.getDocumentByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the Document
     *
     * Get a version of the Document by given &#x60;id&#x60;
     */
    @Test
    void getSpecificDocumentVersionTest() {
        UUID id = null;
        String version = null;
        // Document response = api.getSpecificDocumentVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List Document versions
     *
     * Get a list of all the versions of a Document identified by &#x60;id&#x60;
     */
    @Test
    void listAllDocumentVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllDocumentVersion(id);

        // TODO: test validations
    }

    
    /**
     * List Documents
     *
     * Get a list of Documents. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listDocumentsTest() {
        Integer limit = null;
        String entityType = null;
        String fqnPrefix = null;
        String before = null;
        String after = null;
        // DocumentList response = api.listDocuments(limit, entityType, fqnPrefix, before, after);

        // TODO: test validations
    }

    /**
     * List Documents
     *
     * Get a list of Documents. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listDocumentsTestQueryMap() {
        DocumentStoreApi.ListDocumentsQueryParams queryParams = new DocumentStoreApi.ListDocumentsQueryParams()
            .limit(null)
            .entityType(null)
            .fqnPrefix(null)
            .before(null)
            .after(null);
        // DocumentList response = api.listDocuments(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a Document.
     *
     * Update an existing Document with JsonPatch.
     */
    @Test
    void patchDocumentTest() {
        UUID id = null;
        Object body = null;
        // api.patchDocument(id, body);

        // TODO: test validations
    }

    
}
