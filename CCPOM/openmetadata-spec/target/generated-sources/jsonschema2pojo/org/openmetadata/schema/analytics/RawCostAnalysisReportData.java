
package org.openmetadata.schema.analytics;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.LifeCycle;


/**
 * rawCostAnalysisReportData
 * <p>
 * Raw data for Cost Analysis Report.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entity",
    "lifeCycle",
    "sizeInByte"
})
@Generated("jsonschema2pojo")
public class RawCostAnalysisReportData {

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("entity")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference entity;
    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    @JsonPropertyDescription("This schema defines Life Cycle Properties.")
    @Valid
    private LifeCycle lifeCycle;
    /**
     * Entity size in bytes
     * 
     */
    @JsonProperty("sizeInByte")
    @JsonPropertyDescription("Entity size in bytes")
    private Double sizeInByte;

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("entity")
    public EntityReference getEntity() {
        return entity;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("entity")
    public void setEntity(EntityReference entity) {
        this.entity = entity;
    }

    public RawCostAnalysisReportData withEntity(EntityReference entity) {
        this.entity = entity;
        return this;
    }

    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    public LifeCycle getLifeCycle() {
        return lifeCycle;
    }

    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    public void setLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public RawCostAnalysisReportData withLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }

    /**
     * Entity size in bytes
     * 
     */
    @JsonProperty("sizeInByte")
    public Double getSizeInByte() {
        return sizeInByte;
    }

    /**
     * Entity size in bytes
     * 
     */
    @JsonProperty("sizeInByte")
    public void setSizeInByte(Double sizeInByte) {
        this.sizeInByte = sizeInByte;
    }

    public RawCostAnalysisReportData withSizeInByte(Double sizeInByte) {
        this.sizeInByte = sizeInByte;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RawCostAnalysisReportData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entity");
        sb.append('=');
        sb.append(((this.entity == null)?"<null>":this.entity));
        sb.append(',');
        sb.append("lifeCycle");
        sb.append('=');
        sb.append(((this.lifeCycle == null)?"<null>":this.lifeCycle));
        sb.append(',');
        sb.append("sizeInByte");
        sb.append('=');
        sb.append(((this.sizeInByte == null)?"<null>":this.sizeInByte));
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
        result = ((result* 31)+((this.lifeCycle == null)? 0 :this.lifeCycle.hashCode()));
        result = ((result* 31)+((this.sizeInByte == null)? 0 :this.sizeInByte.hashCode()));
        result = ((result* 31)+((this.entity == null)? 0 :this.entity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RawCostAnalysisReportData) == false) {
            return false;
        }
        RawCostAnalysisReportData rhs = ((RawCostAnalysisReportData) other);
        return ((((this.lifeCycle == rhs.lifeCycle)||((this.lifeCycle!= null)&&this.lifeCycle.equals(rhs.lifeCycle)))&&((this.sizeInByte == rhs.sizeInByte)||((this.sizeInByte!= null)&&this.sizeInByte.equals(rhs.sizeInByte))))&&((this.entity == rhs.entity)||((this.entity!= null)&&this.entity.equals(rhs.entity))));
    }

}
