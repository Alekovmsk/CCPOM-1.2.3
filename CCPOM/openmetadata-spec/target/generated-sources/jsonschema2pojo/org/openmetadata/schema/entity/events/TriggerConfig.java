
package org.openmetadata.schema.entity.events;

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
 * Trigger Configuration for Alerts.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "triggerType",
    "scheduleInfo",
    "cronExpression"
})
@Generated("jsonschema2pojo")
public class TriggerConfig {

    /**
     * Trigger Configuration for Alerts.
     * (Required)
     * 
     */
    @JsonProperty("triggerType")
    @JsonPropertyDescription("Trigger Configuration for Alerts.")
    @NotNull
    private TriggerConfig.TriggerType triggerType = TriggerConfig.TriggerType.fromValue("RealTime");
    /**
     * Schedule Info
     * 
     */
    @JsonProperty("scheduleInfo")
    @JsonPropertyDescription("Schedule Info")
    private TriggerConfig.ScheduleInfo scheduleInfo = TriggerConfig.ScheduleInfo.fromValue("Weekly");
    /**
     * Cron Expression in case of Custom scheduled Trigger
     * 
     */
    @JsonProperty("cronExpression")
    @JsonPropertyDescription("Cron Expression in case of Custom scheduled Trigger")
    private String cronExpression;

    /**
     * Trigger Configuration for Alerts.
     * (Required)
     * 
     */
    @JsonProperty("triggerType")
    public TriggerConfig.TriggerType getTriggerType() {
        return triggerType;
    }

    /**
     * Trigger Configuration for Alerts.
     * (Required)
     * 
     */
    @JsonProperty("triggerType")
    public void setTriggerType(TriggerConfig.TriggerType triggerType) {
        this.triggerType = triggerType;
    }

    public TriggerConfig withTriggerType(TriggerConfig.TriggerType triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * Schedule Info
     * 
     */
    @JsonProperty("scheduleInfo")
    public TriggerConfig.ScheduleInfo getScheduleInfo() {
        return scheduleInfo;
    }

    /**
     * Schedule Info
     * 
     */
    @JsonProperty("scheduleInfo")
    public void setScheduleInfo(TriggerConfig.ScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
    }

    public TriggerConfig withScheduleInfo(TriggerConfig.ScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
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

    public TriggerConfig withCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TriggerConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("triggerType");
        sb.append('=');
        sb.append(((this.triggerType == null)?"<null>":this.triggerType));
        sb.append(',');
        sb.append("scheduleInfo");
        sb.append('=');
        sb.append(((this.scheduleInfo == null)?"<null>":this.scheduleInfo));
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
        result = ((result* 31)+((this.cronExpression == null)? 0 :this.cronExpression.hashCode()));
        result = ((result* 31)+((this.triggerType == null)? 0 :this.triggerType.hashCode()));
        result = ((result* 31)+((this.scheduleInfo == null)? 0 :this.scheduleInfo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TriggerConfig) == false) {
            return false;
        }
        TriggerConfig rhs = ((TriggerConfig) other);
        return ((((this.cronExpression == rhs.cronExpression)||((this.cronExpression!= null)&&this.cronExpression.equals(rhs.cronExpression)))&&((this.triggerType == rhs.triggerType)||((this.triggerType!= null)&&this.triggerType.equals(rhs.triggerType))))&&((this.scheduleInfo == rhs.scheduleInfo)||((this.scheduleInfo!= null)&&this.scheduleInfo.equals(rhs.scheduleInfo))));
    }


    /**
     * Schedule Info
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ScheduleInfo {

        DAILY("Daily"),
        WEEKLY("Weekly"),
        MONTHLY("Monthly"),
        CUSTOM("Custom");
        private final String value;
        private final static Map<String, TriggerConfig.ScheduleInfo> CONSTANTS = new HashMap<String, TriggerConfig.ScheduleInfo>();

        static {
            for (TriggerConfig.ScheduleInfo c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ScheduleInfo(String value) {
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
        public static TriggerConfig.ScheduleInfo fromValue(String value) {
            TriggerConfig.ScheduleInfo constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Trigger Configuration for Alerts.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TriggerType {

        REAL_TIME("RealTime"),
        SCHEDULED("Scheduled");
        private final String value;
        private final static Map<String, TriggerConfig.TriggerType> CONSTANTS = new HashMap<String, TriggerConfig.TriggerType>();

        static {
            for (TriggerConfig.TriggerType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TriggerType(String value) {
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
        public static TriggerConfig.TriggerType fromValue(String value) {
            TriggerConfig.TriggerType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
