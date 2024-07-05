
package org.openmetadata.schema.entity.services.connections;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Function that tests one specific element of the service. E.g., listing schemas, lineage, or tags.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "errorMessage",
    "mandatory",
    "shortCircuit"
})
@Generated("jsonschema2pojo")
public class TestConnectionStep {

    /**
     * Name of the step being tested
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the step being tested")
    @NotNull
    private String name;
    /**
     * What is the goal of the step
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("What is the goal of the step")
    @NotNull
    private String description;
    /**
     * In case of error this message should be displayed on UI, We define this message manually on test connection definition
     * 
     */
    @JsonProperty("errorMessage")
    @JsonPropertyDescription("In case of error this message should be displayed on UI, We define this message manually on test connection definition")
    private String errorMessage;
    /**
     * Is this step mandatory to be passed?
     * (Required)
     * 
     */
    @JsonProperty("mandatory")
    @JsonPropertyDescription("Is this step mandatory to be passed?")
    @NotNull
    private Boolean mandatory = true;
    /**
     * This field if set to true, indicates that the step is important enough to break the process in case of failure.
     * 
     */
    @JsonProperty("shortCircuit")
    @JsonPropertyDescription("This field if set to true, indicates that the step is important enough to break the process in case of failure.")
    private Boolean shortCircuit = false;

    /**
     * Name of the step being tested
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the step being tested
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TestConnectionStep withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * What is the goal of the step
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * What is the goal of the step
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public TestConnectionStep withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * In case of error this message should be displayed on UI, We define this message manually on test connection definition
     * 
     */
    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * In case of error this message should be displayed on UI, We define this message manually on test connection definition
     * 
     */
    @JsonProperty("errorMessage")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public TestConnectionStep withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Is this step mandatory to be passed?
     * (Required)
     * 
     */
    @JsonProperty("mandatory")
    public Boolean getMandatory() {
        return mandatory;
    }

    /**
     * Is this step mandatory to be passed?
     * (Required)
     * 
     */
    @JsonProperty("mandatory")
    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public TestConnectionStep withMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
        return this;
    }

    /**
     * This field if set to true, indicates that the step is important enough to break the process in case of failure.
     * 
     */
    @JsonProperty("shortCircuit")
    public Boolean getShortCircuit() {
        return shortCircuit;
    }

    /**
     * This field if set to true, indicates that the step is important enough to break the process in case of failure.
     * 
     */
    @JsonProperty("shortCircuit")
    public void setShortCircuit(Boolean shortCircuit) {
        this.shortCircuit = shortCircuit;
    }

    public TestConnectionStep withShortCircuit(Boolean shortCircuit) {
        this.shortCircuit = shortCircuit;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestConnectionStep.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("errorMessage");
        sb.append('=');
        sb.append(((this.errorMessage == null)?"<null>":this.errorMessage));
        sb.append(',');
        sb.append("mandatory");
        sb.append('=');
        sb.append(((this.mandatory == null)?"<null>":this.mandatory));
        sb.append(',');
        sb.append("shortCircuit");
        sb.append('=');
        sb.append(((this.shortCircuit == null)?"<null>":this.shortCircuit));
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
        result = ((result* 31)+((this.errorMessage == null)? 0 :this.errorMessage.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.mandatory == null)? 0 :this.mandatory.hashCode()));
        result = ((result* 31)+((this.shortCircuit == null)? 0 :this.shortCircuit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestConnectionStep) == false) {
            return false;
        }
        TestConnectionStep rhs = ((TestConnectionStep) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.errorMessage == rhs.errorMessage)||((this.errorMessage!= null)&&this.errorMessage.equals(rhs.errorMessage))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.mandatory == rhs.mandatory)||((this.mandatory!= null)&&this.mandatory.equals(rhs.mandatory))))&&((this.shortCircuit == rhs.shortCircuit)||((this.shortCircuit!= null)&&this.shortCircuit.equals(rhs.shortCircuit))));
    }

}
