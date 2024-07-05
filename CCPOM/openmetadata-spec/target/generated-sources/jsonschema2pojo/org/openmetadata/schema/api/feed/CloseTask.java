
package org.openmetadata.schema.api.feed;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CloseTaskRequest
 * <p>
 * Close Task request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "comment"
})
@Generated("jsonschema2pojo")
public class CloseTask {

    /**
     * The closing comment explaining why the task is being closed.
     * (Required)
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The closing comment explaining why the task is being closed.")
    @NotNull
    private String comment;

    /**
     * The closing comment explaining why the task is being closed.
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * The closing comment explaining why the task is being closed.
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public CloseTask withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CloseTask.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloseTask) == false) {
            return false;
        }
        CloseTask rhs = ((CloseTask) other);
        return ((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment)));
    }

}
