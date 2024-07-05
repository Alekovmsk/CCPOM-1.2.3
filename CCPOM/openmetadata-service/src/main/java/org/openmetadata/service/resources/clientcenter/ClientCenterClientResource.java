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

import static org.openmetadata.service.Entity.ADMIN_USER_NAME;
import static org.openmetadata.service.Entity.CLIENT_CENTER;

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
import org.openmetadata.schema.api.AddClientCenterToAssetsRequest;
import org.openmetadata.schema.api.VoteRequest;
import org.openmetadata.schema.api.data.CreateClientCenterClient;
import org.openmetadata.schema.api.data.LoadClientCenter;
import org.openmetadata.schema.api.data.RestoreEntity;
import org.openmetadata.schema.entity.data.ClientCenter;
import org.openmetadata.schema.entity.data.ClientCenterClient;
import org.openmetadata.schema.type.ChangeEvent;
import org.openmetadata.schema.type.EntityHistory;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.Include;
import org.openmetadata.schema.type.MetadataOperation;
import org.openmetadata.schema.type.api.BulkOperationResult;
import org.openmetadata.service.Entity;
import org.openmetadata.service.OpenMetadataApplicationConfig;
import org.openmetadata.service.exception.CatalogExceptionMessage;
import org.openmetadata.service.jdbi3.ClientCenterClientRepository;
import org.openmetadata.service.jdbi3.ClientCenterRepository;
import org.openmetadata.service.jdbi3.EntityRepository;
import org.openmetadata.service.jdbi3.ListFilter;
import org.openmetadata.service.resources.Collection;
import org.openmetadata.service.resources.EntityResource;
import org.openmetadata.service.security.Authorizer;
import org.openmetadata.service.util.EntityUtil;
import org.openmetadata.service.util.EntityUtil.Fields;
import org.openmetadata.service.util.RestUtil;
import org.openmetadata.service.util.ResultList;

@Path("/v1/clientCenterClients")
@Tag(name = "ClientCenters", description = "A `ClientCenter` is collection of hierarchical `ClientCenterClients`.")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Collection(name = "clientCenterClients", order = 7) // Initialized after ClientCenter, Classification, and Tags
public class ClientCenterClientResource extends EntityResource<ClientCenterClient, ClientCenterClientRepository> {
  public static final String COLLECTION_PATH = "v1/clientCenterClients/";
  static final String FIELDS = "children,relatedClients,reviewers,owner,tags,usageCount,domain,extension";

  @Override
  public ClientCenterClient addHref(UriInfo uriInfo, ClientCenterClient client) {
    super.addHref(uriInfo, client);
    Entity.withHref(uriInfo, client.getClientCenter());
    Entity.withHref(uriInfo, client.getParent());
    Entity.withHref(uriInfo, client.getRelatedClients());
    return client;
  }

  public ClientCenterClientResource(Authorizer authorizer) {
    super(Entity.CLIENT_CENTER_CLIENT, authorizer);
  }

  @Override
  protected List<MetadataOperation> getEntitySpecificOperations() {
    addViewOperation("children,relatedClients,reviewers,usageCount", MetadataOperation.VIEW_BASIC);
    return null;
  }

  public static class ClientCenterClientList extends ResultList<ClientCenterClient> {
    /* Required for serde */
  }

