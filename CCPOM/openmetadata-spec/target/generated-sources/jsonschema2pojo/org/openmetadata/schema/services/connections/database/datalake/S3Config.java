
package org.openmetadata.schema.services.connections.database.datalake;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.security.credentials.AWSCredentials;


/**
 * S3Config
 * <p>
 * DataLake S3 bucket will ingest metadata of files in bucket
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "securityConfig"
})
@Generated("jsonschema2pojo")
public class S3Config {

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * 
     */
    @JsonProperty("securityConfig")
    @JsonPropertyDescription("AWS credentials configs.")
    @Valid
    private AWSCredentials securityConfig;

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * 
     */
    @JsonProperty("securityConfig")
    public AWSCredentials getSecurityConfig() {
        return securityConfig;
    }

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * 
     */
    @JsonProperty("securityConfig")
    public void setSecurityConfig(AWSCredentials securityConfig) {
        this.securityConfig = securityConfig;
    }

    public S3Config withSecurityConfig(AWSCredentials securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(S3Config.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof S3Config) == false) {
            return false;
        }
        S3Config rhs = ((S3Config) other);
        return ((this.securityConfig == rhs.securityConfig)||((this.securityConfig!= null)&&this.securityConfig.equals(rhs.securityConfig)));
    }

}
