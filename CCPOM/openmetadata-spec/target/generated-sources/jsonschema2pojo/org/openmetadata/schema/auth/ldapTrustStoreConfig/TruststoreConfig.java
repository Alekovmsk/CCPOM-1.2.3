
package org.openmetadata.schema.auth.ldapTrustStoreConfig;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TruststoreConfig
 * <p>
 * Truststore Configuration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customTrustManagerConfig",
    "hostNameConfig",
    "jvmDefaultConfig",
    "trustAllConfig"
})
@Generated("jsonschema2pojo")
public class TruststoreConfig {

    /**
     * CustomTrustManagerConfig
     * <p>
     * CustomTrust Configuration
     * 
     */
    @JsonProperty("customTrustManagerConfig")
    @JsonPropertyDescription("CustomTrust Configuration")
    @Valid
    private CustomTrustManagerConfig customTrustManagerConfig;
    /**
     * HostNameConfig
     * <p>
     * HostName Configuration
     * 
     */
    @JsonProperty("hostNameConfig")
    @JsonPropertyDescription("HostName Configuration")
    @Valid
    private HostNameConfig hostNameConfig;
    /**
     * JVMDefaultConfig
     * <p>
     * JVMDefault Configuration
     * 
     */
    @JsonProperty("jvmDefaultConfig")
    @JsonPropertyDescription("JVMDefault Configuration")
    @Valid
    private JVMDefaultConfig jvmDefaultConfig;
    /**
     * TrustAllConfig
     * <p>
     * TrustAll Configuration
     * 
     */
    @JsonProperty("trustAllConfig")
    @JsonPropertyDescription("TrustAll Configuration")
    @Valid
    private TrustAllConfig trustAllConfig;

    /**
     * CustomTrustManagerConfig
     * <p>
     * CustomTrust Configuration
     * 
     */
    @JsonProperty("customTrustManagerConfig")
    public CustomTrustManagerConfig getCustomTrustManagerConfig() {
        return customTrustManagerConfig;
    }

    /**
     * CustomTrustManagerConfig
     * <p>
     * CustomTrust Configuration
     * 
     */
    @JsonProperty("customTrustManagerConfig")
    public void setCustomTrustManagerConfig(CustomTrustManagerConfig customTrustManagerConfig) {
        this.customTrustManagerConfig = customTrustManagerConfig;
    }

    public TruststoreConfig withCustomTrustManagerConfig(CustomTrustManagerConfig customTrustManagerConfig) {
        this.customTrustManagerConfig = customTrustManagerConfig;
        return this;
    }

    /**
     * HostNameConfig
     * <p>
     * HostName Configuration
     * 
     */
    @JsonProperty("hostNameConfig")
    public HostNameConfig getHostNameConfig() {
        return hostNameConfig;
    }

    /**
     * HostNameConfig
     * <p>
     * HostName Configuration
     * 
     */
    @JsonProperty("hostNameConfig")
    public void setHostNameConfig(HostNameConfig hostNameConfig) {
        this.hostNameConfig = hostNameConfig;
    }

    public TruststoreConfig withHostNameConfig(HostNameConfig hostNameConfig) {
        this.hostNameConfig = hostNameConfig;
        return this;
    }

    /**
     * JVMDefaultConfig
     * <p>
     * JVMDefault Configuration
     * 
     */
    @JsonProperty("jvmDefaultConfig")
    public JVMDefaultConfig getJvmDefaultConfig() {
        return jvmDefaultConfig;
    }

    /**
     * JVMDefaultConfig
     * <p>
     * JVMDefault Configuration
     * 
     */
    @JsonProperty("jvmDefaultConfig")
    public void setJvmDefaultConfig(JVMDefaultConfig jvmDefaultConfig) {
        this.jvmDefaultConfig = jvmDefaultConfig;
    }

    public TruststoreConfig withJvmDefaultConfig(JVMDefaultConfig jvmDefaultConfig) {
        this.jvmDefaultConfig = jvmDefaultConfig;
        return this;
    }

    /**
     * TrustAllConfig
     * <p>
     * TrustAll Configuration
     * 
     */
    @JsonProperty("trustAllConfig")
    public TrustAllConfig getTrustAllConfig() {
        return trustAllConfig;
    }

    /**
     * TrustAllConfig
     * <p>
     * TrustAll Configuration
     * 
     */
    @JsonProperty("trustAllConfig")
    public void setTrustAllConfig(TrustAllConfig trustAllConfig) {
        this.trustAllConfig = trustAllConfig;
    }

    public TruststoreConfig withTrustAllConfig(TrustAllConfig trustAllConfig) {
        this.trustAllConfig = trustAllConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TruststoreConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customTrustManagerConfig");
        sb.append('=');
        sb.append(((this.customTrustManagerConfig == null)?"<null>":this.customTrustManagerConfig));
        sb.append(',');
        sb.append("hostNameConfig");
        sb.append('=');
        sb.append(((this.hostNameConfig == null)?"<null>":this.hostNameConfig));
        sb.append(',');
        sb.append("jvmDefaultConfig");
        sb.append('=');
        sb.append(((this.jvmDefaultConfig == null)?"<null>":this.jvmDefaultConfig));
        sb.append(',');
        sb.append("trustAllConfig");
        sb.append('=');
        sb.append(((this.trustAllConfig == null)?"<null>":this.trustAllConfig));
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
        result = ((result* 31)+((this.jvmDefaultConfig == null)? 0 :this.jvmDefaultConfig.hashCode()));
        result = ((result* 31)+((this.trustAllConfig == null)? 0 :this.trustAllConfig.hashCode()));
        result = ((result* 31)+((this.hostNameConfig == null)? 0 :this.hostNameConfig.hashCode()));
        result = ((result* 31)+((this.customTrustManagerConfig == null)? 0 :this.customTrustManagerConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TruststoreConfig) == false) {
            return false;
        }
        TruststoreConfig rhs = ((TruststoreConfig) other);
        return (((((this.jvmDefaultConfig == rhs.jvmDefaultConfig)||((this.jvmDefaultConfig!= null)&&this.jvmDefaultConfig.equals(rhs.jvmDefaultConfig)))&&((this.trustAllConfig == rhs.trustAllConfig)||((this.trustAllConfig!= null)&&this.trustAllConfig.equals(rhs.trustAllConfig))))&&((this.hostNameConfig == rhs.hostNameConfig)||((this.hostNameConfig!= null)&&this.hostNameConfig.equals(rhs.hostNameConfig))))&&((this.customTrustManagerConfig == rhs.customTrustManagerConfig)||((this.customTrustManagerConfig!= null)&&this.customTrustManagerConfig.equals(rhs.customTrustManagerConfig))));
    }

}
