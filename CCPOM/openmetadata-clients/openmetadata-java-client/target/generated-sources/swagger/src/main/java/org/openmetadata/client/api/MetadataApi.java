package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreateType;
import org.openmetadata.client.model.CustomProperty;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.Type;
import org.openmetadata.client.model.TypeList;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface MetadataApi extends ApiClient.Api {


  /**
   * Add or update a Property to an entity
   * Add or update a property to an entity type. Properties can only be added to entity type and not property type.
   * @param id Id of the type (required)
   * @param customProperty  (optional)
   */
  @RequestLine("PUT /v1/metadata/types/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void addProperty(@Param("id") UUID id, CustomProperty customProperty);

  /**
   * Add or update a Property to an entity
   * Similar to <code>addProperty</code> but it also returns the http response headers .
   * Add or update a property to an entity type. Properties can only be added to entity type and not property type.
   * @param id Id of the type (required)
   * @param customProperty  (optional)
   */
  @RequestLine("PUT /v1/metadata/types/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> addPropertyWithHttpInfo(@Param("id") UUID id, CustomProperty customProperty);



  /**
   * Create or update a type
   * Create a new type, if it does not exist or update an existing type.
   * @param createType  (optional)
   * @return Type
   */
  @RequestLine("PUT /v1/metadata/types")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Type createOrUpdate(CreateType createType);

  /**
   * Create or update a type
   * Similar to <code>createOrUpdate</code> but it also returns the http response headers .
   * Create a new type, if it does not exist or update an existing type.
   * @param createType  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/metadata/types")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Type> createOrUpdateWithHttpInfo(CreateType createType);



  /**
   * Create a type
   * Create a new type.
   * @param createType  (optional)
   * @return Type
   */
  @RequestLine("POST /v1/metadata/types")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Type createType(CreateType createType);

  /**
   * Create a type
   * Similar to <code>createType</code> but it also returns the http response headers .
   * Create a new type.
   * @param createType  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/metadata/types")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Type> createTypeWithHttpInfo(CreateType createType);



  /**
   * Delete a type by id
   * Delete a type by &#x60;id&#x60;.
   * @param id Id of the type (required)
   */
  @RequestLine("DELETE /v1/metadata/types/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteType(@Param("id") UUID id);

  /**
   * Delete a type by id
   * Similar to <code>deleteType</code> but it also returns the http response headers .
   * Delete a type by &#x60;id&#x60;.
   * @param id Id of the type (required)
   */
  @RequestLine("DELETE /v1/metadata/types/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTypeWithHttpInfo(@Param("id") UUID id);



  /**
   * Delete a type by name
   * Delete a type by &#x60;name&#x60;.
   * @param name Name of the type (required)
   */
  @RequestLine("DELETE /v1/metadata/types/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTypeByName(@Param("name") String name);

  /**
   * Delete a type by name
   * Similar to <code>deleteTypeByName</code> but it also returns the http response headers .
   * Delete a type by &#x60;name&#x60;.
   * @param name Name of the type (required)
   */
  @RequestLine("DELETE /v1/metadata/types/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTypeByNameWithHttpInfo(@Param("name") String name);



  /**
   * Get a version of the types
   * Get a version of the type by given &#x60;id&#x60;
   * @param id Id of the type (required)
   * @param version type version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Type
   */
  @RequestLine("GET /v1/metadata/types/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Type getSpecificTypeVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the types
   * Similar to <code>getSpecificTypeVersion</code> but it also returns the http response headers .
   * Get a version of the type by given &#x60;id&#x60;
   * @param id Id of the type (required)
   * @param version type version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/metadata/types/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Type> getSpecificTypeVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a type
   * Get a type by &#x60;id&#x60;.
   * @param id Id of the type (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Type
   */
  @RequestLine("GET /v1/metadata/types/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Type getTypeByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a type
   * Similar to <code>getTypeByID</code> but it also returns the http response headers .
   * Get a type by &#x60;id&#x60;.
   * @param id Id of the type (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/metadata/types/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Type> getTypeByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a type
   * Get a type by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getTypeByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTypeByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the type (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Type
   */
  @RequestLine("GET /v1/metadata/types/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Type getTypeByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a type
  * Get a type by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getTypeByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the type (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Type
      */
      @RequestLine("GET /v1/metadata/types/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Type> getTypeByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTypeByID</code> method in a fluent style.
   */
  public static class GetTypeByIDQueryParams extends HashMap<String, Object> {
    public GetTypeByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetTypeByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a type by name
   * Get a type by name.
   * @param name Name of the type (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Type
   */
  @RequestLine("GET /v1/metadata/types/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Type getTypeByName(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a type by name
   * Similar to <code>getTypeByName</code> but it also returns the http response headers .
   * Get a type by name.
   * @param name Name of the type (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/metadata/types/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Type> getTypeByNameWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a type by name
   * Get a type by name.
   * Note, this is equivalent to the other <code>getTypeByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTypeByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the type (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Type
   */
  @RequestLine("GET /v1/metadata/types/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Type getTypeByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a type by name
  * Get a type by name.
  * Note, this is equivalent to the other <code>getTypeByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the type (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Type
      */
      @RequestLine("GET /v1/metadata/types/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Type> getTypeByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTypeByName</code> method in a fluent style.
   */
  public static class GetTypeByNameQueryParams extends HashMap<String, Object> {
    public GetTypeByNameQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetTypeByNameQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List type versions
   * Get a list of all the versions of a type identified by &#x60;id&#x60;
   * @param id Id of the type (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/metadata/types/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllTypeVersion(@Param("id") UUID id);

  /**
   * List type versions
   * Similar to <code>listAllTypeVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a type identified by &#x60;id&#x60;
   * @param id Id of the type (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/metadata/types/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllTypeVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List types
   * Get a list of types. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param category Filter types by metadata type category. (optional)
   * @param limit Limit the number types returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of types before this cursor (optional)
   * @param after Returns list of types after this cursor (optional)
   * @return TypeList
   */
  @RequestLine("GET /v1/metadata/types?category={category}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  TypeList listTypes(@Param("category") String category, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);

  /**
   * List types
   * Similar to <code>listTypes</code> but it also returns the http response headers .
   * Get a list of types. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param category Filter types by metadata type category. (optional)
   * @param limit Limit the number types returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of types before this cursor (optional)
   * @param after Returns list of types after this cursor (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/metadata/types?category={category}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TypeList> listTypesWithHttpInfo(@Param("category") String category, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);


  /**
   * List types
   * Get a list of types. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listTypes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTypesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>category - Filter types by metadata type category. (optional)</li>
   *   <li>limit - Limit the number types returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of types before this cursor (optional)</li>
   *   <li>after - Returns list of types after this cursor (optional)</li>
   *   </ul>
   * @return TypeList
   */
  @RequestLine("GET /v1/metadata/types?category={category}&limit={limit}&before={before}&after={after}")
  @Headers({
  "Accept: application/json",
  })
  TypeList listTypes(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List types
  * Get a list of types. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listTypes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>category - Filter types by metadata type category. (optional)</li>
          *   <li>limit - Limit the number types returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of types before this cursor (optional)</li>
          *   <li>after - Returns list of types after this cursor (optional)</li>
      *   </ul>
          * @return TypeList
      */
      @RequestLine("GET /v1/metadata/types?category={category}&limit={limit}&before={before}&after={after}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TypeList> listTypesWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listTypes</code> method in a fluent style.
   */
  public static class ListTypesQueryParams extends HashMap<String, Object> {
    public ListTypesQueryParams category(final String value) {
      put("category", EncodingUtils.encode(value));
      return this;
    }
    public ListTypesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListTypesQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListTypesQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a type
   * Update an existing type using JsonPatch.
   * @param id Id of the type (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a type Documentation</a>
   */
  @RequestLine("PATCH /v1/metadata/types/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchType(@Param("id") UUID id, Object body);

  /**
   * Update a type
   * Similar to <code>patchType</code> but it also returns the http response headers .
   * Update an existing type using JsonPatch.
   * @param id Id of the type (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a type Documentation</a>
   */
  @RequestLine("PATCH /v1/metadata/types/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchTypeWithHttpInfo(@Param("id") UUID id, Object body);


}
