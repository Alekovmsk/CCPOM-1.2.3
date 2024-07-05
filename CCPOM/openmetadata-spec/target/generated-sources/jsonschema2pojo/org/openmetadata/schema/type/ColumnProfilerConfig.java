
package org.openmetadata.schema.type;

import java.util.LinkedHashMap;
import java.util.List;
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
 * This schema defines the type for Table profile config include Columns.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "columnName",
    "metrics"
})
@Generated("jsonschema2pojo")
public class ColumnProfilerConfig {

    /**
     * Column Name of the table to be included.
     * 
     */
    @JsonProperty("columnName")
    @JsonPropertyDescription("Column Name of the table to be included.")
    private String columnName;
    /**
     * Include only following metrics.
     * 
     */
    @JsonProperty("metrics")
    @JsonPropertyDescription("Include only following metrics.")
    @Valid
    private List<String> metrics = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Column Name of the table to be included.
     * 
     */
    @JsonProperty("columnName")
    public String getColumnName() {
        return columnName;
    }

    /**
     * Column Name of the table to be included.
     * 
     */
    @JsonProperty("columnName")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public ColumnProfilerConfig withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Include only following metrics.
     * 
     */
    @JsonProperty("metrics")
    public List<String> getMetrics() {
        return metrics;
    }

    /**
     * Include only following metrics.
     * 
     */
    @JsonProperty("metrics")
    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    public ColumnProfilerConfig withMetrics(List<String> metrics) {
        this.metrics = metrics;
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

    public ColumnProfilerConfig withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ColumnProfilerConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("columnName");
        sb.append('=');
        sb.append(((this.columnName == null)?"<null>":this.columnName));
        sb.append(',');
        sb.append("metrics");
        sb.append('=');
        sb.append(((this.metrics == null)?"<null>":this.metrics));
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
        result = ((result* 31)+((this.metrics == null)? 0 :this.metrics.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.columnName == null)? 0 :this.columnName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ColumnProfilerConfig) == false) {
            return false;
        }
        ColumnProfilerConfig rhs = ((ColumnProfilerConfig) other);
        return ((((this.metrics == rhs.metrics)||((this.metrics!= null)&&this.metrics.equals(rhs.metrics)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.columnName == rhs.columnName)||((this.columnName!= null)&&this.columnName.equals(rhs.columnName))));
    }

}
