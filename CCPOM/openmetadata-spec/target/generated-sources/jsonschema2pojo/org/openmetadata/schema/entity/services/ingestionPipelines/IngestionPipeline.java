
package org.openmetadata.schema.entity.services.ingestionPipelines;

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
import org.openmetadata.schema.metadataIngestion.LogLevels;
import org.openmetadata.schema.metadataIngestion.SourceConfig;
import org.openmetadata.schema.services.connections.metadata.OpenMetadataConnection;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;


/**
 * IngestionPipeline
 * <p>
 * Ingestion Pipeline Config is used to set up a DAG and deploy. This entity is used to setup metadata/quality pipelines on Apache Airflow.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "displayName",
    "description",
    "pipelineType",
    "owner",
    "fullyQualifiedName",
    "sourceConfig",
    "openMetadataServerConnection",
    "airflowConfig",
    "service",
    "pipelineStatuses",
    "loggerLevel",
    "deployed",
    "enabled",
    "href",
    "version",
    "updatedAt",
    "updatedBy",
    "changeDescription",
    "deleted",
    "provider"
})
@Generated("jsonschema2pojo")
public class IngestionPipeline implements EntityInterface
{

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
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
     * Display Name that identifies this Pipeline.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this Pipeline.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Type of Pipeline - metadata, usage
     * (Required)
     * 
     */
    @JsonProperty("pipelineType")
    @JsonPropertyDescription("Type of Pipeline - metadata, usage")
    @NotNull
    private PipelineType pipelineType;
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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Additional connection configuration.
     * (Required)
     * 
     */
    @JsonProperty("sourceConfig")
    @JsonPropertyDescription("Additional connection configuration.")
    @Valid
    @NotNull
    private SourceConfig sourceConfig;
    /**
     * OpenMetadataConnection
     * <p>
     * OpenMetadata Connection Config
     * 
     */
    @JsonProperty("openMetadataServerConnection")
    @JsonPropertyDescription("OpenMetadata Connection Config")
    @Valid
    private OpenMetadataConnection openMetadataServerConnection;
    /**
     * Properties to configure the Airflow pipeline that will run the workflow.
     * (Required)
     * 
     */
    @JsonProperty("airflowConfig")
    @JsonPropertyDescription("Properties to configure the Airflow pipeline that will run the workflow.")
    @Valid
    @NotNull
    private AirflowConfig airflowConfig;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("service")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference service;
    /**
     * This defines runtime status of Pipeline.
     * 
     */
    @JsonProperty("pipelineStatuses")
    @JsonPropertyDescription("This defines runtime status of Pipeline.")
    @Valid
    private PipelineStatus pipelineStatuses;
    /**
     * Supported logging levels
     * 
     */
    @JsonProperty("loggerLevel")
    @JsonPropertyDescription("Supported logging levels")
    private LogLevels loggerLevel = LogLevels.fromValue("INFO");
    /**
     * Indicates if the workflow has been successfully deployed to Airflow.
     * 
     */
    @JsonProperty("deployed")
    @JsonPropertyDescription("Indicates if the workflow has been successfully deployed to Airflow.")
    private Boolean deployed = false;
    /**
     * True if the pipeline is ready to be run in the next schedule. False if it is paused.
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("True if the pipeline is ready to be run in the next schedule. False if it is paused.")
    private Boolean enabled = true;
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
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    @JsonPropertyDescription("When `true` indicates the entity has been soft deleted.")
    private Boolean deleted = false;
    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.")
    private ProviderType provider = ProviderType.fromValue("user");

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    public IngestionPipeline withId(UUID id) {
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

    public IngestionPipeline withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this Pipeline.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this Pipeline.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public IngestionPipeline withDisplayName(String displayName) {
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

    public IngestionPipeline withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type of Pipeline - metadata, usage
     * (Required)
     * 
     */
    @JsonProperty("pipelineType")
    public PipelineType getPipelineType() {
        return pipelineType;
    }

    /**
     * Type of Pipeline - metadata, usage
     * (Required)
     * 
     */
    @JsonProperty("pipelineType")
    public void setPipelineType(PipelineType pipelineType) {
        this.pipelineType = pipelineType;
    }

    public IngestionPipeline withPipelineType(PipelineType pipelineType) {
        this.pipelineType = pipelineType;
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

    public IngestionPipeline withOwner(EntityReference owner) {
        this.owner = owner;
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

    public IngestionPipeline withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Additional connection configuration.
     * (Required)
     * 
     */
    @JsonProperty("sourceConfig")
    public SourceConfig getSourceConfig() {
        return sourceConfig;
    }

    /**
     * Additional connection configuration.
     * (Required)
     * 
     */
    @JsonProperty("sourceConfig")
    public void setSourceConfig(SourceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
    }

    public IngestionPipeline withSourceConfig(SourceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }

    /**
     * OpenMetadataConnection
     * <p>
     * OpenMetadata Connection Config
     * 
     */
    @JsonProperty("openMetadataServerConnection")
    public OpenMetadataConnection getOpenMetadataServerConnection() {
        return openMetadataServerConnection;
    }

    /**
     * OpenMetadataConnection
     * <p>
     * OpenMetadata Connection Config
     * 
     */
    @JsonProperty("openMetadataServerConnection")
    public void setOpenMetadataServerConnection(OpenMetadataConnection openMetadataServerConnection) {
        this.openMetadataServerConnection = openMetadataServerConnection;
    }

    public IngestionPipeline withOpenMetadataServerConnection(OpenMetadataConnection openMetadataServerConnection) {
        this.openMetadataServerConnection = openMetadataServerConnection;
        return this;
    }

    /**
     * Properties to configure the Airflow pipeline that will run the workflow.
     * (Required)
     * 
     */
    @JsonProperty("airflowConfig")
    public AirflowConfig getAirflowConfig() {
        return airflowConfig;
    }

    /**
     * Properties to configure the Airflow pipeline that will run the workflow.
     * (Required)
     * 
     */
    @JsonProperty("airflowConfig")
    public void setAirflowConfig(AirflowConfig airflowConfig) {
        this.airflowConfig = airflowConfig;
    }

    public IngestionPipeline withAirflowConfig(AirflowConfig airflowConfig) {
        this.airflowConfig = airflowConfig;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
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
     * 
     */
    @JsonProperty("service")
    public void setService(EntityReference service) {
        this.service = service;
    }

    public IngestionPipeline withService(EntityReference service) {
        this.service = service;
        return this;
    }

    /**
     * This defines runtime status of Pipeline.
     * 
     */
    @JsonProperty("pipelineStatuses")
    public PipelineStatus getPipelineStatuses() {
        return pipelineStatuses;
    }

    /**
     * This defines runtime status of Pipeline.
     * 
     */
    @JsonProperty("pipelineStatuses")
    public void setPipelineStatuses(PipelineStatus pipelineStatuses) {
        this.pipelineStatuses = pipelineStatuses;
    }

    public IngestionPipeline withPipelineStatuses(PipelineStatus pipelineStatuses) {
        this.pipelineStatuses = pipelineStatuses;
        return this;
    }

    /**
     * Supported logging levels
     * 
     */
    @JsonProperty("loggerLevel")
    public LogLevels getLoggerLevel() {
        return loggerLevel;
    }

    /**
     * Supported logging levels
     * 
     */
    @JsonProperty("loggerLevel")
    public void setLoggerLevel(LogLevels loggerLevel) {
        this.loggerLevel = loggerLevel;
    }

    public IngestionPipeline withLoggerLevel(LogLevels loggerLevel) {
        this.loggerLevel = loggerLevel;
        return this;
    }

    /**
     * Indicates if the workflow has been successfully deployed to Airflow.
     * 
     */
    @JsonProperty("deployed")
    public Boolean getDeployed() {
        return deployed;
    }

    /**
     * Indicates if the workflow has been successfully deployed to Airflow.
     * 
     */
    @JsonProperty("deployed")
    public void setDeployed(Boolean deployed) {
        this.deployed = deployed;
    }

    public IngestionPipeline withDeployed(Boolean deployed) {
        this.deployed = deployed;
        return this;
    }

    /**
     * True if the pipeline is ready to be run in the next schedule. False if it is paused.
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * True if the pipeline is ready to be run in the next schedule. False if it is paused.
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public IngestionPipeline withEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public IngestionPipeline withHref(URI href) {
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

    public IngestionPipeline withVersion(Double version) {
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

    public IngestionPipeline withUpdatedAt(Long updatedAt) {
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

    public IngestionPipeline withUpdatedBy(String updatedBy) {
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

    public IngestionPipeline withChangeDescription(ChangeDescription changeDescription) {
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

    public IngestionPipeline withDeleted(Boolean deleted) {
        this.deleted = deleted;
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

    public IngestionPipeline withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IngestionPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
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
        sb.append("pipelineType");
        sb.append('=');
        sb.append(((this.pipelineType == null)?"<null>":this.pipelineType));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("sourceConfig");
        sb.append('=');
        sb.append(((this.sourceConfig == null)?"<null>":this.sourceConfig));
        sb.append(',');
        sb.append("openMetadataServerConnection");
        sb.append('=');
        sb.append(((this.openMetadataServerConnection == null)?"<null>":this.openMetadataServerConnection));
        sb.append(',');
        sb.append("airflowConfig");
        sb.append('=');
        sb.append(((this.airflowConfig == null)?"<null>":this.airflowConfig));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        sb.append("pipelineStatuses");
        sb.append('=');
        sb.append(((this.pipelineStatuses == null)?"<null>":this.pipelineStatuses));
        sb.append(',');
        sb.append("loggerLevel");
        sb.append('=');
        sb.append(((this.loggerLevel == null)?"<null>":this.loggerLevel));
        sb.append(',');
        sb.append("deployed");
        sb.append('=');
        sb.append(((this.deployed == null)?"<null>":this.deployed));
        sb.append(',');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
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
        sb.append("deleted");
        sb.append('=');
        sb.append(((this.deleted == null)?"<null>":this.deleted));
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
        result = ((result* 31)+((this.loggerLevel == null)? 0 :this.loggerLevel.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.pipelineStatuses == null)? 0 :this.pipelineStatuses.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.deployed == null)? 0 :this.deployed.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.openMetadataServerConnection == null)? 0 :this.openMetadataServerConnection.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        result = ((result* 31)+((this.sourceConfig == null)? 0 :this.sourceConfig.hashCode()));
        result = ((result* 31)+((this.airflowConfig == null)? 0 :this.airflowConfig.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.pipelineType == null)? 0 :this.pipelineType.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IngestionPipeline) == false) {
            return false;
        }
        IngestionPipeline rhs = ((IngestionPipeline) other);
        return (((((((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.loggerLevel == rhs.loggerLevel)||((this.loggerLevel!= null)&&this.loggerLevel.equals(rhs.loggerLevel))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.pipelineStatuses == rhs.pipelineStatuses)||((this.pipelineStatuses!= null)&&this.pipelineStatuses.equals(rhs.pipelineStatuses))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.deployed == rhs.deployed)||((this.deployed!= null)&&this.deployed.equals(rhs.deployed))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.openMetadataServerConnection == rhs.openMetadataServerConnection)||((this.openMetadataServerConnection!= null)&&this.openMetadataServerConnection.equals(rhs.openMetadataServerConnection))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))))&&((this.sourceConfig == rhs.sourceConfig)||((this.sourceConfig!= null)&&this.sourceConfig.equals(rhs.sourceConfig))))&&((this.airflowConfig == rhs.airflowConfig)||((this.airflowConfig!= null)&&this.airflowConfig.equals(rhs.airflowConfig))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.pipelineType == rhs.pipelineType)||((this.pipelineType!= null)&&this.pipelineType.equals(rhs.pipelineType))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
