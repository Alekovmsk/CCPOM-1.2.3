
package org.openmetadata.schema.api.feed;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.api.CreateTaskDetails;
import org.openmetadata.schema.type.AnnouncementDetails;
import org.openmetadata.schema.type.ThreadType;


/**
 * CreateThreadRequest
 * <p>
 * Create thread request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "message",
    "from",
    "addressedTo",
    "about",
    "type",
    "taskDetails",
    "announcementDetails"
})
@Generated("jsonschema2pojo")
public class CreateThread {

    /**
     * Message
     * (Required)
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Message")
    @NotNull
    private String message;
    /**
     * Name of the User (regular user or bot) posting the message
     * (Required)
     * 
     */
    @JsonProperty("from")
    @JsonPropertyDescription("Name of the User (regular user or bot) posting the message")
    @NotNull
    private String from;
    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * 
     */
    @JsonProperty("addressedTo")
    @JsonPropertyDescription("Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.")
    @Pattern(regexp = "^(?U)<#E::\\w+::[\\w'\\- .&/:+\"\\\\()$#%]+>$")
    private String addressedTo;
    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * (Required)
     * 
     */
    @JsonProperty("about")
    @JsonPropertyDescription("Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.")
    @Pattern(regexp = "^(?U)<#E::\\w+::[\\w'\\- .&/:+\"\\\\()$#%]+>$")
    @NotNull
    private String about;
    /**
     * Type of thread.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of thread.")
    private ThreadType type = ThreadType.fromValue("Conversation");
    /**
     * Details about the task. This is only applicable if thread is of type task.
     * 
     */
    @JsonProperty("taskDetails")
    @JsonPropertyDescription("Details about the task. This is only applicable if thread is of type task.")
    @Valid
    private CreateTaskDetails taskDetails;
    /**
     * Details about the announcement. This is only applicable if thread is of type announcement.
     * 
     */
    @JsonProperty("announcementDetails")
    @JsonPropertyDescription("Details about the announcement. This is only applicable if thread is of type announcement.")
    @Valid
    private AnnouncementDetails announcementDetails;

    /**
     * Message
     * (Required)
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public CreateThread withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Name of the User (regular user or bot) posting the message
     * (Required)
     * 
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Name of the User (regular user or bot) posting the message
     * (Required)
     * 
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    public CreateThread withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * 
     */
    @JsonProperty("addressedTo")
    public String getAddressedTo() {
        return addressedTo;
    }

    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * 
     */
    @JsonProperty("addressedTo")
    public void setAddressedTo(String addressedTo) {
        this.addressedTo = addressedTo;
    }

    public CreateThread withAddressedTo(String addressedTo) {
        this.addressedTo = addressedTo;
        return this;
    }

    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * (Required)
     * 
     */
    @JsonProperty("about")
    public String getAbout() {
        return about;
    }

    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * (Required)
     * 
     */
    @JsonProperty("about")
    public void setAbout(String about) {
        this.about = about;
    }

    public CreateThread withAbout(String about) {
        this.about = about;
        return this;
    }

    /**
     * Type of thread.
     * 
     */
    @JsonProperty("type")
    public ThreadType getType() {
        return type;
    }

    /**
     * Type of thread.
     * 
     */
    @JsonProperty("type")
    public void setType(ThreadType type) {
        this.type = type;
    }

    public CreateThread withType(ThreadType type) {
        this.type = type;
        return this;
    }

    /**
     * Details about the task. This is only applicable if thread is of type task.
     * 
     */
    @JsonProperty("taskDetails")
    public CreateTaskDetails getTaskDetails() {
        return taskDetails;
    }

    /**
     * Details about the task. This is only applicable if thread is of type task.
     * 
     */
    @JsonProperty("taskDetails")
    public void setTaskDetails(CreateTaskDetails taskDetails) {
        this.taskDetails = taskDetails;
    }

    public CreateThread withTaskDetails(CreateTaskDetails taskDetails) {
        this.taskDetails = taskDetails;
        return this;
    }

    /**
     * Details about the announcement. This is only applicable if thread is of type announcement.
     * 
     */
    @JsonProperty("announcementDetails")
    public AnnouncementDetails getAnnouncementDetails() {
        return announcementDetails;
    }

    /**
     * Details about the announcement. This is only applicable if thread is of type announcement.
     * 
     */
    @JsonProperty("announcementDetails")
    public void setAnnouncementDetails(AnnouncementDetails announcementDetails) {
        this.announcementDetails = announcementDetails;
    }

    public CreateThread withAnnouncementDetails(AnnouncementDetails announcementDetails) {
        this.announcementDetails = announcementDetails;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateThread.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("addressedTo");
        sb.append('=');
        sb.append(((this.addressedTo == null)?"<null>":this.addressedTo));
        sb.append(',');
        sb.append("about");
        sb.append('=');
        sb.append(((this.about == null)?"<null>":this.about));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("taskDetails");
        sb.append('=');
        sb.append(((this.taskDetails == null)?"<null>":this.taskDetails));
        sb.append(',');
        sb.append("announcementDetails");
        sb.append('=');
        sb.append(((this.announcementDetails == null)?"<null>":this.announcementDetails));
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
        result = ((result* 31)+((this.addressedTo == null)? 0 :this.addressedTo.hashCode()));
        result = ((result* 31)+((this.announcementDetails == null)? 0 :this.announcementDetails.hashCode()));
        result = ((result* 31)+((this.about == null)? 0 :this.about.hashCode()));
        result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.taskDetails == null)? 0 :this.taskDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateThread) == false) {
            return false;
        }
        CreateThread rhs = ((CreateThread) other);
        return ((((((((this.addressedTo == rhs.addressedTo)||((this.addressedTo!= null)&&this.addressedTo.equals(rhs.addressedTo)))&&((this.announcementDetails == rhs.announcementDetails)||((this.announcementDetails!= null)&&this.announcementDetails.equals(rhs.announcementDetails))))&&((this.about == rhs.about)||((this.about!= null)&&this.about.equals(rhs.about))))&&((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.taskDetails == rhs.taskDetails)||((this.taskDetails!= null)&&this.taskDetails.equals(rhs.taskDetails))));
    }

}
