package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.AddGlossaryToAssetsRequest;
import org.openmetadata.client.model.BulkOperationResult;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateGlossary;
import org.openmetadata.client.model.CreateGlossaryTerm;
import org.openmetadata.client.model.CsvImportResult;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.Glossary;
import org.openmetadata.client.model.GlossaryList;
import org.openmetadata.client.model.GlossaryTerm;
import org.openmetadata.client.model.GlossaryTermList;
import org.openmetadata.client.model.RestoreEntity;
import java.util.UUID;
import org.openmetadata.client.model.VoteRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface GlossariesApi extends ApiClient.Api {


  /**
   * Bulk Add Glossary Term to Assets
   * Bulk Add Glossary Term to Assets
   * @param id Id of the Entity (required)
   * @param addGlossaryToAssetsRequest  (optional)
   * @return BulkOperationResult
   */
  @RequestLine("PUT /v1/glossaryTerms/{id}/assets/add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BulkOperationResult bulkAddGlossaryTermToAssets(@Param("id") UUID id, AddGlossaryToAssetsRequest addGlossaryToAssetsRequest);

  /**
   * Bulk Add Glossary Term to Assets
   * Similar to <code>bulkAddGlossaryTermToAssets</code> but it also returns the http response headers .
   * Bulk Add Glossary Term to Assets
   * @param id Id of the Entity (required)
   * @param addGlossaryToAssetsRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/glossaryTerms/{id}/assets/add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BulkOperationResult> bulkAddGlossaryTermToAssetsWithHttpInfo(@Param("id") UUID id, AddGlossaryToAssetsRequest addGlossaryToAssetsRequest);



  /**
   * Bulk Remove Glossary Term from Assets
   * Bulk Remove Glossary Term from Assets
   * @param id Id of the Entity (required)
   * @param addGlossaryToAssetsRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/glossaryTerms/{id}/assets/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent bulkRemoveGlossaryTermFromAssets(@Param("id") UUID id, AddGlossaryToAssetsRequest addGlossaryToAssetsRequest);

  /**
   * Bulk Remove Glossary Term from Assets
   * Similar to <code>bulkRemoveGlossaryTermFromAssets</code> but it also returns the http response headers .
   * Bulk Remove Glossary Term from Assets
   * @param id Id of the Entity (required)
   * @param addGlossaryToAssetsRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/glossaryTerms/{id}/assets/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> bulkRemoveGlossaryTermFromAssetsWithHttpInfo(@Param("id") UUID id, AddGlossaryToAssetsRequest addGlossaryToAssetsRequest);



  /**
   * Create a glossary
   * Create a new glossary.
   * @param createGlossary  (optional)
   * @return Glossary
   */
  @RequestLine("POST /v1/glossaries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Glossary createGlossary(CreateGlossary createGlossary);

  /**
   * Create a glossary
   * Similar to <code>createGlossary</code> but it also returns the http response headers .
   * Create a new glossary.
   * @param createGlossary  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/glossaries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Glossary> createGlossaryWithHttpInfo(CreateGlossary createGlossary);



  /**
   * Create a glossary term
   * Create a new glossary term.
   * @param createGlossaryTerm  (optional)
   * @return GlossaryTerm
   */
  @RequestLine("POST /v1/glossaryTerms")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GlossaryTerm createGlossaryTerm(CreateGlossaryTerm createGlossaryTerm);

  /**
   * Create a glossary term
   * Similar to <code>createGlossaryTerm</code> but it also returns the http response headers .
   * Create a new glossary term.
   * @param createGlossaryTerm  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/glossaryTerms")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GlossaryTerm> createGlossaryTermWithHttpInfo(CreateGlossaryTerm createGlossaryTerm);



  /**
   * Create or update a glossary
   * Create a new glossary, if it does not exist or update an existing glossary.
   * @param createGlossary  (optional)
   * @return Glossary
   */
  @RequestLine("PUT /v1/glossaries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Glossary createOrUpdateGlossary(CreateGlossary createGlossary);

  /**
   * Create or update a glossary
   * Similar to <code>createOrUpdateGlossary</code> but it also returns the http response headers .
   * Create a new glossary, if it does not exist or update an existing glossary.
   * @param createGlossary  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/glossaries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Glossary> createOrUpdateGlossaryWithHttpInfo(CreateGlossary createGlossary);



  /**
   * Create or update a glossary term
   * Create a new glossary term, if it does not exist or update an existing glossary term.
   * @param createGlossaryTerm  (optional)
   * @return GlossaryTerm
   */
  @RequestLine("PUT /v1/glossaryTerms")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GlossaryTerm createOrUpdateGlossaryTerm(CreateGlossaryTerm createGlossaryTerm);

  /**
   * Create or update a glossary term
   * Similar to <code>createOrUpdateGlossaryTerm</code> but it also returns the http response headers .
   * Create a new glossary term, if it does not exist or update an existing glossary term.
   * @param createGlossaryTerm  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/glossaryTerms")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GlossaryTerm> createOrUpdateGlossaryTermWithHttpInfo(CreateGlossaryTerm createGlossaryTerm);



  /**
   * Delete a glossary term by Id
   * Delete a glossary term by &#x60;Id&#x60;.
   * @param id Id of the glossary term (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/glossaryTerms/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void delete1(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a glossary term by Id
   * Similar to <code>delete1</code> but it also returns the http response headers .
   * Delete a glossary term by &#x60;Id&#x60;.
   * @param id Id of the glossary term (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/glossaryTerms/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> delete1WithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a glossary term by Id
   * Delete a glossary term by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>delete1</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Delete1QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the glossary term (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/glossaryTerms/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void delete1(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a glossary term by Id
  * Delete a glossary term by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>delete1</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the glossary term (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/glossaryTerms/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> delete1WithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>delete1</code> method in a fluent style.
   */
  public static class Delete1QueryParams extends HashMap<String, Object> {
    public Delete1QueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public Delete1QueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a glossary by Id
   * Delete a glossary by &#x60;Id&#x60;.
   * @param id Id of the glossary (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/glossaries/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteGlossary(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a glossary by Id
   * Similar to <code>deleteGlossary</code> but it also returns the http response headers .
   * Delete a glossary by &#x60;Id&#x60;.
   * @param id Id of the glossary (required)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/glossaries/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteGlossaryWithHttpInfo(@Param("id") UUID id, @Param("recursive") Boolean recursive, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a glossary by Id
   * Delete a glossary by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>deleteGlossary</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteGlossaryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the glossary (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/glossaries/{id}?recursive={recursive}&hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteGlossary(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a glossary by Id
  * Delete a glossary by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>deleteGlossary</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the glossary (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/glossaries/{id}?recursive={recursive}&hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteGlossaryWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteGlossary</code> method in a fluent style.
   */
  public static class DeleteGlossaryQueryParams extends HashMap<String, Object> {
    public DeleteGlossaryQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
    public DeleteGlossaryQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a glossary by name
   * Delete a glossary by &#x60;name&#x60;.
   * @param name Name of the glossary (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/glossaries/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteGlossaryByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a glossary by name
   * Similar to <code>deleteGlossaryByName</code> but it also returns the http response headers .
   * Delete a glossary by &#x60;name&#x60;.
   * @param name Name of the glossary (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/glossaries/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteGlossaryByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a glossary by name
   * Delete a glossary by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>deleteGlossaryByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteGlossaryByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the glossary (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/glossaries/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteGlossaryByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a glossary by name
  * Delete a glossary by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>deleteGlossaryByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the glossary (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/glossaries/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteGlossaryByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteGlossaryByName</code> method in a fluent style.
   */
  public static class DeleteGlossaryByNameQueryParams extends HashMap<String, Object> {
    public DeleteGlossaryByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a glossary term by fully qualified name
   * Delete a glossary term by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the glossary term (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/glossaryTerms/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  void deleteGlossaryTermByName(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);

  /**
   * Delete a glossary term by fully qualified name
   * Similar to <code>deleteGlossaryTermByName</code> but it also returns the http response headers .
   * Delete a glossary term by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the glossary term (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param recursive Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/glossaryTerms/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteGlossaryTermByNameWithHttpInfo(@Param("fqn") String fqn, @Param("hardDelete") Boolean hardDelete, @Param("recursive") Boolean recursive);


  /**
   * Delete a glossary term by fully qualified name
   * Delete a glossary term by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>deleteGlossaryTermByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteGlossaryTermByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the glossary term (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/glossaryTerms/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
  @Headers({
  "Accept: application/json",
  })
  void deleteGlossaryTermByName(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a glossary term by fully qualified name
  * Delete a glossary term by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>deleteGlossaryTermByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the glossary term (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
          *   <li>recursive - Recursively delete this entity and it&#39;s children. (Default &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/glossaryTerms/name/{fqn}?hardDelete={hardDelete}&recursive={recursive}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteGlossaryTermByNameWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteGlossaryTermByName</code> method in a fluent style.
   */
  public static class DeleteGlossaryTermByNameQueryParams extends HashMap<String, Object> {
    public DeleteGlossaryTermByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
    public DeleteGlossaryTermByNameQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Export glossary in CSV format
   * 
   * @param name Name of the glossary (required)
   * @return String
   */
  @RequestLine("GET /v1/glossaries/name/{name}/export")
  @Headers({
    "Accept: application/json",
  })
  String exportGlossary(@Param("name") String name);

  /**
   * Export glossary in CSV format
   * Similar to <code>exportGlossary</code> but it also returns the http response headers .
   * 
   * @param name Name of the glossary (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/glossaries/name/{name}/export")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<String> exportGlossaryWithHttpInfo(@Param("name") String name);



  /**
   * Get CSV documentation
   * 
   * @param name Name of the glossary (required)
   * @return String
   */
  @RequestLine("GET /v1/glossaries/documentation/csv")
  @Headers({
    "Accept: application/json",
  })
  String getCsvDocumentation1(@Param("name") String name);

  /**
   * Get CSV documentation
   * Similar to <code>getCsvDocumentation1</code> but it also returns the http response headers .
   * 
   * @param name Name of the glossary (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/glossaries/documentation/csv")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<String> getCsvDocumentation1WithHttpInfo(@Param("name") String name);



  /**
   * Get a glossary by name
   * Get a glossary by name.
   * @param name Name of the glossary (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Glossary
   */
  @RequestLine("GET /v1/glossaries/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Glossary getGlossaryByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a glossary by name
   * Similar to <code>getGlossaryByFQN</code> but it also returns the http response headers .
   * Get a glossary by name.
   * @param name Name of the glossary (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/glossaries/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Glossary> getGlossaryByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a glossary by name
   * Get a glossary by name.
   * Note, this is equivalent to the other <code>getGlossaryByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetGlossaryByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the glossary (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Glossary
   */
  @RequestLine("GET /v1/glossaries/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Glossary getGlossaryByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a glossary by name
  * Get a glossary by name.
  * Note, this is equivalent to the other <code>getGlossaryByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the glossary (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Glossary
      */
      @RequestLine("GET /v1/glossaries/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Glossary> getGlossaryByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getGlossaryByFQN</code> method in a fluent style.
   */
  public static class GetGlossaryByFQNQueryParams extends HashMap<String, Object> {
    public GetGlossaryByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetGlossaryByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a glossary by Id
   * Get a glossary by &#x60;Id&#x60;.
   * @param id Id of the glossary (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Glossary
   */
  @RequestLine("GET /v1/glossaries/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Glossary getGlossaryByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a glossary by Id
   * Similar to <code>getGlossaryByID</code> but it also returns the http response headers .
   * Get a glossary by &#x60;Id&#x60;.
   * @param id Id of the glossary (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/glossaries/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Glossary> getGlossaryByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a glossary by Id
   * Get a glossary by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getGlossaryByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetGlossaryByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the glossary (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Glossary
   */
  @RequestLine("GET /v1/glossaries/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Glossary getGlossaryByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a glossary by Id
  * Get a glossary by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getGlossaryByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the glossary (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Glossary
      */
      @RequestLine("GET /v1/glossaries/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Glossary> getGlossaryByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getGlossaryByID</code> method in a fluent style.
   */
  public static class GetGlossaryByIDQueryParams extends HashMap<String, Object> {
    public GetGlossaryByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetGlossaryByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a glossary term by fully qualified name
   * Get a glossary term by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the glossary term (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Glossary
   */
  @RequestLine("GET /v1/glossaryTerms/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Glossary getGlossaryTermByFQN(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a glossary term by fully qualified name
   * Similar to <code>getGlossaryTermByFQN</code> but it also returns the http response headers .
   * Get a glossary term by &#x60;fullyQualifiedName&#x60;.
   * @param fqn Fully qualified name of the glossary term (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/glossaryTerms/name/{fqn}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Glossary> getGlossaryTermByFQNWithHttpInfo(@Param("fqn") String fqn, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a glossary term by fully qualified name
   * Get a glossary term by &#x60;fullyQualifiedName&#x60;.
   * Note, this is equivalent to the other <code>getGlossaryTermByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetGlossaryTermByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param fqn Fully qualified name of the glossary term (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Glossary
   */
  @RequestLine("GET /v1/glossaryTerms/name/{fqn}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Glossary getGlossaryTermByFQN(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a glossary term by fully qualified name
  * Get a glossary term by &#x60;fullyQualifiedName&#x60;.
  * Note, this is equivalent to the other <code>getGlossaryTermByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param fqn Fully qualified name of the glossary term (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Glossary
      */
      @RequestLine("GET /v1/glossaryTerms/name/{fqn}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Glossary> getGlossaryTermByFQNWithHttpInfo(@Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getGlossaryTermByFQN</code> method in a fluent style.
   */
  public static class GetGlossaryTermByFQNQueryParams extends HashMap<String, Object> {
    public GetGlossaryTermByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetGlossaryTermByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a glossary term by Id
   * Get a glossary term by &#x60;Id&#x60;.
   * @param id Id of the glossary term (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Glossary
   */
  @RequestLine("GET /v1/glossaryTerms/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Glossary getGlossaryTermByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a glossary term by Id
   * Similar to <code>getGlossaryTermByID</code> but it also returns the http response headers .
   * Get a glossary term by &#x60;Id&#x60;.
   * @param id Id of the glossary term (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/glossaryTerms/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Glossary> getGlossaryTermByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a glossary term by Id
   * Get a glossary term by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getGlossaryTermByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetGlossaryTermByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the glossary term (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Glossary
   */
  @RequestLine("GET /v1/glossaryTerms/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Glossary getGlossaryTermByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a glossary term by Id
  * Get a glossary term by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getGlossaryTermByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the glossary term (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Glossary
      */
      @RequestLine("GET /v1/glossaryTerms/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Glossary> getGlossaryTermByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getGlossaryTermByID</code> method in a fluent style.
   */
  public static class GetGlossaryTermByIDQueryParams extends HashMap<String, Object> {
    public GetGlossaryTermByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetGlossaryTermByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the glossary term
   * Get a version of the glossary term by given &#x60;Id&#x60;
   * @param id Id of the glossary term (required)
   * @param version glossary term version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Glossary
   */
  @RequestLine("GET /v1/glossaryTerms/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Glossary getSpecificGlossaryTermVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the glossary term
   * Similar to <code>getSpecificGlossaryTermVersion</code> but it also returns the http response headers .
   * Get a version of the glossary term by given &#x60;Id&#x60;
   * @param id Id of the glossary term (required)
   * @param version glossary term version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/glossaryTerms/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Glossary> getSpecificGlossaryTermVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a version of the glossaries
   * Get a version of the glossary by given &#x60;Id&#x60;
   * @param id Id of the glossary (required)
   * @param version glossary version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Glossary
   */
  @RequestLine("GET /v1/glossaries/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Glossary getSpecificGlossaryVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the glossaries
   * Similar to <code>getSpecificGlossaryVersion</code> but it also returns the http response headers .
   * Get a version of the glossary by given &#x60;Id&#x60;
   * @param id Id of the glossary (required)
   * @param version glossary version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/glossaries/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Glossary> getSpecificGlossaryVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Import glossary terms from CSV to create, and update glossary terms
   * 
   * @param name Name of the glossary (required)
   * @param dryRun Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)
   * @param body  (optional)
   * @return CsvImportResult
   */
  @RequestLine("PUT /v1/glossaries/name/{name}/import?dryRun={dryRun}")
  @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
  })
  CsvImportResult importGlossary(@Param("name") String name, @Param("dryRun") Boolean dryRun, String body);

  /**
   * Import glossary terms from CSV to create, and update glossary terms
   * Similar to <code>importGlossary</code> but it also returns the http response headers .
   * 
   * @param name Name of the glossary (required)
   * @param dryRun Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/glossaries/name/{name}/import?dryRun={dryRun}")
  @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
  })
  ApiResponse<CsvImportResult> importGlossaryWithHttpInfo(@Param("name") String name, @Param("dryRun") Boolean dryRun, String body);


  /**
   * Import glossary terms from CSV to create, and update glossary terms
   * 
   * Note, this is equivalent to the other <code>importGlossary</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ImportGlossaryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the glossary (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>dryRun - Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)</li>
   *   </ul>
   * @return CsvImportResult
   */
  @RequestLine("PUT /v1/glossaries/name/{name}/import?dryRun={dryRun}")
  @Headers({
  "Content-Type: text/plain",
  "Accept: application/json",
  })
  CsvImportResult importGlossary(@Param("name") String name, String body, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Import glossary terms from CSV to create, and update glossary terms
  * 
  * Note, this is equivalent to the other <code>importGlossary</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the glossary (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>dryRun - Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)</li>
      *   </ul>
          * @return CsvImportResult
      */
      @RequestLine("PUT /v1/glossaries/name/{name}/import?dryRun={dryRun}")
      @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
      })
   ApiResponse<CsvImportResult> importGlossaryWithHttpInfo(@Param("name") String name, String body, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>importGlossary</code> method in a fluent style.
   */
  public static class ImportGlossaryQueryParams extends HashMap<String, Object> {
    public ImportGlossaryQueryParams dryRun(final Boolean value) {
      put("dryRun", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List glossary term versions
   * Get a list of all the versions of a glossary terms identified by &#x60;id&#x60;
   * @param id Id of the glossary term (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/glossaryTerms/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllGlossaryTermVersion(@Param("id") UUID id);

  /**
   * List glossary term versions
   * Similar to <code>listAllGlossaryTermVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a glossary terms identified by &#x60;id&#x60;
   * @param id Id of the glossary term (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/glossaryTerms/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllGlossaryTermVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List glossary versions
   * Get a list of all the versions of a glossary identified by &#x60;id&#x60;
   * @param id Id of the glossary (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/glossaries/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllGlossaryVersion(@Param("id") UUID id);

  /**
   * List glossary versions
   * Similar to <code>listAllGlossaryVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a glossary identified by &#x60;id&#x60;
   * @param id Id of the glossary (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/glossaries/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllGlossaryVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List glossaries
   * Get a list of glossaries. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number glossaries returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of glossaries before this cursor (optional)
   * @param after Returns list of glossaries after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return GlossaryList
   */
  @RequestLine("GET /v1/glossaries?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  GlossaryList listGlossaries(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List glossaries
   * Similar to <code>listGlossaries</code> but it also returns the http response headers .
   * Get a list of glossaries. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number glossaries returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of glossaries before this cursor (optional)
   * @param after Returns list of glossaries after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/glossaries?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GlossaryList> listGlossariesWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List glossaries
   * Get a list of glossaries. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listGlossaries</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListGlossariesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number glossaries returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of glossaries before this cursor (optional)</li>
   *   <li>after - Returns list of glossaries after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return GlossaryList
   */
  @RequestLine("GET /v1/glossaries?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  GlossaryList listGlossaries(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List glossaries
  * Get a list of glossaries. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listGlossaries</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number glossaries returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of glossaries before this cursor (optional)</li>
          *   <li>after - Returns list of glossaries after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return GlossaryList
      */
      @RequestLine("GET /v1/glossaries?fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GlossaryList> listGlossariesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listGlossaries</code> method in a fluent style.
   */
  public static class ListGlossariesQueryParams extends HashMap<String, Object> {
    public ListGlossariesQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListGlossariesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListGlossariesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListGlossariesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListGlossariesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List glossary terms
   * Get a list of glossary terms. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param glossary List glossary terms filtered by glossary identified by Id given in &#x60;glossary&#x60; parameter. (optional)
   * @param parent List glossary terms filtered by children of glossary term identified by Id given in &#x60;parent&#x60; parameter. (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number glossary terms returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of glossary terms before this cursor (optional)
   * @param after Returns list of glossary terms after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return GlossaryTermList
   */
  @RequestLine("GET /v1/glossaryTerms?glossary={glossary}&parent={parent}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  GlossaryTermList listGlossaryTerm(@Param("glossary") String glossary, @Param("parent") String parent, @Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);

  /**
   * List glossary terms
   * Similar to <code>listGlossaryTerm</code> but it also returns the http response headers .
   * Get a list of glossary terms. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param glossary List glossary terms filtered by glossary identified by Id given in &#x60;glossary&#x60; parameter. (optional)
   * @param parent List glossary terms filtered by children of glossary term identified by Id given in &#x60;parent&#x60; parameter. (optional)
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number glossary terms returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of glossary terms before this cursor (optional)
   * @param after Returns list of glossary terms after this cursor (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/glossaryTerms?glossary={glossary}&parent={parent}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GlossaryTermList> listGlossaryTermWithHttpInfo(@Param("glossary") String glossary, @Param("parent") String parent, @Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("include") String include);


  /**
   * List glossary terms
   * Get a list of glossary terms. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listGlossaryTerm</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListGlossaryTermQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>glossary - List glossary terms filtered by glossary identified by Id given in &#x60;glossary&#x60; parameter. (optional)</li>
   *   <li>parent - List glossary terms filtered by children of glossary term identified by Id given in &#x60;parent&#x60; parameter. (optional)</li>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number glossary terms returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of glossary terms before this cursor (optional)</li>
   *   <li>after - Returns list of glossary terms after this cursor (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return GlossaryTermList
   */
  @RequestLine("GET /v1/glossaryTerms?glossary={glossary}&parent={parent}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  GlossaryTermList listGlossaryTerm(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List glossary terms
  * Get a list of glossary terms. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listGlossaryTerm</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>glossary - List glossary terms filtered by glossary identified by Id given in &#x60;glossary&#x60; parameter. (optional)</li>
          *   <li>parent - List glossary terms filtered by children of glossary term identified by Id given in &#x60;parent&#x60; parameter. (optional)</li>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number glossary terms returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of glossary terms before this cursor (optional)</li>
          *   <li>after - Returns list of glossary terms after this cursor (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return GlossaryTermList
      */
      @RequestLine("GET /v1/glossaryTerms?glossary={glossary}&parent={parent}&fields={fields}&limit={limit}&before={before}&after={after}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GlossaryTermList> listGlossaryTermWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listGlossaryTerm</code> method in a fluent style.
   */
  public static class ListGlossaryTermQueryParams extends HashMap<String, Object> {
    public ListGlossaryTermQueryParams glossary(final String value) {
      put("glossary", EncodingUtils.encode(value));
      return this;
    }
    public ListGlossaryTermQueryParams parent(final String value) {
      put("parent", EncodingUtils.encode(value));
      return this;
    }
    public ListGlossaryTermQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListGlossaryTermQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListGlossaryTermQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListGlossaryTermQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListGlossaryTermQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a glossary
   * Update an existing glossary using JsonPatch.
   * @param id Id of the glossary (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a glossary Documentation</a>
   */
  @RequestLine("PATCH /v1/glossaries/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchGlossary(@Param("id") UUID id, Object body);

  /**
   * Update a glossary
   * Similar to <code>patchGlossary</code> but it also returns the http response headers .
   * Update an existing glossary using JsonPatch.
   * @param id Id of the glossary (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a glossary Documentation</a>
   */
  @RequestLine("PATCH /v1/glossaries/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchGlossaryWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Update a glossary term
   * Update an existing glossary term using JsonPatch.
   * @param id Id of the glossary term (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a glossary term Documentation</a>
   */
  @RequestLine("PATCH /v1/glossaryTerms/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchGlossaryTerm(@Param("id") UUID id, Object body);

  /**
   * Update a glossary term
   * Similar to <code>patchGlossaryTerm</code> but it also returns the http response headers .
   * Update an existing glossary term using JsonPatch.
   * @param id Id of the glossary term (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a glossary term Documentation</a>
   */
  @RequestLine("PATCH /v1/glossaryTerms/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchGlossaryTermWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Restore a soft deleted glossary
   * Restore a soft deleted Glossary.
   * @param restoreEntity  (optional)
   * @return Glossary
   */
  @RequestLine("PUT /v1/glossaries/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Glossary restore15(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted glossary
   * Similar to <code>restore15</code> but it also returns the http response headers .
   * Restore a soft deleted Glossary.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/glossaries/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Glossary> restore15WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Restore a soft deleted glossary term
   * Restore a soft deleted glossary term.
   * @param restoreEntity  (optional)
   * @return GlossaryTerm
   */
  @RequestLine("PUT /v1/glossaryTerms/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GlossaryTerm restore16(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted glossary term
   * Similar to <code>restore16</code> but it also returns the http response headers .
   * Restore a soft deleted glossary term.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/glossaryTerms/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GlossaryTerm> restore16WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/glossaryTerms/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity10(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity10</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/glossaryTerms/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity10WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);



  /**
   * Update Vote for a Entity
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/glossaries/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent updateVoteForEntity9(@Param("id") UUID id, VoteRequest voteRequest);

  /**
   * Update Vote for a Entity
   * Similar to <code>updateVoteForEntity9</code> but it also returns the http response headers .
   * Update vote for a Entity
   * @param id Id of the Entity (required)
   * @param voteRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/glossaries/{id}/vote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> updateVoteForEntity9WithHttpInfo(@Param("id") UUID id, VoteRequest voteRequest);



  /**
   * Validate Tags Addition to Glossary Term
   * Validate Tags Addition to Glossary Term
   * @param id Id of the Entity (required)
   * @param addGlossaryToAssetsRequest  (optional)
   * @return BulkOperationResult
   */
  @RequestLine("PUT /v1/glossaryTerms/{id}/tags/validate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BulkOperationResult validateGlossaryTermTagsAddition(@Param("id") UUID id, AddGlossaryToAssetsRequest addGlossaryToAssetsRequest);

  /**
   * Validate Tags Addition to Glossary Term
   * Similar to <code>validateGlossaryTermTagsAddition</code> but it also returns the http response headers .
   * Validate Tags Addition to Glossary Term
   * @param id Id of the Entity (required)
   * @param addGlossaryToAssetsRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/glossaryTerms/{id}/tags/validate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BulkOperationResult> validateGlossaryTermTagsAdditionWithHttpInfo(@Param("id") UUID id, AddGlossaryToAssetsRequest addGlossaryToAssetsRequest);


}
