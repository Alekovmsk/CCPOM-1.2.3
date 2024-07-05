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
 * Load classifications and userEsks
 */
export interface LoadUserEsks {
    createUserEskClassification: CreateUserEskClassificationRequest;
    createUserEsks?:             CreateUserEskRequest[];
}

/**
 * Create userEsk classification request
 */
export interface CreateUserEskClassificationRequest {
    /**
     * Description of the userEsk classification.
     */
    description: string;
    /**
     * Display Name that identifies this userEsk classification.
     */
    displayName?: string;
    /**
     * UserEsks under this userEsk classification are mutually exclusive. When mutually
     * exclusive is `true` the userEsks from this userEsk classification are used to
     * **classify** an entity. An entity can only be in one class - example, it can only be
     * either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the userEsks
     * from this userEsk classification are used to **categorize** an entity. An entity can be
     * in multiple categories simultaneously - example a customer can be `newCustomer` and
     * `atRisk` simultaneously.
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
 * Create userEsk API request
 */
export interface CreateUserEskRequest {
    /**
     * Fully qualified names of userEsks associated with this userEsk
     */
    associatedUserEsks?: string[];
    /**
     * create timestamp
     */
    createTimestamp?: string;
    /**
     * department
     */
    department?: string;
    /**
     * Unique name of the userEsk classification
     */
    description: string;
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
    name:               string;
    /**
     * Fully qualified name of the parent userEsk. When null, the term is at the root of the
     * userEsk classification.
     */
    parent?: string;
    /**
     * phone number
     */
    phoneNumber?: string;
    provider?:    ProviderType;
    style?:       Style;
    /**
     * Name of the userEsk classification that this userEsk is part of.
     */
    userEskClassification?: string;
    /**
     * user name
     */
    userName?: string;
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
