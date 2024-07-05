
package org.openmetadata.schema.api.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.EnumInterface;
import org.openmetadata.schema.type.Column;
import org.openmetadata.schema.type.DataModelType;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.LifeCycle;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateDashboardDataModelRequest
 * <p>
 * Create Dashboard Data Model entity request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "tags",
    "dataProducts",
    "owner",
    "service",
    "serviceType",
    "dataModelType",
    "sql",
    "columns",
    "project",
    "domain",
    "lifeCycle",
    "sourceHash"
})
@Generated("jsonschema2pojo")
public class CreateDashboardDataModel implements CreateEntity
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
     * Display Name that identifies this data model. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this data model. It could be title or label from the source services.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Tags for this data model.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this data model.")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    @JsonPropertyDescription("List of fully qualified names of data products this entity is part of.")
    @Valid
    private List<String> dataProducts = new ArrayList<String>();
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
     * Type of Dashboard service - Superset, Looker, Redash, Tableau, Metabase, PowerBi, Mode, or Lightdash
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("Type of Dashboard service - Superset, Looker, Redash, Tableau, Metabase, PowerBi, Mode, or Lightdash")
    private CreateDashboardDataModel.DashboardServiceType serviceType;
    /**
     * This schema defines the type used for describing different types of data models.Data Model types supported.
     * (Required)
     * 
     */
    @JsonProperty("dataModelType")
    @JsonPropertyDescription("This schema defines the type used for describing different types of data models.")
    @NotNull
    private DataModelType dataModelType;
    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("sql")
    @JsonPropertyDescription("SQL query statement. Example - 'select * from orders'.")
    private String sql;
    /**
     * Columns from the data model.
     * (Required)
     * 
     */
    @JsonProperty("columns")
    @JsonPropertyDescription("Columns from the data model.")
    @Valid
    @NotNull
    private List<Column> columns = null;
    /**
     * Name of the project / workspace / collection in which the dataModel is contained
     * 
     */
    @JsonProperty("project")
    @JsonPropertyDescription("Name of the project / workspace / collection in which the dataModel is contained")
    private String project;
    /**
     * Fully qualified name of the domain the Dashboard Data Model belongs to.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("Fully qualified name of the domain the Dashboard Data Model belongs to.")
    private String domain;
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

    public CreateDashboardDataModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this data model. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this data model. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateDashboardDataModel withDisplayName(String displayName) {
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

    public CreateDashboardDataModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Tags for this data model.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this data model.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateDashboardDataModel withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public CreateDashboardDataModel withDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
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

    public CreateDashboardDataModel withOwner(EntityReference owner) {
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

    public CreateDashboardDataModel withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Type of Dashboard service - Superset, Looker, Redash, Tableau, Metabase, PowerBi, Mode, or Lightdash
     * 
     */
    @JsonProperty("serviceType")
    public CreateDashboardDataModel.DashboardServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Type of Dashboard service - Superset, Looker, Redash, Tableau, Metabase, PowerBi, Mode, or Lightdash
     * 
     */
    @JsonProperty("serviceType")
    public void setServiceType(CreateDashboardDataModel.DashboardServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public CreateDashboardDataModel withServiceType(CreateDashboardDataModel.DashboardServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * This schema defines the type used for describing different types of data models.Data Model types supported.
     * (Required)
     * 
     */
    @JsonProperty("dataModelType")
    public DataModelType getDataModelType() {
        return dataModelType;
    }

    /**
     * This schema defines the type used for describing different types of data models.Data Model types supported.
     * (Required)
     * 
     */
    @JsonProperty("dataModelType")
    public void setDataModelType(DataModelType dataModelType) {
        this.dataModelType = dataModelType;
    }

    public CreateDashboardDataModel withDataModelType(DataModelType dataModelType) {
        this.dataModelType = dataModelType;
        return this;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("sql")
    public String getSql() {
        return sql;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("sql")
    public void setSql(String sql) {
        this.sql = sql;
    }

    public CreateDashboardDataModel withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * Columns from the data model.
     * (Required)
     * 
     */
    @JsonProperty("columns")
    public List<Column> getColumns() {
        return columns;
    }

    /**
     * Columns from the data model.
     * (Required)
     * 
     */
    @JsonProperty("columns")
    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public CreateDashboardDataModel withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Name of the project / workspace / collection in which the dataModel is contained
     * 
     */
    @JsonProperty("project")
    public String getProject() {
        return project;
    }

    /**
     * Name of the project / workspace / collection in which the dataModel is contained
     * 
     */
    @JsonProperty("project")
    public void setProject(String project) {
        this.project = project;
    }

    public CreateDashboardDataModel withProject(String project) {
        this.project = project;
        return this;
    }

    /**
     * Fully qualified name of the domain the Dashboard Data Model belongs to.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Fully qualified name of the domain the Dashboard Data Model belongs to.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateDashboardDataModel withDomain(String domain) {
        this.domain = domain;
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

    public CreateDashboardDataModel withLifeCycle(LifeCycle lifeCycle) {
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

    public CreateDashboardDataModel withSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateDashboardDataModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("dataProducts");
        sb.append('=');
        sb.append(((this.dataProducts == null)?"<null>":this.dataProducts));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("dataModelType");
        sb.append('=');
        sb.append(((this.dataModelType == null)?"<null>":this.dataModelType));
        sb.append(',');
        sb.append("sql");
        sb.append('=');
        sb.append(((this.sql == null)?"<null>":this.sql));
        sb.append(',');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null)?"<null>":this.columns));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
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
        result = ((result* 31)+((this.serviceType == null)? 0 :this.serviceType.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.columns == null)? 0 :this.columns.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.dataProducts == null)? 0 :this.dataProducts.hashCode()));
        result = ((result* 31)+((this.project == null)? 0 :this.project.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.sql == null)? 0 :this.sql.hashCode()));
        result = ((result* 31)+((this.sourceHash == null)? 0 :this.sourceHash.hashCode()));
        result = ((result* 31)+((this.dataModelType == null)? 0 :this.dataModelType.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.lifeCycle == null)? 0 :this.lifeCycle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateDashboardDataModel) == false) {
            return false;
        }
        CreateDashboardDataModel rhs = ((CreateDashboardDataModel) other);
        return ((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.columns == rhs.columns)||((this.columns!= null)&&this.columns.equals(rhs.columns))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.project == rhs.project)||((this.project!= null)&&this.project.equals(rhs.project))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.sql == rhs.sql)||((this.sql!= null)&&this.sql.equals(rhs.sql))))&&((this.sourceHash == rhs.sourceHash)||((this.sourceHash!= null)&&this.sourceHash.equals(rhs.sourceHash))))&&((this.dataModelType == rhs.dataModelType)||((this.dataModelType!= null)&&this.dataModelType.equals(rhs.dataModelType))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.lifeCycle == rhs.lifeCycle)||((this.lifeCycle!= null)&&this.lifeCycle.equals(rhs.lifeCycle))));
    }


    /**
     * Type of Dashboard service - Superset, Looker, Redash, Tableau, Metabase, PowerBi, Mode, or Lightdash
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DashboardServiceType
        implements EnumInterface
    {

        Superset("Superset"),
        Looker("Looker"),
        Tableau("Tableau"),
        Redash("Redash"),
        Metabase("Metabase"),
        PowerBI("PowerBI"),
        Mode("Mode"),
        CustomDashboard("CustomDashboard"),
        DomoDashboard("DomoDashboard"),
        QuickSight("QuickSight"),
        QlikSense("QlikSense"),
        Lightdash("Lightdash");
        private final String value;
        private final static Map<String, CreateDashboardDataModel.DashboardServiceType> CONSTANTS = new HashMap<String, CreateDashboardDataModel.DashboardServiceType>();

        static {
            for (CreateDashboardDataModel.DashboardServiceType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DashboardServiceType(String value) {
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
        public static CreateDashboardDataModel.DashboardServiceType fromValue(String value) {
            CreateDashboardDataModel.DashboardServiceType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
