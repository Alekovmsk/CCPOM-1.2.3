
package org.openmetadata.schema.analytics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * entityReportData
 * <p>
 * Refined data for Entity Report.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "serviceName",
    "entityType",
    "entityTier",
    "team",
    "organization",
    "completedDescriptions",
    "missingDescriptions",
    "hasOwner",
    "missingOwner",
    "entityCount"
})
@Generated("jsonschema2pojo")
public class EntityReportData {

    /**
     * Name of the service
     * 
     */
    @JsonProperty("serviceName")
    @JsonPropertyDescription("Name of the service")
    private String serviceName;
    /**
     * type of the entity
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("type of the entity")
    private String entityType;
    /**
     * Tier for the entity
     * 
     */
    @JsonProperty("entityTier")
    @JsonPropertyDescription("Tier for the entity")
    private String entityTier;
    /**
     * Team associated with the entity (i.e. owner)
     * 
     */
    @JsonProperty("team")
    @JsonPropertyDescription("Team associated with the entity (i.e. owner)")
    private String team;
    /**
     * Organization associated with the entity (i.e. owner)
     * 
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("Organization associated with the entity (i.e. owner)")
    private String organization;
    /**
     * Number of completed description for the entity
     * 
     */
    @JsonProperty("completedDescriptions")
    @JsonPropertyDescription("Number of completed description for the entity")
    private Integer completedDescriptions;
    /**
     * Number of missing description for the entity
     * 
     */
    @JsonProperty("missingDescriptions")
    @JsonPropertyDescription("Number of missing description for the entity")
    private Integer missingDescriptions;
    /**
     * number of entities with owner
     * 
     */
    @JsonProperty("hasOwner")
    @JsonPropertyDescription("number of entities with owner")
    private Integer hasOwner;
    /**
     * number of entities missing owners
     * 
     */
    @JsonProperty("missingOwner")
    @JsonPropertyDescription("number of entities missing owners")
    private Integer missingOwner;
    /**
     * number of entities
     * 
     */
    @JsonProperty("entityCount")
    @JsonPropertyDescription("number of entities")
    private Integer entityCount;

