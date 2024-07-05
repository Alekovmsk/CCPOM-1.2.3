
package org.openmetadata.schema.system;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadata.schema.type.IndexMappingLanguage;


/**
 * EventPublisherResult
 * <p>
 * This schema defines Event Publisher Job.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "timestamp",
    "status",
    "failure",
    "stats",
    "entities",
    "recreateIndex",
    "batchSize",
    "searchIndexMappingLanguage",
    "afterCursor"
})
@Generated("jsonschema2pojo")
public class EventPublisherJob {

    /**
     * Name of the result
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the result")
    private String name;
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
     * This schema publisher run job status.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("This schema publisher run job status.")
    @NotNull
    private EventPublisherJob.Status status;
    /**
     * List of Failures in the Job
     * 
     */
    @JsonProperty("failure")
    @JsonPropertyDescription("List of Failures in the Job")
    @Valid
    private Failure failure;
    @JsonProperty("stats")
    @Valid
    private Stats stats;
    /**
     * List of Entities to Reindex
     * 
     */
    @JsonProperty("entities")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of Entities to Reindex")
    @Valid
    private Set<String> entities = new LinkedHashSet<String>();
    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("recreateIndex")
    @JsonPropertyDescription("This schema publisher run modes.")
    private Boolean recreateIndex;
    /**
     * Maximum number of events sent in a batch (Default 10).
     * 
     */
    @JsonProperty("batchSize")
    @JsonPropertyDescription("Maximum number of events sent in a batch (Default 10).")
    private Integer batchSize;
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

    public EventPublisherJob withName(String name) {
        this.name = name;
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

    public EventPublisherJob withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * This schema publisher run job status.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public EventPublisherJob.Status getStatus() {
        return status;
    }

    /**
     * This schema publisher run job status.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(EventPublisherJob.Status status) {
        this.status = status;
    }

    public EventPublisherJob withStatus(EventPublisherJob.Status status) {
        this.status = status;
        return this;
    }

    /**
     * List of Failures in the Job
     * 
     */
    @JsonProperty("failure")
    public Failure getFailure() {
        return failure;
    }

    /**
     * List of Failures in the Job
     * 
     */
    @JsonProperty("failure")
    public void setFailure(Failure failure) {
        this.failure = failure;
    }

    public EventPublisherJob withFailure(Failure failure) {
        this.failure = failure;
        return this;
    }

    @JsonProperty("stats")
    public Stats getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public EventPublisherJob withStats(Stats stats) {
        this.stats = stats;
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

    public EventPublisherJob withEntities(Set<String> entities) {
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

    public EventPublisherJob withRecreateIndex(Boolean recreateIndex) {
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

    public EventPublisherJob withBatchSize(Integer batchSize) {
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

    public EventPublisherJob withSearchIndexMappingLanguage(IndexMappingLanguage searchIndexMappingLanguage) {
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

    public EventPublisherJob withAfterCursor(String afterCursor) {
        this.afterCursor = afterCursor;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EventPublisherJob.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("failure");
        sb.append('=');
        sb.append(((this.failure == null)?"<null>":this.failure));
        sb.append(',');
        sb.append("stats");
        sb.append('=');
        sb.append(((this.stats == null)?"<null>":this.stats));
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
        result = ((result* 31)+((this.stats == null)? 0 :this.stats.hashCode()));
        result = ((result* 31)+((this.entities == null)? 0 :this.entities.hashCode()));
        result = ((result* 31)+((this.searchIndexMappingLanguage == null)? 0 :this.searchIndexMappingLanguage.hashCode()));
        result = ((result* 31)+((this.failure == null)? 0 :this.failure.hashCode()));
        result = ((result* 31)+((this.afterCursor == null)? 0 :this.afterCursor.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.recreateIndex == null)? 0 :this.recreateIndex.hashCode()));
        result = ((result* 31)+((this.batchSize == null)? 0 :this.batchSize.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventPublisherJob) == false) {
            return false;
        }
        EventPublisherJob rhs = ((EventPublisherJob) other);
        return (((((((((((this.stats == rhs.stats)||((this.stats!= null)&&this.stats.equals(rhs.stats)))&&((this.entities == rhs.entities)||((this.entities!= null)&&this.entities.equals(rhs.entities))))&&((this.searchIndexMappingLanguage == rhs.searchIndexMappingLanguage)||((this.searchIndexMappingLanguage!= null)&&this.searchIndexMappingLanguage.equals(rhs.searchIndexMappingLanguage))))&&((this.failure == rhs.failure)||((this.failure!= null)&&this.failure.equals(rhs.failure))))&&((this.afterCursor == rhs.afterCursor)||((this.afterCursor!= null)&&this.afterCursor.equals(rhs.afterCursor))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.recreateIndex == rhs.recreateIndex)||((this.recreateIndex!= null)&&this.recreateIndex.equals(rhs.recreateIndex))))&&((this.batchSize == rhs.batchSize)||((this.batchSize!= null)&&this.batchSize.equals(rhs.batchSize))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * This schema publisher run job status.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        STARTED("started"),
        RUNNING("running"),
        COMPLETED("completed"),
        FAILED("failed"),
        ACTIVE("active"),
        ACTIVE_ERROR("activeError"),
        STOPPED("stopped"),
        SUCCESS("success");
        private final String value;
        private final static Map<String, EventPublisherJob.Status> CONSTANTS = new HashMap<String, EventPublisherJob.Status>();

        static {
            for (EventPublisherJob.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static EventPublisherJob.Status fromValue(String value) {
            EventPublisherJob.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
