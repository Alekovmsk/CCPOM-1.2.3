
package org.openmetadata.schema.metadataIngestion;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OpenMetadata Ingestion Workflow Config.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "source",
    "processor",
    "sink",
    "stage",
    "bulkSink",
    "workflowConfig",
    "ingestionPipelineFQN",
    "pipelineRunId"
})
@Generated("jsonschema2pojo")
public class OpenMetadataWorkflowConfig {

    /**
     * Configuration for Source component in OpenMetadata Ingestion Framework.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Configuration for Source component in OpenMetadata Ingestion Framework.")
    @Valid
    @NotNull
    private Source source;
    /**
     * Configuration for Processor Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("processor")
    @JsonPropertyDescription("Configuration for Processor Component in the OpenMetadata Ingestion Framework.")
    @Valid
    private Processor processor;
    /**
     * Configuration for Sink Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("sink")
    @JsonPropertyDescription("Configuration for Sink Component in the OpenMetadata Ingestion Framework.")
    @Valid
    private Sink sink;
    /**
     * Configuration for Stage Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("stage")
    @JsonPropertyDescription("Configuration for Stage Component in the OpenMetadata Ingestion Framework.")
    @Valid
    private Stage stage;
    /**
     * Configuration for BulkSink Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("bulkSink")
    @JsonPropertyDescription("Configuration for BulkSink Component in the OpenMetadata Ingestion Framework.")
    @Valid
    private BulkSink bulkSink;
    /**
     * Configuration for the entire Ingestion Workflow.
     * (Required)
     * 
     */
    @JsonProperty("workflowConfig")
    @JsonPropertyDescription("Configuration for the entire Ingestion Workflow.")
    @Valid
    @NotNull
    private WorkflowConfig workflowConfig;
    /**
     * Fully qualified name of ingestion pipeline, used to identify the current ingestion pipeline
     * 
     */
    @JsonProperty("ingestionPipelineFQN")
    @JsonPropertyDescription("Fully qualified name of ingestion pipeline, used to identify the current ingestion pipeline")
    private String ingestionPipelineFQN;
    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("pipelineRunId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID pipelineRunId;

    /**
     * Configuration for Source component in OpenMetadata Ingestion Framework.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    /**
     * Configuration for Source component in OpenMetadata Ingestion Framework.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    public OpenMetadataWorkflowConfig withSource(Source source) {
        this.source = source;
        return this;
    }

    /**
     * Configuration for Processor Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("processor")
    public Processor getProcessor() {
        return processor;
    }

    /**
     * Configuration for Processor Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("processor")
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public OpenMetadataWorkflowConfig withProcessor(Processor processor) {
        this.processor = processor;
        return this;
    }

    /**
     * Configuration for Sink Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("sink")
    public Sink getSink() {
        return sink;
    }

    /**
     * Configuration for Sink Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("sink")
    public void setSink(Sink sink) {
        this.sink = sink;
    }

    public OpenMetadataWorkflowConfig withSink(Sink sink) {
        this.sink = sink;
        return this;
    }

    /**
     * Configuration for Stage Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("stage")
    public Stage getStage() {
        return stage;
    }

    /**
     * Configuration for Stage Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("stage")
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public OpenMetadataWorkflowConfig withStage(Stage stage) {
        this.stage = stage;
        return this;
    }

    /**
     * Configuration for BulkSink Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("bulkSink")
    public BulkSink getBulkSink() {
        return bulkSink;
    }

    /**
     * Configuration for BulkSink Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("bulkSink")
    public void setBulkSink(BulkSink bulkSink) {
        this.bulkSink = bulkSink;
    }

    public OpenMetadataWorkflowConfig withBulkSink(BulkSink bulkSink) {
        this.bulkSink = bulkSink;
        return this;
    }

    /**
     * Configuration for the entire Ingestion Workflow.
     * (Required)
     * 
     */
    @JsonProperty("workflowConfig")
    public WorkflowConfig getWorkflowConfig() {
        return workflowConfig;
    }

    /**
     * Configuration for the entire Ingestion Workflow.
     * (Required)
     * 
     */
    @JsonProperty("workflowConfig")
    public void setWorkflowConfig(WorkflowConfig workflowConfig) {
        this.workflowConfig = workflowConfig;
    }

    public OpenMetadataWorkflowConfig withWorkflowConfig(WorkflowConfig workflowConfig) {
        this.workflowConfig = workflowConfig;
        return this;
    }

    /**
     * Fully qualified name of ingestion pipeline, used to identify the current ingestion pipeline
     * 
     */
    @JsonProperty("ingestionPipelineFQN")
    public String getIngestionPipelineFQN() {
        return ingestionPipelineFQN;
    }

    /**
     * Fully qualified name of ingestion pipeline, used to identify the current ingestion pipeline
     * 
     */
    @JsonProperty("ingestionPipelineFQN")
    public void setIngestionPipelineFQN(String ingestionPipelineFQN) {
        this.ingestionPipelineFQN = ingestionPipelineFQN;
    }

    public OpenMetadataWorkflowConfig withIngestionPipelineFQN(String ingestionPipelineFQN) {
        this.ingestionPipelineFQN = ingestionPipelineFQN;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("pipelineRunId")
    public UUID getPipelineRunId() {
        return pipelineRunId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("pipelineRunId")
    public void setPipelineRunId(UUID pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
    }

    public OpenMetadataWorkflowConfig withPipelineRunId(UUID pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenMetadataWorkflowConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("processor");
        sb.append('=');
        sb.append(((this.processor == null)?"<null>":this.processor));
        sb.append(',');
        sb.append("sink");
        sb.append('=');
        sb.append(((this.sink == null)?"<null>":this.sink));
        sb.append(',');
        sb.append("stage");
        sb.append('=');
        sb.append(((this.stage == null)?"<null>":this.stage));
        sb.append(',');
        sb.append("bulkSink");
        sb.append('=');
        sb.append(((this.bulkSink == null)?"<null>":this.bulkSink));
        sb.append(',');
        sb.append("workflowConfig");
        sb.append('=');
        sb.append(((this.workflowConfig == null)?"<null>":this.workflowConfig));
        sb.append(',');
        sb.append("ingestionPipelineFQN");
        sb.append('=');
        sb.append(((this.ingestionPipelineFQN == null)?"<null>":this.ingestionPipelineFQN));
        sb.append(',');
        sb.append("pipelineRunId");
        sb.append('=');
        sb.append(((this.pipelineRunId == null)?"<null>":this.pipelineRunId));
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
        result = ((result* 31)+((this.stage == null)? 0 :this.stage.hashCode()));
        result = ((result* 31)+((this.sink == null)? 0 :this.sink.hashCode()));
        result = ((result* 31)+((this.bulkSink == null)? 0 :this.bulkSink.hashCode()));
        result = ((result* 31)+((this.pipelineRunId == null)? 0 :this.pipelineRunId.hashCode()));
        result = ((result* 31)+((this.workflowConfig == null)? 0 :this.workflowConfig.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.ingestionPipelineFQN == null)? 0 :this.ingestionPipelineFQN.hashCode()));
        result = ((result* 31)+((this.processor == null)? 0 :this.processor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenMetadataWorkflowConfig) == false) {
            return false;
        }
        OpenMetadataWorkflowConfig rhs = ((OpenMetadataWorkflowConfig) other);
        return (((((((((this.stage == rhs.stage)||((this.stage!= null)&&this.stage.equals(rhs.stage)))&&((this.sink == rhs.sink)||((this.sink!= null)&&this.sink.equals(rhs.sink))))&&((this.bulkSink == rhs.bulkSink)||((this.bulkSink!= null)&&this.bulkSink.equals(rhs.bulkSink))))&&((this.pipelineRunId == rhs.pipelineRunId)||((this.pipelineRunId!= null)&&this.pipelineRunId.equals(rhs.pipelineRunId))))&&((this.workflowConfig == rhs.workflowConfig)||((this.workflowConfig!= null)&&this.workflowConfig.equals(rhs.workflowConfig))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.ingestionPipelineFQN == rhs.ingestionPipelineFQN)||((this.ingestionPipelineFQN!= null)&&this.ingestionPipelineFQN.equals(rhs.ingestionPipelineFQN))))&&((this.processor == rhs.processor)||((this.processor!= null)&&this.processor.equals(rhs.processor))));
    }

}
