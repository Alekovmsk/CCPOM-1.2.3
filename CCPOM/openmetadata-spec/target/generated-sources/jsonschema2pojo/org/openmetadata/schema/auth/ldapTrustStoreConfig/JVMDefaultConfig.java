
package org.openmetadata.schema.auth.ldapTrustStoreConfig;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JVMDefaultConfig
 * <p>
 * JVMDefault Configuration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "verifyHostname"
})
@Generated("jsonschema2pojo")
public class JVMDefaultConfig {

    /**
     * list of host names to verify
     * 
     */
    @JsonProperty("verifyHostname")
    @JsonPropertyDescription("list of host names to verify")
    private Boolean verifyHostname = false;

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

    public JVMDefaultConfig withVerifyHostname(Boolean verifyHostname) {
        this.verifyHostname = verifyHostname;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JVMDefaultConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("verifyHostname");
        sb.append('=');
        sb.append(((this.verifyHostname == null)?"<null>":this.verifyHostname));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JVMDefaultConfig) == false) {
            return false;
        }
        JVMDefaultConfig rhs = ((JVMDefaultConfig) other);
        return ((this.verifyHostname == rhs.verifyHostname)||((this.verifyHostname!= null)&&this.verifyHostname.equals(rhs.verifyHostname)));
    }

}
