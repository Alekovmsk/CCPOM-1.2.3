
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ResourceDescriptor
 * <p>
 * Resource descriptor
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "operations"
})
@Generated("jsonschema2pojo")
public class ResourceDescriptor {

    /**
     * Name of the resource. For entity related resources, resource name is same as the entity name. Some resources such as lineage are not entities but are resources.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the resource. For entity related resources, resource name is same as the entity name. Some resources such as lineage are not entities but are resources.")
    private String name;
    /**
     * List of operations supported by the resource.
     * 
     */
    @JsonProperty("operations")
    @JsonPropertyDescription("List of operations supported by the resource.")
    @Valid
    private List<MetadataOperation> operations = new ArrayList<MetadataOperation>();

    /**
     * Name of the resource. For entity related resources, resource name is same as the entity name. Some resources such as lineage are not entities but are resources.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the resource. For entity related resources, resource name is same as the entity name. Some resources such as lineage are not entities but are resources.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ResourceDescriptor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * List of operations supported by the resource.
     * 
     */
    @JsonProperty("operations")
    public List<MetadataOperation> getOperations() {
        return operations;
    }

    /**
     * List of operations supported by the resource.
     * 
     */
    @JsonProperty("operations")
    public void setOperations(List<MetadataOperation> operations) {
        this.operations = operations;
    }

    public ResourceDescriptor withOperations(List<MetadataOperation> operations) {
        this.operations = operations;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResourceDescriptor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("operations");
        sb.append('=');
        sb.append(((this.operations == null)?"<null>":this.operations));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.operations == null)? 0 :this.operations.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDescriptor) == false) {
            return false;
        }
        ResourceDescriptor rhs = ((ResourceDescriptor) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.operations == rhs.operations)||((this.operations!= null)&&this.operations.equals(rhs.operations))));
    }

}
