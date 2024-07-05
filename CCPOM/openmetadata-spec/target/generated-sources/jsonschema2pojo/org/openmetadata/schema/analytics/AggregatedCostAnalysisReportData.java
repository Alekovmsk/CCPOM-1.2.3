
package org.openmetadata.schema.analytics;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * aggregatedCostAnalysisReportData
 * <p>
 * Aggregated data for Cost Analysis Report.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "unusedDataAssets",
    "frequentlyUsedDataAssets",
    "totalSize",
    "totalCount",
    "serviceName",
    "serviceType",
    "entityType",
    "serviceOwner"
})
@Generated("jsonschema2pojo")
public class AggregatedCostAnalysisReportData {

    /**
     * Store the Count and Size in bytes of the Data Assets over a time period
     * 
     */
    @JsonProperty("unusedDataAssets")
    @JsonPropertyDescription("Store the Count and Size in bytes of the Data Assets over a time period")
    @Valid
    private DataAssetMetrics unusedDataAssets;
    /**
     * Store the Count and Size in bytes of the Data Assets over a time period
     * 
     */
    @JsonProperty("frequentlyUsedDataAssets")
    @JsonPropertyDescription("Store the Count and Size in bytes of the Data Assets over a time period")
    @Valid
    private DataAssetMetrics frequentlyUsedDataAssets;
    /**
     * Total Size based in Bytes
     * 
     */
    @JsonProperty("totalSize")
    @JsonPropertyDescription("Total Size based in Bytes")
    private Double totalSize;
    /**
     * Total Count
     * 
     */
    @JsonProperty("totalCount")
    @JsonPropertyDescription("Total Count")
    private Double totalCount;
    /**
     * Name of the service
     * 
     */
    @JsonProperty("serviceName")
    @JsonPropertyDescription("Name of the service")
    private String serviceName;
    /**
     * Type of the service
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("Type of the service")
    private String serviceType;
    /**
     * Type of the entity
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("Type of the entity")
    private String entityType;
    /**
     * Name of the service owner
     * 
     */
    @JsonProperty("serviceOwner")
    @JsonPropertyDescription("Name of the service owner")
    private String serviceOwner;

    /**
     * Store the Count and Size in bytes of the Data Assets over a time period
     * 
     */
    @JsonProperty("unusedDataAssets")
    public DataAssetMetrics getUnusedDataAssets() {
        return unusedDataAssets;
    }

    /**
     * Store the Count and Size in bytes of the Data Assets over a time period
     * 
     */
    @JsonProperty("unusedDataAssets")
    public void setUnusedDataAssets(DataAssetMetrics unusedDataAssets) {
        this.unusedDataAssets = unusedDataAssets;
    }

    public AggregatedCostAnalysisReportData withUnusedDataAssets(DataAssetMetrics unusedDataAssets) {
        this.unusedDataAssets = unusedDataAssets;
        return this;
    }

    /**
     * Store the Count and Size in bytes of the Data Assets over a time period
     * 
     */
    @JsonProperty("frequentlyUsedDataAssets")
    public DataAssetMetrics getFrequentlyUsedDataAssets() {
        return frequentlyUsedDataAssets;
    }

    /**
     * Store the Count and Size in bytes of the Data Assets over a time period
     * 
     */
    @JsonProperty("frequentlyUsedDataAssets")
    public void setFrequentlyUsedDataAssets(DataAssetMetrics frequentlyUsedDataAssets) {
        this.frequentlyUsedDataAssets = frequentlyUsedDataAssets;
    }

    public AggregatedCostAnalysisReportData withFrequentlyUsedDataAssets(DataAssetMetrics frequentlyUsedDataAssets) {
        this.frequentlyUsedDataAssets = frequentlyUsedDataAssets;
        return this;
    }

    /**
     * Total Size based in Bytes
     * 
     */
    @JsonProperty("totalSize")
    public Double getTotalSize() {
        return totalSize;
    }

    /**
     * Total Size based in Bytes
     * 
     */
    @JsonProperty("totalSize")
    public void setTotalSize(Double totalSize) {
        this.totalSize = totalSize;
    }

