
package org.openmetadata.schema.security.credentials;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GCP impersonate service account values
 * <p>
 * Pass the values to impersonate a service account of Google Cloud
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "impersonateServiceAccount",
    "lifetime"
})
@Generated("jsonschema2pojo")
public class GCPImpersonateServiceAccountValues {

    /**
     * Target Service Account Email
     * <p>
     * The impersonated service account email
     * 
     */
    @JsonProperty("impersonateServiceAccount")
    @JsonPropertyDescription("The impersonated service account email")
    private String impersonateServiceAccount;
    /**
     * Lifetime
     * <p>
     * Number of seconds the delegated credential should be valid
     * 
     */
    @JsonProperty("lifetime")
    @JsonPropertyDescription("Number of seconds the delegated credential should be valid")
    private Integer lifetime = 3600;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Target Service Account Email
     * <p>
     * The impersonated service account email
     * 
     */
    @JsonProperty("impersonateServiceAccount")
    public String getImpersonateServiceAccount() {
        return impersonateServiceAccount;
    }

    /**
     * Target Service Account Email
     * <p>
     * The impersonated service account email
     * 
     */
    @JsonProperty("impersonateServiceAccount")
    public void setImpersonateServiceAccount(String impersonateServiceAccount) {
        this.impersonateServiceAccount = impersonateServiceAccount;
    }

    public GCPImpersonateServiceAccountValues withImpersonateServiceAccount(String impersonateServiceAccount) {
        this.impersonateServiceAccount = impersonateServiceAccount;
        return this;
    }

    /**
     * Lifetime
     * <p>
     * Number of seconds the delegated credential should be valid
     * 
     */
    @JsonProperty("lifetime")
    public Integer getLifetime() {
        return lifetime;
    }

    /**
     * Lifetime
     * <p>
     * Number of seconds the delegated credential should be valid
     * 
     */
    @JsonProperty("lifetime")
    public void setLifetime(Integer lifetime) {
        this.lifetime = lifetime;
    }

    public GCPImpersonateServiceAccountValues withLifetime(Integer lifetime) {
        this.lifetime = lifetime;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public GCPImpersonateServiceAccountValues withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GCPImpersonateServiceAccountValues.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("impersonateServiceAccount");
        sb.append('=');
        sb.append(((this.impersonateServiceAccount == null)?"<null>":this.impersonateServiceAccount));
        sb.append(',');
        sb.append("lifetime");
        sb.append('=');
        sb.append(((this.lifetime == null)?"<null>":this.lifetime));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.lifetime == null)? 0 :this.lifetime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.impersonateServiceAccount == null)? 0 :this.impersonateServiceAccount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GCPImpersonateServiceAccountValues) == false) {
            return false;
        }
        GCPImpersonateServiceAccountValues rhs = ((GCPImpersonateServiceAccountValues) other);
        return ((((this.lifetime == rhs.lifetime)||((this.lifetime!= null)&&this.lifetime.equals(rhs.lifetime)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.impersonateServiceAccount == rhs.impersonateServiceAccount)||((this.impersonateServiceAccount!= null)&&this.impersonateServiceAccount.equals(rhs.impersonateServiceAccount))));
    }

}
