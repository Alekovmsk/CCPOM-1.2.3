
package org.openmetadata.schema.tests.type;

import java.util.LinkedHashMap;
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


/**
 * Schema to capture test case result.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "testCaseFailureStatusType",
    "testCaseFailureReason",
    "testCaseFailureComment",
    "updatedBy",
    "updatedAt"
})
@Generated("jsonschema2pojo")
public class TestCaseFailureStatus {

    /**
     * Status of Test Case Acknowledgement.
     * 
     */
    @JsonProperty("testCaseFailureStatusType")
    @JsonPropertyDescription("Status of Test Case Acknowledgement.")
    private TestCaseFailureStatusType testCaseFailureStatusType;
    /**
     * Reason of Test Case resolution.
     * 
     */
    @JsonProperty("testCaseFailureReason")
    @JsonPropertyDescription("Reason of Test Case resolution.")
    private TestCaseFailureReason testCaseFailureReason;
    /**
     * Test case failure resolution comment.
     * 
     */
    @JsonProperty("testCaseFailureComment")
    @JsonPropertyDescription("Test case failure resolution comment.")
    private String testCaseFailureComment;
    /**
     * User who updated the test case failure status.
     * 
     */
    @JsonProperty("updatedBy")
    @JsonPropertyDescription("User who updated the test case failure status.")
    private String updatedBy;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long updatedAt;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Status of Test Case Acknowledgement.
     * 
     */
    @JsonProperty("testCaseFailureStatusType")
    public TestCaseFailureStatusType getTestCaseFailureStatusType() {
        return testCaseFailureStatusType;
    }

    /**
     * Status of Test Case Acknowledgement.
     * 
     */
    @JsonProperty("testCaseFailureStatusType")
    public void setTestCaseFailureStatusType(TestCaseFailureStatusType testCaseFailureStatusType) {
        this.testCaseFailureStatusType = testCaseFailureStatusType;
    }

    public TestCaseFailureStatus withTestCaseFailureStatusType(TestCaseFailureStatusType testCaseFailureStatusType) {
        this.testCaseFailureStatusType = testCaseFailureStatusType;
        return this;
    }

    /**
     * Reason of Test Case resolution.
     * 
     */
    @JsonProperty("testCaseFailureReason")
    public TestCaseFailureReason getTestCaseFailureReason() {
        return testCaseFailureReason;
    }

    /**
     * Reason of Test Case resolution.
     * 
     */
    @JsonProperty("testCaseFailureReason")
    public void setTestCaseFailureReason(TestCaseFailureReason testCaseFailureReason) {
        this.testCaseFailureReason = testCaseFailureReason;
    }

    public TestCaseFailureStatus withTestCaseFailureReason(TestCaseFailureReason testCaseFailureReason) {
        this.testCaseFailureReason = testCaseFailureReason;
        return this;
    }

    /**
     * Test case failure resolution comment.
     * 
     */
    @JsonProperty("testCaseFailureComment")
    public String getTestCaseFailureComment() {
        return testCaseFailureComment;
    }

    /**
     * Test case failure resolution comment.
     * 
     */
    @JsonProperty("testCaseFailureComment")
    public void setTestCaseFailureComment(String testCaseFailureComment) {
        this.testCaseFailureComment = testCaseFailureComment;
    }

    public TestCaseFailureStatus withTestCaseFailureComment(String testCaseFailureComment) {
        this.testCaseFailureComment = testCaseFailureComment;
        return this;
    }

    /**
     * User who updated the test case failure status.
     * 
     */
    @JsonProperty("updatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * User who updated the test case failure status.
     * 
     */
    @JsonProperty("updatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public TestCaseFailureStatus withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    public Long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TestCaseFailureStatus withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
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

    public TestCaseFailureStatus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestCaseFailureStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("testCaseFailureStatusType");
        sb.append('=');
        sb.append(((this.testCaseFailureStatusType == null)?"<null>":this.testCaseFailureStatusType));
        sb.append(',');
        sb.append("testCaseFailureReason");
        sb.append('=');
        sb.append(((this.testCaseFailureReason == null)?"<null>":this.testCaseFailureReason));
        sb.append(',');
        sb.append("testCaseFailureComment");
        sb.append('=');
        sb.append(((this.testCaseFailureComment == null)?"<null>":this.testCaseFailureComment));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
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
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.testCaseFailureStatusType == null)? 0 :this.testCaseFailureStatusType.hashCode()));
        result = ((result* 31)+((this.testCaseFailureComment == null)? 0 :this.testCaseFailureComment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.testCaseFailureReason == null)? 0 :this.testCaseFailureReason.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestCaseFailureStatus) == false) {
            return false;
        }
        TestCaseFailureStatus rhs = ((TestCaseFailureStatus) other);
        return (((((((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy)))&&((this.testCaseFailureStatusType == rhs.testCaseFailureStatusType)||((this.testCaseFailureStatusType!= null)&&this.testCaseFailureStatusType.equals(rhs.testCaseFailureStatusType))))&&((this.testCaseFailureComment == rhs.testCaseFailureComment)||((this.testCaseFailureComment!= null)&&this.testCaseFailureComment.equals(rhs.testCaseFailureComment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.testCaseFailureReason == rhs.testCaseFailureReason)||((this.testCaseFailureReason!= null)&&this.testCaseFailureReason.equals(rhs.testCaseFailureReason))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
