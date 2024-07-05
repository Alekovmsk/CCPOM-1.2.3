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

import static org.openmetadata.service.Entity.ADMIN_USER_NAME;
import static org.openmetadata.service.Entity.AUTOSYSTEM;
import static org.openmetadata.service.Entity.AUTOSYSTEMCLASSIFICATION;

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
import org.openmetadata.schema.api.autoSystemClassification.CreateAutoSystem;
import org.openmetadata.schema.api.autoSystemClassification.LoadAutoSystems;
import org.openmetadata.schema.api.data.RestoreEntity;
import org.openmetadata.schema.entity.autoSystemClassification.AutoSystem;
import org.openmetadata.schema.entity.autoSystemClassification.AutoSystemClassification;
import org.openmetadata.schema.type.EntityHistory;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.MetadataOperation;
import org.openmetadata.service.Entity;
import org.openmetadata.service.OpenMetadataApplicationConfig;
import org.openmetadata.service.jdbi3.AutoSystemClassificationRepository;
import org.openmetadata.service.jdbi3.AutoSystemRepository;
import org.openmetadata.service.jdbi3.EntityRepository;
import org.openmetadata.service.jdbi3.ListFilter;
import org.openmetadata.service.resources.Collection;
import org.openmetadata.service.resources.EntityResource;
import org.openmetadata.service.security.Authorizer;
import org.openmetadata.service.util.EntityUtil;
import org.openmetadata.service.util.ResultList;

@Slf4j
@Path("/v1/autoSystems")
@io.swagger.v3.oas.annotations.tags.Tag(
    name = "AutoSystemClassifications",
    description =
        "These APIs are related to `Classification` and `Tags`. A `Classification`"
            + " "
            + "entity "
            + "contains hierarchical"
            + " terms called `Tags` used "
            + "for categorizing and classifying data assets and other entities.")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Collection(name = "autoSystems", order = 9) // initialize after Classification, and before Glossary and GlossaryTerm
public class AutoSystemResource extends EntityResource<AutoSystem, AutoSystemRepository> {
  public static final String TAG_COLLECTION_PATH = "/v1/autoSystems/";
  static final String FIELDS = "children,usageCount";

  static class AutoSystemList extends ResultList<AutoSystem> {
    /* Required for serde */
  }

  public AutoSystemResource(Authorizer authorizer) {
    super(Entity.AUTOSYSTEM, authorizer);
  }

  @Override
  protected List<MetadataOperation> getEntitySpecificOperations() {
    addViewOperation("children,usageCount", MetadataOperation.VIEW_BASIC);
    return null;
  }

  // private void migrateAutoSystems() {
  // // Just want to run it when upgrading to version above 0.13.1 where tag
  // relationship are not there , once we have
  // // any entries we don't need to run it
  // if
  // (!(repository.getDaoCollection().relationshipDAO().findIfAnyRelationExist(AUTOSYSTEMCLASSIFICATION,
  // AUTOSYSTEM) > 0)) {
  // // We are missing relationship for classification -> tag, and also tag -> tag
  // (parent relationship)
  // // Find tag definitions and load classifications from the json file, if
  // necessary
  // AutoSystemClassificationRepository autoSystemClassificationRepository =
  // (AutoSystemClassificationRepository)
  // Entity.getEntityRepository(AUTOSYSTEMCLASSIFICATION);
  // try {
  // List<AutoSystemClassification> autoSystemClassificationList =
  // autoSystemClassificationRepository.listAll(autoSystemClassificationRepository.getFields("*"),
  // new
  // ListFilter(Include.ALL));
  // List<String> jsons = repository.getDao().listAfter(new
  // ListFilter(Include.ALL), Integer.MAX_VALUE, "");
  // List<AutoSystem> storedAutoSystems = JsonUtils.readObjects(jsons,
  // AutoSystem.class);
  // for (AutoSystem autoSystem : storedAutoSystems) {
  // if (autoSystem.getFullyQualifiedName().contains(".")) {
  // // Either it has classification or a autoSystem which is its parent
  // // Check Classification
  // String[] tokens = autoSystem.getFullyQualifiedName().split("\\.", 2);
  // String autoSystemClassificationName = tokens[0];
  // String remainingPart = tokens[1];
  // for (AutoSystemClassification autoSystemClassification :
  // autoSystemClassificationList) {
  // if (autoSystemClassification.getName().equals(autoSystemClassificationName))
  // {
  // // This means need to add a relationship
  // try {
  // repository.addRelationship(
  // autoSystemClassification.getId(), autoSystem.getId(),
  // AUTOSYSTEMCLASSIFICATION, AUTOSYSTEM, Relationship.CONTAINS);
  // break;
  // } catch (Exception ex) {
  // LOG.info("AutoSystem classification Relation already exists");
  // }
  // }
  // }
  // if (remainingPart.contains(".")) {
  // // Handle tag -> tag relationship
  // String parentAutoSystemName =
  // autoSystem.getFullyQualifiedName().substring(0,
  // autoSystem.getFullyQualifiedName().lastIndexOf("."));
  // for (AutoSystem parentAutoSystem : storedAutoSystems) {
  // if (parentAutoSystem.getFullyQualifiedName().equals(parentAutoSystemName)) {
  // try {
  // repository.addRelationship(parentAutoSystem.getId(), autoSystem.getId(),
  // AUTOSYSTEM, AUTOSYSTEM, Relationship.CONTAINS);
  // break;
  // } catch (Exception ex) {
  // LOG.info("Parent AutoSystem Ownership already exists");
  // }
  // }
  // }
  // }
  // }
  // }
  // } catch (Exception ex) {
  // LOG.error("Failed in Listing all the Stored AutoSystems.");
  // }
  // }
  // }

