package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateSpd;
import org.openmetadata.client.model.CreateSpdClassification;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Spd;
import org.openmetadata.client.model.SpdClassification;
import org.openmetadata.client.model.SpdClassificationList;
import org.openmetadata.client.model.SpdList;
import org.openmetadata.client.model.Table;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface SpdClassificationsApi extends ApiClient.Api {


  /**
   * Create or update a spd
   * Create a new spd, if it does not exist or update an existing spd.
   * @param createSpd  (optional)
   * @return Spd
   */
  @RequestLine("PUT /v1/spds")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Spd createOrUpdateSpd(CreateSpd createSpd);

  /**
   * Create or update a spd
   * Similar to <code>createOrUpdateSpd</code> but it also returns the http response headers .
   * Create a new spd, if it does not exist or update an existing spd.
   * @param createSpd  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/spds")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Spd> createOrUpdateSpdWithHttpInfo(CreateSpd createSpd);



  /**
   * Update a spd classification
   * Update an existing spd category identify by spd category name
   * @param createSpdClassification  (optional)
   */
  @RequestLine("PUT /v1/spdClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void createOrUpdateSpdClassification(CreateSpdClassification createSpdClassification);

  /**
   * Update a spd classification
   * Similar to <code>createOrUpdateSpdClassification</code> but it also returns the http response headers .
   * Update an existing spd category identify by spd category name
   * @param createSpdClassification  (optional)
   */
  @RequestLine("PUT /v1/spdClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> createOrUpdateSpdClassificationWithHttpInfo(CreateSpdClassification createSpdClassification);



  /**
   * Create a spd
   * Create a new spd.
   * @param createSpd  (optional)
   * @return Spd
   */
  @RequestLine("POST /v1/spds")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Spd createSpd(CreateSpd createSpd);

  /**
   * Create a spd
   * Similar to <code>createSpd</code> but it also returns the http response headers .
   * Create a new spd.
   * @param createSpd  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/spds")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Spd> createSpdWithHttpInfo(CreateSpd createSpd);



  /**
   * Create a spd classification
   * Create a new spd classification. The request can include the children tags to be created along with the classification.
   * @param createSpdClassification  (optional)
   * @return SpdClassification
   */
  @RequestLine("POST /v1/spdClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SpdClassification createSpdClassification(CreateSpdClassification createSpdClassification);

  /**
   * Create a spd classification
   * Similar to <code>createSpdClassification</code> but it also returns the http response headers .
   * Create a new spd classification. The request can include the children tags to be created along with the classification.
   * @param createSpdClassification  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/spdClassifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SpdClassification> createSpdClassificationWithHttpInfo(CreateSpdClassification createSpdClassification);



  /**
   * Delete a spd by id
   * Delete a spd by &#x60;id&#x60;.
   * @param id Id of the spd (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/spds/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteSpd(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a spd by id
   * Similar to <code>deleteSpd</code> but it also returns the http response headers .
   * Delete a spd by &#x60;id&#x60;.
   * @param id Id of the spd (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/spds/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteSpdWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a spd by id
   * Delete a spd by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteSpd</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSpdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the spd (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/spds/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteSpd(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a spd by id
  * Delete a spd by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteSpd</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the spd (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/spds/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteSpdWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSpd</code> method in a fluent style.
   */
  public static class DeleteSpdQueryParams extends HashMap<String, Object> {
    public DeleteSpdQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteSpdQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a spd by fully qualified name
   * Delete a spd by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the spd (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/spds/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteSpdByName(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a spd by fully qualified name
   * Similar to <code>deleteSpdByName</code> but it also returns the http response headers .
   * Delete a spd by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the spd (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/spds/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteSpdByNameWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a spd by fully qualified name
   * Delete a spd by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteSpdByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSpdByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the spd (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/spds/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteSpdByName(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a spd by fully qualified name
  * Delete a spd by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteSpdByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the spd (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/spds/name/{fqn}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteSpdByNameWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSpdByName</code> method in a fluent style.
   */
  public static class DeleteSpdByNameQueryParams extends HashMap<String, Object> {
    public DeleteSpdByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete spd classification by id
   * Delete a spd classification and all the tags(spds) under it.
   * @param id Id of the spd classification (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/spdClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteSpdClassification(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete spd classification by id
   * Similar to <code>deleteSpdClassification</code> but it also returns the http response headers .
   * Delete a spd classification and all the tags(spds) under it.
   * @param id Id of the spd classification (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/spdClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteSpdClassificationWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete spd classification by id
   * Delete a spd classification and all the tags(spds) under it.
   * Note, this is equivalent to the other <code>deleteSpdClassification</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSpdClassificationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the spd classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/spdClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteSpdClassification(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete spd classification by id
  * Delete a spd classification and all the tags(spds) under it.
  * Note, this is equivalent to the other <code>deleteSpdClassification</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the spd classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/spdClassifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteSpdClassificationWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSpdClassification</code> method in a fluent style.
   */
  public static class DeleteSpdClassificationQueryParams extends HashMap<String, Object> {
    public DeleteSpdClassificationQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteSpdClassificationQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete spd classification by name
   * Delete a spd classification by &#x60;name&#x60; and all the tags under it.
   * @param name Name of the spd classification (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/spdClassifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteSpdClassificationByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete spd classification by name
   * Similar to <code>deleteSpdClassificationByName</code> but it also returns the http response headers .
   * Delete a spd classification by &#x60;name&#x60; and all the tags under it.
   * @param name Name of the spd classification (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/spdClassifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteSpdClassificationByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete spd classification by name
   * Delete a spd classification by &#x60;name&#x60; and all the tags under it.
   * Note, this is equivalent to the other <code>deleteSpdClassificationByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSpdClassificationByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the spd classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/spdClassifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteSpdClassificationByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete spd classification by name
  * Delete a spd classification by &#x60;name&#x60; and all the tags under it.
  * Note, this is equivalent to the other <code>deleteSpdClassificationByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the spd classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/spdClassifications/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteSpdClassificationByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSpdClassificationByName</code> method in a fluent style.
   */
  public static class DeleteSpdClassificationByNameQueryParams extends HashMap<String, Object> {
    public DeleteSpdClassificationByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a spd by fully qualified name
   * Get a spd by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the spd (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Spd
   */
  @RequestLine("GET /v1/spds/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Spd getSpdByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a spd by fully qualified name
   * Similar to <code>getSpdByFQN</code> but it also returns the http response headers .
   * Get a spd by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the spd (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/spds/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Spd> getSpdByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a spd by fully qualified name
   * Get a spd by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getSpdByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSpdByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the spd (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Spd
   */
  @RequestLine("GET /v1/spds/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Spd getSpdByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a spd by fully qualified name
  * Get a spd by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getSpdByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the spd (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Spd
      */
      @RequestLine("GET /v1/spds/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Spd> getSpdByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getSpdByFQN</code> method in a fluent style.
   */
  public static class GetSpdByFQNQueryParams extends HashMap<String, Object> {
    public GetSpdByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetSpdByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a spd by id
   * Get a spd by &#x60;id&#x60;.
   * @param id Id of the spd (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Spd
   */
  @RequestLine("GET /v1/spds/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Spd getSpdByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a spd by id
   * Similar to <code>getSpdByID</code> but it also returns the http response headers .
   * Get a spd by &#x60;id&#x60;.
   * @param id Id of the spd (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/spds/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Spd> getSpdByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a spd by id
   * Get a spd by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getSpdByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSpdByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the spd (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Spd
   */
  @RequestLine("GET /v1/spds/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Spd getSpdByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a spd by id
  * Get a spd by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getSpdByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the spd (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Spd
      */
      @RequestLine("GET /v1/spds/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Spd> getSpdByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getSpdByID</code> method in a fluent style.
   */
  public static class GetSpdByIDQueryParams extends HashMap<String, Object> {
    public GetSpdByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetSpdByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a spd classification by id
   * Get a spd classification by &#x60;id&#x60;
   * @param id Id of the spd classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return SpdClassification
   */
  @RequestLine("GET /v1/spdClassifications/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  SpdClassification getSpdClassificationByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a spd classification by id
   * Similar to <code>getSpdClassificationByID</code> but it also returns the http response headers .
   * Get a spd classification by &#x60;id&#x60;
   * @param id Id of the spd classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/spdClassifications/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SpdClassification> getSpdClassificationByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a spd classification by id
   * Get a spd classification by &#x60;id&#x60;
   * Note, this is equivalent to the other <code>getSpdClassificationByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSpdClassificationByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the spd classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return SpdClassification
   */
  @RequestLine("GET /v1/spdClassifications/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  SpdClassification getSpdClassificationByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a spd classification by id
  * Get a spd classification by &#x60;id&#x60;
  * Note, this is equivalent to the other <code>getSpdClassificationByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the spd classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return SpdClassification
      */
      @RequestLine("GET /v1/spdClassifications/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SpdClassification> getSpdClassificationByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getSpdClassificationByID</code> method in a fluent style.
   */
  public static class GetSpdClassificationByIDQueryParams extends HashMap<String, Object> {
    public GetSpdClassificationByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetSpdClassificationByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a spd classification by name
   * Get a spd classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(spd).
   * @param name Name of the spd classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return SpdClassification
   */
  @RequestLine("GET /v1/spdClassifications/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  SpdClassification getSpdClassificationByName(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a spd classification by name
   * Similar to <code>getSpdClassificationByName</code> but it also returns the http response headers .
   * Get a spd classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(spd).
   * @param name Name of the spd classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/spdClassifications/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SpdClassification> getSpdClassificationByNameWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a spd classification by name
   * Get a spd classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(spd).
   * Note, this is equivalent to the other <code>getSpdClassificationByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSpdClassificationByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the spd classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return SpdClassification
   */
  @RequestLine("GET /v1/spdClassifications/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  SpdClassification getSpdClassificationByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a spd classification by name
  * Get a spd classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags(spd).
  * Note, this is equivalent to the other <code>getSpdClassificationByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the spd classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return SpdClassification
      */
      @RequestLine("GET /v1/spdClassifications/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SpdClassification> getSpdClassificationByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getSpdClassificationByName</code> method in a fluent style.
   */
  public static class GetSpdClassificationByNameQueryParams extends HashMap<String, Object> {
    public GetSpdClassificationByNameQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetSpdClassificationByNameQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the spd classification
   * Get a version of the spd classification by given &#x60;id&#x60;
   * @param id Id of the spd classification (required)
   * @param version spd classification version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return SpdClassification
   */
  @RequestLine("GET /v1/spdClassifications/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  SpdClassification getSpecificSpdClassificationVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the spd classification
   * Similar to <code>getSpecificSpdClassificationVersion</code> but it also returns the http response headers .
   * Get a version of the spd classification by given &#x60;id&#x60;
   * @param id Id of the spd classification (required)
   * @param version spd classification version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/spdClassifications/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SpdClassification> getSpecificSpdClassificationVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a version of the spds
   * Get a version of the spd by given &#x60;id&#x60;
   * @param id Id of the spd (required)
   * @param version spd version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Spd
   */
  @RequestLine("GET /v1/spds/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Spd getSpecificSpdVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the spds
   * Similar to <code>getSpecificSpdVersion</code> but it also returns the http response headers .
   * Get a version of the spd by given &#x60;id&#x60;
   * @param id Id of the spd (required)
   * @param version spd version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/spds/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Spd> getSpecificSpdVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List spd classification versions
   * Get a list of all the versions of a spd classification identified by &#x60;id&#x60;
   * @param id Id of the spd classification (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/spdClassifications/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllSpdClassificationVersion(@Param("id") UUID id);

  /**
   * List spd classification versions
   * Similar to <code>listAllSpdClassificationVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a spd classification identified by &#x60;id&#x60;
   * @param id Id of the spd classification (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/spdClassifications/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllSpdClassificationVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List spd versions
   * Get a list of all the versions of a spd identified by &#x60;id&#x60;
   * @param id Id of the spd (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/spds/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllSpdVersion(@Param("id") UUID id);

  /**
   * List spd versions
   * Similar to <code>listAllSpdVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a spd identified by &#x60;id&#x60;
   * @param id Id of the spd (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/spds/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllSpdVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List spd classifications
   * Get a list of spd classifications.
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional)
   * @param limit Limit the number classifications returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of classifications before this cursor (optional)
   * @param after Returns list of classifications after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return SpdClassificationList
   */
  @RequestLine("GET /v1/spdClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  SpdClassificationList listSpdClassifications(@Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List spd classifications
   * Similar to <code>listSpdClassifications</code> but it also returns the http response headers .
   * Get a list of spd classifications.
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional)
   * @param limit Limit the number classifications returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of classifications before this cursor (optional)
   * @param after Returns list of classifications after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/spdClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SpdClassificationList> listSpdClassificationsWithHttpInfo(@Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List spd classifications
   * Get a list of spd classifications.
   * Note, this is equivalent to the other <code>listSpdClassifications</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListSpdClassificationsQueryParams} class that allows for
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
   * @return SpdClassificationList
   */
  @RequestLine("GET /v1/spdClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  SpdClassificationList listSpdClassifications(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List spd classifications
  * Get a list of spd classifications.
  * Note, this is equivalent to the other <code>listSpdClassifications</code> that receives the query parameters as a map,
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
          * @return SpdClassificationList
      */
      @RequestLine("GET /v1/spdClassifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SpdClassificationList> listSpdClassificationsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listSpdClassifications</code> method in a fluent style.
   */
  public static class ListSpdClassificationsQueryParams extends HashMap<String, Object> {
    public ListSpdClassificationsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListSpdClassificationsQueryParams disabled(final String value) {
      put("disabled", EncodingUtils.encode(value));
      return this;
    }
    public ListSpdClassificationsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListSpdClassificationsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListSpdClassificationsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListSpdClassificationsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List spds
   * Get a list of spds. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param parent List spds filtered by children of spd identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent spd (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional, default to false)
   * @param limit Limit the number spds returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of spds before this cursor (optional)
   * @param after Returns list of spds after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return SpdList
   */
  @RequestLine("GET /v1/spds?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  SpdList listSpds(@Param("parent") String parent, @Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List spds
   * Similar to <code>listSpds</code> but it also returns the http response headers .
   * Get a list of spds. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param parent List spds filtered by children of spd identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent spd (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional, default to false)
   * @param limit Limit the number spds returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of spds before this cursor (optional)
   * @param after Returns list of spds after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/spds?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SpdList> listSpdsWithHttpInfo(@Param("parent") String parent, @Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List spds
   * Get a list of spds. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listSpds</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListSpdsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>parent - List spds filtered by children of spd identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent spd (optional)</li>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>disabled - Filter Disabled Classifications (optional, default to false)</li>
   *   <li>limit - Limit the number spds returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of spds before this cursor (optional)</li>
   *   <li>after - Returns list of spds after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return SpdList
   */
  @RequestLine("GET /v1/spds?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  SpdList listSpds(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List spds
  * Get a list of spds. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listSpds</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>parent - List spds filtered by children of spd identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent spd (optional)</li>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>disabled - Filter Disabled Classifications (optional, default to false)</li>
          *   <li>limit - Limit the number spds returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of spds before this cursor (optional)</li>
          *   <li>after - Returns list of spds after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return SpdList
      */
      @RequestLine("GET /v1/spds?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SpdList> listSpdsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listSpds</code> method in a fluent style.
   */
  public static class ListSpdsQueryParams extends HashMap<String, Object> {
    public ListSpdsQueryParams parent(final String value) {
      put("parent", EncodingUtils.encode(value));
      return this;
    }
    public ListSpdsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListSpdsQueryParams disabled(final String value) {
      put("disabled", EncodingUtils.encode(value));
      return this;
    }
    public ListSpdsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListSpdsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListSpdsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListSpdsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a spd
   * Update an existing spd using JsonPatch.
   * @param id Id of the spd (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a spd Documentation</a>
   */
  @RequestLine("PATCH /v1/spds/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchSpd(@Param("id") UUID id, Object body);

  /**
   * Update a spd
   * Similar to <code>patchSpd</code> but it also returns the http response headers .
   * Update an existing spd using JsonPatch.
   * @param id Id of the spd (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a spd Documentation</a>
   */
  @RequestLine("PATCH /v1/spds/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchSpdWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Update a spd classification
   * Update an existing classification using JsonPatch.
   * @param id Id of the spd classification (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a spd classification Documentation</a>
   */
  @RequestLine("PATCH /v1/spdClassifications/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchSpdClassification(@Param("id") UUID id, Object body);

  /**
   * Update a spd classification
   * Similar to <code>patchSpdClassification</code> but it also returns the http response headers .
   * Update an existing classification using JsonPatch.
   * @param id Id of the spd classification (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a spd classification Documentation</a>
   */
  @RequestLine("PATCH /v1/spdClassifications/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchSpdClassificationWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted classification
   * Restore a soft deleted classification.
   * @param restoreEntity  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/spdClassifications/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table restoreClassification2(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted classification
   * Similar to <code>restoreClassification2</code> but it also returns the http response headers .
   * Restore a soft deleted classification.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/spdClassifications/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> restoreClassification2WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Restore a soft deleted spd.
   * Restore a soft deleted spd.
   * @param restoreEntity  (optional)
   * @return Spd
   */
  @RequestLine("PUT /v1/spds/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Spd restoreSpd(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted spd.
   * Similar to <code>restoreSpd</code> but it also returns the http response headers .
   * Restore a soft deleted spd.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/spds/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Spd> restoreSpdWithHttpInfo(RestoreEntity restoreEntity);


}
