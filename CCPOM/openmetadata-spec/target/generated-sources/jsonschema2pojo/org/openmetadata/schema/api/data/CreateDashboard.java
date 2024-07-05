
package org.openmetadata.schema.api.data;

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
import org.openmetadata.schema.type.DashboardType;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.LifeCycle;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateDashboardRequest
 * <p>
 * Create Dashboard entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "dashboardType",
    "sourceUrl",
    "project",
    "charts",
    "dataModels",
    "tags",
    "owner",
    "service",
    "extension",
    "domain",
    "dataProducts",
    "lifeCycle",
    "sourceHash"
})
@Generated("jsonschema2pojo")
public class CreateDashboard implements CreateEntity
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
     * Display Name that identifies this Dashboard. It could be title or label from the source services
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this Dashboard. It could be title or label from the source services")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * This schema defines the type used for describing different types of dashboards.
     * 
     */
    @JsonProperty("dashboardType")
    @JsonPropertyDescription("This schema defines the type used for describing different types of dashboards.")
    private DashboardType dashboardType = DashboardType.fromValue("Dashboard");
    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    @JsonPropertyDescription("Source Url of the respective entity.")
    private String sourceUrl;
    /**
     * Name of the project / workspace / collection in which the dashboard is contained
     * 
     */
    @JsonProperty("project")
    @JsonPropertyDescription("Name of the project / workspace / collection in which the dashboard is contained")
    private String project;
    /**
     * List of fully qualified name of charts included in this Dashboard.
     * 
     */
    @JsonProperty("charts")
    @JsonPropertyDescription("List of fully qualified name of charts included in this Dashboard.")
    @Valid
    private List<String> charts = null;
    /**
     * List of fully qualified name of data models included in this Dashboard.
     * 
     */
    @JsonProperty("dataModels")
    @JsonPropertyDescription("List of fully qualified name of data models included in this Dashboard.")
    @Valid
    private List<String> dataModels = null;
    /**
     * Tags for this dashboard
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this dashboard")
    @Valid
    private List<TagLabel> tags = null;
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
    @JsonProperty("service")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String service;
    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("Entity extension data with custom attributes added to the entity.")
    private Object extension;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String domain;
    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    @JsonPropertyDescription("List of fully qualified names of data products this entity is part of.")
    @Valid
    private List<String> dataProducts = new ArrayList<String>();
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
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    @JsonPropertyDescription("Source hash of the entity")
    @Size(min = 1, max = 32)
    private String sourceHash;

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

    public CreateDashboard withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this Dashboard. It could be title or label from the source services
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this Dashboard. It could be title or label from the source services
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateDashboard withDisplayName(String displayName) {
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

    public CreateDashboard withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * This schema defines the type used for describing different types of dashboards.
     * 
     */
    @JsonProperty("dashboardType")
    public DashboardType getDashboardType() {
        return dashboardType;
    }

    /**
     * This schema defines the type used for describing different types of dashboards.
     * 
     */
    @JsonProperty("dashboardType")
    public void setDashboardType(DashboardType dashboardType) {
        this.dashboardType = dashboardType;
    }

    public CreateDashboard withDashboardType(DashboardType dashboardType) {
        this.dashboardType = dashboardType;
        return this;
    }

    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public CreateDashboard withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * Name of the project / workspace / collection in which the dashboard is contained
     * 
     */
    @JsonProperty("project")
    public String getProject() {
        return project;
    }

    /**
     * Name of the project / workspace / collection in which the dashboard is contained
     * 
     */
    @JsonProperty("project")
    public void setProject(String project) {
        this.project = project;
    }

    public CreateDashboard withProject(String project) {
        this.project = project;
        return this;
    }

    /**
     * List of fully qualified name of charts included in this Dashboard.
     * 
     */
    @JsonProperty("charts")
    public List<String> getCharts() {
        return charts;
    }

    /**
     * List of fully qualified name of charts included in this Dashboard.
     * 
     */
    @JsonProperty("charts")
    public void setCharts(List<String> charts) {
        this.charts = charts;
    }

    public CreateDashboard withCharts(List<String> charts) {
        this.charts = charts;
        return this;
    }

    /**
     * List of fully qualified name of data models included in this Dashboard.
     * 
     */
    @JsonProperty("dataModels")
    public List<String> getDataModels() {
        return dataModels;
    }

    /**
     * List of fully qualified name of data models included in this Dashboard.
     * 
     */
    @JsonProperty("dataModels")
    public void setDataModels(List<String> dataModels) {
        this.dataModels = dataModels;
    }

    public CreateDashboard withDataModels(List<String> dataModels) {
        this.dataModels = dataModels;
        return this;
    }

    /**
     * Tags for this dashboard
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this dashboard
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateDashboard withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public CreateDashboard withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public String getService() {
        return service;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public void setService(String service) {
        this.service = service;
    }

    public CreateDashboard withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public Object getExtension() {
        return extension;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(Object extension) {
        this.extension = extension;
    }

    public CreateDashboard withExtension(Object extension) {
        this.extension = extension;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateDashboard withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    public List<String> getDataProducts() {
        return dataProducts;
    }

    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    public void setDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
    }

    public CreateDashboard withDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
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

    public CreateDashboard withLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }

    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    public String getSourceHash() {
        return sourceHash;
    }

    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    public void setSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
    }

    public CreateDashboard withSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateDashboard.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("dashboardType");
        sb.append('=');
        sb.append(((this.dashboardType == null)?"<null>":this.dashboardType));
        sb.append(',');
        sb.append("sourceUrl");
        sb.append('=');
        sb.append(((this.sourceUrl == null)?"<null>":this.sourceUrl));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("charts");
        sb.append('=');
        sb.append(((this.charts == null)?"<null>":this.charts));
        sb.append(',');
        sb.append("dataModels");
        sb.append('=');
        sb.append(((this.dataModels == null)?"<null>":this.dataModels));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("dataProducts");
        sb.append('=');
        sb.append(((this.dataProducts == null)?"<null>":this.dataProducts));
        sb.append(',');
        sb.append("lifeCycle");
        sb.append('=');
        sb.append(((this.lifeCycle == null)?"<null>":this.lifeCycle));
        sb.append(',');
        sb.append("sourceHash");
        sb.append('=');
        sb.append(((this.sourceHash == null)?"<null>":this.sourceHash));
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
        result = ((result* 31)+((this.charts == null)? 0 :this.charts.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.dataModels == null)? 0 :this.dataModels.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.project == null)? 0 :this.project.hashCode()));
        result = ((result* 31)+((this.dataProducts == null)? 0 :this.dataProducts.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.sourceUrl == null)? 0 :this.sourceUrl.hashCode()));
        result = ((result* 31)+((this.sourceHash == null)? 0 :this.sourceHash.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.dashboardType == null)? 0 :this.dashboardType.hashCode()));
        result = ((result* 31)+((this.lifeCycle == null)? 0 :this.lifeCycle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateDashboard) == false) {
            return false;
        }
        CreateDashboard rhs = ((CreateDashboard) other);
        return (((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.charts == rhs.charts)||((this.charts!= null)&&this.charts.equals(rhs.charts))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.dataModels == rhs.dataModels)||((this.dataModels!= null)&&this.dataModels.equals(rhs.dataModels))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.project == rhs.project)||((this.project!= null)&&this.project.equals(rhs.project))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.sourceUrl == rhs.sourceUrl)||((this.sourceUrl!= null)&&this.sourceUrl.equals(rhs.sourceUrl))))&&((this.sourceHash == rhs.sourceHash)||((this.sourceHash!= null)&&this.sourceHash.equals(rhs.sourceHash))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.dashboardType == rhs.dashboardType)||((this.dashboardType!= null)&&this.dashboardType.equals(rhs.dashboardType))))&&((this.lifeCycle == rhs.lifeCycle)||((this.lifeCycle!= null)&&this.lifeCycle.equals(rhs.lifeCycle))));
    }

}
