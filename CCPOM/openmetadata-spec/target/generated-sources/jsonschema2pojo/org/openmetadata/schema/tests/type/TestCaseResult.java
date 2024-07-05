
package org.openmetadata.schema.tests.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
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
    "timestamp",
    "testCaseStatus",
    "result",
    "sampleData",
    "testResultValue",
    "testCaseFailureStatus"
})
@Generated("jsonschema2pojo")
public class TestCaseResult {

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * Status of Test Case run.
     * 
     */
    @JsonProperty("testCaseStatus")
    @JsonPropertyDescription("Status of Test Case run.")
    private TestCaseStatus testCaseStatus;
    /**
     * Details of test case results.
     * 
     */
    @JsonProperty("result")
    @JsonPropertyDescription("Details of test case results.")
    private String result;
    /**
     * sample data to capture rows/columns that didn't match the expressed testcase.
     * 
     */
    @JsonProperty("sampleData")
    @JsonPropertyDescription("sample data to capture rows/columns that didn't match the expressed testcase.")
    private String sampleData;
    @JsonProperty("testResultValue")
    @Valid
    private List<TestResultValue> testResultValue = new ArrayList<TestResultValue>();
    /**
     * Schema to capture test case result.
     * 
     */
    @JsonProperty("testCaseFailureStatus")
    @JsonPropertyDescription("Schema to capture test case result.")
    @Valid
    private TestCaseFailureStatus testCaseFailureStatus;

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public TestCaseResult withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Status of Test Case run.
     * 
     */
    @JsonProperty("testCaseStatus")
    public TestCaseStatus getTestCaseStatus() {
        return testCaseStatus;
    }

    /**
     * Status of Test Case run.
     * 
     */
    @JsonProperty("testCaseStatus")
    public void setTestCaseStatus(TestCaseStatus testCaseStatus) {
        this.testCaseStatus = testCaseStatus;
    }

    public TestCaseResult withTestCaseStatus(TestCaseStatus testCaseStatus) {
        this.testCaseStatus = testCaseStatus;
        return this;
    }

    /**
     * Details of test case results.
     * 
     */
    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    /**
     * Details of test case results.
     * 
     */
    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    public TestCaseResult withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * sample data to capture rows/columns that didn't match the expressed testcase.
     * 
     */
    @JsonProperty("sampleData")
    public String getSampleData() {
        return sampleData;
    }

    /**
     * sample data to capture rows/columns that didn't match the expressed testcase.
     * 
     */
    @JsonProperty("sampleData")
    public void setSampleData(String sampleData) {
        this.sampleData = sampleData;
    }

    public TestCaseResult withSampleData(String sampleData) {
        this.sampleData = sampleData;
        return this;
    }

    @JsonProperty("testResultValue")
    public List<TestResultValue> getTestResultValue() {
        return testResultValue;
    }

    @JsonProperty("testResultValue")
    public void setTestResultValue(List<TestResultValue> testResultValue) {
        this.testResultValue = testResultValue;
    }

    public TestCaseResult withTestResultValue(List<TestResultValue> testResultValue) {
        this.testResultValue = testResultValue;
        return this;
    }

    /**
     * Schema to capture test case result.
     * 
     */
    @JsonProperty("testCaseFailureStatus")
    public TestCaseFailureStatus getTestCaseFailureStatus() {
        return testCaseFailureStatus;
    }

    /**
     * Schema to capture test case result.
     * 
     */
    @JsonProperty("testCaseFailureStatus")
    public void setTestCaseFailureStatus(TestCaseFailureStatus testCaseFailureStatus) {
        this.testCaseFailureStatus = testCaseFailureStatus;
    }

    public TestCaseResult withTestCaseFailureStatus(TestCaseFailureStatus testCaseFailureStatus) {
        this.testCaseFailureStatus = testCaseFailureStatus;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestCaseResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("testCaseStatus");
        sb.append('=');
        sb.append(((this.testCaseStatus == null)?"<null>":this.testCaseStatus));
        sb.append(',');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("sampleData");
        sb.append('=');
        sb.append(((this.sampleData == null)?"<null>":this.sampleData));
        sb.append(',');
        sb.append("testResultValue");
        sb.append('=');
        sb.append(((this.testResultValue == null)?"<null>":this.testResultValue));
        sb.append(',');
        sb.append("testCaseFailureStatus");
        sb.append('=');
        sb.append(((this.testCaseFailureStatus == null)?"<null>":this.testCaseFailureStatus));
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
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.testCaseStatus == null)? 0 :this.testCaseStatus.hashCode()));
        result = ((result* 31)+((this.testCaseFailureStatus == null)? 0 :this.testCaseFailureStatus.hashCode()));
        result = ((result* 31)+((this.sampleData == null)? 0 :this.sampleData.hashCode()));
        result = ((result* 31)+((this.testResultValue == null)? 0 :this.testResultValue.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestCaseResult) == false) {
            return false;
        }
        TestCaseResult rhs = ((TestCaseResult) other);
        return (((((((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)))&&((this.testCaseStatus == rhs.testCaseStatus)||((this.testCaseStatus!= null)&&this.testCaseStatus.equals(rhs.testCaseStatus))))&&((this.testCaseFailureStatus == rhs.testCaseFailureStatus)||((this.testCaseFailureStatus!= null)&&this.testCaseFailureStatus.equals(rhs.testCaseFailureStatus))))&&((this.sampleData == rhs.sampleData)||((this.sampleData!= null)&&this.sampleData.equals(rhs.sampleData))))&&((this.testResultValue == rhs.testResultValue)||((this.testResultValue!= null)&&this.testResultValue.equals(rhs.testResultValue))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
