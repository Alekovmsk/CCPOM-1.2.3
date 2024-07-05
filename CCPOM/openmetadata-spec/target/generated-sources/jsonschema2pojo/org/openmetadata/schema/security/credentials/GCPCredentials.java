
package org.openmetadata.schema.security.credentials;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GCPCredentials
 * <p>
 * GCP credentials configs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gcpConfig",
    "gcpImpersonateServiceAccount"
})
@Generated("jsonschema2pojo")
public class GCPCredentials {

    /**
     * GCP Credentials Configuration
     * <p>
     * We support two ways of authenticating to GCP i.e via GCP Credentials Values or GCP Credentials Path
     * (Required)
     * 
     */
    @JsonProperty("gcpConfig")
    @JsonPropertyDescription("We support two ways of authenticating to GCP i.e via GCP Credentials Values or GCP Credentials Path")
    @NotNull
    private Object gcpConfig;
    /**
     * GCP impersonate service account values
     * <p>
     * Pass the values to impersonate a service account of Google Cloud
     * 
     */
    @JsonProperty("gcpImpersonateServiceAccount")
    @JsonPropertyDescription("Pass the values to impersonate a service account of Google Cloud")
    @Valid
    private GCPImpersonateServiceAccountValues gcpImpersonateServiceAccount;

    /**
     * GCP Credentials Configuration
     * <p>
     * We support two ways of authenticating to GCP i.e via GCP Credentials Values or GCP Credentials Path
     * (Required)
     * 
     */
    @JsonProperty("gcpConfig")
    public Object getGcpConfig() {
        return gcpConfig;
    }

    /**
     * GCP Credentials Configuration
     * <p>
     * We support two ways of authenticating to GCP i.e via GCP Credentials Values or GCP Credentials Path
     * (Required)
     * 
     */
    @JsonProperty("gcpConfig")
    public void setGcpConfig(Object gcpConfig) {
        this.gcpConfig = gcpConfig;
    }

    public GCPCredentials withGcpConfig(Object gcpConfig) {
        this.gcpConfig = gcpConfig;
        return this;
    }

    /**
     * GCP impersonate service account values
     * <p>
     * Pass the values to impersonate a service account of Google Cloud
     * 
     */
    @JsonProperty("gcpImpersonateServiceAccount")
    public GCPImpersonateServiceAccountValues getGcpImpersonateServiceAccount() {
        return gcpImpersonateServiceAccount;
    }

    /**
     * GCP impersonate service account values
     * <p>
     * Pass the values to impersonate a service account of Google Cloud
     * 
     */
    @JsonProperty("gcpImpersonateServiceAccount")
    public void setGcpImpersonateServiceAccount(GCPImpersonateServiceAccountValues gcpImpersonateServiceAccount) {
        this.gcpImpersonateServiceAccount = gcpImpersonateServiceAccount;
    }

    public GCPCredentials withGcpImpersonateServiceAccount(GCPImpersonateServiceAccountValues gcpImpersonateServiceAccount) {
        this.gcpImpersonateServiceAccount = gcpImpersonateServiceAccount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GCPCredentials.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gcpConfig");
        sb.append('=');
        sb.append(((this.gcpConfig == null)?"<null>":this.gcpConfig));
        sb.append(',');
        sb.append("gcpImpersonateServiceAccount");
        sb.append('=');
        sb.append(((this.gcpImpersonateServiceAccount == null)?"<null>":this.gcpImpersonateServiceAccount));
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
        result = ((result* 31)+((this.gcpImpersonateServiceAccount == null)? 0 :this.gcpImpersonateServiceAccount.hashCode()));
        result = ((result* 31)+((this.gcpConfig == null)? 0 :this.gcpConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GCPCredentials) == false) {
            return false;
        }
        GCPCredentials rhs = ((GCPCredentials) other);
        return (((this.gcpImpersonateServiceAccount == rhs.gcpImpersonateServiceAccount)||((this.gcpImpersonateServiceAccount!= null)&&this.gcpImpersonateServiceAccount.equals(rhs.gcpImpersonateServiceAccount)))&&((this.gcpConfig == rhs.gcpConfig)||((this.gcpConfig!= null)&&this.gcpConfig.equals(rhs.gcpConfig))));
    }

}
