
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * function
 * <p>
 * Functions used for writing SpEL expression based conditions
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "input",
    "description",
    "examples",
    "parameterInputType",
    "paramAdditionalContext"
})
@Generated("jsonschema2pojo")
public class Function {

    /**
     * Name of the function.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the function.")
    private String name;
    /**
     * Description of input taken by the function.
     * 
     */
    @JsonProperty("input")
    @JsonPropertyDescription("Description of input taken by the function.")
    private String input;
    /**
     * Description fo the function.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description fo the function.")
    private String description;
    /**
     * Examples of the function to help users author conditions.
     * 
     */
    @JsonProperty("examples")
    @JsonPropertyDescription("Examples of the function to help users author conditions.")
    @Valid
    private List<Object> examples = new ArrayList<Object>();
    @JsonProperty("parameterInputType")
    private Function.ParameterType parameterInputType;
    /**
     * Additional Context
     * 
     */
    @JsonProperty("paramAdditionalContext")
    @JsonPropertyDescription("Additional Context")
    @Valid
    private ParamAdditionalContext paramAdditionalContext;

    /**
     * Name of the function.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the function.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Function withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Description of input taken by the function.
     * 
     */
    @JsonProperty("input")
    public String getInput() {
        return input;
    }

    /**
     * Description of input taken by the function.
     * 
     */
    @JsonProperty("input")
    public void setInput(String input) {
        this.input = input;
    }

    public Function withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * Description fo the function.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description fo the function.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Function withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Examples of the function to help users author conditions.
     * 
     */
    @JsonProperty("examples")
    public List<Object> getExamples() {
        return examples;
    }

    /**
     * Examples of the function to help users author conditions.
     * 
     */
    @JsonProperty("examples")
    public void setExamples(List<Object> examples) {
        this.examples = examples;
    }

    public Function withExamples(List<Object> examples) {
        this.examples = examples;
        return this;
    }

    @JsonProperty("parameterInputType")
    public Function.ParameterType getParameterInputType() {
        return parameterInputType;
    }

    @JsonProperty("parameterInputType")
    public void setParameterInputType(Function.ParameterType parameterInputType) {
        this.parameterInputType = parameterInputType;
    }

    public Function withParameterInputType(Function.ParameterType parameterInputType) {
        this.parameterInputType = parameterInputType;
        return this;
    }

    /**
     * Additional Context
     * 
     */
    @JsonProperty("paramAdditionalContext")
    public ParamAdditionalContext getParamAdditionalContext() {
        return paramAdditionalContext;
    }

    /**
     * Additional Context
     * 
     */
    @JsonProperty("paramAdditionalContext")
    public void setParamAdditionalContext(ParamAdditionalContext paramAdditionalContext) {
        this.paramAdditionalContext = paramAdditionalContext;
    }

    public Function withParamAdditionalContext(ParamAdditionalContext paramAdditionalContext) {
        this.paramAdditionalContext = paramAdditionalContext;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Function.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("input");
        sb.append('=');
        sb.append(((this.input == null)?"<null>":this.input));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("examples");
        sb.append('=');
        sb.append(((this.examples == null)?"<null>":this.examples));
        sb.append(',');
        sb.append("parameterInputType");
        sb.append('=');
        sb.append(((this.parameterInputType == null)?"<null>":this.parameterInputType));
        sb.append(',');
        sb.append("paramAdditionalContext");
        sb.append('=');
        sb.append(((this.paramAdditionalContext == null)?"<null>":this.paramAdditionalContext));
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
        result = ((result* 31)+((this.input == null)? 0 :this.input.hashCode()));
        result = ((result* 31)+((this.examples == null)? 0 :this.examples.hashCode()));
        result = ((result* 31)+((this.paramAdditionalContext == null)? 0 :this.paramAdditionalContext.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.parameterInputType == null)? 0 :this.parameterInputType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Function) == false) {
            return false;
        }
        Function rhs = ((Function) other);
        return (((((((this.input == rhs.input)||((this.input!= null)&&this.input.equals(rhs.input)))&&((this.examples == rhs.examples)||((this.examples!= null)&&this.examples.equals(rhs.examples))))&&((this.paramAdditionalContext == rhs.paramAdditionalContext)||((this.paramAdditionalContext!= null)&&this.paramAdditionalContext.equals(rhs.paramAdditionalContext))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.parameterInputType == rhs.parameterInputType)||((this.parameterInputType!= null)&&this.parameterInputType.equals(rhs.parameterInputType))));
    }

    @Generated("jsonschema2pojo")
    public enum ParameterType {

        NOT_REQUIRED("NotRequired"),
        ALL_INDEX_ELASTIC_SEARCH("AllIndexElasticSearch"),
        SPECIFIC_INDEX_ELASTIC_SEARCH("SpecificIndexElasticSearch"),
        READ_FROM_PARAM_CONTEXT("ReadFromParamContext");
        private final String value;
        private final static Map<String, Function.ParameterType> CONSTANTS = new HashMap<String, Function.ParameterType>();

        static {
            for (Function.ParameterType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ParameterType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Function.ParameterType fromValue(String value) {
            Function.ParameterType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
