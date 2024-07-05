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

package org.openmetadata.service.resources.knowledgecenter;

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
import org.openmetadata.schema.api.data.CreateKnowledgeCenter;
import org.openmetadata.schema.api.data.RestoreEntity;
import org.openmetadata.schema.entity.data.KnowledgeCenter;
import org.openmetadata.schema.type.ChangeEvent;
import org.openmetadata.schema.type.EntityHistory;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.MetadataOperation;
import org.openmetadata.schema.type.csv.CsvImportResult;
import org.openmetadata.service.Entity;
import org.openmetadata.service.jdbi3.KnowledgeCenterRepository;
import org.openmetadata.service.jdbi3.KnowledgeCenterRepository.KnowledgeCenterCsv;
import org.openmetadata.service.jdbi3.ListFilter;
import org.openmetadata.service.resources.Collection;
import org.openmetadata.service.resources.EntityResource;
import org.openmetadata.service.security.Authorizer;
import org.openmetadata.service.util.JsonUtils;
import org.openmetadata.service.util.ResultList;

@Path("/v1/agreementCenters")
@Tag(
    name = "KnowledgeCenters",
    description = "A `Knowledge Center` is collection of hierarchical `Knowledge Center documents`.")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Collection(
    name = "knowledgeCenters",
    order = 6) // Initialize before KnowledgeCenterDocument and after Classification and Tags
public class KnowledgeCenterResource extends EntityResource<KnowledgeCenter, KnowledgeCenterRepository> {
  public static final String COLLECTION_PATH = "v1/knowledgeCenters/";
  static final String FIELDS = "owner,tags,reviewers,usageCount,documentCount,domain,extension";

  public KnowledgeCenterResource(Authorizer authorizer) {
    super(Entity.KNOWLEDGE_CENTER, authorizer);
  }

  @Override
  protected List<MetadataOperation> getEntitySpecificOperations() {
    addViewOperation("reviewers,usageCount,documentCount", MetadataOperation.VIEW_BASIC);
    return null;
  }

  public static class KnowledgeCenterList extends ResultList<KnowledgeCenter> {
    /* Required for serde */
  }

