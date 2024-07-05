
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the partition configuration used by profiler.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enablePartitioning",
    "partitionColumnName",
    "partitionIntervalType",
    "partitionInterval",
    "partitionIntervalUnit",
    "partitionValues",
    "partitionIntegerRangeStart",
    "partitionIntegerRangeEnd"
})
@Generated("jsonschema2pojo")
public class PartitionProfilerConfig {

    /**
     * whether to use partition
     * 
     */
    @JsonProperty("enablePartitioning")
    @JsonPropertyDescription("whether to use partition")
    private Boolean enablePartitioning = false;
    /**
     * name of the column to use for the partition
     * 
     */
    @JsonProperty("partitionColumnName")
    @JsonPropertyDescription("name of the column to use for the partition")
    private String partitionColumnName;
    /**
     * type of partition interval
     * 
     */
    @JsonProperty("partitionIntervalType")
    @JsonPropertyDescription("type of partition interval")
    private PartitionProfilerConfig.PartitionIntervalType partitionIntervalType;
    /**
     * The interval to use for the partitioning
     * 
     */
    @JsonProperty("partitionInterval")
    @JsonPropertyDescription("The interval to use for the partitioning")
    private Integer partitionInterval;
    /**
     * unit used for the partition interval
     * 
     */
    @JsonProperty("partitionIntervalUnit")
    @JsonPropertyDescription("unit used for the partition interval")
    private PartitionProfilerConfig.PartitionIntervalUnit partitionIntervalUnit;
    /**
     * unit used for the partition interval
     * 
     */
    @JsonProperty("partitionValues")
    @JsonPropertyDescription("unit used for the partition interval")
    @Valid
    private List<Object> partitionValues = new ArrayList<Object>();
    /**
     * start of the integer range for partitioning
     * 
     */
    @JsonProperty("partitionIntegerRangeStart")
    @JsonPropertyDescription("start of the integer range for partitioning")
    private Integer partitionIntegerRangeStart = null;
    /**
     * end of the integer range for partitioning
     * 
     */
    @JsonProperty("partitionIntegerRangeEnd")
    @JsonPropertyDescription("end of the integer range for partitioning")
    private Integer partitionIntegerRangeEnd = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * whether to use partition
     * 
     */
    @JsonProperty("enablePartitioning")
    public Boolean getEnablePartitioning() {
        return enablePartitioning;
    }

    /**
     * whether to use partition
     * 
     */
    @JsonProperty("enablePartitioning")
    public void setEnablePartitioning(Boolean enablePartitioning) {
        this.enablePartitioning = enablePartitioning;
    }

    public PartitionProfilerConfig withEnablePartitioning(Boolean enablePartitioning) {
        this.enablePartitioning = enablePartitioning;
        return this;
    }

    /**
     * name of the column to use for the partition
     * 
     */
    @JsonProperty("partitionColumnName")
    public String getPartitionColumnName() {
        return partitionColumnName;
    }

    /**
     * name of the column to use for the partition
     * 
     */
    @JsonProperty("partitionColumnName")
    public void setPartitionColumnName(String partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
    }

    public PartitionProfilerConfig withPartitionColumnName(String partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
        return this;
    }

    /**
     * type of partition interval
     * 
     */
    @JsonProperty("partitionIntervalType")
    public PartitionProfilerConfig.PartitionIntervalType getPartitionIntervalType() {
        return partitionIntervalType;
    }

    /**
     * type of partition interval
     * 
     */
    @JsonProperty("partitionIntervalType")
    public void setPartitionIntervalType(PartitionProfilerConfig.PartitionIntervalType partitionIntervalType) {
        this.partitionIntervalType = partitionIntervalType;
    }

    public PartitionProfilerConfig withPartitionIntervalType(PartitionProfilerConfig.PartitionIntervalType partitionIntervalType) {
        this.partitionIntervalType = partitionIntervalType;
        return this;
    }

    /**
     * The interval to use for the partitioning
     * 
     */
    @JsonProperty("partitionInterval")
    public Integer getPartitionInterval() {
        return partitionInterval;
    }

    /**
     * The interval to use for the partitioning
     * 
     */
    @JsonProperty("partitionInterval")
    public void setPartitionInterval(Integer partitionInterval) {
        this.partitionInterval = partitionInterval;
    }

