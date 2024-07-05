
package org.openmetadata.schema.entity.services.ingestionPipelines;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Properties to configure the Airflow pipeline that will run the workflow.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pausePipeline",
    "concurrency",
    "startDate",
    "endDate",
    "pipelineTimezone",
    "retries",
    "retryDelay",
    "pipelineCatchup",
    "scheduleInterval",
    "maxActiveRuns",
    "workflowTimeout",
    "workflowDefaultView",
    "workflowDefaultViewOrientation",
    "email"
})
@Generated("jsonschema2pojo")
public class AirflowConfig {

    /**
     * pause the pipeline from running once the deploy is finished successfully.
     * 
     */
    @JsonProperty("pausePipeline")
    @JsonPropertyDescription("pause the pipeline from running once the deploy is finished successfully.")
    private Boolean pausePipeline = false;
    /**
     * Concurrency of the Pipeline.
     * 
     */
    @JsonProperty("concurrency")
    @JsonPropertyDescription("Concurrency of the Pipeline.")
    private Integer concurrency = 1;
    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.")
    private Date startDate;
    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.")
    private Date endDate;
    /**
     * Timezone in which pipeline going to be scheduled.
     * 
     */
    @JsonProperty("pipelineTimezone")
    @JsonPropertyDescription("Timezone in which pipeline going to be scheduled.")
    private String pipelineTimezone = "UTC";
    /**
     * Retry pipeline in case of failure.
     * 
     */
    @JsonProperty("retries")
    @JsonPropertyDescription("Retry pipeline in case of failure.")
    private Integer retries = 0;
    /**
     * Delay between retries in seconds.
     * 
     */
    @JsonProperty("retryDelay")
    @JsonPropertyDescription("Delay between retries in seconds.")
    private Integer retryDelay = 300;
    /**
     * Run past executions if the start date is in the past.
     * 
     */
    @JsonProperty("pipelineCatchup")
    @JsonPropertyDescription("Run past executions if the start date is in the past.")
    private Boolean pipelineCatchup = false;
    /**
     * Scheduler Interval for the pipeline in cron format.
     * 
     */
    @JsonProperty("scheduleInterval")
    @JsonPropertyDescription("Scheduler Interval for the pipeline in cron format.")
    private String scheduleInterval;
    /**
     * Maximum Number of active runs.
     * 
     */
    @JsonProperty("maxActiveRuns")
    @JsonPropertyDescription("Maximum Number of active runs.")
    private Integer maxActiveRuns = 1;
    /**
     * Timeout for the workflow in seconds.
     * 
     */
    @JsonProperty("workflowTimeout")
    @JsonPropertyDescription("Timeout for the workflow in seconds.")
    private Integer workflowTimeout = null;
    /**
     * Default view in Airflow.
     * 
     */
    @JsonProperty("workflowDefaultView")
    @JsonPropertyDescription("Default view in Airflow.")
    private String workflowDefaultView = "tree";
    /**
     * Default view Orientation in Airflow.
     * 
     */
    @JsonProperty("workflowDefaultViewOrientation")
    @JsonPropertyDescription("Default view Orientation in Airflow.")
    private String workflowDefaultViewOrientation = "LR";
    /**
     * Email address of a user or other entities.@om-field-type
     * 
     */
    @Email
    @JsonProperty("email")
    @JsonPropertyDescription("Email address of a user or other entities.")
    @Pattern(regexp = "^[\\S.!#$%&\u2019*+/=?^_`{|}~-]+@\\S+\\.\\S+$")
    @Size(min = 6, max = 127)
    private String email;

    /**
     * pause the pipeline from running once the deploy is finished successfully.
     * 
     */
    @JsonProperty("pausePipeline")
    public Boolean getPausePipeline() {
        return pausePipeline;
    }

    /**
     * pause the pipeline from running once the deploy is finished successfully.
     * 
     */
    @JsonProperty("pausePipeline")
    public void setPausePipeline(Boolean pausePipeline) {
        this.pausePipeline = pausePipeline;
    }

    public AirflowConfig withPausePipeline(Boolean pausePipeline) {
        this.pausePipeline = pausePipeline;
        return this;
    }

    /**
     * Concurrency of the Pipeline.
     * 
     */
    @JsonProperty("concurrency")
    public Integer getConcurrency() {
        return concurrency;
    }

    /**
     * Concurrency of the Pipeline.
     * 
     */
    @JsonProperty("concurrency")
    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    public AirflowConfig withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

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

    public AirflowConfig withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public AirflowConfig withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Timezone in which pipeline going to be scheduled.
     * 
     */
    @JsonProperty("pipelineTimezone")
    public String getPipelineTimezone() {
        return pipelineTimezone;
    }

    /**
     * Timezone in which pipeline going to be scheduled.
     * 
     */
    @JsonProperty("pipelineTimezone")
    public void setPipelineTimezone(String pipelineTimezone) {
        this.pipelineTimezone = pipelineTimezone;
    }

