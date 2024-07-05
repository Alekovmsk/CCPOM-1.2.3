
package org.openmetadata.schema.entity.services.ingestionPipelines;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This defines runtime status of Pipeline.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "runId",
    "pipelineState",
    "startDate",
    "timestamp",
    "endDate"
})
@Generated("jsonschema2pojo")
public class PipelineStatus {

    /**
     * Pipeline unique run ID.
     * 
     */
    @JsonProperty("runId")
    @JsonPropertyDescription("Pipeline unique run ID.")
    private String runId;
    /**
     * Pipeline status denotes if its failed or succeeded.
     * 
     */
    @JsonProperty("pipelineState")
    @JsonPropertyDescription("Pipeline status denotes if its failed or succeeded.")
    private PipelineStatusType pipelineState;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long startDate;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long endDate;

    /**
     * Pipeline unique run ID.
     * 
     */
    @JsonProperty("runId")
    public String getRunId() {
        return runId;
    }

    /**
     * Pipeline unique run ID.
     * 
     */
    @JsonProperty("runId")
    public void setRunId(String runId) {
        this.runId = runId;
    }

    public PipelineStatus withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Pipeline status denotes if its failed or succeeded.
     * 
     */
    @JsonProperty("pipelineState")
    public PipelineStatusType getPipelineState() {
        return pipelineState;
    }

    /**
     * Pipeline status denotes if its failed or succeeded.
     * 
     */
    @JsonProperty("pipelineState")
    public void setPipelineState(PipelineStatusType pipelineState) {
        this.pipelineState = pipelineState;
    }

    public PipelineStatus withPipelineState(PipelineStatusType pipelineState) {
        this.pipelineState = pipelineState;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    public Long getStartDate() {
        return startDate;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public PipelineStatus withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
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
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("endDate")
    public Long getEndDate() {
        return endDate;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public PipelineStatus withEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PipelineStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("runId");
        sb.append('=');
        sb.append(((this.runId == null)?"<null>":this.runId));
        sb.append(',');
        sb.append("pipelineState");
        sb.append('=');
        sb.append(((this.pipelineState == null)?"<null>":this.pipelineState));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
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
        result = ((result* 31)+((this.runId == null)? 0 :this.runId.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.pipelineState == null)? 0 :this.pipelineState.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
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
        return ((((((this.runId == rhs.runId)||((this.runId!= null)&&this.runId.equals(rhs.runId)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.pipelineState == rhs.pipelineState)||((this.pipelineState!= null)&&this.pipelineState.equals(rhs.pipelineState))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
