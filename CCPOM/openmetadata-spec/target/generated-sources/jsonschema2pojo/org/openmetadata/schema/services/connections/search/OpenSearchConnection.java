
package org.openmetadata.schema.services.connections.search;

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
import org.openmetadata.schema.services.connections.database.ConnectionArguments;
import org.openmetadata.schema.services.connections.database.ConnectionOptions;


/**
 * OpenSearch Connection
 * <p>
 * OpenSearch Connection.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "scheme",
    "username",
    "password",
    "truststorePath",
    "truststorePassword",
    "connectionTimeoutSecs",
    "socketTimeoutSecs",
    "keepAliveTimeoutSecs",
    "connectionOptions",
    "connectionArguments",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class OpenSearchConnection {

    /**
     * OpenSearch service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("OpenSearch service type")
    private OpenSearchConnection.OpenSearchType type = OpenSearchConnection.OpenSearchType.fromValue("OpenSearch");
    /**
     * Host and Port
     * <p>
     * Host and port of the OpenSearch service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the OpenSearch service.")
    @NotNull
    private String hostPort;
    /**
     * Http/Https connection scheme
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("Http/Https connection scheme")
    private String scheme;
    /**
     * OpenSearch Username for Login
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("OpenSearch Username for Login")
    private String username;
    /**
     * OpenSearch Password for Login
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("OpenSearch Password for Login")
    private String password;
    /**
     * Truststore Path
     * 
     */
    @JsonProperty("truststorePath")
    @JsonPropertyDescription("Truststore Path")
    private String truststorePath;
    /**
     * Truststore Password
     * 
     */
    @JsonProperty("truststorePassword")
    @JsonPropertyDescription("Truststore Password")
    private String truststorePassword;
    /**
     * Connection Timeout in Seconds
     * 
     */
    @JsonProperty("connectionTimeoutSecs")
    @JsonPropertyDescription("Connection Timeout in Seconds")
    private Integer connectionTimeoutSecs = 5;
    /**
     * Socket Timeout in Seconds
     * 
     */
    @JsonProperty("socketTimeoutSecs")
    @JsonPropertyDescription("Socket Timeout in Seconds")
    private Integer socketTimeoutSecs = 60;
    /**
     * Keep Alive Timeout in Seconds
     * 
     */
    @JsonProperty("keepAliveTimeoutSecs")
    @JsonPropertyDescription("Keep Alive Timeout in Seconds")
    private Integer keepAliveTimeoutSecs;
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
     * OpenSearch service type
     * 
     */
    @JsonProperty("type")
    public OpenSearchConnection.OpenSearchType getType() {
        return type;
    }

    /**
     * OpenSearch service type
     * 
     */
    @JsonProperty("type")
    public void setType(OpenSearchConnection.OpenSearchType type) {
        this.type = type;
    }

    public OpenSearchConnection withType(OpenSearchConnection.OpenSearchType type) {
        this.type = type;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the OpenSearch service.
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
     * Host and port of the OpenSearch service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public OpenSearchConnection withHostPort(String hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Http/Https connection scheme
     * 
     */
    @JsonProperty("scheme")
    public String getScheme() {
        return scheme;
    }

    /**
     * Http/Https connection scheme
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public OpenSearchConnection withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * OpenSearch Username for Login
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * OpenSearch Username for Login
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public OpenSearchConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * OpenSearch Password for Login
     * 
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * OpenSearch Password for Login
     * 
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public OpenSearchConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Truststore Path
     * 
     */
    @JsonProperty("truststorePath")
    public String getTruststorePath() {
        return truststorePath;
    }

    /**
     * Truststore Path
     * 
     */
    @JsonProperty("truststorePath")
    public void setTruststorePath(String truststorePath) {
        this.truststorePath = truststorePath;
    }

    public OpenSearchConnection withTruststorePath(String truststorePath) {
        this.truststorePath = truststorePath;
        return this;
    }

    /**
     * Truststore Password
     * 
     */
    @JsonProperty("truststorePassword")
    public String getTruststorePassword() {
        return truststorePassword;
    }

    /**
     * Truststore Password
     * 
     */
    @JsonProperty("truststorePassword")
    public void setTruststorePassword(String truststorePassword) {
        this.truststorePassword = truststorePassword;
    }

    public OpenSearchConnection withTruststorePassword(String truststorePassword) {
        this.truststorePassword = truststorePassword;
        return this;
    }

    /**
     * Connection Timeout in Seconds
     * 
     */
    @JsonProperty("connectionTimeoutSecs")
    public Integer getConnectionTimeoutSecs() {
        return connectionTimeoutSecs;
    }

    /**
     * Connection Timeout in Seconds
     * 
     */
    @JsonProperty("connectionTimeoutSecs")
    public void setConnectionTimeoutSecs(Integer connectionTimeoutSecs) {
        this.connectionTimeoutSecs = connectionTimeoutSecs;
    }

    public OpenSearchConnection withConnectionTimeoutSecs(Integer connectionTimeoutSecs) {
        this.connectionTimeoutSecs = connectionTimeoutSecs;
        return this;
    }

    /**
     * Socket Timeout in Seconds
     * 
     */
    @JsonProperty("socketTimeoutSecs")
    public Integer getSocketTimeoutSecs() {
        return socketTimeoutSecs;
    }

    /**
     * Socket Timeout in Seconds
     * 
     */
    @JsonProperty("socketTimeoutSecs")
    public void setSocketTimeoutSecs(Integer socketTimeoutSecs) {
        this.socketTimeoutSecs = socketTimeoutSecs;
    }

    public OpenSearchConnection withSocketTimeoutSecs(Integer socketTimeoutSecs) {
        this.socketTimeoutSecs = socketTimeoutSecs;
        return this;
    }

    /**
     * Keep Alive Timeout in Seconds
     * 
     */
    @JsonProperty("keepAliveTimeoutSecs")
    public Integer getKeepAliveTimeoutSecs() {
        return keepAliveTimeoutSecs;
    }

    /**
     * Keep Alive Timeout in Seconds
     * 
     */
    @JsonProperty("keepAliveTimeoutSecs")
    public void setKeepAliveTimeoutSecs(Integer keepAliveTimeoutSecs) {
        this.keepAliveTimeoutSecs = keepAliveTimeoutSecs;
    }

    public OpenSearchConnection withKeepAliveTimeoutSecs(Integer keepAliveTimeoutSecs) {
        this.keepAliveTimeoutSecs = keepAliveTimeoutSecs;
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

    public OpenSearchConnection withConnectionOptions(ConnectionOptions connectionOptions) {
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

    public OpenSearchConnection withConnectionArguments(ConnectionArguments connectionArguments) {
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

    public OpenSearchConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenSearchConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
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
        sb.append("truststorePath");
        sb.append('=');
        sb.append(((this.truststorePath == null)?"<null>":this.truststorePath));
        sb.append(',');
        sb.append("truststorePassword");
        sb.append('=');
        sb.append(((this.truststorePassword == null)?"<null>":this.truststorePassword));
        sb.append(',');
        sb.append("connectionTimeoutSecs");
        sb.append('=');
        sb.append(((this.connectionTimeoutSecs == null)?"<null>":this.connectionTimeoutSecs));
        sb.append(',');
        sb.append("socketTimeoutSecs");
        sb.append('=');
        sb.append(((this.socketTimeoutSecs == null)?"<null>":this.socketTimeoutSecs));
        sb.append(',');
        sb.append("keepAliveTimeoutSecs");
        sb.append('=');
        sb.append(((this.keepAliveTimeoutSecs == null)?"<null>":this.keepAliveTimeoutSecs));
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
        result = ((result* 31)+((this.socketTimeoutSecs == null)? 0 :this.socketTimeoutSecs.hashCode()));
        result = ((result* 31)+((this.keepAliveTimeoutSecs == null)? 0 :this.keepAliveTimeoutSecs.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.truststorePath == null)? 0 :this.truststorePath.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.truststorePassword == null)? 0 :this.truststorePassword.hashCode()));
        result = ((result* 31)+((this.connectionTimeoutSecs == null)? 0 :this.connectionTimeoutSecs.hashCode()));
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
        if ((other instanceof OpenSearchConnection) == false) {
            return false;
        }
        OpenSearchConnection rhs = ((OpenSearchConnection) other);
        return ((((((((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.socketTimeoutSecs == rhs.socketTimeoutSecs)||((this.socketTimeoutSecs!= null)&&this.socketTimeoutSecs.equals(rhs.socketTimeoutSecs))))&&((this.keepAliveTimeoutSecs == rhs.keepAliveTimeoutSecs)||((this.keepAliveTimeoutSecs!= null)&&this.keepAliveTimeoutSecs.equals(rhs.keepAliveTimeoutSecs))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.truststorePath == rhs.truststorePath)||((this.truststorePath!= null)&&this.truststorePath.equals(rhs.truststorePath))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.truststorePassword == rhs.truststorePassword)||((this.truststorePassword!= null)&&this.truststorePassword.equals(rhs.truststorePassword))))&&((this.connectionTimeoutSecs == rhs.connectionTimeoutSecs)||((this.connectionTimeoutSecs!= null)&&this.connectionTimeoutSecs.equals(rhs.connectionTimeoutSecs))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * OpenSearch service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum OpenSearchType {

        OPEN_SEARCH("OpenSearch");
        private final String value;
        private final static Map<String, OpenSearchConnection.OpenSearchType> CONSTANTS = new HashMap<String, OpenSearchConnection.OpenSearchType>();

        static {
            for (OpenSearchConnection.OpenSearchType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        OpenSearchType(String value) {
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
        public static OpenSearchConnection.OpenSearchType fromValue(String value) {
            OpenSearchConnection.OpenSearchType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
