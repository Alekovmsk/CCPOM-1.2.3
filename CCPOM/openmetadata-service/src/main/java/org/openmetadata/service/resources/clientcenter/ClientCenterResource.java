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

package org.openmetadata.service.resources.clientcenter;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.io.IOException;
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
import org.openmetadata.schema.api.VoteRequest;
import org.openmetadata.schema.api.data.CreateClientCenter;
import org.openmetadata.schema.api.data.RestoreEntity;
import org.openmetadata.schema.entity.data.ClientCenter;
import org.openmetadata.schema.type.ChangeEvent;
import org.openmetadata.schema.type.EntityHistory;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.MetadataOperation;
import org.openmetadata.schema.type.csv.CsvImportResult;
import org.openmetadata.service.Entity;
import org.openmetadata.service.jdbi3.ClientCenterRepository;
import org.openmetadata.service.jdbi3.ClientCenterRepository.ClientCenterCsv;
import org.openmetadata.service.jdbi3.ListFilter;
import org.openmetadata.service.resources.Collection;
import org.openmetadata.service.resources.EntityResource;
import org.openmetadata.service.security.Authorizer;
import org.openmetadata.service.util.JsonUtils;
import org.openmetadata.service.util.ResultList;

@Path("/v1/clientCenters")
@Tag(name = "ClientCenters", description = "A `client Center` is collection of hierarchical `client Center clients`.")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Collection(name = "clientCenters", order = 6) // Initialize before ClientCenterClient and after Classification and Tags
public class ClientCenterResource extends EntityResource<ClientCenter, ClientCenterRepository> {
  public static final String COLLECTION_PATH = "v1/clientCenters/";
  static final String FIELDS = "owner,tags,reviewers,usageCount,clientCount,domain,extension";

  public ClientCenterResource(Authorizer authorizer) {
    super(Entity.CLIENT_CENTER, authorizer);
  }

  @Override
  protected List<MetadataOperation> getEntitySpecificOperations() {
    addViewOperation("reviewers,usageCount,clientCount", MetadataOperation.VIEW_BASIC);
    return null;
  }

  public static class ClientCenterList extends ResultList<ClientCenter> {
    /* Required for serde */
  }

