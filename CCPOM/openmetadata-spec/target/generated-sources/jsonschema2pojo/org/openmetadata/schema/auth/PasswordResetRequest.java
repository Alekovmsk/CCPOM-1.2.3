
package org.openmetadata.schema.auth;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PasswordResetRequest
 * <p>
 * This schema defines Email Verification Token Schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "username",
    "password",
    "confirmPassword",
    "token"
})
@Generated("jsonschema2pojo")
public class PasswordResetRequest {

    /**
     * UserName
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("UserName")
    @NotNull
    private String username;
    /**
     * Password
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password")
    @Size(min = 8, max = 16)
    private String password;
    /**
     * Confirm Password
     * 
     */
    @JsonProperty("confirmPassword")
    @JsonPropertyDescription("Confirm Password")
    @Size(min = 8, max = 16)
    private String confirmPassword;
    /**
     * Token
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("Token")
    private String token;

    /**
     * UserName
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * UserName
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public PasswordResetRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * 
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Password
     * 
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public PasswordResetRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Confirm Password
     * 
     */
    @JsonProperty("confirmPassword")
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * Confirm Password
     * 
     */
    @JsonProperty("confirmPassword")
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public PasswordResetRequest withConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    /**
     * Token
     * 
     */
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    /**
     * Token
     * 
     */
    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    public PasswordResetRequest withToken(String token) {
        this.token = token;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PasswordResetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("confirmPassword");
        sb.append('=');
        sb.append(((this.confirmPassword == null)?"<null>":this.confirmPassword));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
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
        result = ((result* 31)+((this.confirmPassword == null)? 0 :this.confirmPassword.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PasswordResetRequest) == false) {
            return false;
        }
        PasswordResetRequest rhs = ((PasswordResetRequest) other);
        return (((((this.confirmPassword == rhs.confirmPassword)||((this.confirmPassword!= null)&&this.confirmPassword.equals(rhs.confirmPassword)))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }

}
