
package org.openmetadata.schema.api.dlaClassification;

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
public class Indicator {

    /**
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("")
    private String number;
    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("index")
    @JsonPropertyDescription("Name that identifies the source of an external glossary term. Example `HealthCare.gov`.")
    private String index;
    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Name that identifies the source of an external glossary term. Example `HealthCare.gov`.")
    private String description;
    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("targetValue")
    @JsonPropertyDescription("Name that identifies the source of an external glossary term. Example `HealthCare.gov`.")
    private String targetValue;
    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("Name that identifies the source of an external glossary term. Example `HealthCare.gov`.")
    private String weight;

    /**
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Indicator withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("index")
    public String getIndex() {
        return index;
    }

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("index")
    public void setIndex(String index) {
        this.index = index;
    }

    public Indicator withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Indicator withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("targetValue")
    public String getTargetValue() {
        return targetValue;
    }

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("targetValue")
    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public Indicator withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Indicator withWeight(String weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Indicator.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Indicator) == false) {
            return false;
        }
        Indicator rhs = ((Indicator) other);
        return ((((((this.targetValue == rhs.targetValue)||((this.targetValue!= null)&&this.targetValue.equals(rhs.targetValue)))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.index == rhs.index)||((this.index!= null)&&this.index.equals(rhs.index))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))));
    }

}
