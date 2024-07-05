
package org.openmetadata.schema.services.connections.database.datalake;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.security.credentials.GCPCredentials;


/**
 * GCSConfig
 * <p>
 * DataLake GCS storage will ingest metadata of files
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "securityConfig"
})
@Generated("jsonschema2pojo")
public class GCSConfig {

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * 
     */
    @JsonProperty("securityConfig")
    @JsonPropertyDescription("GCP credentials configs.")
    @Valid
    private GCPCredentials securityConfig;

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * 
     */
    @JsonProperty("securityConfig")
    public GCPCredentials getSecurityConfig() {
        return securityConfig;
    }

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * 
     */
    @JsonProperty("securityConfig")
    public void setSecurityConfig(GCPCredentials securityConfig) {
        this.securityConfig = securityConfig;
    }

    public GCSConfig withSecurityConfig(GCPCredentials securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GCSConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof GCSConfig) == false) {
            return false;
        }
        GCSConfig rhs = ((GCSConfig) other);
        return ((this.securityConfig == rhs.securityConfig)||((this.securityConfig!= null)&&this.securityConfig.equals(rhs.securityConfig)));
    }

}
