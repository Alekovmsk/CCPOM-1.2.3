
package org.openmetadata.catalog.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines defines the security config for SAML.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strictMode",
    "tokenValidity",
    "sendEncryptedNameId",
    "sendSignedAuthRequest",
    "signSpMetadata",
    "wantMessagesSigned",
    "wantAssertionsSigned",
    "wantAssertionEncrypted",
    "wantNameIdEncrypted",
    "keyStoreFilePath",
    "keyStoreAlias",
    "keyStorePassword"
})
@Generated("jsonschema2pojo")
public class SamlSecurityConfig {

    /**
     * Only accept valid signed and encrypted assertions if the relevant flags are set
     * 
     */
    @JsonProperty("strictMode")
    @JsonPropertyDescription("Only accept valid signed and encrypted assertions if the relevant flags are set")
    private Boolean strictMode = false;
    /**
     * Validity for the JWT Token created from SAML Response
     * 
     */
    @JsonProperty("tokenValidity")
    @JsonPropertyDescription("Validity for the JWT Token created from SAML Response")
    private Integer tokenValidity = 3600;
    /**
     * Encrypt Name Id while sending requests from SP.
     * 
     */
    @JsonProperty("sendEncryptedNameId")
    @JsonPropertyDescription("Encrypt Name Id while sending requests from SP.")
    private Boolean sendEncryptedNameId = false;
    /**
     * Sign the Authn Request while sending.
     * 
     */
    @JsonProperty("sendSignedAuthRequest")
    @JsonPropertyDescription("Sign the Authn Request while sending.")
    private Boolean sendSignedAuthRequest = false;
    /**
     * Want the Metadata of this SP to be signed.
     * 
     */
    @JsonProperty("signSpMetadata")
    @JsonPropertyDescription("Want the Metadata of this SP to be signed.")
    private Boolean signSpMetadata = false;
    /**
     * SP requires the messages received to be signed.
     * 
     */
    @JsonProperty("wantMessagesSigned")
    @JsonPropertyDescription("SP requires the messages received to be signed.")
    private Boolean wantMessagesSigned = false;
    /**
     * SP requires the assertions received to be signed.
     * 
     */
    @JsonProperty("wantAssertionsSigned")
    @JsonPropertyDescription("SP requires the assertions received to be signed.")
    private Boolean wantAssertionsSigned = false;
    /**
     * SP requires the assertion received to be encrypted.
     * 
     */
    @JsonProperty("wantAssertionEncrypted")
    @JsonPropertyDescription("SP requires the assertion received to be encrypted.")
    private Boolean wantAssertionEncrypted = false;
    /**
     * SP requires the Name Id received to be encrypted.
     * 
     */
    @JsonProperty("wantNameIdEncrypted")
    @JsonPropertyDescription("SP requires the Name Id received to be encrypted.")
    private Boolean wantNameIdEncrypted = false;
    /**
     * KeyStore File Path
     * 
     */
    @JsonProperty("keyStoreFilePath")
    @JsonPropertyDescription("KeyStore File Path")
    private String keyStoreFilePath;
    /**
     * KeyStore Alias
     * 
     */
    @JsonProperty("keyStoreAlias")
    @JsonPropertyDescription("KeyStore Alias")
    private String keyStoreAlias;
    /**
     * KeyStore Password
     * 
     */
    @JsonProperty("keyStorePassword")
    @JsonPropertyDescription("KeyStore Password")
    private String keyStorePassword;

    /**
     * Only accept valid signed and encrypted assertions if the relevant flags are set
     * 
     */
    @JsonProperty("strictMode")
    public Boolean getStrictMode() {
        return strictMode;
    }

    /**
     * Only accept valid signed and encrypted assertions if the relevant flags are set
     * 
     */
    @JsonProperty("strictMode")
    public void setStrictMode(Boolean strictMode) {
        this.strictMode = strictMode;
    }

    public SamlSecurityConfig withStrictMode(Boolean strictMode) {
        this.strictMode = strictMode;
        return this;
    }

    /**
     * Validity for the JWT Token created from SAML Response
     * 
     */
    @JsonProperty("tokenValidity")
    public Integer getTokenValidity() {
        return tokenValidity;
    }

