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

package org.openmetadata.service.resources.spds;

import static org.openmetadata.service.Entity.ADMIN_USER_NAME;
import static org.openmetadata.service.Entity.SPD;
import static org.openmetadata.service.Entity.SPDCLASSIFICATION;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.io.IOException;
import java.util.ArrayList;
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
import org.openmetadata.schema.api.data.RestoreEntity;
import org.openmetadata.schema.api.spdClassification.CreateSpd;
import org.openmetadata.schema.api.spdClassification.LoadSpds;
import org.openmetadata.schema.entity.spdClassification.Spd;
import org.openmetadata.schema.entity.spdClassification.SpdClassification;
import org.openmetadata.schema.type.EntityHistory;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.MetadataOperation;
import org.openmetadata.service.Entity;
import org.openmetadata.service.OpenMetadataApplicationConfig;
import org.openmetadata.service.jdbi3.EntityRepository;
import org.openmetadata.service.jdbi3.ListFilter;
import org.openmetadata.service.jdbi3.SpdClassificationRepository;
import org.openmetadata.service.jdbi3.SpdRepository;
import org.openmetadata.service.resources.Collection;
import org.openmetadata.service.resources.EntityResource;
import org.openmetadata.service.security.Authorizer;
import org.openmetadata.service.util.EntityUtil;
import org.openmetadata.service.util.ResultList;

@Slf4j
@Path("/v1/spds")
@io.swagger.v3.oas.annotations.tags.Tag(
    name = "SpdClassifications",
    description =
        "These APIs are related to `Classification` and `Tags`. A `Classification`"
            + " "
            + "entity "
            + "contains hierarchical"
            + " terms called `Tags` used "
            + "for categorizing and classifying data assets and other entities.")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Collection(name = "spds", order = 9) // initialize after Classification, and before Glossary and GlossaryTerm
public class SpdResource extends EntityResource<Spd, SpdRepository> {
  public static final String TAG_COLLECTION_PATH = "/v1/spds/";
  static final String FIELDS = "children,usageCount";

  static class SpdList extends ResultList<Spd> {
    /* Required for serde */
  }

  public SpdResource(Authorizer authorizer) {
    super(Entity.SPD, authorizer);
  }

  @Override
  protected List<MetadataOperation> getEntitySpecificOperations() {
    addViewOperation("children,usageCount", MetadataOperation.VIEW_BASIC);
    return null;
  }

  // private void migrateSpds() {
  //   // Just want to run it when upgrading to version above 0.13.1 where tag relationship are not there , once we have
  //   // any entries we don't need to run it
  //   if (!(repository.getDaoCollection().relationshipDAO().findIfAnyRelationExist(SPDCLASSIFICATION, SPD) > 0)) {
  //     // We are missing relationship for classification -> tag, and also tag -> tag (parent relationship)
  //     // Find tag definitions and load classifications from the json file, if necessary
  //     SpdClassificationRepository spdClassificationRepository =
  //         (SpdClassificationRepository) Entity.getEntityRepository(SPDCLASSIFICATION);
  //     try {
  //       List<SpdClassification> spdClassificationList =
  //           spdClassificationRepository.listAll(spdClassificationRepository.getFields("*"), new
  // ListFilter(Include.ALL));
  //       List<String> jsons = repository.getDao().listAfter(new ListFilter(Include.ALL), Integer.MAX_VALUE, "");
  //       List<Spd> storedSpds = JsonUtils.readObjects(jsons, Spd.class);
  //       for (Spd spd : storedSpds) {
  //         if (spd.getFullyQualifiedName().contains(".")) {
  //           // Either it has classification or a spd which is its parent
  //           // Check Classification
  //           String[] tokens = spd.getFullyQualifiedName().split("\\.", 2);
  //           String spdClassificationName = tokens[0];
  //           String remainingPart = tokens[1];
  //           for (SpdClassification spdClassification : spdClassificationList) {
  //             if (spdClassification.getName().equals(spdClassificationName)) {
  //               // This means need to add a relationship
  //               try {
  //                 repository.addRelationship(
  //                     spdClassification.getId(), spd.getId(), SPDCLASSIFICATION, SPD, Relationship.CONTAINS);
  //                 break;
  //               } catch (Exception ex) {
  //                 LOG.info("Spd classification Relation already exists");
  //               }
  //             }
  //           }
  //           if (remainingPart.contains(".")) {
  //             // Handle tag -> tag relationship
  //             String parentSpdName =
  //                 spd.getFullyQualifiedName().substring(0, spd.getFullyQualifiedName().lastIndexOf("."));
  //             for (Spd parentSpd : storedSpds) {
  //               if (parentSpd.getFullyQualifiedName().equals(parentSpdName)) {
  //                 try {
  //                   repository.addRelationship(parentSpd.getId(), spd.getId(), SPD, SPD, Relationship.CONTAINS);
  //                   break;
  //                 } catch (Exception ex) {
  //                   LOG.info("Parent Spd Ownership already exists");
  //                 }
  //               }
  //             }
  //           }
  //         }
  //       }
  //     } catch (Exception ex) {
  //       LOG.error("Failed in Listing all the Stored Spds.");
  //     }
  //   }
  // }

