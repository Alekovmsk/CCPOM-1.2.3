
package org.openmetadata.schema.entity.dlaClassification;

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
import org.openmetadata.schema.api.dlaClassification.Indicator;
import org.openmetadata.schema.entity.type.Style;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;


/**
 * dla
 * <p>
 * A `dla` entity is used for dla classification or categorization. It is a term defined under `dlaClassification` entity. Dlas are used to label the entities and entity fields, such as Tables, and Columns.
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
    "dataRegister",
    "owner",
    "dataManager",
    "dataSteward",
    "autoSourceSystem",
    "autoConsumerSystem",
    "publicationArea",
    "cronUpdateData",
    "cronDataAvailability",
    "cronDataActualization",
    "dataProvisionIndicators",
    "dataQualityIndicators",
    "reportingType",
    "reportingPeriodicity",
    "reportingReceiverRole",
    "reportingResponsible",
    "reportingHref",
    "incidenSigns",
    "additionalInformation",
    "style",
    "dlaClassification",
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
public class Dla implements EntityInterface
{

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Name of the dla.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the dla.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()]+$")
    @Size(min = 2, max = 64)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this dla.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this dla.")
    private String displayName;
    /**
     * Unique name of the dla of format `dlaClassification.dla1.dla2`.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("Unique name of the dla of format `dlaClassification.dla1.dla2`.")
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
     * dataRegister
     * 
     */
    @JsonProperty("dataRegister")
    @JsonPropertyDescription("dataRegister")
    private String dataRegister;
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
     * data manager
     * 
     */
    @JsonProperty("dataManager")
    @JsonPropertyDescription("data manager")
    private String dataManager;
    /**
     * data steward
     * 
     */
    @JsonProperty("dataSteward")
    @JsonPropertyDescription("data steward")
    private String dataSteward;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("autoSourceSystem")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> autoSourceSystem = null;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("autoConsumerSystem")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> autoConsumerSystem = null;
    /**
     * Publication area
     * 
     */
    @JsonProperty("publicationArea")
    @JsonPropertyDescription("Publication area")
    private String publicationArea;
    /**
     * Update data frequency
     * 
     */
    @JsonProperty("cronUpdateData")
    @JsonPropertyDescription("Update data frequency")
    private String cronUpdateData;
    /**
     * Availability data period
     * 
     */
    @JsonProperty("cronDataAvailability")
    @JsonPropertyDescription("Availability data period")
    private String cronDataAvailability;
    /**
     * Actualization data frequency
     * 
     */
    @JsonProperty("cronDataActualization")
    @JsonPropertyDescription("Actualization data frequency")
    private String cronDataActualization;
    /**
     * Data Provision Indicators
     * 
     */
    @JsonProperty("dataProvisionIndicators")
    @JsonPropertyDescription("Data Provision Indicators")
    @Valid
    private List<Indicator> dataProvisionIndicators = new ArrayList<Indicator>();
    /**
     * Data Quality Indicators
     * 
     */
    @JsonProperty("dataQualityIndicators")
    @JsonPropertyDescription("Data Quality Indicators")
    @Valid
    private List<Indicator> dataQualityIndicators = new ArrayList<Indicator>();
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
     * Reporting Receiver Role
     * 
     */
    @JsonProperty("reportingReceiverRole")
    @JsonPropertyDescription("Reporting Receiver Role")
    private String reportingReceiverRole;
    /**
     * Reporting Person responsible for formation
     * 
     */
    @JsonProperty("reportingResponsible")
    @JsonPropertyDescription("Reporting Person responsible for formation")
    private String reportingResponsible;
    /**
     * Reporting link
     * 
     */
    @JsonProperty("reportingHref")
    @JsonPropertyDescription("Reporting link")
    private String reportingHref;
    /**
     * Signs of a mass/significant incident (optional)
     * 
     */
    @JsonProperty("incidenSigns")
    @JsonPropertyDescription("Signs of a mass/significant incident (optional)")
    private String incidenSigns;
    /**
     * Additional information (optional)
     * 
     */
    @JsonProperty("additionalInformation")
    @JsonPropertyDescription("Additional information (optional)")
    private String additionalInformation;
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
    @JsonProperty("dlaClassification")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference dlaClassification;
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
     * Count of how many times this dla and children dlas are used.
     * 
     */
    @JsonProperty("usageCount")
    @JsonPropertyDescription("Count of how many times this dla and children dlas are used.")
    private Integer usageCount;
    /**
     * If the dla is deprecated.
     * 
     */
    @JsonProperty("deprecated")
    @JsonPropertyDescription("If the dla is deprecated.")
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
     * System dlas can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    @JsonPropertyDescription("System dlas can't be deleted. Use this flag to disable them.")
    private Boolean disabled;
    /**
     * Children dlas under this group are mutually exclusive. When mutually exclusive is `true` the dlas from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the dlas from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    @JsonPropertyDescription("Children dlas under this group are mutually exclusive. When mutually exclusive is `true` the dlas from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the dlas from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.")
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

    public Dla withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Name of the dla.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the dla.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Dla withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this dla.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this dla.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Dla withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Unique name of the dla of format `dlaClassification.dla1.dla2`.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * Unique name of the dla of format `dlaClassification.dla1.dla2`.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public Dla withFullyQualifiedName(String fullyQualifiedName) {
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

    public Dla withDescription(String description) {
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

    public Dla withDocNumber(String docNumber) {
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

    public Dla withDocType(String docType) {
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

    public Dla withConclusionDate(String conclusionDate) {
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

    public Dla withExpirationDate(String expirationDate) {
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

    public Dla withValidity(String validity) {
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

    public Dla withProlongation(Boolean prolongation) {
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

    public Dla withDomainData(String domainData) {
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

    public Dla withConsumer(String consumer) {
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

    public Dla withDocStatus(String docStatus) {
        this.docStatus = docStatus;
        return this;
    }

    /**
     * dataRegister
     * 
     */
    @JsonProperty("dataRegister")
    public String getDataRegister() {
        return dataRegister;
    }

    /**
     * dataRegister
     * 
     */
    @JsonProperty("dataRegister")
    public void setDataRegister(String dataRegister) {
        this.dataRegister = dataRegister;
    }

    public Dla withDataRegister(String dataRegister) {
        this.dataRegister = dataRegister;
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

    public Dla withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * data manager
     * 
     */
    @JsonProperty("dataManager")
    public String getDataManager() {
        return dataManager;
    }

    /**
     * data manager
     * 
     */
    @JsonProperty("dataManager")
    public void setDataManager(String dataManager) {
        this.dataManager = dataManager;
    }

    public Dla withDataManager(String dataManager) {
        this.dataManager = dataManager;
        return this;
    }

    /**
     * data steward
     * 
     */
    @JsonProperty("dataSteward")
    public String getDataSteward() {
        return dataSteward;
    }

    /**
     * data steward
     * 
     */
    @JsonProperty("dataSteward")
    public void setDataSteward(String dataSteward) {
        this.dataSteward = dataSteward;
    }

    public Dla withDataSteward(String dataSteward) {
        this.dataSteward = dataSteward;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("autoSourceSystem")
    public List<EntityReference> getAutoSourceSystem() {
        return autoSourceSystem;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("autoSourceSystem")
    public void setAutoSourceSystem(List<EntityReference> autoSourceSystem) {
        this.autoSourceSystem = autoSourceSystem;
    }

    public Dla withAutoSourceSystem(List<EntityReference> autoSourceSystem) {
        this.autoSourceSystem = autoSourceSystem;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("autoConsumerSystem")
    public List<EntityReference> getAutoConsumerSystem() {
        return autoConsumerSystem;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("autoConsumerSystem")
    public void setAutoConsumerSystem(List<EntityReference> autoConsumerSystem) {
        this.autoConsumerSystem = autoConsumerSystem;
    }

    public Dla withAutoConsumerSystem(List<EntityReference> autoConsumerSystem) {
        this.autoConsumerSystem = autoConsumerSystem;
        return this;
    }

    /**
     * Publication area
     * 
     */
    @JsonProperty("publicationArea")
    public String getPublicationArea() {
        return publicationArea;
    }

    /**
     * Publication area
     * 
     */
    @JsonProperty("publicationArea")
    public void setPublicationArea(String publicationArea) {
        this.publicationArea = publicationArea;
    }

    public Dla withPublicationArea(String publicationArea) {
        this.publicationArea = publicationArea;
        return this;
    }

    /**
     * Update data frequency
     * 
     */
    @JsonProperty("cronUpdateData")
    public String getCronUpdateData() {
        return cronUpdateData;
    }

    /**
     * Update data frequency
     * 
     */
    @JsonProperty("cronUpdateData")
    public void setCronUpdateData(String cronUpdateData) {
        this.cronUpdateData = cronUpdateData;
    }

    public Dla withCronUpdateData(String cronUpdateData) {
        this.cronUpdateData = cronUpdateData;
        return this;
    }

    /**
     * Availability data period
     * 
     */
    @JsonProperty("cronDataAvailability")
    public String getCronDataAvailability() {
        return cronDataAvailability;
    }

    /**
     * Availability data period
     * 
     */
    @JsonProperty("cronDataAvailability")
    public void setCronDataAvailability(String cronDataAvailability) {
        this.cronDataAvailability = cronDataAvailability;
    }

    public Dla withCronDataAvailability(String cronDataAvailability) {
        this.cronDataAvailability = cronDataAvailability;
        return this;
    }

    /**
     * Actualization data frequency
     * 
     */
    @JsonProperty("cronDataActualization")
    public String getCronDataActualization() {
        return cronDataActualization;
    }

    /**
     * Actualization data frequency
     * 
     */
    @JsonProperty("cronDataActualization")
    public void setCronDataActualization(String cronDataActualization) {
        this.cronDataActualization = cronDataActualization;
    }

    public Dla withCronDataActualization(String cronDataActualization) {
        this.cronDataActualization = cronDataActualization;
        return this;
    }

    /**
     * Data Provision Indicators
     * 
     */
    @JsonProperty("dataProvisionIndicators")
    public List<Indicator> getDataProvisionIndicators() {
        return dataProvisionIndicators;
    }

    /**
     * Data Provision Indicators
     * 
     */
    @JsonProperty("dataProvisionIndicators")
    public void setDataProvisionIndicators(List<Indicator> dataProvisionIndicators) {
        this.dataProvisionIndicators = dataProvisionIndicators;
    }

    public Dla withDataProvisionIndicators(List<Indicator> dataProvisionIndicators) {
        this.dataProvisionIndicators = dataProvisionIndicators;
        return this;
    }

    /**
     * Data Quality Indicators
     * 
     */
    @JsonProperty("dataQualityIndicators")
    public List<Indicator> getDataQualityIndicators() {
        return dataQualityIndicators;
    }

    /**
     * Data Quality Indicators
     * 
     */
    @JsonProperty("dataQualityIndicators")
    public void setDataQualityIndicators(List<Indicator> dataQualityIndicators) {
        this.dataQualityIndicators = dataQualityIndicators;
    }

    public Dla withDataQualityIndicators(List<Indicator> dataQualityIndicators) {
        this.dataQualityIndicators = dataQualityIndicators;
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

    public Dla withReportingType(String reportingType) {
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

    public Dla withReportingPeriodicity(String reportingPeriodicity) {
        this.reportingPeriodicity = reportingPeriodicity;
        return this;
    }

    /**
     * Reporting Receiver Role
     * 
     */
    @JsonProperty("reportingReceiverRole")
    public String getReportingReceiverRole() {
        return reportingReceiverRole;
    }

    /**
     * Reporting Receiver Role
     * 
     */
    @JsonProperty("reportingReceiverRole")
    public void setReportingReceiverRole(String reportingReceiverRole) {
        this.reportingReceiverRole = reportingReceiverRole;
    }

    public Dla withReportingReceiverRole(String reportingReceiverRole) {
        this.reportingReceiverRole = reportingReceiverRole;
        return this;
    }

    /**
     * Reporting Person responsible for formation
     * 
     */
    @JsonProperty("reportingResponsible")
    public String getReportingResponsible() {
        return reportingResponsible;
    }

    /**
     * Reporting Person responsible for formation
     * 
     */
    @JsonProperty("reportingResponsible")
    public void setReportingResponsible(String reportingResponsible) {
        this.reportingResponsible = reportingResponsible;
    }

    public Dla withReportingResponsible(String reportingResponsible) {
        this.reportingResponsible = reportingResponsible;
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

    public Dla withReportingHref(String reportingHref) {
        this.reportingHref = reportingHref;
        return this;
    }

    /**
     * Signs of a mass/significant incident (optional)
     * 
     */
    @JsonProperty("incidenSigns")
    public String getIncidenSigns() {
        return incidenSigns;
    }

    /**
     * Signs of a mass/significant incident (optional)
     * 
     */
    @JsonProperty("incidenSigns")
    public void setIncidenSigns(String incidenSigns) {
        this.incidenSigns = incidenSigns;
    }

    public Dla withIncidenSigns(String incidenSigns) {
        this.incidenSigns = incidenSigns;
        return this;
    }

    /**
     * Additional information (optional)
     * 
     */
    @JsonProperty("additionalInformation")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Additional information (optional)
     * 
     */
    @JsonProperty("additionalInformation")
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public Dla withAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
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

    public Dla withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("dlaClassification")
    public EntityReference getDlaClassification() {
        return dlaClassification;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("dlaClassification")
    public void setDlaClassification(EntityReference dlaClassification) {
        this.dlaClassification = dlaClassification;
    }

    public Dla withDlaClassification(EntityReference dlaClassification) {
        this.dlaClassification = dlaClassification;
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

    public Dla withParent(EntityReference parent) {
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

    public Dla withChildren(List<EntityReference> children) {
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

    public Dla withVersion(Double version) {
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

    public Dla withUpdatedAt(Long updatedAt) {
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

    public Dla withUpdatedBy(String updatedBy) {
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

    public Dla withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Count of how many times this dla and children dlas are used.
     * 
     */
    @JsonProperty("usageCount")
    public Integer getUsageCount() {
        return usageCount;
    }

    /**
     * Count of how many times this dla and children dlas are used.
     * 
     */
    @JsonProperty("usageCount")
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public Dla withUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
        return this;
    }

    /**
     * If the dla is deprecated.
     * 
     */
    @JsonProperty("deprecated")
    public Boolean getDeprecated() {
        return deprecated;
    }

    /**
     * If the dla is deprecated.
     * 
     */
    @JsonProperty("deprecated")
    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public Dla withDeprecated(Boolean deprecated) {
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

    public Dla withDeleted(Boolean deleted) {
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

    public Dla withChangeDescription(ChangeDescription changeDescription) {
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

    public Dla withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * System dlas can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * System dlas can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Dla withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Children dlas under this group are mutually exclusive. When mutually exclusive is `true` the dlas from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the dlas from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public Boolean getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    /**
     * Children dlas under this group are mutually exclusive. When mutually exclusive is `true` the dlas from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the dlas from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public void setMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

    public Dla withMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dla.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("dataRegister");
        sb.append('=');
        sb.append(((this.dataRegister == null)?"<null>":this.dataRegister));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("dataManager");
        sb.append('=');
        sb.append(((this.dataManager == null)?"<null>":this.dataManager));
        sb.append(',');
        sb.append("dataSteward");
        sb.append('=');
        sb.append(((this.dataSteward == null)?"<null>":this.dataSteward));
        sb.append(',');
        sb.append("autoSourceSystem");
        sb.append('=');
        sb.append(((this.autoSourceSystem == null)?"<null>":this.autoSourceSystem));
        sb.append(',');
        sb.append("autoConsumerSystem");
        sb.append('=');
        sb.append(((this.autoConsumerSystem == null)?"<null>":this.autoConsumerSystem));
        sb.append(',');
        sb.append("publicationArea");
        sb.append('=');
        sb.append(((this.publicationArea == null)?"<null>":this.publicationArea));
        sb.append(',');
        sb.append("cronUpdateData");
        sb.append('=');
        sb.append(((this.cronUpdateData == null)?"<null>":this.cronUpdateData));
        sb.append(',');
        sb.append("cronDataAvailability");
        sb.append('=');
        sb.append(((this.cronDataAvailability == null)?"<null>":this.cronDataAvailability));
        sb.append(',');
        sb.append("cronDataActualization");
        sb.append('=');
        sb.append(((this.cronDataActualization == null)?"<null>":this.cronDataActualization));
        sb.append(',');
        sb.append("dataProvisionIndicators");
        sb.append('=');
        sb.append(((this.dataProvisionIndicators == null)?"<null>":this.dataProvisionIndicators));
        sb.append(',');
        sb.append("dataQualityIndicators");
        sb.append('=');
        sb.append(((this.dataQualityIndicators == null)?"<null>":this.dataQualityIndicators));
        sb.append(',');
        sb.append("reportingType");
        sb.append('=');
        sb.append(((this.reportingType == null)?"<null>":this.reportingType));
        sb.append(',');
        sb.append("reportingPeriodicity");
        sb.append('=');
        sb.append(((this.reportingPeriodicity == null)?"<null>":this.reportingPeriodicity));
        sb.append(',');
        sb.append("reportingReceiverRole");
        sb.append('=');
        sb.append(((this.reportingReceiverRole == null)?"<null>":this.reportingReceiverRole));
        sb.append(',');
        sb.append("reportingResponsible");
        sb.append('=');
        sb.append(((this.reportingResponsible == null)?"<null>":this.reportingResponsible));
        sb.append(',');
        sb.append("reportingHref");
        sb.append('=');
        sb.append(((this.reportingHref == null)?"<null>":this.reportingHref));
        sb.append(',');
        sb.append("incidenSigns");
        sb.append('=');
        sb.append(((this.incidenSigns == null)?"<null>":this.incidenSigns));
        sb.append(',');
        sb.append("additionalInformation");
        sb.append('=');
        sb.append(((this.additionalInformation == null)?"<null>":this.additionalInformation));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("dlaClassification");
        sb.append('=');
        sb.append(((this.dlaClassification == null)?"<null>":this.dlaClassification));
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
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.docNumber == null)? 0 :this.docNumber.hashCode()));
        result = ((result* 31)+((this.reportingResponsible == null)? 0 :this.reportingResponsible.hashCode()));
        result = ((result* 31)+((this.dlaClassification == null)? 0 :this.dlaClassification.hashCode()));
        result = ((result* 31)+((this.deprecated == null)? 0 :this.deprecated.hashCode()));
        result = ((result* 31)+((this.dataRegister == null)? 0 :this.dataRegister.hashCode()));
        result = ((result* 31)+((this.children == null)? 0 :this.children.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.reportingReceiverRole == null)? 0 :this.reportingReceiverRole.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.additionalInformation == null)? 0 :this.additionalInformation.hashCode()));
        result = ((result* 31)+((this.dataQualityIndicators == null)? 0 :this.dataQualityIndicators.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.conclusionDate == null)? 0 :this.conclusionDate.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.reportingHref == null)? 0 :this.reportingHref.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.reportingPeriodicity == null)? 0 :this.reportingPeriodicity.hashCode()));
        result = ((result* 31)+((this.cronDataAvailability == null)? 0 :this.cronDataAvailability.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.dataProvisionIndicators == null)? 0 :this.dataProvisionIndicators.hashCode()));
        result = ((result* 31)+((this.reportingType == null)? 0 :this.reportingType.hashCode()));
        result = ((result* 31)+((this.incidenSigns == null)? 0 :this.incidenSigns.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.dataSteward == null)? 0 :this.dataSteward.hashCode()));
        result = ((result* 31)+((this.prolongation == null)? 0 :this.prolongation.hashCode()));
        result = ((result* 31)+((this.cronUpdateData == null)? 0 :this.cronUpdateData.hashCode()));
        result = ((result* 31)+((this.docStatus == null)? 0 :this.docStatus.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.domainData == null)? 0 :this.domainData.hashCode()));
        result = ((result* 31)+((this.disabled == null)? 0 :this.disabled.hashCode()));
        result = ((result* 31)+((this.dataManager == null)? 0 :this.dataManager.hashCode()));
        result = ((result* 31)+((this.consumer == null)? 0 :this.consumer.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.docType == null)? 0 :this.docType.hashCode()));
        result = ((result* 31)+((this.autoSourceSystem == null)? 0 :this.autoSourceSystem.hashCode()));
        result = ((result* 31)+((this.usageCount == null)? 0 :this.usageCount.hashCode()));
        result = ((result* 31)+((this.autoConsumerSystem == null)? 0 :this.autoConsumerSystem.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.mutuallyExclusive == null)? 0 :this.mutuallyExclusive.hashCode()));
        result = ((result* 31)+((this.validity == null)? 0 :this.validity.hashCode()));
        result = ((result* 31)+((this.publicationArea == null)? 0 :this.publicationArea.hashCode()));
        result = ((result* 31)+((this.cronDataActualization == null)? 0 :this.cronDataActualization.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dla) == false) {
            return false;
        }
        Dla rhs = ((Dla) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent)))&&((this.docNumber == rhs.docNumber)||((this.docNumber!= null)&&this.docNumber.equals(rhs.docNumber))))&&((this.reportingResponsible == rhs.reportingResponsible)||((this.reportingResponsible!= null)&&this.reportingResponsible.equals(rhs.reportingResponsible))))&&((this.dlaClassification == rhs.dlaClassification)||((this.dlaClassification!= null)&&this.dlaClassification.equals(rhs.dlaClassification))))&&((this.deprecated == rhs.deprecated)||((this.deprecated!= null)&&this.deprecated.equals(rhs.deprecated))))&&((this.dataRegister == rhs.dataRegister)||((this.dataRegister!= null)&&this.dataRegister.equals(rhs.dataRegister))))&&((this.children == rhs.children)||((this.children!= null)&&this.children.equals(rhs.children))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.reportingReceiverRole == rhs.reportingReceiverRole)||((this.reportingReceiverRole!= null)&&this.reportingReceiverRole.equals(rhs.reportingReceiverRole))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.additionalInformation == rhs.additionalInformation)||((this.additionalInformation!= null)&&this.additionalInformation.equals(rhs.additionalInformation))))&&((this.dataQualityIndicators == rhs.dataQualityIndicators)||((this.dataQualityIndicators!= null)&&this.dataQualityIndicators.equals(rhs.dataQualityIndicators))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.conclusionDate == rhs.conclusionDate)||((this.conclusionDate!= null)&&this.conclusionDate.equals(rhs.conclusionDate))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.reportingHref == rhs.reportingHref)||((this.reportingHref!= null)&&this.reportingHref.equals(rhs.reportingHref))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.reportingPeriodicity == rhs.reportingPeriodicity)||((this.reportingPeriodicity!= null)&&this.reportingPeriodicity.equals(rhs.reportingPeriodicity))))&&((this.cronDataAvailability == rhs.cronDataAvailability)||((this.cronDataAvailability!= null)&&this.cronDataAvailability.equals(rhs.cronDataAvailability))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.dataProvisionIndicators == rhs.dataProvisionIndicators)||((this.dataProvisionIndicators!= null)&&this.dataProvisionIndicators.equals(rhs.dataProvisionIndicators))))&&((this.reportingType == rhs.reportingType)||((this.reportingType!= null)&&this.reportingType.equals(rhs.reportingType))))&&((this.incidenSigns == rhs.incidenSigns)||((this.incidenSigns!= null)&&this.incidenSigns.equals(rhs.incidenSigns))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dataSteward == rhs.dataSteward)||((this.dataSteward!= null)&&this.dataSteward.equals(rhs.dataSteward))))&&((this.prolongation == rhs.prolongation)||((this.prolongation!= null)&&this.prolongation.equals(rhs.prolongation))))&&((this.cronUpdateData == rhs.cronUpdateData)||((this.cronUpdateData!= null)&&this.cronUpdateData.equals(rhs.cronUpdateData))))&&((this.docStatus == rhs.docStatus)||((this.docStatus!= null)&&this.docStatus.equals(rhs.docStatus))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.domainData == rhs.domainData)||((this.domainData!= null)&&this.domainData.equals(rhs.domainData))))&&((this.disabled == rhs.disabled)||((this.disabled!= null)&&this.disabled.equals(rhs.disabled))))&&((this.dataManager == rhs.dataManager)||((this.dataManager!= null)&&this.dataManager.equals(rhs.dataManager))))&&((this.consumer == rhs.consumer)||((this.consumer!= null)&&this.consumer.equals(rhs.consumer))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.docType == rhs.docType)||((this.docType!= null)&&this.docType.equals(rhs.docType))))&&((this.autoSourceSystem == rhs.autoSourceSystem)||((this.autoSourceSystem!= null)&&this.autoSourceSystem.equals(rhs.autoSourceSystem))))&&((this.usageCount == rhs.usageCount)||((this.usageCount!= null)&&this.usageCount.equals(rhs.usageCount))))&&((this.autoConsumerSystem == rhs.autoConsumerSystem)||((this.autoConsumerSystem!= null)&&this.autoConsumerSystem.equals(rhs.autoConsumerSystem))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.mutuallyExclusive == rhs.mutuallyExclusive)||((this.mutuallyExclusive!= null)&&this.mutuallyExclusive.equals(rhs.mutuallyExclusive))))&&((this.validity == rhs.validity)||((this.validity!= null)&&this.validity.equals(rhs.validity))))&&((this.publicationArea == rhs.publicationArea)||((this.publicationArea!= null)&&this.publicationArea.equals(rhs.publicationArea))))&&((this.cronDataActualization == rhs.cronDataActualization)||((this.cronDataActualization!= null)&&this.cronDataActualization.equals(rhs.cronDataActualization))));
    }

}
