
package org.openmetadata.schema.api.feed;

import javax.annotation.processing.Generated;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Type used to return thread count per entity link.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "count",
    "entityLink"
})
@Generated("jsonschema2pojo")
public class EntityLinkThreadCount {

    /**
     * Count of threads for the given entity link.
     * (Required)
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("Count of threads for the given entity link.")
    @DecimalMin("0")
    @NotNull
    private Integer count;
    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * (Required)
     * 
     */
    @JsonProperty("entityLink")
    @JsonPropertyDescription("Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.")
    @Pattern(regexp = "^(?U)<#E::\\w+::[\\w'\\- .&/:+\"\\\\()$#%]+>$")
    @NotNull
    private String entityLink;

    /**
     * Count of threads for the given entity link.
     * (Required)
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * Count of threads for the given entity link.
     * (Required)
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public EntityLinkThreadCount withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * (Required)
     * 
     */
    @JsonProperty("entityLink")
    public String getEntityLink() {
        return entityLink;
    }

    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * (Required)
     * 
     */
    @JsonProperty("entityLink")
    public void setEntityLink(String entityLink) {
        this.entityLink = entityLink;
    }

    public EntityLinkThreadCount withEntityLink(String entityLink) {
        this.entityLink = entityLink;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityLinkThreadCount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("entityLink");
        sb.append('=');
        sb.append(((this.entityLink == null)?"<null>":this.entityLink));
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
        result = ((result* 31)+((this.entityLink == null)? 0 :this.entityLink.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityLinkThreadCount) == false) {
            return false;
        }
        EntityLinkThreadCount rhs = ((EntityLinkThreadCount) other);
        return (((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count)))&&((this.entityLink == rhs.entityLink)||((this.entityLink!= null)&&this.entityLink.equals(rhs.entityLink))));
    }

}
