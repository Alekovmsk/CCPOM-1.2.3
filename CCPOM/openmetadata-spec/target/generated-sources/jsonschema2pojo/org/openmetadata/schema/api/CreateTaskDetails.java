
package org.openmetadata.schema.api;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TaskType;


/**
 * Details about the task. This is only applicable if thread is of type task.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "assignees",
    "oldValue",
    "suggestion"
})
@Generated("jsonschema2pojo")
public class CreateTaskDetails {

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
     * The value of old object for which the task is created.
     * 
     */
    @JsonProperty("oldValue")
    @JsonPropertyDescription("The value of old object for which the task is created.")
    private String oldValue;
    /**
     * The suggestion object for the task provided by the creator.
     * 
     */
    @JsonProperty("suggestion")
    @JsonPropertyDescription("The suggestion object for the task provided by the creator.")
    private String suggestion;

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

    public CreateTaskDetails withType(TaskType type) {
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

    public CreateTaskDetails withAssignees(List<EntityReference> assignees) {
        this.assignees = assignees;
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

    public CreateTaskDetails withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     * The suggestion object for the task provided by the creator.
     * 
     */
    @JsonProperty("suggestion")
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * The suggestion object for the task provided by the creator.
     * 
     */
    @JsonProperty("suggestion")
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public CreateTaskDetails withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateTaskDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("assignees");
        sb.append('=');
        sb.append(((this.assignees == null)?"<null>":this.assignees));
        sb.append(',');
        sb.append("oldValue");
        sb.append('=');
        sb.append(((this.oldValue == null)?"<null>":this.oldValue));
        sb.append(',');
        sb.append("suggestion");
        sb.append('=');
        sb.append(((this.suggestion == null)?"<null>":this.suggestion));
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
        result = ((result* 31)+((this.assignees == null)? 0 :this.assignees.hashCode()));
        result = ((result* 31)+((this.oldValue == null)? 0 :this.oldValue.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.suggestion == null)? 0 :this.suggestion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateTaskDetails) == false) {
            return false;
        }
        CreateTaskDetails rhs = ((CreateTaskDetails) other);
        return (((((this.assignees == rhs.assignees)||((this.assignees!= null)&&this.assignees.equals(rhs.assignees)))&&((this.oldValue == rhs.oldValue)||((this.oldValue!= null)&&this.oldValue.equals(rhs.oldValue))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.suggestion == rhs.suggestion)||((this.suggestion!= null)&&this.suggestion.equals(rhs.suggestion))));
    }

}
