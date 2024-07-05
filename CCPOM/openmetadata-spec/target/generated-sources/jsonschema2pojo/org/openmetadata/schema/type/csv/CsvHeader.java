
package org.openmetadata.schema.type.csv;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a header for a field in a CSV file.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "required",
    "description",
    "examples"
})
@Generated("jsonschema2pojo")
public class CsvHeader {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    @NotNull
    private String name;
    @JsonProperty("required")
    private Boolean required = false;
    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    @NotNull
    private String description;
    /**
     * Example values for the field
     * (Required)
     * 
     */
    @JsonProperty("examples")
    @JsonPropertyDescription("Example values for the field")
    @Valid
    @NotNull
    private List<String> examples = new ArrayList<String>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CsvHeader withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    @JsonProperty("required")
    public void setRequired(Boolean required) {
        this.required = required;
    }

    public CsvHeader withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CsvHeader withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Example values for the field
     * (Required)
     * 
     */
    @JsonProperty("examples")
    public List<String> getExamples() {
        return examples;
    }

    /**
     * Example values for the field
     * (Required)
     * 
     */
    @JsonProperty("examples")
    public void setExamples(List<String> examples) {
        this.examples = examples;
    }

    public CsvHeader withExamples(List<String> examples) {
        this.examples = examples;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CsvHeader.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("required");
        sb.append('=');
        sb.append(((this.required == null)?"<null>":this.required));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("examples");
        sb.append('=');
        sb.append(((this.examples == null)?"<null>":this.examples));
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
        result = ((result* 31)+((this.examples == null)? 0 :this.examples.hashCode()));
        result = ((result* 31)+((this.required == null)? 0 :this.required.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CsvHeader) == false) {
            return false;
        }
        CsvHeader rhs = ((CsvHeader) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.examples == rhs.examples)||((this.examples!= null)&&this.examples.equals(rhs.examples))))&&((this.required == rhs.required)||((this.required!= null)&&this.required.equals(rhs.required))));
    }

}
