
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Edge in the lineage graph from one entity to another using entity references.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fromEntity",
    "toEntity",
    "description",
    "lineageDetails"
})
@Generated("jsonschema2pojo")
public class EntitiesEdge {

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("fromEntity")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference fromEntity;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("toEntity")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference toEntity;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Lineage details including sqlQuery + pipeline + columnLineage.
     * 
     */
    @JsonProperty("lineageDetails")
    @JsonPropertyDescription("Lineage details including sqlQuery + pipeline + columnLineage.")
    @Valid
    private LineageDetails lineageDetails;

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("fromEntity")
    public EntityReference getFromEntity() {
        return fromEntity;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("fromEntity")
    public void setFromEntity(EntityReference fromEntity) {
        this.fromEntity = fromEntity;
    }

    public EntitiesEdge withFromEntity(EntityReference fromEntity) {
        this.fromEntity = fromEntity;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("toEntity")
    public EntityReference getToEntity() {
        return toEntity;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("toEntity")
    public void setToEntity(EntityReference toEntity) {
        this.toEntity = toEntity;
    }

    public EntitiesEdge withToEntity(EntityReference toEntity) {
        this.toEntity = toEntity;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public EntitiesEdge withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Lineage details including sqlQuery + pipeline + columnLineage.
     * 
     */
    @JsonProperty("lineageDetails")
    public LineageDetails getLineageDetails() {
        return lineageDetails;
    }

    /**
     * Lineage details including sqlQuery + pipeline + columnLineage.
     * 
     */
    @JsonProperty("lineageDetails")
    public void setLineageDetails(LineageDetails lineageDetails) {
        this.lineageDetails = lineageDetails;
    }

    public EntitiesEdge withLineageDetails(LineageDetails lineageDetails) {
        this.lineageDetails = lineageDetails;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntitiesEdge.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fromEntity");
        sb.append('=');
        sb.append(((this.fromEntity == null)?"<null>":this.fromEntity));
        sb.append(',');
        sb.append("toEntity");
        sb.append('=');
        sb.append(((this.toEntity == null)?"<null>":this.toEntity));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("lineageDetails");
        sb.append('=');
        sb.append(((this.lineageDetails == null)?"<null>":this.lineageDetails));
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
        result = ((result* 31)+((this.toEntity == null)? 0 :this.toEntity.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.fromEntity == null)? 0 :this.fromEntity.hashCode()));
        result = ((result* 31)+((this.lineageDetails == null)? 0 :this.lineageDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntitiesEdge) == false) {
            return false;
        }
        EntitiesEdge rhs = ((EntitiesEdge) other);
        return (((((this.toEntity == rhs.toEntity)||((this.toEntity!= null)&&this.toEntity.equals(rhs.toEntity)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fromEntity == rhs.fromEntity)||((this.fromEntity!= null)&&this.fromEntity.equals(rhs.fromEntity))))&&((this.lineageDetails == rhs.lineageDetails)||((this.lineageDetails!= null)&&this.lineageDetails.equals(rhs.lineageDetails))));
    }

}
