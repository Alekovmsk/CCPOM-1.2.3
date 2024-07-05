package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.AddKnowledgeCenterToAssetsRequest;
import org.openmetadata.client.model.BulkOperationResult;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateKnowledgeCenter;
import org.openmetadata.client.model.CreateKnowledgeCenterDocument;
import org.openmetadata.client.model.CsvImportResult;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.KnowledgeCenter;
import org.openmetadata.client.model.KnowledgeCenterDocument;
import org.openmetadata.client.model.KnowledgeCenterDocumentList;
import org.openmetadata.client.model.KnowledgeCenterList;
import org.openmetadata.client.model.RestoreEntity;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface KnowledgeCentersApi extends ApiClient.Api {


  /**
   * Bulk Add KnowledgeCenter Document to Assets
   * Bulk Add KnowledgeCenter Document to Assets
   * @param id Id of the Entity (required)
   * @param addKnowledgeCenterToAssetsRequest  (optional)
   * @return BulkOperationResult
   */
  @RequestLine("PUT /v1/agreementCenterDocuments/{id}/assets/add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BulkOperationResult bulkAddKnowledgeCenterDocumentToAssets(@Param("id") UUID id, AddKnowledgeCenterToAssetsRequest addKnowledgeCenterToAssetsRequest);

  /**
   * Bulk Add KnowledgeCenter Document to Assets
   * Similar to <code>bulkAddKnowledgeCenterDocumentToAssets</code> but it also returns the http response headers .
   * Bulk Add KnowledgeCenter Document to Assets
   * @param id Id of the Entity (required)
   * @param addKnowledgeCenterToAssetsRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/agreementCenterDocuments/{id}/assets/add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BulkOperationResult> bulkAddKnowledgeCenterDocumentToAssetsWithHttpInfo(@Param("id") UUID id, AddKnowledgeCenterToAssetsRequest addKnowledgeCenterToAssetsRequest);



  /**
   * Bulk Remove KnowledgeCenter Document from Assets
   * Bulk Remove KnowledgeCenter Document from Assets
   * @param id Id of the Entity (required)
   * @param addKnowledgeCenterToAssetsRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/agreementCenterDocuments/{id}/assets/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent bulkRemoveKnowledgeCenterDocumentFromAssets(@Param("id") UUID id, AddKnowledgeCenterToAssetsRequest addKnowledgeCenterToAssetsRequest);

  /**
   * Bulk Remove KnowledgeCenter Document from Assets
   * Similar to <code>bulkRemoveKnowledgeCenterDocumentFromAssets</code> but it also returns the http response headers .
   * Bulk Remove KnowledgeCenter Document from Assets
   * @param id Id of the Entity (required)
   * @param addKnowledgeCenterToAssetsRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/agreementCenterDocuments/{id}/assets/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> bulkRemoveKnowledgeCenterDocumentFromAssetsWithHttpInfo(@Param("id") UUID id, AddKnowledgeCenterToAssetsRequest addKnowledgeCenterToAssetsRequest);



  /**
   * Create a knowledgeCenter
   * Create a new knowledgeCenter.
   * @param createKnowledgeCenter  (optional)
   * @return KnowledgeCenter
   */
  @RequestLine("POST /v1/agreementCenters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  KnowledgeCenter createKnowledgeCenter(CreateKnowledgeCenter createKnowledgeCenter);

  /**
   * Create a knowledgeCenter
   * Similar to <code>createKnowledgeCenter</code> but it also returns the http response headers .
   * Create a new knowledgeCenter.
   * @param createKnowledgeCenter  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/agreementCenters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenter> createKnowledgeCenterWithHttpInfo(CreateKnowledgeCenter createKnowledgeCenter);



  /**
   * Create a knowledgeCenter document
   * Create a new knowledgeCenter document.
   * @param createKnowledgeCenterDocument  (optional)
   * @return KnowledgeCenterDocument
   */
  @RequestLine("POST /v1/agreementCenterDocuments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  KnowledgeCenterDocument createKnowledgeCenterDocument(CreateKnowledgeCenterDocument createKnowledgeCenterDocument);

  /**
   * Create a knowledgeCenter document
   * Similar to <code>createKnowledgeCenterDocument</code> but it also returns the http response headers .
   * Create a new knowledgeCenter document.
   * @param createKnowledgeCenterDocument  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/agreementCenterDocuments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenterDocument> createKnowledgeCenterDocumentWithHttpInfo(CreateKnowledgeCenterDocument createKnowledgeCenterDocument);



  /**
   * Create or update a knowledgeCenter
   * Create a new knowledgeCenter, if it does not exist or update an existing knowledgeCenter.
   * @param createKnowledgeCenter  (optional)
   * @return KnowledgeCenter
   */
  @RequestLine("PUT /v1/agreementCenters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  KnowledgeCenter createOrUpdateKnowledgeCenter(CreateKnowledgeCenter createKnowledgeCenter);

  /**
   * Create or update a knowledgeCenter
   * Similar to <code>createOrUpdateKnowledgeCenter</code> but it also returns the http response headers .
   * Create a new knowledgeCenter, if it does not exist or update an existing knowledgeCenter.
   * @param createKnowledgeCenter  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/agreementCenters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenter> createOrUpdateKnowledgeCenterWithHttpInfo(CreateKnowledgeCenter createKnowledgeCenter);



  /**
   * Create or update a knowledgeCenter document
   * Create a new knowledgeCenter document, if it does not exist or update an existing knowledgeCenter document.
   * @param createKnowledgeCenterDocument  (optional)
   * @return KnowledgeCenterDocument
   */
  @RequestLine("PUT /v1/agreementCenterDocuments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  KnowledgeCenterDocument createOrUpdateKnowledgeCenterDocument(CreateKnowledgeCenterDocument createKnowledgeCenterDocument);

  /**
   * Create or update a knowledgeCenter document
   * Similar to <code>createOrUpdateKnowledgeCenterDocument</code> but it also returns the http response headers .
   * Create a new knowledgeCenter document, if it does not exist or update an existing knowledgeCenter document.
   * @param createKnowledgeCenterDocument  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/agreementCenterDocuments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenterDocument> createOrUpdateKnowledgeCenterDocumentWithHttpInfo(CreateKnowledgeCenterDocument createKnowledgeCenterDocument);



  /**
   * Delete a knowledgeCenter document by Id
   * Delete a knowledgeCenter document by &#x60;Id&#x60;.
   * @param id Id of the knowledgeCenter document (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/agreementCenterDocuments/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void delete2(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a knowledgeCenter document by Id
   * Similar to <code>delete2</code> but it also returns the http response headers .
   * Delete a knowledgeCenter document by &#x60;Id&#x60;.
   * @param id Id of the knowledgeCenter document (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/agreementCenterDocuments/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> delete2WithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a knowledgeCenter document by Id
   * Delete a knowledgeCenter document by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>delete2</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Delete2QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the knowledgeCenter document (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/agreementCenterDocuments/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void delete2(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a knowledgeCenter document by Id
  * Delete a knowledgeCenter document by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>delete2</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the knowledgeCenter document (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/agreementCenterDocuments/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> delete2WithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>delete2</code> method in a fluent style.
   */
  public static class Delete2QueryParams extends HashMap<String, Object> {
    public Delete2QueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public Delete2QueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a knowledgeCenter by Id
   * Delete a knowledgeCenter by &#x60;Id&#x60;.
   * @param id Id of the knowledgeCenter (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/agreementCenters/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteKnowledgeCenter(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a knowledgeCenter by Id
   * Similar to <code>deleteKnowledgeCenter</code> but it also returns the http response headers .
   * Delete a knowledgeCenter by &#x60;Id&#x60;.
   * @param id Id of the knowledgeCenter (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/agreementCenters/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteKnowledgeCenterWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a knowledgeCenter by Id
   * Delete a knowledgeCenter by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deleteKnowledgeCenter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteKnowledgeCenterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the knowledgeCenter (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/agreementCenters/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteKnowledgeCenter(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a knowledgeCenter by Id
  * Delete a knowledgeCenter by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deleteKnowledgeCenter</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the knowledgeCenter (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/agreementCenters/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteKnowledgeCenterWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteKnowledgeCenter</code> method in a fluent style.
   */
  public static class DeleteKnowledgeCenterQueryParams extends HashMap<String, Object> {
    public DeleteKnowledgeCenterQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteKnowledgeCenterQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a knowledgeCenter by name
   * Delete a knowledgeCenter by &#x60;name&#x60;.
   * @param name Name of the knowledgeCenter (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/agreementCenters/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteKnowledgeCenterByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a knowledgeCenter by name
   * Similar to <code>deleteKnowledgeCenterByName</code> but it also returns the http response headers .
   * Delete a knowledgeCenter by &#x60;name&#x60;.
   * @param name Name of the knowledgeCenter (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/agreementCenters/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteKnowledgeCenterByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a knowledgeCenter by name
   * Delete a knowledgeCenter by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>deleteKnowledgeCenterByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteKnowledgeCenterByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the knowledgeCenter (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/agreementCenters/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteKnowledgeCenterByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a knowledgeCenter by name
  * Delete a knowledgeCenter by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>deleteKnowledgeCenterByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the knowledgeCenter (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/agreementCenters/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteKnowledgeCenterByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteKnowledgeCenterByName</code> method in a fluent style.
   */
  public static class DeleteKnowledgeCenterByNameQueryParams extends HashMap<String, Object> {
    public DeleteKnowledgeCenterByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a knowledgeCenter document by fully qualified name
   * Delete a knowledgeCenter document by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the knowledgeCenter document (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/agreementCenterDocuments/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteKnowledgeCenterDocumentByName(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a knowledgeCenter document by fully qualified name
   * Similar to <code>deleteKnowledgeCenterDocumentByName</code> but it also returns the http response headers .
   * Delete a knowledgeCenter document by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the knowledgeCenter document (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/agreementCenterDocuments/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteKnowledgeCenterDocumentByNameWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a knowledgeCenter document by fully qualified name
   * Delete a knowledgeCenter document by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteKnowledgeCenterDocumentByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteKnowledgeCenterDocumentByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the knowledgeCenter document (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/agreementCenterDocuments/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteKnowledgeCenterDocumentByName(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a knowledgeCenter document by fully qualified name
  * Delete a knowledgeCenter document by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteKnowledgeCenterDocumentByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the knowledgeCenter document (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/agreementCenterDocuments/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteKnowledgeCenterDocumentByNameWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteKnowledgeCenterDocumentByName</code> method in a fluent style.
   */
  public static class DeleteKnowledgeCenterDocumentByNameQueryParams extends HashMap<String, Object> {
    public DeleteKnowledgeCenterDocumentByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteKnowledgeCenterDocumentByNameQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Export knowledgeCenter in CSV format
   * 
   * @param name Name of the knowledgeCenter (required)
   * @return String
   */
  @RequestLine("GET /v1/agreementCenters/name/{name}/export")
  @Headers({
    "Accept: application/json",
  })
  String exportKnowledgeCenter(@Param("name") String name);

  /**
   * Export knowledgeCenter in CSV format
   * Similar to <code>exportKnowledgeCenter</code> but it also returns the http response headers .
   * 
   * @param name Name of the knowledgeCenter (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/agreementCenters/name/{name}/export")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<String> exportKnowledgeCenterWithHttpInfo(@Param("name") String name);



  /**
   * Get CSV documentation
   * 
   * @param name Name of the knowledgeCenter (required)
   * @return String
   */
  @RequestLine("GET /v1/agreementCenters/documentation/csv")
  @Headers({
    "Accept: application/json",
  })
  String getCsvDocumentation2(@Param("name") String name);

  /**
   * Get CSV documentation
   * Similar to <code>getCsvDocumentation2</code> but it also returns the http response headers .
   * 
   * @param name Name of the knowledgeCenter (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/agreementCenters/documentation/csv")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<String> getCsvDocumentation2WithHttpInfo(@Param("name") String name);



  /**
   * Get a knowledgeCenter by name
   * Get a knowledgeCenter by name.
   * @param name Name of the knowledgeCenter (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return KnowledgeCenter
   */
  @RequestLine("GET /v1/agreementCenters/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  KnowledgeCenter getKnowledgeCenterByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a knowledgeCenter by name
   * Similar to <code>getKnowledgeCenterByFQN</code> but it also returns the http response headers .
   * Get a knowledgeCenter by name.
   * @param name Name of the knowledgeCenter (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/agreementCenters/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenter> getKnowledgeCenterByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a knowledgeCenter by name
   * Get a knowledgeCenter by name.
   * Note, this is equivalent to the other <code>getKnowledgeCenterByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetKnowledgeCenterByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the knowledgeCenter (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return KnowledgeCenter
   */
  @RequestLine("GET /v1/agreementCenters/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  KnowledgeCenter getKnowledgeCenterByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a knowledgeCenter by name
  * Get a knowledgeCenter by name.
  * Note, this is equivalent to the other <code>getKnowledgeCenterByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the knowledgeCenter (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return KnowledgeCenter
      */
      @RequestLine("GET /v1/agreementCenters/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<KnowledgeCenter> getKnowledgeCenterByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getKnowledgeCenterByFQN</code> method in a fluent style.
   */
  public static class GetKnowledgeCenterByFQNQueryParams extends HashMap<String, Object> {
    public GetKnowledgeCenterByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetKnowledgeCenterByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a knowledgeCenter by Id
   * Get a knowledgeCenter by &#x60;Id&#x60;.
   * @param id Id of the knowledgeCenter (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return KnowledgeCenter
   */
  @RequestLine("GET /v1/agreementCenters/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  KnowledgeCenter getKnowledgeCenterByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a knowledgeCenter by Id
   * Similar to <code>getKnowledgeCenterByID</code> but it also returns the http response headers .
   * Get a knowledgeCenter by &#x60;Id&#x60;.
   * @param id Id of the knowledgeCenter (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/agreementCenters/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenter> getKnowledgeCenterByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a knowledgeCenter by Id
   * Get a knowledgeCenter by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getKnowledgeCenterByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetKnowledgeCenterByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the knowledgeCenter (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return KnowledgeCenter
   */
  @RequestLine("GET /v1/agreementCenters/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  KnowledgeCenter getKnowledgeCenterByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a knowledgeCenter by Id
  * Get a knowledgeCenter by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getKnowledgeCenterByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the knowledgeCenter (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return KnowledgeCenter
      */
      @RequestLine("GET /v1/agreementCenters/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<KnowledgeCenter> getKnowledgeCenterByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getKnowledgeCenterByID</code> method in a fluent style.
   */
  public static class GetKnowledgeCenterByIDQueryParams extends HashMap<String, Object> {
    public GetKnowledgeCenterByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetKnowledgeCenterByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a knowledgeCenter document by fully qualified name
   * Get a knowledgeCenter document by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the knowledgeCenter document (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return KnowledgeCenter
   */
  @RequestLine("GET /v1/agreementCenterDocuments/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  KnowledgeCenter getKnowledgeCenterDocumentByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a knowledgeCenter document by fully qualified name
   * Similar to <code>getKnowledgeCenterDocumentByFQN</code> but it also returns the http response headers .
   * Get a knowledgeCenter document by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the knowledgeCenter document (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/agreementCenterDocuments/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenter> getKnowledgeCenterDocumentByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a knowledgeCenter document by fully qualified name
   * Get a knowledgeCenter document by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getKnowledgeCenterDocumentByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetKnowledgeCenterDocumentByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the knowledgeCenter document (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return KnowledgeCenter
   */
  @RequestLine("GET /v1/agreementCenterDocuments/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  KnowledgeCenter getKnowledgeCenterDocumentByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a knowledgeCenter document by fully qualified name
  * Get a knowledgeCenter document by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getKnowledgeCenterDocumentByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the knowledgeCenter document (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return KnowledgeCenter
      */
      @RequestLine("GET /v1/agreementCenterDocuments/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<KnowledgeCenter> getKnowledgeCenterDocumentByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getKnowledgeCenterDocumentByFQN</code> method in a fluent style.
   */
  public static class GetKnowledgeCenterDocumentByFQNQueryParams extends HashMap<String, Object> {
    public GetKnowledgeCenterDocumentByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetKnowledgeCenterDocumentByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a knowledgeCenter document by Id
   * Get a knowledgeCenter document by &#x60;Id&#x60;.
   * @param id Id of the knowledgeCenter document (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return KnowledgeCenter
   */
  @RequestLine("GET /v1/agreementCenterDocuments/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  KnowledgeCenter getKnowledgeCenterDocumentByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a knowledgeCenter document by Id
   * Similar to <code>getKnowledgeCenterDocumentByID</code> but it also returns the http response headers .
   * Get a knowledgeCenter document by &#x60;Id&#x60;.
   * @param id Id of the knowledgeCenter document (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/agreementCenterDocuments/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenter> getKnowledgeCenterDocumentByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a knowledgeCenter document by Id
   * Get a knowledgeCenter document by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getKnowledgeCenterDocumentByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetKnowledgeCenterDocumentByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the knowledgeCenter document (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return KnowledgeCenter
   */
  @RequestLine("GET /v1/agreementCenterDocuments/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  KnowledgeCenter getKnowledgeCenterDocumentByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a knowledgeCenter document by Id
  * Get a knowledgeCenter document by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getKnowledgeCenterDocumentByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the knowledgeCenter document (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return KnowledgeCenter
      */
      @RequestLine("GET /v1/agreementCenterDocuments/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<KnowledgeCenter> getKnowledgeCenterDocumentByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getKnowledgeCenterDocumentByID</code> method in a fluent style.
   */
  public static class GetKnowledgeCenterDocumentByIDQueryParams extends HashMap<String, Object> {
    public GetKnowledgeCenterDocumentByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetKnowledgeCenterDocumentByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the knowledgeCenter document
   * Get a version of the knowledgeCenter document by given &#x60;Id&#x60;
   * @param id Id of the knowledgeCenter document (required)
   * @param version knowledgeCenter document version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return KnowledgeCenter
   */
  @RequestLine("GET /v1/agreementCenterDocuments/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  KnowledgeCenter getSpecificKnowledgeCenterDocumentVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the knowledgeCenter document
   * Similar to <code>getSpecificKnowledgeCenterDocumentVersion</code> but it also returns the http response headers .
   * Get a version of the knowledgeCenter document by given &#x60;Id&#x60;
   * @param id Id of the knowledgeCenter document (required)
   * @param version knowledgeCenter document version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/agreementCenterDocuments/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenter> getSpecificKnowledgeCenterDocumentVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a version of the knowledgecenters
   * Get a version of the knowledgeCenter by given &#x60;Id&#x60;
   * @param id Id of the knowledgeCenter (required)
   * @param version knowledgeCenter version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return KnowledgeCenter
   */
  @RequestLine("GET /v1/agreementCenters/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  KnowledgeCenter getSpecificKnowledgeCenterVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the knowledgecenters
   * Similar to <code>getSpecificKnowledgeCenterVersion</code> but it also returns the http response headers .
   * Get a version of the knowledgeCenter by given &#x60;Id&#x60;
   * @param id Id of the knowledgeCenter (required)
   * @param version knowledgeCenter version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/agreementCenters/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenter> getSpecificKnowledgeCenterVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Import knowledgeCenter documents from CSV to create, and update knowledgeCenter documents
   * 
   * @param name Name of the knowledgeCenter (required)
   * @param dryRun Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)
   * @param body  (optional)
   * @return CsvImportResult
   */
  @RequestLine("PUT /v1/agreementCenters/name/{name}/import?dryRun={dryRun}")
  @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
  })
  CsvImportResult importKnowledgeCenter(@Param("name") String name, @Param("dryRun") Boolean dryRun, String body);

  /**
   * Import knowledgeCenter documents from CSV to create, and update knowledgeCenter documents
   * Similar to <code>importKnowledgeCenter</code> but it also returns the http response headers .
   * 
   * @param name Name of the knowledgeCenter (required)
   * @param dryRun Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/agreementCenters/name/{name}/import?dryRun={dryRun}")
  @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
  })
  ApiResponse<CsvImportResult> importKnowledgeCenterWithHttpInfo(@Param("name") String name, @Param("dryRun") Boolean dryRun, String body);


  /**
   * Import knowledgeCenter documents from CSV to create, and update knowledgeCenter documents
   * 
   * Note, this is equivalent to the other <code>importKnowledgeCenter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ImportKnowledgeCenterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the knowledgeCenter (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>dryRun - Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)</li>
   *   </ul>
   * @return CsvImportResult
   */
  @RequestLine("PUT /v1/agreementCenters/name/{name}/import?dryRun={dryRun}")
  @Headers({
  "Content-Type: text/plain",
  "Accept: application/json",
  })
  CsvImportResult importKnowledgeCenter(@Param("name") String name, String body, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Import knowledgeCenter documents from CSV to create, and update knowledgeCenter documents
  * 
  * Note, this is equivalent to the other <code>importKnowledgeCenter</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the knowledgeCenter (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>dryRun - Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)</li>
      *   </ul>
          * @return CsvImportResult
      */
      @RequestLine("PUT /v1/agreementCenters/name/{name}/import?dryRun={dryRun}")
      @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
      })
   ApiResponse<CsvImportResult> importKnowledgeCenterWithHttpInfo(@Param("name") String name, String body, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>importKnowledgeCenter</code> method in a fluent style.
   */
  public static class ImportKnowledgeCenterQueryParams extends HashMap<String, Object> {
    public ImportKnowledgeCenterQueryParams dryRun(final Boolean value) {
      put("dryRun", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List knowledgeCenter document versions
   * Get a list of all the versions of a knowledgeCenter documents identified by &#x60;id&#x60;
   * @param id Id of the knowledgeCenter document (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/agreementCenterDocuments/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllKnowledgeCenterDocumentVersion(@Param("id") UUID id);

  /**
   * List knowledgeCenter document versions
   * Similar to <code>listAllKnowledgeCenterDocumentVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a knowledgeCenter documents identified by &#x60;id&#x60;
   * @param id Id of the knowledgeCenter document (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/agreementCenterDocuments/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllKnowledgeCenterDocumentVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List knowledgeCenter versions
   * Get a list of all the versions of a knowledgeCenter identified by &#x60;id&#x60;
   * @param id Id of the knowledgeCenter (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/agreementCenters/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllKnowledgeCenterVersion(@Param("id") UUID id);

  /**
   * List knowledgeCenter versions
   * Similar to <code>listAllKnowledgeCenterVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a knowledgeCenter identified by &#x60;id&#x60;
   * @param id Id of the knowledgeCenter (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/agreementCenters/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllKnowledgeCenterVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List knowledgeCenter documents
   * Get a list of knowledgeCenter documents. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param knowledgeCenter List knowledgeCenter documents filtered by knowledgeCenter identified by Id given in &#x60;knowledgeCenter&#x60; parameter. (optional)
   * @param parent List knowledgeCenter documents filtered by children of knowledgeCenter document identified by Id given in &#x60;parent&#x60; parameter. (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number knowledgeCenter documents returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of knowledgeCenter documents before this cursor (optional)
   * @param after Returns list of knowledgeCenter documents after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return KnowledgeCenterDocumentList
   */
  @RequestLine("GET /v1/agreementCenterDocuments?knowledgeCenter={knowledgeCenter}&parent={parent}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  KnowledgeCenterDocumentList listKnowledgeCenterDocument(@Param("knowledgeCenter") String knowledgeCenter, @Param("parent") String parent, @Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List knowledgeCenter documents
   * Similar to <code>listKnowledgeCenterDocument</code> but it also returns the http response headers .
   * Get a list of knowledgeCenter documents. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param knowledgeCenter List knowledgeCenter documents filtered by knowledgeCenter identified by Id given in &#x60;knowledgeCenter&#x60; parameter. (optional)
   * @param parent List knowledgeCenter documents filtered by children of knowledgeCenter document identified by Id given in &#x60;parent&#x60; parameter. (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number knowledgeCenter documents returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of knowledgeCenter documents before this cursor (optional)
   * @param after Returns list of knowledgeCenter documents after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/agreementCenterDocuments?knowledgeCenter={knowledgeCenter}&parent={parent}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenterDocumentList> listKnowledgeCenterDocumentWithHttpInfo(@Param("knowledgeCenter") String knowledgeCenter, @Param("parent") String parent, @Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List knowledgeCenter documents
   * Get a list of knowledgeCenter documents. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listKnowledgeCenterDocument</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListKnowledgeCenterDocumentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>knowledgeCenter - List knowledgeCenter documents filtered by knowledgeCenter identified by Id given in &#x60;knowledgeCenter&#x60; parameter. (optional)</li>
   *   <li>parent - List knowledgeCenter documents filtered by children of knowledgeCenter document identified by Id given in &#x60;parent&#x60; parameter. (optional)</li>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number knowledgeCenter documents returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of knowledgeCenter documents before this cursor (optional)</li>
   *   <li>after - Returns list of knowledgeCenter documents after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return KnowledgeCenterDocumentList
   */
  @RequestLine("GET /v1/agreementCenterDocuments?knowledgeCenter={knowledgeCenter}&parent={parent}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  KnowledgeCenterDocumentList listKnowledgeCenterDocument(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List knowledgeCenter documents
  * Get a list of knowledgeCenter documents. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listKnowledgeCenterDocument</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>knowledgeCenter - List knowledgeCenter documents filtered by knowledgeCenter identified by Id given in &#x60;knowledgeCenter&#x60; parameter. (optional)</li>
          *   <li>parent - List knowledgeCenter documents filtered by children of knowledgeCenter document identified by Id given in &#x60;parent&#x60; parameter. (optional)</li>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number knowledgeCenter documents returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of knowledgeCenter documents before this cursor (optional)</li>
          *   <li>after - Returns list of knowledgeCenter documents after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return KnowledgeCenterDocumentList
      */
      @RequestLine("GET /v1/agreementCenterDocuments?knowledgeCenter={knowledgeCenter}&parent={parent}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<KnowledgeCenterDocumentList> listKnowledgeCenterDocumentWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listKnowledgeCenterDocument</code> method in a fluent style.
   */
  public static class ListKnowledgeCenterDocumentQueryParams extends HashMap<String, Object> {
    public ListKnowledgeCenterDocumentQueryParams knowledgeCenter(final String value) {
      put("knowledgeCenter", EncodingUtils.encode(value));
      return this;
    }
    public ListKnowledgeCenterDocumentQueryParams parent(final String value) {
      put("parent", EncodingUtils.encode(value));
      return this;
    }
    public ListKnowledgeCenterDocumentQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListKnowledgeCenterDocumentQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListKnowledgeCenterDocumentQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListKnowledgeCenterDocumentQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListKnowledgeCenterDocumentQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List knowledgecenters
   * Get a list of knowledgecenters. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number knowledgecenters returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of knowledgecenters before this cursor (optional)
   * @param after Returns list of knowledgecenters after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return KnowledgeCenterList
   */
  @RequestLine("GET /v1/agreementCenters?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  KnowledgeCenterList listKnowledgeCenters(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List knowledgecenters
   * Similar to <code>listKnowledgeCenters</code> but it also returns the http response headers .
   * Get a list of knowledgecenters. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number knowledgecenters returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of knowledgecenters before this cursor (optional)
   * @param after Returns list of knowledgecenters after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/agreementCenters?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenterList> listKnowledgeCentersWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List knowledgecenters
   * Get a list of knowledgecenters. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listKnowledgeCenters</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListKnowledgeCentersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number knowledgecenters returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of knowledgecenters before this cursor (optional)</li>
   *   <li>after - Returns list of knowledgecenters after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return KnowledgeCenterList
   */
  @RequestLine("GET /v1/agreementCenters?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  KnowledgeCenterList listKnowledgeCenters(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List knowledgecenters
  * Get a list of knowledgecenters. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listKnowledgeCenters</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number knowledgecenters returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of knowledgecenters before this cursor (optional)</li>
          *   <li>after - Returns list of knowledgecenters after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return KnowledgeCenterList
      */
      @RequestLine("GET /v1/agreementCenters?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<KnowledgeCenterList> listKnowledgeCentersWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listKnowledgeCenters</code> method in a fluent style.
   */
  public static class ListKnowledgeCentersQueryParams extends HashMap<String, Object> {
    public ListKnowledgeCentersQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListKnowledgeCentersQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListKnowledgeCentersQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListKnowledgeCentersQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListKnowledgeCentersQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a knowledgeCenter
   * Update an existing knowledgeCenter using JsonPatch.
   * @param id Id of the knowledgeCenter (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a knowledgeCenter Documentation</a>
   */
  @RequestLine("PATCH /v1/agreementCenters/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchKnowledgeCenter(@Param("id") UUID id, Object body);

  /**
   * Update a knowledgeCenter
   * Similar to <code>patchKnowledgeCenter</code> but it also returns the http response headers .
   * Update an existing knowledgeCenter using JsonPatch.
   * @param id Id of the knowledgeCenter (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a knowledgeCenter Documentation</a>
   */
  @RequestLine("PATCH /v1/agreementCenters/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchKnowledgeCenterWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Update a knowledgeCenter document
   * Update an existing knowledgeCenter document using JsonPatch.
   * @param id Id of the knowledgeCenter document (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a knowledgeCenter document Documentation</a>
   */
  @RequestLine("PATCH /v1/agreementCenterDocuments/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchKnowledgeCenterDocument(@Param("id") UUID id, Object body);

  /**
   * Update a knowledgeCenter document
   * Similar to <code>patchKnowledgeCenterDocument</code> but it also returns the http response headers .
   * Update an existing knowledgeCenter document using JsonPatch.
   * @param id Id of the knowledgeCenter document (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a knowledgeCenter document Documentation</a>
   */
  @RequestLine("PATCH /v1/agreementCenterDocuments/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchKnowledgeCenterDocumentWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted knowledgeCenter document
   * Restore a soft deleted knowledgeCenter document.
   * @param restoreEntity  (optional)
   * @return KnowledgeCenterDocument
   */
  @RequestLine("PUT /v1/agreementCenterDocuments/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  KnowledgeCenterDocument restore17(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted knowledgeCenter document
   * Similar to <code>restore17</code> but it also returns the http response headers .
   * Restore a soft deleted knowledgeCenter document.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/agreementCenterDocuments/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenterDocument> restore17WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Restore a soft deleted knowledgeCenter
   * Restore a soft deleted KnowledgeCenter.
   * @param restoreEntity  (optional)
   * @return KnowledgeCenter
   */
  @RequestLine("PUT /v1/agreementCenters/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  KnowledgeCenter restore18(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted knowledgeCenter
   * Similar to <code>restore18</code> but it also returns the http response headers .
   * Restore a soft deleted KnowledgeCenter.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/agreementCenters/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<KnowledgeCenter> restore18WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/agreementCenterDocuments/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity11(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity11</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/agreementCenterDocuments/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity11WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/agreementCenters/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity12(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity12</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/agreementCenters/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity12WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);



  /**
   * Validate Tags Addition to KnowledgeCenter Document
   * Validate Tags Addition to KnowledgeCenter Document
   * @param id Id of the Entity (required)
   * @param addKnowledgeCenterToAssetsRequest  (optional)
   * @return BulkOperationResult
   */
  @RequestLine("PUT /v1/agreementCenterDocuments/{id}/tags/validate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BulkOperationResult validateKnowledgeCenterDocumentTagsAddition(@Param("id") UUID id, AddKnowledgeCenterToAssetsRequest addKnowledgeCenterToAssetsRequest);

  /**
   * Validate Tags Addition to KnowledgeCenter Document
   * Similar to <code>validateKnowledgeCenterDocumentTagsAddition</code> but it also returns the http response headers .
   * Validate Tags Addition to KnowledgeCenter Document
   * @param id Id of the Entity (required)
   * @param addKnowledgeCenterToAssetsRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/agreementCenterDocuments/{id}/tags/validate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BulkOperationResult> validateKnowledgeCenterDocumentTagsAdditionWithHttpInfo(@Param("id") UUID id, AddKnowledgeCenterToAssetsRequest addKnowledgeCenterToAssetsRequest);


}
