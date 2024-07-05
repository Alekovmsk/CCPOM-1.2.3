
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Reaction
 * <p>
 * This schema defines the reaction to an entity or a conversation in the activity feeds.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reactionType",
    "user"
})
@Generated("jsonschema2pojo")
public class Reaction {

    /**
     * Type of reaction.
     * (Required)
     * 
     */
    @JsonProperty("reactionType")
    @JsonPropertyDescription("Type of reaction.")
    @NotNull
    private ReactionType reactionType;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference user;

    /**
     * Type of reaction.
     * (Required)
     * 
     */
    @JsonProperty("reactionType")
    public ReactionType getReactionType() {
        return reactionType;
    }

    /**
     * Type of reaction.
     * (Required)
     * 
     */
    @JsonProperty("reactionType")
    public void setReactionType(ReactionType reactionType) {
        this.reactionType = reactionType;
    }

    public Reaction withReactionType(ReactionType reactionType) {
        this.reactionType = reactionType;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("user")
    public EntityReference getUser() {
        return user;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("user")
    public void setUser(EntityReference user) {
        this.user = user;
    }

    public Reaction withUser(EntityReference user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reaction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reactionType");
        sb.append('=');
        sb.append(((this.reactionType == null)?"<null>":this.reactionType));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.reactionType == null)? 0 :this.reactionType.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reaction) == false) {
            return false;
        }
        Reaction rhs = ((Reaction) other);
        return (((this.reactionType == rhs.reactionType)||((this.reactionType!= null)&&this.reactionType.equals(rhs.reactionType)))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
