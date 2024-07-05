
package org.openmetadata.schema.api.dataInsight;

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
import org.openmetadata.schema.dataInsight.ChartParameterValues;
import org.openmetadata.schema.type.DataReportIndex;
import org.openmetadata.schema.type.EntityReference;


/**
 * CreateDataInsightChart
 * <p>
 * Payload to create a data insight chart
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "dataIndexType",
    "dimensions",
    "metrics",
    "owner"
})
@Generated("jsonschema2pojo")
public class CreateDataInsightChart implements CreateEntity
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
     * Display Name the data insight chart.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name the data insight chart.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Index where data are stored
     * 
     */
    @JsonProperty("dataIndexType")
    @JsonPropertyDescription("Index where data are stored")
    private DataReportIndex dataIndexType;
    /**
     * Dimensions of the chart
     * 
     */
    @JsonProperty("dimensions")
    @JsonPropertyDescription("Dimensions of the chart")
    @Valid
    private List<ChartParameterValues> dimensions = new ArrayList<ChartParameterValues>();
    /**
     * Metrics of the chart
     * 
     */
    @JsonProperty("metrics")
    @JsonPropertyDescription("Metrics of the chart")
    @Valid
    private List<ChartParameterValues> metrics = new ArrayList<ChartParameterValues>();
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

    public CreateDataInsightChart withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name the data insight chart.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name the data insight chart.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateDataInsightChart withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CreateDataInsightChart withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Index where data are stored
     * 
     */
    @JsonProperty("dataIndexType")
    public DataReportIndex getDataIndexType() {
        return dataIndexType;
    }

    /**
     * Index where data are stored
     * 
     */
    @JsonProperty("dataIndexType")
    public void setDataIndexType(DataReportIndex dataIndexType) {
        this.dataIndexType = dataIndexType;
    }

    public CreateDataInsightChart withDataIndexType(DataReportIndex dataIndexType) {
        this.dataIndexType = dataIndexType;
        return this;
    }

    /**
     * Dimensions of the chart
     * 
     */
    @JsonProperty("dimensions")
    public List<ChartParameterValues> getDimensions() {
        return dimensions;
    }

    /**
     * Dimensions of the chart
     * 
     */
    @JsonProperty("dimensions")
    public void setDimensions(List<ChartParameterValues> dimensions) {
        this.dimensions = dimensions;
    }

    public CreateDataInsightChart withDimensions(List<ChartParameterValues> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Metrics of the chart
     * 
     */
    @JsonProperty("metrics")
    public List<ChartParameterValues> getMetrics() {
        return metrics;
    }

    /**
     * Metrics of the chart
     * 
     */
    @JsonProperty("metrics")
    public void setMetrics(List<ChartParameterValues> metrics) {
        this.metrics = metrics;
    }

    public CreateDataInsightChart withMetrics(List<ChartParameterValues> metrics) {
        this.metrics = metrics;
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

    public CreateDataInsightChart withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateDataInsightChart.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("dataIndexType");
        sb.append('=');
        sb.append(((this.dataIndexType == null)?"<null>":this.dataIndexType));
        sb.append(',');
        sb.append("dimensions");
        sb.append('=');
        sb.append(((this.dimensions == null)?"<null>":this.dimensions));
        sb.append(',');
        sb.append("metrics");
        sb.append('=');
        sb.append(((this.metrics == null)?"<null>":this.metrics));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
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
        result = ((result* 31)+((this.dataIndexType == null)? 0 :this.dataIndexType.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.metrics == null)? 0 :this.metrics.hashCode()));
        result = ((result* 31)+((this.dimensions == null)? 0 :this.dimensions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateDataInsightChart) == false) {
            return false;
        }
        CreateDataInsightChart rhs = ((CreateDataInsightChart) other);
        return ((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.dataIndexType == rhs.dataIndexType)||((this.dataIndexType!= null)&&this.dataIndexType.equals(rhs.dataIndexType))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.metrics == rhs.metrics)||((this.metrics!= null)&&this.metrics.equals(rhs.metrics))))&&((this.dimensions == rhs.dimensions)||((this.dimensions!= null)&&this.dimensions.equals(rhs.dimensions))));
    }

}
