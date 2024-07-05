
package org.openmetadata.schema.security.credentials;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * BasicAuth
 * <p>
 * Basic Auth Credentials
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "username",
    "password"
})
@Generated("jsonschema2pojo")
public class BasicAuth {

    /**
     * Username
     * <p>
     * Username to access the service.
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to access the service.")
    @NotNull
    private String username;
    /**
     * Password
     * <p>
     * Password to access the service.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to access the service.")
    @PasswordField
    @NotNull
    private String password;

    /**
     * Username
     * <p>
     * Username to access the service.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Username
     * <p>
     * Username to access the service.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public BasicAuth withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * <p>
     * Password to access the service.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public String getPassword() {
        return password;
    }

    /**
     * Password
     * <p>
     * Password to access the service.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public BasicAuth withPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BasicAuth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
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
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BasicAuth) == false) {
            return false;
        }
        BasicAuth rhs = ((BasicAuth) other);
        return (((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password)))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
