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

import static org.openmetadata.service.Entity.ADMIN_USER_NAME;
import static org.openmetadata.service.Entity.KNOWLEDGE_CENTER;

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
import org.openmetadata.schema.api.AddKnowledgeCenterToAssetsRequest;
import org.openmetadata.schema.api.VoteRequest;
import org.openmetadata.schema.api.data.CreateKnowledgeCenterDocument;
import org.openmetadata.schema.api.data.LoadKnowledgeCenter;
import org.openmetadata.schema.api.data.RestoreEntity;
import org.openmetadata.schema.entity.data.KnowledgeCenter;
import org.openmetadata.schema.entity.data.KnowledgeCenterDocument;
import org.openmetadata.schema.type.ChangeEvent;
import org.openmetadata.schema.type.EntityHistory;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.MetadataOperation;
import org.openmetadata.schema.type.api.BulkOperationResult;
import org.openmetadata.service.Entity;
import org.openmetadata.service.OpenMetadataApplicationConfig;
import org.openmetadata.service.exception.CatalogExceptionMessage;
import org.openmetadata.service.jdbi3.EntityRepository;
import org.openmetadata.service.jdbi3.KnowledgeCenterDocumentRepository;
import org.openmetadata.service.jdbi3.KnowledgeCenterRepository;
import org.openmetadata.service.jdbi3.ListFilter;
import org.openmetadata.service.resources.Collection;
import org.openmetadata.service.resources.EntityResource;
import org.openmetadata.service.security.Authorizer;
import org.openmetadata.service.util.EntityUtil;
import org.openmetadata.service.util.EntityUtil.Fields;
import org.openmetadata.service.util.RestUtil;
import org.openmetadata.service.util.ResultList;

@Path("/v1/agreementCenterDocuments")
@Tag(
    name = "KnowledgeCenters",
    description = "A `KnowledgeCenter` is collection of hierarchical `KnowledgeCenterDocuments`.")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Collection(name = "knowledgeCenterDocuments", order = 7) // Initialized after KnowledgeCenter, Classification, and Tags
