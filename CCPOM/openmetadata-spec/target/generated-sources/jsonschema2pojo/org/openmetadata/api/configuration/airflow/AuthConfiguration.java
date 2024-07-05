
package org.openmetadata.api.configuration.airflow;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.security.client.Auth0SSOClientConfig;
import org.openmetadata.schema.security.client.AzureSSOClientConfig;
import org.openmetadata.schema.security.client.CustomOIDCSSOClientConfig;
import org.openmetadata.schema.security.client.GoogleSSOClientConfig;
import org.openmetadata.schema.security.client.OktaSSOClientConfig;
import org.openmetadata.schema.security.client.OpenMetadataJWTClientConfig;


/**
 * AuthConfiguration
 * <p>
 * This schema defines the Auth Config.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "google",
    "okta",
    "auth0",
    "azure",
    "customOidc",
    "openmetadata"
})
@Generated("jsonschema2pojo")
public class AuthConfiguration {

    /**
     * GoogleSSOClientConfig
     * <p>
     * Google SSO client security configs.
     * 
     */
    @JsonProperty("google")
    @JsonPropertyDescription("Google SSO client security configs.")
    @Valid
    private GoogleSSOClientConfig google;
    /**
     * OktaSSOClientConfig
     * <p>
     * Okta SSO client security configs.
     * 
     */
    @JsonProperty("okta")
    @JsonPropertyDescription("Okta SSO client security configs.")
    @Valid
    private OktaSSOClientConfig okta;
    /**
     * Auth0SSOClientConfig
     * <p>
     * Auth0 SSO client security configs.
     * 
     */
    @JsonProperty("auth0")
    @JsonPropertyDescription("Auth0 SSO client security configs.")
    @Valid
    private Auth0SSOClientConfig auth0;
    /**
     * AzureSSOClientConfig
     * <p>
     * Azure SSO Client security config to connect to OpenMetadata.
     * 
     */
    @JsonProperty("azure")
    @JsonPropertyDescription("Azure SSO Client security config to connect to OpenMetadata.")
    @Valid
    private AzureSSOClientConfig azure;
    /**
     * CustomOIDCSSOClientConfig
     * <p>
     * Custom OIDC SSO client security configs.
     * 
     */
    @JsonProperty("customOidc")
    @JsonPropertyDescription("Custom OIDC SSO client security configs.")
    @Valid
    private CustomOIDCSSOClientConfig customOidc;
    /**
     * openMetadataJWTClientConfig
     * <p>
     * openMetadataJWTClientConfig security configs.
     * 
     */
    @JsonProperty("openmetadata")
    @JsonPropertyDescription("openMetadataJWTClientConfig security configs.")
    @Valid
    private OpenMetadataJWTClientConfig openmetadata;

    /**
     * GoogleSSOClientConfig
     * <p>
     * Google SSO client security configs.
     * 
     */
    @JsonProperty("google")
    public GoogleSSOClientConfig getGoogle() {
        return google;
    }

    /**
     * GoogleSSOClientConfig
     * <p>
     * Google SSO client security configs.
     * 
     */
    @JsonProperty("google")
    public void setGoogle(GoogleSSOClientConfig google) {
        this.google = google;
    }

    public AuthConfiguration withGoogle(GoogleSSOClientConfig google) {
        this.google = google;
        return this;
    }

    /**
     * OktaSSOClientConfig
     * <p>
     * Okta SSO client security configs.
     * 
     */
    @JsonProperty("okta")
    public OktaSSOClientConfig getOkta() {
        return okta;
    }

    /**
     * OktaSSOClientConfig
     * <p>
     * Okta SSO client security configs.
     * 
     */
    @JsonProperty("okta")
    public void setOkta(OktaSSOClientConfig okta) {
        this.okta = okta;
    }

    public AuthConfiguration withOkta(OktaSSOClientConfig okta) {
        this.okta = okta;
        return this;
    }

    /**
     * Auth0SSOClientConfig
     * <p>
     * Auth0 SSO client security configs.
     * 
     */
    @JsonProperty("auth0")
    public Auth0SSOClientConfig getAuth0() {
        return auth0;
    }

    /**
     * Auth0SSOClientConfig
     * <p>
     * Auth0 SSO client security configs.
     * 
     */
    @JsonProperty("auth0")
    public void setAuth0(Auth0SSOClientConfig auth0) {
        this.auth0 = auth0;
    }

    public AuthConfiguration withAuth0(Auth0SSOClientConfig auth0) {
        this.auth0 = auth0;
        return this;
    }

    /**
     * AzureSSOClientConfig
     * <p>
     * Azure SSO Client security config to connect to OpenMetadata.
     * 
     */
    @JsonProperty("azure")
    public AzureSSOClientConfig getAzure() {
        return azure;
    }

    /**
     * AzureSSOClientConfig
     * <p>
     * Azure SSO Client security config to connect to OpenMetadata.
     * 
     */
    @JsonProperty("azure")
    public void setAzure(AzureSSOClientConfig azure) {
        this.azure = azure;
    }

    public AuthConfiguration withAzure(AzureSSOClientConfig azure) {
        this.azure = azure;
        return this;
    }

    /**
     * CustomOIDCSSOClientConfig
     * <p>
     * Custom OIDC SSO client security configs.
     * 
     */
    @JsonProperty("customOidc")
    public CustomOIDCSSOClientConfig getCustomOidc() {
        return customOidc;
    }

    /**
     * CustomOIDCSSOClientConfig
     * <p>
     * Custom OIDC SSO client security configs.
     * 
     */
    @JsonProperty("customOidc")
    public void setCustomOidc(CustomOIDCSSOClientConfig customOidc) {
        this.customOidc = customOidc;
    }

    public AuthConfiguration withCustomOidc(CustomOIDCSSOClientConfig customOidc) {
        this.customOidc = customOidc;
        return this;
    }

    /**
     * openMetadataJWTClientConfig
     * <p>
     * openMetadataJWTClientConfig security configs.
     * 
     */
    @JsonProperty("openmetadata")
    public OpenMetadataJWTClientConfig getOpenmetadata() {
        return openmetadata;
    }

    /**
     * openMetadataJWTClientConfig
     * <p>
     * openMetadataJWTClientConfig security configs.
     * 
     */
    @JsonProperty("openmetadata")
    public void setOpenmetadata(OpenMetadataJWTClientConfig openmetadata) {
        this.openmetadata = openmetadata;
    }

    public AuthConfiguration withOpenmetadata(OpenMetadataJWTClientConfig openmetadata) {
        this.openmetadata = openmetadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuthConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("google");
        sb.append('=');
        sb.append(((this.google == null)?"<null>":this.google));
        sb.append(',');
        sb.append("okta");
        sb.append('=');
        sb.append(((this.okta == null)?"<null>":this.okta));
        sb.append(',');
        sb.append("auth0");
        sb.append('=');
        sb.append(((this.auth0 == null)?"<null>":this.auth0));
        sb.append(',');
        sb.append("azure");
        sb.append('=');
        sb.append(((this.azure == null)?"<null>":this.azure));
        sb.append(',');
        sb.append("customOidc");
        sb.append('=');
        sb.append(((this.customOidc == null)?"<null>":this.customOidc));
        sb.append(',');
        sb.append("openmetadata");
        sb.append('=');
        sb.append(((this.openmetadata == null)?"<null>":this.openmetadata));
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
        result = ((result* 31)+((this.auth0 == null)? 0 :this.auth0 .hashCode()));
        result = ((result* 31)+((this.google == null)? 0 :this.google.hashCode()));
        result = ((result* 31)+((this.openmetadata == null)? 0 :this.openmetadata.hashCode()));
        result = ((result* 31)+((this.customOidc == null)? 0 :this.customOidc.hashCode()));
        result = ((result* 31)+((this.okta == null)? 0 :this.okta.hashCode()));
        result = ((result* 31)+((this.azure == null)? 0 :this.azure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthConfiguration) == false) {
            return false;
        }
        AuthConfiguration rhs = ((AuthConfiguration) other);
        return (((((((this.auth0 == rhs.auth0)||((this.auth0 != null)&&this.auth0 .equals(rhs.auth0)))&&((this.google == rhs.google)||((this.google!= null)&&this.google.equals(rhs.google))))&&((this.openmetadata == rhs.openmetadata)||((this.openmetadata!= null)&&this.openmetadata.equals(rhs.openmetadata))))&&((this.customOidc == rhs.customOidc)||((this.customOidc!= null)&&this.customOidc.equals(rhs.customOidc))))&&((this.okta == rhs.okta)||((this.okta!= null)&&this.okta.equals(rhs.okta))))&&((this.azure == rhs.azure)||((this.azure!= null)&&this.azure.equals(rhs.azure))));
    }

}
