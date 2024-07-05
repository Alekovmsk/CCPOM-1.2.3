package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateUserEsk;
import org.openmetadata.client.model.CreateUserEskClassification;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Table;
import java.util.UUID;
import org.openmetadata.client.model.UserEsk;
import org.openmetadata.client.model.UserEskClassification;
import org.openmetadata.client.model.UserEskClassificationList;
import org.openmetadata.client.model.UserEskList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserEskClassificationsApi
 */
class UserEskClassificationsApiTest {

    private UserEskClassificationsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(UserEskClassificationsApi.class);
    }

    
    /**
     * Create or update a userEsk
     *
     * Create a new userEsk, if it does not exist or update an existing userEsk.
     */
    @Test
    void createOrUpdateUserEskTest() {
        CreateUserEsk createUserEsk = null;
        // UserEsk response = api.createOrUpdateUserEsk(createUserEsk);

        // TODO: test validations
    }

    
    /**
     * Update a userEsk classification
     *
     * Update an existing userEsk category identify by userEsk category name
     */
    @Test
    void createOrUpdateUserEskClassificationTest() {
        CreateUserEskClassification createUserEskClassification = null;
        // api.createOrUpdateUserEskClassification(createUserEskClassification);

        // TODO: test validations
    }

    
    /**
     * Create a userEsk
     *
     * Create a new userEsk.
     */
    @Test
    void createUserEskTest() {
        CreateUserEsk createUserEsk = null;
        // UserEsk response = api.createUserEsk(createUserEsk);

        // TODO: test validations
    }

    
    /**
     * Create a userEsk classification
     *
     * Create a new userEsk classification. The request can include the children tags to be created along with the classification.
     */
    @Test
    void createUserEskClassificationTest() {
        CreateUserEskClassification createUserEskClassification = null;
        // UserEskClassification response = api.createUserEskClassification(createUserEskClassification);

        // TODO: test validations
    }

    
    /**
     * Delete a userEsk by id
     *
     * Delete a userEsk by &#x60;id&#x60;.
     */
    @Test
    void deleteUserEskTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteUserEsk(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a userEsk by id
     *
     * Delete a userEsk by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteUserEskTestQueryMap() {
        UUID id = null;
        UserEskClassificationsApi.DeleteUserEskQueryParams queryParams = new UserEskClassificationsApi.DeleteUserEskQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteUserEsk(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a userEsk by fully qualified name
     *
     * Delete a userEsk by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteUserEskByNameTest() {
        String fqn = null;
        Boolean hardDelete = null;
        // api.deleteUserEskByName(fqn, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a userEsk by fully qualified name
     *
     * Delete a userEsk by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteUserEskByNameTestQueryMap() {
        String fqn = null;
        UserEskClassificationsApi.DeleteUserEskByNameQueryParams queryParams = new UserEskClassificationsApi.DeleteUserEskByNameQueryParams()
            .hardDelete(null);
        // api.deleteUserEskByName(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete userEsk classification by id
     *
     * Delete a userEsk classification and all the tags(userEsks) under it.
     */
    @Test
    void deleteUserEskClassificationTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteUserEskClassification(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete userEsk classification by id
     *
     * Delete a userEsk classification and all the tags(userEsks) under it.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteUserEskClassificationTestQueryMap() {
        UUID id = null;
        UserEskClassificationsApi.DeleteUserEskClassificationQueryParams queryParams = new UserEskClassificationsApi.DeleteUserEskClassificationQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteUserEskClassification(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete userEsk classification by name
     *
     * Delete a userEsk classification by &#x60;name&#x60; and all the tags under it.
     */
    @Test
    void deleteUserEskClassificationByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteUserEskClassificationByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete userEsk classification by name
     *
     * Delete a userEsk classification by &#x60;name&#x60; and all the tags under it.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteUserEskClassificationByNameTestQueryMap() {
        String name = null;
        UserEskClassificationsApi.DeleteUserEskClassificationByNameQueryParams queryParams = new UserEskClassificationsApi.DeleteUserEskClassificationByNameQueryParams()
            .hardDelete(null);
        // api.deleteUserEskClassificationByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the userEsk classification
     *
     * Get a version of the userEsk classification by given &#x60;id&#x60;
     */
    @Test
    void getSpecificUserEskClassificationVersionTest() {
        UUID id = null;
        String version = null;
        // UserEskClassification response = api.getSpecificUserEskClassificationVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a version of the userEsks
     *
     * Get a version of the userEsk by given &#x60;id&#x60;
     */
    @Test
    void getSpecificUserEskVersionTest() {
        UUID id = null;
        String version = null;
        // UserEsk response = api.getSpecificUserEskVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a userEsk by fully qualified name
     *
     * Get a userEsk by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getUserEskByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // UserEsk response = api.getUserEskByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a userEsk by fully qualified name
     *
     * Get a userEsk by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getUserEskByFQNTestQueryMap() {
        String fqn = null;
        UserEskClassificationsApi.GetUserEskByFQNQueryParams queryParams = new UserEskClassificationsApi.GetUserEskByFQNQueryParams()
            .fields(null)
            .include(null);
        // UserEsk response = api.getUserEskByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a userEsk by id
     *
     * Get a userEsk by &#x60;id&#x60;.
     */
    @Test
    void getUserEskByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // UserEsk response = api.getUserEskByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a userEsk by id
     *
     * Get a userEsk by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getUserEskByIDTestQueryMap() {
        UUID id = null;
        UserEskClassificationsApi.GetUserEskByIDQueryParams queryParams = new UserEskClassificationsApi.GetUserEskByIDQueryParams()
            .fields(null)
            .include(null);
        // UserEsk response = api.getUserEskByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a userEsk classification by id
     *
     * Get a userEsk classification by &#x60;id&#x60;
     */
    @Test
    void getUserEskClassificationByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // UserEskClassification response = api.getUserEskClassificationByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a userEsk classification by id
     *
     * Get a userEsk classification by &#x60;id&#x60;
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getUserEskClassificationByIDTestQueryMap() {
        UUID id = null;
        UserEskClassificationsApi.GetUserEskClassificationByIDQueryParams queryParams = new UserEskClassificationsApi.GetUserEskClassificationByIDQueryParams()
            .fields(null)
            .include(null);
        // UserEskClassification response = api.getUserEskClassificationByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a userEsk classification by name
     *
     * Get a userEsk classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(userEsk).
     */
    @Test
    void getUserEskClassificationByNameTest() {
        String name = null;
        String fields = null;
        String include = null;
        // UserEskClassification response = api.getUserEskClassificationByName(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a userEsk classification by name
     *
     * Get a userEsk classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(userEsk).
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getUserEskClassificationByNameTestQueryMap() {
        String name = null;
        UserEskClassificationsApi.GetUserEskClassificationByNameQueryParams queryParams = new UserEskClassificationsApi.GetUserEskClassificationByNameQueryParams()
            .fields(null)
            .include(null);
        // UserEskClassification response = api.getUserEskClassificationByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * List userEsk classification versions
     *
     * Get a list of all the versions of a userEsk classification identified by &#x60;id&#x60;
     */
    @Test
    void listAllUserEskClassificationVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllUserEskClassificationVersion(id);

        // TODO: test validations
    }

    
    /**
     * List userEsk versions
     *
     * Get a list of all the versions of a userEsk identified by &#x60;id&#x60;
     */
    @Test
    void listAllUserEskVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllUserEskVersion(id);

        // TODO: test validations
    }

    
    /**
     * List userEsk classifications
     *
     * Get a list of userEsk classifications.
     */
    @Test
    void listUserEskClassificationsTest() {
        String fields = null;
        String disabled = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // UserEskClassificationList response = api.listUserEskClassifications(fields, disabled, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List userEsk classifications
     *
     * Get a list of userEsk classifications.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listUserEskClassificationsTestQueryMap() {
        UserEskClassificationsApi.ListUserEskClassificationsQueryParams queryParams = new UserEskClassificationsApi.ListUserEskClassificationsQueryParams()
            .fields(null)
            .disabled(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // UserEskClassificationList response = api.listUserEskClassifications(queryParams);

    // TODO: test validations
    }
    
    /**
     * List userEsks
     *
     * Get a list of userEsks. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listUserEsksTest() {
        String parent = null;
        String fields = null;
        String disabled = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // UserEskList response = api.listUserEsks(parent, fields, disabled, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List userEsks
     *
     * Get a list of userEsks. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listUserEsksTestQueryMap() {
        UserEskClassificationsApi.ListUserEsksQueryParams queryParams = new UserEskClassificationsApi.ListUserEsksQueryParams()
            .parent(null)
            .fields(null)
            .disabled(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // UserEskList response = api.listUserEsks(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a userEsk
     *
     * Update an existing userEsk using JsonPatch.
     */
    @Test
    void patchUserEskTest() {
        UUID id = null;
        Object body = null;
        // api.patchUserEsk(id, body);

        // TODO: test validations
    }

    
    /**
     * Update a userEsk classification
     *
     * Update an existing classification using JsonPatch.
     */
    @Test
    void patchUserEskClassificationTest() {
        UUID id = null;
        Object body = null;
        // api.patchUserEskClassification(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted classification
     *
     * Restore a soft deleted classification.
     */
    @Test
    void restoreClassification4Test() {
        RestoreEntity restoreEntity = null;
        // Table response = api.restoreClassification4(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted userEsk.
     *
     * Restore a soft deleted userEsk.
     */
    @Test
    void restoreUserEskTest() {
        RestoreEntity restoreEntity = null;
        // UserEsk response = api.restoreUserEsk(restoreEntity);

        // TODO: test validations
    }

    
}
