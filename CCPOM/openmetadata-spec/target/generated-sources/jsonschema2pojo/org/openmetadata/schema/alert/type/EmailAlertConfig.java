
package org.openmetadata.schema.alert.type;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadata.schema.SubscriptionAction;


/**
 * EmailAlertConfig
 * <p>
 * This schema defines email config for receiving events from OpenMetadata.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "receivers",
    "sendToAdmins",
    "sendToOwners",
    "sendToFollowers"
})
@Generated("jsonschema2pojo")
public class EmailAlertConfig implements SubscriptionAction
{

    /**
     * List of receivers to send mail to
     * 
     */
    @JsonProperty("receivers")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of receivers to send mail to")
    @Valid
    private Set<String> receivers = new LinkedHashSet<String>();
    /**
     * Send the Mails to Admins
     * 
     */
    @JsonProperty("sendToAdmins")
    @JsonPropertyDescription("Send the Mails to Admins")
    private Boolean sendToAdmins = false;
    /**
     * Send the Mails to Owners
     * 
     */
    @JsonProperty("sendToOwners")
    @JsonPropertyDescription("Send the Mails to Owners")
    private Boolean sendToOwners = false;
    /**
     * Send the Mails to Followers
     * 
     */
    @JsonProperty("sendToFollowers")
    @JsonPropertyDescription("Send the Mails to Followers")
    private Boolean sendToFollowers = false;

    /**
     * List of receivers to send mail to
     * 
     */
    @JsonProperty("receivers")
    public Set<String> getReceivers() {
        return receivers;
    }

    /**
     * List of receivers to send mail to
     * 
     */
    @JsonProperty("receivers")
    public void setReceivers(Set<String> receivers) {
        this.receivers = receivers;
    }

    public EmailAlertConfig withReceivers(Set<String> receivers) {
        this.receivers = receivers;
        return this;
    }

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

    public EmailAlertConfig withSendToAdmins(Boolean sendToAdmins) {
        this.sendToAdmins = sendToAdmins;
        return this;
    }

    /**
     * Send the Mails to Owners
     * 
     */
    @JsonProperty("sendToOwners")
    public Boolean getSendToOwners() {
        return sendToOwners;
    }

    /**
     * Send the Mails to Owners
     * 
     */
    @JsonProperty("sendToOwners")
    public void setSendToOwners(Boolean sendToOwners) {
        this.sendToOwners = sendToOwners;
    }

    public EmailAlertConfig withSendToOwners(Boolean sendToOwners) {
        this.sendToOwners = sendToOwners;
        return this;
    }

    /**
     * Send the Mails to Followers
     * 
     */
    @JsonProperty("sendToFollowers")
    public Boolean getSendToFollowers() {
        return sendToFollowers;
    }

    /**
     * Send the Mails to Followers
     * 
     */
    @JsonProperty("sendToFollowers")
    public void setSendToFollowers(Boolean sendToFollowers) {
        this.sendToFollowers = sendToFollowers;
    }

    public EmailAlertConfig withSendToFollowers(Boolean sendToFollowers) {
        this.sendToFollowers = sendToFollowers;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmailAlertConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("receivers");
        sb.append('=');
        sb.append(((this.receivers == null)?"<null>":this.receivers));
        sb.append(',');
        sb.append("sendToAdmins");
        sb.append('=');
        sb.append(((this.sendToAdmins == null)?"<null>":this.sendToAdmins));
        sb.append(',');
        sb.append("sendToOwners");
        sb.append('=');
        sb.append(((this.sendToOwners == null)?"<null>":this.sendToOwners));
        sb.append(',');
        sb.append("sendToFollowers");
        sb.append('=');
        sb.append(((this.sendToFollowers == null)?"<null>":this.sendToFollowers));
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
        result = ((result* 31)+((this.sendToOwners == null)? 0 :this.sendToOwners.hashCode()));
        result = ((result* 31)+((this.sendToFollowers == null)? 0 :this.sendToFollowers.hashCode()));
        result = ((result* 31)+((this.receivers == null)? 0 :this.receivers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailAlertConfig) == false) {
            return false;
        }
        EmailAlertConfig rhs = ((EmailAlertConfig) other);
        return (((((this.sendToAdmins == rhs.sendToAdmins)||((this.sendToAdmins!= null)&&this.sendToAdmins.equals(rhs.sendToAdmins)))&&((this.sendToOwners == rhs.sendToOwners)||((this.sendToOwners!= null)&&this.sendToOwners.equals(rhs.sendToOwners))))&&((this.sendToFollowers == rhs.sendToFollowers)||((this.sendToFollowers!= null)&&this.sendToFollowers.equals(rhs.sendToFollowers))))&&((this.receivers == rhs.receivers)||((this.receivers!= null)&&this.receivers.equals(rhs.receivers))));
    }

}
