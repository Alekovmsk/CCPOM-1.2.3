
package org.openmetadata.schema.auth;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreatePersonalToken
 * <p>
 * Create Personal Access Token Request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tokenName",
    "JWTTokenExpiry"
})
@Generated("jsonschema2pojo")
public class CreatePersonalToken {

    /**
     * Name of the Personal Access Token
     * (Required)
     * 
     */
    @JsonProperty("tokenName")
    @JsonPropertyDescription("Name of the Personal Access Token")
    @NotNull
    private String tokenName;
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
     * Name of the Personal Access Token
     * (Required)
     * 
     */
    @JsonProperty("tokenName")
    public String getTokenName() {
        return tokenName;
    }

    /**
     * Name of the Personal Access Token
     * (Required)
     * 
     */
    @JsonProperty("tokenName")
    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public CreatePersonalToken withTokenName(String tokenName) {
        this.tokenName = tokenName;
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

    public CreatePersonalToken withJWTTokenExpiry(JWTTokenExpiry jWTTokenExpiry) {
        this.jWTTokenExpiry = jWTTokenExpiry;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreatePersonalToken.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tokenName");
        sb.append('=');
        sb.append(((this.tokenName == null)?"<null>":this.tokenName));
        sb.append(',');
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
        result = ((result* 31)+((this.tokenName == null)? 0 :this.tokenName.hashCode()));
        result = ((result* 31)+((this.jWTTokenExpiry == null)? 0 :this.jWTTokenExpiry.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreatePersonalToken) == false) {
            return false;
        }
        CreatePersonalToken rhs = ((CreatePersonalToken) other);
        return (((this.tokenName == rhs.tokenName)||((this.tokenName!= null)&&this.tokenName.equals(rhs.tokenName)))&&((this.jWTTokenExpiry == rhs.jWTTokenExpiry)||((this.jWTTokenExpiry!= null)&&this.jWTTokenExpiry.equals(rhs.jWTTokenExpiry))));
    }

}
