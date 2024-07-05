
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines the type to capture rows of sample data for a table.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "columns",
    "rows"
})
@Generated("jsonschema2pojo")
public class TableData {

    /**
     * List of local column names (not fully qualified column names) of the table.
     * 
     */
    @JsonProperty("columns")
    @JsonPropertyDescription("List of local column names (not fully qualified column names) of the table.")
    @Valid
    private List<String> columns = new ArrayList<String>();
    /**
     * Data for multiple rows of the table.
     * 
     */
    @JsonProperty("rows")
    @JsonPropertyDescription("Data for multiple rows of the table.")
    @Valid
    private List<List<Object>> rows = new ArrayList<List<Object>>();

    /**
     * List of local column names (not fully qualified column names) of the table.
     * 
     */
    @JsonProperty("columns")
    public List<String> getColumns() {
        return columns;
    }

    /**
     * List of local column names (not fully qualified column names) of the table.
     * 
     */
    @JsonProperty("columns")
    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public TableData withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Data for multiple rows of the table.
     * 
     */
    @JsonProperty("rows")
    public List<List<Object>> getRows() {
        return rows;
    }

    /**
     * Data for multiple rows of the table.
     * 
     */
    @JsonProperty("rows")
    public void setRows(List<List<Object>> rows) {
        this.rows = rows;
    }

    public TableData withRows(List<List<Object>> rows) {
        this.rows = rows;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TableData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null)?"<null>":this.columns));
        sb.append(',');
        sb.append("rows");
        sb.append('=');
        sb.append(((this.rows == null)?"<null>":this.rows));
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
        result = ((result* 31)+((this.rows == null)? 0 :this.rows.hashCode()));
        result = ((result* 31)+((this.columns == null)? 0 :this.columns.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableData) == false) {
            return false;
        }
        TableData rhs = ((TableData) other);
        return (((this.rows == rhs.rows)||((this.rows!= null)&&this.rows.equals(rhs.rows)))&&((this.columns == rhs.columns)||((this.columns!= null)&&this.columns.equals(rhs.columns))));
    }

}