  @GET
  @Valid
  @Operation(
      operationId = "listClientCenters",
      summary = "List clientcenters",
      description =
          "Get a list of clientcenters. Use `fields` parameter to get only necessary fields. "
              + " Use cursor-based pagination to limit the number "
              + "entries in the list using `limit` and `before` or `after` query params.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of clientcenters",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenterList.class)))
      })
  public ResultList<ClientCenter> list(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(
              description = "Fields requested in the returned resource",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("fields")
          String fieldsParam,
      @Parameter(description = "Limit the number clientcenters returned. (1 to 1000000, " + "default = 10)")
          @DefaultValue("10")
          @Min(0)
          @Max(1000000)
          @QueryParam("limit")
          int limitParam,
      @Parameter(description = "Returns list of clientcenters before this cursor", schema = @Schema(type = "string"))
          @QueryParam("before")
          String before,
      @Parameter(description = "Returns list of clientcenters after this cursor", schema = @Schema(type = "string"))
          @QueryParam("after")
          String after,
      @Parameter(
              description = "Include all, deleted, or non-deleted entities.",
              schema = @Schema(implementation = Include.class))
          @QueryParam("include")
          @DefaultValue("non-deleted")
          Include include) {
    ListFilter filter = new ListFilter(include);
    return super.listInternal(uriInfo, securityContext, fieldsParam, filter, limitParam, before, after);
  }

  @GET
  @Path("/{id}")
  @Operation(
      operationId = "getClientCenterByID",
      summary = "Get a clientCenter by Id",
      description = "Get a clientCenter by `Id`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The clientCenter",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenter.class))),
        @ApiResponse(responseCode = "404", description = "ClientCenter for instance {id} is not found")
      })
  public ClientCenter get(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the clientCenter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Parameter(
              description = "Fields requested in the returned resource",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("fields")
          String fieldsParam,
      @Parameter(
              description = "Include all, deleted, or non-deleted entities.",
              schema = @Schema(implementation = Include.class))
          @QueryParam("include")
          @DefaultValue("non-deleted")
          Include include) {
    return getInternal(uriInfo, securityContext, id, fieldsParam, include);
  }

  @GET
  @Path("/name/{name}")
  @Operation(
      operationId = "getClientCenterByFQN",
      summary = "Get a clientCenter by name",
      description = "Get a clientCenter by name.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The clientCenter",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenter.class))),
        @ApiResponse(responseCode = "404", description = "ClientCenter for instance {name} is not found")
      })
  public ClientCenter getByName(
      @Context UriInfo uriInfo,
      @Parameter(description = "Name of the clientCenter", schema = @Schema(type = "string")) @PathParam("name")
          String name,
      @Context SecurityContext securityContext,
      @Parameter(
              description = "Fields requested in the returned resource",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("fields")
          String fieldsParam,
      @Parameter(
              description = "Include all, deleted, or non-deleted entities.",
              schema = @Schema(implementation = Include.class))
          @QueryParam("include")
          @DefaultValue("non-deleted")
          Include include) {
    return getByNameInternal(uriInfo, securityContext, name, fieldsParam, include);
  }

  @GET
  @Path("/{id}/versions")
  @Operation(
      operationId = "listAllClientCenterVersion",
      summary = "List clientCenter versions",
      description = "Get a list of all the versions of a clientCenter identified by `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of clientCenter versions",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityHistory.class)))
      })
  public EntityHistory listVersions(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the clientCenter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return super.listVersionsInternal(securityContext, id);
  }

  @GET
  @Path("/{id}/versions/{version}")
  @Operation(
      operationId = "getSpecificClientCenterVersion",
      summary = "Get a version of the clientcenters",
      description = "Get a version of the clientCenter by given `Id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "clientcenters",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenter.class))),
        @ApiResponse(
            responseCode = "404",
            description = "ClientCenter for instance {id} and version {version} is " + "not found")
      })
  public ClientCenter getVersion(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the clientCenter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Parameter(
              description = "clientCenter version number in the form `major`.`minor`",
              schema = @Schema(type = "string", example = "0.1 or 1.1"))
          @PathParam("version")
          String version) {
    return super.getVersionInternal(securityContext, id, version);
  }

  @POST
  @Operation(
      operationId = "createClientCenter",
      summary = "Create a clientCenter",
      description = "Create a new clientCenter.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The clientCenter",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenter.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response create(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateClientCenter create) {
    ClientCenter clientCenter = getClientCenter(create, securityContext.getUserPrincipal().getName());
    return create(uriInfo, securityContext, clientCenter);
  }

  @PATCH
  @Path("/{id}")
  @Operation(
      operationId = "patchClientCenter",
      summary = "Update a clientCenter",
      description = "Update an existing clientCenter using JsonPatch.",
      externalDocs = @ExternalDocumentation(description = "JsonPatch RFC", url = "https://tools.ietf.org/html/rfc6902"))
  @Consumes(MediaType.APPLICATION_JSON_PATCH_JSON)
  public Response patch(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the clientCenter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
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

  @PUT
  @Operation(
      operationId = "createOrUpdateClientCenter",
      summary = "Create or update a clientCenter",
      description = "Create a new clientCenter, if it does not exist or update an existing clientCenter.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The clientCenter",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenter.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response createOrUpdate(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateClientCenter create) {
    ClientCenter clientCenter = getClientCenter(create, securityContext.getUserPrincipal().getName());
    return createOrUpdate(uriInfo, securityContext, clientCenter);
  }

  @PUT
  @Path("/{id}/vote")
  @Operation(
      operationId = "updateVoteForEntity",
      summary = "Update Vote for a Entity",
      description = "Update vote for a Entity",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChangeEvent.class))),
        @ApiResponse(responseCode = "404", description = "model for instance {id} is not found")
      })
  public Response updateVote(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the Entity", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Valid VoteRequest request) {
    return repository.updateVote(securityContext.getUserPrincipal().getName(), id, request).toResponse();
  }

  @DELETE
  @Path("/{id}")
  @Operation(
      operationId = "deleteClientCenter",
      summary = "Delete a clientCenter by Id",
      description = "Delete a clientCenter by `Id`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "clientCenter for instance {id} is not found")
      })
  public Response delete(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Recursively delete this entity and it's children. (Default `false`)")
          @DefaultValue("false")
          @QueryParam("recursive")
          boolean recursive,
      @Parameter(description = "Hard delete the entity. (Default = `false`)")
          @QueryParam("hardDelete")
          @DefaultValue("false")
          boolean hardDelete,
      @Parameter(description = "Id of the clientCenter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return delete(uriInfo, securityContext, id, recursive, hardDelete);
  }

  @DELETE
  @Path("/name/{name}")
  @Operation(
      operationId = "deleteClientCenterByName",
      summary = "Delete a clientCenter by name",
      description = "Delete a clientCenter by `name`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "clientCenter for instance {name} is not found")
      })
  public Response delete(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Hard delete the entity. (Default = `false`)")
          @QueryParam("hardDelete")
          @DefaultValue("false")
          boolean hardDelete,
      @Parameter(description = "Name of the clientCenter", schema = @Schema(type = "string")) @PathParam("name")
          String name) {
    return deleteByName(uriInfo, securityContext, name, false, hardDelete);
  }

  @PUT
  @Path("/restore")
  @Operation(
      operationId = "restore",
      summary = "Restore a soft deleted clientCenter",
      description = "Restore a soft deleted ClientCenter.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Successfully restored the ClientCenter ",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenter.class)))
      })
  public Response restoreClientCenter(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid RestoreEntity restore) {
    return restoreEntity(uriInfo, securityContext, restore.getId());
  }

  @GET
  @Path("/documentation/csv")
  @Valid
  @Operation(operationId = "getCsvDocumentation", summary = "Get CSV documentation")
  public String getCsvDocumentation(
      @Context SecurityContext securityContext,
      @Parameter(description = "Name of the clientCenter", schema = @Schema(type = "string")) @PathParam("name")
          String name) {
    return JsonUtils.pojoToJson(ClientCenterCsv.DOCUMENTATION);
  }

  @GET
  @Path("/name/{name}/export")
  @Produces(MediaType.TEXT_PLAIN)
  @Valid
  @Operation(
      operationId = "exportClientCenter",
      summary = "Export clientCenter in CSV format",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Exported csv with clientCenter clients",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)))
      })
  public String exportCsv(
      @Context SecurityContext securityContext,
      @Parameter(description = "Name of the clientCenter", schema = @Schema(type = "string")) @PathParam("name")
          String name)
      throws IOException {
    return exportCsvInternal(securityContext, name);
  }

  @PUT
  @Path("/name/{name}/import")
  @Consumes(MediaType.TEXT_PLAIN)
  @Valid
  @Operation(
      operationId = "importClientCenter",
      summary = "Import clientCenter clients from CSV to create, and update clientCenter clients",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Import result",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = CsvImportResult.class)))
      })
  public CsvImportResult importCsv(
      @Context SecurityContext securityContext,
      @Parameter(description = "Name of the clientCenter", schema = @Schema(type = "string")) @PathParam("name")
          String name,
      @Parameter(
              description =
                  "Dry-run when true is used for validating the CSV without really importing it. (default=true)",
              schema = @Schema(type = "boolean"))
          @DefaultValue("true")
          @QueryParam("dryRun")
          boolean dryRun,
      String csv)
      throws IOException {
    return importCsvInternal(securityContext, name, csv, dryRun);
  }

  private ClientCenter getClientCenter(CreateClientCenter create, String user) {
    return getClientCenter(repository, create, user);
  }

  public static ClientCenter getClientCenter(
      ClientCenterRepository repository, CreateClientCenter create, String updatedBy) {
    return repository
        .copy(new ClientCenter(), create, updatedBy)
        .withReviewers(getEntityReferences(Entity.USER, create.getReviewers()))
        .withTags(create.getTags())
        .withProvider(create.getProvider())
        .withMutuallyExclusive(create.getMutuallyExclusive());
  }
}
