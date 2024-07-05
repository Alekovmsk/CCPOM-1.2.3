
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
 * ImpalaConnection
 * <p>
 * Impala SQL Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "scheme",
    "username",
    "password",
    "hostPort",
    "authMechanism",
    "kerberosServiceName",
    "databaseSchema",
    "databaseName",
    "useSSL",
    "authOptions",
    "connectionOptions",
    "connectionArguments",
    "supportsMetadataExtraction",
    "supportsDBTExtraction",
    "supportsProfiler",
    "sampleDataStorageConfig"
})
@Generated("jsonschema2pojo")
public class ImpalaConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private ImpalaConnection.ImpalaType type = ImpalaConnection.ImpalaType.fromValue("Impala");
    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("SQLAlchemy driver scheme options.")
    private ImpalaConnection.ImpalaScheme scheme = ImpalaConnection.ImpalaScheme.fromValue("impala");
    /**
     * Username
     * <p>
     * Username to connect to Impala. This user should have privileges to read all the metadata in Impala.
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to connect to Impala. This user should have privileges to read all the metadata in Impala.")
    private String username;
    /**
     * Password
     * <p>
     * Password to connect to Impala.
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to connect to Impala.")
    @PasswordField
    private String password;
    /**
     * Host and Port
     * <p>
     * Host and port of the Impala service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the Impala service.")
    @NotNull
    private String hostPort;
    /**
     * Authentication Mode
     * <p>
     * Authentication mode to connect to Impala.
     * 
     */
    @JsonProperty("authMechanism")
    @JsonPropertyDescription("Authentication mode to connect to Impala.")
    private ImpalaConnection.AuthMechanism authMechanism = ImpalaConnection.AuthMechanism.fromValue("PLAIN");
    /**
     * Kerberos Service Name
     * <p>
     * If authenticating with Kerberos specify the Kerberos service name
     * 
     */
    @JsonProperty("kerberosServiceName")
    @JsonPropertyDescription("If authenticating with Kerberos specify the Kerberos service name")
    private String kerberosServiceName;
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
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    @JsonPropertyDescription("Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.")
    private String databaseName;
    /**
     * Use SSL
     * <p>
     * Establish secure connection with Impala
     * 
     */
    @JsonProperty("useSSL")
    @JsonPropertyDescription("Establish secure connection with Impala")
    private Boolean useSSL;
    /**
     * URL Authentication Options
     * <p>
     * Authentication options to pass to Impala connector. These options are based on SQLAlchemy.
     * 
     */
    @JsonProperty("authOptions")
    @JsonPropertyDescription("Authentication options to pass to Impala connector. These options are based on SQLAlchemy.")
    private String authOptions;
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
    public ImpalaConnection.ImpalaType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(ImpalaConnection.ImpalaType type) {
        this.type = type;
    }

    public ImpalaConnection withType(ImpalaConnection.ImpalaType type) {
        this.type = type;
        return this;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public ImpalaConnection.ImpalaScheme getScheme() {
        return scheme;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(ImpalaConnection.ImpalaScheme scheme) {
        this.scheme = scheme;
    }

    public ImpalaConnection withScheme(ImpalaConnection.ImpalaScheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Username
     * <p>
     * Username to connect to Impala. This user should have privileges to read all the metadata in Impala.
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Username
     * <p>
     * Username to connect to Impala. This user should have privileges to read all the metadata in Impala.
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public ImpalaConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * <p>
     * Password to connect to Impala.
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
     * Password to connect to Impala.
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public ImpalaConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the Impala service.
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
     * Host and port of the Impala service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public ImpalaConnection withHostPort(String hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Authentication Mode
     * <p>
     * Authentication mode to connect to Impala.
     * 
     */
    @JsonProperty("authMechanism")
    public ImpalaConnection.AuthMechanism getAuthMechanism() {
        return authMechanism;
    }

    /**
     * Authentication Mode
     * <p>
     * Authentication mode to connect to Impala.
     * 
     */
    @JsonProperty("authMechanism")
    public void setAuthMechanism(ImpalaConnection.AuthMechanism authMechanism) {
        this.authMechanism = authMechanism;
    }

    public ImpalaConnection withAuthMechanism(ImpalaConnection.AuthMechanism authMechanism) {
        this.authMechanism = authMechanism;
        return this;
    }

    /**
     * Kerberos Service Name
     * <p>
     * If authenticating with Kerberos specify the Kerberos service name
     * 
     */
    @JsonProperty("kerberosServiceName")
    public String getKerberosServiceName() {
        return kerberosServiceName;
    }

    /**
     * Kerberos Service Name
     * <p>
     * If authenticating with Kerberos specify the Kerberos service name
     * 
     */
    @JsonProperty("kerberosServiceName")
    public void setKerberosServiceName(String kerberosServiceName) {
        this.kerberosServiceName = kerberosServiceName;
    }

    public ImpalaConnection withKerberosServiceName(String kerberosServiceName) {
        this.kerberosServiceName = kerberosServiceName;
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

    public ImpalaConnection withDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
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

    public ImpalaConnection withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Use SSL
     * <p>
     * Establish secure connection with Impala
     * 
     */
    @JsonProperty("useSSL")
    public Boolean getUseSSL() {
        return useSSL;
    }

    /**
     * Use SSL
     * <p>
     * Establish secure connection with Impala
     * 
     */
    @JsonProperty("useSSL")
    public void setUseSSL(Boolean useSSL) {
        this.useSSL = useSSL;
    }

    public ImpalaConnection withUseSSL(Boolean useSSL) {
        this.useSSL = useSSL;
        return this;
    }

    /**
     * URL Authentication Options
     * <p>
     * Authentication options to pass to Impala connector. These options are based on SQLAlchemy.
     * 
     */
    @JsonProperty("authOptions")
    public String getAuthOptions() {
        return authOptions;
    }

    /**
     * URL Authentication Options
     * <p>
     * Authentication options to pass to Impala connector. These options are based on SQLAlchemy.
     * 
     */
    @JsonProperty("authOptions")
    public void setAuthOptions(String authOptions) {
        this.authOptions = authOptions;
    }

    public ImpalaConnection withAuthOptions(String authOptions) {
        this.authOptions = authOptions;
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

    public ImpalaConnection withConnectionOptions(ConnectionOptions connectionOptions) {
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

    public ImpalaConnection withConnectionArguments(ConnectionArguments connectionArguments) {
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

    public ImpalaConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
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

    public ImpalaConnection withSupportsDBTExtraction(Boolean supportsDBTExtraction) {
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

    public ImpalaConnection withSupportsProfiler(Boolean supportsProfiler) {
        this.supportsProfiler = supportsProfiler;
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

    public ImpalaConnection withSampleDataStorageConfig(SampleDataStorageConfig sampleDataStorageConfig) {
        this.sampleDataStorageConfig = sampleDataStorageConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImpalaConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("authMechanism");
        sb.append('=');
        sb.append(((this.authMechanism == null)?"<null>":this.authMechanism));
        sb.append(',');
        sb.append("kerberosServiceName");
        sb.append('=');
        sb.append(((this.kerberosServiceName == null)?"<null>":this.kerberosServiceName));
        sb.append(',');
        sb.append("databaseSchema");
        sb.append('=');
        sb.append(((this.databaseSchema == null)?"<null>":this.databaseSchema));
        sb.append(',');
        sb.append("databaseName");
        sb.append('=');
        sb.append(((this.databaseName == null)?"<null>":this.databaseName));
        sb.append(',');
        sb.append("useSSL");
        sb.append('=');
        sb.append(((this.useSSL == null)?"<null>":this.useSSL));
        sb.append(',');
        sb.append("authOptions");
        sb.append('=');
        sb.append(((this.authOptions == null)?"<null>":this.authOptions));
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
        sb.append("supportsDBTExtraction");
        sb.append('=');
        sb.append(((this.supportsDBTExtraction == null)?"<null>":this.supportsDBTExtraction));
        sb.append(',');
        sb.append("supportsProfiler");
        sb.append('=');
        sb.append(((this.supportsProfiler == null)?"<null>":this.supportsProfiler));
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
        result = ((result* 31)+((this.authOptions == null)? 0 :this.authOptions.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.databaseName == null)? 0 :this.databaseName.hashCode()));
        result = ((result* 31)+((this.supportsProfiler == null)? 0 :this.supportsProfiler.hashCode()));
        result = ((result* 31)+((this.sampleDataStorageConfig == null)? 0 :this.sampleDataStorageConfig.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.kerberosServiceName == null)? 0 :this.kerberosServiceName.hashCode()));
        result = ((result* 31)+((this.supportsDBTExtraction == null)? 0 :this.supportsDBTExtraction.hashCode()));
        result = ((result* 31)+((this.useSSL == null)? 0 :this.useSSL.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.authMechanism == null)? 0 :this.authMechanism.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImpalaConnection) == false) {
            return false;
        }
        ImpalaConnection rhs = ((ImpalaConnection) other);
        return ((((((((((((((((((this.databaseSchema == rhs.databaseSchema)||((this.databaseSchema!= null)&&this.databaseSchema.equals(rhs.databaseSchema)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.authOptions == rhs.authOptions)||((this.authOptions!= null)&&this.authOptions.equals(rhs.authOptions))))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.databaseName == rhs.databaseName)||((this.databaseName!= null)&&this.databaseName.equals(rhs.databaseName))))&&((this.supportsProfiler == rhs.supportsProfiler)||((this.supportsProfiler!= null)&&this.supportsProfiler.equals(rhs.supportsProfiler))))&&((this.sampleDataStorageConfig == rhs.sampleDataStorageConfig)||((this.sampleDataStorageConfig!= null)&&this.sampleDataStorageConfig.equals(rhs.sampleDataStorageConfig))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.kerberosServiceName == rhs.kerberosServiceName)||((this.kerberosServiceName!= null)&&this.kerberosServiceName.equals(rhs.kerberosServiceName))))&&((this.supportsDBTExtraction == rhs.supportsDBTExtraction)||((this.supportsDBTExtraction!= null)&&this.supportsDBTExtraction.equals(rhs.supportsDBTExtraction))))&&((this.useSSL == rhs.useSSL)||((this.useSSL!= null)&&this.useSSL.equals(rhs.useSSL))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.authMechanism == rhs.authMechanism)||((this.authMechanism!= null)&&this.authMechanism.equals(rhs.authMechanism))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * Authentication Mode
     * <p>
     * Authentication mode to connect to Impala.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AuthMechanism {

        NOSASL("NOSASL"),
        PLAIN("PLAIN"),
        GSSAPI("GSSAPI"),
        LDAP("LDAP"),
        JWT("JWT");
        private final String value;
        private final static Map<String, ImpalaConnection.AuthMechanism> CONSTANTS = new HashMap<String, ImpalaConnection.AuthMechanism>();

        static {
            for (ImpalaConnection.AuthMechanism c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AuthMechanism(String value) {
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
        public static ImpalaConnection.AuthMechanism fromValue(String value) {
            ImpalaConnection.AuthMechanism constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ImpalaScheme {

        IMPALA("impala"),
        IMPALA_4("impala4");
        private final String value;
        private final static Map<String, ImpalaConnection.ImpalaScheme> CONSTANTS = new HashMap<String, ImpalaConnection.ImpalaScheme>();

        static {
            for (ImpalaConnection.ImpalaScheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ImpalaScheme(String value) {
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
        public static ImpalaConnection.ImpalaScheme fromValue(String value) {
            ImpalaConnection.ImpalaScheme constant = CONSTANTS.get(value);
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
    public enum ImpalaType {

        IMPALA("Impala");
        private final String value;
        private final static Map<String, ImpalaConnection.ImpalaType> CONSTANTS = new HashMap<String, ImpalaConnection.ImpalaType>();

        static {
            for (ImpalaConnection.ImpalaType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ImpalaType(String value) {
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
        public static ImpalaConnection.ImpalaType fromValue(String value) {
            ImpalaConnection.ImpalaType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
