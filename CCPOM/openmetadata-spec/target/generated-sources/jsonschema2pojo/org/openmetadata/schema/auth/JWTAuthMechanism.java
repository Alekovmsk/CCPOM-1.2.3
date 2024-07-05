
package org.openmetadata.schema.auth;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JWTAuthMechanism
 * <p>
 * User/Bot JWTAuthMechanism.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "JWTToken",
    "JWTTokenExpiry",
    "JWTTokenExpiresAt"
})
@Generated("jsonschema2pojo")
public class JWTAuthMechanism {

    /**
     * JWT Auth Token.
     * (Required)
     * 
     */
    @JsonProperty("JWTToken")
    @JsonPropertyDescription("JWT Auth Token.")
    @NotNull
    private String jWTToken;
    /**
     * JWT Auth Token expiration in days
     * (Required)
     * 
     */
    @JsonProperty("JWTTokenExpiry")
    @JsonPropertyDescription("JWT Auth Token expiration in days")
    @NotNull
    private JWTTokenExpiry jWTTokenExpiry;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("JWTTokenExpiresAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long jWTTokenExpiresAt;

    /**
     * JWT Auth Token.
     * 
     */
    @JsonProperty("JWTToken")
    public String getJWTToken() {
        return jWTToken;
    }

    /**
     * JWT Auth Token.
     * 
     */
    @JsonProperty("JWTToken")
    public void setJWTToken(String jWTToken) {
        this.jWTToken = jWTToken;
    }

    public JWTAuthMechanism withJWTToken(String jWTToken) {
        this.jWTToken = jWTToken;
        return this;
    }

    /**
     * JWT Auth Token expiration in days
     * 
     */
    @JsonProperty("JWTTokenExpiry")
    public JWTTokenExpiry getJWTTokenExpiry() {
        return jWTTokenExpiry;
    }

    /**
     * JWT Auth Token expiration in days
     * 
     */
    @JsonProperty("JWTTokenExpiry")
    public void setJWTTokenExpiry(JWTTokenExpiry jWTTokenExpiry) {
        this.jWTTokenExpiry = jWTTokenExpiry;
    }

    public JWTAuthMechanism withJWTTokenExpiry(JWTTokenExpiry jWTTokenExpiry) {
        this.jWTTokenExpiry = jWTTokenExpiry;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("JWTTokenExpiresAt")
    public Long getJWTTokenExpiresAt() {
        return jWTTokenExpiresAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("JWTTokenExpiresAt")
    public void setJWTTokenExpiresAt(Long jWTTokenExpiresAt) {
        this.jWTTokenExpiresAt = jWTTokenExpiresAt;
    }

    public JWTAuthMechanism withJWTTokenExpiresAt(Long jWTTokenExpiresAt) {
        this.jWTTokenExpiresAt = jWTTokenExpiresAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JWTAuthMechanism.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("jWTToken");
        sb.append('=');
        sb.append(((this.jWTToken == null)?"<null>":this.jWTToken));
        sb.append(',');
        sb.append("jWTTokenExpiry");
        sb.append('=');
        sb.append(((this.jWTTokenExpiry == null)?"<null>":this.jWTTokenExpiry));
        sb.append(',');
        sb.append("jWTTokenExpiresAt");
        sb.append('=');
        sb.append(((this.jWTTokenExpiresAt == null)?"<null>":this.jWTTokenExpiresAt));
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
        result = ((result* 31)+((this.jWTTokenExpiry == null)? 0 :this.jWTTokenExpiry.hashCode()));
        result = ((result* 31)+((this.jWTToken == null)? 0 :this.jWTToken.hashCode()));
        result = ((result* 31)+((this.jWTTokenExpiresAt == null)? 0 :this.jWTTokenExpiresAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JWTAuthMechanism) == false) {
            return false;
        }
        JWTAuthMechanism rhs = ((JWTAuthMechanism) other);
        return ((((this.jWTTokenExpiry == rhs.jWTTokenExpiry)||((this.jWTTokenExpiry!= null)&&this.jWTTokenExpiry.equals(rhs.jWTTokenExpiry)))&&((this.jWTToken == rhs.jWTToken)||((this.jWTToken!= null)&&this.jWTToken.equals(rhs.jWTToken))))&&((this.jWTTokenExpiresAt == rhs.jWTTokenExpiresAt)||((this.jWTTokenExpiresAt!= null)&&this.jWTTokenExpiresAt.equals(rhs.jWTTokenExpiresAt))));
    }

}
