
package org.openmetadata.schema.auth;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BasicAuthMechanism
 * <p>
 * User basic Auth Mechanism.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "password"
})
@Generated("jsonschema2pojo")
public class BasicAuthMechanism {

    /**
     * User Password
     * (Required)
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("User Password")
    @NotNull
    private String password;

    /**
     * User Password
     * (Required)
     * 
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * User Password
     * (Required)
     * 
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public BasicAuthMechanism withPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BasicAuthMechanism.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof BasicAuthMechanism) == false) {
            return false;
        }
        BasicAuthMechanism rhs = ((BasicAuthMechanism) other);
        return ((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password)));
    }

}