    /**
     * Validity for the JWT Token created from SAML Response
     * 
     */
    @JsonProperty("tokenValidity")
    public void setTokenValidity(Integer tokenValidity) {
        this.tokenValidity = tokenValidity;
    }

    public SamlSecurityConfig withTokenValidity(Integer tokenValidity) {
        this.tokenValidity = tokenValidity;
        return this;
    }

    /**
     * Encrypt Name Id while sending requests from SP.
     * 
     */
    @JsonProperty("sendEncryptedNameId")
    public Boolean getSendEncryptedNameId() {
        return sendEncryptedNameId;
    }

    /**
     * Encrypt Name Id while sending requests from SP.
     * 
     */
    @JsonProperty("sendEncryptedNameId")
    public void setSendEncryptedNameId(Boolean sendEncryptedNameId) {
        this.sendEncryptedNameId = sendEncryptedNameId;
    }

    public SamlSecurityConfig withSendEncryptedNameId(Boolean sendEncryptedNameId) {
        this.sendEncryptedNameId = sendEncryptedNameId;
        return this;
    }

    /**
     * Sign the Authn Request while sending.
     * 
     */
    @JsonProperty("sendSignedAuthRequest")
    public Boolean getSendSignedAuthRequest() {
        return sendSignedAuthRequest;
    }

    /**
     * Sign the Authn Request while sending.
     * 
     */
    @JsonProperty("sendSignedAuthRequest")
    public void setSendSignedAuthRequest(Boolean sendSignedAuthRequest) {
        this.sendSignedAuthRequest = sendSignedAuthRequest;
    }

    public SamlSecurityConfig withSendSignedAuthRequest(Boolean sendSignedAuthRequest) {
        this.sendSignedAuthRequest = sendSignedAuthRequest;
        return this;
    }

    /**
     * Want the Metadata of this SP to be signed.
     * 
     */
    @JsonProperty("signSpMetadata")
    public Boolean getSignSpMetadata() {
        return signSpMetadata;
    }

    /**
     * Want the Metadata of this SP to be signed.
     * 
     */
    @JsonProperty("signSpMetadata")
    public void setSignSpMetadata(Boolean signSpMetadata) {
        this.signSpMetadata = signSpMetadata;
    }

    public SamlSecurityConfig withSignSpMetadata(Boolean signSpMetadata) {
        this.signSpMetadata = signSpMetadata;
        return this;
    }

    /**
     * SP requires the messages received to be signed.
     * 
     */
    @JsonProperty("wantMessagesSigned")
    public Boolean getWantMessagesSigned() {
        return wantMessagesSigned;
    }

    /**
     * SP requires the messages received to be signed.
     * 
     */
    @JsonProperty("wantMessagesSigned")
    public void setWantMessagesSigned(Boolean wantMessagesSigned) {
        this.wantMessagesSigned = wantMessagesSigned;
    }

    public SamlSecurityConfig withWantMessagesSigned(Boolean wantMessagesSigned) {
        this.wantMessagesSigned = wantMessagesSigned;
        return this;
    }

    /**
     * SP requires the assertions received to be signed.
     * 
     */
    @JsonProperty("wantAssertionsSigned")
    public Boolean getWantAssertionsSigned() {
        return wantAssertionsSigned;
    }

    /**
     * SP requires the assertions received to be signed.
     * 
     */
    @JsonProperty("wantAssertionsSigned")
    public void setWantAssertionsSigned(Boolean wantAssertionsSigned) {
        this.wantAssertionsSigned = wantAssertionsSigned;
    }

    public SamlSecurityConfig withWantAssertionsSigned(Boolean wantAssertionsSigned) {
        this.wantAssertionsSigned = wantAssertionsSigned;
        return this;
    }

    /**
     * SP requires the assertion received to be encrypted.
     * 
     */
    @JsonProperty("wantAssertionEncrypted")
    public Boolean getWantAssertionEncrypted() {
        return wantAssertionEncrypted;
    }

    /**
     * SP requires the assertion received to be encrypted.
     * 
     */
    @JsonProperty("wantAssertionEncrypted")
    public void setWantAssertionEncrypted(Boolean wantAssertionEncrypted) {
        this.wantAssertionEncrypted = wantAssertionEncrypted;
    }

