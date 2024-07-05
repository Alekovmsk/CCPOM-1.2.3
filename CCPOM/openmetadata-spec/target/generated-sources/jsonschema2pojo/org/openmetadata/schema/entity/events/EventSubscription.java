
package org.openmetadata.schema.entity.events;

import java.net.URI;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.EntityInterface;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;


/**
 * EventSubscription
 * <p>
 * This schema defines the EventSubscription entity. An Event Subscription has trigger, filters and Subscription
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "fullyQualifiedName",
    "displayName",
    "description",
    "owner",
    "href",
    "version",
    "updatedAt",
    "updatedBy",
    "changeDescription",
    "alertType",
    "trigger",
    "filteringRules",
    "subscriptionType",
    "subscriptionConfig",
    "enabled",
    "batchSize",
    "timeout",
    "readTimeout",
    "statusDetails",
    "provider"
})
@Generated("jsonschema2pojo")
public class EventSubscription implements EntityInterface
{

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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Display name for this Event Subscription.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display name for this Event Subscription.")
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
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;
    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.")
    private Double version = 0.1D;
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
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    @JsonPropertyDescription("Description of the change.")
    @Valid
    private ChangeDescription changeDescription;
    /**
     * Type of Alerts supported.
     * (Required)
     * 
     */
    @JsonProperty("alertType")
    @JsonPropertyDescription("Type of Alerts supported.")
    @NotNull
    private org.openmetadata.schema.api.events.CreateEventSubscription.AlertType alertType = org.openmetadata.schema.api.events.CreateEventSubscription.AlertType.fromValue("ChangeEvent");
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
    private org.openmetadata.schema.api.events.CreateEventSubscription.SubscriptionType subscriptionType;
    @JsonProperty("subscriptionConfig")
    private Object subscriptionConfig;
    /**
     * Is the event Subscription enabled.
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("Is the event Subscription enabled.")
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
     * Subscription Current Status
     * 
     */
    @JsonProperty("statusDetails")
    @JsonPropertyDescription("Subscription Current Status")
    @Valid
    private SubscriptionStatus statusDetails;
    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.")
    private ProviderType provider = ProviderType.fromValue("user");

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

    public EventSubscription withId(UUID id) {
        this.id = id;
        return this;
    }

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

    public EventSubscription withName(String name) {
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

    public EventSubscription withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Display name for this Event Subscription.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display name for this Event Subscription.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public EventSubscription withDisplayName(String displayName) {
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

    public EventSubscription withDescription(String description) {
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

    public EventSubscription withOwner(EntityReference owner) {
        this.owner = owner;
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

    public EventSubscription withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    public Double getVersion() {
        return version;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    public void setVersion(Double version) {
        this.version = version;
    }

    public EventSubscription withVersion(Double version) {
        this.version = version;
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

    public EventSubscription withUpdatedAt(Long updatedAt) {
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

    public EventSubscription withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    public ChangeDescription getChangeDescription() {
        return changeDescription;
    }

    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    public void setChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
    }

    public EventSubscription withChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
        return this;
    }

    /**
     * Type of Alerts supported.
     * (Required)
     * 
     */
    @JsonProperty("alertType")
    public org.openmetadata.schema.api.events.CreateEventSubscription.AlertType getAlertType() {
        return alertType;
    }

    /**
     * Type of Alerts supported.
     * (Required)
     * 
     */
    @JsonProperty("alertType")
    public void setAlertType(org.openmetadata.schema.api.events.CreateEventSubscription.AlertType alertType) {
        this.alertType = alertType;
    }

    public EventSubscription withAlertType(org.openmetadata.schema.api.events.CreateEventSubscription.AlertType alertType) {
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

    public EventSubscription withTrigger(TriggerConfig trigger) {
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

    public EventSubscription withFilteringRules(FilteringRules filteringRules) {
        this.filteringRules = filteringRules;
        return this;
    }

    /**
     * Subscription Endpoint Type.
     * (Required)
     * 
     */
    @JsonProperty("subscriptionType")
    public org.openmetadata.schema.api.events.CreateEventSubscription.SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * Subscription Endpoint Type.
     * (Required)
     * 
     */
    @JsonProperty("subscriptionType")
    public void setSubscriptionType(org.openmetadata.schema.api.events.CreateEventSubscription.SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public EventSubscription withSubscriptionType(org.openmetadata.schema.api.events.CreateEventSubscription.SubscriptionType subscriptionType) {
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

    public EventSubscription withSubscriptionConfig(Object subscriptionConfig) {
        this.subscriptionConfig = subscriptionConfig;
        return this;
    }

    /**
     * Is the event Subscription enabled.
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Is the event Subscription enabled.
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public EventSubscription withEnabled(Boolean enabled) {
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

    public EventSubscription withBatchSize(Integer batchSize) {
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

    public EventSubscription withTimeout(Integer timeout) {
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

    public EventSubscription withReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    /**
     * Subscription Current Status
     * 
     */
    @JsonProperty("statusDetails")
    public SubscriptionStatus getStatusDetails() {
        return statusDetails;
    }

    /**
     * Subscription Current Status
     * 
     */
    @JsonProperty("statusDetails")
    public void setStatusDetails(SubscriptionStatus statusDetails) {
        this.statusDetails = statusDetails;
    }

    public EventSubscription withStatusDetails(SubscriptionStatus statusDetails) {
        this.statusDetails = statusDetails;
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

    public EventSubscription withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EventSubscription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
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
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
        sb.append(',');
        sb.append("changeDescription");
        sb.append('=');
        sb.append(((this.changeDescription == null)?"<null>":this.changeDescription));
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
        sb.append("statusDetails");
        sb.append('=');
        sb.append(((this.statusDetails == null)?"<null>":this.statusDetails));
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
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.alertType == null)? 0 :this.alertType.hashCode()));
        result = ((result* 31)+((this.filteringRules == null)? 0 :this.filteringRules.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.trigger == null)? 0 :this.trigger.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        result = ((result* 31)+((this.timeout == null)? 0 :this.timeout.hashCode()));
        result = ((result* 31)+((this.subscriptionType == null)? 0 :this.subscriptionType.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.subscriptionConfig == null)? 0 :this.subscriptionConfig.hashCode()));
        result = ((result* 31)+((this.readTimeout == null)? 0 :this.readTimeout.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.statusDetails == null)? 0 :this.statusDetails.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.batchSize == null)? 0 :this.batchSize.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventSubscription) == false) {
            return false;
        }
        EventSubscription rhs = ((EventSubscription) other);
        return (((((((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.alertType == rhs.alertType)||((this.alertType!= null)&&this.alertType.equals(rhs.alertType))))&&((this.filteringRules == rhs.filteringRules)||((this.filteringRules!= null)&&this.filteringRules.equals(rhs.filteringRules))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.trigger == rhs.trigger)||((this.trigger!= null)&&this.trigger.equals(rhs.trigger))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))))&&((this.timeout == rhs.timeout)||((this.timeout!= null)&&this.timeout.equals(rhs.timeout))))&&((this.subscriptionType == rhs.subscriptionType)||((this.subscriptionType!= null)&&this.subscriptionType.equals(rhs.subscriptionType))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.subscriptionConfig == rhs.subscriptionConfig)||((this.subscriptionConfig!= null)&&this.subscriptionConfig.equals(rhs.subscriptionConfig))))&&((this.readTimeout == rhs.readTimeout)||((this.readTimeout!= null)&&this.readTimeout.equals(rhs.readTimeout))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.statusDetails == rhs.statusDetails)||((this.statusDetails!= null)&&this.statusDetails.equals(rhs.statusDetails))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.batchSize == rhs.batchSize)||((this.batchSize!= null)&&this.batchSize.equals(rhs.batchSize))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
