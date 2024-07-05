package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateDla;
import org.openmetadata.client.model.CreateDlaClassification;
import org.openmetadata.client.model.Dla;
import org.openmetadata.client.model.DlaClassification;
import org.openmetadata.client.model.DlaClassificationList;
import org.openmetadata.client.model.DlaList;
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
 * API tests for DlaClassificationsApi
 */
class DlaClassificationsApiTest {

    private DlaClassificationsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(DlaClassificationsApi.class);
    }

    
    /**
     * Create a dla
     *
     * Create a new dla.
     */
    @Test
    void createDlaTest() {
        CreateDla createDla = null;
        // Dla response = api.createDla(createDla);

        // TODO: test validations
    }

    
    /**
     * Create a dla classification
     *
     * Create a new dla classification. The request can include the children tags to be created along with the classification.
     */
    @Test
    void createDlaClassificationTest() {
        CreateDlaClassification createDlaClassification = null;
        // DlaClassification response = api.createDlaClassification(createDlaClassification);

        // TODO: test validations
    }

    
    /**
     * Create or update a dla
     *
     * Create a new dla, if it does not exist or update an existing dla.
     */
    @Test
    void createOrUpdateDlaTest() {
        CreateDla createDla = null;
        // Dla response = api.createOrUpdateDla(createDla);

        // TODO: test validations
    }

    
    /**
     * Update a dla classification
     *
     * Update an existing dla category identify by dla category name
     */
    @Test
    void createOrUpdateDlaClassificationTest() {
        CreateDlaClassification createDlaClassification = null;
        // api.createOrUpdateDlaClassification(createDlaClassification);

        // TODO: test validations
    }

    
    /**
     * Delete a dla by id
     *
     * Delete a dla by &#x60;id&#x60;.
     */
    @Test
    void deleteDlaTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteDla(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a dla by id
     *
     * Delete a dla by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDlaTestQueryMap() {
        UUID id = null;
        DlaClassificationsApi.DeleteDlaQueryParams queryParams = new DlaClassificationsApi.DeleteDlaQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteDla(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a dla by fully qualified name
     *
     * Delete a dla by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteDlaByNameTest() {
        String fqn = null;
        Boolean hardDelete = null;
        // api.deleteDlaByName(fqn, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a dla by fully qualified name
     *
     * Delete a dla by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDlaByNameTestQueryMap() {
        String fqn = null;
        DlaClassificationsApi.DeleteDlaByNameQueryParams queryParams = new DlaClassificationsApi.DeleteDlaByNameQueryParams()
            .hardDelete(null);
        // api.deleteDlaByName(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete dla classification by id
     *
     * Delete a dla classification and all the tags(dlas) under it.
     */
    @Test
    void deleteDlaClassificationTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteDlaClassification(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete dla classification by id
     *
     * Delete a dla classification and all the tags(dlas) under it.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDlaClassificationTestQueryMap() {
        UUID id = null;
        DlaClassificationsApi.DeleteDlaClassificationQueryParams queryParams = new DlaClassificationsApi.DeleteDlaClassificationQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteDlaClassification(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete dla classification by name
     *
     * Delete a dla classification by &#x60;name&#x60; and all the tags under it.
     */
    @Test
    void deleteDlaClassificationByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteDlaClassificationByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete dla classification by name
     *
     * Delete a dla classification by &#x60;name&#x60; and all the tags under it.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteDlaClassificationByNameTestQueryMap() {
        String name = null;
        DlaClassificationsApi.DeleteDlaClassificationByNameQueryParams queryParams = new DlaClassificationsApi.DeleteDlaClassificationByNameQueryParams()
            .hardDelete(null);
        // api.deleteDlaClassificationByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a dla by fully qualified name
     *
     * Get a dla by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getDlaByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // Dla response = api.getDlaByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a dla by fully qualified name
     *
     * Get a dla by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDlaByFQNTestQueryMap() {
        String fqn = null;
        DlaClassificationsApi.GetDlaByFQNQueryParams queryParams = new DlaClassificationsApi.GetDlaByFQNQueryParams()
            .fields(null)
            .include(null);
        // Dla response = api.getDlaByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a dla by id
     *
     * Get a dla by &#x60;id&#x60;.
     */
    @Test
    void getDlaByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Dla response = api.getDlaByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a dla by id
     *
     * Get a dla by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDlaByIDTestQueryMap() {
        UUID id = null;
        DlaClassificationsApi.GetDlaByIDQueryParams queryParams = new DlaClassificationsApi.GetDlaByIDQueryParams()
            .fields(null)
            .include(null);
        // Dla response = api.getDlaByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a dla classification by id
     *
     * Get a dla classification by &#x60;id&#x60;
     */
    @Test
    void getDlaClassificationByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // DlaClassification response = api.getDlaClassificationByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a dla classification by id
     *
     * Get a dla classification by &#x60;id&#x60;
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDlaClassificationByIDTestQueryMap() {
        UUID id = null;
        DlaClassificationsApi.GetDlaClassificationByIDQueryParams queryParams = new DlaClassificationsApi.GetDlaClassificationByIDQueryParams()
            .fields(null)
            .include(null);
        // DlaClassification response = api.getDlaClassificationByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a dla classification by name
     *
     * Get a dla classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(dla).
     */
    @Test
    void getDlaClassificationByNameTest() {
        String name = null;
        String fields = null;
        String include = null;
        // DlaClassification response = api.getDlaClassificationByName(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a dla classification by name
     *
     * Get a dla classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(dla).
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDlaClassificationByNameTestQueryMap() {
        String name = null;
        DlaClassificationsApi.GetDlaClassificationByNameQueryParams queryParams = new DlaClassificationsApi.GetDlaClassificationByNameQueryParams()
            .fields(null)
            .include(null);
        // DlaClassification response = api.getDlaClassificationByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the dla classification
     *
     * Get a version of the dla classification by given &#x60;id&#x60;
     */
    @Test
    void getSpecificDlaClassificationVersionTest() {
        UUID id = null;
        String version = null;
        // DlaClassification response = api.getSpecificDlaClassificationVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a version of the dlas
     *
     * Get a version of the dla by given &#x60;id&#x60;
     */
    @Test
    void getSpecificDlaVersionTest() {
        UUID id = null;
        String version = null;
        // Dla response = api.getSpecificDlaVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List dla classification versions
     *
     * Get a list of all the versions of a dla classification identified by &#x60;id&#x60;
     */
    @Test
    void listAllDlaClassificationVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllDlaClassificationVersion(id);

        // TODO: test validations
    }

    
    /**
     * List dla versions
     *
     * Get a list of all the versions of a dla identified by &#x60;id&#x60;
     */
    @Test
    void listAllDlaVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllDlaVersion(id);

        // TODO: test validations
    }

    
    /**
     * List dla classifications
     *
     * Get a list of dla classifications.
     */
    @Test
    void listDlaClassificationsTest() {
        String fields = null;
        String disabled = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // DlaClassificationList response = api.listDlaClassifications(fields, disabled, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List dla classifications
     *
     * Get a list of dla classifications.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listDlaClassificationsTestQueryMap() {
        DlaClassificationsApi.ListDlaClassificationsQueryParams queryParams = new DlaClassificationsApi.ListDlaClassificationsQueryParams()
            .fields(null)
            .disabled(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // DlaClassificationList response = api.listDlaClassifications(queryParams);

    // TODO: test validations
    }
    
    /**
     * List dlas
     *
     * Get a list of dlas. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listDlasTest() {
        String parent = null;
        String fields = null;
        String disabled = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // DlaList response = api.listDlas(parent, fields, disabled, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List dlas
     *
     * Get a list of dlas. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listDlasTestQueryMap() {
        DlaClassificationsApi.ListDlasQueryParams queryParams = new DlaClassificationsApi.ListDlasQueryParams()
            .parent(null)
            .fields(null)
            .disabled(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // DlaList response = api.listDlas(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a dla
     *
     * Update an existing dla using JsonPatch.
     */
    @Test
    void patchDlaTest() {
        UUID id = null;
        Object body = null;
        // api.patchDla(id, body);

        // TODO: test validations
    }

    
    /**
     * Update a dla classification
     *
     * Update an existing classification using JsonPatch.
     */
    @Test
    void patchDlaClassificationTest() {
        UUID id = null;
        Object body = null;
        // api.patchDlaClassification(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted classification
     *
     * Restore a soft deleted classification.
     */
    @Test
    void restoreClassification1Test() {
        RestoreEntity restoreEntity = null;
        // Table response = api.restoreClassification1(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted dla.
     *
     * Restore a soft deleted dla.
     */
    @Test
    void restoreDlaTest() {
        RestoreEntity restoreEntity = null;
        // Dla response = api.restoreDla(restoreEntity);

        // TODO: test validations
    }

    
}
