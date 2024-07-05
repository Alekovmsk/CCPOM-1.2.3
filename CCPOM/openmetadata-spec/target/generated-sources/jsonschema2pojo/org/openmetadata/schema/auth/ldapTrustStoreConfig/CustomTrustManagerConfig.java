
package org.openmetadata.schema.auth.ldapTrustStoreConfig;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CustomTrustManagerConfig
 * <p>
 * CustomTrust Configuration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "verifyHostname",
    "examineValidityDates",
    "trustStoreFilePath",
    "trustStoreFilePassword",
    "trustStoreFileFormat"
})
@Generated("jsonschema2pojo")
public class CustomTrustManagerConfig {

    /**
     * list of host names to verify
     * 
     */
    @JsonProperty("verifyHostname")
    @JsonPropertyDescription("list of host names to verify")
    private Boolean verifyHostname = false;
    /**
     * Examine validity dates of certificate
     * 
     */
    @JsonProperty("examineValidityDates")
    @JsonPropertyDescription("Examine validity dates of certificate")
    private Boolean examineValidityDates = false;
    /**
     * Truststore file path
     * 
     */
    @JsonProperty("trustStoreFilePath")
    @JsonPropertyDescription("Truststore file path")
    private String trustStoreFilePath;
    /**
     * Truststore file password
     * 
     */
    @JsonProperty("trustStoreFilePassword")
    @JsonPropertyDescription("Truststore file password")
    private String trustStoreFilePassword;
    /**
     * Truststore file format
     * 
     */
    @JsonProperty("trustStoreFileFormat")
    @JsonPropertyDescription("Truststore file format")
    private String trustStoreFileFormat;

    /**
     * list of host names to verify
     * 
     */
    @JsonProperty("verifyHostname")
    public Boolean getVerifyHostname() {
        return verifyHostname;
    }

    /**
     * list of host names to verify
     * 
     */
    @JsonProperty("verifyHostname")
    public void setVerifyHostname(Boolean verifyHostname) {
        this.verifyHostname = verifyHostname;
    }

    public CustomTrustManagerConfig withVerifyHostname(Boolean verifyHostname) {
        this.verifyHostname = verifyHostname;
        return this;
    }

    /**
     * Examine validity dates of certificate
     * 
     */
    @JsonProperty("examineValidityDates")
    public Boolean getExamineValidityDates() {
        return examineValidityDates;
    }

    /**
     * Examine validity dates of certificate
     * 
     */
    @JsonProperty("examineValidityDates")
    public void setExamineValidityDates(Boolean examineValidityDates) {
        this.examineValidityDates = examineValidityDates;
    }

    public CustomTrustManagerConfig withExamineValidityDates(Boolean examineValidityDates) {
        this.examineValidityDates = examineValidityDates;
        return this;
    }

    /**
     * Truststore file path
     * 
     */
    @JsonProperty("trustStoreFilePath")
    public String getTrustStoreFilePath() {
        return trustStoreFilePath;
    }

    /**
     * Truststore file path
     * 
     */
    @JsonProperty("trustStoreFilePath")
    public void setTrustStoreFilePath(String trustStoreFilePath) {
        this.trustStoreFilePath = trustStoreFilePath;
    }

    public CustomTrustManagerConfig withTrustStoreFilePath(String trustStoreFilePath) {
        this.trustStoreFilePath = trustStoreFilePath;
        return this;
    }

    /**
     * Truststore file password
     * 
     */
    @JsonProperty("trustStoreFilePassword")
    public String getTrustStoreFilePassword() {
        return trustStoreFilePassword;
    }

    /**
     * Truststore file password
     * 
     */
    @JsonProperty("trustStoreFilePassword")
    public void setTrustStoreFilePassword(String trustStoreFilePassword) {
        this.trustStoreFilePassword = trustStoreFilePassword;
    }

    public CustomTrustManagerConfig withTrustStoreFilePassword(String trustStoreFilePassword) {
        this.trustStoreFilePassword = trustStoreFilePassword;
        return this;
    }

    /**
     * Truststore file format
     * 
     */
    @JsonProperty("trustStoreFileFormat")
    public String getTrustStoreFileFormat() {
        return trustStoreFileFormat;
    }

    /**
     * Truststore file format
     * 
     */
    @JsonProperty("trustStoreFileFormat")
    public void setTrustStoreFileFormat(String trustStoreFileFormat) {
        this.trustStoreFileFormat = trustStoreFileFormat;
    }

    public CustomTrustManagerConfig withTrustStoreFileFormat(String trustStoreFileFormat) {
        this.trustStoreFileFormat = trustStoreFileFormat;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTrustManagerConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("verifyHostname");
        sb.append('=');
        sb.append(((this.verifyHostname == null)?"<null>":this.verifyHostname));
        sb.append(',');
        sb.append("examineValidityDates");
        sb.append('=');
        sb.append(((this.examineValidityDates == null)?"<null>":this.examineValidityDates));
        sb.append(',');
        sb.append("trustStoreFilePath");
        sb.append('=');
        sb.append(((this.trustStoreFilePath == null)?"<null>":this.trustStoreFilePath));
        sb.append(',');
        sb.append("trustStoreFilePassword");
        sb.append('=');
        sb.append(((this.trustStoreFilePassword == null)?"<null>":this.trustStoreFilePassword));
        sb.append(',');
        sb.append("trustStoreFileFormat");
        sb.append('=');
        sb.append(((this.trustStoreFileFormat == null)?"<null>":this.trustStoreFileFormat));
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
        result = ((result* 31)+((this.verifyHostname == null)? 0 :this.verifyHostname.hashCode()));
        result = ((result* 31)+((this.trustStoreFilePath == null)? 0 :this.trustStoreFilePath.hashCode()));
        result = ((result* 31)+((this.trustStoreFileFormat == null)? 0 :this.trustStoreFileFormat.hashCode()));
        result = ((result* 31)+((this.trustStoreFilePassword == null)? 0 :this.trustStoreFilePassword.hashCode()));
        result = ((result* 31)+((this.examineValidityDates == null)? 0 :this.examineValidityDates.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomTrustManagerConfig) == false) {
            return false;
        }
        CustomTrustManagerConfig rhs = ((CustomTrustManagerConfig) other);
        return ((((((this.verifyHostname == rhs.verifyHostname)||((this.verifyHostname!= null)&&this.verifyHostname.equals(rhs.verifyHostname)))&&((this.trustStoreFilePath == rhs.trustStoreFilePath)||((this.trustStoreFilePath!= null)&&this.trustStoreFilePath.equals(rhs.trustStoreFilePath))))&&((this.trustStoreFileFormat == rhs.trustStoreFileFormat)||((this.trustStoreFileFormat!= null)&&this.trustStoreFileFormat.equals(rhs.trustStoreFileFormat))))&&((this.trustStoreFilePassword == rhs.trustStoreFilePassword)||((this.trustStoreFilePassword!= null)&&this.trustStoreFilePassword.equals(rhs.trustStoreFilePassword))))&&((this.examineValidityDates == rhs.examineValidityDates)||((this.examineValidityDates!= null)&&this.examineValidityDates.equals(rhs.examineValidityDates))));
    }

}
