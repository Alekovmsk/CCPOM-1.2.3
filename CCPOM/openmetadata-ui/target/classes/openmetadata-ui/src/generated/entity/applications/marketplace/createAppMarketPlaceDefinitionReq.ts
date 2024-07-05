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
 * This schema defines the applications for Open-Metadata.
 */
export interface CreateAppMarketPlaceDefinitionReq {
    /**
     * Application Configuration object.
     */
    appConfiguration?: any;
    /**
     * Application Logo Url.
     */
    appLogoUrl?: string;
    /**
     * Application Screenshots.
     */
    appScreenshots?: string[];
    /**
     * This schema defines the type of application.
     */
    appType: AppType;
    /**
     * Full Qualified ClassName for the the application
     */
    className: string;
    /**
     * Description of the Application.
     */
    description?: string;
    /**
     * Developer For the Application.
     */
    developer?: string;
    /**
     * Url for the developer
     */
    developerUrl?: string;
    /**
     * Display Name for the application.
     */
    displayName?: string;
    /**
     * Features of the Application.
     */
    features?: string;
    /**
     * Name of the Application.
     */
    name: string;
    /**
     * Owner of this workflow.
     */
    owner?: EntityReference;
    /**
     * Permission used by Native Applications.
     */
    permission: Permissions;
    /**
     * Privacy Policy for the developer
     */
    privacyPolicyUrl?: string;
    /**
     * If app type is live, user can provide additional runtime context.
     */
    runtime?: ExecutionContext;
    /**
     * This schema defines the Schedule Type of Application.
     */
    scheduleType: ScheduleType;
    /**
     * Support Email for the application
     */
    supportEmail?: string;
    /**
     * Tags associated with the entity.
     */
    tags?: TagLabel[];
}

/**
 * This schema defines the type of application.
 */
export enum AppType {
    External = "external",
    Internal = "internal",
}

/**
 * Owner of this workflow.
 *
 * This schema defines the EntityReference type used for referencing an entity.
 * EntityReference is used for capturing relationships from one entity to another. For
 * example, a table has an attribute called database of type EntityReference that captures
 * the relationship of a table `belongs to a` database.
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
 * Permission used by Native Applications.
 *
 * This schema defines the Permission used by Native Application.
 */
export enum Permissions {
    All = "All",
}

/**
 * If app type is live, user can provide additional runtime context.
 *
 * Execution Configuration.
 *
 * Live Execution object.
 *
 * Scheduled Execution Context Configuration.
 */
export interface ExecutionContext {
}

/**
 * This schema defines the Schedule Type of Application.
 *
 * This schema defines the type of application.
 */
export enum ScheduleType {
    Live = "Live",
    Scheduled = "Scheduled",
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
