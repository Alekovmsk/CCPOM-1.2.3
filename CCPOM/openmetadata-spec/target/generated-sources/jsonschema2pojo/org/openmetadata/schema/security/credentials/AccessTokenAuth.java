
package org.openmetadata.schema.security.credentials;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * AccessTokenAuth
 * <p>
 * Access Token Auth Credentials
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "personalAccessTokenName",
    "personalAccessTokenSecret"
})
@Generated("jsonschema2pojo")
public class AccessTokenAuth {

    /**
     * Personal Access Token
     * <p>
     * Personal Access Token Name.
     * (Required)
     * 
     */
    @JsonProperty("personalAccessTokenName")
    @JsonPropertyDescription("Personal Access Token Name.")
    @NotNull
    private String personalAccessTokenName;
    /**
     * Personal Access Token Secret
     * <p>
     * Personal Access Token Secret.
     * (Required)
     * 
     */
    @JsonProperty("personalAccessTokenSecret")
    @JsonPropertyDescription("Personal Access Token Secret.")
    @PasswordField
    @NotNull
    private String personalAccessTokenSecret;

    /**
     * Personal Access Token
     * <p>
     * Personal Access Token Name.
     * (Required)
     * 
     */
    @JsonProperty("personalAccessTokenName")
    public String getPersonalAccessTokenName() {
        return personalAccessTokenName;
    }

    /**
     * Personal Access Token
     * <p>
     * Personal Access Token Name.
     * (Required)
     * 
     */
    @JsonProperty("personalAccessTokenName")
    public void setPersonalAccessTokenName(String personalAccessTokenName) {
        this.personalAccessTokenName = personalAccessTokenName;
    }

    public AccessTokenAuth withPersonalAccessTokenName(String personalAccessTokenName) {
        this.personalAccessTokenName = personalAccessTokenName;
        return this;
    }

    /**
     * Personal Access Token Secret
     * <p>
     * Personal Access Token Secret.
     * (Required)
     * 
     */
    @JsonProperty("personalAccessTokenSecret")
    @PasswordField
    public String getPersonalAccessTokenSecret() {
        return personalAccessTokenSecret;
    }

    /**
     * Personal Access Token Secret
     * <p>
     * Personal Access Token Secret.
     * (Required)
     * 
     */
    @JsonProperty("personalAccessTokenSecret")
    @PasswordField
    public void setPersonalAccessTokenSecret(String personalAccessTokenSecret) {
        this.personalAccessTokenSecret = personalAccessTokenSecret;
    }

    public AccessTokenAuth withPersonalAccessTokenSecret(String personalAccessTokenSecret) {
        this.personalAccessTokenSecret = personalAccessTokenSecret;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccessTokenAuth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("personalAccessTokenName");
        sb.append('=');
        sb.append(((this.personalAccessTokenName == null)?"<null>":this.personalAccessTokenName));
        sb.append(',');
        sb.append("personalAccessTokenSecret");
        sb.append('=');
        sb.append(((this.personalAccessTokenSecret == null)?"<null>":this.personalAccessTokenSecret));
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
        result = ((result* 31)+((this.personalAccessTokenName == null)? 0 :this.personalAccessTokenName.hashCode()));
        result = ((result* 31)+((this.personalAccessTokenSecret == null)? 0 :this.personalAccessTokenSecret.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessTokenAuth) == false) {
            return false;
        }
        AccessTokenAuth rhs = ((AccessTokenAuth) other);
        return (((this.personalAccessTokenName == rhs.personalAccessTokenName)||((this.personalAccessTokenName!= null)&&this.personalAccessTokenName.equals(rhs.personalAccessTokenName)))&&((this.personalAccessTokenSecret == rhs.personalAccessTokenSecret)||((this.personalAccessTokenSecret!= null)&&this.personalAccessTokenSecret.equals(rhs.personalAccessTokenSecret))));
    }

}
