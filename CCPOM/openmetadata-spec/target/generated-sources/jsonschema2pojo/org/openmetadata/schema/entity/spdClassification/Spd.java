
package org.openmetadata.schema.entity.spdClassification;

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
import org.openmetadata.schema.api.spdClassification.SpdIndicator;
import org.openmetadata.schema.api.spdClassification.SpdMember;
import org.openmetadata.schema.api.spdClassification.SpdRequirement;
import org.openmetadata.schema.entity.type.Style;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;


/**
 * spd
 * <p>
 * A `spd` entity is used for spd classification or categorization. It is a term defined under `spdClassification` entity. Spds are used to label the entities and entity fields, such as Tables, and Columns.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "displayName",
    "fullyQualifiedName",
    "description",
    "docNumber",
    "docType",
    "conclusionDate",
    "expirationDate",
    "validity",
    "prolongation",
    "domainData",
    "consumer",
    "docStatus",
    "members",
    "autoSystemProvider",
    "autoSystemOwnerFullName",
    "autoSystemOwnerPhone",
    "autoSystemOwnerEmail",
    "productManagerFullName",
    "productManagerPhone",
    "productManagerEmail",
    "owner",
    "connectionParameters",
    "connectionModes",
    "otherParameters",
    "requirements",
    "indicators",
    "reportingType",
    "reportingPeriodicity",
    "reportingFormationMode",
    "reportingHref",
    "style",
    "spdClassification",
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
public class Spd implements EntityInterface
{

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Name of the spd.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the spd.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()]+$")
    @Size(min = 2, max = 64)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this spd.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this spd.")
    private String displayName;
    /**
     * Unique name of the spd of format `spdClassification.spd1.spd2`.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("Unique name of the spd of format `spdClassification.spd1.spd2`.")
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
     * doc number
     * 
     */
    @JsonProperty("docNumber")
    @JsonPropertyDescription("doc number")
    private String docNumber;
    /**
     * doc type
     * 
     */
    @JsonProperty("docType")
    @JsonPropertyDescription("doc type")
    private String docType;
    /**
     * Date in ISO 8601 format in UTC. Example - '2018-11-13'.@om-field-type
     * 
     */
    @JsonProperty("conclusionDate")
    @JsonPropertyDescription("Date in ISO 8601 format in UTC. Example - '2018-11-13'.")
    private String conclusionDate;
    /**
     * expiration date
     * 
     */
    @JsonProperty("expirationDate")
    @JsonPropertyDescription("expiration date")
    private String expirationDate;
    /**
     * validity
     * 
     */
    @JsonProperty("validity")
    @JsonPropertyDescription("validity")
    private String validity;
    /**
     * prolongation
     * 
     */
    @JsonProperty("prolongation")
    @JsonPropertyDescription("prolongation")
    private Boolean prolongation = false;
    /**
     * domain data
     * 
     */
    @JsonProperty("domainData")
    @JsonPropertyDescription("domain data")
    private String domainData;
    /**
     * consumer
     * 
     */
    @JsonProperty("consumer")
    @JsonPropertyDescription("consumer")
    private String consumer;
    /**
     * status
     * 
     */
    @JsonProperty("docStatus")
    @JsonPropertyDescription("status")
    private String docStatus;
    /**
     * members
     * 
     */
    @JsonProperty("members")
    @JsonPropertyDescription("members")
    @Valid
    private List<SpdMember> members = new ArrayList<SpdMember>();
    /**
     * autoSystemProvider
     * 
     */
    @JsonProperty("autoSystemProvider")
    @JsonPropertyDescription("autoSystemProvider")
    private String autoSystemProvider;
    /**
     * autoSystenOwnerFullName
     * 
     */
    @JsonProperty("autoSystemOwnerFullName")
    @JsonPropertyDescription("autoSystenOwnerFullName")
    private String autoSystemOwnerFullName;
    /**
     * AutoSystenOwnerPhone
     * 
     */
    @JsonProperty("autoSystemOwnerPhone")
    @JsonPropertyDescription("AutoSystenOwnerPhone")
    private String autoSystemOwnerPhone;
    /**
     * AutoSystenOwnerEmail
     * 
     */
    @JsonProperty("autoSystemOwnerEmail")
    @JsonPropertyDescription("AutoSystenOwnerEmail")
    private String autoSystemOwnerEmail;
    /**
     * productManagerFullName
     * 
     */
    @JsonProperty("productManagerFullName")
    @JsonPropertyDescription("productManagerFullName")
    private String productManagerFullName;
    /**
     * productManagerPhone
     * 
     */
    @JsonProperty("productManagerPhone")
    @JsonPropertyDescription("productManagerPhone")
    private String productManagerPhone;
    /**
     * productManagerEmail
     * 
     */
    @JsonProperty("productManagerEmail")
    @JsonPropertyDescription("productManagerEmail")
    private String productManagerEmail;
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
     * connection Parameters
     * 
     */
    @JsonProperty("connectionParameters")
    @JsonPropertyDescription("connection Parameters")
    private String connectionParameters;
    /**
     * connection modes, time parameters for data provision
     * 
     */
    @JsonProperty("connectionModes")
    @JsonPropertyDescription("connection modes, time parameters for data provision")
    private String connectionModes;
    /**
     * other parameters requiring explicit indication
     * 
     */
    @JsonProperty("otherParameters")
    @JsonPropertyDescription("other parameters requiring explicit indication")
    private String otherParameters;
    /**
     * requirements
     * 
     */
    @JsonProperty("requirements")
    @JsonPropertyDescription("requirements")
    @Valid
    private List<SpdRequirement> requirements = new ArrayList<SpdRequirement>();
    /**
     * indicators
     * 
     */
    @JsonProperty("indicators")
    @JsonPropertyDescription("indicators")
    @Valid
    private List<SpdIndicator> indicators = new ArrayList<SpdIndicator>();
    /**
     * Reporting Type
     * 
     */
    @JsonProperty("reportingType")
    @JsonPropertyDescription("Reporting Type")
    private String reportingType;
    /**
     * Reporting Periodicity
     * 
     */
    @JsonProperty("reportingPeriodicity")
    @JsonPropertyDescription("Reporting Periodicity")
    private String reportingPeriodicity;
    /**
     * Reporting Fromation Mode
     * 
     */
    @JsonProperty("reportingFormationMode")
    @JsonPropertyDescription("Reporting Fromation Mode")
    private String reportingFormationMode;
    /**
     * Reporting link
     * 
     */
    @JsonProperty("reportingHref")
    @JsonPropertyDescription("Reporting link")
    private String reportingHref;
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
    @JsonProperty("spdClassification")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference spdClassification;
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
     * Count of how many times this spd and children spds are used.
     * 
     */
    @JsonProperty("usageCount")
    @JsonPropertyDescription("Count of how many times this spd and children spds are used.")
    private Integer usageCount;
    /**
     * If the spd is deprecated.
     * 
     */
    @JsonProperty("deprecated")
    @JsonPropertyDescription("If the spd is deprecated.")
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
     * System spds can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    @JsonPropertyDescription("System spds can't be deleted. Use this flag to disable them.")
    private Boolean disabled;
    /**
     * Children spds under this group are mutually exclusive. When mutually exclusive is `true` the spds from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the spds from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    @JsonPropertyDescription("Children spds under this group are mutually exclusive. When mutually exclusive is `true` the spds from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the spds from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.")
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

    public Spd withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Name of the spd.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the spd.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Spd withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this spd.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this spd.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Spd withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Unique name of the spd of format `spdClassification.spd1.spd2`.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * Unique name of the spd of format `spdClassification.spd1.spd2`.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public Spd withFullyQualifiedName(String fullyQualifiedName) {
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

    public Spd withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * doc number
     * 
     */
    @JsonProperty("docNumber")
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * doc number
     * 
     */
    @JsonProperty("docNumber")
    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public Spd withDocNumber(String docNumber) {
        this.docNumber = docNumber;
        return this;
    }

    /**
     * doc type
     * 
     */
    @JsonProperty("docType")
    public String getDocType() {
        return docType;
    }

    /**
     * doc type
     * 
     */
    @JsonProperty("docType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    public Spd withDocType(String docType) {
        this.docType = docType;
        return this;
    }

    /**
     * Date in ISO 8601 format in UTC. Example - '2018-11-13'.@om-field-type
     * 
     */
    @JsonProperty("conclusionDate")
    public String getConclusionDate() {
        return conclusionDate;
    }

    /**
     * Date in ISO 8601 format in UTC. Example - '2018-11-13'.@om-field-type
     * 
     */
    @JsonProperty("conclusionDate")
    public void setConclusionDate(String conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public Spd withConclusionDate(String conclusionDate) {
        this.conclusionDate = conclusionDate;
        return this;
    }

    /**
     * expiration date
     * 
     */
    @JsonProperty("expirationDate")
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * expiration date
     * 
     */
    @JsonProperty("expirationDate")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Spd withExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * validity
     * 
     */
    @JsonProperty("validity")
    public String getValidity() {
        return validity;
    }

    /**
     * validity
     * 
     */
    @JsonProperty("validity")
    public void setValidity(String validity) {
        this.validity = validity;
    }

    public Spd withValidity(String validity) {
        this.validity = validity;
        return this;
    }

    /**
     * prolongation
     * 
     */
    @JsonProperty("prolongation")
    public Boolean getProlongation() {
        return prolongation;
    }

    /**
     * prolongation
     * 
     */
    @JsonProperty("prolongation")
    public void setProlongation(Boolean prolongation) {
        this.prolongation = prolongation;
    }

    public Spd withProlongation(Boolean prolongation) {
        this.prolongation = prolongation;
        return this;
    }

    /**
     * domain data
     * 
     */
    @JsonProperty("domainData")
    public String getDomainData() {
        return domainData;
    }

    /**
     * domain data
     * 
     */
    @JsonProperty("domainData")
    public void setDomainData(String domainData) {
        this.domainData = domainData;
    }

    public Spd withDomainData(String domainData) {
        this.domainData = domainData;
        return this;
    }

    /**
     * consumer
     * 
     */
    @JsonProperty("consumer")
    public String getConsumer() {
        return consumer;
    }

    /**
     * consumer
     * 
     */
    @JsonProperty("consumer")
    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public Spd withConsumer(String consumer) {
        this.consumer = consumer;
        return this;
    }

    /**
     * status
     * 
     */
    @JsonProperty("docStatus")
    public String getDocStatus() {
        return docStatus;
    }

    /**
     * status
     * 
     */
    @JsonProperty("docStatus")
    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }

    public Spd withDocStatus(String docStatus) {
        this.docStatus = docStatus;
        return this;
    }

    /**
     * members
     * 
     */
    @JsonProperty("members")
    public List<SpdMember> getMembers() {
        return members;
    }

    /**
     * members
     * 
     */
    @JsonProperty("members")
    public void setMembers(List<SpdMember> members) {
        this.members = members;
    }

    public Spd withMembers(List<SpdMember> members) {
        this.members = members;
        return this;
    }

    /**
     * autoSystemProvider
     * 
     */
    @JsonProperty("autoSystemProvider")
    public String getAutoSystemProvider() {
        return autoSystemProvider;
    }

    /**
     * autoSystemProvider
     * 
     */
    @JsonProperty("autoSystemProvider")
    public void setAutoSystemProvider(String autoSystemProvider) {
        this.autoSystemProvider = autoSystemProvider;
    }

    public Spd withAutoSystemProvider(String autoSystemProvider) {
        this.autoSystemProvider = autoSystemProvider;
        return this;
    }

    /**
     * autoSystenOwnerFullName
     * 
     */
    @JsonProperty("autoSystemOwnerFullName")
    public String getAutoSystemOwnerFullName() {
        return autoSystemOwnerFullName;
    }

    /**
     * autoSystenOwnerFullName
     * 
     */
    @JsonProperty("autoSystemOwnerFullName")
    public void setAutoSystemOwnerFullName(String autoSystemOwnerFullName) {
        this.autoSystemOwnerFullName = autoSystemOwnerFullName;
    }

    public Spd withAutoSystemOwnerFullName(String autoSystemOwnerFullName) {
        this.autoSystemOwnerFullName = autoSystemOwnerFullName;
        return this;
    }

    /**
     * AutoSystenOwnerPhone
     * 
     */
    @JsonProperty("autoSystemOwnerPhone")
    public String getAutoSystemOwnerPhone() {
        return autoSystemOwnerPhone;
    }

    /**
     * AutoSystenOwnerPhone
     * 
     */
    @JsonProperty("autoSystemOwnerPhone")
    public void setAutoSystemOwnerPhone(String autoSystemOwnerPhone) {
        this.autoSystemOwnerPhone = autoSystemOwnerPhone;
    }

    public Spd withAutoSystemOwnerPhone(String autoSystemOwnerPhone) {
        this.autoSystemOwnerPhone = autoSystemOwnerPhone;
        return this;
    }

    /**
     * AutoSystenOwnerEmail
     * 
     */
    @JsonProperty("autoSystemOwnerEmail")
    public String getAutoSystemOwnerEmail() {
        return autoSystemOwnerEmail;
    }

    /**
     * AutoSystenOwnerEmail
     * 
     */
    @JsonProperty("autoSystemOwnerEmail")
    public void setAutoSystemOwnerEmail(String autoSystemOwnerEmail) {
        this.autoSystemOwnerEmail = autoSystemOwnerEmail;
    }

    public Spd withAutoSystemOwnerEmail(String autoSystemOwnerEmail) {
        this.autoSystemOwnerEmail = autoSystemOwnerEmail;
        return this;
    }

    /**
     * productManagerFullName
     * 
     */
    @JsonProperty("productManagerFullName")
    public String getProductManagerFullName() {
        return productManagerFullName;
    }

    /**
     * productManagerFullName
     * 
     */
    @JsonProperty("productManagerFullName")
    public void setProductManagerFullName(String productManagerFullName) {
        this.productManagerFullName = productManagerFullName;
    }

    public Spd withProductManagerFullName(String productManagerFullName) {
        this.productManagerFullName = productManagerFullName;
        return this;
    }

    /**
     * productManagerPhone
     * 
     */
    @JsonProperty("productManagerPhone")
    public String getProductManagerPhone() {
        return productManagerPhone;
    }

    /**
     * productManagerPhone
     * 
     */
    @JsonProperty("productManagerPhone")
    public void setProductManagerPhone(String productManagerPhone) {
        this.productManagerPhone = productManagerPhone;
    }

    public Spd withProductManagerPhone(String productManagerPhone) {
        this.productManagerPhone = productManagerPhone;
        return this;
    }

    /**
     * productManagerEmail
     * 
     */
    @JsonProperty("productManagerEmail")
    public String getProductManagerEmail() {
        return productManagerEmail;
    }

    /**
     * productManagerEmail
     * 
     */
    @JsonProperty("productManagerEmail")
    public void setProductManagerEmail(String productManagerEmail) {
        this.productManagerEmail = productManagerEmail;
    }

    public Spd withProductManagerEmail(String productManagerEmail) {
        this.productManagerEmail = productManagerEmail;
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

    public Spd withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * connection Parameters
     * 
     */
    @JsonProperty("connectionParameters")
    public String getConnectionParameters() {
        return connectionParameters;
    }

    /**
     * connection Parameters
     * 
     */
    @JsonProperty("connectionParameters")
    public void setConnectionParameters(String connectionParameters) {
        this.connectionParameters = connectionParameters;
    }

    public Spd withConnectionParameters(String connectionParameters) {
        this.connectionParameters = connectionParameters;
        return this;
    }

    /**
     * connection modes, time parameters for data provision
     * 
     */
    @JsonProperty("connectionModes")
    public String getConnectionModes() {
        return connectionModes;
    }

    /**
     * connection modes, time parameters for data provision
     * 
     */
    @JsonProperty("connectionModes")
    public void setConnectionModes(String connectionModes) {
        this.connectionModes = connectionModes;
    }

    public Spd withConnectionModes(String connectionModes) {
        this.connectionModes = connectionModes;
        return this;
    }

    /**
     * other parameters requiring explicit indication
     * 
     */
    @JsonProperty("otherParameters")
    public String getOtherParameters() {
        return otherParameters;
    }

    /**
     * other parameters requiring explicit indication
     * 
     */
    @JsonProperty("otherParameters")
    public void setOtherParameters(String otherParameters) {
        this.otherParameters = otherParameters;
    }

    public Spd withOtherParameters(String otherParameters) {
        this.otherParameters = otherParameters;
        return this;
    }

    /**
     * requirements
     * 
     */
    @JsonProperty("requirements")
    public List<SpdRequirement> getRequirements() {
        return requirements;
    }

    /**
     * requirements
     * 
     */
    @JsonProperty("requirements")
    public void setRequirements(List<SpdRequirement> requirements) {
        this.requirements = requirements;
    }

    public Spd withRequirements(List<SpdRequirement> requirements) {
        this.requirements = requirements;
        return this;
    }

    /**
     * indicators
     * 
     */
    @JsonProperty("indicators")
    public List<SpdIndicator> getIndicators() {
        return indicators;
    }

    /**
     * indicators
     * 
     */
    @JsonProperty("indicators")
    public void setIndicators(List<SpdIndicator> indicators) {
        this.indicators = indicators;
    }

    public Spd withIndicators(List<SpdIndicator> indicators) {
        this.indicators = indicators;
        return this;
    }

    /**
     * Reporting Type
     * 
     */
    @JsonProperty("reportingType")
    public String getReportingType() {
        return reportingType;
    }

    /**
     * Reporting Type
     * 
     */
    @JsonProperty("reportingType")
    public void setReportingType(String reportingType) {
        this.reportingType = reportingType;
    }

    public Spd withReportingType(String reportingType) {
        this.reportingType = reportingType;
        return this;
    }

    /**
     * Reporting Periodicity
     * 
     */
    @JsonProperty("reportingPeriodicity")
    public String getReportingPeriodicity() {
        return reportingPeriodicity;
    }

    /**
     * Reporting Periodicity
     * 
     */
    @JsonProperty("reportingPeriodicity")
    public void setReportingPeriodicity(String reportingPeriodicity) {
        this.reportingPeriodicity = reportingPeriodicity;
    }

    public Spd withReportingPeriodicity(String reportingPeriodicity) {
        this.reportingPeriodicity = reportingPeriodicity;
        return this;
    }

    /**
     * Reporting Fromation Mode
     * 
     */
    @JsonProperty("reportingFormationMode")
    public String getReportingFormationMode() {
        return reportingFormationMode;
    }

    /**
     * Reporting Fromation Mode
     * 
     */
    @JsonProperty("reportingFormationMode")
    public void setReportingFormationMode(String reportingFormationMode) {
        this.reportingFormationMode = reportingFormationMode;
    }

    public Spd withReportingFormationMode(String reportingFormationMode) {
        this.reportingFormationMode = reportingFormationMode;
        return this;
    }

    /**
     * Reporting link
     * 
     */
    @JsonProperty("reportingHref")
    public String getReportingHref() {
        return reportingHref;
    }

    /**
     * Reporting link
     * 
     */
    @JsonProperty("reportingHref")
    public void setReportingHref(String reportingHref) {
        this.reportingHref = reportingHref;
    }

    public Spd withReportingHref(String reportingHref) {
        this.reportingHref = reportingHref;
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

    public Spd withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("spdClassification")
    public EntityReference getSpdClassification() {
        return spdClassification;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("spdClassification")
    public void setSpdClassification(EntityReference spdClassification) {
        this.spdClassification = spdClassification;
    }

    public Spd withSpdClassification(EntityReference spdClassification) {
        this.spdClassification = spdClassification;
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

    public Spd withParent(EntityReference parent) {
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

    public Spd withChildren(List<EntityReference> children) {
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

    public Spd withVersion(Double version) {
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

    public Spd withUpdatedAt(Long updatedAt) {
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

    public Spd withUpdatedBy(String updatedBy) {
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

    public Spd withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Count of how many times this spd and children spds are used.
     * 
     */
    @JsonProperty("usageCount")
    public Integer getUsageCount() {
        return usageCount;
    }

    /**
     * Count of how many times this spd and children spds are used.
     * 
     */
    @JsonProperty("usageCount")
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public Spd withUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
        return this;
    }

    /**
     * If the spd is deprecated.
     * 
     */
    @JsonProperty("deprecated")
    public Boolean getDeprecated() {
        return deprecated;
    }

    /**
     * If the spd is deprecated.
     * 
     */
    @JsonProperty("deprecated")
    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public Spd withDeprecated(Boolean deprecated) {
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

    public Spd withDeleted(Boolean deleted) {
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

    public Spd withChangeDescription(ChangeDescription changeDescription) {
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

    public Spd withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * System spds can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * System spds can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Spd withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Children spds under this group are mutually exclusive. When mutually exclusive is `true` the spds from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the spds from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public Boolean getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    /**
     * Children spds under this group are mutually exclusive. When mutually exclusive is `true` the spds from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the spds from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public void setMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

    public Spd withMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Spd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("docNumber");
        sb.append('=');
        sb.append(((this.docNumber == null)?"<null>":this.docNumber));
        sb.append(',');
        sb.append("docType");
        sb.append('=');
        sb.append(((this.docType == null)?"<null>":this.docType));
        sb.append(',');
        sb.append("conclusionDate");
        sb.append('=');
        sb.append(((this.conclusionDate == null)?"<null>":this.conclusionDate));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
        sb.append(',');
        sb.append("validity");
        sb.append('=');
        sb.append(((this.validity == null)?"<null>":this.validity));
        sb.append(',');
        sb.append("prolongation");
        sb.append('=');
        sb.append(((this.prolongation == null)?"<null>":this.prolongation));
        sb.append(',');
        sb.append("domainData");
        sb.append('=');
        sb.append(((this.domainData == null)?"<null>":this.domainData));
        sb.append(',');
        sb.append("consumer");
        sb.append('=');
        sb.append(((this.consumer == null)?"<null>":this.consumer));
        sb.append(',');
        sb.append("docStatus");
        sb.append('=');
        sb.append(((this.docStatus == null)?"<null>":this.docStatus));
        sb.append(',');
        sb.append("members");
        sb.append('=');
        sb.append(((this.members == null)?"<null>":this.members));
        sb.append(',');
        sb.append("autoSystemProvider");
        sb.append('=');
        sb.append(((this.autoSystemProvider == null)?"<null>":this.autoSystemProvider));
        sb.append(',');
        sb.append("autoSystemOwnerFullName");
        sb.append('=');
        sb.append(((this.autoSystemOwnerFullName == null)?"<null>":this.autoSystemOwnerFullName));
        sb.append(',');
        sb.append("autoSystemOwnerPhone");
        sb.append('=');
        sb.append(((this.autoSystemOwnerPhone == null)?"<null>":this.autoSystemOwnerPhone));
        sb.append(',');
        sb.append("autoSystemOwnerEmail");
        sb.append('=');
        sb.append(((this.autoSystemOwnerEmail == null)?"<null>":this.autoSystemOwnerEmail));
        sb.append(',');
        sb.append("productManagerFullName");
        sb.append('=');
        sb.append(((this.productManagerFullName == null)?"<null>":this.productManagerFullName));
        sb.append(',');
        sb.append("productManagerPhone");
        sb.append('=');
        sb.append(((this.productManagerPhone == null)?"<null>":this.productManagerPhone));
        sb.append(',');
        sb.append("productManagerEmail");
        sb.append('=');
        sb.append(((this.productManagerEmail == null)?"<null>":this.productManagerEmail));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("connectionParameters");
        sb.append('=');
        sb.append(((this.connectionParameters == null)?"<null>":this.connectionParameters));
        sb.append(',');
        sb.append("connectionModes");
        sb.append('=');
        sb.append(((this.connectionModes == null)?"<null>":this.connectionModes));
        sb.append(',');
        sb.append("otherParameters");
        sb.append('=');
        sb.append(((this.otherParameters == null)?"<null>":this.otherParameters));
        sb.append(',');
        sb.append("requirements");
        sb.append('=');
        sb.append(((this.requirements == null)?"<null>":this.requirements));
        sb.append(',');
        sb.append("indicators");
        sb.append('=');
        sb.append(((this.indicators == null)?"<null>":this.indicators));
        sb.append(',');
        sb.append("reportingType");
        sb.append('=');
        sb.append(((this.reportingType == null)?"<null>":this.reportingType));
        sb.append(',');
        sb.append("reportingPeriodicity");
        sb.append('=');
        sb.append(((this.reportingPeriodicity == null)?"<null>":this.reportingPeriodicity));
        sb.append(',');
        sb.append("reportingFormationMode");
        sb.append('=');
        sb.append(((this.reportingFormationMode == null)?"<null>":this.reportingFormationMode));
        sb.append(',');
        sb.append("reportingHref");
        sb.append('=');
        sb.append(((this.reportingHref == null)?"<null>":this.reportingHref));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("spdClassification");
        sb.append('=');
        sb.append(((this.spdClassification == null)?"<null>":this.spdClassification));
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
        result = ((result* 31)+((this.productManagerFullName == null)? 0 :this.productManagerFullName.hashCode()));
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.autoSystemOwnerPhone == null)? 0 :this.autoSystemOwnerPhone.hashCode()));
        result = ((result* 31)+((this.docNumber == null)? 0 :this.docNumber.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.autoSystemOwnerEmail == null)? 0 :this.autoSystemOwnerEmail.hashCode()));
        result = ((result* 31)+((this.reportingType == null)? 0 :this.reportingType.hashCode()));
        result = ((result* 31)+((this.deprecated == null)? 0 :this.deprecated.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.autoSystemOwnerFullName == null)? 0 :this.autoSystemOwnerFullName.hashCode()));
        result = ((result* 31)+((this.prolongation == null)? 0 :this.prolongation.hashCode()));
        result = ((result* 31)+((this.autoSystemProvider == null)? 0 :this.autoSystemProvider.hashCode()));
        result = ((result* 31)+((this.spdClassification == null)? 0 :this.spdClassification.hashCode()));
        result = ((result* 31)+((this.docStatus == null)? 0 :this.docStatus.hashCode()));
        result = ((result* 31)+((this.connectionParameters == null)? 0 :this.connectionParameters.hashCode()));
        result = ((result* 31)+((this.children == null)? 0 :this.children.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.members == null)? 0 :this.members.hashCode()));
        result = ((result* 31)+((this.domainData == null)? 0 :this.domainData.hashCode()));
        result = ((result* 31)+((this.disabled == null)? 0 :this.disabled.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.consumer == null)? 0 :this.consumer.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.productManagerPhone == null)? 0 :this.productManagerPhone.hashCode()));
        result = ((result* 31)+((this.requirements == null)? 0 :this.requirements.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.docType == null)? 0 :this.docType.hashCode()));
        result = ((result* 31)+((this.conclusionDate == null)? 0 :this.conclusionDate.hashCode()));
        result = ((result* 31)+((this.productManagerEmail == null)? 0 :this.productManagerEmail.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.indicators == null)? 0 :this.indicators.hashCode()));
        result = ((result* 31)+((this.connectionModes == null)? 0 :this.connectionModes.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.otherParameters == null)? 0 :this.otherParameters.hashCode()));
        result = ((result* 31)+((this.usageCount == null)? 0 :this.usageCount.hashCode()));
        result = ((result* 31)+((this.reportingHref == null)? 0 :this.reportingHref.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.reportingFormationMode == null)? 0 :this.reportingFormationMode.hashCode()));
        result = ((result* 31)+((this.mutuallyExclusive == null)? 0 :this.mutuallyExclusive.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.validity == null)? 0 :this.validity.hashCode()));
        result = ((result* 31)+((this.reportingPeriodicity == null)? 0 :this.reportingPeriodicity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Spd) == false) {
            return false;
        }
        Spd rhs = ((Spd) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((this.productManagerFullName == rhs.productManagerFullName)||((this.productManagerFullName!= null)&&this.productManagerFullName.equals(rhs.productManagerFullName)))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.autoSystemOwnerPhone == rhs.autoSystemOwnerPhone)||((this.autoSystemOwnerPhone!= null)&&this.autoSystemOwnerPhone.equals(rhs.autoSystemOwnerPhone))))&&((this.docNumber == rhs.docNumber)||((this.docNumber!= null)&&this.docNumber.equals(rhs.docNumber))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.autoSystemOwnerEmail == rhs.autoSystemOwnerEmail)||((this.autoSystemOwnerEmail!= null)&&this.autoSystemOwnerEmail.equals(rhs.autoSystemOwnerEmail))))&&((this.reportingType == rhs.reportingType)||((this.reportingType!= null)&&this.reportingType.equals(rhs.reportingType))))&&((this.deprecated == rhs.deprecated)||((this.deprecated!= null)&&this.deprecated.equals(rhs.deprecated))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.autoSystemOwnerFullName == rhs.autoSystemOwnerFullName)||((this.autoSystemOwnerFullName!= null)&&this.autoSystemOwnerFullName.equals(rhs.autoSystemOwnerFullName))))&&((this.prolongation == rhs.prolongation)||((this.prolongation!= null)&&this.prolongation.equals(rhs.prolongation))))&&((this.autoSystemProvider == rhs.autoSystemProvider)||((this.autoSystemProvider!= null)&&this.autoSystemProvider.equals(rhs.autoSystemProvider))))&&((this.spdClassification == rhs.spdClassification)||((this.spdClassification!= null)&&this.spdClassification.equals(rhs.spdClassification))))&&((this.docStatus == rhs.docStatus)||((this.docStatus!= null)&&this.docStatus.equals(rhs.docStatus))))&&((this.connectionParameters == rhs.connectionParameters)||((this.connectionParameters!= null)&&this.connectionParameters.equals(rhs.connectionParameters))))&&((this.children == rhs.children)||((this.children!= null)&&this.children.equals(rhs.children))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.members == rhs.members)||((this.members!= null)&&this.members.equals(rhs.members))))&&((this.domainData == rhs.domainData)||((this.domainData!= null)&&this.domainData.equals(rhs.domainData))))&&((this.disabled == rhs.disabled)||((this.disabled!= null)&&this.disabled.equals(rhs.disabled))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.consumer == rhs.consumer)||((this.consumer!= null)&&this.consumer.equals(rhs.consumer))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.productManagerPhone == rhs.productManagerPhone)||((this.productManagerPhone!= null)&&this.productManagerPhone.equals(rhs.productManagerPhone))))&&((this.requirements == rhs.requirements)||((this.requirements!= null)&&this.requirements.equals(rhs.requirements))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.docType == rhs.docType)||((this.docType!= null)&&this.docType.equals(rhs.docType))))&&((this.conclusionDate == rhs.conclusionDate)||((this.conclusionDate!= null)&&this.conclusionDate.equals(rhs.conclusionDate))))&&((this.productManagerEmail == rhs.productManagerEmail)||((this.productManagerEmail!= null)&&this.productManagerEmail.equals(rhs.productManagerEmail))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.indicators == rhs.indicators)||((this.indicators!= null)&&this.indicators.equals(rhs.indicators))))&&((this.connectionModes == rhs.connectionModes)||((this.connectionModes!= null)&&this.connectionModes.equals(rhs.connectionModes))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.otherParameters == rhs.otherParameters)||((this.otherParameters!= null)&&this.otherParameters.equals(rhs.otherParameters))))&&((this.usageCount == rhs.usageCount)||((this.usageCount!= null)&&this.usageCount.equals(rhs.usageCount))))&&((this.reportingHref == rhs.reportingHref)||((this.reportingHref!= null)&&this.reportingHref.equals(rhs.reportingHref))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.reportingFormationMode == rhs.reportingFormationMode)||((this.reportingFormationMode!= null)&&this.reportingFormationMode.equals(rhs.reportingFormationMode))))&&((this.mutuallyExclusive == rhs.mutuallyExclusive)||((this.mutuallyExclusive!= null)&&this.mutuallyExclusive.equals(rhs.mutuallyExclusive))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.validity == rhs.validity)||((this.validity!= null)&&this.validity.equals(rhs.validity))))&&((this.reportingPeriodicity == rhs.reportingPeriodicity)||((this.reportingPeriodicity!= null)&&this.reportingPeriodicity.equals(rhs.reportingPeriodicity))));
    }

}
