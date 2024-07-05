
package org.openmetadata.schema.security.ssl;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Validate SSL Client Config
 * <p>
 * OpenMetadata Client configured to validate SSL certificates.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "certificatePath"
})
@Generated("jsonschema2pojo")
public class ValidateSSLClientConfig {

    /**
     * Certificate Path
     * <p>
     * CA certificate path. E.g., /path/to/public.cert. Will be used if Verify SSL is set to `validate`.
     * 
     */
    @JsonProperty("certificatePath")
    @JsonPropertyDescription("CA certificate path. E.g., /path/to/public.cert. Will be used if Verify SSL is set to `validate`.")
    private String certificatePath;

    /**
     * Certificate Path
     * <p>
     * CA certificate path. E.g., /path/to/public.cert. Will be used if Verify SSL is set to `validate`.
     * 
     */
    @JsonProperty("certificatePath")
    public String getCertificatePath() {
        return certificatePath;
    }

    /**
     * Certificate Path
     * <p>
     * CA certificate path. E.g., /path/to/public.cert. Will be used if Verify SSL is set to `validate`.
     * 
     */
    @JsonProperty("certificatePath")
    public void setCertificatePath(String certificatePath) {
        this.certificatePath = certificatePath;
    }

    public ValidateSSLClientConfig withCertificatePath(String certificatePath) {
        this.certificatePath = certificatePath;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValidateSSLClientConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("certificatePath");
        sb.append('=');
        sb.append(((this.certificatePath == null)?"<null>":this.certificatePath));
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
        result = ((result* 31)+((this.certificatePath == null)? 0 :this.certificatePath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValidateSSLClientConfig) == false) {
            return false;
        }
        ValidateSSLClientConfig rhs = ((ValidateSSLClientConfig) other);
        return ((this.certificatePath == rhs.certificatePath)||((this.certificatePath!= null)&&this.certificatePath.equals(rhs.certificatePath)));
    }

}
