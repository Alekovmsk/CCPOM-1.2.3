
package org.openmetadata.schema.metadataIngestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DashboardServiceMetadataPipeline
 * <p>
 * DashboardService Metadata Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "dashboardFilterPattern",
    "chartFilterPattern",
    "dataModelFilterPattern",
    "projectFilterPattern",
    "dbServiceNames",
    "includeOwners",
    "markDeletedDashboards",
    "markDeletedDataModels",
    "includeTags",
    "includeDataModels"
})
@Generated("jsonschema2pojo")
public class DashboardServiceMetadataPipeline {

    /**
     * Dashboard Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Dashboard Source Config Metadata Pipeline type")
    private DashboardServiceMetadataPipeline.DashboardMetadataConfigType type = DashboardServiceMetadataPipeline.DashboardMetadataConfigType.fromValue("DashboardMetadata");
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("dashboardFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern dashboardFilterPattern;
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("chartFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern chartFilterPattern;
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("dataModelFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern dataModelFilterPattern;
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("projectFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern projectFilterPattern;
    /**
     * Database Service Names List
     * <p>
     * List of Database Service Names for creation of lineage
     * 
     */
    @JsonProperty("dbServiceNames")
    @JsonPropertyDescription("List of Database Service Names for creation of lineage")
    @Valid
    private List<String> dbServiceNames = new ArrayList<String>();
    /**
     * Include Current Owners
     * <p>
     * Enabling a flag will replace the current owner with a new owner from the source during metadata ingestion, if the current owner is null. It is recommended to keep the flag enabled to obtain the owner information during the first metadata ingestion.
     * 
     */
    @JsonProperty("includeOwners")
    @JsonPropertyDescription("Enabling a flag will replace the current owner with a new owner from the source during metadata ingestion, if the current owner is null. It is recommended to keep the flag enabled to obtain the owner information during the first metadata ingestion.")
    private Boolean includeOwners = false;
    /**
     * Mark Deleted Dashboards
     * <p>
     * Optional configuration to soft delete dashboards in OpenMetadata if the source dashboards are deleted. Also, if the dashboard is deleted, all the associated entities like lineage, etc., with that dashboard will be deleted
     * 
     */
    @JsonProperty("markDeletedDashboards")
    @JsonPropertyDescription("Optional configuration to soft delete dashboards in OpenMetadata if the source dashboards are deleted. Also, if the dashboard is deleted, all the associated entities like lineage, etc., with that dashboard will be deleted")
    private Boolean markDeletedDashboards = true;
    /**
     * Mark Deleted Data Models
     * <p>
     * Optional configuration to soft delete data models in OpenMetadata if the source data models are deleted. Also, if the data models is deleted, all the associated entities like lineage, etc., with that data models will be deleted
     * 
     */
    @JsonProperty("markDeletedDataModels")
    @JsonPropertyDescription("Optional configuration to soft delete data models in OpenMetadata if the source data models are deleted. Also, if the data models is deleted, all the associated entities like lineage, etc., with that data models will be deleted")
    private Boolean markDeletedDataModels = true;
    /**
     * Include Tags
     * <p>
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    @JsonPropertyDescription("Optional configuration to toggle the tags ingestion.")
    private Boolean includeTags = true;
    /**
     * Include Data Models
     * <p>
     * Optional configuration to toggle the ingestion of data models.
     * 
     */
    @JsonProperty("includeDataModels")
    @JsonPropertyDescription("Optional configuration to toggle the ingestion of data models.")
    private Boolean includeDataModels = true;

