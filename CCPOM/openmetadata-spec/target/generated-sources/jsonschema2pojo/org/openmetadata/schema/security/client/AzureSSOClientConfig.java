
package org.openmetadata.schema.security.client;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * AzureSSOClientConfig
 * <p>
 * Azure SSO Client security config to connect to OpenMetadata.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clientSecret",
    "authority",
    "clientId",
    "scopes"
})
@Generated("jsonschema2pojo")
public class AzureSSOClientConfig {

    /**
     * Azure SSO client secret key
     * (Required)
     * 
     */
    @JsonProperty("clientSecret")
    @JsonPropertyDescription("Azure SSO client secret key")
    @PasswordField
    @NotNull
    private String clientSecret;
    /**
     * Azure SSO Authority
     * (Required)
     * 
     */
    @JsonProperty("authority")
    @JsonPropertyDescription("Azure SSO Authority")
    @NotNull
    private String authority;
    /**
     * Azure Client ID.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    @JsonPropertyDescription("Azure Client ID.")
    @NotNull
    private String clientId;
    /**
     * Azure Client ID.
     * (Required)
     * 
     */
    @JsonProperty("scopes")
    @JsonPropertyDescription("Azure Client ID.")
    @Valid
    @NotNull
    private List<String> scopes = new ArrayList<String>();

    /**
     * Azure SSO client secret key
     * (Required)
     * 
     */
    @JsonProperty("clientSecret")
    @PasswordField
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Azure SSO client secret key
     * (Required)
     * 
     */
    @JsonProperty("clientSecret")
    @PasswordField
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public AzureSSOClientConfig withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Azure SSO Authority
     * (Required)
     * 
     */
    @JsonProperty("authority")
    public String getAuthority() {
        return authority;
    }

    /**
     * Azure SSO Authority
     * (Required)
     * 
     */
    @JsonProperty("authority")
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public AzureSSOClientConfig withAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    /**
     * Azure Client ID.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * Azure Client ID.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public AzureSSOClientConfig withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Azure Client ID.
     * (Required)
     * 
     */
    @JsonProperty("scopes")
    public List<String> getScopes() {
        return scopes;
    }

    /**
     * Azure Client ID.
     * (Required)
     * 
     */
    @JsonProperty("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public AzureSSOClientConfig withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AzureSSOClientConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clientSecret");
        sb.append('=');
        sb.append(((this.clientSecret == null)?"<null>":this.clientSecret));
        sb.append(',');
        sb.append("authority");
        sb.append('=');
        sb.append(((this.authority == null)?"<null>":this.authority));
        sb.append(',');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("scopes");
        sb.append('=');
        sb.append(((this.scopes == null)?"<null>":this.scopes));
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
        result = ((result* 31)+((this.clientSecret == null)? 0 :this.clientSecret.hashCode()));
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        result = ((result* 31)+((this.scopes == null)? 0 :this.scopes.hashCode()));
        result = ((result* 31)+((this.authority == null)? 0 :this.authority.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AzureSSOClientConfig) == false) {
            return false;
        }
        AzureSSOClientConfig rhs = ((AzureSSOClientConfig) other);
        return (((((this.clientSecret == rhs.clientSecret)||((this.clientSecret!= null)&&this.clientSecret.equals(rhs.clientSecret)))&&((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId))))&&((this.scopes == rhs.scopes)||((this.scopes!= null)&&this.scopes.equals(rhs.scopes))))&&((this.authority == rhs.authority)||((this.authority!= null)&&this.authority.equals(rhs.authority))));
    }

}
