
package org.openmetadata.schema.entity.data;

import java.net.URI;
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
import org.openmetadata.schema.ColumnsEntityInterface;
import org.openmetadata.schema.EntityInterface;
import org.openmetadata.schema.tests.TestSuite;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.Column;
import org.openmetadata.schema.type.DataModel;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.LifeCycle;
import org.openmetadata.schema.type.TableConstraint;
import org.openmetadata.schema.type.TableData;
import org.openmetadata.schema.type.TableJoins;
import org.openmetadata.schema.type.TablePartition;
import org.openmetadata.schema.type.TableProfile;
import org.openmetadata.schema.type.TableProfilerConfig;
import org.openmetadata.schema.type.TableType;
import org.openmetadata.schema.type.TagLabel;
import org.openmetadata.schema.type.UsageDetails;
import org.openmetadata.schema.type.Votes;


/**
 * Table
 * <p>
 * A `Table` entity organizes data in rows and columns and is defined in a `Database Schema`.@om-entity-type
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "displayName",
    "fullyQualifiedName",
    "description",
    "version",
    "updatedAt",
    "updatedBy",
    "href",
    "tableType",
    "columns",
    "tableConstraints",
    "tablePartition",
    "owner",
    "databaseSchema",
    "database",
    "service",
    "serviceType",
    "location",
    "viewDefinition",
    "tags",
    "usageSummary",
    "followers",
    "joins",
    "sampleData",
    "tableProfilerConfig",
    "profile",
    "testSuite",
    "dataModel",
    "changeDescription",
    "deleted",
    "retentionPeriod",
    "extension",
    "sourceUrl",
    "domain",
    "dataProducts",
    "fileFormat",
    "votes",
    "lifeCycle",
    "sourceHash"
})
@Generated("jsonschema2pojo")
public class Table implements ColumnsEntityInterface, EntityInterface
{

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
     * Display Name that identifies this table. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this table. It could be title or label from the source services.")
    private String displayName;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
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
     * This schema defines the type used for describing different types of tables.
     * 
     */
    @JsonProperty("tableType")
    @JsonPropertyDescription("This schema defines the type used for describing different types of tables.")
    private TableType tableType;
    /**
     * Columns in this table.
     * (Required)
     * 
     */
    @JsonProperty("columns")
    @JsonPropertyDescription("Columns in this table.")
    @Valid
    @NotNull
    private List<Column> columns = null;
    /**
     * Table constraints.
     * 
     */
    @JsonProperty("tableConstraints")
    @JsonPropertyDescription("Table constraints.")
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
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("databaseSchema")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference databaseSchema;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("database")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference database;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("service")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference service;
    /**
     * Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...")
    private org.openmetadata.schema.api.services.CreateDatabaseService.DatabaseServiceType serviceType;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference location;
    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("viewDefinition")
    @JsonPropertyDescription("SQL query statement. Example - 'select * from orders'.")
    private String viewDefinition;
    /**
     * Tags for this table.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this table.")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * UsageDetails
     * <p>
     * This schema defines the type for usage details. Daily, weekly, and monthly aggregation of usage is computed along with the percentile rank based on the usage for a given day.
     * 
     */
    @JsonProperty("usageSummary")
    @JsonPropertyDescription("This schema defines the type for usage details. Daily, weekly, and monthly aggregation of usage is computed along with the percentile rank based on the usage for a given day.")
    @Valid
    private UsageDetails usageSummary;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("followers")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> followers = null;
    /**
     * This schema defines the type to capture information about how this table is joined with other tables and columns.
     * 
     */
    @JsonProperty("joins")
    @JsonPropertyDescription("This schema defines the type to capture information about how this table is joined with other tables and columns.")
    @Valid
    private TableJoins joins;
    /**
     * This schema defines the type to capture rows of sample data for a table.
     * 
     */
    @JsonProperty("sampleData")
    @JsonPropertyDescription("This schema defines the type to capture rows of sample data for a table.")
    @Valid
    private TableData sampleData;
    /**
     * This schema defines the type for Table profile config.
     * 
     */
    @JsonProperty("tableProfilerConfig")
    @JsonPropertyDescription("This schema defines the type for Table profile config.")
    @Valid
    private TableProfilerConfig tableProfilerConfig;
    /**
     * This schema defines the type to capture the table's data profile.
     * 
     */
    @JsonProperty("profile")
    @JsonPropertyDescription("This schema defines the type to capture the table's data profile.")
    @Valid
    private TableProfile profile;
    /**
     * TestSuite
     * <p>
     * TestSuite is a set of test cases grouped together to capture data quality tests against data entities.
     * 
     */
    @JsonProperty("testSuite")
    @JsonPropertyDescription("TestSuite is a set of test cases grouped together to capture data quality tests against data entities.")
    @Valid
    private TestSuite testSuite;
    /**
     * This captures information about how the table is modeled. Currently only DBT model is supported.
     * 
     */
    @JsonProperty("dataModel")
    @JsonPropertyDescription("This captures information about how the table is modeled. Currently only DBT model is supported.")
    @Valid
    private DataModel dataModel;
    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    @JsonPropertyDescription("Description of the change.")
    @Valid
    private ChangeDescription changeDescription;
    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    @JsonPropertyDescription("When `true` indicates the entity has been soft deleted.")
    private Boolean deleted = false;
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
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference domain;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("dataProducts")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> dataProducts = null;
    /**
     * File format in case of file/datalake tables.
     * 
     */
    @JsonProperty("fileFormat")
    @JsonPropertyDescription("File format in case of file/datalake tables.")
    private org.openmetadata.schema.api.data.CreateTable.FileFormat fileFormat;
    /**
     * Votes
     * <p>
     * This schema defines the Votes for a Data Asset.
     * 
     */
    @JsonProperty("votes")
    @JsonPropertyDescription("This schema defines the Votes for a Data Asset.")
    @Valid
    private Votes votes;
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

    public Table withId(UUID id) {
        this.id = id;
        return this;
    }

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

    public Table withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this table. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this table. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Table withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public Table withFullyQualifiedName(String fullyQualifiedName) {
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

    public Table withDescription(String description) {
        this.description = description;
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

    public Table withVersion(Double version) {
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

    public Table withUpdatedAt(Long updatedAt) {
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

    public Table withUpdatedBy(String updatedBy) {
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

    public Table withHref(URI href) {
        this.href = href;
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

    public Table withTableType(TableType tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * Columns in this table.
     * (Required)
     * 
     */
    @JsonProperty("columns")
    public List<Column> getColumns() {
        return columns;
    }

    /**
     * Columns in this table.
     * (Required)
     * 
     */
    @JsonProperty("columns")
    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public Table withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Table constraints.
     * 
     */
    @JsonProperty("tableConstraints")
    public List<TableConstraint> getTableConstraints() {
        return tableConstraints;
    }

    /**
     * Table constraints.
     * 
     */
    @JsonProperty("tableConstraints")
    public void setTableConstraints(List<TableConstraint> tableConstraints) {
        this.tableConstraints = tableConstraints;
    }

    public Table withTableConstraints(List<TableConstraint> tableConstraints) {
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

    public Table withTablePartition(TablePartition tablePartition) {
        this.tablePartition = tablePartition;
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

    public Table withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("databaseSchema")
    public EntityReference getDatabaseSchema() {
        return databaseSchema;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("databaseSchema")
    public void setDatabaseSchema(EntityReference databaseSchema) {
        this.databaseSchema = databaseSchema;
    }

    public Table withDatabaseSchema(EntityReference databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("database")
    public EntityReference getDatabase() {
        return database;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("database")
    public void setDatabase(EntityReference database) {
        this.database = database;
    }

    public Table withDatabase(EntityReference database) {
        this.database = database;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("service")
    public EntityReference getService() {
        return service;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("service")
    public void setService(EntityReference service) {
        this.service = service;
    }

    public Table withService(EntityReference service) {
        this.service = service;
        return this;
    }

    /**
     * Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...
     * 
     */
    @JsonProperty("serviceType")
    public org.openmetadata.schema.api.services.CreateDatabaseService.DatabaseServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...
     * 
     */
    @JsonProperty("serviceType")
    public void setServiceType(org.openmetadata.schema.api.services.CreateDatabaseService.DatabaseServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Table withServiceType(org.openmetadata.schema.api.services.CreateDatabaseService.DatabaseServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("location")
    public EntityReference getLocation() {
        return location;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("location")
    public void setLocation(EntityReference location) {
        this.location = location;
    }

    public Table withLocation(EntityReference location) {
        this.location = location;
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

    public Table withViewDefinition(String viewDefinition) {
        this.viewDefinition = viewDefinition;
        return this;
    }

    /**
     * Tags for this table.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this table.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public Table withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * UsageDetails
     * <p>
     * This schema defines the type for usage details. Daily, weekly, and monthly aggregation of usage is computed along with the percentile rank based on the usage for a given day.
     * 
     */
    @JsonProperty("usageSummary")
    public UsageDetails getUsageSummary() {
        return usageSummary;
    }

    /**
     * UsageDetails
     * <p>
     * This schema defines the type for usage details. Daily, weekly, and monthly aggregation of usage is computed along with the percentile rank based on the usage for a given day.
     * 
     */
    @JsonProperty("usageSummary")
    public void setUsageSummary(UsageDetails usageSummary) {
        this.usageSummary = usageSummary;
    }

    public Table withUsageSummary(UsageDetails usageSummary) {
        this.usageSummary = usageSummary;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("followers")
    public List<EntityReference> getFollowers() {
        return followers;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("followers")
    public void setFollowers(List<EntityReference> followers) {
        this.followers = followers;
    }

    public Table withFollowers(List<EntityReference> followers) {
        this.followers = followers;
        return this;
    }

    /**
     * This schema defines the type to capture information about how this table is joined with other tables and columns.
     * 
     */
    @JsonProperty("joins")
    public TableJoins getJoins() {
        return joins;
    }

    /**
     * This schema defines the type to capture information about how this table is joined with other tables and columns.
     * 
     */
    @JsonProperty("joins")
    public void setJoins(TableJoins joins) {
        this.joins = joins;
    }

    public Table withJoins(TableJoins joins) {
        this.joins = joins;
        return this;
    }

    /**
     * This schema defines the type to capture rows of sample data for a table.
     * 
     */
    @JsonProperty("sampleData")
    public TableData getSampleData() {
        return sampleData;
    }

    /**
     * This schema defines the type to capture rows of sample data for a table.
     * 
     */
    @JsonProperty("sampleData")
    public void setSampleData(TableData sampleData) {
        this.sampleData = sampleData;
    }

    public Table withSampleData(TableData sampleData) {
        this.sampleData = sampleData;
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

    public Table withTableProfilerConfig(TableProfilerConfig tableProfilerConfig) {
        this.tableProfilerConfig = tableProfilerConfig;
        return this;
    }

    /**
     * This schema defines the type to capture the table's data profile.
     * 
     */
    @JsonProperty("profile")
    public TableProfile getProfile() {
        return profile;
    }

    /**
     * This schema defines the type to capture the table's data profile.
     * 
     */
    @JsonProperty("profile")
    public void setProfile(TableProfile profile) {
        this.profile = profile;
    }

    public Table withProfile(TableProfile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * TestSuite
     * <p>
     * TestSuite is a set of test cases grouped together to capture data quality tests against data entities.
     * 
     */
    @JsonProperty("testSuite")
    public TestSuite getTestSuite() {
        return testSuite;
    }

    /**
     * TestSuite
     * <p>
     * TestSuite is a set of test cases grouped together to capture data quality tests against data entities.
     * 
     */
    @JsonProperty("testSuite")
    public void setTestSuite(TestSuite testSuite) {
        this.testSuite = testSuite;
    }

    public Table withTestSuite(TestSuite testSuite) {
        this.testSuite = testSuite;
        return this;
    }

    /**
     * This captures information about how the table is modeled. Currently only DBT model is supported.
     * 
     */
    @JsonProperty("dataModel")
    public DataModel getDataModel() {
        return dataModel;
    }

    /**
     * This captures information about how the table is modeled. Currently only DBT model is supported.
     * 
     */
    @JsonProperty("dataModel")
    public void setDataModel(DataModel dataModel) {
        this.dataModel = dataModel;
    }

    public Table withDataModel(DataModel dataModel) {
        this.dataModel = dataModel;
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

    public Table withChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
        return this;
    }

    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Table withDeleted(Boolean deleted) {
        this.deleted = deleted;
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

    public Table withRetentionPeriod(String retentionPeriod) {
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

    public Table withExtension(Object extension) {
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

    public Table withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    public EntityReference getDomain() {
        return domain;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(EntityReference domain) {
        this.domain = domain;
    }

    public Table withDomain(EntityReference domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("dataProducts")
    public List<EntityReference> getDataProducts() {
        return dataProducts;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("dataProducts")
    public void setDataProducts(List<EntityReference> dataProducts) {
        this.dataProducts = dataProducts;
    }

    public Table withDataProducts(List<EntityReference> dataProducts) {
        this.dataProducts = dataProducts;
        return this;
    }

    /**
     * File format in case of file/datalake tables.
     * 
     */
    @JsonProperty("fileFormat")
    public org.openmetadata.schema.api.data.CreateTable.FileFormat getFileFormat() {
        return fileFormat;
    }

    /**
     * File format in case of file/datalake tables.
     * 
     */
    @JsonProperty("fileFormat")
    public void setFileFormat(org.openmetadata.schema.api.data.CreateTable.FileFormat fileFormat) {
        this.fileFormat = fileFormat;
    }

    public Table withFileFormat(org.openmetadata.schema.api.data.CreateTable.FileFormat fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    /**
     * Votes
     * <p>
     * This schema defines the Votes for a Data Asset.
     * 
     */
    @JsonProperty("votes")
    public Votes getVotes() {
        return votes;
    }

    /**
     * Votes
     * <p>
     * This schema defines the Votes for a Data Asset.
     * 
     */
    @JsonProperty("votes")
    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    public Table withVotes(Votes votes) {
        this.votes = votes;
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

    public Table withLifeCycle(LifeCycle lifeCycle) {
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

    public Table withSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Table.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("databaseSchema");
        sb.append('=');
        sb.append(((this.databaseSchema == null)?"<null>":this.databaseSchema));
        sb.append(',');
        sb.append("database");
        sb.append('=');
        sb.append(((this.database == null)?"<null>":this.database));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("viewDefinition");
        sb.append('=');
        sb.append(((this.viewDefinition == null)?"<null>":this.viewDefinition));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("usageSummary");
        sb.append('=');
        sb.append(((this.usageSummary == null)?"<null>":this.usageSummary));
        sb.append(',');
        sb.append("followers");
        sb.append('=');
        sb.append(((this.followers == null)?"<null>":this.followers));
        sb.append(',');
        sb.append("joins");
        sb.append('=');
        sb.append(((this.joins == null)?"<null>":this.joins));
        sb.append(',');
        sb.append("sampleData");
        sb.append('=');
        sb.append(((this.sampleData == null)?"<null>":this.sampleData));
        sb.append(',');
        sb.append("tableProfilerConfig");
        sb.append('=');
        sb.append(((this.tableProfilerConfig == null)?"<null>":this.tableProfilerConfig));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("testSuite");
        sb.append('=');
        sb.append(((this.testSuite == null)?"<null>":this.testSuite));
        sb.append(',');
        sb.append("dataModel");
        sb.append('=');
        sb.append(((this.dataModel == null)?"<null>":this.dataModel));
        sb.append(',');
        sb.append("changeDescription");
        sb.append('=');
        sb.append(((this.changeDescription == null)?"<null>":this.changeDescription));
        sb.append(',');
        sb.append("deleted");
        sb.append('=');
        sb.append(((this.deleted == null)?"<null>":this.deleted));
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
        sb.append("votes");
        sb.append('=');
        sb.append(((this.votes == null)?"<null>":this.votes));
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
        result = ((result* 31)+((this.databaseSchema == null)? 0 :this.databaseSchema.hashCode()));
        result = ((result* 31)+((this.serviceType == null)? 0 :this.serviceType.hashCode()));
        result = ((result* 31)+((this.joins == null)? 0 :this.joins.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.columns == null)? 0 :this.columns.hashCode()));
        result = ((result* 31)+((this.testSuite == null)? 0 :this.testSuite.hashCode()));
        result = ((result* 31)+((this.dataModel == null)? 0 :this.dataModel.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.sourceUrl == null)? 0 :this.sourceUrl.hashCode()));
        result = ((result* 31)+((this.tableType == null)? 0 :this.tableType.hashCode()));
        result = ((result* 31)+((this.database == null)? 0 :this.database.hashCode()));
        result = ((result* 31)+((this.tableProfilerConfig == null)? 0 :this.tableProfilerConfig.hashCode()));
        result = ((result* 31)+((this.usageSummary == null)? 0 :this.usageSummary.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.retentionPeriod == null)? 0 :this.retentionPeriod.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.viewDefinition == null)? 0 :this.viewDefinition.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this.dataProducts == null)? 0 :this.dataProducts.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.tableConstraints == null)? 0 :this.tableConstraints.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.sourceHash == null)? 0 :this.sourceHash.hashCode()));
        result = ((result* 31)+((this.followers == null)? 0 :this.followers.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.sampleData == null)? 0 :this.sampleData.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.tablePartition == null)? 0 :this.tablePartition.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.votes == null)? 0 :this.votes.hashCode()));
        result = ((result* 31)+((this.lifeCycle == null)? 0 :this.lifeCycle.hashCode()));
        result = ((result* 31)+((this.fileFormat == null)? 0 :this.fileFormat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Table) == false) {
            return false;
        }
        Table rhs = ((Table) other);
        return (((((((((((((((((((((((((((((((((((((((((this.databaseSchema == rhs.databaseSchema)||((this.databaseSchema!= null)&&this.databaseSchema.equals(rhs.databaseSchema)))&&((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType))))&&((this.joins == rhs.joins)||((this.joins!= null)&&this.joins.equals(rhs.joins))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.columns == rhs.columns)||((this.columns!= null)&&this.columns.equals(rhs.columns))))&&((this.testSuite == rhs.testSuite)||((this.testSuite!= null)&&this.testSuite.equals(rhs.testSuite))))&&((this.dataModel == rhs.dataModel)||((this.dataModel!= null)&&this.dataModel.equals(rhs.dataModel))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.sourceUrl == rhs.sourceUrl)||((this.sourceUrl!= null)&&this.sourceUrl.equals(rhs.sourceUrl))))&&((this.tableType == rhs.tableType)||((this.tableType!= null)&&this.tableType.equals(rhs.tableType))))&&((this.database == rhs.database)||((this.database!= null)&&this.database.equals(rhs.database))))&&((this.tableProfilerConfig == rhs.tableProfilerConfig)||((this.tableProfilerConfig!= null)&&this.tableProfilerConfig.equals(rhs.tableProfilerConfig))))&&((this.usageSummary == rhs.usageSummary)||((this.usageSummary!= null)&&this.usageSummary.equals(rhs.usageSummary))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.retentionPeriod == rhs.retentionPeriod)||((this.retentionPeriod!= null)&&this.retentionPeriod.equals(rhs.retentionPeriod))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.viewDefinition == rhs.viewDefinition)||((this.viewDefinition!= null)&&this.viewDefinition.equals(rhs.viewDefinition))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.tableConstraints == rhs.tableConstraints)||((this.tableConstraints!= null)&&this.tableConstraints.equals(rhs.tableConstraints))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.sourceHash == rhs.sourceHash)||((this.sourceHash!= null)&&this.sourceHash.equals(rhs.sourceHash))))&&((this.followers == rhs.followers)||((this.followers!= null)&&this.followers.equals(rhs.followers))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.sampleData == rhs.sampleData)||((this.sampleData!= null)&&this.sampleData.equals(rhs.sampleData))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.tablePartition == rhs.tablePartition)||((this.tablePartition!= null)&&this.tablePartition.equals(rhs.tablePartition))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.votes == rhs.votes)||((this.votes!= null)&&this.votes.equals(rhs.votes))))&&((this.lifeCycle == rhs.lifeCycle)||((this.lifeCycle!= null)&&this.lifeCycle.equals(rhs.lifeCycle))))&&((this.fileFormat == rhs.fileFormat)||((this.fileFormat!= null)&&this.fileFormat.equals(rhs.fileFormat))));
    }

}
