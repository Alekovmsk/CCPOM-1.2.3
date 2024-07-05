
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Life Cycle
 * <p>
 * This schema defines Life Cycle Properties.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "created",
    "updated",
    "accessed"
})
@Generated("jsonschema2pojo")
public class LifeCycle {

    /**
     * Access details of an entity 
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("Access details of an entity ")
    @Valid
    private AccessDetails created;
    /**
     * Access details of an entity 
     * 
     */
    @JsonProperty("updated")
    @JsonPropertyDescription("Access details of an entity ")
    @Valid
    private AccessDetails updated;
    /**
     * Access details of an entity 
     * 
     */
    @JsonProperty("accessed")
    @JsonPropertyDescription("Access details of an entity ")
    @Valid
    private AccessDetails accessed;

    /**
     * Access details of an entity 
     * 
     */
    @JsonProperty("created")
    public AccessDetails getCreated() {
        return created;
    }

    /**
     * Access details of an entity 
     * 
     */
    @JsonProperty("created")
    public void setCreated(AccessDetails created) {
        this.created = created;
    }

    public LifeCycle withCreated(AccessDetails created) {
        this.created = created;
        return this;
    }

    /**
     * Access details of an entity 
     * 
     */
    @JsonProperty("updated")
    public AccessDetails getUpdated() {
        return updated;
    }

    /**
     * Access details of an entity 
     * 
     */
    @JsonProperty("updated")
    public void setUpdated(AccessDetails updated) {
        this.updated = updated;
    }

    public LifeCycle withUpdated(AccessDetails updated) {
        this.updated = updated;
        return this;
    }

    /**
     * Access details of an entity 
     * 
     */
    @JsonProperty("accessed")
    public AccessDetails getAccessed() {
        return accessed;
    }

    /**
     * Access details of an entity 
     * 
     */
    @JsonProperty("accessed")
    public void setAccessed(AccessDetails accessed) {
        this.accessed = accessed;
    }

    public LifeCycle withAccessed(AccessDetails accessed) {
        this.accessed = accessed;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LifeCycle.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("updated");
        sb.append('=');
        sb.append(((this.updated == null)?"<null>":this.updated));
        sb.append(',');
        sb.append("accessed");
        sb.append('=');
        sb.append(((this.accessed == null)?"<null>":this.accessed));
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
        result = ((result* 31)+((this.accessed == null)? 0 :this.accessed.hashCode()));
        result = ((result* 31)+((this.updated == null)? 0 :this.updated.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifeCycle) == false) {
            return false;
        }
        LifeCycle rhs = ((LifeCycle) other);
        return ((((this.accessed == rhs.accessed)||((this.accessed!= null)&&this.accessed.equals(rhs.accessed)))&&((this.updated == rhs.updated)||((this.updated!= null)&&this.updated.equals(rhs.updated))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))));
    }

}