    public AirflowConfig withPipelineTimezone(String pipelineTimezone) {
        this.pipelineTimezone = pipelineTimezone;
        return this;
    }

    /**
     * Retry pipeline in case of failure.
     * 
     */
    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    /**
     * Retry pipeline in case of failure.
     * 
     */
    @JsonProperty("retries")
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public AirflowConfig withRetries(Integer retries) {
        this.retries = retries;
        return this;
    }

    /**
     * Delay between retries in seconds.
     * 
     */
    @JsonProperty("retryDelay")
    public Integer getRetryDelay() {
        return retryDelay;
    }

    /**
     * Delay between retries in seconds.
     * 
     */
    @JsonProperty("retryDelay")
    public void setRetryDelay(Integer retryDelay) {
        this.retryDelay = retryDelay;
    }

    public AirflowConfig withRetryDelay(Integer retryDelay) {
        this.retryDelay = retryDelay;
        return this;
    }

    /**
     * Run past executions if the start date is in the past.
     * 
     */
    @JsonProperty("pipelineCatchup")
    public Boolean getPipelineCatchup() {
        return pipelineCatchup;
    }

    /**
     * Run past executions if the start date is in the past.
     * 
     */
    @JsonProperty("pipelineCatchup")
    public void setPipelineCatchup(Boolean pipelineCatchup) {
        this.pipelineCatchup = pipelineCatchup;
    }

    public AirflowConfig withPipelineCatchup(Boolean pipelineCatchup) {
        this.pipelineCatchup = pipelineCatchup;
        return this;
    }

    /**
     * Scheduler Interval for the pipeline in cron format.
     * 
     */
    @JsonProperty("scheduleInterval")
    public String getScheduleInterval() {
        return scheduleInterval;
    }

    /**
     * Scheduler Interval for the pipeline in cron format.
     * 
     */
    @JsonProperty("scheduleInterval")
    public void setScheduleInterval(String scheduleInterval) {
        this.scheduleInterval = scheduleInterval;
    }

    public AirflowConfig withScheduleInterval(String scheduleInterval) {
        this.scheduleInterval = scheduleInterval;
        return this;
    }

    /**
     * Maximum Number of active runs.
     * 
     */
    @JsonProperty("maxActiveRuns")
    public Integer getMaxActiveRuns() {
        return maxActiveRuns;
    }

    /**
     * Maximum Number of active runs.
     * 
     */
    @JsonProperty("maxActiveRuns")
    public void setMaxActiveRuns(Integer maxActiveRuns) {
        this.maxActiveRuns = maxActiveRuns;
    }

    public AirflowConfig withMaxActiveRuns(Integer maxActiveRuns) {
        this.maxActiveRuns = maxActiveRuns;
        return this;
    }

    /**
     * Timeout for the workflow in seconds.
     * 
     */
    @JsonProperty("workflowTimeout")
    public Integer getWorkflowTimeout() {
        return workflowTimeout;
    }

    /**
     * Timeout for the workflow in seconds.
     * 
     */
    @JsonProperty("workflowTimeout")
    public void setWorkflowTimeout(Integer workflowTimeout) {
        this.workflowTimeout = workflowTimeout;
    }

    public AirflowConfig withWorkflowTimeout(Integer workflowTimeout) {
        this.workflowTimeout = workflowTimeout;
        return this;
    }

    /**
     * Default view in Airflow.
     * 
     */
    @JsonProperty("workflowDefaultView")
    public String getWorkflowDefaultView() {
        return workflowDefaultView;
    }

    /**
     * Default view in Airflow.
     * 
     */
    @JsonProperty("workflowDefaultView")
    public void setWorkflowDefaultView(String workflowDefaultView) {
        this.workflowDefaultView = workflowDefaultView;
    }

    public AirflowConfig withWorkflowDefaultView(String workflowDefaultView) {
        this.workflowDefaultView = workflowDefaultView;
        return this;
    }

    /**
     * Default view Orientation in Airflow.
     * 
     */
    @JsonProperty("workflowDefaultViewOrientation")
    public String getWorkflowDefaultViewOrientation() {
        return workflowDefaultViewOrientation;
    }

    /**
     * Default view Orientation in Airflow.
     * 
     */
    @JsonProperty("workflowDefaultViewOrientation")
    public void setWorkflowDefaultViewOrientation(String workflowDefaultViewOrientation) {
        this.workflowDefaultViewOrientation = workflowDefaultViewOrientation;
    }

    public AirflowConfig withWorkflowDefaultViewOrientation(String workflowDefaultViewOrientation) {
        this.workflowDefaultViewOrientation = workflowDefaultViewOrientation;
        return this;
    }

