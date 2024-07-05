
package org.openmetadata.schema.api.security;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.catalog.security.client.SamlSSOClientConfig;
import org.openmetadata.schema.auth.LdapConfiguration;
import org.openmetadata.schema.services.connections.metadata.AuthProvider;


/**
 * AuthenticationConfiguration
 * <p>
 * This schema defines the Authentication Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "provider",
    "responseType",
    "providerName",
    "publicKeyUrls",
    "authority",
    "clientId",
    "callbackUrl",
    "jwtPrincipalClaims",
    "enableSelfSignup",
    "ldapConfiguration",
    "samlConfiguration"
})
@Generated("jsonschema2pojo")
public class AuthenticationConfiguration {

    /**
     * OpenMetadata Server Authentication Provider. Make sure configure same auth providers as the one configured on OpenMetadata server.
     * (Required)
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("OpenMetadata Server Authentication Provider. Make sure configure same auth providers as the one configured on OpenMetadata server.")
    @NotNull
    private AuthProvider provider = AuthProvider.fromValue("basic");
    /**
     * Response Type
     * 
     */
    @JsonProperty("responseType")
    @JsonPropertyDescription("Response Type")
    private ResponseType responseType = ResponseType.fromValue("id_token");
    /**
     * Custom OIDC Authentication Provider Name
     * (Required)
     * 
     */
    @JsonProperty("providerName")
    @JsonPropertyDescription("Custom OIDC Authentication Provider Name")
    @NotNull
    private String providerName;
    /**
     * List of Public Key URLs
     * (Required)
     * 
     */
    @JsonProperty("publicKeyUrls")
    @JsonPropertyDescription("List of Public Key URLs")
    @Valid
    @NotNull
    private List<String> publicKeyUrls = new ArrayList<String>();
    /**
     * Authentication Authority
     * (Required)
     * 
     */
    @JsonProperty("authority")
    @JsonPropertyDescription("Authentication Authority")
    @NotNull
    private String authority;
    /**
     * Client ID
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    @JsonPropertyDescription("Client ID")
    @NotNull
    private String clientId;
    /**
     * Callback URL
     * (Required)
     * 
     */
    @JsonProperty("callbackUrl")
    @JsonPropertyDescription("Callback URL")
    @NotNull
    private String callbackUrl;
    /**
     * Jwt Principal Claim
     * (Required)
     * 
     */
    @JsonProperty("jwtPrincipalClaims")
    @JsonPropertyDescription("Jwt Principal Claim")
    @Valid
    @NotNull
    private List<String> jwtPrincipalClaims = new ArrayList<String>();
    /**
     * Enable Self Sign Up
     * 
     */
    @JsonProperty("enableSelfSignup")
    @JsonPropertyDescription("Enable Self Sign Up")
    private Boolean enableSelfSignup = false;
    /**
     * LdapConfiguration
     * <p>
     * LDAP Configuration
     * 
     */
    @JsonProperty("ldapConfiguration")
    @JsonPropertyDescription("LDAP Configuration")
    @Valid
    private LdapConfiguration ldapConfiguration;
    /**
     * SamlSSOClientConfig
     * <p>
     * SAML SSO client security configs.
     * 
     */
    @JsonProperty("samlConfiguration")
    @JsonPropertyDescription("SAML SSO client security configs.")
    @Valid
    private SamlSSOClientConfig samlConfiguration;

    /**
     * OpenMetadata Server Authentication Provider. Make sure configure same auth providers as the one configured on OpenMetadata server.
     * (Required)
     * 
     */
    @JsonProperty("provider")
    public AuthProvider getProvider() {
        return provider;
    }

    /**
     * OpenMetadata Server Authentication Provider. Make sure configure same auth providers as the one configured on OpenMetadata server.
     * (Required)
     * 
     */
    @JsonProperty("provider")
    public void setProvider(AuthProvider provider) {
        this.provider = provider;
    }

    public AuthenticationConfiguration withProvider(AuthProvider provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Response Type
     * 
     */
    @JsonProperty("responseType")
    public ResponseType getResponseType() {
        return responseType;
    }

    /**
     * Response Type
     * 
     */
    @JsonProperty("responseType")
    public void setResponseType(ResponseType responseType) {
        this.responseType = responseType;
    }

    public AuthenticationConfiguration withResponseType(ResponseType responseType) {
        this.responseType = responseType;
        return this;
    }

    /**
     * Custom OIDC Authentication Provider Name
     * (Required)
     * 
     */
    @JsonProperty("providerName")
    public String getProviderName() {
        return providerName;
    }

    /**
     * Custom OIDC Authentication Provider Name
     * (Required)
     * 
     */
    @JsonProperty("providerName")
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public AuthenticationConfiguration withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * List of Public Key URLs
     * (Required)
     * 
     */
    @JsonProperty("publicKeyUrls")
    public List<String> getPublicKeyUrls() {
        return publicKeyUrls;
    }

    /**
     * List of Public Key URLs
     * (Required)
     * 
     */
    @JsonProperty("publicKeyUrls")
    public void setPublicKeyUrls(List<String> publicKeyUrls) {
        this.publicKeyUrls = publicKeyUrls;
    }

    public AuthenticationConfiguration withPublicKeyUrls(List<String> publicKeyUrls) {
        this.publicKeyUrls = publicKeyUrls;
        return this;
    }

    /**
     * Authentication Authority
     * (Required)
     * 
     */
    @JsonProperty("authority")
    public String getAuthority() {
        return authority;
    }

    /**
     * Authentication Authority
     * (Required)
     * 
     */
    @JsonProperty("authority")
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public AuthenticationConfiguration withAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    /**
     * Client ID
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * Client ID
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public AuthenticationConfiguration withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Callback URL
     * (Required)
     * 
     */
    @JsonProperty("callbackUrl")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * Callback URL
     * (Required)
     * 
     */
    @JsonProperty("callbackUrl")
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public AuthenticationConfiguration withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * Jwt Principal Claim
     * (Required)
     * 
     */
    @JsonProperty("jwtPrincipalClaims")
    public List<String> getJwtPrincipalClaims() {
        return jwtPrincipalClaims;
    }

    /**
     * Jwt Principal Claim
     * (Required)
     * 
     */
    @JsonProperty("jwtPrincipalClaims")
    public void setJwtPrincipalClaims(List<String> jwtPrincipalClaims) {
        this.jwtPrincipalClaims = jwtPrincipalClaims;
    }

    public AuthenticationConfiguration withJwtPrincipalClaims(List<String> jwtPrincipalClaims) {
        this.jwtPrincipalClaims = jwtPrincipalClaims;
        return this;
    }

    /**
     * Enable Self Sign Up
     * 
     */
    @JsonProperty("enableSelfSignup")
    public Boolean getEnableSelfSignup() {
        return enableSelfSignup;
    }

    /**
     * Enable Self Sign Up
     * 
     */
    @JsonProperty("enableSelfSignup")
    public void setEnableSelfSignup(Boolean enableSelfSignup) {
        this.enableSelfSignup = enableSelfSignup;
    }

    public AuthenticationConfiguration withEnableSelfSignup(Boolean enableSelfSignup) {
        this.enableSelfSignup = enableSelfSignup;
        return this;
    }

    /**
     * LdapConfiguration
     * <p>
     * LDAP Configuration
     * 
     */
    @JsonProperty("ldapConfiguration")
    public LdapConfiguration getLdapConfiguration() {
        return ldapConfiguration;
    }

    /**
     * LdapConfiguration
     * <p>
     * LDAP Configuration
     * 
     */
    @JsonProperty("ldapConfiguration")
    public void setLdapConfiguration(LdapConfiguration ldapConfiguration) {
        this.ldapConfiguration = ldapConfiguration;
    }

    public AuthenticationConfiguration withLdapConfiguration(LdapConfiguration ldapConfiguration) {
        this.ldapConfiguration = ldapConfiguration;
        return this;
    }

    /**
     * SamlSSOClientConfig
     * <p>
     * SAML SSO client security configs.
     * 
     */
    @JsonProperty("samlConfiguration")
    public SamlSSOClientConfig getSamlConfiguration() {
        return samlConfiguration;
    }

    /**
     * SamlSSOClientConfig
     * <p>
     * SAML SSO client security configs.
     * 
     */
    @JsonProperty("samlConfiguration")
    public void setSamlConfiguration(SamlSSOClientConfig samlConfiguration) {
        this.samlConfiguration = samlConfiguration;
    }

    public AuthenticationConfiguration withSamlConfiguration(SamlSSOClientConfig samlConfiguration) {
        this.samlConfiguration = samlConfiguration;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuthenticationConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("responseType");
        sb.append('=');
        sb.append(((this.responseType == null)?"<null>":this.responseType));
        sb.append(',');
        sb.append("providerName");
        sb.append('=');
        sb.append(((this.providerName == null)?"<null>":this.providerName));
        sb.append(',');
        sb.append("publicKeyUrls");
        sb.append('=');
        sb.append(((this.publicKeyUrls == null)?"<null>":this.publicKeyUrls));
        sb.append(',');
        sb.append("authority");
        sb.append('=');
        sb.append(((this.authority == null)?"<null>":this.authority));
        sb.append(',');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("callbackUrl");
        sb.append('=');
        sb.append(((this.callbackUrl == null)?"<null>":this.callbackUrl));
        sb.append(',');
        sb.append("jwtPrincipalClaims");
        sb.append('=');
        sb.append(((this.jwtPrincipalClaims == null)?"<null>":this.jwtPrincipalClaims));
        sb.append(',');
        sb.append("enableSelfSignup");
        sb.append('=');
        sb.append(((this.enableSelfSignup == null)?"<null>":this.enableSelfSignup));
        sb.append(',');
        sb.append("ldapConfiguration");
        sb.append('=');
        sb.append(((this.ldapConfiguration == null)?"<null>":this.ldapConfiguration));
        sb.append(',');
        sb.append("samlConfiguration");
        sb.append('=');
        sb.append(((this.samlConfiguration == null)?"<null>":this.samlConfiguration));
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
        result = ((result* 31)+((this.enableSelfSignup == null)? 0 :this.enableSelfSignup.hashCode()));
        result = ((result* 31)+((this.responseType == null)? 0 :this.responseType.hashCode()));
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.publicKeyUrls == null)? 0 :this.publicKeyUrls.hashCode()));
        result = ((result* 31)+((this.authority == null)? 0 :this.authority.hashCode()));
        result = ((result* 31)+((this.jwtPrincipalClaims == null)? 0 :this.jwtPrincipalClaims.hashCode()));
        result = ((result* 31)+((this.callbackUrl == null)? 0 :this.callbackUrl.hashCode()));
        result = ((result* 31)+((this.samlConfiguration == null)? 0 :this.samlConfiguration.hashCode()));
        result = ((result* 31)+((this.ldapConfiguration == null)? 0 :this.ldapConfiguration.hashCode()));
        result = ((result* 31)+((this.providerName == null)? 0 :this.providerName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthenticationConfiguration) == false) {
            return false;
        }
        AuthenticationConfiguration rhs = ((AuthenticationConfiguration) other);
        return ((((((((((((this.enableSelfSignup == rhs.enableSelfSignup)||((this.enableSelfSignup!= null)&&this.enableSelfSignup.equals(rhs.enableSelfSignup)))&&((this.responseType == rhs.responseType)||((this.responseType!= null)&&this.responseType.equals(rhs.responseType))))&&((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.publicKeyUrls == rhs.publicKeyUrls)||((this.publicKeyUrls!= null)&&this.publicKeyUrls.equals(rhs.publicKeyUrls))))&&((this.authority == rhs.authority)||((this.authority!= null)&&this.authority.equals(rhs.authority))))&&((this.jwtPrincipalClaims == rhs.jwtPrincipalClaims)||((this.jwtPrincipalClaims!= null)&&this.jwtPrincipalClaims.equals(rhs.jwtPrincipalClaims))))&&((this.callbackUrl == rhs.callbackUrl)||((this.callbackUrl!= null)&&this.callbackUrl.equals(rhs.callbackUrl))))&&((this.samlConfiguration == rhs.samlConfiguration)||((this.samlConfiguration!= null)&&this.samlConfiguration.equals(rhs.samlConfiguration))))&&((this.ldapConfiguration == rhs.ldapConfiguration)||((this.ldapConfiguration!= null)&&this.ldapConfiguration.equals(rhs.ldapConfiguration))))&&((this.providerName == rhs.providerName)||((this.providerName!= null)&&this.providerName.equals(rhs.providerName))));
    }

}
