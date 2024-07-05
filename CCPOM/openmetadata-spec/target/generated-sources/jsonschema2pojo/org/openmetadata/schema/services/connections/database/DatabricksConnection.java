
package org.openmetadata.schema.services.connections.database;

import java.util.HashMap;
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
import org.openmetadata.annotations.PasswordField;


/**
 * DatabricksConnection
 * <p>
 * Databricks Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "scheme",
    "hostPort",
    "token",
    "httpPath",
    "catalog",
    "databaseSchema",
    "connectionTimeout",
    "useUnityCatalog",
    "connectionOptions",
    "connectionArguments",
    "supportsUsageExtraction",
    "supportsLineageExtraction",
    "supportsDBTExtraction",
    "supportsMetadataExtraction",
    "supportsProfiler",
    "supportsDatabase",
    "supportsQueryComment",
    "sampleDataStorageConfig"
})
@Generated("jsonschema2pojo")
public class DatabricksConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private DatabricksConnection.DatabricksType type = DatabricksConnection.DatabricksType.fromValue("Databricks");
    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("SQLAlchemy driver scheme options.")
    private DatabricksConnection.DatabricksScheme scheme = DatabricksConnection.DatabricksScheme.fromValue("databricks+connector");
    /**
     * Host and Port
     * <p>
     * Host and port of the Databricks service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the Databricks service.")
    @NotNull
    private String hostPort;
    /**
     * Token
     * <p>
     * Generated Token to connect to Databricks.
     * (Required)
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("Generated Token to connect to Databricks.")
    @PasswordField
    @NotNull
    private String token;
    /**
     * Http Path
     * <p>
     * Databricks compute resources URL.
     * 
     */
    @JsonProperty("httpPath")
    @JsonPropertyDescription("Databricks compute resources URL.")
    private String httpPath;
    /**
     * Catalog
     * <p>
     * Catalog of the data source(Example: hive_metastore). This is optional parameter, if you would like to restrict the metadata reading to a single catalog. When left blank, OpenMetadata Ingestion attempts to scan all the catalog.
     * 
     */
    @JsonProperty("catalog")
    @JsonPropertyDescription("Catalog of the data source(Example: hive_metastore). This is optional parameter, if you would like to restrict the metadata reading to a single catalog. When left blank, OpenMetadata Ingestion attempts to scan all the catalog.")
    private String catalog;
    /**
     * Database Schema
     * <p>
     * Database Schema of the data source. This is optional parameter, if you would like to restrict the metadata reading to a single schema. When left blank, OpenMetadata Ingestion attempts to scan all the schemas.
     * 
     */
    @JsonProperty("databaseSchema")
    @JsonPropertyDescription("Database Schema of the data source. This is optional parameter, if you would like to restrict the metadata reading to a single schema. When left blank, OpenMetadata Ingestion attempts to scan all the schemas.")
    private String databaseSchema;
    /**
     * Connection Timeout
     * <p>
     * The maximum amount of time (in seconds) to wait for a successful connection to the data source. If the connection attempt takes longer than this timeout period, an error will be returned.
     * 
     */
    @JsonProperty("connectionTimeout")
    @JsonPropertyDescription("The maximum amount of time (in seconds) to wait for a successful connection to the data source. If the connection attempt takes longer than this timeout period, an error will be returned.")
    private Integer connectionTimeout = 120;
    /**
     * Use Unity Catalog
     * <p>
     * Use unity catalog for fetching the metadata instead of using the hive metastore
     * 
     */
    @JsonProperty("useUnityCatalog")
    @JsonPropertyDescription("Use unity catalog for fetching the metadata instead of using the hive metastore")
    private Boolean useUnityCatalog = false;
    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    @JsonPropertyDescription("Additional connection options to build the URL that can be sent to service during the connection.")
    @Valid
    private ConnectionOptions connectionOptions;
    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    @JsonPropertyDescription("Additional connection arguments such as security or protocol configs that can be sent to service during connection.")
    @Valid
    private ConnectionArguments connectionArguments;
    /**
     * Supports Usage Extraction.
     * 
     */
    @JsonProperty("supportsUsageExtraction")
    @JsonPropertyDescription("Supports Usage Extraction.")
    private Boolean supportsUsageExtraction = true;
    /**
     * Supports Lineage Extraction.
     * 
     */
    @JsonProperty("supportsLineageExtraction")
    @JsonPropertyDescription("Supports Lineage Extraction.")
    private Boolean supportsLineageExtraction = true;
    /**
     * Supports DBT Extraction.
     * 
     */
    @JsonProperty("supportsDBTExtraction")
    @JsonPropertyDescription("Supports DBT Extraction.")
    private Boolean supportsDBTExtraction = true;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;
    /**
     * Supports Profiler
     * 
     */
    @JsonProperty("supportsProfiler")
    @JsonPropertyDescription("Supports Profiler")
    private Boolean supportsProfiler = true;
    /**
     * The source service supports the database concept in its hierarchy
     * 
     */
    @JsonProperty("supportsDatabase")
    @JsonPropertyDescription("The source service supports the database concept in its hierarchy")
    private Boolean supportsDatabase = true;
    /**
     * For Database Services using SQLAlchemy, True to enable running a comment for all queries run from OpenMetadata.
     * 
     */
    @JsonProperty("supportsQueryComment")
    @JsonPropertyDescription("For Database Services using SQLAlchemy, True to enable running a comment for all queries run from OpenMetadata.")
    private Boolean supportsQueryComment = true;
    /**
     * Storage config to store sample data
     * 
     */
    @JsonProperty("sampleDataStorageConfig")
    @JsonPropertyDescription("Storage config to store sample data")
    @Valid
    private SampleDataStorageConfig sampleDataStorageConfig;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public DatabricksConnection.DatabricksType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(DatabricksConnection.DatabricksType type) {
        this.type = type;
    }

    public DatabricksConnection withType(DatabricksConnection.DatabricksType type) {
        this.type = type;
        return this;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public DatabricksConnection.DatabricksScheme getScheme() {
        return scheme;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(DatabricksConnection.DatabricksScheme scheme) {
        this.scheme = scheme;
    }

    public DatabricksConnection withScheme(DatabricksConnection.DatabricksScheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the Databricks service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public String getHostPort() {
        return hostPort;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the Databricks service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public DatabricksConnection withHostPort(String hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Token
     * <p>
     * Generated Token to connect to Databricks.
     * (Required)
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public String getToken() {
        return token;
    }

    /**
     * Token
     * <p>
     * Generated Token to connect to Databricks.
     * (Required)
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public void setToken(String token) {
        this.token = token;
    }

    public DatabricksConnection withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Http Path
     * <p>
     * Databricks compute resources URL.
     * 
     */
    @JsonProperty("httpPath")
    public String getHttpPath() {
        return httpPath;
    }

    /**
     * Http Path
     * <p>
     * Databricks compute resources URL.
     * 
     */
    @JsonProperty("httpPath")
    public void setHttpPath(String httpPath) {
        this.httpPath = httpPath;
    }

    public DatabricksConnection withHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }

    /**
     * Catalog
     * <p>
     * Catalog of the data source(Example: hive_metastore). This is optional parameter, if you would like to restrict the metadata reading to a single catalog. When left blank, OpenMetadata Ingestion attempts to scan all the catalog.
     * 
     */
    @JsonProperty("catalog")
    public String getCatalog() {
        return catalog;
    }

    /**
     * Catalog
     * <p>
     * Catalog of the data source(Example: hive_metastore). This is optional parameter, if you would like to restrict the metadata reading to a single catalog. When left blank, OpenMetadata Ingestion attempts to scan all the catalog.
     * 
     */
    @JsonProperty("catalog")
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public DatabricksConnection withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * Database Schema
     * <p>
     * Database Schema of the data source. This is optional parameter, if you would like to restrict the metadata reading to a single schema. When left blank, OpenMetadata Ingestion attempts to scan all the schemas.
     * 
     */
    @JsonProperty("databaseSchema")
    public String getDatabaseSchema() {
        return databaseSchema;
    }

    /**
     * Database Schema
     * <p>
     * Database Schema of the data source. This is optional parameter, if you would like to restrict the metadata reading to a single schema. When left blank, OpenMetadata Ingestion attempts to scan all the schemas.
     * 
     */
    @JsonProperty("databaseSchema")
    public void setDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
    }

    public DatabricksConnection withDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }

    /**
     * Connection Timeout
     * <p>
     * The maximum amount of time (in seconds) to wait for a successful connection to the data source. If the connection attempt takes longer than this timeout period, an error will be returned.
     * 
     */
    @JsonProperty("connectionTimeout")
    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * Connection Timeout
     * <p>
     * The maximum amount of time (in seconds) to wait for a successful connection to the data source. If the connection attempt takes longer than this timeout period, an error will be returned.
     * 
     */
    @JsonProperty("connectionTimeout")
    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public DatabricksConnection withConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
        return this;
    }

    /**
     * Use Unity Catalog
     * <p>
     * Use unity catalog for fetching the metadata instead of using the hive metastore
     * 
     */
    @JsonProperty("useUnityCatalog")
    public Boolean getUseUnityCatalog() {
        return useUnityCatalog;
    }

    /**
     * Use Unity Catalog
     * <p>
     * Use unity catalog for fetching the metadata instead of using the hive metastore
     * 
     */
    @JsonProperty("useUnityCatalog")
    public void setUseUnityCatalog(Boolean useUnityCatalog) {
        this.useUnityCatalog = useUnityCatalog;
    }

    public DatabricksConnection withUseUnityCatalog(Boolean useUnityCatalog) {
        this.useUnityCatalog = useUnityCatalog;
        return this;
    }

    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    public ConnectionOptions getConnectionOptions() {
        return connectionOptions;
    }

    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    public void setConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
    }

    public DatabricksConnection withConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
        return this;
    }

    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    public ConnectionArguments getConnectionArguments() {
        return connectionArguments;
    }

    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    public void setConnectionArguments(ConnectionArguments connectionArguments) {
        this.connectionArguments = connectionArguments;
    }

    public DatabricksConnection withConnectionArguments(ConnectionArguments connectionArguments) {
        this.connectionArguments = connectionArguments;
        return this;
    }

    /**
     * Supports Usage Extraction.
     * 
     */
    @JsonProperty("supportsUsageExtraction")
    public Boolean getSupportsUsageExtraction() {
        return supportsUsageExtraction;
    }

    /**
     * Supports Usage Extraction.
     * 
     */
    @JsonProperty("supportsUsageExtraction")
    public void setSupportsUsageExtraction(Boolean supportsUsageExtraction) {
        this.supportsUsageExtraction = supportsUsageExtraction;
    }

    public DatabricksConnection withSupportsUsageExtraction(Boolean supportsUsageExtraction) {
        this.supportsUsageExtraction = supportsUsageExtraction;
        return this;
    }

    /**
     * Supports Lineage Extraction.
     * 
     */
    @JsonProperty("supportsLineageExtraction")
    public Boolean getSupportsLineageExtraction() {
        return supportsLineageExtraction;
    }

    /**
     * Supports Lineage Extraction.
     * 
     */
    @JsonProperty("supportsLineageExtraction")
    public void setSupportsLineageExtraction(Boolean supportsLineageExtraction) {
        this.supportsLineageExtraction = supportsLineageExtraction;
    }

    public DatabricksConnection withSupportsLineageExtraction(Boolean supportsLineageExtraction) {
        this.supportsLineageExtraction = supportsLineageExtraction;
        return this;
    }

    /**
     * Supports DBT Extraction.
     * 
     */
    @JsonProperty("supportsDBTExtraction")
    public Boolean getSupportsDBTExtraction() {
        return supportsDBTExtraction;
    }

    /**
     * Supports DBT Extraction.
     * 
     */
    @JsonProperty("supportsDBTExtraction")
    public void setSupportsDBTExtraction(Boolean supportsDBTExtraction) {
        this.supportsDBTExtraction = supportsDBTExtraction;
    }

    public DatabricksConnection withSupportsDBTExtraction(Boolean supportsDBTExtraction) {
        this.supportsDBTExtraction = supportsDBTExtraction;
        return this;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public Boolean getSupportsMetadataExtraction() {
        return supportsMetadataExtraction;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public void setSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
    }

    public DatabricksConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    /**
     * Supports Profiler
     * 
     */
    @JsonProperty("supportsProfiler")
    public Boolean getSupportsProfiler() {
        return supportsProfiler;
    }

    /**
     * Supports Profiler
     * 
     */
    @JsonProperty("supportsProfiler")
    public void setSupportsProfiler(Boolean supportsProfiler) {
        this.supportsProfiler = supportsProfiler;
    }

    public DatabricksConnection withSupportsProfiler(Boolean supportsProfiler) {
        this.supportsProfiler = supportsProfiler;
        return this;
    }

    /**
     * The source service supports the database concept in its hierarchy
     * 
     */
    @JsonProperty("supportsDatabase")
    public Boolean getSupportsDatabase() {
        return supportsDatabase;
    }

    /**
     * The source service supports the database concept in its hierarchy
     * 
     */
    @JsonProperty("supportsDatabase")
    public void setSupportsDatabase(Boolean supportsDatabase) {
        this.supportsDatabase = supportsDatabase;
    }

    public DatabricksConnection withSupportsDatabase(Boolean supportsDatabase) {
        this.supportsDatabase = supportsDatabase;
        return this;
    }

    /**
     * For Database Services using SQLAlchemy, True to enable running a comment for all queries run from OpenMetadata.
     * 
     */
    @JsonProperty("supportsQueryComment")
    public Boolean getSupportsQueryComment() {
        return supportsQueryComment;
    }

    /**
     * For Database Services using SQLAlchemy, True to enable running a comment for all queries run from OpenMetadata.
     * 
     */
    @JsonProperty("supportsQueryComment")
    public void setSupportsQueryComment(Boolean supportsQueryComment) {
        this.supportsQueryComment = supportsQueryComment;
    }

    public DatabricksConnection withSupportsQueryComment(Boolean supportsQueryComment) {
        this.supportsQueryComment = supportsQueryComment;
        return this;
    }

    /**
     * Storage config to store sample data
     * 
     */
    @JsonProperty("sampleDataStorageConfig")
    public SampleDataStorageConfig getSampleDataStorageConfig() {
        return sampleDataStorageConfig;
    }

    /**
     * Storage config to store sample data
     * 
     */
    @JsonProperty("sampleDataStorageConfig")
    public void setSampleDataStorageConfig(SampleDataStorageConfig sampleDataStorageConfig) {
        this.sampleDataStorageConfig = sampleDataStorageConfig;
    }

    public DatabricksConnection withSampleDataStorageConfig(SampleDataStorageConfig sampleDataStorageConfig) {
        this.sampleDataStorageConfig = sampleDataStorageConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DatabricksConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("scheme");
        sb.append('=');
        sb.append(((this.scheme == null)?"<null>":this.scheme));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
        sb.append(',');
        sb.append("httpPath");
        sb.append('=');
        sb.append(((this.httpPath == null)?"<null>":this.httpPath));
        sb.append(',');
        sb.append("catalog");
        sb.append('=');
        sb.append(((this.catalog == null)?"<null>":this.catalog));
        sb.append(',');
        sb.append("databaseSchema");
        sb.append('=');
        sb.append(((this.databaseSchema == null)?"<null>":this.databaseSchema));
        sb.append(',');
        sb.append("connectionTimeout");
        sb.append('=');
        sb.append(((this.connectionTimeout == null)?"<null>":this.connectionTimeout));
        sb.append(',');
        sb.append("useUnityCatalog");
        sb.append('=');
        sb.append(((this.useUnityCatalog == null)?"<null>":this.useUnityCatalog));
        sb.append(',');
        sb.append("connectionOptions");
        sb.append('=');
        sb.append(((this.connectionOptions == null)?"<null>":this.connectionOptions));
        sb.append(',');
        sb.append("connectionArguments");
        sb.append('=');
        sb.append(((this.connectionArguments == null)?"<null>":this.connectionArguments));
        sb.append(',');
        sb.append("supportsUsageExtraction");
        sb.append('=');
        sb.append(((this.supportsUsageExtraction == null)?"<null>":this.supportsUsageExtraction));
        sb.append(',');
        sb.append("supportsLineageExtraction");
        sb.append('=');
        sb.append(((this.supportsLineageExtraction == null)?"<null>":this.supportsLineageExtraction));
        sb.append(',');
        sb.append("supportsDBTExtraction");
        sb.append('=');
        sb.append(((this.supportsDBTExtraction == null)?"<null>":this.supportsDBTExtraction));
        sb.append(',');
        sb.append("supportsMetadataExtraction");
        sb.append('=');
        sb.append(((this.supportsMetadataExtraction == null)?"<null>":this.supportsMetadataExtraction));
        sb.append(',');
        sb.append("supportsProfiler");
        sb.append('=');
        sb.append(((this.supportsProfiler == null)?"<null>":this.supportsProfiler));
        sb.append(',');
        sb.append("supportsDatabase");
        sb.append('=');
        sb.append(((this.supportsDatabase == null)?"<null>":this.supportsDatabase));
        sb.append(',');
        sb.append("supportsQueryComment");
        sb.append('=');
        sb.append(((this.supportsQueryComment == null)?"<null>":this.supportsQueryComment));
        sb.append(',');
        sb.append("sampleDataStorageConfig");
        sb.append('=');
        sb.append(((this.sampleDataStorageConfig == null)?"<null>":this.sampleDataStorageConfig));
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
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.httpPath == null)? 0 :this.httpPath.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.supportsProfiler == null)? 0 :this.supportsProfiler.hashCode()));
        result = ((result* 31)+((this.catalog == null)? 0 :this.catalog.hashCode()));
        result = ((result* 31)+((this.useUnityCatalog == null)? 0 :this.useUnityCatalog.hashCode()));
        result = ((result* 31)+((this.sampleDataStorageConfig == null)? 0 :this.sampleDataStorageConfig.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.supportsUsageExtraction == null)? 0 :this.supportsUsageExtraction.hashCode()));
        result = ((result* 31)+((this.supportsDBTExtraction == null)? 0 :this.supportsDBTExtraction.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        result = ((result* 31)+((this.supportsDatabase == null)? 0 :this.supportsDatabase.hashCode()));
        result = ((result* 31)+((this.supportsLineageExtraction == null)? 0 :this.supportsLineageExtraction.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.supportsQueryComment == null)? 0 :this.supportsQueryComment.hashCode()));
        result = ((result* 31)+((this.connectionTimeout == null)? 0 :this.connectionTimeout.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatabricksConnection) == false) {
            return false;
        }
        DatabricksConnection rhs = ((DatabricksConnection) other);
        return ((((((((((((((((((((this.databaseSchema == rhs.databaseSchema)||((this.databaseSchema!= null)&&this.databaseSchema.equals(rhs.databaseSchema)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.httpPath == rhs.httpPath)||((this.httpPath!= null)&&this.httpPath.equals(rhs.httpPath))))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.supportsProfiler == rhs.supportsProfiler)||((this.supportsProfiler!= null)&&this.supportsProfiler.equals(rhs.supportsProfiler))))&&((this.catalog == rhs.catalog)||((this.catalog!= null)&&this.catalog.equals(rhs.catalog))))&&((this.useUnityCatalog == rhs.useUnityCatalog)||((this.useUnityCatalog!= null)&&this.useUnityCatalog.equals(rhs.useUnityCatalog))))&&((this.sampleDataStorageConfig == rhs.sampleDataStorageConfig)||((this.sampleDataStorageConfig!= null)&&this.sampleDataStorageConfig.equals(rhs.sampleDataStorageConfig))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.supportsUsageExtraction == rhs.supportsUsageExtraction)||((this.supportsUsageExtraction!= null)&&this.supportsUsageExtraction.equals(rhs.supportsUsageExtraction))))&&((this.supportsDBTExtraction == rhs.supportsDBTExtraction)||((this.supportsDBTExtraction!= null)&&this.supportsDBTExtraction.equals(rhs.supportsDBTExtraction))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))))&&((this.supportsDatabase == rhs.supportsDatabase)||((this.supportsDatabase!= null)&&this.supportsDatabase.equals(rhs.supportsDatabase))))&&((this.supportsLineageExtraction == rhs.supportsLineageExtraction)||((this.supportsLineageExtraction!= null)&&this.supportsLineageExtraction.equals(rhs.supportsLineageExtraction))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.supportsQueryComment == rhs.supportsQueryComment)||((this.supportsQueryComment!= null)&&this.supportsQueryComment.equals(rhs.supportsQueryComment))))&&((this.connectionTimeout == rhs.connectionTimeout)||((this.connectionTimeout!= null)&&this.connectionTimeout.equals(rhs.connectionTimeout))));
    }


    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DatabricksScheme {

        DATABRICKS_CONNECTOR("databricks+connector");
        private final String value;
        private final static Map<String, DatabricksConnection.DatabricksScheme> CONSTANTS = new HashMap<String, DatabricksConnection.DatabricksScheme>();

        static {
            for (DatabricksConnection.DatabricksScheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DatabricksScheme(String value) {
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
        public static DatabricksConnection.DatabricksScheme fromValue(String value) {
            DatabricksConnection.DatabricksScheme constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DatabricksType {

        DATABRICKS("Databricks");
        private final String value;
        private final static Map<String, DatabricksConnection.DatabricksType> CONSTANTS = new HashMap<String, DatabricksConnection.DatabricksType>();

        static {
            for (DatabricksConnection.DatabricksType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DatabricksType(String value) {
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
        public static DatabricksConnection.DatabricksType fromValue(String value) {
            DatabricksConnection.DatabricksType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
