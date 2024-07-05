
package org.openmetadata.schema.dataInsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DataInsightChartResult
 * <p>
 * DataInsightChartResult represents data that will be consumed by a specific chart
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "chartType",
    "total",
    "data"
})
@Generated("jsonschema2pojo")
public class DataInsightChartResult {

    /**
     * chart type. Must match `name` of a `dataInsightChartDefinition`.
     * (Required)
     * 
     */
    @JsonProperty("chartType")
    @JsonPropertyDescription("chart type. Must match `name` of a `dataInsightChartDefinition`.")
    @NotNull
    private DataInsightChartResult.DataInsightChartType chartType;
    /**
     * Total number of hits returned by the aggregation.
     * 
     */
    @JsonProperty("total")
    @JsonPropertyDescription("Total number of hits returned by the aggregation.")
    private Integer total;
    /**
     * Array of consumable data.
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("Array of consumable data.")
    @Valid
    private List<Object> data = new ArrayList<Object>();

    /**
     * chart type. Must match `name` of a `dataInsightChartDefinition`.
     * (Required)
     * 
     */
    @JsonProperty("chartType")
    public DataInsightChartResult.DataInsightChartType getChartType() {
        return chartType;
    }

    /**
     * chart type. Must match `name` of a `dataInsightChartDefinition`.
     * (Required)
     * 
     */
    @JsonProperty("chartType")
    public void setChartType(DataInsightChartResult.DataInsightChartType chartType) {
        this.chartType = chartType;
    }

    public DataInsightChartResult withChartType(DataInsightChartResult.DataInsightChartType chartType) {
        this.chartType = chartType;
        return this;
    }

    /**
     * Total number of hits returned by the aggregation.
     * 
     */
    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    /**
     * Total number of hits returned by the aggregation.
     * 
     */
    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public DataInsightChartResult withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Array of consumable data.
     * 
     */
    @JsonProperty("data")
    public List<Object> getData() {
        return data;
    }

    /**
     * Array of consumable data.
     * 
     */
    @JsonProperty("data")
    public void setData(List<Object> data) {
        this.data = data;
    }

    public DataInsightChartResult withData(List<Object> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataInsightChartResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chartType");
        sb.append('=');
        sb.append(((this.chartType == null)?"<null>":this.chartType));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
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
        result = ((result* 31)+((this.chartType == null)? 0 :this.chartType.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataInsightChartResult) == false) {
            return false;
        }
        DataInsightChartResult rhs = ((DataInsightChartResult) other);
        return ((((this.chartType == rhs.chartType)||((this.chartType!= null)&&this.chartType.equals(rhs.chartType)))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))));
    }


    /**
     * chart type. Must match `name` of a `dataInsightChartDefinition`.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DataInsightChartType {

        TOTAL_ENTITIES_BY_TYPE("TotalEntitiesByType"),
        TOTAL_ENTITIES_BY_TIER("TotalEntitiesByTier"),
        PERCENTAGE_OF_ENTITIES_WITH_DESCRIPTION_BY_TYPE("PercentageOfEntitiesWithDescriptionByType"),
        PERCENTAGE_OF_ENTITIES_WITH_OWNER_BY_TYPE("PercentageOfEntitiesWithOwnerByType"),
        DAILY_ACTIVE_USERS("DailyActiveUsers"),
        MOST_ACTIVE_USERS("MostActiveUsers"),
        MOST_VIEWED_ENTITIES("MostViewedEntities"),
        PAGE_VIEWS_BY_ENTITIES("PageViewsByEntities"),
        PERCENTAGE_OF_SERVICES_WITH_DESCRIPTION("PercentageOfServicesWithDescription"),
        PERCENTAGE_OF_SERVICES_WITH_OWNER("PercentageOfServicesWithOwner"),
        UNUSED_ASSETS("UnusedAssets"),
        AGGREGATED_UNUSED_ASSETS_SIZE("AggregatedUnusedAssetsSize"),
        AGGREGATED_UNUSED_ASSETS_COUNT("AggregatedUnusedAssetsCount"),
        AGGREGATED_USED_VS_UNUSED_ASSETS_SIZE("AggregatedUsedVsUnusedAssetsSize"),
        AGGREGATED_USED_VS_UNUSED_ASSETS_COUNT("AggregatedUsedVsUnusedAssetsCount");
        private final String value;
        private final static Map<String, DataInsightChartResult.DataInsightChartType> CONSTANTS = new HashMap<String, DataInsightChartResult.DataInsightChartType>();

        static {
            for (DataInsightChartResult.DataInsightChartType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DataInsightChartType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static DataInsightChartResult.DataInsightChartType fromValue(String value) {
            DataInsightChartResult.DataInsightChartType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
