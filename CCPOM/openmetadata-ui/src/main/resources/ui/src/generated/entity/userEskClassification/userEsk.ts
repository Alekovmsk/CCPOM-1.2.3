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
 * A `userEsk` entity is used for userEsk classification or categorization. It is a term
 * defined under `userEskClassification` entity. UserEsks are used to label the entities and
 * entity fields, such as Tables, and Columns.
 */
export interface UserEsk {
    /**
     * Change that lead to this version of the entity.
     */
    changeDescription?: ChangeDescription;
    /**
     * Children userEsks under this userEsk.
     */
    children?: EntityReference[];
    /**
     * create timestamp
     */
    createTimestamp?: string;
    /**
     * When `true` indicates the entity has been soft deleted.
     */
    deleted?: boolean;
    /**
     * department
     */
    department?: string;
    /**
     * If the userEsk is deprecated.
     */
    deprecated?: boolean;
    /**
     * description of connection technology.
     */
    description: string;
    /**
     * System userEsks can't be deleted. Use this flag to disable them.
     */
    disabled?: boolean;
    /**
     * Display Name that identifies this userEsk.
     */
    displayName?: string;
    /**
     * user email
     */
    email?: string;
    /**
     * first name
     */
    firstName?: string;
    /**
     * full name
     */
    fullName?: string;
    /**
     * Unique name of the userEsk of format `userEskClassification.userEsk1.userEsk2`.
     */
    fullyQualifiedName?: string;
    /**
     * Link to the resource corresponding to the userEsk.
     */
    href?: string;
    /**
     * Unique identifier of this entity instance.
     */
    id?: string;
    /**
     * is user active
     */
    isActive?: string;
    /**
     * users job title
     */
    jobTitle?: string;
    /**
     * last name
     */
    lastName?: string;
    /**
     * middle name
     */
    middleName?: string;
    /**
     * modify timestamp
     */
    modifyTimestamp?: string;
    /**
     * Children userEsks under this group are mutually exclusive. When mutually exclusive is
     * `true` the userEsks from this group are used to **classify** an entity. An entity can
     * only be in one class - example, it can only be either `tier1` or `tier2` and not both.
     * When mutually exclusive is `false`, the userEsks from this group are used to
     * **categorize** an entity. An entity can be in multiple categories simultaneously -
     * example a customer can be `newCustomer` and `atRisk` simultaneously.
     */
    mutuallyExclusive?: boolean;
    /**
     * Name of the userEsk.
     */
    name: string;
    /**
     * Reference to the parent userEsk. When null, the term is at the root of the userEsk
     * Classification.
     */
    parent?: EntityReference;
    /**
     * phone number
     */
    phoneNumber?: string;
    provider?:    ProviderType;
    style?:       Style;
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
     * Count of how many times this userEsk and children userEsks are used.
     */
    usageCount?: number;
    /**
     * Reference to the userEsk classification that this userEsk is part of.
     */
    userEskClassification?: EntityReference;
    /**
     * user name
     */
    userName?: string;
    /**
     * Metadata version of the entity.
     */
    version?: number;
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
 * Children userEsks under this userEsk.
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
 * Reference to the parent userEsk. When null, the term is at the root of the userEsk
 * Classification.
 *
 * Reference to the userEsk classification that this userEsk is part of.
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
