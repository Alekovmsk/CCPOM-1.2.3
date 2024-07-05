
package org.openmetadata.schema.dataInsight.type;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines the parameter values that can be passed for a Kpi Parameter.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "value",
    "targetMet"
})
@Generated("jsonschema2pojo")
public class KpiTarget {

    /**
     * name of the parameter. Must match the parameter names in metrics of the chart this objective refers
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("name of the parameter. Must match the parameter names in metrics of the chart this objective refers")
    @NotNull
    private String name;
    /**
     * value to be passed for the Parameters. These are input from Users. We capture this in string and convert during the runtime.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("value to be passed for the Parameters. These are input from Users. We capture this in string and convert during the runtime.")
    @NotNull
    private String value;
    /**
     * whether the target value was met or not.
     * 
     */
    @JsonProperty("targetMet")
    @JsonPropertyDescription("whether the target value was met or not.")
    private Boolean targetMet;

    /**
     * name of the parameter. Must match the parameter names in metrics of the chart this objective refers
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * name of the parameter. Must match the parameter names in metrics of the chart this objective refers
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public KpiTarget withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * value to be passed for the Parameters. These are input from Users. We capture this in string and convert during the runtime.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * value to be passed for the Parameters. These are input from Users. We capture this in string and convert during the runtime.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public KpiTarget withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * whether the target value was met or not.
     * 
     */
    @JsonProperty("targetMet")
    public Boolean getTargetMet() {
        return targetMet;
    }

    /**
     * whether the target value was met or not.
     * 
     */
    @JsonProperty("targetMet")
    public void setTargetMet(Boolean targetMet) {
        this.targetMet = targetMet;
    }

    public KpiTarget withTargetMet(Boolean targetMet) {
        this.targetMet = targetMet;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KpiTarget.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("targetMet");
        sb.append('=');
        sb.append(((this.targetMet == null)?"<null>":this.targetMet));
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
        result = ((result* 31)+((this.targetMet == null)? 0 :this.targetMet.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KpiTarget) == false) {
            return false;
        }
        KpiTarget rhs = ((KpiTarget) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.targetMet == rhs.targetMet)||((this.targetMet!= null)&&this.targetMet.equals(rhs.targetMet))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
