
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UsageDetails
 * <p>
 * This schema defines the type for usage details. Daily, weekly, and monthly aggregation of usage is computed along with the percentile rank based on the usage for a given day.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dailyStats",
    "weeklyStats",
    "monthlyStats",
    "date"
})
@Generated("jsonschema2pojo")
public class UsageDetails {

    /**
     * Type used to return usage statistics.
     * (Required)
     * 
     */
    @JsonProperty("dailyStats")
    @JsonPropertyDescription("Type used to return usage statistics.")
    @Valid
    @NotNull
    private UsageStats dailyStats;
    /**
     * Type used to return usage statistics.
     * 
     */
    @JsonProperty("weeklyStats")
    @JsonPropertyDescription("Type used to return usage statistics.")
    @Valid
    private UsageStats weeklyStats;
    /**
     * Type used to return usage statistics.
     * 
     */
    @JsonProperty("monthlyStats")
    @JsonPropertyDescription("Type used to return usage statistics.")
    @Valid
    private UsageStats monthlyStats;
    /**
     * Date in ISO 8601 format in UTC. Example - '2018-11-13'.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Date in ISO 8601 format in UTC. Example - '2018-11-13'.")
    @NotNull
    private String date;

    /**
     * Type used to return usage statistics.
     * (Required)
     * 
     */
    @JsonProperty("dailyStats")
    public UsageStats getDailyStats() {
        return dailyStats;
    }

    /**
     * Type used to return usage statistics.
     * (Required)
     * 
     */
    @JsonProperty("dailyStats")
    public void setDailyStats(UsageStats dailyStats) {
        this.dailyStats = dailyStats;
    }

    public UsageDetails withDailyStats(UsageStats dailyStats) {
        this.dailyStats = dailyStats;
        return this;
    }

    /**
     * Type used to return usage statistics.
     * 
     */
    @JsonProperty("weeklyStats")
    public UsageStats getWeeklyStats() {
        return weeklyStats;
    }

    /**
     * Type used to return usage statistics.
     * 
     */
    @JsonProperty("weeklyStats")
    public void setWeeklyStats(UsageStats weeklyStats) {
        this.weeklyStats = weeklyStats;
    }

    public UsageDetails withWeeklyStats(UsageStats weeklyStats) {
        this.weeklyStats = weeklyStats;
        return this;
    }

    /**
     * Type used to return usage statistics.
     * 
     */
    @JsonProperty("monthlyStats")
    public UsageStats getMonthlyStats() {
        return monthlyStats;
    }

    /**
     * Type used to return usage statistics.
     * 
     */
    @JsonProperty("monthlyStats")
    public void setMonthlyStats(UsageStats monthlyStats) {
        this.monthlyStats = monthlyStats;
    }

    public UsageDetails withMonthlyStats(UsageStats monthlyStats) {
        this.monthlyStats = monthlyStats;
        return this;
    }

    /**
     * Date in ISO 8601 format in UTC. Example - '2018-11-13'.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * Date in ISO 8601 format in UTC. Example - '2018-11-13'.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public UsageDetails withDate(String date) {
        this.date = date;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UsageDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dailyStats");
        sb.append('=');
        sb.append(((this.dailyStats == null)?"<null>":this.dailyStats));
        sb.append(',');
        sb.append("weeklyStats");
        sb.append('=');
        sb.append(((this.weeklyStats == null)?"<null>":this.weeklyStats));
        sb.append(',');
        sb.append("monthlyStats");
        sb.append('=');
        sb.append(((this.monthlyStats == null)?"<null>":this.monthlyStats));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.monthlyStats == null)? 0 :this.monthlyStats.hashCode()));
        result = ((result* 31)+((this.dailyStats == null)? 0 :this.dailyStats.hashCode()));
        result = ((result* 31)+((this.weeklyStats == null)? 0 :this.weeklyStats.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsageDetails) == false) {
            return false;
        }
        UsageDetails rhs = ((UsageDetails) other);
        return (((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.monthlyStats == rhs.monthlyStats)||((this.monthlyStats!= null)&&this.monthlyStats.equals(rhs.monthlyStats))))&&((this.dailyStats == rhs.dailyStats)||((this.dailyStats!= null)&&this.dailyStats.equals(rhs.dailyStats))))&&((this.weeklyStats == rhs.weeklyStats)||((this.weeklyStats!= null)&&this.weeklyStats.equals(rhs.weeklyStats))));
    }

}
