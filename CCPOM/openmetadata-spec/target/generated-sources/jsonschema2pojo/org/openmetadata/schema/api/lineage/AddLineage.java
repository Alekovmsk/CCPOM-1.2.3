
package org.openmetadata.schema.api.lineage;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.EntitiesEdge;


/**
 * AddLineageRequest
 * <p>
 * Add lineage details between two entities
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "edge"
})
@Generated("jsonschema2pojo")
public class AddLineage {

    /**
     * Edge in the lineage graph from one entity to another using entity references.
     * (Required)
     * 
     */
    @JsonProperty("edge")
    @JsonPropertyDescription("Edge in the lineage graph from one entity to another using entity references.")
    @Valid
    @NotNull
    private EntitiesEdge edge;

    /**
     * Edge in the lineage graph from one entity to another using entity references.
     * (Required)
     * 
     */
    @JsonProperty("edge")
    public EntitiesEdge getEdge() {
        return edge;
    }

    /**
     * Edge in the lineage graph from one entity to another using entity references.
     * (Required)
     * 
     */
    @JsonProperty("edge")
    public void setEdge(EntitiesEdge edge) {
        this.edge = edge;
    }

    public AddLineage withEdge(EntitiesEdge edge) {
        this.edge = edge;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddLineage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("edge");
        sb.append('=');
        sb.append(((this.edge == null)?"<null>":this.edge));
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
        result = ((result* 31)+((this.edge == null)? 0 :this.edge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddLineage) == false) {
            return false;
        }
        AddLineage rhs = ((AddLineage) other);
        return ((this.edge == rhs.edge)||((this.edge!= null)&&this.edge.equals(rhs.edge)));
    }

}
