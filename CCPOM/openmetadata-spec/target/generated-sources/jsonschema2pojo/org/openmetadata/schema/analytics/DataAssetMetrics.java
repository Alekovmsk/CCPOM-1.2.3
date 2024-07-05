
package org.openmetadata.schema.analytics;

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
 * Store the Count and Size in bytes of the Data Assets over a time period
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "size",
    "count",
    "totalSize",
    "totalCount"
})
@Generated("jsonschema2pojo")
public class DataAssetMetrics {

    /**
     * Count or Size in bytes of Data Assets over a time period
     * 
     */
    @JsonProperty("size")
    @JsonPropertyDescription("Count or Size in bytes of Data Assets over a time period")
    @Valid
    private DataAssetValues size;
    /**
     * Count or Size in bytes of Data Assets over a time period
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("Count or Size in bytes of Data Assets over a time period")
    @Valid
    private DataAssetValues count;
    /**
     * Total Size based in Bytes
     * 
     */
    @JsonProperty("totalSize")
    @JsonPropertyDescription("Total Size based in Bytes")
    private Double totalSize;
    /**
     * Total Count
     * 
     */
    @JsonProperty("totalCount")
    @JsonPropertyDescription("Total Count")
    private Double totalCount;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Count or Size in bytes of Data Assets over a time period
     * 
     */
    @JsonProperty("size")
    public DataAssetValues getSize() {
        return size;
    }

    /**
     * Count or Size in bytes of Data Assets over a time period
     * 
     */
    @JsonProperty("size")
    public void setSize(DataAssetValues size) {
        this.size = size;
    }

    public DataAssetMetrics withSize(DataAssetValues size) {
        this.size = size;
        return this;
    }

    /**
     * Count or Size in bytes of Data Assets over a time period
     * 
     */
    @JsonProperty("count")
    public DataAssetValues getCount() {
        return count;
    }

    /**
     * Count or Size in bytes of Data Assets over a time period
     * 
     */
    @JsonProperty("count")
    public void setCount(DataAssetValues count) {
        this.count = count;
    }

    public DataAssetMetrics withCount(DataAssetValues count) {
        this.count = count;
        return this;
    }

    /**
     * Total Size based in Bytes
     * 
     */
    @JsonProperty("totalSize")
    public Double getTotalSize() {
        return totalSize;
    }

    /**
     * Total Size based in Bytes
     * 
     */
    @JsonProperty("totalSize")
    public void setTotalSize(Double totalSize) {
        this.totalSize = totalSize;
    }

    public DataAssetMetrics withTotalSize(Double totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * Total Count
     * 
     */
    @JsonProperty("totalCount")
    public Double getTotalCount() {
        return totalCount;
    }

    /**
     * Total Count
     * 
     */
    @JsonProperty("totalCount")
    public void setTotalCount(Double totalCount) {
        this.totalCount = totalCount;
    }

    public DataAssetMetrics withTotalCount(Double totalCount) {
        this.totalCount = totalCount;
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

    public DataAssetMetrics withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataAssetMetrics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("totalSize");
        sb.append('=');
        sb.append(((this.totalSize == null)?"<null>":this.totalSize));
        sb.append(',');
        sb.append("totalCount");
        sb.append('=');
        sb.append(((this.totalCount == null)?"<null>":this.totalCount));
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
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.totalSize == null)? 0 :this.totalSize.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.totalCount == null)? 0 :this.totalCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataAssetMetrics) == false) {
            return false;
        }
        DataAssetMetrics rhs = ((DataAssetMetrics) other);
        return ((((((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count)))&&((this.totalSize == rhs.totalSize)||((this.totalSize!= null)&&this.totalSize.equals(rhs.totalSize))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.totalCount == rhs.totalCount)||((this.totalCount!= null)&&this.totalCount.equals(rhs.totalCount))));
    }

}
