
package org.openmetadata.schema.dataInsight.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AggregatedUsedVsUnusedAssetsSize
 * <p>
 * AggregatedUsedVsUnusedAssetsSize data blob
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "UnusedPercentage",
    "UsedPercentage",
    "Unused",
    "Used"
})
@Generated("jsonschema2pojo")
public class AggregatedUsedVsUnusedAssetsSize {

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * Percentage of the size of unused assets (last access >= 3 days)
     * 
     */
    @JsonProperty("UnusedPercentage")
    @JsonPropertyDescription("Percentage of the size of unused assets (last access >= 3 days)")
    private Double unusedPercentage;
    /**
     * Percentage of the size of used assets (last access < 3 days)
     * 
     */
    @JsonProperty("UsedPercentage")
    @JsonPropertyDescription("Percentage of the size of used assets (last access < 3 days)")
    private Double usedPercentage;
    /**
     * Size of unused assets (last access >= 3 days)
     * 
     */
    @JsonProperty("Unused")
    @JsonPropertyDescription("Size of unused assets (last access >= 3 days)")
    private Double unused;
    /**
     * Size of used assets (last access < 3 days)
     * 
     */
    @JsonProperty("Used")
    @JsonPropertyDescription("Size of used assets (last access < 3 days)")
    private Double used;

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

    public AggregatedUsedVsUnusedAssetsSize withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Percentage of the size of unused assets (last access >= 3 days)
     * 
     */
    @JsonProperty("UnusedPercentage")
    public Double getUnusedPercentage() {
        return unusedPercentage;
    }

    /**
     * Percentage of the size of unused assets (last access >= 3 days)
     * 
     */
    @JsonProperty("UnusedPercentage")
    public void setUnusedPercentage(Double unusedPercentage) {
        this.unusedPercentage = unusedPercentage;
    }

    public AggregatedUsedVsUnusedAssetsSize withUnusedPercentage(Double unusedPercentage) {
        this.unusedPercentage = unusedPercentage;
        return this;
    }

    /**
     * Percentage of the size of used assets (last access < 3 days)
     * 
     */
    @JsonProperty("UsedPercentage")
    public Double getUsedPercentage() {
        return usedPercentage;
    }

    /**
     * Percentage of the size of used assets (last access < 3 days)
     * 
     */
    @JsonProperty("UsedPercentage")
    public void setUsedPercentage(Double usedPercentage) {
        this.usedPercentage = usedPercentage;
    }

    public AggregatedUsedVsUnusedAssetsSize withUsedPercentage(Double usedPercentage) {
        this.usedPercentage = usedPercentage;
        return this;
    }

    /**
     * Size of unused assets (last access >= 3 days)
     * 
     */
    @JsonProperty("Unused")
    public Double getUnused() {
        return unused;
    }

    /**
     * Size of unused assets (last access >= 3 days)
     * 
     */
    @JsonProperty("Unused")
    public void setUnused(Double unused) {
        this.unused = unused;
    }

    public AggregatedUsedVsUnusedAssetsSize withUnused(Double unused) {
        this.unused = unused;
        return this;
    }

    /**
     * Size of used assets (last access < 3 days)
     * 
     */
    @JsonProperty("Used")
    public Double getUsed() {
        return used;
    }

    /**
     * Size of used assets (last access < 3 days)
     * 
     */
    @JsonProperty("Used")
    public void setUsed(Double used) {
        this.used = used;
    }

    public AggregatedUsedVsUnusedAssetsSize withUsed(Double used) {
        this.used = used;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AggregatedUsedVsUnusedAssetsSize.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("unusedPercentage");
        sb.append('=');
        sb.append(((this.unusedPercentage == null)?"<null>":this.unusedPercentage));
        sb.append(',');
        sb.append("usedPercentage");
        sb.append('=');
        sb.append(((this.usedPercentage == null)?"<null>":this.usedPercentage));
        sb.append(',');
        sb.append("unused");
        sb.append('=');
        sb.append(((this.unused == null)?"<null>":this.unused));
        sb.append(',');
        sb.append("used");
        sb.append('=');
        sb.append(((this.used == null)?"<null>":this.used));
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
        result = ((result* 31)+((this.unused == null)? 0 :this.unused.hashCode()));
        result = ((result* 31)+((this.usedPercentage == null)? 0 :this.usedPercentage.hashCode()));
        result = ((result* 31)+((this.used == null)? 0 :this.used.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.unusedPercentage == null)? 0 :this.unusedPercentage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AggregatedUsedVsUnusedAssetsSize) == false) {
            return false;
        }
        AggregatedUsedVsUnusedAssetsSize rhs = ((AggregatedUsedVsUnusedAssetsSize) other);
        return ((((((this.unused == rhs.unused)||((this.unused!= null)&&this.unused.equals(rhs.unused)))&&((this.usedPercentage == rhs.usedPercentage)||((this.usedPercentage!= null)&&this.usedPercentage.equals(rhs.usedPercentage))))&&((this.used == rhs.used)||((this.used!= null)&&this.used.equals(rhs.used))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.unusedPercentage == rhs.unusedPercentage)||((this.unusedPercentage!= null)&&this.unusedPercentage.equals(rhs.unusedPercentage))));
    }

}
