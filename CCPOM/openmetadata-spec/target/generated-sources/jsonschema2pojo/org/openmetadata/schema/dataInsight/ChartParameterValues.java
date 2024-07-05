
package org.openmetadata.schema.dataInsight;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.DataInsightChartDataType;


/**
 * This schema defines the parameter values for a chart.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "chartDataType"
})
@Generated("jsonschema2pojo")
public class ChartParameterValues {

    /**
     * name of the parameter.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("name of the parameter.")
    private String name;
    /**
     * Display Name that identifies this parameter name.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this parameter name.")
    private String displayName;
    /**
     * Data type of the parameter (int, date etc.).
     * 
     */
    @JsonProperty("chartDataType")
    @JsonPropertyDescription("Data type of the parameter (int, date etc.).")
    private DataInsightChartDataType chartDataType;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * name of the parameter.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * name of the parameter.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ChartParameterValues withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this parameter name.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this parameter name.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ChartParameterValues withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Data type of the parameter (int, date etc.).
     * 
     */
    @JsonProperty("chartDataType")
    public DataInsightChartDataType getChartDataType() {
        return chartDataType;
    }

    /**
     * Data type of the parameter (int, date etc.).
     * 
     */
    @JsonProperty("chartDataType")
    public void setChartDataType(DataInsightChartDataType chartDataType) {
        this.chartDataType = chartDataType;
    }

    public ChartParameterValues withChartDataType(DataInsightChartDataType chartDataType) {
        this.chartDataType = chartDataType;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ChartParameterValues withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChartParameterValues.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("chartDataType");
        sb.append('=');
        sb.append(((this.chartDataType == null)?"<null>":this.chartDataType));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.chartDataType == null)? 0 :this.chartDataType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChartParameterValues) == false) {
            return false;
        }
        ChartParameterValues rhs = ((ChartParameterValues) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.chartDataType == rhs.chartDataType)||((this.chartDataType!= null)&&this.chartDataType.equals(rhs.chartDataType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))));
    }

}
