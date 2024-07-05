
package org.openmetadata.schema.api.dlaClassification;

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
import org.openmetadata.schema.entity.type.Style;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;


/**
 * CreateDlaRequest
 * <p>
 * Create dla API request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dlaClassification",
    "parent",
    "name",
    "displayName",
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
    "associatedDlas",
    "provider",
    "mutuallyExclusive"
})
@Generated("jsonschema2pojo")
public class CreateDla implements CreateEntity
{

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("dlaClassification")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String dlaClassification;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("parent")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String parent;
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
     * auto source system
     * 
     */
    @JsonProperty("autoSourceSystem")
    @JsonPropertyDescription("auto source system")
    @Valid
    private List<String> autoSourceSystem = null;
    /**
     * auto consumer system
     * 
     */
    @JsonProperty("autoConsumerSystem")
    @JsonPropertyDescription("auto consumer system")
    @Valid
    private List<String> autoConsumerSystem = null;
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
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("incidenSigns")
    @JsonPropertyDescription("Text in Markdown format.")
    private String incidenSigns;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("additionalInformation")
    @JsonPropertyDescription("Text in Markdown format.")
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
     * Fully qualified names of dlas associated with this dla
     * 
     */
    @JsonProperty("associatedDlas")
    @JsonPropertyDescription("Fully qualified names of dlas associated with this dla")
    @Valid
    private List<String> associatedDlas = new ArrayList<String>();
    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.")
    private ProviderType provider = ProviderType.fromValue("user");
    /**
     * Children dlas under this group are mutually exclusive. When mutually exclusive is `true` the dlas from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the dlas from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    @JsonPropertyDescription("Children dlas under this group are mutually exclusive. When mutually exclusive is `true` the dlas from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the dlas from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.")
    private Boolean mutuallyExclusive = false;

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("dlaClassification")
    public String getDlaClassification() {
        return dlaClassification;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("dlaClassification")
    public void setDlaClassification(String dlaClassification) {
        this.dlaClassification = dlaClassification;
    }

    public CreateDla withDlaClassification(String dlaClassification) {
        this.dlaClassification = dlaClassification;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("parent")
    public String getParent() {
        return parent;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    public CreateDla withParent(String parent) {
        this.parent = parent;
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

    public CreateDla withName(String name) {
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

    public CreateDla withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public CreateDla withDescription(String description) {
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

    public CreateDla withDocNumber(String docNumber) {
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

    public CreateDla withDocType(String docType) {
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

    public CreateDla withConclusionDate(String conclusionDate) {
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

    public CreateDla withExpirationDate(String expirationDate) {
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

    public CreateDla withValidity(String validity) {
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

    public CreateDla withProlongation(Boolean prolongation) {
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

    public CreateDla withDomainData(String domainData) {
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

    public CreateDla withConsumer(String consumer) {
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

    public CreateDla withDocStatus(String docStatus) {
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

    public CreateDla withDataRegister(String dataRegister) {
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

    public CreateDla withOwner(EntityReference owner) {
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

    public CreateDla withDataManager(String dataManager) {
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

    public CreateDla withDataSteward(String dataSteward) {
        this.dataSteward = dataSteward;
        return this;
    }

    /**
     * auto source system
     * 
     */
    @JsonProperty("autoSourceSystem")
    public List<String> getAutoSourceSystem() {
        return autoSourceSystem;
    }

    /**
     * auto source system
     * 
     */
    @JsonProperty("autoSourceSystem")
    public void setAutoSourceSystem(List<String> autoSourceSystem) {
        this.autoSourceSystem = autoSourceSystem;
    }

    public CreateDla withAutoSourceSystem(List<String> autoSourceSystem) {
        this.autoSourceSystem = autoSourceSystem;
        return this;
    }

    /**
     * auto consumer system
     * 
     */
    @JsonProperty("autoConsumerSystem")
    public List<String> getAutoConsumerSystem() {
        return autoConsumerSystem;
    }

    /**
     * auto consumer system
     * 
     */
    @JsonProperty("autoConsumerSystem")
    public void setAutoConsumerSystem(List<String> autoConsumerSystem) {
        this.autoConsumerSystem = autoConsumerSystem;
    }

    public CreateDla withAutoConsumerSystem(List<String> autoConsumerSystem) {
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

    public CreateDla withPublicationArea(String publicationArea) {
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

    public CreateDla withCronUpdateData(String cronUpdateData) {
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

    public CreateDla withCronDataAvailability(String cronDataAvailability) {
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

    public CreateDla withCronDataActualization(String cronDataActualization) {
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

    public CreateDla withDataProvisionIndicators(List<Indicator> dataProvisionIndicators) {
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

    public CreateDla withDataQualityIndicators(List<Indicator> dataQualityIndicators) {
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

    public CreateDla withReportingType(String reportingType) {
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

    public CreateDla withReportingPeriodicity(String reportingPeriodicity) {
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

    public CreateDla withReportingReceiverRole(String reportingReceiverRole) {
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

    public CreateDla withReportingResponsible(String reportingResponsible) {
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

    public CreateDla withReportingHref(String reportingHref) {
        this.reportingHref = reportingHref;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("incidenSigns")
    public String getIncidenSigns() {
        return incidenSigns;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("incidenSigns")
    public void setIncidenSigns(String incidenSigns) {
        this.incidenSigns = incidenSigns;
    }

    public CreateDla withIncidenSigns(String incidenSigns) {
        this.incidenSigns = incidenSigns;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("additionalInformation")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("additionalInformation")
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public CreateDla withAdditionalInformation(String additionalInformation) {
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

    public CreateDla withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * Fully qualified names of dlas associated with this dla
     * 
     */
    @JsonProperty("associatedDlas")
    public List<String> getAssociatedDlas() {
        return associatedDlas;
    }

    /**
     * Fully qualified names of dlas associated with this dla
     * 
     */
    @JsonProperty("associatedDlas")
    public void setAssociatedDlas(List<String> associatedDlas) {
        this.associatedDlas = associatedDlas;
    }

    public CreateDla withAssociatedDlas(List<String> associatedDlas) {
        this.associatedDlas = associatedDlas;
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

    public CreateDla withProvider(ProviderType provider) {
        this.provider = provider;
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

    public CreateDla withMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateDla.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dlaClassification");
        sb.append('=');
        sb.append(((this.dlaClassification == null)?"<null>":this.dlaClassification));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
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
        sb.append("associatedDlas");
        sb.append('=');
        sb.append(((this.associatedDlas == null)?"<null>":this.associatedDlas));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
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
        result = ((result* 31)+((this.cronDataAvailability == null)? 0 :this.cronDataAvailability.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.dataProvisionIndicators == null)? 0 :this.dataProvisionIndicators.hashCode()));
        result = ((result* 31)+((this.reportingType == null)? 0 :this.reportingType.hashCode()));
        result = ((result* 31)+((this.reportingResponsible == null)? 0 :this.reportingResponsible.hashCode()));
        result = ((result* 31)+((this.dlaClassification == null)? 0 :this.dlaClassification.hashCode()));
        result = ((result* 31)+((this.incidenSigns == null)? 0 :this.incidenSigns.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.dataSteward == null)? 0 :this.dataSteward.hashCode()));
        result = ((result* 31)+((this.prolongation == null)? 0 :this.prolongation.hashCode()));
        result = ((result* 31)+((this.cronUpdateData == null)? 0 :this.cronUpdateData.hashCode()));
        result = ((result* 31)+((this.docStatus == null)? 0 :this.docStatus.hashCode()));
        result = ((result* 31)+((this.associatedDlas == null)? 0 :this.associatedDlas.hashCode()));
        result = ((result* 31)+((this.dataRegister == null)? 0 :this.dataRegister.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.domainData == null)? 0 :this.domainData.hashCode()));
        result = ((result* 31)+((this.dataManager == null)? 0 :this.dataManager.hashCode()));
        result = ((result* 31)+((this.consumer == null)? 0 :this.consumer.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        result = ((result* 31)+((this.reportingReceiverRole == null)? 0 :this.reportingReceiverRole.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.additionalInformation == null)? 0 :this.additionalInformation.hashCode()));
        result = ((result* 31)+((this.dataQualityIndicators == null)? 0 :this.dataQualityIndicators.hashCode()));
        result = ((result* 31)+((this.docType == null)? 0 :this.docType.hashCode()));
        result = ((result* 31)+((this.conclusionDate == null)? 0 :this.conclusionDate.hashCode()));
        result = ((result* 31)+((this.autoSourceSystem == null)? 0 :this.autoSourceSystem.hashCode()));
        result = ((result* 31)+((this.autoConsumerSystem == null)? 0 :this.autoConsumerSystem.hashCode()));
        result = ((result* 31)+((this.reportingHref == null)? 0 :this.reportingHref.hashCode()));
        result = ((result* 31)+((this.mutuallyExclusive == null)? 0 :this.mutuallyExclusive.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.validity == null)? 0 :this.validity.hashCode()));
        result = ((result* 31)+((this.publicationArea == null)? 0 :this.publicationArea.hashCode()));
        result = ((result* 31)+((this.cronDataActualization == null)? 0 :this.cronDataActualization.hashCode()));
        result = ((result* 31)+((this.reportingPeriodicity == null)? 0 :this.reportingPeriodicity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateDla) == false) {
            return false;
        }
        CreateDla rhs = ((CreateDla) other);
        return ((((((((((((((((((((((((((((((((((((((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent)))&&((this.docNumber == rhs.docNumber)||((this.docNumber!= null)&&this.docNumber.equals(rhs.docNumber))))&&((this.cronDataAvailability == rhs.cronDataAvailability)||((this.cronDataAvailability!= null)&&this.cronDataAvailability.equals(rhs.cronDataAvailability))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.dataProvisionIndicators == rhs.dataProvisionIndicators)||((this.dataProvisionIndicators!= null)&&this.dataProvisionIndicators.equals(rhs.dataProvisionIndicators))))&&((this.reportingType == rhs.reportingType)||((this.reportingType!= null)&&this.reportingType.equals(rhs.reportingType))))&&((this.reportingResponsible == rhs.reportingResponsible)||((this.reportingResponsible!= null)&&this.reportingResponsible.equals(rhs.reportingResponsible))))&&((this.dlaClassification == rhs.dlaClassification)||((this.dlaClassification!= null)&&this.dlaClassification.equals(rhs.dlaClassification))))&&((this.incidenSigns == rhs.incidenSigns)||((this.incidenSigns!= null)&&this.incidenSigns.equals(rhs.incidenSigns))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dataSteward == rhs.dataSteward)||((this.dataSteward!= null)&&this.dataSteward.equals(rhs.dataSteward))))&&((this.prolongation == rhs.prolongation)||((this.prolongation!= null)&&this.prolongation.equals(rhs.prolongation))))&&((this.cronUpdateData == rhs.cronUpdateData)||((this.cronUpdateData!= null)&&this.cronUpdateData.equals(rhs.cronUpdateData))))&&((this.docStatus == rhs.docStatus)||((this.docStatus!= null)&&this.docStatus.equals(rhs.docStatus))))&&((this.associatedDlas == rhs.associatedDlas)||((this.associatedDlas!= null)&&this.associatedDlas.equals(rhs.associatedDlas))))&&((this.dataRegister == rhs.dataRegister)||((this.dataRegister!= null)&&this.dataRegister.equals(rhs.dataRegister))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.domainData == rhs.domainData)||((this.domainData!= null)&&this.domainData.equals(rhs.domainData))))&&((this.dataManager == rhs.dataManager)||((this.dataManager!= null)&&this.dataManager.equals(rhs.dataManager))))&&((this.consumer == rhs.consumer)||((this.consumer!= null)&&this.consumer.equals(rhs.consumer))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))))&&((this.reportingReceiverRole == rhs.reportingReceiverRole)||((this.reportingReceiverRole!= null)&&this.reportingReceiverRole.equals(rhs.reportingReceiverRole))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.additionalInformation == rhs.additionalInformation)||((this.additionalInformation!= null)&&this.additionalInformation.equals(rhs.additionalInformation))))&&((this.dataQualityIndicators == rhs.dataQualityIndicators)||((this.dataQualityIndicators!= null)&&this.dataQualityIndicators.equals(rhs.dataQualityIndicators))))&&((this.docType == rhs.docType)||((this.docType!= null)&&this.docType.equals(rhs.docType))))&&((this.conclusionDate == rhs.conclusionDate)||((this.conclusionDate!= null)&&this.conclusionDate.equals(rhs.conclusionDate))))&&((this.autoSourceSystem == rhs.autoSourceSystem)||((this.autoSourceSystem!= null)&&this.autoSourceSystem.equals(rhs.autoSourceSystem))))&&((this.autoConsumerSystem == rhs.autoConsumerSystem)||((this.autoConsumerSystem!= null)&&this.autoConsumerSystem.equals(rhs.autoConsumerSystem))))&&((this.reportingHref == rhs.reportingHref)||((this.reportingHref!= null)&&this.reportingHref.equals(rhs.reportingHref))))&&((this.mutuallyExclusive == rhs.mutuallyExclusive)||((this.mutuallyExclusive!= null)&&this.mutuallyExclusive.equals(rhs.mutuallyExclusive))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.validity == rhs.validity)||((this.validity!= null)&&this.validity.equals(rhs.validity))))&&((this.publicationArea == rhs.publicationArea)||((this.publicationArea!= null)&&this.publicationArea.equals(rhs.publicationArea))))&&((this.cronDataActualization == rhs.cronDataActualization)||((this.cronDataActualization!= null)&&this.cronDataActualization.equals(rhs.cronDataActualization))))&&((this.reportingPeriodicity == rhs.reportingPeriodicity)||((this.reportingPeriodicity!= null)&&this.reportingPeriodicity.equals(rhs.reportingPeriodicity))));
    }

}
