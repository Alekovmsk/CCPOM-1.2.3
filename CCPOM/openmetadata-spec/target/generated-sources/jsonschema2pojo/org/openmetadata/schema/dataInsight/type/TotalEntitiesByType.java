
package org.openmetadata.schema.dataInsight.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.DataInsightInterface;


/**
 * TotalEntitiesByType
 * <p>
 * totalEntitiesByType data blob
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "entityType",
    "entityCount",
    "entityCountFraction"
})
@Generated("jsonschema2pojo")
public class TotalEntitiesByType implements DataInsightInterface
{

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * Type of entity. Derived from the entity class.
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("Type of entity. Derived from the entity class.")
    private String entityType;
    /**
     * Total count of entity for the given entity type
     * 
     */
    @JsonProperty("entityCount")
    @JsonPropertyDescription("Total count of entity for the given entity type")
    private Double entityCount;
    /**
     * Total count of entity for the given entity type
     * 
     */
    @JsonProperty("entityCountFraction")
    @JsonPropertyDescription("Total count of entity for the given entity type")
    private Double entityCountFraction;

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

    public TotalEntitiesByType withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Type of entity. Derived from the entity class.
     * 
     */
    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    /**
     * Type of entity. Derived from the entity class.
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public TotalEntitiesByType withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Total count of entity for the given entity type
     * 
     */
    @JsonProperty("entityCount")
    public Double getEntityCount() {
        return entityCount;
    }

    /**
     * Total count of entity for the given entity type
     * 
     */
    @JsonProperty("entityCount")
    public void setEntityCount(Double entityCount) {
        this.entityCount = entityCount;
    }

    public TotalEntitiesByType withEntityCount(Double entityCount) {
        this.entityCount = entityCount;
        return this;
    }

    /**
     * Total count of entity for the given entity type
     * 
     */
    @JsonProperty("entityCountFraction")
    public Double getEntityCountFraction() {
        return entityCountFraction;
    }

    /**
     * Total count of entity for the given entity type
     * 
     */
    @JsonProperty("entityCountFraction")
    public void setEntityCountFraction(Double entityCountFraction) {
        this.entityCountFraction = entityCountFraction;
    }

    public TotalEntitiesByType withEntityCountFraction(Double entityCountFraction) {
        this.entityCountFraction = entityCountFraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TotalEntitiesByType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("entityCount");
        sb.append('=');
        sb.append(((this.entityCount == null)?"<null>":this.entityCount));
        sb.append(',');
        sb.append("entityCountFraction");
        sb.append('=');
        sb.append(((this.entityCountFraction == null)?"<null>":this.entityCountFraction));
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
        result = ((result* 31)+((this.entityCountFraction == null)? 0 :this.entityCountFraction.hashCode()));
        result = ((result* 31)+((this.entityCount == null)? 0 :this.entityCount.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TotalEntitiesByType) == false) {
            return false;
        }
        TotalEntitiesByType rhs = ((TotalEntitiesByType) other);
        return (((((this.entityCountFraction == rhs.entityCountFraction)||((this.entityCountFraction!= null)&&this.entityCountFraction.equals(rhs.entityCountFraction)))&&((this.entityCount == rhs.entityCount)||((this.entityCount!= null)&&this.entityCount.equals(rhs.entityCount))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
