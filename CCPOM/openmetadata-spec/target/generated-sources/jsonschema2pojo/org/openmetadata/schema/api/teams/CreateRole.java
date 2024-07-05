
package org.openmetadata.schema.api.teams;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.CreateEntity;


/**
 * CreateRoleRequest
 * <p>
 * Request for creating a Role entity
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "policies"
})
@Generated("jsonschema2pojo")
public class CreateRole implements CreateEntity
{

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()%]+$")
    @Size(min = 1, max = 128)
    @NotNull
    private String name;
    /**
     * Optional name used for display purposes. Example 'Data Consumer'
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Optional name used for display purposes. Example 'Data Consumer'")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Policies that is attached to this role. At least one policy is required.
     * (Required)
     * 
     */
    @JsonProperty("policies")
    @JsonPropertyDescription("Policies that is attached to this role. At least one policy is required.")
    @Valid
    @NotNull
    private List<String> policies = new ArrayList<String>();

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreateRole withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Optional name used for display purposes. Example 'Data Consumer'
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Optional name used for display purposes. Example 'Data Consumer'
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateRole withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CreateRole withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Policies that is attached to this role. At least one policy is required.
     * (Required)
     * 
     */
    @JsonProperty("policies")
    public List<String> getPolicies() {
        return policies;
    }

    /**
     * Policies that is attached to this role. At least one policy is required.
     * (Required)
     * 
     */
    @JsonProperty("policies")
    public void setPolicies(List<String> policies) {
        this.policies = policies;
    }

    public CreateRole withPolicies(List<String> policies) {
        this.policies = policies;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateRole.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("policies");
        sb.append('=');
        sb.append(((this.policies == null)?"<null>":this.policies));
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
        result = ((result* 31)+((this.policies == null)? 0 :this.policies.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateRole) == false) {
            return false;
        }
        CreateRole rhs = ((CreateRole) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.policies == rhs.policies)||((this.policies!= null)&&this.policies.equals(rhs.policies))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))));
    }

}
