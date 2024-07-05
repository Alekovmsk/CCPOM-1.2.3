
package org.openmetadata.schema.api.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.LifeCycle;
import org.openmetadata.schema.type.TagLabel;
import org.openmetadata.schema.type.Task;


/**
 * CreatePipelineRequest
 * <p>
 * Create Pipeline entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "dataProducts",
    "sourceUrl",
    "concurrency",
    "pipelineLocation",
    "startDate",
    "tasks",
    "tags",
    "owner",
    "service",
    "extension",
    "scheduleInterval",
    "domain",
    "lifeCycle",
    "sourceHash"
})
@Generated("jsonschema2pojo")
public class CreatePipeline implements CreateEntity
{

    /**
     * Name of a pipeline. Expected to be unique within a pipeline service.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of a pipeline. Expected to be unique within a pipeline service.")
    @Pattern(regexp = "^((?!::).)*$")
    @Size(min = 1, max = 128)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this Pipeline. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this Pipeline. It could be title or label from the source services.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    @JsonPropertyDescription("List of fully qualified names of data products this entity is part of.")
    @Valid
    private List<String> dataProducts = new ArrayList<String>();
    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    @JsonPropertyDescription("Source Url of the respective entity.")
    private String sourceUrl;
    /**
     * Concurrency of the Pipeline
     * 
     */
    @JsonProperty("concurrency")
    @JsonPropertyDescription("Concurrency of the Pipeline")
    private Integer concurrency;
    /**
     * Pipeline Code Location
     * 
     */
    @JsonProperty("pipelineLocation")
    @JsonPropertyDescription("Pipeline Code Location")
    private String pipelineLocation;
    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.")
    private Date startDate;
    /**
     * All the tasks that are part of pipeline.
     * 
     */
    @JsonProperty("tasks")
    @JsonPropertyDescription("All the tasks that are part of pipeline.")
    @Valid
    private List<Task> tasks = null;
    /**
     * Tags for this Pipeline.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this Pipeline.")
    @Valid
    private List<TagLabel> tags = null;
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
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("Entity extension data with custom attributes added to the entity.")
    private Object extension;
    /**
     * Scheduler Interval for the pipeline in cron format.
     * 
     */
    @JsonProperty("scheduleInterval")
    @JsonPropertyDescription("Scheduler Interval for the pipeline in cron format.")
    private String scheduleInterval = null;
    /**
     * Fully qualified name of the domain the Pipeline belongs to.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("Fully qualified name of the domain the Pipeline belongs to.")
    private String domain;
    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    @JsonPropertyDescription("This schema defines Life Cycle Properties.")
    @Valid
    private LifeCycle lifeCycle;
    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    @JsonPropertyDescription("Source hash of the entity")
    @Size(min = 1, max = 32)
    private String sourceHash;

    /**
     * Name of a pipeline. Expected to be unique within a pipeline service.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of a pipeline. Expected to be unique within a pipeline service.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreatePipeline withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this Pipeline. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this Pipeline. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreatePipeline withDisplayName(String displayName) {
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

    public CreatePipeline withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    public List<String> getDataProducts() {
        return dataProducts;
    }

    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    public void setDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
    }

    public CreatePipeline withDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
        return this;
    }

    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public CreatePipeline withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * Concurrency of the Pipeline
     * 
     */
    @JsonProperty("concurrency")
    public Integer getConcurrency() {
        return concurrency;
    }

    /**
     * Concurrency of the Pipeline
     * 
     */
    @JsonProperty("concurrency")
    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    public CreatePipeline withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    /**
     * Pipeline Code Location
     * 
     */
    @JsonProperty("pipelineLocation")
    public String getPipelineLocation() {
        return pipelineLocation;
    }

    /**
     * Pipeline Code Location
     * 
     */
    @JsonProperty("pipelineLocation")
    public void setPipelineLocation(String pipelineLocation) {
        this.pipelineLocation = pipelineLocation;
    }

    public CreatePipeline withPipelineLocation(String pipelineLocation) {
        this.pipelineLocation = pipelineLocation;
        return this;
    }

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public CreatePipeline withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * All the tasks that are part of pipeline.
     * 
     */
    @JsonProperty("tasks")
    public List<Task> getTasks() {
        return tasks;
    }

    /**
     * All the tasks that are part of pipeline.
     * 
     */
    @JsonProperty("tasks")
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public CreatePipeline withTasks(List<Task> tasks) {
        this.tasks = tasks;
        return this;
    }

    /**
     * Tags for this Pipeline.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this Pipeline.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreatePipeline withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public CreatePipeline withOwner(EntityReference owner) {
        this.owner = owner;
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

    public CreatePipeline withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public Object getExtension() {
        return extension;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(Object extension) {
        this.extension = extension;
    }

    public CreatePipeline withExtension(Object extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Scheduler Interval for the pipeline in cron format.
     * 
     */
    @JsonProperty("scheduleInterval")
    public String getScheduleInterval() {
        return scheduleInterval;
    }

    /**
     * Scheduler Interval for the pipeline in cron format.
     * 
     */
    @JsonProperty("scheduleInterval")
    public void setScheduleInterval(String scheduleInterval) {
        this.scheduleInterval = scheduleInterval;
    }

    public CreatePipeline withScheduleInterval(String scheduleInterval) {
        this.scheduleInterval = scheduleInterval;
        return this;
    }

    /**
     * Fully qualified name of the domain the Pipeline belongs to.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Fully qualified name of the domain the Pipeline belongs to.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreatePipeline withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    public LifeCycle getLifeCycle() {
        return lifeCycle;
    }

    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    public void setLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public CreatePipeline withLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }

    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    public String getSourceHash() {
        return sourceHash;
    }

    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    public void setSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
    }

    public CreatePipeline withSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreatePipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("dataProducts");
        sb.append('=');
        sb.append(((this.dataProducts == null)?"<null>":this.dataProducts));
        sb.append(',');
        sb.append("sourceUrl");
        sb.append('=');
        sb.append(((this.sourceUrl == null)?"<null>":this.sourceUrl));
        sb.append(',');
        sb.append("concurrency");
        sb.append('=');
        sb.append(((this.concurrency == null)?"<null>":this.concurrency));
        sb.append(',');
        sb.append("pipelineLocation");
        sb.append('=');
        sb.append(((this.pipelineLocation == null)?"<null>":this.pipelineLocation));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("tasks");
        sb.append('=');
        sb.append(((this.tasks == null)?"<null>":this.tasks));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("scheduleInterval");
        sb.append('=');
        sb.append(((this.scheduleInterval == null)?"<null>":this.scheduleInterval));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("lifeCycle");
        sb.append('=');
        sb.append(((this.lifeCycle == null)?"<null>":this.lifeCycle));
        sb.append(',');
        sb.append("sourceHash");
        sb.append('=');
        sb.append(((this.sourceHash == null)?"<null>":this.sourceHash));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.dataProducts == null)? 0 :this.dataProducts.hashCode()));
        result = ((result* 31)+((this.concurrency == null)? 0 :this.concurrency.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.sourceUrl == null)? 0 :this.sourceUrl.hashCode()));
        result = ((result* 31)+((this.scheduleInterval == null)? 0 :this.scheduleInterval.hashCode()));
        result = ((result* 31)+((this.sourceHash == null)? 0 :this.sourceHash.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.pipelineLocation == null)? 0 :this.pipelineLocation.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.lifeCycle == null)? 0 :this.lifeCycle.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.tasks == null)? 0 :this.tasks.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreatePipeline) == false) {
            return false;
        }
        CreatePipeline rhs = ((CreatePipeline) other);
        return ((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.concurrency == rhs.concurrency)||((this.concurrency!= null)&&this.concurrency.equals(rhs.concurrency))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.sourceUrl == rhs.sourceUrl)||((this.sourceUrl!= null)&&this.sourceUrl.equals(rhs.sourceUrl))))&&((this.scheduleInterval == rhs.scheduleInterval)||((this.scheduleInterval!= null)&&this.scheduleInterval.equals(rhs.scheduleInterval))))&&((this.sourceHash == rhs.sourceHash)||((this.sourceHash!= null)&&this.sourceHash.equals(rhs.sourceHash))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.pipelineLocation == rhs.pipelineLocation)||((this.pipelineLocation!= null)&&this.pipelineLocation.equals(rhs.pipelineLocation))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.lifeCycle == rhs.lifeCycle)||((this.lifeCycle!= null)&&this.lifeCycle.equals(rhs.lifeCycle))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.tasks == rhs.tasks)||((this.tasks!= null)&&this.tasks.equals(rhs.tasks))));
    }

}
