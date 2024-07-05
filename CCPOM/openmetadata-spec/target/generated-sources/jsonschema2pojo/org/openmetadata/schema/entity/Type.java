
package org.openmetadata.schema.entity;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.EntityInterface;
import org.openmetadata.schema.entity.type.Category;
import org.openmetadata.schema.entity.type.CustomProperty;
import org.openmetadata.schema.type.ChangeDescription;


/**
 * Type
 * <p>
 * This schema defines a type as an entity. Types includes property types and entity types. Custom types can also be defined by the users to extend the metadata system.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "fullyQualifiedName",
    "displayName",
    "description",
    "category",
    "nameSpace",
    "schema",
    "customProperties",
    "version",
    "updatedAt",
    "updatedBy",
    "href",
    "changeDescription"
})
@Generated("jsonschema2pojo")
public class Type implements EntityInterface
{

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Display Name that identifies this type.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this type.")
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
     * Metadata category to which a type belongs to.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Metadata category to which a type belongs to.")
    private Category category;
    /**
     * Namespace or group to which this type belongs to. For example, some of the property types commonly used can come from `basic` namespace. Some of the entities such as `table`, `database`, etc. come from `data` namespace.
     * 
     */
    @JsonProperty("nameSpace")
    @JsonPropertyDescription("Namespace or group to which this type belongs to. For example, some of the property types commonly used can come from `basic` namespace. Some of the entities such as `table`, `database`, etc. come from `data` namespace.")
    private String nameSpace = "custom";
    /**
     * JSON schema encoded as string. This will be used to validate the JSON fields using this schema.
     * 
     */
    @JsonProperty("schema")
    @JsonPropertyDescription("JSON schema encoded as string. This will be used to validate the JSON fields using this schema.")
    private String schema;
    /**
     * Custom properties added to extend the entity. Only available for entity type
     * 
     */
    @JsonProperty("customProperties")
    @JsonPropertyDescription("Custom properties added to extend the entity. Only available for entity type")
    @Valid
    private List<CustomProperty> customProperties = new ArrayList<CustomProperty>();
    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.")
    private Double version = 0.1D;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long updatedAt;
    /**
     * User who made the update.
     * 
     */
    @JsonProperty("updatedBy")
    @JsonPropertyDescription("User who made the update.")
    private String updatedBy;
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;
    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    @JsonPropertyDescription("Description of the change.")
    @Valid
    private ChangeDescription changeDescription;

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

    public Type withId(UUID id) {
        this.id = id;
        return this;
    }

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

    public Type withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public Type withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Display Name that identifies this type.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this type.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Type withDisplayName(String displayName) {
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

    public Type withDescription(String description) {
        this.description = description;
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

    public Type withCategory(Category category) {
        this.category = category;
        return this;
    }

    /**
     * Namespace or group to which this type belongs to. For example, some of the property types commonly used can come from `basic` namespace. Some of the entities such as `table`, `database`, etc. come from `data` namespace.
     * 
     */
    @JsonProperty("nameSpace")
    public String getNameSpace() {
        return nameSpace;
    }

    /**
     * Namespace or group to which this type belongs to. For example, some of the property types commonly used can come from `basic` namespace. Some of the entities such as `table`, `database`, etc. come from `data` namespace.
     * 
     */
    @JsonProperty("nameSpace")
    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public Type withNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }

    /**
     * JSON schema encoded as string. This will be used to validate the JSON fields using this schema.
     * 
     */
    @JsonProperty("schema")
    public String getSchema() {
        return schema;
    }

    /**
     * JSON schema encoded as string. This will be used to validate the JSON fields using this schema.
     * 
     */
    @JsonProperty("schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Type withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Custom properties added to extend the entity. Only available for entity type
     * 
     */
    @JsonProperty("customProperties")
    public List<CustomProperty> getCustomProperties() {
        return customProperties;
    }

    /**
     * Custom properties added to extend the entity. Only available for entity type
     * 
     */
    @JsonProperty("customProperties")
    public void setCustomProperties(List<CustomProperty> customProperties) {
        this.customProperties = customProperties;
    }

    public Type withCustomProperties(List<CustomProperty> customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    public Double getVersion() {
        return version;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    public void setVersion(Double version) {
        this.version = version;
    }

    public Type withVersion(Double version) {
        this.version = version;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    public Long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Type withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * User who made the update.
     * 
     */
    @JsonProperty("updatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * User who made the update.
     * 
     */
    @JsonProperty("updatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Type withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    public URI getHref() {
        return href;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    public void setHref(URI href) {
        this.href = href;
    }

    public Type withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    public ChangeDescription getChangeDescription() {
        return changeDescription;
    }

    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    public void setChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
    }

    public Type withChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Type.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("nameSpace");
        sb.append('=');
        sb.append(((this.nameSpace == null)?"<null>":this.nameSpace));
        sb.append(',');
        sb.append("schema");
        sb.append('=');
        sb.append(((this.schema == null)?"<null>":this.schema));
        sb.append(',');
        sb.append("customProperties");
        sb.append('=');
        sb.append(((this.customProperties == null)?"<null>":this.customProperties));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("changeDescription");
        sb.append('=');
        sb.append(((this.changeDescription == null)?"<null>":this.changeDescription));
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
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.customProperties == null)? 0 :this.customProperties.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.nameSpace == null)? 0 :this.nameSpace.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Type) == false) {
            return false;
        }
        Type rhs = ((Type) other);
        return (((((((((((((((this.schema == rhs.schema)||((this.schema!= null)&&this.schema.equals(rhs.schema)))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.customProperties == rhs.customProperties)||((this.customProperties!= null)&&this.customProperties.equals(rhs.customProperties))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.nameSpace == rhs.nameSpace)||((this.nameSpace!= null)&&this.nameSpace.equals(rhs.nameSpace))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
