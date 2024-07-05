
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the type for Table profile config.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "profileSample",
    "profileSampleType",
    "sampleDataCount",
    "profileQuery",
    "excludeColumns",
    "includeColumns",
    "partitioning"
})
@Generated("jsonschema2pojo")
public class TableProfilerConfig {

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
    private TableProfilerConfig.ProfileSampleType profileSampleType = TableProfilerConfig.ProfileSampleType.fromValue("PERCENTAGE");
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
     * Users' raw SQL query to fetch sample data and profile the table
     * 
     */
    @JsonProperty("profileQuery")
    @JsonPropertyDescription("Users' raw SQL query to fetch sample data and profile the table")
    private String profileQuery = null;
    /**
     * column names to exclude from profiling.
     * 
     */
    @JsonProperty("excludeColumns")
    @JsonPropertyDescription("column names to exclude from profiling.")
    @Valid
    private List<String> excludeColumns = null;
    /**
     * Only run profiler on included columns with specific metrics.
     * 
     */
    @JsonProperty("includeColumns")
    @JsonPropertyDescription("Only run profiler on included columns with specific metrics.")
    @Valid
    private List<ColumnProfilerConfig> includeColumns = null;
    /**
     * This schema defines the partition configuration used by profiler.
     * 
     */
    @JsonProperty("partitioning")
    @JsonPropertyDescription("This schema defines the partition configuration used by profiler.")
    @Valid
    private PartitionProfilerConfig partitioning;
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

    public TableProfilerConfig withProfileSample(Double profileSample) {
        this.profileSample = profileSample;
        return this;
    }

    /**
     * Type of Profile Sample (percentage or rows)
     * 
     */
    @JsonProperty("profileSampleType")
    public TableProfilerConfig.ProfileSampleType getProfileSampleType() {
        return profileSampleType;
    }

    /**
     * Type of Profile Sample (percentage or rows)
     * 
     */
    @JsonProperty("profileSampleType")
    public void setProfileSampleType(TableProfilerConfig.ProfileSampleType profileSampleType) {
        this.profileSampleType = profileSampleType;
    }

