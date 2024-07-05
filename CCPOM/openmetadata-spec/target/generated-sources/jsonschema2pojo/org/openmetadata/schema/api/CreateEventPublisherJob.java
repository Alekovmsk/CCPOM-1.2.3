
package org.openmetadata.schema.api;

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
 * CreateEventPublisherJob
 * <p>
 * This schema defines Event Publisher Run Result.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "publisherType",
    "runMode",
    "entities",
    "recreateIndex",
    "batchSize",
    "searchIndexMappingLanguage",
    "afterCursor"
})
@Generated("jsonschema2pojo")
public class CreateEventPublisherJob {

    /**
     * Name of the result
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the result")
    private String name;
    /**
     * This schema event Publisher Types
     * 
     */
    @JsonProperty("publisherType")
    @JsonPropertyDescription("This schema event Publisher Types")
    private CreateEventPublisherJob.PublisherType publisherType;
    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("runMode")
    @JsonPropertyDescription("This schema publisher run modes.")
    private CreateEventPublisherJob.RunMode runMode;
    /**
     * List of Entities to Reindex
     * 
     */
    @JsonProperty("entities")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of Entities to Reindex")
    @Valid
    private Set<String> entities = new LinkedHashSet<String>(Arrays.asList("all"));
    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("recreateIndex")
    @JsonPropertyDescription("This schema publisher run modes.")
    private Boolean recreateIndex = false;
    /**
     * Maximum number of events sent in a batch (Default 10).
     * 
     */
    @JsonProperty("batchSize")
    @JsonPropertyDescription("Maximum number of events sent in a batch (Default 10).")
    private Integer batchSize = 100;
    /**
     * This schema defines the language options available for search index mappings.
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    @JsonPropertyDescription("This schema defines the language options available for search index mappings.")
    private IndexMappingLanguage searchIndexMappingLanguage = IndexMappingLanguage.fromValue("EN");
    /**
     * Provide After in case of failure to start reindexing after the issue is solved
     * 
     */
    @JsonProperty("afterCursor")
    @JsonPropertyDescription("Provide After in case of failure to start reindexing after the issue is solved")
    private String afterCursor;

    /**
     * Name of the result
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the result
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreateEventPublisherJob withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * This schema event Publisher Types
     * 
     */
    @JsonProperty("publisherType")
    public CreateEventPublisherJob.PublisherType getPublisherType() {
        return publisherType;
    }

    /**
     * This schema event Publisher Types
     * 
     */
    @JsonProperty("publisherType")
    public void setPublisherType(CreateEventPublisherJob.PublisherType publisherType) {
        this.publisherType = publisherType;
    }

    public CreateEventPublisherJob withPublisherType(CreateEventPublisherJob.PublisherType publisherType) {
        this.publisherType = publisherType;
        return this;
    }

    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("runMode")
    public CreateEventPublisherJob.RunMode getRunMode() {
        return runMode;
    }

    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("runMode")
    public void setRunMode(CreateEventPublisherJob.RunMode runMode) {
        this.runMode = runMode;
    }

    public CreateEventPublisherJob withRunMode(CreateEventPublisherJob.RunMode runMode) {
        this.runMode = runMode;
        return this;
    }

    /**
     * List of Entities to Reindex
     * 
     */
    @JsonProperty("entities")
    public Set<String> getEntities() {
        return entities;
    }

    /**
     * List of Entities to Reindex
     * 
     */
    @JsonProperty("entities")
    public void setEntities(Set<String> entities) {
        this.entities = entities;
    }

    public CreateEventPublisherJob withEntities(Set<String> entities) {
        this.entities = entities;
        return this;
    }

    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("recreateIndex")
    public Boolean getRecreateIndex() {
        return recreateIndex;
    }

    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("recreateIndex")
    public void setRecreateIndex(Boolean recreateIndex) {
        this.recreateIndex = recreateIndex;
    }

