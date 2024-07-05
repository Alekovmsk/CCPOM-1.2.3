
package org.openmetadata.schema.system;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jobStats",
    "entityStats"
})
@Generated("jsonschema2pojo")
public class Stats {

    /**
     * Stats for Different Steps Reader, Processor, Writer.
     * 
     */
    @JsonProperty("jobStats")
    @JsonPropertyDescription("Stats for Different Steps Reader, Processor, Writer.")
    @Valid
    private StepStats jobStats;
    /**
     * Stats for Different Steps Reader, Processor, Writer.
     * 
     */
    @JsonProperty("entityStats")
    @JsonPropertyDescription("Stats for Different Steps Reader, Processor, Writer.")
    @Valid
    private StepStats entityStats;

    /**
     * Stats for Different Steps Reader, Processor, Writer.
     * 
     */
    @JsonProperty("jobStats")
    public StepStats getJobStats() {
        return jobStats;
    }

    /**
     * Stats for Different Steps Reader, Processor, Writer.
     * 
     */
    @JsonProperty("jobStats")
    public void setJobStats(StepStats jobStats) {
        this.jobStats = jobStats;
    }

    public Stats withJobStats(StepStats jobStats) {
        this.jobStats = jobStats;
        return this;
    }

    /**
     * Stats for Different Steps Reader, Processor, Writer.
     * 
     */
    @JsonProperty("entityStats")
    public StepStats getEntityStats() {
        return entityStats;
    }

    /**
     * Stats for Different Steps Reader, Processor, Writer.
     * 
     */
    @JsonProperty("entityStats")
    public void setEntityStats(StepStats entityStats) {
        this.entityStats = entityStats;
    }

    public Stats withEntityStats(StepStats entityStats) {
        this.entityStats = entityStats;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Stats.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("jobStats");
        sb.append('=');
        sb.append(((this.jobStats == null)?"<null>":this.jobStats));
        sb.append(',');
        sb.append("entityStats");
        sb.append('=');
        sb.append(((this.entityStats == null)?"<null>":this.entityStats));
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
        result = ((result* 31)+((this.jobStats == null)? 0 :this.jobStats.hashCode()));
        result = ((result* 31)+((this.entityStats == null)? 0 :this.entityStats.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stats) == false) {
            return false;
        }
        Stats rhs = ((Stats) other);
        return (((this.jobStats == rhs.jobStats)||((this.jobStats!= null)&&this.jobStats.equals(rhs.jobStats)))&&((this.entityStats == rhs.entityStats)||((this.entityStats!= null)&&this.entityStats.equals(rhs.entityStats))));
    }

}
