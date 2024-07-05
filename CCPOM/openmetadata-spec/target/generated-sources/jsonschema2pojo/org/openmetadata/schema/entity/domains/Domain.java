
package org.openmetadata.schema.entity.domains;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.EntityInterface;
import org.openmetadata.schema.api.domains.DataSourceEl;
import org.openmetadata.schema.api.domains.DomainQuota;
import org.openmetadata.schema.api.domains.DomainTeamMember;
import org.openmetadata.schema.entity.type.Style;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TagLabel;


/**
 * Domain
 * <p>
 * A `Domain` is a bounded context that is aligned with a Business Unit or a function within an organization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "domainType",
    "name",
    "fullyQualifiedName",
    "displayName",
    "fullName",
    "domainOwner",
    "domainTechLeader",
    "description",
    "dataSourcesList",
    "domainTeam",
    "domainQuotasList",
    "tags",
    "style",
    "version",
    "updatedAt",
    "updatedBy",
    "href",
    "parent",
    "children",
    "owner",
    "experts",
    "changeDescription"
})
@Generated("jsonschema2pojo")
public class Domain implements EntityInterface
{

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    @NotNull
    private UUID id;
    /**
     * Type of a domain
     * (Required)
     * 
     */
    @JsonProperty("domainType")
    @JsonPropertyDescription("Type of a domain")
    @NotNull
    private org.openmetadata.schema.api.domains.CreateDomain.DomainType domainType;
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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Name used for display purposes. Example 'Marketing', 'Payments', etc.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Name used for display purposes. Example 'Marketing', 'Payments', etc.")
    private String displayName;
    /**
     * full domain name
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("full domain name")
    private String fullName;
    /**
     * Domain owner name
     * 
     */
    @JsonProperty("domainOwner")
    @JsonPropertyDescription("Domain owner name")
    private String domainOwner;
    /**
     * Domain tech leader name
     * 
     */
    @JsonProperty("domainTechLeader")
    @JsonPropertyDescription("Domain tech leader name")
    private String domainTechLeader;
    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    @NotNull
    private String description;
    /**
     * Data sources list
     * 
     */
    @JsonProperty("dataSourcesList")
    @JsonPropertyDescription("Data sources list")
    @Valid
    private List<DataSourceEl> dataSourcesList = new ArrayList<DataSourceEl>();
    /**
     * Domain team
     * 
     */
    @JsonProperty("domainTeam")
    @JsonPropertyDescription("Domain team")
    @Valid
    private List<DomainTeamMember> domainTeam = new ArrayList<DomainTeamMember>();
    /**
     * Domain quotas
     * 
     */
    @JsonProperty("domainQuotasList")
    @JsonPropertyDescription("Domain quotas")
    @Valid
    private List<DomainQuota> domainQuotasList = new ArrayList<DomainQuota>();
    /**
     * Tags for this Domain.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this Domain.")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    @JsonPropertyDescription("UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.")
    @Valid
    private Style style;
    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.")
    private Double version = 0.1D;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long updatedAt;
    /**
     * User who made the update.
     * 
     */
    @JsonProperty("updatedBy")
    @JsonPropertyDescription("User who made the update.")
    private String updatedBy;
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("parent")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference parent;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("children")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> children = null;
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
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("experts")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> experts = null;
    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    @JsonPropertyDescription("Description of the change.")
    @Valid
    private ChangeDescription changeDescription;

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    public Domain withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Type of a domain
     * (Required)
     * 
     */
    @JsonProperty("domainType")
    public org.openmetadata.schema.api.domains.CreateDomain.DomainType getDomainType() {
        return domainType;
    }

    /**
     * Type of a domain
     * (Required)
     * 
     */
    @JsonProperty("domainType")
    public void setDomainType(org.openmetadata.schema.api.domains.CreateDomain.DomainType domainType) {
        this.domainType = domainType;
    }

    public Domain withDomainType(org.openmetadata.schema.api.domains.CreateDomain.DomainType domainType) {
        this.domainType = domainType;
        return this;
    }

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

    public Domain withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public Domain withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Name used for display purposes. Example 'Marketing', 'Payments', etc.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Name used for display purposes. Example 'Marketing', 'Payments', etc.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Domain withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * full domain name
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * full domain name
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Domain withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Domain owner name
     * 
     */
    @JsonProperty("domainOwner")
    public String getDomainOwner() {
        return domainOwner;
    }

    /**
     * Domain owner name
     * 
     */
    @JsonProperty("domainOwner")
    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    public Domain withDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
        return this;
    }

    /**
     * Domain tech leader name
     * 
     */
    @JsonProperty("domainTechLeader")
    public String getDomainTechLeader() {
        return domainTechLeader;
    }

    /**
     * Domain tech leader name
     * 
     */
    @JsonProperty("domainTechLeader")
    public void setDomainTechLeader(String domainTechLeader) {
        this.domainTechLeader = domainTechLeader;
    }

    public Domain withDomainTechLeader(String domainTechLeader) {
        this.domainTechLeader = domainTechLeader;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Domain withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Data sources list
     * 
     */
    @JsonProperty("dataSourcesList")
    public List<DataSourceEl> getDataSourcesList() {
        return dataSourcesList;
    }

    /**
     * Data sources list
     * 
     */
    @JsonProperty("dataSourcesList")
    public void setDataSourcesList(List<DataSourceEl> dataSourcesList) {
        this.dataSourcesList = dataSourcesList;
    }

    public Domain withDataSourcesList(List<DataSourceEl> dataSourcesList) {
        this.dataSourcesList = dataSourcesList;
        return this;
    }

    /**
     * Domain team
     * 
     */
    @JsonProperty("domainTeam")
    public List<DomainTeamMember> getDomainTeam() {
        return domainTeam;
    }

    /**
     * Domain team
     * 
     */
    @JsonProperty("domainTeam")
    public void setDomainTeam(List<DomainTeamMember> domainTeam) {
        this.domainTeam = domainTeam;
    }

    public Domain withDomainTeam(List<DomainTeamMember> domainTeam) {
        this.domainTeam = domainTeam;
        return this;
    }

    /**
     * Domain quotas
     * 
     */
    @JsonProperty("domainQuotasList")
    public List<DomainQuota> getDomainQuotasList() {
        return domainQuotasList;
    }

    /**
     * Domain quotas
     * 
     */
    @JsonProperty("domainQuotasList")
    public void setDomainQuotasList(List<DomainQuota> domainQuotasList) {
        this.domainQuotasList = domainQuotasList;
    }

    public Domain withDomainQuotasList(List<DomainQuota> domainQuotasList) {
        this.domainQuotasList = domainQuotasList;
        return this;
    }

    /**
     * Tags for this Domain.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this Domain.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public Domain withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    public Style getStyle() {
        return style;
    }

    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    public void setStyle(Style style) {
        this.style = style;
    }

    public Domain withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    public Double getVersion() {
        return version;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    public void setVersion(Double version) {
        this.version = version;
    }

    public Domain withVersion(Double version) {
        this.version = version;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    public Long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Domain withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * User who made the update.
     * 
     */
    @JsonProperty("updatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * User who made the update.
     * 
     */
    @JsonProperty("updatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Domain withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    public URI getHref() {
        return href;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    public void setHref(URI href) {
        this.href = href;
    }

    public Domain withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("parent")
    public EntityReference getParent() {
        return parent;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("parent")
    public void setParent(EntityReference parent) {
        this.parent = parent;
    }

    public Domain withParent(EntityReference parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("children")
    public List<EntityReference> getChildren() {
        return children;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("children")
    public void setChildren(List<EntityReference> children) {
        this.children = children;
    }

    public Domain withChildren(List<EntityReference> children) {
        this.children = children;
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

    public Domain withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("experts")
    public List<EntityReference> getExperts() {
        return experts;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("experts")
    public void setExperts(List<EntityReference> experts) {
        this.experts = experts;
    }

    public Domain withExperts(List<EntityReference> experts) {
        this.experts = experts;
        return this;
    }

    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    public ChangeDescription getChangeDescription() {
        return changeDescription;
    }

    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    public void setChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
    }

    public Domain withChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Domain.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("domainType");
        sb.append('=');
        sb.append(((this.domainType == null)?"<null>":this.domainType));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("domainOwner");
        sb.append('=');
        sb.append(((this.domainOwner == null)?"<null>":this.domainOwner));
        sb.append(',');
        sb.append("domainTechLeader");
        sb.append('=');
        sb.append(((this.domainTechLeader == null)?"<null>":this.domainTechLeader));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("dataSourcesList");
        sb.append('=');
        sb.append(((this.dataSourcesList == null)?"<null>":this.dataSourcesList));
        sb.append(',');
        sb.append("domainTeam");
        sb.append('=');
        sb.append(((this.domainTeam == null)?"<null>":this.domainTeam));
        sb.append(',');
        sb.append("domainQuotasList");
        sb.append('=');
        sb.append(((this.domainQuotasList == null)?"<null>":this.domainQuotasList));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null)?"<null>":this.children));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("experts");
        sb.append('=');
        sb.append(((this.experts == null)?"<null>":this.experts));
        sb.append(',');
        sb.append("changeDescription");
        sb.append('=');
        sb.append(((this.changeDescription == null)?"<null>":this.changeDescription));
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
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.domainType == null)? 0 :this.domainType.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.domainTechLeader == null)? 0 :this.domainTechLeader.hashCode()));
        result = ((result* 31)+((this.children == null)? 0 :this.children.hashCode()));
        result = ((result* 31)+((this.domainQuotasList == null)? 0 :this.domainQuotasList.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.domainOwner == null)? 0 :this.domainOwner.hashCode()));
        result = ((result* 31)+((this.domainTeam == null)? 0 :this.domainTeam.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.experts == null)? 0 :this.experts.hashCode()));
        result = ((result* 31)+((this.dataSourcesList == null)? 0 :this.dataSourcesList.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Domain) == false) {
            return false;
        }
        Domain rhs = ((Domain) other);
        return ((((((((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.domainType == rhs.domainType)||((this.domainType!= null)&&this.domainType.equals(rhs.domainType))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.domainTechLeader == rhs.domainTechLeader)||((this.domainTechLeader!= null)&&this.domainTechLeader.equals(rhs.domainTechLeader))))&&((this.children == rhs.children)||((this.children!= null)&&this.children.equals(rhs.children))))&&((this.domainQuotasList == rhs.domainQuotasList)||((this.domainQuotasList!= null)&&this.domainQuotasList.equals(rhs.domainQuotasList))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.domainOwner == rhs.domainOwner)||((this.domainOwner!= null)&&this.domainOwner.equals(rhs.domainOwner))))&&((this.domainTeam == rhs.domainTeam)||((this.domainTeam!= null)&&this.domainTeam.equals(rhs.domainTeam))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.experts == rhs.experts)||((this.experts!= null)&&this.experts.equals(rhs.experts))))&&((this.dataSourcesList == rhs.dataSourcesList)||((this.dataSourcesList!= null)&&this.dataSourcesList.equals(rhs.dataSourcesList))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
