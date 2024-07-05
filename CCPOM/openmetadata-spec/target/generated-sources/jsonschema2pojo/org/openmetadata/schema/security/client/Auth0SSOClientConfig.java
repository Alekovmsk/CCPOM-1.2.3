
package org.openmetadata.schema.security.client;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * Auth0SSOClientConfig
 * <p>
 * Auth0 SSO client security configs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clientId",
    "secretKey",
    "domain"
})
@Generated("jsonschema2pojo")
public class Auth0SSOClientConfig {

    /**
     * Auth0 Client ID.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    @JsonPropertyDescription("Auth0 Client ID.")
    @NotNull
    private String clientId;
    /**
     * Auth0 Client Secret Key.
     * (Required)
     * 
     */
    @JsonProperty("secretKey")
    @JsonPropertyDescription("Auth0 Client Secret Key.")
    @PasswordField
    @NotNull
    private String secretKey;
    /**
     * Auth0 Domain.
     * (Required)
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("Auth0 Domain.")
    @NotNull
    private String domain;

    /**
     * Auth0 Client ID.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * Auth0 Client ID.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Auth0SSOClientConfig withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Auth0 Client Secret Key.
     * (Required)
     * 
     */
    @JsonProperty("secretKey")
    @PasswordField
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * Auth0 Client Secret Key.
     * (Required)
     * 
     */
    @JsonProperty("secretKey")
    @PasswordField
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Auth0SSOClientConfig withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Auth0 Domain.
     * (Required)
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Auth0 Domain.
     * (Required)
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Auth0SSOClientConfig withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Auth0SSOClientConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("secretKey");
        sb.append('=');
        sb.append(((this.secretKey == null)?"<null>":this.secretKey));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
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
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        result = ((result* 31)+((this.secretKey == null)? 0 :this.secretKey.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Auth0SSOClientConfig) == false) {
            return false;
        }
        Auth0SSOClientConfig rhs = ((Auth0SSOClientConfig) other);
        return ((((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId)))&&((this.secretKey == rhs.secretKey)||((this.secretKey!= null)&&this.secretKey.equals(rhs.secretKey))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))));
    }

}
