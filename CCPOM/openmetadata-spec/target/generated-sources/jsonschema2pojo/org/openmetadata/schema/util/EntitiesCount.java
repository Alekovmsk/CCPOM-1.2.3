
package org.openmetadata.schema.util;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Entities Count
 * <p>
 * This schema defines Entities Count. This contains aggregated entities count.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tableCount",
    "topicCount",
    "dashboardCount",
    "pipelineCount",
    "mlmodelCount",
    "servicesCount",
    "userCount",
    "teamCount",
    "testSuiteCount",
    "storageContainerCount",
    "glossaryCount",
    "glossaryTermCount"
})
@Generated("jsonschema2pojo")
public class EntitiesCount {

    /**
     * Table Count
     * 
     */
    @JsonProperty("tableCount")
    @JsonPropertyDescription("Table Count")
    private Integer tableCount;
    /**
     * Topic Count
     * 
     */
    @JsonProperty("topicCount")
    @JsonPropertyDescription("Topic Count")
    private Integer topicCount;
    /**
     * Dashboard Count
     * 
     */
    @JsonProperty("dashboardCount")
    @JsonPropertyDescription("Dashboard Count")
    private Integer dashboardCount;
    /**
     * Pipeline Count
     * 
     */
    @JsonProperty("pipelineCount")
    @JsonPropertyDescription("Pipeline Count")
    private Integer pipelineCount;
    /**
     * MlModel Count
     * 
     */
    @JsonProperty("mlmodelCount")
    @JsonPropertyDescription("MlModel Count")
    private Integer mlmodelCount;
    /**
     * Services Count
     * 
     */
    @JsonProperty("servicesCount")
    @JsonPropertyDescription("Services Count")
    private Integer servicesCount;
    /**
     * User Count
     * 
     */
    @JsonProperty("userCount")
    @JsonPropertyDescription("User Count")
    private Integer userCount;
    /**
     * Team Count
     * 
     */
    @JsonProperty("teamCount")
    @JsonPropertyDescription("Team Count")
    private Integer teamCount;
    /**
     * Test Suite Count
     * 
     */
    @JsonProperty("testSuiteCount")
    @JsonPropertyDescription("Test Suite Count")
    private Integer testSuiteCount;
    /**
     * Storage Container Count
     * 
     */
    @JsonProperty("storageContainerCount")
    @JsonPropertyDescription("Storage Container Count")
    private Integer storageContainerCount;
    /**
     * Glossary Count
     * 
     */
    @JsonProperty("glossaryCount")
    @JsonPropertyDescription("Glossary Count")
    private Integer glossaryCount;
    /**
     * Glossary Term Count
     * 
     */
    @JsonProperty("glossaryTermCount")
    @JsonPropertyDescription("Glossary Term Count")
    private Integer glossaryTermCount;

    /**
     * Table Count
     * 
     */
    @JsonProperty("tableCount")
    public Integer getTableCount() {
        return tableCount;
    }

