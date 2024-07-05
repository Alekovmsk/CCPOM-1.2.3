
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.profile.SubscriptionConfig;


/**
 * Profile
 * <p>
 * This schema defines the type for a profile of a user, team, or organization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "images",
    "subscription"
})
@Generated("jsonschema2pojo")
public class Profile {

    /**
     * Links to a list of images of varying resolutions/sizes.
     * 
     */
    @JsonProperty("images")
    @JsonPropertyDescription("Links to a list of images of varying resolutions/sizes.")
    @Valid
    private ImageList images;
    /**
     * Holds the Subscription Config for different types
     * 
     */
    @JsonProperty("subscription")
    @JsonPropertyDescription("Holds the Subscription Config for different types")
    @Valid
    private SubscriptionConfig subscription;

    /**
     * Links to a list of images of varying resolutions/sizes.
     * 
     */
    @JsonProperty("images")
    public ImageList getImages() {
        return images;
    }

    /**
     * Links to a list of images of varying resolutions/sizes.
     * 
     */
    @JsonProperty("images")
    public void setImages(ImageList images) {
        this.images = images;
    }

    public Profile withImages(ImageList images) {
        this.images = images;
        return this;
    }

    /**
     * Holds the Subscription Config for different types
     * 
     */
    @JsonProperty("subscription")
    public SubscriptionConfig getSubscription() {
        return subscription;
    }

    /**
     * Holds the Subscription Config for different types
     * 
     */
    @JsonProperty("subscription")
    public void setSubscription(SubscriptionConfig subscription) {
        this.subscription = subscription;
    }

    public Profile withSubscription(SubscriptionConfig subscription) {
        this.subscription = subscription;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Profile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        sb.append("subscription");
        sb.append('=');
        sb.append(((this.subscription == null)?"<null>":this.subscription));
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
        result = ((result* 31)+((this.images == null)? 0 :this.images.hashCode()));
        result = ((result* 31)+((this.subscription == null)? 0 :this.subscription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Profile) == false) {
            return false;
        }
        Profile rhs = ((Profile) other);
        return (((this.images == rhs.images)||((this.images!= null)&&this.images.equals(rhs.images)))&&((this.subscription == rhs.subscription)||((this.subscription!= null)&&this.subscription.equals(rhs.subscription))));
    }

}
