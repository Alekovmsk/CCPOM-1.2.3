
package org.openmetadata.schema.services.connections.search;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.services.common.SSLConfig;
import org.openmetadata.schema.services.connections.database.ConnectionArguments;


/**
 * ElasticSearch Connection
 * <p>
 * ElasticSearch Connection.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "authType",
    "sslConfig",
    "connectionTimeoutSecs",
    "connectionArguments",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class ElasticSearchConnection {

    /**
     * ElasticSearch service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("ElasticSearch service type")
    private ElasticSearchConnection.ElasticSearchType type = ElasticSearchConnection.ElasticSearchType.fromValue("ElasticSearch");
    /**
     * Host and Port
     * <p>
     * Host and port of the ElasticSearch service.
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the ElasticSearch service.")
    private URI hostPort;
    /**
     * Auth Configuration Type
     * <p>
     * Choose Auth Config Type.
     * 
     */
    @JsonProperty("authType")
    @JsonPropertyDescription("Choose Auth Config Type.")
    private Object authType;
    /**
     * SSL Config
     * <p>
     * SSL Config
     * 
     */
    @JsonProperty("sslConfig")
    @JsonPropertyDescription("SSL Config")
    @Valid
    private SSLConfig sslConfig;
    /**
     * Connection Timeout in Seconds
     * <p>
     * Connection Timeout in Seconds
     * 
     */
    @JsonProperty("connectionTimeoutSecs")
    @JsonPropertyDescription("Connection Timeout in Seconds")
    private Integer connectionTimeoutSecs = 30;
    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    @JsonPropertyDescription("Additional connection arguments such as security or protocol configs that can be sent to service during connection.")
    @Valid
    private ConnectionArguments connectionArguments;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * ElasticSearch service type
     * 
     */
    @JsonProperty("type")
    public ElasticSearchConnection.ElasticSearchType getType() {
        return type;
    }

    /**
     * ElasticSearch service type
     * 
     */
    @JsonProperty("type")
    public void setType(ElasticSearchConnection.ElasticSearchType type) {
        this.type = type;
    }

    public ElasticSearchConnection withType(ElasticSearchConnection.ElasticSearchType type) {
        this.type = type;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the ElasticSearch service.
     * 
     */
    @JsonProperty("hostPort")
    public URI getHostPort() {
        return hostPort;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the ElasticSearch service.
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public ElasticSearchConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Auth Configuration Type
     * <p>
     * Choose Auth Config Type.
     * 
     */
    @JsonProperty("authType")
    public Object getAuthType() {
        return authType;
    }

    /**
     * Auth Configuration Type
     * <p>
     * Choose Auth Config Type.
     * 
     */
    @JsonProperty("authType")
    public void setAuthType(Object authType) {
        this.authType = authType;
    }

    public ElasticSearchConnection withAuthType(Object authType) {
        this.authType = authType;
        return this;
    }

    /**
     * SSL Config
     * <p>
     * SSL Config
     * 
     */
    @JsonProperty("sslConfig")
    public SSLConfig getSslConfig() {
        return sslConfig;
    }

    /**
     * SSL Config
     * <p>
     * SSL Config
     * 
     */
    @JsonProperty("sslConfig")
    public void setSslConfig(SSLConfig sslConfig) {
        this.sslConfig = sslConfig;
    }

    public ElasticSearchConnection withSslConfig(SSLConfig sslConfig) {
        this.sslConfig = sslConfig;
        return this;
    }

    /**
     * Connection Timeout in Seconds
     * <p>
     * Connection Timeout in Seconds
     * 
     */
    @JsonProperty("connectionTimeoutSecs")
    public Integer getConnectionTimeoutSecs() {
        return connectionTimeoutSecs;
    }

    /**
     * Connection Timeout in Seconds
     * <p>
     * Connection Timeout in Seconds
     * 
     */
    @JsonProperty("connectionTimeoutSecs")
    public void setConnectionTimeoutSecs(Integer connectionTimeoutSecs) {
        this.connectionTimeoutSecs = connectionTimeoutSecs;
    }

    public ElasticSearchConnection withConnectionTimeoutSecs(Integer connectionTimeoutSecs) {
        this.connectionTimeoutSecs = connectionTimeoutSecs;
        return this;
    }

    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    public ConnectionArguments getConnectionArguments() {
        return connectionArguments;
    }

    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    public void setConnectionArguments(ConnectionArguments connectionArguments) {
        this.connectionArguments = connectionArguments;
    }

    public ElasticSearchConnection withConnectionArguments(ConnectionArguments connectionArguments) {
        this.connectionArguments = connectionArguments;
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

    public ElasticSearchConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElasticSearchConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("authType");
        sb.append('=');
        sb.append(((this.authType == null)?"<null>":this.authType));
        sb.append(',');
        sb.append("sslConfig");
        sb.append('=');
        sb.append(((this.sslConfig == null)?"<null>":this.sslConfig));
        sb.append(',');
        sb.append("connectionTimeoutSecs");
        sb.append('=');
        sb.append(((this.connectionTimeoutSecs == null)?"<null>":this.connectionTimeoutSecs));
        sb.append(',');
        sb.append("connectionArguments");
        sb.append('=');
        sb.append(((this.connectionArguments == null)?"<null>":this.connectionArguments));
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
        result = ((result* 31)+((this.connectionTimeoutSecs == null)? 0 :this.connectionTimeoutSecs.hashCode()));
        result = ((result* 31)+((this.sslConfig == null)? 0 :this.sslConfig.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.authType == null)? 0 :this.authType.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElasticSearchConnection) == false) {
            return false;
        }
        ElasticSearchConnection rhs = ((ElasticSearchConnection) other);
        return ((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.connectionTimeoutSecs == rhs.connectionTimeoutSecs)||((this.connectionTimeoutSecs!= null)&&this.connectionTimeoutSecs.equals(rhs.connectionTimeoutSecs))))&&((this.sslConfig == rhs.sslConfig)||((this.sslConfig!= null)&&this.sslConfig.equals(rhs.sslConfig))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.authType == rhs.authType)||((this.authType!= null)&&this.authType.equals(rhs.authType))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))));
    }


    /**
     * ElasticSearch service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ElasticSearchType {

        ELASTIC_SEARCH("ElasticSearch");
        private final String value;
        private final static Map<String, ElasticSearchConnection.ElasticSearchType> CONSTANTS = new HashMap<String, ElasticSearchConnection.ElasticSearchType>();

        static {
            for (ElasticSearchConnection.ElasticSearchType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ElasticSearchType(String value) {
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
        public static ElasticSearchConnection.ElasticSearchType fromValue(String value) {
            ElasticSearchConnection.ElasticSearchType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
