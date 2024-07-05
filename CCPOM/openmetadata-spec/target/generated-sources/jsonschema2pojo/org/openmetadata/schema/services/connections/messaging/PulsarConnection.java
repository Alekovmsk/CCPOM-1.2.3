
package org.openmetadata.schema.services.connections.messaging;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * PulsarConnection
 * <p>
 * Pulsar Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class PulsarConnection {

    /**
     * Pulsar service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Pulsar service type")
    private PulsarConnection.PulsarType type = PulsarConnection.PulsarType.fromValue("Pulsar");
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Pulsar service type
     * 
     */
    @JsonProperty("type")
    public PulsarConnection.PulsarType getType() {
        return type;
    }

    /**
     * Pulsar service type
     * 
     */
    @JsonProperty("type")
    public void setType(PulsarConnection.PulsarType type) {
        this.type = type;
    }

    public PulsarConnection withType(PulsarConnection.PulsarType type) {
        this.type = type;
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

    public PulsarConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PulsarConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PulsarConnection) == false) {
            return false;
        }
        PulsarConnection rhs = ((PulsarConnection) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))));
    }


    /**
     * Pulsar service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PulsarType {

        PULSAR("Pulsar");
        private final String value;
        private final static Map<String, PulsarConnection.PulsarType> CONSTANTS = new HashMap<String, PulsarConnection.PulsarType>();

        static {
            for (PulsarConnection.PulsarType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PulsarType(String value) {
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
        public static PulsarConnection.PulsarType fromValue(String value) {
            PulsarConnection.PulsarType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
