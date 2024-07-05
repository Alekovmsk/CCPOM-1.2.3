
package org.openmetadata.schema.entity.app;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the type of application.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "scheduleType",
    "cronExpression"
})
@Generated("jsonschema2pojo")
public class AppSchedule {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("scheduleType")
    @NotNull
    private AppSchedule.ScheduleTimeline scheduleType = AppSchedule.ScheduleTimeline.fromValue("Weekly");
    /**
     * Cron Expression in case of Custom scheduled Trigger
     * 
     */
    @JsonProperty("cronExpression")
    @JsonPropertyDescription("Cron Expression in case of Custom scheduled Trigger")
    private String cronExpression;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("scheduleType")
    public AppSchedule.ScheduleTimeline getScheduleType() {
        return scheduleType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("scheduleType")
    public void setScheduleType(AppSchedule.ScheduleTimeline scheduleType) {
        this.scheduleType = scheduleType;
    }

    public AppSchedule withScheduleType(AppSchedule.ScheduleTimeline scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    /**
     * Cron Expression in case of Custom scheduled Trigger
     * 
     */
    @JsonProperty("cronExpression")
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * Cron Expression in case of Custom scheduled Trigger
     * 
     */
    @JsonProperty("cronExpression")
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public AppSchedule withCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AppSchedule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scheduleType");
        sb.append('=');
        sb.append(((this.scheduleType == null)?"<null>":this.scheduleType));
        sb.append(',');
        sb.append("cronExpression");
        sb.append('=');
        sb.append(((this.cronExpression == null)?"<null>":this.cronExpression));
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
        result = ((result* 31)+((this.scheduleType == null)? 0 :this.scheduleType.hashCode()));
        result = ((result* 31)+((this.cronExpression == null)? 0 :this.cronExpression.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppSchedule) == false) {
            return false;
        }
        AppSchedule rhs = ((AppSchedule) other);
        return (((this.scheduleType == rhs.scheduleType)||((this.scheduleType!= null)&&this.scheduleType.equals(rhs.scheduleType)))&&((this.cronExpression == rhs.cronExpression)||((this.cronExpression!= null)&&this.cronExpression.equals(rhs.cronExpression))));
    }

    @Generated("jsonschema2pojo")
    public enum ScheduleTimeline {

        HOURLY("Hourly"),
        DAILY(" Daily"),
        WEEKLY("Weekly"),
        MONTHLY("Monthly"),
        CUSTOM("Custom");
        private final String value;
        private final static Map<String, AppSchedule.ScheduleTimeline> CONSTANTS = new HashMap<String, AppSchedule.ScheduleTimeline>();

        static {
            for (AppSchedule.ScheduleTimeline c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ScheduleTimeline(String value) {
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
        public static AppSchedule.ScheduleTimeline fromValue(String value) {
            AppSchedule.ScheduleTimeline constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
