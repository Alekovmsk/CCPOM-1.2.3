
package org.openmetadata.schema.api.domains;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "elNumber",
    "subsystem",
    "resourceType",
    "quotaSize",
    "comment"
})
@Generated("jsonschema2pojo")
public class DomainQuota {

    /**
     * Quota number
     * 
     */
    @JsonProperty("elNumber")
    @JsonPropertyDescription("Quota number")
    private String elNumber;
    /**
     * subsystem name
     * 
     */
    @JsonProperty("subsystem")
    @JsonPropertyDescription("subsystem name")
    private String subsystem;
    /**
     * resource type
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("resource type")
    private String resourceType;
    /**
     * Quota size
     * 
     */
    @JsonProperty("quotaSize")
    @JsonPropertyDescription("Quota size")
    private String quotaSize;
    /**
     * comment
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("comment")
    private String comment;

    /**
     * Quota number
     * 
     */
    @JsonProperty("elNumber")
    public String getElNumber() {
        return elNumber;
    }

    /**
     * Quota number
     * 
     */
    @JsonProperty("elNumber")
    public void setElNumber(String elNumber) {
        this.elNumber = elNumber;
    }

    public DomainQuota withElNumber(String elNumber) {
        this.elNumber = elNumber;
        return this;
    }

    /**
     * subsystem name
     * 
     */
    @JsonProperty("subsystem")
    public String getSubsystem() {
        return subsystem;
    }

    /**
     * subsystem name
     * 
     */
    @JsonProperty("subsystem")
    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }

    public DomainQuota withSubsystem(String subsystem) {
        this.subsystem = subsystem;
        return this;
    }

    /**
     * resource type
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * resource type
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public DomainQuota withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Quota size
     * 
     */
    @JsonProperty("quotaSize")
    public String getQuotaSize() {
        return quotaSize;
    }

    /**
     * Quota size
     * 
     */
    @JsonProperty("quotaSize")
    public void setQuotaSize(String quotaSize) {
        this.quotaSize = quotaSize;
    }

    public DomainQuota withQuotaSize(String quotaSize) {
        this.quotaSize = quotaSize;
        return this;
    }

    /**
     * comment
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * comment
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public DomainQuota withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomainQuota.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("elNumber");
        sb.append('=');
        sb.append(((this.elNumber == null)?"<null>":this.elNumber));
        sb.append(',');
        sb.append("subsystem");
        sb.append('=');
        sb.append(((this.subsystem == null)?"<null>":this.subsystem));
        sb.append(',');
        sb.append("resourceType");
        sb.append('=');
        sb.append(((this.resourceType == null)?"<null>":this.resourceType));
        sb.append(',');
        sb.append("quotaSize");
        sb.append('=');
        sb.append(((this.quotaSize == null)?"<null>":this.quotaSize));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.subsystem == null)? 0 :this.subsystem.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.quotaSize == null)? 0 :this.quotaSize.hashCode()));
        result = ((result* 31)+((this.elNumber == null)? 0 :this.elNumber.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomainQuota) == false) {
            return false;
        }
        DomainQuota rhs = ((DomainQuota) other);
        return ((((((this.subsystem == rhs.subsystem)||((this.subsystem!= null)&&this.subsystem.equals(rhs.subsystem)))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.quotaSize == rhs.quotaSize)||((this.quotaSize!= null)&&this.quotaSize.equals(rhs.quotaSize))))&&((this.elNumber == rhs.elNumber)||((this.elNumber!= null)&&this.elNumber.equals(rhs.elNumber))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
