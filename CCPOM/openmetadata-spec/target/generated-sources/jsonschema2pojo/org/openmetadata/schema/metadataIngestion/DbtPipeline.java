
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
import org.openmetadata.annotations.MaskedField;


/**
 * dbtPipeline
 * <p>
 * DBT Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "dbtConfigSource",
    "dbtUpdateDescriptions",
    "includeTags",
    "dbtClassificationName",
    "schemaFilterPattern",
    "tableFilterPattern",
    "parsingTimeoutLimit",
    "databaseFilterPattern"
})
@Generated("jsonschema2pojo")
public class DbtPipeline {

    /**
     * DBT Config Pipeline type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("DBT Config Pipeline type")
    private DbtPipeline.DbtConfigType type = DbtPipeline.DbtConfigType.fromValue("DBT");
    /**
     * DBT Configuration Source
     * <p>
     * Available sources to fetch DBT catalog and manifest files.
     * 
     */
    @JsonProperty("dbtConfigSource")
    @JsonPropertyDescription("Available sources to fetch DBT catalog and manifest files.")
    @MaskedField
    private Object dbtConfigSource;
    /**
     * Optional configuration to update the description from DBT or not
     * 
     */
    @JsonProperty("dbtUpdateDescriptions")
    @JsonPropertyDescription("Optional configuration to update the description from DBT or not")
    private Boolean dbtUpdateDescriptions = false;
    /**
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    @JsonPropertyDescription("Optional configuration to toggle the tags ingestion.")
    private Boolean includeTags = true;
    /**
     * dbt Classification Name
     * <p>
     * Custom OpenMetadata Classification name for dbt tags.
     * 
     */
    @JsonProperty("dbtClassificationName")
    @JsonPropertyDescription("Custom OpenMetadata Classification name for dbt tags.")
    private String dbtClassificationName = "dbtTags";
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
     * Parsing Timeout Limit (in sec.)
     * <p>
     * Configuration to set the timeout for parsing the query in seconds.
     * 
     */
    @JsonProperty("parsingTimeoutLimit")
    @JsonPropertyDescription("Configuration to set the timeout for parsing the query in seconds.")
    private Integer parsingTimeoutLimit = 300;
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("databaseFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern databaseFilterPattern;

    /**
     * DBT Config Pipeline type
     * 
     */
    @JsonProperty("type")
    public DbtPipeline.DbtConfigType getType() {
        return type;
    }

    /**
     * DBT Config Pipeline type
     * 
     */
    @JsonProperty("type")
    public void setType(DbtPipeline.DbtConfigType type) {
        this.type = type;
    }

    public DbtPipeline withType(DbtPipeline.DbtConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * DBT Configuration Source
     * <p>
     * Available sources to fetch DBT catalog and manifest files.
     * 
     */
    @JsonProperty("dbtConfigSource")
    @MaskedField
    public Object getDbtConfigSource() {
        return dbtConfigSource;
    }

    /**
     * DBT Configuration Source
     * <p>
     * Available sources to fetch DBT catalog and manifest files.
     * 
     */
    @JsonProperty("dbtConfigSource")
    @MaskedField
    public void setDbtConfigSource(Object dbtConfigSource) {
        this.dbtConfigSource = dbtConfigSource;
    }

    public DbtPipeline withDbtConfigSource(Object dbtConfigSource) {
        this.dbtConfigSource = dbtConfigSource;
        return this;
    }

    /**
     * Optional configuration to update the description from DBT or not
     * 
     */
    @JsonProperty("dbtUpdateDescriptions")
    public Boolean getDbtUpdateDescriptions() {
        return dbtUpdateDescriptions;
    }

    /**
     * Optional configuration to update the description from DBT or not
     * 
     */
    @JsonProperty("dbtUpdateDescriptions")
    public void setDbtUpdateDescriptions(Boolean dbtUpdateDescriptions) {
        this.dbtUpdateDescriptions = dbtUpdateDescriptions;
    }

    public DbtPipeline withDbtUpdateDescriptions(Boolean dbtUpdateDescriptions) {
        this.dbtUpdateDescriptions = dbtUpdateDescriptions;
        return this;
    }

    /**
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    public Boolean getIncludeTags() {
        return includeTags;
    }

    /**
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    public void setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
    }

    public DbtPipeline withIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }

    /**
     * dbt Classification Name
     * <p>
     * Custom OpenMetadata Classification name for dbt tags.
     * 
     */
    @JsonProperty("dbtClassificationName")
    public String getDbtClassificationName() {
        return dbtClassificationName;
    }

    /**
     * dbt Classification Name
     * <p>
     * Custom OpenMetadata Classification name for dbt tags.
     * 
     */
    @JsonProperty("dbtClassificationName")
    public void setDbtClassificationName(String dbtClassificationName) {
        this.dbtClassificationName = dbtClassificationName;
    }

    public DbtPipeline withDbtClassificationName(String dbtClassificationName) {
        this.dbtClassificationName = dbtClassificationName;
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

    public DbtPipeline withSchemaFilterPattern(FilterPattern schemaFilterPattern) {
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

    public DbtPipeline withTableFilterPattern(FilterPattern tableFilterPattern) {
        this.tableFilterPattern = tableFilterPattern;
        return this;
    }

    /**
     * Parsing Timeout Limit (in sec.)
     * <p>
     * Configuration to set the timeout for parsing the query in seconds.
     * 
     */
    @JsonProperty("parsingTimeoutLimit")
    public Integer getParsingTimeoutLimit() {
        return parsingTimeoutLimit;
    }

    /**
     * Parsing Timeout Limit (in sec.)
     * <p>
     * Configuration to set the timeout for parsing the query in seconds.
     * 
     */
    @JsonProperty("parsingTimeoutLimit")
    public void setParsingTimeoutLimit(Integer parsingTimeoutLimit) {
        this.parsingTimeoutLimit = parsingTimeoutLimit;
    }

    public DbtPipeline withParsingTimeoutLimit(Integer parsingTimeoutLimit) {
        this.parsingTimeoutLimit = parsingTimeoutLimit;
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

    public DbtPipeline withDatabaseFilterPattern(FilterPattern databaseFilterPattern) {
        this.databaseFilterPattern = databaseFilterPattern;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DbtPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("dbtConfigSource");
        sb.append('=');
        sb.append(((this.dbtConfigSource == null)?"<null>":this.dbtConfigSource));
        sb.append(',');
        sb.append("dbtUpdateDescriptions");
        sb.append('=');
        sb.append(((this.dbtUpdateDescriptions == null)?"<null>":this.dbtUpdateDescriptions));
        sb.append(',');
        sb.append("includeTags");
        sb.append('=');
        sb.append(((this.includeTags == null)?"<null>":this.includeTags));
        sb.append(',');
        sb.append("dbtClassificationName");
        sb.append('=');
        sb.append(((this.dbtClassificationName == null)?"<null>":this.dbtClassificationName));
        sb.append(',');
        sb.append("schemaFilterPattern");
        sb.append('=');
        sb.append(((this.schemaFilterPattern == null)?"<null>":this.schemaFilterPattern));
        sb.append(',');
        sb.append("tableFilterPattern");
        sb.append('=');
        sb.append(((this.tableFilterPattern == null)?"<null>":this.tableFilterPattern));
        sb.append(',');
        sb.append("parsingTimeoutLimit");
        sb.append('=');
        sb.append(((this.parsingTimeoutLimit == null)?"<null>":this.parsingTimeoutLimit));
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
        result = ((result* 31)+((this.tableFilterPattern == null)? 0 :this.tableFilterPattern.hashCode()));
        result = ((result* 31)+((this.parsingTimeoutLimit == null)? 0 :this.parsingTimeoutLimit.hashCode()));
        result = ((result* 31)+((this.schemaFilterPattern == null)? 0 :this.schemaFilterPattern.hashCode()));
        result = ((result* 31)+((this.dbtClassificationName == null)? 0 :this.dbtClassificationName.hashCode()));
        result = ((result* 31)+((this.includeTags == null)? 0 :this.includeTags.hashCode()));
        result = ((result* 31)+((this.dbtUpdateDescriptions == null)? 0 :this.dbtUpdateDescriptions.hashCode()));
        result = ((result* 31)+((this.databaseFilterPattern == null)? 0 :this.databaseFilterPattern.hashCode()));
        result = ((result* 31)+((this.dbtConfigSource == null)? 0 :this.dbtConfigSource.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DbtPipeline) == false) {
            return false;
        }
        DbtPipeline rhs = ((DbtPipeline) other);
        return ((((((((((this.tableFilterPattern == rhs.tableFilterPattern)||((this.tableFilterPattern!= null)&&this.tableFilterPattern.equals(rhs.tableFilterPattern)))&&((this.parsingTimeoutLimit == rhs.parsingTimeoutLimit)||((this.parsingTimeoutLimit!= null)&&this.parsingTimeoutLimit.equals(rhs.parsingTimeoutLimit))))&&((this.schemaFilterPattern == rhs.schemaFilterPattern)||((this.schemaFilterPattern!= null)&&this.schemaFilterPattern.equals(rhs.schemaFilterPattern))))&&((this.dbtClassificationName == rhs.dbtClassificationName)||((this.dbtClassificationName!= null)&&this.dbtClassificationName.equals(rhs.dbtClassificationName))))&&((this.includeTags == rhs.includeTags)||((this.includeTags!= null)&&this.includeTags.equals(rhs.includeTags))))&&((this.dbtUpdateDescriptions == rhs.dbtUpdateDescriptions)||((this.dbtUpdateDescriptions!= null)&&this.dbtUpdateDescriptions.equals(rhs.dbtUpdateDescriptions))))&&((this.databaseFilterPattern == rhs.databaseFilterPattern)||((this.databaseFilterPattern!= null)&&this.databaseFilterPattern.equals(rhs.databaseFilterPattern))))&&((this.dbtConfigSource == rhs.dbtConfigSource)||((this.dbtConfigSource!= null)&&this.dbtConfigSource.equals(rhs.dbtConfigSource))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * DBT Config Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DbtConfigType {

        DBT("DBT");
        private final String value;
        private final static Map<String, DbtPipeline.DbtConfigType> CONSTANTS = new HashMap<String, DbtPipeline.DbtConfigType>();

        static {
            for (DbtPipeline.DbtConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DbtConfigType(String value) {
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
        public static DbtPipeline.DbtConfigType fromValue(String value) {
            DbtPipeline.DbtConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
