
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
 * RegistrationRequest
 * <p>
 * This schema defines the SMTP Settings for sending Email
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstName",
    "lastName",
    "email",
    "password"
})
@Generated("jsonschema2pojo")
public class RegistrationRequest {

    /**
     * First Name
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("First Name")
    @NotNull
    private String firstName;
    /**
     * Last Name
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Last Name")
    @NotNull
    private String lastName;
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
     * Login Password
     * (Required)
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Login Password")
    @Size(min = 8, max = 16)
    @NotNull
    private String password;

    /**
     * First Name
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public RegistrationRequest withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last Name
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public RegistrationRequest withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

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

    public RegistrationRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Login Password
     * (Required)
     * 
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Login Password
     * (Required)
     * 
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public RegistrationRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
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
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationRequest) == false) {
            return false;
        }
        RegistrationRequest rhs = ((RegistrationRequest) other);
        return (((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
