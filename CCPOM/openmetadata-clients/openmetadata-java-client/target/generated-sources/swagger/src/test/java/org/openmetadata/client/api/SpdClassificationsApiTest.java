package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateSpd;
import org.openmetadata.client.model.CreateSpdClassification;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Spd;
import org.openmetadata.client.model.SpdClassification;
import org.openmetadata.client.model.SpdClassificationList;
import org.openmetadata.client.model.SpdList;
import org.openmetadata.client.model.Table;
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
 * API tests for SpdClassificationsApi
 */
class SpdClassificationsApiTest {

    private SpdClassificationsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(SpdClassificationsApi.class);
    }

    
    /**
     * Create or update a spd
     *
     * Create a new spd, if it does not exist or update an existing spd.
     */
    @Test
    void createOrUpdateSpdTest() {
        CreateSpd createSpd = null;
        // Spd response = api.createOrUpdateSpd(createSpd);

        // TODO: test validations
    }

    
    /**
     * Update a spd classification
     *
     * Update an existing spd category identify by spd category name
     */
    @Test
    void createOrUpdateSpdClassificationTest() {
        CreateSpdClassification createSpdClassification = null;
        // api.createOrUpdateSpdClassification(createSpdClassification);

        // TODO: test validations
    }

    
    /**
     * Create a spd
     *
     * Create a new spd.
     */
    @Test
    void createSpdTest() {
        CreateSpd createSpd = null;
        // Spd response = api.createSpd(createSpd);

        // TODO: test validations
    }

    
    /**
     * Create a spd classification
     *
     * Create a new spd classification. The request can include the children tags to be created along with the classification.
     */
    @Test
    void createSpdClassificationTest() {
        CreateSpdClassification createSpdClassification = null;
        // SpdClassification response = api.createSpdClassification(createSpdClassification);

        // TODO: test validations
    }

    
    /**
     * Delete a spd by id
     *
     * Delete a spd by &#x60;id&#x60;.
     */
    @Test
    void deleteSpdTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteSpd(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a spd by id
     *
     * Delete a spd by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteSpdTestQueryMap() {
        UUID id = null;
        SpdClassificationsApi.DeleteSpdQueryParams queryParams = new SpdClassificationsApi.DeleteSpdQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteSpd(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a spd by fully qualified name
     *
     * Delete a spd by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteSpdByNameTest() {
        String fqn = null;
        Boolean hardDelete = null;
        // api.deleteSpdByName(fqn, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a spd by fully qualified name
     *
     * Delete a spd by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteSpdByNameTestQueryMap() {
        String fqn = null;
        SpdClassificationsApi.DeleteSpdByNameQueryParams queryParams = new SpdClassificationsApi.DeleteSpdByNameQueryParams()
            .hardDelete(null);
        // api.deleteSpdByName(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete spd classification by id
     *
     * Delete a spd classification and all the tags(spds) under it.
     */
    @Test
    void deleteSpdClassificationTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteSpdClassification(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete spd classification by id
     *
     * Delete a spd classification and all the tags(spds) under it.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteSpdClassificationTestQueryMap() {
        UUID id = null;
        SpdClassificationsApi.DeleteSpdClassificationQueryParams queryParams = new SpdClassificationsApi.DeleteSpdClassificationQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteSpdClassification(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete spd classification by name
     *
     * Delete a spd classification by &#x60;name&#x60; and all the tags under it.
     */
    @Test
    void deleteSpdClassificationByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteSpdClassificationByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete spd classification by name
     *
     * Delete a spd classification by &#x60;name&#x60; and all the tags under it.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteSpdClassificationByNameTestQueryMap() {
        String name = null;
        SpdClassificationsApi.DeleteSpdClassificationByNameQueryParams queryParams = new SpdClassificationsApi.DeleteSpdClassificationByNameQueryParams()
            .hardDelete(null);
        // api.deleteSpdClassificationByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a spd by fully qualified name
     *
     * Get a spd by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getSpdByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // Spd response = api.getSpdByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a spd by fully qualified name
     *
     * Get a spd by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getSpdByFQNTestQueryMap() {
        String fqn = null;
        SpdClassificationsApi.GetSpdByFQNQueryParams queryParams = new SpdClassificationsApi.GetSpdByFQNQueryParams()
            .fields(null)
            .include(null);
        // Spd response = api.getSpdByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a spd by id
     *
     * Get a spd by &#x60;id&#x60;.
     */
    @Test
    void getSpdByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Spd response = api.getSpdByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a spd by id
     *
     * Get a spd by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getSpdByIDTestQueryMap() {
        UUID id = null;
        SpdClassificationsApi.GetSpdByIDQueryParams queryParams = new SpdClassificationsApi.GetSpdByIDQueryParams()
            .fields(null)
            .include(null);
        // Spd response = api.getSpdByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a spd classification by id
     *
     * Get a spd classification by &#x60;id&#x60;
     */
    @Test
    void getSpdClassificationByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // SpdClassification response = api.getSpdClassificationByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a spd classification by id
     *
     * Get a spd classification by &#x60;id&#x60;
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getSpdClassificationByIDTestQueryMap() {
        UUID id = null;
        SpdClassificationsApi.GetSpdClassificationByIDQueryParams queryParams = new SpdClassificationsApi.GetSpdClassificationByIDQueryParams()
            .fields(null)
            .include(null);
        // SpdClassification response = api.getSpdClassificationByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a spd classification by name
     *
     * Get a spd classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(spd).
     */
    @Test
    void getSpdClassificationByNameTest() {
        String name = null;
        String fields = null;
        String include = null;
        // SpdClassification response = api.getSpdClassificationByName(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a spd classification by name
     *
     * Get a spd classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(spd).
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getSpdClassificationByNameTestQueryMap() {
        String name = null;
        SpdClassificationsApi.GetSpdClassificationByNameQueryParams queryParams = new SpdClassificationsApi.GetSpdClassificationByNameQueryParams()
            .fields(null)
            .include(null);
        // SpdClassification response = api.getSpdClassificationByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the spd classification
     *
     * Get a version of the spd classification by given &#x60;id&#x60;
     */
    @Test
    void getSpecificSpdClassificationVersionTest() {
        UUID id = null;
        String version = null;
        // SpdClassification response = api.getSpecificSpdClassificationVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a version of the spds
     *
     * Get a version of the spd by given &#x60;id&#x60;
     */
    @Test
    void getSpecificSpdVersionTest() {
        UUID id = null;
        String version = null;
        // Spd response = api.getSpecificSpdVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List spd classification versions
     *
     * Get a list of all the versions of a spd classification identified by &#x60;id&#x60;
     */
    @Test
    void listAllSpdClassificationVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllSpdClassificationVersion(id);

        // TODO: test validations
    }

    
    /**
     * List spd versions
     *
     * Get a list of all the versions of a spd identified by &#x60;id&#x60;
     */
    @Test
    void listAllSpdVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllSpdVersion(id);

        // TODO: test validations
    }

    
    /**
     * List spd classifications
     *
     * Get a list of spd classifications.
     */
    @Test
    void listSpdClassificationsTest() {
        String fields = null;
        String disabled = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // SpdClassificationList response = api.listSpdClassifications(fields, disabled, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List spd classifications
     *
     * Get a list of spd classifications.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listSpdClassificationsTestQueryMap() {
        SpdClassificationsApi.ListSpdClassificationsQueryParams queryParams = new SpdClassificationsApi.ListSpdClassificationsQueryParams()
            .fields(null)
            .disabled(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // SpdClassificationList response = api.listSpdClassifications(queryParams);

    // TODO: test validations
    }
    
    /**
     * List spds
     *
     * Get a list of spds. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listSpdsTest() {
        String parent = null;
        String fields = null;
        String disabled = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // SpdList response = api.listSpds(parent, fields, disabled, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List spds
     *
     * Get a list of spds. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listSpdsTestQueryMap() {
        SpdClassificationsApi.ListSpdsQueryParams queryParams = new SpdClassificationsApi.ListSpdsQueryParams()
            .parent(null)
            .fields(null)
            .disabled(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // SpdList response = api.listSpds(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a spd
     *
     * Update an existing spd using JsonPatch.
     */
    @Test
    void patchSpdTest() {
        UUID id = null;
        Object body = null;
        // api.patchSpd(id, body);

        // TODO: test validations
    }

    
    /**
     * Update a spd classification
     *
     * Update an existing classification using JsonPatch.
     */
    @Test
    void patchSpdClassificationTest() {
        UUID id = null;
        Object body = null;
        // api.patchSpdClassification(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted classification
     *
     * Restore a soft deleted classification.
     */
    @Test
    void restoreClassification2Test() {
        RestoreEntity restoreEntity = null;
        // Table response = api.restoreClassification2(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted spd.
     *
     * Restore a soft deleted spd.
     */
    @Test
    void restoreSpdTest() {
        RestoreEntity restoreEntity = null;
        // Spd response = api.restoreSpd(restoreEntity);

        // TODO: test validations
    }

    
}
