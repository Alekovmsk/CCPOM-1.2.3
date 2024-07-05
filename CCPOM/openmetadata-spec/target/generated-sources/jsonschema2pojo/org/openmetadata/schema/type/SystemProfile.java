
package org.openmetadata.schema.type;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines the System Profile object holding profile data from system tables.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "operation",
    "rowsAffected"
})
@Generated("jsonschema2pojo")
public class SystemProfile {

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * This schema defines the type of DML operation.
     * 
     */
    @JsonProperty("operation")
    @JsonPropertyDescription("This schema defines the type of DML operation.")
    private DmlOperationType operation;
    /**
     * Number of rows affected.
     * 
     */
    @JsonProperty("rowsAffected")
    @JsonPropertyDescription("Number of rows affected.")
    private Integer rowsAffected;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public SystemProfile withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * This schema defines the type of DML operation.
     * 
     */
    @JsonProperty("operation")
    public DmlOperationType getOperation() {
        return operation;
    }

    /**
     * This schema defines the type of DML operation.
     * 
     */
    @JsonProperty("operation")
    public void setOperation(DmlOperationType operation) {
        this.operation = operation;
    }

    public SystemProfile withOperation(DmlOperationType operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Number of rows affected.
     * 
     */
    @JsonProperty("rowsAffected")
    public Integer getRowsAffected() {
        return rowsAffected;
    }

    /**
     * Number of rows affected.
     * 
     */
    @JsonProperty("rowsAffected")
    public void setRowsAffected(Integer rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public SystemProfile withRowsAffected(Integer rowsAffected) {
        this.rowsAffected = rowsAffected;
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

    public SystemProfile withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SystemProfile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("operation");
        sb.append('=');
        sb.append(((this.operation == null)?"<null>":this.operation));
        sb.append(',');
        sb.append("rowsAffected");
        sb.append('=');
        sb.append(((this.rowsAffected == null)?"<null>":this.rowsAffected));
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
        result = ((result* 31)+((this.operation == null)? 0 :this.operation.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.rowsAffected == null)? 0 :this.rowsAffected.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemProfile) == false) {
            return false;
        }
        SystemProfile rhs = ((SystemProfile) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.operation == rhs.operation)||((this.operation!= null)&&this.operation.equals(rhs.operation))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.rowsAffected == rhs.rowsAffected)||((this.rowsAffected!= null)&&this.rowsAffected.equals(rhs.rowsAffected))));
    }

}
