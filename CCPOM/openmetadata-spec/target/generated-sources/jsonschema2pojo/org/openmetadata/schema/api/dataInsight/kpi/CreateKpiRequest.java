
package org.openmetadata.schema.api.dataInsight.kpi;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.dataInsight.type.KpiTarget;
import org.openmetadata.schema.dataInsight.type.KpiTargetType;
import org.openmetadata.schema.type.EntityReference;


/**
 * CreateKpiRequest
 * <p>
 * Schema corresponding to a Kpi.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "owner",
    "dataInsightChart",
    "startDate",
    "endDate",
    "targetDefinition",
    "metricType"
})
@Generated("jsonschema2pojo")
public class CreateKpiRequest implements CreateEntity
{

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()%]+$")
    @Size(min = 1, max = 128)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this Kpi.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this Kpi.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    @NotNull
    private String description;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference owner;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("dataInsightChart")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String dataInsightChart;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    @NotNull
    private Long startDate;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    @NotNull
    private Long endDate;
    /**
     * Metrics from the chart and the target to achieve the result.
     * (Required)
     * 
     */
    @JsonProperty("targetDefinition")
    @JsonPropertyDescription("Metrics from the chart and the target to achieve the result.")
    @Valid
    @NotNull
    private List<KpiTarget> targetDefinition = new ArrayList<KpiTarget>();
    /**
     * This enum defines the type of key Result
     * (Required)
     * 
     */
    @JsonProperty("metricType")
    @JsonPropertyDescription("This enum defines the type of key Result")
    @NotNull
    private KpiTargetType metricType;

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreateKpiRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this Kpi.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this Kpi.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateKpiRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CreateKpiRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    public EntityReference getOwner() {
        return owner;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    public void setOwner(EntityReference owner) {
        this.owner = owner;
    }

    public CreateKpiRequest withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("dataInsightChart")
    public String getDataInsightChart() {
        return dataInsightChart;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("dataInsightChart")
    public void setDataInsightChart(String dataInsightChart) {
        this.dataInsightChart = dataInsightChart;
    }

    public CreateKpiRequest withDataInsightChart(String dataInsightChart) {
        this.dataInsightChart = dataInsightChart;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public Long getStartDate() {
        return startDate;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public CreateKpiRequest withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public Long getEndDate() {
        return endDate;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public CreateKpiRequest withEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Metrics from the chart and the target to achieve the result.
     * (Required)
     * 
     */
    @JsonProperty("targetDefinition")
    public List<KpiTarget> getTargetDefinition() {
        return targetDefinition;
    }

    /**
     * Metrics from the chart and the target to achieve the result.
     * (Required)
     * 
     */
    @JsonProperty("targetDefinition")
    public void setTargetDefinition(List<KpiTarget> targetDefinition) {
        this.targetDefinition = targetDefinition;
    }

    public CreateKpiRequest withTargetDefinition(List<KpiTarget> targetDefinition) {
        this.targetDefinition = targetDefinition;
        return this;
    }

    /**
     * This enum defines the type of key Result
     * (Required)
     * 
     */
    @JsonProperty("metricType")
    public KpiTargetType getMetricType() {
        return metricType;
    }

    /**
     * This enum defines the type of key Result
     * (Required)
     * 
     */
    @JsonProperty("metricType")
    public void setMetricType(KpiTargetType metricType) {
        this.metricType = metricType;
    }

    public CreateKpiRequest withMetricType(KpiTargetType metricType) {
        this.metricType = metricType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateKpiRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("dataInsightChart");
        sb.append('=');
        sb.append(((this.dataInsightChart == null)?"<null>":this.dataInsightChart));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("targetDefinition");
        sb.append('=');
        sb.append(((this.targetDefinition == null)?"<null>":this.targetDefinition));
        sb.append(',');
        sb.append("metricType");
        sb.append('=');
        sb.append(((this.metricType == null)?"<null>":this.metricType));
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
        result = ((result* 31)+((this.metricType == null)? 0 :this.metricType.hashCode()));
        result = ((result* 31)+((this.dataInsightChart == null)? 0 :this.dataInsightChart.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.targetDefinition == null)? 0 :this.targetDefinition.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateKpiRequest) == false) {
            return false;
        }
        CreateKpiRequest rhs = ((CreateKpiRequest) other);
        return ((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.metricType == rhs.metricType)||((this.metricType!= null)&&this.metricType.equals(rhs.metricType))))&&((this.dataInsightChart == rhs.dataInsightChart)||((this.dataInsightChart!= null)&&this.dataInsightChart.equals(rhs.dataInsightChart))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.targetDefinition == rhs.targetDefinition)||((this.targetDefinition!= null)&&this.targetDefinition.equals(rhs.targetDefinition))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