  @Override
  public void initialize(OpenMetadataApplicationConfig config) throws IOException {
    super.initialize(config);
    // // TODO: Once we have migrated to the version above 0.13.1, then this can be
    // removed
    // migrateTags();
    // Find tag definitions and load classifications from the json file, if
    // necessary
    AutoSystemClassificationRepository autoSystemClassificationRepository =
        (AutoSystemClassificationRepository) Entity.getEntityRepository(AUTOSYSTEMCLASSIFICATION);
    List<LoadAutoSystems> loadAutoSystemsList =
        EntityRepository.getEntitiesFromSeedData(
            AUTOSYSTEMCLASSIFICATION, ".*json/data/autoSystems/.*\\.json$", LoadAutoSystems.class);
    for (LoadAutoSystems loadAutoSystems : loadAutoSystemsList) {
      AutoSystemClassification autoSystemClassification =
          AutoSystemClassificationResource.getAutoSystemClassification(
              autoSystemClassificationRepository, loadAutoSystems.getCreateAutoSystemClassification(), ADMIN_USER_NAME);
      autoSystemClassificationRepository.initializeEntity(autoSystemClassification);

      List<AutoSystem> autoSystemsToCreate = new ArrayList<>();
      for (CreateAutoSystem createAutoSystem : loadAutoSystems.getCreateAutoSystems()) {
        createAutoSystem.withAutoSystemClassification(autoSystemClassification.getName());
        createAutoSystem.withProvider(autoSystemClassification.getProvider());
        AutoSystem autoSystem = getAutoSystem(createAutoSystem, ADMIN_USER_NAME);
        repository.setFullyQualifiedName(autoSystem); // FQN required for ordering tags based on hierarchy
        autoSystemsToCreate.add(autoSystem);
      }

      // Sort tags based on tag hierarchy
      EntityUtil.sortByFQN(autoSystemsToCreate);

      for (AutoSystem autoSystem : autoSystemsToCreate) {
        repository.initializeEntity(autoSystem);
      }
    }
  }

