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
 * Load classifications and autoSystems
 */
export interface LoadAutoSystems {
    createAutoSystemClassification: CreateAutoSystemClassificationRequest;
    createAutoSystems?:             CreateAutoSystemRequest[];
}

/**
 * Create autoSystem classification request
 */
export interface CreateAutoSystemClassificationRequest {
    /**
     * Description of the autoSystem classification.
     */
    description: string;
    /**
     * Display Name that identifies this autoSystem classification.
     */
    displayName?: string;
    /**
     * AutoSystems under this autoSystem classification are mutually exclusive. When mutually
     * exclusive is `true` the autoSystems from this autoSystem classification are used to
     * **classify** an entity. An entity can only be in one class - example, it can only be
     * either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the
     * autoSystems from this autoSystem classification are used to **categorize** an entity. An
     * entity can be in multiple categories simultaneously - example a customer can be
     * `newCustomer` and `atRisk` simultaneously.
     */
    mutuallyExclusive?: boolean;
    name:               string;
    provider?:          ProviderType;
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
 * Create autoSystem API request
 */
export interface CreateAutoSystemRequest {
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
     * Fully qualified names of autoSystems associated with this autoSystem
     */
    associatedAutoSystems?: string[];
    /**
     * asType
     */
    asType?: string;
    /**
     * author
     */
    author?: string;
    /**
     * Name of the autoSystem classification that this autoSystem is part of.
     */
    autoSystemClassification?: string;
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
    department?:              string;
    /**
     * deputyProductManager
     */
    deputyProductManager?: string;
    /**
     * Unique name of the autoSystem classification
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
    name:               string;
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
     * Fully qualified name of the parent autoSystem. When null, the term is at the root of the
     * autoSystem classification.
     */
    parent?: string;
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
     * User of last post edit
     */
    userOfLastPostEdit?: string;
    /**
     * Sign of using Internet technologies
     */
    usingInternetSign?: string;
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
