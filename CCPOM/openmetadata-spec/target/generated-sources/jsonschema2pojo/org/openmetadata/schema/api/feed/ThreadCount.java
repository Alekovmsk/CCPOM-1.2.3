
package org.openmetadata.schema.api.feed;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Count of threads related to an entity
 * <p>
 * This schema defines the type for reporting the count of threads related to an entity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalCount",
    "counts"
})
@Generated("jsonschema2pojo")
public class ThreadCount {

    /**
     * Total count of all the threads.
     * (Required)
     * 
     */
    @JsonProperty("totalCount")
    @JsonPropertyDescription("Total count of all the threads.")
    @DecimalMin("0")
    @NotNull
    private Integer totalCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("counts")
    @JsonPropertyDescription("")
    @Valid
    @NotNull
    private List<EntityLinkThreadCount> counts = new ArrayList<EntityLinkThreadCount>();

    /**
     * Total count of all the threads.
     * (Required)
     * 
     */
    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Total count of all the threads.
     * (Required)
     * 
     */
    @JsonProperty("totalCount")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ThreadCount withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("counts")
    public List<EntityLinkThreadCount> getCounts() {
        return counts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("counts")
    public void setCounts(List<EntityLinkThreadCount> counts) {
        this.counts = counts;
    }

    public ThreadCount withCounts(List<EntityLinkThreadCount> counts) {
        this.counts = counts;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThreadCount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totalCount");
        sb.append('=');
        sb.append(((this.totalCount == null)?"<null>":this.totalCount));
        sb.append(',');
        sb.append("counts");
        sb.append('=');
        sb.append(((this.counts == null)?"<null>":this.counts));
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
        result = ((result* 31)+((this.totalCount == null)? 0 :this.totalCount.hashCode()));
        result = ((result* 31)+((this.counts == null)? 0 :this.counts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThreadCount) == false) {
            return false;
        }
        ThreadCount rhs = ((ThreadCount) other);
        return (((this.totalCount == rhs.totalCount)||((this.totalCount!= null)&&this.totalCount.equals(rhs.totalCount)))&&((this.counts == rhs.counts)||((this.counts!= null)&&this.counts.equals(rhs.counts))));
    }

}
