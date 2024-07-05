
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
 * ModeConnection
 * <p>
 * Mode Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "accessToken",
    "accessTokenPassword",
    "workspaceName",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class ModeConnection {

    /**
     * Mode service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Mode service type")
    private ModeConnection.ModeType type = ModeConnection.ModeType.fromValue("Mode");
    /**
     * Host and Port
     * <p>
     * URL for the mode instance.
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("URL for the mode instance.")
    @ExposedField
    private URI hostPort = URI.create("https://app.mode.com");
    /**
     * Access Token
     * <p>
     * Access Token for Mode Dashboard
     * (Required)
     * 
     */
    @JsonProperty("accessToken")
    @JsonPropertyDescription("Access Token for Mode Dashboard")
    @NotNull
    private String accessToken;
    /**
     * Access Token Password
     * <p>
     * Access Token Password for Mode Dashboard
     * (Required)
     * 
     */
    @JsonProperty("accessTokenPassword")
    @JsonPropertyDescription("Access Token Password for Mode Dashboard")
    @PasswordField
    @NotNull
    private String accessTokenPassword;
    /**
     * Workspace Name
     * <p>
     * Mode Workspace Name
     * (Required)
     * 
     */
    @JsonProperty("workspaceName")
    @JsonPropertyDescription("Mode Workspace Name")
    @NotNull
    private String workspaceName;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Mode service type
     * 
     */
    @JsonProperty("type")
    public ModeConnection.ModeType getType() {
        return type;
    }

    /**
     * Mode service type
     * 
     */
    @JsonProperty("type")
    public void setType(ModeConnection.ModeType type) {
        this.type = type;
    }

    public ModeConnection withType(ModeConnection.ModeType type) {
        this.type = type;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * URL for the mode instance.
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
     * URL for the mode instance.
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public ModeConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Access Token
     * <p>
     * Access Token for Mode Dashboard
     * (Required)
     * 
     */
    @JsonProperty("accessToken")
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Access Token
     * <p>
     * Access Token for Mode Dashboard
     * (Required)
     * 
     */
    @JsonProperty("accessToken")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public ModeConnection withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Access Token Password
     * <p>
     * Access Token Password for Mode Dashboard
     * (Required)
     * 
     */
    @JsonProperty("accessTokenPassword")
    @PasswordField
    public String getAccessTokenPassword() {
        return accessTokenPassword;
    }

    /**
     * Access Token Password
     * <p>
     * Access Token Password for Mode Dashboard
     * (Required)
     * 
     */
    @JsonProperty("accessTokenPassword")
    @PasswordField
    public void setAccessTokenPassword(String accessTokenPassword) {
        this.accessTokenPassword = accessTokenPassword;
    }

    public ModeConnection withAccessTokenPassword(String accessTokenPassword) {
        this.accessTokenPassword = accessTokenPassword;
        return this;
    }

    /**
     * Workspace Name
     * <p>
     * Mode Workspace Name
     * (Required)
     * 
     */
    @JsonProperty("workspaceName")
    public String getWorkspaceName() {
        return workspaceName;
    }

    /**
     * Workspace Name
     * <p>
     * Mode Workspace Name
     * (Required)
     * 
     */
    @JsonProperty("workspaceName")
    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public ModeConnection withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
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

    public ModeConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ModeConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("accessToken");
        sb.append('=');
        sb.append(((this.accessToken == null)?"<null>":this.accessToken));
        sb.append(',');
        sb.append("accessTokenPassword");
        sb.append('=');
        sb.append(((this.accessTokenPassword == null)?"<null>":this.accessTokenPassword));
        sb.append(',');
        sb.append("workspaceName");
        sb.append('=');
        sb.append(((this.workspaceName == null)?"<null>":this.workspaceName));
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
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.accessTokenPassword == null)? 0 :this.accessTokenPassword.hashCode()));
        result = ((result* 31)+((this.workspaceName == null)? 0 :this.workspaceName.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.accessToken == null)? 0 :this.accessToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ModeConnection) == false) {
            return false;
        }
        ModeConnection rhs = ((ModeConnection) other);
        return (((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.accessTokenPassword == rhs.accessTokenPassword)||((this.accessTokenPassword!= null)&&this.accessTokenPassword.equals(rhs.accessTokenPassword))))&&((this.workspaceName == rhs.workspaceName)||((this.workspaceName!= null)&&this.workspaceName.equals(rhs.workspaceName))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.accessToken == rhs.accessToken)||((this.accessToken!= null)&&this.accessToken.equals(rhs.accessToken))));
    }


    /**
     * Mode service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ModeType {

        MODE("Mode");
        private final String value;
        private final static Map<String, ModeConnection.ModeType> CONSTANTS = new HashMap<String, ModeConnection.ModeType>();

        static {
            for (ModeConnection.ModeType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ModeType(String value) {
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
        public static ModeConnection.ModeType fromValue(String value) {
            ModeConnection.ModeType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
