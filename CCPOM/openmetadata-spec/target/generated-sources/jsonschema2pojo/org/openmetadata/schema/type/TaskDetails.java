
package org.openmetadata.schema.type;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Details about the task. This is only applicable if thread is of type task.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "assignees",
    "status",
    "closedBy",
    "closedAt",
    "oldValue",
    "suggestion",
    "newValue"
})
@Generated("jsonschema2pojo")
public class TaskDetails {

    /**
     * Unique identifier that identifies the task.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique identifier that identifies the task.")
    @NotNull
    private Integer id;
    /**
     * Type of a task.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of a task.")
    @NotNull
    private TaskType type;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("assignees")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private List<EntityReference> assignees = null;
    /**
     * Status of a task.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status of a task.")
    private TaskStatus status = TaskStatus.fromValue("Open");
    /**
     * The user that closed the task.
     * 
     */
    @JsonProperty("closedBy")
    @JsonPropertyDescription("The user that closed the task.")
    private String closedBy;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("closedAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long closedAt;
    /**
     * The value of old object for which the task is created.
     * 
     */
    @JsonProperty("oldValue")
    @JsonPropertyDescription("The value of old object for which the task is created.")
    private String oldValue;
    /**
     * The suggestion object to replace the old value for which the task is created.
     * 
     */
    @JsonProperty("suggestion")
    @JsonPropertyDescription("The suggestion object to replace the old value for which the task is created.")
    private String suggestion;
    /**
     * The new value object that was accepted to complete the task.
     * 
     */
    @JsonProperty("newValue")
    @JsonPropertyDescription("The new value object that was accepted to complete the task.")
    private String newValue;

    /**
     * Unique identifier that identifies the task.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Unique identifier that identifies the task.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public TaskDetails withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Type of a task.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public TaskType getType() {
        return type;
    }

    /**
     * Type of a task.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(TaskType type) {
        this.type = type;
    }

    public TaskDetails withType(TaskType type) {
        this.type = type;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("assignees")
    public List<EntityReference> getAssignees() {
        return assignees;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("assignees")
    public void setAssignees(List<EntityReference> assignees) {
        this.assignees = assignees;
    }

    public TaskDetails withAssignees(List<EntityReference> assignees) {
        this.assignees = assignees;
        return this;
    }

    /**
     * Status of a task.
     * 
     */
    @JsonProperty("status")
    public TaskStatus getStatus() {
        return status;
    }

    /**
     * Status of a task.
     * 
     */
    @JsonProperty("status")
    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskDetails withStatus(TaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * The user that closed the task.
     * 
     */
    @JsonProperty("closedBy")
    public String getClosedBy() {
        return closedBy;
    }

    /**
     * The user that closed the task.
     * 
     */
    @JsonProperty("closedBy")
    public void setClosedBy(String closedBy) {
        this.closedBy = closedBy;
    }

    public TaskDetails withClosedBy(String closedBy) {
        this.closedBy = closedBy;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("closedAt")
    public Long getClosedAt() {
        return closedAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("closedAt")
    public void setClosedAt(Long closedAt) {
        this.closedAt = closedAt;
    }

    public TaskDetails withClosedAt(Long closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * The value of old object for which the task is created.
     * 
     */
    @JsonProperty("oldValue")
    public String getOldValue() {
        return oldValue;
    }

    /**
     * The value of old object for which the task is created.
     * 
     */
    @JsonProperty("oldValue")
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public TaskDetails withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     * The suggestion object to replace the old value for which the task is created.
     * 
     */
    @JsonProperty("suggestion")
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * The suggestion object to replace the old value for which the task is created.
     * 
     */
    @JsonProperty("suggestion")
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public TaskDetails withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * The new value object that was accepted to complete the task.
     * 
     */
    @JsonProperty("newValue")
    public String getNewValue() {
        return newValue;
    }

    /**
     * The new value object that was accepted to complete the task.
     * 
     */
    @JsonProperty("newValue")
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public TaskDetails withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaskDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("assignees");
        sb.append('=');
        sb.append(((this.assignees == null)?"<null>":this.assignees));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("closedBy");
        sb.append('=');
        sb.append(((this.closedBy == null)?"<null>":this.closedBy));
        sb.append(',');
        sb.append("closedAt");
        sb.append('=');
        sb.append(((this.closedAt == null)?"<null>":this.closedAt));
        sb.append(',');
        sb.append("oldValue");
        sb.append('=');
        sb.append(((this.oldValue == null)?"<null>":this.oldValue));
        sb.append(',');
        sb.append("suggestion");
        sb.append('=');
        sb.append(((this.suggestion == null)?"<null>":this.suggestion));
        sb.append(',');
        sb.append("newValue");
        sb.append('=');
        sb.append(((this.newValue == null)?"<null>":this.newValue));
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
        result = ((result* 31)+((this.closedBy == null)? 0 :this.closedBy.hashCode()));
        result = ((result* 31)+((this.newValue == null)? 0 :this.newValue.hashCode()));
        result = ((result* 31)+((this.suggestion == null)? 0 :this.suggestion.hashCode()));
        result = ((result* 31)+((this.assignees == null)? 0 :this.assignees.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.oldValue == null)? 0 :this.oldValue.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.closedAt == null)? 0 :this.closedAt.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskDetails) == false) {
            return false;
        }
        TaskDetails rhs = ((TaskDetails) other);
        return ((((((((((this.closedBy == rhs.closedBy)||((this.closedBy!= null)&&this.closedBy.equals(rhs.closedBy)))&&((this.newValue == rhs.newValue)||((this.newValue!= null)&&this.newValue.equals(rhs.newValue))))&&((this.suggestion == rhs.suggestion)||((this.suggestion!= null)&&this.suggestion.equals(rhs.suggestion))))&&((this.assignees == rhs.assignees)||((this.assignees!= null)&&this.assignees.equals(rhs.assignees))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.oldValue == rhs.oldValue)||((this.oldValue!= null)&&this.oldValue.equals(rhs.oldValue))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.closedAt == rhs.closedAt)||((this.closedAt!= null)&&this.closedAt.equals(rhs.closedAt))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
