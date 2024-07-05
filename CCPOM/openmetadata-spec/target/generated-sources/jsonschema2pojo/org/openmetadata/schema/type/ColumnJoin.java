
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines the type to capture how frequently a column is joined with columns in the other tables.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "columnName",
    "joinedWith"
})
@Generated("jsonschema2pojo")
public class ColumnJoin {

    /**
     * Local name (not fully qualified name) of the column. ColumnName is `-` when the column is not named in struct dataType. For example, BigQuery supports struct with unnamed fields.
     * 
     */
    @JsonProperty("columnName")
    @JsonPropertyDescription("Local name (not fully qualified name) of the column. ColumnName is `-` when the column is not named in struct dataType. For example, BigQuery supports struct with unnamed fields.")
    @Pattern(regexp = "^((?!::).)*$")
    @Size(min = 1, max = 256)
    private String columnName;
    /**
     * Fully qualified names of the columns that this column is joined with.
     * 
     */
    @JsonProperty("joinedWith")
    @JsonPropertyDescription("Fully qualified names of the columns that this column is joined with.")
    @Valid
    private List<JoinedWith> joinedWith = new ArrayList<JoinedWith>();

    /**
     * Local name (not fully qualified name) of the column. ColumnName is `-` when the column is not named in struct dataType. For example, BigQuery supports struct with unnamed fields.
     * 
     */
    @JsonProperty("columnName")
    public String getColumnName() {
        return columnName;
    }

    /**
     * Local name (not fully qualified name) of the column. ColumnName is `-` when the column is not named in struct dataType. For example, BigQuery supports struct with unnamed fields.
     * 
     */
    @JsonProperty("columnName")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public ColumnJoin withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Fully qualified names of the columns that this column is joined with.
     * 
     */
    @JsonProperty("joinedWith")
    public List<JoinedWith> getJoinedWith() {
        return joinedWith;
    }

    /**
     * Fully qualified names of the columns that this column is joined with.
     * 
     */
    @JsonProperty("joinedWith")
    public void setJoinedWith(List<JoinedWith> joinedWith) {
        this.joinedWith = joinedWith;
    }

    public ColumnJoin withJoinedWith(List<JoinedWith> joinedWith) {
        this.joinedWith = joinedWith;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ColumnJoin.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("columnName");
        sb.append('=');
        sb.append(((this.columnName == null)?"<null>":this.columnName));
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
        result = ((result* 31)+((this.columnName == null)? 0 :this.columnName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ColumnJoin) == false) {
            return false;
        }
        ColumnJoin rhs = ((ColumnJoin) other);
        return (((this.joinedWith == rhs.joinedWith)||((this.joinedWith!= null)&&this.joinedWith.equals(rhs.joinedWith)))&&((this.columnName == rhs.columnName)||((this.columnName!= null)&&this.columnName.equals(rhs.columnName))));
    }

}
