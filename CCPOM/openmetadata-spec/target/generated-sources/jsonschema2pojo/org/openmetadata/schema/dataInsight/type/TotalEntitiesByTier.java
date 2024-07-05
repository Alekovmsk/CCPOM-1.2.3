
package org.openmetadata.schema.dataInsight.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.DataInsightInterface;


/**
 * TotalEntitiesByTier
 * <p>
 * totalEntitiesByTier data blob
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "entityTier",
    "entityCountFraction",
    "entityCount"
})
@Generated("jsonschema2pojo")
public class TotalEntitiesByTier implements DataInsightInterface
{

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * Tier of entity. Derived from tags.
     * 
     */
    @JsonProperty("entityTier")
    @JsonPropertyDescription("Tier of entity. Derived from tags.")
    private String entityTier;
    /**
     * Total count of entity for the given entity type
     * 
     */
    @JsonProperty("entityCountFraction")
    @JsonPropertyDescription("Total count of entity for the given entity type")
    private Double entityCountFraction;
    /**
     * Total count of entity for the given entity type
     * 
     */
    @JsonProperty("entityCount")
    @JsonPropertyDescription("Total count of entity for the given entity type")
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

    public TotalEntitiesByTier withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Tier of entity. Derived from tags.
     * 
     */
    @JsonProperty("entityTier")
    public String getEntityTier() {
        return entityTier;
    }

    /**
     * Tier of entity. Derived from tags.
     * 
     */
    @JsonProperty("entityTier")
    public void setEntityTier(String entityTier) {
        this.entityTier = entityTier;
    }

    public TotalEntitiesByTier withEntityTier(String entityTier) {
        this.entityTier = entityTier;
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

    public TotalEntitiesByTier withEntityCountFraction(Double entityCountFraction) {
        this.entityCountFraction = entityCountFraction;
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

    public TotalEntitiesByTier withEntityCount(Double entityCount) {
        this.entityCount = entityCount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TotalEntitiesByTier.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("entityTier");
        sb.append('=');
        sb.append(((this.entityTier == null)?"<null>":this.entityTier));
        sb.append(',');
        sb.append("entityCountFraction");
        sb.append('=');
        sb.append(((this.entityCountFraction == null)?"<null>":this.entityCountFraction));
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
        result = ((result* 31)+((this.entityCountFraction == null)? 0 :this.entityCountFraction.hashCode()));
        result = ((result* 31)+((this.entityCount == null)? 0 :this.entityCount.hashCode()));
        result = ((result* 31)+((this.entityTier == null)? 0 :this.entityTier.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TotalEntitiesByTier) == false) {
            return false;
        }
        TotalEntitiesByTier rhs = ((TotalEntitiesByTier) other);
        return (((((this.entityCountFraction == rhs.entityCountFraction)||((this.entityCountFraction!= null)&&this.entityCountFraction.equals(rhs.entityCountFraction)))&&((this.entityCount == rhs.entityCount)||((this.entityCount!= null)&&this.entityCount.equals(rhs.entityCount))))&&((this.entityTier == rhs.entityTier)||((this.entityTier!= null)&&this.entityTier.equals(rhs.entityTier))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
