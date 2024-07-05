
package org.openmetadata.schema.services.connections.database.common;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.security.credentials.AWSCredentials;


/**
 * IAM Auth Configuration Source
 * <p>
 * IAM Auth Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "awsConfig"
})
@Generated("jsonschema2pojo")
public class IamAuthConfig {

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * 
     */
    @JsonProperty("awsConfig")
    @JsonPropertyDescription("AWS credentials configs.")
    @Valid
    private AWSCredentials awsConfig;

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * 
     */
    @JsonProperty("awsConfig")
    public AWSCredentials getAwsConfig() {
        return awsConfig;
    }

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * 
     */
    @JsonProperty("awsConfig")
    public void setAwsConfig(AWSCredentials awsConfig) {
        this.awsConfig = awsConfig;
    }

    public IamAuthConfig withAwsConfig(AWSCredentials awsConfig) {
        this.awsConfig = awsConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IamAuthConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("awsConfig");
        sb.append('=');
        sb.append(((this.awsConfig == null)?"<null>":this.awsConfig));
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
        result = ((result* 31)+((this.awsConfig == null)? 0 :this.awsConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IamAuthConfig) == false) {
            return false;
        }
        IamAuthConfig rhs = ((IamAuthConfig) other);
        return ((this.awsConfig == rhs.awsConfig)||((this.awsConfig!= null)&&this.awsConfig.equals(rhs.awsConfig)));
    }

}
