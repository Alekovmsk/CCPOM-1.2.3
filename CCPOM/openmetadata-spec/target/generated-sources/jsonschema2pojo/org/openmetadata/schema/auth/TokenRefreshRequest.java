
package org.openmetadata.schema.auth;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TokenRefreshRequest
 * <p>
 * This schema defines the Token Refresh Request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refreshToken"
})
@Generated("jsonschema2pojo")
public class TokenRefreshRequest {

    /**
     * Refresh Token that was shared earlier
     * (Required)
     * 
     */
    @JsonProperty("refreshToken")
    @JsonPropertyDescription("Refresh Token that was shared earlier")
    @NotNull
    private String refreshToken;

    /**
     * Refresh Token that was shared earlier
     * (Required)
     * 
     */
    @JsonProperty("refreshToken")
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Refresh Token that was shared earlier
     * (Required)
     * 
     */
    @JsonProperty("refreshToken")
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public TokenRefreshRequest withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TokenRefreshRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("refreshToken");
        sb.append('=');
        sb.append(((this.refreshToken == null)?"<null>":this.refreshToken));
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
        result = ((result* 31)+((this.refreshToken == null)? 0 :this.refreshToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TokenRefreshRequest) == false) {
            return false;
        }
        TokenRefreshRequest rhs = ((TokenRefreshRequest) other);
        return ((this.refreshToken == rhs.refreshToken)||((this.refreshToken!= null)&&this.refreshToken.equals(rhs.refreshToken)));
    }

}
