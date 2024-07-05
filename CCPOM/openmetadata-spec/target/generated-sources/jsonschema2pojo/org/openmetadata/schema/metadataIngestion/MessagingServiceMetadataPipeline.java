
package org.openmetadata.schema.metadataIngestion;

import java.util.HashMap;
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
 * MessagingServiceMetadataPipeline
 * <p>
 * MessagingService Metadata Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "topicFilterPattern",
    "generateSampleData",
    "markDeletedTopics"
})
@Generated("jsonschema2pojo")
public class MessagingServiceMetadataPipeline {

    /**
     * Messaging Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Messaging Source Config Metadata Pipeline type")
    private MessagingServiceMetadataPipeline.MessagingMetadataConfigType type = MessagingServiceMetadataPipeline.MessagingMetadataConfigType.fromValue("MessagingMetadata");
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("topicFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern topicFilterPattern;
    /**
     * Generate Sample Data
     * <p>
     * Option to turn on/off generating sample data during metadata extraction.
     * 
     */
    @JsonProperty("generateSampleData")
    @JsonPropertyDescription("Option to turn on/off generating sample data during metadata extraction.")
    private Boolean generateSampleData = false;
    /**
     * Mark Deleted Topics
     * <p>
     * Optional configuration to soft delete topics in OpenMetadata if the source topics are deleted. Also, if the topic is deleted, all the associated entities like sample data, lineage, etc., with that topic will be deleted
     * 
     */
    @JsonProperty("markDeletedTopics")
    @JsonPropertyDescription("Optional configuration to soft delete topics in OpenMetadata if the source topics are deleted. Also, if the topic is deleted, all the associated entities like sample data, lineage, etc., with that topic will be deleted")
    private Boolean markDeletedTopics = true;

    /**
     * Messaging Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public MessagingServiceMetadataPipeline.MessagingMetadataConfigType getType() {
        return type;
    }

    /**
     * Messaging Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public void setType(MessagingServiceMetadataPipeline.MessagingMetadataConfigType type) {
        this.type = type;
    }

    public MessagingServiceMetadataPipeline withType(MessagingServiceMetadataPipeline.MessagingMetadataConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("topicFilterPattern")
    public FilterPattern getTopicFilterPattern() {
        return topicFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("topicFilterPattern")
    public void setTopicFilterPattern(FilterPattern topicFilterPattern) {
        this.topicFilterPattern = topicFilterPattern;
    }

    public MessagingServiceMetadataPipeline withTopicFilterPattern(FilterPattern topicFilterPattern) {
        this.topicFilterPattern = topicFilterPattern;
        return this;
    }

    /**
     * Generate Sample Data
     * <p>
     * Option to turn on/off generating sample data during metadata extraction.
     * 
     */
    @JsonProperty("generateSampleData")
    public Boolean getGenerateSampleData() {
        return generateSampleData;
    }

    /**
     * Generate Sample Data
     * <p>
     * Option to turn on/off generating sample data during metadata extraction.
     * 
     */
    @JsonProperty("generateSampleData")
    public void setGenerateSampleData(Boolean generateSampleData) {
        this.generateSampleData = generateSampleData;
    }

    public MessagingServiceMetadataPipeline withGenerateSampleData(Boolean generateSampleData) {
        this.generateSampleData = generateSampleData;
        return this;
    }

    /**
     * Mark Deleted Topics
     * <p>
     * Optional configuration to soft delete topics in OpenMetadata if the source topics are deleted. Also, if the topic is deleted, all the associated entities like sample data, lineage, etc., with that topic will be deleted
     * 
     */
    @JsonProperty("markDeletedTopics")
    public Boolean getMarkDeletedTopics() {
        return markDeletedTopics;
    }

    /**
     * Mark Deleted Topics
     * <p>
     * Optional configuration to soft delete topics in OpenMetadata if the source topics are deleted. Also, if the topic is deleted, all the associated entities like sample data, lineage, etc., with that topic will be deleted
     * 
     */
    @JsonProperty("markDeletedTopics")
    public void setMarkDeletedTopics(Boolean markDeletedTopics) {
        this.markDeletedTopics = markDeletedTopics;
    }

    public MessagingServiceMetadataPipeline withMarkDeletedTopics(Boolean markDeletedTopics) {
        this.markDeletedTopics = markDeletedTopics;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MessagingServiceMetadataPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("topicFilterPattern");
        sb.append('=');
        sb.append(((this.topicFilterPattern == null)?"<null>":this.topicFilterPattern));
        sb.append(',');
        sb.append("generateSampleData");
        sb.append('=');
        sb.append(((this.generateSampleData == null)?"<null>":this.generateSampleData));
        sb.append(',');
        sb.append("markDeletedTopics");
        sb.append('=');
        sb.append(((this.markDeletedTopics == null)?"<null>":this.markDeletedTopics));
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
        result = ((result* 31)+((this.topicFilterPattern == null)? 0 :this.topicFilterPattern.hashCode()));
        result = ((result* 31)+((this.markDeletedTopics == null)? 0 :this.markDeletedTopics.hashCode()));
        result = ((result* 31)+((this.generateSampleData == null)? 0 :this.generateSampleData.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MessagingServiceMetadataPipeline) == false) {
            return false;
        }
        MessagingServiceMetadataPipeline rhs = ((MessagingServiceMetadataPipeline) other);
        return (((((this.topicFilterPattern == rhs.topicFilterPattern)||((this.topicFilterPattern!= null)&&this.topicFilterPattern.equals(rhs.topicFilterPattern)))&&((this.markDeletedTopics == rhs.markDeletedTopics)||((this.markDeletedTopics!= null)&&this.markDeletedTopics.equals(rhs.markDeletedTopics))))&&((this.generateSampleData == rhs.generateSampleData)||((this.generateSampleData!= null)&&this.generateSampleData.equals(rhs.generateSampleData))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Messaging Source Config Metadata Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MessagingMetadataConfigType {

        MESSAGING_METADATA("MessagingMetadata");
        private final String value;
        private final static Map<String, MessagingServiceMetadataPipeline.MessagingMetadataConfigType> CONSTANTS = new HashMap<String, MessagingServiceMetadataPipeline.MessagingMetadataConfigType>();

        static {
            for (MessagingServiceMetadataPipeline.MessagingMetadataConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MessagingMetadataConfigType(String value) {
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
        public static MessagingServiceMetadataPipeline.MessagingMetadataConfigType fromValue(String value) {
            MessagingServiceMetadataPipeline.MessagingMetadataConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
