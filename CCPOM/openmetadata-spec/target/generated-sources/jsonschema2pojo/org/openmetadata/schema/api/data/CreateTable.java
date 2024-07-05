
package org.openmetadata.schema.api.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.type.Column;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.LifeCycle;
import org.openmetadata.schema.type.TableConstraint;
import org.openmetadata.schema.type.TablePartition;
import org.openmetadata.schema.type.TableProfilerConfig;
import org.openmetadata.schema.type.TableType;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateTableRequest
 * <p>
 * Schema corresponding to a table that belongs to a database
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "tableType",
    "columns",
    "tableConstraints",
    "tablePartition",
    "tableProfilerConfig",
    "owner",
    "databaseSchema",
    "tags",
    "viewDefinition",
    "retentionPeriod",
    "extension",
    "sourceUrl",
    "domain",
    "dataProducts",
    "fileFormat",
    "lifeCycle",
    "sourceHash"
})
@Generated("jsonschema2pojo")
public class CreateTable implements CreateEntity
{

    /**
     * Name of a table. Expected to be unique within a database.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of a table. Expected to be unique within a database.")
    @Pattern(regexp = "^((?!::).)*$")
    @Size(min = 1, max = 256)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this table.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this table.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * This schema defines the type used for describing different types of tables.
     * 
     */
    @JsonProperty("tableType")
    @JsonPropertyDescription("This schema defines the type used for describing different types of tables.")
    private TableType tableType;
    /**
     * Name of the tables in the database
     * (Required)
     * 
     */
    @JsonProperty("columns")
    @JsonPropertyDescription("Name of the tables in the database")
    @Valid
    @NotNull
    private List<Column> columns = null;
    @JsonProperty("tableConstraints")
    @Valid
    private List<TableConstraint> tableConstraints = null;
    /**
     * This schema defines the partition column of a table and format the partition is created.
     * 
     */
    @JsonProperty("tablePartition")
    @JsonPropertyDescription("This schema defines the partition column of a table and format the partition is created.")
    @Valid
    private TablePartition tablePartition;
    /**
     * This schema defines the type for Table profile config.
     * 
     */
    @JsonProperty("tableProfilerConfig")
    @JsonPropertyDescription("This schema defines the type for Table profile config.")
    @Valid
    private TableProfilerConfig tableProfilerConfig;
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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("databaseSchema")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String databaseSchema;
    /**
     * Tags for this table
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this table")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("viewDefinition")
    @JsonPropertyDescription("SQL query statement. Example - 'select * from orders'.")
    private String viewDefinition;
    /**
     * Duration in ISO 8601 format in UTC. Example - 'P23DT23H'.@om-field-type
     * 
     */
    @JsonProperty("retentionPeriod")
    @JsonPropertyDescription("Duration in ISO 8601 format in UTC. Example - 'P23DT23H'.")
    private String retentionPeriod;
    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("Entity extension data with custom attributes added to the entity.")
    private Object extension;
    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    @JsonPropertyDescription("Source Url of the respective entity.")
    private String sourceUrl;
    /**
     * Fully qualified name of the domain the Table belongs to.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("Fully qualified name of the domain the Table belongs to.")
    private String domain;
    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    @JsonPropertyDescription("List of fully qualified names of data products this entity is part of.")
    @Valid
    private List<String> dataProducts = new ArrayList<String>();
    /**
     * File format in case of file/datalake tables.
     * 
     */
    @JsonProperty("fileFormat")
    @JsonPropertyDescription("File format in case of file/datalake tables.")
    private CreateTable.FileFormat fileFormat;
    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    @JsonPropertyDescription("This schema defines Life Cycle Properties.")
    @Valid
    private LifeCycle lifeCycle;
    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    @JsonPropertyDescription("Source hash of the entity")
    @Size(min = 1, max = 32)
    private String sourceHash;

    /**
     * Name of a table. Expected to be unique within a database.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of a table. Expected to be unique within a database.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreateTable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this table.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this table.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateTable withDisplayName(String displayName) {
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

    public CreateTable withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * This schema defines the type used for describing different types of tables.
     * 
     */
    @JsonProperty("tableType")
    public TableType getTableType() {
        return tableType;
    }

    /**
     * This schema defines the type used for describing different types of tables.
     * 
     */
    @JsonProperty("tableType")
    public void setTableType(TableType tableType) {
        this.tableType = tableType;
    }

