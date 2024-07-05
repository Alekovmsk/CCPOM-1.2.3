
package org.openmetadata.schema.type;

import java.util.ArrayList;
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
 * Lineage details including sqlQuery + pipeline + columnLineage.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sqlQuery",
    "columnsLineage",
    "pipeline",
    "description",
    "source"
})
@Generated("jsonschema2pojo")
public class LineageDetails {

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("sqlQuery")
    @JsonPropertyDescription("SQL query statement. Example - 'select * from orders'.")
    private String sqlQuery;
    /**
     * Lineage information of how upstream columns were combined to get downstream column.
     * 
     */
    @JsonProperty("columnsLineage")
    @JsonPropertyDescription("Lineage information of how upstream columns were combined to get downstream column.")
    @Valid
    private List<ColumnLineage> columnsLineage = new ArrayList<ColumnLineage>();
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("pipeline")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference pipeline;
    /**
     * description of lineage
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("description of lineage")
    private String description;
    /**
     * Lineage type describes how a lineage was created.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Lineage type describes how a lineage was created.")
    private LineageDetails.Source source = LineageDetails.Source.fromValue("Manual");
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("sqlQuery")
    public String getSqlQuery() {
        return sqlQuery;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("sqlQuery")
    public void setSqlQuery(String sqlQuery) {
        this.sqlQuery = sqlQuery;
    }

    public LineageDetails withSqlQuery(String sqlQuery) {
        this.sqlQuery = sqlQuery;
        return this;
    }

    /**
     * Lineage information of how upstream columns were combined to get downstream column.
     * 
     */
    @JsonProperty("columnsLineage")
    public List<ColumnLineage> getColumnsLineage() {
        return columnsLineage;
    }

    /**
     * Lineage information of how upstream columns were combined to get downstream column.
     * 
     */
    @JsonProperty("columnsLineage")
    public void setColumnsLineage(List<ColumnLineage> columnsLineage) {
        this.columnsLineage = columnsLineage;
    }

    public LineageDetails withColumnsLineage(List<ColumnLineage> columnsLineage) {
        this.columnsLineage = columnsLineage;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("pipeline")
    public EntityReference getPipeline() {
        return pipeline;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("pipeline")
    public void setPipeline(EntityReference pipeline) {
        this.pipeline = pipeline;
    }

    public LineageDetails withPipeline(EntityReference pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * description of lineage
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * description of lineage
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public LineageDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Lineage type describes how a lineage was created.
     * 
     */
    @JsonProperty("source")
    public LineageDetails.Source getSource() {
        return source;
    }

    /**
     * Lineage type describes how a lineage was created.
     * 
     */
    @JsonProperty("source")
    public void setSource(LineageDetails.Source source) {
        this.source = source;
    }

    public LineageDetails withSource(LineageDetails.Source source) {
        this.source = source;
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

    public LineageDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineageDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sqlQuery");
        sb.append('=');
        sb.append(((this.sqlQuery == null)?"<null>":this.sqlQuery));
        sb.append(',');
        sb.append("columnsLineage");
        sb.append('=');
        sb.append(((this.columnsLineage == null)?"<null>":this.columnsLineage));
        sb.append(',');
        sb.append("pipeline");
        sb.append('=');
        sb.append(((this.pipeline == null)?"<null>":this.pipeline));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.pipeline == null)? 0 :this.pipeline.hashCode()));
        result = ((result* 31)+((this.sqlQuery == null)? 0 :this.sqlQuery.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.columnsLineage == null)? 0 :this.columnsLineage.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LineageDetails) == false) {
            return false;
        }
        LineageDetails rhs = ((LineageDetails) other);
        return (((((((this.pipeline == rhs.pipeline)||((this.pipeline!= null)&&this.pipeline.equals(rhs.pipeline)))&&((this.sqlQuery == rhs.sqlQuery)||((this.sqlQuery!= null)&&this.sqlQuery.equals(rhs.sqlQuery))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.columnsLineage == rhs.columnsLineage)||((this.columnsLineage!= null)&&this.columnsLineage.equals(rhs.columnsLineage))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }


    /**
     * Lineage type describes how a lineage was created.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Source {

        MANUAL("Manual"),
        VIEW_LINEAGE("ViewLineage"),
        QUERY_LINEAGE("QueryLineage"),
        PIPELINE_LINEAGE("PipelineLineage"),
        DASHBOARD_LINEAGE("DashboardLineage"),
        DBT_LINEAGE("DbtLineage");
        private final String value;
        private final static Map<String, LineageDetails.Source> CONSTANTS = new HashMap<String, LineageDetails.Source>();

        static {
            for (LineageDetails.Source c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Source(String value) {
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
        public static LineageDetails.Source fromValue(String value) {
            LineageDetails.Source constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
