
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
import org.openmetadata.annotations.PasswordField;


/**
 * DagsterConnection
 * <p>
 * Dagster Metadata Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "host",
    "token",
    "timeout",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class DagsterConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private DagsterConnection.DagsterType type = DagsterConnection.DagsterType.fromValue("Dagster");
    /**
     * Host
     * <p>
     * URL to the Dagster instance
     * (Required)
     * 
     */
    @JsonProperty("host")
    @JsonPropertyDescription("URL to the Dagster instance")
    @NotNull
    private URI host;
    /**
     * Token
     * <p>
     * To Connect to Dagster Cloud
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("To Connect to Dagster Cloud")
    @PasswordField
    private String token;
    /**
     * Time Out
     * <p>
     * Connection Time Limit Between OM and Dagster Graphql API in second
     * 
     */
    @JsonProperty("timeout")
    @JsonPropertyDescription("Connection Time Limit Between OM and Dagster Graphql API in second")
    private Integer timeout = 1000;
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
    public DagsterConnection.DagsterType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(DagsterConnection.DagsterType type) {
        this.type = type;
    }

    public DagsterConnection withType(DagsterConnection.DagsterType type) {
        this.type = type;
        return this;
    }

    /**
     * Host
     * <p>
     * URL to the Dagster instance
     * (Required)
     * 
     */
    @JsonProperty("host")
    public URI getHost() {
        return host;
    }

    /**
     * Host
     * <p>
     * URL to the Dagster instance
     * (Required)
     * 
     */
    @JsonProperty("host")
    public void setHost(URI host) {
        this.host = host;
    }

    public DagsterConnection withHost(URI host) {
        this.host = host;
        return this;
    }

    /**
     * Token
     * <p>
     * To Connect to Dagster Cloud
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public String getToken() {
        return token;
    }

    /**
     * Token
     * <p>
     * To Connect to Dagster Cloud
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public void setToken(String token) {
        this.token = token;
    }

    public DagsterConnection withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Time Out
     * <p>
     * Connection Time Limit Between OM and Dagster Graphql API in second
     * 
     */
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Time Out
     * <p>
     * Connection Time Limit Between OM and Dagster Graphql API in second
     * 
     */
    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public DagsterConnection withTimeout(Integer timeout) {
        this.timeout = timeout;
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

    public DagsterConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DagsterConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null)?"<null>":this.host));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
        sb.append(',');
        sb.append("timeout");
        sb.append('=');
        sb.append(((this.timeout == null)?"<null>":this.timeout));
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
        result = ((result* 31)+((this.host == null)? 0 :this.host.hashCode()));
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.timeout == null)? 0 :this.timeout.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DagsterConnection) == false) {
            return false;
        }
        DagsterConnection rhs = ((DagsterConnection) other);
        return ((((((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.timeout == rhs.timeout)||((this.timeout!= null)&&this.timeout.equals(rhs.timeout))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DagsterType {

        DAGSTER("Dagster");
        private final String value;
        private final static Map<String, DagsterConnection.DagsterType> CONSTANTS = new HashMap<String, DagsterConnection.DagsterType>();

        static {
            for (DagsterConnection.DagsterType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DagsterType(String value) {
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
        public static DagsterConnection.DagsterType fromValue(String value) {
            DagsterConnection.DagsterType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
