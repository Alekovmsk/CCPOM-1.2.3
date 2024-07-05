
package org.openmetadata.schema.entity.services;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.MaskedField;
import org.openmetadata.schema.ServiceConnectionEntityInterface;


/**
 * Metadata Service Connection.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "config"
})
@Generated("jsonschema2pojo")
public class MetadataConnection implements ServiceConnectionEntityInterface
{

    @JsonProperty("config")
    @MaskedField
    private Object config;

    @JsonProperty("config")
    @MaskedField
    public Object getConfig() {
        return config;
    }

    @JsonProperty("config")
    @MaskedField
    public void setConfig(Object config) {
        this.config = config;
    }

    public MetadataConnection withConfig(Object config) {
        this.config = config;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MetadataConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.config == null)? 0 :this.config.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetadataConnection) == false) {
            return false;
        }
        MetadataConnection rhs = ((MetadataConnection) other);
        return ((this.config == rhs.config)||((this.config!= null)&&this.config.equals(rhs.config)));
    }

}
