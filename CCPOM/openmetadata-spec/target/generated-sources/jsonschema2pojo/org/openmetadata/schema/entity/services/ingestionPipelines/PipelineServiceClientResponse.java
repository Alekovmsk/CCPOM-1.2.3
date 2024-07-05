
package org.openmetadata.schema.entity.services.ingestionPipelines;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PipelineServiceClientResponse
 * <p>
 * Object to send Status responses about your Ingestion Pipelines ops.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "reason",
    "platform",
    "version"
})
@Generated("jsonschema2pojo")
public class PipelineServiceClientResponse {

    /**
     * Status code
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Status code")
    @NotNull
    private Integer code;
    /**
     * Extra information to be sent back to the client, such as error traces.
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("Extra information to be sent back to the client, such as error traces.")
    private String reason;
    /**
     * Orchestration platform used by the Pipeline Service Client.
     * (Required)
     * 
     */
    @JsonProperty("platform")
    @JsonPropertyDescription("Orchestration platform used by the Pipeline Service Client.")
    @NotNull
    private String platform;
    /**
     * Ingestion version being used.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Ingestion version being used.")
    private String version;

    /**
     * Status code
     * (Required)
     * 
     */
    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    /**
     * Status code
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    public PipelineServiceClientResponse withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * Extra information to be sent back to the client, such as error traces.
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Extra information to be sent back to the client, such as error traces.
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    public PipelineServiceClientResponse withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Orchestration platform used by the Pipeline Service Client.
     * (Required)
     * 
     */
    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    /**
     * Orchestration platform used by the Pipeline Service Client.
     * (Required)
     * 
     */
    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public PipelineServiceClientResponse withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Ingestion version being used.
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Ingestion version being used.
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public PipelineServiceClientResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PipelineServiceClientResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("platform");
        sb.append('=');
        sb.append(((this.platform == null)?"<null>":this.platform));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.platform == null)? 0 :this.platform.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PipelineServiceClientResponse) == false) {
            return false;
        }
        PipelineServiceClientResponse rhs = ((PipelineServiceClientResponse) other);
        return (((((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.platform == rhs.platform)||((this.platform!= null)&&this.platform.equals(rhs.platform))));
    }

}
