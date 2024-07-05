
package org.openmetadata.schema.type;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Edge in the lineage graph from one entity to another by entity IDs.
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
public class Edge {

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("fromEntity")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    @NotNull
    private UUID fromEntity;
    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("toEntity")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    @NotNull
    private UUID toEntity;
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
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("fromEntity")
    public UUID getFromEntity() {
        return fromEntity;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("fromEntity")
    public void setFromEntity(UUID fromEntity) {
        this.fromEntity = fromEntity;
    }

    public Edge withFromEntity(UUID fromEntity) {
        this.fromEntity = fromEntity;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("toEntity")
    public UUID getToEntity() {
        return toEntity;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("toEntity")
    public void setToEntity(UUID toEntity) {
        this.toEntity = toEntity;
    }

    public Edge withToEntity(UUID toEntity) {
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

    public Edge withDescription(String description) {
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

    public Edge withLineageDetails(LineageDetails lineageDetails) {
        this.lineageDetails = lineageDetails;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Edge.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Edge) == false) {
            return false;
        }
        Edge rhs = ((Edge) other);
        return (((((this.toEntity == rhs.toEntity)||((this.toEntity!= null)&&this.toEntity.equals(rhs.toEntity)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fromEntity == rhs.fromEntity)||((this.fromEntity!= null)&&this.fromEntity.equals(rhs.fromEntity))))&&((this.lineageDetails == rhs.lineageDetails)||((this.lineageDetails!= null)&&this.lineageDetails.equals(rhs.lineageDetails))));
    }

}
