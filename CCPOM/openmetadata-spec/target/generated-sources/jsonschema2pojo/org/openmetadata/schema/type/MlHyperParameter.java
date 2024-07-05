
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines the type for an ML HyperParameter used in an ML Model.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "value",
    "description"
})
@Generated("jsonschema2pojo")
public class MlHyperParameter {

    /**
     * Hyper parameter name.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Hyper parameter name.")
    private String name;
    /**
     * Hyper parameter value.
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Hyper parameter value.")
    private String value;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;

    /**
     * Hyper parameter name.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Hyper parameter name.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public MlHyperParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Hyper parameter value.
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Hyper parameter value.
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public MlHyperParameter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public MlHyperParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MlHyperParameter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MlHyperParameter) == false) {
            return false;
        }
        MlHyperParameter rhs = ((MlHyperParameter) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
