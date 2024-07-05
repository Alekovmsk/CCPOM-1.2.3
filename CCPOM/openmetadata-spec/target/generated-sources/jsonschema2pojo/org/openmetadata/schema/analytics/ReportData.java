
package org.openmetadata.schema.analytics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.EntityTimeSeriesInterface;


/**
 * reportData
 * <p>
 * Report Data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "timestamp",
    "reportDataType",
    "data"
})
@Generated("jsonschema2pojo")
public class ReportData implements EntityTimeSeriesInterface
{

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    @NotNull
    private Long timestamp;
    /**
     * Type of data
     * 
     */
    @JsonProperty("reportDataType")
    @JsonPropertyDescription("Type of data")
    private ReportData.ReportDataType reportDataType;
    /**
     * Data captured
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("Data captured")
    private Object data;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    public ReportData withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ReportData withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Type of data
     * 
     */
    @JsonProperty("reportDataType")
    public ReportData.ReportDataType getReportDataType() {
        return reportDataType;
    }

    /**
     * Type of data
     * 
     */
    @JsonProperty("reportDataType")
    public void setReportDataType(ReportData.ReportDataType reportDataType) {
        this.reportDataType = reportDataType;
    }

    public ReportData withReportDataType(ReportData.ReportDataType reportDataType) {
        this.reportDataType = reportDataType;
        return this;
    }

    /**
     * Data captured
     * 
     */
    @JsonProperty("data")
    public Object getData() {
        return data;
    }

    /**
     * Data captured
     * 
     */
    @JsonProperty("data")
    public void setData(Object data) {
        this.data = data;
    }

    public ReportData withData(Object data) {
        this.data = data;
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

    public ReportData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReportData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("reportDataType");
        sb.append('=');
        sb.append(((this.reportDataType == null)?"<null>":this.reportDataType));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.reportDataType == null)? 0 :this.reportDataType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReportData) == false) {
            return false;
        }
        ReportData rhs = ((ReportData) other);
        return ((((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.reportDataType == rhs.reportDataType)||((this.reportDataType!= null)&&this.reportDataType.equals(rhs.reportDataType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }


    /**
     * Type of data
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ReportDataType {

        ENTITY_REPORT_DATA("entityReportData"),
        WEB_ANALYTIC_USER_ACTIVITY_REPORT_DATA("webAnalyticUserActivityReportData"),
        WEB_ANALYTIC_ENTITY_VIEW_REPORT_DATA("webAnalyticEntityViewReportData"),
        RAW_COST_ANALYSIS_REPORT_DATA("rawCostAnalysisReportData"),
        AGGREGATED_COST_ANALYSIS_REPORT_DATA("aggregatedCostAnalysisReportData");
        private final String value;
        private final static Map<String, ReportData.ReportDataType> CONSTANTS = new HashMap<String, ReportData.ReportDataType>();

        static {
            for (ReportData.ReportDataType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ReportDataType(String value) {
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
        public static ReportData.ReportDataType fromValue(String value) {
            ReportData.ReportDataType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
