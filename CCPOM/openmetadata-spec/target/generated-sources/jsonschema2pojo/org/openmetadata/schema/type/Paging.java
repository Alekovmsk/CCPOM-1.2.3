
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Paging
 * <p>
 * Type used for cursor based pagination information in GET list responses.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "before",
    "after",
    "offset",
    "total"
})
@Generated("jsonschema2pojo")
public class Paging {

    /**
     * Before cursor used for getting the previous page (see API pagination for details).
     * 
     */
    @JsonProperty("before")
    @JsonPropertyDescription("Before cursor used for getting the previous page (see API pagination for details).")
    private String before;
    /**
     * After cursor used for getting the next page (see API pagination for details).
     * 
     */
    @JsonProperty("after")
    @JsonPropertyDescription("After cursor used for getting the next page (see API pagination for details).")
    private String after;
    /**
     * Offset used in case of offset based pagination.
     * 
     */
    @JsonProperty("offset")
    @JsonPropertyDescription("Offset used in case of offset based pagination.")
    private Integer offset = null;
    /**
     * Total number of entries available to page through.
     * (Required)
     * 
     */
    @JsonProperty("total")
    @JsonPropertyDescription("Total number of entries available to page through.")
    @NotNull
    private Integer total;

    /**
     * Before cursor used for getting the previous page (see API pagination for details).
     * 
     */
    @JsonProperty("before")
    public String getBefore() {
        return before;
    }

    /**
     * Before cursor used for getting the previous page (see API pagination for details).
     * 
     */
    @JsonProperty("before")
    public void setBefore(String before) {
        this.before = before;
    }

    public Paging withBefore(String before) {
        this.before = before;
        return this;
    }

    /**
     * After cursor used for getting the next page (see API pagination for details).
     * 
     */
    @JsonProperty("after")
    public String getAfter() {
        return after;
    }

    /**
     * After cursor used for getting the next page (see API pagination for details).
     * 
     */
    @JsonProperty("after")
    public void setAfter(String after) {
        this.after = after;
    }

    public Paging withAfter(String after) {
        this.after = after;
        return this;
    }

    /**
     * Offset used in case of offset based pagination.
     * 
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    /**
     * Offset used in case of offset based pagination.
     * 
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Paging withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Total number of entries available to page through.
     * (Required)
     * 
     */
    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    /**
     * Total number of entries available to page through.
     * (Required)
     * 
     */
    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Paging withTotal(Integer total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Paging.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("before");
        sb.append('=');
        sb.append(((this.before == null)?"<null>":this.before));
        sb.append(',');
        sb.append("after");
        sb.append('=');
        sb.append(((this.after == null)?"<null>":this.after));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
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
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.after == null)? 0 :this.after.hashCode()));
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.before == null)? 0 :this.before.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Paging) == false) {
            return false;
        }
        Paging rhs = ((Paging) other);
        return (((((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total)))&&((this.after == rhs.after)||((this.after!= null)&&this.after.equals(rhs.after))))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))))&&((this.before == rhs.before)||((this.before!= null)&&this.before.equals(rhs.before))));
    }

}
