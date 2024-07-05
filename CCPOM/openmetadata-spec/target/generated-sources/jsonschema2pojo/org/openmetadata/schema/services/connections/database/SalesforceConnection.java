
package org.openmetadata.schema.services.connections.database;

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


/**
 * SalesforceConnection
 * <p>
 * Salesforce Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "username",
    "password",
    "securityToken",
    "sobjectName",
    "databaseName",
    "salesforceApiVersion",
    "salesforceDomain",
    "connectionOptions",
    "connectionArguments",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class SalesforceConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private SalesforceConnection.SalesforceType type = SalesforceConnection.SalesforceType.fromValue("Salesforce");
    /**
     * Username
     * <p>
     * Username to connect to the Salesforce. This user should have privileges to read all the metadata in Redshift.
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to connect to the Salesforce. This user should have privileges to read all the metadata in Redshift.")
    @NotNull
    private String username;
    /**
     * Password
     * <p>
     * Password to connect to the Salesforce.
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to connect to the Salesforce.")
    @PasswordField
    private String password;
    /**
     * Security Token
     * <p>
     * Salesforce Security Token.
     * 
     */
    @JsonProperty("securityToken")
    @JsonPropertyDescription("Salesforce Security Token.")
    @PasswordField
    private String securityToken;
    /**
     * Object Name
     * <p>
     * Salesforce Object Name.
     * 
     */
    @JsonProperty("sobjectName")
    @JsonPropertyDescription("Salesforce Object Name.")
    private String sobjectName;
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
     * Salesforce API Version
     * <p>
     * API version of the Salesforce instance
     * 
     */
    @JsonProperty("salesforceApiVersion")
    @JsonPropertyDescription("API version of the Salesforce instance")
    private String salesforceApiVersion = "42.0";
    /**
     * Salesforce Domain
     * <p>
     * Domain of Salesforce instance
     * 
     */
    @JsonProperty("salesforceDomain")
    @JsonPropertyDescription("Domain of Salesforce instance")
    private String salesforceDomain = "login";
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
    public SalesforceConnection.SalesforceType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(SalesforceConnection.SalesforceType type) {
        this.type = type;
    }

    public SalesforceConnection withType(SalesforceConnection.SalesforceType type) {
        this.type = type;
        return this;
    }

    /**
     * Username
     * <p>
     * Username to connect to the Salesforce. This user should have privileges to read all the metadata in Redshift.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Username
     * <p>
     * Username to connect to the Salesforce. This user should have privileges to read all the metadata in Redshift.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public SalesforceConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * <p>
     * Password to connect to the Salesforce.
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public String getPassword() {
        return password;
    }

    /**
     * Password
     * <p>
     * Password to connect to the Salesforce.
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public SalesforceConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Security Token
     * <p>
     * Salesforce Security Token.
     * 
     */
    @JsonProperty("securityToken")
    @PasswordField
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * Security Token
     * <p>
     * Salesforce Security Token.
     * 
     */
    @JsonProperty("securityToken")
    @PasswordField
    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public SalesforceConnection withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * Object Name
     * <p>
     * Salesforce Object Name.
     * 
     */
    @JsonProperty("sobjectName")
    public String getSobjectName() {
        return sobjectName;
    }

    /**
     * Object Name
     * <p>
     * Salesforce Object Name.
     * 
     */
    @JsonProperty("sobjectName")
    public void setSobjectName(String sobjectName) {
        this.sobjectName = sobjectName;
    }

    public SalesforceConnection withSobjectName(String sobjectName) {
        this.sobjectName = sobjectName;
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

    public SalesforceConnection withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Salesforce API Version
     * <p>
     * API version of the Salesforce instance
     * 
     */
    @JsonProperty("salesforceApiVersion")
    public String getSalesforceApiVersion() {
        return salesforceApiVersion;
    }

    /**
     * Salesforce API Version
     * <p>
     * API version of the Salesforce instance
     * 
     */
    @JsonProperty("salesforceApiVersion")
    public void setSalesforceApiVersion(String salesforceApiVersion) {
        this.salesforceApiVersion = salesforceApiVersion;
    }

    public SalesforceConnection withSalesforceApiVersion(String salesforceApiVersion) {
        this.salesforceApiVersion = salesforceApiVersion;
        return this;
    }

    /**
     * Salesforce Domain
     * <p>
     * Domain of Salesforce instance
     * 
     */
    @JsonProperty("salesforceDomain")
    public String getSalesforceDomain() {
        return salesforceDomain;
    }

    /**
     * Salesforce Domain
     * <p>
     * Domain of Salesforce instance
     * 
     */
    @JsonProperty("salesforceDomain")
    public void setSalesforceDomain(String salesforceDomain) {
        this.salesforceDomain = salesforceDomain;
    }

    public SalesforceConnection withSalesforceDomain(String salesforceDomain) {
        this.salesforceDomain = salesforceDomain;
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

    public SalesforceConnection withConnectionOptions(ConnectionOptions connectionOptions) {
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

    public SalesforceConnection withConnectionArguments(ConnectionArguments connectionArguments) {
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

    public SalesforceConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SalesforceConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("securityToken");
        sb.append('=');
        sb.append(((this.securityToken == null)?"<null>":this.securityToken));
        sb.append(',');
        sb.append("sobjectName");
        sb.append('=');
        sb.append(((this.sobjectName == null)?"<null>":this.sobjectName));
        sb.append(',');
        sb.append("databaseName");
        sb.append('=');
        sb.append(((this.databaseName == null)?"<null>":this.databaseName));
        sb.append(',');
        sb.append("salesforceApiVersion");
        sb.append('=');
        sb.append(((this.salesforceApiVersion == null)?"<null>":this.salesforceApiVersion));
        sb.append(',');
        sb.append("salesforceDomain");
        sb.append('=');
        sb.append(((this.salesforceDomain == null)?"<null>":this.salesforceDomain));
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
        result = ((result* 31)+((this.securityToken == null)? 0 :this.securityToken.hashCode()));
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.databaseName == null)? 0 :this.databaseName.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.salesforceApiVersion == null)? 0 :this.salesforceApiVersion.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.sobjectName == null)? 0 :this.sobjectName.hashCode()));
        result = ((result* 31)+((this.salesforceDomain == null)? 0 :this.salesforceDomain.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SalesforceConnection) == false) {
            return false;
        }
        SalesforceConnection rhs = ((SalesforceConnection) other);
        return ((((((((((((this.securityToken == rhs.securityToken)||((this.securityToken!= null)&&this.securityToken.equals(rhs.securityToken)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.databaseName == rhs.databaseName)||((this.databaseName!= null)&&this.databaseName.equals(rhs.databaseName))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.salesforceApiVersion == rhs.salesforceApiVersion)||((this.salesforceApiVersion!= null)&&this.salesforceApiVersion.equals(rhs.salesforceApiVersion))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.sobjectName == rhs.sobjectName)||((this.sobjectName!= null)&&this.sobjectName.equals(rhs.sobjectName))))&&((this.salesforceDomain == rhs.salesforceDomain)||((this.salesforceDomain!= null)&&this.salesforceDomain.equals(rhs.salesforceDomain))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SalesforceType {

        SALESFORCE("Salesforce");
        private final String value;
        private final static Map<String, SalesforceConnection.SalesforceType> CONSTANTS = new HashMap<String, SalesforceConnection.SalesforceType>();

        static {
            for (SalesforceConnection.SalesforceType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SalesforceType(String value) {
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
        public static SalesforceConnection.SalesforceType fromValue(String value) {
            SalesforceConnection.SalesforceType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