  @GET
  @Valid
  @Operation(
      operationId = "listAutoSystems",
      summary = "List autoSystems",
      description =
          "Get a list of autoSystems. Use `fields` parameter to get only necessary fields. "
              + " Use cursor-based pagination to limit the number "
              + "entries in the list using `limit` and `before` or `after` query params.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of autoSystems",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = AutoSystemList.class)))
      })
  public ResultList<AutoSystem> list(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(
              description =
                  "List autoSystems filtered by children of autoSystem identified by fqn given in `parent` parameter. The fqn "
                      + "can either be classificationName or fqn of a parent autoSystem",
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
      @Parameter(description = "Limit the number autoSystems returned. (1 to 1000000, " + "default = 10)")
          @DefaultValue("10")
          @Min(0)
          @Max(1000000)
          @QueryParam("limit")
          int limitParam,
      @Parameter(description = "Returns list of autoSystems before this cursor", schema = @Schema(type = "string"))
          @QueryParam("before")
          String before,
      @Parameter(description = "Returns list of autoSystems after this cursor", schema = @Schema(type = "string"))
          @QueryParam("after")
          String after,
      @Parameter(
              description = "Include all, deleted, or non-deleted entities.",
              schema = @Schema(implementation = Include.class))
          @QueryParam("include")
          @DefaultValue("non-deleted")
          Include include) {
    ListFilter filter =
        new ListFilter(include)
            .addQueryParam("parent", parent)
            .addQueryParam("autoSystemClassification.disabled", disabled);
    return super.listInternal(uriInfo, securityContext, fieldsParam, filter, limitParam, before, after);
  }

  @GET
  @Path("/{id}")
  @Operation(
      operationId = "getAutoSystemByID",
      summary = "Get a autoSystem by id",
      description = "Get a autoSystem by `id`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The autoSystem",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = AutoSystem.class))),
        @ApiResponse(responseCode = "404", description = "AutoSystem for instance {id} is not found")
      })
  public AutoSystem get(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the autoSystem", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
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
      operationId = "getAutoSystemByFQN",
      summary = "Get a autoSystem by fully qualified name",
      description = "Get a autoSystem by `fullyQualifiedName`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The autoSystem",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = AutoSystem.class))),
        @ApiResponse(responseCode = "404", description = "AutoSystem for instance {fqn} is not found")
      })
  public AutoSystem getByName(
      @Context UriInfo uriInfo,
      @Parameter(description = "Fully qualified name of the autoSystem", schema = @Schema(type = "string"))
          @PathParam("fqn")
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
      operationId = "listAllAutoSystemVersion",
      summary = "List autoSystem versions",
      description = "Get a list of all the versions of a autoSystem identified by `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of autoSystem versions",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityHistory.class)))
      })
  public EntityHistory listVersions(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the autoSystem", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return super.listVersionsInternal(securityContext, id);
  }

  @GET
  @Path("/{id}/versions/{version}")
  @Operation(
      operationId = "getSpecificAutoSystemVersion",
      summary = "Get a version of the autoSystems",
      description = "Get a version of the autoSystem by given `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "autoSystems",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = AutoSystem.class))),
        @ApiResponse(
            responseCode = "404",
            description = "AutoSystem for instance {id} and version {version} is " + "not found")
      })
  public AutoSystem getVersion(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the autoSystem", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Parameter(
              description = "autoSystem version number in the form `major`.`minor`",
              schema = @Schema(type = "string", example = "0.1 or 1.1"))
          @PathParam("version")
          String version) {
    return super.getVersionInternal(securityContext, id, version);
  }

  @POST
  @Operation(
      operationId = "createAutoSystem",
      summary = "Create a autoSystem",
      description = "Create a new autoSystem.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The autoSystem",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = AutoSystem.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response create(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateAutoSystem create) {
    AutoSystem autoSystem = getAutoSystem(securityContext, create);
    return create(uriInfo, securityContext, autoSystem);
  }

  @PATCH
  @Path("/{id}")
  @Operation(
      operationId = "patchAutoSystem",
      summary = "Update a autoSystem",
      description = "Update an existing autoSystem using JsonPatch.",
      externalDocs = @ExternalDocumentation(description = "JsonPatch RFC", url = "https://tools.ietf.org/html/rfc6902"))
  @Consumes(MediaType.APPLICATION_JSON_PATCH_JSON)
  public Response patch(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the autoSystem", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
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
      operationId = "createOrUpdateAutoSystem",
      summary = "Create or update a autoSystem",
      description = "Create a new autoSystem, if it does not exist or update an existing autoSystem.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The autoSystem",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = AutoSystem.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response createOrUpdate(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateAutoSystem create) {
    AutoSystem autoSystem = getAutoSystem(create, securityContext.getUserPrincipal().getName());
    return createOrUpdate(uriInfo, securityContext, autoSystem);
  }

  @DELETE
  @Path("/{id}")
  @Operation(
      operationId = "deleteAutoSystem",
      summary = "Delete a autoSystem by id",
      description = "Delete a autoSystem by `id`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "autoSystem for instance {id} is not found")
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
      @Parameter(description = "Id of the autoSystem", schema = @Schema(type = "UUID")) @PathParam("id") UUID id) {
    return delete(uriInfo, securityContext, id, recursive, hardDelete);
  }

  @DELETE
  @Path("/name/{fqn}")
  @Operation(
      operationId = "deleteAutoSystemByName",
      summary = "Delete a autoSystem by fully qualified name",
      description = "Delete a autoSystem by `fullyQualifiedName`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "autoSystem for instance {fqn} is not found")
      })
  public Response delete(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Hard delete the entity. (Default = `false`)")
          @QueryParam("hardDelete")
          @DefaultValue("false")
          boolean hardDelete,
      @Parameter(description = "Fully qualified name of the autoSystem", schema = @Schema(type = "string"))
          @PathParam("fqn")
          String fqn) {
    return deleteByName(uriInfo, securityContext, fqn, false, hardDelete);
  }

  @PUT
  @Path("/restore")
  @Operation(
      operationId = "restoreAutoSystem",
      summary = "Restore a soft deleted autoSystem.",
      description = "Restore a soft deleted autoSystem.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Successfully restored the AutoSystem ",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = AutoSystem.class)))
      })
  public Response restore(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid RestoreEntity restore) {
    return restoreEntity(uriInfo, securityContext, restore.getId());
  }

  @Override
  public AutoSystem addHref(UriInfo uriInfo, AutoSystem autoSystem) {
    super.addHref(uriInfo, autoSystem);
    Entity.withHref(uriInfo, autoSystem.getAutoSystemClassification());
    Entity.withHref(uriInfo, autoSystem.getParent());
    return autoSystem;
  }

  private AutoSystem getAutoSystem(SecurityContext securityContext, CreateAutoSystem create) {
    return getAutoSystem(create, securityContext.getUserPrincipal().getName());
  }

  private AutoSystem getAutoSystem(CreateAutoSystem create, String updateBy) {
    return repository
        .copy(new AutoSystem(), create, updateBy)
        .withStyle(create.getStyle())
        .withParent(getEntityReference(AUTOSYSTEM, create.getParent()))
        .withAutoSystemClassification(
            getEntityReference(AUTOSYSTEMCLASSIFICATION, create.getAutoSystemClassification()))
        .withProvider(create.getProvider())
        .withMainFunctionsAndPurpose(create.getMainFunctionsAndPurpose())
        .withNumberInList(create.getNumberInList())
        .withFullNameOwner(create.getFullNameOwner())
        .withOrdApointmentOwner(create.getOrdApointmentOwner())
        .withShortName(create.getShortName())
        .withSoftwareVersion(create.getSoftwareVersion())
        .withOwnDevelopmentOrPurchasedSoftware(create.getOwnDevelopmentOrPurchasedSoftware())
        .withDeveloperInformation(create.getDeveloperInformation())
        .withResponsibleEmployees(create.getResponsibleEmployees())
        .withWorkingHours(create.getWorkingHours())
        .withRegulatoryEvents(create.getRegulatoryEvents())
        .withSupportContractor(create.getSupportContractor())
        .withSupportMode(create.getSupportMode())
        .withStartSupportDate(create.getStartSupportDate())
        .withEndSupportDate(create.getEndSupportDate())
        .withSupplier(create.getSupplier())
        .withProductManager(create.getProductManager())
        .withProductManagerPosition(create.getProductManagerPosition())
        .withDeputyProductManager(create.getDeputyProductManager())
        .withTrialStartDate(create.getTrialStartDate())
        .withTrialEndDate(create.getTrialEndDate())
        .withModificationsInfo(create.getModificationsInfo())
        .withIndustrialStartDate(create.getIndustrialStartDate())
        .withIndustrialEndDate(create.getIndustrialEndDate())
        .withResponsibleUsers(create.getResponsibleUsers())
        .withInstallationKit(create.getInstallationKit())
        .withServerEquipmentNameIp(create.getServerEquipmentNameIp())
        .withServerSoftware(create.getServerSoftware())
        .withSoftwareAndHardwareComposition(create.getSoftwareAndHardwareComposition())
        .withDb(create.getDb())
        .withDbVersion(create.getDbVersion())
        .withClientPartEquioment(create.getClientPartEquioment())
        .withWorkplaceTypeAndSoftwareEnvVersion(create.getWorkplaceTypeAndSoftwareEnvVersion())
        .withLisOfOtherSystemConnections(create.getLisOfOtherSystemConnections())
        .withDegreeOfConfidentiality(create.getDegreeOfConfidentiality())
        .withCriticalityClass(create.getCriticalityClass())
        .withDepartment(create.getDepartment())
        .withAccompaniedByItBlock(create.getAccompaniedByItBlock())
        .withElectronicCopyDoc(create.getElectronicCopyDoc())
        .withProjectConnection(create.getProjectConnection())
        .withNote(create.getNote())
        .withColor(create.getColor())
        .withAsType(create.getAsType())
        .withOperationType(create.getOperationType())
        .withBasisForDevelopmentAndInputIntoPe(create.getBasisForDevelopmentAndInputIntoPe())
        .withMc(create.getMc())
        .withThresholdTimeOfMinorFailure(create.getThresholdTimeOfMinorFailure())
        .withCriticalDayTime(create.getCriticalDayTime())
        .withRoleModel(create.getRoleModel())
        .withLinkToUserList(create.getLinkToUserList())
        .withItRecoveryCoordinator(create.getItRecoveryCoordinator())
        .withAdministratorsInfo(create.getAdministratorsInfo())
        .withPlanningManager(create.getPlanningManager())
        .withRegistrationCertificate(create.getRegistrationCertificate())
        .withBusinessRecoveryCoordinator(create.getBusinessRecoveryCoordinator())
        .withOrderForDecommissioning(create.getOrderForDecommissioning())
        .withAdministrators(create.getAdministrators())
        .withRegisterLinkRfiInJiradev(create.getRegisterLinkRfiInJiradev())
        .withDevStrategicProspects(create.getDevStrategicProspects())
        .withArchitect(create.getArchitect())
        .withDevHead(create.getDevHead())
        .withTestingManager(create.getTestingManager())
        .withSoftwareRightsLevel(create.getSoftwareRightsLevel())
        .withApprovedSourcingModel(create.getApprovedSourcingModel())
        .withDurationSourcingModel(create.getDurationSourcingModel())
        .withKeyCompetencies(create.getKeyCompetencies())
        .withAllowedProportions(create.getAllowedProportions())
        .withUsingInternetSign(create.getUsingInternetSign())
        .withUsingInternetSign(create.getUsingInternetSign())
        .withReportInformation0409070(create.getReportInformation0409070())
        .withSupportHead(create.getSupportHead())
        .withOutsideRussianFederationAccess(create.getOutsideRussianFederationAccess())
        .withMnemonicCode(create.getMnemonicCode())
        .withSignPd(create.getSignPd())
        .withConfluenceSpaceLink(create.getConfluenceSpaceLink())
        .withIspdn(create.getIspdn())
        .withAvailabilityOfSpecialOrBiometricPd(create.getAvailabilityOfSpecialOrBiometricPd())
        .withDecommissioningDate(create.getDecommissioningDate())
        .withMain(create.getMain())
        .withArchiveDate(create.getArchiveDate())
        .withFinalProductAllocation(create.getFinalProductAllocation())
        .withItCommunicationItSla(create.getItCommunicationItSla())
        .withRto(create.getRto())
        .withRpo(create.getRpo())
        .withMembershipInComplianceCircuits(create.getMembershipInComplianceCircuits())
        .withDataAvailabilityonSpecialServiceClients(create.getDataAvailabilityonSpecialServiceClients())
        .withCreationProjectCode(create.getCreationProjectCode())
        .withAuthor(create.getAuthor())
        .withAddRecordIp(create.getAddRecordIp())
        .withAddRecordDate(create.getAddRecordDate())
        .withAddRecordTime(create.getAddRecordTime())
        .withUserOfLastPostEdit(create.getUserOfLastPostEdit())
        .withIpOfLastPostEdit(create.getIpOfLastPostEdit())
        .withRecordLastEditDate(create.getRecordLastEditDate())
        .withRecordLastEditTime(create.getRecordLastEditTime())
        .withRecordAcceptanceUser(create.getRecordAcceptanceUser())
        .withRecordAcceptanceIp(create.getRecordAcceptanceIp())
        .withAcceptanceRecordDate(create.getAcceptanceRecordDate())
        .withAcceptanceRecordTime(create.getAcceptanceRecordTime());
  }
}
