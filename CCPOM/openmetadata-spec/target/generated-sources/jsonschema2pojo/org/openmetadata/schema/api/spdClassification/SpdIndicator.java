
package org.openmetadata.schema.api.spdClassification;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "index",
    "description",
    "targetValue",
    "weight"
})
@Generated("jsonschema2pojo")
public class SpdIndicator {

    /**
     * Indicator number
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Indicator number")
    private String number;
    /**
     * Indicator index
     * 
     */
    @JsonProperty("index")
    @JsonPropertyDescription("Indicator index")
    private String index;
    /**
     * Indicator description
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Indicator description")
    private String description;
    /**
     * Indicator target Value
     * 
     */
    @JsonProperty("targetValue")
    @JsonPropertyDescription("Indicator target Value")
    private String targetValue;
    /**
     * Indicator weight
     * 
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("Indicator weight")
    private String weight;

    /**
     * Indicator number
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Indicator number
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public SpdIndicator withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Indicator index
     * 
     */
    @JsonProperty("index")
    public String getIndex() {
        return index;
    }

    /**
     * Indicator index
     * 
     */
    @JsonProperty("index")
    public void setIndex(String index) {
        this.index = index;
    }

    public SpdIndicator withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * Indicator description
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Indicator description
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public SpdIndicator withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Indicator target Value
     * 
     */
    @JsonProperty("targetValue")
    public String getTargetValue() {
        return targetValue;
    }

    /**
     * Indicator target Value
     * 
     */
    @JsonProperty("targetValue")
    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public SpdIndicator withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * Indicator weight
     * 
     */
    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    /**
     * Indicator weight
     * 
     */
    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public SpdIndicator withWeight(String weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpdIndicator.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("targetValue");
        sb.append('=');
        sb.append(((this.targetValue == null)?"<null>":this.targetValue));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
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
        result = ((result* 31)+((this.targetValue == null)? 0 :this.targetValue.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.index == null)? 0 :this.index.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpdIndicator) == false) {
            return false;
        }
        SpdIndicator rhs = ((SpdIndicator) other);
        return ((((((this.targetValue == rhs.targetValue)||((this.targetValue!= null)&&this.targetValue.equals(rhs.targetValue)))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.index == rhs.index)||((this.index!= null)&&this.index.equals(rhs.index))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))));
    }

}
