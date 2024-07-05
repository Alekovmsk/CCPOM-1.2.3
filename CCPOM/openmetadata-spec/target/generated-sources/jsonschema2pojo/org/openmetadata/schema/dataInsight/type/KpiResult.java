
package org.openmetadata.schema.dataInsight.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Schema to capture kpi result.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "kpiFqn",
    "targetResult"
})
@Generated("jsonschema2pojo")
public class KpiResult {

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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("kpiFqn")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String kpiFqn;
    /**
     * Metric and their corresponding current results
     * (Required)
     * 
     */
    @JsonProperty("targetResult")
    @JsonPropertyDescription("Metric and their corresponding current results")
    @Valid
    @NotNull
    private List<KpiTarget> targetResult = new ArrayList<KpiTarget>();

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

    public KpiResult withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("kpiFqn")
    public String getKpiFqn() {
        return kpiFqn;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("kpiFqn")
    public void setKpiFqn(String kpiFqn) {
        this.kpiFqn = kpiFqn;
    }

    public KpiResult withKpiFqn(String kpiFqn) {
        this.kpiFqn = kpiFqn;
        return this;
    }

    /**
     * Metric and their corresponding current results
     * (Required)
     * 
     */
    @JsonProperty("targetResult")
    public List<KpiTarget> getTargetResult() {
        return targetResult;
    }

    /**
     * Metric and their corresponding current results
     * (Required)
     * 
     */
    @JsonProperty("targetResult")
    public void setTargetResult(List<KpiTarget> targetResult) {
        this.targetResult = targetResult;
    }

    public KpiResult withTargetResult(List<KpiTarget> targetResult) {
        this.targetResult = targetResult;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KpiResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("kpiFqn");
        sb.append('=');
        sb.append(((this.kpiFqn == null)?"<null>":this.kpiFqn));
        sb.append(',');
        sb.append("targetResult");
        sb.append('=');
        sb.append(((this.targetResult == null)?"<null>":this.targetResult));
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
        result = ((result* 31)+((this.targetResult == null)? 0 :this.targetResult.hashCode()));
        result = ((result* 31)+((this.kpiFqn == null)? 0 :this.kpiFqn.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KpiResult) == false) {
            return false;
        }
        KpiResult rhs = ((KpiResult) other);
        return ((((this.targetResult == rhs.targetResult)||((this.targetResult!= null)&&this.targetResult.equals(rhs.targetResult)))&&((this.kpiFqn == rhs.kpiFqn)||((this.kpiFqn!= null)&&this.kpiFqn.equals(rhs.kpiFqn))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
