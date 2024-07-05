
package org.openmetadata.schema.metadataIngestion;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DatabaseServiceQueryLineagePipeline
 * <p>
 * DatabaseService Query Lineage Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "queryLogDuration",
    "queryLogFilePath",
    "resultLimit",
    "parsingTimeoutLimit",
    "filterCondition",
    "schemaFilterPattern",
    "tableFilterPattern",
    "databaseFilterPattern"
})
@Generated("jsonschema2pojo")
public class DatabaseServiceQueryLineagePipeline {

    /**
     * Database Source Config Usage Pipeline type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Database Source Config Usage Pipeline type")
    private DatabaseServiceQueryLineagePipeline.DatabaseLineageConfigType type = DatabaseServiceQueryLineagePipeline.DatabaseLineageConfigType.fromValue("DatabaseLineage");
    /**
     * Query Log Duration
     * <p>
     * Configuration to tune how far we want to look back in query logs to process lineage data.
     * 
     */
    @JsonProperty("queryLogDuration")
    @JsonPropertyDescription("Configuration to tune how far we want to look back in query logs to process lineage data.")
    private Integer queryLogDuration = 1;
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
     * Result Limit
     * <p>
     * Configuration to set the limit for query logs
     * 
     */
    @JsonProperty("resultLimit")
    @JsonPropertyDescription("Configuration to set the limit for query logs")
    private Integer resultLimit = 1000;
    /**
     * Parsing Timeout Limit
     * <p>
     * Configuration to set the timeout for parsing the query in seconds.
     * 
     */
    @JsonProperty("parsingTimeoutLimit")
    @JsonPropertyDescription("Configuration to set the timeout for parsing the query in seconds.")
    private Integer parsingTimeoutLimit = 300;
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
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("schemaFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern schemaFilterPattern;
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("tableFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern tableFilterPattern;
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("databaseFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern databaseFilterPattern;

    /**
     * Database Source Config Usage Pipeline type
     * 
     */
    @JsonProperty("type")
    public DatabaseServiceQueryLineagePipeline.DatabaseLineageConfigType getType() {
        return type;
    }

    /**
     * Database Source Config Usage Pipeline type
     * 
     */
    @JsonProperty("type")
    public void setType(DatabaseServiceQueryLineagePipeline.DatabaseLineageConfigType type) {
        this.type = type;
    }

    public DatabaseServiceQueryLineagePipeline withType(DatabaseServiceQueryLineagePipeline.DatabaseLineageConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Query Log Duration
     * <p>
     * Configuration to tune how far we want to look back in query logs to process lineage data.
     * 
     */
    @JsonProperty("queryLogDuration")
    public Integer getQueryLogDuration() {
        return queryLogDuration;
    }

    /**
     * Query Log Duration
     * <p>
     * Configuration to tune how far we want to look back in query logs to process lineage data.
     * 
     */
    @JsonProperty("queryLogDuration")
    public void setQueryLogDuration(Integer queryLogDuration) {
        this.queryLogDuration = queryLogDuration;
    }

    public DatabaseServiceQueryLineagePipeline withQueryLogDuration(Integer queryLogDuration) {
        this.queryLogDuration = queryLogDuration;
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

    public DatabaseServiceQueryLineagePipeline withQueryLogFilePath(String queryLogFilePath) {
        this.queryLogFilePath = queryLogFilePath;
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

    public DatabaseServiceQueryLineagePipeline withResultLimit(Integer resultLimit) {
        this.resultLimit = resultLimit;
        return this;
    }

    /**
     * Parsing Timeout Limit
     * <p>
     * Configuration to set the timeout for parsing the query in seconds.
     * 
     */
    @JsonProperty("parsingTimeoutLimit")
    public Integer getParsingTimeoutLimit() {
        return parsingTimeoutLimit;
    }

    /**
     * Parsing Timeout Limit
     * <p>
     * Configuration to set the timeout for parsing the query in seconds.
     * 
     */
    @JsonProperty("parsingTimeoutLimit")
    public void setParsingTimeoutLimit(Integer parsingTimeoutLimit) {
        this.parsingTimeoutLimit = parsingTimeoutLimit;
    }

    public DatabaseServiceQueryLineagePipeline withParsingTimeoutLimit(Integer parsingTimeoutLimit) {
        this.parsingTimeoutLimit = parsingTimeoutLimit;
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

    public DatabaseServiceQueryLineagePipeline withFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("schemaFilterPattern")
    public FilterPattern getSchemaFilterPattern() {
        return schemaFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("schemaFilterPattern")
    public void setSchemaFilterPattern(FilterPattern schemaFilterPattern) {
        this.schemaFilterPattern = schemaFilterPattern;
    }

    public DatabaseServiceQueryLineagePipeline withSchemaFilterPattern(FilterPattern schemaFilterPattern) {
        this.schemaFilterPattern = schemaFilterPattern;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("tableFilterPattern")
    public FilterPattern getTableFilterPattern() {
        return tableFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("tableFilterPattern")
    public void setTableFilterPattern(FilterPattern tableFilterPattern) {
        this.tableFilterPattern = tableFilterPattern;
    }

    public DatabaseServiceQueryLineagePipeline withTableFilterPattern(FilterPattern tableFilterPattern) {
        this.tableFilterPattern = tableFilterPattern;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("databaseFilterPattern")
    public FilterPattern getDatabaseFilterPattern() {
        return databaseFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("databaseFilterPattern")
    public void setDatabaseFilterPattern(FilterPattern databaseFilterPattern) {
        this.databaseFilterPattern = databaseFilterPattern;
    }

    public DatabaseServiceQueryLineagePipeline withDatabaseFilterPattern(FilterPattern databaseFilterPattern) {
        this.databaseFilterPattern = databaseFilterPattern;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DatabaseServiceQueryLineagePipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("queryLogDuration");
        sb.append('=');
        sb.append(((this.queryLogDuration == null)?"<null>":this.queryLogDuration));
        sb.append(',');
        sb.append("queryLogFilePath");
        sb.append('=');
        sb.append(((this.queryLogFilePath == null)?"<null>":this.queryLogFilePath));
        sb.append(',');
        sb.append("resultLimit");
        sb.append('=');
        sb.append(((this.resultLimit == null)?"<null>":this.resultLimit));
        sb.append(',');
        sb.append("parsingTimeoutLimit");
        sb.append('=');
        sb.append(((this.parsingTimeoutLimit == null)?"<null>":this.parsingTimeoutLimit));
        sb.append(',');
        sb.append("filterCondition");
        sb.append('=');
        sb.append(((this.filterCondition == null)?"<null>":this.filterCondition));
        sb.append(',');
        sb.append("schemaFilterPattern");
        sb.append('=');
        sb.append(((this.schemaFilterPattern == null)?"<null>":this.schemaFilterPattern));
        sb.append(',');
        sb.append("tableFilterPattern");
        sb.append('=');
        sb.append(((this.tableFilterPattern == null)?"<null>":this.tableFilterPattern));
        sb.append(',');
        sb.append("databaseFilterPattern");
        sb.append('=');
        sb.append(((this.databaseFilterPattern == null)?"<null>":this.databaseFilterPattern));
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
        result = ((result* 31)+((this.parsingTimeoutLimit == null)? 0 :this.parsingTimeoutLimit.hashCode()));
        result = ((result* 31)+((this.tableFilterPattern == null)? 0 :this.tableFilterPattern.hashCode()));
        result = ((result* 31)+((this.resultLimit == null)? 0 :this.resultLimit.hashCode()));
        result = ((result* 31)+((this.schemaFilterPattern == null)? 0 :this.schemaFilterPattern.hashCode()));
        result = ((result* 31)+((this.filterCondition == null)? 0 :this.filterCondition.hashCode()));
        result = ((result* 31)+((this.databaseFilterPattern == null)? 0 :this.databaseFilterPattern.hashCode()));
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
        if ((other instanceof DatabaseServiceQueryLineagePipeline) == false) {
            return false;
        }
        DatabaseServiceQueryLineagePipeline rhs = ((DatabaseServiceQueryLineagePipeline) other);
        return ((((((((((this.parsingTimeoutLimit == rhs.parsingTimeoutLimit)||((this.parsingTimeoutLimit!= null)&&this.parsingTimeoutLimit.equals(rhs.parsingTimeoutLimit)))&&((this.tableFilterPattern == rhs.tableFilterPattern)||((this.tableFilterPattern!= null)&&this.tableFilterPattern.equals(rhs.tableFilterPattern))))&&((this.resultLimit == rhs.resultLimit)||((this.resultLimit!= null)&&this.resultLimit.equals(rhs.resultLimit))))&&((this.schemaFilterPattern == rhs.schemaFilterPattern)||((this.schemaFilterPattern!= null)&&this.schemaFilterPattern.equals(rhs.schemaFilterPattern))))&&((this.filterCondition == rhs.filterCondition)||((this.filterCondition!= null)&&this.filterCondition.equals(rhs.filterCondition))))&&((this.databaseFilterPattern == rhs.databaseFilterPattern)||((this.databaseFilterPattern!= null)&&this.databaseFilterPattern.equals(rhs.databaseFilterPattern))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.queryLogFilePath == rhs.queryLogFilePath)||((this.queryLogFilePath!= null)&&this.queryLogFilePath.equals(rhs.queryLogFilePath))))&&((this.queryLogDuration == rhs.queryLogDuration)||((this.queryLogDuration!= null)&&this.queryLogDuration.equals(rhs.queryLogDuration))));
    }


    /**
     * Database Source Config Usage Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DatabaseLineageConfigType {

        DATABASE_LINEAGE("DatabaseLineage");
        private final String value;
        private final static Map<String, DatabaseServiceQueryLineagePipeline.DatabaseLineageConfigType> CONSTANTS = new HashMap<String, DatabaseServiceQueryLineagePipeline.DatabaseLineageConfigType>();

        static {
            for (DatabaseServiceQueryLineagePipeline.DatabaseLineageConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DatabaseLineageConfigType(String value) {
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
        public static DatabaseServiceQueryLineagePipeline.DatabaseLineageConfigType fromValue(String value) {
            DatabaseServiceQueryLineagePipeline.DatabaseLineageConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
