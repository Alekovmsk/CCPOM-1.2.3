
package org.openmetadata.schema.entity.userEskClassification;

import java.net.URI;
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
import org.openmetadata.schema.entity.type.Style;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;


/**
 * userEsk
 * <p>
 * A `userEsk` entity is used for userEsk classification or categorization. It is a term defined under `userEskClassification` entity. UserEsks are used to label the entities and entity fields, such as Tables, and Columns.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "displayName",
    "fullyQualifiedName",
    "description",
    "lastName",
    "firstName",
    "middleName",
    "email",
    "userName",
    "fullName",
    "phoneNumber",
    "jobTitle",
    "department",
    "isActive",
    "createTimestamp",
    "modifyTimestamp",
    "style",
    "userEskClassification",
    "parent",
    "children",
    "version",
    "updatedAt",
    "updatedBy",
    "href",
    "usageCount",
    "deprecated",
    "deleted",
    "changeDescription",
    "provider",
    "disabled",
    "mutuallyExclusive"
})
@Generated("jsonschema2pojo")
public class UserEsk implements EntityInterface
{

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Name of the userEsk.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the userEsk.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()]+$")
    @Size(min = 2, max = 64)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this userEsk.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this userEsk.")
    private String displayName;
    /**
     * Unique name of the userEsk of format `userEskClassification.userEsk1.userEsk2`.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("Unique name of the userEsk of format `userEskClassification.userEsk1.userEsk2`.")
    private String fullyQualifiedName;
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
     * last name
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("last name")
    private String lastName;
    /**
     * first name
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("first name")
    private String firstName;
    /**
     * middle name
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("middle name")
    private String middleName;
    /**
     * user email
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("user email")
    private String email;
    /**
     * user name
     * 
     */
    @JsonProperty("userName")
    @JsonPropertyDescription("user name")
    private String userName;
    /**
     * full name
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("full name")
    private String fullName;
    /**
     * phone number
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("phone number")
    private String phoneNumber;
    /**
     * users job title
     * 
     */
    @JsonProperty("jobTitle")
    @JsonPropertyDescription("users job title")
    private String jobTitle;
    /**
     * department
     * 
     */
    @JsonProperty("department")
    @JsonPropertyDescription("department")
    private String department;
    /**
     * is user active
     * 
     */
    @JsonProperty("isActive")
    @JsonPropertyDescription("is user active")
    private String isActive;
    /**
     * create timestamp
     * 
     */
    @JsonProperty("createTimestamp")
    @JsonPropertyDescription("create timestamp")
    private String createTimestamp;
    /**
     * modify timestamp
     * 
     */
    @JsonProperty("modifyTimestamp")
    @JsonPropertyDescription("modify timestamp")
    private String modifyTimestamp;
    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    @JsonPropertyDescription("UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.")
    @Valid
    private Style style;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("userEskClassification")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference userEskClassification;
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
     * Count of how many times this userEsk and children userEsks are used.
     * 
     */
    @JsonProperty("usageCount")
    @JsonPropertyDescription("Count of how many times this userEsk and children userEsks are used.")
    private Integer usageCount;
    /**
     * If the userEsk is deprecated.
     * 
     */
    @JsonProperty("deprecated")
    @JsonPropertyDescription("If the userEsk is deprecated.")
    private Boolean deprecated = false;
    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    @JsonPropertyDescription("When `true` indicates the entity has been soft deleted.")
    private Boolean deleted = false;
    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    @JsonPropertyDescription("Description of the change.")
    @Valid
    private ChangeDescription changeDescription;
    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.")
    private ProviderType provider = ProviderType.fromValue("user");
    /**
     * System userEsks can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    @JsonPropertyDescription("System userEsks can't be deleted. Use this flag to disable them.")
    private Boolean disabled;
    /**
     * Children userEsks under this group are mutually exclusive. When mutually exclusive is `true` the userEsks from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the userEsks from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    @JsonPropertyDescription("Children userEsks under this group are mutually exclusive. When mutually exclusive is `true` the userEsks from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the userEsks from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.")
    private Boolean mutuallyExclusive = false;

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

    public UserEsk withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Name of the userEsk.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the userEsk.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public UserEsk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this userEsk.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this userEsk.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public UserEsk withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Unique name of the userEsk of format `userEskClassification.userEsk1.userEsk2`.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * Unique name of the userEsk of format `userEskClassification.userEsk1.userEsk2`.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public UserEsk withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
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

    public UserEsk withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * last name
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * last name
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserEsk withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * first name
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * first name
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserEsk withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * middle name
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * middle name
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public UserEsk withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * user email
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * user email
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public UserEsk withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * user name
     * 
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * user name
     * 
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserEsk withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * full name
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * full name
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserEsk withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * phone number
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * phone number
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserEsk withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * users job title
     * 
     */
    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * users job title
     * 
     */
    @JsonProperty("jobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public UserEsk withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * department
     * 
     */
    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    /**
     * department
     * 
     */
    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    public UserEsk withDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * is user active
     * 
     */
    @JsonProperty("isActive")
    public String getIsActive() {
        return isActive;
    }

    /**
     * is user active
     * 
     */
    @JsonProperty("isActive")
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public UserEsk withIsActive(String isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * create timestamp
     * 
     */
    @JsonProperty("createTimestamp")
    public String getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * create timestamp
     * 
     */
    @JsonProperty("createTimestamp")
    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public UserEsk withCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }

    /**
     * modify timestamp
     * 
     */
    @JsonProperty("modifyTimestamp")
    public String getModifyTimestamp() {
        return modifyTimestamp;
    }

    /**
     * modify timestamp
     * 
     */
    @JsonProperty("modifyTimestamp")
    public void setModifyTimestamp(String modifyTimestamp) {
        this.modifyTimestamp = modifyTimestamp;
    }

    public UserEsk withModifyTimestamp(String modifyTimestamp) {
        this.modifyTimestamp = modifyTimestamp;
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

    public UserEsk withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("userEskClassification")
    public EntityReference getUserEskClassification() {
        return userEskClassification;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("userEskClassification")
    public void setUserEskClassification(EntityReference userEskClassification) {
        this.userEskClassification = userEskClassification;
    }

    public UserEsk withUserEskClassification(EntityReference userEskClassification) {
        this.userEskClassification = userEskClassification;
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

    public UserEsk withParent(EntityReference parent) {
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

    public UserEsk withChildren(List<EntityReference> children) {
        this.children = children;
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

    public UserEsk withVersion(Double version) {
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

    public UserEsk withUpdatedAt(Long updatedAt) {
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

    public UserEsk withUpdatedBy(String updatedBy) {
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

    public UserEsk withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Count of how many times this userEsk and children userEsks are used.
     * 
     */
    @JsonProperty("usageCount")
    public Integer getUsageCount() {
        return usageCount;
    }

    /**
     * Count of how many times this userEsk and children userEsks are used.
     * 
     */
    @JsonProperty("usageCount")
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public UserEsk withUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
        return this;
    }

    /**
     * If the userEsk is deprecated.
     * 
     */
    @JsonProperty("deprecated")
    public Boolean getDeprecated() {
        return deprecated;
    }

    /**
     * If the userEsk is deprecated.
     * 
     */
    @JsonProperty("deprecated")
    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public UserEsk withDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }

    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public UserEsk withDeleted(Boolean deleted) {
        this.deleted = deleted;
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

    public UserEsk withChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
        return this;
    }

    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    public ProviderType getProvider() {
        return provider;
    }

    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    public void setProvider(ProviderType provider) {
        this.provider = provider;
    }

    public UserEsk withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * System userEsks can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * System userEsks can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public UserEsk withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Children userEsks under this group are mutually exclusive. When mutually exclusive is `true` the userEsks from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the userEsks from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public Boolean getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    /**
     * Children userEsks under this group are mutually exclusive. When mutually exclusive is `true` the userEsks from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the userEsks from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public void setMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

    public UserEsk withMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserEsk.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("jobTitle");
        sb.append('=');
        sb.append(((this.jobTitle == null)?"<null>":this.jobTitle));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null)?"<null>":this.isActive));
        sb.append(',');
        sb.append("createTimestamp");
        sb.append('=');
        sb.append(((this.createTimestamp == null)?"<null>":this.createTimestamp));
        sb.append(',');
        sb.append("modifyTimestamp");
        sb.append('=');
        sb.append(((this.modifyTimestamp == null)?"<null>":this.modifyTimestamp));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("userEskClassification");
        sb.append('=');
        sb.append(((this.userEskClassification == null)?"<null>":this.userEskClassification));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null)?"<null>":this.children));
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
        sb.append("usageCount");
        sb.append('=');
        sb.append(((this.usageCount == null)?"<null>":this.usageCount));
        sb.append(',');
        sb.append("deprecated");
        sb.append('=');
        sb.append(((this.deprecated == null)?"<null>":this.deprecated));
        sb.append(',');
        sb.append("deleted");
        sb.append('=');
        sb.append(((this.deleted == null)?"<null>":this.deleted));
        sb.append(',');
        sb.append("changeDescription");
        sb.append('=');
        sb.append(((this.changeDescription == null)?"<null>":this.changeDescription));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("disabled");
        sb.append('=');
        sb.append(((this.disabled == null)?"<null>":this.disabled));
        sb.append(',');
        sb.append("mutuallyExclusive");
        sb.append('=');
        sb.append(((this.mutuallyExclusive == null)?"<null>":this.mutuallyExclusive));
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
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.jobTitle == null)? 0 :this.jobTitle.hashCode()));
        result = ((result* 31)+((this.deprecated == null)? 0 :this.deprecated.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.isActive == null)? 0 :this.isActive.hashCode()));
        result = ((result* 31)+((this.createTimestamp == null)? 0 :this.createTimestamp.hashCode()));
        result = ((result* 31)+((this.modifyTimestamp == null)? 0 :this.modifyTimestamp.hashCode()));
        result = ((result* 31)+((this.children == null)? 0 :this.children.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.userEskClassification == null)? 0 :this.userEskClassification.hashCode()));
        result = ((result* 31)+((this.disabled == null)? 0 :this.disabled.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.usageCount == null)? 0 :this.usageCount.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.mutuallyExclusive == null)? 0 :this.mutuallyExclusive.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserEsk) == false) {
            return false;
        }
        UserEsk rhs = ((UserEsk) other);
        return (((((((((((((((((((((((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.jobTitle == rhs.jobTitle)||((this.jobTitle!= null)&&this.jobTitle.equals(rhs.jobTitle))))&&((this.deprecated == rhs.deprecated)||((this.deprecated!= null)&&this.deprecated.equals(rhs.deprecated))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.isActive == rhs.isActive)||((this.isActive!= null)&&this.isActive.equals(rhs.isActive))))&&((this.createTimestamp == rhs.createTimestamp)||((this.createTimestamp!= null)&&this.createTimestamp.equals(rhs.createTimestamp))))&&((this.modifyTimestamp == rhs.modifyTimestamp)||((this.modifyTimestamp!= null)&&this.modifyTimestamp.equals(rhs.modifyTimestamp))))&&((this.children == rhs.children)||((this.children!= null)&&this.children.equals(rhs.children))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.userEskClassification == rhs.userEskClassification)||((this.userEskClassification!= null)&&this.userEskClassification.equals(rhs.userEskClassification))))&&((this.disabled == rhs.disabled)||((this.disabled!= null)&&this.disabled.equals(rhs.disabled))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.usageCount == rhs.usageCount)||((this.usageCount!= null)&&this.usageCount.equals(rhs.usageCount))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.mutuallyExclusive == rhs.mutuallyExclusive)||((this.mutuallyExclusive!= null)&&this.mutuallyExclusive.equals(rhs.mutuallyExclusive))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))));
    }

}
