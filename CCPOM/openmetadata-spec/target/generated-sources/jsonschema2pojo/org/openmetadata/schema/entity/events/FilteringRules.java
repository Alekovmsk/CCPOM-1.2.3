
package org.openmetadata.schema.entity.events;

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
 * Filtering Rules for Event Subscription.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resources",
    "rules"
})
@Generated("jsonschema2pojo")
public class FilteringRules {

    /**
     * Defines a list of resources that triggers the Event Subscription, Eg All, User, Teams etc.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("Defines a list of resources that triggers the Event Subscription, Eg All, User, Teams etc.")
    @Valid
    @NotNull
    private List<String> resources = new ArrayList<String>();
    /**
     * A set of filter rules associated with the Alert.
     * 
     */
    @JsonProperty("rules")
    @JsonPropertyDescription("A set of filter rules associated with the Alert.")
    @Valid
    private List<EventFilterRule> rules = new ArrayList<EventFilterRule>();

    /**
     * Defines a list of resources that triggers the Event Subscription, Eg All, User, Teams etc.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    public List<String> getResources() {
        return resources;
    }

    /**
     * Defines a list of resources that triggers the Event Subscription, Eg All, User, Teams etc.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public FilteringRules withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * A set of filter rules associated with the Alert.
     * 
     */
    @JsonProperty("rules")
    public List<EventFilterRule> getRules() {
        return rules;
    }

    /**
     * A set of filter rules associated with the Alert.
     * 
     */
    @JsonProperty("rules")
    public void setRules(List<EventFilterRule> rules) {
        this.rules = rules;
    }

    public FilteringRules withRules(List<EventFilterRule> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FilteringRules.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("resources");
        sb.append('=');
        sb.append(((this.resources == null)?"<null>":this.resources));
        sb.append(',');
        sb.append("rules");
        sb.append('=');
        sb.append(((this.rules == null)?"<null>":this.rules));
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
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        result = ((result* 31)+((this.rules == null)? 0 :this.rules.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FilteringRules) == false) {
            return false;
        }
        FilteringRules rhs = ((FilteringRules) other);
        return (((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources)))&&((this.rules == rhs.rules)||((this.rules!= null)&&this.rules.equals(rhs.rules))));
    }

}
