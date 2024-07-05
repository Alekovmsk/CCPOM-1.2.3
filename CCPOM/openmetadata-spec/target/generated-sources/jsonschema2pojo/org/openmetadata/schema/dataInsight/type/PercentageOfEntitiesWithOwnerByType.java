
package org.openmetadata.schema.dataInsight.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.DataInsightInterface;


/**
 * PercentageOfEntitiesWithOwnerByType
 * <p>
 * percentageOfEntitiesWithOwnerByType data blob
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "entityType",
    "hasOwnerFraction",
    "hasOwner",
    "entityCount"
})
@Generated("jsonschema2pojo")
public class PercentageOfEntitiesWithOwnerByType implements DataInsightInterface
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
     * Decimal fraction of entity with an owner.
     * 
     */
    @JsonProperty("hasOwnerFraction")
    @JsonPropertyDescription("Decimal fraction of entity with an owner.")
    private Double hasOwnerFraction;
    /**
     * Decimal fraction of entity with an owner.
     * 
     */
    @JsonProperty("hasOwner")
    @JsonPropertyDescription("Decimal fraction of entity with an owner.")
    private Double hasOwner;
    /**
     * Decimal fraction of entity with an owner.
     * 
     */
    @JsonProperty("entityCount")
    @JsonPropertyDescription("Decimal fraction of entity with an owner.")
    private Double entityCount;

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

    public PercentageOfEntitiesWithOwnerByType withTimestamp(Long timestamp) {
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

    public PercentageOfEntitiesWithOwnerByType withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Decimal fraction of entity with an owner.
     * 
     */
    @JsonProperty("hasOwnerFraction")
    public Double getHasOwnerFraction() {
        return hasOwnerFraction;
    }

    /**
     * Decimal fraction of entity with an owner.
     * 
     */
    @JsonProperty("hasOwnerFraction")
    public void setHasOwnerFraction(Double hasOwnerFraction) {
        this.hasOwnerFraction = hasOwnerFraction;
    }

    public PercentageOfEntitiesWithOwnerByType withHasOwnerFraction(Double hasOwnerFraction) {
        this.hasOwnerFraction = hasOwnerFraction;
        return this;
    }

    /**
     * Decimal fraction of entity with an owner.
     * 
     */
    @JsonProperty("hasOwner")
    public Double getHasOwner() {
        return hasOwner;
    }

    /**
     * Decimal fraction of entity with an owner.
     * 
     */
    @JsonProperty("hasOwner")
    public void setHasOwner(Double hasOwner) {
        this.hasOwner = hasOwner;
    }

    public PercentageOfEntitiesWithOwnerByType withHasOwner(Double hasOwner) {
        this.hasOwner = hasOwner;
        return this;
    }

    /**
     * Decimal fraction of entity with an owner.
     * 
     */
    @JsonProperty("entityCount")
    public Double getEntityCount() {
        return entityCount;
    }

    /**
     * Decimal fraction of entity with an owner.
     * 
     */
    @JsonProperty("entityCount")
    public void setEntityCount(Double entityCount) {
        this.entityCount = entityCount;
    }

    public PercentageOfEntitiesWithOwnerByType withEntityCount(Double entityCount) {
        this.entityCount = entityCount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PercentageOfEntitiesWithOwnerByType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("hasOwnerFraction");
        sb.append('=');
        sb.append(((this.hasOwnerFraction == null)?"<null>":this.hasOwnerFraction));
        sb.append(',');
        sb.append("hasOwner");
        sb.append('=');
        sb.append(((this.hasOwner == null)?"<null>":this.hasOwner));
        sb.append(',');
        sb.append("entityCount");
        sb.append('=');
        sb.append(((this.entityCount == null)?"<null>":this.entityCount));
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
        result = ((result* 31)+((this.hasOwnerFraction == null)? 0 :this.hasOwnerFraction.hashCode()));
        result = ((result* 31)+((this.hasOwner == null)? 0 :this.hasOwner.hashCode()));
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
        if ((other instanceof PercentageOfEntitiesWithOwnerByType) == false) {
            return false;
        }
        PercentageOfEntitiesWithOwnerByType rhs = ((PercentageOfEntitiesWithOwnerByType) other);
        return ((((((this.hasOwnerFraction == rhs.hasOwnerFraction)||((this.hasOwnerFraction!= null)&&this.hasOwnerFraction.equals(rhs.hasOwnerFraction)))&&((this.hasOwner == rhs.hasOwner)||((this.hasOwner!= null)&&this.hasOwner.equals(rhs.hasOwner))))&&((this.entityCount == rhs.entityCount)||((this.entityCount!= null)&&this.entityCount.equals(rhs.entityCount))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
