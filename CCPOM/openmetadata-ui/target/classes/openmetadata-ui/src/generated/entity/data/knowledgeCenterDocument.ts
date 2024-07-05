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
 * This schema defines te Knowledge center document entities.
 */
export interface KnowledgeCenterDocument {
    /**
     * Agreement contact
     */
    agreementContact?: string;
    /**
     * Agreement's operator.
     */
    agreementOperator?: string;
    /**
     * Agreement's type
     */
    agreementType?: string;
    /**
     * Agreement validity
     */
    agreementValidity?: string;
    /**
     * Change that lead to this version of the entity.
     */
    changeDescription?: ChangeDescription;
    /**
     * Other knowledge center documents that are children of this knowledge center document.
     */
    children?: EntityReference[];
    /**
     * When `true` indicates the entity has been soft deleted.
     */
    deleted?: boolean;
    /**
     * Description of the knowledge center document.
     */
    description: string;
    /**
     * System glossary can't be deleted. Use this flag to disable them.
     */
    disabled?: boolean;
    /**
     * Display Name that identifies this glossary.
     */
    displayName?: string;
    /**
     * Domain the Knowledge center document belongs to. When not set, the Glossary TErm inherits
     * the domain from the Knowledge center it belongs to.
     */
    domain?: EntityReference;
    /**
     * Entity extension data with custom attributes added to the entity.
     */
    extension?: any;
    /**
     * A unique name that identifies a knowledge center document. It captures name hierarchy of
     * glossary of documents in the form of `glossaryName.parentDocument.childDocument`.
     */
    fullyQualifiedName?: string;
    /**
     * Link to the resource corresponding to this entity.
     */
    href?: string;
    /**
     * Unique identifier of a knowledge center document instance.
     */
    id: string;
    /**
     * Knowledge center that this document belongs to.
     */
    knowledgeCenter: EntityReference;
    /**
     * Knowledge center documents that are children of this document are mutually exclusive.
     * When mutually exclusive is `true` only one document can be used to label an entity from
     * this group. When mutually exclusive is `false`, multiple documents from this group can be
     * used to label an entity.
     */
    mutuallyExclusive?: boolean;
    /**
     * Preferred name for the knowledge center document.
     */
    name: string;
    /**
     * Owner of this knowledge center document.
     */
    owner?: EntityReference;
    /**
     * Parent knowledge center document that this document is child of. When `null` this
     * document is the root document of the glossary.
     */
    parent?:   EntityReference;
    provider?: ProviderType;
    /**
     * Link to a reference from an external glossary.
     */
    references?: DocumentReference[];
    /**
     * Other knowledge center documents that are related to this knowledge center document.
     */
    relatedDocuments?: EntityReference[];
    /**
     * User names of the reviewers for this glossary.
     */
    reviewers?: EntityReference[];
    /**
     * Status of the knowledge center document.
     */
    status?: Status;
    style?:  Style;
    /**
     * Alternate names that are synonyms or near-synonyms for the knowledge center document.
     */
    synonyms?: string[];
    /**
     * Tags associated with this knowledge center document. These tags captures relationship of
     * a knowledge center document with a tag automatically. As an example a knowledge center
     * document 'User.PhoneNumber' might have an associated tag 'PII.Sensitive'. When
     * 'User.Address' is used to label a column in a table, 'PII.Sensitive' label is also
     * applied automatically due to Associated tag relationship.
     */
    tags?: TagLabel[];
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
     * Count of how many times this and it's children knowledge center documents are used as
     * labels.
     */
    usageCount?: number;
    /**
     * Metadata version of the entity.
     */
    version?: number;
    votes?:   Votes;
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
 * Other knowledge center documents that are children of this knowledge center document.
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
 * Domain the Knowledge center document belongs to. When not set, the Glossary TErm inherits
 * the domain from the Knowledge center it belongs to.
 *
 * Knowledge center that this document belongs to.
 *
 * Owner of this knowledge center document.
 *
 * Parent knowledge center document that this document is child of. When `null` this
 * document is the root document of the glossary.
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

export interface DocumentReference {
    /**
     * Name that identifies the source of an external knowledge center document. Example
     * `HealthCare.gov`.
     */
    endpoint?: string;
    /**
     * Name that identifies the source of an external knowledge center document. Example
     * `HealthCare.gov`.
     */
    name?: string;
}

/**
 * Status of the knowledge center document.
 */
export enum Status {
    Approved = "Approved",
    Deprecated = "Deprecated",
    Draft = "Draft",
    Rejected = "Rejected",
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

/**
 * This schema defines the type for labeling an entity with a Tag.
 */
export interface TagLabel {
    /**
     * Description for the tag label.
     */
    description?: string;
    /**
     * Display Name that identifies this tag.
     */
    displayName?: string;
    /**
     * Link to the tag resource.
     */
    href?: string;
    /**
     * Label type describes how a tag label was applied. 'Manual' indicates the tag label was
     * applied by a person. 'Derived' indicates a tag label was derived using the associated tag
     * relationship (see Classification.json for more details). 'Propagated` indicates a tag
     * label was propagated from upstream based on lineage. 'Automated' is used when a tool was
     * used to determine the tag label.
     */
    labelType: LabelType;
    /**
     * Name of the tag or glossary term.
     */
    name?: string;
    /**
     * Label is from Tags or Glossary.
     */
    source: TagSource;
    /**
     * 'Suggested' state is used when a tag label is suggested by users or tools. Owner of the
     * entity must confirm the suggested labels before it is marked as 'Confirmed'.
     */
    state:  State;
    style?: Style;
    tagFQN: string;
}

/**
 * Label type describes how a tag label was applied. 'Manual' indicates the tag label was
 * applied by a person. 'Derived' indicates a tag label was derived using the associated tag
 * relationship (see Classification.json for more details). 'Propagated` indicates a tag
 * label was propagated from upstream based on lineage. 'Automated' is used when a tool was
 * used to determine the tag label.
 */
export enum LabelType {
    Automated = "Automated",
    Derived = "Derived",
    Manual = "Manual",
    Propagated = "Propagated",
}

/**
 * Label is from Tags or Glossary.
 */
export enum TagSource {
    Autosystemclassification = "Autosystemclassification",
    Classification = "Classification",
    ClientCenter = "ClientCenter",
    Dlaclassification = "Dlaclassification",
    Glossary = "Glossary",
    KnowledgeCenter = "KnowledgeCenter",
    Spdclassification = "Spdclassification",
    Usereskclassification = "Usereskclassification",
}

/**
 * 'Suggested' state is used when a tag label is suggested by users or tools. Owner of the
 * entity must confirm the suggested labels before it is marked as 'Confirmed'.
 */
export enum State {
    Confirmed = "Confirmed",
    Suggested = "Suggested",
}

/**
 * This schema defines the Votes for a Data Asset.
 */
export interface Votes {
    /**
     * List of all the Users who downVoted
     */
    downVoters?: EntityReference[];
    /**
     * Total down-votes the entity has
     */
    downVotes?: number;
    /**
     * List of all the Users who upVoted
     */
    upVoters?: EntityReference[];
    /**
     * Total up-votes the entity has
     */
    upVotes?: number;
}
