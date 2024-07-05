
package org.openmetadata.schema.entity.feed;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.AnnouncementDetails;
import org.openmetadata.schema.type.Post;
import org.openmetadata.schema.type.Reaction;
import org.openmetadata.schema.type.TaskDetails;
import org.openmetadata.schema.type.ThreadType;


/**
 * Thread
 * <p>
 * This schema defines the Thread entity. A Thread is a collection of posts made by the users. The first post that starts a thread is **about** a data asset **from** a user. Other users can respond to this post by creating new posts in the thread. Note that bot users can also interact with a thread. A post can contains links that mention Users or other Data Assets.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "href",
    "threadTs",
    "about",
    "entityId",
    "addressedTo",
    "createdBy",
    "updatedAt",
    "updatedBy",
    "resolved",
    "message",
    "postsCount",
    "posts",
    "reactions",
    "task",
    "announcement"
})
@Generated("jsonschema2pojo")
public class Thread {

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
     * Type of thread.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of thread.")
    private ThreadType type = ThreadType.fromValue("Conversation");
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("threadTs")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long threadTs;
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
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("entityId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID entityId;
    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * 
     */
    @JsonProperty("addressedTo")
    @JsonPropertyDescription("Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.")
    @Pattern(regexp = "^(?U)<#E::\\w+::[\\w'\\- .&/:+\"\\\\()$#%]+>$")
    private String addressedTo;
    /**
     * User who created the thread.
     * 
     */
    @JsonProperty("createdBy")
    @JsonPropertyDescription("User who created the thread.")
    private String createdBy;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long updatedAt;
    /**
     * User who made the update.
     * 
     */
    @JsonProperty("updatedBy")
    @JsonPropertyDescription("User who made the update.")
    private String updatedBy;
    /**
     * When `true` indicates the thread has been resolved.
     * 
     */
    @JsonProperty("resolved")
    @JsonPropertyDescription("When `true` indicates the thread has been resolved.")
    private Boolean resolved = false;
    /**
     * The main message of the thread in Markdown format.
     * (Required)
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("The main message of the thread in Markdown format.")
    @NotNull
    private String message;
    /**
     * The total count of posts in the thread.
     * 
     */
    @JsonProperty("postsCount")
    @JsonPropertyDescription("The total count of posts in the thread.")
    private Integer postsCount = 0;
    @JsonProperty("posts")
    @Valid
    private List<Post> posts = new ArrayList<Post>();
    @JsonProperty("reactions")
    @Valid
    private List<Reaction> reactions = null;
    /**
     * Details about the task. This is only applicable if thread is of type task.
     * 
     */
    @JsonProperty("task")
    @JsonPropertyDescription("Details about the task. This is only applicable if thread is of type task.")
    @Valid
    private TaskDetails task;
    /**
     * Details about the announcement. This is only applicable if thread is of type announcement.
     * 
     */
    @JsonProperty("announcement")
    @JsonPropertyDescription("Details about the announcement. This is only applicable if thread is of type announcement.")
    @Valid
    private AnnouncementDetails announcement;

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

    public Thread withId(UUID id) {
        this.id = id;
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

    public Thread withType(ThreadType type) {
        this.type = type;
        return this;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    public URI getHref() {
        return href;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    public void setHref(URI href) {
        this.href = href;
    }

    public Thread withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("threadTs")
    public Long getThreadTs() {
        return threadTs;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("threadTs")
    public void setThreadTs(Long threadTs) {
        this.threadTs = threadTs;
    }

    public Thread withThreadTs(Long threadTs) {
        this.threadTs = threadTs;
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

    public Thread withAbout(String about) {
        this.about = about;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("entityId")
    public UUID getEntityId() {
        return entityId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("entityId")
    public void setEntityId(UUID entityId) {
        this.entityId = entityId;
    }

    public Thread withEntityId(UUID entityId) {
        this.entityId = entityId;
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

    public Thread withAddressedTo(String addressedTo) {
        this.addressedTo = addressedTo;
        return this;
    }

    /**
     * User who created the thread.
     * 
     */
    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * User who created the thread.
     * 
     */
    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Thread withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    public Long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Thread withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * User who made the update.
     * 
     */
    @JsonProperty("updatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * User who made the update.
     * 
     */
    @JsonProperty("updatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Thread withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * When `true` indicates the thread has been resolved.
     * 
     */
    @JsonProperty("resolved")
    public Boolean getResolved() {
        return resolved;
    }

    /**
     * When `true` indicates the thread has been resolved.
     * 
     */
    @JsonProperty("resolved")
    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }

    public Thread withResolved(Boolean resolved) {
        this.resolved = resolved;
        return this;
    }

    /**
     * The main message of the thread in Markdown format.
     * (Required)
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * The main message of the thread in Markdown format.
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Thread withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * The total count of posts in the thread.
     * 
     */
    @JsonProperty("postsCount")
    public Integer getPostsCount() {
        return postsCount;
    }

    /**
     * The total count of posts in the thread.
     * 
     */
    @JsonProperty("postsCount")
    public void setPostsCount(Integer postsCount) {
        this.postsCount = postsCount;
    }

    public Thread withPostsCount(Integer postsCount) {
        this.postsCount = postsCount;
        return this;
    }

    @JsonProperty("posts")
    public List<Post> getPosts() {
        return posts;
    }

    @JsonProperty("posts")
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Thread withPosts(List<Post> posts) {
        this.posts = posts;
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

    public Thread withReactions(List<Reaction> reactions) {
        this.reactions = reactions;
        return this;
    }

    /**
     * Details about the task. This is only applicable if thread is of type task.
     * 
     */
    @JsonProperty("task")
    public TaskDetails getTask() {
        return task;
    }

    /**
     * Details about the task. This is only applicable if thread is of type task.
     * 
     */
    @JsonProperty("task")
    public void setTask(TaskDetails task) {
        this.task = task;
    }

    public Thread withTask(TaskDetails task) {
        this.task = task;
        return this;
    }

    /**
     * Details about the announcement. This is only applicable if thread is of type announcement.
     * 
     */
    @JsonProperty("announcement")
    public AnnouncementDetails getAnnouncement() {
        return announcement;
    }

    /**
     * Details about the announcement. This is only applicable if thread is of type announcement.
     * 
     */
    @JsonProperty("announcement")
    public void setAnnouncement(AnnouncementDetails announcement) {
        this.announcement = announcement;
    }

    public Thread withAnnouncement(AnnouncementDetails announcement) {
        this.announcement = announcement;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Thread.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("threadTs");
        sb.append('=');
        sb.append(((this.threadTs == null)?"<null>":this.threadTs));
        sb.append(',');
        sb.append("about");
        sb.append('=');
        sb.append(((this.about == null)?"<null>":this.about));
        sb.append(',');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("addressedTo");
        sb.append('=');
        sb.append(((this.addressedTo == null)?"<null>":this.addressedTo));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
        sb.append(',');
        sb.append("resolved");
        sb.append('=');
        sb.append(((this.resolved == null)?"<null>":this.resolved));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("postsCount");
        sb.append('=');
        sb.append(((this.postsCount == null)?"<null>":this.postsCount));
        sb.append(',');
        sb.append("posts");
        sb.append('=');
        sb.append(((this.posts == null)?"<null>":this.posts));
        sb.append(',');
        sb.append("reactions");
        sb.append('=');
        sb.append(((this.reactions == null)?"<null>":this.reactions));
        sb.append(',');
        sb.append("task");
        sb.append('=');
        sb.append(((this.task == null)?"<null>":this.task));
        sb.append(',');
        sb.append("announcement");
        sb.append('=');
        sb.append(((this.announcement == null)?"<null>":this.announcement));
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
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.about == null)? 0 :this.about.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.posts == null)? 0 :this.posts.hashCode()));
        result = ((result* 31)+((this.task == null)? 0 :this.task.hashCode()));
        result = ((result* 31)+((this.createdBy == null)? 0 :this.createdBy.hashCode()));
        result = ((result* 31)+((this.postsCount == null)? 0 :this.postsCount.hashCode()));
        result = ((result* 31)+((this.reactions == null)? 0 :this.reactions.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.threadTs == null)? 0 :this.threadTs.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.resolved == null)? 0 :this.resolved.hashCode()));
        result = ((result* 31)+((this.announcement == null)? 0 :this.announcement.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Thread) == false) {
            return false;
        }
        Thread rhs = ((Thread) other);
        return ((((((((((((((((((this.addressedTo == rhs.addressedTo)||((this.addressedTo!= null)&&this.addressedTo.equals(rhs.addressedTo)))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.about == rhs.about)||((this.about!= null)&&this.about.equals(rhs.about))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.posts == rhs.posts)||((this.posts!= null)&&this.posts.equals(rhs.posts))))&&((this.task == rhs.task)||((this.task!= null)&&this.task.equals(rhs.task))))&&((this.createdBy == rhs.createdBy)||((this.createdBy!= null)&&this.createdBy.equals(rhs.createdBy))))&&((this.postsCount == rhs.postsCount)||((this.postsCount!= null)&&this.postsCount.equals(rhs.postsCount))))&&((this.reactions == rhs.reactions)||((this.reactions!= null)&&this.reactions.equals(rhs.reactions))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.threadTs == rhs.threadTs)||((this.threadTs!= null)&&this.threadTs.equals(rhs.threadTs))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.resolved == rhs.resolved)||((this.resolved!= null)&&this.resolved.equals(rhs.resolved))))&&((this.announcement == rhs.announcement)||((this.announcement!= null)&&this.announcement.equals(rhs.announcement))));
    }

}