public class KnowledgeCenterDocumentResource
    extends EntityResource<KnowledgeCenterDocument, KnowledgeCenterDocumentRepository> {
  public static final String COLLECTION_PATH = "v1/knowledgeCenterDocuments/";
  static final String FIELDS = "children,relatedDocuments,reviewers,owner,tags,usageCount,domain,extension";

  @Override
  public KnowledgeCenterDocument addHref(UriInfo uriInfo, KnowledgeCenterDocument document) {
    super.addHref(uriInfo, document);
    Entity.withHref(uriInfo, document.getKnowledgeCenter());
    Entity.withHref(uriInfo, document.getParent());
    Entity.withHref(uriInfo, document.getRelatedDocuments());
    return document;
  }

  public KnowledgeCenterDocumentResource(Authorizer authorizer) {
    super(Entity.KNOWLEDGE_CENTER_DOCUMENT, authorizer);
  }

  @Override
  protected List<MetadataOperation> getEntitySpecificOperations() {
    addViewOperation("children,relatedDocuments,reviewers,usageCount", MetadataOperation.VIEW_BASIC);
    return null;
  }

  public static class KnowledgeCenterDocumentList extends ResultList<KnowledgeCenterDocument> {
    /* Required for serde */
  }

  @Override
  public void initialize(OpenMetadataApplicationConfig config) throws IOException {
    super.initialize(config);
    // Load KnowledgeCenters provided by OpenMetadata
    KnowledgeCenterRepository knowledgeCenterRepository =
        (KnowledgeCenterRepository) Entity.getEntityRepository(KNOWLEDGE_CENTER);
    List<LoadKnowledgeCenter> loadKnowledgeCenters =
        EntityRepository.getEntitiesFromSeedData(
            KNOWLEDGE_CENTER, ".*json/data/knowledgeCenter/.*KnowledgeCenter\\.json$", LoadKnowledgeCenter.class);
    for (LoadKnowledgeCenter loadKnowledgeCenter : loadKnowledgeCenters) {
      KnowledgeCenter knowledgeCenter =
          KnowledgeCenterResource.getKnowledgeCenter(
              knowledgeCenterRepository, loadKnowledgeCenter.getCreateKnowledgeCenter(), ADMIN_USER_NAME);
      knowledgeCenter.setFullyQualifiedName(knowledgeCenter.getName());
      knowledgeCenterRepository.initializeEntity(knowledgeCenter);

      List<KnowledgeCenterDocument> documentsToCreate = new ArrayList<>();
      for (CreateKnowledgeCenterDocument createDocument : loadKnowledgeCenter.getCreateDocuments()) {
        createDocument.withKnowledgeCenter(knowledgeCenter.getName());
        createDocument.withProvider(knowledgeCenter.getProvider());
        KnowledgeCenterDocument document = getKnowledgeCenterDocument(createDocument, ADMIN_USER_NAME);
        repository.setFullyQualifiedName(document); // FQN required for ordering tags based on hierarchy
        documentsToCreate.add(document);
      }

      // Sort tags based on tag hierarchy
      EntityUtil.sortByFQN(documentsToCreate);

      for (KnowledgeCenterDocument document : documentsToCreate) {
        repository.initializeEntity(document);
      }
    }
  }

  @GET
  @Valid
  @Operation(
      operationId = "listKnowledgeCenterDocument",
      summary = "List knowledgeCenter documents",
      description =
          "Get a list of knowledgeCenter documents. Use `fields` parameter to get only necessary fields. "
              + " Use cursor-based pagination to limit the number "
              + "entries in the list using `limit` and `before` or `after` query params.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of knowledgeCenter documents",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = KnowledgeCenterDocumentList.class)))
      })
  public ResultList<KnowledgeCenterDocument> list(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(
              description =
                  "List knowledgeCenter documents filtered by knowledgeCenter identified by Id given in `knowledgeCenter` parameter.",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("knowledgeCenter")
          String knowledgeCenterIdParam,
      @Parameter(
              description =
                  "List knowledgeCenter documents filtered by children of knowledgeCenter document identified by Id given in "
                      + "`parent` parameter.",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("parent")
          UUID parentDocumentParam,
      @Parameter(
              description = "Fields requested in the returned resource",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("fields")
          String fieldsParam,
      @Parameter(description = "Limit the number knowledgeCenter documents returned. (1 to 1000000, " + "default = 10)")
          @DefaultValue("10")
          @Min(0)
          @Max(1000000)
          @QueryParam("limit")
          int limitParam,
      @Parameter(
              description = "Returns list of knowledgeCenter documents before this cursor",
              schema = @Schema(type = "string"))
          @QueryParam("before")
          String before,
      @Parameter(
              description = "Returns list of knowledgeCenter documents after this cursor",
              schema = @Schema(type = "string"))
          @QueryParam("after")
          String after,
      @Parameter(
              description = "Include all, deleted, or non-deleted entities.",
              schema = @Schema(implementation = Include.class))
          @QueryParam("include")
          @DefaultValue("non-deleted")
          Include include) {
    // TODO make this common implementation
    RestUtil.validateCursors(before, after);
    Fields fields = getFields(fieldsParam);

    // Filter by knowledgeCenter
    String fqn = null;
    EntityReference knowledgeCenter = null;
    if (knowledgeCenterIdParam != null) {
      knowledgeCenter = repository.getKnowledgeCenter(knowledgeCenterIdParam);
      fqn = knowledgeCenter.getFullyQualifiedName();
    }

    // Filter by knowledgeCenter parent document
    if (parentDocumentParam != null) {
      KnowledgeCenterDocument parentDocument = repository.find(parentDocumentParam, Include.NON_DELETED);
      fqn = parentDocument.getFullyQualifiedName();

      // Ensure parent knowledgeCenter document belongs to the knowledgeCenter
      if ((knowledgeCenter != null) && (!parentDocument.getKnowledgeCenter().getId().equals(knowledgeCenter.getId()))) {
        throw new IllegalArgumentException(
            CatalogExceptionMessage.knowledgeCenterDocumentMismatch(
                parentDocumentParam.toString(), knowledgeCenterIdParam));
      }
    }
    ListFilter filter = new ListFilter(include).addQueryParam("parent", fqn);

    ResultList<KnowledgeCenterDocument> documents;
    if (before != null) { // Reverse paging
      documents = repository.listBefore(uriInfo, fields, filter, limitParam, before); // Ask for one extra entry
    } else { // Forward paging or first page
      documents = repository.listAfter(uriInfo, fields, filter, limitParam, after);
    }
    return addHref(uriInfo, documents);
  }

  @GET
  @Path("/{id}")
  @Operation(
      operationId = "getKnowledgeCenterDocumentByID",
      summary = "Get a knowledgeCenter document by Id",
      description = "Get a knowledgeCenter document by `Id`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The knowledgeCenter document",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = KnowledgeCenter.class))),
        @ApiResponse(responseCode = "404", description = "KnowledgeCenter for instance {id} is not found")
      })
  public KnowledgeCenterDocument get(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the knowledgeCenter document", schema = @Schema(type = "UUID")) @PathParam("id")
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
  @Path("/name/{fqn}")
  @Operation(
      operationId = "getKnowledgeCenterDocumentByFQN",
      summary = "Get a knowledgeCenter document by fully qualified name",
      description = "Get a knowledgeCenter document by `fullyQualifiedName`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The knowledgeCenter document",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = KnowledgeCenter.class))),
        @ApiResponse(responseCode = "404", description = "KnowledgeCenter for instance {fqn} is not found")
      })
  public KnowledgeCenterDocument getByName(
      @Context UriInfo uriInfo,
      @Parameter(
              description = "Fully qualified name of the knowledgeCenter document",
              schema = @Schema(type = "string"))
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
      operationId = "listAllKnowledgeCenterDocumentVersion",
      summary = "List knowledgeCenter document versions",
      description = "Get a list of all the versions of a knowledgeCenter documents identified by `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of knowledgeCenter document versions",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityHistory.class)))
      })
  public EntityHistory listVersions(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the knowledgeCenter document", schema = @Schema(type = "UUID")) @PathParam("id")
          UUID id) {
    return super.listVersionsInternal(securityContext, id);
  }

  @GET
  @Path("/{id}/versions/{version}")
  @Operation(
      operationId = "getSpecificKnowledgeCenterDocumentVersion",
      summary = "Get a version of the knowledgeCenter document",
      description = "Get a version of the knowledgeCenter document by given `Id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "KnowledgeCenters",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = KnowledgeCenter.class))),
        @ApiResponse(
            responseCode = "404",
            description = "KnowledgeCenter for instance {id} and version {version} is " + "not found")
      })
  public KnowledgeCenterDocument getVersion(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the knowledgeCenter document", schema = @Schema(type = "UUID")) @PathParam("id")
          UUID id,
      @Parameter(
              description = "knowledgeCenter document version number in the form `major`.`minor`",
              schema = @Schema(type = "string", example = "0.1 or 1.1"))
          @PathParam("version")
          String version) {
    return super.getVersionInternal(securityContext, id, version);
  }

  @POST
  @Operation(
      operationId = "createKnowledgeCenterDocument",
      summary = "Create a knowledgeCenter document",
      description = "Create a new knowledgeCenter document.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The knowledgeCenter document",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = KnowledgeCenterDocument.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response create(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateKnowledgeCenterDocument create) {
    KnowledgeCenterDocument document = getKnowledgeCenterDocument(create, securityContext.getUserPrincipal().getName());
    return create(uriInfo, securityContext, document);
  }

  @PATCH
  @Path("/{id}")
  @Operation(
      operationId = "patchKnowledgeCenterDocument",
      summary = "Update a knowledgeCenter document",
      description = "Update an existing knowledgeCenter document using JsonPatch.",
      externalDocs = @ExternalDocumentation(description = "JsonPatch RFC", url = "https://tools.ietf.org/html/rfc6902"))
  @Consumes(MediaType.APPLICATION_JSON_PATCH_JSON)
  public Response patch(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the knowledgeCenter document", schema = @Schema(type = "UUID")) @PathParam("id")
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

  @PUT
  @Operation(
      operationId = "createOrUpdateKnowledgeCenterDocument",
      summary = "Create or update a knowledgeCenter document",
      description =
          "Create a new knowledgeCenter document, if it does not exist or update an existing knowledgeCenter document.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The knowledgeCenter",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = KnowledgeCenterDocument.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response createOrUpdate(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateKnowledgeCenterDocument create) {
    KnowledgeCenterDocument document = getKnowledgeCenterDocument(create, securityContext.getUserPrincipal().getName());
    return createOrUpdate(uriInfo, securityContext, document);
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

  @PUT
  @Path("/{id}/assets/add")
  @Operation(
      operationId = "bulkAddKnowledgeCenterDocumentToAssets",
      summary = "Bulk Add KnowledgeCenter Document to Assets",
      description = "Bulk Add KnowledgeCenter Document to Assets",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = BulkOperationResult.class))),
        @ApiResponse(responseCode = "404", description = "model for instance {id} is not found")
      })
  public Response bulkAddKnowledgeCenterToAssets(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the Entity", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Valid AddKnowledgeCenterToAssetsRequest request) {
    return Response.ok().entity(repository.bulkAddAndValidateKnowledgeCenterToAssets(id, request)).build();
  }

  @PUT
  @Path("/{id}/tags/validate")
  @Operation(
      operationId = "validateKnowledgeCenterDocumentTagsAddition",
      summary = "Validate Tags Addition to KnowledgeCenter Document",
      description = "Validate Tags Addition to KnowledgeCenter Document",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = BulkOperationResult.class))),
        @ApiResponse(responseCode = "404", description = "model for instance {id} is not found")
      })
  public Response validateKnowledgeCenterDocumentTagsAddition(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the Entity", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Valid AddKnowledgeCenterToAssetsRequest request) {
    return Response.ok().entity(repository.validateKnowledgeCenterTagsAddition(id, request)).build();
  }

  @PUT
  @Path("/{id}/assets/remove")
  @Operation(
      operationId = "bulkRemoveKnowledgeCenterDocumentFromAssets",
      summary = "Bulk Remove KnowledgeCenter Document from Assets",
      description = "Bulk Remove KnowledgeCenter Document from Assets",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChangeEvent.class))),
        @ApiResponse(responseCode = "404", description = "model for instance {id} is not found")
      })
  public Response bulkRemoveKnowledgeCenterFromAssets(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the Entity", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Valid AddKnowledgeCenterToAssetsRequest request) {
    return Response.ok().entity(repository.bulkRemoveKnowledgeCenterToAssets(id, request)).build();
  }

  @DELETE
  @Path("/{id}")
  @Operation(
      summary = "Delete a knowledgeCenter document by Id",
      description = "Delete a knowledgeCenter document by `Id`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "knowledgeCenterDocument for instance {id} is not found")
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
      @Parameter(description = "Id of the knowledgeCenter document", schema = @Schema(type = "UUID")) @PathParam("id")
          UUID id) {
    return delete(uriInfo, securityContext, id, recursive, hardDelete);
  }

  @DELETE
  @Path("/name/{fqn}")
  @Operation(
      operationId = "deleteKnowledgeCenterDocumentByName",
      summary = "Delete a knowledgeCenter document by fully qualified name",
      description = "Delete a knowledgeCenter document by `fullyQualifiedName`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "knowledgeCenterDocument for instance {fqn} is not found")
      })
  public Response delete(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Hard delete the entity. (Default = `false`)")
          @QueryParam("hardDelete")
          @DefaultValue("false")
          boolean hardDelete,
      @Parameter(description = "Recursively delete this entity and it's children. (Default `false`)")
          @QueryParam("recursive")
          @DefaultValue("false")
          boolean recursive,
      @Parameter(
              description = "Fully qualified name of the knowledgeCenter document",
              schema = @Schema(type = "string"))
          @PathParam("fqn")
          String fqn) {
    return deleteByName(uriInfo, securityContext, fqn, recursive, hardDelete);
  }

  @PUT
  @Path("/restore")
  @Operation(
      operationId = "restore",
      summary = "Restore a soft deleted knowledgeCenter document",
      description = "Restore a soft deleted knowledgeCenter document.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Successfully restored the Chart ",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = KnowledgeCenterDocument.class)))
      })
  public Response restoreTable(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid RestoreEntity restore) {
    return restoreEntity(uriInfo, securityContext, restore.getId());
  }

  private KnowledgeCenterDocument getKnowledgeCenterDocument(CreateKnowledgeCenterDocument create, String user) {
    return repository
        .copy(new KnowledgeCenterDocument(), create, user)
        .withSynonyms(create.getSynonyms())
        .withStyle(create.getStyle())
        .withKnowledgeCenter(getEntityReference(Entity.KNOWLEDGE_CENTER, create.getKnowledgeCenter()))
        .withParent(getEntityReference(Entity.KNOWLEDGE_CENTER_DOCUMENT, create.getParent()))
        .withRelatedDocuments(getEntityReferences(Entity.KNOWLEDGE_CENTER_DOCUMENT, create.getRelatedDocuments()))
        .withReferences(create.getReferences())
        .withReviewers(getEntityReferences(Entity.USER, create.getReviewers()))
        .withTags(create.getTags())
        .withProvider(create.getProvider())
        .withMutuallyExclusive(create.getMutuallyExclusive())
        .withAgreementType(create.getAgreementType())
        .withAgreementOperator(create.getAgreementOperator())
        .withAgreementContact(create.getAgreementContact())
        .withAgreementValidity(create.getAgreementValidity());
  }
}
