
package org.openmetadata.schema.api.events;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.entity.events.FilteringRules;
import org.openmetadata.schema.entity.events.TriggerConfig;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;


/**
 * CreateEventSubscription
 * <p>
 * This defines schema for sending alerts for OpenMetadata
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "owner",
    "enabled",
    "batchSize",
    "timeout",
    "readTimeout",
    "alertType",
    "trigger",
    "filteringRules",
    "subscriptionType",
    "subscriptionConfig",
    "provider"
})
@Generated("jsonschema2pojo")
public class CreateEventSubscription implements CreateEntity
{

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()%]+$")
    @Size(min = 1, max = 128)
    @NotNull
    private String name;
    /**
     * Display name for this Alert.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display name for this Alert.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference owner;
    /**
     * Is the alert enabled.
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("Is the alert enabled.")
    private Boolean enabled = true;
    /**
     * Maximum number of events sent in a batch (Default 10).
     * 
     */
    @JsonProperty("batchSize")
    @JsonPropertyDescription("Maximum number of events sent in a batch (Default 10).")
    private Integer batchSize = 10;
    /**
     * Connection timeout in seconds. (Default 10s).
     * 
     */
    @JsonProperty("timeout")
    @JsonPropertyDescription("Connection timeout in seconds. (Default 10s).")
    private Integer timeout = 10;
    /**
     * Read timeout in seconds. (Default 12s).
     * 
     */
    @JsonProperty("readTimeout")
    @JsonPropertyDescription("Read timeout in seconds. (Default 12s).")
    private Integer readTimeout = 12;
    /**
     * Type of Alerts supported.
     * (Required)
     * 
     */
    @JsonProperty("alertType")
    @JsonPropertyDescription("Type of Alerts supported.")
    @NotNull
    private CreateEventSubscription.AlertType alertType = CreateEventSubscription.AlertType.fromValue("ChangeEvent");
    /**
     * Trigger Configuration for Alerts.
     * 
     */
    @JsonProperty("trigger")
    @JsonPropertyDescription("Trigger Configuration for Alerts.")
    @Valid
    private TriggerConfig trigger;
    /**
     * Filtering Rules for Event Subscription.
     * 
     */
    @JsonProperty("filteringRules")
    @JsonPropertyDescription("Filtering Rules for Event Subscription.")
    @Valid
    private FilteringRules filteringRules;
    /**
     * Subscription Endpoint Type.
     * (Required)
     * 
     */
    @JsonProperty("subscriptionType")
    @JsonPropertyDescription("Subscription Endpoint Type.")
    @NotNull
    private CreateEventSubscription.SubscriptionType subscriptionType;
    @JsonProperty("subscriptionConfig")
    private Object subscriptionConfig;
    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.")
    private ProviderType provider = ProviderType.fromValue("user");

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreateEventSubscription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display name for this Alert.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display name for this Alert.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateEventSubscription withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public CreateEventSubscription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    public EntityReference getOwner() {
        return owner;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    public void setOwner(EntityReference owner) {
        this.owner = owner;
    }

    public CreateEventSubscription withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Is the alert enabled.
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Is the alert enabled.
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CreateEventSubscription withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Maximum number of events sent in a batch (Default 10).
     * 
     */
    @JsonProperty("batchSize")
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Maximum number of events sent in a batch (Default 10).
     * 
     */
    @JsonProperty("batchSize")
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public CreateEventSubscription withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Connection timeout in seconds. (Default 10s).
     * 
     */
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Connection timeout in seconds. (Default 10s).
     * 
     */
    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public CreateEventSubscription withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Read timeout in seconds. (Default 12s).
     * 
     */
    @JsonProperty("readTimeout")
    public Integer getReadTimeout() {
        return readTimeout;
    }

    /**
     * Read timeout in seconds. (Default 12s).
     * 
     */
    @JsonProperty("readTimeout")
    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public CreateEventSubscription withReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    /**
     * Type of Alerts supported.
     * (Required)
     * 
     */
    @JsonProperty("alertType")
    public CreateEventSubscription.AlertType getAlertType() {
        return alertType;
    }

    /**
     * Type of Alerts supported.
     * (Required)
     * 
     */
    @JsonProperty("alertType")
    public void setAlertType(CreateEventSubscription.AlertType alertType) {
        this.alertType = alertType;
    }

    public CreateEventSubscription withAlertType(CreateEventSubscription.AlertType alertType) {
        this.alertType = alertType;
        return this;
    }

    /**
     * Trigger Configuration for Alerts.
     * 
     */
    @JsonProperty("trigger")
    public TriggerConfig getTrigger() {
        return trigger;
    }

    /**
     * Trigger Configuration for Alerts.
     * 
     */
    @JsonProperty("trigger")
    public void setTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
    }

    public CreateEventSubscription withTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Filtering Rules for Event Subscription.
     * 
     */
    @JsonProperty("filteringRules")
    public FilteringRules getFilteringRules() {
        return filteringRules;
    }

    /**
     * Filtering Rules for Event Subscription.
     * 
     */
    @JsonProperty("filteringRules")
    public void setFilteringRules(FilteringRules filteringRules) {
        this.filteringRules = filteringRules;
    }

    public CreateEventSubscription withFilteringRules(FilteringRules filteringRules) {
        this.filteringRules = filteringRules;
        return this;
    }

    /**
     * Subscription Endpoint Type.
     * (Required)
     * 
     */
    @JsonProperty("subscriptionType")
    public CreateEventSubscription.SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * Subscription Endpoint Type.
     * (Required)
     * 
     */
    @JsonProperty("subscriptionType")
    public void setSubscriptionType(CreateEventSubscription.SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public CreateEventSubscription withSubscriptionType(CreateEventSubscription.SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    @JsonProperty("subscriptionConfig")
    public Object getSubscriptionConfig() {
        return subscriptionConfig;
    }

    @JsonProperty("subscriptionConfig")
    public void setSubscriptionConfig(Object subscriptionConfig) {
        this.subscriptionConfig = subscriptionConfig;
    }

    public CreateEventSubscription withSubscriptionConfig(Object subscriptionConfig) {
        this.subscriptionConfig = subscriptionConfig;
        return this;
    }

    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    public ProviderType getProvider() {
        return provider;
    }

    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    public void setProvider(ProviderType provider) {
        this.provider = provider;
    }

    public CreateEventSubscription withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateEventSubscription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("batchSize");
        sb.append('=');
        sb.append(((this.batchSize == null)?"<null>":this.batchSize));
        sb.append(',');
        sb.append("timeout");
        sb.append('=');
        sb.append(((this.timeout == null)?"<null>":this.timeout));
        sb.append(',');
        sb.append("readTimeout");
        sb.append('=');
        sb.append(((this.readTimeout == null)?"<null>":this.readTimeout));
        sb.append(',');
        sb.append("alertType");
        sb.append('=');
        sb.append(((this.alertType == null)?"<null>":this.alertType));
        sb.append(',');
        sb.append("trigger");
        sb.append('=');
        sb.append(((this.trigger == null)?"<null>":this.trigger));
        sb.append(',');
        sb.append("filteringRules");
        sb.append('=');
        sb.append(((this.filteringRules == null)?"<null>":this.filteringRules));
        sb.append(',');
        sb.append("subscriptionType");
        sb.append('=');
        sb.append(((this.subscriptionType == null)?"<null>":this.subscriptionType));
        sb.append(',');
        sb.append("subscriptionConfig");
        sb.append('=');
        sb.append(((this.subscriptionConfig == null)?"<null>":this.subscriptionConfig));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.alertType == null)? 0 :this.alertType.hashCode()));
        result = ((result* 31)+((this.filteringRules == null)? 0 :this.filteringRules.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.trigger == null)? 0 :this.trigger.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        result = ((result* 31)+((this.timeout == null)? 0 :this.timeout.hashCode()));
        result = ((result* 31)+((this.subscriptionType == null)? 0 :this.subscriptionType.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.readTimeout == null)? 0 :this.readTimeout.hashCode()));
        result = ((result* 31)+((this.subscriptionConfig == null)? 0 :this.subscriptionConfig.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.batchSize == null)? 0 :this.batchSize.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateEventSubscription) == false) {
            return false;
        }
        CreateEventSubscription rhs = ((CreateEventSubscription) other);
        return (((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.alertType == rhs.alertType)||((this.alertType!= null)&&this.alertType.equals(rhs.alertType))))&&((this.filteringRules == rhs.filteringRules)||((this.filteringRules!= null)&&this.filteringRules.equals(rhs.filteringRules))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.trigger == rhs.trigger)||((this.trigger!= null)&&this.trigger.equals(rhs.trigger))))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))))&&((this.timeout == rhs.timeout)||((this.timeout!= null)&&this.timeout.equals(rhs.timeout))))&&((this.subscriptionType == rhs.subscriptionType)||((this.subscriptionType!= null)&&this.subscriptionType.equals(rhs.subscriptionType))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.readTimeout == rhs.readTimeout)||((this.readTimeout!= null)&&this.readTimeout.equals(rhs.readTimeout))))&&((this.subscriptionConfig == rhs.subscriptionConfig)||((this.subscriptionConfig!= null)&&this.subscriptionConfig.equals(rhs.subscriptionConfig))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.batchSize == rhs.batchSize)||((this.batchSize!= null)&&this.batchSize.equals(rhs.batchSize))));
    }


    /**
     * Type of Alerts supported.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AlertType {

        CHANGE_EVENT("ChangeEvent"),
        DATA_INSIGHT_REPORT("DataInsightReport"),
        TASK_CONVERSATION_ANNOUNCEMENT("Task/Conversation/Announcement");
        private final String value;
        private final static Map<String, CreateEventSubscription.AlertType> CONSTANTS = new HashMap<String, CreateEventSubscription.AlertType>();

        static {
            for (CreateEventSubscription.AlertType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AlertType(String value) {
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
        public static CreateEventSubscription.AlertType fromValue(String value) {
            CreateEventSubscription.AlertType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Subscription Endpoint Type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SubscriptionType {

        GENERIC_WEBHOOK("GenericWebhook"),
        SLACK_WEBHOOK("SlackWebhook"),
        MS_TEAMS_WEBHOOK("MsTeamsWebhook"),
        G_CHAT_WEBHOOK("GChatWebhook"),
        EMAIL("Email"),
        ACTIVITY_FEED("ActivityFeed"),
        DATA_INSIGHT("DataInsight");
        private final String value;
        private final static Map<String, CreateEventSubscription.SubscriptionType> CONSTANTS = new HashMap<String, CreateEventSubscription.SubscriptionType>();

        static {
            for (CreateEventSubscription.SubscriptionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SubscriptionType(String value) {
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
        public static CreateEventSubscription.SubscriptionType fromValue(String value) {
            CreateEventSubscription.SubscriptionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
