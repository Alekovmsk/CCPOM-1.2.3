
package org.openmetadata.schema.api;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.entity.type.Category;


/**
 * createType
 * <p>
 * Create a Type to be used for extending entities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "nameSpace",
    "category",
    "schema"
})
@Generated("jsonschema2pojo")
public class CreateType implements CreateEntity
{

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
     * Display Name that identifies this Type.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this Type.")
    private String displayName;
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
     * Namespace or group to which this type belongs to.
     * (Required)
     * 
     */
    @JsonProperty("nameSpace")
    @JsonPropertyDescription("Namespace or group to which this type belongs to.")
    @NotNull
    private String nameSpace = "custom";
    /**
     * Metadata category to which a type belongs to.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Metadata category to which a type belongs to.")
    private Category category;
    /**
     * JSON schema encoded as string. This will be used to validate the JSON fields using this schema.
     * (Required)
     * 
     */
    @JsonProperty("schema")
    @JsonPropertyDescription("JSON schema encoded as string. This will be used to validate the JSON fields using this schema.")
    @NotNull
    private String schema;

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

    public CreateType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this Type.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this Type.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateType withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public CreateType withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Namespace or group to which this type belongs to.
     * (Required)
     * 
     */
    @JsonProperty("nameSpace")
    public String getNameSpace() {
        return nameSpace;
    }

    /**
     * Namespace or group to which this type belongs to.
     * (Required)
     * 
     */
    @JsonProperty("nameSpace")
    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public CreateType withNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }

    /**
     * Metadata category to which a type belongs to.
     * 
     */
    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    /**
     * Metadata category to which a type belongs to.
     * 
     */
    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    public CreateType withCategory(Category category) {
        this.category = category;
        return this;
    }

    /**
     * JSON schema encoded as string. This will be used to validate the JSON fields using this schema.
     * (Required)
     * 
     */
    @JsonProperty("schema")
    public String getSchema() {
        return schema;
    }

    /**
     * JSON schema encoded as string. This will be used to validate the JSON fields using this schema.
     * (Required)
     * 
     */
    @JsonProperty("schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }

    public CreateType withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("nameSpace");
        sb.append('=');
        sb.append(((this.nameSpace == null)?"<null>":this.nameSpace));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("schema");
        sb.append('=');
        sb.append(((this.schema == null)?"<null>":this.schema));
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
        result = ((result* 31)+((this.schema == null)? 0 :this.schema.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.nameSpace == null)? 0 :this.nameSpace.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateType) == false) {
            return false;
        }
        CreateType rhs = ((CreateType) other);
        return (((((((this.schema == rhs.schema)||((this.schema!= null)&&this.schema.equals(rhs.schema)))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.nameSpace == rhs.nameSpace)||((this.nameSpace!= null)&&this.nameSpace.equals(rhs.nameSpace))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }

}
