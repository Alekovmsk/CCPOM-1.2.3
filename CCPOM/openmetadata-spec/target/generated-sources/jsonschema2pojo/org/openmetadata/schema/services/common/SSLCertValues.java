
package org.openmetadata.schema.services.common;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * SSL Certificates By Values
 * <p>
 * SSL Certificates By Values
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "caCertValue",
    "clientCertValue",
    "privateKeyValue",
    "stagingDir"
})
@Generated("jsonschema2pojo")
public class SSLCertValues {

    /**
     * CA Certificate Value
     * <p>
     * CA Certificate Value
     * 
     */
    @JsonProperty("caCertValue")
    @JsonPropertyDescription("CA Certificate Value")
    @PasswordField
    private String caCertValue;
    /**
     * Client Certificate Value
     * <p>
     * Client Certificate Value
     * 
     */
    @JsonProperty("clientCertValue")
    @JsonPropertyDescription("Client Certificate Value")
    @PasswordField
    private String clientCertValue;
    /**
     * Private Key Value
     * <p>
     * Private Key Value
     * 
     */
    @JsonProperty("privateKeyValue")
    @JsonPropertyDescription("Private Key Value")
    @PasswordField
    private String privateKeyValue;
    /**
     * Staging Directory Path
     * <p>
     * Staging Directory Path
     * 
     */
    @JsonProperty("stagingDir")
    @JsonPropertyDescription("Staging Directory Path")
    private String stagingDir = "/tmp/openmetadata-certs";

    /**
     * CA Certificate Value
     * <p>
     * CA Certificate Value
     * 
     */
    @JsonProperty("caCertValue")
    @PasswordField
    public String getCaCertValue() {
        return caCertValue;
    }

    /**
     * CA Certificate Value
     * <p>
     * CA Certificate Value
     * 
     */
    @JsonProperty("caCertValue")
    @PasswordField
    public void setCaCertValue(String caCertValue) {
        this.caCertValue = caCertValue;
    }

    public SSLCertValues withCaCertValue(String caCertValue) {
        this.caCertValue = caCertValue;
        return this;
    }

    /**
     * Client Certificate Value
     * <p>
     * Client Certificate Value
     * 
     */
    @JsonProperty("clientCertValue")
    @PasswordField
    public String getClientCertValue() {
        return clientCertValue;
    }

    /**
     * Client Certificate Value
     * <p>
     * Client Certificate Value
     * 
     */
    @JsonProperty("clientCertValue")
    @PasswordField
    public void setClientCertValue(String clientCertValue) {
        this.clientCertValue = clientCertValue;
    }

    public SSLCertValues withClientCertValue(String clientCertValue) {
        this.clientCertValue = clientCertValue;
        return this;
    }

    /**
     * Private Key Value
     * <p>
     * Private Key Value
     * 
     */
    @JsonProperty("privateKeyValue")
    @PasswordField
    public String getPrivateKeyValue() {
        return privateKeyValue;
    }

    /**
     * Private Key Value
     * <p>
     * Private Key Value
     * 
     */
    @JsonProperty("privateKeyValue")
    @PasswordField
    public void setPrivateKeyValue(String privateKeyValue) {
        this.privateKeyValue = privateKeyValue;
    }

    public SSLCertValues withPrivateKeyValue(String privateKeyValue) {
        this.privateKeyValue = privateKeyValue;
        return this;
    }

    /**
     * Staging Directory Path
     * <p>
     * Staging Directory Path
     * 
     */
    @JsonProperty("stagingDir")
    public String getStagingDir() {
        return stagingDir;
    }

    /**
     * Staging Directory Path
     * <p>
     * Staging Directory Path
     * 
     */
    @JsonProperty("stagingDir")
    public void setStagingDir(String stagingDir) {
        this.stagingDir = stagingDir;
    }

    public SSLCertValues withStagingDir(String stagingDir) {
        this.stagingDir = stagingDir;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SSLCertValues.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("caCertValue");
        sb.append('=');
        sb.append(((this.caCertValue == null)?"<null>":this.caCertValue));
        sb.append(',');
        sb.append("clientCertValue");
        sb.append('=');
        sb.append(((this.clientCertValue == null)?"<null>":this.clientCertValue));
        sb.append(',');
        sb.append("privateKeyValue");
        sb.append('=');
        sb.append(((this.privateKeyValue == null)?"<null>":this.privateKeyValue));
        sb.append(',');
        sb.append("stagingDir");
        sb.append('=');
        sb.append(((this.stagingDir == null)?"<null>":this.stagingDir));
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
        result = ((result* 31)+((this.caCertValue == null)? 0 :this.caCertValue.hashCode()));
        result = ((result* 31)+((this.stagingDir == null)? 0 :this.stagingDir.hashCode()));
        result = ((result* 31)+((this.clientCertValue == null)? 0 :this.clientCertValue.hashCode()));
        result = ((result* 31)+((this.privateKeyValue == null)? 0 :this.privateKeyValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SSLCertValues) == false) {
            return false;
        }
        SSLCertValues rhs = ((SSLCertValues) other);
        return (((((this.caCertValue == rhs.caCertValue)||((this.caCertValue!= null)&&this.caCertValue.equals(rhs.caCertValue)))&&((this.stagingDir == rhs.stagingDir)||((this.stagingDir!= null)&&this.stagingDir.equals(rhs.stagingDir))))&&((this.clientCertValue == rhs.clientCertValue)||((this.clientCertValue!= null)&&this.clientCertValue.equals(rhs.clientCertValue))))&&((this.privateKeyValue == rhs.privateKeyValue)||((this.privateKeyValue!= null)&&this.privateKeyValue.equals(rhs.privateKeyValue))));
    }

}
