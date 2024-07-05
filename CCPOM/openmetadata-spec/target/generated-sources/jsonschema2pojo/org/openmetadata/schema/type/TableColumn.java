
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "table",
    "column"
})
@Generated("jsonschema2pojo")
public class TableColumn {

    /**
     * Name of the table
     * 
     */
    @JsonProperty("table")
    @JsonPropertyDescription("Name of the table")
    private String table;
    /**
     * Name of the column
     * 
     */
    @JsonProperty("column")
    @JsonPropertyDescription("Name of the column")
    private String column;

    /**
     * Name of the table
     * 
     */
    @JsonProperty("table")
    public String getTable() {
        return table;
    }

    /**
     * Name of the table
     * 
     */
    @JsonProperty("table")
    public void setTable(String table) {
        this.table = table;
    }

    public TableColumn withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Name of the column
     * 
     */
    @JsonProperty("column")
    public String getColumn() {
        return column;
    }

    /**
     * Name of the column
     * 
     */
    @JsonProperty("column")
    public void setColumn(String column) {
        this.column = column;
    }

    public TableColumn withColumn(String column) {
        this.column = column;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TableColumn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("table");
        sb.append('=');
        sb.append(((this.table == null)?"<null>":this.table));
        sb.append(',');
        sb.append("column");
        sb.append('=');
        sb.append(((this.column == null)?"<null>":this.column));
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
        result = ((result* 31)+((this.column == null)? 0 :this.column.hashCode()));
        result = ((result* 31)+((this.table == null)? 0 :this.table.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableColumn) == false) {
            return false;
        }
        TableColumn rhs = ((TableColumn) other);
        return (((this.column == rhs.column)||((this.column!= null)&&this.column.equals(rhs.column)))&&((this.table == rhs.table)||((this.table!= null)&&this.table.equals(rhs.table))));
    }

}
