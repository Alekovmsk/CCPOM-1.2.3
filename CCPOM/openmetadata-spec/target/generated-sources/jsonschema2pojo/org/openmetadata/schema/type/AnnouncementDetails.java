
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Details about the announcement. This is only applicable if thread is of type announcement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "startTime",
    "endTime"
})
@Generated("jsonschema2pojo")
public class AnnouncementDetails {

    /**
     * Announcement description in Markdown format. See markdown support for more details.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Announcement description in Markdown format. See markdown support for more details.")
    private String description;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("startTime")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    @NotNull
    private Long startTime;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("endTime")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    @NotNull
    private Long endTime;

    /**
     * Announcement description in Markdown format. See markdown support for more details.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Announcement description in Markdown format. See markdown support for more details.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AnnouncementDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("startTime")
    public Long getStartTime() {
        return startTime;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("startTime")
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public AnnouncementDetails withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("endTime")
    public Long getEndTime() {
        return endTime;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public AnnouncementDetails withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnnouncementDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnnouncementDetails) == false) {
            return false;
        }
        AnnouncementDetails rhs = ((AnnouncementDetails) other);
        return ((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))));
    }

}
