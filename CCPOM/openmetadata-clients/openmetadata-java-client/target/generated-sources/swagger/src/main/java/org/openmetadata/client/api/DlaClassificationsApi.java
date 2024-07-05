package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface DlaClassificationsApi extends ApiClient.Api {


  /**
   * Create a dla
   * Create a new dla.
   * @param createDla  (optional)
   * @return Dla
   */
  @RequestLine("POST /v1/dlas")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Dla createDla(CreateDla createDla);

  /**
   * Create a dla
   * Similar to <code>createDla</code> but it also returns the http response headers .
   * Create a new dla.
   * @param createDla  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/dlas")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Dla> createDlaWithHttpInfo(CreateDla createDla);



  /**
   * Create a dla classification
   * Create a new dla classification. The request can include the children tags to be created along with the classification.
   * @param createDlaClassification  (optional)
   * @return DlaClassification
   */
  @RequestLine("POST /v1/dlaClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DlaClassification createDlaClassification(CreateDlaClassification createDlaClassification);

  /**
   * Create a dla classification
   * Similar to <code>createDlaClassification</code> but it also returns the http response headers .
   * Create a new dla classification. The request can include the children tags to be created along with the classification.
   * @param createDlaClassification  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/dlaClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DlaClassification> createDlaClassificationWithHttpInfo(CreateDlaClassification createDlaClassification);



  /**
   * Create or update a dla
   * Create a new dla, if it does not exist or update an existing dla.
   * @param createDla  (optional)
   * @return Dla
   */
  @RequestLine("PUT /v1/dlas")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Dla createOrUpdateDla(CreateDla createDla);

  /**
   * Create or update a dla
   * Similar to <code>createOrUpdateDla</code> but it also returns the http response headers .
   * Create a new dla, if it does not exist or update an existing dla.
   * @param createDla  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dlas")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Dla> createOrUpdateDlaWithHttpInfo(CreateDla createDla);



  /**
   * Update a dla classification
   * Update an existing dla category identify by dla category name
   * @param createDlaClassification  (optional)
   */
  @RequestLine("PUT /v1/dlaClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void createOrUpdateDlaClassification(CreateDlaClassification createDlaClassification);

  /**
   * Update a dla classification
   * Similar to <code>createOrUpdateDlaClassification</code> but it also returns the http response headers .
   * Update an existing dla category identify by dla category name
   * @param createDlaClassification  (optional)
   */
  @RequestLine("PUT /v1/dlaClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> createOrUpdateDlaClassificationWithHttpInfo(CreateDlaClassification createDlaClassification);



  /**
   * Delete a dla by id
   * Delete a dla by &#x60;id&#x60;.
   * @param id Id of the dla (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dlas/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDla(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a dla by id
   * Similar to <code>deleteDla</code> but it also returns the http response headers .
   * Delete a dla by &#x60;id&#x60;.
   * @param id Id of the dla (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dlas/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDlaWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a dla by id
   * Delete a dla by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteDla</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDlaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the dla (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dlas/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDla(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a dla by id
  * Delete a dla by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteDla</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the dla (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dlas/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDlaWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDla</code> method in a fluent style.
   */
  public static class DeleteDlaQueryParams extends HashMap<String, Object> {
    public DeleteDlaQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDlaQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a dla by fully qualified name
   * Delete a dla by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the dla (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dlas/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDlaByName(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a dla by fully qualified name
   * Similar to <code>deleteDlaByName</code> but it also returns the http response headers .
   * Delete a dla by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the dla (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dlas/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDlaByNameWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a dla by fully qualified name
   * Delete a dla by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteDlaByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDlaByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the dla (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dlas/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDlaByName(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a dla by fully qualified name
  * Delete a dla by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteDlaByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the dla (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dlas/name/{fqn}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDlaByNameWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDlaByName</code> method in a fluent style.
   */
  public static class DeleteDlaByNameQueryParams extends HashMap<String, Object> {
    public DeleteDlaByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete dla classification by id
   * Delete a dla classification and all the tags(dlas) under it.
   * @param id Id of the dla classification (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dlaClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDlaClassification(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete dla classification by id
   * Similar to <code>deleteDlaClassification</code> but it also returns the http response headers .
   * Delete a dla classification and all the tags(dlas) under it.
   * @param id Id of the dla classification (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dlaClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDlaClassificationWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete dla classification by id
   * Delete a dla classification and all the tags(dlas) under it.
   * Note, this is equivalent to the other <code>deleteDlaClassification</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDlaClassificationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the dla classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dlaClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDlaClassification(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete dla classification by id
  * Delete a dla classification and all the tags(dlas) under it.
  * Note, this is equivalent to the other <code>deleteDlaClassification</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the dla classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dlaClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDlaClassificationWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDlaClassification</code> method in a fluent style.
   */
  public static class DeleteDlaClassificationQueryParams extends HashMap<String, Object> {
    public DeleteDlaClassificationQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteDlaClassificationQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete dla classification by name
   * Delete a dla classification by &#x60;name&#x60; and all the tags under it.
   * @param name Name of the dla classification (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dlaClassifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDlaClassificationByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete dla classification by name
   * Similar to <code>deleteDlaClassificationByName</code> but it also returns the http response headers .
   * Delete a dla classification by &#x60;name&#x60; and all the tags under it.
   * @param name Name of the dla classification (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/dlaClassifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDlaClassificationByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete dla classification by name
   * Delete a dla classification by &#x60;name&#x60; and all the tags under it.
   * Note, this is equivalent to the other <code>deleteDlaClassificationByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDlaClassificationByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the dla classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/dlaClassifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteDlaClassificationByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete dla classification by name
  * Delete a dla classification by &#x60;name&#x60; and all the tags under it.
  * Note, this is equivalent to the other <code>deleteDlaClassificationByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the dla classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/dlaClassifications/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteDlaClassificationByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDlaClassificationByName</code> method in a fluent style.
   */
  public static class DeleteDlaClassificationByNameQueryParams extends HashMap<String, Object> {
    public DeleteDlaClassificationByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a dla by fully qualified name
   * Get a dla by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the dla (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Dla
   */
  @RequestLine("GET /v1/dlas/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Dla getDlaByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a dla by fully qualified name
   * Similar to <code>getDlaByFQN</code> but it also returns the http response headers .
   * Get a dla by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the dla (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dlas/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Dla> getDlaByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a dla by fully qualified name
   * Get a dla by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getDlaByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDlaByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the dla (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Dla
   */
  @RequestLine("GET /v1/dlas/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Dla getDlaByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a dla by fully qualified name
  * Get a dla by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getDlaByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the dla (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Dla
      */
      @RequestLine("GET /v1/dlas/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Dla> getDlaByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDlaByFQN</code> method in a fluent style.
   */
  public static class GetDlaByFQNQueryParams extends HashMap<String, Object> {
    public GetDlaByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDlaByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a dla by id
   * Get a dla by &#x60;id&#x60;.
   * @param id Id of the dla (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Dla
   */
  @RequestLine("GET /v1/dlas/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Dla getDlaByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a dla by id
   * Similar to <code>getDlaByID</code> but it also returns the http response headers .
   * Get a dla by &#x60;id&#x60;.
   * @param id Id of the dla (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dlas/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Dla> getDlaByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a dla by id
   * Get a dla by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getDlaByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDlaByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the dla (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Dla
   */
  @RequestLine("GET /v1/dlas/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Dla getDlaByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a dla by id
  * Get a dla by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getDlaByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the dla (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Dla
      */
      @RequestLine("GET /v1/dlas/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Dla> getDlaByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDlaByID</code> method in a fluent style.
   */
  public static class GetDlaByIDQueryParams extends HashMap<String, Object> {
    public GetDlaByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDlaByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a dla classification by id
   * Get a dla classification by &#x60;id&#x60;
   * @param id Id of the dla classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DlaClassification
   */
  @RequestLine("GET /v1/dlaClassifications/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DlaClassification getDlaClassificationByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a dla classification by id
   * Similar to <code>getDlaClassificationByID</code> but it also returns the http response headers .
   * Get a dla classification by &#x60;id&#x60;
   * @param id Id of the dla classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dlaClassifications/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DlaClassification> getDlaClassificationByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a dla classification by id
   * Get a dla classification by &#x60;id&#x60;
   * Note, this is equivalent to the other <code>getDlaClassificationByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDlaClassificationByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the dla classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DlaClassification
   */
  @RequestLine("GET /v1/dlaClassifications/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DlaClassification getDlaClassificationByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a dla classification by id
  * Get a dla classification by &#x60;id&#x60;
  * Note, this is equivalent to the other <code>getDlaClassificationByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the dla classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DlaClassification
      */
      @RequestLine("GET /v1/dlaClassifications/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DlaClassification> getDlaClassificationByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDlaClassificationByID</code> method in a fluent style.
   */
  public static class GetDlaClassificationByIDQueryParams extends HashMap<String, Object> {
    public GetDlaClassificationByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDlaClassificationByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a dla classification by name
   * Get a dla classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(dla).
   * @param name Name of the dla classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DlaClassification
   */
  @RequestLine("GET /v1/dlaClassifications/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DlaClassification getDlaClassificationByName(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a dla classification by name
   * Similar to <code>getDlaClassificationByName</code> but it also returns the http response headers .
   * Get a dla classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(dla).
   * @param name Name of the dla classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dlaClassifications/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DlaClassification> getDlaClassificationByNameWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a dla classification by name
   * Get a dla classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(dla).
   * Note, this is equivalent to the other <code>getDlaClassificationByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDlaClassificationByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the dla classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DlaClassification
   */
  @RequestLine("GET /v1/dlaClassifications/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DlaClassification getDlaClassificationByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a dla classification by name
  * Get a dla classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(dla).
  * Note, this is equivalent to the other <code>getDlaClassificationByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the dla classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DlaClassification
      */
      @RequestLine("GET /v1/dlaClassifications/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DlaClassification> getDlaClassificationByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDlaClassificationByName</code> method in a fluent style.
   */
  public static class GetDlaClassificationByNameQueryParams extends HashMap<String, Object> {
    public GetDlaClassificationByNameQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetDlaClassificationByNameQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the dla classification
   * Get a version of the dla classification by given &#x60;id&#x60;
   * @param id Id of the dla classification (required)
   * @param version dla classification version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return DlaClassification
   */
  @RequestLine("GET /v1/dlaClassifications/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  DlaClassification getSpecificDlaClassificationVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the dla classification
   * Similar to <code>getSpecificDlaClassificationVersion</code> but it also returns the http response headers .
   * Get a version of the dla classification by given &#x60;id&#x60;
   * @param id Id of the dla classification (required)
   * @param version dla classification version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dlaClassifications/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DlaClassification> getSpecificDlaClassificationVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a version of the dlas
   * Get a version of the dla by given &#x60;id&#x60;
   * @param id Id of the dla (required)
   * @param version dla version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Dla
   */
  @RequestLine("GET /v1/dlas/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Dla getSpecificDlaVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the dlas
   * Similar to <code>getSpecificDlaVersion</code> but it also returns the http response headers .
   * Get a version of the dla by given &#x60;id&#x60;
   * @param id Id of the dla (required)
   * @param version dla version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dlas/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Dla> getSpecificDlaVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List dla classification versions
   * Get a list of all the versions of a dla classification identified by &#x60;id&#x60;
   * @param id Id of the dla classification (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/dlaClassifications/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllDlaClassificationVersion(@Param("id") UUID id);

  /**
   * List dla classification versions
   * Similar to <code>listAllDlaClassificationVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a dla classification identified by &#x60;id&#x60;
   * @param id Id of the dla classification (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dlaClassifications/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllDlaClassificationVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List dla versions
   * Get a list of all the versions of a dla identified by &#x60;id&#x60;
   * @param id Id of the dla (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/dlas/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllDlaVersion(@Param("id") UUID id);

  /**
   * List dla versions
   * Similar to <code>listAllDlaVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a dla identified by &#x60;id&#x60;
   * @param id Id of the dla (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dlas/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllDlaVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List dla classifications
   * Get a list of dla classifications.
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional)
   * @param limit Limit the number classifications returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of classifications before this cursor (optional)
   * @param after Returns list of classifications after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DlaClassificationList
   */
  @RequestLine("GET /v1/dlaClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DlaClassificationList listDlaClassifications(@Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List dla classifications
   * Similar to <code>listDlaClassifications</code> but it also returns the http response headers .
   * Get a list of dla classifications.
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional)
   * @param limit Limit the number classifications returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of classifications before this cursor (optional)
   * @param after Returns list of classifications after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dlaClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DlaClassificationList> listDlaClassificationsWithHttpInfo(@Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List dla classifications
   * Get a list of dla classifications.
   * Note, this is equivalent to the other <code>listDlaClassifications</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDlaClassificationsQueryParams} class that allows for
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
   * @return DlaClassificationList
   */
  @RequestLine("GET /v1/dlaClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DlaClassificationList listDlaClassifications(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List dla classifications
  * Get a list of dla classifications.
  * Note, this is equivalent to the other <code>listDlaClassifications</code> that receives the query parameters as a map,
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
          * @return DlaClassificationList
      */
      @RequestLine("GET /v1/dlaClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DlaClassificationList> listDlaClassificationsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listDlaClassifications</code> method in a fluent style.
   */
  public static class ListDlaClassificationsQueryParams extends HashMap<String, Object> {
    public ListDlaClassificationsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListDlaClassificationsQueryParams disabled(final String value) {
      put("disabled", EncodingUtils.encode(value));
      return this;
    }
    public ListDlaClassificationsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListDlaClassificationsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListDlaClassificationsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListDlaClassificationsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List dlas
   * Get a list of dlas. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param parent List dlas filtered by children of dla identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent dla (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional, default to false)
   * @param limit Limit the number dlas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of dlas before this cursor (optional)
   * @param after Returns list of dlas after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return DlaList
   */
  @RequestLine("GET /v1/dlas?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  DlaList listDlas(@Param("parent") String parent, @Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List dlas
   * Similar to <code>listDlas</code> but it also returns the http response headers .
   * Get a list of dlas. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param parent List dlas filtered by children of dla identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent dla (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional, default to false)
   * @param limit Limit the number dlas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of dlas before this cursor (optional)
   * @param after Returns list of dlas after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dlas?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DlaList> listDlasWithHttpInfo(@Param("parent") String parent, @Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List dlas
   * Get a list of dlas. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listDlas</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDlasQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>parent - List dlas filtered by children of dla identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent dla (optional)</li>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>disabled - Filter Disabled Classifications (optional, default to false)</li>
   *   <li>limit - Limit the number dlas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of dlas before this cursor (optional)</li>
   *   <li>after - Returns list of dlas after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return DlaList
   */
  @RequestLine("GET /v1/dlas?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  DlaList listDlas(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List dlas
  * Get a list of dlas. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listDlas</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>parent - List dlas filtered by children of dla identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent dla (optional)</li>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>disabled - Filter Disabled Classifications (optional, default to false)</li>
          *   <li>limit - Limit the number dlas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of dlas before this cursor (optional)</li>
          *   <li>after - Returns list of dlas after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return DlaList
      */
      @RequestLine("GET /v1/dlas?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DlaList> listDlasWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listDlas</code> method in a fluent style.
   */
  public static class ListDlasQueryParams extends HashMap<String, Object> {
    public ListDlasQueryParams parent(final String value) {
      put("parent", EncodingUtils.encode(value));
      return this;
    }
    public ListDlasQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListDlasQueryParams disabled(final String value) {
      put("disabled", EncodingUtils.encode(value));
      return this;
    }
    public ListDlasQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListDlasQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListDlasQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListDlasQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a dla
   * Update an existing dla using JsonPatch.
   * @param id Id of the dla (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a dla Documentation</a>
   */
  @RequestLine("PATCH /v1/dlas/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchDla(@Param("id") UUID id, Object body);

  /**
   * Update a dla
   * Similar to <code>patchDla</code> but it also returns the http response headers .
   * Update an existing dla using JsonPatch.
   * @param id Id of the dla (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a dla Documentation</a>
   */
  @RequestLine("PATCH /v1/dlas/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchDlaWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Update a dla classification
   * Update an existing classification using JsonPatch.
   * @param id Id of the dla classification (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a dla classification Documentation</a>
   */
  @RequestLine("PATCH /v1/dlaClassifications/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchDlaClassification(@Param("id") UUID id, Object body);

  /**
   * Update a dla classification
   * Similar to <code>patchDlaClassification</code> but it also returns the http response headers .
   * Update an existing classification using JsonPatch.
   * @param id Id of the dla classification (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a dla classification Documentation</a>
   */
  @RequestLine("PATCH /v1/dlaClassifications/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchDlaClassificationWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted classification
   * Restore a soft deleted classification.
   * @param restoreEntity  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/dlaClassifications/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table restoreClassification1(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted classification
   * Similar to <code>restoreClassification1</code> but it also returns the http response headers .
   * Restore a soft deleted classification.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dlaClassifications/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> restoreClassification1WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Restore a soft deleted dla.
   * Restore a soft deleted dla.
   * @param restoreEntity  (optional)
   * @return Dla
   */
  @RequestLine("PUT /v1/dlas/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Dla restoreDla(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted dla.
   * Similar to <code>restoreDla</code> but it also returns the http response headers .
   * Restore a soft deleted dla.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dlas/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Dla> restoreDlaWithHttpInfo(RestoreEntity restoreEntity);


}
