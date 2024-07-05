
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
    "acs",
    "spX509Certificate",
    "spPrivateKey",
    "callback"
})
@Generated("jsonschema2pojo")
public class ServiceProviderConfig {

    /**
     * Service Provider Entity ID.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    @JsonPropertyDescription("Service Provider Entity ID.")
    @NotNull
    private String entityId;
    /**
     * Assertion Consumer URL.
     * (Required)
     * 
     */
    @JsonProperty("acs")
    @JsonPropertyDescription("Assertion Consumer URL.")
    @NotNull
    private String acs;
    /**
     * X509 Certificate 
     * 
     */
    @JsonProperty("spX509Certificate")
    @JsonPropertyDescription("X509 Certificate ")
    private String spX509Certificate;
    /**
     * Sp Private Key for Signing and Encryption Only
     * 
     */
    @JsonProperty("spPrivateKey")
    @JsonPropertyDescription("Sp Private Key for Signing and Encryption Only")
    private String spPrivateKey;
    /**
     * Service Provider Entity ID usually same as the SSO login URL.
     * (Required)
     * 
     */
    @JsonProperty("callback")
    @JsonPropertyDescription("Service Provider Entity ID usually same as the SSO login URL.")
    @NotNull
    private String callback;

    /**
     * Service Provider Entity ID.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Service Provider Entity ID.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public ServiceProviderConfig withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Assertion Consumer URL.
     * (Required)
     * 
     */
    @JsonProperty("acs")
    public String getAcs() {
        return acs;
    }

    /**
     * Assertion Consumer URL.
     * (Required)
     * 
     */
    @JsonProperty("acs")
    public void setAcs(String acs) {
        this.acs = acs;
    }

    public ServiceProviderConfig withAcs(String acs) {
        this.acs = acs;
        return this;
    }

    /**
     * X509 Certificate 
     * 
     */
    @JsonProperty("spX509Certificate")
    public String getSpX509Certificate() {
        return spX509Certificate;
    }

    /**
     * X509 Certificate 
     * 
     */
    @JsonProperty("spX509Certificate")
    public void setSpX509Certificate(String spX509Certificate) {
        this.spX509Certificate = spX509Certificate;
    }

    public ServiceProviderConfig withSpX509Certificate(String spX509Certificate) {
        this.spX509Certificate = spX509Certificate;
        return this;
    }

    /**
     * Sp Private Key for Signing and Encryption Only
     * 
     */
    @JsonProperty("spPrivateKey")
    public String getSpPrivateKey() {
        return spPrivateKey;
    }

    /**
     * Sp Private Key for Signing and Encryption Only
     * 
     */
    @JsonProperty("spPrivateKey")
    public void setSpPrivateKey(String spPrivateKey) {
        this.spPrivateKey = spPrivateKey;
    }

    public ServiceProviderConfig withSpPrivateKey(String spPrivateKey) {
        this.spPrivateKey = spPrivateKey;
        return this;
    }

    /**
     * Service Provider Entity ID usually same as the SSO login URL.
     * (Required)
     * 
     */
    @JsonProperty("callback")
    public String getCallback() {
        return callback;
    }

    /**
     * Service Provider Entity ID usually same as the SSO login URL.
     * (Required)
     * 
     */
    @JsonProperty("callback")
    public void setCallback(String callback) {
        this.callback = callback;
    }

    public ServiceProviderConfig withCallback(String callback) {
        this.callback = callback;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceProviderConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("acs");
        sb.append('=');
        sb.append(((this.acs == null)?"<null>":this.acs));
        sb.append(',');
        sb.append("spX509Certificate");
        sb.append('=');
        sb.append(((this.spX509Certificate == null)?"<null>":this.spX509Certificate));
        sb.append(',');
        sb.append("spPrivateKey");
        sb.append('=');
        sb.append(((this.spPrivateKey == null)?"<null>":this.spPrivateKey));
        sb.append(',');
        sb.append("callback");
        sb.append('=');
        sb.append(((this.callback == null)?"<null>":this.callback));
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
        result = ((result* 31)+((this.acs == null)? 0 :this.acs.hashCode()));
        result = ((result* 31)+((this.callback == null)? 0 :this.callback.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.spX509Certificate == null)? 0 :this.spX509Certificate.hashCode()));
        result = ((result* 31)+((this.spPrivateKey == null)? 0 :this.spPrivateKey.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceProviderConfig) == false) {
            return false;
        }
        ServiceProviderConfig rhs = ((ServiceProviderConfig) other);
        return ((((((this.acs == rhs.acs)||((this.acs!= null)&&this.acs.equals(rhs.acs)))&&((this.callback == rhs.callback)||((this.callback!= null)&&this.callback.equals(rhs.callback))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.spX509Certificate == rhs.spX509Certificate)||((this.spX509Certificate!= null)&&this.spX509Certificate.equals(rhs.spX509Certificate))))&&((this.spPrivateKey == rhs.spPrivateKey)||((this.spPrivateKey!= null)&&this.spPrivateKey.equals(rhs.spPrivateKey))));
    }

}
