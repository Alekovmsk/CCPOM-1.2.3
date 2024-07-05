
package org.openmetadata.schema.util;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Services Count
 * <p>
 * This schema defines Services Count. This contains aggregated services count.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "databaseServiceCount",
    "messagingServiceCount",
    "dashboardServiceCount",
    "pipelineServiceCount",
    "mlModelServiceCount",
    "storageServiceCount"
})
@Generated("jsonschema2pojo")
public class ServicesCount {

    /**
     * Database Service Count
     * 
     */
    @JsonProperty("databaseServiceCount")
    @JsonPropertyDescription("Database Service Count")
    private Integer databaseServiceCount;
    /**
     * Messaging Service Count
     * 
     */
    @JsonProperty("messagingServiceCount")
    @JsonPropertyDescription("Messaging Service Count")
    private Integer messagingServiceCount;
    /**
     * Dashboard Service Count
     * 
     */
    @JsonProperty("dashboardServiceCount")
    @JsonPropertyDescription("Dashboard Service Count")
    private Integer dashboardServiceCount;
    /**
     * Pipeline Service Count
     * 
     */
    @JsonProperty("pipelineServiceCount")
    @JsonPropertyDescription("Pipeline Service Count")
    private Integer pipelineServiceCount;
    /**
     * MlModel Service Count
     * 
     */
    @JsonProperty("mlModelServiceCount")
    @JsonPropertyDescription("MlModel Service Count")
    private Integer mlModelServiceCount;
    /**
     * Storage Service Count
     * 
     */
    @JsonProperty("storageServiceCount")
    @JsonPropertyDescription("Storage Service Count")
    private Integer storageServiceCount;

    /**
     * Database Service Count
     * 
     */
    @JsonProperty("databaseServiceCount")
    public Integer getDatabaseServiceCount() {
        return databaseServiceCount;
    }

    /**
     * Database Service Count
     * 
     */
    @JsonProperty("databaseServiceCount")
    public void setDatabaseServiceCount(Integer databaseServiceCount) {
        this.databaseServiceCount = databaseServiceCount;
    }

    public ServicesCount withDatabaseServiceCount(Integer databaseServiceCount) {
        this.databaseServiceCount = databaseServiceCount;
        return this;
    }

    /**
     * Messaging Service Count
     * 
     */
    @JsonProperty("messagingServiceCount")
    public Integer getMessagingServiceCount() {
        return messagingServiceCount;
    }

    /**
     * Messaging Service Count
     * 
     */
    @JsonProperty("messagingServiceCount")
    public void setMessagingServiceCount(Integer messagingServiceCount) {
        this.messagingServiceCount = messagingServiceCount;
    }

    public ServicesCount withMessagingServiceCount(Integer messagingServiceCount) {
        this.messagingServiceCount = messagingServiceCount;
        return this;
    }

    /**
     * Dashboard Service Count
     * 
     */
    @JsonProperty("dashboardServiceCount")
    public Integer getDashboardServiceCount() {
        return dashboardServiceCount;
    }

    /**
     * Dashboard Service Count
     * 
     */
    @JsonProperty("dashboardServiceCount")
    public void setDashboardServiceCount(Integer dashboardServiceCount) {
        this.dashboardServiceCount = dashboardServiceCount;
    }

    public ServicesCount withDashboardServiceCount(Integer dashboardServiceCount) {
        this.dashboardServiceCount = dashboardServiceCount;
        return this;
    }

    /**
     * Pipeline Service Count
     * 
     */
    @JsonProperty("pipelineServiceCount")
    public Integer getPipelineServiceCount() {
        return pipelineServiceCount;
    }

    /**
     * Pipeline Service Count
     * 
     */
    @JsonProperty("pipelineServiceCount")
    public void setPipelineServiceCount(Integer pipelineServiceCount) {
        this.pipelineServiceCount = pipelineServiceCount;
    }

    public ServicesCount withPipelineServiceCount(Integer pipelineServiceCount) {
        this.pipelineServiceCount = pipelineServiceCount;
        return this;
    }

