
package org.openmetadata.schema.dataInsight.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PageViewsByEntities
 * <p>
 * pageViewsByEntities data blob
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "pageViews",
    "entityType"
})
@Generated("jsonschema2pojo")
public class PageViewsByEntities {

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * Number of page views
     * 
     */
    @JsonProperty("pageViews")
    @JsonPropertyDescription("Number of page views")
    private Double pageViews;
    /**
     * Type of entity. Derived from the page URL.
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("Type of entity. Derived from the page URL.")
    private String entityType;

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

    public PageViewsByEntities withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Number of page views
     * 
     */
    @JsonProperty("pageViews")
    public Double getPageViews() {
        return pageViews;
    }

    /**
     * Number of page views
     * 
     */
    @JsonProperty("pageViews")
    public void setPageViews(Double pageViews) {
        this.pageViews = pageViews;
    }

    public PageViewsByEntities withPageViews(Double pageViews) {
        this.pageViews = pageViews;
        return this;
    }

    /**
     * Type of entity. Derived from the page URL.
     * 
     */
    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    /**
     * Type of entity. Derived from the page URL.
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public PageViewsByEntities withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PageViewsByEntities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("pageViews");
        sb.append('=');
        sb.append(((this.pageViews == null)?"<null>":this.pageViews));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
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
        result = ((result* 31)+((this.pageViews == null)? 0 :this.pageViews.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PageViewsByEntities) == false) {
            return false;
        }
        PageViewsByEntities rhs = ((PageViewsByEntities) other);
        return ((((this.pageViews == rhs.pageViews)||((this.pageViews!= null)&&this.pageViews.equals(rhs.pageViews)))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
