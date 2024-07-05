
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
 * DatabaseServiceMetadataPipeline
 * <p>
 * DatabaseService Metadata Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "markDeletedTables",
    "markDeletedStoredProcedures",
    "includeTables",
    "includeViews",
    "includeTags",
    "includeStoredProcedures",
    "queryLogDuration",
    "queryParsingTimeoutLimit",
    "useFqnForFiltering",
    "schemaFilterPattern",
    "tableFilterPattern",
    "databaseFilterPattern"
})
@Generated("jsonschema2pojo")
public class DatabaseServiceMetadataPipeline {

    /**
     * Database Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Database Source Config Metadata Pipeline type")
    private DatabaseServiceMetadataPipeline.DatabaseMetadataConfigType type = DatabaseServiceMetadataPipeline.DatabaseMetadataConfigType.fromValue("DatabaseMetadata");
    /**
     * Mark Deleted Tables
     * <p>
     * This is an optional configuration for enabling soft deletion of tables. When this option is enabled, only tables that have been deleted from the source will be soft deleted, and this will apply solely to the schema that is currently being ingested via the pipeline. Any related entities such as test suites or lineage information that were associated with those tables will also be deleted.
     * 
     */
    @JsonProperty("markDeletedTables")
    @JsonPropertyDescription("This is an optional configuration for enabling soft deletion of tables. When this option is enabled, only tables that have been deleted from the source will be soft deleted, and this will apply solely to the schema that is currently being ingested via the pipeline. Any related entities such as test suites or lineage information that were associated with those tables will also be deleted.")
    private Boolean markDeletedTables = true;
    /**
     * Mark Deleted Stored Procedures
     * <p>
     * Optional configuration to soft delete stored procedures in OpenMetadata if the source stored procedures are deleted. Also, if the stored procedures is deleted, all the associated entities like lineage, etc., with that stored procedures will be deleted
     * 
     */
    @JsonProperty("markDeletedStoredProcedures")
    @JsonPropertyDescription("Optional configuration to soft delete stored procedures in OpenMetadata if the source stored procedures are deleted. Also, if the stored procedures is deleted, all the associated entities like lineage, etc., with that stored procedures will be deleted")
    private Boolean markDeletedStoredProcedures = true;
    /**
     * Include Tables
     * <p>
     * Optional configuration to turn off fetching metadata for tables.
     * 
     */
    @JsonProperty("includeTables")
    @JsonPropertyDescription("Optional configuration to turn off fetching metadata for tables.")
    private Boolean includeTables = true;
    /**
     * Include Views
     * <p>
     * Optional configuration to turn off fetching metadata for views.
     * 
     */
    @JsonProperty("includeViews")
    @JsonPropertyDescription("Optional configuration to turn off fetching metadata for views.")
    private Boolean includeViews = true;
    /**
     * Include Tags
     * <p>
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    @JsonPropertyDescription("Optional configuration to toggle the tags ingestion.")
    private Boolean includeTags = true;
    /**
     * Include Stored Procedures
     * <p>
     * Optional configuration to toggle the Stored Procedures ingestion.
     * 
     */
    @JsonProperty("includeStoredProcedures")
    @JsonPropertyDescription("Optional configuration to toggle the Stored Procedures ingestion.")
    private Boolean includeStoredProcedures = true;
    /**
     * Query Log Duration
     * <p>
     * Configuration to tune how far we want to look back in query logs to process Stored Procedures results.
     * 
     */
    @JsonProperty("queryLogDuration")
    @JsonPropertyDescription("Configuration to tune how far we want to look back in query logs to process Stored Procedures results.")
    private Integer queryLogDuration = 1;
    /**
     * Query Parsing Timeout Limit
     * <p>
     * Configuration to set the timeout for parsing the query in seconds.
     * 
     */
    @JsonProperty("queryParsingTimeoutLimit")
    @JsonPropertyDescription("Configuration to set the timeout for parsing the query in seconds.")
    private Integer queryParsingTimeoutLimit = 300;
    /**
     * Use FQN For Filtering
     * <p>
     * Regex will be applied on fully qualified name (e.g service_name.db_name.schema_name.table_name) instead of raw name (e.g. table_name)
     * 
     */
    @JsonProperty("useFqnForFiltering")
    @JsonPropertyDescription("Regex will be applied on fully qualified name (e.g service_name.db_name.schema_name.table_name) instead of raw name (e.g. table_name)")
    private Boolean useFqnForFiltering = false;
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
     * Database Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public DatabaseServiceMetadataPipeline.DatabaseMetadataConfigType getType() {
        return type;
    }