    /**
     * Table Count
     * 
     */
    @JsonProperty("tableCount")
    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }

    public EntitiesCount withTableCount(Integer tableCount) {
        this.tableCount = tableCount;
        return this;
    }

    /**
     * Topic Count
     * 
     */
    @JsonProperty("topicCount")
    public Integer getTopicCount() {
        return topicCount;
    }

    /**
     * Topic Count
     * 
     */
    @JsonProperty("topicCount")
    public void setTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
    }

    public EntitiesCount withTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
        return this;
    }

    /**
     * Dashboard Count
     * 
     */
    @JsonProperty("dashboardCount")
    public Integer getDashboardCount() {
        return dashboardCount;
    }

    /**
     * Dashboard Count
     * 
     */
    @JsonProperty("dashboardCount")
    public void setDashboardCount(Integer dashboardCount) {
        this.dashboardCount = dashboardCount;
    }

    public EntitiesCount withDashboardCount(Integer dashboardCount) {
        this.dashboardCount = dashboardCount;
        return this;
    }

    /**
     * Pipeline Count
     * 
     */
    @JsonProperty("pipelineCount")
    public Integer getPipelineCount() {
        return pipelineCount;
    }

    /**
     * Pipeline Count
     * 
     */
    @JsonProperty("pipelineCount")
    public void setPipelineCount(Integer pipelineCount) {
        this.pipelineCount = pipelineCount;
    }

    public EntitiesCount withPipelineCount(Integer pipelineCount) {
        this.pipelineCount = pipelineCount;
        return this;
    }

    /**
     * MlModel Count
     * 
     */
    @JsonProperty("mlmodelCount")
    public Integer getMlmodelCount() {
        return mlmodelCount;
    }

    /**
     * MlModel Count
     * 
     */
    @JsonProperty("mlmodelCount")
    public void setMlmodelCount(Integer mlmodelCount) {
        this.mlmodelCount = mlmodelCount;
    }

    public EntitiesCount withMlmodelCount(Integer mlmodelCount) {
        this.mlmodelCount = mlmodelCount;
        return this;
    }

    /**
     * Services Count
     * 
     */
    @JsonProperty("servicesCount")
    public Integer getServicesCount() {
        return servicesCount;
    }

    /**
     * Services Count
     * 
     */
    @JsonProperty("servicesCount")
    public void setServicesCount(Integer servicesCount) {
        this.servicesCount = servicesCount;
    }

    public EntitiesCount withServicesCount(Integer servicesCount) {
        this.servicesCount = servicesCount;
        return this;
    }

    /**
     * User Count
     * 
     */
    @JsonProperty("userCount")
    public Integer getUserCount() {
        return userCount;
    }

    /**
     * User Count
     * 
     */
    @JsonProperty("userCount")
    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public EntitiesCount withUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }

    /**
     * Team Count
     * 
     */
    @JsonProperty("teamCount")
    public Integer getTeamCount() {
        return teamCount;
    }

    /**
     * Team Count
     * 
     */
    @JsonProperty("teamCount")
    public void setTeamCount(Integer teamCount) {
        this.teamCount = teamCount;
    }

    public EntitiesCount withTeamCount(Integer teamCount) {
        this.teamCount = teamCount;
        return this;
    }

    /**
     * Test Suite Count
     * 
     */
    @JsonProperty("testSuiteCount")
    public Integer getTestSuiteCount() {
        return testSuiteCount;
    }

    /**
     * Test Suite Count
     * 
     */
    @JsonProperty("testSuiteCount")
    public void setTestSuiteCount(Integer testSuiteCount) {
        this.testSuiteCount = testSuiteCount;
    }

    public EntitiesCount withTestSuiteCount(Integer testSuiteCount) {
        this.testSuiteCount = testSuiteCount;
        return this;
    }

    /**
     * Storage Container Count
     * 
     */
    @JsonProperty("storageContainerCount")
    public Integer getStorageContainerCount() {
        return storageContainerCount;
    }

    /**
     * Storage Container Count
     * 
     */
    @JsonProperty("storageContainerCount")
    public void setStorageContainerCount(Integer storageContainerCount) {
        this.storageContainerCount = storageContainerCount;
    }

    public EntitiesCount withStorageContainerCount(Integer storageContainerCount) {
        this.storageContainerCount = storageContainerCount;
        return this;
    }

    /**
     * Glossary Count
     * 
     */
    @JsonProperty("glossaryCount")
    public Integer getGlossaryCount() {
        return glossaryCount;
    }

    /**
     * Glossary Count
     * 
     */
    @JsonProperty("glossaryCount")
    public void setGlossaryCount(Integer glossaryCount) {
        this.glossaryCount = glossaryCount;
    }

    public EntitiesCount withGlossaryCount(Integer glossaryCount) {
        this.glossaryCount = glossaryCount;
        return this;
    }

    /**
     * Glossary Term Count
     * 
     */
    @JsonProperty("glossaryTermCount")
    public Integer getGlossaryTermCount() {
        return glossaryTermCount;
    }

    /**
     * Glossary Term Count
     * 
     */
    @JsonProperty("glossaryTermCount")
    public void setGlossaryTermCount(Integer glossaryTermCount) {
        this.glossaryTermCount = glossaryTermCount;
    }

    public EntitiesCount withGlossaryTermCount(Integer glossaryTermCount) {
        this.glossaryTermCount = glossaryTermCount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntitiesCount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tableCount");
        sb.append('=');
        sb.append(((this.tableCount == null)?"<null>":this.tableCount));
        sb.append(',');
        sb.append("topicCount");
        sb.append('=');
        sb.append(((this.topicCount == null)?"<null>":this.topicCount));
        sb.append(',');
        sb.append("dashboardCount");
        sb.append('=');
        sb.append(((this.dashboardCount == null)?"<null>":this.dashboardCount));
        sb.append(',');
        sb.append("pipelineCount");
        sb.append('=');
        sb.append(((this.pipelineCount == null)?"<null>":this.pipelineCount));
        sb.append(',');
        sb.append("mlmodelCount");
        sb.append('=');
        sb.append(((this.mlmodelCount == null)?"<null>":this.mlmodelCount));
        sb.append(',');
        sb.append("servicesCount");
        sb.append('=');
        sb.append(((this.servicesCount == null)?"<null>":this.servicesCount));
        sb.append(',');
        sb.append("userCount");
        sb.append('=');
        sb.append(((this.userCount == null)?"<null>":this.userCount));
        sb.append(',');
        sb.append("teamCount");
        sb.append('=');
        sb.append(((this.teamCount == null)?"<null>":this.teamCount));
        sb.append(',');
        sb.append("testSuiteCount");
        sb.append('=');
        sb.append(((this.testSuiteCount == null)?"<null>":this.testSuiteCount));
        sb.append(',');
        sb.append("storageContainerCount");
        sb.append('=');
        sb.append(((this.storageContainerCount == null)?"<null>":this.storageContainerCount));
        sb.append(',');
        sb.append("glossaryCount");
        sb.append('=');
        sb.append(((this.glossaryCount == null)?"<null>":this.glossaryCount));
        sb.append(',');
        sb.append("glossaryTermCount");
        sb.append('=');
        sb.append(((this.glossaryTermCount == null)?"<null>":this.glossaryTermCount));
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
        result = ((result* 31)+((this.tableCount == null)? 0 :this.tableCount.hashCode()));
        result = ((result* 31)+((this.teamCount == null)? 0 :this.teamCount.hashCode()));
        result = ((result* 31)+((this.testSuiteCount == null)? 0 :this.testSuiteCount.hashCode()));
        result = ((result* 31)+((this.mlmodelCount == null)? 0 :this.mlmodelCount.hashCode()));
        result = ((result* 31)+((this.pipelineCount == null)? 0 :this.pipelineCount.hashCode()));
        result = ((result* 31)+((this.servicesCount == null)? 0 :this.servicesCount.hashCode()));
        result = ((result* 31)+((this.storageContainerCount == null)? 0 :this.storageContainerCount.hashCode()));
        result = ((result* 31)+((this.dashboardCount == null)? 0 :this.dashboardCount.hashCode()));
        result = ((result* 31)+((this.glossaryTermCount == null)? 0 :this.glossaryTermCount.hashCode()));
        result = ((result* 31)+((this.userCount == null)? 0 :this.userCount.hashCode()));
        result = ((result* 31)+((this.glossaryCount == null)? 0 :this.glossaryCount.hashCode()));
        result = ((result* 31)+((this.topicCount == null)? 0 :this.topicCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntitiesCount) == false) {
            return false;
        }
        EntitiesCount rhs = ((EntitiesCount) other);
        return (((((((((((((this.tableCount == rhs.tableCount)||((this.tableCount!= null)&&this.tableCount.equals(rhs.tableCount)))&&((this.teamCount == rhs.teamCount)||((this.teamCount!= null)&&this.teamCount.equals(rhs.teamCount))))&&((this.testSuiteCount == rhs.testSuiteCount)||((this.testSuiteCount!= null)&&this.testSuiteCount.equals(rhs.testSuiteCount))))&&((this.mlmodelCount == rhs.mlmodelCount)||((this.mlmodelCount!= null)&&this.mlmodelCount.equals(rhs.mlmodelCount))))&&((this.pipelineCount == rhs.pipelineCount)||((this.pipelineCount!= null)&&this.pipelineCount.equals(rhs.pipelineCount))))&&((this.servicesCount == rhs.servicesCount)||((this.servicesCount!= null)&&this.servicesCount.equals(rhs.servicesCount))))&&((this.storageContainerCount == rhs.storageContainerCount)||((this.storageContainerCount!= null)&&this.storageContainerCount.equals(rhs.storageContainerCount))))&&((this.dashboardCount == rhs.dashboardCount)||((this.dashboardCount!= null)&&this.dashboardCount.equals(rhs.dashboardCount))))&&((this.glossaryTermCount == rhs.glossaryTermCount)||((this.glossaryTermCount!= null)&&this.glossaryTermCount.equals(rhs.glossaryTermCount))))&&((this.userCount == rhs.userCount)||((this.userCount!= null)&&this.userCount.equals(rhs.userCount))))&&((this.glossaryCount == rhs.glossaryCount)||((this.glossaryCount!= null)&&this.glossaryCount.equals(rhs.glossaryCount))))&&((this.topicCount == rhs.topicCount)||((this.topicCount!= null)&&this.topicCount.equals(rhs.topicCount))));
    }

}
