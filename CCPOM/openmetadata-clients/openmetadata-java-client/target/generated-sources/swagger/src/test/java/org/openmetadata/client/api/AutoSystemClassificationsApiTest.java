package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.AutoSystem;
import org.openmetadata.client.model.AutoSystemClassification;
import org.openmetadata.client.model.AutoSystemClassificationList;
import org.openmetadata.client.model.AutoSystemList;
import org.openmetadata.client.model.CreateAutoSystem;
import org.openmetadata.client.model.CreateAutoSystemClassification;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
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
 * API tests for AutoSystemClassificationsApi
 */
class AutoSystemClassificationsApiTest {

    private AutoSystemClassificationsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(AutoSystemClassificationsApi.class);
    }

    
    /**
     * Create a autoSystem
     *
     * Create a new autoSystem.
     */
    @Test
    void createAutoSystemTest() {
        CreateAutoSystem createAutoSystem = null;
        // AutoSystem response = api.createAutoSystem(createAutoSystem);

        // TODO: test validations
    }

    
    /**
     * Create a autoSystem classification
     *
     * Create a new autoSystem classification. The request can include the children tags to be created along with the classification.
     */
    @Test
    void createAutoSystemClassificationTest() {
        CreateAutoSystemClassification createAutoSystemClassification = null;
        // AutoSystemClassification response = api.createAutoSystemClassification(createAutoSystemClassification);

        // TODO: test validations
    }

    
    /**
     * Create or update a autoSystem
     *
     * Create a new autoSystem, if it does not exist or update an existing autoSystem.
     */
    @Test
    void createOrUpdateAutoSystemTest() {
        CreateAutoSystem createAutoSystem = null;
        // AutoSystem response = api.createOrUpdateAutoSystem(createAutoSystem);

        // TODO: test validations
    }

    
    /**
     * Update a autoSystem classification
     *
     * Update an existing autoSystem category identify by autoSystem category name
     */
    @Test
    void createOrUpdateAutoSystemClassificationTest() {
        CreateAutoSystemClassification createAutoSystemClassification = null;
        // api.createOrUpdateAutoSystemClassification(createAutoSystemClassification);

        // TODO: test validations
    }

    
    /**
     * Delete a autoSystem by id
     *
     * Delete a autoSystem by &#x60;id&#x60;.
     */
    @Test
    void deleteAutoSystemTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteAutoSystem(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a autoSystem by id
     *
     * Delete a autoSystem by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteAutoSystemTestQueryMap() {
        UUID id = null;
        AutoSystemClassificationsApi.DeleteAutoSystemQueryParams queryParams = new AutoSystemClassificationsApi.DeleteAutoSystemQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteAutoSystem(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a autoSystem by fully qualified name
     *
     * Delete a autoSystem by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteAutoSystemByNameTest() {
        String fqn = null;
        Boolean hardDelete = null;
        // api.deleteAutoSystemByName(fqn, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a autoSystem by fully qualified name
     *
     * Delete a autoSystem by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteAutoSystemByNameTestQueryMap() {
        String fqn = null;
        AutoSystemClassificationsApi.DeleteAutoSystemByNameQueryParams queryParams = new AutoSystemClassificationsApi.DeleteAutoSystemByNameQueryParams()
            .hardDelete(null);
        // api.deleteAutoSystemByName(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete autoSystem classification by id
     *
     * Delete a autoSystem classification and all the tags(autoSystems) under it.
     */
    @Test
    void deleteAutoSystemClassificationTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteAutoSystemClassification(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete autoSystem classification by id
     *
     * Delete a autoSystem classification and all the tags(autoSystems) under it.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteAutoSystemClassificationTestQueryMap() {
        UUID id = null;
        AutoSystemClassificationsApi.DeleteAutoSystemClassificationQueryParams queryParams = new AutoSystemClassificationsApi.DeleteAutoSystemClassificationQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteAutoSystemClassification(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete autoSystem classification by name
     *
     * Delete a autoSystem classification by &#x60;name&#x60; and all the tags under it.
     */
    @Test
    void deleteAutoSystemClassificationByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteAutoSystemClassificationByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete autoSystem classification by name
     *
     * Delete a autoSystem classification by &#x60;name&#x60; and all the tags under it.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteAutoSystemClassificationByNameTestQueryMap() {
        String name = null;
        AutoSystemClassificationsApi.DeleteAutoSystemClassificationByNameQueryParams queryParams = new AutoSystemClassificationsApi.DeleteAutoSystemClassificationByNameQueryParams()
            .hardDelete(null);
        // api.deleteAutoSystemClassificationByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a autoSystem by fully qualified name
     *
     * Get a autoSystem by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getAutoSystemByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // AutoSystem response = api.getAutoSystemByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a autoSystem by fully qualified name
     *
     * Get a autoSystem by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getAutoSystemByFQNTestQueryMap() {
        String fqn = null;
        AutoSystemClassificationsApi.GetAutoSystemByFQNQueryParams queryParams = new AutoSystemClassificationsApi.GetAutoSystemByFQNQueryParams()
            .fields(null)
            .include(null);
        // AutoSystem response = api.getAutoSystemByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a autoSystem by id
     *
     * Get a autoSystem by &#x60;id&#x60;.
     */
    @Test
    void getAutoSystemByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // AutoSystem response = api.getAutoSystemByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a autoSystem by id
     *
     * Get a autoSystem by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getAutoSystemByIDTestQueryMap() {
        UUID id = null;
        AutoSystemClassificationsApi.GetAutoSystemByIDQueryParams queryParams = new AutoSystemClassificationsApi.GetAutoSystemByIDQueryParams()
            .fields(null)
            .include(null);
        // AutoSystem response = api.getAutoSystemByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a autoSystem classification by id
     *
     * Get a autoSystem classification by &#x60;id&#x60;
     */
    @Test
    void getAutoSystemClassificationByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // AutoSystemClassification response = api.getAutoSystemClassificationByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a autoSystem classification by id
     *
     * Get a autoSystem classification by &#x60;id&#x60;
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getAutoSystemClassificationByIDTestQueryMap() {
        UUID id = null;
        AutoSystemClassificationsApi.GetAutoSystemClassificationByIDQueryParams queryParams = new AutoSystemClassificationsApi.GetAutoSystemClassificationByIDQueryParams()
            .fields(null)
            .include(null);
        // AutoSystemClassification response = api.getAutoSystemClassificationByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a autoSystem classification by name
     *
     * Get a autoSystem classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(autoSystem).
     */
    @Test
    void getAutoSystemClassificationByNameTest() {
        String name = null;
        String fields = null;
        String include = null;
        // AutoSystemClassification response = api.getAutoSystemClassificationByName(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a autoSystem classification by name
     *
     * Get a autoSystem classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(autoSystem).
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getAutoSystemClassificationByNameTestQueryMap() {
        String name = null;
        AutoSystemClassificationsApi.GetAutoSystemClassificationByNameQueryParams queryParams = new AutoSystemClassificationsApi.GetAutoSystemClassificationByNameQueryParams()
            .fields(null)
            .include(null);
        // AutoSystemClassification response = api.getAutoSystemClassificationByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the autoSystem classification
     *
     * Get a version of the autoSystem classification by given &#x60;id&#x60;
     */
    @Test
    void getSpecificAutoSystemClassificationVersionTest() {
        UUID id = null;
        String version = null;
        // AutoSystemClassification response = api.getSpecificAutoSystemClassificationVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a version of the autoSystems
     *
     * Get a version of the autoSystem by given &#x60;id&#x60;
     */
    @Test
    void getSpecificAutoSystemVersionTest() {
        UUID id = null;
        String version = null;
        // AutoSystem response = api.getSpecificAutoSystemVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List autoSystem classification versions
     *
     * Get a list of all the versions of a autoSystem classification identified by &#x60;id&#x60;
     */
    @Test
    void listAllAutoSystemClassificationVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllAutoSystemClassificationVersion(id);

        // TODO: test validations
    }

    
    /**
     * List autoSystem versions
     *
     * Get a list of all the versions of a autoSystem identified by &#x60;id&#x60;
     */
    @Test
    void listAllAutoSystemVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllAutoSystemVersion(id);

        // TODO: test validations
    }

    
    /**
     * List autoSystem classifications
     *
     * Get a list of autoSystem classifications.
     */
    @Test
    void listAutoSystemClassificationsTest() {
        String fields = null;
        String disabled = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // AutoSystemClassificationList response = api.listAutoSystemClassifications(fields, disabled, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List autoSystem classifications
     *
     * Get a list of autoSystem classifications.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listAutoSystemClassificationsTestQueryMap() {
        AutoSystemClassificationsApi.ListAutoSystemClassificationsQueryParams queryParams = new AutoSystemClassificationsApi.ListAutoSystemClassificationsQueryParams()
            .fields(null)
            .disabled(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // AutoSystemClassificationList response = api.listAutoSystemClassifications(queryParams);

    // TODO: test validations
    }
    
    /**
     * List autoSystems
     *
     * Get a list of autoSystems. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listAutoSystemsTest() {
        String parent = null;
        String fields = null;
        String disabled = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // AutoSystemList response = api.listAutoSystems(parent, fields, disabled, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List autoSystems
     *
     * Get a list of autoSystems. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listAutoSystemsTestQueryMap() {
        AutoSystemClassificationsApi.ListAutoSystemsQueryParams queryParams = new AutoSystemClassificationsApi.ListAutoSystemsQueryParams()
            .parent(null)
            .fields(null)
            .disabled(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // AutoSystemList response = api.listAutoSystems(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a autoSystem
     *
     * Update an existing autoSystem using JsonPatch.
     */
    @Test
    void patchAutoSystemTest() {
        UUID id = null;
        Object body = null;
        // api.patchAutoSystem(id, body);

        // TODO: test validations
    }

    
    /**
     * Update a autoSystem classification
     *
     * Update an existing classification using JsonPatch.
     */
    @Test
    void patchAutoSystemClassificationTest() {
        UUID id = null;
        Object body = null;
        // api.patchAutoSystemClassification(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted autoSystem.
     *
     * Restore a soft deleted autoSystem.
     */
    @Test
    void restoreAutoSystemTest() {
        RestoreEntity restoreEntity = null;
        // AutoSystem response = api.restoreAutoSystem(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted classification
     *
     * Restore a soft deleted classification.
     */
    @Test
    void restoreClassificationTest() {
        RestoreEntity restoreEntity = null;
        // Table response = api.restoreClassification(restoreEntity);

        // TODO: test validations
    }

    
}
