
package org.openmetadata.schema.entity.data;

import java.net.URI;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadata.schema.EntityInterface;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TagLabel;
import org.openmetadata.schema.type.Votes;


/**
 * Query
 * <p>
 * This schema defines the type to capture any data asset's queries.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "fullyQualifiedName",
    "displayName",
    "description",
    "version",
    "updatedAt",
    "updatedBy",
    "href",
    "changeDescription",
    "owner",
    "duration",
    "users",
    "followers",
    "votes",
    "query",
    "query_type",
    "exclude_usage",
    "checksum",
    "queryDate",
    "usedBy",
    "tags",
    "queryUsedIn",
    "triggeredBy",
    "processedLineage",
    "service"
})
@Generated("jsonschema2pojo")
public class Query implements EntityInterface
{

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()%]+$")
    @Size(min = 1, max = 128)
    @NotNull
    private String name;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Display Name that identifies this Query. It could be title or label.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this Query. It could be title or label.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.")
    private Double version = 0.1D;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long updatedAt;
    /**
     * User who made the query.
     * 
     */
    @JsonProperty("updatedBy")
    @JsonPropertyDescription("User who made the query.")
    private String updatedBy;
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;
    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    @JsonPropertyDescription("Description of the change.")
    @Valid
    private ChangeDescription changeDescription;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference owner;
    /**
     * How long did the query took to run in seconds.
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("How long did the query took to run in seconds.")
    private Double duration;
    /**
     * List of users who ran this query.
     * 
     */
    @JsonProperty("users")
    @JsonPropertyDescription("List of users who ran this query.")
    @Valid
    private List<EntityReference> users = null;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("followers")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> followers = null;
    /**
     * Votes
     * <p>
     * This schema defines the Votes for a Data Asset.
     * 
     */
    @JsonProperty("votes")
    @JsonPropertyDescription("This schema defines the Votes for a Data Asset.")
    @Valid
    private Votes votes;
    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("query")
    @JsonPropertyDescription("SQL query statement. Example - 'select * from orders'.")
    @NotNull
    private String query;
    /**
     * SQL query type
     * 
     */
    @JsonProperty("query_type")
    @JsonPropertyDescription("SQL query type")
    private String queryType;
    /**
     * Flag to check if query is to be excluded while processing usage
     * 
     */
    @JsonProperty("exclude_usage")
    @JsonPropertyDescription("Flag to check if query is to be excluded while processing usage")
    private Boolean excludeUsage;
    /**
     * Checksum to avoid registering duplicate queries.
     * 
     */
    @JsonProperty("checksum")
    @JsonPropertyDescription("Checksum to avoid registering duplicate queries.")
    private String checksum;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("queryDate")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long queryDate;
    /**
     * List of users who ran the query but does not exist in OpenMetadata.
     * 
     */
    @JsonProperty("usedBy")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of users who ran the query but does not exist in OpenMetadata.")
    @Valid
    private Set<String> usedBy = new LinkedHashSet<String>();
    /**
     * Tags for this SQL query.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this SQL query.")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("queryUsedIn")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> queryUsedIn = null;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("triggeredBy")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference triggeredBy;
    /**
     * Flag if this query has already been successfully processed for lineage
     * 
     */
    @JsonProperty("processedLineage")
    @JsonPropertyDescription("Flag if this query has already been successfully processed for lineage")
    private Boolean processedLineage = false;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("service")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference service;

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    public Query withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Query withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public Query withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Display Name that identifies this Query. It could be title or label.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this Query. It could be title or label.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Query withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Query withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    public Double getVersion() {
        return version;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    public void setVersion(Double version) {
        this.version = version;
    }

    public Query withVersion(Double version) {
        this.version = version;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    public Long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Query withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * User who made the query.
     * 
     */
    @JsonProperty("updatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * User who made the query.
     * 
     */
    @JsonProperty("updatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Query withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    public URI getHref() {
        return href;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    public void setHref(URI href) {
        this.href = href;
    }

    public Query withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    public ChangeDescription getChangeDescription() {
        return changeDescription;
    }

    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    public void setChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
    }

    public Query withChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    public EntityReference getOwner() {
        return owner;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    public void setOwner(EntityReference owner) {
        this.owner = owner;
    }

    public Query withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * How long did the query took to run in seconds.
     * 
     */
    @JsonProperty("duration")
    public Double getDuration() {
        return duration;
    }

    /**
     * How long did the query took to run in seconds.
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Query withDuration(Double duration) {
        this.duration = duration;
        return this;
    }

    /**
     * List of users who ran this query.
     * 
     */
    @JsonProperty("users")
    public List<EntityReference> getUsers() {
        return users;
    }

    /**
     * List of users who ran this query.
     * 
     */
    @JsonProperty("users")
    public void setUsers(List<EntityReference> users) {
        this.users = users;
    }

    public Query withUsers(List<EntityReference> users) {
        this.users = users;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("followers")
    public List<EntityReference> getFollowers() {
        return followers;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("followers")
    public void setFollowers(List<EntityReference> followers) {
        this.followers = followers;
    }

    public Query withFollowers(List<EntityReference> followers) {
        this.followers = followers;
        return this;
    }

    /**
     * Votes
     * <p>
     * This schema defines the Votes for a Data Asset.
     * 
     */
    @JsonProperty("votes")
    public Votes getVotes() {
        return votes;
    }

    /**
     * Votes
     * <p>
     * This schema defines the Votes for a Data Asset.
     * 
     */
    @JsonProperty("votes")
    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    public Query withVotes(Votes votes) {
        this.votes = votes;
        return this;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    public Query withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * SQL query type
     * 
     */
    @JsonProperty("query_type")
    public String getQueryType() {
        return queryType;
    }

    /**
     * SQL query type
     * 
     */
    @JsonProperty("query_type")
    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public Query withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * Flag to check if query is to be excluded while processing usage
     * 
     */
    @JsonProperty("exclude_usage")
    public Boolean getExcludeUsage() {
        return excludeUsage;
    }

    /**
     * Flag to check if query is to be excluded while processing usage
     * 
     */
    @JsonProperty("exclude_usage")
    public void setExcludeUsage(Boolean excludeUsage) {
        this.excludeUsage = excludeUsage;
    }

    public Query withExcludeUsage(Boolean excludeUsage) {
        this.excludeUsage = excludeUsage;
        return this;
    }

    /**
     * Checksum to avoid registering duplicate queries.
     * 
     */
    @JsonProperty("checksum")
    public String getChecksum() {
        return checksum;
    }

    /**
     * Checksum to avoid registering duplicate queries.
     * 
     */
    @JsonProperty("checksum")
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public Query withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("queryDate")
    public Long getQueryDate() {
        return queryDate;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(Long queryDate) {
        this.queryDate = queryDate;
    }

    public Query withQueryDate(Long queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * List of users who ran the query but does not exist in OpenMetadata.
     * 
     */
    @JsonProperty("usedBy")
    public Set<String> getUsedBy() {
        return usedBy;
    }

    /**
     * List of users who ran the query but does not exist in OpenMetadata.
     * 
     */
    @JsonProperty("usedBy")
    public void setUsedBy(Set<String> usedBy) {
        this.usedBy = usedBy;
    }

    public Query withUsedBy(Set<String> usedBy) {
        this.usedBy = usedBy;
        return this;
    }

    /**
     * Tags for this SQL query.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this SQL query.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public Query withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("queryUsedIn")
    public List<EntityReference> getQueryUsedIn() {
        return queryUsedIn;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("queryUsedIn")
    public void setQueryUsedIn(List<EntityReference> queryUsedIn) {
        this.queryUsedIn = queryUsedIn;
    }

    public Query withQueryUsedIn(List<EntityReference> queryUsedIn) {
        this.queryUsedIn = queryUsedIn;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("triggeredBy")
    public EntityReference getTriggeredBy() {
        return triggeredBy;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("triggeredBy")
    public void setTriggeredBy(EntityReference triggeredBy) {
        this.triggeredBy = triggeredBy;
    }

    public Query withTriggeredBy(EntityReference triggeredBy) {
        this.triggeredBy = triggeredBy;
        return this;
    }

    /**
     * Flag if this query has already been successfully processed for lineage
     * 
     */
    @JsonProperty("processedLineage")
    public Boolean getProcessedLineage() {
        return processedLineage;
    }

    /**
     * Flag if this query has already been successfully processed for lineage
     * 
     */
    @JsonProperty("processedLineage")
    public void setProcessedLineage(Boolean processedLineage) {
        this.processedLineage = processedLineage;
    }

    public Query withProcessedLineage(Boolean processedLineage) {
        this.processedLineage = processedLineage;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public EntityReference getService() {
        return service;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public void setService(EntityReference service) {
        this.service = service;
    }

    public Query withService(EntityReference service) {
        this.service = service;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Query.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("changeDescription");
        sb.append('=');
        sb.append(((this.changeDescription == null)?"<null>":this.changeDescription));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("users");
        sb.append('=');
        sb.append(((this.users == null)?"<null>":this.users));
        sb.append(',');
        sb.append("followers");
        sb.append('=');
        sb.append(((this.followers == null)?"<null>":this.followers));
        sb.append(',');
        sb.append("votes");
        sb.append('=');
        sb.append(((this.votes == null)?"<null>":this.votes));
        sb.append(',');
        sb.append("query");
        sb.append('=');
        sb.append(((this.query == null)?"<null>":this.query));
        sb.append(',');
        sb.append("queryType");
        sb.append('=');
        sb.append(((this.queryType == null)?"<null>":this.queryType));
        sb.append(',');
        sb.append("excludeUsage");
        sb.append('=');
        sb.append(((this.excludeUsage == null)?"<null>":this.excludeUsage));
        sb.append(',');
        sb.append("checksum");
        sb.append('=');
        sb.append(((this.checksum == null)?"<null>":this.checksum));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("usedBy");
        sb.append('=');
        sb.append(((this.usedBy == null)?"<null>":this.usedBy));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("queryUsedIn");
        sb.append('=');
        sb.append(((this.queryUsedIn == null)?"<null>":this.queryUsedIn));
        sb.append(',');
        sb.append("triggeredBy");
        sb.append('=');
        sb.append(((this.triggeredBy == null)?"<null>":this.triggeredBy));
        sb.append(',');
        sb.append("processedLineage");
        sb.append('=');
        sb.append(((this.processedLineage == null)?"<null>":this.processedLineage));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.queryUsedIn == null)? 0 :this.queryUsedIn.hashCode()));
        result = ((result* 31)+((this.excludeUsage == null)? 0 :this.excludeUsage.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.checksum == null)? 0 :this.checksum.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.usedBy == null)? 0 :this.usedBy.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.query == null)? 0 :this.query.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.users == null)? 0 :this.users.hashCode()));
        result = ((result* 31)+((this.queryType == null)? 0 :this.queryType.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.followers == null)? 0 :this.followers.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.processedLineage == null)? 0 :this.processedLineage.hashCode()));
        result = ((result* 31)+((this.votes == null)? 0 :this.votes.hashCode()));
        result = ((result* 31)+((this.triggeredBy == null)? 0 :this.triggeredBy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Query) == false) {
            return false;
        }
        Query rhs = ((Query) other);
        return (((((((((((((((((((((((((((this.queryUsedIn == rhs.queryUsedIn)||((this.queryUsedIn!= null)&&this.queryUsedIn.equals(rhs.queryUsedIn)))&&((this.excludeUsage == rhs.excludeUsage)||((this.excludeUsage!= null)&&this.excludeUsage.equals(rhs.excludeUsage))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.checksum == rhs.checksum)||((this.checksum!= null)&&this.checksum.equals(rhs.checksum))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.usedBy == rhs.usedBy)||((this.usedBy!= null)&&this.usedBy.equals(rhs.usedBy))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.query == rhs.query)||((this.query!= null)&&this.query.equals(rhs.query))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.users == rhs.users)||((this.users!= null)&&this.users.equals(rhs.users))))&&((this.queryType == rhs.queryType)||((this.queryType!= null)&&this.queryType.equals(rhs.queryType))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.followers == rhs.followers)||((this.followers!= null)&&this.followers.equals(rhs.followers))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.processedLineage == rhs.processedLineage)||((this.processedLineage!= null)&&this.processedLineage.equals(rhs.processedLineage))))&&((this.votes == rhs.votes)||((this.votes!= null)&&this.votes.equals(rhs.votes))))&&((this.triggeredBy == rhs.triggeredBy)||((this.triggeredBy!= null)&&this.triggeredBy.equals(rhs.triggeredBy))));
    }

}