    public CreateTable withTableType(TableType tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * Name of the tables in the database
     * (Required)
     * 
     */
    @JsonProperty("columns")
    public List<Column> getColumns() {
        return columns;
    }

    /**
     * Name of the tables in the database
     * (Required)
     * 
     */
    @JsonProperty("columns")
    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public CreateTable withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    @JsonProperty("tableConstraints")
    public List<TableConstraint> getTableConstraints() {
        return tableConstraints;
    }

    @JsonProperty("tableConstraints")
    public void setTableConstraints(List<TableConstraint> tableConstraints) {
        this.tableConstraints = tableConstraints;
    }

    public CreateTable withTableConstraints(List<TableConstraint> tableConstraints) {
        this.tableConstraints = tableConstraints;
        return this;
    }

    /**
     * This schema defines the partition column of a table and format the partition is created.
     * 
     */
    @JsonProperty("tablePartition")
    public TablePartition getTablePartition() {
        return tablePartition;
    }

    /**
     * This schema defines the partition column of a table and format the partition is created.
     * 
     */
    @JsonProperty("tablePartition")
    public void setTablePartition(TablePartition tablePartition) {
        this.tablePartition = tablePartition;
    }

    public CreateTable withTablePartition(TablePartition tablePartition) {
        this.tablePartition = tablePartition;
        return this;
    }

    /**
     * This schema defines the type for Table profile config.
     * 
     */
    @JsonProperty("tableProfilerConfig")
    public TableProfilerConfig getTableProfilerConfig() {
        return tableProfilerConfig;
    }

    /**
     * This schema defines the type for Table profile config.
     * 
     */
    @JsonProperty("tableProfilerConfig")
    public void setTableProfilerConfig(TableProfilerConfig tableProfilerConfig) {
        this.tableProfilerConfig = tableProfilerConfig;
    }

    public CreateTable withTableProfilerConfig(TableProfilerConfig tableProfilerConfig) {
        this.tableProfilerConfig = tableProfilerConfig;
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

    public CreateTable withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("databaseSchema")
    public String getDatabaseSchema() {
        return databaseSchema;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("databaseSchema")
    public void setDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
    }

    public CreateTable withDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }

    /**
     * Tags for this table
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this table
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateTable withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("viewDefinition")
    public String getViewDefinition() {
        return viewDefinition;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("viewDefinition")
    public void setViewDefinition(String viewDefinition) {
        this.viewDefinition = viewDefinition;
    }

    public CreateTable withViewDefinition(String viewDefinition) {
        this.viewDefinition = viewDefinition;
        return this;
    }

    /**
     * Duration in ISO 8601 format in UTC. Example - 'P23DT23H'.@om-field-type
     * 
     */
    @JsonProperty("retentionPeriod")
    public String getRetentionPeriod() {
        return retentionPeriod;
    }

    /**
     * Duration in ISO 8601 format in UTC. Example - 'P23DT23H'.@om-field-type
     * 
     */
    @JsonProperty("retentionPeriod")
    public void setRetentionPeriod(String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    public CreateTable withRetentionPeriod(String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public Object getExtension() {
        return extension;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(Object extension) {
        this.extension = extension;
    }

    public CreateTable withExtension(Object extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public CreateTable withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * Fully qualified name of the domain the Table belongs to.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Fully qualified name of the domain the Table belongs to.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateTable withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    public List<String> getDataProducts() {
        return dataProducts;
    }

    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    public void setDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
    }

    public CreateTable withDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
        return this;
    }

    /**
     * File format in case of file/datalake tables.
     * 
     */
    @JsonProperty("fileFormat")
    public CreateTable.FileFormat getFileFormat() {
        return fileFormat;
    }

    /**
     * File format in case of file/datalake tables.
     * 
     */
    @JsonProperty("fileFormat")
    public void setFileFormat(CreateTable.FileFormat fileFormat) {
        this.fileFormat = fileFormat;
    }

    public CreateTable withFileFormat(CreateTable.FileFormat fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    public LifeCycle getLifeCycle() {
        return lifeCycle;
    }

    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    public void setLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public CreateTable withLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }

    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    public String getSourceHash() {
        return sourceHash;
    }

    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    public void setSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
    }

    public CreateTable withSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateTable.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("tableType");
        sb.append('=');
        sb.append(((this.tableType == null)?"<null>":this.tableType));
        sb.append(',');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null)?"<null>":this.columns));
        sb.append(',');
        sb.append("tableConstraints");
        sb.append('=');
        sb.append(((this.tableConstraints == null)?"<null>":this.tableConstraints));
        sb.append(',');
        sb.append("tablePartition");
        sb.append('=');
        sb.append(((this.tablePartition == null)?"<null>":this.tablePartition));
        sb.append(',');
        sb.append("tableProfilerConfig");
        sb.append('=');
        sb.append(((this.tableProfilerConfig == null)?"<null>":this.tableProfilerConfig));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("databaseSchema");
        sb.append('=');
        sb.append(((this.databaseSchema == null)?"<null>":this.databaseSchema));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("viewDefinition");
        sb.append('=');
        sb.append(((this.viewDefinition == null)?"<null>":this.viewDefinition));
        sb.append(',');
        sb.append("retentionPeriod");
        sb.append('=');
        sb.append(((this.retentionPeriod == null)?"<null>":this.retentionPeriod));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("sourceUrl");
        sb.append('=');
        sb.append(((this.sourceUrl == null)?"<null>":this.sourceUrl));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("dataProducts");
        sb.append('=');
        sb.append(((this.dataProducts == null)?"<null>":this.dataProducts));
        sb.append(',');
        sb.append("fileFormat");
        sb.append('=');
        sb.append(((this.fileFormat == null)?"<null>":this.fileFormat));
        sb.append(',');
        sb.append("lifeCycle");
        sb.append('=');
        sb.append(((this.lifeCycle == null)?"<null>":this.lifeCycle));
        sb.append(',');
        sb.append("sourceHash");
        sb.append('=');
        sb.append(((this.sourceHash == null)?"<null>":this.sourceHash));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.databaseSchema == null)? 0 :this.databaseSchema.hashCode()));
        result = ((result* 31)+((this.viewDefinition == null)? 0 :this.viewDefinition.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.columns == null)? 0 :this.columns.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.dataProducts == null)? 0 :this.dataProducts.hashCode()));
        result = ((result* 31)+((this.tableConstraints == null)? 0 :this.tableConstraints.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.sourceUrl == null)? 0 :this.sourceUrl.hashCode()));
        result = ((result* 31)+((this.tableType == null)? 0 :this.tableType.hashCode()));
        result = ((result* 31)+((this.sourceHash == null)? 0 :this.sourceHash.hashCode()));
        result = ((result* 31)+((this.tableProfilerConfig == null)? 0 :this.tableProfilerConfig.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.tablePartition == null)? 0 :this.tablePartition.hashCode()));
        result = ((result* 31)+((this.lifeCycle == null)? 0 :this.lifeCycle.hashCode()));
        result = ((result* 31)+((this.fileFormat == null)? 0 :this.fileFormat.hashCode()));
        result = ((result* 31)+((this.retentionPeriod == null)? 0 :this.retentionPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateTable) == false) {
            return false;
        }
        CreateTable rhs = ((CreateTable) other);
        return (((((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.databaseSchema == rhs.databaseSchema)||((this.databaseSchema!= null)&&this.databaseSchema.equals(rhs.databaseSchema))))&&((this.viewDefinition == rhs.viewDefinition)||((this.viewDefinition!= null)&&this.viewDefinition.equals(rhs.viewDefinition))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.columns == rhs.columns)||((this.columns!= null)&&this.columns.equals(rhs.columns))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.tableConstraints == rhs.tableConstraints)||((this.tableConstraints!= null)&&this.tableConstraints.equals(rhs.tableConstraints))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.sourceUrl == rhs.sourceUrl)||((this.sourceUrl!= null)&&this.sourceUrl.equals(rhs.sourceUrl))))&&((this.tableType == rhs.tableType)||((this.tableType!= null)&&this.tableType.equals(rhs.tableType))))&&((this.sourceHash == rhs.sourceHash)||((this.sourceHash!= null)&&this.sourceHash.equals(rhs.sourceHash))))&&((this.tableProfilerConfig == rhs.tableProfilerConfig)||((this.tableProfilerConfig!= null)&&this.tableProfilerConfig.equals(rhs.tableProfilerConfig))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.tablePartition == rhs.tablePartition)||((this.tablePartition!= null)&&this.tablePartition.equals(rhs.tablePartition))))&&((this.lifeCycle == rhs.lifeCycle)||((this.lifeCycle!= null)&&this.lifeCycle.equals(rhs.lifeCycle))))&&((this.fileFormat == rhs.fileFormat)||((this.fileFormat!= null)&&this.fileFormat.equals(rhs.fileFormat))))&&((this.retentionPeriod == rhs.retentionPeriod)||((this.retentionPeriod!= null)&&this.retentionPeriod.equals(rhs.retentionPeriod))));
    }


    /**
     * File format in case of file/datalake tables.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum FileFormat {

        CSV("csv"),
        TSV("tsv"),
        AVRO("avro"),
        PARQUET("parquet"),
        JSON("json"),
        JSON_GZ("json.gz"),
        JSON_ZIP("json.zip");
        private final String value;
        private final static Map<String, CreateTable.FileFormat> CONSTANTS = new HashMap<String, CreateTable.FileFormat>();

        static {
            for (CreateTable.FileFormat c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        FileFormat(String value) {
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
        public static CreateTable.FileFormat fromValue(String value) {
            CreateTable.FileFormat constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
