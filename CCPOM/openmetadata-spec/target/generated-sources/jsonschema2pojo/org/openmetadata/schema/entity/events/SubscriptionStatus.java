
package org.openmetadata.schema.entity.events;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Subscription Current Status
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "lastSuccessfulAt",
    "lastFailedAt",
    "lastFailedStatusCode",
    "lastFailedReason",
    "nextAttempt",
    "timestamp"
})
@Generated("jsonschema2pojo")
public class SubscriptionStatus {

    /**
     * Status is `disabled`, when eventSubscription was created with `enabled` set to false and it never started publishing events. Status is `active` when eventSubscription is normally functioning and 200 OK response was received for callback notification. Status is `failed` on bad callback URL, connection failures, `1xx`, and `3xx` response was received for callback notification. Status is `awaitingRetry` when previous attempt at callback timed out or received `4xx`, `5xx` response. Status is `retryLimitReached` after all retries fail.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status is `disabled`, when eventSubscription was created with `enabled` set to false and it never started publishing events. Status is `active` when eventSubscription is normally functioning and 200 OK response was received for callback notification. Status is `failed` on bad callback URL, connection failures, `1xx`, and `3xx` response was received for callback notification. Status is `awaitingRetry` when previous attempt at callback timed out or received `4xx`, `5xx` response. Status is `retryLimitReached` after all retries fail.")
    private SubscriptionStatus.Status status;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastSuccessfulAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long lastSuccessfulAt;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastFailedAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long lastFailedAt;
    /**
     * Last non-successful activity response code received during callback.
     * 
     */
    @JsonProperty("lastFailedStatusCode")
    @JsonPropertyDescription("Last non-successful activity response code received during callback.")
    private Integer lastFailedStatusCode;
    /**
     * Last non-successful activity response reason received during callback.
     * 
     */
    @JsonProperty("lastFailedReason")
    @JsonPropertyDescription("Last non-successful activity response reason received during callback.")
    private String lastFailedReason;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("nextAttempt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long nextAttempt;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;

    /**
     * Status is `disabled`, when eventSubscription was created with `enabled` set to false and it never started publishing events. Status is `active` when eventSubscription is normally functioning and 200 OK response was received for callback notification. Status is `failed` on bad callback URL, connection failures, `1xx`, and `3xx` response was received for callback notification. Status is `awaitingRetry` when previous attempt at callback timed out or received `4xx`, `5xx` response. Status is `retryLimitReached` after all retries fail.
     * 
     */
    @JsonProperty("status")
    public SubscriptionStatus.Status getStatus() {
        return status;
    }

    /**
     * Status is `disabled`, when eventSubscription was created with `enabled` set to false and it never started publishing events. Status is `active` when eventSubscription is normally functioning and 200 OK response was received for callback notification. Status is `failed` on bad callback URL, connection failures, `1xx`, and `3xx` response was received for callback notification. Status is `awaitingRetry` when previous attempt at callback timed out or received `4xx`, `5xx` response. Status is `retryLimitReached` after all retries fail.
     * 
     */
    @JsonProperty("status")
    public void setStatus(SubscriptionStatus.Status status) {
        this.status = status;
    }

    public SubscriptionStatus withStatus(SubscriptionStatus.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastSuccessfulAt")
    public Long getLastSuccessfulAt() {
        return lastSuccessfulAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastSuccessfulAt")
    public void setLastSuccessfulAt(Long lastSuccessfulAt) {
        this.lastSuccessfulAt = lastSuccessfulAt;
    }

    public SubscriptionStatus withLastSuccessfulAt(Long lastSuccessfulAt) {
        this.lastSuccessfulAt = lastSuccessfulAt;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastFailedAt")
    public Long getLastFailedAt() {
        return lastFailedAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastFailedAt")
    public void setLastFailedAt(Long lastFailedAt) {
        this.lastFailedAt = lastFailedAt;
    }

    public SubscriptionStatus withLastFailedAt(Long lastFailedAt) {
        this.lastFailedAt = lastFailedAt;
        return this;
    }

    /**
     * Last non-successful activity response code received during callback.
     * 
     */
    @JsonProperty("lastFailedStatusCode")
    public Integer getLastFailedStatusCode() {
        return lastFailedStatusCode;
    }

    /**
     * Last non-successful activity response code received during callback.
     * 
     */
    @JsonProperty("lastFailedStatusCode")
    public void setLastFailedStatusCode(Integer lastFailedStatusCode) {
        this.lastFailedStatusCode = lastFailedStatusCode;
    }

    public SubscriptionStatus withLastFailedStatusCode(Integer lastFailedStatusCode) {
        this.lastFailedStatusCode = lastFailedStatusCode;
        return this;
    }

    /**
     * Last non-successful activity response reason received during callback.
     * 
     */
    @JsonProperty("lastFailedReason")
    public String getLastFailedReason() {
        return lastFailedReason;
    }

    /**
     * Last non-successful activity response reason received during callback.
     * 
     */
    @JsonProperty("lastFailedReason")
    public void setLastFailedReason(String lastFailedReason) {
        this.lastFailedReason = lastFailedReason;
    }

    public SubscriptionStatus withLastFailedReason(String lastFailedReason) {
        this.lastFailedReason = lastFailedReason;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("nextAttempt")
    public Long getNextAttempt() {
        return nextAttempt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("nextAttempt")
    public void setNextAttempt(Long nextAttempt) {
        this.nextAttempt = nextAttempt;
    }

    public SubscriptionStatus withNextAttempt(Long nextAttempt) {
        this.nextAttempt = nextAttempt;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public SubscriptionStatus withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubscriptionStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("lastSuccessfulAt");
        sb.append('=');
        sb.append(((this.lastSuccessfulAt == null)?"<null>":this.lastSuccessfulAt));
        sb.append(',');
        sb.append("lastFailedAt");
        sb.append('=');
        sb.append(((this.lastFailedAt == null)?"<null>":this.lastFailedAt));
        sb.append(',');
        sb.append("lastFailedStatusCode");
        sb.append('=');
        sb.append(((this.lastFailedStatusCode == null)?"<null>":this.lastFailedStatusCode));
        sb.append(',');
        sb.append("lastFailedReason");
        sb.append('=');
        sb.append(((this.lastFailedReason == null)?"<null>":this.lastFailedReason));
        sb.append(',');
        sb.append("nextAttempt");
        sb.append('=');
        sb.append(((this.nextAttempt == null)?"<null>":this.nextAttempt));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
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
        result = ((result* 31)+((this.lastFailedAt == null)? 0 :this.lastFailedAt.hashCode()));
        result = ((result* 31)+((this.lastFailedReason == null)? 0 :this.lastFailedReason.hashCode()));
        result = ((result* 31)+((this.lastFailedStatusCode == null)? 0 :this.lastFailedStatusCode.hashCode()));
        result = ((result* 31)+((this.lastSuccessfulAt == null)? 0 :this.lastSuccessfulAt.hashCode()));
        result = ((result* 31)+((this.nextAttempt == null)? 0 :this.nextAttempt.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubscriptionStatus) == false) {
            return false;
        }
        SubscriptionStatus rhs = ((SubscriptionStatus) other);
        return ((((((((this.lastFailedAt == rhs.lastFailedAt)||((this.lastFailedAt!= null)&&this.lastFailedAt.equals(rhs.lastFailedAt)))&&((this.lastFailedReason == rhs.lastFailedReason)||((this.lastFailedReason!= null)&&this.lastFailedReason.equals(rhs.lastFailedReason))))&&((this.lastFailedStatusCode == rhs.lastFailedStatusCode)||((this.lastFailedStatusCode!= null)&&this.lastFailedStatusCode.equals(rhs.lastFailedStatusCode))))&&((this.lastSuccessfulAt == rhs.lastSuccessfulAt)||((this.lastSuccessfulAt!= null)&&this.lastSuccessfulAt.equals(rhs.lastSuccessfulAt))))&&((this.nextAttempt == rhs.nextAttempt)||((this.nextAttempt!= null)&&this.nextAttempt.equals(rhs.nextAttempt))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }


    /**
     * Status is `disabled`, when eventSubscription was created with `enabled` set to false and it never started publishing events. Status is `active` when eventSubscription is normally functioning and 200 OK response was received for callback notification. Status is `failed` on bad callback URL, connection failures, `1xx`, and `3xx` response was received for callback notification. Status is `awaitingRetry` when previous attempt at callback timed out or received `4xx`, `5xx` response. Status is `retryLimitReached` after all retries fail.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        DISABLED("disabled"),
        FAILED("failed"),
        RETRY_LIMIT_REACHED("retryLimitReached"),
        AWAITING_RETRY("awaitingRetry"),
        ACTIVE("active");
        private final String value;
        private final static Map<String, SubscriptionStatus.Status> CONSTANTS = new HashMap<String, SubscriptionStatus.Status>();

        static {
            for (SubscriptionStatus.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static SubscriptionStatus.Status fromValue(String value) {
            SubscriptionStatus.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
