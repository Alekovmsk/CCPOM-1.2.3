
package org.openmetadata.schema.services.common;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SSL Config
 * <p>
 * SSL Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "certificates"
})
@Generated("jsonschema2pojo")
public class SSLConfig {

    /**
     * SSL Certificates
     * <p>
     * SSL Certificates
     * 
     */
    @JsonProperty("certificates")
    @JsonPropertyDescription("SSL Certificates")
    @Valid
    private Certificates certificates;

    /**
     * SSL Certificates
     * <p>
     * SSL Certificates
     * 
     */
    @JsonProperty("certificates")
    public Certificates getCertificates() {
        return certificates;
    }

    /**
     * SSL Certificates
     * <p>
     * SSL Certificates
     * 
     */
    @JsonProperty("certificates")
    public void setCertificates(Certificates certificates) {
        this.certificates = certificates;
    }

    public SSLConfig withCertificates(Certificates certificates) {
        this.certificates = certificates;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SSLConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("certificates");
        sb.append('=');
        sb.append(((this.certificates == null)?"<null>":this.certificates));
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
        result = ((result* 31)+((this.certificates == null)? 0 :this.certificates.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SSLConfig) == false) {
            return false;
        }
        SSLConfig rhs = ((SSLConfig) other);
        return ((this.certificates == rhs.certificates)||((this.certificates!= null)&&this.certificates.equals(rhs.certificates)));
    }

}
