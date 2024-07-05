
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
 * Entity Version History
 * <p>
 * This schema defines the type used for capturing version of history of entity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityType",
    "versions"
})
@Generated("jsonschema2pojo")
public class EntityHistory {

    /**
     * Entity type, such as `database`, `table`, `dashboard`, for which this version history is produced.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("Entity type, such as `database`, `table`, `dashboard`, for which this version history is produced.")
    @NotNull
    private String entityType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("versions")
    @Valid
    @NotNull
    private List<Object> versions = new ArrayList<Object>();

    /**
     * Entity type, such as `database`, `table`, `dashboard`, for which this version history is produced.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    /**
     * Entity type, such as `database`, `table`, `dashboard`, for which this version history is produced.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public EntityHistory withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("versions")
    public List<Object> getVersions() {
        return versions;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("versions")
    public void setVersions(List<Object> versions) {
        this.versions = versions;
    }

    public EntityHistory withVersions(List<Object> versions) {
        this.versions = versions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityHistory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("versions");
        sb.append('=');
        sb.append(((this.versions == null)?"<null>":this.versions));
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
        result = ((result* 31)+((this.versions == null)? 0 :this.versions.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityHistory) == false) {
            return false;
        }
        EntityHistory rhs = ((EntityHistory) other);
        return (((this.versions == rhs.versions)||((this.versions!= null)&&this.versions.equals(rhs.versions)))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))));
    }

}
