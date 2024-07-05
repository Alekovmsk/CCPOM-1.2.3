
package org.openmetadata.schema.security.client;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * CustomOIDCSSOClientConfig
 * <p>
 * Custom OIDC SSO client security configs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clientId",
    "secretKey",
    "tokenEndpoint"
})
@Generated("jsonschema2pojo")
public class CustomOIDCSSOClientConfig {

    /**
     * Custom OIDC Client ID.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    @JsonPropertyDescription("Custom OIDC Client ID.")
    @NotNull
    private String clientId;
    /**
     * Custom OIDC Client Secret Key.
     * (Required)
     * 
     */
    @JsonProperty("secretKey")
    @JsonPropertyDescription("Custom OIDC Client Secret Key.")
    @PasswordField
    @NotNull
    private String secretKey;
    /**
     * Custom OIDC token endpoint.
     * (Required)
     * 
     */
    @JsonProperty("tokenEndpoint")
    @JsonPropertyDescription("Custom OIDC token endpoint.")
    @NotNull
    private String tokenEndpoint;

    /**
     * Custom OIDC Client ID.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * Custom OIDC Client ID.
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public CustomOIDCSSOClientConfig withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Custom OIDC Client Secret Key.
     * (Required)
     * 
     */
    @JsonProperty("secretKey")
    @PasswordField
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * Custom OIDC Client Secret Key.
     * (Required)
     * 
     */
    @JsonProperty("secretKey")
    @PasswordField
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public CustomOIDCSSOClientConfig withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Custom OIDC token endpoint.
     * (Required)
     * 
     */
    @JsonProperty("tokenEndpoint")
    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    /**
     * Custom OIDC token endpoint.
     * (Required)
     * 
     */
    @JsonProperty("tokenEndpoint")
    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    public CustomOIDCSSOClientConfig withTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomOIDCSSOClientConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("secretKey");
        sb.append('=');
        sb.append(((this.secretKey == null)?"<null>":this.secretKey));
        sb.append(',');
        sb.append("tokenEndpoint");
        sb.append('=');
        sb.append(((this.tokenEndpoint == null)?"<null>":this.tokenEndpoint));
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
        result = ((result* 31)+((this.tokenEndpoint == null)? 0 :this.tokenEndpoint.hashCode()));
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        result = ((result* 31)+((this.secretKey == null)? 0 :this.secretKey.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomOIDCSSOClientConfig) == false) {
            return false;
        }
        CustomOIDCSSOClientConfig rhs = ((CustomOIDCSSOClientConfig) other);
        return ((((this.tokenEndpoint == rhs.tokenEndpoint)||((this.tokenEndpoint!= null)&&this.tokenEndpoint.equals(rhs.tokenEndpoint)))&&((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId))))&&((this.secretKey == rhs.secretKey)||((this.secretKey!= null)&&this.secretKey.equals(rhs.secretKey))));
    }

}
