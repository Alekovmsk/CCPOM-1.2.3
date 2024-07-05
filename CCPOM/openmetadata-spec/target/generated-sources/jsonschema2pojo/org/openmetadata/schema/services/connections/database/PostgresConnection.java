
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


/**
 * PostgresConnection
 * <p>
 * Postgres Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "scheme",
    "username",
    "authType",
    "hostPort",
    "database",
    "ingestAllDatabases",
    "sslMode",
    "sslConfig",
    "classificationName",
    "connectionOptions",
    "connectionArguments",
    "supportsMetadataExtraction",
    "supportsUsageExtraction",
    "supportsLineageExtraction",
    "supportsDBTExtraction",
    "supportsProfiler",
    "supportsDatabase",
    "supportsQueryComment",
    "sampleDataStorageConfig"
})
@Generated("jsonschema2pojo")
public class PostgresConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private PostgresConnection.PostgresType type = PostgresConnection.PostgresType.fromValue("Postgres");
    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("SQLAlchemy driver scheme options.")
    private PostgresConnection.PostgresScheme scheme = PostgresConnection.PostgresScheme.fromValue("postgresql+psycopg2");
    /**
     * Username
     * <p>
     * Username to connect to Postgres. This user should have privileges to read all the metadata in Postgres.
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to connect to Postgres. This user should have privileges to read all the metadata in Postgres.")
    @NotNull
    private String username;
    /**
     * Auth Configuration Type
     * <p>
     * Choose Auth Config Type.
     * 
     */
    @JsonProperty("authType")
    @JsonPropertyDescription("Choose Auth Config Type.")
    private Object authType;
    /**
     * Host and Port
     * <p>
     * Host and port of the source service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the source service.")
    @NotNull
    private String hostPort;
    /**
     * Database
     * <p>
     * Database of the data source. This is optional parameter, if you would like to restrict the metadata reading to a single database. When left blank, OpenMetadata Ingestion attempts to scan all the databases.
     * (Required)
     * 
     */
    @JsonProperty("database")
    @JsonPropertyDescription("Database of the data source. This is optional parameter, if you would like to restrict the metadata reading to a single database. When left blank, OpenMetadata Ingestion attempts to scan all the databases.")
    @NotNull
    private String database;
    /**
     * Ingest All Databases
     * <p>
     * Ingest data from all databases in Postgres. You can use databaseFilterPattern on top of this.
     * 
     */
    @JsonProperty("ingestAllDatabases")
    @JsonPropertyDescription("Ingest data from all databases in Postgres. You can use databaseFilterPattern on top of this.")
    private Boolean ingestAllDatabases = false;
    /**
     * SSL Mode
     * <p>
     * SSL Mode to connect to postgres database.
     * 
     */
    @JsonProperty("sslMode")
    @JsonPropertyDescription("SSL Mode to connect to postgres database.")
    private PostgresConnection.SslMode sslMode = PostgresConnection.SslMode.fromValue("disable");
    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    @JsonPropertyDescription("Client SSL configuration")
    private Object sslConfig;
    /**
     * Classification Name
     * <p>
     * Custom OpenMetadata Classification name for Postgres policy tags.
     * 
     */
    @JsonProperty("classificationName")
    @JsonPropertyDescription("Custom OpenMetadata Classification name for Postgres policy tags.")
    private String classificationName = "PostgresPolicyTags";
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
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;
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
    public PostgresConnection.PostgresType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(PostgresConnection.PostgresType type) {
        this.type = type;
    }

    public PostgresConnection withType(PostgresConnection.PostgresType type) {
        this.type = type;
        return this;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public PostgresConnection.PostgresScheme getScheme() {
        return scheme;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(PostgresConnection.PostgresScheme scheme) {
        this.scheme = scheme;
    }

    public PostgresConnection withScheme(PostgresConnection.PostgresScheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Username
     * <p>
     * Username to connect to Postgres. This user should have privileges to read all the metadata in Postgres.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Username
     * <p>
     * Username to connect to Postgres. This user should have privileges to read all the metadata in Postgres.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public PostgresConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Auth Configuration Type
     * <p>
     * Choose Auth Config Type.
     * 
     */
    @JsonProperty("authType")
    public Object getAuthType() {
        return authType;
    }

    /**
     * Auth Configuration Type
     * <p>
     * Choose Auth Config Type.
     * 
     */
    @JsonProperty("authType")
    public void setAuthType(Object authType) {
        this.authType = authType;
    }

    public PostgresConnection withAuthType(Object authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the source service.
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
     * Host and port of the source service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public PostgresConnection withHostPort(String hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Database
     * <p>
     * Database of the data source. This is optional parameter, if you would like to restrict the metadata reading to a single database. When left blank, OpenMetadata Ingestion attempts to scan all the databases.
     * (Required)
     * 
     */
    @JsonProperty("database")
    public String getDatabase() {
        return database;
    }

    /**
     * Database
     * <p>
     * Database of the data source. This is optional parameter, if you would like to restrict the metadata reading to a single database. When left blank, OpenMetadata Ingestion attempts to scan all the databases.
     * (Required)
     * 
     */
    @JsonProperty("database")
    public void setDatabase(String database) {
        this.database = database;
    }

    public PostgresConnection withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * Ingest All Databases
     * <p>
     * Ingest data from all databases in Postgres. You can use databaseFilterPattern on top of this.
     * 
     */
    @JsonProperty("ingestAllDatabases")
    public Boolean getIngestAllDatabases() {
        return ingestAllDatabases;
    }

    /**
     * Ingest All Databases
     * <p>
     * Ingest data from all databases in Postgres. You can use databaseFilterPattern on top of this.
     * 
     */
    @JsonProperty("ingestAllDatabases")
    public void setIngestAllDatabases(Boolean ingestAllDatabases) {
        this.ingestAllDatabases = ingestAllDatabases;
    }

    public PostgresConnection withIngestAllDatabases(Boolean ingestAllDatabases) {
        this.ingestAllDatabases = ingestAllDatabases;
        return this;
    }

    /**
     * SSL Mode
     * <p>
     * SSL Mode to connect to postgres database.
     * 
     */
    @JsonProperty("sslMode")
    public PostgresConnection.SslMode getSslMode() {
        return sslMode;
    }

    /**
     * SSL Mode
     * <p>
     * SSL Mode to connect to postgres database.
     * 
     */
    @JsonProperty("sslMode")
    public void setSslMode(PostgresConnection.SslMode sslMode) {
        this.sslMode = sslMode;
    }

    public PostgresConnection withSslMode(PostgresConnection.SslMode sslMode) {
        this.sslMode = sslMode;
        return this;
    }

    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    public Object getSslConfig() {
        return sslConfig;
    }

    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    public void setSslConfig(Object sslConfig) {
        this.sslConfig = sslConfig;
    }

    public PostgresConnection withSslConfig(Object sslConfig) {
        this.sslConfig = sslConfig;
        return this;
    }

    /**
     * Classification Name
     * <p>
     * Custom OpenMetadata Classification name for Postgres policy tags.
     * 
     */
    @JsonProperty("classificationName")
    public String getClassificationName() {
        return classificationName;
    }

    /**
     * Classification Name
     * <p>
     * Custom OpenMetadata Classification name for Postgres policy tags.
     * 
     */
    @JsonProperty("classificationName")
    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    public PostgresConnection withClassificationName(String classificationName) {
        this.classificationName = classificationName;
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

    public PostgresConnection withConnectionOptions(ConnectionOptions connectionOptions) {
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

    public PostgresConnection withConnectionArguments(ConnectionArguments connectionArguments) {
        this.connectionArguments = connectionArguments;
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

    public PostgresConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
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

    public PostgresConnection withSupportsUsageExtraction(Boolean supportsUsageExtraction) {
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

    public PostgresConnection withSupportsLineageExtraction(Boolean supportsLineageExtraction) {
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

    public PostgresConnection withSupportsDBTExtraction(Boolean supportsDBTExtraction) {
        this.supportsDBTExtraction = supportsDBTExtraction;
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

    public PostgresConnection withSupportsProfiler(Boolean supportsProfiler) {
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

    public PostgresConnection withSupportsDatabase(Boolean supportsDatabase) {
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

    public PostgresConnection withSupportsQueryComment(Boolean supportsQueryComment) {
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

    public PostgresConnection withSampleDataStorageConfig(SampleDataStorageConfig sampleDataStorageConfig) {
        this.sampleDataStorageConfig = sampleDataStorageConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PostgresConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("scheme");
        sb.append('=');
        sb.append(((this.scheme == null)?"<null>":this.scheme));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("authType");
        sb.append('=');
        sb.append(((this.authType == null)?"<null>":this.authType));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("database");
        sb.append('=');
        sb.append(((this.database == null)?"<null>":this.database));
        sb.append(',');
        sb.append("ingestAllDatabases");
        sb.append('=');
        sb.append(((this.ingestAllDatabases == null)?"<null>":this.ingestAllDatabases));
        sb.append(',');
        sb.append("sslMode");
        sb.append('=');
        sb.append(((this.sslMode == null)?"<null>":this.sslMode));
        sb.append(',');
        sb.append("sslConfig");
        sb.append('=');
        sb.append(((this.sslConfig == null)?"<null>":this.sslConfig));
        sb.append(',');
        sb.append("classificationName");
        sb.append('=');
        sb.append(((this.classificationName == null)?"<null>":this.classificationName));
        sb.append(',');
        sb.append("connectionOptions");
        sb.append('=');
        sb.append(((this.connectionOptions == null)?"<null>":this.connectionOptions));
        sb.append(',');
        sb.append("connectionArguments");
        sb.append('=');
        sb.append(((this.connectionArguments == null)?"<null>":this.connectionArguments));
        sb.append(',');
        sb.append("supportsMetadataExtraction");
        sb.append('=');
        sb.append(((this.supportsMetadataExtraction == null)?"<null>":this.supportsMetadataExtraction));
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
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.sslConfig == null)? 0 :this.sslConfig.hashCode()));
        result = ((result* 31)+((this.supportsProfiler == null)? 0 :this.supportsProfiler.hashCode()));
        result = ((result* 31)+((this.ingestAllDatabases == null)? 0 :this.ingestAllDatabases.hashCode()));
        result = ((result* 31)+((this.sampleDataStorageConfig == null)? 0 :this.sampleDataStorageConfig.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.supportsUsageExtraction == null)? 0 :this.supportsUsageExtraction.hashCode()));
        result = ((result* 31)+((this.supportsDBTExtraction == null)? 0 :this.supportsDBTExtraction.hashCode()));
        result = ((result* 31)+((this.sslMode == null)? 0 :this.sslMode.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        result = ((result* 31)+((this.supportsDatabase == null)? 0 :this.supportsDatabase.hashCode()));
        result = ((result* 31)+((this.supportsLineageExtraction == null)? 0 :this.supportsLineageExtraction.hashCode()));
        result = ((result* 31)+((this.database == null)? 0 :this.database.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.classificationName == null)? 0 :this.classificationName.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.supportsQueryComment == null)? 0 :this.supportsQueryComment.hashCode()));
        result = ((result* 31)+((this.authType == null)? 0 :this.authType.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PostgresConnection) == false) {
            return false;
        }
        PostgresConnection rhs = ((PostgresConnection) other);
        return (((((((((((((((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.sslConfig == rhs.sslConfig)||((this.sslConfig!= null)&&this.sslConfig.equals(rhs.sslConfig))))&&((this.supportsProfiler == rhs.supportsProfiler)||((this.supportsProfiler!= null)&&this.supportsProfiler.equals(rhs.supportsProfiler))))&&((this.ingestAllDatabases == rhs.ingestAllDatabases)||((this.ingestAllDatabases!= null)&&this.ingestAllDatabases.equals(rhs.ingestAllDatabases))))&&((this.sampleDataStorageConfig == rhs.sampleDataStorageConfig)||((this.sampleDataStorageConfig!= null)&&this.sampleDataStorageConfig.equals(rhs.sampleDataStorageConfig))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.supportsUsageExtraction == rhs.supportsUsageExtraction)||((this.supportsUsageExtraction!= null)&&this.supportsUsageExtraction.equals(rhs.supportsUsageExtraction))))&&((this.supportsDBTExtraction == rhs.supportsDBTExtraction)||((this.supportsDBTExtraction!= null)&&this.supportsDBTExtraction.equals(rhs.supportsDBTExtraction))))&&((this.sslMode == rhs.sslMode)||((this.sslMode!= null)&&this.sslMode.equals(rhs.sslMode))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))))&&((this.supportsDatabase == rhs.supportsDatabase)||((this.supportsDatabase!= null)&&this.supportsDatabase.equals(rhs.supportsDatabase))))&&((this.supportsLineageExtraction == rhs.supportsLineageExtraction)||((this.supportsLineageExtraction!= null)&&this.supportsLineageExtraction.equals(rhs.supportsLineageExtraction))))&&((this.database == rhs.database)||((this.database!= null)&&this.database.equals(rhs.database))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.classificationName == rhs.classificationName)||((this.classificationName!= null)&&this.classificationName.equals(rhs.classificationName))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.supportsQueryComment == rhs.supportsQueryComment)||((this.supportsQueryComment!= null)&&this.supportsQueryComment.equals(rhs.supportsQueryComment))))&&((this.authType == rhs.authType)||((this.authType!= null)&&this.authType.equals(rhs.authType))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PostgresScheme {

        POSTGRESQL_PSYCOPG_2("postgresql+psycopg2"),
        PGSPIDER_PSYCOPG_2("pgspider+psycopg2");
        private final String value;
        private final static Map<String, PostgresConnection.PostgresScheme> CONSTANTS = new HashMap<String, PostgresConnection.PostgresScheme>();

        static {
            for (PostgresConnection.PostgresScheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PostgresScheme(String value) {
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
        public static PostgresConnection.PostgresScheme fromValue(String value) {
            PostgresConnection.PostgresScheme constant = CONSTANTS.get(value);
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
    public enum PostgresType {

        POSTGRES("Postgres");
        private final String value;
        private final static Map<String, PostgresConnection.PostgresType> CONSTANTS = new HashMap<String, PostgresConnection.PostgresType>();

        static {
            for (PostgresConnection.PostgresType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PostgresType(String value) {
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
        public static PostgresConnection.PostgresType fromValue(String value) {
            PostgresConnection.PostgresType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * SSL Mode
     * <p>
     * SSL Mode to connect to postgres database.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SslMode {

        DISABLE("disable"),
        ALLOW("allow"),
        PREFER("prefer"),
        REQUIRE("require"),
        VERIFY_CA("verify-ca"),
        VERIFY_FULL("verify-full");
        private final String value;
        private final static Map<String, PostgresConnection.SslMode> CONSTANTS = new HashMap<String, PostgresConnection.SslMode>();

        static {
            for (PostgresConnection.SslMode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SslMode(String value) {
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
        public static PostgresConnection.SslMode fromValue(String value) {
            PostgresConnection.SslMode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
