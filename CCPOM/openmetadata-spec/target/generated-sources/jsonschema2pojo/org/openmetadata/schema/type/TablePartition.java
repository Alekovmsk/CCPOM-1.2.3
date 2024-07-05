
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the partition column of a table and format the partition is created.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "columns",
    "intervalType",
    "interval"
})
@Generated("jsonschema2pojo")
public class TablePartition {

    /**
     * List of column names corresponding to the partition.
     * 
     */
    @JsonProperty("columns")
    @JsonPropertyDescription("List of column names corresponding to the partition.")
    @Valid
    private List<String> columns = new ArrayList<String>();
    /**
     * type of partition interval, example time-unit, integer-range
     * 
     */
    @JsonProperty("intervalType")
    @JsonPropertyDescription("type of partition interval, example time-unit, integer-range")
    private TablePartition.IntervalType intervalType;
    /**
     * partition interval , example hourly, daily, monthly.
     * 
     */
    @JsonProperty("interval")
    @JsonPropertyDescription("partition interval , example hourly, daily, monthly.")
    private String interval;

    /**
     * List of column names corresponding to the partition.
     * 
     */
    @JsonProperty("columns")
    public List<String> getColumns() {
        return columns;
    }

    /**
     * List of column names corresponding to the partition.
     * 
     */
    @JsonProperty("columns")
    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public TablePartition withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * type of partition interval, example time-unit, integer-range
     * 
     */
    @JsonProperty("intervalType")
    public TablePartition.IntervalType getIntervalType() {
        return intervalType;
    }

    /**
     * type of partition interval, example time-unit, integer-range
     * 
     */
    @JsonProperty("intervalType")
    public void setIntervalType(TablePartition.IntervalType intervalType) {
        this.intervalType = intervalType;
    }

    public TablePartition withIntervalType(TablePartition.IntervalType intervalType) {
        this.intervalType = intervalType;
        return this;
    }

    /**
     * partition interval , example hourly, daily, monthly.
     * 
     */
    @JsonProperty("interval")
    public String getInterval() {
        return interval;
    }

    /**
     * partition interval , example hourly, daily, monthly.
     * 
     */
    @JsonProperty("interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    public TablePartition withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TablePartition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null)?"<null>":this.columns));
        sb.append(',');
        sb.append("intervalType");
        sb.append('=');
        sb.append(((this.intervalType == null)?"<null>":this.intervalType));
        sb.append(',');
        sb.append("interval");
        sb.append('=');
        sb.append(((this.interval == null)?"<null>":this.interval));
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
        result = ((result* 31)+((this.intervalType == null)? 0 :this.intervalType.hashCode()));
        result = ((result* 31)+((this.interval == null)? 0 :this.interval.hashCode()));
        result = ((result* 31)+((this.columns == null)? 0 :this.columns.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TablePartition) == false) {
            return false;
        }
        TablePartition rhs = ((TablePartition) other);
        return ((((this.intervalType == rhs.intervalType)||((this.intervalType!= null)&&this.intervalType.equals(rhs.intervalType)))&&((this.interval == rhs.interval)||((this.interval!= null)&&this.interval.equals(rhs.interval))))&&((this.columns == rhs.columns)||((this.columns!= null)&&this.columns.equals(rhs.columns))));
    }


    /**
     * type of partition interval, example time-unit, integer-range
     * 
     */
    @Generated("jsonschema2pojo")
    public enum IntervalType {

        TIME_UNIT("TIME-UNIT"),
        INTEGER_RANGE("INTEGER-RANGE"),
        INGESTION_TIME("INGESTION-TIME"),
        COLUMN_VALUE("COLUMN-VALUE"),
        OTHER("OTHER");
        private final String value;
        private final static Map<String, TablePartition.IntervalType> CONSTANTS = new HashMap<String, TablePartition.IntervalType>();

        static {
            for (TablePartition.IntervalType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        IntervalType(String value) {
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
        public static TablePartition.IntervalType fromValue(String value) {
            TablePartition.IntervalType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
