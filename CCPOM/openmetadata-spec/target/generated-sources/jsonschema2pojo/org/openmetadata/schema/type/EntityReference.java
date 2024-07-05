
package org.openmetadata.schema.type;

import java.net.URI;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Entity Reference
 * <p>
 * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "name",
    "fullyQualifiedName",
    "description",
    "displayName",
    "deleted",
    "href"
})
@Generated("jsonschema2pojo")
public class EntityReference {

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    @NotNull
    private UUID id;
    /**
     * Entity type/class name - Examples: `database`, `table`, `metrics`, `databaseService`, `dashboardService`...
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Entity type/class name - Examples: `database`, `table`, `metrics`, `databaseService`, `dashboardService`...")
    @NotNull
    private String type;
    /**
     * Name of the entity instance.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the entity instance.")
    private String name;
    /**
     * Fully qualified name of the entity instance. For entities such as tables, databases fullyQualifiedName is returned in this field. For entities that don't have name hierarchy such as `user` and `team` this will be same as the `name` field.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("Fully qualified name of the entity instance. For entities such as tables, databases fullyQualifiedName is returned in this field. For entities that don't have name hierarchy such as `user` and `team` this will be same as the `name` field.")
    private String fullyQualifiedName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Display Name that identifies this entity.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this entity.")
    private String displayName;
    /**
     * If true the entity referred to has been soft-deleted.
     * 
     */
    @JsonProperty("deleted")
    @JsonPropertyDescription("If true the entity referred to has been soft-deleted.")
    private Boolean deleted;
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    public EntityReference withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Entity type/class name - Examples: `database`, `table`, `metrics`, `databaseService`, `dashboardService`...
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Entity type/class name - Examples: `database`, `table`, `metrics`, `databaseService`, `dashboardService`...
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public EntityReference withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Name of the entity instance.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the entity instance.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public EntityReference withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Fully qualified name of the entity instance. For entities such as tables, databases fullyQualifiedName is returned in this field. For entities that don't have name hierarchy such as `user` and `team` this will be same as the `name` field.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * Fully qualified name of the entity instance. For entities such as tables, databases fullyQualifiedName is returned in this field. For entities that don't have name hierarchy such as `user` and `team` this will be same as the `name` field.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public EntityReference withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
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

    public EntityReference withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Display Name that identifies this entity.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this entity.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public EntityReference withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * If true the entity referred to has been soft-deleted.
     * 
     */
    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * If true the entity referred to has been soft-deleted.
     * 
     */
    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public EntityReference withDeleted(Boolean deleted) {
        this.deleted = deleted;
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

    public EntityReference withHref(URI href) {
        this.href = href;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("deleted");
        sb.append('=');
        sb.append(((this.deleted == null)?"<null>":this.deleted));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
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
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityReference) == false) {
            return false;
        }
        EntityReference rhs = ((EntityReference) other);
        return (((((((((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted)))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))));
    }

}
