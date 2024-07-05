
package org.openmetadata.schema.dataInsight.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.DataInsightInterface;


/**
 * PercentageOfServicesWithDescription
 * <p>
 * PercentageOfServicesWithDescription data blob
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "serviceName",
    "completedDescriptionFraction",
    "completedDescription",
    "entityCount"
})
@Generated("jsonschema2pojo")
public class PercentageOfServicesWithDescription implements DataInsightInterface
{

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * Type of entity. Derived from the entity class.
     * 
     */
    @JsonProperty("serviceName")
    @JsonPropertyDescription("Type of entity. Derived from the entity class.")
    private String serviceName;
    /**
     * decimal fraction of entity with completed description
     * 
     */
    @JsonProperty("completedDescriptionFraction")
    @JsonPropertyDescription("decimal fraction of entity with completed description")
    private Double completedDescriptionFraction;
    /**
     * decimal fraction of entity with completed description
     * 
     */
    @JsonProperty("completedDescription")
    @JsonPropertyDescription("decimal fraction of entity with completed description")
    private Double completedDescription;
    /**
     * Decimal fraction of entity with an owner.
     * 
     */
    @JsonProperty("entityCount")
    @JsonPropertyDescription("Decimal fraction of entity with an owner.")
    private Double entityCount;

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

    public PercentageOfServicesWithDescription withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Type of entity. Derived from the entity class.
     * 
     */
    @JsonProperty("serviceName")
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Type of entity. Derived from the entity class.
     * 
     */
    @JsonProperty("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public PercentageOfServicesWithDescription withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * decimal fraction of entity with completed description
     * 
     */
    @JsonProperty("completedDescriptionFraction")
    public Double getCompletedDescriptionFraction() {
        return completedDescriptionFraction;
    }

    /**
     * decimal fraction of entity with completed description
     * 
     */
    @JsonProperty("completedDescriptionFraction")
    public void setCompletedDescriptionFraction(Double completedDescriptionFraction) {
        this.completedDescriptionFraction = completedDescriptionFraction;
    }

    public PercentageOfServicesWithDescription withCompletedDescriptionFraction(Double completedDescriptionFraction) {
        this.completedDescriptionFraction = completedDescriptionFraction;
        return this;
    }

    /**
     * decimal fraction of entity with completed description
     * 
     */
    @JsonProperty("completedDescription")
    public Double getCompletedDescription() {
        return completedDescription;
    }

    /**
     * decimal fraction of entity with completed description
     * 
     */
    @JsonProperty("completedDescription")
    public void setCompletedDescription(Double completedDescription) {
        this.completedDescription = completedDescription;
    }

    public PercentageOfServicesWithDescription withCompletedDescription(Double completedDescription) {
        this.completedDescription = completedDescription;
        return this;
    }

    /**
     * Decimal fraction of entity with an owner.
     * 
     */
    @JsonProperty("entityCount")
    public Double getEntityCount() {
        return entityCount;
    }

    /**
     * Decimal fraction of entity with an owner.
     * 
     */
    @JsonProperty("entityCount")
    public void setEntityCount(Double entityCount) {
        this.entityCount = entityCount;
    }

    public PercentageOfServicesWithDescription withEntityCount(Double entityCount) {
        this.entityCount = entityCount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PercentageOfServicesWithDescription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("serviceName");
        sb.append('=');
        sb.append(((this.serviceName == null)?"<null>":this.serviceName));
        sb.append(',');
        sb.append("completedDescriptionFraction");
        sb.append('=');
        sb.append(((this.completedDescriptionFraction == null)?"<null>":this.completedDescriptionFraction));
        sb.append(',');
        sb.append("completedDescription");
        sb.append('=');
        sb.append(((this.completedDescription == null)?"<null>":this.completedDescription));
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
        result = ((result* 31)+((this.completedDescription == null)? 0 :this.completedDescription.hashCode()));
        result = ((result* 31)+((this.serviceName == null)? 0 :this.serviceName.hashCode()));
        result = ((result* 31)+((this.entityCount == null)? 0 :this.entityCount.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.completedDescriptionFraction == null)? 0 :this.completedDescriptionFraction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PercentageOfServicesWithDescription) == false) {
            return false;
        }
        PercentageOfServicesWithDescription rhs = ((PercentageOfServicesWithDescription) other);
        return ((((((this.completedDescription == rhs.completedDescription)||((this.completedDescription!= null)&&this.completedDescription.equals(rhs.completedDescription)))&&((this.serviceName == rhs.serviceName)||((this.serviceName!= null)&&this.serviceName.equals(rhs.serviceName))))&&((this.entityCount == rhs.entityCount)||((this.entityCount!= null)&&this.entityCount.equals(rhs.entityCount))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.completedDescriptionFraction == rhs.completedDescriptionFraction)||((this.completedDescriptionFraction!= null)&&this.completedDescriptionFraction.equals(rhs.completedDescriptionFraction))));
    }

}
