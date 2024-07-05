
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This captures information about how the table is modeled. Currently only DBT model is supported.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "modelType",
    "resourceType",
    "description",
    "path",
    "rawSql",
    "sql",
    "upstream",
    "owner",
    "tags",
    "columns",
    "generatedAt"
})
@Generated("jsonschema2pojo")
public class DataModel {

    /**
     * Currently only DBT model type is supported
     * (Required)
     * 
     */
    @JsonProperty("modelType")
    @NotNull
    private DataModel.ModelType modelType;
    /**
     * Resource Type of the model.
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("Resource Type of the model.")
    private String resourceType;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Path to sql definition file.
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("Path to sql definition file.")
    private String path;
    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("rawSql")
    @JsonPropertyDescription("SQL query statement. Example - 'select * from orders'.")
    private String rawSql;
    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("sql")
    @JsonPropertyDescription("SQL query statement. Example - 'select * from orders'.")
    @NotNull
    private String sql;
    /**
     * Fully qualified name of Models/tables used for in `sql` for creating this table.
     * 
     */
    @JsonProperty("upstream")
    @JsonPropertyDescription("Fully qualified name of Models/tables used for in `sql` for creating this table.")
    @Valid
    private List<String> upstream = new ArrayList<String>();
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference owner;
    /**
     * Tags for this data model.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this data model.")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * Columns from the schema defined during modeling. In case of DBT, the metadata here comes from `schema.yaml`.
     * 
     */
    @JsonProperty("columns")
    @JsonPropertyDescription("Columns from the schema defined during modeling. In case of DBT, the metadata here comes from `schema.yaml`.")
    @Valid
    private List<Column> columns = null;
    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("generatedAt")
    @JsonPropertyDescription("Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.")
    private Date generatedAt;

    /**
     * Currently only DBT model type is supported
     * (Required)
     * 
     */
    @JsonProperty("modelType")
    public DataModel.ModelType getModelType() {
        return modelType;
    }

    /**
     * Currently only DBT model type is supported
     * (Required)
     * 
     */
    @JsonProperty("modelType")
    public void setModelType(DataModel.ModelType modelType) {
        this.modelType = modelType;
    }

    public DataModel withModelType(DataModel.ModelType modelType) {
        this.modelType = modelType;
        return this;
    }

    /**
     * Resource Type of the model.
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Resource Type of the model.
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public DataModel withResourceType(String resourceType) {
        this.resourceType = resourceType;
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

    public DataModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Path to sql definition file.
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Path to sql definition file.
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    public DataModel withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("rawSql")
    public String getRawSql() {
        return rawSql;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("rawSql")
    public void setRawSql(String rawSql) {
        this.rawSql = rawSql;
    }

    public DataModel withRawSql(String rawSql) {
        this.rawSql = rawSql;
        return this;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("sql")
    public String getSql() {
        return sql;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("sql")
    public void setSql(String sql) {
        this.sql = sql;
    }

    public DataModel withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * Fully qualified name of Models/tables used for in `sql` for creating this table.
     * 
     */
    @JsonProperty("upstream")
    public List<String> getUpstream() {
        return upstream;
    }

    /**
     * Fully qualified name of Models/tables used for in `sql` for creating this table.
     * 
     */
    @JsonProperty("upstream")
    public void setUpstream(List<String> upstream) {
        this.upstream = upstream;
    }

    public DataModel withUpstream(List<String> upstream) {
        this.upstream = upstream;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    public EntityReference getOwner() {
        return owner;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    public void setOwner(EntityReference owner) {
        this.owner = owner;
    }

    public DataModel withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Tags for this data model.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this data model.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public DataModel withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Columns from the schema defined during modeling. In case of DBT, the metadata here comes from `schema.yaml`.
     * 
     */
    @JsonProperty("columns")
    public List<Column> getColumns() {
        return columns;
    }

    /**
     * Columns from the schema defined during modeling. In case of DBT, the metadata here comes from `schema.yaml`.
     * 
     */
    @JsonProperty("columns")
    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public DataModel withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("generatedAt")
    public Date getGeneratedAt() {
        return generatedAt;
    }

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("generatedAt")
    public void setGeneratedAt(Date generatedAt) {
        this.generatedAt = generatedAt;
    }

    public DataModel withGeneratedAt(Date generatedAt) {
        this.generatedAt = generatedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("modelType");
        sb.append('=');
        sb.append(((this.modelType == null)?"<null>":this.modelType));
        sb.append(',');
        sb.append("resourceType");
        sb.append('=');
        sb.append(((this.resourceType == null)?"<null>":this.resourceType));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("rawSql");
        sb.append('=');
        sb.append(((this.rawSql == null)?"<null>":this.rawSql));
        sb.append(',');
        sb.append("sql");
        sb.append('=');
        sb.append(((this.sql == null)?"<null>":this.sql));
        sb.append(',');
        sb.append("upstream");
        sb.append('=');
        sb.append(((this.upstream == null)?"<null>":this.upstream));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null)?"<null>":this.columns));
        sb.append(',');
        sb.append("generatedAt");
        sb.append('=');
        sb.append(((this.generatedAt == null)?"<null>":this.generatedAt));
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
        result = ((result* 31)+((this.rawSql == null)? 0 :this.rawSql.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.upstream == null)? 0 :this.upstream.hashCode()));
        result = ((result* 31)+((this.columns == null)? 0 :this.columns.hashCode()));
        result = ((result* 31)+((this.generatedAt == null)? 0 :this.generatedAt.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.modelType == null)? 0 :this.modelType.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.sql == null)? 0 :this.sql.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataModel) == false) {
            return false;
        }
        DataModel rhs = ((DataModel) other);
        return ((((((((((((this.rawSql == rhs.rawSql)||((this.rawSql!= null)&&this.rawSql.equals(rhs.rawSql)))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.upstream == rhs.upstream)||((this.upstream!= null)&&this.upstream.equals(rhs.upstream))))&&((this.columns == rhs.columns)||((this.columns!= null)&&this.columns.equals(rhs.columns))))&&((this.generatedAt == rhs.generatedAt)||((this.generatedAt!= null)&&this.generatedAt.equals(rhs.generatedAt))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.modelType == rhs.modelType)||((this.modelType!= null)&&this.modelType.equals(rhs.modelType))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.sql == rhs.sql)||((this.sql!= null)&&this.sql.equals(rhs.sql))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }


    /**
     * Currently only DBT model type is supported
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ModelType {

        DBT("DBT");
        private final String value;
        private final static Map<String, DataModel.ModelType> CONSTANTS = new HashMap<String, DataModel.ModelType>();

        static {
            for (DataModel.ModelType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static DataModel.ModelType fromValue(String value) {
            DataModel.ModelType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