    /**
     * Database Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public void setType(DatabaseServiceMetadataPipeline.DatabaseMetadataConfigType type) {
        this.type = type;
    }

    public DatabaseServiceMetadataPipeline withType(DatabaseServiceMetadataPipeline.DatabaseMetadataConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Mark Deleted Tables
     * <p>
     * This is an optional configuration for enabling soft deletion of tables. When this option is enabled, only tables that have been deleted from the source will be soft deleted, and this will apply solely to the schema that is currently being ingested via the pipeline. Any related entities such as test suites or lineage information that were associated with those tables will also be deleted.
     * 
     */
    @JsonProperty("markDeletedTables")
    public Boolean getMarkDeletedTables() {
        return markDeletedTables;
    }

    /**
     * Mark Deleted Tables
     * <p>
     * This is an optional configuration for enabling soft deletion of tables. When this option is enabled, only tables that have been deleted from the source will be soft deleted, and this will apply solely to the schema that is currently being ingested via the pipeline. Any related entities such as test suites or lineage information that were associated with those tables will also be deleted.
     * 
     */
    @JsonProperty("markDeletedTables")
    public void setMarkDeletedTables(Boolean markDeletedTables) {
        this.markDeletedTables = markDeletedTables;
    }

    public DatabaseServiceMetadataPipeline withMarkDeletedTables(Boolean markDeletedTables) {
        this.markDeletedTables = markDeletedTables;
        return this;
    }

    /**
     * Mark Deleted Stored Procedures
     * <p>
     * Optional configuration to soft delete stored procedures in OpenMetadata if the source stored procedures are deleted. Also, if the stored procedures is deleted, all the associated entities like lineage, etc., with that stored procedures will be deleted
     * 
     */
    @JsonProperty("markDeletedStoredProcedures")
    public Boolean getMarkDeletedStoredProcedures() {
        return markDeletedStoredProcedures;
    }

    /**
     * Mark Deleted Stored Procedures
     * <p>
     * Optional configuration to soft delete stored procedures in OpenMetadata if the source stored procedures are deleted. Also, if the stored procedures is deleted, all the associated entities like lineage, etc., with that stored procedures will be deleted
     * 
     */
    @JsonProperty("markDeletedStoredProcedures")
    public void setMarkDeletedStoredProcedures(Boolean markDeletedStoredProcedures) {
        this.markDeletedStoredProcedures = markDeletedStoredProcedures;
    }

    public DatabaseServiceMetadataPipeline withMarkDeletedStoredProcedures(Boolean markDeletedStoredProcedures) {
        this.markDeletedStoredProcedures = markDeletedStoredProcedures;
        return this;
    }

    /**
     * Include Tables
     * <p>
     * Optional configuration to turn off fetching metadata for tables.
     * 
     */
    @JsonProperty("includeTables")
    public Boolean getIncludeTables() {
        return includeTables;
    }

    /**
     * Include Tables
     * <p>
     * Optional configuration to turn off fetching metadata for tables.
     * 
     */
    @JsonProperty("includeTables")
    public void setIncludeTables(Boolean includeTables) {
        this.includeTables = includeTables;
    }

    public DatabaseServiceMetadataPipeline withIncludeTables(Boolean includeTables) {
        this.includeTables = includeTables;
        return this;
    }

    /**
     * Include Views
     * <p>
     * Optional configuration to turn off fetching metadata for views.
     * 
     */
    @JsonProperty("includeViews")
    public Boolean getIncludeViews() {
        return includeViews;
    }

    /**
     * Include Views
     * <p>
     * Optional configuration to turn off fetching metadata for views.
     * 
     */
    @JsonProperty("includeViews")
    public void setIncludeViews(Boolean includeViews) {
        this.includeViews = includeViews;
    }

    public DatabaseServiceMetadataPipeline withIncludeViews(Boolean includeViews) {
        this.includeViews = includeViews;
        return this;
    }

    /**
     * Include Tags
     * <p>
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    public Boolean getIncludeTags() {
        return includeTags;
    }

    /**
     * Include Tags
     * <p>
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    public void setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
    }

    public DatabaseServiceMetadataPipeline withIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }

    /**
     * Include Stored Procedures
     * <p>
     * Optional configuration to toggle the Stored Procedures ingestion.
     * 
     */
    @JsonProperty("includeStoredProcedures")
    public Boolean getIncludeStoredProcedures() {
        return includeStoredProcedures;
    }

    /**
     * Include Stored Procedures
     * <p>
     * Optional configuration to toggle the Stored Procedures ingestion.
     * 
     */
    @JsonProperty("includeStoredProcedures")
    public void setIncludeStoredProcedures(Boolean includeStoredProcedures) {
        this.includeStoredProcedures = includeStoredProcedures;
    }

