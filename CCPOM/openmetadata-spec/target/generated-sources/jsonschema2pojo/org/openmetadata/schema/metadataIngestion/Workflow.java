
package org.openmetadata.schema.metadataIngestion;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MetadataWorkflow
 * <p>
 * OpenMetadata Ingestion Framework definition.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "openMetadataWorkflowConfig"
})
@Generated("jsonschema2pojo")
public class Workflow {

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()%]+$")
    @Size(min = 1, max = 128)
    private String name;
    /**
     * OpenMetadata Ingestion Workflow Config.
     * 
     */
    @JsonProperty("openMetadataWorkflowConfig")
    @JsonPropertyDescription("OpenMetadata Ingestion Workflow Config.")
    @Valid
    private OpenMetadataWorkflowConfig openMetadataWorkflowConfig;

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

    public Workflow withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Workflow withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * OpenMetadata Ingestion Workflow Config.
     * 
     */
    @JsonProperty("openMetadataWorkflowConfig")
    public OpenMetadataWorkflowConfig getOpenMetadataWorkflowConfig() {
        return openMetadataWorkflowConfig;
    }

    /**
     * OpenMetadata Ingestion Workflow Config.
     * 
     */
    @JsonProperty("openMetadataWorkflowConfig")
    public void setOpenMetadataWorkflowConfig(OpenMetadataWorkflowConfig openMetadataWorkflowConfig) {
        this.openMetadataWorkflowConfig = openMetadataWorkflowConfig;
    }

    public Workflow withOpenMetadataWorkflowConfig(OpenMetadataWorkflowConfig openMetadataWorkflowConfig) {
        this.openMetadataWorkflowConfig = openMetadataWorkflowConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Workflow.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("openMetadataWorkflowConfig");
        sb.append('=');
        sb.append(((this.openMetadataWorkflowConfig == null)?"<null>":this.openMetadataWorkflowConfig));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.openMetadataWorkflowConfig == null)? 0 :this.openMetadataWorkflowConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Workflow) == false) {
            return false;
        }
        Workflow rhs = ((Workflow) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.openMetadataWorkflowConfig == rhs.openMetadataWorkflowConfig)||((this.openMetadataWorkflowConfig!= null)&&this.openMetadataWorkflowConfig.equals(rhs.openMetadataWorkflowConfig))));
    }

}
