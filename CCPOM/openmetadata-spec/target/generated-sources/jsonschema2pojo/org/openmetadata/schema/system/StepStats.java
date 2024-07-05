
package org.openmetadata.schema.system;

import java.util.LinkedHashMap;
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


/**
 * Stats for Different Steps Reader, Processor, Writer.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalRecords",
    "successRecords",
    "failedRecords"
})
@Generated("jsonschema2pojo")
public class StepStats {

    /**
     * Count of Total Failed Records
     * 
     */
    @JsonProperty("totalRecords")
    @JsonPropertyDescription("Count of Total Failed Records")
    private Integer totalRecords = 0;
    /**
     * Count of Total Successfully Records
     * 
     */
    @JsonProperty("successRecords")
    @JsonPropertyDescription("Count of Total Successfully Records")
    private Integer successRecords = 0;
    /**
     * Count of Total Failed Records
     * 
     */
    @JsonProperty("failedRecords")
    @JsonPropertyDescription("Count of Total Failed Records")
    private Integer failedRecords = 0;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Count of Total Failed Records
     * 
     */
    @JsonProperty("totalRecords")
    public Integer getTotalRecords() {
        return totalRecords;
    }

    /**
     * Count of Total Failed Records
     * 
     */
    @JsonProperty("totalRecords")
    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public StepStats withTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * Count of Total Successfully Records
     * 
     */
    @JsonProperty("successRecords")
    public Integer getSuccessRecords() {
        return successRecords;
    }

    /**
     * Count of Total Successfully Records
     * 
     */
    @JsonProperty("successRecords")
    public void setSuccessRecords(Integer successRecords) {
        this.successRecords = successRecords;
    }

    public StepStats withSuccessRecords(Integer successRecords) {
        this.successRecords = successRecords;
        return this;
    }

    /**
     * Count of Total Failed Records
     * 
     */
    @JsonProperty("failedRecords")
    public Integer getFailedRecords() {
        return failedRecords;
    }

    /**
     * Count of Total Failed Records
     * 
     */
    @JsonProperty("failedRecords")
    public void setFailedRecords(Integer failedRecords) {
        this.failedRecords = failedRecords;
    }

    public StepStats withFailedRecords(Integer failedRecords) {
        this.failedRecords = failedRecords;
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

    public StepStats withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StepStats.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totalRecords");
        sb.append('=');
        sb.append(((this.totalRecords == null)?"<null>":this.totalRecords));
        sb.append(',');
        sb.append("successRecords");
        sb.append('=');
        sb.append(((this.successRecords == null)?"<null>":this.successRecords));
        sb.append(',');
        sb.append("failedRecords");
        sb.append('=');
        sb.append(((this.failedRecords == null)?"<null>":this.failedRecords));
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
        result = ((result* 31)+((this.totalRecords == null)? 0 :this.totalRecords.hashCode()));
        result = ((result* 31)+((this.successRecords == null)? 0 :this.successRecords.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.failedRecords == null)? 0 :this.failedRecords.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StepStats) == false) {
            return false;
        }
        StepStats rhs = ((StepStats) other);
        return (((((this.totalRecords == rhs.totalRecords)||((this.totalRecords!= null)&&this.totalRecords.equals(rhs.totalRecords)))&&((this.successRecords == rhs.successRecords)||((this.successRecords!= null)&&this.successRecords.equals(rhs.successRecords))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.failedRecords == rhs.failedRecords)||((this.failedRecords!= null)&&this.failedRecords.equals(rhs.failedRecords))));
    }

}
