
package org.openmetadata.schema.analytics;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.analytics.type.WebAnalyticEventType;


/**
 * webAnalyticEventData
 * <p>
 * web analytics event data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "eventId",
    "timestamp",
    "eventType",
    "eventData"
})
@Generated("jsonschema2pojo")
public class WebAnalyticEventData {

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("eventId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID eventId;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * event type
     * (Required)
     * 
     */
    @JsonProperty("eventType")
    @JsonPropertyDescription("event type")
    @NotNull
    private WebAnalyticEventType eventType;
    /**
     * Web analytic data captured
     * 
     */
    @JsonProperty("eventData")
    @JsonPropertyDescription("Web analytic data captured")
    private Object eventData;

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("eventId")
    public UUID getEventId() {
        return eventId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("eventId")
    public void setEventId(UUID eventId) {
        this.eventId = eventId;
    }

    public WebAnalyticEventData withEventId(UUID eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public WebAnalyticEventData withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * event type
     * (Required)
     * 
     */
    @JsonProperty("eventType")
    public WebAnalyticEventType getEventType() {
        return eventType;
    }

    /**
     * event type
     * (Required)
     * 
     */
    @JsonProperty("eventType")
    public void setEventType(WebAnalyticEventType eventType) {
        this.eventType = eventType;
    }

    public WebAnalyticEventData withEventType(WebAnalyticEventType eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Web analytic data captured
     * 
     */
    @JsonProperty("eventData")
    public Object getEventData() {
        return eventData;
    }

    /**
     * Web analytic data captured
     * 
     */
    @JsonProperty("eventData")
    public void setEventData(Object eventData) {
        this.eventData = eventData;
    }

    public WebAnalyticEventData withEventData(Object eventData) {
        this.eventData = eventData;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WebAnalyticEventData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("eventId");
        sb.append('=');
        sb.append(((this.eventId == null)?"<null>":this.eventId));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("eventType");
        sb.append('=');
        sb.append(((this.eventType == null)?"<null>":this.eventType));
        sb.append(',');
        sb.append("eventData");
        sb.append('=');
        sb.append(((this.eventData == null)?"<null>":this.eventData));
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
        result = ((result* 31)+((this.eventId == null)? 0 :this.eventId.hashCode()));
        result = ((result* 31)+((this.eventType == null)? 0 :this.eventType.hashCode()));
        result = ((result* 31)+((this.eventData == null)? 0 :this.eventData.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebAnalyticEventData) == false) {
            return false;
        }
        WebAnalyticEventData rhs = ((WebAnalyticEventData) other);
        return (((((this.eventId == rhs.eventId)||((this.eventId!= null)&&this.eventId.equals(rhs.eventId)))&&((this.eventType == rhs.eventType)||((this.eventType!= null)&&this.eventType.equals(rhs.eventType))))&&((this.eventData == rhs.eventData)||((this.eventData!= null)&&this.eventData.equals(rhs.eventData))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
