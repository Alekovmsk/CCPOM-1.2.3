
package org.openmetadata.schema.services.connections.metadata;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import org.openmetadata.annotations.ExposedField;
import org.openmetadata.annotations.PasswordField;
import org.openmetadata.schema.services.connections.database.ConnectionArguments;
import org.openmetadata.schema.services.connections.database.ConnectionOptions;


/**
 * AtlasConnection
 * <p>
 * Atlas Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "username",
    "password",
    "hostPort",
    "databaseServiceName",
    "messagingServiceName",
    "entity_type",
    "connectionOptions",
    "connectionArguments",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class AtlasConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private AtlasConnection.AtlasType type = AtlasConnection.AtlasType.fromValue("Atlas");
    /**
     * username to connect  to the Atlas. This user should have privileges to read all the metadata in Atlas.
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("username to connect  to the Atlas. This user should have privileges to read all the metadata in Atlas.")
    @NotNull
    private String username;
    /**
     * password to connect  to the Atlas.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("password to connect  to the Atlas.")
    @PasswordField
    @NotNull
    private String password;
    /**
     * Host and Port
     * <p>
     * Host and port of the Atlas service.
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the Atlas service.")
    @ExposedField
    private URI hostPort;
    /**
     * service type of the data source.
     * 
     */
    @JsonProperty("databaseServiceName")
    @JsonPropertyDescription("service type of the data source.")
    @Valid
    private List<String> databaseServiceName = new ArrayList<String>();
    /**
     * service type of the messaging source
     * 
     */
    @JsonProperty("messagingServiceName")
    @JsonPropertyDescription("service type of the messaging source")
    @Valid
    private List<String> messagingServiceName = new ArrayList<String>();
    /**
     * Entity Type
     * <p>
     * Name of the Entity Type available in Atlas.
     * (Required)
     * 
     */
    @JsonProperty("entity_type")
    @JsonPropertyDescription("Name of the Entity Type available in Atlas.")
    @NotNull
    private String entityType;
    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    @JsonPropertyDescription("Additional connection options to build the URL that can be sent to service during the connection.")
    @Valid
    private ConnectionOptions connectionOptions;
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
    public AtlasConnection.AtlasType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(AtlasConnection.AtlasType type) {
        this.type = type;
    }

    public AtlasConnection withType(AtlasConnection.AtlasType type) {
        this.type = type;
        return this;
    }

    /**
     * username to connect  to the Atlas. This user should have privileges to read all the metadata in Atlas.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * username to connect  to the Atlas. This user should have privileges to read all the metadata in Atlas.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public AtlasConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * password to connect  to the Atlas.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public String getPassword() {
        return password;
    }

    /**
     * password to connect  to the Atlas.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public AtlasConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the Atlas service.
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
     * Host and port of the Atlas service.
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public AtlasConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * service type of the data source.
     * 
     */
    @JsonProperty("databaseServiceName")
    public List<String> getDatabaseServiceName() {
        return databaseServiceName;
    }

    /**
     * service type of the data source.
     * 
     */
    @JsonProperty("databaseServiceName")
    public void setDatabaseServiceName(List<String> databaseServiceName) {
        this.databaseServiceName = databaseServiceName;
    }

    public AtlasConnection withDatabaseServiceName(List<String> databaseServiceName) {
        this.databaseServiceName = databaseServiceName;
        return this;
    }

    /**
     * service type of the messaging source
     * 
     */
    @JsonProperty("messagingServiceName")
    public List<String> getMessagingServiceName() {
        return messagingServiceName;
    }

    /**
     * service type of the messaging source
     * 
     */
    @JsonProperty("messagingServiceName")
    public void setMessagingServiceName(List<String> messagingServiceName) {
        this.messagingServiceName = messagingServiceName;
    }

    public AtlasConnection withMessagingServiceName(List<String> messagingServiceName) {
        this.messagingServiceName = messagingServiceName;
        return this;
    }

    /**
     * Entity Type
     * <p>
     * Name of the Entity Type available in Atlas.
     * (Required)
     * 
     */
    @JsonProperty("entity_type")
    public String getEntityType() {
        return entityType;
    }

    /**
     * Entity Type
     * <p>
     * Name of the Entity Type available in Atlas.
     * (Required)
     * 
     */
    @JsonProperty("entity_type")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public AtlasConnection withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    public ConnectionOptions getConnectionOptions() {
        return connectionOptions;
    }

    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    public void setConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
    }

    public AtlasConnection withConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
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

    public AtlasConnection withConnectionArguments(ConnectionArguments connectionArguments) {
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

    public AtlasConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AtlasConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("databaseServiceName");
        sb.append('=');
        sb.append(((this.databaseServiceName == null)?"<null>":this.databaseServiceName));
        sb.append(',');
        sb.append("messagingServiceName");
        sb.append('=');
        sb.append(((this.messagingServiceName == null)?"<null>":this.messagingServiceName));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("connectionOptions");
        sb.append('=');
        sb.append(((this.connectionOptions == null)?"<null>":this.connectionOptions));
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
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.messagingServiceName == null)? 0 :this.messagingServiceName.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.databaseServiceName == null)? 0 :this.databaseServiceName.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AtlasConnection) == false) {
            return false;
        }
        AtlasConnection rhs = ((AtlasConnection) other);
        return (((((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.messagingServiceName == rhs.messagingServiceName)||((this.messagingServiceName!= null)&&this.messagingServiceName.equals(rhs.messagingServiceName))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.databaseServiceName == rhs.databaseServiceName)||((this.databaseServiceName!= null)&&this.databaseServiceName.equals(rhs.databaseServiceName))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AtlasType {

        ATLAS("Atlas");
        private final String value;
        private final static Map<String, AtlasConnection.AtlasType> CONSTANTS = new HashMap<String, AtlasConnection.AtlasType>();

        static {
            for (AtlasConnection.AtlasType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AtlasType(String value) {
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
        public static AtlasConnection.AtlasType fromValue(String value) {
            AtlasConnection.AtlasType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
