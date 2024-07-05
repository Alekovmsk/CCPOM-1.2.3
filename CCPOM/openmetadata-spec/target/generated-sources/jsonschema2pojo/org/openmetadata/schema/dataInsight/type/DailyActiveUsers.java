
package org.openmetadata.schema.dataInsight.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DailyActiveUsers
 * <p>
 * dailyActiveUsers data blob
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "activeUsers"
})
@Generated("jsonschema2pojo")
public class DailyActiveUsers {

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * Number of active users (user with at least 1 session).
     * 
     */
    @JsonProperty("activeUsers")
    @JsonPropertyDescription("Number of active users (user with at least 1 session).")
    private Integer activeUsers;

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

    public DailyActiveUsers withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Number of active users (user with at least 1 session).
     * 
     */
    @JsonProperty("activeUsers")
    public Integer getActiveUsers() {
        return activeUsers;
    }

    /**
     * Number of active users (user with at least 1 session).
     * 
     */
    @JsonProperty("activeUsers")
    public void setActiveUsers(Integer activeUsers) {
        this.activeUsers = activeUsers;
    }

    public DailyActiveUsers withActiveUsers(Integer activeUsers) {
        this.activeUsers = activeUsers;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DailyActiveUsers.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("activeUsers");
        sb.append('=');
        sb.append(((this.activeUsers == null)?"<null>":this.activeUsers));
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
        result = ((result* 31)+((this.activeUsers == null)? 0 :this.activeUsers.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DailyActiveUsers) == false) {
            return false;
        }
        DailyActiveUsers rhs = ((DailyActiveUsers) other);
        return (((this.activeUsers == rhs.activeUsers)||((this.activeUsers!= null)&&this.activeUsers.equals(rhs.activeUsers)))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