  @Override
  public void initialize(OpenMetadataApplicationConfig config) throws IOException {
    super.initialize(config);
    // Load ClientCenters provided by OpenMetadata
    ClientCenterRepository clientCenterRepository = (ClientCenterRepository) Entity.getEntityRepository(CLIENT_CENTER);
    List<LoadClientCenter> loadClientCenters =
        EntityRepository.getEntitiesFromSeedData(
            CLIENT_CENTER, ".*json/data/clientCenter/.*ClientCenter\\.json$", LoadClientCenter.class);
    for (LoadClientCenter loadClientCenter : loadClientCenters) {
      ClientCenter clientCenter =
          ClientCenterResource.getClientCenter(
              clientCenterRepository, loadClientCenter.getCreateClientCenter(), ADMIN_USER_NAME);
      clientCenter.setFullyQualifiedName(clientCenter.getName());
      clientCenterRepository.initializeEntity(clientCenter);

      List<ClientCenterClient> clientsToCreate = new ArrayList<>();
      for (CreateClientCenterClient createClient : loadClientCenter.getCreateClients()) {
        createClient.withClientCenter(clientCenter.getName());
        createClient.withProvider(clientCenter.getProvider());
        ClientCenterClient client = getClientCenterClient(createClient, ADMIN_USER_NAME);
        repository.setFullyQualifiedName(client); // FQN required for ordering tags based on hierarchy
        clientsToCreate.add(client);
      }

      // Sort tags based on tag hierarchy
      EntityUtil.sortByFQN(clientsToCreate);

      for (ClientCenterClient client : clientsToCreate) {
        repository.initializeEntity(client);
      }
    }
  }

