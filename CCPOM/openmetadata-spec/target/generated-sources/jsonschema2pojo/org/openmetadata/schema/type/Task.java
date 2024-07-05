
package org.openmetadata.schema.type;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "fullyQualifiedName",
    "description",
    "sourceUrl",
    "downstreamTasks",
    "taskType",
    "taskSQL",
    "startDate",
    "endDate",
    "tags"
})
@Generated("jsonschema2pojo")
public class Task {

    /**
     * Name that identifies this task instance uniquely.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies this task instance uniquely.")
    @NotNull
    private String name;
    /**
     * Display Name that identifies this Task. It could be title or label from the pipeline services.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this Task. It could be title or label from the pipeline services.")
    private String displayName;
    /**
     * A unique name that identifies a pipeline in the format 'ServiceName.PipelineName.TaskName'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies a pipeline in the format 'ServiceName.PipelineName.TaskName'.")
    private String fullyQualifiedName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    @JsonPropertyDescription("Source Url of the respective entity.")
    private String sourceUrl;
    /**
     * All the tasks that are downstream of this task.
     * 
     */
    @JsonProperty("downstreamTasks")
    @JsonPropertyDescription("All the tasks that are downstream of this task.")
    @Valid
    private List<String> downstreamTasks = null;
    /**
     * Type of the Task. Usually refers to the class it implements.
     * 
     */
    @JsonProperty("taskType")
    @JsonPropertyDescription("Type of the Task. Usually refers to the class it implements.")
    private String taskType;
    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("taskSQL")
    @JsonPropertyDescription("SQL query statement. Example - 'select * from orders'.")
    private String taskSQL;
    /**
     * start date for the task.
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("start date for the task.")
    private String startDate;
    /**
     * end date for the task.
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("end date for the task.")
    private String endDate;
    /**
     * Tags for this task.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this task.")
    @Valid
    private List<TagLabel> tags = null;

    /**
     * Name that identifies this task instance uniquely.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies this task instance uniquely.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Task withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this Task. It could be title or label from the pipeline services.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this Task. It could be title or label from the pipeline services.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Task withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * A unique name that identifies a pipeline in the format 'ServiceName.PipelineName.TaskName'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * A unique name that identifies a pipeline in the format 'ServiceName.PipelineName.TaskName'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public Task withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
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

    public Task withDescription(String description) {
        this.description = description;
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

    public Task withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * All the tasks that are downstream of this task.
     * 
     */
    @JsonProperty("downstreamTasks")
    public List<String> getDownstreamTasks() {
        return downstreamTasks;
    }

    /**
     * All the tasks that are downstream of this task.
     * 
     */
    @JsonProperty("downstreamTasks")
    public void setDownstreamTasks(List<String> downstreamTasks) {
        this.downstreamTasks = downstreamTasks;
    }

    public Task withDownstreamTasks(List<String> downstreamTasks) {
        this.downstreamTasks = downstreamTasks;
        return this;
    }

    /**
     * Type of the Task. Usually refers to the class it implements.
     * 
     */
    @JsonProperty("taskType")
    public String getTaskType() {
        return taskType;
    }

    /**
     * Type of the Task. Usually refers to the class it implements.
     * 
     */
    @JsonProperty("taskType")
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public Task withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("taskSQL")
    public String getTaskSQL() {
        return taskSQL;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("taskSQL")
    public void setTaskSQL(String taskSQL) {
        this.taskSQL = taskSQL;
    }

    public Task withTaskSQL(String taskSQL) {
        this.taskSQL = taskSQL;
        return this;
    }

    /**
     * start date for the task.
     * 
     */
    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    /**
     * start date for the task.
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Task withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * end date for the task.
     * 
     */
    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    /**
     * end date for the task.
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Task withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Tags for this task.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this task.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public Task withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Task.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("sourceUrl");
        sb.append('=');
        sb.append(((this.sourceUrl == null)?"<null>":this.sourceUrl));
        sb.append(',');
        sb.append("downstreamTasks");
        sb.append('=');
        sb.append(((this.downstreamTasks == null)?"<null>":this.downstreamTasks));
        sb.append(',');
        sb.append("taskType");
        sb.append('=');
        sb.append(((this.taskType == null)?"<null>":this.taskType));
        sb.append(',');
        sb.append("taskSQL");
        sb.append('=');
        sb.append(((this.taskSQL == null)?"<null>":this.taskSQL));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
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
        result = ((result* 31)+((this.sourceUrl == null)? 0 :this.sourceUrl.hashCode()));
        result = ((result* 31)+((this.taskType == null)? 0 :this.taskType.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.downstreamTasks == null)? 0 :this.downstreamTasks.hashCode()));
        result = ((result* 31)+((this.taskSQL == null)? 0 :this.taskSQL.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Task) == false) {
            return false;
        }
        Task rhs = ((Task) other);
        return ((((((((((((this.sourceUrl == rhs.sourceUrl)||((this.sourceUrl!= null)&&this.sourceUrl.equals(rhs.sourceUrl)))&&((this.taskType == rhs.taskType)||((this.taskType!= null)&&this.taskType.equals(rhs.taskType))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.downstreamTasks == rhs.downstreamTasks)||((this.downstreamTasks!= null)&&this.downstreamTasks.equals(rhs.downstreamTasks))))&&((this.taskSQL == rhs.taskSQL)||((this.taskSQL!= null)&&this.taskSQL.equals(rhs.taskSQL))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
