
package org.openmetadata.schema.auth;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.TokenInterface;


/**
 * PersonalAccessToken
 * <p>
 * This schema defines Personal Access Token Schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "token",
    "tokenName",
    "userId",
    "tokenType",
    "expiryDate",
    "jwtToken"
})
@Generated("jsonschema2pojo")
public class PersonalAccessToken implements TokenInterface
{

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    @NotNull
    private UUID token;
    /**
     * Name of the token
     * 
     */
    @JsonProperty("tokenName")
    @JsonPropertyDescription("Name of the token")
    private String tokenName;
    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    @NotNull
    private UUID userId;
    /**
     * Different Type of User token
     * 
     */
    @JsonProperty("tokenType")
    @JsonPropertyDescription("Different Type of User token")
    private TokenType tokenType;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("expiryDate")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    @NotNull
    private Long expiryDate;
    /**
     * JWT Auth Token.
     * 
     */
    @JsonProperty("jwtToken")
    @JsonPropertyDescription("JWT Auth Token.")
    private String jwtToken;

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("token")
    public UUID getToken() {
        return token;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("token")
    public void setToken(UUID token) {
        this.token = token;
    }

    public PersonalAccessToken withToken(UUID token) {
        this.token = token;
        return this;
    }

    /**
     * Name of the token
     * 
     */
    @JsonProperty("tokenName")
    public String getTokenName() {
        return tokenName;
    }

    /**
     * Name of the token
     * 
     */
    @JsonProperty("tokenName")
    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public PersonalAccessToken withTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public UUID getUserId() {
        return userId;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public PersonalAccessToken withUserId(UUID userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Different Type of User token
     * 
     */
    @JsonProperty("tokenType")
    public TokenType getTokenType() {
        return tokenType;
    }

    /**
     * Different Type of User token
     * 
     */
    @JsonProperty("tokenType")
    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }

    public PersonalAccessToken withTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("expiryDate")
    public Long getExpiryDate() {
        return expiryDate;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("expiryDate")
    public void setExpiryDate(Long expiryDate) {
        this.expiryDate = expiryDate;
    }

    public PersonalAccessToken withExpiryDate(Long expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * JWT Auth Token.
     * 
     */
    @JsonProperty("jwtToken")
    public String getJwtToken() {
        return jwtToken;
    }

    /**
     * JWT Auth Token.
     * 
     */
    @JsonProperty("jwtToken")
    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public PersonalAccessToken withJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonalAccessToken.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
        sb.append(',');
        sb.append("tokenName");
        sb.append('=');
        sb.append(((this.tokenName == null)?"<null>":this.tokenName));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("tokenType");
        sb.append('=');
        sb.append(((this.tokenType == null)?"<null>":this.tokenType));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("jwtToken");
        sb.append('=');
        sb.append(((this.jwtToken == null)?"<null>":this.jwtToken));
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
        result = ((result* 31)+((this.expiryDate == null)? 0 :this.expiryDate.hashCode()));
        result = ((result* 31)+((this.tokenName == null)? 0 :this.tokenName.hashCode()));
        result = ((result* 31)+((this.jwtToken == null)? 0 :this.jwtToken.hashCode()));
        result = ((result* 31)+((this.tokenType == null)? 0 :this.tokenType.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonalAccessToken) == false) {
            return false;
        }
        PersonalAccessToken rhs = ((PersonalAccessToken) other);
        return (((((((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate)))&&((this.tokenName == rhs.tokenName)||((this.tokenName!= null)&&this.tokenName.equals(rhs.tokenName))))&&((this.jwtToken == rhs.jwtToken)||((this.jwtToken!= null)&&this.jwtToken.equals(rhs.jwtToken))))&&((this.tokenType == rhs.tokenType)||((this.tokenType!= null)&&this.tokenType.equals(rhs.tokenType))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }

}
