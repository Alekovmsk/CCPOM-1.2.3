
package org.openmetadata.schema.type;

import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Post within a feed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "message",
    "postTs",
    "from",
    "reactions"
})
@Generated("jsonschema2pojo")
public class Post {

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    @NotNull
    private UUID id;
    /**
     * Message in Markdown format. See Markdown support for more details.
     * (Required)
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Message in Markdown format. See Markdown support for more details.")
    @NotNull
    private String message;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("postTs")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long postTs;
    /**
     * Name of the User posting the message.
     * (Required)
     * 
     */
    @JsonProperty("from")
    @JsonPropertyDescription("Name of the User posting the message.")
    @NotNull
    private String from;
    @JsonProperty("reactions")
    @Valid
    private List<Reaction> reactions = null;

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    public Post withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Message in Markdown format. See Markdown support for more details.
     * (Required)
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message in Markdown format. See Markdown support for more details.
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Post withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("postTs")
    public Long getPostTs() {
        return postTs;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("postTs")
    public void setPostTs(Long postTs) {
        this.postTs = postTs;
    }

    public Post withPostTs(Long postTs) {
        this.postTs = postTs;
        return this;
    }

    /**
     * Name of the User posting the message.
     * (Required)
     * 
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Name of the User posting the message.
     * (Required)
     * 
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    public Post withFrom(String from) {
        this.from = from;
        return this;
    }

    @JsonProperty("reactions")
    public List<Reaction> getReactions() {
        return reactions;
    }

    @JsonProperty("reactions")
    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    public Post withReactions(List<Reaction> reactions) {
        this.reactions = reactions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Post.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("postTs");
        sb.append('=');
        sb.append(((this.postTs == null)?"<null>":this.postTs));
        sb.append(',');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("reactions");
        sb.append('=');
        sb.append(((this.reactions == null)?"<null>":this.reactions));
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
        result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
        result = ((result* 31)+((this.reactions == null)? 0 :this.reactions.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.postTs == null)? 0 :this.postTs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Post) == false) {
            return false;
        }
        Post rhs = ((Post) other);
        return ((((((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from)))&&((this.reactions == rhs.reactions)||((this.reactions!= null)&&this.reactions.equals(rhs.reactions))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.postTs == rhs.postTs)||((this.postTs!= null)&&this.postTs.equals(rhs.postTs))));
    }

}
