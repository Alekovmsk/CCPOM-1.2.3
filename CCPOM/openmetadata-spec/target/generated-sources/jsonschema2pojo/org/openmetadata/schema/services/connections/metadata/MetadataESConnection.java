
package org.openmetadata.schema.services.connections.metadata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadata.schema.type.IndexMappingLanguage;


/**
 * MetadataESConnection
 * <p>
 * Metadata to ElasticSearch Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "entities",
    "recreateIndex",
    "runMode",
    "searchIndexMappingLanguage",
    "batchSize",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class MetadataESConnection {

    /**
     * Metadata to Elastic Search type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Metadata to Elastic Search type")
    private MetadataESConnection.MetadataESType type = MetadataESConnection.MetadataESType.fromValue("MetadataES");
    /**
     * Entities
     * <p>
     * List of entities that you need to reindex
     * 
     */
    @JsonProperty("entities")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of entities that you need to reindex")
    @Valid
    private Set<String> entities = new LinkedHashSet<String>(Arrays.asList("table", "topic", "dashboard", "pipeline", "mlmodel", "user", "team", "glossaryTerm", "tag", "entityReportData", "webAnalyticEntityViewReportData", "webAnalyticUserActivityReportData", "container", "query"));
    /**
     * Recreate Indexes
     * <p>
     * 
     * 
     */
    @JsonProperty("recreateIndex")
    private Boolean recreateIndex = true;
    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("runMode")
    @JsonPropertyDescription("This schema publisher run modes.")
    private org.openmetadata.schema.api.CreateEventPublisherJob.RunMode runMode;
    /**
     * This schema defines the language options available for search index mappings.
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    @JsonPropertyDescription("This schema defines the language options available for search index mappings.")
    private IndexMappingLanguage searchIndexMappingLanguage = IndexMappingLanguage.fromValue("EN");
    /**
     * Batch Size
     * <p>
     * Maximum number of events sentx in a batch (Default 10).
     * 
     */
    @JsonProperty("batchSize")
    @JsonPropertyDescription("Maximum number of events sentx in a batch (Default 10).")
    private Integer batchSize = 100;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Metadata to Elastic Search type
     * 
     */
    @JsonProperty("type")
    public MetadataESConnection.MetadataESType getType() {
        return type;
    }

    /**
     * Metadata to Elastic Search type
     * 
     */
    @JsonProperty("type")
    public void setType(MetadataESConnection.MetadataESType type) {
        this.type = type;
    }

    public MetadataESConnection withType(MetadataESConnection.MetadataESType type) {
        this.type = type;
        return this;
    }

    /**
     * Entities
     * <p>
     * List of entities that you need to reindex
     * 
     */
    @JsonProperty("entities")
    public Set<String> getEntities() {
        return entities;
    }

    /**
     * Entities
     * <p>
     * List of entities that you need to reindex
     * 
     */
    @JsonProperty("entities")
    public void setEntities(Set<String> entities) {
        this.entities = entities;
    }

    public MetadataESConnection withEntities(Set<String> entities) {
        this.entities = entities;
        return this;
    }

    /**
     * Recreate Indexes
     * <p>
     * 
     * 
     */
    @JsonProperty("recreateIndex")
    public Boolean getRecreateIndex() {
        return recreateIndex;
    }

    /**
     * Recreate Indexes
     * <p>
     * 
     * 
     */
    @JsonProperty("recreateIndex")
    public void setRecreateIndex(Boolean recreateIndex) {
        this.recreateIndex = recreateIndex;
    }

    public MetadataESConnection withRecreateIndex(Boolean recreateIndex) {
        this.recreateIndex = recreateIndex;
        return this;
    }

    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("runMode")
    public org.openmetadata.schema.api.CreateEventPublisherJob.RunMode getRunMode() {
        return runMode;
    }

    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("runMode")
    public void setRunMode(org.openmetadata.schema.api.CreateEventPublisherJob.RunMode runMode) {
        this.runMode = runMode;
    }

    public MetadataESConnection withRunMode(org.openmetadata.schema.api.CreateEventPublisherJob.RunMode runMode) {
        this.runMode = runMode;
        return this;
    }

    /**
     * This schema defines the language options available for search index mappings.
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    public IndexMappingLanguage getSearchIndexMappingLanguage() {
        return searchIndexMappingLanguage;
    }

    /**
     * This schema defines the language options available for search index mappings.
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    public void setSearchIndexMappingLanguage(IndexMappingLanguage searchIndexMappingLanguage) {
        this.searchIndexMappingLanguage = searchIndexMappingLanguage;
    }

    public MetadataESConnection withSearchIndexMappingLanguage(IndexMappingLanguage searchIndexMappingLanguage) {
        this.searchIndexMappingLanguage = searchIndexMappingLanguage;
        return this;
    }

    /**
     * Batch Size
     * <p>
     * Maximum number of events sentx in a batch (Default 10).
     * 
     */
    @JsonProperty("batchSize")
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Batch Size
     * <p>
     * Maximum number of events sentx in a batch (Default 10).
     * 
     */
    @JsonProperty("batchSize")
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public MetadataESConnection withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public Boolean getSupportsMetadataExtraction() {
        return supportsMetadataExtraction;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public void setSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
    }

    public MetadataESConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MetadataESConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("entities");
        sb.append('=');
        sb.append(((this.entities == null)?"<null>":this.entities));
        sb.append(',');
        sb.append("recreateIndex");
        sb.append('=');
        sb.append(((this.recreateIndex == null)?"<null>":this.recreateIndex));
        sb.append(',');
        sb.append("runMode");
        sb.append('=');
        sb.append(((this.runMode == null)?"<null>":this.runMode));
        sb.append(',');
        sb.append("searchIndexMappingLanguage");
        sb.append('=');
        sb.append(((this.searchIndexMappingLanguage == null)?"<null>":this.searchIndexMappingLanguage));
        sb.append(',');
        sb.append("batchSize");
        sb.append('=');
        sb.append(((this.batchSize == null)?"<null>":this.batchSize));
        sb.append(',');
        sb.append("supportsMetadataExtraction");
        sb.append('=');
        sb.append(((this.supportsMetadataExtraction == null)?"<null>":this.supportsMetadataExtraction));
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
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.entities == null)? 0 :this.entities.hashCode()));
        result = ((result* 31)+((this.searchIndexMappingLanguage == null)? 0 :this.searchIndexMappingLanguage.hashCode()));
        result = ((result* 31)+((this.recreateIndex == null)? 0 :this.recreateIndex.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.batchSize == null)? 0 :this.batchSize.hashCode()));
        result = ((result* 31)+((this.runMode == null)? 0 :this.runMode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetadataESConnection) == false) {
            return false;
        }
        MetadataESConnection rhs = ((MetadataESConnection) other);
        return ((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.entities == rhs.entities)||((this.entities!= null)&&this.entities.equals(rhs.entities))))&&((this.searchIndexMappingLanguage == rhs.searchIndexMappingLanguage)||((this.searchIndexMappingLanguage!= null)&&this.searchIndexMappingLanguage.equals(rhs.searchIndexMappingLanguage))))&&((this.recreateIndex == rhs.recreateIndex)||((this.recreateIndex!= null)&&this.recreateIndex.equals(rhs.recreateIndex))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.batchSize == rhs.batchSize)||((this.batchSize!= null)&&this.batchSize.equals(rhs.batchSize))))&&((this.runMode == rhs.runMode)||((this.runMode!= null)&&this.runMode.equals(rhs.runMode))));
    }


    /**
     * Metadata to Elastic Search type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MetadataESType {

        METADATA_ES("MetadataES");
        private final String value;
        private final static Map<String, MetadataESConnection.MetadataESType> CONSTANTS = new HashMap<String, MetadataESConnection.MetadataESType>();

        static {
            for (MetadataESConnection.MetadataESType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MetadataESType(String value) {
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
        public static MetadataESConnection.MetadataESType fromValue(String value) {
            MetadataESConnection.MetadataESType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
