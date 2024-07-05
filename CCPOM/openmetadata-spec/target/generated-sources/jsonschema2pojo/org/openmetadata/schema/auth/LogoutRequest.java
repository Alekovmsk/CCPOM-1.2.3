
package org.openmetadata.schema.auth;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LogoutRequest
 * <p>
 * This schema defines Logout Request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "username",
    "token",
    "logoutTime",
    "refreshToken"
})
@Generated("jsonschema2pojo")
public class LogoutRequest {

    /**
     * Logout Username
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Logout Username")
    private String username;
    /**
     * Token To be Expired
     * (Required)
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("Token To be Expired")
    @NotNull
    private String token;
    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("logoutTime")
    @JsonPropertyDescription("Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.")
    private Date logoutTime;
    /**
     * Refresh Token
     * 
     */
    @JsonProperty("refreshToken")
    @JsonPropertyDescription("Refresh Token")
    private String refreshToken;

    /**
     * Logout Username
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Logout Username
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public LogoutRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Token To be Expired
     * (Required)
     * 
     */
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    /**
     * Token To be Expired
     * (Required)
     * 
     */
    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    public LogoutRequest withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("logoutTime")
    public Date getLogoutTime() {
        return logoutTime;
    }

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("logoutTime")
    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public LogoutRequest withLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
        return this;
    }

    /**
     * Refresh Token
     * 
     */
    @JsonProperty("refreshToken")
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Refresh Token
     * 
     */
    @JsonProperty("refreshToken")
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public LogoutRequest withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LogoutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
        sb.append(',');
        sb.append("logoutTime");
        sb.append('=');
        sb.append(((this.logoutTime == null)?"<null>":this.logoutTime));
        sb.append(',');
        sb.append("refreshToken");
        sb.append('=');
        sb.append(((this.refreshToken == null)?"<null>":this.refreshToken));
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
        result = ((result* 31)+((this.logoutTime == null)? 0 :this.logoutTime.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        result = ((result* 31)+((this.refreshToken == null)? 0 :this.refreshToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogoutRequest) == false) {
            return false;
        }
        LogoutRequest rhs = ((LogoutRequest) other);
        return (((((this.logoutTime == rhs.logoutTime)||((this.logoutTime!= null)&&this.logoutTime.equals(rhs.logoutTime)))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))))&&((this.refreshToken == rhs.refreshToken)||((this.refreshToken!= null)&&this.refreshToken.equals(rhs.refreshToken))));
    }

}