    public PartitionProfilerConfig withPartitionInterval(Integer partitionInterval) {
        this.partitionInterval = partitionInterval;
        return this;
    }

    /**
     * unit used for the partition interval
     * 
     */
    @JsonProperty("partitionIntervalUnit")
    public PartitionProfilerConfig.PartitionIntervalUnit getPartitionIntervalUnit() {
        return partitionIntervalUnit;
    }

    /**
     * unit used for the partition interval
     * 
     */
    @JsonProperty("partitionIntervalUnit")
    public void setPartitionIntervalUnit(PartitionProfilerConfig.PartitionIntervalUnit partitionIntervalUnit) {
        this.partitionIntervalUnit = partitionIntervalUnit;
    }

    public PartitionProfilerConfig withPartitionIntervalUnit(PartitionProfilerConfig.PartitionIntervalUnit partitionIntervalUnit) {
        this.partitionIntervalUnit = partitionIntervalUnit;
        return this;
    }

    /**
     * unit used for the partition interval
     * 
     */
    @JsonProperty("partitionValues")
    public List<Object> getPartitionValues() {
        return partitionValues;
    }

    /**
     * unit used for the partition interval
     * 
     */
    @JsonProperty("partitionValues")
    public void setPartitionValues(List<Object> partitionValues) {
        this.partitionValues = partitionValues;
    }

    public PartitionProfilerConfig withPartitionValues(List<Object> partitionValues) {
        this.partitionValues = partitionValues;
        return this;
    }

    /**
     * start of the integer range for partitioning
     * 
     */
    @JsonProperty("partitionIntegerRangeStart")
    public Integer getPartitionIntegerRangeStart() {
        return partitionIntegerRangeStart;
    }

    /**
     * start of the integer range for partitioning
     * 
     */
    @JsonProperty("partitionIntegerRangeStart")
    public void setPartitionIntegerRangeStart(Integer partitionIntegerRangeStart) {
        this.partitionIntegerRangeStart = partitionIntegerRangeStart;
    }

    public PartitionProfilerConfig withPartitionIntegerRangeStart(Integer partitionIntegerRangeStart) {
        this.partitionIntegerRangeStart = partitionIntegerRangeStart;
        return this;
    }

    /**
     * end of the integer range for partitioning
     * 
     */
    @JsonProperty("partitionIntegerRangeEnd")
    public Integer getPartitionIntegerRangeEnd() {
        return partitionIntegerRangeEnd;
    }

    /**
     * end of the integer range for partitioning
     * 
     */
    @JsonProperty("partitionIntegerRangeEnd")
    public void setPartitionIntegerRangeEnd(Integer partitionIntegerRangeEnd) {
        this.partitionIntegerRangeEnd = partitionIntegerRangeEnd;
    }

