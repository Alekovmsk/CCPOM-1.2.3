
package org.openmetadata.schema.dataInsight.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MostViewedEntities
 * <p>
 * pageViewsByEntities data blob
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityFqn",
    "entityHref",
    "owner",
    "entityType",
    "pageViews"
})
@Generated("jsonschema2pojo")
public class MostViewedEntities {

    /**
     * Number of page views
     * 
     */
    @JsonProperty("entityFqn")
    @JsonPropertyDescription("Number of page views")
    private String entityFqn;
    /**
     * Entity href link
     * 
     */
    @JsonProperty("entityHref")
    @JsonPropertyDescription("Entity href link")
    private String entityHref;
    /**
     * Owner of the entity
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("Owner of the entity")
    private String owner;
    /**
     * Type of entity. Derived from the page URL.
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("Type of entity. Derived from the page URL.")
    private String entityType;
    /**
     * Type of entity. Derived from the page URL.
     * 
     */
    @JsonProperty("pageViews")
    @JsonPropertyDescription("Type of entity. Derived from the page URL.")
    private Double pageViews;

    /**
     * Number of page views
     * 
     */
    @JsonProperty("entityFqn")
    public String getEntityFqn() {
        return entityFqn;
    }

    /**
     * Number of page views
     * 
     */
    @JsonProperty("entityFqn")
    public void setEntityFqn(String entityFqn) {
        this.entityFqn = entityFqn;
    }

    public MostViewedEntities withEntityFqn(String entityFqn) {
        this.entityFqn = entityFqn;
        return this;
    }

    /**
     * Entity href link
     * 
     */
    @JsonProperty("entityHref")
    public String getEntityHref() {
        return entityHref;
    }

    /**
     * Entity href link
     * 
     */
    @JsonProperty("entityHref")
    public void setEntityHref(String entityHref) {
        this.entityHref = entityHref;
    }

    public MostViewedEntities withEntityHref(String entityHref) {
        this.entityHref = entityHref;
        return this;
    }

    /**
     * Owner of the entity
     * 
     */
    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    /**
     * Owner of the entity
     * 
     */
    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public MostViewedEntities withOwner(String owner) {
        this.owner = owner;
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

    public MostViewedEntities withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Type of entity. Derived from the page URL.
     * 
     */
    @JsonProperty("pageViews")
    public Double getPageViews() {
        return pageViews;
    }

    /**
     * Type of entity. Derived from the page URL.
     * 
     */
    @JsonProperty("pageViews")
    public void setPageViews(Double pageViews) {
        this.pageViews = pageViews;
    }

    public MostViewedEntities withPageViews(Double pageViews) {
        this.pageViews = pageViews;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MostViewedEntities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityFqn");
        sb.append('=');
        sb.append(((this.entityFqn == null)?"<null>":this.entityFqn));
        sb.append(',');
        sb.append("entityHref");
        sb.append('=');
        sb.append(((this.entityHref == null)?"<null>":this.entityHref));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("pageViews");
        sb.append('=');
        sb.append(((this.pageViews == null)?"<null>":this.pageViews));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.entityFqn == null)? 0 :this.entityFqn.hashCode()));
        result = ((result* 31)+((this.entityHref == null)? 0 :this.entityHref.hashCode()));
        result = ((result* 31)+((this.pageViews == null)? 0 :this.pageViews.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MostViewedEntities) == false) {
            return false;
        }
        MostViewedEntities rhs = ((MostViewedEntities) other);
        return ((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.entityFqn == rhs.entityFqn)||((this.entityFqn!= null)&&this.entityFqn.equals(rhs.entityFqn))))&&((this.entityHref == rhs.entityHref)||((this.entityHref!= null)&&this.entityHref.equals(rhs.entityHref))))&&((this.pageViews == rhs.pageViews)||((this.pageViews!= null)&&this.pageViews.equals(rhs.pageViews))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))));
    }

}
