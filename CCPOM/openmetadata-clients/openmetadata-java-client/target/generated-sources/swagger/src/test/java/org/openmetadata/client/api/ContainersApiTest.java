package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.Container;
import org.openmetadata.client.model.ContainerList;
import org.openmetadata.client.model.CreateContainer;
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
 * API tests for ContainersApi
 */
class ContainersApiTest {

    private ContainersApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(ContainersApi.class);
    }

    
    /**
     * Add a follower
     *
     * Add a user identified by &#x60;userId&#x60; as follower of this container
     */
    @Test
    void addFollower5Test() {
        UUID id = null;
        UUID body = null;
        // ChangeEvent response = api.addFollower5(id, body);

        // TODO: test validations
    }

    
    /**
     * Create a Container
     *
     * Create a new Container.
     */
    @Test
    void createContainerTest() {
        CreateContainer createContainer = null;
        // Container response = api.createContainer(createContainer);

        // TODO: test validations
    }

    
    /**
     * Create or update a Container
     *
     * Create a new Container, if it does not exist or update an existing container.
     */
    @Test
    void createOrUpdateContainerTest() {
        CreateContainer createContainer = null;
        // Container response = api.createOrUpdateContainer(createContainer);

        // TODO: test validations
    }

    
    /**
     * Delete a Container
     *
     * Delete a Container by &#x60;id&#x60;.
     */
    @Test
    void deleteContainerTest() {
        UUID id = null;
        Boolean hardDelete = null;
        Boolean recursive = null;
        // api.deleteContainer(id, hardDelete, recursive);

        // TODO: test validations
    }

    /**
     * Delete a Container
     *
     * Delete a Container by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteContainerTestQueryMap() {
        UUID id = null;
        ContainersApi.DeleteContainerQueryParams queryParams = new ContainersApi.DeleteContainerQueryParams()
            .hardDelete(null)
            .recursive(null);
        // api.deleteContainer(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a Container by fully qualified name
     *
     * Delete a Container by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteContainerByFQNTest() {
        String fqn = null;
        Boolean hardDelete = null;
        // api.deleteContainerByFQN(fqn, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a Container by fully qualified name
     *
     * Delete a Container by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteContainerByFQNTestQueryMap() {
        String fqn = null;
        ContainersApi.DeleteContainerByFQNQueryParams queryParams = new ContainersApi.DeleteContainerByFQNQueryParams()
            .hardDelete(null);
        // api.deleteContainerByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Remove a follower
     *
     * Remove the user identified &#x60;userId&#x60; as a follower of the container.
     */
    @Test
    void deleteFollower6Test() {
        String id = null;
        String userId = null;
        // ChangeEvent response = api.deleteFollower6(id, userId);

        // TODO: test validations
    }

    
    /**
     * Get an Container by name
     *
     * Get an Container by fully qualified name.
     */
    @Test
    void getContainerByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // Container response = api.getContainerByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get an Container by name
     *
     * Get an Container by fully qualified name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getContainerByFQNTestQueryMap() {
        String fqn = null;
        ContainersApi.GetContainerByFQNQueryParams queryParams = new ContainersApi.GetContainerByFQNQueryParams()
            .fields(null)
            .include(null);
        // Container response = api.getContainerByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get an Object Store Container
     *
     * Get an Object Store container by &#x60;id&#x60;.
     */
    @Test
    void getContainerByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Container response = api.getContainerByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get an Object Store Container
     *
     * Get an Object Store container by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getContainerByIDTestQueryMap() {
        UUID id = null;
        ContainersApi.GetContainerByIDQueryParams queryParams = new ContainersApi.GetContainerByIDQueryParams()
            .fields(null)
            .include(null);
        // Container response = api.getContainerByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the Container
     *
     * Get a version of the Container by given &#x60;id&#x60;
     */
    @Test
    void getSpecificContainerVersionTest() {
        String id = null;
        String version = null;
        // Container response = api.getSpecificContainerVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List Container versions
     *
     * Get a list of all the versions of a container identified by &#x60;id&#x60;
     */
    @Test
    void listAllContainerVersionTest() {
        String id = null;
        // EntityHistory response = api.listAllContainerVersion(id);

        // TODO: test validations
    }

    
    /**
     * List Containers
     *
     * Get a list of containers, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listContainersTest() {
        String fields = null;
        String service = null;
        Boolean root = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // ContainerList response = api.listContainers(fields, service, root, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List Containers
     *
     * Get a list of containers, optionally filtered by &#x60;service&#x60; it belongs to. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listContainersTestQueryMap() {
        ContainersApi.ListContainersQueryParams queryParams = new ContainersApi.ListContainersQueryParams()
            .fields(null)
            .service(null)
            .root(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // ContainerList response = api.listContainers(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a Container
     *
     * Update an existing Container using JsonPatch.
     */
    @Test
    void patchContainerTest() {
        String id = null;
        Object body = null;
        // api.patchContainer(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted Container.
     *
     * Restore a soft deleted Container.
     */
    @Test
    void restore32Test() {
        RestoreEntity restoreEntity = null;
        // Container response = api.restore32(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Update Vote for a Entity
     *
     * Update vote for a Entity
     */
    @Test
    void updateVoteForEntity19Test() {
        UUID id = null;
        VoteRequest voteRequest = null;
        // ChangeEvent response = api.updateVoteForEntity19(id, voteRequest);

        // TODO: test validations
    }

    
}