    /**
     * Dashboard Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public DashboardServiceMetadataPipeline.DashboardMetadataConfigType getType() {
        return type;
    }

    /**
     * Dashboard Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public void setType(DashboardServiceMetadataPipeline.DashboardMetadataConfigType type) {
        this.type = type;
    }

    public DashboardServiceMetadataPipeline withType(DashboardServiceMetadataPipeline.DashboardMetadataConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("dashboardFilterPattern")
    public FilterPattern getDashboardFilterPattern() {
        return dashboardFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("dashboardFilterPattern")
    public void setDashboardFilterPattern(FilterPattern dashboardFilterPattern) {
        this.dashboardFilterPattern = dashboardFilterPattern;
    }

    public DashboardServiceMetadataPipeline withDashboardFilterPattern(FilterPattern dashboardFilterPattern) {
        this.dashboardFilterPattern = dashboardFilterPattern;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("chartFilterPattern")
    public FilterPattern getChartFilterPattern() {
        return chartFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("chartFilterPattern")
    public void setChartFilterPattern(FilterPattern chartFilterPattern) {
        this.chartFilterPattern = chartFilterPattern;
    }

    public DashboardServiceMetadataPipeline withChartFilterPattern(FilterPattern chartFilterPattern) {
        this.chartFilterPattern = chartFilterPattern;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("dataModelFilterPattern")
    public FilterPattern getDataModelFilterPattern() {
        return dataModelFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("dataModelFilterPattern")
    public void setDataModelFilterPattern(FilterPattern dataModelFilterPattern) {
        this.dataModelFilterPattern = dataModelFilterPattern;
    }

    public DashboardServiceMetadataPipeline withDataModelFilterPattern(FilterPattern dataModelFilterPattern) {
        this.dataModelFilterPattern = dataModelFilterPattern;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("projectFilterPattern")
    public FilterPattern getProjectFilterPattern() {
        return projectFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("projectFilterPattern")
    public void setProjectFilterPattern(FilterPattern projectFilterPattern) {
        this.projectFilterPattern = projectFilterPattern;
    }

    public DashboardServiceMetadataPipeline withProjectFilterPattern(FilterPattern projectFilterPattern) {
        this.projectFilterPattern = projectFilterPattern;
        return this;
    }

    /**
     * Database Service Names List
     * <p>
     * List of Database Service Names for creation of lineage
     * 
     */
    @JsonProperty("dbServiceNames")
    public List<String> getDbServiceNames() {
        return dbServiceNames;
    }

    /**
     * Database Service Names List
     * <p>
     * List of Database Service Names for creation of lineage
     * 
     */
    @JsonProperty("dbServiceNames")
    public void setDbServiceNames(List<String> dbServiceNames) {
        this.dbServiceNames = dbServiceNames;
    }

    public DashboardServiceMetadataPipeline withDbServiceNames(List<String> dbServiceNames) {
        this.dbServiceNames = dbServiceNames;
        return this;
    }

    /**
     * Include Current Owners
     * <p>
     * Enabling a flag will replace the current owner with a new owner from the source during metadata ingestion, if the current owner is null. It is recommended to keep the flag enabled to obtain the owner information during the first metadata ingestion.
     * 
     */
    @JsonProperty("includeOwners")
    public Boolean getIncludeOwners() {
        return includeOwners;
    }

    /**
     * Include Current Owners
     * <p>
     * Enabling a flag will replace the current owner with a new owner from the source during metadata ingestion, if the current owner is null. It is recommended to keep the flag enabled to obtain the owner information during the first metadata ingestion.
     * 
     */
    @JsonProperty("includeOwners")
    public void setIncludeOwners(Boolean includeOwners) {
        this.includeOwners = includeOwners;
    }

    public DashboardServiceMetadataPipeline withIncludeOwners(Boolean includeOwners) {
        this.includeOwners = includeOwners;
        return this;
    }

    /**
     * Mark Deleted Dashboards
     * <p>
     * Optional configuration to soft delete dashboards in OpenMetadata if the source dashboards are deleted. Also, if the dashboard is deleted, all the associated entities like lineage, etc., with that dashboard will be deleted
     * 
     */
    @JsonProperty("markDeletedDashboards")
    public Boolean getMarkDeletedDashboards() {
        return markDeletedDashboards;
    }

