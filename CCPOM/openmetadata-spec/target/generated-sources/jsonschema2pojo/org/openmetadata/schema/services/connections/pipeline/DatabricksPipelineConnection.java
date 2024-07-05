
package org.openmetadata.schema.services.connections.pipeline;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.annotations.PasswordField;
import org.openmetadata.schema.services.connections.database.ConnectionArguments;


/**
 * DatabricksPipelineConnection
 * <p>
 * Databricks Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "token",
    "httpPath",
    "connectionArguments",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class DatabricksPipelineConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private DatabricksPipelineConnection.DatabricksType type = DatabricksPipelineConnection.DatabricksType.fromValue("DatabricksPipeline");
    /**
     * Host and Port
     * <p>
     * Host and port of the Databricks service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the Databricks service.")
    @NotNull
    private String hostPort;
    /**
     * Token
     * <p>
     * Generated Token to connect to Databricks.
     * (Required)
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("Generated Token to connect to Databricks.")
    @PasswordField
    @NotNull
    private String token;
    /**
     * Http Path
     * <p>
     * Databricks compute resources URL.
     * 
     */
    @JsonProperty("httpPath")
    @JsonPropertyDescription("Databricks compute resources URL.")
    private String httpPath;
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
     * Service type.
     * 
     */
    @JsonProperty("type")
    public DatabricksPipelineConnection.DatabricksType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(DatabricksPipelineConnection.DatabricksType type) {
        this.type = type;
    }

    public DatabricksPipelineConnection withType(DatabricksPipelineConnection.DatabricksType type) {
        this.type = type;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the Databricks service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public String getHostPort() {
        return hostPort;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the Databricks service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public DatabricksPipelineConnection withHostPort(String hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Token
     * <p>
     * Generated Token to connect to Databricks.
     * (Required)
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
     * Generated Token to connect to Databricks.
     * (Required)
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public void setToken(String token) {
        this.token = token;
    }

    public DatabricksPipelineConnection withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Http Path
     * <p>
     * Databricks compute resources URL.
     * 
     */
    @JsonProperty("httpPath")
    public String getHttpPath() {
        return httpPath;
    }

    /**
     * Http Path
     * <p>
     * Databricks compute resources URL.
     * 
     */
    @JsonProperty("httpPath")
    public void setHttpPath(String httpPath) {
        this.httpPath = httpPath;
    }

    public DatabricksPipelineConnection withHttpPath(String httpPath) {
        this.httpPath = httpPath;
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

    public DatabricksPipelineConnection withConnectionArguments(ConnectionArguments connectionArguments) {
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

    public DatabricksPipelineConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DatabricksPipelineConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
        sb.append(',');
        sb.append("httpPath");
        sb.append('=');
        sb.append(((this.httpPath == null)?"<null>":this.httpPath));
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
        result = ((result* 31)+((this.httpPath == null)? 0 :this.httpPath.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatabricksPipelineConnection) == false) {
            return false;
        }
        DatabricksPipelineConnection rhs = ((DatabricksPipelineConnection) other);
        return (((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.httpPath == rhs.httpPath)||((this.httpPath!= null)&&this.httpPath.equals(rhs.httpPath))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DatabricksType {

        DATABRICKS_PIPELINE("DatabricksPipeline");
        private final String value;
        private final static Map<String, DatabricksPipelineConnection.DatabricksType> CONSTANTS = new HashMap<String, DatabricksPipelineConnection.DatabricksType>();

        static {
            for (DatabricksPipelineConnection.DatabricksType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DatabricksType(String value) {
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
        public static DatabricksPipelineConnection.DatabricksType fromValue(String value) {
            DatabricksPipelineConnection.DatabricksType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
