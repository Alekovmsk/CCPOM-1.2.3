
package org.openmetadata.schema.entity.type;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.EntityReference;


/**
 * Type used for adding custom property to an entity to extend it.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "propertyType"
})
@Generated("jsonschema2pojo")
public class CustomProperty {

    /**
     * Name of the property or entity types. Note a property name must be unique for an entity. Property name must follow camelCase naming adopted by openMetadata - must start with lower case with no space, underscore, or dots.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the property or entity types. Note a property name must be unique for an entity. Property name must follow camelCase naming adopted by openMetadata - must start with lower case with no space, underscore, or dots.")
    @Pattern(regexp = "^(?U)[\\w]+$")
    @NotNull
    private String name;
    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    @NotNull
    private String description;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("propertyType")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference propertyType;

    /**
     * Name of the property or entity types. Note a property name must be unique for an entity. Property name must follow camelCase naming adopted by openMetadata - must start with lower case with no space, underscore, or dots.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the property or entity types. Note a property name must be unique for an entity. Property name must follow camelCase naming adopted by openMetadata - must start with lower case with no space, underscore, or dots.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CustomProperty withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CustomProperty withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("propertyType")
    public EntityReference getPropertyType() {
        return propertyType;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("propertyType")
    public void setPropertyType(EntityReference propertyType) {
        this.propertyType = propertyType;
    }

    public CustomProperty withPropertyType(EntityReference propertyType) {
        this.propertyType = propertyType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomProperty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("propertyType");
        sb.append('=');
        sb.append(((this.propertyType == null)?"<null>":this.propertyType));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.propertyType == null)? 0 :this.propertyType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomProperty) == false) {
            return false;
        }
        CustomProperty rhs = ((CustomProperty) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.propertyType == rhs.propertyType)||((this.propertyType!= null)&&this.propertyType.equals(rhs.propertyType))));
    }

}
