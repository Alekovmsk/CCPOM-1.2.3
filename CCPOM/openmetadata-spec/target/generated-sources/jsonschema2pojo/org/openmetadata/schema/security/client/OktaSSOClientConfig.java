
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
 * OktaSSOClientConfig
 * <p>
 * Okta SSO client security configs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clientId",
    "orgURL",
    "privateKey",
    "email",
    "scopes"
})
@Generated("jsonschema2pojo")
public class OktaSSOClientConfig {

    /**
     * Okta Client ID.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    @JsonPropertyDescription("Okta Client ID.")
    @NotNull
    private String clientId;
    /**
     * Okta org url.
     * (Required)
     * 
     */
    @JsonProperty("orgURL")
    @JsonPropertyDescription("Okta org url.")
    @NotNull
    private String orgURL;
    /**
     * Okta Private Key.
     * (Required)
     * 
     */
    @JsonProperty("privateKey")
    @JsonPropertyDescription("Okta Private Key.")
    @PasswordField
    @NotNull
    private String privateKey;
    /**
     * Okta Service account Email.
     * (Required)
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("Okta Service account Email.")
    @NotNull
    private String email;
    /**
     * Okta client scopes.
     * 
     */
    @JsonProperty("scopes")
    @JsonPropertyDescription("Okta client scopes.")
    @Valid
    private List<String> scopes = new ArrayList<String>();

    /**
     * Okta Client ID.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * Okta Client ID.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public OktaSSOClientConfig withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Okta org url.
     * (Required)
     * 
     */
    @JsonProperty("orgURL")
    public String getOrgURL() {
        return orgURL;
    }

    /**
     * Okta org url.
     * (Required)
     * 
     */
    @JsonProperty("orgURL")
    public void setOrgURL(String orgURL) {
        this.orgURL = orgURL;
    }

    public OktaSSOClientConfig withOrgURL(String orgURL) {
        this.orgURL = orgURL;
        return this;
    }

    /**
     * Okta Private Key.
     * (Required)
     * 
     */
    @JsonProperty("privateKey")
    @PasswordField
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * Okta Private Key.
     * (Required)
     * 
     */
    @JsonProperty("privateKey")
    @PasswordField
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public OktaSSOClientConfig withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Okta Service account Email.
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Okta Service account Email.
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public OktaSSOClientConfig withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Okta client scopes.
     * 
     */
    @JsonProperty("scopes")
    public List<String> getScopes() {
        return scopes;
    }

    /**
     * Okta client scopes.
     * 
     */
    @JsonProperty("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public OktaSSOClientConfig withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OktaSSOClientConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("orgURL");
        sb.append('=');
        sb.append(((this.orgURL == null)?"<null>":this.orgURL));
        sb.append(',');
        sb.append("privateKey");
        sb.append('=');
        sb.append(((this.privateKey == null)?"<null>":this.privateKey));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
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
        result = ((result* 31)+((this.privateKey == null)? 0 :this.privateKey.hashCode()));
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        result = ((result* 31)+((this.orgURL == null)? 0 :this.orgURL.hashCode()));
        result = ((result* 31)+((this.scopes == null)? 0 :this.scopes.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OktaSSOClientConfig) == false) {
            return false;
        }
        OktaSSOClientConfig rhs = ((OktaSSOClientConfig) other);
        return ((((((this.privateKey == rhs.privateKey)||((this.privateKey!= null)&&this.privateKey.equals(rhs.privateKey)))&&((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId))))&&((this.orgURL == rhs.orgURL)||((this.orgURL!= null)&&this.orgURL.equals(rhs.orgURL))))&&((this.scopes == rhs.scopes)||((this.scopes!= null)&&this.scopes.equals(rhs.scopes))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
