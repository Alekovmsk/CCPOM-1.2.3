
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
 * Table Queries
 * <p>
 * This schema defines structure of table query
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "queries"
})
@Generated("jsonschema2pojo")
public class TableQuery {

    /**
     * Date of execution of SQL query
     * 
     */
    @JsonProperty("queries")
    @JsonPropertyDescription("Date of execution of SQL query")
    @Valid
    private List<TableQuery__1> queries = new ArrayList<TableQuery__1>();

    /**
     * Date of execution of SQL query
     * 
     */
    @JsonProperty("queries")
    public List<TableQuery__1> getQueries() {
        return queries;
    }

    /**
     * Date of execution of SQL query
     * 
     */
    @JsonProperty("queries")
    public void setQueries(List<TableQuery__1> queries) {
        this.queries = queries;
    }

    public TableQuery withQueries(List<TableQuery__1> queries) {
        this.queries = queries;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TableQuery.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("queries");
        sb.append('=');
        sb.append(((this.queries == null)?"<null>":this.queries));
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
        result = ((result* 31)+((this.queries == null)? 0 :this.queries.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableQuery) == false) {
            return false;
        }
        TableQuery rhs = ((TableQuery) other);
        return ((this.queries == rhs.queries)||((this.queries!= null)&&this.queries.equals(rhs.queries)));
    }

}
