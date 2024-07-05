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

package org.openmetadata.service.resources.autoSystems;

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
import org.openmetadata.schema.api.autoSystemClassification.CreateAutoSystemClassification;
import org.openmetadata.schema.api.data.RestoreEntity;
import org.openmetadata.schema.entity.autoSystemClassification.AutoSystemClassification;
import org.openmetadata.schema.entity.data.Table;
import org.openmetadata.schema.type.EntityHistory;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.MetadataOperation;
import org.openmetadata.service.Entity;
import org.openmetadata.service.jdbi3.AutoSystemClassificationRepository;
import org.openmetadata.service.jdbi3.ListFilter;
import org.openmetadata.service.resources.Collection;
import org.openmetadata.service.resources.EntityResource;
import org.openmetadata.service.security.Authorizer;
import org.openmetadata.service.util.ResultList;

@Slf4j
@Path("/v1/autoSystemClassifications")
@Tag(
    name = "AutoSystemClassifications",
    description =
        "These APIs are related to `Classification` and `Tags`. A `Classification` "
            + "entity "
            + "contains hierarchical"
            + " terms called `Tags` used "
            + "for categorizing and classifying data assets and other entities.")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Collection(
    name = "autoSystemClassifications",
    order = 8) // Initialize after TagResource, Glossary, and GlossaryTerms, before autoSystem
