
package org.openmetadata.schema.dataInsight.type;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.analytics.DataAssetValues;


/**
 * AggregatedUnusedAssetsCount
 * <p>
 * AggregatedUnusedAssetsCount data blob
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "frequentlyUsedDataAssets",
    "unusedDataAssets"
})
@Generated("jsonschema2pojo")
public class AggregatedUnusedAssetsCount {

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * Count or Size in bytes of Data Assets over a time period
     * 
     */
    @JsonProperty("frequentlyUsedDataAssets")
    @JsonPropertyDescription("Count or Size in bytes of Data Assets over a time period")
    @Valid
    private DataAssetValues frequentlyUsedDataAssets;
    /**
     * Count or Size in bytes of Data Assets over a time period
     * 
     */
    @JsonProperty("unusedDataAssets")
    @JsonPropertyDescription("Count or Size in bytes of Data Assets over a time period")
    @Valid
    private DataAssetValues unusedDataAssets;

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

    public AggregatedUnusedAssetsCount withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Count or Size in bytes of Data Assets over a time period
     * 
     */
    @JsonProperty("frequentlyUsedDataAssets")
    public DataAssetValues getFrequentlyUsedDataAssets() {
        return frequentlyUsedDataAssets;
    }

    /**
     * Count or Size in bytes of Data Assets over a time period
     * 
     */
    @JsonProperty("frequentlyUsedDataAssets")
    public void setFrequentlyUsedDataAssets(DataAssetValues frequentlyUsedDataAssets) {
        this.frequentlyUsedDataAssets = frequentlyUsedDataAssets;
    }

    public AggregatedUnusedAssetsCount withFrequentlyUsedDataAssets(DataAssetValues frequentlyUsedDataAssets) {
        this.frequentlyUsedDataAssets = frequentlyUsedDataAssets;
        return this;
    }

    /**
     * Count or Size in bytes of Data Assets over a time period
     * 
     */
    @JsonProperty("unusedDataAssets")
    public DataAssetValues getUnusedDataAssets() {
        return unusedDataAssets;
    }

    /**
     * Count or Size in bytes of Data Assets over a time period
     * 
     */
    @JsonProperty("unusedDataAssets")
    public void setUnusedDataAssets(DataAssetValues unusedDataAssets) {
        this.unusedDataAssets = unusedDataAssets;
    }

    public AggregatedUnusedAssetsCount withUnusedDataAssets(DataAssetValues unusedDataAssets) {
        this.unusedDataAssets = unusedDataAssets;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AggregatedUnusedAssetsCount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("frequentlyUsedDataAssets");
        sb.append('=');
        sb.append(((this.frequentlyUsedDataAssets == null)?"<null>":this.frequentlyUsedDataAssets));
        sb.append(',');
        sb.append("unusedDataAssets");
        sb.append('=');
        sb.append(((this.unusedDataAssets == null)?"<null>":this.unusedDataAssets));
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
        result = ((result* 31)+((this.unusedDataAssets == null)? 0 :this.unusedDataAssets.hashCode()));
        result = ((result* 31)+((this.frequentlyUsedDataAssets == null)? 0 :this.frequentlyUsedDataAssets.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AggregatedUnusedAssetsCount) == false) {
            return false;
        }
        AggregatedUnusedAssetsCount rhs = ((AggregatedUnusedAssetsCount) other);
        return ((((this.unusedDataAssets == rhs.unusedDataAssets)||((this.unusedDataAssets!= null)&&this.unusedDataAssets.equals(rhs.unusedDataAssets)))&&((this.frequentlyUsedDataAssets == rhs.frequentlyUsedDataAssets)||((this.frequentlyUsedDataAssets!= null)&&this.frequentlyUsedDataAssets.equals(rhs.frequentlyUsedDataAssets))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
