
package org.openmetadata.schema.alert.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.SubscriptionAction;


/**
 * DataInsightAlertConfig
 * <p>
 * This schema defines Data Insight config for receiving reports from OpenMetadata.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sendToAdmins",
    "sendToTeams"
})
@Generated("jsonschema2pojo")
public class DataInsightAlertConfig implements SubscriptionAction
{

    /**
     * Send the Mails to Admins
     * 
     */
    @JsonProperty("sendToAdmins")
    @JsonPropertyDescription("Send the Mails to Admins")
    private Boolean sendToAdmins = false;
    /**
     * Send the Mails to Teams
     * 
     */
    @JsonProperty("sendToTeams")
    @JsonPropertyDescription("Send the Mails to Teams")
    private Boolean sendToTeams = false;

    /**
     * Send the Mails to Admins
     * 
     */
    @JsonProperty("sendToAdmins")
    public Boolean getSendToAdmins() {
        return sendToAdmins;
    }

    /**
     * Send the Mails to Admins
     * 
     */
    @JsonProperty("sendToAdmins")
    public void setSendToAdmins(Boolean sendToAdmins) {
        this.sendToAdmins = sendToAdmins;
    }

    public DataInsightAlertConfig withSendToAdmins(Boolean sendToAdmins) {
        this.sendToAdmins = sendToAdmins;
        return this;
    }

    /**
     * Send the Mails to Teams
     * 
     */
    @JsonProperty("sendToTeams")
    public Boolean getSendToTeams() {
        return sendToTeams;
    }

    /**
     * Send the Mails to Teams
     * 
     */
    @JsonProperty("sendToTeams")
    public void setSendToTeams(Boolean sendToTeams) {
        this.sendToTeams = sendToTeams;
    }

    public DataInsightAlertConfig withSendToTeams(Boolean sendToTeams) {
        this.sendToTeams = sendToTeams;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataInsightAlertConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sendToAdmins");
        sb.append('=');
        sb.append(((this.sendToAdmins == null)?"<null>":this.sendToAdmins));
        sb.append(',');
        sb.append("sendToTeams");
        sb.append('=');
        sb.append(((this.sendToTeams == null)?"<null>":this.sendToTeams));
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
        result = ((result* 31)+((this.sendToAdmins == null)? 0 :this.sendToAdmins.hashCode()));
        result = ((result* 31)+((this.sendToTeams == null)? 0 :this.sendToTeams.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataInsightAlertConfig) == false) {
            return false;
        }
        DataInsightAlertConfig rhs = ((DataInsightAlertConfig) other);
        return (((this.sendToAdmins == rhs.sendToAdmins)||((this.sendToAdmins!= null)&&this.sendToAdmins.equals(rhs.sendToAdmins)))&&((this.sendToTeams == rhs.sendToTeams)||((this.sendToTeams!= null)&&this.sendToTeams.equals(rhs.sendToTeams))));
    }

}
