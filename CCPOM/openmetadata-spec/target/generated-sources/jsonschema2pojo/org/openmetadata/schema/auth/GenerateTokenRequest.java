
package org.openmetadata.schema.auth;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Generate JWT Token Request
 * <p>
 * Generate JWT Token Request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "JWTTokenExpiry"
})
@Generated("jsonschema2pojo")
public class GenerateTokenRequest {

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

    public GenerateTokenRequest withJWTTokenExpiry(JWTTokenExpiry jWTTokenExpiry) {
        this.jWTTokenExpiry = jWTTokenExpiry;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GenerateTokenRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("jWTTokenExpiry");
        sb.append('=');
        sb.append(((this.jWTTokenExpiry == null)?"<null>":this.jWTTokenExpiry));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenerateTokenRequest) == false) {
            return false;
        }
        GenerateTokenRequest rhs = ((GenerateTokenRequest) other);
        return ((this.jWTTokenExpiry == rhs.jWTTokenExpiry)||((this.jWTTokenExpiry!= null)&&this.jWTTokenExpiry.equals(rhs.jWTTokenExpiry)));
    }

}
