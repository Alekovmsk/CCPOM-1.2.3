
package org.openmetadata.schema.type.profile;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.Webhook;


/**
 * Holds the Subscription Config for different types
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "slack",
    "msTeams",
    "gChat",
    "generic"
})
@Generated("jsonschema2pojo")
public class SubscriptionConfig {

    /**
     * Webhook
     * <p>
     * This schema defines webhook for receiving events from OpenMetadata.
     * 
     */
    @JsonProperty("slack")
    @JsonPropertyDescription("This schema defines webhook for receiving events from OpenMetadata.")
    @Valid
    private Webhook slack;
    /**
     * Webhook
     * <p>
     * This schema defines webhook for receiving events from OpenMetadata.
     * 
     */
    @JsonProperty("msTeams")
    @JsonPropertyDescription("This schema defines webhook for receiving events from OpenMetadata.")
    @Valid
    private Webhook msTeams;
    /**
     * Webhook
     * <p>
     * This schema defines webhook for receiving events from OpenMetadata.
     * 
     */
    @JsonProperty("gChat")
    @JsonPropertyDescription("This schema defines webhook for receiving events from OpenMetadata.")
    @Valid
    private Webhook gChat;
    /**
     * Webhook
     * <p>
     * This schema defines webhook for receiving events from OpenMetadata.
     * 
     */
    @JsonProperty("generic")
    @JsonPropertyDescription("This schema defines webhook for receiving events from OpenMetadata.")
    @Valid
    private Webhook generic;

    /**
     * Webhook
     * <p>
     * This schema defines webhook for receiving events from OpenMetadata.
     * 
     */
    @JsonProperty("slack")
    public Webhook getSlack() {
        return slack;
    }

    /**
     * Webhook
     * <p>
     * This schema defines webhook for receiving events from OpenMetadata.
     * 
     */
    @JsonProperty("slack")
    public void setSlack(Webhook slack) {
        this.slack = slack;
    }

    public SubscriptionConfig withSlack(Webhook slack) {
        this.slack = slack;
        return this;
    }

    /**
     * Webhook
     * <p>
     * This schema defines webhook for receiving events from OpenMetadata.
     * 
     */
    @JsonProperty("msTeams")
    public Webhook getMsTeams() {
        return msTeams;
    }

    /**
     * Webhook
     * <p>
     * This schema defines webhook for receiving events from OpenMetadata.
     * 
     */
    @JsonProperty("msTeams")
    public void setMsTeams(Webhook msTeams) {
        this.msTeams = msTeams;
    }

    public SubscriptionConfig withMsTeams(Webhook msTeams) {
        this.msTeams = msTeams;
        return this;
    }

    /**
     * Webhook
     * <p>
     * This schema defines webhook for receiving events from OpenMetadata.
     * 
     */
    @JsonProperty("gChat")
    public Webhook getgChat() {
        return gChat;
    }

    /**
     * Webhook
     * <p>
     * This schema defines webhook for receiving events from OpenMetadata.
     * 
     */
    @JsonProperty("gChat")
    public void setgChat(Webhook gChat) {
        this.gChat = gChat;
    }

    public SubscriptionConfig withgChat(Webhook gChat) {
        this.gChat = gChat;
        return this;
    }

    /**
     * Webhook
     * <p>
     * This schema defines webhook for receiving events from OpenMetadata.
     * 
     */
    @JsonProperty("generic")
    public Webhook getGeneric() {
        return generic;
    }

    /**
     * Webhook
     * <p>
     * This schema defines webhook for receiving events from OpenMetadata.
     * 
     */
    @JsonProperty("generic")
    public void setGeneric(Webhook generic) {
        this.generic = generic;
    }

    public SubscriptionConfig withGeneric(Webhook generic) {
        this.generic = generic;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubscriptionConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("slack");
        sb.append('=');
        sb.append(((this.slack == null)?"<null>":this.slack));
        sb.append(',');
        sb.append("msTeams");
        sb.append('=');
        sb.append(((this.msTeams == null)?"<null>":this.msTeams));
        sb.append(',');
        sb.append("gChat");
        sb.append('=');
        sb.append(((this.gChat == null)?"<null>":this.gChat));
        sb.append(',');
        sb.append("generic");
        sb.append('=');
        sb.append(((this.generic == null)?"<null>":this.generic));
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
        result = ((result* 31)+((this.msTeams == null)? 0 :this.msTeams.hashCode()));
        result = ((result* 31)+((this.gChat == null)? 0 :this.gChat.hashCode()));
        result = ((result* 31)+((this.generic == null)? 0 :this.generic.hashCode()));
        result = ((result* 31)+((this.slack == null)? 0 :this.slack.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubscriptionConfig) == false) {
            return false;
        }
        SubscriptionConfig rhs = ((SubscriptionConfig) other);
        return (((((this.msTeams == rhs.msTeams)||((this.msTeams!= null)&&this.msTeams.equals(rhs.msTeams)))&&((this.gChat == rhs.gChat)||((this.gChat!= null)&&this.gChat.equals(rhs.gChat))))&&((this.generic == rhs.generic)||((this.generic!= null)&&this.generic.equals(rhs.generic))))&&((this.slack == rhs.slack)||((this.slack!= null)&&this.slack.equals(rhs.slack))));
    }

}
