
package org.openmetadata.schema.services.connections.mlmodel;

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


/**
 * MlflowConnection
 * <p>
 * MlFlow Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "trackingUri",
    "registryUri",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class MlflowConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private MlflowConnection.MlflowType type = MlflowConnection.MlflowType.fromValue("Mlflow");
    /**
     * Tracking URI
     * <p>
     * Mlflow Experiment tracking URI. E.g., http://localhost:5000
     * (Required)
     * 
     */
    @JsonProperty("trackingUri")
    @JsonPropertyDescription("Mlflow Experiment tracking URI. E.g., http://localhost:5000")
    @NotNull
    private String trackingUri;
    /**
     * Registry URI
     * <p>
     * Mlflow Model registry backend. E.g., mysql+pymysql://mlflow:password@localhost:3307/experiments
     * (Required)
     * 
     */
    @JsonProperty("registryUri")
    @JsonPropertyDescription("Mlflow Model registry backend. E.g., mysql+pymysql://mlflow:password@localhost:3307/experiments")
    @NotNull
    private String registryUri;
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
    public MlflowConnection.MlflowType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(MlflowConnection.MlflowType type) {
        this.type = type;
    }

    public MlflowConnection withType(MlflowConnection.MlflowType type) {
        this.type = type;
        return this;
    }

    /**
     * Tracking URI
     * <p>
     * Mlflow Experiment tracking URI. E.g., http://localhost:5000
     * (Required)
     * 
     */
    @JsonProperty("trackingUri")
    public String getTrackingUri() {
        return trackingUri;
    }

    /**
     * Tracking URI
     * <p>
     * Mlflow Experiment tracking URI. E.g., http://localhost:5000
     * (Required)
     * 
     */
    @JsonProperty("trackingUri")
    public void setTrackingUri(String trackingUri) {
        this.trackingUri = trackingUri;
    }

    public MlflowConnection withTrackingUri(String trackingUri) {
        this.trackingUri = trackingUri;
        return this;
    }

    /**
     * Registry URI
     * <p>
     * Mlflow Model registry backend. E.g., mysql+pymysql://mlflow:password@localhost:3307/experiments
     * (Required)
     * 
     */
    @JsonProperty("registryUri")
    public String getRegistryUri() {
        return registryUri;
    }

    /**
     * Registry URI
     * <p>
     * Mlflow Model registry backend. E.g., mysql+pymysql://mlflow:password@localhost:3307/experiments
     * (Required)
     * 
     */
    @JsonProperty("registryUri")
    public void setRegistryUri(String registryUri) {
        this.registryUri = registryUri;
    }

    public MlflowConnection withRegistryUri(String registryUri) {
        this.registryUri = registryUri;
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

    public MlflowConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MlflowConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("trackingUri");
        sb.append('=');
        sb.append(((this.trackingUri == null)?"<null>":this.trackingUri));
        sb.append(',');
        sb.append("registryUri");
        sb.append('=');
        sb.append(((this.registryUri == null)?"<null>":this.registryUri));
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
        result = ((result* 31)+((this.trackingUri == null)? 0 :this.trackingUri.hashCode()));
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.registryUri == null)? 0 :this.registryUri.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MlflowConnection) == false) {
            return false;
        }
        MlflowConnection rhs = ((MlflowConnection) other);
        return (((((this.trackingUri == rhs.trackingUri)||((this.trackingUri!= null)&&this.trackingUri.equals(rhs.trackingUri)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.registryUri == rhs.registryUri)||((this.registryUri!= null)&&this.registryUri.equals(rhs.registryUri))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MlflowType {

        MLFLOW("Mlflow");
        private final String value;
        private final static Map<String, MlflowConnection.MlflowType> CONSTANTS = new HashMap<String, MlflowConnection.MlflowType>();

        static {
            for (MlflowConnection.MlflowType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MlflowType(String value) {
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
        public static MlflowConnection.MlflowType fromValue(String value) {
            MlflowConnection.MlflowType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
