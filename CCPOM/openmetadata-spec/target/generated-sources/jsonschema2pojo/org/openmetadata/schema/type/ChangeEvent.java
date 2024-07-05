
package org.openmetadata.schema.type;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ChangeEvent
 * <p>
 * This schema defines the change event type to capture the changes to entities. Entities change due to user activity, such as updating description of a dataset, changing ownership, or adding new tags. Entity also changes due to activities at the metadata sources, such as a new dataset was created, a datasets was deleted, or schema of a dataset is modified. When state of entity changes, an event is produced. These events can be used to build apps and bots that respond to the change from activities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "eventType",
    "entityType",
    "entityId",
    "entityFullyQualifiedName",
    "previousVersion",
    "currentVersion",
    "userName",
    "timestamp",
    "changeDescription",
    "entity"
})
@Generated("jsonschema2pojo")
public class ChangeEvent {

    /**
     * Type of event.
     * (Required)
     * 
     */
    @JsonProperty("eventType")
    @JsonPropertyDescription("Type of event.")
    @NotNull
    private EventType eventType;
    /**
     * Entity type that changed. Use the schema of this entity to process the entity attribute.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("Entity type that changed. Use the schema of this entity to process the entity attribute.")
    @NotNull
    private String entityType;
    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    @NotNull
    private UUID entityId;
    /**
     * Fully Qualified Name of entity that was modified by the operation.
     * 
     */
    @JsonProperty("entityFullyQualifiedName")
    @JsonPropertyDescription("Fully Qualified Name of entity that was modified by the operation.")
    private String entityFullyQualifiedName;
    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("previousVersion")
    @JsonPropertyDescription("Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.")
    private Double previousVersion = 0.1D;
    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("currentVersion")
    @JsonPropertyDescription("Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.")
    private Double currentVersion = 0.1D;
    /**
     * Name of the user whose activity resulted in the change.
     * 
     */
    @JsonProperty("userName")
    @JsonPropertyDescription("Name of the user whose activity resulted in the change.")
    private String userName;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    @NotNull
    private Long timestamp;
    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    @JsonPropertyDescription("Description of the change.")
    @Valid
    private ChangeDescription changeDescription;
    /**
     * For `eventType` `entityCreated`, this field captures JSON coded string of the entity using the schema corresponding to `entityType`.
     * 
     */
    @JsonProperty("entity")
    @JsonPropertyDescription("For `eventType` `entityCreated`, this field captures JSON coded string of the entity using the schema corresponding to `entityType`.")
    private Object entity;

    /**
     * Type of event.
     * (Required)
     * 
     */
    @JsonProperty("eventType")
    public EventType getEventType() {
        return eventType;
    }

    /**
     * Type of event.
     * (Required)
     * 
     */
    @JsonProperty("eventType")
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public ChangeEvent withEventType(EventType eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Entity type that changed. Use the schema of this entity to process the entity attribute.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    /**
     * Entity type that changed. Use the schema of this entity to process the entity attribute.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public ChangeEvent withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    public UUID getEntityId() {
        return entityId;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    public void setEntityId(UUID entityId) {
        this.entityId = entityId;
    }

    public ChangeEvent withEntityId(UUID entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Fully Qualified Name of entity that was modified by the operation.
     * 
     */
    @JsonProperty("entityFullyQualifiedName")
    public String getEntityFullyQualifiedName() {
        return entityFullyQualifiedName;
    }

    /**
     * Fully Qualified Name of entity that was modified by the operation.
     * 
     */
    @JsonProperty("entityFullyQualifiedName")
    public void setEntityFullyQualifiedName(String entityFullyQualifiedName) {
        this.entityFullyQualifiedName = entityFullyQualifiedName;
    }

    public ChangeEvent withEntityFullyQualifiedName(String entityFullyQualifiedName) {
        this.entityFullyQualifiedName = entityFullyQualifiedName;
        return this;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("previousVersion")
    public Double getPreviousVersion() {
        return previousVersion;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("previousVersion")
    public void setPreviousVersion(Double previousVersion) {
        this.previousVersion = previousVersion;
    }

    public ChangeEvent withPreviousVersion(Double previousVersion) {
        this.previousVersion = previousVersion;
        return this;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("currentVersion")
    public Double getCurrentVersion() {
        return currentVersion;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("currentVersion")
    public void setCurrentVersion(Double currentVersion) {
        this.currentVersion = currentVersion;
    }

    public ChangeEvent withCurrentVersion(Double currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * Name of the user whose activity resulted in the change.
     * 
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * Name of the user whose activity resulted in the change.
     * 
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ChangeEvent withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ChangeEvent withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
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

    public ChangeEvent withChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
        return this;
    }

    /**
     * For `eventType` `entityCreated`, this field captures JSON coded string of the entity using the schema corresponding to `entityType`.
     * 
     */
    @JsonProperty("entity")
    public Object getEntity() {
        return entity;
    }

    /**
     * For `eventType` `entityCreated`, this field captures JSON coded string of the entity using the schema corresponding to `entityType`.
     * 
     */
    @JsonProperty("entity")
    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public ChangeEvent withEntity(Object entity) {
        this.entity = entity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChangeEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("eventType");
        sb.append('=');
        sb.append(((this.eventType == null)?"<null>":this.eventType));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("entityFullyQualifiedName");
        sb.append('=');
        sb.append(((this.entityFullyQualifiedName == null)?"<null>":this.entityFullyQualifiedName));
        sb.append(',');
        sb.append("previousVersion");
        sb.append('=');
        sb.append(((this.previousVersion == null)?"<null>":this.previousVersion));
        sb.append(',');
        sb.append("currentVersion");
        sb.append('=');
        sb.append(((this.currentVersion == null)?"<null>":this.currentVersion));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("changeDescription");
        sb.append('=');
        sb.append(((this.changeDescription == null)?"<null>":this.changeDescription));
        sb.append(',');
        sb.append("entity");
        sb.append('=');
        sb.append(((this.entity == null)?"<null>":this.entity));
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
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.entityFullyQualifiedName == null)? 0 :this.entityFullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.previousVersion == null)? 0 :this.previousVersion.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.eventType == null)? 0 :this.eventType.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        result = ((result* 31)+((this.currentVersion == null)? 0 :this.currentVersion.hashCode()));
        result = ((result* 31)+((this.entity == null)? 0 :this.entity.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangeEvent) == false) {
            return false;
        }
        ChangeEvent rhs = ((ChangeEvent) other);
        return (((((((((((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription)))&&((this.entityFullyQualifiedName == rhs.entityFullyQualifiedName)||((this.entityFullyQualifiedName!= null)&&this.entityFullyQualifiedName.equals(rhs.entityFullyQualifiedName))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.previousVersion == rhs.previousVersion)||((this.previousVersion!= null)&&this.previousVersion.equals(rhs.previousVersion))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.eventType == rhs.eventType)||((this.eventType!= null)&&this.eventType.equals(rhs.eventType))))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))))&&((this.currentVersion == rhs.currentVersion)||((this.currentVersion!= null)&&this.currentVersion.equals(rhs.currentVersion))))&&((this.entity == rhs.entity)||((this.entity!= null)&&this.entity.equals(rhs.entity))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
