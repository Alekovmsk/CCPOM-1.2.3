
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
 * This schema defines the type to capture information about how this table is joined with other tables and columns.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startDate",
    "dayCount",
    "columnJoins",
    "directTableJoins"
})
@Generated("jsonschema2pojo")
public class TableJoins {

    /**
     * Date in ISO 8601 format in UTC. Example - '2018-11-13'.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Date in ISO 8601 format in UTC. Example - '2018-11-13'.")
    private String startDate;
    @JsonProperty("dayCount")
    private Integer dayCount = 1;
    @JsonProperty("columnJoins")
    @Valid
    private List<ColumnJoin> columnJoins = new ArrayList<ColumnJoin>();
    /**
     * Joins with other tables that are not on a specific column (e.g: UNION join)
     * 
     */
    @JsonProperty("directTableJoins")
    @JsonPropertyDescription("Joins with other tables that are not on a specific column (e.g: UNION join)")
    @Valid
    private List<JoinedWith> directTableJoins = new ArrayList<JoinedWith>();

    /**
     * Date in ISO 8601 format in UTC. Example - '2018-11-13'.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    /**
     * Date in ISO 8601 format in UTC. Example - '2018-11-13'.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public TableJoins withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("dayCount")
    public Integer getDayCount() {
        return dayCount;
    }

    @JsonProperty("dayCount")
    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    public TableJoins withDayCount(Integer dayCount) {
        this.dayCount = dayCount;
        return this;
    }

    @JsonProperty("columnJoins")
    public List<ColumnJoin> getColumnJoins() {
        return columnJoins;
    }

    @JsonProperty("columnJoins")
    public void setColumnJoins(List<ColumnJoin> columnJoins) {
        this.columnJoins = columnJoins;
    }

    public TableJoins withColumnJoins(List<ColumnJoin> columnJoins) {
        this.columnJoins = columnJoins;
        return this;
    }

    /**
     * Joins with other tables that are not on a specific column (e.g: UNION join)
     * 
     */
    @JsonProperty("directTableJoins")
    public List<JoinedWith> getDirectTableJoins() {
        return directTableJoins;
    }

    /**
     * Joins with other tables that are not on a specific column (e.g: UNION join)
     * 
     */
    @JsonProperty("directTableJoins")
    public void setDirectTableJoins(List<JoinedWith> directTableJoins) {
        this.directTableJoins = directTableJoins;
    }

    public TableJoins withDirectTableJoins(List<JoinedWith> directTableJoins) {
        this.directTableJoins = directTableJoins;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TableJoins.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("dayCount");
        sb.append('=');
        sb.append(((this.dayCount == null)?"<null>":this.dayCount));
        sb.append(',');
        sb.append("columnJoins");
        sb.append('=');
        sb.append(((this.columnJoins == null)?"<null>":this.columnJoins));
        sb.append(',');
        sb.append("directTableJoins");
        sb.append('=');
        sb.append(((this.directTableJoins == null)?"<null>":this.directTableJoins));
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
        result = ((result* 31)+((this.directTableJoins == null)? 0 :this.directTableJoins.hashCode()));
        result = ((result* 31)+((this.dayCount == null)? 0 :this.dayCount.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.columnJoins == null)? 0 :this.columnJoins.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableJoins) == false) {
            return false;
        }
        TableJoins rhs = ((TableJoins) other);
        return (((((this.directTableJoins == rhs.directTableJoins)||((this.directTableJoins!= null)&&this.directTableJoins.equals(rhs.directTableJoins)))&&((this.dayCount == rhs.dayCount)||((this.dayCount!= null)&&this.dayCount.equals(rhs.dayCount))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.columnJoins == rhs.columnJoins)||((this.columnJoins!= null)&&this.columnJoins.equals(rhs.columnJoins))));
    }

}