    public AggregatedCostAnalysisReportData withTotalSize(Double totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * Total Count
     * 
     */
    @JsonProperty("totalCount")
    public Double getTotalCount() {
        return totalCount;
    }

    /**
     * Total Count
     * 
     */
    @JsonProperty("totalCount")
    public void setTotalCount(Double totalCount) {
        this.totalCount = totalCount;
    }

    public AggregatedCostAnalysisReportData withTotalCount(Double totalCount) {
        this.totalCount = totalCount;
        return this;
    }

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

    public AggregatedCostAnalysisReportData withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Type of the service
     * 
     */
    @JsonProperty("serviceType")
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Type of the service
     * 
     */
    @JsonProperty("serviceType")
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public AggregatedCostAnalysisReportData withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Type of the entity
     * 
     */
    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    /**
     * Type of the entity
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public AggregatedCostAnalysisReportData withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Name of the service owner
     * 
     */
    @JsonProperty("serviceOwner")
    public String getServiceOwner() {
        return serviceOwner;
    }

    /**
     * Name of the service owner
     * 
     */
    @JsonProperty("serviceOwner")
    public void setServiceOwner(String serviceOwner) {
        this.serviceOwner = serviceOwner;
    }

    public AggregatedCostAnalysisReportData withServiceOwner(String serviceOwner) {
        this.serviceOwner = serviceOwner;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AggregatedCostAnalysisReportData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("unusedDataAssets");
        sb.append('=');
        sb.append(((this.unusedDataAssets == null)?"<null>":this.unusedDataAssets));
        sb.append(',');
        sb.append("frequentlyUsedDataAssets");
        sb.append('=');
        sb.append(((this.frequentlyUsedDataAssets == null)?"<null>":this.frequentlyUsedDataAssets));
        sb.append(',');
        sb.append("totalSize");
        sb.append('=');
        sb.append(((this.totalSize == null)?"<null>":this.totalSize));
        sb.append(',');
        sb.append("totalCount");
        sb.append('=');
        sb.append(((this.totalCount == null)?"<null>":this.totalCount));
        sb.append(',');
        sb.append("serviceName");
        sb.append('=');
        sb.append(((this.serviceName == null)?"<null>":this.serviceName));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("serviceOwner");
        sb.append('=');
        sb.append(((this.serviceOwner == null)?"<null>":this.serviceOwner));
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
        result = ((result* 31)+((this.serviceType == null)? 0 :this.serviceType.hashCode()));
        result = ((result* 31)+((this.unusedDataAssets == null)? 0 :this.unusedDataAssets.hashCode()));
        result = ((result* 31)+((this.totalSize == null)? 0 :this.totalSize.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.serviceOwner == null)? 0 :this.serviceOwner.hashCode()));
        result = ((result* 31)+((this.totalCount == null)? 0 :this.totalCount.hashCode()));
        result = ((result* 31)+((this.serviceName == null)? 0 :this.serviceName.hashCode()));
        result = ((result* 31)+((this.frequentlyUsedDataAssets == null)? 0 :this.frequentlyUsedDataAssets.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AggregatedCostAnalysisReportData) == false) {
            return false;
        }
        AggregatedCostAnalysisReportData rhs = ((AggregatedCostAnalysisReportData) other);
        return (((((((((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType)))&&((this.unusedDataAssets == rhs.unusedDataAssets)||((this.unusedDataAssets!= null)&&this.unusedDataAssets.equals(rhs.unusedDataAssets))))&&((this.totalSize == rhs.totalSize)||((this.totalSize!= null)&&this.totalSize.equals(rhs.totalSize))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.serviceOwner == rhs.serviceOwner)||((this.serviceOwner!= null)&&this.serviceOwner.equals(rhs.serviceOwner))))&&((this.totalCount == rhs.totalCount)||((this.totalCount!= null)&&this.totalCount.equals(rhs.totalCount))))&&((this.serviceName == rhs.serviceName)||((this.serviceName!= null)&&this.serviceName.equals(rhs.serviceName))))&&((this.frequentlyUsedDataAssets == rhs.frequentlyUsedDataAssets)||((this.frequentlyUsedDataAssets!= null)&&this.frequentlyUsedDataAssets.equals(rhs.frequentlyUsedDataAssets))));
    }

}