    /**
     * Mark Deleted Dashboards
     * <p>
     * Optional configuration to soft delete dashboards in OpenMetadata if the source dashboards are deleted. Also, if the dashboard is deleted, all the associated entities like lineage, etc., with that dashboard will be deleted
     * 
     */
    @JsonProperty("markDeletedDashboards")
    public void setMarkDeletedDashboards(Boolean markDeletedDashboards) {
        this.markDeletedDashboards = markDeletedDashboards;
    }

    public DashboardServiceMetadataPipeline withMarkDeletedDashboards(Boolean markDeletedDashboards) {
        this.markDeletedDashboards = markDeletedDashboards;
        return this;
    }

    /**
     * Mark Deleted Data Models
     * <p>
     * Optional configuration to soft delete data models in OpenMetadata if the source data models are deleted. Also, if the data models is deleted, all the associated entities like lineage, etc., with that data models will be deleted
     * 
     */
    @JsonProperty("markDeletedDataModels")
    public Boolean getMarkDeletedDataModels() {
        return markDeletedDataModels;
    }

    /**
     * Mark Deleted Data Models
     * <p>
     * Optional configuration to soft delete data models in OpenMetadata if the source data models are deleted. Also, if the data models is deleted, all the associated entities like lineage, etc., with that data models will be deleted
     * 
     */
    @JsonProperty("markDeletedDataModels")
    public void setMarkDeletedDataModels(Boolean markDeletedDataModels) {
        this.markDeletedDataModels = markDeletedDataModels;
    }

    public DashboardServiceMetadataPipeline withMarkDeletedDataModels(Boolean markDeletedDataModels) {
        this.markDeletedDataModels = markDeletedDataModels;
        return this;
    }

    /**
     * Include Tags
     * <p>
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    public Boolean getIncludeTags() {
        return includeTags;
    }

    /**
     * Include Tags
     * <p>
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    public void setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
    }

    public DashboardServiceMetadataPipeline withIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }

    /**
     * Include Data Models
     * <p>
     * Optional configuration to toggle the ingestion of data models.
     * 
     */
    @JsonProperty("includeDataModels")
    public Boolean getIncludeDataModels() {
        return includeDataModels;
    }

    /**
     * Include Data Models
     * <p>
     * Optional configuration to toggle the ingestion of data models.
     * 
     */
    @JsonProperty("includeDataModels")
    public void setIncludeDataModels(Boolean includeDataModels) {
        this.includeDataModels = includeDataModels;
    }

