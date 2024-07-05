
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Profiling results of a Custom Metric.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "value"
})
@Generated("jsonschema2pojo")
public class CustomMetricProfile {

    /**
     * Custom metric name.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Custom metric name.")
    private String name;
    /**
     * Profiling results for the metric.
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Profiling results for the metric.")
    private Double value;

    /**
     * Custom metric name.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Custom metric name.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CustomMetricProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Profiling results for the metric.
     * 
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * Profiling results for the metric.
     * 
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    public CustomMetricProfile withValue(Double value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomMetricProfile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomMetricProfile) == false) {
            return false;
        }
        CustomMetricProfile rhs = ((CustomMetricProfile) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
