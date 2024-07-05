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

package org.openmetadata.service.resources.dlas;

import static org.openmetadata.service.Entity.ADMIN_USER_NAME;
import static org.openmetadata.service.Entity.DLA;
import static org.openmetadata.service.Entity.DLACLASSIFICATION;

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
import org.openmetadata.schema.api.dlaClassification.CreateDla;
import org.openmetadata.schema.api.dlaClassification.LoadDlas;
import org.openmetadata.schema.entity.dlaClassification.Dla;
import org.openmetadata.schema.entity.dlaClassification.DlaClassification;
import org.openmetadata.schema.type.EntityHistory;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.MetadataOperation;
import org.openmetadata.service.Entity;
import org.openmetadata.service.OpenMetadataApplicationConfig;
import org.openmetadata.service.jdbi3.DlaClassificationRepository;
import org.openmetadata.service.jdbi3.DlaRepository;
import org.openmetadata.service.jdbi3.EntityRepository;
import org.openmetadata.service.jdbi3.ListFilter;
import org.openmetadata.service.resources.Collection;
import org.openmetadata.service.resources.EntityResource;
import org.openmetadata.service.security.Authorizer;
import org.openmetadata.service.util.EntityUtil;
import org.openmetadata.service.util.ResultList;

@Slf4j
@Path("/v1/dlas")
@io.swagger.v3.oas.annotations.tags.Tag(
    name = "DlaClassifications",
    description =
        "These APIs are related to `Classification` and `Tags`. A `Classification`"
            + " "
            + "entity "
            + "contains hierarchical"
            + " terms called `Tags` used "
            + "for categorizing and classifying data assets and other entities.")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Collection(name = "dlas", order = 9) // initialize after Classification, and before Glossary and GlossaryTerm
public class DlaResource extends EntityResource<Dla, DlaRepository> {
  public static final String TAG_COLLECTION_PATH = "/v1/dlas/";
  static final String FIELDS = "children,usageCount";

  static class DlaList extends ResultList<Dla> {
    /* Required for serde */
  }

  public DlaResource(Authorizer authorizer) {
    super(Entity.DLA, authorizer);
  }

  @Override
  protected List<MetadataOperation> getEntitySpecificOperations() {
    addViewOperation("children,usageCount", MetadataOperation.VIEW_BASIC);
    return null;
  }

  // private void migrateDlas() {
  //   // Just want to run it when upgrading to version above 0.13.1 where tag relationship are not there , once we have
  //   // any entries we don't need to run it
  //   if (!(repository.getDaoCollection().relationshipDAO().findIfAnyRelationExist(DLACLASSIFICATION, DLA) > 0)) {
  //     // We are missing relationship for classification -> tag, and also tag -> tag (parent relationship)
  //     // Find tag definitions and load classifications from the json file, if necessary
  //     DlaClassificationRepository dlaClassificationRepository =
  //         (DlaClassificationRepository) Entity.getEntityRepository(DLACLASSIFICATION);
  //     try {
  //       List<DlaClassification> dlaClassificationList =
  //           dlaClassificationRepository.listAll(dlaClassificationRepository.getFields("*"), new
  // ListFilter(Include.ALL));
  //       List<String> jsons = repository.getDao().listAfter(new ListFilter(Include.ALL), Integer.MAX_VALUE, "");
  //       List<Dla> storedDlas = JsonUtils.readObjects(jsons, Dla.class);
  //       for (Dla dla : storedDlas) {
  //         if (dla.getFullyQualifiedName().contains(".")) {
  //           // Either it has classification or a dla which is its parent
  //           // Check Classification
  //           String[] tokens = dla.getFullyQualifiedName().split("\\.", 2);
  //           String dlaClassificationName = tokens[0];
  //           String remainingPart = tokens[1];
  //           for (DlaClassification dlaClassification : dlaClassificationList) {
  //             if (dlaClassification.getName().equals(dlaClassificationName)) {
  //               // This means need to add a relationship
  //               try {
  //                 repository.addRelationship(
  //                     dlaClassification.getId(), dla.getId(), DLACLASSIFICATION, DLA, Relationship.CONTAINS);
  //                 break;
  //               } catch (Exception ex) {
  //                 LOG.info("Dla classification Relation already exists");
  //               }
  //             }
  //           }
  //           if (remainingPart.contains(".")) {
  //             // Handle tag -> tag relationship
  //             String parentDlaName =
  //                 dla.getFullyQualifiedName().substring(0, dla.getFullyQualifiedName().lastIndexOf("."));
  //             for (Dla parentDla : storedDlas) {
  //               if (parentDla.getFullyQualifiedName().equals(parentDlaName)) {
  //                 try {
  //                   repository.addRelationship(parentDla.getId(), dla.getId(), DLA, DLA, Relationship.CONTAINS);
  //                   break;
  //                 } catch (Exception ex) {
  //                   LOG.info("Parent Dla Ownership already exists");
  //                 }
  //               }
  //             }
  //           }
  //         }
  //       }
  //     } catch (Exception ex) {
  //       LOG.error("Failed in Listing all the Stored Dlas.");
  //     }
  //   }
  // }

