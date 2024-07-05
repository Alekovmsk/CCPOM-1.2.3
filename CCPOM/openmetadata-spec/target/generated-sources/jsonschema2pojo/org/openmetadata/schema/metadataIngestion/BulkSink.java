
package org.openmetadata.schema.metadataIngestion;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.services.connections.metadata.ComponentConfig;


/**
 * Configuration for BulkSink Component in the OpenMetadata Ingestion Framework.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "config"
})
@Generated("jsonschema2pojo")
public class BulkSink {

    /**
     * Type of BulkSink component ex: metadata-usage
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of BulkSink component ex: metadata-usage")
    @NotNull
    private String type;
    /**
     * key/value pairs to pass to workflow component.
     * 
     */
    @JsonProperty("config")
    @JsonPropertyDescription("key/value pairs to pass to workflow component.")
    @Valid
    private ComponentConfig config;

    /**
     * Type of BulkSink component ex: metadata-usage
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type of BulkSink component ex: metadata-usage
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public BulkSink withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * key/value pairs to pass to workflow component.
     * 
     */
    @JsonProperty("config")
    public ComponentConfig getConfig() {
        return config;
    }

    /**
     * key/value pairs to pass to workflow component.
     * 
     */
    @JsonProperty("config")
    public void setConfig(ComponentConfig config) {
        this.config = config;
    }

    public BulkSink withConfig(ComponentConfig config) {
        this.config = config;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BulkSink.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null)?"<null>":this.config));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.config == null)? 0 :this.config.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BulkSink) == false) {
            return false;
        }
        BulkSink rhs = ((BulkSink) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.config == rhs.config)||((this.config!= null)&&this.config.equals(rhs.config))));
    }

}