    public SamlSecurityConfig withWantAssertionEncrypted(Boolean wantAssertionEncrypted) {
        this.wantAssertionEncrypted = wantAssertionEncrypted;
        return this;
    }

    /**
     * SP requires the Name Id received to be encrypted.
     * 
     */
    @JsonProperty("wantNameIdEncrypted")
    public Boolean getWantNameIdEncrypted() {
        return wantNameIdEncrypted;
    }

    /**
     * SP requires the Name Id received to be encrypted.
     * 
     */
    @JsonProperty("wantNameIdEncrypted")
    public void setWantNameIdEncrypted(Boolean wantNameIdEncrypted) {
        this.wantNameIdEncrypted = wantNameIdEncrypted;
    }

    public SamlSecurityConfig withWantNameIdEncrypted(Boolean wantNameIdEncrypted) {
        this.wantNameIdEncrypted = wantNameIdEncrypted;
        return this;
    }

    /**
     * KeyStore File Path
     * 
     */
    @JsonProperty("keyStoreFilePath")
    public String getKeyStoreFilePath() {
        return keyStoreFilePath;
    }

    /**
     * KeyStore File Path
     * 
     */
    @JsonProperty("keyStoreFilePath")
    public void setKeyStoreFilePath(String keyStoreFilePath) {
        this.keyStoreFilePath = keyStoreFilePath;
    }

    public SamlSecurityConfig withKeyStoreFilePath(String keyStoreFilePath) {
        this.keyStoreFilePath = keyStoreFilePath;
        return this;
    }

    /**
     * KeyStore Alias
     * 
     */
    @JsonProperty("keyStoreAlias")
    public String getKeyStoreAlias() {
        return keyStoreAlias;
    }

    /**
     * KeyStore Alias
     * 
     */
    @JsonProperty("keyStoreAlias")
    public void setKeyStoreAlias(String keyStoreAlias) {
        this.keyStoreAlias = keyStoreAlias;
    }

    public SamlSecurityConfig withKeyStoreAlias(String keyStoreAlias) {
        this.keyStoreAlias = keyStoreAlias;
        return this;
    }

