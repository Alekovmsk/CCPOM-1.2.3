
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
 * SnowflakeConnection
 * <p>
 * Snowflake Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "scheme",
    "username",
    "password",
    "account",
    "role",
    "database",
    "warehouse",
    "queryTag",
    "privateKey",
    "snowflakePrivatekeyPassphrase",
    "includeTransientTables",
    "clientSessionKeepAlive",
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
public class SnowflakeConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private SnowflakeConnection.SnowflakeType type = SnowflakeConnection.SnowflakeType.fromValue("Snowflake");
    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("SQLAlchemy driver scheme options.")
    private SnowflakeConnection.SnowflakeScheme scheme = SnowflakeConnection.SnowflakeScheme.fromValue("snowflake");
    /**
     * Username
     * <p>
     * Username to connect to Snowflake. This user should have privileges to read all the metadata in Snowflake.
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to connect to Snowflake. This user should have privileges to read all the metadata in Snowflake.")
    @NotNull
    private String username;
    /**
     * Password
     * <p>
     * Password to connect to Snowflake.
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to connect to Snowflake.")
    @PasswordField
    private String password;
    /**
     * Account
     * <p>
     * If the Snowflake URL is https://xyz1234.us-east-1.gcp.snowflakecomputing.com, then the account is xyz1234.us-east-1.gcp
     * (Required)
     * 
     */
    @JsonProperty("account")
    @JsonPropertyDescription("If the Snowflake URL is https://xyz1234.us-east-1.gcp.snowflakecomputing.com, then the account is xyz1234.us-east-1.gcp")
    @NotNull
    private String account;
    /**
     * Role
     * <p>
     * Snowflake Role.
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("Snowflake Role.")
    private String role;
    /**
     * Database
     * <p>
     * Database of the data source. This is optional parameter, if you would like to restrict the metadata reading to a single database. When left blank, OpenMetadata Ingestion attempts to scan all the databases.
     * 
     */
    @JsonProperty("database")
    @JsonPropertyDescription("Database of the data source. This is optional parameter, if you would like to restrict the metadata reading to a single database. When left blank, OpenMetadata Ingestion attempts to scan all the databases.")
    private String database;
    /**
     * Warehouse
     * <p>
     * Snowflake warehouse.
     * (Required)
     * 
     */
    @JsonProperty("warehouse")
    @JsonPropertyDescription("Snowflake warehouse.")
    @NotNull
    private String warehouse;
    /**
     * Query Tag
     * <p>
     * Session query tag used to monitor usage on snowflake. To use a query tag snowflake user should have enough privileges to alter the session.
     * 
     */
    @JsonProperty("queryTag")
    @JsonPropertyDescription("Session query tag used to monitor usage on snowflake. To use a query tag snowflake user should have enough privileges to alter the session.")
    private String queryTag;
    /**
     * Private Key
     * <p>
     * Connection to Snowflake instance via Private Key
     * 
     */
    @JsonProperty("privateKey")
    @JsonPropertyDescription("Connection to Snowflake instance via Private Key")
    @PasswordField
    private String privateKey;
    /**
     * Snowflake Passphrase Key
     * <p>
     * Snowflake Passphrase Key used with Private Key
     * 
     */
    @JsonProperty("snowflakePrivatekeyPassphrase")
    @JsonPropertyDescription("Snowflake Passphrase Key used with Private Key")
    @PasswordField
    private String snowflakePrivatekeyPassphrase;
    /**
     * Include Transient Tables
     * <p>
     * Optional configuration for ingestion of TRANSIENT tables, By default, it will skip the TRANSIENT tables.
     * 
     */
    @JsonProperty("includeTransientTables")
    @JsonPropertyDescription("Optional configuration for ingestion of TRANSIENT tables, By default, it will skip the TRANSIENT tables.")
    private Boolean includeTransientTables = false;
    /**
     * Client Session Keep Alive
     * <p>
     * Optional configuration for ingestion to keep the client session active in case the ingestion process runs for longer durations.
     * 
     */
    @JsonProperty("clientSessionKeepAlive")
    @JsonPropertyDescription("Optional configuration for ingestion to keep the client session active in case the ingestion process runs for longer durations.")
    private Boolean clientSessionKeepAlive = false;
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
    public SnowflakeConnection.SnowflakeType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(SnowflakeConnection.SnowflakeType type) {
        this.type = type;
    }

    public SnowflakeConnection withType(SnowflakeConnection.SnowflakeType type) {
        this.type = type;
        return this;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public SnowflakeConnection.SnowflakeScheme getScheme() {
        return scheme;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(SnowflakeConnection.SnowflakeScheme scheme) {
        this.scheme = scheme;
    }

    public SnowflakeConnection withScheme(SnowflakeConnection.SnowflakeScheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Username
     * <p>
     * Username to connect to Snowflake. This user should have privileges to read all the metadata in Snowflake.
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
     * Username to connect to Snowflake. This user should have privileges to read all the metadata in Snowflake.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public SnowflakeConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * <p>
     * Password to connect to Snowflake.
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
     * Password to connect to Snowflake.
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public SnowflakeConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Account
     * <p>
     * If the Snowflake URL is https://xyz1234.us-east-1.gcp.snowflakecomputing.com, then the account is xyz1234.us-east-1.gcp
     * (Required)
     * 
     */
    @JsonProperty("account")
    public String getAccount() {
        return account;
    }

    /**
     * Account
     * <p>
     * If the Snowflake URL is https://xyz1234.us-east-1.gcp.snowflakecomputing.com, then the account is xyz1234.us-east-1.gcp
     * (Required)
     * 
     */
    @JsonProperty("account")
    public void setAccount(String account) {
        this.account = account;
    }

    public SnowflakeConnection withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Role
     * <p>
     * Snowflake Role.
     * 
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * Role
     * <p>
     * Snowflake Role.
     * 
     */
    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    public SnowflakeConnection withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Database
     * <p>
     * Database of the data source. This is optional parameter, if you would like to restrict the metadata reading to a single database. When left blank, OpenMetadata Ingestion attempts to scan all the databases.
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
     * 
     */
    @JsonProperty("database")
    public void setDatabase(String database) {
        this.database = database;
    }

    public SnowflakeConnection withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * Warehouse
     * <p>
     * Snowflake warehouse.
     * (Required)
     * 
     */
    @JsonProperty("warehouse")
    public String getWarehouse() {
        return warehouse;
    }

    /**
     * Warehouse
     * <p>
     * Snowflake warehouse.
     * (Required)
     * 
     */
    @JsonProperty("warehouse")
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public SnowflakeConnection withWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    /**
     * Query Tag
     * <p>
     * Session query tag used to monitor usage on snowflake. To use a query tag snowflake user should have enough privileges to alter the session.
     * 
     */
    @JsonProperty("queryTag")
    public String getQueryTag() {
        return queryTag;
    }

    /**
     * Query Tag
     * <p>
     * Session query tag used to monitor usage on snowflake. To use a query tag snowflake user should have enough privileges to alter the session.
     * 
     */
    @JsonProperty("queryTag")
    public void setQueryTag(String queryTag) {
        this.queryTag = queryTag;
    }

    public SnowflakeConnection withQueryTag(String queryTag) {
        this.queryTag = queryTag;
        return this;
    }

    /**
     * Private Key
     * <p>
     * Connection to Snowflake instance via Private Key
     * 
     */
    @JsonProperty("privateKey")
    @PasswordField
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * Private Key
     * <p>
     * Connection to Snowflake instance via Private Key
     * 
     */
    @JsonProperty("privateKey")
    @PasswordField
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public SnowflakeConnection withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Snowflake Passphrase Key
     * <p>
     * Snowflake Passphrase Key used with Private Key
     * 
     */
    @JsonProperty("snowflakePrivatekeyPassphrase")
    @PasswordField
    public String getSnowflakePrivatekeyPassphrase() {
        return snowflakePrivatekeyPassphrase;
    }

    /**
     * Snowflake Passphrase Key
     * <p>
     * Snowflake Passphrase Key used with Private Key
     * 
     */
    @JsonProperty("snowflakePrivatekeyPassphrase")
    @PasswordField
    public void setSnowflakePrivatekeyPassphrase(String snowflakePrivatekeyPassphrase) {
        this.snowflakePrivatekeyPassphrase = snowflakePrivatekeyPassphrase;
    }

    public SnowflakeConnection withSnowflakePrivatekeyPassphrase(String snowflakePrivatekeyPassphrase) {
        this.snowflakePrivatekeyPassphrase = snowflakePrivatekeyPassphrase;
        return this;
    }

    /**
     * Include Transient Tables
     * <p>
     * Optional configuration for ingestion of TRANSIENT tables, By default, it will skip the TRANSIENT tables.
     * 
     */
    @JsonProperty("includeTransientTables")
    public Boolean getIncludeTransientTables() {
        return includeTransientTables;
    }

    /**
     * Include Transient Tables
     * <p>
     * Optional configuration for ingestion of TRANSIENT tables, By default, it will skip the TRANSIENT tables.
     * 
     */
    @JsonProperty("includeTransientTables")
    public void setIncludeTransientTables(Boolean includeTransientTables) {
        this.includeTransientTables = includeTransientTables;
    }

    public SnowflakeConnection withIncludeTransientTables(Boolean includeTransientTables) {
        this.includeTransientTables = includeTransientTables;
        return this;
    }

    /**
     * Client Session Keep Alive
     * <p>
     * Optional configuration for ingestion to keep the client session active in case the ingestion process runs for longer durations.
     * 
     */
    @JsonProperty("clientSessionKeepAlive")
    public Boolean getClientSessionKeepAlive() {
        return clientSessionKeepAlive;
    }

    /**
     * Client Session Keep Alive
     * <p>
     * Optional configuration for ingestion to keep the client session active in case the ingestion process runs for longer durations.
     * 
     */
    @JsonProperty("clientSessionKeepAlive")
    public void setClientSessionKeepAlive(Boolean clientSessionKeepAlive) {
        this.clientSessionKeepAlive = clientSessionKeepAlive;
    }

    public SnowflakeConnection withClientSessionKeepAlive(Boolean clientSessionKeepAlive) {
        this.clientSessionKeepAlive = clientSessionKeepAlive;
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

    public SnowflakeConnection withConnectionOptions(ConnectionOptions connectionOptions) {
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

    public SnowflakeConnection withConnectionArguments(ConnectionArguments connectionArguments) {
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

    public SnowflakeConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
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

    public SnowflakeConnection withSupportsUsageExtraction(Boolean supportsUsageExtraction) {
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

    public SnowflakeConnection withSupportsLineageExtraction(Boolean supportsLineageExtraction) {
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

    public SnowflakeConnection withSupportsDBTExtraction(Boolean supportsDBTExtraction) {
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

    public SnowflakeConnection withSupportsProfiler(Boolean supportsProfiler) {
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

    public SnowflakeConnection withSupportsDatabase(Boolean supportsDatabase) {
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

    public SnowflakeConnection withSupportsQueryComment(Boolean supportsQueryComment) {
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

    public SnowflakeConnection withSampleDataStorageConfig(SampleDataStorageConfig sampleDataStorageConfig) {
        this.sampleDataStorageConfig = sampleDataStorageConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SnowflakeConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("account");
        sb.append('=');
        sb.append(((this.account == null)?"<null>":this.account));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("database");
        sb.append('=');
        sb.append(((this.database == null)?"<null>":this.database));
        sb.append(',');
        sb.append("warehouse");
        sb.append('=');
        sb.append(((this.warehouse == null)?"<null>":this.warehouse));
        sb.append(',');
        sb.append("queryTag");
        sb.append('=');
        sb.append(((this.queryTag == null)?"<null>":this.queryTag));
        sb.append(',');
        sb.append("privateKey");
        sb.append('=');
        sb.append(((this.privateKey == null)?"<null>":this.privateKey));
        sb.append(',');
        sb.append("snowflakePrivatekeyPassphrase");
        sb.append('=');
        sb.append(((this.snowflakePrivatekeyPassphrase == null)?"<null>":this.snowflakePrivatekeyPassphrase));
        sb.append(',');
        sb.append("includeTransientTables");
        sb.append('=');
        sb.append(((this.includeTransientTables == null)?"<null>":this.includeTransientTables));
        sb.append(',');
        sb.append("clientSessionKeepAlive");
        sb.append('=');
        sb.append(((this.clientSessionKeepAlive == null)?"<null>":this.clientSessionKeepAlive));
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
        result = ((result* 31)+((this.includeTransientTables == null)? 0 :this.includeTransientTables.hashCode()));
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.queryTag == null)? 0 :this.queryTag.hashCode()));
        result = ((result* 31)+((this.supportsProfiler == null)? 0 :this.supportsProfiler.hashCode()));
        result = ((result* 31)+((this.sampleDataStorageConfig == null)? 0 :this.sampleDataStorageConfig.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.warehouse == null)? 0 :this.warehouse.hashCode()));
        result = ((result* 31)+((this.supportsUsageExtraction == null)? 0 :this.supportsUsageExtraction.hashCode()));
        result = ((result* 31)+((this.supportsDBTExtraction == null)? 0 :this.supportsDBTExtraction.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        result = ((result* 31)+((this.supportsDatabase == null)? 0 :this.supportsDatabase.hashCode()));
        result = ((result* 31)+((this.privateKey == null)? 0 :this.privateKey.hashCode()));
        result = ((result* 31)+((this.clientSessionKeepAlive == null)? 0 :this.clientSessionKeepAlive.hashCode()));
        result = ((result* 31)+((this.supportsLineageExtraction == null)? 0 :this.supportsLineageExtraction.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.database == null)? 0 :this.database.hashCode()));
        result = ((result* 31)+((this.snowflakePrivatekeyPassphrase == null)? 0 :this.snowflakePrivatekeyPassphrase.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.supportsQueryComment == null)? 0 :this.supportsQueryComment.hashCode()));
        result = ((result* 31)+((this.account == null)? 0 :this.account.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SnowflakeConnection) == false) {
            return false;
        }
        SnowflakeConnection rhs = ((SnowflakeConnection) other);
        return ((((((((((((((((((((((((this.includeTransientTables == rhs.includeTransientTables)||((this.includeTransientTables!= null)&&this.includeTransientTables.equals(rhs.includeTransientTables)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.queryTag == rhs.queryTag)||((this.queryTag!= null)&&this.queryTag.equals(rhs.queryTag))))&&((this.supportsProfiler == rhs.supportsProfiler)||((this.supportsProfiler!= null)&&this.supportsProfiler.equals(rhs.supportsProfiler))))&&((this.sampleDataStorageConfig == rhs.sampleDataStorageConfig)||((this.sampleDataStorageConfig!= null)&&this.sampleDataStorageConfig.equals(rhs.sampleDataStorageConfig))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.warehouse == rhs.warehouse)||((this.warehouse!= null)&&this.warehouse.equals(rhs.warehouse))))&&((this.supportsUsageExtraction == rhs.supportsUsageExtraction)||((this.supportsUsageExtraction!= null)&&this.supportsUsageExtraction.equals(rhs.supportsUsageExtraction))))&&((this.supportsDBTExtraction == rhs.supportsDBTExtraction)||((this.supportsDBTExtraction!= null)&&this.supportsDBTExtraction.equals(rhs.supportsDBTExtraction))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))))&&((this.supportsDatabase == rhs.supportsDatabase)||((this.supportsDatabase!= null)&&this.supportsDatabase.equals(rhs.supportsDatabase))))&&((this.privateKey == rhs.privateKey)||((this.privateKey!= null)&&this.privateKey.equals(rhs.privateKey))))&&((this.clientSessionKeepAlive == rhs.clientSessionKeepAlive)||((this.clientSessionKeepAlive!= null)&&this.clientSessionKeepAlive.equals(rhs.clientSessionKeepAlive))))&&((this.supportsLineageExtraction == rhs.supportsLineageExtraction)||((this.supportsLineageExtraction!= null)&&this.supportsLineageExtraction.equals(rhs.supportsLineageExtraction))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.database == rhs.database)||((this.database!= null)&&this.database.equals(rhs.database))))&&((this.snowflakePrivatekeyPassphrase == rhs.snowflakePrivatekeyPassphrase)||((this.snowflakePrivatekeyPassphrase!= null)&&this.snowflakePrivatekeyPassphrase.equals(rhs.snowflakePrivatekeyPassphrase))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.supportsQueryComment == rhs.supportsQueryComment)||((this.supportsQueryComment!= null)&&this.supportsQueryComment.equals(rhs.supportsQueryComment))))&&((this.account == rhs.account)||((this.account!= null)&&this.account.equals(rhs.account))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SnowflakeScheme {

        SNOWFLAKE("snowflake");
        private final String value;
        private final static Map<String, SnowflakeConnection.SnowflakeScheme> CONSTANTS = new HashMap<String, SnowflakeConnection.SnowflakeScheme>();

        static {
            for (SnowflakeConnection.SnowflakeScheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SnowflakeScheme(String value) {
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
        public static SnowflakeConnection.SnowflakeScheme fromValue(String value) {
            SnowflakeConnection.SnowflakeScheme constant = CONSTANTS.get(value);
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
    public enum SnowflakeType {

        SNOWFLAKE("Snowflake");
        private final String value;
        private final static Map<String, SnowflakeConnection.SnowflakeType> CONSTANTS = new HashMap<String, SnowflakeConnection.SnowflakeType>();

        static {
            for (SnowflakeConnection.SnowflakeType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SnowflakeType(String value) {
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
        public static SnowflakeConnection.SnowflakeType fromValue(String value) {
            SnowflakeConnection.SnowflakeType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
