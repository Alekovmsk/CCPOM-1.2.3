
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
    "mandatory",
    "passed",
    "message",
    "errorLog"
})
@Generated("jsonschema2pojo")
public class TestConnectionStepResult {

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
     * Is this step mandatory to be passed?
     * (Required)
     * 
     */
    @JsonProperty("mandatory")
    @JsonPropertyDescription("Is this step mandatory to be passed?")
    @NotNull
    private Boolean mandatory = true;
    /**
     * Did the step pass successfully?
     * (Required)
     * 
     */
    @JsonProperty("passed")
    @JsonPropertyDescription("Did the step pass successfully?")
    @NotNull
    private Boolean passed;
    /**
     * Results or exceptions to be shared after running the test. This message comes from the test connection definition
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Results or exceptions to be shared after running the test. This message comes from the test connection definition")
    private String message = null;
    /**
     * In case of failed step, this field would contain the actual error faced during the step.
     * 
     */
    @JsonProperty("errorLog")
    @JsonPropertyDescription("In case of failed step, this field would contain the actual error faced during the step.")
    private String errorLog = null;

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

    public TestConnectionStepResult withName(String name) {
        this.name = name;
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

    public TestConnectionStepResult withMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
        return this;
    }

    /**
     * Did the step pass successfully?
     * (Required)
     * 
     */
    @JsonProperty("passed")
    public Boolean getPassed() {
        return passed;
    }

    /**
     * Did the step pass successfully?
     * (Required)
     * 
     */
    @JsonProperty("passed")
    public void setPassed(Boolean passed) {
        this.passed = passed;
    }

    public TestConnectionStepResult withPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }

    /**
     * Results or exceptions to be shared after running the test. This message comes from the test connection definition
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Results or exceptions to be shared after running the test. This message comes from the test connection definition
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public TestConnectionStepResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * In case of failed step, this field would contain the actual error faced during the step.
     * 
     */
    @JsonProperty("errorLog")
    public String getErrorLog() {
        return errorLog;
    }

    /**
     * In case of failed step, this field would contain the actual error faced during the step.
     * 
     */
    @JsonProperty("errorLog")
    public void setErrorLog(String errorLog) {
        this.errorLog = errorLog;
    }

    public TestConnectionStepResult withErrorLog(String errorLog) {
        this.errorLog = errorLog;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestConnectionStepResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("mandatory");
        sb.append('=');
        sb.append(((this.mandatory == null)?"<null>":this.mandatory));
        sb.append(',');
        sb.append("passed");
        sb.append('=');
        sb.append(((this.passed == null)?"<null>":this.passed));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("errorLog");
        sb.append('=');
        sb.append(((this.errorLog == null)?"<null>":this.errorLog));
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
        result = ((result* 31)+((this.errorLog == null)? 0 :this.errorLog.hashCode()));
        result = ((result* 31)+((this.passed == null)? 0 :this.passed.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.mandatory == null)? 0 :this.mandatory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestConnectionStepResult) == false) {
            return false;
        }
        TestConnectionStepResult rhs = ((TestConnectionStepResult) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.errorLog == rhs.errorLog)||((this.errorLog!= null)&&this.errorLog.equals(rhs.errorLog))))&&((this.passed == rhs.passed)||((this.passed!= null)&&this.passed.equals(rhs.passed))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.mandatory == rhs.mandatory)||((this.mandatory!= null)&&this.mandatory.equals(rhs.mandatory))));
    }

}
