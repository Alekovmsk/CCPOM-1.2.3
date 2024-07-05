package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.AddLineage;
import org.openmetadata.client.model.EntityLineage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface LineageApi extends ApiClient.Api {


  /**
   * Add a lineage edge
   * Add a lineage edge with from entity as upstream node and to entity as downstream node.
   * @param addLineage  (optional)
   */
  @RequestLine("PUT /v1/lineage")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void addLineageEdge(AddLineage addLineage);

  /**
   * Add a lineage edge
   * Similar to <code>addLineageEdge</code> but it also returns the http response headers .
   * Add a lineage edge with from entity as upstream node and to entity as downstream node.
   * @param addLineage  (optional)
   */
  @RequestLine("PUT /v1/lineage")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> addLineageEdgeWithHttpInfo(AddLineage addLineage);



  /**
   * Delete a lineage edge
   * Delete a lineage edge with from entity as upstream node and to entity as downstream node.
   * @param fromEntity Entity type of upstream entity of the edge (required)
   * @param fromId Entity id (required)
   * @param toEntity Entity type for downstream entity of the edge (required)
   * @param toId Entity id (required)
   */
  @RequestLine("DELETE /v1/lineage/{fromEntity}/{fromId}/{toEntity}/{toId}")
  @Headers({
    "Accept: application/json",
  })
  void deleteLineageEdge(@Param("fromEntity") String fromEntity, @Param("fromId") String fromId, @Param("toEntity") String toEntity, @Param("toId") String toId);

  /**
   * Delete a lineage edge
   * Similar to <code>deleteLineageEdge</code> but it also returns the http response headers .
   * Delete a lineage edge with from entity as upstream node and to entity as downstream node.
   * @param fromEntity Entity type of upstream entity of the edge (required)
   * @param fromId Entity id (required)
   * @param toEntity Entity type for downstream entity of the edge (required)
   * @param toId Entity id (required)
   */
  @RequestLine("DELETE /v1/lineage/{fromEntity}/{fromId}/{toEntity}/{toId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteLineageEdgeWithHttpInfo(@Param("fromEntity") String fromEntity, @Param("fromId") String fromId, @Param("toEntity") String toEntity, @Param("toId") String toId);



  /**
   * Get lineage by Id
   * Get lineage details for an entity identified by &#x60;Id&#x60;.
   * @param entity Entity type for which lineage is requested (required)
   * @param id Id of the entity (required)
   * @param upstreamDepth Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)
   * @param downstreamDepth Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)
   * @return EntityLineage
   */
  @RequestLine("GET /v1/lineage/{entity}/{id}?upstreamDepth={upstreamDepth}&downstreamDepth={downstreamDepth}")
  @Headers({
    "Accept: application/json",
  })
  EntityLineage getLineage(@Param("entity") String entity, @Param("id") String id, @Param("upstreamDepth") Integer upstreamDepth, @Param("downstreamDepth") Integer downstreamDepth);

  /**
   * Get lineage by Id
   * Similar to <code>getLineage</code> but it also returns the http response headers .
   * Get lineage details for an entity identified by &#x60;Id&#x60;.
   * @param entity Entity type for which lineage is requested (required)
   * @param id Id of the entity (required)
   * @param upstreamDepth Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)
   * @param downstreamDepth Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/lineage/{entity}/{id}?upstreamDepth={upstreamDepth}&downstreamDepth={downstreamDepth}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityLineage> getLineageWithHttpInfo(@Param("entity") String entity, @Param("id") String id, @Param("upstreamDepth") Integer upstreamDepth, @Param("downstreamDepth") Integer downstreamDepth);


  /**
   * Get lineage by Id
   * Get lineage details for an entity identified by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getLineage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetLineageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param entity Entity type for which lineage is requested (required)
   * @param id Id of the entity (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>upstreamDepth - Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)</li>
   *   <li>downstreamDepth - Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)</li>
   *   </ul>
   * @return EntityLineage
   */
  @RequestLine("GET /v1/lineage/{entity}/{id}?upstreamDepth={upstreamDepth}&downstreamDepth={downstreamDepth}")
  @Headers({
  "Accept: application/json",
  })
  EntityLineage getLineage(@Param("entity") String entity, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get lineage by Id
  * Get lineage details for an entity identified by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getLineage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param entity Entity type for which lineage is requested (required)
              * @param id Id of the entity (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>upstreamDepth - Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)</li>
          *   <li>downstreamDepth - Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)</li>
      *   </ul>
          * @return EntityLineage
      */
      @RequestLine("GET /v1/lineage/{entity}/{id}?upstreamDepth={upstreamDepth}&downstreamDepth={downstreamDepth}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<EntityLineage> getLineageWithHttpInfo(@Param("entity") String entity, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getLineage</code> method in a fluent style.
   */
  public static class GetLineageQueryParams extends HashMap<String, Object> {
    public GetLineageQueryParams upstreamDepth(final Integer value) {
      put("upstreamDepth", EncodingUtils.encode(value));
      return this;
    }
    public GetLineageQueryParams downstreamDepth(final Integer value) {
      put("downstreamDepth", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get lineage by fully qualified name
   * Get lineage details for an entity identified by fully qualified name.
   * @param entity Entity type for which lineage is requested (required)
   * @param fqn Fully qualified name of the entity that uniquely identifies an entity (required)
   * @param upstreamDepth Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)
   * @param downstreamDepth Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)
   * @return EntityLineage
   */
  @RequestLine("GET /v1/lineage/{entity}/name/{fqn}?upstreamDepth={upstreamDepth}&downstreamDepth={downstreamDepth}")
  @Headers({
    "Accept: application/json",
  })
  EntityLineage getLineageByFQN(@Param("entity") String entity, @Param("fqn") String fqn, @Param("upstreamDepth") Integer upstreamDepth, @Param("downstreamDepth") Integer downstreamDepth);

  /**
   * Get lineage by fully qualified name
   * Similar to <code>getLineageByFQN</code> but it also returns the http response headers .
   * Get lineage details for an entity identified by fully qualified name.
   * @param entity Entity type for which lineage is requested (required)
   * @param fqn Fully qualified name of the entity that uniquely identifies an entity (required)
   * @param upstreamDepth Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)
   * @param downstreamDepth Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/lineage/{entity}/name/{fqn}?upstreamDepth={upstreamDepth}&downstreamDepth={downstreamDepth}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityLineage> getLineageByFQNWithHttpInfo(@Param("entity") String entity, @Param("fqn") String fqn, @Param("upstreamDepth") Integer upstreamDepth, @Param("downstreamDepth") Integer downstreamDepth);


  /**
   * Get lineage by fully qualified name
   * Get lineage details for an entity identified by fully qualified name.
   * Note, this is equivalent to the other <code>getLineageByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetLineageByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param entity Entity type for which lineage is requested (required)
   * @param fqn Fully qualified name of the entity that uniquely identifies an entity (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>upstreamDepth - Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)</li>
   *   <li>downstreamDepth - Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)</li>
   *   </ul>
   * @return EntityLineage
   */
  @RequestLine("GET /v1/lineage/{entity}/name/{fqn}?upstreamDepth={upstreamDepth}&downstreamDepth={downstreamDepth}")
  @Headers({
  "Accept: application/json",
  })
  EntityLineage getLineageByFQN(@Param("entity") String entity, @Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get lineage by fully qualified name
  * Get lineage details for an entity identified by fully qualified name.
  * Note, this is equivalent to the other <code>getLineageByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param entity Entity type for which lineage is requested (required)
              * @param fqn Fully qualified name of the entity that uniquely identifies an entity (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>upstreamDepth - Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)</li>
          *   <li>downstreamDepth - Upstream depth of lineage (default&#x3D;1, min&#x3D;0, max&#x3D;3) (optional, default to 1)</li>
      *   </ul>
          * @return EntityLineage
      */
      @RequestLine("GET /v1/lineage/{entity}/name/{fqn}?upstreamDepth={upstreamDepth}&downstreamDepth={downstreamDepth}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<EntityLineage> getLineageByFQNWithHttpInfo(@Param("entity") String entity, @Param("fqn") String fqn, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getLineageByFQN</code> method in a fluent style.
   */
  public static class GetLineageByFQNQueryParams extends HashMap<String, Object> {
    public GetLineageByFQNQueryParams upstreamDepth(final Integer value) {
      put("upstreamDepth", EncodingUtils.encode(value));
      return this;
    }
    public GetLineageByFQNQueryParams downstreamDepth(final Integer value) {
      put("downstreamDepth", EncodingUtils.encode(value));
      return this;
    }
  }
}
