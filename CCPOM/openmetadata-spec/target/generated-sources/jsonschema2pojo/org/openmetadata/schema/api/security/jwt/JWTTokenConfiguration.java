
package org.openmetadata.schema.api.security.jwt;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JWTTokenConfiguration
 * <p>
 * This schema defines the JWT Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rsapublicKeyFilePath",
    "rsaprivateKeyFilePath",
    "jwtissuer",
    "keyId"
})
@Generated("jsonschema2pojo")
public class JWTTokenConfiguration {

    /**
     * RSA Public Key File Path
     * 
     */
    @JsonProperty("rsapublicKeyFilePath")
    @JsonPropertyDescription("RSA Public Key File Path")
    private String rsapublicKeyFilePath;
    /**
     * RSA Private Key File Path
     * 
     */
    @JsonProperty("rsaprivateKeyFilePath")
    @JsonPropertyDescription("RSA Private Key File Path")
    private String rsaprivateKeyFilePath;
    /**
     * JWT Issuer
     * (Required)
     * 
     */
    @JsonProperty("jwtissuer")
    @JsonPropertyDescription("JWT Issuer")
    @NotNull
    private String jwtissuer;
    /**
     * Key ID
     * (Required)
     * 
     */
    @JsonProperty("keyId")
    @JsonPropertyDescription("Key ID")
    @NotNull
    private String keyId;

    /**
     * RSA Public Key File Path
     * 
     */
    @JsonProperty("rsapublicKeyFilePath")
    public String getRsapublicKeyFilePath() {
        return rsapublicKeyFilePath;
    }

    /**
     * RSA Public Key File Path
     * 
     */
    @JsonProperty("rsapublicKeyFilePath")
    public void setRsapublicKeyFilePath(String rsapublicKeyFilePath) {
        this.rsapublicKeyFilePath = rsapublicKeyFilePath;
    }

    public JWTTokenConfiguration withRsapublicKeyFilePath(String rsapublicKeyFilePath) {
        this.rsapublicKeyFilePath = rsapublicKeyFilePath;
        return this;
    }

    /**
     * RSA Private Key File Path
     * 
     */
    @JsonProperty("rsaprivateKeyFilePath")
    public String getRsaprivateKeyFilePath() {
        return rsaprivateKeyFilePath;
    }

    /**
     * RSA Private Key File Path
     * 
     */
    @JsonProperty("rsaprivateKeyFilePath")
    public void setRsaprivateKeyFilePath(String rsaprivateKeyFilePath) {
        this.rsaprivateKeyFilePath = rsaprivateKeyFilePath;
    }

    public JWTTokenConfiguration withRsaprivateKeyFilePath(String rsaprivateKeyFilePath) {
        this.rsaprivateKeyFilePath = rsaprivateKeyFilePath;
        return this;
    }

    /**
     * JWT Issuer
     * (Required)
     * 
     */
    @JsonProperty("jwtissuer")
    public String getJwtissuer() {
        return jwtissuer;
    }

    /**
     * JWT Issuer
     * (Required)
     * 
     */
    @JsonProperty("jwtissuer")
    public void setJwtissuer(String jwtissuer) {
        this.jwtissuer = jwtissuer;
    }

    public JWTTokenConfiguration withJwtissuer(String jwtissuer) {
        this.jwtissuer = jwtissuer;
        return this;
    }

    /**
     * Key ID
     * (Required)
     * 
     */
    @JsonProperty("keyId")
    public String getKeyId() {
        return keyId;
    }

    /**
     * Key ID
     * (Required)
     * 
     */
    @JsonProperty("keyId")
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public JWTTokenConfiguration withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JWTTokenConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rsapublicKeyFilePath");
        sb.append('=');
        sb.append(((this.rsapublicKeyFilePath == null)?"<null>":this.rsapublicKeyFilePath));
        sb.append(',');
        sb.append("rsaprivateKeyFilePath");
        sb.append('=');
        sb.append(((this.rsaprivateKeyFilePath == null)?"<null>":this.rsaprivateKeyFilePath));
        sb.append(',');
        sb.append("jwtissuer");
        sb.append('=');
        sb.append(((this.jwtissuer == null)?"<null>":this.jwtissuer));
        sb.append(',');
        sb.append("keyId");
        sb.append('=');
        sb.append(((this.keyId == null)?"<null>":this.keyId));
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
        result = ((result* 31)+((this.keyId == null)? 0 :this.keyId.hashCode()));
        result = ((result* 31)+((this.jwtissuer == null)? 0 :this.jwtissuer.hashCode()));
        result = ((result* 31)+((this.rsaprivateKeyFilePath == null)? 0 :this.rsaprivateKeyFilePath.hashCode()));
        result = ((result* 31)+((this.rsapublicKeyFilePath == null)? 0 :this.rsapublicKeyFilePath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JWTTokenConfiguration) == false) {
            return false;
        }
        JWTTokenConfiguration rhs = ((JWTTokenConfiguration) other);
        return (((((this.keyId == rhs.keyId)||((this.keyId!= null)&&this.keyId.equals(rhs.keyId)))&&((this.jwtissuer == rhs.jwtissuer)||((this.jwtissuer!= null)&&this.jwtissuer.equals(rhs.jwtissuer))))&&((this.rsaprivateKeyFilePath == rhs.rsaprivateKeyFilePath)||((this.rsaprivateKeyFilePath!= null)&&this.rsaprivateKeyFilePath.equals(rhs.rsaprivateKeyFilePath))))&&((this.rsapublicKeyFilePath == rhs.rsapublicKeyFilePath)||((this.rsapublicKeyFilePath!= null)&&this.rsapublicKeyFilePath.equals(rhs.rsapublicKeyFilePath))));
    }

}
