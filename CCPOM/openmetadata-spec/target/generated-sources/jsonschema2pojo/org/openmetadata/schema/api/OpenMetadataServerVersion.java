
package org.openmetadata.schema.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OpenMetadataServerVersion
 * <p>
 * OpenMetadata Server application software version
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "revision",
    "timestamp"
})
@Generated("jsonschema2pojo")
public class OpenMetadataServerVersion {

    /**
     * Software version of the OpenMetadata Server
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Software version of the OpenMetadata Server")
    private String version;
    /**
     * Software revision of the OpenMetadata Server
     * 
     */
    @JsonProperty("revision")
    @JsonPropertyDescription("Software revision of the OpenMetadata Server")
    private String revision;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;

    /**
     * Software version of the OpenMetadata Server
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Software version of the OpenMetadata Server
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public OpenMetadataServerVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Software revision of the OpenMetadata Server
     * 
     */
    @JsonProperty("revision")
    public String getRevision() {
        return revision;
    }

    /**
     * Software revision of the OpenMetadata Server
     * 
     */
    @JsonProperty("revision")
    public void setRevision(String revision) {
        this.revision = revision;
    }

    public OpenMetadataServerVersion withRevision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public OpenMetadataServerVersion withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenMetadataServerVersion.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("revision");
        sb.append('=');
        sb.append(((this.revision == null)?"<null>":this.revision));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
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
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.revision == null)? 0 :this.revision.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenMetadataServerVersion) == false) {
            return false;
        }
        OpenMetadataServerVersion rhs = ((OpenMetadataServerVersion) other);
        return ((((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version)))&&((this.revision == rhs.revision)||((this.revision!= null)&&this.revision.equals(rhs.revision))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
