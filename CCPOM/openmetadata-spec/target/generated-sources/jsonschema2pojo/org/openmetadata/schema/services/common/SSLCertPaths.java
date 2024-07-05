
package org.openmetadata.schema.services.common;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SSL Certificates By Path
 * <p>
 * SSL Certificates By Path
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "caCertPath",
    "clientCertPath",
    "privateKeyPath"
})
@Generated("jsonschema2pojo")
public class SSLCertPaths {

    /**
     * CA Certificate Path
     * <p>
     * CA Certificate Path
     * 
     */
    @JsonProperty("caCertPath")
    @JsonPropertyDescription("CA Certificate Path")
    private String caCertPath;
    /**
     * Client Certificate Path
     * <p>
     * Client Certificate Path
     * 
     */
    @JsonProperty("clientCertPath")
    @JsonPropertyDescription("Client Certificate Path")
    private String clientCertPath;
    /**
     * Private Key Path
     * <p>
     * Private Key Path
     * 
     */
    @JsonProperty("privateKeyPath")
    @JsonPropertyDescription("Private Key Path")
    private String privateKeyPath;

    /**
     * CA Certificate Path
     * <p>
     * CA Certificate Path
     * 
     */
    @JsonProperty("caCertPath")
    public String getCaCertPath() {
        return caCertPath;
    }

    /**
     * CA Certificate Path
     * <p>
     * CA Certificate Path
     * 
     */
    @JsonProperty("caCertPath")
    public void setCaCertPath(String caCertPath) {
        this.caCertPath = caCertPath;
    }

    public SSLCertPaths withCaCertPath(String caCertPath) {
        this.caCertPath = caCertPath;
        return this;
    }

    /**
     * Client Certificate Path
     * <p>
     * Client Certificate Path
     * 
     */
    @JsonProperty("clientCertPath")
    public String getClientCertPath() {
        return clientCertPath;
    }

    /**
     * Client Certificate Path
     * <p>
     * Client Certificate Path
     * 
     */
    @JsonProperty("clientCertPath")
    public void setClientCertPath(String clientCertPath) {
        this.clientCertPath = clientCertPath;
    }

    public SSLCertPaths withClientCertPath(String clientCertPath) {
        this.clientCertPath = clientCertPath;
        return this;
    }

    /**
     * Private Key Path
     * <p>
     * Private Key Path
     * 
     */
    @JsonProperty("privateKeyPath")
    public String getPrivateKeyPath() {
        return privateKeyPath;
    }

    /**
     * Private Key Path
     * <p>
     * Private Key Path
     * 
     */
    @JsonProperty("privateKeyPath")
    public void setPrivateKeyPath(String privateKeyPath) {
        this.privateKeyPath = privateKeyPath;
    }

    public SSLCertPaths withPrivateKeyPath(String privateKeyPath) {
        this.privateKeyPath = privateKeyPath;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SSLCertPaths.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("caCertPath");
        sb.append('=');
        sb.append(((this.caCertPath == null)?"<null>":this.caCertPath));
        sb.append(',');
        sb.append("clientCertPath");
        sb.append('=');
        sb.append(((this.clientCertPath == null)?"<null>":this.clientCertPath));
        sb.append(',');
        sb.append("privateKeyPath");
        sb.append('=');
        sb.append(((this.privateKeyPath == null)?"<null>":this.privateKeyPath));
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
        result = ((result* 31)+((this.privateKeyPath == null)? 0 :this.privateKeyPath.hashCode()));
        result = ((result* 31)+((this.clientCertPath == null)? 0 :this.clientCertPath.hashCode()));
        result = ((result* 31)+((this.caCertPath == null)? 0 :this.caCertPath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SSLCertPaths) == false) {
            return false;
        }
        SSLCertPaths rhs = ((SSLCertPaths) other);
        return ((((this.privateKeyPath == rhs.privateKeyPath)||((this.privateKeyPath!= null)&&this.privateKeyPath.equals(rhs.privateKeyPath)))&&((this.clientCertPath == rhs.clientCertPath)||((this.clientCertPath!= null)&&this.clientCertPath.equals(rhs.clientCertPath))))&&((this.caCertPath == rhs.caCertPath)||((this.caCertPath!= null)&&this.caCertPath.equals(rhs.caCertPath))));
    }

}
