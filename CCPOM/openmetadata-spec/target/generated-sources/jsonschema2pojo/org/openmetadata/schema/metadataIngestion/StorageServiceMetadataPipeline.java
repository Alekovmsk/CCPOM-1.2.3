
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
import org.openmetadata.annotations.MaskedField;


/**
 * StorageServiceMetadataPipeline
 * <p>
 * StorageService Metadata Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "containerFilterPattern",
    "storageMetadataConfigSource"
})
@Generated("jsonschema2pojo")
public class StorageServiceMetadataPipeline {

    /**
     * Object Store Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Object Store Source Config Metadata Pipeline type")
    private StorageServiceMetadataPipeline.StorageMetadataConfigType type = StorageServiceMetadataPipeline.StorageMetadataConfigType.fromValue("StorageMetadata");
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("containerFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern containerFilterPattern;
    /**
     * Storage Metadata Configuration Source
     * <p>
     * 
     * 
     */
    @JsonProperty("storageMetadataConfigSource")
    @MaskedField
    private Object storageMetadataConfigSource;

    /**
     * Object Store Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public StorageServiceMetadataPipeline.StorageMetadataConfigType getType() {
        return type;
    }

    /**
     * Object Store Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public void setType(StorageServiceMetadataPipeline.StorageMetadataConfigType type) {
        this.type = type;
    }

    public StorageServiceMetadataPipeline withType(StorageServiceMetadataPipeline.StorageMetadataConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("containerFilterPattern")
    public FilterPattern getContainerFilterPattern() {
        return containerFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("containerFilterPattern")
    public void setContainerFilterPattern(FilterPattern containerFilterPattern) {
        this.containerFilterPattern = containerFilterPattern;
    }

    public StorageServiceMetadataPipeline withContainerFilterPattern(FilterPattern containerFilterPattern) {
        this.containerFilterPattern = containerFilterPattern;
        return this;
    }

    /**
     * Storage Metadata Configuration Source
     * <p>
     * 
     * 
     */
    @JsonProperty("storageMetadataConfigSource")
    @MaskedField
    public Object getStorageMetadataConfigSource() {
        return storageMetadataConfigSource;
    }

    /**
     * Storage Metadata Configuration Source
     * <p>
     * 
     * 
     */
    @JsonProperty("storageMetadataConfigSource")
    @MaskedField
    public void setStorageMetadataConfigSource(Object storageMetadataConfigSource) {
        this.storageMetadataConfigSource = storageMetadataConfigSource;
    }

    public StorageServiceMetadataPipeline withStorageMetadataConfigSource(Object storageMetadataConfigSource) {
        this.storageMetadataConfigSource = storageMetadataConfigSource;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StorageServiceMetadataPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("containerFilterPattern");
        sb.append('=');
        sb.append(((this.containerFilterPattern == null)?"<null>":this.containerFilterPattern));
        sb.append(',');
        sb.append("storageMetadataConfigSource");
        sb.append('=');
        sb.append(((this.storageMetadataConfigSource == null)?"<null>":this.storageMetadataConfigSource));
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
        result = ((result* 31)+((this.containerFilterPattern == null)? 0 :this.containerFilterPattern.hashCode()));
        result = ((result* 31)+((this.storageMetadataConfigSource == null)? 0 :this.storageMetadataConfigSource.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageServiceMetadataPipeline) == false) {
            return false;
        }
        StorageServiceMetadataPipeline rhs = ((StorageServiceMetadataPipeline) other);
        return ((((this.containerFilterPattern == rhs.containerFilterPattern)||((this.containerFilterPattern!= null)&&this.containerFilterPattern.equals(rhs.containerFilterPattern)))&&((this.storageMetadataConfigSource == rhs.storageMetadataConfigSource)||((this.storageMetadataConfigSource!= null)&&this.storageMetadataConfigSource.equals(rhs.storageMetadataConfigSource))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Object Store Source Config Metadata Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum StorageMetadataConfigType {

        STORAGE_METADATA("StorageMetadata");
        private final String value;
        private final static Map<String, StorageServiceMetadataPipeline.StorageMetadataConfigType> CONSTANTS = new HashMap<String, StorageServiceMetadataPipeline.StorageMetadataConfigType>();

        static {
            for (StorageServiceMetadataPipeline.StorageMetadataConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        StorageMetadataConfigType(String value) {
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
        public static StorageServiceMetadataPipeline.StorageMetadataConfigType fromValue(String value) {
            StorageServiceMetadataPipeline.StorageMetadataConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
