
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
 * RefreshToken
 * <p>
 * This schema defines Refresh Token Schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "token",
    "userId",
    "tokenType",
    "refreshCount",
    "maxRefreshCount",
    "expiryDate"
})
@Generated("jsonschema2pojo")
public class RefreshToken implements TokenInterface
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
     * Refresh Count
     * 
     */
    @JsonProperty("refreshCount")
    @JsonPropertyDescription("Refresh Count")
    private Integer refreshCount;
    /**
     * Refresh Count
     * 
     */
    @JsonProperty("maxRefreshCount")
    @JsonPropertyDescription("Refresh Count")
    private Integer maxRefreshCount;
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

    public RefreshToken withToken(UUID token) {
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

    public RefreshToken withUserId(UUID userId) {
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

    public RefreshToken withTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Refresh Count
     * 
     */
    @JsonProperty("refreshCount")
    public Integer getRefreshCount() {
        return refreshCount;
    }

    /**
     * Refresh Count
     * 
     */
    @JsonProperty("refreshCount")
    public void setRefreshCount(Integer refreshCount) {
        this.refreshCount = refreshCount;
    }

    public RefreshToken withRefreshCount(Integer refreshCount) {
        this.refreshCount = refreshCount;
        return this;
    }

    /**
     * Refresh Count
     * 
     */
    @JsonProperty("maxRefreshCount")
    public Integer getMaxRefreshCount() {
        return maxRefreshCount;
    }

    /**
     * Refresh Count
     * 
     */
    @JsonProperty("maxRefreshCount")
    public void setMaxRefreshCount(Integer maxRefreshCount) {
        this.maxRefreshCount = maxRefreshCount;
    }

    public RefreshToken withMaxRefreshCount(Integer maxRefreshCount) {
        this.maxRefreshCount = maxRefreshCount;
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

    public RefreshToken withExpiryDate(Long expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RefreshToken.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("refreshCount");
        sb.append('=');
        sb.append(((this.refreshCount == null)?"<null>":this.refreshCount));
        sb.append(',');
        sb.append("maxRefreshCount");
        sb.append('=');
        sb.append(((this.maxRefreshCount == null)?"<null>":this.maxRefreshCount));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
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
        result = ((result* 31)+((this.refreshCount == null)? 0 :this.refreshCount.hashCode()));
        result = ((result* 31)+((this.maxRefreshCount == null)? 0 :this.maxRefreshCount.hashCode()));
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
        if ((other instanceof RefreshToken) == false) {
            return false;
        }
        RefreshToken rhs = ((RefreshToken) other);
        return (((((((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate)))&&((this.refreshCount == rhs.refreshCount)||((this.refreshCount!= null)&&this.refreshCount.equals(rhs.refreshCount))))&&((this.maxRefreshCount == rhs.maxRefreshCount)||((this.maxRefreshCount!= null)&&this.maxRefreshCount.equals(rhs.maxRefreshCount))))&&((this.tokenType == rhs.tokenType)||((this.tokenType!= null)&&this.tokenType.equals(rhs.tokenType))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }

}
