
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


/**
 * QlikSenseConnection
 * <p>
 * Qlik Sense Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "displayUrl",
    "hostPort",
    "certificates",
    "userDirectory",
    "userId",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class QlikSenseConnection {

    /**
     * Qlik sense service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Qlik sense service type")
    private QlikSenseConnection.QlikSenseType type = QlikSenseConnection.QlikSenseType.fromValue("QlikSense");
    /**
     * Qlik Sense Base URL
     * <p>
     * Qlik Sense Base URL, used for genrating dashboard & chat url
     * 
     */
    @JsonProperty("displayUrl")
    @JsonPropertyDescription("Qlik Sense Base URL, used for genrating dashboard & chat url")
    @ExposedField
    private URI displayUrl;
    /**
     * Qlik Engine JSON API Websocket URL
     * <p>
     * URL for the superset instance.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("URL for the superset instance.")
    @ExposedField
    @NotNull
    private URI hostPort;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificates")
    @NotNull
    private Object certificates;
    /**
     * User Directory
     * <p>
     * User Directory.
     * 
     */
    @JsonProperty("userDirectory")
    @JsonPropertyDescription("User Directory.")
    private String userDirectory;
    /**
     * User ID
     * <p>
     * User ID.
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("User ID.")
    private String userId;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Qlik sense service type
     * 
     */
    @JsonProperty("type")
    public QlikSenseConnection.QlikSenseType getType() {
        return type;
    }

    /**
     * Qlik sense service type
     * 
     */
    @JsonProperty("type")
    public void setType(QlikSenseConnection.QlikSenseType type) {
        this.type = type;
    }

    public QlikSenseConnection withType(QlikSenseConnection.QlikSenseType type) {
        this.type = type;
        return this;
    }

    /**
     * Qlik Sense Base URL
     * <p>
     * Qlik Sense Base URL, used for genrating dashboard & chat url
     * 
     */
    @JsonProperty("displayUrl")
    @ExposedField
    public URI getDisplayUrl() {
        return displayUrl;
    }

    /**
     * Qlik Sense Base URL
     * <p>
     * Qlik Sense Base URL, used for genrating dashboard & chat url
     * 
     */
    @JsonProperty("displayUrl")
    @ExposedField
    public void setDisplayUrl(URI displayUrl) {
        this.displayUrl = displayUrl;
    }

    public QlikSenseConnection withDisplayUrl(URI displayUrl) {
        this.displayUrl = displayUrl;
        return this;
    }

    /**
     * Qlik Engine JSON API Websocket URL
     * <p>
     * URL for the superset instance.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public URI getHostPort() {
        return hostPort;
    }

    /**
     * Qlik Engine JSON API Websocket URL
     * <p>
     * URL for the superset instance.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public QlikSenseConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificates")
    public Object getCertificates() {
        return certificates;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("certificates")
    public void setCertificates(Object certificates) {
        this.certificates = certificates;
    }

    public QlikSenseConnection withCertificates(Object certificates) {
        this.certificates = certificates;
        return this;
    }

    /**
     * User Directory
     * <p>
     * User Directory.
     * 
     */
    @JsonProperty("userDirectory")
    public String getUserDirectory() {
        return userDirectory;
    }

    /**
     * User Directory
     * <p>
     * User Directory.
     * 
     */
    @JsonProperty("userDirectory")
    public void setUserDirectory(String userDirectory) {
        this.userDirectory = userDirectory;
    }

    public QlikSenseConnection withUserDirectory(String userDirectory) {
        this.userDirectory = userDirectory;
        return this;
    }

    /**
     * User ID
     * <p>
     * User ID.
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * User ID.
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public QlikSenseConnection withUserId(String userId) {
        this.userId = userId;
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

    public QlikSenseConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QlikSenseConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("displayUrl");
        sb.append('=');
        sb.append(((this.displayUrl == null)?"<null>":this.displayUrl));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("certificates");
        sb.append('=');
        sb.append(((this.certificates == null)?"<null>":this.certificates));
        sb.append(',');
        sb.append("userDirectory");
        sb.append('=');
        sb.append(((this.userDirectory == null)?"<null>":this.userDirectory));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.displayUrl == null)? 0 :this.displayUrl.hashCode()));
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.userDirectory == null)? 0 :this.userDirectory.hashCode()));
        result = ((result* 31)+((this.certificates == null)? 0 :this.certificates.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QlikSenseConnection) == false) {
            return false;
        }
        QlikSenseConnection rhs = ((QlikSenseConnection) other);
        return ((((((((this.displayUrl == rhs.displayUrl)||((this.displayUrl!= null)&&this.displayUrl.equals(rhs.displayUrl)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.userDirectory == rhs.userDirectory)||((this.userDirectory!= null)&&this.userDirectory.equals(rhs.userDirectory))))&&((this.certificates == rhs.certificates)||((this.certificates!= null)&&this.certificates.equals(rhs.certificates))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }


    /**
     * Qlik sense service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum QlikSenseType {

        QLIK_SENSE("QlikSense");
        private final String value;
        private final static Map<String, QlikSenseConnection.QlikSenseType> CONSTANTS = new HashMap<String, QlikSenseConnection.QlikSenseType>();

        static {
            for (QlikSenseConnection.QlikSenseType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        QlikSenseType(String value) {
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
        public static QlikSenseConnection.QlikSenseType fromValue(String value) {
            QlikSenseConnection.QlikSenseType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
