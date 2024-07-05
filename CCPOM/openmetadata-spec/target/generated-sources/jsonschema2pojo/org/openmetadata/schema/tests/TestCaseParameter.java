
package org.openmetadata.schema.tests;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.TestCaseParameterDataType;


/**
 * This schema defines the parameters that can be passed for a Test Case.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "dataType",
    "description",
    "required",
    "optionValues"
})
@Generated("jsonschema2pojo")
public class TestCaseParameter {

    /**
     * name of the parameter.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("name of the parameter.")
    private String name;
    /**
     * Display Name that identifies this parameter name.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this parameter name.")
    private String displayName;
    /**
     * This enum defines the type of data stored in a column.
     * 
     */
    @JsonProperty("dataType")
    @JsonPropertyDescription("This enum defines the type of data stored in a column.")
    private TestCaseParameterDataType dataType;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Is this parameter required.
     * 
     */
    @JsonProperty("required")
    @JsonPropertyDescription("Is this parameter required.")
    private Boolean required = false;
    /**
     * List of values that can be passed for this parameter.
     * 
     */
    @JsonProperty("optionValues")
    @JsonPropertyDescription("List of values that can be passed for this parameter.")
    @Valid
    private List<Object> optionValues = new ArrayList<Object>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * name of the parameter.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * name of the parameter.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TestCaseParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this parameter name.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this parameter name.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TestCaseParameter withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * This enum defines the type of data stored in a column.
     * 
     */
    @JsonProperty("dataType")
    public TestCaseParameterDataType getDataType() {
        return dataType;
    }

    /**
     * This enum defines the type of data stored in a column.
     * 
     */
    @JsonProperty("dataType")
    public void setDataType(TestCaseParameterDataType dataType) {
        this.dataType = dataType;
    }

    public TestCaseParameter withDataType(TestCaseParameterDataType dataType) {
        this.dataType = dataType;
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

    public TestCaseParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Is this parameter required.
     * 
     */
    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    /**
     * Is this parameter required.
     * 
     */
    @JsonProperty("required")
    public void setRequired(Boolean required) {
        this.required = required;
    }

    public TestCaseParameter withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * List of values that can be passed for this parameter.
     * 
     */
    @JsonProperty("optionValues")
    public List<Object> getOptionValues() {
        return optionValues;
    }

    /**
     * List of values that can be passed for this parameter.
     * 
     */
    @JsonProperty("optionValues")
    public void setOptionValues(List<Object> optionValues) {
        this.optionValues = optionValues;
    }

    public TestCaseParameter withOptionValues(List<Object> optionValues) {
        this.optionValues = optionValues;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TestCaseParameter withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestCaseParameter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("dataType");
        sb.append('=');
        sb.append(((this.dataType == null)?"<null>":this.dataType));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("required");
        sb.append('=');
        sb.append(((this.required == null)?"<null>":this.required));
        sb.append(',');
        sb.append("optionValues");
        sb.append('=');
        sb.append(((this.optionValues == null)?"<null>":this.optionValues));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.dataType == null)? 0 :this.dataType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.required == null)? 0 :this.required.hashCode()));
        result = ((result* 31)+((this.optionValues == null)? 0 :this.optionValues.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestCaseParameter) == false) {
            return false;
        }
        TestCaseParameter rhs = ((TestCaseParameter) other);
        return ((((((((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName)))&&((this.dataType == rhs.dataType)||((this.dataType!= null)&&this.dataType.equals(rhs.dataType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.required == rhs.required)||((this.required!= null)&&this.required.equals(rhs.required))))&&((this.optionValues == rhs.optionValues)||((this.optionValues!= null)&&this.optionValues.equals(rhs.optionValues))));
    }

}