    public TableProfilerConfig withProfileSampleType(TableProfilerConfig.ProfileSampleType profileSampleType) {
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

    public TableProfilerConfig withSampleDataCount(Integer sampleDataCount) {
        this.sampleDataCount = sampleDataCount;
        return this;
    }

    /**
     * Users' raw SQL query to fetch sample data and profile the table
     * 
     */
    @JsonProperty("profileQuery")
    public String getProfileQuery() {
        return profileQuery;
    }

    /**
     * Users' raw SQL query to fetch sample data and profile the table
     * 
     */
    @JsonProperty("profileQuery")
    public void setProfileQuery(String profileQuery) {
        this.profileQuery = profileQuery;
    }

    public TableProfilerConfig withProfileQuery(String profileQuery) {
        this.profileQuery = profileQuery;
        return this;
    }

    /**
     * column names to exclude from profiling.
     * 
     */
    @JsonProperty("excludeColumns")
    public List<String> getExcludeColumns() {
        return excludeColumns;
    }

    /**
     * column names to exclude from profiling.
     * 
     */
    @JsonProperty("excludeColumns")
    public void setExcludeColumns(List<String> excludeColumns) {
        this.excludeColumns = excludeColumns;
    }

    public TableProfilerConfig withExcludeColumns(List<String> excludeColumns) {
        this.excludeColumns = excludeColumns;
        return this;
    }

    /**
     * Only run profiler on included columns with specific metrics.
     * 
     */
    @JsonProperty("includeColumns")
    public List<ColumnProfilerConfig> getIncludeColumns() {
        return includeColumns;
    }

    /**
     * Only run profiler on included columns with specific metrics.
     * 
     */
    @JsonProperty("includeColumns")
    public void setIncludeColumns(List<ColumnProfilerConfig> includeColumns) {
        this.includeColumns = includeColumns;
    }

    public TableProfilerConfig withIncludeColumns(List<ColumnProfilerConfig> includeColumns) {
        this.includeColumns = includeColumns;
        return this;
    }

    /**
     * This schema defines the partition configuration used by profiler.
     * 
     */
    @JsonProperty("partitioning")
    public PartitionProfilerConfig getPartitioning() {
        return partitioning;
    }

    /**
     * This schema defines the partition configuration used by profiler.
     * 
     */
    @JsonProperty("partitioning")
    public void setPartitioning(PartitionProfilerConfig partitioning) {
        this.partitioning = partitioning;
    }

    public TableProfilerConfig withPartitioning(PartitionProfilerConfig partitioning) {
        this.partitioning = partitioning;
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

    public TableProfilerConfig withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TableProfilerConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("profileQuery");
        sb.append('=');
        sb.append(((this.profileQuery == null)?"<null>":this.profileQuery));
        sb.append(',');
        sb.append("excludeColumns");
        sb.append('=');
        sb.append(((this.excludeColumns == null)?"<null>":this.excludeColumns));
        sb.append(',');
        sb.append("includeColumns");
        sb.append('=');
        sb.append(((this.includeColumns == null)?"<null>":this.includeColumns));
        sb.append(',');
        sb.append("partitioning");
        sb.append('=');
        sb.append(((this.partitioning == null)?"<null>":this.partitioning));
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
        result = ((result* 31)+((this.profileQuery == null)? 0 :this.profileQuery.hashCode()));
        result = ((result* 31)+((this.excludeColumns == null)? 0 :this.excludeColumns.hashCode()));
        result = ((result* 31)+((this.sampleDataCount == null)? 0 :this.sampleDataCount.hashCode()));
        result = ((result* 31)+((this.profileSampleType == null)? 0 :this.profileSampleType.hashCode()));
        result = ((result* 31)+((this.partitioning == null)? 0 :this.partitioning.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.includeColumns == null)? 0 :this.includeColumns.hashCode()));
        result = ((result* 31)+((this.profileSample == null)? 0 :this.profileSample.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableProfilerConfig) == false) {
            return false;
        }
        TableProfilerConfig rhs = ((TableProfilerConfig) other);
        return (((((((((this.profileQuery == rhs.profileQuery)||((this.profileQuery!= null)&&this.profileQuery.equals(rhs.profileQuery)))&&((this.excludeColumns == rhs.excludeColumns)||((this.excludeColumns!= null)&&this.excludeColumns.equals(rhs.excludeColumns))))&&((this.sampleDataCount == rhs.sampleDataCount)||((this.sampleDataCount!= null)&&this.sampleDataCount.equals(rhs.sampleDataCount))))&&((this.profileSampleType == rhs.profileSampleType)||((this.profileSampleType!= null)&&this.profileSampleType.equals(rhs.profileSampleType))))&&((this.partitioning == rhs.partitioning)||((this.partitioning!= null)&&this.partitioning.equals(rhs.partitioning))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.includeColumns == rhs.includeColumns)||((this.includeColumns!= null)&&this.includeColumns.equals(rhs.includeColumns))))&&((this.profileSample == rhs.profileSample)||((this.profileSample!= null)&&this.profileSample.equals(rhs.profileSample))));
    }


    /**
     * Type of Profile Sample (percentage or rows)
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ProfileSampleType {

        PERCENTAGE("PERCENTAGE"),
        ROWS("ROWS");
        private final String value;
        private final static Map<String, TableProfilerConfig.ProfileSampleType> CONSTANTS = new HashMap<String, TableProfilerConfig.ProfileSampleType>();

        static {
            for (TableProfilerConfig.ProfileSampleType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ProfileSampleType(String value) {
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
        public static TableProfilerConfig.ProfileSampleType fromValue(String value) {
            TableProfilerConfig.ProfileSampleType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