    /**
     * Email address of a user or other entities.@om-field-type
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email address of a user or other entities.@om-field-type
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public AirflowConfig withEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AirflowConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pausePipeline");
        sb.append('=');
        sb.append(((this.pausePipeline == null)?"<null>":this.pausePipeline));
        sb.append(',');
        sb.append("concurrency");
        sb.append('=');
        sb.append(((this.concurrency == null)?"<null>":this.concurrency));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("pipelineTimezone");
        sb.append('=');
        sb.append(((this.pipelineTimezone == null)?"<null>":this.pipelineTimezone));
        sb.append(',');
        sb.append("retries");
        sb.append('=');
        sb.append(((this.retries == null)?"<null>":this.retries));
        sb.append(',');
        sb.append("retryDelay");
        sb.append('=');
        sb.append(((this.retryDelay == null)?"<null>":this.retryDelay));
        sb.append(',');
        sb.append("pipelineCatchup");
        sb.append('=');
        sb.append(((this.pipelineCatchup == null)?"<null>":this.pipelineCatchup));
        sb.append(',');
        sb.append("scheduleInterval");
        sb.append('=');
        sb.append(((this.scheduleInterval == null)?"<null>":this.scheduleInterval));
        sb.append(',');
        sb.append("maxActiveRuns");
        sb.append('=');
        sb.append(((this.maxActiveRuns == null)?"<null>":this.maxActiveRuns));
        sb.append(',');
        sb.append("workflowTimeout");
        sb.append('=');
        sb.append(((this.workflowTimeout == null)?"<null>":this.workflowTimeout));
        sb.append(',');
        sb.append("workflowDefaultView");
        sb.append('=');
        sb.append(((this.workflowDefaultView == null)?"<null>":this.workflowDefaultView));
        sb.append(',');
        sb.append("workflowDefaultViewOrientation");
        sb.append('=');
        sb.append(((this.workflowDefaultViewOrientation == null)?"<null>":this.workflowDefaultViewOrientation));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
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
        result = ((result* 31)+((this.maxActiveRuns == null)? 0 :this.maxActiveRuns.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.pipelineCatchup == null)? 0 :this.pipelineCatchup.hashCode()));
        result = ((result* 31)+((this.pausePipeline == null)? 0 :this.pausePipeline.hashCode()));
        result = ((result* 31)+((this.pipelineTimezone == null)? 0 :this.pipelineTimezone.hashCode()));
        result = ((result* 31)+((this.concurrency == null)? 0 :this.concurrency.hashCode()));
        result = ((result* 31)+((this.retryDelay == null)? 0 :this.retryDelay.hashCode()));
        result = ((result* 31)+((this.scheduleInterval == null)? 0 :this.scheduleInterval.hashCode()));
        result = ((result* 31)+((this.retries == null)? 0 :this.retries.hashCode()));
        result = ((result* 31)+((this.workflowDefaultViewOrientation == null)? 0 :this.workflowDefaultViewOrientation.hashCode()));
        result = ((result* 31)+((this.workflowDefaultView == null)? 0 :this.workflowDefaultView.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.workflowTimeout == null)? 0 :this.workflowTimeout.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirflowConfig) == false) {
            return false;
        }
        AirflowConfig rhs = ((AirflowConfig) other);
        return (((((((((((((((this.maxActiveRuns == rhs.maxActiveRuns)||((this.maxActiveRuns!= null)&&this.maxActiveRuns.equals(rhs.maxActiveRuns)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.pipelineCatchup == rhs.pipelineCatchup)||((this.pipelineCatchup!= null)&&this.pipelineCatchup.equals(rhs.pipelineCatchup))))&&((this.pausePipeline == rhs.pausePipeline)||((this.pausePipeline!= null)&&this.pausePipeline.equals(rhs.pausePipeline))))&&((this.pipelineTimezone == rhs.pipelineTimezone)||((this.pipelineTimezone!= null)&&this.pipelineTimezone.equals(rhs.pipelineTimezone))))&&((this.concurrency == rhs.concurrency)||((this.concurrency!= null)&&this.concurrency.equals(rhs.concurrency))))&&((this.retryDelay == rhs.retryDelay)||((this.retryDelay!= null)&&this.retryDelay.equals(rhs.retryDelay))))&&((this.scheduleInterval == rhs.scheduleInterval)||((this.scheduleInterval!= null)&&this.scheduleInterval.equals(rhs.scheduleInterval))))&&((this.retries == rhs.retries)||((this.retries!= null)&&this.retries.equals(rhs.retries))))&&((this.workflowDefaultViewOrientation == rhs.workflowDefaultViewOrientation)||((this.workflowDefaultViewOrientation!= null)&&this.workflowDefaultViewOrientation.equals(rhs.workflowDefaultViewOrientation))))&&((this.workflowDefaultView == rhs.workflowDefaultView)||((this.workflowDefaultView!= null)&&this.workflowDefaultView.equals(rhs.workflowDefaultView))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.workflowTimeout == rhs.workflowTimeout)||((this.workflowTimeout!= null)&&this.workflowTimeout.equals(rhs.workflowTimeout))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