    public DatabaseServiceMetadataPipeline withIncludeStoredProcedures(Boolean includeStoredProcedures) {
        this.includeStoredProcedures = includeStoredProcedures;
        return this;
    }

    /**
     * Query Log Duration
     * <p>
     * Configuration to tune how far we want to look back in query logs to process Stored Procedures results.
     * 
     */
    @JsonProperty("queryLogDuration")
    public Integer getQueryLogDuration() {
        return queryLogDuration;
    }

    /**
     * Query Log Duration
     * <p>
     * Configuration to tune how far we want to look back in query logs to process Stored Procedures results.
     * 
     */
    @JsonProperty("queryLogDuration")
    public void setQueryLogDuration(Integer queryLogDuration) {
        this.queryLogDuration = queryLogDuration;
    }

    public DatabaseServiceMetadataPipeline withQueryLogDuration(Integer queryLogDuration) {
        this.queryLogDuration = queryLogDuration;
        return this;
    }

    /**
     * Query Parsing Timeout Limit
     * <p>
     * Configuration to set the timeout for parsing the query in seconds.
     * 
     */
    @JsonProperty("queryParsingTimeoutLimit")
    public Integer getQueryParsingTimeoutLimit() {
        return queryParsingTimeoutLimit;
    }

    /**
     * Query Parsing Timeout Limit
     * <p>
     * Configuration to set the timeout for parsing the query in seconds.
     * 
     */
    @JsonProperty("queryParsingTimeoutLimit")
    public void setQueryParsingTimeoutLimit(Integer queryParsingTimeoutLimit) {
        this.queryParsingTimeoutLimit = queryParsingTimeoutLimit;
    }

    public DatabaseServiceMetadataPipeline withQueryParsingTimeoutLimit(Integer queryParsingTimeoutLimit) {
        this.queryParsingTimeoutLimit = queryParsingTimeoutLimit;
        return this;
    }

    /**
     * Use FQN For Filtering
     * <p>
     * Regex will be applied on fully qualified name (e.g service_name.db_name.schema_name.table_name) instead of raw name (e.g. table_name)
     * 
     */
    @JsonProperty("useFqnForFiltering")
    public Boolean getUseFqnForFiltering() {
        return useFqnForFiltering;
    }

    /**
     * Use FQN For Filtering
     * <p>
     * Regex will be applied on fully qualified name (e.g service_name.db_name.schema_name.table_name) instead of raw name (e.g. table_name)
     * 
     */
    @JsonProperty("useFqnForFiltering")
    public void setUseFqnForFiltering(Boolean useFqnForFiltering) {
        this.useFqnForFiltering = useFqnForFiltering;
    }

