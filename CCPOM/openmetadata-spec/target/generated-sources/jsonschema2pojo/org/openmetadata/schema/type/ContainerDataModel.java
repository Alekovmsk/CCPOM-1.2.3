
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This captures information about how the container's data is modeled, if it has a schema. 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isPartitioned",
    "columns"
})
@Generated("jsonschema2pojo")
public class ContainerDataModel {

    /**
     * Whether the data under this container is partitioned by some property, eg. eventTime=yyyy-mm-dd
     * 
     */
    @JsonProperty("isPartitioned")
    @JsonPropertyDescription("Whether the data under this container is partitioned by some property, eg. eventTime=yyyy-mm-dd")
    private Boolean isPartitioned = false;
    /**
     * Columns belonging to this container's schema
     * (Required)
     * 
     */
    @JsonProperty("columns")
    @JsonPropertyDescription("Columns belonging to this container's schema")
    @Valid
    @NotNull
    private List<Column> columns = new ArrayList<Column>();

    /**
     * Whether the data under this container is partitioned by some property, eg. eventTime=yyyy-mm-dd
     * 
     */
    @JsonProperty("isPartitioned")
    public Boolean getIsPartitioned() {
        return isPartitioned;
    }

    /**
     * Whether the data under this container is partitioned by some property, eg. eventTime=yyyy-mm-dd
     * 
     */
    @JsonProperty("isPartitioned")
    public void setIsPartitioned(Boolean isPartitioned) {
        this.isPartitioned = isPartitioned;
    }

    public ContainerDataModel withIsPartitioned(Boolean isPartitioned) {
        this.isPartitioned = isPartitioned;
        return this;
    }

    /**
     * Columns belonging to this container's schema
     * (Required)
     * 
     */
    @JsonProperty("columns")
    public List<Column> getColumns() {
        return columns;
    }

    /**
     * Columns belonging to this container's schema
     * (Required)
     * 
     */
    @JsonProperty("columns")
    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public ContainerDataModel withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContainerDataModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isPartitioned");
        sb.append('=');
        sb.append(((this.isPartitioned == null)?"<null>":this.isPartitioned));
        sb.append(',');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null)?"<null>":this.columns));
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
        result = ((result* 31)+((this.columns == null)? 0 :this.columns.hashCode()));
        result = ((result* 31)+((this.isPartitioned == null)? 0 :this.isPartitioned.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerDataModel) == false) {
            return false;
        }
        ContainerDataModel rhs = ((ContainerDataModel) other);
        return (((this.columns == rhs.columns)||((this.columns!= null)&&this.columns.equals(rhs.columns)))&&((this.isPartitioned == rhs.isPartitioned)||((this.isPartitioned!= null)&&this.isPartitioned.equals(rhs.isPartitioned))));
    }

}