public class AutoSystemClassificationResource
    extends EntityResource<AutoSystemClassification, AutoSystemClassificationRepository> {
  public static final String TAG_COLLECTION_PATH = "/v1/autoSystemClassifications/";
  static final String FIELDS = "usageCount,termCount";

  static class AutoSystemClassificationList extends ResultList<AutoSystemClassification> {
    /* Required for serde */
  }

  public AutoSystemClassificationResource(Authorizer authorizer) {
    super(Entity.AUTOSYSTEMCLASSIFICATION, authorizer);
  }

  @Override
  protected List<MetadataOperation> getEntitySpecificOperations() {
    addViewOperation("usageCount,termCount", MetadataOperation.VIEW_BASIC);
    return null;
  }

  @GET
  @Operation(
      operationId = "listAutoSystemClassifications",
      summary = "List autoSystem classifications",
      description = "Get a list of autoSystem classifications.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The user ",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = AutoSystemClassificationList.class)))
      })
  public ResultList<AutoSystemClassification> list(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(
              description = "Fields requested in the returned resource",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("fields")
          String fieldsParam,
      @Parameter(description = "Filter Disabled Classifications") @QueryParam("disabled") String disabled,
      @Parameter(description = "Limit the number classifications returned. (1 to 1000000, default = " + "10) ")
          @DefaultValue("10")
          @Min(0)
          @Max(1000000)
          @QueryParam("limit")
          int limitParam,
      @Parameter(description = "Returns list of classifications before this cursor", schema = @Schema(type = "string"))
          @QueryParam("before")
          String before,
      @Parameter(description = "Returns list of classifications after this cursor", schema = @Schema(type = "string"))
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
      operationId = "getAutoSystemClassificationByID",
      summary = "Get a autoSystem classification by id",
      description = "Get a autoSystem classification by `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "autoSystem classification",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = AutoSystemClassification.class))),
        @ApiResponse(responseCode = "404", description = "Classification for instance {id} is not found")
      })
  public AutoSystemClassification get(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the autoSystem classification", schema = @Schema(type = "UUID")) @PathParam("id")
          UUID id,
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
  @Path("name/{name}")
  @Operation(
      operationId = "getAutoSystemClassificationByName",
      summary = "Get a autoSystem classification by name",
      description =
          "Get a autoSystem classification identified by name. The response includes classification information along "
              + "with the entire hierarchy of all the children tags(autoSystem).",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The user ",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = AutoSystemClassification.class))),
        @ApiResponse(responseCode = "404", description = "Classification for instance {name} is not found")
      })
  public AutoSystemClassification getByName(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Name of the autoSystem classification", schema = @Schema(type = "string"))
          @PathParam("name")
          String name,
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
      operationId = "listAllAutoSystemClassificationVersion",
      summary = "List autoSystem classification versions",
      description = "Get a list of all the versions of a autoSystem classification identified by `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of autoSystem classification versions",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityHistory.class)))
      })
  public EntityHistory listVersions(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the autoSystem classification", schema = @Schema(type = "UUID")) @PathParam("id")
          UUID id) {
    return super.listVersionsInternal(securityContext, id);
  }

  @GET
  @Path("/{id}/versions/{version}")
  @Operation(
      operationId = "getSpecificAutoSystemClassificationVersion",
      summary = "Get a version of the autoSystem classification",
      description = "Get a version of the autoSystem classification by given `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "glossaries",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = AutoSystemClassification.class))),
        @ApiResponse(
            responseCode = "404",
            description = "Classification for instance {id} and version {version} is " + "not found")
      })
  public AutoSystemClassification getVersion(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the autoSystem classification", schema = @Schema(type = "UUID")) @PathParam("id")
          UUID id,
      @Parameter(
              description = "autoSystem classification version number in the form `major`.`minor`",
              schema = @Schema(type = "string", example = "0.1 or 1.1"))
          @PathParam("version")
          String version) {
    return super.getVersionInternal(securityContext, id, version);
  }

  @POST
  @Operation(
      operationId = "createAutoSystemClassification",
      summary = "Create a autoSystem classification",
      description =
          "Create a new autoSystem classification. The request can include the children tags to be created along "
              + "with the classification.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The user ",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = AutoSystemClassification.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response create(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Valid CreateAutoSystemClassification create) {
    AutoSystemClassification category = getAutoSystemClassification(create, securityContext);
    return create(uriInfo, securityContext, category);
  }

  @PUT
  @Operation(
      operationId = "createOrUpdateAutoSystemClassification",
      summary = "Update a autoSystem classification",
      description = "Update an existing autoSystem category identify by autoSystem category name")
  public Response createOrUpdate(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Valid CreateAutoSystemClassification create) {
    AutoSystemClassification category = getAutoSystemClassification(create, securityContext);
    return createOrUpdate(uriInfo, securityContext, category);
  }

  @PATCH
  @Path("/{id}")
  @Operation(
      operationId = "patchAutoSystemClassification",
      summary = "Update a autoSystem classification",
      description = "Update an existing classification using JsonPatch.",
      externalDocs = @ExternalDocumentation(description = "JsonPatch RFC", url = "https://tools.ietf.org/html/rfc6902"))
  @Consumes(MediaType.APPLICATION_JSON_PATCH_JSON)
  public Response patch(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the autoSystem classification", schema = @Schema(type = "UUID")) @PathParam("id")
          UUID id,
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
      operationId = "deleteAutoSystemClassification",
      summary = "Delete autoSystem classification by id",
      description = "Delete a autoSystem classification and all the tags(autoSystems) under it.")
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
      @Parameter(description = "Id of the autoSystem classification", schema = @Schema(type = "UUID")) @PathParam("id")
          UUID id) {
    return delete(uriInfo, securityContext, id, recursive, hardDelete);
  }

  @DELETE
  @Path("/name/{name}")
  @Operation(
      operationId = "deleteAutoSystemClassificationByName",
      summary = "Delete autoSystem classification by name",
      description = "Delete a autoSystem classification by `name` and all the tags under it.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "classification for instance {name} is not found")
      })
  public Response delete(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Hard delete the entity. (Default = `false`)")
          @QueryParam("hardDelete")
          @DefaultValue("false")
          boolean hardDelete,
      @Parameter(description = "Name of the autoSystem classification", schema = @Schema(type = "string"))
          @PathParam("name")
          String name) {
    return deleteByName(uriInfo, securityContext, name, false, hardDelete);
  }

  // restore doesn't work in ui!!!!!!!!!
  @PUT
  @Path("/restore")
  @Operation(
      operationId = "restoreClassification",
      summary = "Restore a soft deleted classification",
      description = "Restore a soft deleted classification.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Successfully restored the Table ",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Table.class)))
      })
  public Response restore(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid RestoreEntity restore) {
    return restoreEntity(uriInfo, securityContext, restore.getId());
  }

  private AutoSystemClassification getAutoSystemClassification(
      CreateAutoSystemClassification create, SecurityContext securityContext) {
    return getAutoSystemClassification(repository, create, securityContext.getUserPrincipal().getName());
  }

  public static AutoSystemClassification getAutoSystemClassification(
      AutoSystemClassificationRepository repository, CreateAutoSystemClassification create, String updatedBy) {
    return repository
        .copy(new AutoSystemClassification(), create, updatedBy)
        .withFullyQualifiedName(create.getName())
        .withProvider(create.getProvider())
        .withMutuallyExclusive(create.getMutuallyExclusive());
  }
}