    public DashboardServiceMetadataPipeline withIncludeDataModels(Boolean includeDataModels) {
        this.includeDataModels = includeDataModels;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DashboardServiceMetadataPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("dashboardFilterPattern");
        sb.append('=');
        sb.append(((this.dashboardFilterPattern == null)?"<null>":this.dashboardFilterPattern));
        sb.append(',');
        sb.append("chartFilterPattern");
        sb.append('=');
        sb.append(((this.chartFilterPattern == null)?"<null>":this.chartFilterPattern));
        sb.append(',');
        sb.append("dataModelFilterPattern");
        sb.append('=');
        sb.append(((this.dataModelFilterPattern == null)?"<null>":this.dataModelFilterPattern));
        sb.append(',');
        sb.append("projectFilterPattern");
        sb.append('=');
        sb.append(((this.projectFilterPattern == null)?"<null>":this.projectFilterPattern));
        sb.append(',');
        sb.append("dbServiceNames");
        sb.append('=');
        sb.append(((this.dbServiceNames == null)?"<null>":this.dbServiceNames));
        sb.append(',');
        sb.append("includeOwners");
        sb.append('=');
        sb.append(((this.includeOwners == null)?"<null>":this.includeOwners));
        sb.append(',');
        sb.append("markDeletedDashboards");
        sb.append('=');
        sb.append(((this.markDeletedDashboards == null)?"<null>":this.markDeletedDashboards));
        sb.append(',');
        sb.append("markDeletedDataModels");
        sb.append('=');
        sb.append(((this.markDeletedDataModels == null)?"<null>":this.markDeletedDataModels));
        sb.append(',');
        sb.append("includeTags");
        sb.append('=');
        sb.append(((this.includeTags == null)?"<null>":this.includeTags));
        sb.append(',');
        sb.append("includeDataModels");
        sb.append('=');
        sb.append(((this.includeDataModels == null)?"<null>":this.includeDataModels));
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
        result = ((result* 31)+((this.dashboardFilterPattern == null)? 0 :this.dashboardFilterPattern.hashCode()));
        result = ((result* 31)+((this.dbServiceNames == null)? 0 :this.dbServiceNames.hashCode()));
        result = ((result* 31)+((this.includeDataModels == null)? 0 :this.includeDataModels.hashCode()));
        result = ((result* 31)+((this.includeTags == null)? 0 :this.includeTags.hashCode()));
        result = ((result* 31)+((this.includeOwners == null)? 0 :this.includeOwners.hashCode()));
        result = ((result* 31)+((this.markDeletedDataModels == null)? 0 :this.markDeletedDataModels.hashCode()));
        result = ((result* 31)+((this.chartFilterPattern == null)? 0 :this.chartFilterPattern.hashCode()));
        result = ((result* 31)+((this.projectFilterPattern == null)? 0 :this.projectFilterPattern.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.dataModelFilterPattern == null)? 0 :this.dataModelFilterPattern.hashCode()));
        result = ((result* 31)+((this.markDeletedDashboards == null)? 0 :this.markDeletedDashboards.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DashboardServiceMetadataPipeline) == false) {
            return false;
        }
        DashboardServiceMetadataPipeline rhs = ((DashboardServiceMetadataPipeline) other);
        return ((((((((((((this.dashboardFilterPattern == rhs.dashboardFilterPattern)||((this.dashboardFilterPattern!= null)&&this.dashboardFilterPattern.equals(rhs.dashboardFilterPattern)))&&((this.dbServiceNames == rhs.dbServiceNames)||((this.dbServiceNames!= null)&&this.dbServiceNames.equals(rhs.dbServiceNames))))&&((this.includeDataModels == rhs.includeDataModels)||((this.includeDataModels!= null)&&this.includeDataModels.equals(rhs.includeDataModels))))&&((this.includeTags == rhs.includeTags)||((this.includeTags!= null)&&this.includeTags.equals(rhs.includeTags))))&&((this.includeOwners == rhs.includeOwners)||((this.includeOwners!= null)&&this.includeOwners.equals(rhs.includeOwners))))&&((this.markDeletedDataModels == rhs.markDeletedDataModels)||((this.markDeletedDataModels!= null)&&this.markDeletedDataModels.equals(rhs.markDeletedDataModels))))&&((this.chartFilterPattern == rhs.chartFilterPattern)||((this.chartFilterPattern!= null)&&this.chartFilterPattern.equals(rhs.chartFilterPattern))))&&((this.projectFilterPattern == rhs.projectFilterPattern)||((this.projectFilterPattern!= null)&&this.projectFilterPattern.equals(rhs.projectFilterPattern))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.dataModelFilterPattern == rhs.dataModelFilterPattern)||((this.dataModelFilterPattern!= null)&&this.dataModelFilterPattern.equals(rhs.dataModelFilterPattern))))&&((this.markDeletedDashboards == rhs.markDeletedDashboards)||((this.markDeletedDashboards!= null)&&this.markDeletedDashboards.equals(rhs.markDeletedDashboards))));
    }


    /**
     * Dashboard Source Config Metadata Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DashboardMetadataConfigType {

        DASHBOARD_METADATA("DashboardMetadata");
        private final String value;
        private final static Map<String, DashboardServiceMetadataPipeline.DashboardMetadataConfigType> CONSTANTS = new HashMap<String, DashboardServiceMetadataPipeline.DashboardMetadataConfigType>();

        static {
            for (DashboardServiceMetadataPipeline.DashboardMetadataConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DashboardMetadataConfigType(String value) {
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
        public static DashboardServiceMetadataPipeline.DashboardMetadataConfigType fromValue(String value) {
            DashboardServiceMetadataPipeline.DashboardMetadataConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
