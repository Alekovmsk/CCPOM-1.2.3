package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.CreatePersona;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.Persona;
import org.openmetadata.client.model.PersonaList;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface PersonasApi extends ApiClient.Api {


  /**
   * Update Persona
   * Create or Update a Persona.
   * @param createPersona  (optional)
   * @return Persona
   */
  @RequestLine("PUT /v1/personas")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Persona createOrUpdatePersona(CreatePersona createPersona);

  /**
   * Update Persona
   * Similar to <code>createOrUpdatePersona</code> but it also returns the http response headers .
   * Create or Update a Persona.
   * @param createPersona  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/personas")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Persona> createOrUpdatePersonaWithHttpInfo(CreatePersona createPersona);



  /**
   * Create a Persona
   * Create a new Persona.
   * @param createPersona  (optional)
   * @return Persona
   */
  @RequestLine("POST /v1/personas")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Persona createPersona(CreatePersona createPersona);

  /**
   * Create a Persona
   * Similar to <code>createPersona</code> but it also returns the http response headers .
   * Create a new Persona.
   * @param createPersona  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/personas")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Persona> createPersonaWithHttpInfo(CreatePersona createPersona);



  /**
   * Delete a Persona by id
   * Delete a Persona by given &#x60;id&#x60;.
   * @param id Id of the Persona (required)
   */
  @RequestLine("DELETE /v1/personas/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deletePersona(@Param("id") UUID id);

  /**
   * Delete a Persona by id
   * Similar to <code>deletePersona</code> but it also returns the http response headers .
   * Delete a Persona by given &#x60;id&#x60;.
   * @param id Id of the Persona (required)
   */
  @RequestLine("DELETE /v1/personas/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePersonaWithHttpInfo(@Param("id") UUID id);



  /**
   * Delete a Persona by name
   * Delete a Persona by given &#x60;name&#x60;.
   * @param name Name of the Persona (required)
   */
  @RequestLine("DELETE /v1/personas/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  void deletePersonaByName(@Param("name") String name);

  /**
   * Delete a Persona by name
   * Similar to <code>deletePersonaByName</code> but it also returns the http response headers .
   * Delete a Persona by given &#x60;name&#x60;.
   * @param name Name of the Persona (required)
   */
  @RequestLine("DELETE /v1/personas/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePersonaByNameWithHttpInfo(@Param("name") String name);



  /**
   * Get a Persona by name
   * Get a Persona by &#x60;name&#x60;.
   * @param name Name of the Persona (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Persona
   */
  @RequestLine("GET /v1/personas/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Persona getPersonaByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a Persona by name
   * Similar to <code>getPersonaByFQN</code> but it also returns the http response headers .
   * Get a Persona by &#x60;name&#x60;.
   * @param name Name of the Persona (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/personas/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Persona> getPersonaByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a Persona by name
   * Get a Persona by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getPersonaByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPersonaByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the Persona (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Persona
   */
  @RequestLine("GET /v1/personas/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Persona getPersonaByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a Persona by name
  * Get a Persona by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getPersonaByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the Persona (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Persona
      */
      @RequestLine("GET /v1/personas/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Persona> getPersonaByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPersonaByFQN</code> method in a fluent style.
   */
  public static class GetPersonaByFQNQueryParams extends HashMap<String, Object> {
    public GetPersonaByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonaByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a persona by id
   * Get a persona by &#x60;id&#x60;.
   * @param id Id of the Persona (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return Persona
   */
  @RequestLine("GET /v1/personas/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  Persona getPersonaByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a persona by id
   * Similar to <code>getPersonaByID</code> but it also returns the http response headers .
   * Get a persona by &#x60;id&#x60;.
   * @param id Id of the Persona (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/personas/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Persona> getPersonaByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a persona by id
   * Get a persona by &#x60;id&#x60;.
   * Note, this is equivalent to the other <code>getPersonaByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPersonaByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the Persona (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return Persona
   */
  @RequestLine("GET /v1/personas/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  Persona getPersonaByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a persona by id
  * Get a persona by &#x60;id&#x60;.
  * Note, this is equivalent to the other <code>getPersonaByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the Persona (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return Persona
      */
      @RequestLine("GET /v1/personas/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Persona> getPersonaByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPersonaByID</code> method in a fluent style.
   */
  public static class GetPersonaByIDQueryParams extends HashMap<String, Object> {
    public GetPersonaByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetPersonaByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the Persona
   * Get a version of the Persona by given &#x60;id&#x60;
   * @param id Id of the Persona (required)
   * @param version Personas version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Persona
   */
  @RequestLine("GET /v1/personas/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Persona getSpecificPersonaVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the Persona
   * Similar to <code>getSpecificPersonaVersion</code> but it also returns the http response headers .
   * Get a version of the Persona by given &#x60;id&#x60;
   * @param id Id of the Persona (required)
   * @param version Personas version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/personas/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Persona> getSpecificPersonaVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * List Persona versions
   * Get a list of all the versions of a persona identified by &#x60;id&#x60;
   * @param id Id of the Persona (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/personas/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllPersonaVersion(@Param("id") UUID id);

  /**
   * List Persona versions
   * Similar to <code>listAllPersonaVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a persona identified by &#x60;id&#x60;
   * @param id Id of the Persona (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/personas/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllPersonaVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List personas
   * Get a list of personas. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number of personas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of personas before this cursor (optional)
   * @param after Returns list of personas after this cursor (optional)
   * @return PersonaList
   */
  @RequestLine("GET /v1/personas?fields={fields}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  PersonaList listPersonas(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);

  /**
   * List personas
   * Similar to <code>listPersonas</code> but it also returns the http response headers .
   * Get a list of personas. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit Limit the number of personas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of personas before this cursor (optional)
   * @param after Returns list of personas after this cursor (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/personas?fields={fields}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PersonaList> listPersonasWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);


  /**
   * List personas
   * Get a list of personas. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listPersonas</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPersonasQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit - Limit the number of personas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of personas before this cursor (optional)</li>
   *   <li>after - Returns list of personas after this cursor (optional)</li>
   *   </ul>
   * @return PersonaList
   */
  @RequestLine("GET /v1/personas?fields={fields}&limit={limit}&before={before}&after={after}")
  @Headers({
  "Accept: application/json",
  })
  PersonaList listPersonas(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List personas
  * Get a list of personas. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listPersonas</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit - Limit the number of personas returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of personas before this cursor (optional)</li>
          *   <li>after - Returns list of personas after this cursor (optional)</li>
      *   </ul>
          * @return PersonaList
      */
      @RequestLine("GET /v1/personas?fields={fields}&limit={limit}&before={before}&after={after}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PersonaList> listPersonasWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listPersonas</code> method in a fluent style.
   */
  public static class ListPersonasQueryParams extends HashMap<String, Object> {
    public ListPersonasQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListPersonasQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListPersonasQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListPersonasQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a Persona
   * Update an existing persona with JsonPatch.
   * @param id Id of the Persona (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a Persona Documentation</a>
   */
  @RequestLine("PATCH /v1/personas/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchPersona(@Param("id") UUID id, Object body);

  /**
   * Update a Persona
   * Similar to <code>patchPersona</code> but it also returns the http response headers .
   * Update an existing persona with JsonPatch.
   * @param id Id of the Persona (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a Persona Documentation</a>
   */
  @RequestLine("PATCH /v1/personas/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchPersonaWithHttpInfo(@Param("id") UUID id, Object body);


}
