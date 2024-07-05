package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateDocument;
import org.openmetadata.client.model.Document;
import org.openmetadata.client.model.DocumentList;
import org.openmetadata.client.model.EntityHistory;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface DocumentStoreApi extends ApiClient.Api {


  /**
   * Create a Document
   * Create a new Document.
   * @param createDocument  (optional)
   * @return Document
   */
  @RequestLine("POST /v1/docStore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Document createDocument(CreateDocument createDocument);

  /**
   * Create a Document
   * Similar to <code>createDocument</code> but it also returns the http response headers .
   * Create a new Document.
   * @param createDocument  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/docStore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Document> createDocumentWithHttpInfo(CreateDocument createDocument);



  /**
   * Update Document
   * Create or Update a Document.
   * @param createDocument  (optional)
   * @return Document
   */
  @RequestLine("PUT /v1/docStore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Document createOrUpdateDocument(CreateDocument createDocument);

  /**
   * Update Document
   * Similar to <code>createOrUpdateDocument</code> but it also returns the http response headers .
   * Create or Update a Document.
   * @param createDocument  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/docStore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Document> createOrUpdateDocumentWithHttpInfo(CreateDocument createDocument);



  /**
   * Delete a Document by id
   * Delete a Document by given &#x60;id&#x60;.
   * @param id Id of the Document (required)
   */
  @RequestLine("DELETE /v1/docStore/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDocument(@Param("id") UUID id);

  /**
   * Delete a Document by id
   * Similar to <code>deleteDocument</code> but it also returns the http response headers .
   * Delete a Document by given &#x60;id&#x60;.
   * @param id Id of the Document (required)
   */
  @RequestLine("DELETE /v1/docStore/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDocumentWithHttpInfo(@Param("id") UUID id);



  /**
   * Delete a Document by name
   * Delete a Document by given &#x60;name&#x60;.
   * @param name Name of the Document (required)
   */
  @RequestLine("DELETE /v1/docStore/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDocumentByName(@Param("name") String name);

  /**
   * Delete a Document by name
   * Similar to <code>deleteDocumentByName</code> but it also returns the http response headers .
   * Delete a Document by given &#x60;name&#x60;.
   * @param name Name of the Document (required)
   */
  @RequestLine("DELETE /v1/docStore/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDocumentByNameWithHttpInfo(@Param("name") String name);



  /**
   * Get a Document by id
   * Get a Document by &#x60;id&#x60;.
   * @param id Id of the Document (required)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Document
   */
  @RequestLine("GET /v1/docStore/{id}?include={include}")
  @Headers({
    "Accept: application/json",
  })
  Document get2(@Param("id") UUID id, @Param("include") String include);

  /**
   * Get a Document by id
   * Similar to <code>get2</code> but it also returns the http response headers .
   * Get a Document by &#x60;id&#x60;.
   * @param id Id of the Document (required)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/docStore/{id}?include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Document> get2WithHttpInfo(@Param("id") UUID id, @Param("include") String include);


  /**
   * Get a Document by id
   * Get a Document by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>get2</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Get2QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the Document (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Document
   */
  @RequestLine("GET /v1/docStore/{id}?include={include}")
  @Headers({
  "Accept: application/json",
  })
  Document get2(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a Document by id
  * Get a Document by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>get2</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the Document (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Document
      */
      @RequestLine("GET /v1/docStore/{id}?include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Document> get2WithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>get2</code> method in a fluent style.
   */
  public static class Get2QueryParams extends HashMap<String, Object> {
    public Get2QueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a Document by name
   * Get a Document by &#x60;name&#x60;.
   * @param name Name of the Document (required)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Document
   */
  @RequestLine("GET /v1/docStore/name/{name}?include={include}")
  @Headers({
    "Accept: application/json",
  })
  Document getDocumentByFQN(@Param("name") String name, @Param("include") String include);

  /**
   * Get a Document by name
   * Similar to <code>getDocumentByFQN</code> but it also returns the http response headers .
   * Get a Document by &#x60;name&#x60;.
   * @param name Name of the Document (required)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/docStore/name/{name}?include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Document> getDocumentByFQNWithHttpInfo(@Param("name") String name, @Param("include") String include);


  /**
   * Get a Document by name
   * Get a Document by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getDocumentByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDocumentByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the Document (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Document
   */
  @RequestLine("GET /v1/docStore/name/{name}?include={include}")
  @Headers({
  "Accept: application/json",
  })
  Document getDocumentByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a Document by name
  * Get a Document by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getDocumentByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the Document (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Document
      */
      @RequestLine("GET /v1/docStore/name/{name}?include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Document> getDocumentByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDocumentByFQN</code> method in a fluent style.
   */
  public static class GetDocumentByFQNQueryParams extends HashMap<String, Object> {
    public GetDocumentByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the Document
   * Get a version of the Document by given &#x60;id&#x60;
   * @param id Id of the Document (required)
   * @param version Document version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Document
   */
  @RequestLine("GET /v1/docStore/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Document getSpecificDocumentVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the Document
   * Similar to <code>getSpecificDocumentVersion</code> but it also returns the http response headers .
   * Get a version of the Document by given &#x60;id&#x60;
   * @param id Id of the Document (required)
   * @param version Document version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/docStore/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Document> getSpecificDocumentVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List Document versions
   * Get a list of all the versions of a Document identified by &#x60;id&#x60;
   * @param id Id of the Document (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/docStore/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllDocumentVersion(@Param("id") UUID id);

  /**
   * List Document versions
   * Similar to <code>listAllDocumentVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a Document identified by &#x60;id&#x60;
   * @param id Id of the Document (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/docStore/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllDocumentVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List Documents
   * Get a list of Documents. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param limit Limit the number of personas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param entityType Filter docs by entityType (optional)
   * @param fqnPrefix Filter docs by fqnPrefix (optional)
   * @param before Returns list of personas before this cursor (optional)
   * @param after Returns list of personas after this cursor (optional)
   * @return DocumentList
   */
  @RequestLine("GET /v1/docStore?limit={limit}&entityType={entityType}&fqnPrefix={fqnPrefix}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  DocumentList listDocuments(@Param("limit") Integer limit, @Param("entityType") String entityType, @Param("fqnPrefix") String fqnPrefix, @Param("before") String before, @Param("after") String after);

  /**
   * List Documents
   * Similar to <code>listDocuments</code> but it also returns the http response headers .
   * Get a list of Documents. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param limit Limit the number of personas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param entityType Filter docs by entityType (optional)
   * @param fqnPrefix Filter docs by fqnPrefix (optional)
   * @param before Returns list of personas before this cursor (optional)
   * @param after Returns list of personas after this cursor (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/docStore?limit={limit}&entityType={entityType}&fqnPrefix={fqnPrefix}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DocumentList> listDocumentsWithHttpInfo(@Param("limit") Integer limit, @Param("entityType") String entityType, @Param("fqnPrefix") String fqnPrefix, @Param("before") String before, @Param("after") String after);


  /**
   * List Documents
   * Get a list of Documents. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listDocuments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDocumentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - Limit the number of personas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>entityType - Filter docs by entityType (optional)</li>
   *   <li>fqnPrefix - Filter docs by fqnPrefix (optional)</li>
   *   <li>before - Returns list of personas before this cursor (optional)</li>
   *   <li>after - Returns list of personas after this cursor (optional)</li>
   *   </ul>
   * @return DocumentList
   */
  @RequestLine("GET /v1/docStore?limit={limit}&entityType={entityType}&fqnPrefix={fqnPrefix}&before={before}&after={after}")
  @Headers({
  "Accept: application/json",
  })
  DocumentList listDocuments(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List Documents
  * Get a list of Documents. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listDocuments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>limit - Limit the number of personas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>entityType - Filter docs by entityType (optional)</li>
          *   <li>fqnPrefix - Filter docs by fqnPrefix (optional)</li>
          *   <li>before - Returns list of personas before this cursor (optional)</li>
          *   <li>after - Returns list of personas after this cursor (optional)</li>
      *   </ul>
          * @return DocumentList
      */
      @RequestLine("GET /v1/docStore?limit={limit}&entityType={entityType}&fqnPrefix={fqnPrefix}&before={before}&after={after}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DocumentList> listDocumentsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listDocuments</code> method in a fluent style.
   */
  public static class ListDocumentsQueryParams extends HashMap<String, Object> {
    public ListDocumentsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListDocumentsQueryParams entityType(final String value) {
      put("entityType", EncodingUtils.encode(value));
      return this;
    }
    public ListDocumentsQueryParams fqnPrefix(final String value) {
      put("fqnPrefix", EncodingUtils.encode(value));
      return this;
    }
    public ListDocumentsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListDocumentsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a Document.
   * Update an existing Document with JsonPatch.
   * @param id Id of the Document (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a Document. Documentation</a>
   */
  @RequestLine("PATCH /v1/docStore/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchDocument(@Param("id") UUID id, Object body);

  /**
   * Update a Document.
   * Similar to <code>patchDocument</code> but it also returns the http response headers .
   * Update an existing Document with JsonPatch.
   * @param id Id of the Document (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a Document. Documentation</a>
   */
  @RequestLine("PATCH /v1/docStore/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchDocumentWithHttpInfo(@Param("id") UUID id, Object body);


}
