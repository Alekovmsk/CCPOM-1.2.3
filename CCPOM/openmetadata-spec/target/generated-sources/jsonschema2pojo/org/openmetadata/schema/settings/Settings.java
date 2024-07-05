
package org.openmetadata.schema.settings;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Settings
 * <p>
 * This schema defines the Settings. A Settings represents a generic Setting.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "config_type",
    "config_value"
})
@Generated("jsonschema2pojo")
public class Settings {

    /**
     * This schema defines all possible filters enum in OpenMetadata.
     * (Required)
     * 
     */
    @JsonProperty("config_type")
    @JsonPropertyDescription("This schema defines all possible filters enum in OpenMetadata.")
    @NotNull
    private SettingsType configType;
    @JsonProperty("config_value")
    private Object configValue;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This schema defines all possible filters enum in OpenMetadata.
     * (Required)
     * 
     */
    @JsonProperty("config_type")
    public SettingsType getConfigType() {
        return configType;
    }

    /**
     * This schema defines all possible filters enum in OpenMetadata.
     * (Required)
     * 
     */
    @JsonProperty("config_type")
    public void setConfigType(SettingsType configType) {
        this.configType = configType;
    }

    public Settings withConfigType(SettingsType configType) {
        this.configType = configType;
        return this;
    }

    @JsonProperty("config_value")
    public Object getConfigValue() {
        return configValue;
    }

    @JsonProperty("config_value")
    public void setConfigValue(Object configValue) {
        this.configValue = configValue;
    }

    public Settings withConfigValue(Object configValue) {
        this.configValue = configValue;
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

    public Settings withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Settings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("configType");
        sb.append('=');
        sb.append(((this.configType == null)?"<null>":this.configType));
        sb.append(',');
        sb.append("configValue");
        sb.append('=');
        sb.append(((this.configValue == null)?"<null>":this.configValue));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.configType == null)? 0 :this.configType.hashCode()));
        result = ((result* 31)+((this.configValue == null)? 0 :this.configValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Settings) == false) {
            return false;
        }
        Settings rhs = ((Settings) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.configType == rhs.configType)||((this.configType!= null)&&this.configType.equals(rhs.configType))))&&((this.configValue == rhs.configValue)||((this.configValue!= null)&&this.configValue.equals(rhs.configValue))));
    }

}
