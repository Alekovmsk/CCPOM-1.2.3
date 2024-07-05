
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
 * ClickhouseConnection
 * <p>
 * Clickhouse Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "scheme",
    "username",
    "password",
    "hostPort",
    "databaseName",
    "databaseSchema",
    "duration",
    "https",
    "secure",
    "keyfile",
    "connectionOptions",
    "connectionArguments",
    "supportsMetadataExtraction",
    "supportsUsageExtraction",
    "supportsLineageExtraction",
    "supportsDBTExtraction",
    "supportsProfiler",
    "supportsQueryComment",
    "sampleDataStorageConfig"
})
@Generated("jsonschema2pojo")
public class ClickhouseConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private ClickhouseConnection.ClickhouseType type = ClickhouseConnection.ClickhouseType.fromValue("Clickhouse");
    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("SQLAlchemy driver scheme options.")
    private ClickhouseConnection.ClickhouseScheme scheme = ClickhouseConnection.ClickhouseScheme.fromValue("clickhouse+http");
    /**
     * Username
     * <p>
     * Username to connect to Clickhouse. This user should have privileges to read all the metadata in Clickhouse.
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to connect to Clickhouse. This user should have privileges to read all the metadata in Clickhouse.")
    private String username;
    /**
     * Password
     * <p>
     * Password to connect to Clickhouse.
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to connect to Clickhouse.")
    @PasswordField
    private String password;
    /**
     * Host and Port
     * <p>
     * Host and port of the Clickhouse service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the Clickhouse service.")
    @NotNull
    private String hostPort;
    /**
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    @JsonPropertyDescription("Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.")
    private String databaseName;
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
     * Duration
     * <p>
     * Clickhouse SQL connection duration.
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("Clickhouse SQL connection duration.")
    private Integer duration;
    /**
     * Use HTTPS Protocol
     * <p>
     * Use HTTPS Protocol for connection with clickhouse
     * 
     */
    @JsonProperty("https")
    @JsonPropertyDescription("Use HTTPS Protocol for connection with clickhouse")
    private Boolean https;
    /**
     * Secure Connection
     * <p>
     * Establish secure connection with clickhouse
     * 
     */
    @JsonProperty("secure")
    @JsonPropertyDescription("Establish secure connection with clickhouse")
    private Boolean secure;
    /**
     * Key File Path
     * <p>
     * Path to key file for establishing secure connection
     * 
     */
    @JsonProperty("keyfile")
    @JsonPropertyDescription("Path to key file for establishing secure connection")
    private String keyfile;
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
    public ClickhouseConnection.ClickhouseType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(ClickhouseConnection.ClickhouseType type) {
        this.type = type;
    }

    public ClickhouseConnection withType(ClickhouseConnection.ClickhouseType type) {
        this.type = type;
        return this;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public ClickhouseConnection.ClickhouseScheme getScheme() {
        return scheme;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(ClickhouseConnection.ClickhouseScheme scheme) {
        this.scheme = scheme;
    }

    public ClickhouseConnection withScheme(ClickhouseConnection.ClickhouseScheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Username
     * <p>
     * Username to connect to Clickhouse. This user should have privileges to read all the metadata in Clickhouse.
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Username
     * <p>
     * Username to connect to Clickhouse. This user should have privileges to read all the metadata in Clickhouse.
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public ClickhouseConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * <p>
     * Password to connect to Clickhouse.
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public String getPassword() {
        return password;
    }

    /**
     * Password
     * <p>
     * Password to connect to Clickhouse.
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public ClickhouseConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the Clickhouse service.
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
     * Host and port of the Clickhouse service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public ClickhouseConnection withHostPort(String hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ClickhouseConnection withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
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

    public ClickhouseConnection withDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }

    /**
     * Duration
     * <p>
     * Clickhouse SQL connection duration.
     * 
     */
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    /**
     * Duration
     * <p>
     * Clickhouse SQL connection duration.
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ClickhouseConnection withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Use HTTPS Protocol
     * <p>
     * Use HTTPS Protocol for connection with clickhouse
     * 
     */
    @JsonProperty("https")
    public Boolean getHttps() {
        return https;
    }

    /**
     * Use HTTPS Protocol
     * <p>
     * Use HTTPS Protocol for connection with clickhouse
     * 
     */
    @JsonProperty("https")
    public void setHttps(Boolean https) {
        this.https = https;
    }

    public ClickhouseConnection withHttps(Boolean https) {
        this.https = https;
        return this;
    }

    /**
     * Secure Connection
     * <p>
     * Establish secure connection with clickhouse
     * 
     */
    @JsonProperty("secure")
    public Boolean getSecure() {
        return secure;
    }

    /**
     * Secure Connection
     * <p>
     * Establish secure connection with clickhouse
     * 
     */
    @JsonProperty("secure")
    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    public ClickhouseConnection withSecure(Boolean secure) {
        this.secure = secure;
        return this;
    }

    /**
     * Key File Path
     * <p>
     * Path to key file for establishing secure connection
     * 
     */
    @JsonProperty("keyfile")
    public String getKeyfile() {
        return keyfile;
    }

    /**
     * Key File Path
     * <p>
     * Path to key file for establishing secure connection
     * 
     */
    @JsonProperty("keyfile")
    public void setKeyfile(String keyfile) {
        this.keyfile = keyfile;
    }

    public ClickhouseConnection withKeyfile(String keyfile) {
        this.keyfile = keyfile;
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

    public ClickhouseConnection withConnectionOptions(ConnectionOptions connectionOptions) {
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

    public ClickhouseConnection withConnectionArguments(ConnectionArguments connectionArguments) {
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

    public ClickhouseConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
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

    public ClickhouseConnection withSupportsUsageExtraction(Boolean supportsUsageExtraction) {
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

    public ClickhouseConnection withSupportsLineageExtraction(Boolean supportsLineageExtraction) {
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

    public ClickhouseConnection withSupportsDBTExtraction(Boolean supportsDBTExtraction) {
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

    public ClickhouseConnection withSupportsProfiler(Boolean supportsProfiler) {
        this.supportsProfiler = supportsProfiler;
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

    public ClickhouseConnection withSupportsQueryComment(Boolean supportsQueryComment) {
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

    public ClickhouseConnection withSampleDataStorageConfig(SampleDataStorageConfig sampleDataStorageConfig) {
        this.sampleDataStorageConfig = sampleDataStorageConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClickhouseConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("databaseName");
        sb.append('=');
        sb.append(((this.databaseName == null)?"<null>":this.databaseName));
        sb.append(',');
        sb.append("databaseSchema");
        sb.append('=');
        sb.append(((this.databaseSchema == null)?"<null>":this.databaseSchema));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("https");
        sb.append('=');
        sb.append(((this.https == null)?"<null>":this.https));
        sb.append(',');
        sb.append("secure");
        sb.append('=');
        sb.append(((this.secure == null)?"<null>":this.secure));
        sb.append(',');
        sb.append("keyfile");
        sb.append('=');
        sb.append(((this.keyfile == null)?"<null>":this.keyfile));
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
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.databaseName == null)? 0 :this.databaseName.hashCode()));
        result = ((result* 31)+((this.supportsProfiler == null)? 0 :this.supportsProfiler.hashCode()));
        result = ((result* 31)+((this.sampleDataStorageConfig == null)? 0 :this.sampleDataStorageConfig.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.secure == null)? 0 :this.secure.hashCode()));
        result = ((result* 31)+((this.supportsUsageExtraction == null)? 0 :this.supportsUsageExtraction.hashCode()));
        result = ((result* 31)+((this.supportsDBTExtraction == null)? 0 :this.supportsDBTExtraction.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.supportsLineageExtraction == null)? 0 :this.supportsLineageExtraction.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.keyfile == null)? 0 :this.keyfile.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.https == null)? 0 :this.https.hashCode()));
        result = ((result* 31)+((this.supportsQueryComment == null)? 0 :this.supportsQueryComment.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClickhouseConnection) == false) {
            return false;
        }
        ClickhouseConnection rhs = ((ClickhouseConnection) other);
        return (((((((((((((((((((((this.databaseSchema == rhs.databaseSchema)||((this.databaseSchema!= null)&&this.databaseSchema.equals(rhs.databaseSchema)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.databaseName == rhs.databaseName)||((this.databaseName!= null)&&this.databaseName.equals(rhs.databaseName))))&&((this.supportsProfiler == rhs.supportsProfiler)||((this.supportsProfiler!= null)&&this.supportsProfiler.equals(rhs.supportsProfiler))))&&((this.sampleDataStorageConfig == rhs.sampleDataStorageConfig)||((this.sampleDataStorageConfig!= null)&&this.sampleDataStorageConfig.equals(rhs.sampleDataStorageConfig))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.secure == rhs.secure)||((this.secure!= null)&&this.secure.equals(rhs.secure))))&&((this.supportsUsageExtraction == rhs.supportsUsageExtraction)||((this.supportsUsageExtraction!= null)&&this.supportsUsageExtraction.equals(rhs.supportsUsageExtraction))))&&((this.supportsDBTExtraction == rhs.supportsDBTExtraction)||((this.supportsDBTExtraction!= null)&&this.supportsDBTExtraction.equals(rhs.supportsDBTExtraction))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.supportsLineageExtraction == rhs.supportsLineageExtraction)||((this.supportsLineageExtraction!= null)&&this.supportsLineageExtraction.equals(rhs.supportsLineageExtraction))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.keyfile == rhs.keyfile)||((this.keyfile!= null)&&this.keyfile.equals(rhs.keyfile))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.https == rhs.https)||((this.https!= null)&&this.https.equals(rhs.https))))&&((this.supportsQueryComment == rhs.supportsQueryComment)||((this.supportsQueryComment!= null)&&this.supportsQueryComment.equals(rhs.supportsQueryComment))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ClickhouseScheme {

        CLICKHOUSE_HTTP("clickhouse+http"),
        CLICKHOUSE_NATIVE("clickhouse+native");
        private final String value;
        private final static Map<String, ClickhouseConnection.ClickhouseScheme> CONSTANTS = new HashMap<String, ClickhouseConnection.ClickhouseScheme>();

        static {
            for (ClickhouseConnection.ClickhouseScheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ClickhouseScheme(String value) {
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
        public static ClickhouseConnection.ClickhouseScheme fromValue(String value) {
            ClickhouseConnection.ClickhouseScheme constant = CONSTANTS.get(value);
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
    public enum ClickhouseType {

        CLICKHOUSE("Clickhouse");
        private final String value;
        private final static Map<String, ClickhouseConnection.ClickhouseType> CONSTANTS = new HashMap<String, ClickhouseConnection.ClickhouseType>();

        static {
            for (ClickhouseConnection.ClickhouseType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ClickhouseType(String value) {
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
        public static ClickhouseConnection.ClickhouseType fromValue(String value) {
            ClickhouseConnection.ClickhouseType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
