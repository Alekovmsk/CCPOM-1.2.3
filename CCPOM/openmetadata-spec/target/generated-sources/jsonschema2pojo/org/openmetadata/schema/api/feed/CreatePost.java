
package org.openmetadata.schema.api.feed;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreatePostRequest
 * <p>
 * Create post request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "message",
    "from"
})
@Generated("jsonschema2pojo")
public class CreatePost {

    /**
     * Message in Markdown format. See markdown support for more details.
     * (Required)
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Message in Markdown format. See markdown support for more details.")
    @NotNull
    private String message;
    /**
     * Name of the User posting the message
     * (Required)
     * 
     */
    @JsonProperty("from")
    @JsonPropertyDescription("Name of the User posting the message")
    @NotNull
    private String from;

    /**
     * Message in Markdown format. See markdown support for more details.
     * (Required)
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message in Markdown format. See markdown support for more details.
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public CreatePost withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Name of the User posting the message
     * (Required)
     * 
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Name of the User posting the message
     * (Required)
     * 
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    public CreatePost withFrom(String from) {
        this.from = from;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreatePost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
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
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreatePost) == false) {
            return false;
        }
        CreatePost rhs = ((CreatePost) other);
        return (((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message)))&&((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from))));
    }

}
