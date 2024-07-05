
package org.openmetadata.api.configuration.airflow;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TaskNotificationConfiguration
 * <p>
 * This schema defines the SSL Config.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enabled"
})
@Generated("jsonschema2pojo")
public class TaskNotificationConfiguration {

    /**
     * Is Task Notification Enabled?
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("Is Task Notification Enabled?")
    private Boolean enabled = false;

    /**
     * Is Task Notification Enabled?
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Is Task Notification Enabled?
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public TaskNotificationConfiguration withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaskNotificationConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
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
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskNotificationConfiguration) == false) {
            return false;
        }
        TaskNotificationConfiguration rhs = ((TaskNotificationConfiguration) other);
        return ((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled)));
    }

}
