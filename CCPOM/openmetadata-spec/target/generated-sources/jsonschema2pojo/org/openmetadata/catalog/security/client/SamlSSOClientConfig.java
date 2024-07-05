
package org.openmetadata.catalog.security.client;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.catalog.type.IdentityProviderConfig;
import org.openmetadata.catalog.type.SamlSecurityConfig;
import org.openmetadata.catalog.type.ServiceProviderConfig;


/**
 * SamlSSOClientConfig
 * <p>
 * SAML SSO client security configs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idp",
    "sp",
    "security",
    "debugMode"
})
@Generated("jsonschema2pojo")
public class SamlSSOClientConfig {

    /**
     * This schema defines defines the identity provider config.
     * (Required)
     * 
     */
    @JsonProperty("idp")
    @JsonPropertyDescription("This schema defines defines the identity provider config.")
    @Valid
    @NotNull
    private IdentityProviderConfig idp;
    /**
     * This schema defines defines the identity provider config.
     * (Required)
     * 
     */
    @JsonProperty("sp")
    @JsonPropertyDescription("This schema defines defines the identity provider config.")
    @Valid
    @NotNull
    private ServiceProviderConfig sp;
    /**
     * This schema defines defines the security config for SAML.
     * 
     */
    @JsonProperty("security")
    @JsonPropertyDescription("This schema defines defines the security config for SAML.")
    @Valid
    private SamlSecurityConfig security;
    /**
     * Get logs from the Library in debug mode
     * 
     */
    @JsonProperty("debugMode")
    @JsonPropertyDescription("Get logs from the Library in debug mode")
    private Boolean debugMode = false;

    /**
     * This schema defines defines the identity provider config.
     * (Required)
     * 
     */
    @JsonProperty("idp")
    public IdentityProviderConfig getIdp() {
        return idp;
    }

    /**
     * This schema defines defines the identity provider config.
     * (Required)
     * 
     */
    @JsonProperty("idp")
    public void setIdp(IdentityProviderConfig idp) {
        this.idp = idp;
    }

    public SamlSSOClientConfig withIdp(IdentityProviderConfig idp) {
        this.idp = idp;
        return this;
    }

    /**
     * This schema defines defines the identity provider config.
     * (Required)
     * 
     */
    @JsonProperty("sp")
    public ServiceProviderConfig getSp() {
        return sp;
    }

    /**
     * This schema defines defines the identity provider config.
     * (Required)
     * 
     */
    @JsonProperty("sp")
    public void setSp(ServiceProviderConfig sp) {
        this.sp = sp;
    }

    public SamlSSOClientConfig withSp(ServiceProviderConfig sp) {
        this.sp = sp;
        return this;
    }

    /**
     * This schema defines defines the security config for SAML.
     * 
     */
    @JsonProperty("security")
    public SamlSecurityConfig getSecurity() {
        return security;
    }

    /**
     * This schema defines defines the security config for SAML.
     * 
     */
    @JsonProperty("security")
    public void setSecurity(SamlSecurityConfig security) {
        this.security = security;
    }

    public SamlSSOClientConfig withSecurity(SamlSecurityConfig security) {
        this.security = security;
        return this;
    }

    /**
     * Get logs from the Library in debug mode
     * 
     */
    @JsonProperty("debugMode")
    public Boolean getDebugMode() {
        return debugMode;
    }

    /**
     * Get logs from the Library in debug mode
     * 
     */
    @JsonProperty("debugMode")
    public void setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
    }

    public SamlSSOClientConfig withDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SamlSSOClientConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("idp");
        sb.append('=');
        sb.append(((this.idp == null)?"<null>":this.idp));
        sb.append(',');
        sb.append("sp");
        sb.append('=');
        sb.append(((this.sp == null)?"<null>":this.sp));
        sb.append(',');
        sb.append("security");
        sb.append('=');
        sb.append(((this.security == null)?"<null>":this.security));
        sb.append(',');
        sb.append("debugMode");
        sb.append('=');
        sb.append(((this.debugMode == null)?"<null>":this.debugMode));
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
        result = ((result* 31)+((this.security == null)? 0 :this.security.hashCode()));
        result = ((result* 31)+((this.idp == null)? 0 :this.idp.hashCode()));
        result = ((result* 31)+((this.sp == null)? 0 :this.sp.hashCode()));
        result = ((result* 31)+((this.debugMode == null)? 0 :this.debugMode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SamlSSOClientConfig) == false) {
            return false;
        }
        SamlSSOClientConfig rhs = ((SamlSSOClientConfig) other);
        return (((((this.security == rhs.security)||((this.security!= null)&&this.security.equals(rhs.security)))&&((this.idp == rhs.idp)||((this.idp!= null)&&this.idp.equals(rhs.idp))))&&((this.sp == rhs.sp)||((this.sp!= null)&&this.sp.equals(rhs.sp))))&&((this.debugMode == rhs.debugMode)||((this.debugMode!= null)&&this.debugMode.equals(rhs.debugMode))));
    }

}
