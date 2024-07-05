
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
 * SubscriptionResourceDescriptor
 * <p>
 * Subscription descriptor
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "supportedFilters"
})
@Generated("jsonschema2pojo")
public class SubscriptionResourceDescriptor {

    /**
     * Name of the resource. For entity related resources, resource name is same as the entity name. Some resources such as lineage are not entities but are resources.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the resource. For entity related resources, resource name is same as the entity name. Some resources such as lineage are not entities but are resources.")
    private String name;
    /**
     * List of operations supported filters by the resource.
     * 
     */
    @JsonProperty("supportedFilters")
    @JsonPropertyDescription("List of operations supported filters by the resource.")
    @Valid
    private List<SubscriptionFilterOperation> supportedFilters = new ArrayList<SubscriptionFilterOperation>();

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

    public SubscriptionResourceDescriptor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * List of operations supported filters by the resource.
     * 
     */
    @JsonProperty("supportedFilters")
    public List<SubscriptionFilterOperation> getSupportedFilters() {
        return supportedFilters;
    }

    /**
     * List of operations supported filters by the resource.
     * 
     */
    @JsonProperty("supportedFilters")
    public void setSupportedFilters(List<SubscriptionFilterOperation> supportedFilters) {
        this.supportedFilters = supportedFilters;
    }

    public SubscriptionResourceDescriptor withSupportedFilters(List<SubscriptionFilterOperation> supportedFilters) {
        this.supportedFilters = supportedFilters;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubscriptionResourceDescriptor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("supportedFilters");
        sb.append('=');
        sb.append(((this.supportedFilters == null)?"<null>":this.supportedFilters));
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
        result = ((result* 31)+((this.supportedFilters == null)? 0 :this.supportedFilters.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubscriptionResourceDescriptor) == false) {
            return false;
        }
        SubscriptionResourceDescriptor rhs = ((SubscriptionResourceDescriptor) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.supportedFilters == rhs.supportedFilters)||((this.supportedFilters!= null)&&this.supportedFilters.equals(rhs.supportedFilters))));
    }

}
