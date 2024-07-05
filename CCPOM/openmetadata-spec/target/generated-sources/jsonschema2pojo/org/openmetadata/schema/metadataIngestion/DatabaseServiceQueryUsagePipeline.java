
package org.openmetadata.schema.metadataIngestion;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DatabaseServiceQueryUsagePipeline
 * <p>
 * DatabaseService Query Usage Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "queryLogDuration",
    "stageFileLocation",
    "filterCondition",
    "resultLimit",
    "queryLogFilePath"
})
@Generated("jsonschema2pojo")
public class DatabaseServiceQueryUsagePipeline {

    /**
     * Database Source Config Usage Pipeline type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Database Source Config Usage Pipeline type")
    private DatabaseServiceQueryUsagePipeline.DatabaseUsageConfigType type = DatabaseServiceQueryUsagePipeline.DatabaseUsageConfigType.fromValue("DatabaseUsage");
    /**
     * Query Log Duration
     * <p>
     * Configuration to tune how far we want to look back in query logs to process usage data.
     * 
     */
    @JsonProperty("queryLogDuration")
    @JsonPropertyDescription("Configuration to tune how far we want to look back in query logs to process usage data.")
    private Integer queryLogDuration = 1;
    /**
     * Stage File Location
     * <p>
     * Temporary file name to store the query logs before processing. Absolute file path required.
     * 
     */
    @JsonProperty("stageFileLocation")
    @JsonPropertyDescription("Temporary file name to store the query logs before processing. Absolute file path required.")
    private String stageFileLocation = "/tmp/query_log";
    /**
     * Filter Condition
     * <p>
     * Configuration the condition to filter the query history.
     * 
     */
    @JsonProperty("filterCondition")
    @JsonPropertyDescription("Configuration the condition to filter the query history.")
    private String filterCondition;
    /**
     * Result Limit
     * <p>
     * Configuration to set the limit for query logs
     * 
     */
    @JsonProperty("resultLimit")
    @JsonPropertyDescription("Configuration to set the limit for query logs")
    private Integer resultLimit = 1000;
    /**
     * Query Log File Path
     * <p>
     * Configuration to set the file path for query logs
     * 
     */
    @JsonProperty("queryLogFilePath")
    @JsonPropertyDescription("Configuration to set the file path for query logs")
    private String queryLogFilePath;

    /**
     * Database Source Config Usage Pipeline type
     * 
     */
    @JsonProperty("type")
    public DatabaseServiceQueryUsagePipeline.DatabaseUsageConfigType getType() {
        return type;
    }

    /**
     * Database Source Config Usage Pipeline type
     * 
     */
    @JsonProperty("type")
    public void setType(DatabaseServiceQueryUsagePipeline.DatabaseUsageConfigType type) {
        this.type = type;
    }

    public DatabaseServiceQueryUsagePipeline withType(DatabaseServiceQueryUsagePipeline.DatabaseUsageConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Query Log Duration
     * <p>
     * Configuration to tune how far we want to look back in query logs to process usage data.
     * 
     */
    @JsonProperty("queryLogDuration")
    public Integer getQueryLogDuration() {
        return queryLogDuration;
    }

    /**
     * Query Log Duration
     * <p>
     * Configuration to tune how far we want to look back in query logs to process usage data.
     * 
     */
    @JsonProperty("queryLogDuration")
    public void setQueryLogDuration(Integer queryLogDuration) {
        this.queryLogDuration = queryLogDuration;
    }

    public DatabaseServiceQueryUsagePipeline withQueryLogDuration(Integer queryLogDuration) {
        this.queryLogDuration = queryLogDuration;
        return this;
    }

    /**
     * Stage File Location
     * <p>
     * Temporary file name to store the query logs before processing. Absolute file path required.
     * 
     */
    @JsonProperty("stageFileLocation")
    public String getStageFileLocation() {
        return stageFileLocation;
    }

    /**
     * Stage File Location
     * <p>
     * Temporary file name to store the query logs before processing. Absolute file path required.
     * 
     */
    @JsonProperty("stageFileLocation")
    public void setStageFileLocation(String stageFileLocation) {
        this.stageFileLocation = stageFileLocation;
    }

    public DatabaseServiceQueryUsagePipeline withStageFileLocation(String stageFileLocation) {
        this.stageFileLocation = stageFileLocation;
        return this;
    }

    /**
     * Filter Condition
     * <p>
     * Configuration the condition to filter the query history.
     * 
     */
    @JsonProperty("filterCondition")
    public String getFilterCondition() {
        return filterCondition;
    }

    /**
     * Filter Condition
     * <p>
     * Configuration the condition to filter the query history.
     * 
     */
    @JsonProperty("filterCondition")
    public void setFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
    }

