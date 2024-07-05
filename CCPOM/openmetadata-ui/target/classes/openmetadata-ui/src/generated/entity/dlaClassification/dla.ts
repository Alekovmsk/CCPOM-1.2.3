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
 * A `dla` entity is used for dla classification or categorization. It is a term defined
 * under `dlaClassification` entity. Dlas are used to label the entities and entity fields,
 * such as Tables, and Columns.
 */
export interface Dla {
    /**
     * Additional information (optional)
     */
    additionalInformation?: string;
    /**
     * auto consumer system
     */
    autoConsumerSystem?: EntityReference[];
    /**
     * auto source system
     */
    autoSourceSystem?: EntityReference[];
    /**
     * Change that lead to this version of the entity.
     */
    changeDescription?: ChangeDescription;
    /**
     * Children dlas under this dla.
     */
    children?: EntityReference[];
    /**
     * conclusion date
     */
    conclusionDate?: Date;
    /**
     * consumer
     */
    consumer?: string;
    /**
     * Actualization data frequency
     */
    cronDataActualization?: string;
    /**
     * Availability data period
     */
    cronDataAvailability?: string;
    /**
     * Update data frequency
     */
    cronUpdateData?: string;
    /**
     * data manager
     */
    dataManager?: string;
    /**
     * Data Provision Indicators
     */
    dataProvisionIndicators?: Indicator[];
    /**
     * Data Quality Indicators
     */
    dataQualityIndicators?: Indicator[];
    /**
     * dataRegister
     */
    dataRegister?: string;
    /**
     * data steward
     */
    dataSteward?: string;
    /**
     * When `true` indicates the entity has been soft deleted.
     */
    deleted?: boolean;
    /**
     * If the dla is deprecated.
     */
    deprecated?: boolean;
    /**
     * Description of the dla.
     */
    description: string;
    /**
     * System dlas can't be deleted. Use this flag to disable them.
     */
    disabled?: boolean;
    /**
     * Display Name that identifies this dla.
     */
    displayName?: string;
    /**
     * Reference to the dla classification that this dla is part of.
     */
    dlaClassification?: EntityReference;
    /**
     * doc number
     */
    docNumber?: string;
    /**
     * status
     */
    docStatus?: string;
    /**
     * doc type
     */
    docType?: string;
    /**
     * domain data
     */
    domainData?: string;
    /**
     * expiration date
     */
    expirationDate?: string;
    /**
     * Unique name of the dla of format `dlaClassification.dla1.dla2`.
     */
    fullyQualifiedName?: string;
    /**
     * Link to the resource corresponding to the dla.
     */
    href?: string;
    /**
     * Unique identifier of this entity instance.
     */
    id?: string;
    /**
     * Signs of a mass/significant incident (optional)
     */
    incidenSigns?: string;
    /**
     * Children dlas under this group are mutually exclusive. When mutually exclusive is `true`
     * the dlas from this group are used to **classify** an entity. An entity can only be in one
     * class - example, it can only be either `tier1` or `tier2` and not both. When mutually
     * exclusive is `false`, the dlas from this group are used to **categorize** an entity. An
     * entity can be in multiple categories simultaneously - example a customer can be
     * `newCustomer` and `atRisk` simultaneously.
     */
    mutuallyExclusive?: boolean;
    /**
     * Name of the dla.
     */
    name: string;
    /**
     * Data provider of this skd.
     */
    owner?: EntityReference;
    /**
     * Reference to the parent dla. When null, the term is at the root of the dla Classification.
     */
    parent?: EntityReference;
    /**
     * prolongation
     */
    prolongation?: boolean;
    provider?:     ProviderType;
    /**
     * Publication area
     */
    publicationArea?: string;
    /**
     * Reporting link
     */
    reportingHref?: string;
    /**
     * Reporting Periodicity
     */
    reportingPeriodicity?: string;
    /**
     * Reporting Receiver Role
     */
    reportingReceiverRole?: string;
    /**
     * Reporting Person responsible for formation
     */
    reportingResponsible?: string;
    /**
     * Reporting Type
     */
    reportingType?: string;
    style?:         Style;
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
     * Count of how many times this dla and children dlas are used.
     */
    usageCount?: number;
    /**
     * validity
     */
    validity?: string;
    /**
     * Metadata version of the entity.
     */
    version?: number;
}

/**
 * auto consumer system
 *
 * This schema defines the EntityReferenceList type used for referencing an entity.
 * EntityReference is used for capturing relationships from one entity to another. For
 * example, a table has an attribute called database of type EntityReference that captures
 * the relationship of a table `belongs to a` database.
 *
 * This schema defines the EntityReference type used for referencing an entity.
 * EntityReference is used for capturing relationships from one entity to another. For
 * example, a table has an attribute called database of type EntityReference that captures
 * the relationship of a table `belongs to a` database.
 *
 * Reference to the dla classification that this dla is part of.
 *
 * Data provider of this skd.
 *
 * Reference to the parent dla. When null, the term is at the root of the dla Classification.
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

export interface Indicator {
    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     */
    description?: string;
    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     */
    index?:  string;
    number?: string;
    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     */
    targetValue?: string;
    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     */
    weight?: string;
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
