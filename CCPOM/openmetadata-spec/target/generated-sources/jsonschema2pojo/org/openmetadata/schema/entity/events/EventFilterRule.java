
package org.openmetadata.schema.entity.events;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * EventFilterRule
 * <p>
 * Describes an Event Filter Rule
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "fullyQualifiedName",
    "description",
    "effect",
    "condition"
})
@Generated("jsonschema2pojo")
public class EventFilterRule {

    /**
     * Name of this Event Filter.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of this Event Filter.")
    private String name;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("effect")
    @NotNull
    private EventFilterRule.Effect effect;
    /**
     * Expression in SpEL.
     * (Required)
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("Expression in SpEL.")
    @NotNull
    private String condition;

    /**
     * Name of this Event Filter.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of this Event Filter.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public EventFilterRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public EventFilterRule withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public EventFilterRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("effect")
    public EventFilterRule.Effect getEffect() {
        return effect;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("effect")
    public void setEffect(EventFilterRule.Effect effect) {
        this.effect = effect;
    }

    public EventFilterRule withEffect(EventFilterRule.Effect effect) {
        this.effect = effect;
        return this;
    }

    /**
     * Expression in SpEL.
     * (Required)
     * 
     */
    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    /**
     * Expression in SpEL.
     * (Required)
     * 
     */
    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public EventFilterRule withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EventFilterRule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("effect");
        sb.append('=');
        sb.append(((this.effect == null)?"<null>":this.effect));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.effect == null)? 0 :this.effect.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventFilterRule) == false) {
            return false;
        }
        EventFilterRule rhs = ((EventFilterRule) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.effect == rhs.effect)||((this.effect!= null)&&this.effect.equals(rhs.effect))));
    }

    @Generated("jsonschema2pojo")
    public enum Effect {

        INCLUDE("include"),
        EXCLUDE("exclude");
        private final String value;
        private final static Map<String, EventFilterRule.Effect> CONSTANTS = new HashMap<String, EventFilterRule.Effect>();

        static {
            for (EventFilterRule.Effect c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Effect(String value) {
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
        public static EventFilterRule.Effect fromValue(String value) {
            EventFilterRule.Effect constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
