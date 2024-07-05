
package org.openmetadata.schema.services.connections.dashboard;

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
import org.openmetadata.annotations.MaskedField;
import org.openmetadata.schema.security.ssl.VerifySSL;


/**
 * TableauConnection
 * <p>
 * Tableau Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "authType",
    "apiVersion",
    "siteName",
    "siteUrl",
    "env",
    "paginationLimit",
    "verifySSL",
    "sslConfig",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class TableauConnection {

    /**
     * Tableau service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Tableau service type")
    private TableauConnection.TableauType type = TableauConnection.TableauType.fromValue("Tableau");
    /**
     * Host and Port
     * <p>
     * Tableau Server.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Tableau Server.")
    @ExposedField
    @NotNull
    private URI hostPort;
    /**
     * Authentication type for Tableau
     * <p>
     * Types of methods used to authenticate to the tableau instance
     * 
     */
    @JsonProperty("authType")
    @JsonPropertyDescription("Types of methods used to authenticate to the tableau instance")
    @MaskedField
    private Object authType;
    /**
     * API Version
     * <p>
     * Tableau API version.
     * (Required)
     * 
     */
    @JsonProperty("apiVersion")
    @JsonPropertyDescription("Tableau API version.")
    @NotNull
    private String apiVersion;
    /**
     * Site Name
     * <p>
     * Tableau Site Name.
     * 
     */
    @JsonProperty("siteName")
    @JsonPropertyDescription("Tableau Site Name.")
    private String siteName;
    /**
     * Site Url
     * <p>
     * Tableau Site Url.
     * 
     */
    @JsonProperty("siteUrl")
    @JsonPropertyDescription("Tableau Site Url.")
    private String siteUrl;
    /**
     * Tableau Environment
     * <p>
     * Tableau Environment Name.
     * (Required)
     * 
     */
    @JsonProperty("env")
    @JsonPropertyDescription("Tableau Environment Name.")
    @NotNull
    private String env = "tableau_prod";
    /**
     * Pagination Limit
     * <p>
     * Pagination limit used while querying the tableau metadata API for getting data sources
     * 
     */
    @JsonProperty("paginationLimit")
    @JsonPropertyDescription("Pagination limit used while querying the tableau metadata API for getting data sources")
    private Integer paginationLimit = 10;
    /**
     * Verify SSL
     * <p>
     * Client SSL verification. Make sure to configure the SSLConfig if enabled.
     * 
     */
    @JsonProperty("verifySSL")
    @JsonPropertyDescription("Client SSL verification. Make sure to configure the SSLConfig if enabled.")
    private VerifySSL verifySSL = VerifySSL.fromValue("no-ssl");
    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    @JsonPropertyDescription("Client SSL configuration")
    private Object sslConfig;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Tableau service type
     * 
     */
    @JsonProperty("type")
    public TableauConnection.TableauType getType() {
        return type;
    }

    /**
     * Tableau service type
     * 
     */
    @JsonProperty("type")
    public void setType(TableauConnection.TableauType type) {
        this.type = type;
    }

    public TableauConnection withType(TableauConnection.TableauType type) {
        this.type = type;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Tableau Server.
     * (Required)
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
     * Tableau Server.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public TableauConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Authentication type for Tableau
     * <p>
     * Types of methods used to authenticate to the tableau instance
     * 
     */
    @JsonProperty("authType")
    @MaskedField
    public Object getAuthType() {
        return authType;
    }

    /**
     * Authentication type for Tableau
     * <p>
     * Types of methods used to authenticate to the tableau instance
     * 
     */
    @JsonProperty("authType")
    @MaskedField
    public void setAuthType(Object authType) {
        this.authType = authType;
    }

    public TableauConnection withAuthType(Object authType) {
        this.authType = authType;
        return this;
    }

    /**
     * API Version
     * <p>
     * Tableau API version.
     * (Required)
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * API Version
     * <p>
     * Tableau API version.
     * (Required)
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public TableauConnection withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Site Name
     * <p>
     * Tableau Site Name.
     * 
     */
    @JsonProperty("siteName")
    public String getSiteName() {
        return siteName;
    }

    /**
     * Site Name
     * <p>
     * Tableau Site Name.
     * 
     */
    @JsonProperty("siteName")
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public TableauConnection withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Site Url
     * <p>
     * Tableau Site Url.
     * 
     */
    @JsonProperty("siteUrl")
    public String getSiteUrl() {
        return siteUrl;
    }

    /**
     * Site Url
     * <p>
     * Tableau Site Url.
     * 
     */
    @JsonProperty("siteUrl")
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public TableauConnection withSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }

    /**
     * Tableau Environment
     * <p>
     * Tableau Environment Name.
     * (Required)
     * 
     */
    @JsonProperty("env")
    public String getEnv() {
        return env;
    }

    /**
     * Tableau Environment
     * <p>
     * Tableau Environment Name.
     * (Required)
     * 
     */
    @JsonProperty("env")
    public void setEnv(String env) {
        this.env = env;
    }

    public TableauConnection withEnv(String env) {
        this.env = env;
        return this;
    }

    /**
     * Pagination Limit
     * <p>
     * Pagination limit used while querying the tableau metadata API for getting data sources
     * 
     */
    @JsonProperty("paginationLimit")
    public Integer getPaginationLimit() {
        return paginationLimit;
    }

    /**
     * Pagination Limit
     * <p>
     * Pagination limit used while querying the tableau metadata API for getting data sources
     * 
     */
    @JsonProperty("paginationLimit")
    public void setPaginationLimit(Integer paginationLimit) {
        this.paginationLimit = paginationLimit;
    }

    public TableauConnection withPaginationLimit(Integer paginationLimit) {
        this.paginationLimit = paginationLimit;
        return this;
    }

    /**
     * Verify SSL
     * <p>
     * Client SSL verification. Make sure to configure the SSLConfig if enabled.
     * 
     */
    @JsonProperty("verifySSL")
    public VerifySSL getVerifySSL() {
        return verifySSL;
    }

    /**
     * Verify SSL
     * <p>
     * Client SSL verification. Make sure to configure the SSLConfig if enabled.
     * 
     */
    @JsonProperty("verifySSL")
    public void setVerifySSL(VerifySSL verifySSL) {
        this.verifySSL = verifySSL;
    }

    public TableauConnection withVerifySSL(VerifySSL verifySSL) {
        this.verifySSL = verifySSL;
        return this;
    }

    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    public Object getSslConfig() {
        return sslConfig;
    }

    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    public void setSslConfig(Object sslConfig) {
        this.sslConfig = sslConfig;
    }

    public TableauConnection withSslConfig(Object sslConfig) {
        this.sslConfig = sslConfig;
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

    public TableauConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TableauConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("apiVersion");
        sb.append('=');
        sb.append(((this.apiVersion == null)?"<null>":this.apiVersion));
        sb.append(',');
        sb.append("siteName");
        sb.append('=');
        sb.append(((this.siteName == null)?"<null>":this.siteName));
        sb.append(',');
        sb.append("siteUrl");
        sb.append('=');
        sb.append(((this.siteUrl == null)?"<null>":this.siteUrl));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null)?"<null>":this.env));
        sb.append(',');
        sb.append("paginationLimit");
        sb.append('=');
        sb.append(((this.paginationLimit == null)?"<null>":this.paginationLimit));
        sb.append(',');
        sb.append("verifySSL");
        sb.append('=');
        sb.append(((this.verifySSL == null)?"<null>":this.verifySSL));
        sb.append(',');
        sb.append("sslConfig");
        sb.append('=');
        sb.append(((this.sslConfig == null)?"<null>":this.sslConfig));
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
        result = ((result* 31)+((this.apiVersion == null)? 0 :this.apiVersion.hashCode()));
        result = ((result* 31)+((this.siteUrl == null)? 0 :this.siteUrl.hashCode()));
        result = ((result* 31)+((this.sslConfig == null)? 0 :this.sslConfig.hashCode()));
        result = ((result* 31)+((this.siteName == null)? 0 :this.siteName.hashCode()));
        result = ((result* 31)+((this.verifySSL == null)? 0 :this.verifySSL.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.paginationLimit == null)? 0 :this.paginationLimit.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.authType == null)? 0 :this.authType.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableauConnection) == false) {
            return false;
        }
        TableauConnection rhs = ((TableauConnection) other);
        return ((((((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.apiVersion == rhs.apiVersion)||((this.apiVersion!= null)&&this.apiVersion.equals(rhs.apiVersion))))&&((this.siteUrl == rhs.siteUrl)||((this.siteUrl!= null)&&this.siteUrl.equals(rhs.siteUrl))))&&((this.sslConfig == rhs.sslConfig)||((this.sslConfig!= null)&&this.sslConfig.equals(rhs.sslConfig))))&&((this.siteName == rhs.siteName)||((this.siteName!= null)&&this.siteName.equals(rhs.siteName))))&&((this.verifySSL == rhs.verifySSL)||((this.verifySSL!= null)&&this.verifySSL.equals(rhs.verifySSL))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.paginationLimit == rhs.paginationLimit)||((this.paginationLimit!= null)&&this.paginationLimit.equals(rhs.paginationLimit))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.authType == rhs.authType)||((this.authType!= null)&&this.authType.equals(rhs.authType))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))));
    }


    /**
     * Tableau service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TableauType {

        TABLEAU("Tableau");
        private final String value;
        private final static Map<String, TableauConnection.TableauType> CONSTANTS = new HashMap<String, TableauConnection.TableauType>();

        static {
            for (TableauConnection.TableauType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TableauType(String value) {
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
        public static TableauConnection.TableauType fromValue(String value) {
            TableauConnection.TableauType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
