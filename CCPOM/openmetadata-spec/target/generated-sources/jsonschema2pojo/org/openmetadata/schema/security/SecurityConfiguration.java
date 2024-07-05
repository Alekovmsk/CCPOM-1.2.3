
package org.openmetadata.schema.security;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ValidateSSLClientConfig
 * <p>
 * Security configuration for the OpenMetadata server.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maskPasswordsAPI"
})
@Generated("jsonschema2pojo")
public class SecurityConfiguration {

    /**
     * Mask Password API
     * <p>
     * If enabled, it will mask all the password fields in the responses sent from the API except for the bots
     * 
     */
    @JsonProperty("maskPasswordsAPI")
    @JsonPropertyDescription("If enabled, it will mask all the password fields in the responses sent from the API except for the bots")
    private Boolean maskPasswordsAPI = false;

    /**
     * Mask Password API
     * <p>
     * If enabled, it will mask all the password fields in the responses sent from the API except for the bots
     * 
     */
    @JsonProperty("maskPasswordsAPI")
    public Boolean getMaskPasswordsAPI() {
        return maskPasswordsAPI;
    }

    /**
     * Mask Password API
     * <p>
     * If enabled, it will mask all the password fields in the responses sent from the API except for the bots
     * 
     */
    @JsonProperty("maskPasswordsAPI")
    public void setMaskPasswordsAPI(Boolean maskPasswordsAPI) {
        this.maskPasswordsAPI = maskPasswordsAPI;
    }

    public SecurityConfiguration withMaskPasswordsAPI(Boolean maskPasswordsAPI) {
        this.maskPasswordsAPI = maskPasswordsAPI;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecurityConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maskPasswordsAPI");
        sb.append('=');
        sb.append(((this.maskPasswordsAPI == null)?"<null>":this.maskPasswordsAPI));
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
        result = ((result* 31)+((this.maskPasswordsAPI == null)? 0 :this.maskPasswordsAPI.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityConfiguration) == false) {
            return false;
        }
        SecurityConfiguration rhs = ((SecurityConfiguration) other);
        return ((this.maskPasswordsAPI == rhs.maskPasswordsAPI)||((this.maskPasswordsAPI!= null)&&this.maskPasswordsAPI.equals(rhs.maskPasswordsAPI)));
    }

}
