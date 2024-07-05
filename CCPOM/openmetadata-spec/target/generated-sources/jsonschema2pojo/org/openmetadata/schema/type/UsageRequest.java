
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Usage Request
 * <p>
 * This schema defines type of table usage request used to publish the usage count on a particular date
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "count"
})
@Generated("jsonschema2pojo")
public class UsageRequest {

    /**
     * Date of execution of SQL query
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Date of execution of SQL query")
    @NotNull
    private String date;
    /**
     * Usage count of table
     * (Required)
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("Usage count of table")
    @NotNull
    private Integer count;

    /**
     * Date of execution of SQL query
     * (Required)
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * Date of execution of SQL query
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public UsageRequest withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Usage count of table
     * (Required)
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * Usage count of table
     * (Required)
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public UsageRequest withCount(Integer count) {
        this.count = count;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UsageRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsageRequest) == false) {
            return false;
        }
        UsageRequest rhs = ((UsageRequest) other);
        return (((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count))));
    }

}