    /**
     * KeyStore Password
     * 
     */
    @JsonProperty("keyStorePassword")
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * KeyStore Password
     * 
     */
    @JsonProperty("keyStorePassword")
    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    public SamlSecurityConfig withKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SamlSecurityConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("strictMode");
        sb.append('=');
        sb.append(((this.strictMode == null)?"<null>":this.strictMode));
        sb.append(',');
        sb.append("tokenValidity");
        sb.append('=');
        sb.append(((this.tokenValidity == null)?"<null>":this.tokenValidity));
        sb.append(',');
        sb.append("sendEncryptedNameId");
        sb.append('=');
        sb.append(((this.sendEncryptedNameId == null)?"<null>":this.sendEncryptedNameId));
        sb.append(',');
        sb.append("sendSignedAuthRequest");
        sb.append('=');
        sb.append(((this.sendSignedAuthRequest == null)?"<null>":this.sendSignedAuthRequest));
        sb.append(',');
        sb.append("signSpMetadata");
        sb.append('=');
        sb.append(((this.signSpMetadata == null)?"<null>":this.signSpMetadata));
        sb.append(',');
        sb.append("wantMessagesSigned");
        sb.append('=');
        sb.append(((this.wantMessagesSigned == null)?"<null>":this.wantMessagesSigned));
        sb.append(',');
        sb.append("wantAssertionsSigned");
        sb.append('=');
        sb.append(((this.wantAssertionsSigned == null)?"<null>":this.wantAssertionsSigned));
        sb.append(',');
        sb.append("wantAssertionEncrypted");
        sb.append('=');
        sb.append(((this.wantAssertionEncrypted == null)?"<null>":this.wantAssertionEncrypted));
        sb.append(',');
        sb.append("wantNameIdEncrypted");
        sb.append('=');
        sb.append(((this.wantNameIdEncrypted == null)?"<null>":this.wantNameIdEncrypted));
        sb.append(',');
        sb.append("keyStoreFilePath");
        sb.append('=');
        sb.append(((this.keyStoreFilePath == null)?"<null>":this.keyStoreFilePath));
        sb.append(',');
        sb.append("keyStoreAlias");
        sb.append('=');
        sb.append(((this.keyStoreAlias == null)?"<null>":this.keyStoreAlias));
        sb.append(',');
        sb.append("keyStorePassword");
        sb.append('=');
        sb.append(((this.keyStorePassword == null)?"<null>":this.keyStorePassword));
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
        result = ((result* 31)+((this.keyStoreAlias == null)? 0 :this.keyStoreAlias.hashCode()));
        result = ((result* 31)+((this.keyStorePassword == null)? 0 :this.keyStorePassword.hashCode()));
        result = ((result* 31)+((this.strictMode == null)? 0 :this.strictMode.hashCode()));
        result = ((result* 31)+((this.wantMessagesSigned == null)? 0 :this.wantMessagesSigned.hashCode()));
        result = ((result* 31)+((this.tokenValidity == null)? 0 :this.tokenValidity.hashCode()));
        result = ((result* 31)+((this.signSpMetadata == null)? 0 :this.signSpMetadata.hashCode()));
        result = ((result* 31)+((this.sendEncryptedNameId == null)? 0 :this.sendEncryptedNameId.hashCode()));
        result = ((result* 31)+((this.wantAssertionsSigned == null)? 0 :this.wantAssertionsSigned.hashCode()));
        result = ((result* 31)+((this.wantNameIdEncrypted == null)? 0 :this.wantNameIdEncrypted.hashCode()));
        result = ((result* 31)+((this.wantAssertionEncrypted == null)? 0 :this.wantAssertionEncrypted.hashCode()));
        result = ((result* 31)+((this.keyStoreFilePath == null)? 0 :this.keyStoreFilePath.hashCode()));
        result = ((result* 31)+((this.sendSignedAuthRequest == null)? 0 :this.sendSignedAuthRequest.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SamlSecurityConfig) == false) {
            return false;
        }
        SamlSecurityConfig rhs = ((SamlSecurityConfig) other);
        return (((((((((((((this.keyStoreAlias == rhs.keyStoreAlias)||((this.keyStoreAlias!= null)&&this.keyStoreAlias.equals(rhs.keyStoreAlias)))&&((this.keyStorePassword == rhs.keyStorePassword)||((this.keyStorePassword!= null)&&this.keyStorePassword.equals(rhs.keyStorePassword))))&&((this.strictMode == rhs.strictMode)||((this.strictMode!= null)&&this.strictMode.equals(rhs.strictMode))))&&((this.wantMessagesSigned == rhs.wantMessagesSigned)||((this.wantMessagesSigned!= null)&&this.wantMessagesSigned.equals(rhs.wantMessagesSigned))))&&((this.tokenValidity == rhs.tokenValidity)||((this.tokenValidity!= null)&&this.tokenValidity.equals(rhs.tokenValidity))))&&((this.signSpMetadata == rhs.signSpMetadata)||((this.signSpMetadata!= null)&&this.signSpMetadata.equals(rhs.signSpMetadata))))&&((this.sendEncryptedNameId == rhs.sendEncryptedNameId)||((this.sendEncryptedNameId!= null)&&this.sendEncryptedNameId.equals(rhs.sendEncryptedNameId))))&&((this.wantAssertionsSigned == rhs.wantAssertionsSigned)||((this.wantAssertionsSigned!= null)&&this.wantAssertionsSigned.equals(rhs.wantAssertionsSigned))))&&((this.wantNameIdEncrypted == rhs.wantNameIdEncrypted)||((this.wantNameIdEncrypted!= null)&&this.wantNameIdEncrypted.equals(rhs.wantNameIdEncrypted))))&&((this.wantAssertionEncrypted == rhs.wantAssertionEncrypted)||((this.wantAssertionEncrypted!= null)&&this.wantAssertionEncrypted.equals(rhs.wantAssertionEncrypted))))&&((this.keyStoreFilePath == rhs.keyStoreFilePath)||((this.keyStoreFilePath!= null)&&this.keyStoreFilePath.equals(rhs.keyStoreFilePath))))&&((this.sendSignedAuthRequest == rhs.sendSignedAuthRequest)||((this.sendSignedAuthRequest!= null)&&this.sendSignedAuthRequest.equals(rhs.sendSignedAuthRequest))));
    }

}
