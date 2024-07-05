
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
 * ResourcePermission
 * <p>
 * A set of permissions for a user that shows what operation is denied, allowed, or not allowed for all the resources.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resource",
    "permissions"
})
@Generated("jsonschema2pojo")
public class ResourcePermission {

    /**
     * Name of the resource
     * (Required)
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("Name of the resource")
    @NotNull
    private String resource;
    /**
     * Permissions for a `resource`.
     * (Required)
     * 
     */
    @JsonProperty("permissions")
    @JsonPropertyDescription("Permissions for a `resource`.")
    @Valid
    @NotNull
    private List<Permission> permissions = new ArrayList<Permission>();

    /**
     * Name of the resource
     * (Required)
     * 
     */
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    /**
     * Name of the resource
     * (Required)
     * 
     */
    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    public ResourcePermission withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Permissions for a `resource`.
     * (Required)
     * 
     */
    @JsonProperty("permissions")
    public List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * Permissions for a `resource`.
     * (Required)
     * 
     */
    @JsonProperty("permissions")
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public ResourcePermission withPermissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResourcePermission.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
        sb.append(',');
        sb.append("permissions");
        sb.append('=');
        sb.append(((this.permissions == null)?"<null>":this.permissions));
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
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        result = ((result* 31)+((this.permissions == null)? 0 :this.permissions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourcePermission) == false) {
            return false;
        }
        ResourcePermission rhs = ((ResourcePermission) other);
        return (((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource)))&&((this.permissions == rhs.permissions)||((this.permissions!= null)&&this.permissions.equals(rhs.permissions))));
    }

}
