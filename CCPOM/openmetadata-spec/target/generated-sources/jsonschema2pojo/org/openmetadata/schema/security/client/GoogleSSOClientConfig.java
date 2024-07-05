
package org.openmetadata.schema.security.client;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * GoogleSSOClientConfig
 * <p>
 * Google SSO client security configs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "secretKey",
    "audience"
})
@Generated("jsonschema2pojo")
public class GoogleSSOClientConfig {

    /**
     * Google SSO client secret key path or contents.
     * (Required)
     * 
     */
    @JsonProperty("secretKey")
    @JsonPropertyDescription("Google SSO client secret key path or contents.")
    @PasswordField
    @NotNull
    private String secretKey;
    /**
     * Google SSO audience URL
     * 
     */
    @JsonProperty("audience")
    @JsonPropertyDescription("Google SSO audience URL")
    private String audience = "https://www.googleapis.com/oauth2/v4/token";

    /**
     * Google SSO client secret key path or contents.
     * (Required)
     * 
     */
    @JsonProperty("secretKey")
    @PasswordField
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * Google SSO client secret key path or contents.
     * (Required)
     * 
     */
    @JsonProperty("secretKey")
    @PasswordField
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public GoogleSSOClientConfig withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Google SSO audience URL
     * 
     */
    @JsonProperty("audience")
    public String getAudience() {
        return audience;
    }

    /**
     * Google SSO audience URL
     * 
     */
    @JsonProperty("audience")
    public void setAudience(String audience) {
        this.audience = audience;
    }

    public GoogleSSOClientConfig withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GoogleSSOClientConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("secretKey");
        sb.append('=');
        sb.append(((this.secretKey == null)?"<null>":this.secretKey));
        sb.append(',');
        sb.append("audience");
        sb.append('=');
        sb.append(((this.audience == null)?"<null>":this.audience));
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
        result = ((result* 31)+((this.secretKey == null)? 0 :this.secretKey.hashCode()));
        result = ((result* 31)+((this.audience == null)? 0 :this.audience.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GoogleSSOClientConfig) == false) {
            return false;
        }
        GoogleSSOClientConfig rhs = ((GoogleSSOClientConfig) other);
        return (((this.secretKey == rhs.secretKey)||((this.secretKey!= null)&&this.secretKey.equals(rhs.secretKey)))&&((this.audience == rhs.audience)||((this.audience!= null)&&this.audience.equals(rhs.audience))));
    }

}
