
package org.openmetadata.schema.api;

import java.util.UUID;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SetOwnershipRequest
 * <p>
 * Set ownership for a given entity
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type"
})
@Generated("jsonschema2pojo")
public class SetOwner {

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Entity type of the owner typically either 'user' or 'team'
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Entity type of the owner typically either 'user' or 'team'")
    private String type;

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    public SetOwner withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Entity type of the owner typically either 'user' or 'team'
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Entity type of the owner typically either 'user' or 'team'
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public SetOwner withType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SetOwner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetOwner) == false) {
            return false;
        }
        SetOwner rhs = ((SetOwner) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
