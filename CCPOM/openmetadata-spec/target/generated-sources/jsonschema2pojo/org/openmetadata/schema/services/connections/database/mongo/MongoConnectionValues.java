
package org.openmetadata.schema.services.connections.database.mongo;

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
import org.openmetadata.schema.services.connections.database.ConnectionOptions;


/**
 * Mongo Connection Values
 * <p>
 * Azure Datalake Storage will ingest files in container
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "scheme",
    "username",
    "password",
    "hostPort",
    "connectionOptions"
})
@Generated("jsonschema2pojo")
public class MongoConnectionValues {

    /**
     * Mongo connection scheme options.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("Mongo connection scheme options.")
    private MongoConnectionValues.MongoDBScheme scheme = MongoConnectionValues.MongoDBScheme.fromValue("mongodb");
    /**
     * Username
     * <p>
     * Username to connect to MongoDB. This user should have privileges to read all the metadata in MongoDB.
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to connect to MongoDB. This user should have privileges to read all the metadata in MongoDB.")
    private String username;
    /**
     * Password
     * <p>
     * Password to connect to MongoDB.
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to connect to MongoDB.")
    @PasswordField
    private String password;
    /**
     * Host and Port
     * <p>
     * Host and port of the MongoDB service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the MongoDB service.")
    @NotNull
    private String hostPort;
    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    @JsonPropertyDescription("Additional connection options to build the URL that can be sent to service during the connection.")
    @Valid
    private ConnectionOptions connectionOptions;

    /**
     * Mongo connection scheme options.
     * 
     */
    @JsonProperty("scheme")
    public MongoConnectionValues.MongoDBScheme getScheme() {
        return scheme;
    }

    /**
     * Mongo connection scheme options.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(MongoConnectionValues.MongoDBScheme scheme) {
        this.scheme = scheme;
    }

    public MongoConnectionValues withScheme(MongoConnectionValues.MongoDBScheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Username
     * <p>
     * Username to connect to MongoDB. This user should have privileges to read all the metadata in MongoDB.
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Username
     * <p>
     * Username to connect to MongoDB. This user should have privileges to read all the metadata in MongoDB.
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public MongoConnectionValues withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * <p>
     * Password to connect to MongoDB.
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
     * Password to connect to MongoDB.
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public MongoConnectionValues withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the MongoDB service.
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
     * Host and port of the MongoDB service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public MongoConnectionValues withHostPort(String hostPort) {
        this.hostPort = hostPort;
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

    public MongoConnectionValues withConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MongoConnectionValues.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("connectionOptions");
        sb.append('=');
        sb.append(((this.connectionOptions == null)?"<null>":this.connectionOptions));
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
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MongoConnectionValues) == false) {
            return false;
        }
        MongoConnectionValues rhs = ((MongoConnectionValues) other);
        return ((((((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password)))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * Mongo connection scheme options.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MongoDBScheme {

        MONGODB("mongodb"),
        MONGODB_SRV("mongodb+srv");
        private final String value;
        private final static Map<String, MongoConnectionValues.MongoDBScheme> CONSTANTS = new HashMap<String, MongoConnectionValues.MongoDBScheme>();

        static {
            for (MongoConnectionValues.MongoDBScheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MongoDBScheme(String value) {
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
        public static MongoConnectionValues.MongoDBScheme fromValue(String value) {
            MongoConnectionValues.MongoDBScheme constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
