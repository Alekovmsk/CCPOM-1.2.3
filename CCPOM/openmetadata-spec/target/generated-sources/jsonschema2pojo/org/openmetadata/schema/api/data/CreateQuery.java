
package org.openmetadata.schema.api.data;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateQueryRequest
 * <p>
 * Create Query Request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "owner",
    "tags",
    "query",
    "query_type",
    "exclude_usage",
    "duration",
    "users",
    "usedBy",
    "queryDate",
    "queryUsedIn",
    "triggeredBy",
    "processedLineage",
    "service"
})
@Generated("jsonschema2pojo")
public class CreateQuery implements CreateEntity
{

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()%]+$")
    @Size(min = 1, max = 128)
    private String name;
    /**
     * Display Name that identifies this query.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this query.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
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
     * Tags for this Query
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this Query")
    @Valid
    private List<TagLabel> tags = null;
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
     * How long did the query took to run in seconds.
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("How long did the query took to run in seconds.")
    private Double duration;
    /**
     * UserName of the user running the query.
     * 
     */
    @JsonProperty("users")
    @JsonPropertyDescription("UserName of the user running the query.")
    @Valid
    private List<String> users = new ArrayList<String>();
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
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("queryDate")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long queryDate;
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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("service")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String service;

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreateQuery withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this query.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this query.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateQuery withDisplayName(String displayName) {
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

    public CreateQuery withDescription(String description) {
        this.description = description;
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

    public CreateQuery withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Tags for this Query
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this Query
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateQuery withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public CreateQuery withQuery(String query) {
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

    public CreateQuery withQueryType(String queryType) {
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

    public CreateQuery withExcludeUsage(Boolean excludeUsage) {
        this.excludeUsage = excludeUsage;
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

    public CreateQuery withDuration(Double duration) {
        this.duration = duration;
        return this;
    }

    /**
     * UserName of the user running the query.
     * 
     */
    @JsonProperty("users")
    public List<String> getUsers() {
        return users;
    }

    /**
     * UserName of the user running the query.
     * 
     */
    @JsonProperty("users")
    public void setUsers(List<String> users) {
        this.users = users;
    }

    public CreateQuery withUsers(List<String> users) {
        this.users = users;
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

    public CreateQuery withUsedBy(Set<String> usedBy) {
        this.usedBy = usedBy;
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

    public CreateQuery withQueryDate(Long queryDate) {
        this.queryDate = queryDate;
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

    public CreateQuery withQueryUsedIn(List<EntityReference> queryUsedIn) {
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

    public CreateQuery withTriggeredBy(EntityReference triggeredBy) {
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

    public CreateQuery withProcessedLineage(Boolean processedLineage) {
        this.processedLineage = processedLineage;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public String getService() {
        return service;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public void setService(String service) {
        this.service = service;
    }

    public CreateQuery withService(String service) {
        this.service = service;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateQuery.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
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
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("users");
        sb.append('=');
        sb.append(((this.users == null)?"<null>":this.users));
        sb.append(',');
        sb.append("usedBy");
        sb.append('=');
        sb.append(((this.usedBy == null)?"<null>":this.usedBy));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.queryUsedIn == null)? 0 :this.queryUsedIn.hashCode()));
        result = ((result* 31)+((this.excludeUsage == null)? 0 :this.excludeUsage.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.query == null)? 0 :this.query.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.users == null)? 0 :this.users.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.queryType == null)? 0 :this.queryType.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.processedLineage == null)? 0 :this.processedLineage.hashCode()));
        result = ((result* 31)+((this.usedBy == null)? 0 :this.usedBy.hashCode()));
        result = ((result* 31)+((this.triggeredBy == null)? 0 :this.triggeredBy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateQuery) == false) {
            return false;
        }
        CreateQuery rhs = ((CreateQuery) other);
        return (((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.queryUsedIn == rhs.queryUsedIn)||((this.queryUsedIn!= null)&&this.queryUsedIn.equals(rhs.queryUsedIn))))&&((this.excludeUsage == rhs.excludeUsage)||((this.excludeUsage!= null)&&this.excludeUsage.equals(rhs.excludeUsage))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.query == rhs.query)||((this.query!= null)&&this.query.equals(rhs.query))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.users == rhs.users)||((this.users!= null)&&this.users.equals(rhs.users))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.queryType == rhs.queryType)||((this.queryType!= null)&&this.queryType.equals(rhs.queryType))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.processedLineage == rhs.processedLineage)||((this.processedLineage!= null)&&this.processedLineage.equals(rhs.processedLineage))))&&((this.usedBy == rhs.usedBy)||((this.usedBy!= null)&&this.usedBy.equals(rhs.usedBy))))&&((this.triggeredBy == rhs.triggeredBy)||((this.triggeredBy!= null)&&this.triggeredBy.equals(rhs.triggeredBy))));
    }

}