  @Override
  public void initialize(OpenMetadataApplicationConfig config) throws IOException {
    super.initialize(config);
    // // TODO: Once we have migrated to the version above 0.13.1, then this can be removed
    // migrateTags();
    // Find tag definitions and load classifications from the json file, if necessary
    DlaClassificationRepository dlaClassificationRepository =
        (DlaClassificationRepository) Entity.getEntityRepository(DLACLASSIFICATION);
    List<LoadDlas> loadDlasList =
        EntityRepository.getEntitiesFromSeedData(DLACLASSIFICATION, ".*json/data/dlas/.*\\.json$", LoadDlas.class);
    for (LoadDlas loadDlas : loadDlasList) {
      DlaClassification dlaClassification =
          DlaClassificationResource.getDlaClassification(
              dlaClassificationRepository, loadDlas.getCreateDlaClassification(), ADMIN_USER_NAME);
      dlaClassificationRepository.initializeEntity(dlaClassification);

      List<Dla> dlasToCreate = new ArrayList<>();
      for (CreateDla createDla : loadDlas.getCreateDlas()) {
        createDla.withDlaClassification(dlaClassification.getName());
        createDla.withProvider(dlaClassification.getProvider());
        Dla dla = getDla(createDla, ADMIN_USER_NAME);
        repository.setFullyQualifiedName(dla); // FQN required for ordering tags based on hierarchy
        dlasToCreate.add(dla);
      }

      // Sort tags based on tag hierarchy
      EntityUtil.sortByFQN(dlasToCreate);

      for (Dla dla : dlasToCreate) {
        repository.initializeEntity(dla);
      }
    }
  }

