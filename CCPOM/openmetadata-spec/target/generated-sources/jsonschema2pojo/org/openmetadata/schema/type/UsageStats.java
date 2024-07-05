
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Type used to return usage statistics.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "count",
    "percentileRank"
})
@Generated("jsonschema2pojo")
public class UsageStats {

    /**
     * Usage count of a data asset on the start date.
     * (Required)
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("Usage count of a data asset on the start date.")
    @DecimalMin("0")
    @NotNull
    private Integer count;
    /**
     * Optional daily percentile rank data asset use when relevant.
     * 
     */
    @JsonProperty("percentileRank")
    @JsonPropertyDescription("Optional daily percentile rank data asset use when relevant.")
    private Double percentileRank;

    /**
     * Usage count of a data asset on the start date.
     * (Required)
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * Usage count of a data asset on the start date.
     * (Required)
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public UsageStats withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Optional daily percentile rank data asset use when relevant.
     * 
     */
    @JsonProperty("percentileRank")
    public Double getPercentileRank() {
        return percentileRank;
    }

    /**
     * Optional daily percentile rank data asset use when relevant.
     * 
     */
    @JsonProperty("percentileRank")
    public void setPercentileRank(Double percentileRank) {
        this.percentileRank = percentileRank;
    }

    public UsageStats withPercentileRank(Double percentileRank) {
        this.percentileRank = percentileRank;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UsageStats.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("percentileRank");
        sb.append('=');
        sb.append(((this.percentileRank == null)?"<null>":this.percentileRank));
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
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.percentileRank == null)? 0 :this.percentileRank.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsageStats) == false) {
            return false;
        }
        UsageStats rhs = ((UsageStats) other);
        return (((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count)))&&((this.percentileRank == rhs.percentileRank)||((this.percentileRank!= null)&&this.percentileRank.equals(rhs.percentileRank))));
    }

}
