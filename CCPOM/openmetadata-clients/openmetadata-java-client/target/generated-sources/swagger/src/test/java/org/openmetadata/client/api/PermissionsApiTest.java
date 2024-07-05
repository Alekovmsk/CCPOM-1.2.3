package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.ResourcePermissionList;
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
 * API tests for PermissionsApi
 */
class PermissionsApiTest {

    private PermissionsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PermissionsApi.class);
    }

    
    /**
     * Get permissions for a set of policies
     *
     * 
     */
    @Test
    void getPermissionsForPoliciesTest() {
        List<UUID> ids = null;
        // ResourcePermissionList response = api.getPermissionsForPolicies(ids);

        // TODO: test validations
    }

    /**
     * Get permissions for a set of policies
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getPermissionsForPoliciesTestQueryMap() {
        PermissionsApi.GetPermissionsForPoliciesQueryParams queryParams = new PermissionsApi.GetPermissionsForPoliciesQueryParams()
            .ids(null);
        // ResourcePermissionList response = api.getPermissionsForPolicies(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get permissions for a given entity for a logged in user
     *
     * 
     */
    @Test
    void getResourcePermissionTest() {
        String resource = null;
        UUID id = null;
        String user = null;
        // ResourcePermissionList response = api.getResourcePermission(resource, id, user);

        // TODO: test validations
    }

    /**
     * Get permissions for a given entity for a logged in user
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getResourcePermissionTestQueryMap() {
        String resource = null;
        UUID id = null;
        PermissionsApi.GetResourcePermissionQueryParams queryParams = new PermissionsApi.GetResourcePermissionQueryParams()
            .user(null);
        // ResourcePermissionList response = api.getResourcePermission(resource, id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get permissions for a given entity name for a logged in user
     *
     * 
     */
    @Test
    void getResourcePermissionByNameTest() {
        String resource = null;
        String name = null;
        String user = null;
        // ResourcePermissionList response = api.getResourcePermissionByName(resource, name, user);

        // TODO: test validations
    }

    /**
     * Get permissions for a given entity name for a logged in user
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getResourcePermissionByNameTestQueryMap() {
        String resource = null;
        String name = null;
        PermissionsApi.GetResourcePermissionByNameQueryParams queryParams = new PermissionsApi.GetResourcePermissionByNameQueryParams()
            .user(null);
        // ResourcePermissionList response = api.getResourcePermissionByName(resource, name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get permissions for logged in user
     *
     * 
     */
    @Test
    void getResourcePermissionsTest() {
        String user = null;
        // ResourcePermissionList response = api.getResourcePermissions(user);

        // TODO: test validations
    }

    /**
     * Get permissions for logged in user
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getResourcePermissionsTestQueryMap() {
        PermissionsApi.GetResourcePermissionsQueryParams queryParams = new PermissionsApi.GetResourcePermissionsQueryParams()
            .user(null);
        // ResourcePermissionList response = api.getResourcePermissions(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get permissions a given resource/entity type for logged in user
     *
     * 
     */
    @Test
    void getResourceTypePermissionTest() {
        String resource = null;
        String user = null;
        // ResourcePermissionList response = api.getResourceTypePermission(resource, user);

        // TODO: test validations
    }

    /**
     * Get permissions a given resource/entity type for logged in user
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getResourceTypePermissionTestQueryMap() {
        String resource = null;
        PermissionsApi.GetResourceTypePermissionQueryParams queryParams = new PermissionsApi.GetResourceTypePermissionQueryParams()
            .user(null);
        // ResourcePermissionList response = api.getResourceTypePermission(resource, queryParams);

    // TODO: test validations
    }
    
}
