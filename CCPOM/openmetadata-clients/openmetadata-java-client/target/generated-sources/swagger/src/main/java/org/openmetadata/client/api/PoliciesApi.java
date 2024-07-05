package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreatePolicy;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.Policy;
import org.openmetadata.client.model.PolicyList;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.ResultListFunction;
import org.openmetadata.client.model.ResultListResourceDescriptor;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface PoliciesApi extends ApiClient.Api {


  /**
   * Create or update a policy
   * Create a new policy, if it does not exist or update an existing policy.
   * @param createPolicy  (optional)
   * @return Policy
   */
  @RequestLine("PUT /v1/policies")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Policy createOrUpdatePolicy(CreatePolicy createPolicy);

  /**
   * Create or update a policy
   * Similar to <code>createOrUpdatePolicy</code> but it also returns the http response headers .
   * Create a new policy, if it does not exist or update an existing policy.
   * @param createPolicy  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/policies")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Policy> createOrUpdatePolicyWithHttpInfo(CreatePolicy createPolicy);



  /**
   * Create a policy
   * Create a new policy.
   * @param createPolicy  (optional)
   * @return Policy
   */
  @RequestLine("POST /v1/policies")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Policy createPolicy(CreatePolicy createPolicy);

  /**
   * Create a policy
   * Similar to <code>createPolicy</code> but it also returns the http response headers .
   * Create a new policy.
   * @param createPolicy  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/policies")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Policy> createPolicyWithHttpInfo(CreatePolicy createPolicy);



  /**
   * Delete a policy by Id
   * Delete a policy by &#x60;Id&#x60;.
   * @param id Id of the policy (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/policies/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deletePolicy(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a policy by Id
   * Similar to <code>deletePolicy</code> but it also returns the http response headers .
   * Delete a policy by &#x60;Id&#x60;.
   * @param id Id of the policy (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/policies/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePolicyWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a policy by Id
   * Delete a policy by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deletePolicy</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePolicyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the policy (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/policies/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deletePolicy(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a policy by Id
  * Delete a policy by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deletePolicy</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the policy (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/policies/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deletePolicyWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePolicy</code> method in a fluent style.
   */
  public static class DeletePolicyQueryParams extends HashMap<String, Object> {
    public DeletePolicyQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a policy by fully qualified name
   * Delete a policy by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the policy (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/policies/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deletePolicyByFQN(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a policy by fully qualified name
   * Similar to <code>deletePolicyByFQN</code> but it also returns the http response headers .
   * Delete a policy by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the policy (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/policies/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePolicyByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a policy by fully qualified name
   * Delete a policy by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deletePolicyByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePolicyByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the policy (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/policies/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deletePolicyByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a policy by fully qualified name
  * Delete a policy by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deletePolicyByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the policy (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/policies/name/{fqn}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deletePolicyByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePolicyByFQN</code> method in a fluent style.
   */
  public static class DeletePolicyByFQNQueryParams extends HashMap<String, Object> {
    public DeletePolicyByFQNQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a policy by fully qualified name
   * Get a policy by fully qualified name.
   * @param fqn Fully qualified name of the policy (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Policy
   */
  @RequestLine("GET /v1/policies/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Policy getPolicyByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a policy by fully qualified name
   * Similar to <code>getPolicyByFQN</code> but it also returns the http response headers .
   * Get a policy by fully qualified name.
   * @param fqn Fully qualified name of the policy (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/policies/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Policy> getPolicyByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a policy by fully qualified name
   * Get a policy by fully qualified name.
   * Note, this is equivalent to the other <code>getPolicyByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPolicyByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the policy (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Policy
   */
  @RequestLine("GET /v1/policies/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Policy getPolicyByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a policy by fully qualified name
  * Get a policy by fully qualified name.
  * Note, this is equivalent to the other <code>getPolicyByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the policy (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Policy
      */
      @RequestLine("GET /v1/policies/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Policy> getPolicyByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPolicyByFQN</code> method in a fluent style.
   */
  public static class GetPolicyByFQNQueryParams extends HashMap<String, Object> {
    public GetPolicyByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetPolicyByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a policy by id
   * Get a policy by &#x60;Id&#x60;.
   * @param id Id of the policy (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Policy
   */
  @RequestLine("GET /v1/policies/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Policy getPolicyByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a policy by id
   * Similar to <code>getPolicyByID</code> but it also returns the http response headers .
   * Get a policy by &#x60;Id&#x60;.
   * @param id Id of the policy (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/policies/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Policy> getPolicyByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a policy by id
   * Get a policy by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getPolicyByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPolicyByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the policy (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Policy
   */
  @RequestLine("GET /v1/policies/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Policy getPolicyByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a policy by id
  * Get a policy by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getPolicyByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the policy (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Policy
      */
      @RequestLine("GET /v1/policies/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Policy> getPolicyByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPolicyByID</code> method in a fluent style.
   */
  public static class GetPolicyByIDQueryParams extends HashMap<String, Object> {
    public GetPolicyByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetPolicyByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the policy by Id
   * Get a version of the policy by given &#x60;Id&#x60;
   * @param id Id of the policy (required)
   * @param version policy version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Policy
   */
  @RequestLine("GET /v1/policies/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Policy getSpecificPolicyVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the policy by Id
   * Similar to <code>getSpecificPolicyVersion</code> but it also returns the http response headers .
   * Get a version of the policy by given &#x60;Id&#x60;
   * @param id Id of the policy (required)
   * @param version policy version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/policies/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Policy> getSpecificPolicyVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List policy versions
   * Get a list of all the versions of a policy identified by &#x60;id&#x60;
   * @param id Id of the policy (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/policies/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllPolicyVersion(@Param("id") UUID id);

  /**
   * List policy versions
   * Similar to <code>listAllPolicyVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a policy identified by &#x60;id&#x60;
   * @param id Id of the policy (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/policies/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllPolicyVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List policies
   * Get a list of policies. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number policies returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of policies before this cursor (optional)
   * @param after Returns list of policies after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return PolicyList
   */
  @RequestLine("GET /v1/policies?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  PolicyList listPolicies(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List policies
   * Similar to <code>listPolicies</code> but it also returns the http response headers .
   * Get a list of policies. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number policies returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of policies before this cursor (optional)
   * @param after Returns list of policies after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/policies?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PolicyList> listPoliciesWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List policies
   * Get a list of policies. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listPolicies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPoliciesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number policies returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of policies before this cursor (optional)</li>
   *   <li>after - Returns list of policies after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return PolicyList
   */
  @RequestLine("GET /v1/policies?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  PolicyList listPolicies(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List policies
  * Get a list of policies. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listPolicies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number policies returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of policies before this cursor (optional)</li>
          *   <li>after - Returns list of policies after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return PolicyList
      */
      @RequestLine("GET /v1/policies?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PolicyList> listPoliciesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listPolicies</code> method in a fluent style.
   */
  public static class ListPoliciesQueryParams extends HashMap<String, Object> {
    public ListPoliciesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListPoliciesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListPoliciesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListPoliciesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListPoliciesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get list of policy functions used in authoring conditions in policy rules.
   * Get list of policy functions used in authoring conditions in policy rules.
   * @return ResultListFunction
   */
  @RequestLine("GET /v1/policies/functions")
  @Headers({
    "Accept: application/json",
  })
  ResultListFunction listPolicyFunctions();

  /**
   * Get list of policy functions used in authoring conditions in policy rules.
   * Similar to <code>listPolicyFunctions</code> but it also returns the http response headers .
   * Get list of policy functions used in authoring conditions in policy rules.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/policies/functions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ResultListFunction> listPolicyFunctionsWithHttpInfo();



  /**
   * Get list of policy resources used in authoring a policy
   * Get list of policy resources used in authoring a policy.
   * @return ResultListResourceDescriptor
   */
  @RequestLine("GET /v1/policies/resources")
  @Headers({
    "Accept: application/json",
  })
  ResultListResourceDescriptor listPolicyResources();

  /**
   * Get list of policy resources used in authoring a policy
   * Similar to <code>listPolicyResources</code> but it also returns the http response headers .
   * Get list of policy resources used in authoring a policy.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/policies/resources")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ResultListResourceDescriptor> listPolicyResourcesWithHttpInfo();



  /**
   * Update a policy
   * Update an existing policy using JsonPatch.
   * @param id Id of the policy (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a policy Documentation</a>
   */
  @RequestLine("PATCH /v1/policies/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchPolicy(@Param("id") UUID id, Object body);

  /**
   * Update a policy
   * Similar to <code>patchPolicy</code> but it also returns the http response headers .
   * Update an existing policy using JsonPatch.
   * @param id Id of the policy (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a policy Documentation</a>
   */
  @RequestLine("PATCH /v1/policies/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchPolicyWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted policy
   * Restore a soft deleted policy.
   * @param restoreEntity  (optional)
   * @return Policy
   */
  @RequestLine("PUT /v1/policies/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Policy restore21(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted policy
   * Similar to <code>restore21</code> but it also returns the http response headers .
   * Restore a soft deleted policy.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/policies/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Policy> restore21WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Validate a given condition
   * Validate a given condition expression used in authoring rules.
   * @param expression Expression of validating rule (required)
   */
  @RequestLine("GET /v1/policies/validation/condition/{expression}")
  @Headers({
    "Accept: application/json",
  })
  void validateCondition1(@Param("expression") String expression);

  /**
   * Validate a given condition
   * Similar to <code>validateCondition1</code> but it also returns the http response headers .
   * Validate a given condition expression used in authoring rules.
   * @param expression Expression of validating rule (required)
   */
  @RequestLine("GET /v1/policies/validation/condition/{expression}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> validateCondition1WithHttpInfo(@Param("expression") String expression);


}
