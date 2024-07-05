
package org.openmetadata.schema.entity.app;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * AppRunRecord
 * <p>
 * App Run Record.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "appId",
    "status",
    "runType",
    "startTime",
    "endTime",
    "executionTime",
    "timestamp",
    "failureContext",
    "successContext",
    "scheduleInfo"
})
@Generated("jsonschema2pojo")
public class AppRunRecord {

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("appId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID appId;
    /**
     * Status for the Job.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status for the Job.")
    private AppRunRecord.Status status;
    /**
     * This schema defines the type of application Run.
     * 
     */
    @JsonProperty("runType")
    @JsonPropertyDescription("This schema defines the type of application Run.")
    private AppRunType runType;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("startTime")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long startTime;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("endTime")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long endTime;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("executionTime")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long executionTime;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * Failure Context for the Application.
     * 
     */
    @JsonProperty("failureContext")
    @JsonPropertyDescription("Failure Context for the Application.")
    @Valid
    private FailureContext failureContext;
    /**
     * Success Context for the Application.
     * 
     */
    @JsonProperty("successContext")
    @JsonPropertyDescription("Success Context for the Application.")
    @Valid
    private SuccessContext successContext;
    /**
     * This schema defines the type of application.
     * 
     */
    @JsonProperty("scheduleInfo")
    @JsonPropertyDescription("This schema defines the type of application.")
    private AppSchedule scheduleInfo;

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("appId")
    public UUID getAppId() {
        return appId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("appId")
    public void setAppId(UUID appId) {
        this.appId = appId;
    }

    public AppRunRecord withAppId(UUID appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Status for the Job.
     * 
     */
    @JsonProperty("status")
    public AppRunRecord.Status getStatus() {
        return status;
    }

    /**
     * Status for the Job.
     * 
     */
    @JsonProperty("status")
    public void setStatus(AppRunRecord.Status status) {
        this.status = status;
    }

    public AppRunRecord withStatus(AppRunRecord.Status status) {
        this.status = status;
        return this;
    }

    /**
     * This schema defines the type of application Run.
     * 
     */
    @JsonProperty("runType")
    public AppRunType getRunType() {
        return runType;
    }

    /**
     * This schema defines the type of application Run.
     * 
     */
    @JsonProperty("runType")
    public void setRunType(AppRunType runType) {
        this.runType = runType;
    }

    public AppRunRecord withRunType(AppRunType runType) {
        this.runType = runType;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("startTime")
    public Long getStartTime() {
        return startTime;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("startTime")
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public AppRunRecord withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("endTime")
    public Long getEndTime() {
        return endTime;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public AppRunRecord withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("executionTime")
    public Long getExecutionTime() {
        return executionTime;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("executionTime")
    public void setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
    }

    public AppRunRecord withExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
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

    public AppRunRecord withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Failure Context for the Application.
     * 
     */
    @JsonProperty("failureContext")
    public FailureContext getFailureContext() {
        return failureContext;
    }

    /**
     * Failure Context for the Application.
     * 
     */
    @JsonProperty("failureContext")
    public void setFailureContext(FailureContext failureContext) {
        this.failureContext = failureContext;
    }

    public AppRunRecord withFailureContext(FailureContext failureContext) {
        this.failureContext = failureContext;
        return this;
    }

    /**
     * Success Context for the Application.
     * 
     */
    @JsonProperty("successContext")
    public SuccessContext getSuccessContext() {
        return successContext;
    }

    /**
     * Success Context for the Application.
     * 
     */
    @JsonProperty("successContext")
    public void setSuccessContext(SuccessContext successContext) {
        this.successContext = successContext;
    }

    public AppRunRecord withSuccessContext(SuccessContext successContext) {
        this.successContext = successContext;
        return this;
    }

    /**
     * This schema defines the type of application.
     * 
     */
    @JsonProperty("scheduleInfo")
    public AppSchedule getScheduleInfo() {
        return scheduleInfo;
    }

    /**
     * This schema defines the type of application.
     * 
     */
    @JsonProperty("scheduleInfo")
    public void setScheduleInfo(AppSchedule scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
    }

    public AppRunRecord withScheduleInfo(AppSchedule scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AppRunRecord.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("appId");
        sb.append('=');
        sb.append(((this.appId == null)?"<null>":this.appId));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("runType");
        sb.append('=');
        sb.append(((this.runType == null)?"<null>":this.runType));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("executionTime");
        sb.append('=');
        sb.append(((this.executionTime == null)?"<null>":this.executionTime));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("failureContext");
        sb.append('=');
        sb.append(((this.failureContext == null)?"<null>":this.failureContext));
        sb.append(',');
        sb.append("successContext");
        sb.append('=');
        sb.append(((this.successContext == null)?"<null>":this.successContext));
        sb.append(',');
        sb.append("scheduleInfo");
        sb.append('=');
        sb.append(((this.scheduleInfo == null)?"<null>":this.scheduleInfo));
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
        result = ((result* 31)+((this.executionTime == null)? 0 :this.executionTime.hashCode()));
        result = ((result* 31)+((this.scheduleInfo == null)? 0 :this.scheduleInfo.hashCode()));
        result = ((result* 31)+((this.runType == null)? 0 :this.runType.hashCode()));
        result = ((result* 31)+((this.appId == null)? 0 :this.appId.hashCode()));
        result = ((result* 31)+((this.failureContext == null)? 0 :this.failureContext.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.successContext == null)? 0 :this.successContext.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppRunRecord) == false) {
            return false;
        }
        AppRunRecord rhs = ((AppRunRecord) other);
        return (((((((((((this.executionTime == rhs.executionTime)||((this.executionTime!= null)&&this.executionTime.equals(rhs.executionTime)))&&((this.scheduleInfo == rhs.scheduleInfo)||((this.scheduleInfo!= null)&&this.scheduleInfo.equals(rhs.scheduleInfo))))&&((this.runType == rhs.runType)||((this.runType!= null)&&this.runType.equals(rhs.runType))))&&((this.appId == rhs.appId)||((this.appId!= null)&&this.appId.equals(rhs.appId))))&&((this.failureContext == rhs.failureContext)||((this.failureContext!= null)&&this.failureContext.equals(rhs.failureContext))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.successContext == rhs.successContext)||((this.successContext!= null)&&this.successContext.equals(rhs.successContext))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }


    /**
     * Status for the Job.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        STARTED("started"),
        RUNNING("running"),
        COMPLETED("completed"),
        FAILED("failed"),
        ACTIVE("active"),
        ACTIVE_ERROR("activeError"),
        STOPPED("stopped"),
        SUCCESS("success");
        private final String value;
        private final static Map<String, AppRunRecord.Status> CONSTANTS = new HashMap<String, AppRunRecord.Status>();

        static {
            for (AppRunRecord.Status c: values()) {
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
        public static AppRunRecord.Status fromValue(String value) {
            AppRunRecord.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
