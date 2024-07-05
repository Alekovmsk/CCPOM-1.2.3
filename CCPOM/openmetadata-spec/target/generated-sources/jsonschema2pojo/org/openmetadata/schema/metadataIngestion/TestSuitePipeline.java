
package org.openmetadata.schema.metadataIngestion;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TestSuitePipeline
 * <p>
 * TestSuite Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "entityFullyQualifiedName",
    "profileSample",
    "profileSampleType"
})
@Generated("jsonschema2pojo")
public class TestSuitePipeline {

    /**
     * Pipeline Source Config Metadata Pipeline type
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Pipeline Source Config Metadata Pipeline type")
    @NotNull
    private TestSuitePipeline.TestSuiteConfigType type = TestSuitePipeline.TestSuiteConfigType.fromValue("TestSuite");
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("entityFullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String entityFullyQualifiedName;
    /**
     * Profile Sample
     * <p>
     * Percentage of data or no. of rows we want to execute the profiler and tests on
     * 
     */
    @JsonProperty("profileSample")
    @JsonPropertyDescription("Percentage of data or no. of rows we want to execute the profiler and tests on")
    private Double profileSample = null;
    /**
     * Type of Profile Sample (percentage or rows)
     * 
     */
    @JsonProperty("profileSampleType")
    @JsonPropertyDescription("Type of Profile Sample (percentage or rows)")
    private org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType profileSampleType = org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType.fromValue("PERCENTAGE");

    /**
     * Pipeline Source Config Metadata Pipeline type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public TestSuitePipeline.TestSuiteConfigType getType() {
        return type;
    }

    /**
     * Pipeline Source Config Metadata Pipeline type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(TestSuitePipeline.TestSuiteConfigType type) {
        this.type = type;
    }

    public TestSuitePipeline withType(TestSuitePipeline.TestSuiteConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("entityFullyQualifiedName")
    public String getEntityFullyQualifiedName() {
        return entityFullyQualifiedName;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("entityFullyQualifiedName")
    public void setEntityFullyQualifiedName(String entityFullyQualifiedName) {
        this.entityFullyQualifiedName = entityFullyQualifiedName;
    }

    public TestSuitePipeline withEntityFullyQualifiedName(String entityFullyQualifiedName) {
        this.entityFullyQualifiedName = entityFullyQualifiedName;
        return this;
    }

    /**
     * Profile Sample
     * <p>
     * Percentage of data or no. of rows we want to execute the profiler and tests on
     * 
     */
    @JsonProperty("profileSample")
    public Double getProfileSample() {
        return profileSample;
    }

    /**
     * Profile Sample
     * <p>
     * Percentage of data or no. of rows we want to execute the profiler and tests on
     * 
     */
    @JsonProperty("profileSample")
    public void setProfileSample(Double profileSample) {
        this.profileSample = profileSample;
    }

    public TestSuitePipeline withProfileSample(Double profileSample) {
        this.profileSample = profileSample;
        return this;
    }

    /**
     * Type of Profile Sample (percentage or rows)
     * 
     */
    @JsonProperty("profileSampleType")
    public org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType getProfileSampleType() {
        return profileSampleType;
    }

    /**
     * Type of Profile Sample (percentage or rows)
     * 
     */
    @JsonProperty("profileSampleType")
    public void setProfileSampleType(org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType profileSampleType) {
        this.profileSampleType = profileSampleType;
    }

    public TestSuitePipeline withProfileSampleType(org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType profileSampleType) {
        this.profileSampleType = profileSampleType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestSuitePipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("entityFullyQualifiedName");
        sb.append('=');
        sb.append(((this.entityFullyQualifiedName == null)?"<null>":this.entityFullyQualifiedName));
        sb.append(',');
        sb.append("profileSample");
        sb.append('=');
        sb.append(((this.profileSample == null)?"<null>":this.profileSample));
        sb.append(',');
        sb.append("profileSampleType");
        sb.append('=');
        sb.append(((this.profileSampleType == null)?"<null>":this.profileSampleType));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.entityFullyQualifiedName == null)? 0 :this.entityFullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.profileSample == null)? 0 :this.profileSample.hashCode()));
        result = ((result* 31)+((this.profileSampleType == null)? 0 :this.profileSampleType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestSuitePipeline) == false) {
            return false;
        }
        TestSuitePipeline rhs = ((TestSuitePipeline) other);
        return (((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.entityFullyQualifiedName == rhs.entityFullyQualifiedName)||((this.entityFullyQualifiedName!= null)&&this.entityFullyQualifiedName.equals(rhs.entityFullyQualifiedName))))&&((this.profileSample == rhs.profileSample)||((this.profileSample!= null)&&this.profileSample.equals(rhs.profileSample))))&&((this.profileSampleType == rhs.profileSampleType)||((this.profileSampleType!= null)&&this.profileSampleType.equals(rhs.profileSampleType))));
    }


    /**
     * Pipeline Source Config Metadata Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TestSuiteConfigType {

        TEST_SUITE("TestSuite");
        private final String value;
        private final static Map<String, TestSuitePipeline.TestSuiteConfigType> CONSTANTS = new HashMap<String, TestSuitePipeline.TestSuiteConfigType>();

        static {
            for (TestSuitePipeline.TestSuiteConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TestSuiteConfigType(String value) {
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
        public static TestSuitePipeline.TestSuiteConfigType fromValue(String value) {
            TestSuitePipeline.TestSuiteConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
