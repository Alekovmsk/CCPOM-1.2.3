
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
 * LookerConnection
 * <p>
 * Looker Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "clientId",
    "clientSecret",
    "hostPort",
    "gitCredentials",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class LookerConnection {

    /**
     * Looker service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Looker service type")
    private LookerConnection.LookerType type = LookerConnection.LookerType.fromValue("Looker");
    /**
     * Client ID
     * <p>
     * User's Client ID. This user should have privileges to read all the metadata in Looker.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    @JsonPropertyDescription("User's Client ID. This user should have privileges to read all the metadata in Looker.")
    @NotNull
    private String clientId;
    /**
     * Client Secret
     * <p>
     * User's Client Secret.
     * (Required)
     * 
     */
    @JsonProperty("clientSecret")
    @JsonPropertyDescription("User's Client Secret.")
    @PasswordField
    @NotNull
    private String clientSecret;
    /**
     * Host and Port
     * <p>
     * URL to the Looker instance.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("URL to the Looker instance.")
    @ExposedField
    @NotNull
    private URI hostPort;
    /**
     * GitHub Credentials
     * <p>
     * Credentials to extract the .lkml files from a repository. This is required to get all the lineage and definitions.
     * 
     */
    @JsonProperty("gitCredentials")
    @JsonPropertyDescription("Credentials to extract the .lkml files from a repository. This is required to get all the lineage and definitions.")
    private Object gitCredentials;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Looker service type
     * 
     */
    @JsonProperty("type")
    public LookerConnection.LookerType getType() {
        return type;
    }

    /**
     * Looker service type
     * 
     */
    @JsonProperty("type")
    public void setType(LookerConnection.LookerType type) {
        this.type = type;
    }

    public LookerConnection withType(LookerConnection.LookerType type) {
        this.type = type;
        return this;
    }

    /**
     * Client ID
     * <p>
     * User's Client ID. This user should have privileges to read all the metadata in Looker.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * Client ID
     * <p>
     * User's Client ID. This user should have privileges to read all the metadata in Looker.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LookerConnection withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Client Secret
     * <p>
     * User's Client Secret.
     * (Required)
     * 
     */
    @JsonProperty("clientSecret")
    @PasswordField
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Client Secret
     * <p>
     * User's Client Secret.
     * (Required)
     * 
     */
    @JsonProperty("clientSecret")
    @PasswordField
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public LookerConnection withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * URL to the Looker instance.
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
     * URL to the Looker instance.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public LookerConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * GitHub Credentials
     * <p>
     * Credentials to extract the .lkml files from a repository. This is required to get all the lineage and definitions.
     * 
     */
    @JsonProperty("gitCredentials")
    public Object getGitCredentials() {
        return gitCredentials;
    }

    /**
     * GitHub Credentials
     * <p>
     * Credentials to extract the .lkml files from a repository. This is required to get all the lineage and definitions.
     * 
     */
    @JsonProperty("gitCredentials")
    public void setGitCredentials(Object gitCredentials) {
        this.gitCredentials = gitCredentials;
    }

    public LookerConnection withGitCredentials(Object gitCredentials) {
        this.gitCredentials = gitCredentials;
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

    public LookerConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LookerConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("clientSecret");
        sb.append('=');
        sb.append(((this.clientSecret == null)?"<null>":this.clientSecret));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("gitCredentials");
        sb.append('=');
        sb.append(((this.gitCredentials == null)?"<null>":this.gitCredentials));
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
        result = ((result* 31)+((this.gitCredentials == null)? 0 :this.gitCredentials.hashCode()));
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        result = ((result* 31)+((this.clientSecret == null)? 0 :this.clientSecret.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LookerConnection) == false) {
            return false;
        }
        LookerConnection rhs = ((LookerConnection) other);
        return (((((((this.gitCredentials == rhs.gitCredentials)||((this.gitCredentials!= null)&&this.gitCredentials.equals(rhs.gitCredentials)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId))))&&((this.clientSecret == rhs.clientSecret)||((this.clientSecret!= null)&&this.clientSecret.equals(rhs.clientSecret))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Looker service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum LookerType {

        LOOKER("Looker");
        private final String value;
        private final static Map<String, LookerConnection.LookerType> CONSTANTS = new HashMap<String, LookerConnection.LookerType>();

        static {
            for (LookerConnection.LookerType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        LookerType(String value) {
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
        public static LookerConnection.LookerType fromValue(String value) {
            LookerConnection.LookerType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
