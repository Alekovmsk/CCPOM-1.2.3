
package org.openmetadata.schema.services.connections.dashboard;

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
 * RedashConnection
 * <p>
 * Redash Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "username",
    "hostPort",
    "apiKey",
    "redashVersion",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class RedashConnection {

    /**
     * Redash service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Redash service type")
    private RedashConnection.RedashType type = RedashConnection.RedashType.fromValue("Redash");
    /**
     * Username
     * <p>
     * Username for Redash
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username for Redash")
    @NotNull
    private String username;
    /**
     * Host and Port
     * <p>
     * URL for the Redash instance
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("URL for the Redash instance")
    @ExposedField
    @NotNull
    private URI hostPort = URI.create("http://localhost:5000");
    /**
     * API Key
     * <p>
     * API key of the redash instance to access.
     * (Required)
     * 
     */
    @JsonProperty("apiKey")
    @JsonPropertyDescription("API key of the redash instance to access.")
    @PasswordField
    @NotNull
    private String apiKey;
    /**
     * Redash Version
     * <p>
     * Version of the Redash instance
     * 
     */
    @JsonProperty("redashVersion")
    @JsonPropertyDescription("Version of the Redash instance")
    private String redashVersion = "10.0.0";
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Redash service type
     * 
     */
    @JsonProperty("type")
    public RedashConnection.RedashType getType() {
        return type;
    }

    /**
     * Redash service type
     * 
     */
    @JsonProperty("type")
    public void setType(RedashConnection.RedashType type) {
        this.type = type;
    }

    public RedashConnection withType(RedashConnection.RedashType type) {
        this.type = type;
        return this;
    }

    /**
     * Username
     * <p>
     * Username for Redash
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
     * Username for Redash
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public RedashConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * URL for the Redash instance
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
     * URL for the Redash instance
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public RedashConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * API Key
     * <p>
     * API key of the redash instance to access.
     * (Required)
     * 
     */
    @JsonProperty("apiKey")
    @PasswordField
    public String getApiKey() {
        return apiKey;
    }

    /**
     * API Key
     * <p>
     * API key of the redash instance to access.
     * (Required)
     * 
     */
    @JsonProperty("apiKey")
    @PasswordField
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public RedashConnection withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Redash Version
     * <p>
     * Version of the Redash instance
     * 
     */
    @JsonProperty("redashVersion")
    public String getRedashVersion() {
        return redashVersion;
    }

    /**
     * Redash Version
     * <p>
     * Version of the Redash instance
     * 
     */
    @JsonProperty("redashVersion")
    public void setRedashVersion(String redashVersion) {
        this.redashVersion = redashVersion;
    }

    public RedashConnection withRedashVersion(String redashVersion) {
        this.redashVersion = redashVersion;
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

    public RedashConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RedashConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("apiKey");
        sb.append('=');
        sb.append(((this.apiKey == null)?"<null>":this.apiKey));
        sb.append(',');
        sb.append("redashVersion");
        sb.append('=');
        sb.append(((this.redashVersion == null)?"<null>":this.redashVersion));
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
        result = ((result* 31)+((this.apiKey == null)? 0 :this.apiKey.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.redashVersion == null)? 0 :this.redashVersion.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RedashConnection) == false) {
            return false;
        }
        RedashConnection rhs = ((RedashConnection) other);
        return (((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.apiKey == rhs.apiKey)||((this.apiKey!= null)&&this.apiKey.equals(rhs.apiKey))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.redashVersion == rhs.redashVersion)||((this.redashVersion!= null)&&this.redashVersion.equals(rhs.redashVersion))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * Redash service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RedashType {

        REDASH("Redash");
        private final String value;
        private final static Map<String, RedashConnection.RedashType> CONSTANTS = new HashMap<String, RedashConnection.RedashType>();

        static {
            for (RedashConnection.RedashType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RedashType(String value) {
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
        public static RedashConnection.RedashType fromValue(String value) {
            RedashConnection.RedashType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
