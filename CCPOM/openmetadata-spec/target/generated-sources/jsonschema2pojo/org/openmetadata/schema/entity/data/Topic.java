
package org.openmetadata.schema.entity.data;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
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
import org.openmetadata.schema.type.LifeCycle;
import org.openmetadata.schema.type.MessageSchema;
import org.openmetadata.schema.type.TagLabel;
import org.openmetadata.schema.type.Votes;
import org.openmetadata.schema.type.topic.CleanupPolicy;
import org.openmetadata.schema.type.topic.TopicConfig;
import org.openmetadata.schema.type.topic.TopicSampleData;


/**
 * Topic
 * <p>
 * A `Topic` is a feed or an event stream in a `Messaging Service` into which publishers publish messages and consumed by consumers.@om-entity-type
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "fullyQualifiedName",
    "displayName",
    "description",
    "version",
    "updatedAt",
    "updatedBy",
    "service",
    "serviceType",
    "messageSchema",
    "partitions",
    "cleanupPolicies",
    "retentionTime",
    "replicationFactor",
    "maximumMessageSize",
    "minimumInSyncReplicas",
    "retentionSize",
    "topicConfig",
    "sampleData",
    "owner",
    "followers",
    "tags",
    "href",
    "changeDescription",
    "deleted",
    "extension",
    "sourceUrl",
    "domain",
    "dataProducts",
    "votes",
    "lifeCycle",
    "sourceHash"
})
@Generated("jsonschema2pojo")
public class Topic implements EntityInterface
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
     * Display Name that identifies this topic. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this topic. It could be title or label from the source services.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
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
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("service")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference service;
    /**
     * Type of messaging service - Kafka or Pulsar.
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("Type of messaging service - Kafka or Pulsar.")
    private org.openmetadata.schema.api.services.CreateMessagingService.MessagingServiceType serviceType;
    /**
     * Topic
     * <p>
     * This schema defines the Topic entity. A topic is a feed into which message are published to by publishers and read from by consumers in a messaging service.@om-entity-type
     * 
     */
    @JsonProperty("messageSchema")
    @JsonPropertyDescription("This schema defines the Topic entity. A topic is a feed into which message are published to by publishers and read from by consumers in a messaging service.")
    @Valid
    private MessageSchema messageSchema;
    /**
     * Number of partitions into which the topic is divided.
     * (Required)
     * 
     */
    @JsonProperty("partitions")
    @JsonPropertyDescription("Number of partitions into which the topic is divided.")
    @DecimalMin("1")
    @NotNull
    private Integer partitions;
    /**
     * Topic clean up policies. For Kafka - `cleanup.policy` configuration.
     * 
     */
    @JsonProperty("cleanupPolicies")
    @JsonPropertyDescription("Topic clean up policies. For Kafka - `cleanup.policy` configuration.")
    @Valid
    private List<CleanupPolicy> cleanupPolicies = new ArrayList<CleanupPolicy>();
    /**
     * Retention time in milliseconds. For Kafka - `retention.ms` configuration.
     * 
     */
    @JsonProperty("retentionTime")
    @JsonPropertyDescription("Retention time in milliseconds. For Kafka - `retention.ms` configuration.")
    private Double retentionTime;
    /**
     * Replication Factor in integer (more than 1).
     * 
     */
    @JsonProperty("replicationFactor")
    @JsonPropertyDescription("Replication Factor in integer (more than 1).")
    private Integer replicationFactor;
    /**
     * Maximum message size in bytes. For Kafka - `max.message.bytes` configuration.
     * 
     */
    @JsonProperty("maximumMessageSize")
    @JsonPropertyDescription("Maximum message size in bytes. For Kafka - `max.message.bytes` configuration.")
    private Integer maximumMessageSize;
    /**
     * Minimum number replicas in sync to control durability. For Kafka - `min.insync.replicas` configuration.
     * 
     */
    @JsonProperty("minimumInSyncReplicas")
    @JsonPropertyDescription("Minimum number replicas in sync to control durability. For Kafka - `min.insync.replicas` configuration.")
    private Integer minimumInSyncReplicas;
    /**
     * Maximum size of a partition in bytes before old data is discarded. For Kafka - `retention.bytes` configuration.
     * 
     */
    @JsonProperty("retentionSize")
    @JsonPropertyDescription("Maximum size of a partition in bytes before old data is discarded. For Kafka - `retention.bytes` configuration.")
    private Double retentionSize = -1.0D;
    /**
     * Contains key/value pair of topic configuration.
     * 
     */
    @JsonProperty("topicConfig")
    @JsonPropertyDescription("Contains key/value pair of topic configuration.")
    @Valid
    private TopicConfig topicConfig;
    /**
     * This schema defines the type to capture sample data for a topic.
     * 
     */
    @JsonProperty("sampleData")
    @JsonPropertyDescription("This schema defines the type to capture sample data for a topic.")
    @Valid
    private TopicSampleData sampleData;
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
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("followers")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> followers = null;
    /**
     * Tags for this table.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this table.")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;
    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    @JsonPropertyDescription("Description of the change.")
    @Valid
    private ChangeDescription changeDescription;
    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    @JsonPropertyDescription("When `true` indicates the entity has been soft deleted.")
    private Boolean deleted = false;
    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("Entity extension data with custom attributes added to the entity.")
    private Object extension;
    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    @JsonPropertyDescription("Source Url of the respective entity.")
    private String sourceUrl;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference domain;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("dataProducts")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> dataProducts = null;
    /**
     * Votes
     * <p>
     * This schema defines the Votes for a Data Asset.
     * 
     */
    @JsonProperty("votes")
    @JsonPropertyDescription("This schema defines the Votes for a Data Asset.")
    @Valid
    private Votes votes;
    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    @JsonPropertyDescription("This schema defines Life Cycle Properties.")
    @Valid
    private LifeCycle lifeCycle;
    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    @JsonPropertyDescription("Source hash of the entity")
    @Size(min = 1, max = 32)
    private String sourceHash;

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

    public Topic withId(UUID id) {
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

    public Topic withName(String name) {
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

    public Topic withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Display Name that identifies this topic. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this topic. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Topic withDisplayName(String displayName) {
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

    public Topic withDescription(String description) {
        this.description = description;
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

    public Topic withVersion(Double version) {
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

    public Topic withUpdatedAt(Long updatedAt) {
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

    public Topic withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public EntityReference getService() {
        return service;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public void setService(EntityReference service) {
        this.service = service;
    }

    public Topic withService(EntityReference service) {
        this.service = service;
        return this;
    }

    /**
     * Type of messaging service - Kafka or Pulsar.
     * 
     */
    @JsonProperty("serviceType")
    public org.openmetadata.schema.api.services.CreateMessagingService.MessagingServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Type of messaging service - Kafka or Pulsar.
     * 
     */
    @JsonProperty("serviceType")
    public void setServiceType(org.openmetadata.schema.api.services.CreateMessagingService.MessagingServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Topic withServiceType(org.openmetadata.schema.api.services.CreateMessagingService.MessagingServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Topic
     * <p>
     * This schema defines the Topic entity. A topic is a feed into which message are published to by publishers and read from by consumers in a messaging service.@om-entity-type
     * 
     */
    @JsonProperty("messageSchema")
    public MessageSchema getMessageSchema() {
        return messageSchema;
    }

    /**
     * Topic
     * <p>
     * This schema defines the Topic entity. A topic is a feed into which message are published to by publishers and read from by consumers in a messaging service.@om-entity-type
     * 
     */
    @JsonProperty("messageSchema")
    public void setMessageSchema(MessageSchema messageSchema) {
        this.messageSchema = messageSchema;
    }

    public Topic withMessageSchema(MessageSchema messageSchema) {
        this.messageSchema = messageSchema;
        return this;
    }

    /**
     * Number of partitions into which the topic is divided.
     * (Required)
     * 
     */
    @JsonProperty("partitions")
    public Integer getPartitions() {
        return partitions;
    }

    /**
     * Number of partitions into which the topic is divided.
     * (Required)
     * 
     */
    @JsonProperty("partitions")
    public void setPartitions(Integer partitions) {
        this.partitions = partitions;
    }

    public Topic withPartitions(Integer partitions) {
        this.partitions = partitions;
        return this;
    }

    /**
     * Topic clean up policies. For Kafka - `cleanup.policy` configuration.
     * 
     */
    @JsonProperty("cleanupPolicies")
    public List<CleanupPolicy> getCleanupPolicies() {
        return cleanupPolicies;
    }

    /**
     * Topic clean up policies. For Kafka - `cleanup.policy` configuration.
     * 
     */
    @JsonProperty("cleanupPolicies")
    public void setCleanupPolicies(List<CleanupPolicy> cleanupPolicies) {
        this.cleanupPolicies = cleanupPolicies;
    }

    public Topic withCleanupPolicies(List<CleanupPolicy> cleanupPolicies) {
        this.cleanupPolicies = cleanupPolicies;
        return this;
    }

    /**
     * Retention time in milliseconds. For Kafka - `retention.ms` configuration.
     * 
     */
    @JsonProperty("retentionTime")
    public Double getRetentionTime() {
        return retentionTime;
    }

    /**
     * Retention time in milliseconds. For Kafka - `retention.ms` configuration.
     * 
     */
    @JsonProperty("retentionTime")
    public void setRetentionTime(Double retentionTime) {
        this.retentionTime = retentionTime;
    }

    public Topic withRetentionTime(Double retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    /**
     * Replication Factor in integer (more than 1).
     * 
     */
    @JsonProperty("replicationFactor")
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    /**
     * Replication Factor in integer (more than 1).
     * 
     */
    @JsonProperty("replicationFactor")
    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    public Topic withReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }

    /**
     * Maximum message size in bytes. For Kafka - `max.message.bytes` configuration.
     * 
     */
    @JsonProperty("maximumMessageSize")
    public Integer getMaximumMessageSize() {
        return maximumMessageSize;
    }

    /**
     * Maximum message size in bytes. For Kafka - `max.message.bytes` configuration.
     * 
     */
    @JsonProperty("maximumMessageSize")
    public void setMaximumMessageSize(Integer maximumMessageSize) {
        this.maximumMessageSize = maximumMessageSize;
    }

    public Topic withMaximumMessageSize(Integer maximumMessageSize) {
        this.maximumMessageSize = maximumMessageSize;
        return this;
    }

    /**
     * Minimum number replicas in sync to control durability. For Kafka - `min.insync.replicas` configuration.
     * 
     */
    @JsonProperty("minimumInSyncReplicas")
    public Integer getMinimumInSyncReplicas() {
        return minimumInSyncReplicas;
    }

    /**
     * Minimum number replicas in sync to control durability. For Kafka - `min.insync.replicas` configuration.
     * 
     */
    @JsonProperty("minimumInSyncReplicas")
    public void setMinimumInSyncReplicas(Integer minimumInSyncReplicas) {
        this.minimumInSyncReplicas = minimumInSyncReplicas;
    }

    public Topic withMinimumInSyncReplicas(Integer minimumInSyncReplicas) {
        this.minimumInSyncReplicas = minimumInSyncReplicas;
        return this;
    }

    /**
     * Maximum size of a partition in bytes before old data is discarded. For Kafka - `retention.bytes` configuration.
     * 
     */
    @JsonProperty("retentionSize")
    public Double getRetentionSize() {
        return retentionSize;
    }

    /**
     * Maximum size of a partition in bytes before old data is discarded. For Kafka - `retention.bytes` configuration.
     * 
     */
    @JsonProperty("retentionSize")
    public void setRetentionSize(Double retentionSize) {
        this.retentionSize = retentionSize;
    }

    public Topic withRetentionSize(Double retentionSize) {
        this.retentionSize = retentionSize;
        return this;
    }

    /**
     * Contains key/value pair of topic configuration.
     * 
     */
    @JsonProperty("topicConfig")
    public TopicConfig getTopicConfig() {
        return topicConfig;
    }

    /**
     * Contains key/value pair of topic configuration.
     * 
     */
    @JsonProperty("topicConfig")
    public void setTopicConfig(TopicConfig topicConfig) {
        this.topicConfig = topicConfig;
    }

    public Topic withTopicConfig(TopicConfig topicConfig) {
        this.topicConfig = topicConfig;
        return this;
    }

    /**
     * This schema defines the type to capture sample data for a topic.
     * 
     */
    @JsonProperty("sampleData")
    public TopicSampleData getSampleData() {
        return sampleData;
    }

    /**
     * This schema defines the type to capture sample data for a topic.
     * 
     */
    @JsonProperty("sampleData")
    public void setSampleData(TopicSampleData sampleData) {
        this.sampleData = sampleData;
    }

    public Topic withSampleData(TopicSampleData sampleData) {
        this.sampleData = sampleData;
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

    public Topic withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("followers")
    public List<EntityReference> getFollowers() {
        return followers;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("followers")
    public void setFollowers(List<EntityReference> followers) {
        this.followers = followers;
    }

    public Topic withFollowers(List<EntityReference> followers) {
        this.followers = followers;
        return this;
    }

    /**
     * Tags for this table.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this table.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public Topic withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public Topic withHref(URI href) {
        this.href = href;
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

    public Topic withChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
        return this;
    }

    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Topic withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public Object getExtension() {
        return extension;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(Object extension) {
        this.extension = extension;
    }

    public Topic withExtension(Object extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public Topic withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    public EntityReference getDomain() {
        return domain;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(EntityReference domain) {
        this.domain = domain;
    }

    public Topic withDomain(EntityReference domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("dataProducts")
    public List<EntityReference> getDataProducts() {
        return dataProducts;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("dataProducts")
    public void setDataProducts(List<EntityReference> dataProducts) {
        this.dataProducts = dataProducts;
    }

    public Topic withDataProducts(List<EntityReference> dataProducts) {
        this.dataProducts = dataProducts;
        return this;
    }

    /**
     * Votes
     * <p>
     * This schema defines the Votes for a Data Asset.
     * 
     */
    @JsonProperty("votes")
    public Votes getVotes() {
        return votes;
    }

    /**
     * Votes
     * <p>
     * This schema defines the Votes for a Data Asset.
     * 
     */
    @JsonProperty("votes")
    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    public Topic withVotes(Votes votes) {
        this.votes = votes;
        return this;
    }

    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    public LifeCycle getLifeCycle() {
        return lifeCycle;
    }

    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    public void setLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public Topic withLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }

    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    public String getSourceHash() {
        return sourceHash;
    }

    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    public void setSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
    }

    public Topic withSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Topic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("messageSchema");
        sb.append('=');
        sb.append(((this.messageSchema == null)?"<null>":this.messageSchema));
        sb.append(',');
        sb.append("partitions");
        sb.append('=');
        sb.append(((this.partitions == null)?"<null>":this.partitions));
        sb.append(',');
        sb.append("cleanupPolicies");
        sb.append('=');
        sb.append(((this.cleanupPolicies == null)?"<null>":this.cleanupPolicies));
        sb.append(',');
        sb.append("retentionTime");
        sb.append('=');
        sb.append(((this.retentionTime == null)?"<null>":this.retentionTime));
        sb.append(',');
        sb.append("replicationFactor");
        sb.append('=');
        sb.append(((this.replicationFactor == null)?"<null>":this.replicationFactor));
        sb.append(',');
        sb.append("maximumMessageSize");
        sb.append('=');
        sb.append(((this.maximumMessageSize == null)?"<null>":this.maximumMessageSize));
        sb.append(',');
        sb.append("minimumInSyncReplicas");
        sb.append('=');
        sb.append(((this.minimumInSyncReplicas == null)?"<null>":this.minimumInSyncReplicas));
        sb.append(',');
        sb.append("retentionSize");
        sb.append('=');
        sb.append(((this.retentionSize == null)?"<null>":this.retentionSize));
        sb.append(',');
        sb.append("topicConfig");
        sb.append('=');
        sb.append(((this.topicConfig == null)?"<null>":this.topicConfig));
        sb.append(',');
        sb.append("sampleData");
        sb.append('=');
        sb.append(((this.sampleData == null)?"<null>":this.sampleData));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("followers");
        sb.append('=');
        sb.append(((this.followers == null)?"<null>":this.followers));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("changeDescription");
        sb.append('=');
        sb.append(((this.changeDescription == null)?"<null>":this.changeDescription));
        sb.append(',');
        sb.append("deleted");
        sb.append('=');
        sb.append(((this.deleted == null)?"<null>":this.deleted));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("sourceUrl");
        sb.append('=');
        sb.append(((this.sourceUrl == null)?"<null>":this.sourceUrl));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("dataProducts");
        sb.append('=');
        sb.append(((this.dataProducts == null)?"<null>":this.dataProducts));
        sb.append(',');
        sb.append("votes");
        sb.append('=');
        sb.append(((this.votes == null)?"<null>":this.votes));
        sb.append(',');
        sb.append("lifeCycle");
        sb.append('=');
        sb.append(((this.lifeCycle == null)?"<null>":this.lifeCycle));
        sb.append(',');
        sb.append("sourceHash");
        sb.append('=');
        sb.append(((this.sourceHash == null)?"<null>":this.sourceHash));
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
        result = ((result* 31)+((this.serviceType == null)? 0 :this.serviceType.hashCode()));
        result = ((result* 31)+((this.replicationFactor == null)? 0 :this.replicationFactor.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.maximumMessageSize == null)? 0 :this.maximumMessageSize.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.retentionTime == null)? 0 :this.retentionTime.hashCode()));
        result = ((result* 31)+((this.sourceUrl == null)? 0 :this.sourceUrl.hashCode()));
        result = ((result* 31)+((this.minimumInSyncReplicas == null)? 0 :this.minimumInSyncReplicas.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.partitions == null)? 0 :this.partitions.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.topicConfig == null)? 0 :this.topicConfig.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.dataProducts == null)? 0 :this.dataProducts.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.cleanupPolicies == null)? 0 :this.cleanupPolicies.hashCode()));
        result = ((result* 31)+((this.sourceHash == null)? 0 :this.sourceHash.hashCode()));
        result = ((result* 31)+((this.followers == null)? 0 :this.followers.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.messageSchema == null)? 0 :this.messageSchema.hashCode()));
        result = ((result* 31)+((this.sampleData == null)? 0 :this.sampleData.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.retentionSize == null)? 0 :this.retentionSize.hashCode()));
        result = ((result* 31)+((this.votes == null)? 0 :this.votes.hashCode()));
        result = ((result* 31)+((this.lifeCycle == null)? 0 :this.lifeCycle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Topic) == false) {
            return false;
        }
        Topic rhs = ((Topic) other);
        return ((((((((((((((((((((((((((((((((((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType)))&&((this.replicationFactor == rhs.replicationFactor)||((this.replicationFactor!= null)&&this.replicationFactor.equals(rhs.replicationFactor))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.maximumMessageSize == rhs.maximumMessageSize)||((this.maximumMessageSize!= null)&&this.maximumMessageSize.equals(rhs.maximumMessageSize))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.retentionTime == rhs.retentionTime)||((this.retentionTime!= null)&&this.retentionTime.equals(rhs.retentionTime))))&&((this.sourceUrl == rhs.sourceUrl)||((this.sourceUrl!= null)&&this.sourceUrl.equals(rhs.sourceUrl))))&&((this.minimumInSyncReplicas == rhs.minimumInSyncReplicas)||((this.minimumInSyncReplicas!= null)&&this.minimumInSyncReplicas.equals(rhs.minimumInSyncReplicas))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.partitions == rhs.partitions)||((this.partitions!= null)&&this.partitions.equals(rhs.partitions))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.topicConfig == rhs.topicConfig)||((this.topicConfig!= null)&&this.topicConfig.equals(rhs.topicConfig))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.cleanupPolicies == rhs.cleanupPolicies)||((this.cleanupPolicies!= null)&&this.cleanupPolicies.equals(rhs.cleanupPolicies))))&&((this.sourceHash == rhs.sourceHash)||((this.sourceHash!= null)&&this.sourceHash.equals(rhs.sourceHash))))&&((this.followers == rhs.followers)||((this.followers!= null)&&this.followers.equals(rhs.followers))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.messageSchema == rhs.messageSchema)||((this.messageSchema!= null)&&this.messageSchema.equals(rhs.messageSchema))))&&((this.sampleData == rhs.sampleData)||((this.sampleData!= null)&&this.sampleData.equals(rhs.sampleData))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.retentionSize == rhs.retentionSize)||((this.retentionSize!= null)&&this.retentionSize.equals(rhs.retentionSize))))&&((this.votes == rhs.votes)||((this.votes!= null)&&this.votes.equals(rhs.votes))))&&((this.lifeCycle == rhs.lifeCycle)||((this.lifeCycle!= null)&&this.lifeCycle.equals(rhs.lifeCycle))));
    }

}
