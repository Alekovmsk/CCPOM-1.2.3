
package org.openmetadata.schema.services.connections.database.common;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * Basic Auth
 * <p>
 * Common Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "password"
})
@Generated("jsonschema2pojo")
public class basicAuth {

    /**
     * Password
     * <p>
     * Password to connect to source.
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to connect to source.")
    @PasswordField
    private String password;

    /**
     * Password
     * <p>
     * Password to connect to source.
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
     * Password to connect to source.
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public basicAuth withPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(basicAuth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof basicAuth) == false) {
            return false;
        }
        basicAuth rhs = ((basicAuth) other);
        return ((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password)));
    }

}
