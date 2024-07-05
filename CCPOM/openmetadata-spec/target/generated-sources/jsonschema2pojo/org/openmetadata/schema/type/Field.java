
package org.openmetadata.schema.type;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.FieldInterface;


/**
 * This schema defines the nested object to capture protobuf/avro/jsonschema of topic's schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "dataType",
    "dataTypeDisplay",
    "description",
    "fullyQualifiedName",
    "tags",
    "children"
})
@Generated("jsonschema2pojo")
public class Field implements FieldInterface
{

    /**
     * Local name (not fully qualified name) of the field. 
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Local name (not fully qualified name) of the field. ")
    @Size(min = 1, max = 128)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this field name.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this field name.")
    private String displayName;
    /**
     * This enum defines the type of data defined in schema.
     * (Required)
     * 
     */
    @JsonProperty("dataType")
    @JsonPropertyDescription("This enum defines the type of data defined in schema.")
    @NotNull
    private FieldDataType dataType;
    /**
     * Display name used for dataType. This is useful for complex types, such as `array<int>`, `map<int,string>`, `struct<>`, and union types.
     * 
     */
    @JsonProperty("dataTypeDisplay")
    @JsonPropertyDescription("Display name used for dataType. This is useful for complex types, such as `array<int>`, `map<int,string>`, `struct<>`, and union types.")
    private String dataTypeDisplay;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Tags associated with the column.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags associated with the column.")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * Child fields if dataType or arrayDataType is `map`, `record`, `message`
     * 
     */
    @JsonProperty("children")
    @JsonPropertyDescription("Child fields if dataType or arrayDataType is `map`, `record`, `message`")
    @Valid
    private List<Field> children = null;

    /**
     * Local name (not fully qualified name) of the field. 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Local name (not fully qualified name) of the field. 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Field withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this field name.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this field name.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Field withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * This enum defines the type of data defined in schema.
     * (Required)
     * 
     */
    @JsonProperty("dataType")
    public FieldDataType getDataType() {
        return dataType;
    }

    /**
     * This enum defines the type of data defined in schema.
     * (Required)
     * 
     */
    @JsonProperty("dataType")
    public void setDataType(FieldDataType dataType) {
        this.dataType = dataType;
    }

    public Field withDataType(FieldDataType dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Display name used for dataType. This is useful for complex types, such as `array<int>`, `map<int,string>`, `struct<>`, and union types.
     * 
     */
    @JsonProperty("dataTypeDisplay")
    public String getDataTypeDisplay() {
        return dataTypeDisplay;
    }

    /**
     * Display name used for dataType. This is useful for complex types, such as `array<int>`, `map<int,string>`, `struct<>`, and union types.
     * 
     */
    @JsonProperty("dataTypeDisplay")
    public void setDataTypeDisplay(String dataTypeDisplay) {
        this.dataTypeDisplay = dataTypeDisplay;
    }

    public Field withDataTypeDisplay(String dataTypeDisplay) {
        this.dataTypeDisplay = dataTypeDisplay;
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

    public Field withDescription(String description) {
        this.description = description;
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

    public Field withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Tags associated with the column.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags associated with the column.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public Field withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Child fields if dataType or arrayDataType is `map`, `record`, `message`
     * 
     */
    @JsonProperty("children")
    public List<Field> getChildren() {
        return children;
    }

    /**
     * Child fields if dataType or arrayDataType is `map`, `record`, `message`
     * 
     */
    @JsonProperty("children")
    public void setChildren(List<Field> children) {
        this.children = children;
    }

    public Field withChildren(List<Field> children) {
        this.children = children;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Field.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("dataType");
        sb.append('=');
        sb.append(((this.dataType == null)?"<null>":this.dataType));
        sb.append(',');
        sb.append("dataTypeDisplay");
        sb.append('=');
        sb.append(((this.dataTypeDisplay == null)?"<null>":this.dataTypeDisplay));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null)?"<null>":this.children));
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
        result = ((result* 31)+((this.children == null)? 0 :this.children.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.dataType == null)? 0 :this.dataType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.dataTypeDisplay == null)? 0 :this.dataTypeDisplay.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Field) == false) {
            return false;
        }
        Field rhs = ((Field) other);
        return (((((((((this.children == rhs.children)||((this.children!= null)&&this.children.equals(rhs.children)))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.dataType == rhs.dataType)||((this.dataType!= null)&&this.dataType.equals(rhs.dataType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.dataTypeDisplay == rhs.dataTypeDisplay)||((this.dataTypeDisplay!= null)&&this.dataTypeDisplay.equals(rhs.dataTypeDisplay))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