    public DatabaseServiceQueryUsagePipeline withFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }

    /**
     * Result Limit
     * <p>
     * Configuration to set the limit for query logs
     * 
     */
    @JsonProperty("resultLimit")
    public Integer getResultLimit() {
        return resultLimit;
    }

    /**
     * Result Limit
     * <p>
     * Configuration to set the limit for query logs
     * 
     */
    @JsonProperty("resultLimit")
    public void setResultLimit(Integer resultLimit) {
        this.resultLimit = resultLimit;
    }

    public DatabaseServiceQueryUsagePipeline withResultLimit(Integer resultLimit) {
        this.resultLimit = resultLimit;
        return this;
    }

    /**
     * Query Log File Path
     * <p>
     * Configuration to set the file path for query logs
     * 
     */
    @JsonProperty("queryLogFilePath")
    public String getQueryLogFilePath() {
        return queryLogFilePath;
    }

    /**
     * Query Log File Path
     * <p>
     * Configuration to set the file path for query logs
     * 
     */
    @JsonProperty("queryLogFilePath")
    public void setQueryLogFilePath(String queryLogFilePath) {
        this.queryLogFilePath = queryLogFilePath;
    }

    public DatabaseServiceQueryUsagePipeline withQueryLogFilePath(String queryLogFilePath) {
        this.queryLogFilePath = queryLogFilePath;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DatabaseServiceQueryUsagePipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("queryLogDuration");
        sb.append('=');
        sb.append(((this.queryLogDuration == null)?"<null>":this.queryLogDuration));
        sb.append(',');
        sb.append("stageFileLocation");
        sb.append('=');
        sb.append(((this.stageFileLocation == null)?"<null>":this.stageFileLocation));
        sb.append(',');
        sb.append("filterCondition");
        sb.append('=');
        sb.append(((this.filterCondition == null)?"<null>":this.filterCondition));
        sb.append(',');
        sb.append("resultLimit");
        sb.append('=');
        sb.append(((this.resultLimit == null)?"<null>":this.resultLimit));
        sb.append(',');
        sb.append("queryLogFilePath");
        sb.append('=');
        sb.append(((this.queryLogFilePath == null)?"<null>":this.queryLogFilePath));
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
        result = ((result* 31)+((this.stageFileLocation == null)? 0 :this.stageFileLocation.hashCode()));
        result = ((result* 31)+((this.resultLimit == null)? 0 :this.resultLimit.hashCode()));
        result = ((result* 31)+((this.filterCondition == null)? 0 :this.filterCondition.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.queryLogFilePath == null)? 0 :this.queryLogFilePath.hashCode()));
        result = ((result* 31)+((this.queryLogDuration == null)? 0 :this.queryLogDuration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatabaseServiceQueryUsagePipeline) == false) {
            return false;
        }
        DatabaseServiceQueryUsagePipeline rhs = ((DatabaseServiceQueryUsagePipeline) other);
        return (((((((this.stageFileLocation == rhs.stageFileLocation)||((this.stageFileLocation!= null)&&this.stageFileLocation.equals(rhs.stageFileLocation)))&&((this.resultLimit == rhs.resultLimit)||((this.resultLimit!= null)&&this.resultLimit.equals(rhs.resultLimit))))&&((this.filterCondition == rhs.filterCondition)||((this.filterCondition!= null)&&this.filterCondition.equals(rhs.filterCondition))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.queryLogFilePath == rhs.queryLogFilePath)||((this.queryLogFilePath!= null)&&this.queryLogFilePath.equals(rhs.queryLogFilePath))))&&((this.queryLogDuration == rhs.queryLogDuration)||((this.queryLogDuration!= null)&&this.queryLogDuration.equals(rhs.queryLogDuration))));
    }


    /**
     * Database Source Config Usage Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DatabaseUsageConfigType {

        DATABASE_USAGE("DatabaseUsage");
        private final String value;
        private final static Map<String, DatabaseServiceQueryUsagePipeline.DatabaseUsageConfigType> CONSTANTS = new HashMap<String, DatabaseServiceQueryUsagePipeline.DatabaseUsageConfigType>();

        static {
            for (DatabaseServiceQueryUsagePipeline.DatabaseUsageConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DatabaseUsageConfigType(String value) {
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
        public static DatabaseServiceQueryUsagePipeline.DatabaseUsageConfigType fromValue(String value) {
            DatabaseServiceQueryUsagePipeline.DatabaseUsageConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