  @GET
  @Valid
  @Operation(
      operationId = "listKnowledgeCenters",
      summary = "List knowledgecenters",
      description =
          "Get a list of knowledgecenters. Use `fields` parameter to get only necessary fields. "
              + " Use cursor-based pagination to limit the number "
              + "entries in the list using `limit` and `before` or `after` query params.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of knowledgecenters",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = KnowledgeCenterList.class)))
      })
  public ResultList<KnowledgeCenter> list(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(
              description = "Fields requested in the returned resource",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("fields")
          String fieldsParam,
      @Parameter(description = "Limit the number knowledgecenters returned. (1 to 1000000, " + "default = 10)")
          @DefaultValue("10")
          @Min(0)
          @Max(1000000)
          @QueryParam("limit")
          int limitParam,
      @Parameter(description = "Returns list of knowledgecenters before this cursor", schema = @Schema(type = "string"))
          @QueryParam("before")
          String before,
      @Parameter(description = "Returns list of knowledgecenters after this cursor", schema = @Schema(type = "string"))
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
      operationId = "getKnowledgeCenterByID",
      summary = "Get a knowledgeCenter by Id",
      description = "Get a knowledgeCenter by `Id`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The knowledgeCenter",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = KnowledgeCenter.class))),
        @ApiResponse(responseCode = "404", description = "KnowledgeCenter for instance {id} is not found")
      })
  public KnowledgeCenter get(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the knowledgeCenter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
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
      operationId = "getKnowledgeCenterByFQN",
      summary = "Get a knowledgeCenter by name",
      description = "Get a knowledgeCenter by name.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The knowledgeCenter",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = KnowledgeCenter.class))),
        @ApiResponse(responseCode = "404", description = "KnowledgeCenter for instance {name} is not found")
      })
  public KnowledgeCenter getByName(
      @Context UriInfo uriInfo,
      @Parameter(description = "Name of the knowledgeCenter", schema = @Schema(type = "string")) @PathParam("name")
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
      operationId = "listAllKnowledgeCenterVersion",
      summary = "List knowledgeCenter versions",
      description = "Get a list of all the versions of a knowledgeCenter identified by `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of knowledgeCenter versions",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityHistory.class)))
      })
  public EntityHistory listVersions(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the knowledgeCenter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return super.listVersionsInternal(securityContext, id);
  }

  @GET
  @Path("/{id}/versions/{version}")
  @Operation(
      operationId = "getSpecificKnowledgeCenterVersion",
      summary = "Get a version of the knowledgecenters",
      description = "Get a version of the knowledgeCenter by given `Id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "knowledgecenters",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = KnowledgeCenter.class))),
        @ApiResponse(
            responseCode = "404",
            description = "KnowledgeCenter for instance {id} and version {version} is " + "not found")
      })
  public KnowledgeCenter getVersion(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the knowledgeCenter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Parameter(
              description = "knowledgeCenter version number in the form `major`.`minor`",
              schema = @Schema(type = "string", example = "0.1 or 1.1"))
          @PathParam("version")
          String version) {
    return super.getVersionInternal(securityContext, id, version);
  }

  @POST
  @Operation(
      operationId = "createKnowledgeCenter",
      summary = "Create a knowledgeCenter",
      description = "Create a new knowledgeCenter.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The knowledgeCenter",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = KnowledgeCenter.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response create(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateKnowledgeCenter create) {
    KnowledgeCenter knowledgeCenter = getKnowledgeCenter(create, securityContext.getUserPrincipal().getName());
    return create(uriInfo, securityContext, knowledgeCenter);
  }

  @PATCH
  @Path("/{id}")
  @Operation(
      operationId = "patchKnowledgeCenter",
      summary = "Update a knowledgeCenter",
      description = "Update an existing knowledgeCenter using JsonPatch.",
      externalDocs = @ExternalDocumentation(description = "JsonPatch RFC", url = "https://tools.ietf.org/html/rfc6902"))
  @Consumes(MediaType.APPLICATION_JSON_PATCH_JSON)
  public Response patch(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the knowledgeCenter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
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
      operationId = "createOrUpdateKnowledgeCenter",
      summary = "Create or update a knowledgeCenter",
      description = "Create a new knowledgeCenter, if it does not exist or update an existing knowledgeCenter.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The knowledgeCenter",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = KnowledgeCenter.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response createOrUpdate(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateKnowledgeCenter create) {
    KnowledgeCenter knowledgeCenter = getKnowledgeCenter(create, securityContext.getUserPrincipal().getName());
    return createOrUpdate(uriInfo, securityContext, knowledgeCenter);
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
      operationId = "deleteKnowledgeCenter",
      summary = "Delete a knowledgeCenter by Id",
      description = "Delete a knowledgeCenter by `Id`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "knowledgeCenter for instance {id} is not found")
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
      @Parameter(description = "Id of the knowledgeCenter", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return delete(uriInfo, securityContext, id, recursive, hardDelete);
  }

  @DELETE
  @Path("/name/{name}")
  @Operation(
      operationId = "deleteKnowledgeCenterByName",
      summary = "Delete a knowledgeCenter by name",
      description = "Delete a knowledgeCenter by `name`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "knowledgeCenter for instance {name} is not found")
      })
  public Response delete(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Hard delete the entity. (Default = `false`)")
          @QueryParam("hardDelete")
          @DefaultValue("false")
          boolean hardDelete,
      @Parameter(description = "Name of the knowledgeCenter", schema = @Schema(type = "string")) @PathParam("name")
          String name) {
    return deleteByName(uriInfo, securityContext, name, false, hardDelete);
  }

  @PUT
  @Path("/restore")
  @Operation(
      operationId = "restore",
      summary = "Restore a soft deleted knowledgeCenter",
      description = "Restore a soft deleted KnowledgeCenter.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Successfully restored the KnowledgeCenter ",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = KnowledgeCenter.class)))
      })
  public Response restoreKnowledgeCenter(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid RestoreEntity restore) {
    return restoreEntity(uriInfo, securityContext, restore.getId());
  }

  @GET
  @Path("/documentation/csv")
  @Valid
  @Operation(operationId = "getCsvDocumentation", summary = "Get CSV documentation")
  public String getCsvDocumentation(
      @Context SecurityContext securityContext,
      @Parameter(description = "Name of the knowledgeCenter", schema = @Schema(type = "string")) @PathParam("name")
          String name) {
    return JsonUtils.pojoToJson(KnowledgeCenterCsv.DOCUMENTATION);
  }

  @GET
  @Path("/name/{name}/export")
  @Produces(MediaType.TEXT_PLAIN)
  @Valid
  @Operation(
      operationId = "exportKnowledgeCenter",
      summary = "Export knowledgeCenter in CSV format",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Exported csv with knowledgeCenter documents",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)))
      })
  public String exportCsv(
      @Context SecurityContext securityContext,
      @Parameter(description = "Name of the knowledgeCenter", schema = @Schema(type = "string")) @PathParam("name")
          String name)
      throws IOException {
    return exportCsvInternal(securityContext, name);
  }

  @PUT
  @Path("/name/{name}/import")
  @Consumes(MediaType.TEXT_PLAIN)
  @Valid
  @Operation(
      operationId = "importKnowledgeCenter",
      summary = "Import knowledgeCenter documents from CSV to create, and update knowledgeCenter documents",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Import result",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = CsvImportResult.class)))
      })
  public CsvImportResult importCsv(
      @Context SecurityContext securityContext,
      @Parameter(description = "Name of the knowledgeCenter", schema = @Schema(type = "string")) @PathParam("name")
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

  private KnowledgeCenter getKnowledgeCenter(CreateKnowledgeCenter create, String user) {
    return getKnowledgeCenter(repository, create, user);
  }

  public static KnowledgeCenter getKnowledgeCenter(
      KnowledgeCenterRepository repository, CreateKnowledgeCenter create, String updatedBy) {
    return repository
        .copy(new KnowledgeCenter(), create, updatedBy)
        .withReviewers(getEntityReferences(Entity.USER, create.getReviewers()))
        .withTags(create.getTags())
        .withProvider(create.getProvider())
        .withMutuallyExclusive(create.getMutuallyExclusive());
  }
}
