
package org.openmetadata.schema.services.connections.database.common;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * JWT Auth
 * <p>
 * Common Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jwt"
})
@Generated("jsonschema2pojo")
public class jwtAuth {

    /**
     * JWT
     * <p>
     * JWT to connect to source.
     * 
     */
    @JsonProperty("jwt")
    @JsonPropertyDescription("JWT to connect to source.")
    @PasswordField
    private String jwt;

    /**
     * JWT
     * <p>
     * JWT to connect to source.
     * 
     */
    @JsonProperty("jwt")
    @PasswordField
    public String getJwt() {
        return jwt;
    }

    /**
     * JWT
     * <p>
     * JWT to connect to source.
     * 
     */
    @JsonProperty("jwt")
    @PasswordField
    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public jwtAuth withJwt(String jwt) {
        this.jwt = jwt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(jwtAuth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("jwt");
        sb.append('=');
        sb.append(((this.jwt == null)?"<null>":this.jwt));
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
        result = ((result* 31)+((this.jwt == null)? 0 :this.jwt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof jwtAuth) == false) {
            return false;
        }
        jwtAuth rhs = ((jwtAuth) other);
        return ((this.jwt == rhs.jwt)||((this.jwt!= null)&&this.jwt.equals(rhs.jwt)));
    }

}