    public DatabaseServiceMetadataPipeline withUseFqnForFiltering(Boolean useFqnForFiltering) {
        this.useFqnForFiltering = useFqnForFiltering;
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

    public DatabaseServiceMetadataPipeline withSchemaFilterPattern(FilterPattern schemaFilterPattern) {
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

    public DatabaseServiceMetadataPipeline withTableFilterPattern(FilterPattern tableFilterPattern) {
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

    public DatabaseServiceMetadataPipeline withDatabaseFilterPattern(FilterPattern databaseFilterPattern) {
        this.databaseFilterPattern = databaseFilterPattern;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DatabaseServiceMetadataPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("markDeletedTables");
        sb.append('=');
        sb.append(((this.markDeletedTables == null)?"<null>":this.markDeletedTables));
        sb.append(',');
        sb.append("markDeletedStoredProcedures");
        sb.append('=');
        sb.append(((this.markDeletedStoredProcedures == null)?"<null>":this.markDeletedStoredProcedures));
        sb.append(',');
        sb.append("includeTables");
        sb.append('=');
        sb.append(((this.includeTables == null)?"<null>":this.includeTables));
        sb.append(',');
        sb.append("includeViews");
        sb.append('=');
        sb.append(((this.includeViews == null)?"<null>":this.includeViews));
        sb.append(',');
        sb.append("includeTags");
        sb.append('=');
        sb.append(((this.includeTags == null)?"<null>":this.includeTags));
        sb.append(',');
        sb.append("includeStoredProcedures");
        sb.append('=');
        sb.append(((this.includeStoredProcedures == null)?"<null>":this.includeStoredProcedures));
        sb.append(',');
        sb.append("queryLogDuration");
        sb.append('=');
        sb.append(((this.queryLogDuration == null)?"<null>":this.queryLogDuration));
        sb.append(',');
        sb.append("queryParsingTimeoutLimit");
        sb.append('=');
        sb.append(((this.queryParsingTimeoutLimit == null)?"<null>":this.queryParsingTimeoutLimit));
        sb.append(',');
        sb.append("useFqnForFiltering");
        sb.append('=');
        sb.append(((this.useFqnForFiltering == null)?"<null>":this.useFqnForFiltering));
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
        result = ((result* 31)+((this.includeTables == null)? 0 :this.includeTables.hashCode()));
        result = ((result* 31)+((this.includeViews == null)? 0 :this.includeViews.hashCode()));
        result = ((result* 31)+((this.includeStoredProcedures == null)? 0 :this.includeStoredProcedures.hashCode()));
        result = ((result* 31)+((this.tableFilterPattern == null)? 0 :this.tableFilterPattern.hashCode()));
        result = ((result* 31)+((this.includeTags == null)? 0 :this.includeTags.hashCode()));
        result = ((result* 31)+((this.useFqnForFiltering == null)? 0 :this.useFqnForFiltering.hashCode()));
        result = ((result* 31)+((this.databaseFilterPattern == null)? 0 :this.databaseFilterPattern.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.markDeletedStoredProcedures == null)? 0 :this.markDeletedStoredProcedures.hashCode()));
        result = ((result* 31)+((this.markDeletedTables == null)? 0 :this.markDeletedTables.hashCode()));
        result = ((result* 31)+((this.queryLogDuration == null)? 0 :this.queryLogDuration.hashCode()));
        result = ((result* 31)+((this.schemaFilterPattern == null)? 0 :this.schemaFilterPattern.hashCode()));
        result = ((result* 31)+((this.queryParsingTimeoutLimit == null)? 0 :this.queryParsingTimeoutLimit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatabaseServiceMetadataPipeline) == false) {
            return false;
        }
        DatabaseServiceMetadataPipeline rhs = ((DatabaseServiceMetadataPipeline) other);
        return ((((((((((((((this.includeTables == rhs.includeTables)||((this.includeTables!= null)&&this.includeTables.equals(rhs.includeTables)))&&((this.includeViews == rhs.includeViews)||((this.includeViews!= null)&&this.includeViews.equals(rhs.includeViews))))&&((this.includeStoredProcedures == rhs.includeStoredProcedures)||((this.includeStoredProcedures!= null)&&this.includeStoredProcedures.equals(rhs.includeStoredProcedures))))&&((this.tableFilterPattern == rhs.tableFilterPattern)||((this.tableFilterPattern!= null)&&this.tableFilterPattern.equals(rhs.tableFilterPattern))))&&((this.includeTags == rhs.includeTags)||((this.includeTags!= null)&&this.includeTags.equals(rhs.includeTags))))&&((this.useFqnForFiltering == rhs.useFqnForFiltering)||((this.useFqnForFiltering!= null)&&this.useFqnForFiltering.equals(rhs.useFqnForFiltering))))&&((this.databaseFilterPattern == rhs.databaseFilterPattern)||((this.databaseFilterPattern!= null)&&this.databaseFilterPattern.equals(rhs.databaseFilterPattern))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.markDeletedStoredProcedures == rhs.markDeletedStoredProcedures)||((this.markDeletedStoredProcedures!= null)&&this.markDeletedStoredProcedures.equals(rhs.markDeletedStoredProcedures))))&&((this.markDeletedTables == rhs.markDeletedTables)||((this.markDeletedTables!= null)&&this.markDeletedTables.equals(rhs.markDeletedTables))))&&((this.queryLogDuration == rhs.queryLogDuration)||((this.queryLogDuration!= null)&&this.queryLogDuration.equals(rhs.queryLogDuration))))&&((this.schemaFilterPattern == rhs.schemaFilterPattern)||((this.schemaFilterPattern!= null)&&this.schemaFilterPattern.equals(rhs.schemaFilterPattern))))&&((this.queryParsingTimeoutLimit == rhs.queryParsingTimeoutLimit)||((this.queryParsingTimeoutLimit!= null)&&this.queryParsingTimeoutLimit.equals(rhs.queryParsingTimeoutLimit))));
    }


    /**
     * Database Source Config Metadata Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DatabaseMetadataConfigType {

        DATABASE_METADATA("DatabaseMetadata");
        private final String value;
        private final static Map<String, DatabaseServiceMetadataPipeline.DatabaseMetadataConfigType> CONSTANTS = new HashMap<String, DatabaseServiceMetadataPipeline.DatabaseMetadataConfigType>();

        static {
            for (DatabaseServiceMetadataPipeline.DatabaseMetadataConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DatabaseMetadataConfigType(String value) {
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
        public static DatabaseServiceMetadataPipeline.DatabaseMetadataConfigType fromValue(String value) {
            DatabaseServiceMetadataPipeline.DatabaseMetadataConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
