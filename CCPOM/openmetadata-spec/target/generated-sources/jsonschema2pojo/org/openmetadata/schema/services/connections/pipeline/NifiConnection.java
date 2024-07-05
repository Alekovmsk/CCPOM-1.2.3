
package org.openmetadata.schema.services.connections.pipeline;

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
 * NifiConnection
 * <p>
 * Nifi Metadata Pipeline Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "nifiConfig",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class NifiConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private NifiConnection.NifiType type = NifiConnection.NifiType.fromValue("Nifi");
    /**
     * Host And Port
     * <p>
     * Pipeline Service Management/UI URI.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Pipeline Service Management/UI URI.")
    @ExposedField
    @NotNull
    private URI hostPort;
    /**
     * Nifi Credentials Configuration
     * <p>
     * We support username/password or client certificate authentication
     * (Required)
     * 
     */
    @JsonProperty("nifiConfig")
    @JsonPropertyDescription("We support username/password or client certificate authentication")
    @NotNull
    private Object nifiConfig;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public NifiConnection.NifiType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(NifiConnection.NifiType type) {
        this.type = type;
    }

    public NifiConnection withType(NifiConnection.NifiType type) {
        this.type = type;
        return this;
    }

    /**
     * Host And Port
     * <p>
     * Pipeline Service Management/UI URI.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public URI getHostPort() {
        return hostPort;
    }

    /**
     * Host And Port
     * <p>
     * Pipeline Service Management/UI URI.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public NifiConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Nifi Credentials Configuration
     * <p>
     * We support username/password or client certificate authentication
     * (Required)
     * 
     */
    @JsonProperty("nifiConfig")
    public Object getNifiConfig() {
        return nifiConfig;
    }

    /**
     * Nifi Credentials Configuration
     * <p>
     * We support username/password or client certificate authentication
     * (Required)
     * 
     */
    @JsonProperty("nifiConfig")
    public void setNifiConfig(Object nifiConfig) {
        this.nifiConfig = nifiConfig;
    }

    public NifiConnection withNifiConfig(Object nifiConfig) {
        this.nifiConfig = nifiConfig;
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

    public NifiConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NifiConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("nifiConfig");
        sb.append('=');
        sb.append(((this.nifiConfig == null)?"<null>":this.nifiConfig));
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
        result = ((result* 31)+((this.nifiConfig == null)? 0 :this.nifiConfig.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NifiConnection) == false) {
            return false;
        }
        NifiConnection rhs = ((NifiConnection) other);
        return (((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.nifiConfig == rhs.nifiConfig)||((this.nifiConfig!= null)&&this.nifiConfig.equals(rhs.nifiConfig))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum NifiType {

        NIFI("Nifi");
        private final String value;
        private final static Map<String, NifiConnection.NifiType> CONSTANTS = new HashMap<String, NifiConnection.NifiType>();

        static {
            for (NifiConnection.NifiType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        NifiType(String value) {
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
        public static NifiConnection.NifiType fromValue(String value) {
            NifiConnection.NifiType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
