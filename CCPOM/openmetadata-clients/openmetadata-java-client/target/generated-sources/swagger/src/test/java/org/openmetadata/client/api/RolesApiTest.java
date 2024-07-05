package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateRole;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Role;
import org.openmetadata.client.model.RoleList;
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
 * API tests for RolesApi
 */
class RolesApiTest {

    private RolesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(RolesApi.class);
    }

    
    /**
     * Update role
     *
     * Create or Update a role.
     */
    @Test
    void createOrUpdateRoleTest() {
        CreateRole createRole = null;
        // Role response = api.createOrUpdateRole(createRole);

        // TODO: test validations
    }

    
    /**
     * Create a role
     *
     * Create a new role.
     */
    @Test
    void createRoleTest() {
        CreateRole createRole = null;
        // Role response = api.createRole(createRole);

        // TODO: test validations
    }

    
    /**
     * Delete a role
     *
     * Delete a role by given &#x60;id&#x60;.
     */
    @Test
    void deleteRoleTest() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.deleteRole(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a role
     *
     * Delete a role by given &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteRoleTestQueryMap() {
        UUID id = null;
        RolesApi.DeleteRoleQueryParams queryParams = new RolesApi.DeleteRoleQueryParams()
            .hardDelete(null);
        // api.deleteRole(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a role
     *
     * Delete a role by given &#x60;name&#x60;.
     */
    @Test
    void deleteRoleByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteRoleByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a role
     *
     * Delete a role by given &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteRoleByNameTestQueryMap() {
        String name = null;
        RolesApi.DeleteRoleByNameQueryParams queryParams = new RolesApi.DeleteRoleByNameQueryParams()
            .hardDelete(null);
        // api.deleteRoleByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a role by name
     *
     * Get a role by &#x60;name&#x60;.
     */
    @Test
    void getRoleByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // Role response = api.getRoleByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a role by name
     *
     * Get a role by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getRoleByFQNTestQueryMap() {
        String name = null;
        RolesApi.GetRoleByFQNQueryParams queryParams = new RolesApi.GetRoleByFQNQueryParams()
            .fields(null)
            .include(null);
        // Role response = api.getRoleByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a role by id
     *
     * Get a role by &#x60;id&#x60;.
     */
    @Test
    void getRoleByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Role response = api.getRoleByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a role by id
     *
     * Get a role by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getRoleByIDTestQueryMap() {
        UUID id = null;
        RolesApi.GetRoleByIDQueryParams queryParams = new RolesApi.GetRoleByIDQueryParams()
            .fields(null)
            .include(null);
        // Role response = api.getRoleByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the role
     *
     * Get a version of the role by given &#x60;id&#x60;
     */
    @Test
    void getSpecificRoleVersionTest() {
        UUID id = null;
        String version = null;
        // Role response = api.getSpecificRoleVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List role versions
     *
     * Get a list of all the versions of a role identified by &#x60;id&#x60;
     */
    @Test
    void listAllRoleVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllRoleVersion(id);

        // TODO: test validations
    }

    
    /**
     * List roles
     *
     * Get a list of roles. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listRolesTest() {
        Boolean _default = null;
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // RoleList response = api.listRoles(_default, fields, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List roles
     *
     * Get a list of roles. Use cursor-based pagination to limit the number of entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listRolesTestQueryMap() {
        RolesApi.ListRolesQueryParams queryParams = new RolesApi.ListRolesQueryParams()
            ._default(null)
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // RoleList response = api.listRoles(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a role
     *
     * Update an existing role with JsonPatch.
     */
    @Test
    void patchRoleTest() {
        UUID id = null;
        Object body = null;
        // api.patchRole(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted role
     *
     * Restore a soft deleted role.
     */
    @Test
    void restore33Test() {
        RestoreEntity restoreEntity = null;
        // Role response = api.restore33(restoreEntity);

        // TODO: test validations
    }

    
}
