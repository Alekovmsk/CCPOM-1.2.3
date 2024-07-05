
package org.openmetadata.schema.type;

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
import org.openmetadata.schema.FieldInterface;
import org.openmetadata.schema.tests.CustomMetric;


/**
 * This schema defines the type for a column in a table.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "dataType",
    "arrayDataType",
    "dataLength",
    "precision",
    "scale",
    "dataTypeDisplay",
    "description",
    "fullyQualifiedName",
    "tags",
    "constraint",
    "ordinalPosition",
    "jsonSchema",
    "children",
    "customMetrics",
    "profile"
})
@Generated("jsonschema2pojo")
public class Column implements FieldInterface
{

    /**
     * Local name (not fully qualified name) of the column. ColumnName is `-` when the column is not named in struct dataType. For example, BigQuery supports struct with unnamed fields.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Local name (not fully qualified name) of the column. ColumnName is `-` when the column is not named in struct dataType. For example, BigQuery supports struct with unnamed fields.")
    @Pattern(regexp = "^((?!::).)*$")
    @Size(min = 1, max = 256)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this column name.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this column name.")
    private String displayName;
    /**
     * This enum defines the type of data stored in a column.
     * (Required)
     * 
     */
    @JsonProperty("dataType")
    @JsonPropertyDescription("This enum defines the type of data stored in a column.")
    @NotNull
    private ColumnDataType dataType;
    /**
     * This enum defines the type of data stored in a column.
     * 
     */
    @JsonProperty("arrayDataType")
    @JsonPropertyDescription("This enum defines the type of data stored in a column.")
    private ColumnDataType arrayDataType;
    /**
     * Length of `char`, `varchar`, `binary`, `varbinary` `dataTypes`, else null. For example, `varchar(20)` has dataType as `varchar` and dataLength as `20`.
     * 
     */
    @JsonProperty("dataLength")
    @JsonPropertyDescription("Length of `char`, `varchar`, `binary`, `varbinary` `dataTypes`, else null. For example, `varchar(20)` has dataType as `varchar` and dataLength as `20`.")
    private Integer dataLength;
    /**
     * The precision of a numeric is the total count of significant digits in the whole number, that is, the number of digits to both sides of the decimal point. Precision is applicable Integer types, such as `INT`, `SMALLINT`, `BIGINT`, etc. It also applies to other Numeric types, such as `NUMBER`, `DECIMAL`, `DOUBLE`, `FLOAT`, etc.
     * 
     */
    @JsonProperty("precision")
    @JsonPropertyDescription("The precision of a numeric is the total count of significant digits in the whole number, that is, the number of digits to both sides of the decimal point. Precision is applicable Integer types, such as `INT`, `SMALLINT`, `BIGINT`, etc. It also applies to other Numeric types, such as `NUMBER`, `DECIMAL`, `DOUBLE`, `FLOAT`, etc.")
    private Integer precision;
    /**
     * The scale of a numeric is the count of decimal digits in the fractional part, to the right of the decimal point. For Integer types, the scale is `0`. It mainly applies to non Integer Numeric types, such as `NUMBER`, `DECIMAL`, `DOUBLE`, `FLOAT`, etc.
     * 
     */
    @JsonProperty("scale")
    @JsonPropertyDescription("The scale of a numeric is the count of decimal digits in the fractional part, to the right of the decimal point. For Integer types, the scale is `0`. It mainly applies to non Integer Numeric types, such as `NUMBER`, `DECIMAL`, `DOUBLE`, `FLOAT`, etc.")
    private Integer scale;
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
     * This enum defines the type for column constraint.
     * 
     */
    @JsonProperty("constraint")
    @JsonPropertyDescription("This enum defines the type for column constraint.")
    private ColumnConstraint constraint = null;
    /**
     * Ordinal position of the column.
     * 
     */
    @JsonProperty("ordinalPosition")
    @JsonPropertyDescription("Ordinal position of the column.")
    private Integer ordinalPosition;
    /**
     * Json schema only if the dataType is JSON else null.
     * 
     */
    @JsonProperty("jsonSchema")
    @JsonPropertyDescription("Json schema only if the dataType is JSON else null.")
    private String jsonSchema;
    /**
     * Child columns if dataType or arrayDataType is `map`, `struct`, or `union` else `null`.
     * 
     */
    @JsonProperty("children")
    @JsonPropertyDescription("Child columns if dataType or arrayDataType is `map`, `struct`, or `union` else `null`.")
    @Valid
    private List<Column> children = null;
    /**
     * List of Custom Metrics registered for a column.
     * 
     */
    @JsonProperty("customMetrics")
    @JsonPropertyDescription("List of Custom Metrics registered for a column.")
    @Valid
    private List<CustomMetric> customMetrics = null;
    /**
     * This schema defines the type to capture the table's column profile.
     * 
     */
    @JsonProperty("profile")
    @JsonPropertyDescription("This schema defines the type to capture the table's column profile.")
    @Valid
    private ColumnProfile profile;

    /**
     * Local name (not fully qualified name) of the column. ColumnName is `-` when the column is not named in struct dataType. For example, BigQuery supports struct with unnamed fields.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Local name (not fully qualified name) of the column. ColumnName is `-` when the column is not named in struct dataType. For example, BigQuery supports struct with unnamed fields.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Column withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this column name.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this column name.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Column withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * This enum defines the type of data stored in a column.
     * (Required)
     * 
     */
    @JsonProperty("dataType")
    public ColumnDataType getDataType() {
        return dataType;
    }

    /**
     * This enum defines the type of data stored in a column.
     * (Required)
     * 
     */
    @JsonProperty("dataType")
    public void setDataType(ColumnDataType dataType) {
        this.dataType = dataType;
    }

    public Column withDataType(ColumnDataType dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * This enum defines the type of data stored in a column.
     * 
     */
    @JsonProperty("arrayDataType")
    public ColumnDataType getArrayDataType() {
        return arrayDataType;
    }

    /**
     * This enum defines the type of data stored in a column.
     * 
     */
    @JsonProperty("arrayDataType")
    public void setArrayDataType(ColumnDataType arrayDataType) {
        this.arrayDataType = arrayDataType;
    }

    public Column withArrayDataType(ColumnDataType arrayDataType) {
        this.arrayDataType = arrayDataType;
        return this;
    }

    /**
     * Length of `char`, `varchar`, `binary`, `varbinary` `dataTypes`, else null. For example, `varchar(20)` has dataType as `varchar` and dataLength as `20`.
     * 
     */
    @JsonProperty("dataLength")
    public Integer getDataLength() {
        return dataLength;
    }

    /**
     * Length of `char`, `varchar`, `binary`, `varbinary` `dataTypes`, else null. For example, `varchar(20)` has dataType as `varchar` and dataLength as `20`.
     * 
     */
    @JsonProperty("dataLength")
    public void setDataLength(Integer dataLength) {
        this.dataLength = dataLength;
    }

    public Column withDataLength(Integer dataLength) {
        this.dataLength = dataLength;
        return this;
    }

    /**
     * The precision of a numeric is the total count of significant digits in the whole number, that is, the number of digits to both sides of the decimal point. Precision is applicable Integer types, such as `INT`, `SMALLINT`, `BIGINT`, etc. It also applies to other Numeric types, such as `NUMBER`, `DECIMAL`, `DOUBLE`, `FLOAT`, etc.
     * 
     */
    @JsonProperty("precision")
    public Integer getPrecision() {
        return precision;
    }

    /**
     * The precision of a numeric is the total count of significant digits in the whole number, that is, the number of digits to both sides of the decimal point. Precision is applicable Integer types, such as `INT`, `SMALLINT`, `BIGINT`, etc. It also applies to other Numeric types, such as `NUMBER`, `DECIMAL`, `DOUBLE`, `FLOAT`, etc.
     * 
     */
    @JsonProperty("precision")
    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Column withPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * The scale of a numeric is the count of decimal digits in the fractional part, to the right of the decimal point. For Integer types, the scale is `0`. It mainly applies to non Integer Numeric types, such as `NUMBER`, `DECIMAL`, `DOUBLE`, `FLOAT`, etc.
     * 
     */
    @JsonProperty("scale")
    public Integer getScale() {
        return scale;
    }

    /**
     * The scale of a numeric is the count of decimal digits in the fractional part, to the right of the decimal point. For Integer types, the scale is `0`. It mainly applies to non Integer Numeric types, such as `NUMBER`, `DECIMAL`, `DOUBLE`, `FLOAT`, etc.
     * 
     */
    @JsonProperty("scale")
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Column withScale(Integer scale) {
        this.scale = scale;
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

    public Column withDataTypeDisplay(String dataTypeDisplay) {
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

    public Column withDescription(String description) {
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

    public Column withFullyQualifiedName(String fullyQualifiedName) {
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

    public Column withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * This enum defines the type for column constraint.
     * 
     */
    @JsonProperty("constraint")
    public ColumnConstraint getConstraint() {
        return constraint;
    }

    /**
     * This enum defines the type for column constraint.
     * 
     */
    @JsonProperty("constraint")
    public void setConstraint(ColumnConstraint constraint) {
        this.constraint = constraint;
    }

    public Column withConstraint(ColumnConstraint constraint) {
        this.constraint = constraint;
        return this;
    }

    /**
     * Ordinal position of the column.
     * 
     */
    @JsonProperty("ordinalPosition")
    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    /**
     * Ordinal position of the column.
     * 
     */
    @JsonProperty("ordinalPosition")
    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public Column withOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
        return this;
    }

    /**
     * Json schema only if the dataType is JSON else null.
     * 
     */
    @JsonProperty("jsonSchema")
    public String getJsonSchema() {
        return jsonSchema;
    }

    /**
     * Json schema only if the dataType is JSON else null.
     * 
     */
    @JsonProperty("jsonSchema")
    public void setJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    public Column withJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
        return this;
    }

    /**
     * Child columns if dataType or arrayDataType is `map`, `struct`, or `union` else `null`.
     * 
     */
    @JsonProperty("children")
    public List<Column> getChildren() {
        return children;
    }

    /**
     * Child columns if dataType or arrayDataType is `map`, `struct`, or `union` else `null`.
     * 
     */
    @JsonProperty("children")
    public void setChildren(List<Column> children) {
        this.children = children;
    }

    public Column withChildren(List<Column> children) {
        this.children = children;
        return this;
    }

    /**
     * List of Custom Metrics registered for a column.
     * 
     */
    @JsonProperty("customMetrics")
    public List<CustomMetric> getCustomMetrics() {
        return customMetrics;
    }

    /**
     * List of Custom Metrics registered for a column.
     * 
     */
    @JsonProperty("customMetrics")
    public void setCustomMetrics(List<CustomMetric> customMetrics) {
        this.customMetrics = customMetrics;
    }

    public Column withCustomMetrics(List<CustomMetric> customMetrics) {
        this.customMetrics = customMetrics;
        return this;
    }

    /**
     * This schema defines the type to capture the table's column profile.
     * 
     */
    @JsonProperty("profile")
    public ColumnProfile getProfile() {
        return profile;
    }

    /**
     * This schema defines the type to capture the table's column profile.
     * 
     */
    @JsonProperty("profile")
    public void setProfile(ColumnProfile profile) {
        this.profile = profile;
    }

    public Column withProfile(ColumnProfile profile) {
        this.profile = profile;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Column.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("arrayDataType");
        sb.append('=');
        sb.append(((this.arrayDataType == null)?"<null>":this.arrayDataType));
        sb.append(',');
        sb.append("dataLength");
        sb.append('=');
        sb.append(((this.dataLength == null)?"<null>":this.dataLength));
        sb.append(',');
        sb.append("precision");
        sb.append('=');
        sb.append(((this.precision == null)?"<null>":this.precision));
        sb.append(',');
        sb.append("scale");
        sb.append('=');
        sb.append(((this.scale == null)?"<null>":this.scale));
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
        sb.append("constraint");
        sb.append('=');
        sb.append(((this.constraint == null)?"<null>":this.constraint));
        sb.append(',');
        sb.append("ordinalPosition");
        sb.append('=');
        sb.append(((this.ordinalPosition == null)?"<null>":this.ordinalPosition));
        sb.append(',');
        sb.append("jsonSchema");
        sb.append('=');
        sb.append(((this.jsonSchema == null)?"<null>":this.jsonSchema));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null)?"<null>":this.children));
        sb.append(',');
        sb.append("customMetrics");
        sb.append('=');
        sb.append(((this.customMetrics == null)?"<null>":this.customMetrics));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
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
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.dataLength == null)? 0 :this.dataLength.hashCode()));
        result = ((result* 31)+((this.dataType == null)? 0 :this.dataType.hashCode()));
        result = ((result* 31)+((this.precision == null)? 0 :this.precision.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this.scale == null)? 0 :this.scale.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.ordinalPosition == null)? 0 :this.ordinalPosition.hashCode()));
        result = ((result* 31)+((this.dataTypeDisplay == null)? 0 :this.dataTypeDisplay.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.customMetrics == null)? 0 :this.customMetrics.hashCode()));
        result = ((result* 31)+((this.jsonSchema == null)? 0 :this.jsonSchema.hashCode()));
        result = ((result* 31)+((this.children == null)? 0 :this.children.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.constraint == null)? 0 :this.constraint.hashCode()));
        result = ((result* 31)+((this.arrayDataType == null)? 0 :this.arrayDataType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Column) == false) {
            return false;
        }
        Column rhs = ((Column) other);
        return ((((((((((((((((((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName)))&&((this.dataLength == rhs.dataLength)||((this.dataLength!= null)&&this.dataLength.equals(rhs.dataLength))))&&((this.dataType == rhs.dataType)||((this.dataType!= null)&&this.dataType.equals(rhs.dataType))))&&((this.precision == rhs.precision)||((this.precision!= null)&&this.precision.equals(rhs.precision))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this.scale == rhs.scale)||((this.scale!= null)&&this.scale.equals(rhs.scale))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.ordinalPosition == rhs.ordinalPosition)||((this.ordinalPosition!= null)&&this.ordinalPosition.equals(rhs.ordinalPosition))))&&((this.dataTypeDisplay == rhs.dataTypeDisplay)||((this.dataTypeDisplay!= null)&&this.dataTypeDisplay.equals(rhs.dataTypeDisplay))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.customMetrics == rhs.customMetrics)||((this.customMetrics!= null)&&this.customMetrics.equals(rhs.customMetrics))))&&((this.jsonSchema == rhs.jsonSchema)||((this.jsonSchema!= null)&&this.jsonSchema.equals(rhs.jsonSchema))))&&((this.children == rhs.children)||((this.children!= null)&&this.children.equals(rhs.children))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.constraint == rhs.constraint)||((this.constraint!= null)&&this.constraint.equals(rhs.constraint))))&&((this.arrayDataType == rhs.arrayDataType)||((this.arrayDataType!= null)&&this.arrayDataType.equals(rhs.arrayDataType))));
    }

}
