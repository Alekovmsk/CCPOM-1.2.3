
package org.openmetadata.schema.type;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Votes
 * <p>
 * This schema defines the Votes for a Data Asset.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "upVotes",
    "downVotes",
    "upVoters",
    "downVoters"
})
@Generated("jsonschema2pojo")
public class Votes {

    /**
     * Total up-votes the entity has
     * 
     */
    @JsonProperty("upVotes")
    @JsonPropertyDescription("Total up-votes the entity has")
    private Integer upVotes = 0;
    /**
     * Total down-votes the entity has
     * 
     */
    @JsonProperty("downVotes")
    @JsonPropertyDescription("Total down-votes the entity has")
    private Integer downVotes = 0;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("upVoters")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> upVoters = null;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("downVoters")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> downVoters = null;

    /**
     * Total up-votes the entity has
     * 
     */
    @JsonProperty("upVotes")
    public Integer getUpVotes() {
        return upVotes;
    }

    /**
     * Total up-votes the entity has
     * 
     */
    @JsonProperty("upVotes")
    public void setUpVotes(Integer upVotes) {
        this.upVotes = upVotes;
    }

    public Votes withUpVotes(Integer upVotes) {
        this.upVotes = upVotes;
        return this;
    }

    /**
     * Total down-votes the entity has
     * 
     */
    @JsonProperty("downVotes")
    public Integer getDownVotes() {
        return downVotes;
    }

    /**
     * Total down-votes the entity has
     * 
     */
    @JsonProperty("downVotes")
    public void setDownVotes(Integer downVotes) {
        this.downVotes = downVotes;
    }

    public Votes withDownVotes(Integer downVotes) {
        this.downVotes = downVotes;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("upVoters")
    public List<EntityReference> getUpVoters() {
        return upVoters;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("upVoters")
    public void setUpVoters(List<EntityReference> upVoters) {
        this.upVoters = upVoters;
    }

    public Votes withUpVoters(List<EntityReference> upVoters) {
        this.upVoters = upVoters;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("downVoters")
    public List<EntityReference> getDownVoters() {
        return downVoters;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("downVoters")
    public void setDownVoters(List<EntityReference> downVoters) {
        this.downVoters = downVoters;
    }

    public Votes withDownVoters(List<EntityReference> downVoters) {
        this.downVoters = downVoters;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Votes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("upVotes");
        sb.append('=');
        sb.append(((this.upVotes == null)?"<null>":this.upVotes));
        sb.append(',');
        sb.append("downVotes");
        sb.append('=');
        sb.append(((this.downVotes == null)?"<null>":this.downVotes));
        sb.append(',');
        sb.append("upVoters");
        sb.append('=');
        sb.append(((this.upVoters == null)?"<null>":this.upVoters));
        sb.append(',');
        sb.append("downVoters");
        sb.append('=');
        sb.append(((this.downVoters == null)?"<null>":this.downVoters));
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
        result = ((result* 31)+((this.upVoters == null)? 0 :this.upVoters.hashCode()));
        result = ((result* 31)+((this.upVotes == null)? 0 :this.upVotes.hashCode()));
        result = ((result* 31)+((this.downVoters == null)? 0 :this.downVoters.hashCode()));
        result = ((result* 31)+((this.downVotes == null)? 0 :this.downVotes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Votes) == false) {
            return false;
        }
        Votes rhs = ((Votes) other);
        return (((((this.upVoters == rhs.upVoters)||((this.upVoters!= null)&&this.upVoters.equals(rhs.upVoters)))&&((this.upVotes == rhs.upVotes)||((this.upVotes!= null)&&this.upVotes.equals(rhs.upVotes))))&&((this.downVoters == rhs.downVoters)||((this.downVoters!= null)&&this.downVoters.equals(rhs.downVoters))))&&((this.downVotes == rhs.downVotes)||((this.downVotes!= null)&&this.downVotes.equals(rhs.downVotes))));
    }

}