    /**
     * Name of the service
     * 
     */
    @JsonProperty("serviceName")
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Name of the service
     * 
     */
    @JsonProperty("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public EntityReportData withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * type of the entity
     * 
     */
    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    /**
     * type of the entity
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public EntityReportData withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Tier for the entity
     * 
     */
    @JsonProperty("entityTier")
    public String getEntityTier() {
        return entityTier;
    }

    /**
     * Tier for the entity
     * 
     */
    @JsonProperty("entityTier")
    public void setEntityTier(String entityTier) {
        this.entityTier = entityTier;
    }

    public EntityReportData withEntityTier(String entityTier) {
        this.entityTier = entityTier;
        return this;
    }

    /**
     * Team associated with the entity (i.e. owner)
     * 
     */
    @JsonProperty("team")
    public String getTeam() {
        return team;
    }

    /**
     * Team associated with the entity (i.e. owner)
     * 
     */
    @JsonProperty("team")
    public void setTeam(String team) {
        this.team = team;
    }

    public EntityReportData withTeam(String team) {
        this.team = team;
        return this;
    }

    /**
     * Organization associated with the entity (i.e. owner)
     * 
     */
    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    /**
     * Organization associated with the entity (i.e. owner)
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public EntityReportData withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Number of completed description for the entity
     * 
     */
    @JsonProperty("completedDescriptions")
    public Integer getCompletedDescriptions() {
        return completedDescriptions;
    }

    /**
     * Number of completed description for the entity
     * 
     */
    @JsonProperty("completedDescriptions")
    public void setCompletedDescriptions(Integer completedDescriptions) {
        this.completedDescriptions = completedDescriptions;
    }

    public EntityReportData withCompletedDescriptions(Integer completedDescriptions) {
        this.completedDescriptions = completedDescriptions;
        return this;
    }

    /**
     * Number of missing description for the entity
     * 
     */
    @JsonProperty("missingDescriptions")
    public Integer getMissingDescriptions() {
        return missingDescriptions;
    }

    /**
     * Number of missing description for the entity
     * 
     */
    @JsonProperty("missingDescriptions")
    public void setMissingDescriptions(Integer missingDescriptions) {
        this.missingDescriptions = missingDescriptions;
    }

    public EntityReportData withMissingDescriptions(Integer missingDescriptions) {
        this.missingDescriptions = missingDescriptions;
        return this;
    }

    /**
     * number of entities with owner
     * 
     */
    @JsonProperty("hasOwner")
    public Integer getHasOwner() {
        return hasOwner;
    }

    /**
     * number of entities with owner
     * 
     */
    @JsonProperty("hasOwner")
    public void setHasOwner(Integer hasOwner) {
        this.hasOwner = hasOwner;
    }

    public EntityReportData withHasOwner(Integer hasOwner) {
        this.hasOwner = hasOwner;
        return this;
    }

    /**
     * number of entities missing owners
     * 
     */
    @JsonProperty("missingOwner")
    public Integer getMissingOwner() {
        return missingOwner;
    }

    /**
     * number of entities missing owners
     * 
     */
    @JsonProperty("missingOwner")
    public void setMissingOwner(Integer missingOwner) {
        this.missingOwner = missingOwner;
    }

    public EntityReportData withMissingOwner(Integer missingOwner) {
        this.missingOwner = missingOwner;
        return this;
    }

    /**
     * number of entities
     * 
     */
    @JsonProperty("entityCount")
    public Integer getEntityCount() {
        return entityCount;
    }

    /**
     * number of entities
     * 
     */
    @JsonProperty("entityCount")
    public void setEntityCount(Integer entityCount) {
        this.entityCount = entityCount;
    }

    public EntityReportData withEntityCount(Integer entityCount) {
        this.entityCount = entityCount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityReportData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("serviceName");
        sb.append('=');
        sb.append(((this.serviceName == null)?"<null>":this.serviceName));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("entityTier");
        sb.append('=');
        sb.append(((this.entityTier == null)?"<null>":this.entityTier));
        sb.append(',');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null)?"<null>":this.team));
        sb.append(',');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("completedDescriptions");
        sb.append('=');
        sb.append(((this.completedDescriptions == null)?"<null>":this.completedDescriptions));
        sb.append(',');
        sb.append("missingDescriptions");
        sb.append('=');
        sb.append(((this.missingDescriptions == null)?"<null>":this.missingDescriptions));
        sb.append(',');
        sb.append("hasOwner");
        sb.append('=');
        sb.append(((this.hasOwner == null)?"<null>":this.hasOwner));
        sb.append(',');
        sb.append("missingOwner");
        sb.append('=');
        sb.append(((this.missingOwner == null)?"<null>":this.missingOwner));
        sb.append(',');
        sb.append("entityCount");
        sb.append('=');
        sb.append(((this.entityCount == null)?"<null>":this.entityCount));
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
        result = ((result* 31)+((this.missingDescriptions == null)? 0 :this.missingDescriptions.hashCode()));
        result = ((result* 31)+((this.missingOwner == null)? 0 :this.missingOwner.hashCode()));
        result = ((result* 31)+((this.entityCount == null)? 0 :this.entityCount.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        result = ((result* 31)+((this.completedDescriptions == null)? 0 :this.completedDescriptions.hashCode()));
        result = ((result* 31)+((this.serviceName == null)? 0 :this.serviceName.hashCode()));
        result = ((result* 31)+((this.hasOwner == null)? 0 :this.hasOwner.hashCode()));
        result = ((result* 31)+((this.entityTier == null)? 0 :this.entityTier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityReportData) == false) {
            return false;
        }
        EntityReportData rhs = ((EntityReportData) other);
        return (((((((((((this.missingDescriptions == rhs.missingDescriptions)||((this.missingDescriptions!= null)&&this.missingDescriptions.equals(rhs.missingDescriptions)))&&((this.missingOwner == rhs.missingOwner)||((this.missingOwner!= null)&&this.missingOwner.equals(rhs.missingOwner))))&&((this.entityCount == rhs.entityCount)||((this.entityCount!= null)&&this.entityCount.equals(rhs.entityCount))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))))&&((this.completedDescriptions == rhs.completedDescriptions)||((this.completedDescriptions!= null)&&this.completedDescriptions.equals(rhs.completedDescriptions))))&&((this.serviceName == rhs.serviceName)||((this.serviceName!= null)&&this.serviceName.equals(rhs.serviceName))))&&((this.hasOwner == rhs.hasOwner)||((this.hasOwner!= null)&&this.hasOwner.equals(rhs.hasOwner))))&&((this.entityTier == rhs.entityTier)||((this.entityTier!= null)&&this.entityTier.equals(rhs.entityTier))));
    }

}
