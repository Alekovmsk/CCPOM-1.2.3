package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface UserEskClassificationsApi extends ApiClient.Api {


  /**
   * Create or update a userEsk
   * Create a new userEsk, if it does not exist or update an existing userEsk.
   * @param createUserEsk  (optional)
   * @return UserEsk
   */
  @RequestLine("PUT /v1/userEsks")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserEsk createOrUpdateUserEsk(CreateUserEsk createUserEsk);

  /**
   * Create or update a userEsk
   * Similar to <code>createOrUpdateUserEsk</code> but it also returns the http response headers .
   * Create a new userEsk, if it does not exist or update an existing userEsk.
   * @param createUserEsk  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/userEsks")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserEsk> createOrUpdateUserEskWithHttpInfo(CreateUserEsk createUserEsk);



  /**
   * Update a userEsk classification
   * Update an existing userEsk category identify by userEsk category name
   * @param createUserEskClassification  (optional)
   */
  @RequestLine("PUT /v1/userEskClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void createOrUpdateUserEskClassification(CreateUserEskClassification createUserEskClassification);

  /**
   * Update a userEsk classification
   * Similar to <code>createOrUpdateUserEskClassification</code> but it also returns the http response headers .
   * Update an existing userEsk category identify by userEsk category name
   * @param createUserEskClassification  (optional)
   */
  @RequestLine("PUT /v1/userEskClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> createOrUpdateUserEskClassificationWithHttpInfo(CreateUserEskClassification createUserEskClassification);



  /**
   * Create a userEsk
   * Create a new userEsk.
   * @param createUserEsk  (optional)
   * @return UserEsk
   */
  @RequestLine("POST /v1/userEsks")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserEsk createUserEsk(CreateUserEsk createUserEsk);

  /**
   * Create a userEsk
   * Similar to <code>createUserEsk</code> but it also returns the http response headers .
   * Create a new userEsk.
   * @param createUserEsk  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/userEsks")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserEsk> createUserEskWithHttpInfo(CreateUserEsk createUserEsk);



  /**
   * Create a userEsk classification
   * Create a new userEsk classification. The request can include the children tags to be created along with the classification.
   * @param createUserEskClassification  (optional)
   * @return UserEskClassification
   */
  @RequestLine("POST /v1/userEskClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserEskClassification createUserEskClassification(CreateUserEskClassification createUserEskClassification);

  /**
   * Create a userEsk classification
   * Similar to <code>createUserEskClassification</code> but it also returns the http response headers .
   * Create a new userEsk classification. The request can include the children tags to be created along with the classification.
   * @param createUserEskClassification  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/userEskClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserEskClassification> createUserEskClassificationWithHttpInfo(CreateUserEskClassification createUserEskClassification);



  /**
   * Delete a userEsk by id
   * Delete a userEsk by &#x60;id&#x60;.
   * @param id Id of the userEsk (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/userEsks/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteUserEsk(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a userEsk by id
   * Similar to <code>deleteUserEsk</code> but it also returns the http response headers .
   * Delete a userEsk by &#x60;id&#x60;.
   * @param id Id of the userEsk (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/userEsks/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteUserEskWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a userEsk by id
   * Delete a userEsk by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteUserEsk</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteUserEskQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the userEsk (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/userEsks/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteUserEsk(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a userEsk by id
  * Delete a userEsk by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteUserEsk</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the userEsk (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/userEsks/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteUserEskWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteUserEsk</code> method in a fluent style.
   */
  public static class DeleteUserEskQueryParams extends HashMap<String, Object> {
    public DeleteUserEskQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteUserEskQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a userEsk by fully qualified name
   * Delete a userEsk by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the userEsk (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/userEsks/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteUserEskByName(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a userEsk by fully qualified name
   * Similar to <code>deleteUserEskByName</code> but it also returns the http response headers .
   * Delete a userEsk by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the userEsk (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/userEsks/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteUserEskByNameWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a userEsk by fully qualified name
   * Delete a userEsk by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteUserEskByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteUserEskByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the userEsk (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/userEsks/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteUserEskByName(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a userEsk by fully qualified name
  * Delete a userEsk by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteUserEskByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the userEsk (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/userEsks/name/{fqn}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteUserEskByNameWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteUserEskByName</code> method in a fluent style.
   */
  public static class DeleteUserEskByNameQueryParams extends HashMap<String, Object> {
    public DeleteUserEskByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete userEsk classification by id
   * Delete a userEsk classification and all the tags(userEsks) under it.
   * @param id Id of the userEsk classification (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/userEskClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteUserEskClassification(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete userEsk classification by id
   * Similar to <code>deleteUserEskClassification</code> but it also returns the http response headers .
   * Delete a userEsk classification and all the tags(userEsks) under it.
   * @param id Id of the userEsk classification (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/userEskClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteUserEskClassificationWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete userEsk classification by id
   * Delete a userEsk classification and all the tags(userEsks) under it.
   * Note, this is equivalent to the other <code>deleteUserEskClassification</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteUserEskClassificationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the userEsk classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/userEskClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteUserEskClassification(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete userEsk classification by id
  * Delete a userEsk classification and all the tags(userEsks) under it.
  * Note, this is equivalent to the other <code>deleteUserEskClassification</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the userEsk classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/userEskClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteUserEskClassificationWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteUserEskClassification</code> method in a fluent style.
   */
  public static class DeleteUserEskClassificationQueryParams extends HashMap<String, Object> {
    public DeleteUserEskClassificationQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteUserEskClassificationQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete userEsk classification by name
   * Delete a userEsk classification by &#x60;name&#x60; and all the tags under it.
   * @param name Name of the userEsk classification (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/userEskClassifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteUserEskClassificationByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete userEsk classification by name
   * Similar to <code>deleteUserEskClassificationByName</code> but it also returns the http response headers .
   * Delete a userEsk classification by &#x60;name&#x60; and all the tags under it.
   * @param name Name of the userEsk classification (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/userEskClassifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteUserEskClassificationByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete userEsk classification by name
   * Delete a userEsk classification by &#x60;name&#x60; and all the tags under it.
   * Note, this is equivalent to the other <code>deleteUserEskClassificationByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteUserEskClassificationByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the userEsk classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/userEskClassifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteUserEskClassificationByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete userEsk classification by name
  * Delete a userEsk classification by &#x60;name&#x60; and all the tags under it.
  * Note, this is equivalent to the other <code>deleteUserEskClassificationByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the userEsk classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/userEskClassifications/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteUserEskClassificationByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteUserEskClassificationByName</code> method in a fluent style.
   */
  public static class DeleteUserEskClassificationByNameQueryParams extends HashMap<String, Object> {
    public DeleteUserEskClassificationByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the userEsk classification
   * Get a version of the userEsk classification by given &#x60;id&#x60;
   * @param id Id of the userEsk classification (required)
   * @param version userEsk classification version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return UserEskClassification
   */
  @RequestLine("GET /v1/userEskClassifications/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  UserEskClassification getSpecificUserEskClassificationVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the userEsk classification
   * Similar to <code>getSpecificUserEskClassificationVersion</code> but it also returns the http response headers .
   * Get a version of the userEsk classification by given &#x60;id&#x60;
   * @param id Id of the userEsk classification (required)
   * @param version userEsk classification version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/userEskClassifications/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserEskClassification> getSpecificUserEskClassificationVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a version of the userEsks
   * Get a version of the userEsk by given &#x60;id&#x60;
   * @param id Id of the userEsk (required)
   * @param version userEsk version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return UserEsk
   */
  @RequestLine("GET /v1/userEsks/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  UserEsk getSpecificUserEskVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the userEsks
   * Similar to <code>getSpecificUserEskVersion</code> but it also returns the http response headers .
   * Get a version of the userEsk by given &#x60;id&#x60;
   * @param id Id of the userEsk (required)
   * @param version userEsk version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/userEsks/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserEsk> getSpecificUserEskVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a userEsk by fully qualified name
   * Get a userEsk by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the userEsk (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return UserEsk
   */
  @RequestLine("GET /v1/userEsks/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  UserEsk getUserEskByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a userEsk by fully qualified name
   * Similar to <code>getUserEskByFQN</code> but it also returns the http response headers .
   * Get a userEsk by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the userEsk (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/userEsks/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserEsk> getUserEskByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a userEsk by fully qualified name
   * Get a userEsk by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getUserEskByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetUserEskByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the userEsk (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return UserEsk
   */
  @RequestLine("GET /v1/userEsks/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  UserEsk getUserEskByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a userEsk by fully qualified name
  * Get a userEsk by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getUserEskByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the userEsk (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return UserEsk
      */
      @RequestLine("GET /v1/userEsks/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<UserEsk> getUserEskByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getUserEskByFQN</code> method in a fluent style.
   */
  public static class GetUserEskByFQNQueryParams extends HashMap<String, Object> {
    public GetUserEskByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetUserEskByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a userEsk by id
   * Get a userEsk by &#x60;id&#x60;.
   * @param id Id of the userEsk (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return UserEsk
   */
  @RequestLine("GET /v1/userEsks/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  UserEsk getUserEskByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a userEsk by id
   * Similar to <code>getUserEskByID</code> but it also returns the http response headers .
   * Get a userEsk by &#x60;id&#x60;.
   * @param id Id of the userEsk (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/userEsks/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserEsk> getUserEskByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a userEsk by id
   * Get a userEsk by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getUserEskByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetUserEskByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the userEsk (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return UserEsk
   */
  @RequestLine("GET /v1/userEsks/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  UserEsk getUserEskByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a userEsk by id
  * Get a userEsk by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getUserEskByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the userEsk (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return UserEsk
      */
      @RequestLine("GET /v1/userEsks/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<UserEsk> getUserEskByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getUserEskByID</code> method in a fluent style.
   */
  public static class GetUserEskByIDQueryParams extends HashMap<String, Object> {
    public GetUserEskByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetUserEskByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a userEsk classification by id
   * Get a userEsk classification by &#x60;id&#x60;
   * @param id Id of the userEsk classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return UserEskClassification
   */
  @RequestLine("GET /v1/userEskClassifications/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  UserEskClassification getUserEskClassificationByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a userEsk classification by id
   * Similar to <code>getUserEskClassificationByID</code> but it also returns the http response headers .
   * Get a userEsk classification by &#x60;id&#x60;
   * @param id Id of the userEsk classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/userEskClassifications/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserEskClassification> getUserEskClassificationByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a userEsk classification by id
   * Get a userEsk classification by &#x60;id&#x60;
   * Note, this is equivalent to the other <code>getUserEskClassificationByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetUserEskClassificationByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the userEsk classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return UserEskClassification
   */
  @RequestLine("GET /v1/userEskClassifications/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  UserEskClassification getUserEskClassificationByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a userEsk classification by id
  * Get a userEsk classification by &#x60;id&#x60;
  * Note, this is equivalent to the other <code>getUserEskClassificationByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the userEsk classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return UserEskClassification
      */
      @RequestLine("GET /v1/userEskClassifications/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<UserEskClassification> getUserEskClassificationByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getUserEskClassificationByID</code> method in a fluent style.
   */
  public static class GetUserEskClassificationByIDQueryParams extends HashMap<String, Object> {
    public GetUserEskClassificationByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetUserEskClassificationByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a userEsk classification by name
   * Get a userEsk classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(userEsk).
   * @param name Name of the userEsk classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return UserEskClassification
   */
  @RequestLine("GET /v1/userEskClassifications/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  UserEskClassification getUserEskClassificationByName(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a userEsk classification by name
   * Similar to <code>getUserEskClassificationByName</code> but it also returns the http response headers .
   * Get a userEsk classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(userEsk).
   * @param name Name of the userEsk classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/userEskClassifications/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserEskClassification> getUserEskClassificationByNameWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a userEsk classification by name
   * Get a userEsk classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(userEsk).
   * Note, this is equivalent to the other <code>getUserEskClassificationByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetUserEskClassificationByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the userEsk classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return UserEskClassification
   */
  @RequestLine("GET /v1/userEskClassifications/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  UserEskClassification getUserEskClassificationByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a userEsk classification by name
  * Get a userEsk classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(userEsk).
  * Note, this is equivalent to the other <code>getUserEskClassificationByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the userEsk classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return UserEskClassification
      */
      @RequestLine("GET /v1/userEskClassifications/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<UserEskClassification> getUserEskClassificationByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getUserEskClassificationByName</code> method in a fluent style.
   */
  public static class GetUserEskClassificationByNameQueryParams extends HashMap<String, Object> {
    public GetUserEskClassificationByNameQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetUserEskClassificationByNameQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List userEsk classification versions
   * Get a list of all the versions of a userEsk classification identified by &#x60;id&#x60;
   * @param id Id of the userEsk classification (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/userEskClassifications/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllUserEskClassificationVersion(@Param("id") UUID id);

  /**
   * List userEsk classification versions
   * Similar to <code>listAllUserEskClassificationVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a userEsk classification identified by &#x60;id&#x60;
   * @param id Id of the userEsk classification (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/userEskClassifications/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllUserEskClassificationVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List userEsk versions
   * Get a list of all the versions of a userEsk identified by &#x60;id&#x60;
   * @param id Id of the userEsk (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/userEsks/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllUserEskVersion(@Param("id") UUID id);

  /**
   * List userEsk versions
   * Similar to <code>listAllUserEskVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a userEsk identified by &#x60;id&#x60;
   * @param id Id of the userEsk (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/userEsks/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllUserEskVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List userEsk classifications
   * Get a list of userEsk classifications.
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional)
   * @param limit Limit the number classifications returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of classifications before this cursor (optional)
   * @param after Returns list of classifications after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return UserEskClassificationList
   */
  @RequestLine("GET /v1/userEskClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  UserEskClassificationList listUserEskClassifications(@Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List userEsk classifications
   * Similar to <code>listUserEskClassifications</code> but it also returns the http response headers .
   * Get a list of userEsk classifications.
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional)
   * @param limit Limit the number classifications returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of classifications before this cursor (optional)
   * @param after Returns list of classifications after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/userEskClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserEskClassificationList> listUserEskClassificationsWithHttpInfo(@Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List userEsk classifications
   * Get a list of userEsk classifications.
   * Note, this is equivalent to the other <code>listUserEskClassifications</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListUserEskClassificationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>disabled - Filter Disabled Classifications (optional)</li>
   *   <li>limit - Limit the number classifications returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)</li>
   *   <li>before - Returns list of classifications before this cursor (optional)</li>
   *   <li>after - Returns list of classifications after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return UserEskClassificationList
   */
  @RequestLine("GET /v1/userEskClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  UserEskClassificationList listUserEskClassifications(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List userEsk classifications
  * Get a list of userEsk classifications.
  * Note, this is equivalent to the other <code>listUserEskClassifications</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>disabled - Filter Disabled Classifications (optional)</li>
          *   <li>limit - Limit the number classifications returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)</li>
          *   <li>before - Returns list of classifications before this cursor (optional)</li>
          *   <li>after - Returns list of classifications after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return UserEskClassificationList
      */
      @RequestLine("GET /v1/userEskClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<UserEskClassificationList> listUserEskClassificationsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listUserEskClassifications</code> method in a fluent style.
   */
  public static class ListUserEskClassificationsQueryParams extends HashMap<String, Object> {
    public ListUserEskClassificationsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListUserEskClassificationsQueryParams disabled(final String value) {
      put("disabled", EncodingUtils.encode(value));
      return this;
    }
    public ListUserEskClassificationsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListUserEskClassificationsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListUserEskClassificationsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListUserEskClassificationsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List userEsks
   * Get a list of userEsks. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param parent List userEsks filtered by children of userEsk identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent userEsk (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional, default to false)
   * @param limit Limit the number userEsks returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of userEsks before this cursor (optional)
   * @param after Returns list of userEsks after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return UserEskList
   */
  @RequestLine("GET /v1/userEsks?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  UserEskList listUserEsks(@Param("parent") String parent, @Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List userEsks
   * Similar to <code>listUserEsks</code> but it also returns the http response headers .
   * Get a list of userEsks. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param parent List userEsks filtered by children of userEsk identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent userEsk (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional, default to false)
   * @param limit Limit the number userEsks returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of userEsks before this cursor (optional)
   * @param after Returns list of userEsks after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/userEsks?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserEskList> listUserEsksWithHttpInfo(@Param("parent") String parent, @Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List userEsks
   * Get a list of userEsks. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listUserEsks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListUserEsksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>parent - List userEsks filtered by children of userEsk identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent userEsk (optional)</li>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>disabled - Filter Disabled Classifications (optional, default to false)</li>
   *   <li>limit - Limit the number userEsks returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of userEsks before this cursor (optional)</li>
   *   <li>after - Returns list of userEsks after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return UserEskList
   */
  @RequestLine("GET /v1/userEsks?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  UserEskList listUserEsks(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List userEsks
  * Get a list of userEsks. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listUserEsks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>parent - List userEsks filtered by children of userEsk identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent userEsk (optional)</li>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>disabled - Filter Disabled Classifications (optional, default to false)</li>
          *   <li>limit - Limit the number userEsks returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of userEsks before this cursor (optional)</li>
          *   <li>after - Returns list of userEsks after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return UserEskList
      */
      @RequestLine("GET /v1/userEsks?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<UserEskList> listUserEsksWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listUserEsks</code> method in a fluent style.
   */
  public static class ListUserEsksQueryParams extends HashMap<String, Object> {
    public ListUserEsksQueryParams parent(final String value) {
      put("parent", EncodingUtils.encode(value));
      return this;
    }
    public ListUserEsksQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListUserEsksQueryParams disabled(final String value) {
      put("disabled", EncodingUtils.encode(value));
      return this;
    }
    public ListUserEsksQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListUserEsksQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListUserEsksQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListUserEsksQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a userEsk
   * Update an existing userEsk using JsonPatch.
   * @param id Id of the userEsk (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a userEsk Documentation</a>
   */
  @RequestLine("PATCH /v1/userEsks/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchUserEsk(@Param("id") UUID id, Object body);

  /**
   * Update a userEsk
   * Similar to <code>patchUserEsk</code> but it also returns the http response headers .
   * Update an existing userEsk using JsonPatch.
   * @param id Id of the userEsk (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a userEsk Documentation</a>
   */
  @RequestLine("PATCH /v1/userEsks/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchUserEskWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Update a userEsk classification
   * Update an existing classification using JsonPatch.
   * @param id Id of the userEsk classification (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a userEsk classification Documentation</a>
   */
  @RequestLine("PATCH /v1/userEskClassifications/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchUserEskClassification(@Param("id") UUID id, Object body);

  /**
   * Update a userEsk classification
   * Similar to <code>patchUserEskClassification</code> but it also returns the http response headers .
   * Update an existing classification using JsonPatch.
   * @param id Id of the userEsk classification (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a userEsk classification Documentation</a>
   */
  @RequestLine("PATCH /v1/userEskClassifications/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchUserEskClassificationWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted classification
   * Restore a soft deleted classification.
   * @param restoreEntity  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/userEskClassifications/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table restoreClassification4(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted classification
   * Similar to <code>restoreClassification4</code> but it also returns the http response headers .
   * Restore a soft deleted classification.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/userEskClassifications/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> restoreClassification4WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Restore a soft deleted userEsk.
   * Restore a soft deleted userEsk.
   * @param restoreEntity  (optional)
   * @return UserEsk
   */
  @RequestLine("PUT /v1/userEsks/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserEsk restoreUserEsk(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted userEsk.
   * Similar to <code>restoreUserEsk</code> but it also returns the http response headers .
   * Restore a soft deleted userEsk.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/userEsks/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserEsk> restoreUserEskWithHttpInfo(RestoreEntity restoreEntity);


}