    public CreateEventPublisherJob withRecreateIndex(Boolean recreateIndex) {
        this.recreateIndex = recreateIndex;
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

    public CreateEventPublisherJob withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
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

    public CreateEventPublisherJob withSearchIndexMappingLanguage(IndexMappingLanguage searchIndexMappingLanguage) {
        this.searchIndexMappingLanguage = searchIndexMappingLanguage;
        return this;
    }

    /**
     * Provide After in case of failure to start reindexing after the issue is solved
     * 
     */
    @JsonProperty("afterCursor")
    public String getAfterCursor() {
        return afterCursor;
    }

    /**
     * Provide After in case of failure to start reindexing after the issue is solved
     * 
     */
    @JsonProperty("afterCursor")
    public void setAfterCursor(String afterCursor) {
        this.afterCursor = afterCursor;
    }

    public CreateEventPublisherJob withAfterCursor(String afterCursor) {
        this.afterCursor = afterCursor;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateEventPublisherJob.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("publisherType");
        sb.append('=');
        sb.append(((this.publisherType == null)?"<null>":this.publisherType));
        sb.append(',');
        sb.append("runMode");
        sb.append('=');
        sb.append(((this.runMode == null)?"<null>":this.runMode));
        sb.append(',');
        sb.append("entities");
        sb.append('=');
        sb.append(((this.entities == null)?"<null>":this.entities));
        sb.append(',');
        sb.append("recreateIndex");
        sb.append('=');
        sb.append(((this.recreateIndex == null)?"<null>":this.recreateIndex));
        sb.append(',');
        sb.append("batchSize");
        sb.append('=');
        sb.append(((this.batchSize == null)?"<null>":this.batchSize));
        sb.append(',');
        sb.append("searchIndexMappingLanguage");
        sb.append('=');
        sb.append(((this.searchIndexMappingLanguage == null)?"<null>":this.searchIndexMappingLanguage));
        sb.append(',');
        sb.append("afterCursor");
        sb.append('=');
        sb.append(((this.afterCursor == null)?"<null>":this.afterCursor));
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
        result = ((result* 31)+((this.publisherType == null)? 0 :this.publisherType.hashCode()));
        result = ((result* 31)+((this.entities == null)? 0 :this.entities.hashCode()));
        result = ((result* 31)+((this.searchIndexMappingLanguage == null)? 0 :this.searchIndexMappingLanguage.hashCode()));
        result = ((result* 31)+((this.afterCursor == null)? 0 :this.afterCursor.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.recreateIndex == null)? 0 :this.recreateIndex.hashCode()));
        result = ((result* 31)+((this.batchSize == null)? 0 :this.batchSize.hashCode()));
        result = ((result* 31)+((this.runMode == null)? 0 :this.runMode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateEventPublisherJob) == false) {
            return false;
        }
        CreateEventPublisherJob rhs = ((CreateEventPublisherJob) other);
        return (((((((((this.publisherType == rhs.publisherType)||((this.publisherType!= null)&&this.publisherType.equals(rhs.publisherType)))&&((this.entities == rhs.entities)||((this.entities!= null)&&this.entities.equals(rhs.entities))))&&((this.searchIndexMappingLanguage == rhs.searchIndexMappingLanguage)||((this.searchIndexMappingLanguage!= null)&&this.searchIndexMappingLanguage.equals(rhs.searchIndexMappingLanguage))))&&((this.afterCursor == rhs.afterCursor)||((this.afterCursor!= null)&&this.afterCursor.equals(rhs.afterCursor))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.recreateIndex == rhs.recreateIndex)||((this.recreateIndex!= null)&&this.recreateIndex.equals(rhs.recreateIndex))))&&((this.batchSize == rhs.batchSize)||((this.batchSize!= null)&&this.batchSize.equals(rhs.batchSize))))&&((this.runMode == rhs.runMode)||((this.runMode!= null)&&this.runMode.equals(rhs.runMode))));
    }


    /**
     * This schema event Publisher Types
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PublisherType {

        ELASTIC_SEARCH("elasticSearch"),
        KAFKA("kafka");
        private final String value;
        private final static Map<String, CreateEventPublisherJob.PublisherType> CONSTANTS = new HashMap<String, CreateEventPublisherJob.PublisherType>();

        static {
            for (CreateEventPublisherJob.PublisherType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PublisherType(String value) {
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
        public static CreateEventPublisherJob.PublisherType fromValue(String value) {
            CreateEventPublisherJob.PublisherType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * This schema publisher run modes.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RunMode {

        STREAM("stream"),
        BATCH("batch");
        private final String value;
        private final static Map<String, CreateEventPublisherJob.RunMode> CONSTANTS = new HashMap<String, CreateEventPublisherJob.RunMode>();

        static {
            for (CreateEventPublisherJob.RunMode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RunMode(String value) {
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
        public static CreateEventPublisherJob.RunMode fromValue(String value) {
            CreateEventPublisherJob.RunMode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
