
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
import org.openmetadata.annotations.PasswordField;


/**
 * FivetranConnection
 * <p>
 * Fivetran Metadata Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "apiKey",
    "hostPort",
    "apiSecret",
    "limit",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class FivetranConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private FivetranConnection.FivetranType type = FivetranConnection.FivetranType.fromValue("Fivetran");
    /**
     * Fivetran API Key
     * <p>
     * Fivetran API Secret.
     * (Required)
     * 
     */
    @JsonProperty("apiKey")
    @JsonPropertyDescription("Fivetran API Secret.")
    @NotNull
    private String apiKey;
    /**
     * Host And Port
     * <p>
     * Pipeline Service Management/UI URI.
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Pipeline Service Management/UI URI.")
    @ExposedField
    private URI hostPort = URI.create("https://api.fivetran.com");
    /**
     * Fivetran API Secret
     * <p>
     * Fivetran API Secret.
     * (Required)
     * 
     */
    @JsonProperty("apiSecret")
    @JsonPropertyDescription("Fivetran API Secret.")
    @PasswordField
    @NotNull
    private String apiSecret;
    /**
     * Fivetran API Limit
     * <p>
     * Fivetran API Limit For Pagination.
     * 
     */
    @JsonProperty("limit")
    @JsonPropertyDescription("Fivetran API Limit For Pagination.")
    private Integer limit = 1000;
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
    public FivetranConnection.FivetranType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(FivetranConnection.FivetranType type) {
        this.type = type;
    }

    public FivetranConnection withType(FivetranConnection.FivetranType type) {
        this.type = type;
        return this;
    }

    /**
     * Fivetran API Key
     * <p>
     * Fivetran API Secret.
     * (Required)
     * 
     */
    @JsonProperty("apiKey")
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Fivetran API Key
     * <p>
     * Fivetran API Secret.
     * (Required)
     * 
     */
    @JsonProperty("apiKey")
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public FivetranConnection withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Host And Port
     * <p>
     * Pipeline Service Management/UI URI.
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
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public FivetranConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Fivetran API Secret
     * <p>
     * Fivetran API Secret.
     * (Required)
     * 
     */
    @JsonProperty("apiSecret")
    @PasswordField
    public String getApiSecret() {
        return apiSecret;
    }

    /**
     * Fivetran API Secret
     * <p>
     * Fivetran API Secret.
     * (Required)
     * 
     */
    @JsonProperty("apiSecret")
    @PasswordField
    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }

    public FivetranConnection withApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
        return this;
    }

    /**
     * Fivetran API Limit
     * <p>
     * Fivetran API Limit For Pagination.
     * 
     */
    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    /**
     * Fivetran API Limit
     * <p>
     * Fivetran API Limit For Pagination.
     * 
     */
    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public FivetranConnection withLimit(Integer limit) {
        this.limit = limit;
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

    public FivetranConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FivetranConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("apiKey");
        sb.append('=');
        sb.append(((this.apiKey == null)?"<null>":this.apiKey));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("apiSecret");
        sb.append('=');
        sb.append(((this.apiSecret == null)?"<null>":this.apiSecret));
        sb.append(',');
        sb.append("limit");
        sb.append('=');
        sb.append(((this.limit == null)?"<null>":this.limit));
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
        result = ((result* 31)+((this.limit == null)? 0 :this.limit.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.apiSecret == null)? 0 :this.apiSecret.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FivetranConnection) == false) {
            return false;
        }
        FivetranConnection rhs = ((FivetranConnection) other);
        return (((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.apiKey == rhs.apiKey)||((this.apiKey!= null)&&this.apiKey.equals(rhs.apiKey))))&&((this.limit == rhs.limit)||((this.limit!= null)&&this.limit.equals(rhs.limit))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.apiSecret == rhs.apiSecret)||((this.apiSecret!= null)&&this.apiSecret.equals(rhs.apiSecret))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum FivetranType {

        FIVETRAN("Fivetran");
        private final String value;
        private final static Map<String, FivetranConnection.FivetranType> CONSTANTS = new HashMap<String, FivetranConnection.FivetranType>();

        static {
            for (FivetranConnection.FivetranType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        FivetranType(String value) {
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
        public static FivetranConnection.FivetranType fromValue(String value) {
            FivetranConnection.FivetranType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
