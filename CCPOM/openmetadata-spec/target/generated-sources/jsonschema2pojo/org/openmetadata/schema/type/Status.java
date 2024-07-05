
package org.openmetadata.schema.type;

import java.net.URI;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines a time series of the status of a Pipeline or Task.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "executionStatus",
    "startTime",
    "endTime",
    "logLink"
})
@Generated("jsonschema2pojo")
public class Status {

    /**
     * Name of the Task.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the Task.")
    @NotNull
    private String name;
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
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("startTime")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long startTime;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("endTime")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long endTime;
    /**
     * Task end time
     * 
     */
    @JsonProperty("logLink")
    @JsonPropertyDescription("Task end time")
    private URI logLink;

    /**
     * Name of the Task.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the Task.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Status withName(String name) {
        this.name = name;
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

    public Status withExecutionStatus(StatusType executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("startTime")
    public Long getStartTime() {
        return startTime;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("startTime")
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Status withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("endTime")
    public Long getEndTime() {
        return endTime;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Status withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Task end time
     * 
     */
    @JsonProperty("logLink")
    public URI getLogLink() {
        return logLink;
    }

    /**
     * Task end time
     * 
     */
    @JsonProperty("logLink")
    public void setLogLink(URI logLink) {
        this.logLink = logLink;
    }

    public Status withLogLink(URI logLink) {
        this.logLink = logLink;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Status.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("executionStatus");
        sb.append('=');
        sb.append(((this.executionStatus == null)?"<null>":this.executionStatus));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("logLink");
        sb.append('=');
        sb.append(((this.logLink == null)?"<null>":this.logLink));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.logLink == null)? 0 :this.logLink.hashCode()));
        result = ((result* 31)+((this.executionStatus == null)? 0 :this.executionStatus.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Status) == false) {
            return false;
        }
        Status rhs = ((Status) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.logLink == rhs.logLink)||((this.logLink!= null)&&this.logLink.equals(rhs.logLink))))&&((this.executionStatus == rhs.executionStatus)||((this.executionStatus!= null)&&this.executionStatus.equals(rhs.executionStatus))));
    }

}
