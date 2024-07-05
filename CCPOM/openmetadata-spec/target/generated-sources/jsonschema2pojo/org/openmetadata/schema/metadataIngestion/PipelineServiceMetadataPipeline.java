
package org.openmetadata.schema.metadataIngestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * PipelineServiceMetadataPipeline
 * <p>
 * PipelineService Metadata Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "includeLineage",
    "includeOwners",
    "pipelineFilterPattern",
    "dbServiceNames",
    "markDeletedPipelines",
    "includeTags"
})
@Generated("jsonschema2pojo")
public class PipelineServiceMetadataPipeline {

    /**
     * Pipeline Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Pipeline Source Config Metadata Pipeline type")
    private PipelineServiceMetadataPipeline.PipelineMetadataConfigType type = PipelineServiceMetadataPipeline.PipelineMetadataConfigType.fromValue("PipelineMetadata");
    /**
     * Include Lineage
     * <p>
     * Optional configuration to turn off fetching lineage from pipelines.
     * 
     */
    @JsonProperty("includeLineage")
    @JsonPropertyDescription("Optional configuration to turn off fetching lineage from pipelines.")
    private Boolean includeLineage = true;
    /**
     * Include Owners
     * <p>
     * Set the 'Include Owners' toggle to control whether to include owners to the ingested entity if the owner email matches with a user stored in the OM server as part of metadata ingestion. If the ingested entity already exists and has an owner, the owner will not be overwritten.
     * 
     */
    @JsonProperty("includeOwners")
    @JsonPropertyDescription("Set the 'Include Owners' toggle to control whether to include owners to the ingested entity if the owner email matches with a user stored in the OM server as part of metadata ingestion. If the ingested entity already exists and has an owner, the owner will not be overwritten.")
    private Boolean includeOwners = true;
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("pipelineFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern pipelineFilterPattern;
    /**
     * Database Service Names List
     * <p>
     * List of Database Service Names for creation of lineage
     * 
     */
    @JsonProperty("dbServiceNames")
    @JsonPropertyDescription("List of Database Service Names for creation of lineage")
    @Valid
    private List<String> dbServiceNames = new ArrayList<String>();
    /**
     * Mark Deleted Pipeline
     * <p>
     * Optional configuration to soft delete Pipelines in OpenMetadata if the source Pipelines are deleted. Also, if the Pipeline is deleted, all the associated entities like lineage, etc., with that Pipeline will be deleted
     * 
     */
    @JsonProperty("markDeletedPipelines")
    @JsonPropertyDescription("Optional configuration to soft delete Pipelines in OpenMetadata if the source Pipelines are deleted. Also, if the Pipeline is deleted, all the associated entities like lineage, etc., with that Pipeline will be deleted")
    private Boolean markDeletedPipelines = true;
    /**
     * Include Tags
     * <p>
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    @JsonPropertyDescription("Optional configuration to toggle the tags ingestion.")
    private Boolean includeTags = true;

    /**
     * Pipeline Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public PipelineServiceMetadataPipeline.PipelineMetadataConfigType getType() {
        return type;
    }

    /**
     * Pipeline Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public void setType(PipelineServiceMetadataPipeline.PipelineMetadataConfigType type) {
        this.type = type;
    }

    public PipelineServiceMetadataPipeline withType(PipelineServiceMetadataPipeline.PipelineMetadataConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Include Lineage
     * <p>
     * Optional configuration to turn off fetching lineage from pipelines.
     * 
     */
    @JsonProperty("includeLineage")
    public Boolean getIncludeLineage() {
        return includeLineage;
    }

    /**
     * Include Lineage
     * <p>
     * Optional configuration to turn off fetching lineage from pipelines.
     * 
     */
    @JsonProperty("includeLineage")
    public void setIncludeLineage(Boolean includeLineage) {
        this.includeLineage = includeLineage;
    }

    public PipelineServiceMetadataPipeline withIncludeLineage(Boolean includeLineage) {
        this.includeLineage = includeLineage;
        return this;
    }

    /**
     * Include Owners
     * <p>
     * Set the 'Include Owners' toggle to control whether to include owners to the ingested entity if the owner email matches with a user stored in the OM server as part of metadata ingestion. If the ingested entity already exists and has an owner, the owner will not be overwritten.
     * 
     */
    @JsonProperty("includeOwners")
    public Boolean getIncludeOwners() {
        return includeOwners;
    }

    /**
     * Include Owners
     * <p>
     * Set the 'Include Owners' toggle to control whether to include owners to the ingested entity if the owner email matches with a user stored in the OM server as part of metadata ingestion. If the ingested entity already exists and has an owner, the owner will not be overwritten.
     * 
     */
    @JsonProperty("includeOwners")
    public void setIncludeOwners(Boolean includeOwners) {
        this.includeOwners = includeOwners;
    }

    public PipelineServiceMetadataPipeline withIncludeOwners(Boolean includeOwners) {
        this.includeOwners = includeOwners;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("pipelineFilterPattern")
    public FilterPattern getPipelineFilterPattern() {
        return pipelineFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("pipelineFilterPattern")
    public void setPipelineFilterPattern(FilterPattern pipelineFilterPattern) {
        this.pipelineFilterPattern = pipelineFilterPattern;
    }

    public PipelineServiceMetadataPipeline withPipelineFilterPattern(FilterPattern pipelineFilterPattern) {
        this.pipelineFilterPattern = pipelineFilterPattern;
        return this;
    }

    /**
     * Database Service Names List
     * <p>
     * List of Database Service Names for creation of lineage
     * 
     */
    @JsonProperty("dbServiceNames")
    public List<String> getDbServiceNames() {
        return dbServiceNames;
    }

    /**
     * Database Service Names List
     * <p>
     * List of Database Service Names for creation of lineage
     * 
     */
    @JsonProperty("dbServiceNames")
    public void setDbServiceNames(List<String> dbServiceNames) {
        this.dbServiceNames = dbServiceNames;
    }

    public PipelineServiceMetadataPipeline withDbServiceNames(List<String> dbServiceNames) {
        this.dbServiceNames = dbServiceNames;
        return this;
    }

    /**
     * Mark Deleted Pipeline
     * <p>
     * Optional configuration to soft delete Pipelines in OpenMetadata if the source Pipelines are deleted. Also, if the Pipeline is deleted, all the associated entities like lineage, etc., with that Pipeline will be deleted
     * 
     */
    @JsonProperty("markDeletedPipelines")
    public Boolean getMarkDeletedPipelines() {
        return markDeletedPipelines;
    }

    /**
     * Mark Deleted Pipeline
     * <p>
     * Optional configuration to soft delete Pipelines in OpenMetadata if the source Pipelines are deleted. Also, if the Pipeline is deleted, all the associated entities like lineage, etc., with that Pipeline will be deleted
     * 
     */
    @JsonProperty("markDeletedPipelines")
    public void setMarkDeletedPipelines(Boolean markDeletedPipelines) {
        this.markDeletedPipelines = markDeletedPipelines;
    }

    public PipelineServiceMetadataPipeline withMarkDeletedPipelines(Boolean markDeletedPipelines) {
        this.markDeletedPipelines = markDeletedPipelines;
        return this;
    }

    /**
     * Include Tags
     * <p>
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    public Boolean getIncludeTags() {
        return includeTags;
    }

    /**
     * Include Tags
     * <p>
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    public void setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
    }

    public PipelineServiceMetadataPipeline withIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PipelineServiceMetadataPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("includeLineage");
        sb.append('=');
        sb.append(((this.includeLineage == null)?"<null>":this.includeLineage));
        sb.append(',');
        sb.append("includeOwners");
        sb.append('=');
        sb.append(((this.includeOwners == null)?"<null>":this.includeOwners));
        sb.append(',');
        sb.append("pipelineFilterPattern");
        sb.append('=');
        sb.append(((this.pipelineFilterPattern == null)?"<null>":this.pipelineFilterPattern));
        sb.append(',');
        sb.append("dbServiceNames");
        sb.append('=');
        sb.append(((this.dbServiceNames == null)?"<null>":this.dbServiceNames));
        sb.append(',');
        sb.append("markDeletedPipelines");
        sb.append('=');
        sb.append(((this.markDeletedPipelines == null)?"<null>":this.markDeletedPipelines));
        sb.append(',');
        sb.append("includeTags");
        sb.append('=');
        sb.append(((this.includeTags == null)?"<null>":this.includeTags));
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
        result = ((result* 31)+((this.pipelineFilterPattern == null)? 0 :this.pipelineFilterPattern.hashCode()));
        result = ((result* 31)+((this.dbServiceNames == null)? 0 :this.dbServiceNames.hashCode()));
        result = ((result* 31)+((this.includeTags == null)? 0 :this.includeTags.hashCode()));
        result = ((result* 31)+((this.includeOwners == null)? 0 :this.includeOwners.hashCode()));
        result = ((result* 31)+((this.includeLineage == null)? 0 :this.includeLineage.hashCode()));
        result = ((result* 31)+((this.markDeletedPipelines == null)? 0 :this.markDeletedPipelines.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PipelineServiceMetadataPipeline) == false) {
            return false;
        }
        PipelineServiceMetadataPipeline rhs = ((PipelineServiceMetadataPipeline) other);
        return ((((((((this.pipelineFilterPattern == rhs.pipelineFilterPattern)||((this.pipelineFilterPattern!= null)&&this.pipelineFilterPattern.equals(rhs.pipelineFilterPattern)))&&((this.dbServiceNames == rhs.dbServiceNames)||((this.dbServiceNames!= null)&&this.dbServiceNames.equals(rhs.dbServiceNames))))&&((this.includeTags == rhs.includeTags)||((this.includeTags!= null)&&this.includeTags.equals(rhs.includeTags))))&&((this.includeOwners == rhs.includeOwners)||((this.includeOwners!= null)&&this.includeOwners.equals(rhs.includeOwners))))&&((this.includeLineage == rhs.includeLineage)||((this.includeLineage!= null)&&this.includeLineage.equals(rhs.includeLineage))))&&((this.markDeletedPipelines == rhs.markDeletedPipelines)||((this.markDeletedPipelines!= null)&&this.markDeletedPipelines.equals(rhs.markDeletedPipelines))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Pipeline Source Config Metadata Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PipelineMetadataConfigType {

        PIPELINE_METADATA("PipelineMetadata");
        private final String value;
        private final static Map<String, PipelineServiceMetadataPipeline.PipelineMetadataConfigType> CONSTANTS = new HashMap<String, PipelineServiceMetadataPipeline.PipelineMetadataConfigType>();

        static {
            for (PipelineServiceMetadataPipeline.PipelineMetadataConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PipelineMetadataConfigType(String value) {
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
        public static PipelineServiceMetadataPipeline.PipelineMetadataConfigType fromValue(String value) {
            PipelineServiceMetadataPipeline.PipelineMetadataConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
