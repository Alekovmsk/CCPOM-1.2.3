
package org.openmetadata.schema.entity.app;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.AppRuntime;


/**
 * JobRun
 * <p>
 * Live Execution object.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enabled",
    "resources"
})
@Generated("jsonschema2pojo")
public class LiveExecutionContext implements AppRuntime
{

    /**
     * If Live Execution is enabled
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("If Live Execution is enabled")
    private Boolean enabled = false;
    /**
     * Resource full classname to register to extend any endpoints.
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("Resource full classname to register to extend any endpoints.")
    @Valid
    private List<String> resources = new ArrayList<String>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * If Live Execution is enabled
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * If Live Execution is enabled
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public LiveExecutionContext withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Resource full classname to register to extend any endpoints.
     * 
     */
    @JsonProperty("resources")
    public List<String> getResources() {
        return resources;
    }

    /**
     * Resource full classname to register to extend any endpoints.
     * 
     */
    @JsonProperty("resources")
    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public LiveExecutionContext withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public LiveExecutionContext withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LiveExecutionContext.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("resources");
        sb.append('=');
        sb.append(((this.resources == null)?"<null>":this.resources));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LiveExecutionContext) == false) {
            return false;
        }
        LiveExecutionContext rhs = ((LiveExecutionContext) other);
        return ((((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))));
    }

}
