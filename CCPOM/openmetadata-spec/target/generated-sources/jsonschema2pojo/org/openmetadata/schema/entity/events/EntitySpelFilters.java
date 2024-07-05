
package org.openmetadata.schema.entity.events;

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
 * EntitySpelFilters
 * <p>
 * Entity Spel Filters.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityType",
    "supportedFunctions"
})
@Generated("jsonschema2pojo")
public class EntitySpelFilters {

    /**
     * EntityType
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("EntityType")
    @NotNull
    private String entityType;
    /**
     * List of Supported functions
     * (Required)
     * 
     */
    @JsonProperty("supportedFunctions")
    @JsonPropertyDescription("List of Supported functions")
    @Valid
    @NotNull
    private List<String> supportedFunctions = new ArrayList<String>();

    /**
     * EntityType
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    /**
     * EntityType
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public EntitySpelFilters withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * List of Supported functions
     * (Required)
     * 
     */
    @JsonProperty("supportedFunctions")
    public List<String> getSupportedFunctions() {
        return supportedFunctions;
    }

    /**
     * List of Supported functions
     * (Required)
     * 
     */
    @JsonProperty("supportedFunctions")
    public void setSupportedFunctions(List<String> supportedFunctions) {
        this.supportedFunctions = supportedFunctions;
    }

    public EntitySpelFilters withSupportedFunctions(List<String> supportedFunctions) {
        this.supportedFunctions = supportedFunctions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntitySpelFilters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("supportedFunctions");
        sb.append('=');
        sb.append(((this.supportedFunctions == null)?"<null>":this.supportedFunctions));
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
        result = ((result* 31)+((this.supportedFunctions == null)? 0 :this.supportedFunctions.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntitySpelFilters) == false) {
            return false;
        }
        EntitySpelFilters rhs = ((EntitySpelFilters) other);
        return (((this.supportedFunctions == rhs.supportedFunctions)||((this.supportedFunctions!= null)&&this.supportedFunctions.equals(rhs.supportedFunctions)))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))));
    }

}
