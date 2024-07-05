
package org.openmetadata.schema.services.connections.database.datalake;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.security.credentials.AzureCredentials;


/**
 * AzureConfig
 * <p>
 * Azure Datalake Storage will ingest files in container
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "securityConfig"
})
@Generated("jsonschema2pojo")
public class AzureConfig {

    /**
     * AzureCredentials
     * <p>
     * Azure Datalake Credentials
     * 
     */
    @JsonProperty("securityConfig")
    @JsonPropertyDescription("Azure Datalake Credentials")
    @Valid
    private AzureCredentials securityConfig;

    /**
     * AzureCredentials
     * <p>
     * Azure Datalake Credentials
     * 
     */
    @JsonProperty("securityConfig")
    public AzureCredentials getSecurityConfig() {
        return securityConfig;
    }

    /**
     * AzureCredentials
     * <p>
     * Azure Datalake Credentials
     * 
     */
    @JsonProperty("securityConfig")
    public void setSecurityConfig(AzureCredentials securityConfig) {
        this.securityConfig = securityConfig;
    }

    public AzureConfig withSecurityConfig(AzureCredentials securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AzureConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("securityConfig");
        sb.append('=');
        sb.append(((this.securityConfig == null)?"<null>":this.securityConfig));
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
        result = ((result* 31)+((this.securityConfig == null)? 0 :this.securityConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AzureConfig) == false) {
            return false;
        }
        AzureConfig rhs = ((AzureConfig) other);
        return ((this.securityConfig == rhs.securityConfig)||((this.securityConfig!= null)&&this.securityConfig.equals(rhs.securityConfig)));
    }

}
