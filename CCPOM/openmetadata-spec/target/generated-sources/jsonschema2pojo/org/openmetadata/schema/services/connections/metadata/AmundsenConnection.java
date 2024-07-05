
package org.openmetadata.schema.services.connections.metadata;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.annotations.ExposedField;
import org.openmetadata.annotations.PasswordField;


/**
 * AmundsenConnection
 * <p>
 * Amundsen Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "username",
    "password",
    "hostPort",
    "maxConnectionLifeTime",
    "validateSSL",
    "encrypted",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class AmundsenConnection {

    /**
     * Amundsen service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Amundsen service type")
    private AmundsenConnection.AmundsenType type = AmundsenConnection.AmundsenType.fromValue("Amundsen");
    /**
     * username to connect to the Amundsen Neo4j Connection.
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("username to connect to the Amundsen Neo4j Connection.")
    @NotNull
    private String username;
    /**
     * password to connect to the Amundsen Neo4j Connection.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("password to connect to the Amundsen Neo4j Connection.")
    @PasswordField
    @NotNull
    private String password;
    /**
     * Host and Port
     * <p>
     * Host and port of the Amundsen Neo4j Connection. This expect a URI format like: bolt://localhost:7687.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the Amundsen Neo4j Connection. This expect a URI format like: bolt://localhost:7687.")
    @ExposedField
    @NotNull
    private URI hostPort;
    /**
     * Maximum connection lifetime for the Amundsen Neo4j Connection.
     * 
     */
    @JsonProperty("maxConnectionLifeTime")
    @JsonPropertyDescription("Maximum connection lifetime for the Amundsen Neo4j Connection.")
    private Integer maxConnectionLifeTime = 50;
    /**
     * Enable SSL validation for the Amundsen Neo4j Connection.
     * 
     */
    @JsonProperty("validateSSL")
    @JsonPropertyDescription("Enable SSL validation for the Amundsen Neo4j Connection.")
    private Boolean validateSSL = false;
    /**
     * Enable encryption for the Amundsen Neo4j Connection.
     * 
     */
    @JsonProperty("encrypted")
    @JsonPropertyDescription("Enable encryption for the Amundsen Neo4j Connection.")
    private Boolean encrypted = false;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Amundsen service type
     * 
     */
    @JsonProperty("type")
    public AmundsenConnection.AmundsenType getType() {
        return type;
    }

    /**
     * Amundsen service type
     * 
     */
    @JsonProperty("type")
    public void setType(AmundsenConnection.AmundsenType type) {
        this.type = type;
    }

    public AmundsenConnection withType(AmundsenConnection.AmundsenType type) {
        this.type = type;
        return this;
    }

    /**
     * username to connect to the Amundsen Neo4j Connection.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * username to connect to the Amundsen Neo4j Connection.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public AmundsenConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * password to connect to the Amundsen Neo4j Connection.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public String getPassword() {
        return password;
    }

    /**
     * password to connect to the Amundsen Neo4j Connection.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public AmundsenConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the Amundsen Neo4j Connection. This expect a URI format like: bolt://localhost:7687.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public URI getHostPort() {
        return hostPort;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the Amundsen Neo4j Connection. This expect a URI format like: bolt://localhost:7687.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public AmundsenConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Maximum connection lifetime for the Amundsen Neo4j Connection.
     * 
     */
    @JsonProperty("maxConnectionLifeTime")
    public Integer getMaxConnectionLifeTime() {
        return maxConnectionLifeTime;
    }

    /**
     * Maximum connection lifetime for the Amundsen Neo4j Connection.
     * 
     */
    @JsonProperty("maxConnectionLifeTime")
    public void setMaxConnectionLifeTime(Integer maxConnectionLifeTime) {
        this.maxConnectionLifeTime = maxConnectionLifeTime;
    }

    public AmundsenConnection withMaxConnectionLifeTime(Integer maxConnectionLifeTime) {
        this.maxConnectionLifeTime = maxConnectionLifeTime;
        return this;
    }

    /**
     * Enable SSL validation for the Amundsen Neo4j Connection.
     * 
     */
    @JsonProperty("validateSSL")
    public Boolean getValidateSSL() {
        return validateSSL;
    }

    /**
     * Enable SSL validation for the Amundsen Neo4j Connection.
     * 
     */
    @JsonProperty("validateSSL")
    public void setValidateSSL(Boolean validateSSL) {
        this.validateSSL = validateSSL;
    }

    public AmundsenConnection withValidateSSL(Boolean validateSSL) {
        this.validateSSL = validateSSL;
        return this;
    }

    /**
     * Enable encryption for the Amundsen Neo4j Connection.
     * 
     */
    @JsonProperty("encrypted")
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * Enable encryption for the Amundsen Neo4j Connection.
     * 
     */
    @JsonProperty("encrypted")
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public AmundsenConnection withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
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

    public AmundsenConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AmundsenConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        sb.append("maxConnectionLifeTime");
        sb.append('=');
        sb.append(((this.maxConnectionLifeTime == null)?"<null>":this.maxConnectionLifeTime));
        sb.append(',');
        sb.append("validateSSL");
        sb.append('=');
        sb.append(((this.validateSSL == null)?"<null>":this.validateSSL));
        sb.append(',');
        sb.append("encrypted");
        sb.append('=');
        sb.append(((this.encrypted == null)?"<null>":this.encrypted));
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
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.encrypted == null)? 0 :this.encrypted.hashCode()));
        result = ((result* 31)+((this.validateSSL == null)? 0 :this.validateSSL.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.maxConnectionLifeTime == null)? 0 :this.maxConnectionLifeTime.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AmundsenConnection) == false) {
            return false;
        }
        AmundsenConnection rhs = ((AmundsenConnection) other);
        return (((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.encrypted == rhs.encrypted)||((this.encrypted!= null)&&this.encrypted.equals(rhs.encrypted))))&&((this.validateSSL == rhs.validateSSL)||((this.validateSSL!= null)&&this.validateSSL.equals(rhs.validateSSL))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.maxConnectionLifeTime == rhs.maxConnectionLifeTime)||((this.maxConnectionLifeTime!= null)&&this.maxConnectionLifeTime.equals(rhs.maxConnectionLifeTime))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * Amundsen service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AmundsenType {

        AMUNDSEN("Amundsen");
        private final String value;
        private final static Map<String, AmundsenConnection.AmundsenType> CONSTANTS = new HashMap<String, AmundsenConnection.AmundsenType>();

        static {
            for (AmundsenConnection.AmundsenType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AmundsenType(String value) {
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
        public static AmundsenConnection.AmundsenType fromValue(String value) {
            AmundsenConnection.AmundsenType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
