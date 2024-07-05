
package org.openmetadata.schema.auth;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LoginRequest
 * <p>
 * This schema defines Email Verification Token Schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "email",
    "password"
})
@Generated("jsonschema2pojo")
public class LoginRequest {

    /**
     * Login Email
     * (Required)
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("Login Email")
    @NotNull
    private String email;
    /**
     * Login Password in base64 format
     * (Required)
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Login Password in base64 format")
    @NotNull
    private String password;

    /**
     * Login Email
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Login Email
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public LoginRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Login Password in base64 format
     * (Required)
     * 
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Login Password in base64 format
     * (Required)
     * 
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public LoginRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoginRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
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
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoginRequest) == false) {
            return false;
        }
        LoginRequest rhs = ((LoginRequest) other);
        return (((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email)))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))));
    }

}
