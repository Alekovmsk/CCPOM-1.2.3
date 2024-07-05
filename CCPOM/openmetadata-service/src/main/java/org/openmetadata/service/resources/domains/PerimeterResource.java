/*
 *  Copyright 2021 Collate
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.openmetadata.service.resources.domains;

import static org.openmetadata.common.utils.CommonUtil.nullOrEmpty;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import java.util.UUID;
import javax.json.JsonPatch;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import lombok.extern.slf4j.Slf4j;
import org.openmetadata.schema.api.domains.CreatePerimeter;
import org.openmetadata.schema.entity.domains.Perimeter;
import org.openmetadata.schema.type.EntityHistory;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.Include;
import org.openmetadata.service.Entity;
import org.openmetadata.service.jdbi3.ListFilter;
import org.openmetadata.service.jdbi3.PerimeterRepository;
import org.openmetadata.service.resources.Collection;
import org.openmetadata.service.resources.EntityResource;
import org.openmetadata.service.security.Authorizer;
import org.openmetadata.service.util.EntityUtil;
import org.openmetadata.service.util.ResultList;

@Slf4j
@Path("/v1/perimeters")
@Tag(
    name = "Domains",
    description =
        "A `Perimeter` is a logical unit that contains information about data domain, attributes and entities")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Collection(name = "perimeters", order = 4) // initialize after user resource
public class PerimeterResource extends EntityResource<Perimeter, PerimeterRepository> {
  public static final String COLLECTION_PATH = "/v1/perimeters/";
  static final String FIELDS = "domain,owner,experts";

  public PerimeterResource(Authorizer authorizer) {
    super(Entity.PERIMETER, authorizer);
  }

  @Override
  public Perimeter addHref(UriInfo uriInfo, Perimeter perimeter) {
    super.addHref(uriInfo, perimeter);
    return perimeter;
  }

  public static class PerimeterList extends ResultList<Perimeter> {
    @SuppressWarnings("unused")
    public PerimeterList() {
      /* Required for serde */
    }
  }

  @GET
  @Operation(
      operationId = "listPerimeters",
      summary = "List perimeters",
      description = "Get a list of Perimeters.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of Perimeters",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = PerimeterList.class)))
      })
  public ResultList<Perimeter> list(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(
              description = "Fields requested in the returned resource",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("fields")
          String fieldsParam,
      @Parameter(
              description = "Filter perimeters by domain name",
              schema = @Schema(type = "string", example = "marketing"))
          @QueryParam("domain")
          String domain,
      @DefaultValue("10") @Min(0) @Max(1000000) @QueryParam("limit") int limitParam,
      @Parameter(description = "Returns list of Perimeter before this cursor", schema = @Schema(type = "string"))
          @QueryParam("before")
          String before,
      @Parameter(description = "Returns list of Perimeter after this cursor", schema = @Schema(type = "string"))
          @QueryParam("after")
          String after) {
    ListFilter filter = new ListFilter(null);
    if (!nullOrEmpty(domain)) {
      EntityReference domainReference = Entity.getEntityReferenceByName(Entity.DOMAIN, domain, Include.NON_DELETED);
      filter.addQueryParam("domainId", domainReference.getId().toString());
    }
    return listInternal(uriInfo, securityContext, fieldsParam, filter, limitParam, before, after);
  }

  @GET
  @Path("/{id}")
  @Operation(
      operationId = "getPerimeterByID",
      summary = "Get a perimeter by Id",
      description = "Get a perimeter by `Id`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The perimeter",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Perimeter.class))),
        @ApiResponse(responseCode = "404", description = "Perimeter for instance {id} is not found")
      })
  public Perimeter get(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(
              description = "Fields requested in the returned resource",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("fields")
          String fieldsParam,
      @Parameter(description = "Id of the perimeter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return getInternal(uriInfo, securityContext, id, fieldsParam, null);
  }

  @GET
  @Path("/name/{name}")
  @Operation(
      operationId = "getPerimeterByFQN",
      summary = "Get a perimeter by name",
      description = "Get a perimeter by `name`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "perimeter",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Perimeter.class))),
        @ApiResponse(responseCode = "404", description = "Perimeter for instance {name} is not found")
      })
  public Perimeter getByName(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Name of the perimeter", schema = @Schema(type = "string")) @PathParam("name")
          String name,
      @Parameter(
              description = "Fields requested in the returned resource",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("fields")
          String fieldsParam) {
    return getByNameInternal(uriInfo, securityContext, name, fieldsParam, null);
  }

  @GET
  @Path("/{id}/versions")
  @Operation(
      operationId = "listAllPerimeterVersion",
      summary = "List perimeter versions",
      description = "Get a list of all the versions of a perimeter identified by `Id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of perimeter versions",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityHistory.class)))
      })
  public EntityHistory listVersions(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the perimeter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return super.listVersionsInternal(securityContext, id);
  }

  @GET
  @Path("/{id}/versions/{version}")
  @Operation(
      operationId = "listSpecificPerimeterVersion",
      summary = "Get a version of the perimeter",
      description = "Get a version of the perimeter by given `Id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "perimeter",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Perimeter.class))),
        @ApiResponse(
            responseCode = "404",
            description = "Perimeter for instance {id} and version {version} is " + "not found")
      })
  public Perimeter getVersion(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the perimeter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Parameter(
              description = "Perimeter version number in the form `major`.`minor`",
              schema = @Schema(type = "string", example = "0.1 or 1.1"))
          @PathParam("version")
          String version) {
    return super.getVersionInternal(securityContext, id, version);
  }

  @POST
  @Operation(
      operationId = "createPerimeter",
      summary = "Create a perimeter",
      description = "Create a new perimeter.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The perimeter ",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Perimeter.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response create(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreatePerimeter create) {
    Perimeter perimeter = getPerimeter(create, securityContext.getUserPrincipal().getName());
    return create(uriInfo, securityContext, perimeter);
  }

  @PUT
  @Operation(
      operationId = "createOrUpdatePerimeter",
      summary = "Create or update a perimeter",
      description =
          "Create a perimeter. if it does not exist. If a perimeter already exists, update the " + "perimeter.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The perimeter",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Perimeter.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response createOrUpdate(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreatePerimeter create) {
    Perimeter perimeter = getPerimeter(create, securityContext.getUserPrincipal().getName());
    return createOrUpdate(uriInfo, securityContext, perimeter);
  }

  // @PUT
  // @Path("/{name}/assets/add")
  // @Operation(
  //     operationId = "bulkAddAssets",
  //     summary = "Bulk Add Assets",
  //     description = "Bulk Add Assets",
  //     responses = {
  //       @ApiResponse(
  //           responseCode = "200",
  //           description = "OK",
  //           content =
  //               @Content(mediaType = "application/json", schema = @Schema(implementation =
  // BulkOperationResult.class))),
  //       @ApiResponse(responseCode = "404", description = "model for instance {id} is not found")
  //     })
  // public Response bulkAddAssets(
  //     @Context UriInfo uriInfo,
  //     @Context SecurityContext securityContext,
  //     @Parameter(description = "Name of the Perimeter", schema = @Schema(type = "string")) @PathParam("name")
  //         String name,
  //     @Valid BulkAssets request) {
  //   return Response.ok().entity(repository.bulkAddAssets(name, request)).build();
  // }

  // @PUT
  // @Path("/{name}/assets/remove")
  // @Operation(
  //     operationId = "bulkRemoveAssets",
  //     summary = "Bulk Remove Assets",
  //     description = "Bulk Remove Assets",
  //     responses = {
  //       @ApiResponse(
  //           responseCode = "200",
  //           description = "OK",
  //           content = @Content(mediaType = "application/json", schema = @Schema(implementation =
  // ChangeEvent.class))),
  //       @ApiResponse(responseCode = "404", description = "model for instance {id} is not found")
  //     })
  // public Response bulkRemoveGlossaryFromAssets(
  //     @Context UriInfo uriInfo,
  //     @Context SecurityContext securityContext,
  //     @Parameter(description = "Name of the Perimeter", schema = @Schema(type = "string")) @PathParam("name")
  //         String name,
  //     @Valid BulkAssets request) {
  //   return Response.ok().entity(repository.bulkRemoveAssets(name, request)).build();
  // }

  @PATCH
  @Path("/{id}")
  @Operation(
      operationId = "patchPerimeter",
      summary = "Update a perimeter",
      description = "Update an existing perimeter using JsonPatch.",
      externalDocs = @ExternalDocumentation(description = "JsonPatch RFC", url = "https://tools.ietf.org/html/rfc6902"))
  @Consumes(MediaType.APPLICATION_JSON_PATCH_JSON)
  public Response patch(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the perimeter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @RequestBody(
              description = "JsonPatch with array of operations",
              content =
                  @Content(
                      mediaType = MediaType.APPLICATION_JSON_PATCH_JSON,
                      examples = {
                        @ExampleObject("[" + "{op:remove, path:/a}," + "{op:add, path: /b, value: val}" + "]")
                      }))
          JsonPatch patch) {
    return patchInternal(uriInfo, securityContext, id, patch);
  }

  @DELETE
  @Path("/{id}")
  @Operation(
      operationId = "deletePerimeter",
      summary = "Delete a perimeter by Id",
      description = "Delete a perimeter by `Id`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "Perimeter for instance {id} is not found")
      })
  public Response delete(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the perimeter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return delete(uriInfo, securityContext, id, true, true);
  }

  @DELETE
  @Path("/name/{name}")
  @Operation(
      operationId = "deletePerimeterByFQN",
      summary = "Delete a perimeter by name",
      description = "Delete a perimeter by `name`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "Perimeter for instance {name} is not found")
      })
  public Response delete(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Name of the perimeter", schema = @Schema(type = "string")) @PathParam("name")
          String name) {
    return deleteByName(uriInfo, securityContext, name, true, true);
  }

  private Perimeter getPerimeter(CreatePerimeter create, String user) {
    List<String> experts = create.getExperts();
    Perimeter perimeter =
        repository
            .copy(new Perimeter(), create, user)
            .withFullyQualifiedName(create.getName())
            .withStyle(create.getStyle())
            .withExperts(EntityUtil.populateEntityReferences(getEntityReferences(Entity.USER, experts)))
            .withEntityList(create.getEntityList());
    // perimeter.withAssets(new ArrayList<>());
    // for (EntityReference asset : listOrEmpty(create.getAssets())) {
    //   asset = Entity.getEntityReference(asset, Include.NON_DELETED);
    //   perimeter.getAssets().add(asset);
    // }
    return perimeter;
  }
}
