package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface AutoSystemClassificationsApi extends ApiClient.Api {


  /**
   * Create a autoSystem
   * Create a new autoSystem.
   * @param createAutoSystem  (optional)
   * @return AutoSystem
   */
  @RequestLine("POST /v1/autoSystems")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AutoSystem createAutoSystem(CreateAutoSystem createAutoSystem);

  /**
   * Create a autoSystem
   * Similar to <code>createAutoSystem</code> but it also returns the http response headers .
   * Create a new autoSystem.
   * @param createAutoSystem  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/autoSystems")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AutoSystem> createAutoSystemWithHttpInfo(CreateAutoSystem createAutoSystem);



  /**
   * Create a autoSystem classification
   * Create a new autoSystem classification. The request can include the children tags to be created along with the classification.
   * @param createAutoSystemClassification  (optional)
   * @return AutoSystemClassification
   */
  @RequestLine("POST /v1/autoSystemClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AutoSystemClassification createAutoSystemClassification(CreateAutoSystemClassification createAutoSystemClassification);

  /**
   * Create a autoSystem classification
   * Similar to <code>createAutoSystemClassification</code> but it also returns the http response headers .
   * Create a new autoSystem classification. The request can include the children tags to be created along with the classification.
   * @param createAutoSystemClassification  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/autoSystemClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AutoSystemClassification> createAutoSystemClassificationWithHttpInfo(CreateAutoSystemClassification createAutoSystemClassification);



  /**
   * Create or update a autoSystem
   * Create a new autoSystem, if it does not exist or update an existing autoSystem.
   * @param createAutoSystem  (optional)
   * @return AutoSystem
   */
  @RequestLine("PUT /v1/autoSystems")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AutoSystem createOrUpdateAutoSystem(CreateAutoSystem createAutoSystem);

  /**
   * Create or update a autoSystem
   * Similar to <code>createOrUpdateAutoSystem</code> but it also returns the http response headers .
   * Create a new autoSystem, if it does not exist or update an existing autoSystem.
   * @param createAutoSystem  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/autoSystems")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AutoSystem> createOrUpdateAutoSystemWithHttpInfo(CreateAutoSystem createAutoSystem);



  /**
   * Update a autoSystem classification
   * Update an existing autoSystem category identify by autoSystem category name
   * @param createAutoSystemClassification  (optional)
   */
  @RequestLine("PUT /v1/autoSystemClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void createOrUpdateAutoSystemClassification(CreateAutoSystemClassification createAutoSystemClassification);

  /**
   * Update a autoSystem classification
   * Similar to <code>createOrUpdateAutoSystemClassification</code> but it also returns the http response headers .
   * Update an existing autoSystem category identify by autoSystem category name
   * @param createAutoSystemClassification  (optional)
   */
  @RequestLine("PUT /v1/autoSystemClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> createOrUpdateAutoSystemClassificationWithHttpInfo(CreateAutoSystemClassification createAutoSystemClassification);



  /**
   * Delete a autoSystem by id
   * Delete a autoSystem by &#x60;id&#x60;.
   * @param id Id of the autoSystem (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/autoSystems/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteAutoSystem(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a autoSystem by id
   * Similar to <code>deleteAutoSystem</code> but it also returns the http response headers .
   * Delete a autoSystem by &#x60;id&#x60;.
   * @param id Id of the autoSystem (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/autoSystems/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteAutoSystemWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a autoSystem by id
   * Delete a autoSystem by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteAutoSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAutoSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the autoSystem (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/autoSystems/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteAutoSystem(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a autoSystem by id
  * Delete a autoSystem by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteAutoSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the autoSystem (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/autoSystems/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteAutoSystemWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteAutoSystem</code> method in a fluent style.
   */
  public static class DeleteAutoSystemQueryParams extends HashMap<String, Object> {
    public DeleteAutoSystemQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteAutoSystemQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a autoSystem by fully qualified name
   * Delete a autoSystem by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the autoSystem (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/autoSystems/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteAutoSystemByName(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a autoSystem by fully qualified name
   * Similar to <code>deleteAutoSystemByName</code> but it also returns the http response headers .
   * Delete a autoSystem by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the autoSystem (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/autoSystems/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteAutoSystemByNameWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a autoSystem by fully qualified name
   * Delete a autoSystem by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteAutoSystemByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAutoSystemByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the autoSystem (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/autoSystems/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteAutoSystemByName(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a autoSystem by fully qualified name
  * Delete a autoSystem by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteAutoSystemByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the autoSystem (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/autoSystems/name/{fqn}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteAutoSystemByNameWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteAutoSystemByName</code> method in a fluent style.
   */
  public static class DeleteAutoSystemByNameQueryParams extends HashMap<String, Object> {
    public DeleteAutoSystemByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete autoSystem classification by id
   * Delete a autoSystem classification and all the tags(autoSystems) under it.
   * @param id Id of the autoSystem classification (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/autoSystemClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteAutoSystemClassification(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete autoSystem classification by id
   * Similar to <code>deleteAutoSystemClassification</code> but it also returns the http response headers .
   * Delete a autoSystem classification and all the tags(autoSystems) under it.
   * @param id Id of the autoSystem classification (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/autoSystemClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteAutoSystemClassificationWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete autoSystem classification by id
   * Delete a autoSystem classification and all the tags(autoSystems) under it.
   * Note, this is equivalent to the other <code>deleteAutoSystemClassification</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAutoSystemClassificationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the autoSystem classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/autoSystemClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteAutoSystemClassification(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete autoSystem classification by id
  * Delete a autoSystem classification and all the tags(autoSystems) under it.
  * Note, this is equivalent to the other <code>deleteAutoSystemClassification</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the autoSystem classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/autoSystemClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteAutoSystemClassificationWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteAutoSystemClassification</code> method in a fluent style.
   */
  public static class DeleteAutoSystemClassificationQueryParams extends HashMap<String, Object> {
    public DeleteAutoSystemClassificationQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteAutoSystemClassificationQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete autoSystem classification by name
   * Delete a autoSystem classification by &#x60;name&#x60; and all the tags under it.
   * @param name Name of the autoSystem classification (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/autoSystemClassifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteAutoSystemClassificationByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete autoSystem classification by name
   * Similar to <code>deleteAutoSystemClassificationByName</code> but it also returns the http response headers .
   * Delete a autoSystem classification by &#x60;name&#x60; and all the tags under it.
   * @param name Name of the autoSystem classification (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/autoSystemClassifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteAutoSystemClassificationByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete autoSystem classification by name
   * Delete a autoSystem classification by &#x60;name&#x60; and all the tags under it.
   * Note, this is equivalent to the other <code>deleteAutoSystemClassificationByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAutoSystemClassificationByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the autoSystem classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/autoSystemClassifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteAutoSystemClassificationByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete autoSystem classification by name
  * Delete a autoSystem classification by &#x60;name&#x60; and all the tags under it.
  * Note, this is equivalent to the other <code>deleteAutoSystemClassificationByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the autoSystem classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/autoSystemClassifications/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteAutoSystemClassificationByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteAutoSystemClassificationByName</code> method in a fluent style.
   */
  public static class DeleteAutoSystemClassificationByNameQueryParams extends HashMap<String, Object> {
    public DeleteAutoSystemClassificationByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a autoSystem by fully qualified name
   * Get a autoSystem by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the autoSystem (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return AutoSystem
   */
  @RequestLine("GET /v1/autoSystems/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  AutoSystem getAutoSystemByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a autoSystem by fully qualified name
   * Similar to <code>getAutoSystemByFQN</code> but it also returns the http response headers .
   * Get a autoSystem by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the autoSystem (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/autoSystems/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AutoSystem> getAutoSystemByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a autoSystem by fully qualified name
   * Get a autoSystem by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getAutoSystemByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAutoSystemByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the autoSystem (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return AutoSystem
   */
  @RequestLine("GET /v1/autoSystems/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  AutoSystem getAutoSystemByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a autoSystem by fully qualified name
  * Get a autoSystem by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getAutoSystemByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the autoSystem (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return AutoSystem
      */
      @RequestLine("GET /v1/autoSystems/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AutoSystem> getAutoSystemByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAutoSystemByFQN</code> method in a fluent style.
   */
  public static class GetAutoSystemByFQNQueryParams extends HashMap<String, Object> {
    public GetAutoSystemByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetAutoSystemByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a autoSystem by id
   * Get a autoSystem by &#x60;id&#x60;.
   * @param id Id of the autoSystem (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return AutoSystem
   */
  @RequestLine("GET /v1/autoSystems/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  AutoSystem getAutoSystemByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a autoSystem by id
   * Similar to <code>getAutoSystemByID</code> but it also returns the http response headers .
   * Get a autoSystem by &#x60;id&#x60;.
   * @param id Id of the autoSystem (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/autoSystems/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AutoSystem> getAutoSystemByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a autoSystem by id
   * Get a autoSystem by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getAutoSystemByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAutoSystemByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the autoSystem (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return AutoSystem
   */
  @RequestLine("GET /v1/autoSystems/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  AutoSystem getAutoSystemByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a autoSystem by id
  * Get a autoSystem by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getAutoSystemByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the autoSystem (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return AutoSystem
      */
      @RequestLine("GET /v1/autoSystems/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AutoSystem> getAutoSystemByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAutoSystemByID</code> method in a fluent style.
   */
  public static class GetAutoSystemByIDQueryParams extends HashMap<String, Object> {
    public GetAutoSystemByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetAutoSystemByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a autoSystem classification by id
   * Get a autoSystem classification by &#x60;id&#x60;
   * @param id Id of the autoSystem classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return AutoSystemClassification
   */
  @RequestLine("GET /v1/autoSystemClassifications/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  AutoSystemClassification getAutoSystemClassificationByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a autoSystem classification by id
   * Similar to <code>getAutoSystemClassificationByID</code> but it also returns the http response headers .
   * Get a autoSystem classification by &#x60;id&#x60;
   * @param id Id of the autoSystem classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/autoSystemClassifications/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AutoSystemClassification> getAutoSystemClassificationByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a autoSystem classification by id
   * Get a autoSystem classification by &#x60;id&#x60;
   * Note, this is equivalent to the other <code>getAutoSystemClassificationByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAutoSystemClassificationByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the autoSystem classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return AutoSystemClassification
   */
  @RequestLine("GET /v1/autoSystemClassifications/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  AutoSystemClassification getAutoSystemClassificationByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a autoSystem classification by id
  * Get a autoSystem classification by &#x60;id&#x60;
  * Note, this is equivalent to the other <code>getAutoSystemClassificationByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the autoSystem classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return AutoSystemClassification
      */
      @RequestLine("GET /v1/autoSystemClassifications/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AutoSystemClassification> getAutoSystemClassificationByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAutoSystemClassificationByID</code> method in a fluent style.
   */
  public static class GetAutoSystemClassificationByIDQueryParams extends HashMap<String, Object> {
    public GetAutoSystemClassificationByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetAutoSystemClassificationByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a autoSystem classification by name
   * Get a autoSystem classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(autoSystem).
   * @param name Name of the autoSystem classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return AutoSystemClassification
   */
  @RequestLine("GET /v1/autoSystemClassifications/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  AutoSystemClassification getAutoSystemClassificationByName(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a autoSystem classification by name
   * Similar to <code>getAutoSystemClassificationByName</code> but it also returns the http response headers .
   * Get a autoSystem classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(autoSystem).
   * @param name Name of the autoSystem classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/autoSystemClassifications/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AutoSystemClassification> getAutoSystemClassificationByNameWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a autoSystem classification by name
   * Get a autoSystem classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(autoSystem).
   * Note, this is equivalent to the other <code>getAutoSystemClassificationByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAutoSystemClassificationByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the autoSystem classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return AutoSystemClassification
   */
  @RequestLine("GET /v1/autoSystemClassifications/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  AutoSystemClassification getAutoSystemClassificationByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a autoSystem classification by name
  * Get a autoSystem classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(autoSystem).
  * Note, this is equivalent to the other <code>getAutoSystemClassificationByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the autoSystem classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return AutoSystemClassification
      */
      @RequestLine("GET /v1/autoSystemClassifications/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AutoSystemClassification> getAutoSystemClassificationByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAutoSystemClassificationByName</code> method in a fluent style.
   */
  public static class GetAutoSystemClassificationByNameQueryParams extends HashMap<String, Object> {
    public GetAutoSystemClassificationByNameQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetAutoSystemClassificationByNameQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the autoSystem classification
   * Get a version of the autoSystem classification by given &#x60;id&#x60;
   * @param id Id of the autoSystem classification (required)
   * @param version autoSystem classification version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return AutoSystemClassification
   */
  @RequestLine("GET /v1/autoSystemClassifications/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  AutoSystemClassification getSpecificAutoSystemClassificationVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the autoSystem classification
   * Similar to <code>getSpecificAutoSystemClassificationVersion</code> but it also returns the http response headers .
   * Get a version of the autoSystem classification by given &#x60;id&#x60;
   * @param id Id of the autoSystem classification (required)
   * @param version autoSystem classification version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/autoSystemClassifications/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AutoSystemClassification> getSpecificAutoSystemClassificationVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a version of the autoSystems
   * Get a version of the autoSystem by given &#x60;id&#x60;
   * @param id Id of the autoSystem (required)
   * @param version autoSystem version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return AutoSystem
   */
  @RequestLine("GET /v1/autoSystems/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  AutoSystem getSpecificAutoSystemVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the autoSystems
   * Similar to <code>getSpecificAutoSystemVersion</code> but it also returns the http response headers .
   * Get a version of the autoSystem by given &#x60;id&#x60;
   * @param id Id of the autoSystem (required)
   * @param version autoSystem version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/autoSystems/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AutoSystem> getSpecificAutoSystemVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List autoSystem classification versions
   * Get a list of all the versions of a autoSystem classification identified by &#x60;id&#x60;
   * @param id Id of the autoSystem classification (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/autoSystemClassifications/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllAutoSystemClassificationVersion(@Param("id") UUID id);

  /**
   * List autoSystem classification versions
   * Similar to <code>listAllAutoSystemClassificationVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a autoSystem classification identified by &#x60;id&#x60;
   * @param id Id of the autoSystem classification (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/autoSystemClassifications/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllAutoSystemClassificationVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List autoSystem versions
   * Get a list of all the versions of a autoSystem identified by &#x60;id&#x60;
   * @param id Id of the autoSystem (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/autoSystems/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllAutoSystemVersion(@Param("id") UUID id);

  /**
   * List autoSystem versions
   * Similar to <code>listAllAutoSystemVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a autoSystem identified by &#x60;id&#x60;
   * @param id Id of the autoSystem (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/autoSystems/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllAutoSystemVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List autoSystem classifications
   * Get a list of autoSystem classifications.
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional)
   * @param limit Limit the number classifications returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of classifications before this cursor (optional)
   * @param after Returns list of classifications after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return AutoSystemClassificationList
   */
  @RequestLine("GET /v1/autoSystemClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  AutoSystemClassificationList listAutoSystemClassifications(@Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List autoSystem classifications
   * Similar to <code>listAutoSystemClassifications</code> but it also returns the http response headers .
   * Get a list of autoSystem classifications.
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional)
   * @param limit Limit the number classifications returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of classifications before this cursor (optional)
   * @param after Returns list of classifications after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/autoSystemClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AutoSystemClassificationList> listAutoSystemClassificationsWithHttpInfo(@Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List autoSystem classifications
   * Get a list of autoSystem classifications.
   * Note, this is equivalent to the other <code>listAutoSystemClassifications</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAutoSystemClassificationsQueryParams} class that allows for
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
   * @return AutoSystemClassificationList
   */
  @RequestLine("GET /v1/autoSystemClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  AutoSystemClassificationList listAutoSystemClassifications(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List autoSystem classifications
  * Get a list of autoSystem classifications.
  * Note, this is equivalent to the other <code>listAutoSystemClassifications</code> that receives the query parameters as a map,
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
          * @return AutoSystemClassificationList
      */
      @RequestLine("GET /v1/autoSystemClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AutoSystemClassificationList> listAutoSystemClassificationsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listAutoSystemClassifications</code> method in a fluent style.
   */
  public static class ListAutoSystemClassificationsQueryParams extends HashMap<String, Object> {
    public ListAutoSystemClassificationsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListAutoSystemClassificationsQueryParams disabled(final String value) {
      put("disabled", EncodingUtils.encode(value));
      return this;
    }
    public ListAutoSystemClassificationsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListAutoSystemClassificationsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListAutoSystemClassificationsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListAutoSystemClassificationsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List autoSystems
   * Get a list of autoSystems. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param parent List autoSystems filtered by children of autoSystem identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent autoSystem (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional, default to false)
   * @param limit Limit the number autoSystems returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of autoSystems before this cursor (optional)
   * @param after Returns list of autoSystems after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return AutoSystemList
   */
  @RequestLine("GET /v1/autoSystems?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  AutoSystemList listAutoSystems(@Param("parent") String parent, @Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List autoSystems
   * Similar to <code>listAutoSystems</code> but it also returns the http response headers .
   * Get a list of autoSystems. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param parent List autoSystems filtered by children of autoSystem identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent autoSystem (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional, default to false)
   * @param limit Limit the number autoSystems returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of autoSystems before this cursor (optional)
   * @param after Returns list of autoSystems after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/autoSystems?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AutoSystemList> listAutoSystemsWithHttpInfo(@Param("parent") String parent, @Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List autoSystems
   * Get a list of autoSystems. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listAutoSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAutoSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>parent - List autoSystems filtered by children of autoSystem identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent autoSystem (optional)</li>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>disabled - Filter Disabled Classifications (optional, default to false)</li>
   *   <li>limit - Limit the number autoSystems returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of autoSystems before this cursor (optional)</li>
   *   <li>after - Returns list of autoSystems after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return AutoSystemList
   */
  @RequestLine("GET /v1/autoSystems?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  AutoSystemList listAutoSystems(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List autoSystems
  * Get a list of autoSystems. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listAutoSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>parent - List autoSystems filtered by children of autoSystem identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent autoSystem (optional)</li>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>disabled - Filter Disabled Classifications (optional, default to false)</li>
          *   <li>limit - Limit the number autoSystems returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of autoSystems before this cursor (optional)</li>
          *   <li>after - Returns list of autoSystems after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return AutoSystemList
      */
      @RequestLine("GET /v1/autoSystems?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AutoSystemList> listAutoSystemsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listAutoSystems</code> method in a fluent style.
   */
  public static class ListAutoSystemsQueryParams extends HashMap<String, Object> {
    public ListAutoSystemsQueryParams parent(final String value) {
      put("parent", EncodingUtils.encode(value));
      return this;
    }
    public ListAutoSystemsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListAutoSystemsQueryParams disabled(final String value) {
      put("disabled", EncodingUtils.encode(value));
      return this;
    }
    public ListAutoSystemsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListAutoSystemsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListAutoSystemsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListAutoSystemsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a autoSystem
   * Update an existing autoSystem using JsonPatch.
   * @param id Id of the autoSystem (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a autoSystem Documentation</a>
   */
  @RequestLine("PATCH /v1/autoSystems/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchAutoSystem(@Param("id") UUID id, Object body);

  /**
   * Update a autoSystem
   * Similar to <code>patchAutoSystem</code> but it also returns the http response headers .
   * Update an existing autoSystem using JsonPatch.
   * @param id Id of the autoSystem (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a autoSystem Documentation</a>
   */
  @RequestLine("PATCH /v1/autoSystems/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchAutoSystemWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Update a autoSystem classification
   * Update an existing classification using JsonPatch.
   * @param id Id of the autoSystem classification (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a autoSystem classification Documentation</a>
   */
  @RequestLine("PATCH /v1/autoSystemClassifications/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchAutoSystemClassification(@Param("id") UUID id, Object body);

  /**
   * Update a autoSystem classification
   * Similar to <code>patchAutoSystemClassification</code> but it also returns the http response headers .
   * Update an existing classification using JsonPatch.
   * @param id Id of the autoSystem classification (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a autoSystem classification Documentation</a>
   */
  @RequestLine("PATCH /v1/autoSystemClassifications/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchAutoSystemClassificationWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted autoSystem.
   * Restore a soft deleted autoSystem.
   * @param restoreEntity  (optional)
   * @return AutoSystem
   */
  @RequestLine("PUT /v1/autoSystems/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AutoSystem restoreAutoSystem(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted autoSystem.
   * Similar to <code>restoreAutoSystem</code> but it also returns the http response headers .
   * Restore a soft deleted autoSystem.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/autoSystems/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AutoSystem> restoreAutoSystemWithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Restore a soft deleted classification
   * Restore a soft deleted classification.
   * @param restoreEntity  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/autoSystemClassifications/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table restoreClassification(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted classification
   * Similar to <code>restoreClassification</code> but it also returns the http response headers .
   * Restore a soft deleted classification.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/autoSystemClassifications/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> restoreClassificationWithHttpInfo(RestoreEntity restoreEntity);


}
