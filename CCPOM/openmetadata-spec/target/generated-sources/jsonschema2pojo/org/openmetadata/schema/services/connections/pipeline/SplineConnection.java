
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
 * SplineConnection
 * <p>
 * Spline Metadata Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "uiHostPort",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class SplineConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private SplineConnection.SplineType type = SplineConnection.SplineType.fromValue("Spline");
    /**
     * Spline REST Server Host & Port
     * <p>
     * Spline REST Server Host & Port.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Spline REST Server Host & Port.")
    @ExposedField
    @NotNull
    private URI hostPort;
    /**
     * Spline UI Host & Port
     * <p>
     * Spline UI Host & Port.
     * 
     */
    @JsonProperty("uiHostPort")
    @JsonPropertyDescription("Spline UI Host & Port.")
    @ExposedField
    private URI uiHostPort;
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
    public SplineConnection.SplineType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(SplineConnection.SplineType type) {
        this.type = type;
    }

    public SplineConnection withType(SplineConnection.SplineType type) {
        this.type = type;
        return this;
    }

    /**
     * Spline REST Server Host & Port
     * <p>
     * Spline REST Server Host & Port.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public URI getHostPort() {
        return hostPort;
    }

    /**
     * Spline REST Server Host & Port
     * <p>
     * Spline REST Server Host & Port.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public SplineConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Spline UI Host & Port
     * <p>
     * Spline UI Host & Port.
     * 
     */
    @JsonProperty("uiHostPort")
    @ExposedField
    public URI getUiHostPort() {
        return uiHostPort;
    }

    /**
     * Spline UI Host & Port
     * <p>
     * Spline UI Host & Port.
     * 
     */
    @JsonProperty("uiHostPort")
    @ExposedField
    public void setUiHostPort(URI uiHostPort) {
        this.uiHostPort = uiHostPort;
    }

    public SplineConnection withUiHostPort(URI uiHostPort) {
        this.uiHostPort = uiHostPort;
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

    public SplineConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SplineConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("uiHostPort");
        sb.append('=');
        sb.append(((this.uiHostPort == null)?"<null>":this.uiHostPort));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.uiHostPort == null)? 0 :this.uiHostPort.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SplineConnection) == false) {
            return false;
        }
        SplineConnection rhs = ((SplineConnection) other);
        return (((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.uiHostPort == rhs.uiHostPort)||((this.uiHostPort!= null)&&this.uiHostPort.equals(rhs.uiHostPort))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SplineType {

        SPLINE("Spline");
        private final String value;
        private final static Map<String, SplineConnection.SplineType> CONSTANTS = new HashMap<String, SplineConnection.SplineType>();

        static {
            for (SplineConnection.SplineType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SplineType(String value) {
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
        public static SplineConnection.SplineType fromValue(String value) {
            SplineConnection.SplineType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
