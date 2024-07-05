
package org.openmetadata.schema.entity.autoSystemClassification;

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
 * autoSystem
 * <p>
 * A `autoSystem` entity is used for autoSystem classification or categorization. It is a term defined under `autoSystemClassification` entity. AutoSystems are used to label the entities and entity fields, such as Tables, and Columns.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "displayName",
    "fullyQualifiedName",
    "description",
    "mainFunctionsAndPurpose",
    "numberInList",
    "fullNameOwner",
    "ordApointmentOwner",
    "shortName",
    "softwareVersion",
    "ownDevelopmentOrPurchasedSoftware",
    "developerInformation",
    "responsibleEmployees",
    "workingHours",
    "regulatoryEvents",
    "supportContractor",
    "supportMode",
    "startSupportDate",
    "endSupportDate",
    "supplier",
    "productManager",
    "productManagerPosition",
    "deputyProductManager",
    "trialStartDate",
    "trialEndDate",
    "modificationsInfo",
    "industrialStartDate",
    "industrialEndDate",
    "responsibleUsers",
    "installationKit",
    "serverEquipmentNameIp",
    "serverSoftware",
    "softwareAndHardwareComposition",
    "db",
    "dbVersion",
    "clientPartEquioment",
    "workplaceTypeAndSoftwareEnvVersion",
    "lisOfOtherSystemConnections",
    "degreeOfConfidentiality",
    "criticalityClass",
    "department",
    "accompaniedByItBlock",
    "electronicCopyDoc",
    "projectConnection",
    "note",
    "color",
    "asType",
    "operationType",
    "basisForDevelopmentAndInputIntoPe",
    "mc",
    "thresholdTimeOfMinorFailure",
    "criticalDayTime",
    "roleModel",
    "linkToUserList",
    "itRecoveryCoordinator",
    "administratorsInfo",
    "planningManager",
    "registrationCertificate",
    "businessRecoveryCoordinator",
    "orderForDecommissioning",
    "administrators",
    "registerLinkRfiInJiradev",
    "devStrategicProspects",
    "architect",
    "devHead",
    "testingManager",
    "softwareRightsLevel",
    "approvedSourcingModel",
    "durationSourcingModel",
    "keyCompetencies",
    "allowedProportions",
    "usingInternetSign",
    "reportInformation0409070",
    "supportHead",
    "outsideRussianFederationAccess",
    "mnemonicCode",
    "signPd",
    "confluenceSpaceLink",
    "ispdn",
    "availabilityOfSpecialOrBiometricPd",
    "decommissioningDate",
    "main",
    "archiveDate",
    "finalProductAllocation",
    "itCommunicationItSla",
    "rto",
    "rpo",
    "membershipInComplianceCircuits",
    "dataAvailabilityonSpecialServiceClients",
    "creationProjectCode",
    "author",
    "addRecordIp",
    "addRecordDate",
    "addRecordTime",
    "userOfLastPostEdit",
    "ipOfLastPostEdit",
    "recordLastEditDate",
    "recordLastEditTime",
    "recordAcceptanceUser",
    "recordAcceptanceIp",
    "acceptanceRecordDate",
    "acceptanceRecordTime",
    "style",
    "autoSystemClassification",
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
public class AutoSystem implements EntityInterface
{

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Name of the autoSystem.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the autoSystem.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()]+$")
    @Size(min = 2, max = 64)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this autoSystem.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this autoSystem.")
    private String displayName;
    /**
     * Unique name of the autoSystem of format `autoSystemClassification.autoSystem1.autoSystem2`.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("Unique name of the autoSystem of format `autoSystemClassification.autoSystem1.autoSystem2`.")
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
     * main functions and purpose
     * 
     */
    @JsonProperty("mainFunctionsAndPurpose")
    @JsonPropertyDescription("main functions and purpose")
    private String mainFunctionsAndPurpose;
    /**
     * main functions and purpose
     * 
     */
    @JsonProperty("numberInList")
    @JsonPropertyDescription("main functions and purpose")
    private String numberInList;
    /**
     * fullNameOwner
     * 
     */
    @JsonProperty("fullNameOwner")
    @JsonPropertyDescription("fullNameOwner")
    private String fullNameOwner;
    /**
     * ORDApointmentOwner
     * 
     */
    @JsonProperty("ordApointmentOwner")
    @JsonPropertyDescription("ORDApointmentOwner")
    private String ordApointmentOwner;
    /**
     * shortName
     * 
     */
    @JsonProperty("shortName")
    @JsonPropertyDescription("shortName")
    private String shortName;
    /**
     * softwareVersion
     * 
     */
    @JsonProperty("softwareVersion")
    @JsonPropertyDescription("softwareVersion")
    private String softwareVersion;
    /**
     * OwnDevelopmentOrPurchasedSoftware
     * 
     */
    @JsonProperty("ownDevelopmentOrPurchasedSoftware")
    @JsonPropertyDescription("OwnDevelopmentOrPurchasedSoftware")
    private String ownDevelopmentOrPurchasedSoftware;
    /**
     * DeveloperInformation
     * 
     */
    @JsonProperty("developerInformation")
    @JsonPropertyDescription("DeveloperInformation")
    private String developerInformation;
    /**
     * ResponsibleEmployees
     * 
     */
    @JsonProperty("responsibleEmployees")
    @JsonPropertyDescription("ResponsibleEmployees")
    private String responsibleEmployees;
    /**
     * workingHours
     * 
     */
    @JsonProperty("workingHours")
    @JsonPropertyDescription("workingHours")
    private String workingHours;
    /**
     * regulatoryEvents
     * 
     */
    @JsonProperty("regulatoryEvents")
    @JsonPropertyDescription("regulatoryEvents")
    private String regulatoryEvents;
    /**
     * supportContractor
     * 
     */
    @JsonProperty("supportContractor")
    @JsonPropertyDescription("supportContractor")
    private String supportContractor;
    /**
     * supportMode
     * 
     */
    @JsonProperty("supportMode")
    @JsonPropertyDescription("supportMode")
    private String supportMode;
    /**
     * startSupportDate
     * 
     */
    @JsonProperty("startSupportDate")
    @JsonPropertyDescription("startSupportDate")
    private String startSupportDate;
    /**
     * endSupportDate
     * 
     */
    @JsonProperty("endSupportDate")
    @JsonPropertyDescription("endSupportDate")
    private String endSupportDate;
    /**
     * supplier
     * 
     */
    @JsonProperty("supplier")
    @JsonPropertyDescription("supplier")
    private String supplier;
    /**
     * productManager
     * 
     */
    @JsonProperty("productManager")
    @JsonPropertyDescription("productManager")
    private String productManager;
    /**
     * productManagerPosition
     * 
     */
    @JsonProperty("productManagerPosition")
    @JsonPropertyDescription("productManagerPosition")
    private String productManagerPosition;
    /**
     * deputyProductManager
     * 
     */
    @JsonProperty("deputyProductManager")
    @JsonPropertyDescription("deputyProductManager")
    private String deputyProductManager;
    /**
     * commissioningDate
     * 
     */
    @JsonProperty("trialStartDate")
    @JsonPropertyDescription("commissioningDate")
    private String trialStartDate;
    /**
     * commissioningEndDate
     * 
     */
    @JsonProperty("trialEndDate")
    @JsonPropertyDescription("commissioningEndDate")
    private String trialEndDate;
    /**
     * modificationsInfo
     * 
     */
    @JsonProperty("modificationsInfo")
    @JsonPropertyDescription("modificationsInfo")
    private String modificationsInfo;
    /**
     * industrialStartDate
     * 
     */
    @JsonProperty("industrialStartDate")
    @JsonPropertyDescription("industrialStartDate")
    private String industrialStartDate;
    /**
     * industrialEndDate
     * 
     */
    @JsonProperty("industrialEndDate")
    @JsonPropertyDescription("industrialEndDate")
    private String industrialEndDate;
    /**
     * responsibleUsers
     * 
     */
    @JsonProperty("responsibleUsers")
    @JsonPropertyDescription("responsibleUsers")
    private String responsibleUsers;
    /**
     * installationKit
     * 
     */
    @JsonProperty("installationKit")
    @JsonPropertyDescription("installationKit")
    private String installationKit;
    /**
     * serverEquipmentNameIp
     * 
     */
    @JsonProperty("serverEquipmentNameIp")
    @JsonPropertyDescription("serverEquipmentNameIp")
    private String serverEquipmentNameIp;
    /**
     * serverSoftware
     * 
     */
    @JsonProperty("serverSoftware")
    @JsonPropertyDescription("serverSoftware")
    private String serverSoftware;
    /**
     * softwareAndHardwareComposition
     * 
     */
    @JsonProperty("softwareAndHardwareComposition")
    @JsonPropertyDescription("softwareAndHardwareComposition")
    private String softwareAndHardwareComposition;
    /**
     * dbms
     * 
     */
    @JsonProperty("db")
    @JsonPropertyDescription("dbms")
    private String db;
    /**
     * dbVersion
     * 
     */
    @JsonProperty("dbVersion")
    @JsonPropertyDescription("dbVersion")
    private String dbVersion;
    /**
     * clientPartEquioment
     * 
     */
    @JsonProperty("clientPartEquioment")
    @JsonPropertyDescription("clientPartEquioment")
    private String clientPartEquioment;
    /**
     * workplaceTypeAndSoftwareEnvVersion
     * 
     */
    @JsonProperty("workplaceTypeAndSoftwareEnvVersion")
    @JsonPropertyDescription("workplaceTypeAndSoftwareEnvVersion")
    private String workplaceTypeAndSoftwareEnvVersion;
    /**
     * lisOfOtherSystemConnections
     * 
     */
    @JsonProperty("lisOfOtherSystemConnections")
    @JsonPropertyDescription("lisOfOtherSystemConnections")
    private String lisOfOtherSystemConnections;
    /**
     * degreeOfConfidentiality
     * 
     */
    @JsonProperty("degreeOfConfidentiality")
    @JsonPropertyDescription("degreeOfConfidentiality")
    private String degreeOfConfidentiality;
    /**
     * criticalityClass
     * 
     */
    @JsonProperty("criticalityClass")
    @JsonPropertyDescription("criticalityClass")
    private String criticalityClass;
    /**
     * 
     */
    @JsonProperty("department")
    @JsonPropertyDescription("")
    private String department;
    /**
     * Accompanied by IT block
     * 
     */
    @JsonProperty("accompaniedByItBlock")
    @JsonPropertyDescription("Accompanied by IT block")
    private String accompaniedByItBlock;
    /**
     * Electronic copy of the documentation
     * 
     */
    @JsonProperty("electronicCopyDoc")
    @JsonPropertyDescription("Electronic copy of the documentation")
    private String electronicCopyDoc;
    /**
     * Project connection
     * 
     */
    @JsonProperty("projectConnection")
    @JsonPropertyDescription("Project connection")
    private String projectConnection;
    /**
     * Note
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Note")
    private String note;
    /**
     * Color
     * 
     */
    @JsonProperty("color")
    @JsonPropertyDescription("Color")
    private String color;
    /**
     * asType
     * 
     */
    @JsonProperty("asType")
    @JsonPropertyDescription("asType")
    private String asType;
    /**
     * Type of operation
     * 
     */
    @JsonProperty("operationType")
    @JsonPropertyDescription("Type of operation")
    private String operationType;
    /**
     * Basis for development, input into PE (OPE, OE)
     * 
     */
    @JsonProperty("basisForDevelopmentAndInputIntoPe")
    @JsonPropertyDescription("Basis for development, input into PE (OPE, OE)")
    private String basisForDevelopmentAndInputIntoPe;
    /**
     * MC
     * 
     */
    @JsonProperty("mc")
    @JsonPropertyDescription("MC")
    private String mc;
    /**
     * Threshold time of minor failure (T)*, minutes
     * 
     */
    @JsonProperty("thresholdTimeOfMinorFailure")
    @JsonPropertyDescription("Threshold time of minor failure (T)*, minutes")
    private String thresholdTimeOfMinorFailure;
    /**
     * Critical time of day (MSC)**
     * 
     */
    @JsonProperty("criticalDayTime")
    @JsonPropertyDescription("Critical time of day (MSC)**")
    private String criticalDayTime;
    /**
     * role model
     * 
     */
    @JsonProperty("roleModel")
    @JsonPropertyDescription("role model")
    private String roleModel;
    /**
     * Link to List of User Roles
     * 
     */
    @JsonProperty("linkToUserList")
    @JsonPropertyDescription("Link to List of User Roles")
    private String linkToUserList;
    /**
     * IT Recovery Coordinator
     * 
     */
    @JsonProperty("itRecoveryCoordinator")
    @JsonPropertyDescription("IT Recovery Coordinator")
    private String itRecoveryCoordinator;
    /**
     * Information about Administrators
     * 
     */
    @JsonProperty("administratorsInfo")
    @JsonPropertyDescription("Information about Administrators")
    private String administratorsInfo;
    /**
     * Planning Manager
     * 
     */
    @JsonProperty("planningManager")
    @JsonPropertyDescription("Planning Manager")
    private String planningManager;
    /**
     * Certificate of registration of a computer program
     * 
     */
    @JsonProperty("registrationCertificate")
    @JsonPropertyDescription("Certificate of registration of a computer program")
    private String registrationCertificate;
    /**
     * Business Recovery Coordinator
     * 
     */
    @JsonProperty("businessRecoveryCoordinator")
    @JsonPropertyDescription("Business Recovery Coordinator")
    private String businessRecoveryCoordinator;
    /**
     * Order (Act) for decommissioning of the system
     * 
     */
    @JsonProperty("orderForDecommissioning")
    @JsonPropertyDescription("Order (Act) for decommissioning of the system")
    private String orderForDecommissioning;
    /**
     * administrators
     * 
     */
    @JsonProperty("administrators")
    @JsonPropertyDescription("administrators")
    private String administrators;
    /**
     * Link to register RFI in JIRADEV
     * 
     */
    @JsonProperty("registerLinkRfiInJiradev")
    @JsonPropertyDescription("Link to register RFI in JIRADEV")
    private String registerLinkRfiInJiradev;
    /**
     * Strategic prospects for the development of AS in the Bank
     * 
     */
    @JsonProperty("devStrategicProspects")
    @JsonPropertyDescription("Strategic prospects for the development of AS in the Bank")
    private String devStrategicProspects;
    /**
     * Architect
     * 
     */
    @JsonProperty("architect")
    @JsonPropertyDescription("Architect")
    private String architect;
    /**
     * Head of Development
     * 
     */
    @JsonProperty("devHead")
    @JsonPropertyDescription("Head of Development")
    private String devHead;
    /**
     * Testing Manager
     * 
     */
    @JsonProperty("testingManager")
    @JsonPropertyDescription("Testing Manager")
    private String testingManager;
    /**
     * Software rights level
     * 
     */
    @JsonProperty("softwareRightsLevel")
    @JsonPropertyDescription("Software rights level")
    private String softwareRightsLevel;
    /**
     * Approved sourcing model
     * 
     */
    @JsonProperty("approvedSourcingModel")
    @JsonPropertyDescription("Approved sourcing model")
    private String approvedSourcingModel;
    /**
     * Duration of the sourcing model
     * 
     */
    @JsonProperty("durationSourcingModel")
    @JsonPropertyDescription("Duration of the sourcing model")
    private String durationSourcingModel;
    /**
     * Key competencies
     * 
     */
    @JsonProperty("keyCompetencies")
    @JsonPropertyDescription("Key competencies")
    private String keyCompetencies;
    /**
     * Allowed proportions
     * 
     */
    @JsonProperty("allowedProportions")
    @JsonPropertyDescription("Allowed proportions")
    private String allowedProportions;
    /**
     * Sign of using Internet technologies
     * 
     */
    @JsonProperty("usingInternetSign")
    @JsonPropertyDescription("Sign of using Internet technologies")
    private String usingInternetSign;
    /**
     * Information for report 0409070
     * 
     */
    @JsonProperty("reportInformation0409070")
    @JsonPropertyDescription("Information for report 0409070")
    private String reportInformation0409070;
    /**
     * Head of support
     * 
     */
    @JsonProperty("supportHead")
    @JsonPropertyDescription("Head of support")
    private String supportHead;
    /**
     * Access to as outside the Russian Federation
     * 
     */
    @JsonProperty("outsideRussianFederationAccess")
    @JsonPropertyDescription("Access to as outside the Russian Federation")
    private String outsideRussianFederationAccess;
    /**
     * Mnemonic code
     * 
     */
    @JsonProperty("mnemonicCode")
    @JsonPropertyDescription("Mnemonic code")
    private String mnemonicCode;
    /**
     * PD sign
     * 
     */
    @JsonProperty("signPd")
    @JsonPropertyDescription("PD sign")
    private String signPd;
    /**
     * Link to space in Confluence
     * 
     */
    @JsonProperty("confluenceSpaceLink")
    @JsonPropertyDescription("Link to space in Confluence")
    private String confluenceSpaceLink;
    /**
     * ISPDn
     * 
     */
    @JsonProperty("ispdn")
    @JsonPropertyDescription("ISPDn")
    private String ispdn;
    /**
     * Availability of special or biometric PD
     * 
     */
    @JsonProperty("availabilityOfSpecialOrBiometricPd")
    @JsonPropertyDescription("Availability of special or biometric PD")
    private String availabilityOfSpecialOrBiometricPd;
    /**
     * System decommissioning date
     * 
     */
    @JsonProperty("decommissioningDate")
    @JsonPropertyDescription("System decommissioning date")
    private String decommissioningDate;
    /**
     * main
     * 
     */
    @JsonProperty("main")
    @JsonPropertyDescription("main")
    private String main;
    /**
     * Date of the archival storage period
     * 
     */
    @JsonProperty("archiveDate")
    @JsonPropertyDescription("Date of the archival storage period")
    private String archiveDate;
    /**
     * Allocation of AS to the Final Product
     * 
     */
    @JsonProperty("finalProductAllocation")
    @JsonPropertyDescription("Allocation of AS to the Final Product")
    private String finalProductAllocation;
    /**
     * Communication with IT services in accordance with the concluded SLA
     * 
     */
    @JsonProperty("itCommunicationItSla")
    @JsonPropertyDescription("Communication with IT services in accordance with the concluded SLA")
    private String itCommunicationItSla;
    /**
     * RTO
     * 
     */
    @JsonProperty("rto")
    @JsonPropertyDescription("RTO")
    private String rto;
    /**
     * RPO
     * 
     */
    @JsonProperty("rpo")
    @JsonPropertyDescription("RPO")
    private String rpo;
    /**
     * Membership in compliance circuits
     * 
     */
    @JsonProperty("membershipInComplianceCircuits")
    @JsonPropertyDescription("Membership in compliance circuits")
    private String membershipInComplianceCircuits;
    /**
     * Availability of data on clients of special service categories
     * 
     */
    @JsonProperty("dataAvailabilityonSpecialServiceClients")
    @JsonPropertyDescription("Availability of data on clients of special service categories")
    private String dataAvailabilityonSpecialServiceClients;
    /**
     * Project code for the creation of speakers
     * 
     */
    @JsonProperty("creationProjectCode")
    @JsonPropertyDescription("Project code for the creation of speakers")
    private String creationProjectCode;
    /**
     * author
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("author")
    private String author;
    /**
     * IP address of adding record
     * 
     */
    @JsonProperty("addRecordIp")
    @JsonPropertyDescription("IP address of adding record")
    private String addRecordIp;
    /**
     * Date the record was added
     * 
     */
    @JsonProperty("addRecordDate")
    @JsonPropertyDescription("Date the record was added")
    private String addRecordDate;
    /**
     * addRecordDate
     * 
     */
    @JsonProperty("addRecordTime")
    @JsonPropertyDescription("addRecordDate")
    private String addRecordTime;
    /**
     * User of last post edit
     * 
     */
    @JsonProperty("userOfLastPostEdit")
    @JsonPropertyDescription("User of last post edit")
    private String userOfLastPostEdit;
    /**
     * IP address of the last post edit
     * 
     */
    @JsonProperty("ipOfLastPostEdit")
    @JsonPropertyDescription("IP address of the last post edit")
    private String ipOfLastPostEdit;
    /**
     * Date the record was last edited
     * 
     */
    @JsonProperty("recordLastEditDate")
    @JsonPropertyDescription("Date the record was last edited")
    private String recordLastEditDate;
    /**
     * Last edit time of entry
     * 
     */
    @JsonProperty("recordLastEditTime")
    @JsonPropertyDescription("Last edit time of entry")
    private String recordLastEditTime;
    /**
     * Record Acceptance User
     * 
     */
    @JsonProperty("recordAcceptanceUser")
    @JsonPropertyDescription("Record Acceptance User")
    private String recordAcceptanceUser;
    /**
     * IP address of record acceptance
     * 
     */
    @JsonProperty("recordAcceptanceIp")
    @JsonPropertyDescription("IP address of record acceptance")
    private String recordAcceptanceIp;
    /**
     * Record acceptance date
     * 
     */
    @JsonProperty("acceptanceRecordDate")
    @JsonPropertyDescription("Record acceptance date")
    private String acceptanceRecordDate;
    /**
     * Record acceptance time
     * 
     */
    @JsonProperty("acceptanceRecordTime")
    @JsonPropertyDescription("Record acceptance time")
    private String acceptanceRecordTime;
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
    @JsonProperty("autoSystemClassification")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference autoSystemClassification;
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
     * Count of how many times this autoSystem and children autoSystems are used.
     * 
     */
    @JsonProperty("usageCount")
    @JsonPropertyDescription("Count of how many times this autoSystem and children autoSystems are used.")
    private Integer usageCount;
    /**
     * If the autoSystem is deprecated.
     * 
     */
    @JsonProperty("deprecated")
    @JsonPropertyDescription("If the autoSystem is deprecated.")
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
     * System autoSystems can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    @JsonPropertyDescription("System autoSystems can't be deleted. Use this flag to disable them.")
    private Boolean disabled;
    /**
     * Children autoSystems under this group are mutually exclusive. When mutually exclusive is `true` the autoSystems from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the autoSystems from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    @JsonPropertyDescription("Children autoSystems under this group are mutually exclusive. When mutually exclusive is `true` the autoSystems from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the autoSystems from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.")
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

    public AutoSystem withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Name of the autoSystem.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the autoSystem.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public AutoSystem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this autoSystem.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this autoSystem.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AutoSystem withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Unique name of the autoSystem of format `autoSystemClassification.autoSystem1.autoSystem2`.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * Unique name of the autoSystem of format `autoSystemClassification.autoSystem1.autoSystem2`.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public AutoSystem withFullyQualifiedName(String fullyQualifiedName) {
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

    public AutoSystem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * main functions and purpose
     * 
     */
    @JsonProperty("mainFunctionsAndPurpose")
    public String getMainFunctionsAndPurpose() {
        return mainFunctionsAndPurpose;
    }

    /**
     * main functions and purpose
     * 
     */
    @JsonProperty("mainFunctionsAndPurpose")
    public void setMainFunctionsAndPurpose(String mainFunctionsAndPurpose) {
        this.mainFunctionsAndPurpose = mainFunctionsAndPurpose;
    }

    public AutoSystem withMainFunctionsAndPurpose(String mainFunctionsAndPurpose) {
        this.mainFunctionsAndPurpose = mainFunctionsAndPurpose;
        return this;
    }

    /**
     * main functions and purpose
     * 
     */
    @JsonProperty("numberInList")
    public String getNumberInList() {
        return numberInList;
    }

    /**
     * main functions and purpose
     * 
     */
    @JsonProperty("numberInList")
    public void setNumberInList(String numberInList) {
        this.numberInList = numberInList;
    }

    public AutoSystem withNumberInList(String numberInList) {
        this.numberInList = numberInList;
        return this;
    }

    /**
     * fullNameOwner
     * 
     */
    @JsonProperty("fullNameOwner")
    public String getFullNameOwner() {
        return fullNameOwner;
    }

    /**
     * fullNameOwner
     * 
     */
    @JsonProperty("fullNameOwner")
    public void setFullNameOwner(String fullNameOwner) {
        this.fullNameOwner = fullNameOwner;
    }

    public AutoSystem withFullNameOwner(String fullNameOwner) {
        this.fullNameOwner = fullNameOwner;
        return this;
    }

    /**
     * ORDApointmentOwner
     * 
     */
    @JsonProperty("ordApointmentOwner")
    public String getOrdApointmentOwner() {
        return ordApointmentOwner;
    }

    /**
     * ORDApointmentOwner
     * 
     */
    @JsonProperty("ordApointmentOwner")
    public void setOrdApointmentOwner(String ordApointmentOwner) {
        this.ordApointmentOwner = ordApointmentOwner;
    }

    public AutoSystem withOrdApointmentOwner(String ordApointmentOwner) {
        this.ordApointmentOwner = ordApointmentOwner;
        return this;
    }

    /**
     * shortName
     * 
     */
    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    /**
     * shortName
     * 
     */
    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public AutoSystem withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * softwareVersion
     * 
     */
    @JsonProperty("softwareVersion")
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * softwareVersion
     * 
     */
    @JsonProperty("softwareVersion")
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public AutoSystem withSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }

    /**
     * OwnDevelopmentOrPurchasedSoftware
     * 
     */
    @JsonProperty("ownDevelopmentOrPurchasedSoftware")
    public String getOwnDevelopmentOrPurchasedSoftware() {
        return ownDevelopmentOrPurchasedSoftware;
    }

    /**
     * OwnDevelopmentOrPurchasedSoftware
     * 
     */
    @JsonProperty("ownDevelopmentOrPurchasedSoftware")
    public void setOwnDevelopmentOrPurchasedSoftware(String ownDevelopmentOrPurchasedSoftware) {
        this.ownDevelopmentOrPurchasedSoftware = ownDevelopmentOrPurchasedSoftware;
    }

    public AutoSystem withOwnDevelopmentOrPurchasedSoftware(String ownDevelopmentOrPurchasedSoftware) {
        this.ownDevelopmentOrPurchasedSoftware = ownDevelopmentOrPurchasedSoftware;
        return this;
    }

    /**
     * DeveloperInformation
     * 
     */
    @JsonProperty("developerInformation")
    public String getDeveloperInformation() {
        return developerInformation;
    }

    /**
     * DeveloperInformation
     * 
     */
    @JsonProperty("developerInformation")
    public void setDeveloperInformation(String developerInformation) {
        this.developerInformation = developerInformation;
    }

    public AutoSystem withDeveloperInformation(String developerInformation) {
        this.developerInformation = developerInformation;
        return this;
    }

    /**
     * ResponsibleEmployees
     * 
     */
    @JsonProperty("responsibleEmployees")
    public String getResponsibleEmployees() {
        return responsibleEmployees;
    }

    /**
     * ResponsibleEmployees
     * 
     */
    @JsonProperty("responsibleEmployees")
    public void setResponsibleEmployees(String responsibleEmployees) {
        this.responsibleEmployees = responsibleEmployees;
    }

    public AutoSystem withResponsibleEmployees(String responsibleEmployees) {
        this.responsibleEmployees = responsibleEmployees;
        return this;
    }

    /**
     * workingHours
     * 
     */
    @JsonProperty("workingHours")
    public String getWorkingHours() {
        return workingHours;
    }

    /**
     * workingHours
     * 
     */
    @JsonProperty("workingHours")
    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public AutoSystem withWorkingHours(String workingHours) {
        this.workingHours = workingHours;
        return this;
    }

    /**
     * regulatoryEvents
     * 
     */
    @JsonProperty("regulatoryEvents")
    public String getRegulatoryEvents() {
        return regulatoryEvents;
    }

    /**
     * regulatoryEvents
     * 
     */
    @JsonProperty("regulatoryEvents")
    public void setRegulatoryEvents(String regulatoryEvents) {
        this.regulatoryEvents = regulatoryEvents;
    }

    public AutoSystem withRegulatoryEvents(String regulatoryEvents) {
        this.regulatoryEvents = regulatoryEvents;
        return this;
    }

    /**
     * supportContractor
     * 
     */
    @JsonProperty("supportContractor")
    public String getSupportContractor() {
        return supportContractor;
    }

    /**
     * supportContractor
     * 
     */
    @JsonProperty("supportContractor")
    public void setSupportContractor(String supportContractor) {
        this.supportContractor = supportContractor;
    }

    public AutoSystem withSupportContractor(String supportContractor) {
        this.supportContractor = supportContractor;
        return this;
    }

    /**
     * supportMode
     * 
     */
    @JsonProperty("supportMode")
    public String getSupportMode() {
        return supportMode;
    }

    /**
     * supportMode
     * 
     */
    @JsonProperty("supportMode")
    public void setSupportMode(String supportMode) {
        this.supportMode = supportMode;
    }

    public AutoSystem withSupportMode(String supportMode) {
        this.supportMode = supportMode;
        return this;
    }

    /**
     * startSupportDate
     * 
     */
    @JsonProperty("startSupportDate")
    public String getStartSupportDate() {
        return startSupportDate;
    }

    /**
     * startSupportDate
     * 
     */
    @JsonProperty("startSupportDate")
    public void setStartSupportDate(String startSupportDate) {
        this.startSupportDate = startSupportDate;
    }

    public AutoSystem withStartSupportDate(String startSupportDate) {
        this.startSupportDate = startSupportDate;
        return this;
    }

    /**
     * endSupportDate
     * 
     */
    @JsonProperty("endSupportDate")
    public String getEndSupportDate() {
        return endSupportDate;
    }

    /**
     * endSupportDate
     * 
     */
    @JsonProperty("endSupportDate")
    public void setEndSupportDate(String endSupportDate) {
        this.endSupportDate = endSupportDate;
    }

    public AutoSystem withEndSupportDate(String endSupportDate) {
        this.endSupportDate = endSupportDate;
        return this;
    }

    /**
     * supplier
     * 
     */
    @JsonProperty("supplier")
    public String getSupplier() {
        return supplier;
    }

    /**
     * supplier
     * 
     */
    @JsonProperty("supplier")
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public AutoSystem withSupplier(String supplier) {
        this.supplier = supplier;
        return this;
    }

    /**
     * productManager
     * 
     */
    @JsonProperty("productManager")
    public String getProductManager() {
        return productManager;
    }

    /**
     * productManager
     * 
     */
    @JsonProperty("productManager")
    public void setProductManager(String productManager) {
        this.productManager = productManager;
    }

    public AutoSystem withProductManager(String productManager) {
        this.productManager = productManager;
        return this;
    }

    /**
     * productManagerPosition
     * 
     */
    @JsonProperty("productManagerPosition")
    public String getProductManagerPosition() {
        return productManagerPosition;
    }

    /**
     * productManagerPosition
     * 
     */
    @JsonProperty("productManagerPosition")
    public void setProductManagerPosition(String productManagerPosition) {
        this.productManagerPosition = productManagerPosition;
    }

    public AutoSystem withProductManagerPosition(String productManagerPosition) {
        this.productManagerPosition = productManagerPosition;
        return this;
    }

    /**
     * deputyProductManager
     * 
     */
    @JsonProperty("deputyProductManager")
    public String getDeputyProductManager() {
        return deputyProductManager;
    }

    /**
     * deputyProductManager
     * 
     */
    @JsonProperty("deputyProductManager")
    public void setDeputyProductManager(String deputyProductManager) {
        this.deputyProductManager = deputyProductManager;
    }

    public AutoSystem withDeputyProductManager(String deputyProductManager) {
        this.deputyProductManager = deputyProductManager;
        return this;
    }

    /**
     * commissioningDate
     * 
     */
    @JsonProperty("trialStartDate")
    public String getTrialStartDate() {
        return trialStartDate;
    }

    /**
     * commissioningDate
     * 
     */
    @JsonProperty("trialStartDate")
    public void setTrialStartDate(String trialStartDate) {
        this.trialStartDate = trialStartDate;
    }

    public AutoSystem withTrialStartDate(String trialStartDate) {
        this.trialStartDate = trialStartDate;
        return this;
    }

    /**
     * commissioningEndDate
     * 
     */
    @JsonProperty("trialEndDate")
    public String getTrialEndDate() {
        return trialEndDate;
    }

    /**
     * commissioningEndDate
     * 
     */
    @JsonProperty("trialEndDate")
    public void setTrialEndDate(String trialEndDate) {
        this.trialEndDate = trialEndDate;
    }

    public AutoSystem withTrialEndDate(String trialEndDate) {
        this.trialEndDate = trialEndDate;
        return this;
    }

    /**
     * modificationsInfo
     * 
     */
    @JsonProperty("modificationsInfo")
    public String getModificationsInfo() {
        return modificationsInfo;
    }

    /**
     * modificationsInfo
     * 
     */
    @JsonProperty("modificationsInfo")
    public void setModificationsInfo(String modificationsInfo) {
        this.modificationsInfo = modificationsInfo;
    }

    public AutoSystem withModificationsInfo(String modificationsInfo) {
        this.modificationsInfo = modificationsInfo;
        return this;
    }

    /**
     * industrialStartDate
     * 
     */
    @JsonProperty("industrialStartDate")
    public String getIndustrialStartDate() {
        return industrialStartDate;
    }

    /**
     * industrialStartDate
     * 
     */
    @JsonProperty("industrialStartDate")
    public void setIndustrialStartDate(String industrialStartDate) {
        this.industrialStartDate = industrialStartDate;
    }

    public AutoSystem withIndustrialStartDate(String industrialStartDate) {
        this.industrialStartDate = industrialStartDate;
        return this;
    }

    /**
     * industrialEndDate
     * 
     */
    @JsonProperty("industrialEndDate")
    public String getIndustrialEndDate() {
        return industrialEndDate;
    }

    /**
     * industrialEndDate
     * 
     */
    @JsonProperty("industrialEndDate")
    public void setIndustrialEndDate(String industrialEndDate) {
        this.industrialEndDate = industrialEndDate;
    }

    public AutoSystem withIndustrialEndDate(String industrialEndDate) {
        this.industrialEndDate = industrialEndDate;
        return this;
    }

    /**
     * responsibleUsers
     * 
     */
    @JsonProperty("responsibleUsers")
    public String getResponsibleUsers() {
        return responsibleUsers;
    }

    /**
     * responsibleUsers
     * 
     */
    @JsonProperty("responsibleUsers")
    public void setResponsibleUsers(String responsibleUsers) {
        this.responsibleUsers = responsibleUsers;
    }

    public AutoSystem withResponsibleUsers(String responsibleUsers) {
        this.responsibleUsers = responsibleUsers;
        return this;
    }

    /**
     * installationKit
     * 
     */
    @JsonProperty("installationKit")
    public String getInstallationKit() {
        return installationKit;
    }

    /**
     * installationKit
     * 
     */
    @JsonProperty("installationKit")
    public void setInstallationKit(String installationKit) {
        this.installationKit = installationKit;
    }

    public AutoSystem withInstallationKit(String installationKit) {
        this.installationKit = installationKit;
        return this;
    }

    /**
     * serverEquipmentNameIp
     * 
     */
    @JsonProperty("serverEquipmentNameIp")
    public String getServerEquipmentNameIp() {
        return serverEquipmentNameIp;
    }

    /**
     * serverEquipmentNameIp
     * 
     */
    @JsonProperty("serverEquipmentNameIp")
    public void setServerEquipmentNameIp(String serverEquipmentNameIp) {
        this.serverEquipmentNameIp = serverEquipmentNameIp;
    }

    public AutoSystem withServerEquipmentNameIp(String serverEquipmentNameIp) {
        this.serverEquipmentNameIp = serverEquipmentNameIp;
        return this;
    }

    /**
     * serverSoftware
     * 
     */
    @JsonProperty("serverSoftware")
    public String getServerSoftware() {
        return serverSoftware;
    }

    /**
     * serverSoftware
     * 
     */
    @JsonProperty("serverSoftware")
    public void setServerSoftware(String serverSoftware) {
        this.serverSoftware = serverSoftware;
    }

    public AutoSystem withServerSoftware(String serverSoftware) {
        this.serverSoftware = serverSoftware;
        return this;
    }

    /**
     * softwareAndHardwareComposition
     * 
     */
    @JsonProperty("softwareAndHardwareComposition")
    public String getSoftwareAndHardwareComposition() {
        return softwareAndHardwareComposition;
    }

    /**
     * softwareAndHardwareComposition
     * 
     */
    @JsonProperty("softwareAndHardwareComposition")
    public void setSoftwareAndHardwareComposition(String softwareAndHardwareComposition) {
        this.softwareAndHardwareComposition = softwareAndHardwareComposition;
    }

    public AutoSystem withSoftwareAndHardwareComposition(String softwareAndHardwareComposition) {
        this.softwareAndHardwareComposition = softwareAndHardwareComposition;
        return this;
    }

    /**
     * dbms
     * 
     */
    @JsonProperty("db")
    public String getDb() {
        return db;
    }

    /**
     * dbms
     * 
     */
    @JsonProperty("db")
    public void setDb(String db) {
        this.db = db;
    }

    public AutoSystem withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * dbVersion
     * 
     */
    @JsonProperty("dbVersion")
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * dbVersion
     * 
     */
    @JsonProperty("dbVersion")
    public void setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }

    public AutoSystem withDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }

    /**
     * clientPartEquioment
     * 
     */
    @JsonProperty("clientPartEquioment")
    public String getClientPartEquioment() {
        return clientPartEquioment;
    }

    /**
     * clientPartEquioment
     * 
     */
    @JsonProperty("clientPartEquioment")
    public void setClientPartEquioment(String clientPartEquioment) {
        this.clientPartEquioment = clientPartEquioment;
    }

    public AutoSystem withClientPartEquioment(String clientPartEquioment) {
        this.clientPartEquioment = clientPartEquioment;
        return this;
    }

    /**
     * workplaceTypeAndSoftwareEnvVersion
     * 
     */
    @JsonProperty("workplaceTypeAndSoftwareEnvVersion")
    public String getWorkplaceTypeAndSoftwareEnvVersion() {
        return workplaceTypeAndSoftwareEnvVersion;
    }

    /**
     * workplaceTypeAndSoftwareEnvVersion
     * 
     */
    @JsonProperty("workplaceTypeAndSoftwareEnvVersion")
    public void setWorkplaceTypeAndSoftwareEnvVersion(String workplaceTypeAndSoftwareEnvVersion) {
        this.workplaceTypeAndSoftwareEnvVersion = workplaceTypeAndSoftwareEnvVersion;
    }

    public AutoSystem withWorkplaceTypeAndSoftwareEnvVersion(String workplaceTypeAndSoftwareEnvVersion) {
        this.workplaceTypeAndSoftwareEnvVersion = workplaceTypeAndSoftwareEnvVersion;
        return this;
    }

    /**
     * lisOfOtherSystemConnections
     * 
     */
    @JsonProperty("lisOfOtherSystemConnections")
    public String getLisOfOtherSystemConnections() {
        return lisOfOtherSystemConnections;
    }

    /**
     * lisOfOtherSystemConnections
     * 
     */
    @JsonProperty("lisOfOtherSystemConnections")
    public void setLisOfOtherSystemConnections(String lisOfOtherSystemConnections) {
        this.lisOfOtherSystemConnections = lisOfOtherSystemConnections;
    }

    public AutoSystem withLisOfOtherSystemConnections(String lisOfOtherSystemConnections) {
        this.lisOfOtherSystemConnections = lisOfOtherSystemConnections;
        return this;
    }

    /**
     * degreeOfConfidentiality
     * 
     */
    @JsonProperty("degreeOfConfidentiality")
    public String getDegreeOfConfidentiality() {
        return degreeOfConfidentiality;
    }

    /**
     * degreeOfConfidentiality
     * 
     */
    @JsonProperty("degreeOfConfidentiality")
    public void setDegreeOfConfidentiality(String degreeOfConfidentiality) {
        this.degreeOfConfidentiality = degreeOfConfidentiality;
    }

    public AutoSystem withDegreeOfConfidentiality(String degreeOfConfidentiality) {
        this.degreeOfConfidentiality = degreeOfConfidentiality;
        return this;
    }

    /**
     * criticalityClass
     * 
     */
    @JsonProperty("criticalityClass")
    public String getCriticalityClass() {
        return criticalityClass;
    }

    /**
     * criticalityClass
     * 
     */
    @JsonProperty("criticalityClass")
    public void setCriticalityClass(String criticalityClass) {
        this.criticalityClass = criticalityClass;
    }

    public AutoSystem withCriticalityClass(String criticalityClass) {
        this.criticalityClass = criticalityClass;
        return this;
    }

    /**
     * 
     */
    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    /**
     * 
     */
    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    public AutoSystem withDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Accompanied by IT block
     * 
     */
    @JsonProperty("accompaniedByItBlock")
    public String getAccompaniedByItBlock() {
        return accompaniedByItBlock;
    }

    /**
     * Accompanied by IT block
     * 
     */
    @JsonProperty("accompaniedByItBlock")
    public void setAccompaniedByItBlock(String accompaniedByItBlock) {
        this.accompaniedByItBlock = accompaniedByItBlock;
    }

    public AutoSystem withAccompaniedByItBlock(String accompaniedByItBlock) {
        this.accompaniedByItBlock = accompaniedByItBlock;
        return this;
    }

    /**
     * Electronic copy of the documentation
     * 
     */
    @JsonProperty("electronicCopyDoc")
    public String getElectronicCopyDoc() {
        return electronicCopyDoc;
    }

    /**
     * Electronic copy of the documentation
     * 
     */
    @JsonProperty("electronicCopyDoc")
    public void setElectronicCopyDoc(String electronicCopyDoc) {
        this.electronicCopyDoc = electronicCopyDoc;
    }

    public AutoSystem withElectronicCopyDoc(String electronicCopyDoc) {
        this.electronicCopyDoc = electronicCopyDoc;
        return this;
    }

    /**
     * Project connection
     * 
     */
    @JsonProperty("projectConnection")
    public String getProjectConnection() {
        return projectConnection;
    }

    /**
     * Project connection
     * 
     */
    @JsonProperty("projectConnection")
    public void setProjectConnection(String projectConnection) {
        this.projectConnection = projectConnection;
    }

    public AutoSystem withProjectConnection(String projectConnection) {
        this.projectConnection = projectConnection;
        return this;
    }

    /**
     * Note
     * 
     */
    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    /**
     * Note
     * 
     */
    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    public AutoSystem withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Color
     * 
     */
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    /**
     * Color
     * 
     */
    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    public AutoSystem withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * asType
     * 
     */
    @JsonProperty("asType")
    public String getAsType() {
        return asType;
    }

    /**
     * asType
     * 
     */
    @JsonProperty("asType")
    public void setAsType(String asType) {
        this.asType = asType;
    }

    public AutoSystem withAsType(String asType) {
        this.asType = asType;
        return this;
    }

    /**
     * Type of operation
     * 
     */
    @JsonProperty("operationType")
    public String getOperationType() {
        return operationType;
    }

    /**
     * Type of operation
     * 
     */
    @JsonProperty("operationType")
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public AutoSystem withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * Basis for development, input into PE (OPE, OE)
     * 
     */
    @JsonProperty("basisForDevelopmentAndInputIntoPe")
    public String getBasisForDevelopmentAndInputIntoPe() {
        return basisForDevelopmentAndInputIntoPe;
    }

    /**
     * Basis for development, input into PE (OPE, OE)
     * 
     */
    @JsonProperty("basisForDevelopmentAndInputIntoPe")
    public void setBasisForDevelopmentAndInputIntoPe(String basisForDevelopmentAndInputIntoPe) {
        this.basisForDevelopmentAndInputIntoPe = basisForDevelopmentAndInputIntoPe;
    }

    public AutoSystem withBasisForDevelopmentAndInputIntoPe(String basisForDevelopmentAndInputIntoPe) {
        this.basisForDevelopmentAndInputIntoPe = basisForDevelopmentAndInputIntoPe;
        return this;
    }

    /**
     * MC
     * 
     */
    @JsonProperty("mc")
    public String getMc() {
        return mc;
    }

    /**
     * MC
     * 
     */
    @JsonProperty("mc")
    public void setMc(String mc) {
        this.mc = mc;
    }

    public AutoSystem withMc(String mc) {
        this.mc = mc;
        return this;
    }

    /**
     * Threshold time of minor failure (T)*, minutes
     * 
     */
    @JsonProperty("thresholdTimeOfMinorFailure")
    public String getThresholdTimeOfMinorFailure() {
        return thresholdTimeOfMinorFailure;
    }

    /**
     * Threshold time of minor failure (T)*, minutes
     * 
     */
    @JsonProperty("thresholdTimeOfMinorFailure")
    public void setThresholdTimeOfMinorFailure(String thresholdTimeOfMinorFailure) {
        this.thresholdTimeOfMinorFailure = thresholdTimeOfMinorFailure;
    }

    public AutoSystem withThresholdTimeOfMinorFailure(String thresholdTimeOfMinorFailure) {
        this.thresholdTimeOfMinorFailure = thresholdTimeOfMinorFailure;
        return this;
    }

    /**
     * Critical time of day (MSC)**
     * 
     */
    @JsonProperty("criticalDayTime")
    public String getCriticalDayTime() {
        return criticalDayTime;
    }

    /**
     * Critical time of day (MSC)**
     * 
     */
    @JsonProperty("criticalDayTime")
    public void setCriticalDayTime(String criticalDayTime) {
        this.criticalDayTime = criticalDayTime;
    }

    public AutoSystem withCriticalDayTime(String criticalDayTime) {
        this.criticalDayTime = criticalDayTime;
        return this;
    }

    /**
     * role model
     * 
     */
    @JsonProperty("roleModel")
    public String getRoleModel() {
        return roleModel;
    }

    /**
     * role model
     * 
     */
    @JsonProperty("roleModel")
    public void setRoleModel(String roleModel) {
        this.roleModel = roleModel;
    }

    public AutoSystem withRoleModel(String roleModel) {
        this.roleModel = roleModel;
        return this;
    }

    /**
     * Link to List of User Roles
     * 
     */
    @JsonProperty("linkToUserList")
    public String getLinkToUserList() {
        return linkToUserList;
    }

    /**
     * Link to List of User Roles
     * 
     */
    @JsonProperty("linkToUserList")
    public void setLinkToUserList(String linkToUserList) {
        this.linkToUserList = linkToUserList;
    }

    public AutoSystem withLinkToUserList(String linkToUserList) {
        this.linkToUserList = linkToUserList;
        return this;
    }

    /**
     * IT Recovery Coordinator
     * 
     */
    @JsonProperty("itRecoveryCoordinator")
    public String getItRecoveryCoordinator() {
        return itRecoveryCoordinator;
    }

    /**
     * IT Recovery Coordinator
     * 
     */
    @JsonProperty("itRecoveryCoordinator")
    public void setItRecoveryCoordinator(String itRecoveryCoordinator) {
        this.itRecoveryCoordinator = itRecoveryCoordinator;
    }

    public AutoSystem withItRecoveryCoordinator(String itRecoveryCoordinator) {
        this.itRecoveryCoordinator = itRecoveryCoordinator;
        return this;
    }

    /**
     * Information about Administrators
     * 
     */
    @JsonProperty("administratorsInfo")
    public String getAdministratorsInfo() {
        return administratorsInfo;
    }

    /**
     * Information about Administrators
     * 
     */
    @JsonProperty("administratorsInfo")
    public void setAdministratorsInfo(String administratorsInfo) {
        this.administratorsInfo = administratorsInfo;
    }

    public AutoSystem withAdministratorsInfo(String administratorsInfo) {
        this.administratorsInfo = administratorsInfo;
        return this;
    }

    /**
     * Planning Manager
     * 
     */
    @JsonProperty("planningManager")
    public String getPlanningManager() {
        return planningManager;
    }

    /**
     * Planning Manager
     * 
     */
    @JsonProperty("planningManager")
    public void setPlanningManager(String planningManager) {
        this.planningManager = planningManager;
    }

    public AutoSystem withPlanningManager(String planningManager) {
        this.planningManager = planningManager;
        return this;
    }

    /**
     * Certificate of registration of a computer program
     * 
     */
    @JsonProperty("registrationCertificate")
    public String getRegistrationCertificate() {
        return registrationCertificate;
    }

    /**
     * Certificate of registration of a computer program
     * 
     */
    @JsonProperty("registrationCertificate")
    public void setRegistrationCertificate(String registrationCertificate) {
        this.registrationCertificate = registrationCertificate;
    }

    public AutoSystem withRegistrationCertificate(String registrationCertificate) {
        this.registrationCertificate = registrationCertificate;
        return this;
    }

    /**
     * Business Recovery Coordinator
     * 
     */
    @JsonProperty("businessRecoveryCoordinator")
    public String getBusinessRecoveryCoordinator() {
        return businessRecoveryCoordinator;
    }

    /**
     * Business Recovery Coordinator
     * 
     */
    @JsonProperty("businessRecoveryCoordinator")
    public void setBusinessRecoveryCoordinator(String businessRecoveryCoordinator) {
        this.businessRecoveryCoordinator = businessRecoveryCoordinator;
    }

    public AutoSystem withBusinessRecoveryCoordinator(String businessRecoveryCoordinator) {
        this.businessRecoveryCoordinator = businessRecoveryCoordinator;
        return this;
    }

    /**
     * Order (Act) for decommissioning of the system
     * 
     */
    @JsonProperty("orderForDecommissioning")
    public String getOrderForDecommissioning() {
        return orderForDecommissioning;
    }

    /**
     * Order (Act) for decommissioning of the system
     * 
     */
    @JsonProperty("orderForDecommissioning")
    public void setOrderForDecommissioning(String orderForDecommissioning) {
        this.orderForDecommissioning = orderForDecommissioning;
    }

    public AutoSystem withOrderForDecommissioning(String orderForDecommissioning) {
        this.orderForDecommissioning = orderForDecommissioning;
        return this;
    }

    /**
     * administrators
     * 
     */
    @JsonProperty("administrators")
    public String getAdministrators() {
        return administrators;
    }

    /**
     * administrators
     * 
     */
    @JsonProperty("administrators")
    public void setAdministrators(String administrators) {
        this.administrators = administrators;
    }

    public AutoSystem withAdministrators(String administrators) {
        this.administrators = administrators;
        return this;
    }

    /**
     * Link to register RFI in JIRADEV
     * 
     */
    @JsonProperty("registerLinkRfiInJiradev")
    public String getRegisterLinkRfiInJiradev() {
        return registerLinkRfiInJiradev;
    }

    /**
     * Link to register RFI in JIRADEV
     * 
     */
    @JsonProperty("registerLinkRfiInJiradev")
    public void setRegisterLinkRfiInJiradev(String registerLinkRfiInJiradev) {
        this.registerLinkRfiInJiradev = registerLinkRfiInJiradev;
    }

    public AutoSystem withRegisterLinkRfiInJiradev(String registerLinkRfiInJiradev) {
        this.registerLinkRfiInJiradev = registerLinkRfiInJiradev;
        return this;
    }

    /**
     * Strategic prospects for the development of AS in the Bank
     * 
     */
    @JsonProperty("devStrategicProspects")
    public String getDevStrategicProspects() {
        return devStrategicProspects;
    }

    /**
     * Strategic prospects for the development of AS in the Bank
     * 
     */
    @JsonProperty("devStrategicProspects")
    public void setDevStrategicProspects(String devStrategicProspects) {
        this.devStrategicProspects = devStrategicProspects;
    }

    public AutoSystem withDevStrategicProspects(String devStrategicProspects) {
        this.devStrategicProspects = devStrategicProspects;
        return this;
    }

    /**
     * Architect
     * 
     */
    @JsonProperty("architect")
    public String getArchitect() {
        return architect;
    }

    /**
     * Architect
     * 
     */
    @JsonProperty("architect")
    public void setArchitect(String architect) {
        this.architect = architect;
    }

    public AutoSystem withArchitect(String architect) {
        this.architect = architect;
        return this;
    }

    /**
     * Head of Development
     * 
     */
    @JsonProperty("devHead")
    public String getDevHead() {
        return devHead;
    }

    /**
     * Head of Development
     * 
     */
    @JsonProperty("devHead")
    public void setDevHead(String devHead) {
        this.devHead = devHead;
    }

    public AutoSystem withDevHead(String devHead) {
        this.devHead = devHead;
        return this;
    }

    /**
     * Testing Manager
     * 
     */
    @JsonProperty("testingManager")
    public String getTestingManager() {
        return testingManager;
    }

    /**
     * Testing Manager
     * 
     */
    @JsonProperty("testingManager")
    public void setTestingManager(String testingManager) {
        this.testingManager = testingManager;
    }

    public AutoSystem withTestingManager(String testingManager) {
        this.testingManager = testingManager;
        return this;
    }

    /**
     * Software rights level
     * 
     */
    @JsonProperty("softwareRightsLevel")
    public String getSoftwareRightsLevel() {
        return softwareRightsLevel;
    }

    /**
     * Software rights level
     * 
     */
    @JsonProperty("softwareRightsLevel")
    public void setSoftwareRightsLevel(String softwareRightsLevel) {
        this.softwareRightsLevel = softwareRightsLevel;
    }

    public AutoSystem withSoftwareRightsLevel(String softwareRightsLevel) {
        this.softwareRightsLevel = softwareRightsLevel;
        return this;
    }

    /**
     * Approved sourcing model
     * 
     */
    @JsonProperty("approvedSourcingModel")
    public String getApprovedSourcingModel() {
        return approvedSourcingModel;
    }

    /**
     * Approved sourcing model
     * 
     */
    @JsonProperty("approvedSourcingModel")
    public void setApprovedSourcingModel(String approvedSourcingModel) {
        this.approvedSourcingModel = approvedSourcingModel;
    }

    public AutoSystem withApprovedSourcingModel(String approvedSourcingModel) {
        this.approvedSourcingModel = approvedSourcingModel;
        return this;
    }

    /**
     * Duration of the sourcing model
     * 
     */
    @JsonProperty("durationSourcingModel")
    public String getDurationSourcingModel() {
        return durationSourcingModel;
    }

    /**
     * Duration of the sourcing model
     * 
     */
    @JsonProperty("durationSourcingModel")
    public void setDurationSourcingModel(String durationSourcingModel) {
        this.durationSourcingModel = durationSourcingModel;
    }

    public AutoSystem withDurationSourcingModel(String durationSourcingModel) {
        this.durationSourcingModel = durationSourcingModel;
        return this;
    }

    /**
     * Key competencies
     * 
     */
    @JsonProperty("keyCompetencies")
    public String getKeyCompetencies() {
        return keyCompetencies;
    }

    /**
     * Key competencies
     * 
     */
    @JsonProperty("keyCompetencies")
    public void setKeyCompetencies(String keyCompetencies) {
        this.keyCompetencies = keyCompetencies;
    }

    public AutoSystem withKeyCompetencies(String keyCompetencies) {
        this.keyCompetencies = keyCompetencies;
        return this;
    }

    /**
     * Allowed proportions
     * 
     */
    @JsonProperty("allowedProportions")
    public String getAllowedProportions() {
        return allowedProportions;
    }

    /**
     * Allowed proportions
     * 
     */
    @JsonProperty("allowedProportions")
    public void setAllowedProportions(String allowedProportions) {
        this.allowedProportions = allowedProportions;
    }

    public AutoSystem withAllowedProportions(String allowedProportions) {
        this.allowedProportions = allowedProportions;
        return this;
    }

    /**
     * Sign of using Internet technologies
     * 
     */
    @JsonProperty("usingInternetSign")
    public String getUsingInternetSign() {
        return usingInternetSign;
    }

    /**
     * Sign of using Internet technologies
     * 
     */
    @JsonProperty("usingInternetSign")
    public void setUsingInternetSign(String usingInternetSign) {
        this.usingInternetSign = usingInternetSign;
    }

    public AutoSystem withUsingInternetSign(String usingInternetSign) {
        this.usingInternetSign = usingInternetSign;
        return this;
    }

    /**
     * Information for report 0409070
     * 
     */
    @JsonProperty("reportInformation0409070")
    public String getReportInformation0409070() {
        return reportInformation0409070;
    }

    /**
     * Information for report 0409070
     * 
     */
    @JsonProperty("reportInformation0409070")
    public void setReportInformation0409070(String reportInformation0409070) {
        this.reportInformation0409070 = reportInformation0409070;
    }

    public AutoSystem withReportInformation0409070(String reportInformation0409070) {
        this.reportInformation0409070 = reportInformation0409070;
        return this;
    }

    /**
     * Head of support
     * 
     */
    @JsonProperty("supportHead")
    public String getSupportHead() {
        return supportHead;
    }

    /**
     * Head of support
     * 
     */
    @JsonProperty("supportHead")
    public void setSupportHead(String supportHead) {
        this.supportHead = supportHead;
    }

    public AutoSystem withSupportHead(String supportHead) {
        this.supportHead = supportHead;
        return this;
    }

    /**
     * Access to as outside the Russian Federation
     * 
     */
    @JsonProperty("outsideRussianFederationAccess")
    public String getOutsideRussianFederationAccess() {
        return outsideRussianFederationAccess;
    }

    /**
     * Access to as outside the Russian Federation
     * 
     */
    @JsonProperty("outsideRussianFederationAccess")
    public void setOutsideRussianFederationAccess(String outsideRussianFederationAccess) {
        this.outsideRussianFederationAccess = outsideRussianFederationAccess;
    }

    public AutoSystem withOutsideRussianFederationAccess(String outsideRussianFederationAccess) {
        this.outsideRussianFederationAccess = outsideRussianFederationAccess;
        return this;
    }

    /**
     * Mnemonic code
     * 
     */
    @JsonProperty("mnemonicCode")
    public String getMnemonicCode() {
        return mnemonicCode;
    }

    /**
     * Mnemonic code
     * 
     */
    @JsonProperty("mnemonicCode")
    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public AutoSystem withMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
        return this;
    }

    /**
     * PD sign
     * 
     */
    @JsonProperty("signPd")
    public String getSignPd() {
        return signPd;
    }

    /**
     * PD sign
     * 
     */
    @JsonProperty("signPd")
    public void setSignPd(String signPd) {
        this.signPd = signPd;
    }

    public AutoSystem withSignPd(String signPd) {
        this.signPd = signPd;
        return this;
    }

    /**
     * Link to space in Confluence
     * 
     */
    @JsonProperty("confluenceSpaceLink")
    public String getConfluenceSpaceLink() {
        return confluenceSpaceLink;
    }

    /**
     * Link to space in Confluence
     * 
     */
    @JsonProperty("confluenceSpaceLink")
    public void setConfluenceSpaceLink(String confluenceSpaceLink) {
        this.confluenceSpaceLink = confluenceSpaceLink;
    }

    public AutoSystem withConfluenceSpaceLink(String confluenceSpaceLink) {
        this.confluenceSpaceLink = confluenceSpaceLink;
        return this;
    }

    /**
     * ISPDn
     * 
     */
    @JsonProperty("ispdn")
    public String getIspdn() {
        return ispdn;
    }

    /**
     * ISPDn
     * 
     */
    @JsonProperty("ispdn")
    public void setIspdn(String ispdn) {
        this.ispdn = ispdn;
    }

    public AutoSystem withIspdn(String ispdn) {
        this.ispdn = ispdn;
        return this;
    }

    /**
     * Availability of special or biometric PD
     * 
     */
    @JsonProperty("availabilityOfSpecialOrBiometricPd")
    public String getAvailabilityOfSpecialOrBiometricPd() {
        return availabilityOfSpecialOrBiometricPd;
    }

    /**
     * Availability of special or biometric PD
     * 
     */
    @JsonProperty("availabilityOfSpecialOrBiometricPd")
    public void setAvailabilityOfSpecialOrBiometricPd(String availabilityOfSpecialOrBiometricPd) {
        this.availabilityOfSpecialOrBiometricPd = availabilityOfSpecialOrBiometricPd;
    }

    public AutoSystem withAvailabilityOfSpecialOrBiometricPd(String availabilityOfSpecialOrBiometricPd) {
        this.availabilityOfSpecialOrBiometricPd = availabilityOfSpecialOrBiometricPd;
        return this;
    }

    /**
     * System decommissioning date
     * 
     */
    @JsonProperty("decommissioningDate")
    public String getDecommissioningDate() {
        return decommissioningDate;
    }

    /**
     * System decommissioning date
     * 
     */
    @JsonProperty("decommissioningDate")
    public void setDecommissioningDate(String decommissioningDate) {
        this.decommissioningDate = decommissioningDate;
    }

    public AutoSystem withDecommissioningDate(String decommissioningDate) {
        this.decommissioningDate = decommissioningDate;
        return this;
    }

    /**
     * main
     * 
     */
    @JsonProperty("main")
    public String getMain() {
        return main;
    }

    /**
     * main
     * 
     */
    @JsonProperty("main")
    public void setMain(String main) {
        this.main = main;
    }

    public AutoSystem withMain(String main) {
        this.main = main;
        return this;
    }

    /**
     * Date of the archival storage period
     * 
     */
    @JsonProperty("archiveDate")
    public String getArchiveDate() {
        return archiveDate;
    }

    /**
     * Date of the archival storage period
     * 
     */
    @JsonProperty("archiveDate")
    public void setArchiveDate(String archiveDate) {
        this.archiveDate = archiveDate;
    }

    public AutoSystem withArchiveDate(String archiveDate) {
        this.archiveDate = archiveDate;
        return this;
    }

    /**
     * Allocation of AS to the Final Product
     * 
     */
    @JsonProperty("finalProductAllocation")
    public String getFinalProductAllocation() {
        return finalProductAllocation;
    }

    /**
     * Allocation of AS to the Final Product
     * 
     */
    @JsonProperty("finalProductAllocation")
    public void setFinalProductAllocation(String finalProductAllocation) {
        this.finalProductAllocation = finalProductAllocation;
    }

    public AutoSystem withFinalProductAllocation(String finalProductAllocation) {
        this.finalProductAllocation = finalProductAllocation;
        return this;
    }

    /**
     * Communication with IT services in accordance with the concluded SLA
     * 
     */
    @JsonProperty("itCommunicationItSla")
    public String getItCommunicationItSla() {
        return itCommunicationItSla;
    }

    /**
     * Communication with IT services in accordance with the concluded SLA
     * 
     */
    @JsonProperty("itCommunicationItSla")
    public void setItCommunicationItSla(String itCommunicationItSla) {
        this.itCommunicationItSla = itCommunicationItSla;
    }

    public AutoSystem withItCommunicationItSla(String itCommunicationItSla) {
        this.itCommunicationItSla = itCommunicationItSla;
        return this;
    }

    /**
     * RTO
     * 
     */
    @JsonProperty("rto")
    public String getRto() {
        return rto;
    }

    /**
     * RTO
     * 
     */
    @JsonProperty("rto")
    public void setRto(String rto) {
        this.rto = rto;
    }

    public AutoSystem withRto(String rto) {
        this.rto = rto;
        return this;
    }

    /**
     * RPO
     * 
     */
    @JsonProperty("rpo")
    public String getRpo() {
        return rpo;
    }

    /**
     * RPO
     * 
     */
    @JsonProperty("rpo")
    public void setRpo(String rpo) {
        this.rpo = rpo;
    }

    public AutoSystem withRpo(String rpo) {
        this.rpo = rpo;
        return this;
    }

    /**
     * Membership in compliance circuits
     * 
     */
    @JsonProperty("membershipInComplianceCircuits")
    public String getMembershipInComplianceCircuits() {
        return membershipInComplianceCircuits;
    }

    /**
     * Membership in compliance circuits
     * 
     */
    @JsonProperty("membershipInComplianceCircuits")
    public void setMembershipInComplianceCircuits(String membershipInComplianceCircuits) {
        this.membershipInComplianceCircuits = membershipInComplianceCircuits;
    }

    public AutoSystem withMembershipInComplianceCircuits(String membershipInComplianceCircuits) {
        this.membershipInComplianceCircuits = membershipInComplianceCircuits;
        return this;
    }

    /**
     * Availability of data on clients of special service categories
     * 
     */
    @JsonProperty("dataAvailabilityonSpecialServiceClients")
    public String getDataAvailabilityonSpecialServiceClients() {
        return dataAvailabilityonSpecialServiceClients;
    }

    /**
     * Availability of data on clients of special service categories
     * 
     */
    @JsonProperty("dataAvailabilityonSpecialServiceClients")
    public void setDataAvailabilityonSpecialServiceClients(String dataAvailabilityonSpecialServiceClients) {
        this.dataAvailabilityonSpecialServiceClients = dataAvailabilityonSpecialServiceClients;
    }

    public AutoSystem withDataAvailabilityonSpecialServiceClients(String dataAvailabilityonSpecialServiceClients) {
        this.dataAvailabilityonSpecialServiceClients = dataAvailabilityonSpecialServiceClients;
        return this;
    }

    /**
     * Project code for the creation of speakers
     * 
     */
    @JsonProperty("creationProjectCode")
    public String getCreationProjectCode() {
        return creationProjectCode;
    }

    /**
     * Project code for the creation of speakers
     * 
     */
    @JsonProperty("creationProjectCode")
    public void setCreationProjectCode(String creationProjectCode) {
        this.creationProjectCode = creationProjectCode;
    }

    public AutoSystem withCreationProjectCode(String creationProjectCode) {
        this.creationProjectCode = creationProjectCode;
        return this;
    }

    /**
     * author
     * 
     */
    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    /**
     * author
     * 
     */
    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    public AutoSystem withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * IP address of adding record
     * 
     */
    @JsonProperty("addRecordIp")
    public String getAddRecordIp() {
        return addRecordIp;
    }

    /**
     * IP address of adding record
     * 
     */
    @JsonProperty("addRecordIp")
    public void setAddRecordIp(String addRecordIp) {
        this.addRecordIp = addRecordIp;
    }

    public AutoSystem withAddRecordIp(String addRecordIp) {
        this.addRecordIp = addRecordIp;
        return this;
    }

    /**
     * Date the record was added
     * 
     */
    @JsonProperty("addRecordDate")
    public String getAddRecordDate() {
        return addRecordDate;
    }

    /**
     * Date the record was added
     * 
     */
    @JsonProperty("addRecordDate")
    public void setAddRecordDate(String addRecordDate) {
        this.addRecordDate = addRecordDate;
    }

    public AutoSystem withAddRecordDate(String addRecordDate) {
        this.addRecordDate = addRecordDate;
        return this;
    }

    /**
     * addRecordDate
     * 
     */
    @JsonProperty("addRecordTime")
    public String getAddRecordTime() {
        return addRecordTime;
    }

    /**
     * addRecordDate
     * 
     */
    @JsonProperty("addRecordTime")
    public void setAddRecordTime(String addRecordTime) {
        this.addRecordTime = addRecordTime;
    }

    public AutoSystem withAddRecordTime(String addRecordTime) {
        this.addRecordTime = addRecordTime;
        return this;
    }

    /**
     * User of last post edit
     * 
     */
    @JsonProperty("userOfLastPostEdit")
    public String getUserOfLastPostEdit() {
        return userOfLastPostEdit;
    }

    /**
     * User of last post edit
     * 
     */
    @JsonProperty("userOfLastPostEdit")
    public void setUserOfLastPostEdit(String userOfLastPostEdit) {
        this.userOfLastPostEdit = userOfLastPostEdit;
    }

    public AutoSystem withUserOfLastPostEdit(String userOfLastPostEdit) {
        this.userOfLastPostEdit = userOfLastPostEdit;
        return this;
    }

    /**
     * IP address of the last post edit
     * 
     */
    @JsonProperty("ipOfLastPostEdit")
    public String getIpOfLastPostEdit() {
        return ipOfLastPostEdit;
    }

    /**
     * IP address of the last post edit
     * 
     */
    @JsonProperty("ipOfLastPostEdit")
    public void setIpOfLastPostEdit(String ipOfLastPostEdit) {
        this.ipOfLastPostEdit = ipOfLastPostEdit;
    }

    public AutoSystem withIpOfLastPostEdit(String ipOfLastPostEdit) {
        this.ipOfLastPostEdit = ipOfLastPostEdit;
        return this;
    }

    /**
     * Date the record was last edited
     * 
     */
    @JsonProperty("recordLastEditDate")
    public String getRecordLastEditDate() {
        return recordLastEditDate;
    }

    /**
     * Date the record was last edited
     * 
     */
    @JsonProperty("recordLastEditDate")
    public void setRecordLastEditDate(String recordLastEditDate) {
        this.recordLastEditDate = recordLastEditDate;
    }

    public AutoSystem withRecordLastEditDate(String recordLastEditDate) {
        this.recordLastEditDate = recordLastEditDate;
        return this;
    }

    /**
     * Last edit time of entry
     * 
     */
    @JsonProperty("recordLastEditTime")
    public String getRecordLastEditTime() {
        return recordLastEditTime;
    }

    /**
     * Last edit time of entry
     * 
     */
    @JsonProperty("recordLastEditTime")
    public void setRecordLastEditTime(String recordLastEditTime) {
        this.recordLastEditTime = recordLastEditTime;
    }

    public AutoSystem withRecordLastEditTime(String recordLastEditTime) {
        this.recordLastEditTime = recordLastEditTime;
        return this;
    }

    /**
     * Record Acceptance User
     * 
     */
    @JsonProperty("recordAcceptanceUser")
    public String getRecordAcceptanceUser() {
        return recordAcceptanceUser;
    }

    /**
     * Record Acceptance User
     * 
     */
    @JsonProperty("recordAcceptanceUser")
    public void setRecordAcceptanceUser(String recordAcceptanceUser) {
        this.recordAcceptanceUser = recordAcceptanceUser;
    }

    public AutoSystem withRecordAcceptanceUser(String recordAcceptanceUser) {
        this.recordAcceptanceUser = recordAcceptanceUser;
        return this;
    }

    /**
     * IP address of record acceptance
     * 
     */
    @JsonProperty("recordAcceptanceIp")
    public String getRecordAcceptanceIp() {
        return recordAcceptanceIp;
    }

    /**
     * IP address of record acceptance
     * 
     */
    @JsonProperty("recordAcceptanceIp")
    public void setRecordAcceptanceIp(String recordAcceptanceIp) {
        this.recordAcceptanceIp = recordAcceptanceIp;
    }

    public AutoSystem withRecordAcceptanceIp(String recordAcceptanceIp) {
        this.recordAcceptanceIp = recordAcceptanceIp;
        return this;
    }

    /**
     * Record acceptance date
     * 
     */
    @JsonProperty("acceptanceRecordDate")
    public String getAcceptanceRecordDate() {
        return acceptanceRecordDate;
    }

    /**
     * Record acceptance date
     * 
     */
    @JsonProperty("acceptanceRecordDate")
    public void setAcceptanceRecordDate(String acceptanceRecordDate) {
        this.acceptanceRecordDate = acceptanceRecordDate;
    }

    public AutoSystem withAcceptanceRecordDate(String acceptanceRecordDate) {
        this.acceptanceRecordDate = acceptanceRecordDate;
        return this;
    }

    /**
     * Record acceptance time
     * 
     */
    @JsonProperty("acceptanceRecordTime")
    public String getAcceptanceRecordTime() {
        return acceptanceRecordTime;
    }

    /**
     * Record acceptance time
     * 
     */
    @JsonProperty("acceptanceRecordTime")
    public void setAcceptanceRecordTime(String acceptanceRecordTime) {
        this.acceptanceRecordTime = acceptanceRecordTime;
    }

    public AutoSystem withAcceptanceRecordTime(String acceptanceRecordTime) {
        this.acceptanceRecordTime = acceptanceRecordTime;
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

    public AutoSystem withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("autoSystemClassification")
    public EntityReference getAutoSystemClassification() {
        return autoSystemClassification;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("autoSystemClassification")
    public void setAutoSystemClassification(EntityReference autoSystemClassification) {
        this.autoSystemClassification = autoSystemClassification;
    }

    public AutoSystem withAutoSystemClassification(EntityReference autoSystemClassification) {
        this.autoSystemClassification = autoSystemClassification;
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

    public AutoSystem withParent(EntityReference parent) {
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

    public AutoSystem withChildren(List<EntityReference> children) {
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

    public AutoSystem withVersion(Double version) {
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

    public AutoSystem withUpdatedAt(Long updatedAt) {
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

    public AutoSystem withUpdatedBy(String updatedBy) {
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

    public AutoSystem withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Count of how many times this autoSystem and children autoSystems are used.
     * 
     */
    @JsonProperty("usageCount")
    public Integer getUsageCount() {
        return usageCount;
    }

    /**
     * Count of how many times this autoSystem and children autoSystems are used.
     * 
     */
    @JsonProperty("usageCount")
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public AutoSystem withUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
        return this;
    }

    /**
     * If the autoSystem is deprecated.
     * 
     */
    @JsonProperty("deprecated")
    public Boolean getDeprecated() {
        return deprecated;
    }

    /**
     * If the autoSystem is deprecated.
     * 
     */
    @JsonProperty("deprecated")
    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public AutoSystem withDeprecated(Boolean deprecated) {
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

    public AutoSystem withDeleted(Boolean deleted) {
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

    public AutoSystem withChangeDescription(ChangeDescription changeDescription) {
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

    public AutoSystem withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * System autoSystems can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * System autoSystems can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public AutoSystem withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Children autoSystems under this group are mutually exclusive. When mutually exclusive is `true` the autoSystems from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the autoSystems from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public Boolean getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    /**
     * Children autoSystems under this group are mutually exclusive. When mutually exclusive is `true` the autoSystems from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the autoSystems from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public void setMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

    public AutoSystem withMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AutoSystem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("mainFunctionsAndPurpose");
        sb.append('=');
        sb.append(((this.mainFunctionsAndPurpose == null)?"<null>":this.mainFunctionsAndPurpose));
        sb.append(',');
        sb.append("numberInList");
        sb.append('=');
        sb.append(((this.numberInList == null)?"<null>":this.numberInList));
        sb.append(',');
        sb.append("fullNameOwner");
        sb.append('=');
        sb.append(((this.fullNameOwner == null)?"<null>":this.fullNameOwner));
        sb.append(',');
        sb.append("ordApointmentOwner");
        sb.append('=');
        sb.append(((this.ordApointmentOwner == null)?"<null>":this.ordApointmentOwner));
        sb.append(',');
        sb.append("shortName");
        sb.append('=');
        sb.append(((this.shortName == null)?"<null>":this.shortName));
        sb.append(',');
        sb.append("softwareVersion");
        sb.append('=');
        sb.append(((this.softwareVersion == null)?"<null>":this.softwareVersion));
        sb.append(',');
        sb.append("ownDevelopmentOrPurchasedSoftware");
        sb.append('=');
        sb.append(((this.ownDevelopmentOrPurchasedSoftware == null)?"<null>":this.ownDevelopmentOrPurchasedSoftware));
        sb.append(',');
        sb.append("developerInformation");
        sb.append('=');
        sb.append(((this.developerInformation == null)?"<null>":this.developerInformation));
        sb.append(',');
        sb.append("responsibleEmployees");
        sb.append('=');
        sb.append(((this.responsibleEmployees == null)?"<null>":this.responsibleEmployees));
        sb.append(',');
        sb.append("workingHours");
        sb.append('=');
        sb.append(((this.workingHours == null)?"<null>":this.workingHours));
        sb.append(',');
        sb.append("regulatoryEvents");
        sb.append('=');
        sb.append(((this.regulatoryEvents == null)?"<null>":this.regulatoryEvents));
        sb.append(',');
        sb.append("supportContractor");
        sb.append('=');
        sb.append(((this.supportContractor == null)?"<null>":this.supportContractor));
        sb.append(',');
        sb.append("supportMode");
        sb.append('=');
        sb.append(((this.supportMode == null)?"<null>":this.supportMode));
        sb.append(',');
        sb.append("startSupportDate");
        sb.append('=');
        sb.append(((this.startSupportDate == null)?"<null>":this.startSupportDate));
        sb.append(',');
        sb.append("endSupportDate");
        sb.append('=');
        sb.append(((this.endSupportDate == null)?"<null>":this.endSupportDate));
        sb.append(',');
        sb.append("supplier");
        sb.append('=');
        sb.append(((this.supplier == null)?"<null>":this.supplier));
        sb.append(',');
        sb.append("productManager");
        sb.append('=');
        sb.append(((this.productManager == null)?"<null>":this.productManager));
        sb.append(',');
        sb.append("productManagerPosition");
        sb.append('=');
        sb.append(((this.productManagerPosition == null)?"<null>":this.productManagerPosition));
        sb.append(',');
        sb.append("deputyProductManager");
        sb.append('=');
        sb.append(((this.deputyProductManager == null)?"<null>":this.deputyProductManager));
        sb.append(',');
        sb.append("trialStartDate");
        sb.append('=');
        sb.append(((this.trialStartDate == null)?"<null>":this.trialStartDate));
        sb.append(',');
        sb.append("trialEndDate");
        sb.append('=');
        sb.append(((this.trialEndDate == null)?"<null>":this.trialEndDate));
        sb.append(',');
        sb.append("modificationsInfo");
        sb.append('=');
        sb.append(((this.modificationsInfo == null)?"<null>":this.modificationsInfo));
        sb.append(',');
        sb.append("industrialStartDate");
        sb.append('=');
        sb.append(((this.industrialStartDate == null)?"<null>":this.industrialStartDate));
        sb.append(',');
        sb.append("industrialEndDate");
        sb.append('=');
        sb.append(((this.industrialEndDate == null)?"<null>":this.industrialEndDate));
        sb.append(',');
        sb.append("responsibleUsers");
        sb.append('=');
        sb.append(((this.responsibleUsers == null)?"<null>":this.responsibleUsers));
        sb.append(',');
        sb.append("installationKit");
        sb.append('=');
        sb.append(((this.installationKit == null)?"<null>":this.installationKit));
        sb.append(',');
        sb.append("serverEquipmentNameIp");
        sb.append('=');
        sb.append(((this.serverEquipmentNameIp == null)?"<null>":this.serverEquipmentNameIp));
        sb.append(',');
        sb.append("serverSoftware");
        sb.append('=');
        sb.append(((this.serverSoftware == null)?"<null>":this.serverSoftware));
        sb.append(',');
        sb.append("softwareAndHardwareComposition");
        sb.append('=');
        sb.append(((this.softwareAndHardwareComposition == null)?"<null>":this.softwareAndHardwareComposition));
        sb.append(',');
        sb.append("db");
        sb.append('=');
        sb.append(((this.db == null)?"<null>":this.db));
        sb.append(',');
        sb.append("dbVersion");
        sb.append('=');
        sb.append(((this.dbVersion == null)?"<null>":this.dbVersion));
        sb.append(',');
        sb.append("clientPartEquioment");
        sb.append('=');
        sb.append(((this.clientPartEquioment == null)?"<null>":this.clientPartEquioment));
        sb.append(',');
        sb.append("workplaceTypeAndSoftwareEnvVersion");
        sb.append('=');
        sb.append(((this.workplaceTypeAndSoftwareEnvVersion == null)?"<null>":this.workplaceTypeAndSoftwareEnvVersion));
        sb.append(',');
        sb.append("lisOfOtherSystemConnections");
        sb.append('=');
        sb.append(((this.lisOfOtherSystemConnections == null)?"<null>":this.lisOfOtherSystemConnections));
        sb.append(',');
        sb.append("degreeOfConfidentiality");
        sb.append('=');
        sb.append(((this.degreeOfConfidentiality == null)?"<null>":this.degreeOfConfidentiality));
        sb.append(',');
        sb.append("criticalityClass");
        sb.append('=');
        sb.append(((this.criticalityClass == null)?"<null>":this.criticalityClass));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("accompaniedByItBlock");
        sb.append('=');
        sb.append(((this.accompaniedByItBlock == null)?"<null>":this.accompaniedByItBlock));
        sb.append(',');
        sb.append("electronicCopyDoc");
        sb.append('=');
        sb.append(((this.electronicCopyDoc == null)?"<null>":this.electronicCopyDoc));
        sb.append(',');
        sb.append("projectConnection");
        sb.append('=');
        sb.append(((this.projectConnection == null)?"<null>":this.projectConnection));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
        sb.append(',');
        sb.append("asType");
        sb.append('=');
        sb.append(((this.asType == null)?"<null>":this.asType));
        sb.append(',');
        sb.append("operationType");
        sb.append('=');
        sb.append(((this.operationType == null)?"<null>":this.operationType));
        sb.append(',');
        sb.append("basisForDevelopmentAndInputIntoPe");
        sb.append('=');
        sb.append(((this.basisForDevelopmentAndInputIntoPe == null)?"<null>":this.basisForDevelopmentAndInputIntoPe));
        sb.append(',');
        sb.append("mc");
        sb.append('=');
        sb.append(((this.mc == null)?"<null>":this.mc));
        sb.append(',');
        sb.append("thresholdTimeOfMinorFailure");
        sb.append('=');
        sb.append(((this.thresholdTimeOfMinorFailure == null)?"<null>":this.thresholdTimeOfMinorFailure));
        sb.append(',');
        sb.append("criticalDayTime");
        sb.append('=');
        sb.append(((this.criticalDayTime == null)?"<null>":this.criticalDayTime));
        sb.append(',');
        sb.append("roleModel");
        sb.append('=');
        sb.append(((this.roleModel == null)?"<null>":this.roleModel));
        sb.append(',');
        sb.append("linkToUserList");
        sb.append('=');
        sb.append(((this.linkToUserList == null)?"<null>":this.linkToUserList));
        sb.append(',');
        sb.append("itRecoveryCoordinator");
        sb.append('=');
        sb.append(((this.itRecoveryCoordinator == null)?"<null>":this.itRecoveryCoordinator));
        sb.append(',');
        sb.append("administratorsInfo");
        sb.append('=');
        sb.append(((this.administratorsInfo == null)?"<null>":this.administratorsInfo));
        sb.append(',');
        sb.append("planningManager");
        sb.append('=');
        sb.append(((this.planningManager == null)?"<null>":this.planningManager));
        sb.append(',');
        sb.append("registrationCertificate");
        sb.append('=');
        sb.append(((this.registrationCertificate == null)?"<null>":this.registrationCertificate));
        sb.append(',');
        sb.append("businessRecoveryCoordinator");
        sb.append('=');
        sb.append(((this.businessRecoveryCoordinator == null)?"<null>":this.businessRecoveryCoordinator));
        sb.append(',');
        sb.append("orderForDecommissioning");
        sb.append('=');
        sb.append(((this.orderForDecommissioning == null)?"<null>":this.orderForDecommissioning));
        sb.append(',');
        sb.append("administrators");
        sb.append('=');
        sb.append(((this.administrators == null)?"<null>":this.administrators));
        sb.append(',');
        sb.append("registerLinkRfiInJiradev");
        sb.append('=');
        sb.append(((this.registerLinkRfiInJiradev == null)?"<null>":this.registerLinkRfiInJiradev));
        sb.append(',');
        sb.append("devStrategicProspects");
        sb.append('=');
        sb.append(((this.devStrategicProspects == null)?"<null>":this.devStrategicProspects));
        sb.append(',');
        sb.append("architect");
        sb.append('=');
        sb.append(((this.architect == null)?"<null>":this.architect));
        sb.append(',');
        sb.append("devHead");
        sb.append('=');
        sb.append(((this.devHead == null)?"<null>":this.devHead));
        sb.append(',');
        sb.append("testingManager");
        sb.append('=');
        sb.append(((this.testingManager == null)?"<null>":this.testingManager));
        sb.append(',');
        sb.append("softwareRightsLevel");
        sb.append('=');
        sb.append(((this.softwareRightsLevel == null)?"<null>":this.softwareRightsLevel));
        sb.append(',');
        sb.append("approvedSourcingModel");
        sb.append('=');
        sb.append(((this.approvedSourcingModel == null)?"<null>":this.approvedSourcingModel));
        sb.append(',');
        sb.append("durationSourcingModel");
        sb.append('=');
        sb.append(((this.durationSourcingModel == null)?"<null>":this.durationSourcingModel));
        sb.append(',');
        sb.append("keyCompetencies");
        sb.append('=');
        sb.append(((this.keyCompetencies == null)?"<null>":this.keyCompetencies));
        sb.append(',');
        sb.append("allowedProportions");
        sb.append('=');
        sb.append(((this.allowedProportions == null)?"<null>":this.allowedProportions));
        sb.append(',');
        sb.append("usingInternetSign");
        sb.append('=');
        sb.append(((this.usingInternetSign == null)?"<null>":this.usingInternetSign));
        sb.append(',');
        sb.append("reportInformation0409070");
        sb.append('=');
        sb.append(((this.reportInformation0409070 == null)?"<null>":this.reportInformation0409070));
        sb.append(',');
        sb.append("supportHead");
        sb.append('=');
        sb.append(((this.supportHead == null)?"<null>":this.supportHead));
        sb.append(',');
        sb.append("outsideRussianFederationAccess");
        sb.append('=');
        sb.append(((this.outsideRussianFederationAccess == null)?"<null>":this.outsideRussianFederationAccess));
        sb.append(',');
        sb.append("mnemonicCode");
        sb.append('=');
        sb.append(((this.mnemonicCode == null)?"<null>":this.mnemonicCode));
        sb.append(',');
        sb.append("signPd");
        sb.append('=');
        sb.append(((this.signPd == null)?"<null>":this.signPd));
        sb.append(',');
        sb.append("confluenceSpaceLink");
        sb.append('=');
        sb.append(((this.confluenceSpaceLink == null)?"<null>":this.confluenceSpaceLink));
        sb.append(',');
        sb.append("ispdn");
        sb.append('=');
        sb.append(((this.ispdn == null)?"<null>":this.ispdn));
        sb.append(',');
        sb.append("availabilityOfSpecialOrBiometricPd");
        sb.append('=');
        sb.append(((this.availabilityOfSpecialOrBiometricPd == null)?"<null>":this.availabilityOfSpecialOrBiometricPd));
        sb.append(',');
        sb.append("decommissioningDate");
        sb.append('=');
        sb.append(((this.decommissioningDate == null)?"<null>":this.decommissioningDate));
        sb.append(',');
        sb.append("main");
        sb.append('=');
        sb.append(((this.main == null)?"<null>":this.main));
        sb.append(',');
        sb.append("archiveDate");
        sb.append('=');
        sb.append(((this.archiveDate == null)?"<null>":this.archiveDate));
        sb.append(',');
        sb.append("finalProductAllocation");
        sb.append('=');
        sb.append(((this.finalProductAllocation == null)?"<null>":this.finalProductAllocation));
        sb.append(',');
        sb.append("itCommunicationItSla");
        sb.append('=');
        sb.append(((this.itCommunicationItSla == null)?"<null>":this.itCommunicationItSla));
        sb.append(',');
        sb.append("rto");
        sb.append('=');
        sb.append(((this.rto == null)?"<null>":this.rto));
        sb.append(',');
        sb.append("rpo");
        sb.append('=');
        sb.append(((this.rpo == null)?"<null>":this.rpo));
        sb.append(',');
        sb.append("membershipInComplianceCircuits");
        sb.append('=');
        sb.append(((this.membershipInComplianceCircuits == null)?"<null>":this.membershipInComplianceCircuits));
        sb.append(',');
        sb.append("dataAvailabilityonSpecialServiceClients");
        sb.append('=');
        sb.append(((this.dataAvailabilityonSpecialServiceClients == null)?"<null>":this.dataAvailabilityonSpecialServiceClients));
        sb.append(',');
        sb.append("creationProjectCode");
        sb.append('=');
        sb.append(((this.creationProjectCode == null)?"<null>":this.creationProjectCode));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("addRecordIp");
        sb.append('=');
        sb.append(((this.addRecordIp == null)?"<null>":this.addRecordIp));
        sb.append(',');
        sb.append("addRecordDate");
        sb.append('=');
        sb.append(((this.addRecordDate == null)?"<null>":this.addRecordDate));
        sb.append(',');
        sb.append("addRecordTime");
        sb.append('=');
        sb.append(((this.addRecordTime == null)?"<null>":this.addRecordTime));
        sb.append(',');
        sb.append("userOfLastPostEdit");
        sb.append('=');
        sb.append(((this.userOfLastPostEdit == null)?"<null>":this.userOfLastPostEdit));
        sb.append(',');
        sb.append("ipOfLastPostEdit");
        sb.append('=');
        sb.append(((this.ipOfLastPostEdit == null)?"<null>":this.ipOfLastPostEdit));
        sb.append(',');
        sb.append("recordLastEditDate");
        sb.append('=');
        sb.append(((this.recordLastEditDate == null)?"<null>":this.recordLastEditDate));
        sb.append(',');
        sb.append("recordLastEditTime");
        sb.append('=');
        sb.append(((this.recordLastEditTime == null)?"<null>":this.recordLastEditTime));
        sb.append(',');
        sb.append("recordAcceptanceUser");
        sb.append('=');
        sb.append(((this.recordAcceptanceUser == null)?"<null>":this.recordAcceptanceUser));
        sb.append(',');
        sb.append("recordAcceptanceIp");
        sb.append('=');
        sb.append(((this.recordAcceptanceIp == null)?"<null>":this.recordAcceptanceIp));
        sb.append(',');
        sb.append("acceptanceRecordDate");
        sb.append('=');
        sb.append(((this.acceptanceRecordDate == null)?"<null>":this.acceptanceRecordDate));
        sb.append(',');
        sb.append("acceptanceRecordTime");
        sb.append('=');
        sb.append(((this.acceptanceRecordTime == null)?"<null>":this.acceptanceRecordTime));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("autoSystemClassification");
        sb.append('=');
        sb.append(((this.autoSystemClassification == null)?"<null>":this.autoSystemClassification));
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
        result = ((result* 31)+((this.workplaceTypeAndSoftwareEnvVersion == null)? 0 :this.workplaceTypeAndSoftwareEnvVersion.hashCode()));
        result = ((result* 31)+((this.accompaniedByItBlock == null)? 0 :this.accompaniedByItBlock.hashCode()));
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.responsibleEmployees == null)? 0 :this.responsibleEmployees.hashCode()));
        result = ((result* 31)+((this.serverEquipmentNameIp == null)? 0 :this.serverEquipmentNameIp.hashCode()));
        result = ((result* 31)+((this.deprecated == null)? 0 :this.deprecated.hashCode()));
        result = ((result* 31)+((this.projectConnection == null)? 0 :this.projectConnection.hashCode()));
        result = ((result* 31)+((this.clientPartEquioment == null)? 0 :this.clientPartEquioment.hashCode()));
        result = ((result* 31)+((this.children == null)? 0 :this.children.hashCode()));
        result = ((result* 31)+((this.supplier == null)? 0 :this.supplier.hashCode()));
        result = ((result* 31)+((this.dataAvailabilityonSpecialServiceClients == null)? 0 :this.dataAvailabilityonSpecialServiceClients.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.workingHours == null)? 0 :this.workingHours.hashCode()));
        result = ((result* 31)+((this.deputyProductManager == null)? 0 :this.deputyProductManager.hashCode()));
        result = ((result* 31)+((this.itRecoveryCoordinator == null)? 0 :this.itRecoveryCoordinator.hashCode()));
        result = ((result* 31)+((this.electronicCopyDoc == null)? 0 :this.electronicCopyDoc.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.ipOfLastPostEdit == null)? 0 :this.ipOfLastPostEdit.hashCode()));
        result = ((result* 31)+((this.usingInternetSign == null)? 0 :this.usingInternetSign.hashCode()));
        result = ((result* 31)+((this.supportContractor == null)? 0 :this.supportContractor.hashCode()));
        result = ((result* 31)+((this.operationType == null)? 0 :this.operationType.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.confluenceSpaceLink == null)? 0 :this.confluenceSpaceLink.hashCode()));
        result = ((result* 31)+((this.shortName == null)? 0 :this.shortName.hashCode()));
        result = ((result* 31)+((this.softwareVersion == null)? 0 :this.softwareVersion.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.architect == null)? 0 :this.architect.hashCode()));
        result = ((result* 31)+((this.industrialStartDate == null)? 0 :this.industrialStartDate.hashCode()));
        result = ((result* 31)+((this.allowedProportions == null)? 0 :this.allowedProportions.hashCode()));
        result = ((result* 31)+((this.creationProjectCode == null)? 0 :this.creationProjectCode.hashCode()));
        result = ((result* 31)+((this.productManagerPosition == null)? 0 :this.productManagerPosition.hashCode()));
        result = ((result* 31)+((this.modificationsInfo == null)? 0 :this.modificationsInfo.hashCode()));
        result = ((result* 31)+((this.recordLastEditDate == null)? 0 :this.recordLastEditDate.hashCode()));
        result = ((result* 31)+((this.orderForDecommissioning == null)? 0 :this.orderForDecommissioning.hashCode()));
        result = ((result* 31)+((this.addRecordIp == null)? 0 :this.addRecordIp.hashCode()));
        result = ((result* 31)+((this.roleModel == null)? 0 :this.roleModel.hashCode()));
        result = ((result* 31)+((this.businessRecoveryCoordinator == null)? 0 :this.businessRecoveryCoordinator.hashCode()));
        result = ((result* 31)+((this.archiveDate == null)? 0 :this.archiveDate.hashCode()));
        result = ((result* 31)+((this.disabled == null)? 0 :this.disabled.hashCode()));
        result = ((result* 31)+((this.planningManager == null)? 0 :this.planningManager.hashCode()));
        result = ((result* 31)+((this.outsideRussianFederationAccess == null)? 0 :this.outsideRussianFederationAccess.hashCode()));
        result = ((result* 31)+((this.trialStartDate == null)? 0 :this.trialStartDate.hashCode()));
        result = ((result* 31)+((this.reportInformation0409070 == null)? 0 :this.reportInformation0409070 .hashCode()));
        result = ((result* 31)+((this.regulatoryEvents == null)? 0 :this.regulatoryEvents.hashCode()));
        result = ((result* 31)+((this.dbVersion == null)? 0 :this.dbVersion.hashCode()));
        result = ((result* 31)+((this.rto == null)? 0 :this.rto.hashCode()));
        result = ((result* 31)+((this.ispdn == null)? 0 :this.ispdn.hashCode()));
        result = ((result* 31)+((this.usageCount == null)? 0 :this.usageCount.hashCode()));
        result = ((result* 31)+((this.productManager == null)? 0 :this.productManager.hashCode()));
        result = ((result* 31)+((this.thresholdTimeOfMinorFailure == null)? 0 :this.thresholdTimeOfMinorFailure.hashCode()));
        result = ((result* 31)+((this.approvedSourcingModel == null)? 0 :this.approvedSourcingModel.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.durationSourcingModel == null)? 0 :this.durationSourcingModel.hashCode()));
        result = ((result* 31)+((this.installationKit == null)? 0 :this.installationKit.hashCode()));
        result = ((result* 31)+((this.mutuallyExclusive == null)? 0 :this.mutuallyExclusive.hashCode()));
        result = ((result* 31)+((this.endSupportDate == null)? 0 :this.endSupportDate.hashCode()));
        result = ((result* 31)+((this.devHead == null)? 0 :this.devHead.hashCode()));
        result = ((result* 31)+((this.db == null)? 0 :this.db.hashCode()));
        result = ((result* 31)+((this.numberInList == null)? 0 :this.numberInList.hashCode()));
        result = ((result* 31)+((this.industrialEndDate == null)? 0 :this.industrialEndDate.hashCode()));
        result = ((result* 31)+((this.startSupportDate == null)? 0 :this.startSupportDate.hashCode()));
        result = ((result* 31)+((this.criticalityClass == null)? 0 :this.criticalityClass.hashCode()));
        result = ((result* 31)+((this.main == null)? 0 :this.main.hashCode()));
        result = ((result* 31)+((this.recordAcceptanceUser == null)? 0 :this.recordAcceptanceUser.hashCode()));
        result = ((result* 31)+((this.lisOfOtherSystemConnections == null)? 0 :this.lisOfOtherSystemConnections.hashCode()));
        result = ((result* 31)+((this.itCommunicationItSla == null)? 0 :this.itCommunicationItSla.hashCode()));
        result = ((result* 31)+((this.asType == null)? 0 :this.asType.hashCode()));
        result = ((result* 31)+((this.criticalDayTime == null)? 0 :this.criticalDayTime.hashCode()));
        result = ((result* 31)+((this.mc == null)? 0 :this.mc.hashCode()));
        result = ((result* 31)+((this.userOfLastPostEdit == null)? 0 :this.userOfLastPostEdit.hashCode()));
        result = ((result* 31)+((this.mnemonicCode == null)? 0 :this.mnemonicCode.hashCode()));
        result = ((result* 31)+((this.softwareRightsLevel == null)? 0 :this.softwareRightsLevel.hashCode()));
        result = ((result* 31)+((this.administrators == null)? 0 :this.administrators.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.ownDevelopmentOrPurchasedSoftware == null)? 0 :this.ownDevelopmentOrPurchasedSoftware.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.signPd == null)? 0 :this.signPd.hashCode()));
        result = ((result* 31)+((this.administratorsInfo == null)? 0 :this.administratorsInfo.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.ordApointmentOwner == null)? 0 :this.ordApointmentOwner.hashCode()));
        result = ((result* 31)+((this.basisForDevelopmentAndInputIntoPe == null)? 0 :this.basisForDevelopmentAndInputIntoPe.hashCode()));
        result = ((result* 31)+((this.recordLastEditTime == null)? 0 :this.recordLastEditTime.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.devStrategicProspects == null)? 0 :this.devStrategicProspects.hashCode()));
        result = ((result* 31)+((this.decommissioningDate == null)? 0 :this.decommissioningDate.hashCode()));
        result = ((result* 31)+((this.acceptanceRecordTime == null)? 0 :this.acceptanceRecordTime.hashCode()));
        result = ((result* 31)+((this.softwareAndHardwareComposition == null)? 0 :this.softwareAndHardwareComposition.hashCode()));
        result = ((result* 31)+((this.supportMode == null)? 0 :this.supportMode.hashCode()));
        result = ((result* 31)+((this.registerLinkRfiInJiradev == null)? 0 :this.registerLinkRfiInJiradev.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.registrationCertificate == null)? 0 :this.registrationCertificate.hashCode()));
        result = ((result* 31)+((this.testingManager == null)? 0 :this.testingManager.hashCode()));
        result = ((result* 31)+((this.serverSoftware == null)? 0 :this.serverSoftware.hashCode()));
        result = ((result* 31)+((this.addRecordTime == null)? 0 :this.addRecordTime.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.linkToUserList == null)? 0 :this.linkToUserList.hashCode()));
        result = ((result* 31)+((this.recordAcceptanceIp == null)? 0 :this.recordAcceptanceIp.hashCode()));
        result = ((result* 31)+((this.availabilityOfSpecialOrBiometricPd == null)? 0 :this.availabilityOfSpecialOrBiometricPd.hashCode()));
        result = ((result* 31)+((this.responsibleUsers == null)? 0 :this.responsibleUsers.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.addRecordDate == null)? 0 :this.addRecordDate.hashCode()));
        result = ((result* 31)+((this.finalProductAllocation == null)? 0 :this.finalProductAllocation.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.mainFunctionsAndPurpose == null)? 0 :this.mainFunctionsAndPurpose.hashCode()));
        result = ((result* 31)+((this.fullNameOwner == null)? 0 :this.fullNameOwner.hashCode()));
        result = ((result* 31)+((this.degreeOfConfidentiality == null)? 0 :this.degreeOfConfidentiality.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.acceptanceRecordDate == null)? 0 :this.acceptanceRecordDate.hashCode()));
        result = ((result* 31)+((this.supportHead == null)? 0 :this.supportHead.hashCode()));
        result = ((result* 31)+((this.rpo == null)? 0 :this.rpo.hashCode()));
        result = ((result* 31)+((this.trialEndDate == null)? 0 :this.trialEndDate.hashCode()));
        result = ((result* 31)+((this.membershipInComplianceCircuits == null)? 0 :this.membershipInComplianceCircuits.hashCode()));
        result = ((result* 31)+((this.developerInformation == null)? 0 :this.developerInformation.hashCode()));
        result = ((result* 31)+((this.keyCompetencies == null)? 0 :this.keyCompetencies.hashCode()));
        result = ((result* 31)+((this.autoSystemClassification == null)? 0 :this.autoSystemClassification.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutoSystem) == false) {
            return false;
        }
        AutoSystem rhs = ((AutoSystem) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.workplaceTypeAndSoftwareEnvVersion == rhs.workplaceTypeAndSoftwareEnvVersion)||((this.workplaceTypeAndSoftwareEnvVersion!= null)&&this.workplaceTypeAndSoftwareEnvVersion.equals(rhs.workplaceTypeAndSoftwareEnvVersion)))&&((this.accompaniedByItBlock == rhs.accompaniedByItBlock)||((this.accompaniedByItBlock!= null)&&this.accompaniedByItBlock.equals(rhs.accompaniedByItBlock))))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.responsibleEmployees == rhs.responsibleEmployees)||((this.responsibleEmployees!= null)&&this.responsibleEmployees.equals(rhs.responsibleEmployees))))&&((this.serverEquipmentNameIp == rhs.serverEquipmentNameIp)||((this.serverEquipmentNameIp!= null)&&this.serverEquipmentNameIp.equals(rhs.serverEquipmentNameIp))))&&((this.deprecated == rhs.deprecated)||((this.deprecated!= null)&&this.deprecated.equals(rhs.deprecated))))&&((this.projectConnection == rhs.projectConnection)||((this.projectConnection!= null)&&this.projectConnection.equals(rhs.projectConnection))))&&((this.clientPartEquioment == rhs.clientPartEquioment)||((this.clientPartEquioment!= null)&&this.clientPartEquioment.equals(rhs.clientPartEquioment))))&&((this.children == rhs.children)||((this.children!= null)&&this.children.equals(rhs.children))))&&((this.supplier == rhs.supplier)||((this.supplier!= null)&&this.supplier.equals(rhs.supplier))))&&((this.dataAvailabilityonSpecialServiceClients == rhs.dataAvailabilityonSpecialServiceClients)||((this.dataAvailabilityonSpecialServiceClients!= null)&&this.dataAvailabilityonSpecialServiceClients.equals(rhs.dataAvailabilityonSpecialServiceClients))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.workingHours == rhs.workingHours)||((this.workingHours!= null)&&this.workingHours.equals(rhs.workingHours))))&&((this.deputyProductManager == rhs.deputyProductManager)||((this.deputyProductManager!= null)&&this.deputyProductManager.equals(rhs.deputyProductManager))))&&((this.itRecoveryCoordinator == rhs.itRecoveryCoordinator)||((this.itRecoveryCoordinator!= null)&&this.itRecoveryCoordinator.equals(rhs.itRecoveryCoordinator))))&&((this.electronicCopyDoc == rhs.electronicCopyDoc)||((this.electronicCopyDoc!= null)&&this.electronicCopyDoc.equals(rhs.electronicCopyDoc))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.ipOfLastPostEdit == rhs.ipOfLastPostEdit)||((this.ipOfLastPostEdit!= null)&&this.ipOfLastPostEdit.equals(rhs.ipOfLastPostEdit))))&&((this.usingInternetSign == rhs.usingInternetSign)||((this.usingInternetSign!= null)&&this.usingInternetSign.equals(rhs.usingInternetSign))))&&((this.supportContractor == rhs.supportContractor)||((this.supportContractor!= null)&&this.supportContractor.equals(rhs.supportContractor))))&&((this.operationType == rhs.operationType)||((this.operationType!= null)&&this.operationType.equals(rhs.operationType))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.confluenceSpaceLink == rhs.confluenceSpaceLink)||((this.confluenceSpaceLink!= null)&&this.confluenceSpaceLink.equals(rhs.confluenceSpaceLink))))&&((this.shortName == rhs.shortName)||((this.shortName!= null)&&this.shortName.equals(rhs.shortName))))&&((this.softwareVersion == rhs.softwareVersion)||((this.softwareVersion!= null)&&this.softwareVersion.equals(rhs.softwareVersion))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.architect == rhs.architect)||((this.architect!= null)&&this.architect.equals(rhs.architect))))&&((this.industrialStartDate == rhs.industrialStartDate)||((this.industrialStartDate!= null)&&this.industrialStartDate.equals(rhs.industrialStartDate))))&&((this.allowedProportions == rhs.allowedProportions)||((this.allowedProportions!= null)&&this.allowedProportions.equals(rhs.allowedProportions))))&&((this.creationProjectCode == rhs.creationProjectCode)||((this.creationProjectCode!= null)&&this.creationProjectCode.equals(rhs.creationProjectCode))))&&((this.productManagerPosition == rhs.productManagerPosition)||((this.productManagerPosition!= null)&&this.productManagerPosition.equals(rhs.productManagerPosition))))&&((this.modificationsInfo == rhs.modificationsInfo)||((this.modificationsInfo!= null)&&this.modificationsInfo.equals(rhs.modificationsInfo))))&&((this.recordLastEditDate == rhs.recordLastEditDate)||((this.recordLastEditDate!= null)&&this.recordLastEditDate.equals(rhs.recordLastEditDate))))&&((this.orderForDecommissioning == rhs.orderForDecommissioning)||((this.orderForDecommissioning!= null)&&this.orderForDecommissioning.equals(rhs.orderForDecommissioning))))&&((this.addRecordIp == rhs.addRecordIp)||((this.addRecordIp!= null)&&this.addRecordIp.equals(rhs.addRecordIp))))&&((this.roleModel == rhs.roleModel)||((this.roleModel!= null)&&this.roleModel.equals(rhs.roleModel))))&&((this.businessRecoveryCoordinator == rhs.businessRecoveryCoordinator)||((this.businessRecoveryCoordinator!= null)&&this.businessRecoveryCoordinator.equals(rhs.businessRecoveryCoordinator))))&&((this.archiveDate == rhs.archiveDate)||((this.archiveDate!= null)&&this.archiveDate.equals(rhs.archiveDate))))&&((this.disabled == rhs.disabled)||((this.disabled!= null)&&this.disabled.equals(rhs.disabled))))&&((this.planningManager == rhs.planningManager)||((this.planningManager!= null)&&this.planningManager.equals(rhs.planningManager))))&&((this.outsideRussianFederationAccess == rhs.outsideRussianFederationAccess)||((this.outsideRussianFederationAccess!= null)&&this.outsideRussianFederationAccess.equals(rhs.outsideRussianFederationAccess))))&&((this.trialStartDate == rhs.trialStartDate)||((this.trialStartDate!= null)&&this.trialStartDate.equals(rhs.trialStartDate))))&&((this.reportInformation0409070 == rhs.reportInformation0409070)||((this.reportInformation0409070 != null)&&this.reportInformation0409070 .equals(rhs.reportInformation0409070))))&&((this.regulatoryEvents == rhs.regulatoryEvents)||((this.regulatoryEvents!= null)&&this.regulatoryEvents.equals(rhs.regulatoryEvents))))&&((this.dbVersion == rhs.dbVersion)||((this.dbVersion!= null)&&this.dbVersion.equals(rhs.dbVersion))))&&((this.rto == rhs.rto)||((this.rto!= null)&&this.rto.equals(rhs.rto))))&&((this.ispdn == rhs.ispdn)||((this.ispdn!= null)&&this.ispdn.equals(rhs.ispdn))))&&((this.usageCount == rhs.usageCount)||((this.usageCount!= null)&&this.usageCount.equals(rhs.usageCount))))&&((this.productManager == rhs.productManager)||((this.productManager!= null)&&this.productManager.equals(rhs.productManager))))&&((this.thresholdTimeOfMinorFailure == rhs.thresholdTimeOfMinorFailure)||((this.thresholdTimeOfMinorFailure!= null)&&this.thresholdTimeOfMinorFailure.equals(rhs.thresholdTimeOfMinorFailure))))&&((this.approvedSourcingModel == rhs.approvedSourcingModel)||((this.approvedSourcingModel!= null)&&this.approvedSourcingModel.equals(rhs.approvedSourcingModel))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.durationSourcingModel == rhs.durationSourcingModel)||((this.durationSourcingModel!= null)&&this.durationSourcingModel.equals(rhs.durationSourcingModel))))&&((this.installationKit == rhs.installationKit)||((this.installationKit!= null)&&this.installationKit.equals(rhs.installationKit))))&&((this.mutuallyExclusive == rhs.mutuallyExclusive)||((this.mutuallyExclusive!= null)&&this.mutuallyExclusive.equals(rhs.mutuallyExclusive))))&&((this.endSupportDate == rhs.endSupportDate)||((this.endSupportDate!= null)&&this.endSupportDate.equals(rhs.endSupportDate))))&&((this.devHead == rhs.devHead)||((this.devHead!= null)&&this.devHead.equals(rhs.devHead))))&&((this.db == rhs.db)||((this.db!= null)&&this.db.equals(rhs.db))))&&((this.numberInList == rhs.numberInList)||((this.numberInList!= null)&&this.numberInList.equals(rhs.numberInList))))&&((this.industrialEndDate == rhs.industrialEndDate)||((this.industrialEndDate!= null)&&this.industrialEndDate.equals(rhs.industrialEndDate))))&&((this.startSupportDate == rhs.startSupportDate)||((this.startSupportDate!= null)&&this.startSupportDate.equals(rhs.startSupportDate))))&&((this.criticalityClass == rhs.criticalityClass)||((this.criticalityClass!= null)&&this.criticalityClass.equals(rhs.criticalityClass))))&&((this.main == rhs.main)||((this.main!= null)&&this.main.equals(rhs.main))))&&((this.recordAcceptanceUser == rhs.recordAcceptanceUser)||((this.recordAcceptanceUser!= null)&&this.recordAcceptanceUser.equals(rhs.recordAcceptanceUser))))&&((this.lisOfOtherSystemConnections == rhs.lisOfOtherSystemConnections)||((this.lisOfOtherSystemConnections!= null)&&this.lisOfOtherSystemConnections.equals(rhs.lisOfOtherSystemConnections))))&&((this.itCommunicationItSla == rhs.itCommunicationItSla)||((this.itCommunicationItSla!= null)&&this.itCommunicationItSla.equals(rhs.itCommunicationItSla))))&&((this.asType == rhs.asType)||((this.asType!= null)&&this.asType.equals(rhs.asType))))&&((this.criticalDayTime == rhs.criticalDayTime)||((this.criticalDayTime!= null)&&this.criticalDayTime.equals(rhs.criticalDayTime))))&&((this.mc == rhs.mc)||((this.mc!= null)&&this.mc.equals(rhs.mc))))&&((this.userOfLastPostEdit == rhs.userOfLastPostEdit)||((this.userOfLastPostEdit!= null)&&this.userOfLastPostEdit.equals(rhs.userOfLastPostEdit))))&&((this.mnemonicCode == rhs.mnemonicCode)||((this.mnemonicCode!= null)&&this.mnemonicCode.equals(rhs.mnemonicCode))))&&((this.softwareRightsLevel == rhs.softwareRightsLevel)||((this.softwareRightsLevel!= null)&&this.softwareRightsLevel.equals(rhs.softwareRightsLevel))))&&((this.administrators == rhs.administrators)||((this.administrators!= null)&&this.administrators.equals(rhs.administrators))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.ownDevelopmentOrPurchasedSoftware == rhs.ownDevelopmentOrPurchasedSoftware)||((this.ownDevelopmentOrPurchasedSoftware!= null)&&this.ownDevelopmentOrPurchasedSoftware.equals(rhs.ownDevelopmentOrPurchasedSoftware))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.signPd == rhs.signPd)||((this.signPd!= null)&&this.signPd.equals(rhs.signPd))))&&((this.administratorsInfo == rhs.administratorsInfo)||((this.administratorsInfo!= null)&&this.administratorsInfo.equals(rhs.administratorsInfo))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.ordApointmentOwner == rhs.ordApointmentOwner)||((this.ordApointmentOwner!= null)&&this.ordApointmentOwner.equals(rhs.ordApointmentOwner))))&&((this.basisForDevelopmentAndInputIntoPe == rhs.basisForDevelopmentAndInputIntoPe)||((this.basisForDevelopmentAndInputIntoPe!= null)&&this.basisForDevelopmentAndInputIntoPe.equals(rhs.basisForDevelopmentAndInputIntoPe))))&&((this.recordLastEditTime == rhs.recordLastEditTime)||((this.recordLastEditTime!= null)&&this.recordLastEditTime.equals(rhs.recordLastEditTime))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.devStrategicProspects == rhs.devStrategicProspects)||((this.devStrategicProspects!= null)&&this.devStrategicProspects.equals(rhs.devStrategicProspects))))&&((this.decommissioningDate == rhs.decommissioningDate)||((this.decommissioningDate!= null)&&this.decommissioningDate.equals(rhs.decommissioningDate))))&&((this.acceptanceRecordTime == rhs.acceptanceRecordTime)||((this.acceptanceRecordTime!= null)&&this.acceptanceRecordTime.equals(rhs.acceptanceRecordTime))))&&((this.softwareAndHardwareComposition == rhs.softwareAndHardwareComposition)||((this.softwareAndHardwareComposition!= null)&&this.softwareAndHardwareComposition.equals(rhs.softwareAndHardwareComposition))))&&((this.supportMode == rhs.supportMode)||((this.supportMode!= null)&&this.supportMode.equals(rhs.supportMode))))&&((this.registerLinkRfiInJiradev == rhs.registerLinkRfiInJiradev)||((this.registerLinkRfiInJiradev!= null)&&this.registerLinkRfiInJiradev.equals(rhs.registerLinkRfiInJiradev))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.registrationCertificate == rhs.registrationCertificate)||((this.registrationCertificate!= null)&&this.registrationCertificate.equals(rhs.registrationCertificate))))&&((this.testingManager == rhs.testingManager)||((this.testingManager!= null)&&this.testingManager.equals(rhs.testingManager))))&&((this.serverSoftware == rhs.serverSoftware)||((this.serverSoftware!= null)&&this.serverSoftware.equals(rhs.serverSoftware))))&&((this.addRecordTime == rhs.addRecordTime)||((this.addRecordTime!= null)&&this.addRecordTime.equals(rhs.addRecordTime))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.linkToUserList == rhs.linkToUserList)||((this.linkToUserList!= null)&&this.linkToUserList.equals(rhs.linkToUserList))))&&((this.recordAcceptanceIp == rhs.recordAcceptanceIp)||((this.recordAcceptanceIp!= null)&&this.recordAcceptanceIp.equals(rhs.recordAcceptanceIp))))&&((this.availabilityOfSpecialOrBiometricPd == rhs.availabilityOfSpecialOrBiometricPd)||((this.availabilityOfSpecialOrBiometricPd!= null)&&this.availabilityOfSpecialOrBiometricPd.equals(rhs.availabilityOfSpecialOrBiometricPd))))&&((this.responsibleUsers == rhs.responsibleUsers)||((this.responsibleUsers!= null)&&this.responsibleUsers.equals(rhs.responsibleUsers))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.addRecordDate == rhs.addRecordDate)||((this.addRecordDate!= null)&&this.addRecordDate.equals(rhs.addRecordDate))))&&((this.finalProductAllocation == rhs.finalProductAllocation)||((this.finalProductAllocation!= null)&&this.finalProductAllocation.equals(rhs.finalProductAllocation))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.mainFunctionsAndPurpose == rhs.mainFunctionsAndPurpose)||((this.mainFunctionsAndPurpose!= null)&&this.mainFunctionsAndPurpose.equals(rhs.mainFunctionsAndPurpose))))&&((this.fullNameOwner == rhs.fullNameOwner)||((this.fullNameOwner!= null)&&this.fullNameOwner.equals(rhs.fullNameOwner))))&&((this.degreeOfConfidentiality == rhs.degreeOfConfidentiality)||((this.degreeOfConfidentiality!= null)&&this.degreeOfConfidentiality.equals(rhs.degreeOfConfidentiality))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.acceptanceRecordDate == rhs.acceptanceRecordDate)||((this.acceptanceRecordDate!= null)&&this.acceptanceRecordDate.equals(rhs.acceptanceRecordDate))))&&((this.supportHead == rhs.supportHead)||((this.supportHead!= null)&&this.supportHead.equals(rhs.supportHead))))&&((this.rpo == rhs.rpo)||((this.rpo!= null)&&this.rpo.equals(rhs.rpo))))&&((this.trialEndDate == rhs.trialEndDate)||((this.trialEndDate!= null)&&this.trialEndDate.equals(rhs.trialEndDate))))&&((this.membershipInComplianceCircuits == rhs.membershipInComplianceCircuits)||((this.membershipInComplianceCircuits!= null)&&this.membershipInComplianceCircuits.equals(rhs.membershipInComplianceCircuits))))&&((this.developerInformation == rhs.developerInformation)||((this.developerInformation!= null)&&this.developerInformation.equals(rhs.developerInformation))))&&((this.keyCompetencies == rhs.keyCompetencies)||((this.keyCompetencies!= null)&&this.keyCompetencies.equals(rhs.keyCompetencies))))&&((this.autoSystemClassification == rhs.autoSystemClassification)||((this.autoSystemClassification!= null)&&this.autoSystemClassification.equals(rhs.autoSystemClassification))));
    }

}
