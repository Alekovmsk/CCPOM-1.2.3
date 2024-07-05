/* eslint-disable @typescript-eslint/no-explicit-any */
/*
 *  Copyright 2021 Collate
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

 /**
 * A `autoSystem` entity is used for autoSystem classification or categorization. It is a
 * term defined under `autoSystemClassification` entity. AutoSystems are used to label the
 * entities and entity fields, such as Tables, and Columns.
 */
export interface AutoSystem {
    /**
     * Record acceptance date
     */
    acceptanceRecordDate?: string;
    /**
     * Record acceptance time
     */
    acceptanceRecordTime?: string;
    /**
     * Accompanied by IT block
     */
    accompaniedByItBlock?: string;
    /**
     * Date the record was added
     */
    addRecordDate?: string;
    /**
     * IP address of adding record
     */
    addRecordIp?: string;
    /**
     * addRecordDate
     */
    addRecordTime?: string;
    /**
     * administrators
     */
    administrators?: string;
    /**
     * Information about Administrators
     */
    administratorsInfo?: string;
    /**
     * Allowed proportions
     */
    allowedProportions?: string;
    /**
     * Approved sourcing model
     */
    approvedSourcingModel?: string;
    /**
     * Architect
     */
    architect?: string;
    /**
     * Date of the archival storage period
     */
    archiveDate?: string;
    /**
     * asType
     */
    asType?: string;
    /**
     * author
     */
    author?: string;
    /**
     * Reference to the autoSystem classification that this autoSystem is part of.
     */
    autoSystemClassification?: EntityReference;
    /**
     * Availability of special or biometric PD
     */
    availabilityOfSpecialOrBiometricPd?: string;
    /**
     * Basis for development, input into PE (OPE, OE)
     */
    basisForDevelopmentAndInputIntoPe?: string;
    /**
     * Business Recovery Coordinator
     */
    businessRecoveryCoordinator?: string;
    /**
     * Change that lead to this version of the entity.
     */
    changeDescription?: ChangeDescription;
    /**
     * Children autoSystems under this autoSystem.
     */
    children?: EntityReference[];
    /**
     * clientPartEquioment
     */
    clientPartEquioment?: string;
    /**
     * Color
     */
    color?: string;
    /**
     * Link to space in Confluence
     */
    confluenceSpaceLink?: string;
    /**
     * Project code for the creation of speakers
     */
    creationProjectCode?: string;
    /**
     * Critical time of day (MSC)**
     */
    criticalDayTime?: string;
    /**
     * criticalityClass
     */
    criticalityClass?: string;
    /**
     * Availability of data on clients of special service categories
     */
    dataAvailabilityonSpecialServiceClients?: string;
    /**
     * dbms
     */
    db?: string;
    /**
     * dbVersion
     */
    dbVersion?: string;
    /**
     * System decommissioning date
     */
    decommissioningDate?: string;
    /**
     * degreeOfConfidentiality
     */
    degreeOfConfidentiality?: string;
    /**
     * When `true` indicates the entity has been soft deleted.
     */
    deleted?:    boolean;
    department?: string;
    /**
     * If the autoSystem is deprecated.
     */
    deprecated?: boolean;
    /**
     * deputyProductManager
     */
    deputyProductManager?: string;
    /**
     * description of connection technology.
     */
    description: string;
    /**
     * DeveloperInformation
     */
    developerInformation?: string;
    /**
     * Head of Development
     */
    devHead?: string;
    /**
     * Strategic prospects for the development of AS in the Bank
     */
    devStrategicProspects?: string;
    /**
     * System autoSystems can't be deleted. Use this flag to disable them.
     */
    disabled?: boolean;
    /**
     * Display Name that identifies this autoSystem.
     */
    displayName?: string;
    /**
     * Duration of the sourcing model
     */
    durationSourcingModel?: string;
    /**
     * Electronic copy of the documentation
     */
    electronicCopyDoc?: string;
    /**
     * endSupportDate
     */
    endSupportDate?: string;
    /**
     * Allocation of AS to the Final Product
     */
    finalProductAllocation?: string;
    /**
     * fullNameOwner
     */
    fullNameOwner?: string;
    /**
     * Unique name of the autoSystem of format
     * `autoSystemClassification.autoSystem1.autoSystem2`.
     */
    fullyQualifiedName?: string;
    /**
     * Link to the resource corresponding to the autoSystem.
     */
    href?: string;
    /**
     * Unique identifier of this entity instance.
     */
    id?: string;
    /**
     * industrialEndDate
     */
    industrialEndDate?: string;
    /**
     * industrialStartDate
     */
    industrialStartDate?: string;
    /**
     * installationKit
     */
    installationKit?: string;
    /**
     * IP address of the last post edit
     */
    ipOfLastPostEdit?: string;
    /**
     * ISPDn
     */
    ispdn?: string;
    /**
     * Communication with IT services in accordance with the concluded SLA
     */
    itCommunicationItSla?: string;
    /**
     * IT Recovery Coordinator
     */
    itRecoveryCoordinator?: string;
    /**
     * Key competencies
     */
    keyCompetencies?: string;
    /**
     * Link to List of User Roles
     */
    linkToUserList?: string;
    /**
     * lisOfOtherSystemConnections
     */
    lisOfOtherSystemConnections?: string;
    /**
     * main
     */
    main?: string;
    /**
     * main functions and purpose
     */
    mainFunctionsAndPurpose?: string;
    /**
     * MC
     */
    mc?: string;
    /**
     * Membership in compliance circuits
     */
    membershipInComplianceCircuits?: string;
    /**
     * Mnemonic code
     */
    mnemonicCode?: string;
    /**
     * modificationsInfo
     */
    modificationsInfo?: string;
    /**
     * Children autoSystems under this group are mutually exclusive. When mutually exclusive is
     * `true` the autoSystems from this group are used to **classify** an entity. An entity can
     * only be in one class - example, it can only be either `tier1` or `tier2` and not both.
     * When mutually exclusive is `false`, the autoSystems from this group are used to
     * **categorize** an entity. An entity can be in multiple categories simultaneously -
     * example a customer can be `newCustomer` and `atRisk` simultaneously.
     */
    mutuallyExclusive?: boolean;
    /**
     * Name of the autoSystem.
     */
    name: string;
    /**
     * Note
     */
    note?: string;
    /**
     * main functions and purpose
     */
    numberInList?: string;
    /**
     * Type of operation
     */
    operationType?: string;
    /**
     * ORDApointmentOwner
     */
    ordApointmentOwner?: string;
    /**
     * Order (Act) for decommissioning of the system
     */
    orderForDecommissioning?: string;
    /**
     * Access to as outside the Russian Federation
     */
    outsideRussianFederationAccess?: string;
    /**
     * OwnDevelopmentOrPurchasedSoftware
     */
    ownDevelopmentOrPurchasedSoftware?: string;
    /**
     * Reference to the parent autoSystem. When null, the term is at the root of the autoSystem
     * Classification.
     */
    parent?: EntityReference;
    /**
     * Planning Manager
     */
    planningManager?: string;
    /**
     * productManager
     */
    productManager?: string;
    /**
     * productManagerPosition
     */
    productManagerPosition?: string;
    /**
     * Project connection
     */
    projectConnection?: string;
    provider?:          ProviderType;
    /**
     * IP address of record acceptance
     */
    recordAcceptanceIp?: string;
    /**
     * Record Acceptance User
     */
    recordAcceptanceUser?: string;
    /**
     * Date the record was last edited
     */
    recordLastEditDate?: string;
    /**
     * Last edit time of entry
     */
    recordLastEditTime?: string;
    /**
     * Link to register RFI in JIRADEV
     */
    registerLinkRfiInJiradev?: string;
    /**
     * Certificate of registration of a computer program
     */
    registrationCertificate?: string;
    /**
     * regulatoryEvents
     */
    regulatoryEvents?: string;
    /**
     * Information for report 0409070
     */
    reportInformation0409070?: string;
    /**
     * ResponsibleEmployees
     */
    responsibleEmployees?: string;
    /**
     * responsibleUsers
     */
    responsibleUsers?: string;
    /**
     * role model
     */
    roleModel?: string;
    /**
     * RPO
     */
    rpo?: string;
    /**
     * RTO
     */
    rto?: string;
    /**
     * serverEquipmentNameIp
     */
    serverEquipmentNameIp?: string;
    /**
     * serverSoftware
     */
    serverSoftware?: string;
    /**
     * shortName
     */
    shortName?: string;
    /**
     * PD sign
     */
    signPd?: string;
    /**
     * softwareAndHardwareComposition
     */
    softwareAndHardwareComposition?: string;
    /**
     * Software rights level
     */
    softwareRightsLevel?: string;
    /**
     * softwareVersion
     */
    softwareVersion?: string;
    /**
     * startSupportDate
     */
    startSupportDate?: string;
    style?:            Style;
    /**
     * supplier
     */
    supplier?: string;
    /**
     * supportContractor
     */
    supportContractor?: string;
    /**
     * Head of support
     */
    supportHead?: string;
    /**
     * supportMode
     */
    supportMode?: string;
    /**
     * Testing Manager
     */
    testingManager?: string;
    /**
     * Threshold time of minor failure (T)*, minutes
     */
    thresholdTimeOfMinorFailure?: string;
    /**
     * commissioningEndDate
     */
    trialEndDate?: string;
    /**
     * commissioningDate
     */
    trialStartDate?: string;
    /**
     * Last update time corresponding to the new version of the entity in Unix epoch time
     * milliseconds.
     */
    updatedAt?: number;
    /**
     * User who made the update.
     */
    updatedBy?: string;
    /**
     * Count of how many times this autoSystem and children autoSystems are used.
     */
    usageCount?: number;
    /**
     * User of last post edit
     */
    userOfLastPostEdit?: string;
    /**
     * Sign of using Internet technologies
     */
    usingInternetSign?: string;
    /**
     * Metadata version of the entity.
     */
    version?: number;
    /**
     * workingHours
     */
    workingHours?: string;
    /**
     * workplaceTypeAndSoftwareEnvVersion
     */
    workplaceTypeAndSoftwareEnvVersion?: string;
}

