
package org.openmetadata.schema.dataInsight.type;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.EntityReference;


/**
 * UnusedAssets
 * <p>
 * UnusedAssets data blob
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entity",
    "sizeInBytes",
    "lastAccessedAt"
})
@Generated("jsonschema2pojo")
public class UnusedAssets {

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("entity")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference entity;
    /**
     * Size of the asset in bytes
     * 
     */
    @JsonProperty("sizeInBytes")
    @JsonPropertyDescription("Size of the asset in bytes")
    private Double sizeInBytes;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastAccessedAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long lastAccessedAt;

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("entity")
    public EntityReference getEntity() {
        return entity;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("entity")
    public void setEntity(EntityReference entity) {
        this.entity = entity;
    }

    public UnusedAssets withEntity(EntityReference entity) {
        this.entity = entity;
        return this;
    }

    /**
     * Size of the asset in bytes
     * 
     */
    @JsonProperty("sizeInBytes")
    public Double getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * Size of the asset in bytes
     * 
     */
    @JsonProperty("sizeInBytes")
    public void setSizeInBytes(Double sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public UnusedAssets withSizeInBytes(Double sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastAccessedAt")
    public Long getLastAccessedAt() {
        return lastAccessedAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastAccessedAt")
    public void setLastAccessedAt(Long lastAccessedAt) {
        this.lastAccessedAt = lastAccessedAt;
    }

    public UnusedAssets withLastAccessedAt(Long lastAccessedAt) {
        this.lastAccessedAt = lastAccessedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UnusedAssets.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entity");
        sb.append('=');
        sb.append(((this.entity == null)?"<null>":this.entity));
        sb.append(',');
        sb.append("sizeInBytes");
        sb.append('=');
        sb.append(((this.sizeInBytes == null)?"<null>":this.sizeInBytes));
        sb.append(',');
        sb.append("lastAccessedAt");
        sb.append('=');
        sb.append(((this.lastAccessedAt == null)?"<null>":this.lastAccessedAt));
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
        result = ((result* 31)+((this.lastAccessedAt == null)? 0 :this.lastAccessedAt.hashCode()));
        result = ((result* 31)+((this.sizeInBytes == null)? 0 :this.sizeInBytes.hashCode()));
        result = ((result* 31)+((this.entity == null)? 0 :this.entity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UnusedAssets) == false) {
            return false;
        }
        UnusedAssets rhs = ((UnusedAssets) other);
        return ((((this.lastAccessedAt == rhs.lastAccessedAt)||((this.lastAccessedAt!= null)&&this.lastAccessedAt.equals(rhs.lastAccessedAt)))&&((this.sizeInBytes == rhs.sizeInBytes)||((this.sizeInBytes!= null)&&this.sizeInBytes.equals(rhs.sizeInBytes))))&&((this.entity == rhs.entity)||((this.entity!= null)&&this.entity.equals(rhs.entity))));
    }

}
