
package org.openmetadata.schema.type;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Entity Lineage
 * <p>
 * The `Lineage` for a given data asset, has information of the input datasets used and the ETL pipeline that created it.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entity",
    "nodes",
    "upstreamEdges",
    "downstreamEdges"
})
@Generated("jsonschema2pojo")
public class EntityLineage {

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
    @JsonProperty("nodes")
    @Valid
    private List<EntityReference> nodes = null;
    @JsonProperty("upstreamEdges")
    @Valid
    private List<Edge> upstreamEdges = null;
    @JsonProperty("downstreamEdges")
    @Valid
    private List<Edge> downstreamEdges = null;

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

    public EntityLineage withEntity(EntityReference entity) {
        this.entity = entity;
        return this;
    }

    @JsonProperty("nodes")
    public List<EntityReference> getNodes() {
        return nodes;
    }

    @JsonProperty("nodes")
    public void setNodes(List<EntityReference> nodes) {
        this.nodes = nodes;
    }

    public EntityLineage withNodes(List<EntityReference> nodes) {
        this.nodes = nodes;
        return this;
    }

    @JsonProperty("upstreamEdges")
    public List<Edge> getUpstreamEdges() {
        return upstreamEdges;
    }

    @JsonProperty("upstreamEdges")
    public void setUpstreamEdges(List<Edge> upstreamEdges) {
        this.upstreamEdges = upstreamEdges;
    }

    public EntityLineage withUpstreamEdges(List<Edge> upstreamEdges) {
        this.upstreamEdges = upstreamEdges;
        return this;
    }

    @JsonProperty("downstreamEdges")
    public List<Edge> getDownstreamEdges() {
        return downstreamEdges;
    }

    @JsonProperty("downstreamEdges")
    public void setDownstreamEdges(List<Edge> downstreamEdges) {
        this.downstreamEdges = downstreamEdges;
    }

    public EntityLineage withDownstreamEdges(List<Edge> downstreamEdges) {
        this.downstreamEdges = downstreamEdges;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityLineage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entity");
        sb.append('=');
        sb.append(((this.entity == null)?"<null>":this.entity));
        sb.append(',');
        sb.append("nodes");
        sb.append('=');
        sb.append(((this.nodes == null)?"<null>":this.nodes));
        sb.append(',');
        sb.append("upstreamEdges");
        sb.append('=');
        sb.append(((this.upstreamEdges == null)?"<null>":this.upstreamEdges));
        sb.append(',');
        sb.append("downstreamEdges");
        sb.append('=');
        sb.append(((this.downstreamEdges == null)?"<null>":this.downstreamEdges));
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
        result = ((result* 31)+((this.nodes == null)? 0 :this.nodes.hashCode()));
        result = ((result* 31)+((this.downstreamEdges == null)? 0 :this.downstreamEdges.hashCode()));
        result = ((result* 31)+((this.upstreamEdges == null)? 0 :this.upstreamEdges.hashCode()));
        result = ((result* 31)+((this.entity == null)? 0 :this.entity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityLineage) == false) {
            return false;
        }
        EntityLineage rhs = ((EntityLineage) other);
        return (((((this.nodes == rhs.nodes)||((this.nodes!= null)&&this.nodes.equals(rhs.nodes)))&&((this.downstreamEdges == rhs.downstreamEdges)||((this.downstreamEdges!= null)&&this.downstreamEdges.equals(rhs.downstreamEdges))))&&((this.upstreamEdges == rhs.upstreamEdges)||((this.upstreamEdges!= null)&&this.upstreamEdges.equals(rhs.upstreamEdges))))&&((this.entity == rhs.entity)||((this.entity!= null)&&this.entity.equals(rhs.entity))));
    }

}