/**
 * Reference to the autoSystem classification that this autoSystem is part of.
 *
 * This schema defines the EntityReference type used for referencing an entity.
 * EntityReference is used for capturing relationships from one entity to another. For
 * example, a table has an attribute called database of type EntityReference that captures
 * the relationship of a table `belongs to a` database.
 *
 * Children autoSystems under this autoSystem.
 *
 * This schema defines the EntityReferenceList type used for referencing an entity.
 * EntityReference is used for capturing relationships from one entity to another. For
 * example, a table has an attribute called database of type EntityReference that captures
 * the relationship of a table `belongs to a` database.
 *
 * Reference to the parent autoSystem. When null, the term is at the root of the autoSystem
 * Classification.
 */
export interface EntityReference {
    /**
     * If true the entity referred to has been soft-deleted.
     */
    deleted?: boolean;
    /**
     * Optional description of entity.
     */
    description?: string;
    /**
     * Display Name that identifies this entity.
     */
    displayName?: string;
    /**
     * Fully qualified name of the entity instance. For entities such as tables, databases
     * fullyQualifiedName is returned in this field. For entities that don't have name hierarchy
     * such as `user` and `team` this will be same as the `name` field.
     */
    fullyQualifiedName?: string;
    /**
     * Link to the entity resource.
     */
    href?: string;
    /**
     * Unique identifier that identifies an entity instance.
     */
    id: string;
    /**
     * Name of the entity instance.
     */
    name?: string;
    /**
     * Entity type/class name - Examples: `database`, `table`, `metrics`, `databaseService`,
     * `dashboardService`...
     */
    type: string;
}