  @Override
  public void initialize(OpenMetadataApplicationConfig config) throws IOException {
    super.initialize(config);
    // // TODO: Once we have migrated to the version above 0.13.1, then this can be removed
    // migrateTags();
    // Find tag definitions and load classifications from the json file, if necessary
    SpdClassificationRepository spdClassificationRepository =
        (SpdClassificationRepository) Entity.getEntityRepository(SPDCLASSIFICATION);
    List<LoadSpds> loadSpdsList =
        EntityRepository.getEntitiesFromSeedData(SPDCLASSIFICATION, ".*json/data/spds/.*\\.json$", LoadSpds.class);
    for (LoadSpds loadSpds : loadSpdsList) {
      SpdClassification spdClassification =
          SpdClassificationResource.getSpdClassification(
              spdClassificationRepository, loadSpds.getCreateSpdClassification(), ADMIN_USER_NAME);
      spdClassificationRepository.initializeEntity(spdClassification);

      List<Spd> spdsToCreate = new ArrayList<>();
      for (CreateSpd createSpd : loadSpds.getCreateSpds()) {
        createSpd.withSpdClassification(spdClassification.getName());
        createSpd.withProvider(spdClassification.getProvider());
        Spd spd = getSpd(createSpd, ADMIN_USER_NAME);
        repository.setFullyQualifiedName(spd); // FQN required for ordering tags based on hierarchy
        spdsToCreate.add(spd);
      }

      // Sort tags based on tag hierarchy
      EntityUtil.sortByFQN(spdsToCreate);

      for (Spd spd : spdsToCreate) {
        repository.initializeEntity(spd);
      }
    }
  }

