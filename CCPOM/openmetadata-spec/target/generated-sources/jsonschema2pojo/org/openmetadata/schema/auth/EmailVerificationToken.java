
package org.openmetadata.schema.auth;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.TokenInterface;


/**
 * EmailVerificationToken
 * <p>
 * This schema defines Email Verification Token Schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "token",
    "userId",
    "tokenType",
    "tokenStatus",
    "expiryDate"
})
@Generated("jsonschema2pojo")
public class EmailVerificationToken implements TokenInterface
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
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID userId;
    /**
     * Different Type of User token
     * (Required)
     * 
     */
    @JsonProperty("tokenType")
    @JsonPropertyDescription("Different Type of User token")
    @NotNull
    private TokenType tokenType;
    /**
     * Refresh Count
     * (Required)
     * 
     */
    @JsonProperty("tokenStatus")
    @JsonPropertyDescription("Refresh Count")
    @NotNull
    private EmailVerificationToken.TokenStatus tokenStatus;
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

    public EmailVerificationToken withToken(UUID token) {
        this.token = token;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("userId")
    public UUID getUserId() {
        return userId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("userId")
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public EmailVerificationToken withUserId(UUID userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Different Type of User token
     * (Required)
     * 
     */
    @JsonProperty("tokenType")
    public TokenType getTokenType() {
        return tokenType;
    }

    /**
     * Different Type of User token
     * (Required)
     * 
     */
    @JsonProperty("tokenType")
    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }

    public EmailVerificationToken withTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Refresh Count
     * (Required)
     * 
     */
    @JsonProperty("tokenStatus")
    public EmailVerificationToken.TokenStatus getTokenStatus() {
        return tokenStatus;
    }

    /**
     * Refresh Count
     * (Required)
     * 
     */
    @JsonProperty("tokenStatus")
    public void setTokenStatus(EmailVerificationToken.TokenStatus tokenStatus) {
        this.tokenStatus = tokenStatus;
    }

    public EmailVerificationToken withTokenStatus(EmailVerificationToken.TokenStatus tokenStatus) {
        this.tokenStatus = tokenStatus;
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

    public EmailVerificationToken withExpiryDate(Long expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmailVerificationToken.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("tokenStatus");
        sb.append('=');
        sb.append(((this.tokenStatus == null)?"<null>":this.tokenStatus));
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
        result = ((result* 31)+((this.tokenStatus == null)? 0 :this.tokenStatus.hashCode()));
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
        if ((other instanceof EmailVerificationToken) == false) {
            return false;
        }
        EmailVerificationToken rhs = ((EmailVerificationToken) other);
        return ((((((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate)))&&((this.tokenStatus == rhs.tokenStatus)||((this.tokenStatus!= null)&&this.tokenStatus.equals(rhs.tokenStatus))))&&((this.tokenType == rhs.tokenType)||((this.tokenType!= null)&&this.tokenType.equals(rhs.tokenType))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }


    /**
     * Refresh Count
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TokenStatus {

        STATUS_PENDING("STATUS_PENDING"),
        STATUS_CONFIRMED("STATUS_CONFIRMED");
        private final String value;
        private final static Map<String, EmailVerificationToken.TokenStatus> CONSTANTS = new HashMap<String, EmailVerificationToken.TokenStatus>();

        static {
            for (EmailVerificationToken.TokenStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TokenStatus(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static EmailVerificationToken.TokenStatus fromValue(String value) {
            EmailVerificationToken.TokenStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
