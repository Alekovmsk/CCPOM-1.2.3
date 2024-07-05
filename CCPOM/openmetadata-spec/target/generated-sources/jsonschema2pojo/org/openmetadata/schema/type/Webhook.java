
package org.openmetadata.schema.type;

import java.net.URI;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.SubscriptionAction;


/**
 * Webhook
 * <p>
 * This schema defines webhook for receiving events from OpenMetadata.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "endpoint",
    "secretKey",
    "sendToAdmins",
    "sendToOwners",
    "sendToFollowers"
})
@Generated("jsonschema2pojo")
public class Webhook implements SubscriptionAction
{

    /**
     * Endpoint to receive the webhook events over POST requests.
     * 
     */
    @JsonProperty("endpoint")
    @JsonPropertyDescription("Endpoint to receive the webhook events over POST requests.")
    private URI endpoint;
    /**
     * Secret set by the webhook client used for computing HMAC SHA256 signature of webhook payload and sent in `X-OM-Signature` header in POST requests to publish the events.
     * 
     */
    @JsonProperty("secretKey")
    @JsonPropertyDescription("Secret set by the webhook client used for computing HMAC SHA256 signature of webhook payload and sent in `X-OM-Signature` header in POST requests to publish the events.")
    private String secretKey;
    /**
     * Send the Event to Admins
     * 
     */
    @JsonProperty("sendToAdmins")
    @JsonPropertyDescription("Send the Event to Admins")
    private Boolean sendToAdmins = false;
    /**
     * Send the Event to Owners
     * 
     */
    @JsonProperty("sendToOwners")
    @JsonPropertyDescription("Send the Event to Owners")
    private Boolean sendToOwners = false;
    /**
     * Send the Event to Followers
     * 
     */
    @JsonProperty("sendToFollowers")
    @JsonPropertyDescription("Send the Event to Followers")
    private Boolean sendToFollowers = false;

    /**
     * Endpoint to receive the webhook events over POST requests.
     * 
     */
    @JsonProperty("endpoint")
    public URI getEndpoint() {
        return endpoint;
    }

    /**
     * Endpoint to receive the webhook events over POST requests.
     * 
     */
    @JsonProperty("endpoint")
    public void setEndpoint(URI endpoint) {
        this.endpoint = endpoint;
    }

    public Webhook withEndpoint(URI endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Secret set by the webhook client used for computing HMAC SHA256 signature of webhook payload and sent in `X-OM-Signature` header in POST requests to publish the events.
     * 
     */
    @JsonProperty("secretKey")
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * Secret set by the webhook client used for computing HMAC SHA256 signature of webhook payload and sent in `X-OM-Signature` header in POST requests to publish the events.
     * 
     */
    @JsonProperty("secretKey")
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Webhook withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Send the Event to Admins
     * 
     */
    @JsonProperty("sendToAdmins")
    public Boolean getSendToAdmins() {
        return sendToAdmins;
    }

    /**
     * Send the Event to Admins
     * 
     */
    @JsonProperty("sendToAdmins")
    public void setSendToAdmins(Boolean sendToAdmins) {
        this.sendToAdmins = sendToAdmins;
    }

    public Webhook withSendToAdmins(Boolean sendToAdmins) {
        this.sendToAdmins = sendToAdmins;
        return this;
    }

    /**
     * Send the Event to Owners
     * 
     */
    @JsonProperty("sendToOwners")
    public Boolean getSendToOwners() {
        return sendToOwners;
    }

    /**
     * Send the Event to Owners
     * 
     */
    @JsonProperty("sendToOwners")
    public void setSendToOwners(Boolean sendToOwners) {
        this.sendToOwners = sendToOwners;
    }

    public Webhook withSendToOwners(Boolean sendToOwners) {
        this.sendToOwners = sendToOwners;
        return this;
    }

    /**
     * Send the Event to Followers
     * 
     */
    @JsonProperty("sendToFollowers")
    public Boolean getSendToFollowers() {
        return sendToFollowers;
    }

    /**
     * Send the Event to Followers
     * 
     */
    @JsonProperty("sendToFollowers")
    public void setSendToFollowers(Boolean sendToFollowers) {
        this.sendToFollowers = sendToFollowers;
    }

    public Webhook withSendToFollowers(Boolean sendToFollowers) {
        this.sendToFollowers = sendToFollowers;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Webhook.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null)?"<null>":this.endpoint));
        sb.append(',');
        sb.append("secretKey");
        sb.append('=');
        sb.append(((this.secretKey == null)?"<null>":this.secretKey));
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
        result = ((result* 31)+((this.endpoint == null)? 0 :this.endpoint.hashCode()));
        result = ((result* 31)+((this.secretKey == null)? 0 :this.secretKey.hashCode()));
        result = ((result* 31)+((this.sendToOwners == null)? 0 :this.sendToOwners.hashCode()));
        result = ((result* 31)+((this.sendToFollowers == null)? 0 :this.sendToFollowers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Webhook) == false) {
            return false;
        }
        Webhook rhs = ((Webhook) other);
        return ((((((this.sendToAdmins == rhs.sendToAdmins)||((this.sendToAdmins!= null)&&this.sendToAdmins.equals(rhs.sendToAdmins)))&&((this.endpoint == rhs.endpoint)||((this.endpoint!= null)&&this.endpoint.equals(rhs.endpoint))))&&((this.secretKey == rhs.secretKey)||((this.secretKey!= null)&&this.secretKey.equals(rhs.secretKey))))&&((this.sendToOwners == rhs.sendToOwners)||((this.sendToOwners!= null)&&this.sendToOwners.equals(rhs.sendToOwners))))&&((this.sendToFollowers == rhs.sendToFollowers)||((this.sendToFollowers!= null)&&this.sendToFollowers.equals(rhs.sendToFollowers))));
    }

}
