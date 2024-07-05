
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
 * EntityUsage
 * <p>
 * This schema defines the type used for capturing usage details of an entity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entity",
    "usage"
})
@Generated("jsonschema2pojo")
public class EntityUsage {

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("entity")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference entity;
    /**
     * List usage details per day.
     * (Required)
     * 
     */
    @JsonProperty("usage")
    @JsonPropertyDescription("List usage details per day.")
    @Valid
    @NotNull
    private List<UsageDetails> usage = new ArrayList<UsageDetails>();

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("entity")
    public void setEntity(EntityReference entity) {
        this.entity = entity;
    }

    public EntityUsage withEntity(EntityReference entity) {
        this.entity = entity;
        return this;
    }

    /**
     * List usage details per day.
     * (Required)
     * 
     */
    @JsonProperty("usage")
    public List<UsageDetails> getUsage() {
        return usage;
    }

    /**
     * List usage details per day.
     * (Required)
     * 
     */
    @JsonProperty("usage")
    public void setUsage(List<UsageDetails> usage) {
        this.usage = usage;
    }

    public EntityUsage withUsage(List<UsageDetails> usage) {
        this.usage = usage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityUsage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entity");
        sb.append('=');
        sb.append(((this.entity == null)?"<null>":this.entity));
        sb.append(',');
        sb.append("usage");
        sb.append('=');
        sb.append(((this.usage == null)?"<null>":this.usage));
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
        result = ((result* 31)+((this.entity == null)? 0 :this.entity.hashCode()));
        result = ((result* 31)+((this.usage == null)? 0 :this.usage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityUsage) == false) {
            return false;
        }
        EntityUsage rhs = ((EntityUsage) other);
        return (((this.entity == rhs.entity)||((this.entity!= null)&&this.entity.equals(rhs.entity)))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))));
    }

}
