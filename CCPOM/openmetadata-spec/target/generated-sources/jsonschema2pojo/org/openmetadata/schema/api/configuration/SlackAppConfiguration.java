
package org.openmetadata.schema.api.configuration;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SlackAppConfiguration
 * <p>
 * This schema defines the Slack App Information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clientId",
    "clientSecret",
    "signingCertificate",
    "scopes"
})
@Generated("jsonschema2pojo")
public class SlackAppConfiguration {

    /**
     * Client Id of the Application
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    @JsonPropertyDescription("Client Id of the Application")
    @NotNull
    private String clientId;
    /**
     * Client Secret of the Application.
     * (Required)
     * 
     */
    @JsonProperty("clientSecret")
    @JsonPropertyDescription("Client Secret of the Application.")
    @NotNull
    private String clientSecret;
    /**
     * Signing Certificate of the Application.
     * (Required)
     * 
     */
    @JsonProperty("signingCertificate")
    @JsonPropertyDescription("Signing Certificate of the Application.")
    @NotNull
    private String signingCertificate;
    /**
     * Scopes to Request in OAuth
     * 
     */
    @JsonProperty("scopes")
    @JsonPropertyDescription("Scopes to Request in OAuth")
    private String scopes;

    /**
     * Client Id of the Application
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * Client Id of the Application
     * (Required)
     * 
     */
    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public SlackAppConfiguration withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Client Secret of the Application.
     * (Required)
     * 
     */
    @JsonProperty("clientSecret")
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Client Secret of the Application.
     * (Required)
     * 
     */
    @JsonProperty("clientSecret")
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public SlackAppConfiguration withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Signing Certificate of the Application.
     * (Required)
     * 
     */
    @JsonProperty("signingCertificate")
    public String getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Signing Certificate of the Application.
     * (Required)
     * 
     */
    @JsonProperty("signingCertificate")
    public void setSigningCertificate(String signingCertificate) {
        this.signingCertificate = signingCertificate;
    }

    public SlackAppConfiguration withSigningCertificate(String signingCertificate) {
        this.signingCertificate = signingCertificate;
        return this;
    }

    /**
     * Scopes to Request in OAuth
     * 
     */
    @JsonProperty("scopes")
    public String getScopes() {
        return scopes;
    }

    /**
     * Scopes to Request in OAuth
     * 
     */
    @JsonProperty("scopes")
    public void setScopes(String scopes) {
        this.scopes = scopes;
    }

    public SlackAppConfiguration withScopes(String scopes) {
        this.scopes = scopes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SlackAppConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("clientSecret");
        sb.append('=');
        sb.append(((this.clientSecret == null)?"<null>":this.clientSecret));
        sb.append(',');
        sb.append("signingCertificate");
        sb.append('=');
        sb.append(((this.signingCertificate == null)?"<null>":this.signingCertificate));
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
        result = ((result* 31)+((this.signingCertificate == null)? 0 :this.signingCertificate.hashCode()));
        result = ((result* 31)+((this.clientSecret == null)? 0 :this.clientSecret.hashCode()));
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        result = ((result* 31)+((this.scopes == null)? 0 :this.scopes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SlackAppConfiguration) == false) {
            return false;
        }
        SlackAppConfiguration rhs = ((SlackAppConfiguration) other);
        return (((((this.signingCertificate == rhs.signingCertificate)||((this.signingCertificate!= null)&&this.signingCertificate.equals(rhs.signingCertificate)))&&((this.clientSecret == rhs.clientSecret)||((this.clientSecret!= null)&&this.clientSecret.equals(rhs.clientSecret))))&&((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId))))&&((this.scopes == rhs.scopes)||((this.scopes!= null)&&this.scopes.equals(rhs.scopes))));
    }

}
