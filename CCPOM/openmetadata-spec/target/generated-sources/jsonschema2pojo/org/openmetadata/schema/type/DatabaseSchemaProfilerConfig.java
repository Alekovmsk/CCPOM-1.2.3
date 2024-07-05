
package org.openmetadata.schema.type;

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
import org.openmetadata.schema.services.connections.database.SampleDataStorageConfig;


/**
 * This schema defines the type for Schema profile config.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "profileSample",
    "profileSampleType",
    "sampleDataCount",
    "sampleDataStorageConfig"
})
@Generated("jsonschema2pojo")
public class DatabaseSchemaProfilerConfig {

    /**
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
     * Sample Data Rows Count
     * <p>
     * Number of row of sample data to be generated
     * 
     */
    @JsonProperty("sampleDataCount")
    @JsonPropertyDescription("Number of row of sample data to be generated")
    private Integer sampleDataCount = 50;
    /**
     * Storage config to store sample data
     * 
     */
    @JsonProperty("sampleDataStorageConfig")
    @JsonPropertyDescription("Storage config to store sample data")
    @Valid
    private SampleDataStorageConfig sampleDataStorageConfig;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Percentage of data or no. of rows we want to execute the profiler and tests on
     * 
     */
    @JsonProperty("profileSample")
    public Double getProfileSample() {
        return profileSample;
    }

    /**
     * Percentage of data or no. of rows we want to execute the profiler and tests on
     * 
     */
    @JsonProperty("profileSample")
    public void setProfileSample(Double profileSample) {
        this.profileSample = profileSample;
    }

    public DatabaseSchemaProfilerConfig withProfileSample(Double profileSample) {
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

    public DatabaseSchemaProfilerConfig withProfileSampleType(org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType profileSampleType) {
        this.profileSampleType = profileSampleType;
        return this;
    }

    /**
     * Sample Data Rows Count
     * <p>
     * Number of row of sample data to be generated
     * 
     */
    @JsonProperty("sampleDataCount")
    public Integer getSampleDataCount() {
        return sampleDataCount;
    }

    /**
     * Sample Data Rows Count
     * <p>
     * Number of row of sample data to be generated
     * 
     */
    @JsonProperty("sampleDataCount")
    public void setSampleDataCount(Integer sampleDataCount) {
        this.sampleDataCount = sampleDataCount;
    }

    public DatabaseSchemaProfilerConfig withSampleDataCount(Integer sampleDataCount) {
        this.sampleDataCount = sampleDataCount;
        return this;
    }

    /**
     * Storage config to store sample data
     * 
     */
    @JsonProperty("sampleDataStorageConfig")
    public SampleDataStorageConfig getSampleDataStorageConfig() {
        return sampleDataStorageConfig;
    }

    /**
     * Storage config to store sample data
     * 
     */
    @JsonProperty("sampleDataStorageConfig")
    public void setSampleDataStorageConfig(SampleDataStorageConfig sampleDataStorageConfig) {
        this.sampleDataStorageConfig = sampleDataStorageConfig;
    }

    public DatabaseSchemaProfilerConfig withSampleDataStorageConfig(SampleDataStorageConfig sampleDataStorageConfig) {
        this.sampleDataStorageConfig = sampleDataStorageConfig;
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

    public DatabaseSchemaProfilerConfig withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DatabaseSchemaProfilerConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("profileSample");
        sb.append('=');
        sb.append(((this.profileSample == null)?"<null>":this.profileSample));
        sb.append(',');
        sb.append("profileSampleType");
        sb.append('=');
        sb.append(((this.profileSampleType == null)?"<null>":this.profileSampleType));
        sb.append(',');
        sb.append("sampleDataCount");
        sb.append('=');
        sb.append(((this.sampleDataCount == null)?"<null>":this.sampleDataCount));
        sb.append(',');
        sb.append("sampleDataStorageConfig");
        sb.append('=');
        sb.append(((this.sampleDataStorageConfig == null)?"<null>":this.sampleDataStorageConfig));
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
        result = ((result* 31)+((this.sampleDataStorageConfig == null)? 0 :this.sampleDataStorageConfig.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sampleDataCount == null)? 0 :this.sampleDataCount.hashCode()));
        result = ((result* 31)+((this.profileSample == null)? 0 :this.profileSample.hashCode()));
        result = ((result* 31)+((this.profileSampleType == null)? 0 :this.profileSampleType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatabaseSchemaProfilerConfig) == false) {
            return false;
        }
        DatabaseSchemaProfilerConfig rhs = ((DatabaseSchemaProfilerConfig) other);
        return ((((((this.sampleDataStorageConfig == rhs.sampleDataStorageConfig)||((this.sampleDataStorageConfig!= null)&&this.sampleDataStorageConfig.equals(rhs.sampleDataStorageConfig)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sampleDataCount == rhs.sampleDataCount)||((this.sampleDataCount!= null)&&this.sampleDataCount.equals(rhs.sampleDataCount))))&&((this.profileSample == rhs.profileSample)||((this.profileSample!= null)&&this.profileSample.equals(rhs.profileSample))))&&((this.profileSampleType == rhs.profileSampleType)||((this.profileSampleType!= null)&&this.profileSampleType.equals(rhs.profileSampleType))));
    }

}
