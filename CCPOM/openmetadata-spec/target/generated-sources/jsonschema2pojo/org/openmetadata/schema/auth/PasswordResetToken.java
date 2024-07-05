
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
 * PasswordResetToken
 * <p>
 * This schema defines Password Verification Token Schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "token",
    "userId",
    "tokenType",
    "expiryDate",
    "isActive",
    "isClaimed"
})
@Generated("jsonschema2pojo")
public class PasswordResetToken implements TokenInterface
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
     * Expiry Date-Time of the token
     * 
     */
    @JsonProperty("isActive")
    @JsonPropertyDescription("Expiry Date-Time of the token")
    private Boolean isActive = true;
    /**
     * Expiry Date-Time of the token
     * 
     */
    @JsonProperty("isClaimed")
    @JsonPropertyDescription("Expiry Date-Time of the token")
    private Boolean isClaimed = false;

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

    public PasswordResetToken withToken(UUID token) {
        this.token = token;
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

    public PasswordResetToken withUserId(UUID userId) {
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

    public PasswordResetToken withTokenType(TokenType tokenType) {
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

    public PasswordResetToken withExpiryDate(Long expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Expiry Date-Time of the token
     * 
     */
    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Expiry Date-Time of the token
     * 
     */
    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public PasswordResetToken withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * Expiry Date-Time of the token
     * 
     */
    @JsonProperty("isClaimed")
    public Boolean getIsClaimed() {
        return isClaimed;
    }

    /**
     * Expiry Date-Time of the token
     * 
     */
    @JsonProperty("isClaimed")
    public void setIsClaimed(Boolean isClaimed) {
        this.isClaimed = isClaimed;
    }

    public PasswordResetToken withIsClaimed(Boolean isClaimed) {
        this.isClaimed = isClaimed;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PasswordResetToken.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
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
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null)?"<null>":this.isActive));
        sb.append(',');
        sb.append("isClaimed");
        sb.append('=');
        sb.append(((this.isClaimed == null)?"<null>":this.isClaimed));
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
        result = ((result* 31)+((this.tokenType == null)? 0 :this.tokenType.hashCode()));
        result = ((result* 31)+((this.isActive == null)? 0 :this.isActive.hashCode()));
        result = ((result* 31)+((this.isClaimed == null)? 0 :this.isClaimed.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PasswordResetToken) == false) {
            return false;
        }
        PasswordResetToken rhs = ((PasswordResetToken) other);
        return (((((((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate)))&&((this.tokenType == rhs.tokenType)||((this.tokenType!= null)&&this.tokenType.equals(rhs.tokenType))))&&((this.isActive == rhs.isActive)||((this.isActive!= null)&&this.isActive.equals(rhs.isActive))))&&((this.isClaimed == rhs.isClaimed)||((this.isClaimed!= null)&&this.isClaimed.equals(rhs.isClaimed))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }

}