  @GET
  @Valid
  @Operation(
      operationId = "listDlas",
      summary = "List dlas",
      description =
          "Get a list of dlas. Use `fields` parameter to get only necessary fields. "
              + " Use cursor-based pagination to limit the number "
              + "entries in the list using `limit` and `before` or `after` query params.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of dlas",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = DlaList.class)))
      })
  public ResultList<Dla> list(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(
              description =
                  "List dlas filtered by children of dla identified by fqn given in `parent` parameter. The fqn "
                      + "can either be classificationName or fqn of a parent dla",
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
      @Parameter(description = "Limit the number dlas returned. (1 to 1000000, " + "default = 10)")
          @DefaultValue("10")
          @Min(0)
          @Max(1000000)
          @QueryParam("limit")
          int limitParam,
      @Parameter(description = "Returns list of dlas before this cursor", schema = @Schema(type = "string"))
          @QueryParam("before")
          String before,
      @Parameter(description = "Returns list of dlas after this cursor", schema = @Schema(type = "string"))
          @QueryParam("after")
          String after,
      @Parameter(
              description = "Include all, deleted, or non-deleted entities.",
              schema = @Schema(implementation = Include.class))
          @QueryParam("include")
          @DefaultValue("non-deleted")
          Include include) {
    ListFilter filter =
        new ListFilter(include).addQueryParam("parent", parent).addQueryParam("dlaClassification.disabled", disabled);
    return super.listInternal(uriInfo, securityContext, fieldsParam, filter, limitParam, before, after);
  }

  @GET
  @Path("/{id}")
  @Operation(
      operationId = "getDlaByID",
      summary = "Get a dla by id",
      description = "Get a dla by `id`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The dla",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Dla.class))),
        @ApiResponse(responseCode = "404", description = "Dla for instance {id} is not found")
      })
  public Dla get(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the dla", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
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
      operationId = "getDlaByFQN",
      summary = "Get a dla by fully qualified name",
      description = "Get a dla by `fullyQualifiedName`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The dla",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Dla.class))),
        @ApiResponse(responseCode = "404", description = "Dla for instance {fqn} is not found")
      })
  public Dla getByName(
      @Context UriInfo uriInfo,
      @Parameter(description = "Fully qualified name of the dla", schema = @Schema(type = "string")) @PathParam("fqn")
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
      operationId = "listAllDlaVersion",
      summary = "List dla versions",
      description = "Get a list of all the versions of a dla identified by `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of dla versions",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityHistory.class)))
      })
  public EntityHistory listVersions(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the dla", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return super.listVersionsInternal(securityContext, id);
  }

  @GET
  @Path("/{id}/versions/{version}")
  @Operation(
      operationId = "getSpecificDlaVersion",
      summary = "Get a version of the dlas",
      description = "Get a version of the dla by given `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "dlas",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Dla.class))),
        @ApiResponse(
            responseCode = "404",
            description = "Dla for instance {id} and version {version} is " + "not found")
      })
  public Dla getVersion(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the dla", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Parameter(
              description = "dla version number in the form `major`.`minor`",
              schema = @Schema(type = "string", example = "0.1 or 1.1"))
          @PathParam("version")
          String version) {
    return super.getVersionInternal(securityContext, id, version);
  }

  @POST
  @Operation(
      operationId = "createDla",
      summary = "Create a dla",
      description = "Create a new dla.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The dla",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Dla.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response create(@Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateDla create) {
    Dla dla = getDla(securityContext, create);
    return create(uriInfo, securityContext, dla);
  }

  @PATCH
  @Path("/{id}")
  @Operation(
      operationId = "patchDla",
      summary = "Update a dla",
      description = "Update an existing dla using JsonPatch.",
      externalDocs = @ExternalDocumentation(description = "JsonPatch RFC", url = "https://tools.ietf.org/html/rfc6902"))
  @Consumes(MediaType.APPLICATION_JSON_PATCH_JSON)
  public Response patch(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the dla", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
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
      operationId = "createOrUpdateDla",
      summary = "Create or update a dla",
      description = "Create a new dla, if it does not exist or update an existing dla.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The dla",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Dla.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response createOrUpdate(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateDla create) {
    Dla dla = getDla(create, securityContext.getUserPrincipal().getName());
    return createOrUpdate(uriInfo, securityContext, dla);
  }

  @DELETE
  @Path("/{id}")
  @Operation(
      operationId = "deleteDla",
      summary = "Delete a dla by id",
      description = "Delete a dla by `id`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "dla for instance {id} is not found")
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
      @Parameter(description = "Id of the dla", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return delete(uriInfo, securityContext, id, recursive, hardDelete);
  }

  @DELETE
  @Path("/name/{fqn}")
  @Operation(
      operationId = "deleteDlaByName",
      summary = "Delete a dla by fully qualified name",
      description = "Delete a dla by `fullyQualifiedName`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "dla for instance {fqn} is not found")
      })
  public Response delete(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Hard delete the entity. (Default = `false`)")
          @QueryParam("hardDelete")
          @DefaultValue("false")
          boolean hardDelete,
      @Parameter(description = "Fully qualified name of the dla", schema = @Schema(type = "string")) @PathParam("fqn")
          String fqn) {
    return deleteByName(uriInfo, securityContext, fqn, false, hardDelete);
  }

  @PUT
  @Path("/restore")
  @Operation(
      operationId = "restoreDla",
      summary = "Restore a soft deleted dla.",
      description = "Restore a soft deleted dla.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Successfully restored the Dla ",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Dla.class)))
      })
  public Response restore(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid RestoreEntity restore) {
    return restoreEntity(uriInfo, securityContext, restore.getId());
  }

  @Override
  public Dla addHref(UriInfo uriInfo, Dla dla) {
    super.addHref(uriInfo, dla);
    Entity.withHref(uriInfo, dla.getDlaClassification());
    Entity.withHref(uriInfo, dla.getParent());
    return dla;
  }

  private Dla getDla(SecurityContext securityContext, CreateDla create) {
    return getDla(create, securityContext.getUserPrincipal().getName());
  }

  private Dla getDla(CreateDla create, String updateBy) {
    return repository
        .copy(new Dla(), create, updateBy)
        .withStyle(create.getStyle())
        .withParent(getEntityReference(DLA, create.getParent()))
        .withDlaClassification(getEntityReference(DLACLASSIFICATION, create.getDlaClassification()))
        .withProvider(create.getProvider())
        .withDocNumber(create.getDocNumber())
        .withDocType(create.getDocType())
        .withConclusionDate(create.getConclusionDate())
        .withExpirationDate(create.getExpirationDate())
        .withValidity(create.getValidity())
        .withProlongation(create.getProlongation())
        .withDomainData(create.getDomainData())
        .withConsumer(create.getConsumer())
        .withDocStatus(create.getDocStatus())
        .withDataRegister(create.getDataRegister())
        .withDataManager(create.getDataSteward())
        .withDataSteward(create.getDataSteward())
        .withAutoSourceSystem(getEntityReferences(Entity.DATABASE_SERVICE, create.getAutoSourceSystem()))
        .withAutoConsumerSystem(getEntityReferences(Entity.DATABASE_SERVICE, create.getAutoConsumerSystem()))
        .withPublicationArea(create.getPublicationArea())
        .withCronUpdateData(create.getCronUpdateData())
        .withCronDataAvailability(create.getCronDataAvailability())
        .withCronDataActualization(create.getCronDataActualization())
        .withMutuallyExclusive(create.getMutuallyExclusive())
        .withDataProvisionIndicators(create.getDataProvisionIndicators())
        .withDataQualityIndicators(create.getDataQualityIndicators())
        .withReportingType(create.getReportingType())
        .withReportingPeriodicity(create.getReportingPeriodicity())
        .withReportingReceiverRole(create.getReportingReceiverRole())
        .withReportingResponsible(create.getReportingResponsible())
        .withReportingHref(create.getReportingHref())
        .withIncidenSigns(create.getIncidenSigns())
        .withAdditionalInformation(create.getAdditionalInformation());
  }
}
