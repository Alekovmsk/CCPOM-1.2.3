
package org.openmetadata.schema.api.configuration;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LogoConfiguration
 * <p>
 * This schema defines the Login Configuration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maxLoginFailAttempts",
    "accessBlockTime",
    "jwtTokenExpiryTime"
})
@Generated("jsonschema2pojo")
public class LoginConfiguration {

    /**
     * Failed Login Attempts allowed for user.
     * 
     */
    @JsonProperty("maxLoginFailAttempts")
    @JsonPropertyDescription("Failed Login Attempts allowed for user.")
    private Integer maxLoginFailAttempts = 3;
    /**
     * Access Block time for user on exceeding failed attempts(in seconds)
     * 
     */
    @JsonProperty("accessBlockTime")
    @JsonPropertyDescription("Access Block time for user on exceeding failed attempts(in seconds)")
    private Integer accessBlockTime = 600;
    /**
     * Jwt Token Expiry time for login in seconds
     * 
     */
    @JsonProperty("jwtTokenExpiryTime")
    @JsonPropertyDescription("Jwt Token Expiry time for login in seconds")
    private Integer jwtTokenExpiryTime = 3600;

    /**
     * Failed Login Attempts allowed for user.
     * 
     */
    @JsonProperty("maxLoginFailAttempts")
    public Integer getMaxLoginFailAttempts() {
        return maxLoginFailAttempts;
    }

    /**
     * Failed Login Attempts allowed for user.
     * 
     */
    @JsonProperty("maxLoginFailAttempts")
    public void setMaxLoginFailAttempts(Integer maxLoginFailAttempts) {
        this.maxLoginFailAttempts = maxLoginFailAttempts;
    }

    public LoginConfiguration withMaxLoginFailAttempts(Integer maxLoginFailAttempts) {
        this.maxLoginFailAttempts = maxLoginFailAttempts;
        return this;
    }

    /**
     * Access Block time for user on exceeding failed attempts(in seconds)
     * 
     */
    @JsonProperty("accessBlockTime")
    public Integer getAccessBlockTime() {
        return accessBlockTime;
    }

    /**
     * Access Block time for user on exceeding failed attempts(in seconds)
     * 
     */
    @JsonProperty("accessBlockTime")
    public void setAccessBlockTime(Integer accessBlockTime) {
        this.accessBlockTime = accessBlockTime;
    }

    public LoginConfiguration withAccessBlockTime(Integer accessBlockTime) {
        this.accessBlockTime = accessBlockTime;
        return this;
    }

    /**
     * Jwt Token Expiry time for login in seconds
     * 
     */
    @JsonProperty("jwtTokenExpiryTime")
    public Integer getJwtTokenExpiryTime() {
        return jwtTokenExpiryTime;
    }

    /**
     * Jwt Token Expiry time for login in seconds
     * 
     */
    @JsonProperty("jwtTokenExpiryTime")
    public void setJwtTokenExpiryTime(Integer jwtTokenExpiryTime) {
        this.jwtTokenExpiryTime = jwtTokenExpiryTime;
    }

    public LoginConfiguration withJwtTokenExpiryTime(Integer jwtTokenExpiryTime) {
        this.jwtTokenExpiryTime = jwtTokenExpiryTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoginConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxLoginFailAttempts");
        sb.append('=');
        sb.append(((this.maxLoginFailAttempts == null)?"<null>":this.maxLoginFailAttempts));
        sb.append(',');
        sb.append("accessBlockTime");
        sb.append('=');
        sb.append(((this.accessBlockTime == null)?"<null>":this.accessBlockTime));
        sb.append(',');
        sb.append("jwtTokenExpiryTime");
        sb.append('=');
        sb.append(((this.jwtTokenExpiryTime == null)?"<null>":this.jwtTokenExpiryTime));
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
        result = ((result* 31)+((this.accessBlockTime == null)? 0 :this.accessBlockTime.hashCode()));
        result = ((result* 31)+((this.jwtTokenExpiryTime == null)? 0 :this.jwtTokenExpiryTime.hashCode()));
        result = ((result* 31)+((this.maxLoginFailAttempts == null)? 0 :this.maxLoginFailAttempts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoginConfiguration) == false) {
            return false;
        }
        LoginConfiguration rhs = ((LoginConfiguration) other);
        return ((((this.accessBlockTime == rhs.accessBlockTime)||((this.accessBlockTime!= null)&&this.accessBlockTime.equals(rhs.accessBlockTime)))&&((this.jwtTokenExpiryTime == rhs.jwtTokenExpiryTime)||((this.jwtTokenExpiryTime!= null)&&this.jwtTokenExpiryTime.equals(rhs.jwtTokenExpiryTime))))&&((this.maxLoginFailAttempts == rhs.maxLoginFailAttempts)||((this.maxLoginFailAttempts!= null)&&this.maxLoginFailAttempts.equals(rhs.maxLoginFailAttempts))));
    }

}
