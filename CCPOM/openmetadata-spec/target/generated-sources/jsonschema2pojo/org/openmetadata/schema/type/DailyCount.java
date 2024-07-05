
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Daily count of some measurement
 * <p>
 * This schema defines the type for reporting the daily count of some measurement. For example, you might use this schema for the number of times a table is queried each day.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "count",
    "date"
})
@Generated("jsonschema2pojo")
public class DailyCount {

    /**
     * Daily count of a measurement on the given date.
     * (Required)
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("Daily count of a measurement on the given date.")
    @DecimalMin("0")
    @NotNull
    private Integer count;
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
     * Daily count of a measurement on the given date.
     * (Required)
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * Daily count of a measurement on the given date.
     * (Required)
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public DailyCount withCount(Integer count) {
        this.count = count;
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

    public DailyCount withDate(String date) {
        this.date = date;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DailyCount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
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
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DailyCount) == false) {
            return false;
        }
        DailyCount rhs = ((DailyCount) other);
        return (((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count)))&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))));
    }

}
