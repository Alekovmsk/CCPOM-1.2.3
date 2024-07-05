
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fromColumns",
    "toColumn",
    "function"
})
@Generated("jsonschema2pojo")
public class ColumnLineage {

    /**
     * One or more source columns identified by fully qualified column name used by transformation function to create destination column.
     * 
     */
    @JsonProperty("fromColumns")
    @JsonPropertyDescription("One or more source columns identified by fully qualified column name used by transformation function to create destination column.")
    @Valid
    private List<String> fromColumns = new ArrayList<String>();
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("toColumn")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String toColumn;
    /**
     * SQL function. Example - 'AVG()`, `COUNT()`, etc..
     * 
     */
    @JsonProperty("function")
    @JsonPropertyDescription("SQL function. Example - 'AVG()`, `COUNT()`, etc..")
    private String function;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * One or more source columns identified by fully qualified column name used by transformation function to create destination column.
     * 
     */
    @JsonProperty("fromColumns")
    public List<String> getFromColumns() {
        return fromColumns;
    }

    /**
     * One or more source columns identified by fully qualified column name used by transformation function to create destination column.
     * 
     */
    @JsonProperty("fromColumns")
    public void setFromColumns(List<String> fromColumns) {
        this.fromColumns = fromColumns;
    }

    public ColumnLineage withFromColumns(List<String> fromColumns) {
        this.fromColumns = fromColumns;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("toColumn")
    public String getToColumn() {
        return toColumn;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("toColumn")
    public void setToColumn(String toColumn) {
        this.toColumn = toColumn;
    }

    public ColumnLineage withToColumn(String toColumn) {
        this.toColumn = toColumn;
        return this;
    }

    /**
     * SQL function. Example - 'AVG()`, `COUNT()`, etc..
     * 
     */
    @JsonProperty("function")
    public String getFunction() {
        return function;
    }

    /**
     * SQL function. Example - 'AVG()`, `COUNT()`, etc..
     * 
     */
    @JsonProperty("function")
    public void setFunction(String function) {
        this.function = function;
    }

    public ColumnLineage withFunction(String function) {
        this.function = function;
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

    public ColumnLineage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ColumnLineage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fromColumns");
        sb.append('=');
        sb.append(((this.fromColumns == null)?"<null>":this.fromColumns));
        sb.append(',');
        sb.append("toColumn");
        sb.append('=');
        sb.append(((this.toColumn == null)?"<null>":this.toColumn));
        sb.append(',');
        sb.append("function");
        sb.append('=');
        sb.append(((this.function == null)?"<null>":this.function));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.toColumn == null)? 0 :this.toColumn.hashCode()));
        result = ((result* 31)+((this.fromColumns == null)? 0 :this.fromColumns.hashCode()));
        result = ((result* 31)+((this.function == null)? 0 :this.function.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ColumnLineage) == false) {
            return false;
        }
        ColumnLineage rhs = ((ColumnLineage) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.toColumn == rhs.toColumn)||((this.toColumn!= null)&&this.toColumn.equals(rhs.toColumn))))&&((this.fromColumns == rhs.fromColumns)||((this.fromColumns!= null)&&this.fromColumns.equals(rhs.fromColumns))))&&((this.function == rhs.function)||((this.function!= null)&&this.function.equals(rhs.function))));
    }

}
