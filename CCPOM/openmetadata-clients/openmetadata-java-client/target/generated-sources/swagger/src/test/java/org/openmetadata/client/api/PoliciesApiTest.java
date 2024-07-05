package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreatePolicy;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.Policy;
import org.openmetadata.client.model.PolicyList;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.ResultListFunction;
import org.openmetadata.client.model.ResultListResourceDescriptor;
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
 * API tests for PoliciesApi
 */
class PoliciesApiTest {

    private PoliciesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PoliciesApi.class);
    }

    
    /**
     * Create or update a policy
     *
     * Create a new policy, if it does not exist or update an existing policy.
     */
    @Test
    void createOrUpdatePolicyTest() {
        CreatePolicy createPolicy = null;
        // Policy response = api.createOrUpdatePolicy(createPolicy);

        // TODO: test validations
    }

    
    /**
     * Create a policy
     *
     * Create a new policy.
     */
    @Test
    void createPolicyTest() {
        CreatePolicy createPolicy = null;
        // Policy response = api.createPolicy(createPolicy);

        // TODO: test validations
    }

    
    /**
     * Delete a policy by Id
     *
     * Delete a policy by &#x60;Id&#x60;.
     */
    @Test
    void deletePolicyTest() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.deletePolicy(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a policy by Id
     *
     * Delete a policy by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deletePolicyTestQueryMap() {
        UUID id = null;
        PoliciesApi.DeletePolicyQueryParams queryParams = new PoliciesApi.DeletePolicyQueryParams()
            .hardDelete(null);
        // api.deletePolicy(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a policy by fully qualified name
     *
     * Delete a policy by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deletePolicyByFQNTest() {
        String fqn = null;
        Boolean hardDelete = null;
        // api.deletePolicyByFQN(fqn, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a policy by fully qualified name
     *
     * Delete a policy by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deletePolicyByFQNTestQueryMap() {
        String fqn = null;
        PoliciesApi.DeletePolicyByFQNQueryParams queryParams = new PoliciesApi.DeletePolicyByFQNQueryParams()
            .hardDelete(null);
        // api.deletePolicyByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a policy by fully qualified name
     *
     * Get a policy by fully qualified name.
     */
    @Test
    void getPolicyByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // Policy response = api.getPolicyByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a policy by fully qualified name
     *
     * Get a policy by fully qualified name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getPolicyByFQNTestQueryMap() {
        String fqn = null;
        PoliciesApi.GetPolicyByFQNQueryParams queryParams = new PoliciesApi.GetPolicyByFQNQueryParams()
            .fields(null)
            .include(null);
        // Policy response = api.getPolicyByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a policy by id
     *
     * Get a policy by &#x60;Id&#x60;.
     */
    @Test
    void getPolicyByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Policy response = api.getPolicyByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a policy by id
     *
     * Get a policy by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getPolicyByIDTestQueryMap() {
        UUID id = null;
        PoliciesApi.GetPolicyByIDQueryParams queryParams = new PoliciesApi.GetPolicyByIDQueryParams()
            .fields(null)
            .include(null);
        // Policy response = api.getPolicyByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the policy by Id
     *
     * Get a version of the policy by given &#x60;Id&#x60;
     */
    @Test
    void getSpecificPolicyVersionTest() {
        UUID id = null;
        String version = null;
        // Policy response = api.getSpecificPolicyVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List policy versions
     *
     * Get a list of all the versions of a policy identified by &#x60;id&#x60;
     */
    @Test
    void listAllPolicyVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllPolicyVersion(id);

        // TODO: test validations
    }

    
    /**
     * List policies
     *
     * Get a list of policies. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listPoliciesTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // PolicyList response = api.listPolicies(fields, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List policies
     *
     * Get a list of policies. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listPoliciesTestQueryMap() {
        PoliciesApi.ListPoliciesQueryParams queryParams = new PoliciesApi.ListPoliciesQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // PolicyList response = api.listPolicies(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get list of policy functions used in authoring conditions in policy rules.
     *
     * Get list of policy functions used in authoring conditions in policy rules.
     */
    @Test
    void listPolicyFunctionsTest() {
        // ResultListFunction response = api.listPolicyFunctions();

        // TODO: test validations
    }

    
    /**
     * Get list of policy resources used in authoring a policy
     *
     * Get list of policy resources used in authoring a policy.
     */
    @Test
    void listPolicyResourcesTest() {
        // ResultListResourceDescriptor response = api.listPolicyResources();

        // TODO: test validations
    }

    
    /**
     * Update a policy
     *
     * Update an existing policy using JsonPatch.
     */
    @Test
    void patchPolicyTest() {
        UUID id = null;
        Object body = null;
        // api.patchPolicy(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted policy
     *
     * Restore a soft deleted policy.
     */
    @Test
    void restore21Test() {
        RestoreEntity restoreEntity = null;
        // Policy response = api.restore21(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Validate a given condition
     *
     * Validate a given condition expression used in authoring rules.
     */
    @Test
    void validateCondition1Test() {
        String expression = null;
        // api.validateCondition1(expression);

        // TODO: test validations
    }

    
}
