
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Access details of an entity 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "accessedBy",
    "accessedByAProcess"
})
@Generated("jsonschema2pojo")
public class AccessDetails {

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    @NotNull
    private Long timestamp;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("accessedBy")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference accessedBy;
    /**
     * Any process that accessed the data asset that is not captured in OpenMetadata.
     * 
     */
    @JsonProperty("accessedByAProcess")
    @JsonPropertyDescription("Any process that accessed the data asset that is not captured in OpenMetadata.")
    private String accessedByAProcess = null;

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public AccessDetails withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("accessedBy")
    public EntityReference getAccessedBy() {
        return accessedBy;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("accessedBy")
    public void setAccessedBy(EntityReference accessedBy) {
        this.accessedBy = accessedBy;
    }

    public AccessDetails withAccessedBy(EntityReference accessedBy) {
        this.accessedBy = accessedBy;
        return this;
    }

    /**
     * Any process that accessed the data asset that is not captured in OpenMetadata.
     * 
     */
    @JsonProperty("accessedByAProcess")
    public String getAccessedByAProcess() {
        return accessedByAProcess;
    }

    /**
     * Any process that accessed the data asset that is not captured in OpenMetadata.
     * 
     */
    @JsonProperty("accessedByAProcess")
    public void setAccessedByAProcess(String accessedByAProcess) {
        this.accessedByAProcess = accessedByAProcess;
    }

    public AccessDetails withAccessedByAProcess(String accessedByAProcess) {
        this.accessedByAProcess = accessedByAProcess;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccessDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("accessedBy");
        sb.append('=');
        sb.append(((this.accessedBy == null)?"<null>":this.accessedBy));
        sb.append(',');
        sb.append("accessedByAProcess");
        sb.append('=');
        sb.append(((this.accessedByAProcess == null)?"<null>":this.accessedByAProcess));
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
        result = ((result* 31)+((this.accessedByAProcess == null)? 0 :this.accessedByAProcess.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.accessedBy == null)? 0 :this.accessedBy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessDetails) == false) {
            return false;
        }
        AccessDetails rhs = ((AccessDetails) other);
        return ((((this.accessedByAProcess == rhs.accessedByAProcess)||((this.accessedByAProcess!= null)&&this.accessedByAProcess.equals(rhs.accessedByAProcess)))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.accessedBy == rhs.accessedBy)||((this.accessedBy!= null)&&this.accessedBy.equals(rhs.accessedBy))));
    }

}
