
package org.openmetadata.schema.entity.services.connections;

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
 * TestConnectionResult
 * <p>
 * TestConnectionResult is the definition that will encapsulate result of running the test connection steps.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lastUpdatedAt",
    "status",
    "steps"
})
@Generated("jsonschema2pojo")
public class TestConnectionResult {

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastUpdatedAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long lastUpdatedAt;
    /**
     * Enum defining possible Test Connection Result status
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Enum defining possible Test Connection Result status")
    private TestConnectionResultStatus status;
    /**
     * Steps to test the connection. Order matters.
     * (Required)
     * 
     */
    @JsonProperty("steps")
    @JsonPropertyDescription("Steps to test the connection. Order matters.")
    @Valid
    @NotNull
    private List<TestConnectionStepResult> steps = new ArrayList<TestConnectionStepResult>();

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastUpdatedAt")
    public Long getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public TestConnectionResult withLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * Enum defining possible Test Connection Result status
     * 
     */
    @JsonProperty("status")
    public TestConnectionResultStatus getStatus() {
        return status;
    }

    /**
     * Enum defining possible Test Connection Result status
     * 
     */
    @JsonProperty("status")
    public void setStatus(TestConnectionResultStatus status) {
        this.status = status;
    }

    public TestConnectionResult withStatus(TestConnectionResultStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Steps to test the connection. Order matters.
     * (Required)
     * 
     */
    @JsonProperty("steps")
    public List<TestConnectionStepResult> getSteps() {
        return steps;
    }

    /**
     * Steps to test the connection. Order matters.
     * (Required)
     * 
     */
    @JsonProperty("steps")
    public void setSteps(List<TestConnectionStepResult> steps) {
        this.steps = steps;
    }

    public TestConnectionResult withSteps(List<TestConnectionStepResult> steps) {
        this.steps = steps;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestConnectionResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lastUpdatedAt");
        sb.append('=');
        sb.append(((this.lastUpdatedAt == null)?"<null>":this.lastUpdatedAt));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("steps");
        sb.append('=');
        sb.append(((this.steps == null)?"<null>":this.steps));
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
        result = ((result* 31)+((this.lastUpdatedAt == null)? 0 :this.lastUpdatedAt.hashCode()));
        result = ((result* 31)+((this.steps == null)? 0 :this.steps.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestConnectionResult) == false) {
            return false;
        }
        TestConnectionResult rhs = ((TestConnectionResult) other);
        return ((((this.lastUpdatedAt == rhs.lastUpdatedAt)||((this.lastUpdatedAt!= null)&&this.lastUpdatedAt.equals(rhs.lastUpdatedAt)))&&((this.steps == rhs.steps)||((this.steps!= null)&&this.steps.equals(rhs.steps))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