    public PartitionProfilerConfig withPartitionIntegerRangeEnd(Integer partitionIntegerRangeEnd) {
        this.partitionIntegerRangeEnd = partitionIntegerRangeEnd;
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

    public PartitionProfilerConfig withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PartitionProfilerConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enablePartitioning");
        sb.append('=');
        sb.append(((this.enablePartitioning == null)?"<null>":this.enablePartitioning));
        sb.append(',');
        sb.append("partitionColumnName");
        sb.append('=');
        sb.append(((this.partitionColumnName == null)?"<null>":this.partitionColumnName));
        sb.append(',');
        sb.append("partitionIntervalType");
        sb.append('=');
        sb.append(((this.partitionIntervalType == null)?"<null>":this.partitionIntervalType));
        sb.append(',');
        sb.append("partitionInterval");
        sb.append('=');
        sb.append(((this.partitionInterval == null)?"<null>":this.partitionInterval));
        sb.append(',');
        sb.append("partitionIntervalUnit");
        sb.append('=');
        sb.append(((this.partitionIntervalUnit == null)?"<null>":this.partitionIntervalUnit));
        sb.append(',');
        sb.append("partitionValues");
        sb.append('=');
        sb.append(((this.partitionValues == null)?"<null>":this.partitionValues));
        sb.append(',');
        sb.append("partitionIntegerRangeStart");
        sb.append('=');
        sb.append(((this.partitionIntegerRangeStart == null)?"<null>":this.partitionIntegerRangeStart));
        sb.append(',');
        sb.append("partitionIntegerRangeEnd");
        sb.append('=');
        sb.append(((this.partitionIntegerRangeEnd == null)?"<null>":this.partitionIntegerRangeEnd));
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
        result = ((result* 31)+((this.partitionInterval == null)? 0 :this.partitionInterval.hashCode()));
        result = ((result* 31)+((this.partitionIntervalType == null)? 0 :this.partitionIntervalType.hashCode()));
        result = ((result* 31)+((this.enablePartitioning == null)? 0 :this.enablePartitioning.hashCode()));
        result = ((result* 31)+((this.partitionIntegerRangeStart == null)? 0 :this.partitionIntegerRangeStart.hashCode()));
        result = ((result* 31)+((this.partitionIntervalUnit == null)? 0 :this.partitionIntervalUnit.hashCode()));
        result = ((result* 31)+((this.partitionIntegerRangeEnd == null)? 0 :this.partitionIntegerRangeEnd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.partitionValues == null)? 0 :this.partitionValues.hashCode()));
        result = ((result* 31)+((this.partitionColumnName == null)? 0 :this.partitionColumnName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PartitionProfilerConfig) == false) {
            return false;
        }
        PartitionProfilerConfig rhs = ((PartitionProfilerConfig) other);
        return ((((((((((this.partitionInterval == rhs.partitionInterval)||((this.partitionInterval!= null)&&this.partitionInterval.equals(rhs.partitionInterval)))&&((this.partitionIntervalType == rhs.partitionIntervalType)||((this.partitionIntervalType!= null)&&this.partitionIntervalType.equals(rhs.partitionIntervalType))))&&((this.enablePartitioning == rhs.enablePartitioning)||((this.enablePartitioning!= null)&&this.enablePartitioning.equals(rhs.enablePartitioning))))&&((this.partitionIntegerRangeStart == rhs.partitionIntegerRangeStart)||((this.partitionIntegerRangeStart!= null)&&this.partitionIntegerRangeStart.equals(rhs.partitionIntegerRangeStart))))&&((this.partitionIntervalUnit == rhs.partitionIntervalUnit)||((this.partitionIntervalUnit!= null)&&this.partitionIntervalUnit.equals(rhs.partitionIntervalUnit))))&&((this.partitionIntegerRangeEnd == rhs.partitionIntegerRangeEnd)||((this.partitionIntegerRangeEnd!= null)&&this.partitionIntegerRangeEnd.equals(rhs.partitionIntegerRangeEnd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.partitionValues == rhs.partitionValues)||((this.partitionValues!= null)&&this.partitionValues.equals(rhs.partitionValues))))&&((this.partitionColumnName == rhs.partitionColumnName)||((this.partitionColumnName!= null)&&this.partitionColumnName.equals(rhs.partitionColumnName))));
    }


    /**
     * type of partition interval
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PartitionIntervalType {

        TIME_UNIT("TIME-UNIT"),
        INTEGER_RANGE("INTEGER-RANGE"),
        INGESTION_TIME("INGESTION-TIME"),
        COLUMN_VALUE("COLUMN-VALUE");
        private final String value;
        private final static Map<String, PartitionProfilerConfig.PartitionIntervalType> CONSTANTS = new HashMap<String, PartitionProfilerConfig.PartitionIntervalType>();

        static {
            for (PartitionProfilerConfig.PartitionIntervalType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PartitionIntervalType(String value) {
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
        public static PartitionProfilerConfig.PartitionIntervalType fromValue(String value) {
            PartitionProfilerConfig.PartitionIntervalType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * unit used for the partition interval
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PartitionIntervalUnit {

        YEAR("YEAR"),
        MONTH("MONTH"),
        DAY("DAY"),
        HOUR("HOUR");
        private final String value;
        private final static Map<String, PartitionProfilerConfig.PartitionIntervalUnit> CONSTANTS = new HashMap<String, PartitionProfilerConfig.PartitionIntervalUnit>();

        static {
            for (PartitionProfilerConfig.PartitionIntervalUnit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PartitionIntervalUnit(String value) {
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
        public static PartitionProfilerConfig.PartitionIntervalUnit fromValue(String value) {
            PartitionProfilerConfig.PartitionIntervalUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
