
package org.openmetadata.schema.services.connections.dashboard;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
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


/**
 * PowerBIConnection
 * <p>
 * PowerBI Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "clientId",
    "clientSecret",
    "tenantId",
    "authorityURI",
    "hostPort",
    "scope",
    "pagination_entity_per_page",
    "useAdminApis",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class PowerBIConnection {

    /**
     * PowerBI service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("PowerBI service type")
    private PowerBIConnection.PowerBiType type = PowerBIConnection.PowerBiType.fromValue("PowerBI");
    /**
     * Client ID
     * <p>
     * client_id for PowerBI.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    @JsonPropertyDescription("client_id for PowerBI.")
    @NotNull
    private String clientId;
    /**
     * Client Secret
     * <p>
     * clientSecret for PowerBI.
     * (Required)
     * 
     */
    @JsonProperty("clientSecret")
    @JsonPropertyDescription("clientSecret for PowerBI.")
    @PasswordField
    @NotNull
    private String clientSecret;
    /**
     * Tenant ID
     * <p>
     * Tenant ID for PowerBI.
     * (Required)
     * 
     */
    @JsonProperty("tenantId")
    @JsonPropertyDescription("Tenant ID for PowerBI.")
    @NotNull
    private String tenantId;
    /**
     * Authority URI
     * <p>
     * Authority URI for the PowerBI service.
     * 
     */
    @JsonProperty("authorityURI")
    @JsonPropertyDescription("Authority URI for the PowerBI service.")
    private String authorityURI = "https://login.microsoftonline.com/";
    /**
     * Host and Port
     * <p>
     * Dashboard URL for PowerBI service.
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Dashboard URL for PowerBI service.")
    @ExposedField
    private URI hostPort = URI.create("https://app.powerbi.com");
    /**
     * Scope
     * <p>
     * PowerBI secrets.
     * 
     */
    @JsonProperty("scope")
    @JsonPropertyDescription("PowerBI secrets.")
    @Valid
    private List<String> scope = new ArrayList<String>(Arrays.asList("https://analysis.windows.net/powerbi/api/.default"));
    /**
     * Pagination Entity Per Page
     * <p>
     * Entity Limit set here will be used to paginate the PowerBi APIs
     * 
     */
    @JsonProperty("pagination_entity_per_page")
    @JsonPropertyDescription("Entity Limit set here will be used to paginate the PowerBi APIs")
    private Integer paginationEntityPerPage = 100;
    /**
     * Use PowerBI Admin APIs
     * <p>
     * Fetch the PowerBI metadata using admin APIs
     * 
     */
    @JsonProperty("useAdminApis")
    @JsonPropertyDescription("Fetch the PowerBI metadata using admin APIs")
    private Boolean useAdminApis = true;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * PowerBI service type
     * 
     */
    @JsonProperty("type")
    public PowerBIConnection.PowerBiType getType() {
        return type;
    }

    /**
     * PowerBI service type
     * 
     */
    @JsonProperty("type")
    public void setType(PowerBIConnection.PowerBiType type) {
        this.type = type;
    }

    public PowerBIConnection withType(PowerBIConnection.PowerBiType type) {
        this.type = type;
        return this;
    }

    /**
     * Client ID
     * <p>
     * client_id for PowerBI.
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
     * client_id for PowerBI.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public PowerBIConnection withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Client Secret
     * <p>
     * clientSecret for PowerBI.
     * (Required)
     * 
     */
    @JsonProperty("clientSecret")
    @PasswordField
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Client Secret
     * <p>
     * clientSecret for PowerBI.
     * (Required)
     * 
     */
    @JsonProperty("clientSecret")
    @PasswordField
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public PowerBIConnection withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Tenant ID
     * <p>
     * Tenant ID for PowerBI.
     * (Required)
     * 
     */
    @JsonProperty("tenantId")
    public String getTenantId() {
        return tenantId;
    }

    /**
     * Tenant ID
     * <p>
     * Tenant ID for PowerBI.
     * (Required)
     * 
     */
    @JsonProperty("tenantId")
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public PowerBIConnection withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Authority URI
     * <p>
     * Authority URI for the PowerBI service.
     * 
     */
    @JsonProperty("authorityURI")
    public String getAuthorityURI() {
        return authorityURI;
    }

    /**
     * Authority URI
     * <p>
     * Authority URI for the PowerBI service.
     * 
     */
    @JsonProperty("authorityURI")
    public void setAuthorityURI(String authorityURI) {
        this.authorityURI = authorityURI;
    }

    public PowerBIConnection withAuthorityURI(String authorityURI) {
        this.authorityURI = authorityURI;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Dashboard URL for PowerBI service.
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
     * Dashboard URL for PowerBI service.
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public PowerBIConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Scope
     * <p>
     * PowerBI secrets.
     * 
     */
    @JsonProperty("scope")
    public List<String> getScope() {
        return scope;
    }

    /**
     * Scope
     * <p>
     * PowerBI secrets.
     * 
     */
    @JsonProperty("scope")
    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    public PowerBIConnection withScope(List<String> scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Pagination Entity Per Page
     * <p>
     * Entity Limit set here will be used to paginate the PowerBi APIs
     * 
     */
    @JsonProperty("pagination_entity_per_page")
    public Integer getPaginationEntityPerPage() {
        return paginationEntityPerPage;
    }

    /**
     * Pagination Entity Per Page
     * <p>
     * Entity Limit set here will be used to paginate the PowerBi APIs
     * 
     */
    @JsonProperty("pagination_entity_per_page")
    public void setPaginationEntityPerPage(Integer paginationEntityPerPage) {
        this.paginationEntityPerPage = paginationEntityPerPage;
    }

    public PowerBIConnection withPaginationEntityPerPage(Integer paginationEntityPerPage) {
        this.paginationEntityPerPage = paginationEntityPerPage;
        return this;
    }

    /**
     * Use PowerBI Admin APIs
     * <p>
     * Fetch the PowerBI metadata using admin APIs
     * 
     */
    @JsonProperty("useAdminApis")
    public Boolean getUseAdminApis() {
        return useAdminApis;
    }

    /**
     * Use PowerBI Admin APIs
     * <p>
     * Fetch the PowerBI metadata using admin APIs
     * 
     */
    @JsonProperty("useAdminApis")
    public void setUseAdminApis(Boolean useAdminApis) {
        this.useAdminApis = useAdminApis;
    }

    public PowerBIConnection withUseAdminApis(Boolean useAdminApis) {
        this.useAdminApis = useAdminApis;
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

    public PowerBIConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PowerBIConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("clientSecret");
        sb.append('=');
        sb.append(((this.clientSecret == null)?"<null>":this.clientSecret));
        sb.append(',');
        sb.append("tenantId");
        sb.append('=');
        sb.append(((this.tenantId == null)?"<null>":this.tenantId));
        sb.append(',');
        sb.append("authorityURI");
        sb.append('=');
        sb.append(((this.authorityURI == null)?"<null>":this.authorityURI));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
        sb.append(',');
        sb.append("paginationEntityPerPage");
        sb.append('=');
        sb.append(((this.paginationEntityPerPage == null)?"<null>":this.paginationEntityPerPage));
        sb.append(',');
        sb.append("useAdminApis");
        sb.append('=');
        sb.append(((this.useAdminApis == null)?"<null>":this.useAdminApis));
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
        result = ((result* 31)+((this.authorityURI == null)? 0 :this.authorityURI.hashCode()));
        result = ((result* 31)+((this.scope == null)? 0 :this.scope.hashCode()));
        result = ((result* 31)+((this.tenantId == null)? 0 :this.tenantId.hashCode()));
        result = ((result* 31)+((this.clientSecret == null)? 0 :this.clientSecret.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.useAdminApis == null)? 0 :this.useAdminApis.hashCode()));
        result = ((result* 31)+((this.paginationEntityPerPage == null)? 0 :this.paginationEntityPerPage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PowerBIConnection) == false) {
            return false;
        }
        PowerBIConnection rhs = ((PowerBIConnection) other);
        return (((((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId))))&&((this.authorityURI == rhs.authorityURI)||((this.authorityURI!= null)&&this.authorityURI.equals(rhs.authorityURI))))&&((this.scope == rhs.scope)||((this.scope!= null)&&this.scope.equals(rhs.scope))))&&((this.tenantId == rhs.tenantId)||((this.tenantId!= null)&&this.tenantId.equals(rhs.tenantId))))&&((this.clientSecret == rhs.clientSecret)||((this.clientSecret!= null)&&this.clientSecret.equals(rhs.clientSecret))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.useAdminApis == rhs.useAdminApis)||((this.useAdminApis!= null)&&this.useAdminApis.equals(rhs.useAdminApis))))&&((this.paginationEntityPerPage == rhs.paginationEntityPerPage)||((this.paginationEntityPerPage!= null)&&this.paginationEntityPerPage.equals(rhs.paginationEntityPerPage))));
    }


    /**
     * PowerBI service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PowerBiType {

        POWER_BI("PowerBI");
        private final String value;
        private final static Map<String, PowerBIConnection.PowerBiType> CONSTANTS = new HashMap<String, PowerBIConnection.PowerBiType>();

        static {
            for (PowerBIConnection.PowerBiType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PowerBiType(String value) {
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
        public static PowerBIConnection.PowerBiType fromValue(String value) {
            PowerBIConnection.PowerBiType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
