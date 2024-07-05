
package org.openmetadata.schema.auth;

import javax.annotation.processing.Generated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EmailRequest
 * <p>
 * This schema defines Email Request containing only Email
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "email"
})
@Generated("jsonschema2pojo")
public class EmailRequest {

    /**
     * Email address of a user or other entities.@om-field-type
     * (Required)
     * 
     */
    @Email
    @JsonProperty("email")
    @JsonPropertyDescription("Email address of a user or other entities.")
    @Pattern(regexp = "^[\\S.!#$%&\u2019*+/=?^_`{|}~-]+@\\S+\\.\\S+$")
    @Size(min = 6, max = 127)
    @NotNull
    private String email;

    /**
     * Email address of a user or other entities.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email address of a user or other entities.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public EmailRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmailRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailRequest) == false) {
            return false;
        }
        EmailRequest rhs = ((EmailRequest) other);
        return ((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email)));
    }

}
