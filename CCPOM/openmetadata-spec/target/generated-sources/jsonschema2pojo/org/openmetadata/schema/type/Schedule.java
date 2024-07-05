
package org.openmetadata.schema.type;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Schedule
 * <p>
 * This schema defines the type used for the schedule. The schedule has a start time and repeat frequency.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startDate",
    "repeatFrequency"
})
@Generated("jsonschema2pojo")
public class Schedule {

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.")
    private Date startDate;
    /**
     * Duration in ISO 8601 format in UTC. Example - 'P23DT23H'.@om-field-type
     * 
     */
    @JsonProperty("repeatFrequency")
    @JsonPropertyDescription("Duration in ISO 8601 format in UTC. Example - 'P23DT23H'.")
    private String repeatFrequency;

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Schedule withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Duration in ISO 8601 format in UTC. Example - 'P23DT23H'.@om-field-type
     * 
     */
    @JsonProperty("repeatFrequency")
    public String getRepeatFrequency() {
        return repeatFrequency;
    }

    /**
     * Duration in ISO 8601 format in UTC. Example - 'P23DT23H'.@om-field-type
     * 
     */
    @JsonProperty("repeatFrequency")
    public void setRepeatFrequency(String repeatFrequency) {
        this.repeatFrequency = repeatFrequency;
    }

    public Schedule withRepeatFrequency(String repeatFrequency) {
        this.repeatFrequency = repeatFrequency;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Schedule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("repeatFrequency");
        sb.append('=');
        sb.append(((this.repeatFrequency == null)?"<null>":this.repeatFrequency));
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
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.repeatFrequency == null)? 0 :this.repeatFrequency.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schedule) == false) {
            return false;
        }
        Schedule rhs = ((Schedule) other);
        return (((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate)))&&((this.repeatFrequency == rhs.repeatFrequency)||((this.repeatFrequency!= null)&&this.repeatFrequency.equals(rhs.repeatFrequency))));
    }

}
