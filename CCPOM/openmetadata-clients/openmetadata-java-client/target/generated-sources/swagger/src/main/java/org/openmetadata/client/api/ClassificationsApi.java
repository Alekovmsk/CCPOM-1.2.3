package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.Classification;
import org.openmetadata.client.model.ClassificationList;
import org.openmetadata.client.model.CreateClassification;
import org.openmetadata.client.model.CreateTag;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Table;
import org.openmetadata.client.model.Tag;
import org.openmetadata.client.model.TagList;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface ClassificationsApi extends ApiClient.Api {


  /**
   * Create a classification
   * Create a new classification. The request can include the children tags to be created along with the classification.
   * @param createClassification  (optional)
   * @return Classification
   */
  @RequestLine("POST /v1/classifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Classification createClassification(CreateClassification createClassification);

  /**
   * Create a classification
   * Similar to <code>createClassification</code> but it also returns the http response headers .
   * Create a new classification. The request can include the children tags to be created along with the classification.
   * @param createClassification  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/classifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Classification> createClassificationWithHttpInfo(CreateClassification createClassification);



  /**
   * Update a classification
   * Update an existing category identify by category name
   * @param createClassification  (optional)
   */
  @RequestLine("PUT /v1/classifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void createOrUpdateClassification(CreateClassification createClassification);

  /**
   * Update a classification
   * Similar to <code>createOrUpdateClassification</code> but it also returns the http response headers .
   * Update an existing category identify by category name
   * @param createClassification  (optional)
   */
  @RequestLine("PUT /v1/classifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> createOrUpdateClassificationWithHttpInfo(CreateClassification createClassification);



  /**
   * Create or update a tag
   * Create a new tag, if it does not exist or update an existing tag.
   * @param createTag  (optional)
   * @return Tag
   */
  @RequestLine("PUT /v1/tags")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Tag createOrUpdateTag(CreateTag createTag);

  /**
   * Create or update a tag
   * Similar to <code>createOrUpdateTag</code> but it also returns the http response headers .
   * Create a new tag, if it does not exist or update an existing tag.
   * @param createTag  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/tags")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Tag> createOrUpdateTagWithHttpInfo(CreateTag createTag);



  /**
   * Create a tag
   * Create a new tag.
   * @param createTag  (optional)
   * @return Tag
   */
  @RequestLine("POST /v1/tags")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Tag createTag(CreateTag createTag);

  /**
   * Create a tag
   * Similar to <code>createTag</code> but it also returns the http response headers .
   * Create a new tag.
   * @param createTag  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/tags")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Tag> createTagWithHttpInfo(CreateTag createTag);



  /**
   * Delete classification by id
   * Delete a classification and all the tags under it.
   * @param id Id of the classification (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/classifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteClassification(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete classification by id
   * Similar to <code>deleteClassification</code> but it also returns the http response headers .
   * Delete a classification and all the tags under it.
   * @param id Id of the classification (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/classifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteClassificationWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete classification by id
   * Delete a classification and all the tags under it.
   * Note, this is equivalent to the other <code>deleteClassification</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteClassificationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/classifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteClassification(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete classification by id
  * Delete a classification and all the tags under it.
  * Note, this is equivalent to the other <code>deleteClassification</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/classifications/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteClassificationWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteClassification</code> method in a fluent style.
   */
  public static class DeleteClassificationQueryParams extends HashMap<String, Object> {
    public DeleteClassificationQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteClassificationQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete classification by name
   * Delete a classification by &#x60;name&#x60; and all the tags under it.
   * @param name Name of the classification (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/classifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteClassificationByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete classification by name
   * Similar to <code>deleteClassificationByName</code> but it also returns the http response headers .
   * Delete a classification by &#x60;name&#x60; and all the tags under it.
   * @param name Name of the classification (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/classifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteClassificationByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete classification by name
   * Delete a classification by &#x60;name&#x60; and all the tags under it.
   * Note, this is equivalent to the other <code>deleteClassificationByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteClassificationByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/classifications/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteClassificationByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete classification by name
  * Delete a classification by &#x60;name&#x60; and all the tags under it.
  * Note, this is equivalent to the other <code>deleteClassificationByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/classifications/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteClassificationByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteClassificationByName</code> method in a fluent style.
   */
  public static class DeleteClassificationByNameQueryParams extends HashMap<String, Object> {
    public DeleteClassificationByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a tag by id
   * Delete a tag by &#x60;id&#x60;.
   * @param id Id of the tag (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/tags/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTag(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a tag by id
   * Similar to <code>deleteTag</code> but it also returns the http response headers .
   * Delete a tag by &#x60;id&#x60;.
   * @param id Id of the tag (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/tags/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTagWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a tag by id
   * Delete a tag by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>deleteTag</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTagQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the tag (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/tags/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTag(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a tag by id
  * Delete a tag by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>deleteTag</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the tag (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/tags/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTagWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTag</code> method in a fluent style.
   */
  public static class DeleteTagQueryParams extends HashMap<String, Object> {
    public DeleteTagQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteTagQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a tag by fully qualified name
   * Delete a tag by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the tag (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/tags/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTagByName(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a tag by fully qualified name
   * Similar to <code>deleteTagByName</code> but it also returns the http response headers .
   * Delete a tag by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the tag (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/tags/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTagByNameWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a tag by fully qualified name
   * Delete a tag by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteTagByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTagByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the tag (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/tags/name/{fqn}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteTagByName(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a tag by fully qualified name
  * Delete a tag by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteTagByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the tag (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/tags/name/{fqn}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteTagByNameWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTagByName</code> method in a fluent style.
   */
  public static class DeleteTagByNameQueryParams extends HashMap<String, Object> {
    public DeleteTagByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a classification by id
   * Get a classification by &#x60;id&#x60;
   * @param id Id of the classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Classification
   */
  @RequestLine("GET /v1/classifications/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Classification getClassificationByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a classification by id
   * Similar to <code>getClassificationByID</code> but it also returns the http response headers .
   * Get a classification by &#x60;id&#x60;
   * @param id Id of the classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/classifications/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Classification> getClassificationByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a classification by id
   * Get a classification by &#x60;id&#x60;
   * Note, this is equivalent to the other <code>getClassificationByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetClassificationByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Classification
   */
  @RequestLine("GET /v1/classifications/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Classification getClassificationByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a classification by id
  * Get a classification by &#x60;id&#x60;
  * Note, this is equivalent to the other <code>getClassificationByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Classification
      */
      @RequestLine("GET /v1/classifications/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Classification> getClassificationByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getClassificationByID</code> method in a fluent style.
   */
  public static class GetClassificationByIDQueryParams extends HashMap<String, Object> {
    public GetClassificationByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetClassificationByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a classification by name
   * Get a classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags.
   * @param name Name of the classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Classification
   */
  @RequestLine("GET /v1/classifications/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Classification getClassificationByName(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a classification by name
   * Similar to <code>getClassificationByName</code> but it also returns the http response headers .
   * Get a classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags.
   * @param name Name of the classification (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/classifications/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Classification> getClassificationByNameWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a classification by name
   * Get a classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags.
   * Note, this is equivalent to the other <code>getClassificationByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetClassificationByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the classification (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Classification
   */
  @RequestLine("GET /v1/classifications/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Classification getClassificationByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a classification by name
  * Get a classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags.
  * Note, this is equivalent to the other <code>getClassificationByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the classification (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Classification
      */
      @RequestLine("GET /v1/classifications/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Classification> getClassificationByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getClassificationByName</code> method in a fluent style.
   */
  public static class GetClassificationByNameQueryParams extends HashMap<String, Object> {
    public GetClassificationByNameQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetClassificationByNameQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the classification
   * Get a version of the classification by given &#x60;id&#x60;
   * @param id Id of the classification (required)
   * @param version classification version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Classification
   */
  @RequestLine("GET /v1/classifications/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Classification getSpecificClassificationVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the classification
   * Similar to <code>getSpecificClassificationVersion</code> but it also returns the http response headers .
   * Get a version of the classification by given &#x60;id&#x60;
   * @param id Id of the classification (required)
   * @param version classification version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/classifications/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Classification> getSpecificClassificationVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a version of the tags
   * Get a version of the tag by given &#x60;id&#x60;
   * @param id Id of the tag (required)
   * @param version tag version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Tag
   */
  @RequestLine("GET /v1/tags/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Tag getSpecificTagVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the tags
   * Similar to <code>getSpecificTagVersion</code> but it also returns the http response headers .
   * Get a version of the tag by given &#x60;id&#x60;
   * @param id Id of the tag (required)
   * @param version tag version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tags/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Tag> getSpecificTagVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a tag by fully qualified name
   * Get a tag by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the tag (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Tag
   */
  @RequestLine("GET /v1/tags/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Tag getTagByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a tag by fully qualified name
   * Similar to <code>getTagByFQN</code> but it also returns the http response headers .
   * Get a tag by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the tag (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tags/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Tag> getTagByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a tag by fully qualified name
   * Get a tag by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getTagByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTagByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the tag (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Tag
   */
  @RequestLine("GET /v1/tags/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Tag getTagByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a tag by fully qualified name
  * Get a tag by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getTagByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the tag (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Tag
      */
      @RequestLine("GET /v1/tags/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Tag> getTagByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTagByFQN</code> method in a fluent style.
   */
  public static class GetTagByFQNQueryParams extends HashMap<String, Object> {
    public GetTagByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetTagByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a tag by id
   * Get a tag by &#x60;id&#x60;.
   * @param id Id of the tag (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Tag
   */
  @RequestLine("GET /v1/tags/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Tag getTagByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a tag by id
   * Similar to <code>getTagByID</code> but it also returns the http response headers .
   * Get a tag by &#x60;id&#x60;.
   * @param id Id of the tag (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tags/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Tag> getTagByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a tag by id
   * Get a tag by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getTagByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTagByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the tag (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Tag
   */
  @RequestLine("GET /v1/tags/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Tag getTagByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a tag by id
  * Get a tag by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getTagByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the tag (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Tag
      */
      @RequestLine("GET /v1/tags/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Tag> getTagByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTagByID</code> method in a fluent style.
   */
  public static class GetTagByIDQueryParams extends HashMap<String, Object> {
    public GetTagByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetTagByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List classification versions
   * Get a list of all the versions of a classification identified by &#x60;id&#x60;
   * @param id Id of the classification (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/classifications/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllClassificationVersion(@Param("id") UUID id);

  /**
   * List classification versions
   * Similar to <code>listAllClassificationVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a classification identified by &#x60;id&#x60;
   * @param id Id of the classification (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/classifications/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllClassificationVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List tag versions
   * Get a list of all the versions of a tag identified by &#x60;id&#x60;
   * @param id Id of the tag (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/tags/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllTagVersion(@Param("id") UUID id);

  /**
   * List tag versions
   * Similar to <code>listAllTagVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a tag identified by &#x60;id&#x60;
   * @param id Id of the tag (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tags/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllTagVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List classifications
   * Get a list of classifications.
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional)
   * @param limit Limit the number classifications returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of classifications before this cursor (optional)
   * @param after Returns list of classifications after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return ClassificationList
   */
  @RequestLine("GET /v1/classifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ClassificationList listClassifications(@Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List classifications
   * Similar to <code>listClassifications</code> but it also returns the http response headers .
   * Get a list of classifications.
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional)
   * @param limit Limit the number classifications returned. (1 to 1000000, default &#x3D; 10)  (optional, default to 10)
   * @param before Returns list of classifications before this cursor (optional)
   * @param after Returns list of classifications after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/classifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ClassificationList> listClassificationsWithHttpInfo(@Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List classifications
   * Get a list of classifications.
   * Note, this is equivalent to the other <code>listClassifications</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListClassificationsQueryParams} class that allows for
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
   * @return ClassificationList
   */
  @RequestLine("GET /v1/classifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  ClassificationList listClassifications(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List classifications
  * Get a list of classifications.
  * Note, this is equivalent to the other <code>listClassifications</code> that receives the query parameters as a map,
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
          * @return ClassificationList
      */
      @RequestLine("GET /v1/classifications?fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ClassificationList> listClassificationsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listClassifications</code> method in a fluent style.
   */
  public static class ListClassificationsQueryParams extends HashMap<String, Object> {
    public ListClassificationsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListClassificationsQueryParams disabled(final String value) {
      put("disabled", EncodingUtils.encode(value));
      return this;
    }
    public ListClassificationsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListClassificationsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListClassificationsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListClassificationsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List tags
   * Get a list of tags. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param parent List tags filtered by children of tag identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent tag (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional, default to false)
   * @param limit Limit the number tags returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of tags before this cursor (optional)
   * @param after Returns list of tags after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return TagList
   */
  @RequestLine("GET /v1/tags?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  TagList listTags(@Param("parent") String parent, @Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List tags
   * Similar to <code>listTags</code> but it also returns the http response headers .
   * Get a list of tags. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param parent List tags filtered by children of tag identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent tag (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param disabled Filter Disabled Classifications (optional, default to false)
   * @param limit Limit the number tags returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of tags before this cursor (optional)
   * @param after Returns list of tags after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/tags?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TagList> listTagsWithHttpInfo(@Param("parent") String parent, @Param("fields") String fields, @Param("disabled") String disabled, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List tags
   * Get a list of tags. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listTags</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTagsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>parent - List tags filtered by children of tag identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent tag (optional)</li>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>disabled - Filter Disabled Classifications (optional, default to false)</li>
   *   <li>limit - Limit the number tags returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of tags before this cursor (optional)</li>
   *   <li>after - Returns list of tags after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return TagList
   */
  @RequestLine("GET /v1/tags?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  TagList listTags(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List tags
  * Get a list of tags. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listTags</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>parent - List tags filtered by children of tag identified by fqn given in &#x60;parent&#x60; parameter. The fqn can either be classificationName or fqn of a parent tag (optional)</li>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>disabled - Filter Disabled Classifications (optional, default to false)</li>
          *   <li>limit - Limit the number tags returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of tags before this cursor (optional)</li>
          *   <li>after - Returns list of tags after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return TagList
      */
      @RequestLine("GET /v1/tags?parent={parent}&fields={fields}&disabled={disabled}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TagList> listTagsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listTags</code> method in a fluent style.
   */
  public static class ListTagsQueryParams extends HashMap<String, Object> {
    public ListTagsQueryParams parent(final String value) {
      put("parent", EncodingUtils.encode(value));
      return this;
    }
    public ListTagsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListTagsQueryParams disabled(final String value) {
      put("disabled", EncodingUtils.encode(value));
      return this;
    }
    public ListTagsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListTagsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListTagsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListTagsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a classification
   * Update an existing classification using JsonPatch.
   * @param id Id of the classification (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a classification Documentation</a>
   */
  @RequestLine("PATCH /v1/classifications/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchClassification(@Param("id") UUID id, Object body);

  /**
   * Update a classification
   * Similar to <code>patchClassification</code> but it also returns the http response headers .
   * Update an existing classification using JsonPatch.
   * @param id Id of the classification (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a classification Documentation</a>
   */
  @RequestLine("PATCH /v1/classifications/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchClassificationWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Update a tag
   * Update an existing tag using JsonPatch.
   * @param id Id of the tag (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a tag Documentation</a>
   */
  @RequestLine("PATCH /v1/tags/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchTag(@Param("id") UUID id, Object body);

  /**
   * Update a tag
   * Similar to <code>patchTag</code> but it also returns the http response headers .
   * Update an existing tag using JsonPatch.
   * @param id Id of the tag (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a tag Documentation</a>
   */
  @RequestLine("PATCH /v1/tags/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchTagWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted classification
   * Restore a soft deleted classification.
   * @param restoreEntity  (optional)
   * @return Table
   */
  @RequestLine("PUT /v1/classifications/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Table restoreClassification3(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted classification
   * Similar to <code>restoreClassification3</code> but it also returns the http response headers .
   * Restore a soft deleted classification.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/classifications/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Table> restoreClassification3WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Restore a soft deleted tag.
   * Restore a soft deleted tag.
   * @param restoreEntity  (optional)
   * @return Tag
   */
  @RequestLine("PUT /v1/tags/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Tag restoreTag(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted tag.
   * Similar to <code>restoreTag</code> but it also returns the http response headers .
   * Restore a soft deleted tag.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/tags/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Tag> restoreTagWithHttpInfo(RestoreEntity restoreEntity);


}
