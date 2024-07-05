
package org.openmetadata.schema.entity.data;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.Status;
import org.openmetadata.schema.type.StatusType;


/**
 * Series of pipeline executions, its status and task status.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "executionStatus",
    "taskStatus"
})
@Generated("jsonschema2pojo")
public class PipelineStatus {

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    @NotNull
    private Long timestamp;
    /**
     * Enum defining the possible Status.
     * (Required)
     * 
     */
    @JsonProperty("executionStatus")
    @JsonPropertyDescription("Enum defining the possible Status.")
    @NotNull
    private StatusType executionStatus;
    /**
     * Series of task executions and its status.
     * 
     */
    @JsonProperty("taskStatus")
    @JsonPropertyDescription("Series of task executions and its status.")
    @Valid
    private List<Status> taskStatus = null;

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public PipelineStatus withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Enum defining the possible Status.
     * (Required)
     * 
     */
    @JsonProperty("executionStatus")
    public StatusType getExecutionStatus() {
        return executionStatus;
    }

    /**
     * Enum defining the possible Status.
     * (Required)
     * 
     */
    @JsonProperty("executionStatus")
    public void setExecutionStatus(StatusType executionStatus) {
        this.executionStatus = executionStatus;
    }

    public PipelineStatus withExecutionStatus(StatusType executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }

    /**
     * Series of task executions and its status.
     * 
     */
    @JsonProperty("taskStatus")
    public List<Status> getTaskStatus() {
        return taskStatus;
    }

    /**
     * Series of task executions and its status.
     * 
     */
    @JsonProperty("taskStatus")
    public void setTaskStatus(List<Status> taskStatus) {
        this.taskStatus = taskStatus;
    }

    public PipelineStatus withTaskStatus(List<Status> taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PipelineStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("executionStatus");
        sb.append('=');
        sb.append(((this.executionStatus == null)?"<null>":this.executionStatus));
        sb.append(',');
        sb.append("taskStatus");
        sb.append('=');
        sb.append(((this.taskStatus == null)?"<null>":this.taskStatus));
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
        result = ((result* 31)+((this.taskStatus == null)? 0 :this.taskStatus.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.executionStatus == null)? 0 :this.executionStatus.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PipelineStatus) == false) {
            return false;
        }
        PipelineStatus rhs = ((PipelineStatus) other);
        return ((((this.taskStatus == rhs.taskStatus)||((this.taskStatus!= null)&&this.taskStatus.equals(rhs.taskStatus)))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.executionStatus == rhs.executionStatus)||((this.executionStatus!= null)&&this.executionStatus.equals(rhs.executionStatus))));
    }

}
