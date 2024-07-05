
package org.openmetadata.catalog.type;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines defines the identity provider config.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityId",
    "ssoLoginUrl",
    "idpX509Certificate",
    "authorityUrl",
    "nameId"
})
@Generated("jsonschema2pojo")
public class IdentityProviderConfig {

    /**
     * Identity Provider Entity ID usually same as the SSO login URL.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    @JsonPropertyDescription("Identity Provider Entity ID usually same as the SSO login URL.")
    @NotNull
    private String entityId;
    /**
     * SSO Login URL.
     * (Required)
     * 
     */
    @JsonProperty("ssoLoginUrl")
    @JsonPropertyDescription("SSO Login URL.")
    @NotNull
    private String ssoLoginUrl;
    /**
     * X509 Certificate 
     * 
     */
    @JsonProperty("idpX509Certificate")
    @JsonPropertyDescription("X509 Certificate ")
    private String idpX509Certificate;
    /**
     * Authority URL to redirect the users on Sign In page
     * 
     */
    @JsonProperty("authorityUrl")
    @JsonPropertyDescription("Authority URL to redirect the users on Sign In page")
    private String authorityUrl;
    /**
     * Authority URL to redirect the users on Sign In page
     * 
     */
    @JsonProperty("nameId")
    @JsonPropertyDescription("Authority URL to redirect the users on Sign In page")
    private String nameId = "urn:oasis:names:tc:SAML:2.0:nameid-format:emailAddress";

    /**
     * Identity Provider Entity ID usually same as the SSO login URL.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Identity Provider Entity ID usually same as the SSO login URL.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public IdentityProviderConfig withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * SSO Login URL.
     * (Required)
     * 
     */
    @JsonProperty("ssoLoginUrl")
    public String getSsoLoginUrl() {
        return ssoLoginUrl;
    }

    /**
     * SSO Login URL.
     * (Required)
     * 
     */
    @JsonProperty("ssoLoginUrl")
    public void setSsoLoginUrl(String ssoLoginUrl) {
        this.ssoLoginUrl = ssoLoginUrl;
    }

    public IdentityProviderConfig withSsoLoginUrl(String ssoLoginUrl) {
        this.ssoLoginUrl = ssoLoginUrl;
        return this;
    }

    /**
     * X509 Certificate 
     * 
     */
    @JsonProperty("idpX509Certificate")
    public String getIdpX509Certificate() {
        return idpX509Certificate;
    }

    /**
     * X509 Certificate 
     * 
     */
    @JsonProperty("idpX509Certificate")
    public void setIdpX509Certificate(String idpX509Certificate) {
        this.idpX509Certificate = idpX509Certificate;
    }

    public IdentityProviderConfig withIdpX509Certificate(String idpX509Certificate) {
        this.idpX509Certificate = idpX509Certificate;
        return this;
    }

    /**
     * Authority URL to redirect the users on Sign In page
     * 
     */
    @JsonProperty("authorityUrl")
    public String getAuthorityUrl() {
        return authorityUrl;
    }

    /**
     * Authority URL to redirect the users on Sign In page
     * 
     */
    @JsonProperty("authorityUrl")
    public void setAuthorityUrl(String authorityUrl) {
        this.authorityUrl = authorityUrl;
    }

    public IdentityProviderConfig withAuthorityUrl(String authorityUrl) {
        this.authorityUrl = authorityUrl;
        return this;
    }

    /**
     * Authority URL to redirect the users on Sign In page
     * 
     */
    @JsonProperty("nameId")
    public String getNameId() {
        return nameId;
    }

    /**
     * Authority URL to redirect the users on Sign In page
     * 
     */
    @JsonProperty("nameId")
    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public IdentityProviderConfig withNameId(String nameId) {
        this.nameId = nameId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IdentityProviderConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("ssoLoginUrl");
        sb.append('=');
        sb.append(((this.ssoLoginUrl == null)?"<null>":this.ssoLoginUrl));
        sb.append(',');
        sb.append("idpX509Certificate");
        sb.append('=');
        sb.append(((this.idpX509Certificate == null)?"<null>":this.idpX509Certificate));
        sb.append(',');
        sb.append("authorityUrl");
        sb.append('=');
        sb.append(((this.authorityUrl == null)?"<null>":this.authorityUrl));
        sb.append(',');
        sb.append("nameId");
        sb.append('=');
        sb.append(((this.nameId == null)?"<null>":this.nameId));
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
        result = ((result* 31)+((this.nameId == null)? 0 :this.nameId.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.ssoLoginUrl == null)? 0 :this.ssoLoginUrl.hashCode()));
        result = ((result* 31)+((this.idpX509Certificate == null)? 0 :this.idpX509Certificate.hashCode()));
        result = ((result* 31)+((this.authorityUrl == null)? 0 :this.authorityUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdentityProviderConfig) == false) {
            return false;
        }
        IdentityProviderConfig rhs = ((IdentityProviderConfig) other);
        return ((((((this.nameId == rhs.nameId)||((this.nameId!= null)&&this.nameId.equals(rhs.nameId)))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.ssoLoginUrl == rhs.ssoLoginUrl)||((this.ssoLoginUrl!= null)&&this.ssoLoginUrl.equals(rhs.ssoLoginUrl))))&&((this.idpX509Certificate == rhs.idpX509Certificate)||((this.idpX509Certificate!= null)&&this.idpX509Certificate.equals(rhs.idpX509Certificate))))&&((this.authorityUrl == rhs.authorityUrl)||((this.authorityUrl!= null)&&this.authorityUrl.equals(rhs.authorityUrl))));
    }

}