    /**
     * MlModel Service Count
     * 
     */
    @JsonProperty("mlModelServiceCount")
    public Integer getMlModelServiceCount() {
        return mlModelServiceCount;
    }

    /**
     * MlModel Service Count
     * 
     */
    @JsonProperty("mlModelServiceCount")
    public void setMlModelServiceCount(Integer mlModelServiceCount) {
        this.mlModelServiceCount = mlModelServiceCount;
    }

    public ServicesCount withMlModelServiceCount(Integer mlModelServiceCount) {
        this.mlModelServiceCount = mlModelServiceCount;
        return this;
    }

    /**
     * Storage Service Count
     * 
     */
    @JsonProperty("storageServiceCount")
    public Integer getStorageServiceCount() {
        return storageServiceCount;
    }

    /**
     * Storage Service Count
     * 
     */
    @JsonProperty("storageServiceCount")
    public void setStorageServiceCount(Integer storageServiceCount) {
        this.storageServiceCount = storageServiceCount;
    }

    public ServicesCount withStorageServiceCount(Integer storageServiceCount) {
        this.storageServiceCount = storageServiceCount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServicesCount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("databaseServiceCount");
        sb.append('=');
        sb.append(((this.databaseServiceCount == null)?"<null>":this.databaseServiceCount));
        sb.append(',');
        sb.append("messagingServiceCount");
        sb.append('=');
        sb.append(((this.messagingServiceCount == null)?"<null>":this.messagingServiceCount));
        sb.append(',');
        sb.append("dashboardServiceCount");
        sb.append('=');
        sb.append(((this.dashboardServiceCount == null)?"<null>":this.dashboardServiceCount));
        sb.append(',');
        sb.append("pipelineServiceCount");
        sb.append('=');
        sb.append(((this.pipelineServiceCount == null)?"<null>":this.pipelineServiceCount));
        sb.append(',');
        sb.append("mlModelServiceCount");
        sb.append('=');
        sb.append(((this.mlModelServiceCount == null)?"<null>":this.mlModelServiceCount));
        sb.append(',');
        sb.append("storageServiceCount");
        sb.append('=');
        sb.append(((this.storageServiceCount == null)?"<null>":this.storageServiceCount));
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
        result = ((result* 31)+((this.storageServiceCount == null)? 0 :this.storageServiceCount.hashCode()));
        result = ((result* 31)+((this.databaseServiceCount == null)? 0 :this.databaseServiceCount.hashCode()));
        result = ((result* 31)+((this.mlModelServiceCount == null)? 0 :this.mlModelServiceCount.hashCode()));
        result = ((result* 31)+((this.dashboardServiceCount == null)? 0 :this.dashboardServiceCount.hashCode()));
        result = ((result* 31)+((this.pipelineServiceCount == null)? 0 :this.pipelineServiceCount.hashCode()));
        result = ((result* 31)+((this.messagingServiceCount == null)? 0 :this.messagingServiceCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServicesCount) == false) {
            return false;
        }
        ServicesCount rhs = ((ServicesCount) other);
        return (((((((this.storageServiceCount == rhs.storageServiceCount)||((this.storageServiceCount!= null)&&this.storageServiceCount.equals(rhs.storageServiceCount)))&&((this.databaseServiceCount == rhs.databaseServiceCount)||((this.databaseServiceCount!= null)&&this.databaseServiceCount.equals(rhs.databaseServiceCount))))&&((this.mlModelServiceCount == rhs.mlModelServiceCount)||((this.mlModelServiceCount!= null)&&this.mlModelServiceCount.equals(rhs.mlModelServiceCount))))&&((this.dashboardServiceCount == rhs.dashboardServiceCount)||((this.dashboardServiceCount!= null)&&this.dashboardServiceCount.equals(rhs.dashboardServiceCount))))&&((this.pipelineServiceCount == rhs.pipelineServiceCount)||((this.pipelineServiceCount!= null)&&this.pipelineServiceCount.equals(rhs.pipelineServiceCount))))&&((this.messagingServiceCount == rhs.messagingServiceCount)||((this.messagingServiceCount!= null)&&this.messagingServiceCount.equals(rhs.messagingServiceCount))));
    }

}
