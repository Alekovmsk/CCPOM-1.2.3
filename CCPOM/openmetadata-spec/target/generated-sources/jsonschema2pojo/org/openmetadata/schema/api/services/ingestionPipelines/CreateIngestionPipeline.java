
package org.openmetadata.schema.api.services.ingestionPipelines;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.entity.services.ingestionPipelines.AirflowConfig;
import org.openmetadata.schema.entity.services.ingestionPipelines.PipelineType;
import org.openmetadata.schema.metadataIngestion.LogLevels;
import org.openmetadata.schema.metadataIngestion.SourceConfig;
import org.openmetadata.schema.type.EntityReference;


/**
 * CreateIngestionPipelineRequest
 * <p>
 * Ingestion Pipeline Config is used to set up an Airflow DAG.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "pipelineType",
    "sourceConfig",
    "airflowConfig",
    "loggerLevel",
    "service",
    "owner"
})
@Generated("jsonschema2pojo")
public class CreateIngestionPipeline implements CreateEntity
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
     * Display Name that identifies this ingestion pipeline.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this ingestion pipeline.")
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
     * Supported logging levels
     * 
     */
    @JsonProperty("loggerLevel")
    @JsonPropertyDescription("Supported logging levels")
    private LogLevels loggerLevel = LogLevels.fromValue("INFO");
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

    public CreateIngestionPipeline withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this ingestion pipeline.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this ingestion pipeline.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateIngestionPipeline withDisplayName(String displayName) {
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

    public CreateIngestionPipeline withDescription(String description) {
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

    public CreateIngestionPipeline withPipelineType(PipelineType pipelineType) {
        this.pipelineType = pipelineType;
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

    public CreateIngestionPipeline withSourceConfig(SourceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
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

    public CreateIngestionPipeline withAirflowConfig(AirflowConfig airflowConfig) {
        this.airflowConfig = airflowConfig;
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

    public CreateIngestionPipeline withLoggerLevel(LogLevels loggerLevel) {
        this.loggerLevel = loggerLevel;
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

    public CreateIngestionPipeline withService(EntityReference service) {
        this.service = service;
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

    public CreateIngestionPipeline withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateIngestionPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("sourceConfig");
        sb.append('=');
        sb.append(((this.sourceConfig == null)?"<null>":this.sourceConfig));
        sb.append(',');
        sb.append("airflowConfig");
        sb.append('=');
        sb.append(((this.airflowConfig == null)?"<null>":this.airflowConfig));
        sb.append(',');
        sb.append("loggerLevel");
        sb.append('=');
        sb.append(((this.loggerLevel == null)?"<null>":this.loggerLevel));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
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
        result = ((result* 31)+((this.sourceConfig == null)? 0 :this.sourceConfig.hashCode()));
        result = ((result* 31)+((this.airflowConfig == null)? 0 :this.airflowConfig.hashCode()));
        result = ((result* 31)+((this.loggerLevel == null)? 0 :this.loggerLevel.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.pipelineType == null)? 0 :this.pipelineType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateIngestionPipeline) == false) {
            return false;
        }
        CreateIngestionPipeline rhs = ((CreateIngestionPipeline) other);
        return ((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.sourceConfig == rhs.sourceConfig)||((this.sourceConfig!= null)&&this.sourceConfig.equals(rhs.sourceConfig))))&&((this.airflowConfig == rhs.airflowConfig)||((this.airflowConfig!= null)&&this.airflowConfig.equals(rhs.airflowConfig))))&&((this.loggerLevel == rhs.loggerLevel)||((this.loggerLevel!= null)&&this.loggerLevel.equals(rhs.loggerLevel))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.pipelineType == rhs.pipelineType)||((this.pipelineType!= null)&&this.pipelineType.equals(rhs.pipelineType))));
    }

}
