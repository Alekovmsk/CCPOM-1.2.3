
package org.openmetadata.schema.api.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateLogicalTestCases
 * <p>
 * Object used to create logical test cases.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "testSuiteId",
    "testCaseIds"
})
@Generated("jsonschema2pojo")
public class CreateLogicalTestCases {

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("testSuiteId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    @NotNull
    private UUID testSuiteId;
    /**
     * Ids of the test cases to create.
     * (Required)
     * 
     */
    @JsonProperty("testCaseIds")
    @JsonPropertyDescription("Ids of the test cases to create.")
    @Valid
    @NotNull
    private List<UUID> testCaseIds = new ArrayList<UUID>();

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("testSuiteId")
    public UUID getTestSuiteId() {
        return testSuiteId;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("testSuiteId")
    public void setTestSuiteId(UUID testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    public CreateLogicalTestCases withTestSuiteId(UUID testSuiteId) {
        this.testSuiteId = testSuiteId;
        return this;
    }

    /**
     * Ids of the test cases to create.
     * (Required)
     * 
     */
    @JsonProperty("testCaseIds")
    public List<UUID> getTestCaseIds() {
        return testCaseIds;
    }

    /**
     * Ids of the test cases to create.
     * (Required)
     * 
     */
    @JsonProperty("testCaseIds")
    public void setTestCaseIds(List<UUID> testCaseIds) {
        this.testCaseIds = testCaseIds;
    }

    public CreateLogicalTestCases withTestCaseIds(List<UUID> testCaseIds) {
        this.testCaseIds = testCaseIds;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateLogicalTestCases.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("testSuiteId");
        sb.append('=');
        sb.append(((this.testSuiteId == null)?"<null>":this.testSuiteId));
        sb.append(',');
        sb.append("testCaseIds");
        sb.append('=');
        sb.append(((this.testCaseIds == null)?"<null>":this.testCaseIds));
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
        result = ((result* 31)+((this.testCaseIds == null)? 0 :this.testCaseIds.hashCode()));
        result = ((result* 31)+((this.testSuiteId == null)? 0 :this.testSuiteId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateLogicalTestCases) == false) {
            return false;
        }
        CreateLogicalTestCases rhs = ((CreateLogicalTestCases) other);
        return (((this.testCaseIds == rhs.testCaseIds)||((this.testCaseIds!= null)&&this.testCaseIds.equals(rhs.testCaseIds)))&&((this.testSuiteId == rhs.testSuiteId)||((this.testSuiteId!= null)&&this.testSuiteId.equals(rhs.testSuiteId))));
    }

}
