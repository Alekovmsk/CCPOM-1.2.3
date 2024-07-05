
package org.openmetadata.schema.api.configuration.events;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EventHandlerConfiguration
 * <p>
 * This schema defines the Event Handler Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "eventHandlerClassNames"
})
@Generated("jsonschema2pojo")
public class EventHandlerConfiguration {

    /**
     * Event Handler Class Names
     * (Required)
     * 
     */
    @JsonProperty("eventHandlerClassNames")
    @JsonPropertyDescription("Event Handler Class Names")
    @Valid
    @NotNull
    private List<String> eventHandlerClassNames = new ArrayList<String>();

    /**
     * Event Handler Class Names
     * (Required)
     * 
     */
    @JsonProperty("eventHandlerClassNames")
    public List<String> getEventHandlerClassNames() {
        return eventHandlerClassNames;
    }

    /**
     * Event Handler Class Names
     * (Required)
     * 
     */
    @JsonProperty("eventHandlerClassNames")
    public void setEventHandlerClassNames(List<String> eventHandlerClassNames) {
        this.eventHandlerClassNames = eventHandlerClassNames;
    }

    public EventHandlerConfiguration withEventHandlerClassNames(List<String> eventHandlerClassNames) {
        this.eventHandlerClassNames = eventHandlerClassNames;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EventHandlerConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("eventHandlerClassNames");
        sb.append('=');
        sb.append(((this.eventHandlerClassNames == null)?"<null>":this.eventHandlerClassNames));
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
        result = ((result* 31)+((this.eventHandlerClassNames == null)? 0 :this.eventHandlerClassNames.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventHandlerConfiguration) == false) {
            return false;
        }
        EventHandlerConfiguration rhs = ((EventHandlerConfiguration) other);
        return ((this.eventHandlerClassNames == rhs.eventHandlerClassNames)||((this.eventHandlerClassNames!= null)&&this.eventHandlerClassNames.equals(rhs.eventHandlerClassNames)));
    }

}
