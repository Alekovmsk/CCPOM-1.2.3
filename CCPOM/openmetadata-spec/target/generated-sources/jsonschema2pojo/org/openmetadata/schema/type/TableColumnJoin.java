
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tableColumn",
    "joinedWith"
})
@Generated("jsonschema2pojo")
public class TableColumnJoin {

    @JsonProperty("tableColumn")
    @Valid
    private TableColumn tableColumn;
    /**
     * List of table columns with which the table is joined with
     * 
     */
    @JsonProperty("joinedWith")
    @JsonPropertyDescription("List of table columns with which the table is joined with")
    @Valid
    private List<TableColumn> joinedWith = new ArrayList<TableColumn>();

    @JsonProperty("tableColumn")
    public TableColumn getTableColumn() {
        return tableColumn;
    }

    @JsonProperty("tableColumn")
    public void setTableColumn(TableColumn tableColumn) {
        this.tableColumn = tableColumn;
    }

    public TableColumnJoin withTableColumn(TableColumn tableColumn) {
        this.tableColumn = tableColumn;
        return this;
    }

    /**
     * List of table columns with which the table is joined with
     * 
     */
    @JsonProperty("joinedWith")
    public List<TableColumn> getJoinedWith() {
        return joinedWith;
    }

    /**
     * List of table columns with which the table is joined with
     * 
     */
    @JsonProperty("joinedWith")
    public void setJoinedWith(List<TableColumn> joinedWith) {
        this.joinedWith = joinedWith;
    }

    public TableColumnJoin withJoinedWith(List<TableColumn> joinedWith) {
        this.joinedWith = joinedWith;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TableColumnJoin.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tableColumn");
        sb.append('=');
        sb.append(((this.tableColumn == null)?"<null>":this.tableColumn));
        sb.append(',');
        sb.append("joinedWith");
        sb.append('=');
        sb.append(((this.joinedWith == null)?"<null>":this.joinedWith));
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
        result = ((result* 31)+((this.joinedWith == null)? 0 :this.joinedWith.hashCode()));
        result = ((result* 31)+((this.tableColumn == null)? 0 :this.tableColumn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableColumnJoin) == false) {
            return false;
        }
        TableColumnJoin rhs = ((TableColumnJoin) other);
        return (((this.joinedWith == rhs.joinedWith)||((this.joinedWith!= null)&&this.joinedWith.equals(rhs.joinedWith)))&&((this.tableColumn == rhs.tableColumn)||((this.tableColumn!= null)&&this.tableColumn.equals(rhs.tableColumn))));
    }

}