  @GET
  @Valid
  @Operation(
      operationId = "listClientCenterClient",
      summary = "List clientCenter clients",
      description =
          "Get a list of clientCenter clients. Use `fields` parameter to get only necessary fields. "
              + " Use cursor-based pagination to limit the number "
              + "entries in the list using `limit` and `before` or `after` query params.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of clientCenter clients",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ClientCenterClientList.class)))
      })
  public ResultList<ClientCenterClient> list(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(
              description =
                  "List clientCenter clients filtered by clientCenter identified by Id given in `clientCenter` parameter.",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("clientCenter")
          String clientCenterIdParam,
      @Parameter(
              description =
                  "List clientCenter clients filtered by children of clientCenter client identified by Id given in "
                      + "`parent` parameter.",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("parent")
          UUID parentClientParam,
      @Parameter(
              description = "Fields requested in the returned resource",
              schema = @Schema(type = "string", example = FIELDS))
          @QueryParam("fields")
          String fieldsParam,
      @Parameter(description = "Limit the number clientCenter clients returned. (1 to 1000000, " + "default = 10)")
          @DefaultValue("10")
          @Min(0)
          @Max(1000000)
          @QueryParam("limit")
          int limitParam,
      @Parameter(
              description = "Returns list of clientCenter clients before this cursor",
              schema = @Schema(type = "string"))
          @QueryParam("before")
          String before,
      @Parameter(
              description = "Returns list of clientCenter clients after this cursor",
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

    // Filter by clientCenter
    String fqn = null;
    EntityReference clientCenter = null;
    if (clientCenterIdParam != null) {
      clientCenter = repository.getClientCenter(clientCenterIdParam);
      fqn = clientCenter.getFullyQualifiedName();
    }

    // Filter by clientCenter parent client
    if (parentClientParam != null) {
      ClientCenterClient parentClient = repository.find(parentClientParam, Include.NON_DELETED);
      fqn = parentClient.getFullyQualifiedName();

      // Ensure parent clientCenter client belongs to the clientCenter
      if ((clientCenter != null) && (!parentClient.getClientCenter().getId().equals(clientCenter.getId()))) {
        throw new IllegalArgumentException(
            CatalogExceptionMessage.clientCenterClientMismatch(parentClientParam.toString(), clientCenterIdParam));
      }
    }
    ListFilter filter = new ListFilter(include).addQueryParam("parent", fqn);

    ResultList<ClientCenterClient> clients;
    if (before != null) { // Reverse paging
      clients = repository.listBefore(uriInfo, fields, filter, limitParam, before); // Ask for one extra entry
    } else { // Forward paging or first page
      clients = repository.listAfter(uriInfo, fields, filter, limitParam, after);
    }
    return addHref(uriInfo, clients);
  }

  @GET
  @Path("/{id}")
  @Operation(
      operationId = "getClientCenterClientByID",
      summary = "Get a clientCenter client by Id",
      description = "Get a clientCenter client by `Id`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The clientCenter client",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenter.class))),
        @ApiResponse(responseCode = "404", description = "ClientCenter for instance {id} is not found")
      })
  public ClientCenterClient get(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the clientCenter client", schema = @Schema(type = "UUID")) @PathParam("id")
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
      operationId = "getClientCenterClientByFQN",
      summary = "Get a clientCenter client by fully qualified name",
      description = "Get a clientCenter client by `fullyQualifiedName`.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The clientCenter client",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenter.class))),
        @ApiResponse(responseCode = "404", description = "ClientCenter for instance {fqn} is not found")
      })
  public ClientCenterClient getByName(
      @Context UriInfo uriInfo,
      @Parameter(description = "Fully qualified name of the clientCenter client", schema = @Schema(type = "string"))
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
      operationId = "listAllClientCenterClientVersion",
      summary = "List clientCenter client versions",
      description = "Get a list of all the versions of a clientCenter clients identified by `id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "List of clientCenter client versions",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityHistory.class)))
      })
  public EntityHistory listVersions(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the clientCenter client", schema = @Schema(type = "UUID")) @PathParam("id")
          UUID id) {
    return super.listVersionsInternal(securityContext, id);
  }

  @GET
  @Path("/{id}/versions/{version}")
  @Operation(
      operationId = "getSpecificClientCenterClientVersion",
      summary = "Get a version of the clientCenter client",
      description = "Get a version of the clientCenter client by given `Id`",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "ClientCenters",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenter.class))),
        @ApiResponse(
            responseCode = "404",
            description = "ClientCenter for instance {id} and version {version} is " + "not found")
      })
  public ClientCenterClient getVersion(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the clientCenter client", schema = @Schema(type = "UUID")) @PathParam("id")
          UUID id,
      @Parameter(
              description = "clientCenter client version number in the form `major`.`minor`",
              schema = @Schema(type = "string", example = "0.1 or 1.1"))
          @PathParam("version")
          String version) {
    return super.getVersionInternal(securityContext, id, version);
  }

  @POST
  @Operation(
      operationId = "createClientCenterClient",
      summary = "Create a clientCenter client",
      description = "Create a new clientCenter client.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The clientCenter client",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenterClient.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response create(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateClientCenterClient create) {
    ClientCenterClient client = getClientCenterClient(create, securityContext.getUserPrincipal().getName());
    return create(uriInfo, securityContext, client);
  }

  @PATCH
  @Path("/{id}")
  @Operation(
      operationId = "patchClientCenterClient",
      summary = "Update a clientCenter client",
      description = "Update an existing clientCenter client using JsonPatch.",
      externalDocs = @ExternalDocumentation(description = "JsonPatch RFC", url = "https://tools.ietf.org/html/rfc6902"))
  @Consumes(MediaType.APPLICATION_JSON_PATCH_JSON)
  public Response patch(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the clientCenter client", schema = @Schema(type = "UUID")) @PathParam("id")
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
      operationId = "createOrUpdateClientCenterClient",
      summary = "Create or update a clientCenter client",
      description = "Create a new clientCenter client, if it does not exist or update an existing clientCenter client.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "The clientCenter",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenterClient.class))),
        @ApiResponse(responseCode = "400", description = "Bad request")
      })
  public Response createOrUpdate(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid CreateClientCenterClient create) {
    ClientCenterClient client = getClientCenterClient(create, securityContext.getUserPrincipal().getName());
    return createOrUpdate(uriInfo, securityContext, client);
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
      operationId = "bulkAddClientCenterClientToAssets",
      summary = "Bulk Add ClientCenter Client to Assets",
      description = "Bulk Add ClientCenter Client to Assets",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = BulkOperationResult.class))),
        @ApiResponse(responseCode = "404", description = "model for instance {id} is not found")
      })
  public Response bulkAddClientCenterToAssets(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the Entity", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Valid AddClientCenterToAssetsRequest request) {
    return Response.ok().entity(repository.bulkAddAndValidateClientCenterToAssets(id, request)).build();
  }

  @PUT
  @Path("/{id}/tags/validate")
  @Operation(
      operationId = "validateClientCenterClientTagsAddition",
      summary = "Validate Tags Addition to ClientCenter Client",
      description = "Validate Tags Addition to ClientCenter Client",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = BulkOperationResult.class))),
        @ApiResponse(responseCode = "404", description = "model for instance {id} is not found")
      })
  public Response validateClientCenterClientTagsAddition(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the Entity", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Valid AddClientCenterToAssetsRequest request) {
    return Response.ok().entity(repository.validateClientCenterTagsAddition(id, request)).build();
  }

  @PUT
  @Path("/{id}/assets/remove")
  @Operation(
      operationId = "bulkRemoveClientCenterClientFromAssets",
      summary = "Bulk Remove ClientCenter Client from Assets",
      description = "Bulk Remove ClientCenter Client from Assets",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChangeEvent.class))),
        @ApiResponse(responseCode = "404", description = "model for instance {id} is not found")
      })
  public Response bulkRemoveClientCenterFromAssets(
      @Context UriInfo uriInfo,
      @Context SecurityContext securityContext,
      @Parameter(description = "Id of the Entity", schema = @Schema(type = "UUID")) @PathParam("id") UUID id,
      @Valid AddClientCenterToAssetsRequest request) {
    return Response.ok().entity(repository.bulkRemoveClientCenterToAssets(id, request)).build();
  }

  @DELETE
  @Path("/{id}")
  @Operation(
      summary = "Delete a clientCenter client by Id",
      description = "Delete a clientCenter client by `Id`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "clientCenterClient for instance {id} is not found")
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
      @Parameter(description = "Id of the clientCenter client", schema = @Schema(type = "UUID")) @PathParam("id")
          UUID id) {
    return delete(uriInfo, securityContext, id, recursive, hardDelete);
  }

  @DELETE
  @Path("/name/{fqn}")
  @Operation(
      operationId = "deleteClientCenterClientByName",
      summary = "Delete a clientCenter client by fully qualified name",
      description = "Delete a clientCenter client by `fullyQualifiedName`.",
      responses = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "404", description = "clientCenterClient for instance {fqn} is not found")
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
      @Parameter(description = "Fully qualified name of the clientCenter client", schema = @Schema(type = "string"))
          @PathParam("fqn")
          String fqn) {
    return deleteByName(uriInfo, securityContext, fqn, recursive, hardDelete);
  }

  @PUT
  @Path("/restore")
  @Operation(
      operationId = "restore",
      summary = "Restore a soft deleted clientCenter client",
      description = "Restore a soft deleted clientCenter client.",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Successfully restored the Chart ",
            content =
                @Content(mediaType = "application/json", schema = @Schema(implementation = ClientCenterClient.class)))
      })
  public Response restoreTable(
      @Context UriInfo uriInfo, @Context SecurityContext securityContext, @Valid RestoreEntity restore) {
    return restoreEntity(uriInfo, securityContext, restore.getId());
  }

  private ClientCenterClient getClientCenterClient(CreateClientCenterClient create, String user) {
    return repository
        .copy(new ClientCenterClient(), create, user)
        .withSynonyms(create.getSynonyms())
        .withStyle(create.getStyle())
        .withClientCenter(getEntityReference(Entity.CLIENT_CENTER, create.getClientCenter()))
        .withParent(getEntityReference(Entity.CLIENT_CENTER_CLIENT, create.getParent()))
        .withRelatedClients(getEntityReferences(Entity.CLIENT_CENTER_CLIENT, create.getRelatedClients()))
        .withReferences(create.getReferences())
        .withReviewers(getEntityReferences(Entity.USER, create.getReviewers()))
        .withTags(create.getTags())
        .withProvider(create.getProvider())
        .withMutuallyExclusive(create.getMutuallyExclusive())
        .withFullName(create.getFullName())
        .withDateOfBirth(create.getDateOfBirth())
        .withInn(create.getInn())
        .withSnils(create.getSnils());
  }
}
