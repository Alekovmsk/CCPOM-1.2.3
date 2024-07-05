
package org.openmetadata.schema.services.connections.database;

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
 * DomoDatabaseConnection
 * <p>
 * Domo Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "clientId",
    "secretToken",
    "accessToken",
    "apiHost",
    "instanceDomain",
    "databaseName",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class DomoDatabaseConnection {

    /**
     *  service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription(" service type")
    private DomoDatabaseConnection.DomoDatabaseType type = DomoDatabaseConnection.DomoDatabaseType.fromValue("DomoDatabase");
    /**
     * Client ID
     * <p>
     * Client ID for DOMO
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    @JsonPropertyDescription("Client ID for DOMO")
    @NotNull
    private String clientId;
    /**
     * Secret Token
     * <p>
     * Secret Token to connect DOMO
     * (Required)
     * 
     */
    @JsonProperty("secretToken")
    @JsonPropertyDescription("Secret Token to connect DOMO")
    @PasswordField
    @NotNull
    private String secretToken;
    /**
     * Access Token
     * <p>
     * Access token to connect to DOMO
     * 
     */
    @JsonProperty("accessToken")
    @JsonPropertyDescription("Access token to connect to DOMO")
    private String accessToken;
    /**
     * API Host
     * <p>
     * API Host to connect to DOMO instance
     * 
     */
    @JsonProperty("apiHost")
    @JsonPropertyDescription("API Host to connect to DOMO instance")
    @ExposedField
    private String apiHost = "api.domo.com";
    /**
     * Instance Domain
     * <p>
     * URL of your Domo instance, e.g., https://openmetadata.domo.com
     * (Required)
     * 
     */
    @JsonProperty("instanceDomain")
    @JsonPropertyDescription("URL of your Domo instance, e.g., https://openmetadata.domo.com")
    @NotNull
    private URI instanceDomain;
    /**
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    @JsonPropertyDescription("Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.")
    private String databaseName;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     *  service type
     * 
     */
    @JsonProperty("type")
    public DomoDatabaseConnection.DomoDatabaseType getType() {
        return type;
    }

    /**
     *  service type
     * 
     */
    @JsonProperty("type")
    public void setType(DomoDatabaseConnection.DomoDatabaseType type) {
        this.type = type;
    }

    public DomoDatabaseConnection withType(DomoDatabaseConnection.DomoDatabaseType type) {
        this.type = type;
        return this;
    }

    /**
     * Client ID
     * <p>
     * Client ID for DOMO
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * Client ID
     * <p>
     * Client ID for DOMO
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public DomoDatabaseConnection withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Secret Token
     * <p>
     * Secret Token to connect DOMO
     * (Required)
     * 
     */
    @JsonProperty("secretToken")
    @PasswordField
    public String getSecretToken() {
        return secretToken;
    }

    /**
     * Secret Token
     * <p>
     * Secret Token to connect DOMO
     * (Required)
     * 
     */
    @JsonProperty("secretToken")
    @PasswordField
    public void setSecretToken(String secretToken) {
        this.secretToken = secretToken;
    }

    public DomoDatabaseConnection withSecretToken(String secretToken) {
        this.secretToken = secretToken;
        return this;
    }

    /**
     * Access Token
     * <p>
     * Access token to connect to DOMO
     * 
     */
    @JsonProperty("accessToken")
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Access Token
     * <p>
     * Access token to connect to DOMO
     * 
     */
    @JsonProperty("accessToken")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public DomoDatabaseConnection withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * API Host
     * <p>
     * API Host to connect to DOMO instance
     * 
     */
    @JsonProperty("apiHost")
    @ExposedField
    public String getApiHost() {
        return apiHost;
    }

    /**
     * API Host
     * <p>
     * API Host to connect to DOMO instance
     * 
     */
    @JsonProperty("apiHost")
    @ExposedField
    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }

    public DomoDatabaseConnection withApiHost(String apiHost) {
        this.apiHost = apiHost;
        return this;
    }

    /**
     * Instance Domain
     * <p>
     * URL of your Domo instance, e.g., https://openmetadata.domo.com
     * (Required)
     * 
     */
    @JsonProperty("instanceDomain")
    public URI getInstanceDomain() {
        return instanceDomain;
    }

    /**
     * Instance Domain
     * <p>
     * URL of your Domo instance, e.g., https://openmetadata.domo.com
     * (Required)
     * 
     */
    @JsonProperty("instanceDomain")
    public void setInstanceDomain(URI instanceDomain) {
        this.instanceDomain = instanceDomain;
    }

    public DomoDatabaseConnection withInstanceDomain(URI instanceDomain) {
        this.instanceDomain = instanceDomain;
        return this;
    }

    /**
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DomoDatabaseConnection withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
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

    public DomoDatabaseConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomoDatabaseConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("secretToken");
        sb.append('=');
        sb.append(((this.secretToken == null)?"<null>":this.secretToken));
        sb.append(',');
        sb.append("accessToken");
        sb.append('=');
        sb.append(((this.accessToken == null)?"<null>":this.accessToken));
        sb.append(',');
        sb.append("apiHost");
        sb.append('=');
        sb.append(((this.apiHost == null)?"<null>":this.apiHost));
        sb.append(',');
        sb.append("instanceDomain");
        sb.append('=');
        sb.append(((this.instanceDomain == null)?"<null>":this.instanceDomain));
        sb.append(',');
        sb.append("databaseName");
        sb.append('=');
        sb.append(((this.databaseName == null)?"<null>":this.databaseName));
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
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        result = ((result* 31)+((this.databaseName == null)? 0 :this.databaseName.hashCode()));
        result = ((result* 31)+((this.secretToken == null)? 0 :this.secretToken.hashCode()));
        result = ((result* 31)+((this.apiHost == null)? 0 :this.apiHost.hashCode()));
        result = ((result* 31)+((this.instanceDomain == null)? 0 :this.instanceDomain.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.accessToken == null)? 0 :this.accessToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomoDatabaseConnection) == false) {
            return false;
        }
        DomoDatabaseConnection rhs = ((DomoDatabaseConnection) other);
        return (((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId))))&&((this.databaseName == rhs.databaseName)||((this.databaseName!= null)&&this.databaseName.equals(rhs.databaseName))))&&((this.secretToken == rhs.secretToken)||((this.secretToken!= null)&&this.secretToken.equals(rhs.secretToken))))&&((this.apiHost == rhs.apiHost)||((this.apiHost!= null)&&this.apiHost.equals(rhs.apiHost))))&&((this.instanceDomain == rhs.instanceDomain)||((this.instanceDomain!= null)&&this.instanceDomain.equals(rhs.instanceDomain))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.accessToken == rhs.accessToken)||((this.accessToken!= null)&&this.accessToken.equals(rhs.accessToken))));
    }


    /**
     *  service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DomoDatabaseType {

        DOMO_DATABASE("DomoDatabase");
        private final String value;
        private final static Map<String, DomoDatabaseConnection.DomoDatabaseType> CONSTANTS = new HashMap<String, DomoDatabaseConnection.DomoDatabaseType>();

        static {
            for (DomoDatabaseConnection.DomoDatabaseType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DomoDatabaseType(String value) {
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
        public static DomoDatabaseConnection.DomoDatabaseType fromValue(String value) {
            DomoDatabaseConnection.DomoDatabaseType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