  @GET
  @Valid
  @Operation(
      operationId = "listSpds",
      summary = "List spds",
      description =
          "Get a list of spds. Use `fields` parameter to get only necessary fields. "
              + " Use cursor-based pagination to limit the number "
              + "entries in the list using `limit` and `before` or `after` query params.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of spds",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = SpdList.class)))
      })
  public ResultList<Spd> list(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(
              description =
                  "List spds filtered by children of spd identified by fqn given in `parent` parameter. The fqn "
                      + "can either be classificationName or fqn of a parent spd",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("parent")
          String parent,
      @Parameter(
              description = "Fields requested in the returned resource",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("fields")
          String fieldsParam,
      @Parameter(description = "Filter Disabled Classifications", schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("disabled")
          @DefaultValue("false")
          Boolean disabled,
      @Parameter(description = "Limit the number spds returned. (1 to 1000000, " + "default = 10)")
          @DefaultValue("10")
          @Min(0)
          @Max(1000000)
          @QueryParam("limit")
          int limitParam,
      @Parameter(description = "Returns list of spds before this cursor", schema = @Schema(type = "string"))
          @QueryParam("before")
          String before,
      @Parameter(description = "Returns list of spds after this cursor", schema = @Schema(type = "string"))
          @QueryParam("after")
          String after,
      @Parameter(
              description = "Include all, deleted, or non-deleted entities.",
              schema = @Schema(implementation = Include.class))
          @QueryParam("include")
          @DefaultValue("non-deleted")
          Include include) {
    ListFilter filter =
        new ListFilter(include).addQueryParam("parent", parent).addQueryParam("spdClassification.disabled", disabled);
    return super.listInternal(uriInfo, securityContext, fieldsParam, filter, limitParam, before, after);
  }

  @GET
  @Path("/{id}")
  @Operation(
      operationId = "getSpdByID",
      summary = "Get a spd by id",
      description = "Get a spd by `id`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The spd",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Spd.class))),
        @ApiResponse(responseCode = "404", description = "Spd for instance {id} is not found")
      })
  public Spd get(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the spd", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
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
  @Path("/name/{fqn}")
  @Operation(
      operationId = "getSpdByFQN",
      summary = "Get a spd by fully qualified name",
      description = "Get a spd by `fullyQualifiedName`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The spd",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Spd.class))),
        @ApiResponse(responseCode = "404", description = "Spd for instance {fqn} is not found")
      })
  public Spd getByName(
      @Context UriInfo uriInfo,
      @Parameter(description = "Fully qualified name of the spd", schema = @Schema(type = "string")) @PathParam("fqn")
          String fqn,
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
    return getByNameInternal(uriInfo, securityContext, fqn, fieldsParam, include);
  }

  @GET
  @Path("/{id}/versions")
  @Operation(
      operationId = "listAllSpdVersion",
      summary = "List spd versions",
      description = "Get a list of all the versions of a spd identified by `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of spd versions",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityHistory.class)))
      })
  public EntityHistory listVersions(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the spd", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return super.listVersionsInternal(securityContext, id);
  }

  @GET
  @Path("/{id}/versions/{version}")
  @Operation(
      operationId = "getSpecificSpdVersion",
      summary = "Get a version of the spds",
      description = "Get a version of the spd by given `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "spds",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Spd.class))),
        @ApiResponse(
            responseCode = "404",
            description = "Spd for instance {id} and version {version} is " + "not found")
      })
  public Spd getVersion(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the spd", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Parameter(
              description = "spd version number in the form `major`.`minor`",
              schema = @Schema(type = "string", example = "0.1 or 1.1"))
          @PathParam("version")
          String version) {
    return super.getVersionInternal(securityContext, id, version);
  }

  @POST
  @Operation(
      operationId = "createSpd",
      summary = "Create a spd",
      description = "Create a new spd.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The spd",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Spd.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response create(@Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateSpd create) {
    Spd spd = getSpd(securityContext, create);
    return create(uriInfo, securityContext, spd);
  }

  @PATCH
  @Path("/{id}")
  @Operation(
      operationId = "patchSpd",
      summary = "Update a spd",
      description = "Update an existing spd using JsonPatch.",
      externalDocs = @ExternalDocumentation(description = "JsonPatch RFC", url = "https://tools.ietf.org/html/rfc6902"))
  @Consumes(MediaType.APPLICATION_JSON_PATCH_JSON)
  public Response patch(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the spd", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
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
      operationId = "createOrUpdateSpd",
      summary = "Create or update a spd",
      description = "Create a new spd, if it does not exist or update an existing spd.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The spd",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Spd.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response createOrUpdate(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateSpd create) {
    Spd spd = getSpd(create, securityContext.getUserPrincipal().getName());
    return createOrUpdate(uriInfo, securityContext, spd);
  }

  @DELETE
  @Path("/{id}")
  @Operation(
      operationId = "deleteSpd",
      summary = "Delete a spd by id",
      description = "Delete a spd by `id`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "spd for instance {id} is not found")
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
      @Parameter(description = "Id of the spd", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return delete(uriInfo, securityContext, id, recursive, hardDelete);
  }

  @DELETE
  @Path("/name/{fqn}")
  @Operation(
      operationId = "deleteSpdByName",
      summary = "Delete a spd by fully qualified name",
      description = "Delete a spd by `fullyQualifiedName`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "spd for instance {fqn} is not found")
      })
  public Response delete(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Hard delete the entity. (Default = `false`)")
          @QueryParam("hardDelete")
          @DefaultValue("false")
          boolean hardDelete,
      @Parameter(description = "Fully qualified name of the spd", schema = @Schema(type = "string")) @PathParam("fqn")
          String fqn) {
    return deleteByName(uriInfo, securityContext, fqn, false, hardDelete);
  }

  @PUT
  @Path("/restore")
  @Operation(
      operationId = "restoreSpd",
      summary = "Restore a soft deleted spd.",
      description = "Restore a soft deleted spd.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Successfully restored the Spd ",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Spd.class)))
      })
  public Response restore(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid RestoreEntity restore) {
    return restoreEntity(uriInfo, securityContext, restore.getId());
  }

  @Override
  public Spd addHref(UriInfo uriInfo, Spd spd) {
    super.addHref(uriInfo, spd);
    Entity.withHref(uriInfo, spd.getSpdClassification());
    Entity.withHref(uriInfo, spd.getParent());
    return spd;
  }

  private Spd getSpd(SecurityContext securityContext, CreateSpd create) {
    return getSpd(create, securityContext.getUserPrincipal().getName());
  }

  private Spd getSpd(CreateSpd create, String updateBy) {
    return repository
        .copy(new Spd(), create, updateBy)
        .withStyle(create.getStyle())
        .withParent(getEntityReference(SPD, create.getParent()))
        .withSpdClassification(getEntityReference(SPDCLASSIFICATION, create.getSpdClassification()))
        .withProvider(create.getProvider())
        .withDocNumber(create.getDocNumber())
        .withDocType(create.getDocType())
        .withConclusionDate(create.getConclusionDate())
        .withExpirationDate(create.getExpirationDate())
        .withValidity(create.getValidity())
        .withDomainData(create.getDomainData())
        .withConsumer(create.getConsumer())
        .withDocStatus(create.getDocStatus())
        .withAutoSystemProvider(create.getAutoSystemProvider())
        .withAutoSystemOwnerFullName(create.getAutoSystemOwnerFullName())
        .withAutoSystemOwnerPhone(create.getAutoSystemOwnerPhone())
        .withAutoSystemOwnerEmail(create.getAutoSystemOwnerEmail())
        .withProductManagerFullName(create.getProductManagerFullName())
        .withProductManagerPhone(create.getProductManagerPhone())
        .withProductManagerEmail(create.getProductManagerEmail())
        .withConnectionParameters(create.getConnectionParameters())
        .withConnectionModes(create.getConnectionModes())
        .withOtherParameters(create.getOtherParameters())
        .withRequirements(create.getRequirements())
        .withIndicators(create.getIndicators())
        .withReportingType(create.getReportingType())
        .withReportingPeriodicity(create.getReportingPeriodicity())
        .withReportingFormationMode(create.getReportingFormationMode())
        .withReportingHref(create.getReportingHref())
        .withProlongation(create.getProlongation());
  }
}
