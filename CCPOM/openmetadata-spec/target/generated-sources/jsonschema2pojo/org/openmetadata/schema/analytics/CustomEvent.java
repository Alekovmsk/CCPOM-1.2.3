
package org.openmetadata.schema.analytics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * customData
 * <p>
 * Event tracker (e.g. clicks, etc.)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fullUrl",
    "url",
    "hostname",
    "sessionId",
    "eventType",
    "eventValue"
})
@Generated("jsonschema2pojo")
public class CustomEvent {

    /**
     * complete URL of the page
     * 
     */
    @JsonProperty("fullUrl")
    @JsonPropertyDescription("complete URL of the page")
    private String fullUrl;
    /**
     * url part after the domain specification
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("url part after the domain specification")
    private String url;
    /**
     * domain name
     * 
     */
    @JsonProperty("hostname")
    @JsonPropertyDescription("domain name")
    private String hostname;
    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("sessionId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID sessionId;
    /**
     * Type of events that can be performed
     * 
     */
    @JsonProperty("eventType")
    @JsonPropertyDescription("Type of events that can be performed")
    private CustomEvent.CustomEventTypes eventType;
    /**
     * Value of the event
     * 
     */
    @JsonProperty("eventValue")
    @JsonPropertyDescription("Value of the event")
    private String eventValue;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * complete URL of the page
     * 
     */
    @JsonProperty("fullUrl")
    public String getFullUrl() {
        return fullUrl;
    }

    /**
     * complete URL of the page
     * 
     */
    @JsonProperty("fullUrl")
    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public CustomEvent withFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
        return this;
    }

    /**
     * url part after the domain specification
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * url part after the domain specification
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public CustomEvent withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * domain name
     * 
     */
    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    /**
     * domain name
     * 
     */
    @JsonProperty("hostname")
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public CustomEvent withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("sessionId")
    public UUID getSessionId() {
        return sessionId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("sessionId")
    public void setSessionId(UUID sessionId) {
        this.sessionId = sessionId;
    }

    public CustomEvent withSessionId(UUID sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Type of events that can be performed
     * 
     */
    @JsonProperty("eventType")
    public CustomEvent.CustomEventTypes getEventType() {
        return eventType;
    }

    /**
     * Type of events that can be performed
     * 
     */
    @JsonProperty("eventType")
    public void setEventType(CustomEvent.CustomEventTypes eventType) {
        this.eventType = eventType;
    }

    public CustomEvent withEventType(CustomEvent.CustomEventTypes eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Value of the event
     * 
     */
    @JsonProperty("eventValue")
    public String getEventValue() {
        return eventValue;
    }

    /**
     * Value of the event
     * 
     */
    @JsonProperty("eventValue")
    public void setEventValue(String eventValue) {
        this.eventValue = eventValue;
    }

    public CustomEvent withEventValue(String eventValue) {
        this.eventValue = eventValue;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CustomEvent withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fullUrl");
        sb.append('=');
        sb.append(((this.fullUrl == null)?"<null>":this.fullUrl));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("hostname");
        sb.append('=');
        sb.append(((this.hostname == null)?"<null>":this.hostname));
        sb.append(',');
        sb.append("sessionId");
        sb.append('=');
        sb.append(((this.sessionId == null)?"<null>":this.sessionId));
        sb.append(',');
        sb.append("eventType");
        sb.append('=');
        sb.append(((this.eventType == null)?"<null>":this.eventType));
        sb.append(',');
        sb.append("eventValue");
        sb.append('=');
        sb.append(((this.eventValue == null)?"<null>":this.eventValue));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.hostname == null)? 0 :this.hostname.hashCode()));
        result = ((result* 31)+((this.eventValue == null)? 0 :this.eventValue.hashCode()));
        result = ((result* 31)+((this.fullUrl == null)? 0 :this.fullUrl.hashCode()));
        result = ((result* 31)+((this.sessionId == null)? 0 :this.sessionId.hashCode()));
        result = ((result* 31)+((this.eventType == null)? 0 :this.eventType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomEvent) == false) {
            return false;
        }
        CustomEvent rhs = ((CustomEvent) other);
        return ((((((((this.hostname == rhs.hostname)||((this.hostname!= null)&&this.hostname.equals(rhs.hostname)))&&((this.eventValue == rhs.eventValue)||((this.eventValue!= null)&&this.eventValue.equals(rhs.eventValue))))&&((this.fullUrl == rhs.fullUrl)||((this.fullUrl!= null)&&this.fullUrl.equals(rhs.fullUrl))))&&((this.sessionId == rhs.sessionId)||((this.sessionId!= null)&&this.sessionId.equals(rhs.sessionId))))&&((this.eventType == rhs.eventType)||((this.eventType!= null)&&this.eventType.equals(rhs.eventType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))));
    }


    /**
     * Type of events that can be performed
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CustomEventTypes {

        CLICK("CLICK");
        private final String value;
        private final static Map<String, CustomEvent.CustomEventTypes> CONSTANTS = new HashMap<String, CustomEvent.CustomEventTypes>();

        static {
            for (CustomEvent.CustomEventTypes c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CustomEventTypes(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CustomEvent.CustomEventTypes fromValue(String value) {
            CustomEvent.CustomEventTypes constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
