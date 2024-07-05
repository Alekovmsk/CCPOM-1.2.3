
package org.openmetadata.schema.api.data;

import java.util.ArrayList;
import java.util.List;
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
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.LifeCycle;
import org.openmetadata.schema.type.MessageSchema;
import org.openmetadata.schema.type.TagLabel;
import org.openmetadata.schema.type.topic.CleanupPolicy;
import org.openmetadata.schema.type.topic.TopicConfig;


/**
 * CreateTopicRequest
 * <p>
 * Create a topic entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "service",
    "messageSchema",
    "partitions",
    "cleanupPolicies",
    "replicationFactor",
    "retentionTime",
    "maximumMessageSize",
    "minimumInSyncReplicas",
    "retentionSize",
    "topicConfig",
    "owner",
    "tags",
    "extension",
    "sourceUrl",
    "domain",
    "dataProducts",
    "lifeCycle",
    "sourceHash"
})
@Generated("jsonschema2pojo")
public class CreateTopic implements CreateEntity
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
     * Display Name that identifies this topic.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this topic.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("service")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String service;
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
     * Topic clean up policy. For Kafka - `cleanup.policy` configuration.
     * 
     */
    @JsonProperty("cleanupPolicies")
    @JsonPropertyDescription("Topic clean up policy. For Kafka - `cleanup.policy` configuration.")
    @Valid
    private List<CleanupPolicy> cleanupPolicies = new ArrayList<CleanupPolicy>();
    /**
     * Replication Factor in integer (more than 1).
     * 
     */
    @JsonProperty("replicationFactor")
    @JsonPropertyDescription("Replication Factor in integer (more than 1).")
    private Integer replicationFactor;
    /**
     * Retention time in milliseconds. For Kafka - `retention.ms` configuration.
     * 
     */
    @JsonProperty("retentionTime")
    @JsonPropertyDescription("Retention time in milliseconds. For Kafka - `retention.ms` configuration.")
    private Double retentionTime;
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
     * Tags for this topic
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this topic")
    @Valid
    private List<TagLabel> tags = null;
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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String domain;
    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    @JsonPropertyDescription("List of fully qualified names of data products this entity is part of.")
    @Valid
    private List<String> dataProducts = new ArrayList<String>();
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

    public CreateTopic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this topic.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this topic.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateTopic withDisplayName(String displayName) {
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

    public CreateTopic withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public String getService() {
        return service;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public void setService(String service) {
        this.service = service;
    }

    public CreateTopic withService(String service) {
        this.service = service;
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

    public CreateTopic withMessageSchema(MessageSchema messageSchema) {
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

    public CreateTopic withPartitions(Integer partitions) {
        this.partitions = partitions;
        return this;
    }

    /**
     * Topic clean up policy. For Kafka - `cleanup.policy` configuration.
     * 
     */
    @JsonProperty("cleanupPolicies")
    public List<CleanupPolicy> getCleanupPolicies() {
        return cleanupPolicies;
    }

    /**
     * Topic clean up policy. For Kafka - `cleanup.policy` configuration.
     * 
     */
    @JsonProperty("cleanupPolicies")
    public void setCleanupPolicies(List<CleanupPolicy> cleanupPolicies) {
        this.cleanupPolicies = cleanupPolicies;
    }

    public CreateTopic withCleanupPolicies(List<CleanupPolicy> cleanupPolicies) {
        this.cleanupPolicies = cleanupPolicies;
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

    public CreateTopic withReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
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

    public CreateTopic withRetentionTime(Double retentionTime) {
        this.retentionTime = retentionTime;
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

    public CreateTopic withMaximumMessageSize(Integer maximumMessageSize) {
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

    public CreateTopic withMinimumInSyncReplicas(Integer minimumInSyncReplicas) {
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

    public CreateTopic withRetentionSize(Double retentionSize) {
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

    public CreateTopic withTopicConfig(TopicConfig topicConfig) {
        this.topicConfig = topicConfig;
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

    public CreateTopic withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Tags for this topic
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this topic
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateTopic withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public CreateTopic withExtension(Object extension) {
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

    public CreateTopic withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateTopic withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    public List<String> getDataProducts() {
        return dataProducts;
    }

    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    public void setDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
    }

    public CreateTopic withDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
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

    public CreateTopic withLifeCycle(LifeCycle lifeCycle) {
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

    public CreateTopic withSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateTopic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
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
        sb.append("replicationFactor");
        sb.append('=');
        sb.append(((this.replicationFactor == null)?"<null>":this.replicationFactor));
        sb.append(',');
        sb.append("retentionTime");
        sb.append('=');
        sb.append(((this.retentionTime == null)?"<null>":this.retentionTime));
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
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
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
        result = ((result* 31)+((this.partitions == null)? 0 :this.partitions.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.replicationFactor == null)? 0 :this.replicationFactor.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.maximumMessageSize == null)? 0 :this.maximumMessageSize.hashCode()));
        result = ((result* 31)+((this.topicConfig == null)? 0 :this.topicConfig.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.dataProducts == null)? 0 :this.dataProducts.hashCode()));
        result = ((result* 31)+((this.retentionTime == null)? 0 :this.retentionTime.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.sourceUrl == null)? 0 :this.sourceUrl.hashCode()));
        result = ((result* 31)+((this.cleanupPolicies == null)? 0 :this.cleanupPolicies.hashCode()));
        result = ((result* 31)+((this.sourceHash == null)? 0 :this.sourceHash.hashCode()));
        result = ((result* 31)+((this.messageSchema == null)? 0 :this.messageSchema.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.retentionSize == null)? 0 :this.retentionSize.hashCode()));
        result = ((result* 31)+((this.minimumInSyncReplicas == null)? 0 :this.minimumInSyncReplicas.hashCode()));
        result = ((result* 31)+((this.lifeCycle == null)? 0 :this.lifeCycle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateTopic) == false) {
            return false;
        }
        CreateTopic rhs = ((CreateTopic) other);
        return ((((((((((((((((((((((this.partitions == rhs.partitions)||((this.partitions!= null)&&this.partitions.equals(rhs.partitions)))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.replicationFactor == rhs.replicationFactor)||((this.replicationFactor!= null)&&this.replicationFactor.equals(rhs.replicationFactor))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.maximumMessageSize == rhs.maximumMessageSize)||((this.maximumMessageSize!= null)&&this.maximumMessageSize.equals(rhs.maximumMessageSize))))&&((this.topicConfig == rhs.topicConfig)||((this.topicConfig!= null)&&this.topicConfig.equals(rhs.topicConfig))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.retentionTime == rhs.retentionTime)||((this.retentionTime!= null)&&this.retentionTime.equals(rhs.retentionTime))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.sourceUrl == rhs.sourceUrl)||((this.sourceUrl!= null)&&this.sourceUrl.equals(rhs.sourceUrl))))&&((this.cleanupPolicies == rhs.cleanupPolicies)||((this.cleanupPolicies!= null)&&this.cleanupPolicies.equals(rhs.cleanupPolicies))))&&((this.sourceHash == rhs.sourceHash)||((this.sourceHash!= null)&&this.sourceHash.equals(rhs.sourceHash))))&&((this.messageSchema == rhs.messageSchema)||((this.messageSchema!= null)&&this.messageSchema.equals(rhs.messageSchema))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.retentionSize == rhs.retentionSize)||((this.retentionSize!= null)&&this.retentionSize.equals(rhs.retentionSize))))&&((this.minimumInSyncReplicas == rhs.minimumInSyncReplicas)||((this.minimumInSyncReplicas!= null)&&this.minimumInSyncReplicas.equals(rhs.minimumInSyncReplicas))))&&((this.lifeCycle == rhs.lifeCycle)||((this.lifeCycle!= null)&&this.lifeCycle.equals(rhs.lifeCycle))));
    }

}
