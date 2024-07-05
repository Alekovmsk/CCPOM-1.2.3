
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
 * AirflowConnection
 * <p>
 * Airflow Metadata Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "numberOfStatus",
    "connection",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class AirflowConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private AirflowConnection.AirflowType type = AirflowConnection.AirflowType.fromValue("Airflow");
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
     * Pipeline Service Number Of Status
     * 
     */
    @JsonProperty("numberOfStatus")
    @JsonPropertyDescription("Pipeline Service Number Of Status")
    private Integer numberOfStatus = 10;
    /**
     * Metadata Database Connection
     * <p>
     * Underlying database connection. See https://airflow.apache.org/docs/apache-airflow/stable/howto/set-up-database.html for supported backends.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    @JsonPropertyDescription("Underlying database connection. See https://airflow.apache.org/docs/apache-airflow/stable/howto/set-up-database.html for supported backends.")
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
     * Service type.
     * 
     */
    @JsonProperty("type")
    public AirflowConnection.AirflowType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(AirflowConnection.AirflowType type) {
        this.type = type;
    }

    public AirflowConnection withType(AirflowConnection.AirflowType type) {
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

    public AirflowConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Pipeline Service Number Of Status
     * 
     */
    @JsonProperty("numberOfStatus")
    public Integer getNumberOfStatus() {
        return numberOfStatus;
    }

    /**
     * Pipeline Service Number Of Status
     * 
     */
    @JsonProperty("numberOfStatus")
    public void setNumberOfStatus(Integer numberOfStatus) {
        this.numberOfStatus = numberOfStatus;
    }

    public AirflowConnection withNumberOfStatus(Integer numberOfStatus) {
        this.numberOfStatus = numberOfStatus;
        return this;
    }

    /**
     * Metadata Database Connection
     * <p>
     * Underlying database connection. See https://airflow.apache.org/docs/apache-airflow/stable/howto/set-up-database.html for supported backends.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    public Object getConnection() {
        return connection;
    }

    /**
     * Metadata Database Connection
     * <p>
     * Underlying database connection. See https://airflow.apache.org/docs/apache-airflow/stable/howto/set-up-database.html for supported backends.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    public void setConnection(Object connection) {
        this.connection = connection;
    }

    public AirflowConnection withConnection(Object connection) {
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

    public AirflowConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AirflowConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("numberOfStatus");
        sb.append('=');
        sb.append(((this.numberOfStatus == null)?"<null>":this.numberOfStatus));
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
        result = ((result* 31)+((this.numberOfStatus == null)? 0 :this.numberOfStatus.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirflowConnection) == false) {
            return false;
        }
        AirflowConnection rhs = ((AirflowConnection) other);
        return ((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.connection == rhs.connection)||((this.connection!= null)&&this.connection.equals(rhs.connection))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.numberOfStatus == rhs.numberOfStatus)||((this.numberOfStatus!= null)&&this.numberOfStatus.equals(rhs.numberOfStatus))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AirflowType {

        AIRFLOW("Airflow");
        private final String value;
        private final static Map<String, AirflowConnection.AirflowType> CONSTANTS = new HashMap<String, AirflowConnection.AirflowType>();

        static {
            for (AirflowConnection.AirflowType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AirflowType(String value) {
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
        public static AirflowConnection.AirflowType fromValue(String value) {
            AirflowConnection.AirflowType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
