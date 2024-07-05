package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateMlModel;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.MlModel;
import org.openmetadata.client.model.MlModelList;
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
 * API tests for MlModelsApi
 */
class MlModelsApiTest {

    private MlModelsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(MlModelsApi.class);
    }

    
    /**
     * Add a follower
     *
     * Add a user identified by &#x60;userId&#x60; as follower of this model
     */
    @Test
    void addFollower1Test() {
        UUID id = null;
        UUID body = null;
        // ChangeEvent response = api.addFollower1(id, body);

        // TODO: test validations
    }

    
    /**
     * Create an ML model
     *
     * Create a new ML model.
     */
    @Test
    void createMlModelTest() {
        CreateMlModel createMlModel = null;
        // MlModel response = api.createMlModel(createMlModel);

        // TODO: test validations
    }

    
    /**
     * Create or update an ML model
     *
     * Create a new ML model, if it does not exist or update an existing model.
     */
    @Test
    void createOrUpdateMlModelTest() {
        CreateMlModel createMlModel = null;
        // MlModel response = api.createOrUpdateMlModel(createMlModel);

        // TODO: test validations
    }

    
    /**
     * Remove a follower
     *
     * Remove the user identified &#x60;userId&#x60; as a follower of the model.
     */
    @Test
    void deleteFollower2Test() {
        UUID id = null;
        UUID userId = null;
        // ChangeEvent response = api.deleteFollower2(id, userId);

        // TODO: test validations
    }

    
    /**
     * Delete an ML model by Id
     *
     * Delete an ML model by &#x60;Id&#x60;.
     */
    @Test
    void deleteMlModelTest() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.deleteMlModel(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete an ML model by Id
     *
     * Delete an ML model by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteMlModelTestQueryMap() {
        UUID id = null;
        MlModelsApi.DeleteMlModelQueryParams queryParams = new MlModelsApi.DeleteMlModelQueryParams()
            .hardDelete(null);
        // api.deleteMlModel(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a ML model by fully qualified name
     *
     * Delete an ML model by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteMlModelByFQNTest() {
        String fqn = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteMlModelByFQN(fqn, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a ML model by fully qualified name
     *
     * Delete an ML model by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteMlModelByFQNTestQueryMap() {
        String fqn = null;
        MlModelsApi.DeleteMlModelByFQNQueryParams queryParams = new MlModelsApi.DeleteMlModelByFQNQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteMlModelByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get an ML model by fully qualified name
     *
     * Get an ML model by fully qualified name.
     */
    @Test
    void getMlModelByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // MlModel response = api.getMlModelByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get an ML model by fully qualified name
     *
     * Get an ML model by fully qualified name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getMlModelByFQNTestQueryMap() {
        String fqn = null;
        MlModelsApi.GetMlModelByFQNQueryParams queryParams = new MlModelsApi.GetMlModelByFQNQueryParams()
            .fields(null)
            .include(null);
        // MlModel response = api.getMlModelByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get an ML model by Id
     *
     * Get an ML model by &#x60;Id&#x60;.
     */
    @Test
    void getMlModelByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // MlModel response = api.getMlModelByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get an ML model by Id
     *
     * Get an ML model by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getMlModelByIDTestQueryMap() {
        UUID id = null;
        MlModelsApi.GetMlModelByIDQueryParams queryParams = new MlModelsApi.GetMlModelByIDQueryParams()
            .fields(null)
            .include(null);
        // MlModel response = api.getMlModelByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the ML model
     *
     * Get a version of the ML model by given &#x60;id&#x60;
     */
    @Test
    void getSpecificMlModelVersionTest() {
        UUID id = null;
        String version = null;
        // MlModel response = api.getSpecificMlModelVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List ML model versions
     *
     * Get a list of all the versions of an ML Model identified by &#x60;id&#x60;
     */
    @Test
    void listAllMlModelVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllMlModelVersion(id);

        // TODO: test validations
    }

    
    /**
     * List ML models
     *
     * Get a list of mlmodels, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listMlModelsTest() {
        String fields = null;
        String service = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // MlModelList response = api.listMlModels(fields, service, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List ML models
     *
     * Get a list of mlmodels, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listMlModelsTestQueryMap() {
        MlModelsApi.ListMlModelsQueryParams queryParams = new MlModelsApi.ListMlModelsQueryParams()
            .fields(null)
            .service(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // MlModelList response = api.listMlModels(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update an ML model
     *
     * Update an existing ML model using JsonPatch.
     */
    @Test
    void patchMlModelTest() {
        UUID id = null;
        Object body = null;
        // api.patchMlModel(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted ML model
     *
     * Restore a soft deleted ML Model.
     */
    @Test
    void restore19Test() {
        RestoreEntity restoreEntity = null;
        // MlModel response = api.restore19(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity14Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity14(id, voteRequest);

        // TODO: test validations
    }

    
}
