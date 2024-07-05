
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
 * SupersetConnection
 * <p>
 * Superset Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "connection",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class SupersetConnection {

    /**
     * Superset service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Superset service type")
    private SupersetConnection.SupersetType type = SupersetConnection.SupersetType.fromValue("Superset");
    /**
     * Host and Port
     * <p>
     * URL for the superset instance.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("URL for the superset instance.")
    @ExposedField
    @NotNull
    private URI hostPort = URI.create("http://localhost:8088");
    /**
     * Superset Connection
     * <p>
     * Choose between API or database connection fetch metadata from superset.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    @JsonPropertyDescription("Choose between API or database connection fetch metadata from superset.")
    @NotNull
    private Object connection;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Superset service type
     * 
     */
    @JsonProperty("type")
    public SupersetConnection.SupersetType getType() {
        return type;
    }

    /**
     * Superset service type
     * 
     */
    @JsonProperty("type")
    public void setType(SupersetConnection.SupersetType type) {
        this.type = type;
    }

    public SupersetConnection withType(SupersetConnection.SupersetType type) {
        this.type = type;
        return this;
    }

    /**
     * Host and Port
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
     * Host and Port
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

    public SupersetConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Superset Connection
     * <p>
     * Choose between API or database connection fetch metadata from superset.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    public Object getConnection() {
        return connection;
    }

    /**
     * Superset Connection
     * <p>
     * Choose between API or database connection fetch metadata from superset.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    public void setConnection(Object connection) {
        this.connection = connection;
    }

    public SupersetConnection withConnection(Object connection) {
        this.connection = connection;
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

    public SupersetConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupersetConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("connection");
        sb.append('=');
        sb.append(((this.connection == null)?"<null>":this.connection));
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
        result = ((result* 31)+((this.connection == null)? 0 :this.connection.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupersetConnection) == false) {
            return false;
        }
        SupersetConnection rhs = ((SupersetConnection) other);
        return (((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.connection == rhs.connection)||((this.connection!= null)&&this.connection.equals(rhs.connection))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Superset service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SupersetType {

        SUPERSET("Superset");
        private final String value;
        private final static Map<String, SupersetConnection.SupersetType> CONSTANTS = new HashMap<String, SupersetConnection.SupersetType>();

        static {
            for (SupersetConnection.SupersetType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SupersetType(String value) {
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
        public static SupersetConnection.SupersetType fromValue(String value) {
            SupersetConnection.SupersetType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
