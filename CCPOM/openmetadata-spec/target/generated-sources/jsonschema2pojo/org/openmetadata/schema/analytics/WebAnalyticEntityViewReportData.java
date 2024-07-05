
package org.openmetadata.schema.analytics;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * webAnalyticEntityViewReportData
 * <p>
 * Refined data for overview report
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityType",
    "entityTier",
    "entityFqn",
    "entityHref",
    "tagsFQN",
    "owner",
    "ownerId",
    "views"
})
@Generated("jsonschema2pojo")
public class WebAnalyticEntityViewReportData {

    /**
     * entity type
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("entity type")
    private String entityType;
    /**
     * entity tier
     * 
     */
    @JsonProperty("entityTier")
    @JsonPropertyDescription("entity tier")
    private String entityTier;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("entityFqn")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String entityFqn;
    /**
     * entity href
     * 
     */
    @JsonProperty("entityHref")
    @JsonPropertyDescription("entity href")
    private String entityHref;
    /**
     * Tags FQN
     * 
     */
    @JsonProperty("tagsFQN")
    @JsonPropertyDescription("Tags FQN")
    @Valid
    private List<String> tagsFQN = new ArrayList<String>();
    /**
     * Name of the entity owner
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("Name of the entity owner")
    private String owner;
    /**
     * Name of the entity owner
     * 
     */
    @JsonProperty("ownerId")
    @JsonPropertyDescription("Name of the entity owner")
    private String ownerId;
    /**
     * Number of time the entity was viewed
     * 
     */
    @JsonProperty("views")
    @JsonPropertyDescription("Number of time the entity was viewed")
    private Integer views;

    /**
     * entity type
     * 
     */
    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    /**
     * entity type
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public WebAnalyticEntityViewReportData withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * entity tier
     * 
     */
    @JsonProperty("entityTier")
    public String getEntityTier() {
        return entityTier;
    }

    /**
     * entity tier
     * 
     */
    @JsonProperty("entityTier")
    public void setEntityTier(String entityTier) {
        this.entityTier = entityTier;
    }

    public WebAnalyticEntityViewReportData withEntityTier(String entityTier) {
        this.entityTier = entityTier;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("entityFqn")
    public String getEntityFqn() {
        return entityFqn;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("entityFqn")
    public void setEntityFqn(String entityFqn) {
        this.entityFqn = entityFqn;
    }

    public WebAnalyticEntityViewReportData withEntityFqn(String entityFqn) {
        this.entityFqn = entityFqn;
        return this;
    }

    /**
     * entity href
     * 
     */
    @JsonProperty("entityHref")
    public String getEntityHref() {
        return entityHref;
    }

    /**
     * entity href
     * 
     */
    @JsonProperty("entityHref")
    public void setEntityHref(String entityHref) {
        this.entityHref = entityHref;
    }

    public WebAnalyticEntityViewReportData withEntityHref(String entityHref) {
        this.entityHref = entityHref;
        return this;
    }

    /**
     * Tags FQN
     * 
     */
    @JsonProperty("tagsFQN")
    public List<String> getTagsFQN() {
        return tagsFQN;
    }

    /**
     * Tags FQN
     * 
     */
    @JsonProperty("tagsFQN")
    public void setTagsFQN(List<String> tagsFQN) {
        this.tagsFQN = tagsFQN;
    }

    public WebAnalyticEntityViewReportData withTagsFQN(List<String> tagsFQN) {
        this.tagsFQN = tagsFQN;
        return this;
    }

    /**
     * Name of the entity owner
     * 
     */
    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    /**
     * Name of the entity owner
     * 
     */
    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public WebAnalyticEntityViewReportData withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Name of the entity owner
     * 
     */
    @JsonProperty("ownerId")
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Name of the entity owner
     * 
     */
    @JsonProperty("ownerId")
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public WebAnalyticEntityViewReportData withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Number of time the entity was viewed
     * 
     */
    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    /**
     * Number of time the entity was viewed
     * 
     */
    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    public WebAnalyticEntityViewReportData withViews(Integer views) {
        this.views = views;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WebAnalyticEntityViewReportData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("entityTier");
        sb.append('=');
        sb.append(((this.entityTier == null)?"<null>":this.entityTier));
        sb.append(',');
        sb.append("entityFqn");
        sb.append('=');
        sb.append(((this.entityFqn == null)?"<null>":this.entityFqn));
        sb.append(',');
        sb.append("entityHref");
        sb.append('=');
        sb.append(((this.entityHref == null)?"<null>":this.entityHref));
        sb.append(',');
        sb.append("tagsFQN");
        sb.append('=');
        sb.append(((this.tagsFQN == null)?"<null>":this.tagsFQN));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("ownerId");
        sb.append('=');
        sb.append(((this.ownerId == null)?"<null>":this.ownerId));
        sb.append(',');
        sb.append("views");
        sb.append('=');
        sb.append(((this.views == null)?"<null>":this.views));
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
        result = ((result* 31)+((this.tagsFQN == null)? 0 :this.tagsFQN.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.entityFqn == null)? 0 :this.entityFqn.hashCode()));
        result = ((result* 31)+((this.entityHref == null)? 0 :this.entityHref.hashCode()));
        result = ((result* 31)+((this.ownerId == null)? 0 :this.ownerId.hashCode()));
        result = ((result* 31)+((this.entityTier == null)? 0 :this.entityTier.hashCode()));
        result = ((result* 31)+((this.views == null)? 0 :this.views.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebAnalyticEntityViewReportData) == false) {
            return false;
        }
        WebAnalyticEntityViewReportData rhs = ((WebAnalyticEntityViewReportData) other);
        return (((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.tagsFQN == rhs.tagsFQN)||((this.tagsFQN!= null)&&this.tagsFQN.equals(rhs.tagsFQN))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.entityFqn == rhs.entityFqn)||((this.entityFqn!= null)&&this.entityFqn.equals(rhs.entityFqn))))&&((this.entityHref == rhs.entityHref)||((this.entityHref!= null)&&this.entityHref.equals(rhs.entityHref))))&&((this.ownerId == rhs.ownerId)||((this.ownerId!= null)&&this.ownerId.equals(rhs.ownerId))))&&((this.entityTier == rhs.entityTier)||((this.entityTier!= null)&&this.entityTier.equals(rhs.entityTier))))&&((this.views == rhs.views)||((this.views!= null)&&this.views.equals(rhs.views))));
    }

}
