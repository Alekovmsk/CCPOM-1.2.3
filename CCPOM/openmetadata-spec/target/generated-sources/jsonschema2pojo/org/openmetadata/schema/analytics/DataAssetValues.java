
package org.openmetadata.schema.analytics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Count or Size in bytes of Data Assets over a time period
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "threeDays",
    "sevenDays",
    "fourteenDays",
    "thirtyDays",
    "sixtyDays"
})
@Generated("jsonschema2pojo")
public class DataAssetValues {

    /**
     * Data Asset Count or Size for 3 days
     * 
     */
    @JsonProperty("threeDays")
    @JsonPropertyDescription("Data Asset Count or Size for 3 days")
    private Double threeDays;
    /**
     * Data Asset Count or Size for 7 days
     * 
     */
    @JsonProperty("sevenDays")
    @JsonPropertyDescription("Data Asset Count or Size for 7 days")
    private Double sevenDays;
    /**
     * Data Asset Count or Size for 14 days
     * 
     */
    @JsonProperty("fourteenDays")
    @JsonPropertyDescription("Data Asset Count or Size for 14 days")
    private Double fourteenDays;
    /**
     * Data Asset Count or Size for 30 days
     * 
     */
    @JsonProperty("thirtyDays")
    @JsonPropertyDescription("Data Asset Count or Size for 30 days")
    private Double thirtyDays;
    /**
     * Data Asset Count or Size for 60 days
     * 
     */
    @JsonProperty("sixtyDays")
    @JsonPropertyDescription("Data Asset Count or Size for 60 days")
    private Double sixtyDays;

    /**
     * Data Asset Count or Size for 3 days
     * 
     */
    @JsonProperty("threeDays")
    public Double getThreeDays() {
        return threeDays;
    }

    /**
     * Data Asset Count or Size for 3 days
     * 
     */
    @JsonProperty("threeDays")
    public void setThreeDays(Double threeDays) {
        this.threeDays = threeDays;
    }

    public DataAssetValues withThreeDays(Double threeDays) {
        this.threeDays = threeDays;
        return this;
    }

    /**
     * Data Asset Count or Size for 7 days
     * 
     */
    @JsonProperty("sevenDays")
    public Double getSevenDays() {
        return sevenDays;
    }

    /**
     * Data Asset Count or Size for 7 days
     * 
     */
    @JsonProperty("sevenDays")
    public void setSevenDays(Double sevenDays) {
        this.sevenDays = sevenDays;
    }

    public DataAssetValues withSevenDays(Double sevenDays) {
        this.sevenDays = sevenDays;
        return this;
    }

    /**
     * Data Asset Count or Size for 14 days
     * 
     */
    @JsonProperty("fourteenDays")
    public Double getFourteenDays() {
        return fourteenDays;
    }

    /**
     * Data Asset Count or Size for 14 days
     * 
     */
    @JsonProperty("fourteenDays")
    public void setFourteenDays(Double fourteenDays) {
        this.fourteenDays = fourteenDays;
    }

    public DataAssetValues withFourteenDays(Double fourteenDays) {
        this.fourteenDays = fourteenDays;
        return this;
    }

    /**
     * Data Asset Count or Size for 30 days
     * 
     */
    @JsonProperty("thirtyDays")
    public Double getThirtyDays() {
        return thirtyDays;
    }

    /**
     * Data Asset Count or Size for 30 days
     * 
     */
    @JsonProperty("thirtyDays")
    public void setThirtyDays(Double thirtyDays) {
        this.thirtyDays = thirtyDays;
    }

    public DataAssetValues withThirtyDays(Double thirtyDays) {
        this.thirtyDays = thirtyDays;
        return this;
    }

    /**
     * Data Asset Count or Size for 60 days
     * 
     */
    @JsonProperty("sixtyDays")
    public Double getSixtyDays() {
        return sixtyDays;
    }

    /**
     * Data Asset Count or Size for 60 days
     * 
     */
    @JsonProperty("sixtyDays")
    public void setSixtyDays(Double sixtyDays) {
        this.sixtyDays = sixtyDays;
    }

    public DataAssetValues withSixtyDays(Double sixtyDays) {
        this.sixtyDays = sixtyDays;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataAssetValues.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("threeDays");
        sb.append('=');
        sb.append(((this.threeDays == null)?"<null>":this.threeDays));
        sb.append(',');
        sb.append("sevenDays");
        sb.append('=');
        sb.append(((this.sevenDays == null)?"<null>":this.sevenDays));
        sb.append(',');
        sb.append("fourteenDays");
        sb.append('=');
        sb.append(((this.fourteenDays == null)?"<null>":this.fourteenDays));
        sb.append(',');
        sb.append("thirtyDays");
        sb.append('=');
        sb.append(((this.thirtyDays == null)?"<null>":this.thirtyDays));
        sb.append(',');
        sb.append("sixtyDays");
        sb.append('=');
        sb.append(((this.sixtyDays == null)?"<null>":this.sixtyDays));
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
        result = ((result* 31)+((this.thirtyDays == null)? 0 :this.thirtyDays.hashCode()));
        result = ((result* 31)+((this.threeDays == null)? 0 :this.threeDays.hashCode()));
        result = ((result* 31)+((this.fourteenDays == null)? 0 :this.fourteenDays.hashCode()));
        result = ((result* 31)+((this.sixtyDays == null)? 0 :this.sixtyDays.hashCode()));
        result = ((result* 31)+((this.sevenDays == null)? 0 :this.sevenDays.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataAssetValues) == false) {
            return false;
        }
        DataAssetValues rhs = ((DataAssetValues) other);
        return ((((((this.thirtyDays == rhs.thirtyDays)||((this.thirtyDays!= null)&&this.thirtyDays.equals(rhs.thirtyDays)))&&((this.threeDays == rhs.threeDays)||((this.threeDays!= null)&&this.threeDays.equals(rhs.threeDays))))&&((this.fourteenDays == rhs.fourteenDays)||((this.fourteenDays!= null)&&this.fourteenDays.equals(rhs.fourteenDays))))&&((this.sixtyDays == rhs.sixtyDays)||((this.sixtyDays!= null)&&this.sixtyDays.equals(rhs.sixtyDays))))&&((this.sevenDays == rhs.sevenDays)||((this.sevenDays!= null)&&this.sevenDays.equals(rhs.sevenDays))));
    }

}
