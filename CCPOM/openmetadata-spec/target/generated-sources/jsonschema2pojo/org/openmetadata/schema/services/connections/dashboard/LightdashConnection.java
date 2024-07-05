
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
 * LightdashConnection
 * <p>
 * Lightdash Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "apiKey",
    "projectUUID",
    "spaceUUID",
    "proxyAuthentication",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class LightdashConnection {

    /**
     * Lightdash service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Lightdash service type")
    private LightdashConnection.LightdashType type = LightdashConnection.LightdashType.fromValue("Lightdash");
    /**
     * Host Port
     * <p>
     * Address for your running Lightdash instance
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Address for your running Lightdash instance")
    @ExposedField
    @NotNull
    private URI hostPort = URI.create("http://localhost:5000");
    /**
     * API Key
     * <p>
     * The personal access token you can generate in the Lightdash app under the user settings
     * (Required)
     * 
     */
    @JsonProperty("apiKey")
    @JsonPropertyDescription("The personal access token you can generate in the Lightdash app under the user settings")
    @PasswordField
    @NotNull
    private String apiKey;
    /**
     * Project UUID
     * <p>
     * The Project UUID for your Lightdash instance
     * (Required)
     * 
     */
    @JsonProperty("projectUUID")
    @JsonPropertyDescription("The Project UUID for your Lightdash instance")
    @NotNull
    private String projectUUID;
    /**
     * Space UUID
     * <p>
     * The Space UUID for your Lightdash instance
     * (Required)
     * 
     */
    @JsonProperty("spaceUUID")
    @JsonPropertyDescription("The Space UUID for your Lightdash instance")
    @NotNull
    private String spaceUUID;
    /**
     * Proxy Authentication
     * <p>
     * Use if your Lightdash instance is behind a proxy like (Cloud IAP)
     * 
     */
    @JsonProperty("proxyAuthentication")
    @JsonPropertyDescription("Use if your Lightdash instance is behind a proxy like (Cloud IAP)")
    @PasswordField
    private String proxyAuthentication;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Lightdash service type
     * 
     */
    @JsonProperty("type")
    public LightdashConnection.LightdashType getType() {
        return type;
    }

    /**
     * Lightdash service type
     * 
     */
    @JsonProperty("type")
    public void setType(LightdashConnection.LightdashType type) {
        this.type = type;
    }

    public LightdashConnection withType(LightdashConnection.LightdashType type) {
        this.type = type;
        return this;
    }

    /**
     * Host Port
     * <p>
     * Address for your running Lightdash instance
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public URI getHostPort() {
        return hostPort;
    }

    /**
     * Host Port
     * <p>
     * Address for your running Lightdash instance
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public LightdashConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * API Key
     * <p>
     * The personal access token you can generate in the Lightdash app under the user settings
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
     * The personal access token you can generate in the Lightdash app under the user settings
     * (Required)
     * 
     */
    @JsonProperty("apiKey")
    @PasswordField
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public LightdashConnection withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Project UUID
     * <p>
     * The Project UUID for your Lightdash instance
     * (Required)
     * 
     */
    @JsonProperty("projectUUID")
    public String getProjectUUID() {
        return projectUUID;
    }

    /**
     * Project UUID
     * <p>
     * The Project UUID for your Lightdash instance
     * (Required)
     * 
     */
    @JsonProperty("projectUUID")
    public void setProjectUUID(String projectUUID) {
        this.projectUUID = projectUUID;
    }

    public LightdashConnection withProjectUUID(String projectUUID) {
        this.projectUUID = projectUUID;
        return this;
    }

    /**
     * Space UUID
     * <p>
     * The Space UUID for your Lightdash instance
     * (Required)
     * 
     */
    @JsonProperty("spaceUUID")
    public String getSpaceUUID() {
        return spaceUUID;
    }

    /**
     * Space UUID
     * <p>
     * The Space UUID for your Lightdash instance
     * (Required)
     * 
     */
    @JsonProperty("spaceUUID")
    public void setSpaceUUID(String spaceUUID) {
        this.spaceUUID = spaceUUID;
    }

    public LightdashConnection withSpaceUUID(String spaceUUID) {
        this.spaceUUID = spaceUUID;
        return this;
    }

    /**
     * Proxy Authentication
     * <p>
     * Use if your Lightdash instance is behind a proxy like (Cloud IAP)
     * 
     */
    @JsonProperty("proxyAuthentication")
    @PasswordField
    public String getProxyAuthentication() {
        return proxyAuthentication;
    }

    /**
     * Proxy Authentication
     * <p>
     * Use if your Lightdash instance is behind a proxy like (Cloud IAP)
     * 
     */
    @JsonProperty("proxyAuthentication")
    @PasswordField
    public void setProxyAuthentication(String proxyAuthentication) {
        this.proxyAuthentication = proxyAuthentication;
    }

    public LightdashConnection withProxyAuthentication(String proxyAuthentication) {
        this.proxyAuthentication = proxyAuthentication;
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

    public LightdashConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LightdashConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("apiKey");
        sb.append('=');
        sb.append(((this.apiKey == null)?"<null>":this.apiKey));
        sb.append(',');
        sb.append("projectUUID");
        sb.append('=');
        sb.append(((this.projectUUID == null)?"<null>":this.projectUUID));
        sb.append(',');
        sb.append("spaceUUID");
        sb.append('=');
        sb.append(((this.spaceUUID == null)?"<null>":this.spaceUUID));
        sb.append(',');
        sb.append("proxyAuthentication");
        sb.append('=');
        sb.append(((this.proxyAuthentication == null)?"<null>":this.proxyAuthentication));
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
        result = ((result* 31)+((this.spaceUUID == null)? 0 :this.spaceUUID.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.proxyAuthentication == null)? 0 :this.proxyAuthentication.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.projectUUID == null)? 0 :this.projectUUID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LightdashConnection) == false) {
            return false;
        }
        LightdashConnection rhs = ((LightdashConnection) other);
        return ((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.apiKey == rhs.apiKey)||((this.apiKey!= null)&&this.apiKey.equals(rhs.apiKey))))&&((this.spaceUUID == rhs.spaceUUID)||((this.spaceUUID!= null)&&this.spaceUUID.equals(rhs.spaceUUID))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.proxyAuthentication == rhs.proxyAuthentication)||((this.proxyAuthentication!= null)&&this.proxyAuthentication.equals(rhs.proxyAuthentication))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.projectUUID == rhs.projectUUID)||((this.projectUUID!= null)&&this.projectUUID.equals(rhs.projectUUID))));
    }


    /**
     * Lightdash service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum LightdashType {

        LIGHTDASH("Lightdash");
        private final String value;
        private final static Map<String, LightdashConnection.LightdashType> CONSTANTS = new HashMap<String, LightdashConnection.LightdashType>();

        static {
            for (LightdashConnection.LightdashType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        LightdashType(String value) {
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
        public static LightdashConnection.LightdashType fromValue(String value) {
            LightdashConnection.LightdashType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
