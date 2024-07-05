
package org.openmetadata.api.configuration.airflow;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.tests.type.TestCaseStatus;


/**
 * TestResultNotificationConfiguration
 * <p>
 * This schema defines the SSL Config.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enabled",
    "onResult",
    "receivers",
    "sendToOwners"
})
@Generated("jsonschema2pojo")
public class TestResultNotificationConfiguration {

    /**
     * Is Test Notification Enabled?
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("Is Test Notification Enabled?")
    private Boolean enabled = false;
    /**
     * Send notification on Success, Failed or Aborted?
     * 
     */
    @JsonProperty("onResult")
    @JsonPropertyDescription("Send notification on Success, Failed or Aborted?")
    @Valid
    private List<TestCaseStatus> onResult = new ArrayList<TestCaseStatus>();
    /**
     * Send notification on the mail
     * 
     */
    @JsonProperty("receivers")
    @JsonPropertyDescription("Send notification on the mail")
    @Valid
    private List<String> receivers = new ArrayList<String>();
    /**
     * Send notification on the mail
     * 
     */
    @JsonProperty("sendToOwners")
    @JsonPropertyDescription("Send notification on the mail")
    private Boolean sendToOwners = false;

    /**
     * Is Test Notification Enabled?
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Is Test Notification Enabled?
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public TestResultNotificationConfiguration withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Send notification on Success, Failed or Aborted?
     * 
     */
    @JsonProperty("onResult")
    public List<TestCaseStatus> getOnResult() {
        return onResult;
    }

    /**
     * Send notification on Success, Failed or Aborted?
     * 
     */
    @JsonProperty("onResult")
    public void setOnResult(List<TestCaseStatus> onResult) {
        this.onResult = onResult;
    }

    public TestResultNotificationConfiguration withOnResult(List<TestCaseStatus> onResult) {
        this.onResult = onResult;
        return this;
    }

    /**
     * Send notification on the mail
     * 
     */
    @JsonProperty("receivers")
    public List<String> getReceivers() {
        return receivers;
    }

    /**
     * Send notification on the mail
     * 
     */
    @JsonProperty("receivers")
    public void setReceivers(List<String> receivers) {
        this.receivers = receivers;
    }

    public TestResultNotificationConfiguration withReceivers(List<String> receivers) {
        this.receivers = receivers;
        return this;
    }

    /**
     * Send notification on the mail
     * 
     */
    @JsonProperty("sendToOwners")
    public Boolean getSendToOwners() {
        return sendToOwners;
    }

    /**
     * Send notification on the mail
     * 
     */
    @JsonProperty("sendToOwners")
    public void setSendToOwners(Boolean sendToOwners) {
        this.sendToOwners = sendToOwners;
    }

    public TestResultNotificationConfiguration withSendToOwners(Boolean sendToOwners) {
        this.sendToOwners = sendToOwners;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestResultNotificationConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("onResult");
        sb.append('=');
        sb.append(((this.onResult == null)?"<null>":this.onResult));
        sb.append(',');
        sb.append("receivers");
        sb.append('=');
        sb.append(((this.receivers == null)?"<null>":this.receivers));
        sb.append(',');
        sb.append("sendToOwners");
        sb.append('=');
        sb.append(((this.sendToOwners == null)?"<null>":this.sendToOwners));
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
        result = ((result* 31)+((this.sendToOwners == null)? 0 :this.sendToOwners.hashCode()));
        result = ((result* 31)+((this.receivers == null)? 0 :this.receivers.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        result = ((result* 31)+((this.onResult == null)? 0 :this.onResult.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestResultNotificationConfiguration) == false) {
            return false;
        }
        TestResultNotificationConfiguration rhs = ((TestResultNotificationConfiguration) other);
        return (((((this.sendToOwners == rhs.sendToOwners)||((this.sendToOwners!= null)&&this.sendToOwners.equals(rhs.sendToOwners)))&&((this.receivers == rhs.receivers)||((this.receivers!= null)&&this.receivers.equals(rhs.receivers))))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))))&&((this.onResult == rhs.onResult)||((this.onResult!= null)&&this.onResult.equals(rhs.onResult))));
    }

}