/**
 * Change that lead to this version of the entity.
 *
 * Description of the change.
 */
export interface ChangeDescription {
    /**
     * Names of fields added during the version changes.
     */
    fieldsAdded?: FieldChange[];
    /**
     * Fields deleted during the version changes with old value before deleted.
     */
    fieldsDeleted?: FieldChange[];
    /**
     * Fields modified during the version changes with old and new values.
     */
    fieldsUpdated?: FieldChange[];
    /**
     * When a change did not result in change, this could be same as the current version.
     */
    previousVersion?: number;
}

export interface FieldChange {
    /**
     * Name of the entity field that changed.
     */
    name?: string;
    /**
     * New value of the field. Note that this is a JSON string and use the corresponding field
     * type to deserialize it.
     */
    newValue?: any;
    /**
     * Previous value of the field. Note that this is a JSON string and use the corresponding
     * field type to deserialize it.
     */
    oldValue?: any;
}

/**
 * Type of provider of an entity. Some entities are provided by the `system`. Some are
 * entities created and provided by the `user`. Typically `system` provide entities can't be
 * deleted and can only be disabled.
 */
export enum ProviderType {
    System = "system",
    User = "user",
}

/**
 * UI Style is used to associate a color code and/or icon to entity to customize the look of
 * that entity in UI.
 */
export interface Style {
    /**
     * Hex Color Code to mark an entity such as GlossaryTerm, Tag, Domain or Data Product.
     */
    color?: string;
    /**
     * An icon to associate with GlossaryTerm, Tag, Domain or Data Product.
     */
    iconURL?: string;
}
