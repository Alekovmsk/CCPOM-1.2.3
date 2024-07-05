
package org.openmetadata.schema.metadataIngestion;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.services.connections.metadata.ComponentConfig;
import org.openmetadata.schema.services.connections.metadata.OpenMetadataConnection;


/**
 * Configuration for the entire Ingestion Workflow.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "loggerLevel",
    "openMetadataServerConfig",
    "config"
})
@Generated("jsonschema2pojo")
public class WorkflowConfig {

    /**
     * Supported logging levels
     * 
     */
    @JsonProperty("loggerLevel")
    @JsonPropertyDescription("Supported logging levels")
    private LogLevels loggerLevel = LogLevels.fromValue("INFO");
    /**
     * OpenMetadataConnection
     * <p>
     * OpenMetadata Connection Config
     * (Required)
     * 
     */
    @JsonProperty("openMetadataServerConfig")
    @JsonPropertyDescription("OpenMetadata Connection Config")
    @Valid
    @NotNull
    private OpenMetadataConnection openMetadataServerConfig;
    /**
     * key/value pairs to pass to workflow component.
     * 
     */
    @JsonProperty("config")
    @JsonPropertyDescription("key/value pairs to pass to workflow component.")
    @Valid
    private ComponentConfig config;

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

    public WorkflowConfig withLoggerLevel(LogLevels loggerLevel) {
        this.loggerLevel = loggerLevel;
        return this;
    }

    /**
     * OpenMetadataConnection
     * <p>
     * OpenMetadata Connection Config
     * (Required)
     * 
     */
    @JsonProperty("openMetadataServerConfig")
    public OpenMetadataConnection getOpenMetadataServerConfig() {
        return openMetadataServerConfig;
    }

    /**
     * OpenMetadataConnection
     * <p>
     * OpenMetadata Connection Config
     * (Required)
     * 
     */
    @JsonProperty("openMetadataServerConfig")
    public void setOpenMetadataServerConfig(OpenMetadataConnection openMetadataServerConfig) {
        this.openMetadataServerConfig = openMetadataServerConfig;
    }

    public WorkflowConfig withOpenMetadataServerConfig(OpenMetadataConnection openMetadataServerConfig) {
        this.openMetadataServerConfig = openMetadataServerConfig;
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

    public WorkflowConfig withConfig(ComponentConfig config) {
        this.config = config;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WorkflowConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("loggerLevel");
        sb.append('=');
        sb.append(((this.loggerLevel == null)?"<null>":this.loggerLevel));
        sb.append(',');
        sb.append("openMetadataServerConfig");
        sb.append('=');
        sb.append(((this.openMetadataServerConfig == null)?"<null>":this.openMetadataServerConfig));
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
        result = ((result* 31)+((this.loggerLevel == null)? 0 :this.loggerLevel.hashCode()));
        result = ((result* 31)+((this.config == null)? 0 :this.config.hashCode()));
        result = ((result* 31)+((this.openMetadataServerConfig == null)? 0 :this.openMetadataServerConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkflowConfig) == false) {
            return false;
        }
        WorkflowConfig rhs = ((WorkflowConfig) other);
        return ((((this.loggerLevel == rhs.loggerLevel)||((this.loggerLevel!= null)&&this.loggerLevel.equals(rhs.loggerLevel)))&&((this.config == rhs.config)||((this.config!= null)&&this.config.equals(rhs.config))))&&((this.openMetadataServerConfig == rhs.openMetadataServerConfig)||((this.openMetadataServerConfig!= null)&&this.openMetadataServerConfig.equals(rhs.openMetadataServerConfig))));
    }

}
